package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.iv.RichEditor;

public class UniversalRecyclerView extends RecyclerListView {
    public final UniversalAdapter adapter;
    private boolean doNotDetachViews;
    public ItemTouchHelper itemTouchHelper;
    public LinearLayoutManager layoutManager;
    private boolean reorderingAllowed;
    private boolean reorderingLongPressEnabled;
    private boolean reorderingOnOtherAxis;
    private RecyclerView.ViewHolder reorderingViewHolder;

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        private TouchHelperCallback() {
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
            if (viewHolder.itemView.getBackground() instanceof RichEditor.DraggingDrawable) {
                RichEditor.DraggingDrawable draggingDrawable = (RichEditor.DraggingDrawable) viewHolder.itemView.getBackground();
                if (draggingDrawable.dragging) {
                    draggingDrawable.dragging = false;
                    draggingDrawable.invalidateSelf();
                }
            }
            if (UniversalRecyclerView.this.isReorderRemoving()) {
                UniversalRecyclerView.this.onReorderRemove(viewHolder);
                viewHolder.itemView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int i;
            if (!UniversalRecyclerView.this.reorderingAllowed || !UniversalRecyclerView.this.adapter.isReorderItem(viewHolder.getAdapterPosition())) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            if (UniversalRecyclerView.this.layoutManager.getOrientation() == 0) {
                if (UniversalRecyclerView.this.reorderingOnOtherAxis) {
                    i = 15;
                } else {
                    i = 12;
                }
            } else if (UniversalRecyclerView.this.reorderingOnOtherAxis) {
                i = 15;
            } else {
                i = 3;
            }
            return ItemTouchHelper.Callback.makeMovementFlags(i, 0);
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return UniversalRecyclerView.this.reorderingAllowed && UniversalRecyclerView.this.reorderingLongPressEnabled;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            if (i == 2 && !z && UniversalRecyclerView.this.isReorderRemoving()) {
                return;
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            if (i == 2 && z) {
                UniversalRecyclerView.this.onReorderMoved(viewHolder);
            }
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (!UniversalRecyclerView.this.adapter.isReorderItem(viewHolder.getAdapterPosition()) || UniversalRecyclerView.this.adapter.getReorderSectionId(viewHolder.getAdapterPosition()) != UniversalRecyclerView.this.adapter.getReorderSectionId(viewHolder2.getAdapterPosition())) {
                return false;
            }
            UniversalRecyclerView.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            UniversalRecyclerView.this.swappedElements();
            return true;
        }

        @Override
        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                UniversalRecyclerView.this.hideSelector(false);
            }
            if (i == 0) {
                UniversalRecyclerView.this.adapter.reorderDone();
                if (UniversalRecyclerView.this.reorderingViewHolder != null) {
                    UniversalRecyclerView universalRecyclerView = UniversalRecyclerView.this;
                    universalRecyclerView.onReorderEnd(universalRecyclerView.reorderingViewHolder);
                    UniversalRecyclerView.this.reorderingViewHolder = null;
                }
            } else {
                UniversalRecyclerView.this.cancelClickRunnables(false);
                if (viewHolder != null) {
                    viewHolder.itemView.setPressed(true);
                    if (viewHolder.itemView.getBackground() instanceof RichEditor.DraggingDrawable) {
                        RichEditor.DraggingDrawable draggingDrawable = (RichEditor.DraggingDrawable) viewHolder.itemView.getBackground();
                        if (!draggingDrawable.dragging) {
                            draggingDrawable.dragging = true;
                            draggingDrawable.invalidateSelf();
                        }
                    }
                    if (i == 2) {
                        UniversalRecyclerView.this.reorderingViewHolder = viewHolder;
                        UniversalRecyclerView.this.onReorderStart(viewHolder);
                    }
                }
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    public UniversalRecyclerView(BaseFragment baseFragment, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Utilities.Callback5<UItem, View, Integer, Float, Float> callback5, Utilities.Callback5Return<UItem, View, Integer, Float, Float, Boolean> callback5Return) {
        this(baseFragment.getContext(), baseFragment.getCurrentAccount(), baseFragment.getClassGuid(), callback2, callback5, callback5Return, baseFragment.getResourceProvider());
    }

    public void lambda$allowReorder$2(View view) {
        this.adapter.updateReorder(getChildViewHolder(view), this.reorderingAllowed);
    }

    public void lambda$new$0(Utilities.Callback5 callback5, View view, int i, float f, float f2) {
        UItem item = this.adapter.getItem(i);
        if (item == null) {
            return;
        }
        callback5.mo1122run(item, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
    }

    public boolean lambda$new$1(Utilities.Callback5Return callback5Return, View view, int i, float f, float f2) {
        UItem item = this.adapter.getItem(i);
        if (item == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(item, view, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2))).booleanValue();
    }

    public Boolean lambda$setSections$3(View view) {
        return view.getParent() != this ? Boolean.FALSE : Boolean.valueOf(!UniversalAdapter.isShadow(getChildViewHolder(view).getItemViewType()));
    }

    public void lambda$setSections$4(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        super.drawBackgroundRect(canvas, rectF, f, f2, f3);
    }

    public void allowReorder(boolean z) {
        if (this.reorderingAllowed == z) {
            return;
        }
        UniversalAdapter universalAdapter = this.adapter;
        this.reorderingAllowed = z;
        universalAdapter.updateReorder(z);
        AndroidUtilities.forEachViews((RecyclerView) this, (Consumer) new UniversalRecyclerView$$ExternalSyntheticLambda3(this, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (!hasSections()) {
            this.adapter.drawWhiteSections(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public void doNotDetachViews() {
        this.doNotDetachViews = true;
    }

    public UItem findItemByItemId(int i) {
        for (int i2 = 0; i2 < this.adapter.getItemCount(); i2++) {
            UItem item = this.adapter.getItem(i2);
            if (item != null && item.id == i) {
                return item;
            }
        }
        return null;
    }

    public int findPositionByItemId(int i) {
        for (int i2 = 0; i2 < this.adapter.getItemCount(); i2++) {
            UItem item = this.adapter.getItem(i2);
            if (item != null && item.id == i) {
                return i2;
            }
        }
        return -1;
    }

    public View findViewByItemId(int i) {
        int i2 = 0;
        while (i2 < this.adapter.getItemCount()) {
            UItem item = this.adapter.getItem(i2);
            if (item != null && item.id == i) {
                return findViewByPosition(i2);
            }
            i2++;
        }
        i2 = -1;
        return findViewByPosition(i2);
    }

    public View findViewByItemObject(Object obj) {
        int i = 0;
        while (i < this.adapter.getItemCount()) {
            UItem item = this.adapter.getItem(i);
            if (item != null && item.object == obj) {
                return findViewByPosition(i);
            }
            i++;
        }
        i = -1;
        return findViewByPosition(i);
    }

    public int getSpanCount() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager instanceof ExtendedGridLayoutManager) {
            return ((ExtendedGridLayoutManager) linearLayoutManager).getSpanCount();
        }
        return -1;
    }

    public boolean isReorderAllowed() {
        return this.reorderingAllowed;
    }

    public boolean isReorderRemoving() {
        return false;
    }

    public boolean isReordering() {
        return this.reorderingViewHolder != null;
    }

    public void listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> callback2) {
        listenReorder(callback2, false);
    }

    public void makeHorizontal() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, 0 == true ? 1 : 0) {
            {
                super(i, z);
            }

            @Override
            public int getExtraLayoutSpace(RecyclerView.State state) {
                return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
            }
        };
        this.layoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
    }

    public void onLayoutUpdate() {
    }

    public void onReorderEnd(RecyclerView.ViewHolder viewHolder) {
    }

    public void onReorderMoved(RecyclerView.ViewHolder viewHolder) {
    }

    public void onReorderRemove(RecyclerView.ViewHolder viewHolder) {
    }

    public void onReorderStart(RecyclerView.ViewHolder viewHolder) {
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.reorderingLongPressEnabled = z;
    }

    @Override
    public void setSections() {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void setSpanCount(int i) {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager instanceof ExtendedGridLayoutManager) {
            ((ExtendedGridLayoutManager) linearLayoutManager).setSpanCount(i);
            return;
        }
        if (linearLayoutManager == null || i == -1) {
            return;
        }
        final ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(getContext(), i) {
            @Override
            public int getExtraLayoutSpace(RecyclerView.State state) {
                return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
            }
        };
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                int i3;
                UniversalAdapter universalAdapter = UniversalRecyclerView.this.adapter;
                if (universalAdapter == null) {
                    return extendedGridLayoutManager.getSpanCount();
                }
                UItem item = universalAdapter.getItem(i2);
                return (item == null || (i3 = item.spanCount) == -1) ? extendedGridLayoutManager.getSpanCount() : i3;
            }
        });
        this.layoutManager = extendedGridLayoutManager;
        setLayoutManager(extendedGridLayoutManager);
    }

    public void swappedElements() {
    }

    public void doNotDetachViews(boolean z) {
        this.doNotDetachViews = z;
    }

    public void listenReorder(Utilities.Callback2<Integer, ArrayList<UItem>> callback2, boolean z) {
        this.reorderingOnOtherAxis = z;
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this);
        this.adapter.listenReorder(callback2);
    }

    @Override
    public void setSections(boolean z) {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z);
    }

    @Override
    public void setSections(int i, float f, boolean z) {
        super.setSections(new RecyclerListView$$ExternalSyntheticLambda2(this, 3), new AlertsCreator$$ExternalSyntheticLambda260(3), i, f, new ColorPicker$$ExternalSyntheticLambda5(this, 23), z);
    }

    public UniversalRecyclerView(Context context, int i, int i2, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Utilities.Callback5<UItem, View, Integer, Float, Float> callback5, Utilities.Callback5Return<UItem, View, Integer, Float, Float, Boolean> callback5Return, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, false, callback2, callback5, callback5Return, resourcesProvider);
    }

    public UniversalRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Utilities.Callback5<UItem, View, Integer, Float, Float> callback5, Utilities.Callback5Return<UItem, View, Integer, Float, Float, Boolean> callback5Return, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, z, callback2, callback5, callback5Return, resourcesProvider, -1, 1);
    }

    public UniversalRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2<ArrayList<UItem>, UniversalAdapter> callback2, Utilities.Callback5<UItem, View, Integer, Float, Float> callback5, Utilities.Callback5Return<UItem, View, Integer, Float, Float, Boolean> callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
        super(context, resourcesProvider);
        this.reorderingLongPressEnabled = true;
        boolean z2 = false;
        if (i3 == -1) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i4, z2) {
                {
                    super(i4, z2);
                }

                @Override
                public int getExtraLayoutSpace(RecyclerView.State state) {
                    return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                }
            };
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
        } else {
            final ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, i3) {
                @Override
                public int getExtraLayoutSpace(RecyclerView.State state) {
                    return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                }
            };
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i5) {
                    int i6;
                    UniversalAdapter universalAdapter = UniversalRecyclerView.this.adapter;
                    if (universalAdapter == null) {
                        return extendedGridLayoutManager.getSpanCount();
                    }
                    UItem item = universalAdapter.getItem(i5);
                    return (item == null || (i6 = item.spanCount) == -1) ? extendedGridLayoutManager.getSpanCount() : i6;
                }
            });
            this.layoutManager = extendedGridLayoutManager;
            setLayoutManager(extendedGridLayoutManager);
        }
        UniversalAdapter universalAdapter = new UniversalAdapter(this, context, i, i2, z, callback2, resourcesProvider);
        this.adapter = universalAdapter;
        setAdapter(universalAdapter);
        if (callback5 != null) {
            setOnItemClickListener(new StickersDialogs$$ExternalSyntheticLambda2(this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener(new StickersDialogs$$ExternalSyntheticLambda2(this, callback5Return));
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onAddAnimationUpdate(viewHolder);
                if (UniversalRecyclerView.this.hasSections()) {
                    UniversalRecyclerView.this.invalidate();
                }
                UniversalRecyclerView.this.onLayoutUpdate();
            }

            @Override
            public void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onChangeAnimationUpdate(viewHolder);
                if (UniversalRecyclerView.this.hasSections()) {
                    UniversalRecyclerView.this.invalidate();
                }
                UniversalRecyclerView.this.onLayoutUpdate();
            }

            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                UniversalRecyclerView.this.invalidate();
                UniversalRecyclerView.this.onLayoutUpdate();
            }

            @Override
            public void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onRemoveAnimationUpdate(viewHolder);
                if (UniversalRecyclerView.this.hasSections()) {
                    UniversalRecyclerView.this.invalidate();
                }
                UniversalRecyclerView.this.onLayoutUpdate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        lambda$onCellEnter$52(defaultItemAnimator);
    }
}
