package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.cast.zzbe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda0;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public class UniversalRecyclerView extends RecyclerListView {
    public final UniversalAdapter adapter;
    public boolean doNotDetachViews;
    public ItemTouchHelper itemTouchHelper;
    public LinearLayoutManager layoutManager;
    public boolean reorderingAllowed;
    public boolean reorderingLongPressEnabled;
    public boolean reorderingOnOtherAxis;
    public RecyclerView.ViewHolder reorderingViewHolder;

    public UniversalRecyclerView(Context context, int i, int i2, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, false, callback2, callback5, callback5Return, resourcesProvider, -1, 1);
    }

    public final void allowReorder(boolean z) {
        if (this.reorderingAllowed == z) {
            return;
        }
        this.reorderingAllowed = z;
        this.adapter.allowReorder = z;
        AndroidUtilities.forEachViews((RecyclerView) this, (Consumer) new QrActivity$5$$ExternalSyntheticLambda0(this, 5));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!hasSections()) {
            UniversalAdapter universalAdapter = this.adapter;
            int i = 0;
            while (i < universalAdapter.whiteSections.size()) {
                UniversalAdapter.Section section = (UniversalAdapter.Section) universalAdapter.whiteSections.get(i);
                int i2 = section.end;
                if (i2 < 0) {
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    drawSectionBackground(canvas2, section.start, i2, Theme.getColor(universalAdapter.dialog ? Theme.key_dialogBackground : Theme.key_windowBackgroundWhite, universalAdapter.resourcesProvider), 0, 0);
                }
                i++;
                canvas = canvas2;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final int findPositionByItemId(int i) {
        int i2 = 0;
        while (true) {
            UniversalAdapter universalAdapter = this.adapter;
            if (i2 >= universalAdapter.items.size()) {
                return -1;
            }
            UItem item = universalAdapter.getItem(i2);
            if (item != null && item.id == i) {
                return i2;
            }
            i2++;
        }
    }

    public final View findViewByItemId(int i) {
        int i2 = 0;
        while (true) {
            UniversalAdapter universalAdapter = this.adapter;
            if (i2 >= universalAdapter.items.size()) {
                i2 = -1;
                break;
            }
            UItem item = universalAdapter.getItem(i2);
            if (item != null && item.id == i) {
                break;
            }
            i2++;
        }
        return findViewByPosition(i2);
    }

    public final View findViewByItemObject(Object obj) {
        int i = 0;
        while (true) {
            UniversalAdapter universalAdapter = this.adapter;
            if (i >= universalAdapter.items.size()) {
                i = -1;
                break;
            }
            UItem item = universalAdapter.getItem(i);
            if (item != null && item.object == obj) {
                break;
            }
            i++;
        }
        return findViewByPosition(i);
    }

    public int getSpanCount() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager instanceof ExtendedGridLayoutManager) {
            return ((ExtendedGridLayoutManager) linearLayoutManager).mSpanCount;
        }
        return -1;
    }

    public boolean isReorderRemoving() {
        return false;
    }

    public final void listenReorder(Utilities.Callback2 callback2, boolean z) {
        this.reorderingOnOtherAxis = z;
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, 4));
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this);
        this.adapter.onReordered = callback2;
    }

    public void onLayoutUpdate() {
    }

    public void onReorderEnd() {
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
    public final void setSections() {
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
        getContext();
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this, i);
        anonymousClass6.mSpanSizeLookup = new SharedMediaLayout.AnonymousClass34(this, anonymousClass6, 1);
        this.layoutManager = anonymousClass6;
        setLayoutManager(anonymousClass6);
    }

    public void swappedElements() {
    }

    public UniversalRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
        super(context, resourcesProvider);
        this.reorderingLongPressEnabled = true;
        if (i3 == -1) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(i4) {
                @Override
                public final int getExtraLayoutSpace(RecyclerView.State state) {
                    return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                }
            };
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
        } else {
            final ?? r3 = new ExtendedGridLayoutManager(i3) {
                @Override
                public final int getExtraLayoutSpace(RecyclerView.State state) {
                    return UniversalRecyclerView.this.doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                }
            };
            r3.mSpanSizeLookup = new BaseMenuWrapper() {
                @Override
                public final int getSpanSize(int i5) {
                    int i6;
                    UniversalAdapter universalAdapter = UniversalRecyclerView.this.adapter;
                    AnonymousClass2 anonymousClass2 = r3;
                    if (universalAdapter == null) {
                        return anonymousClass2.mSpanCount;
                    }
                    UItem item = universalAdapter.getItem(i5);
                    return (item == null || (i6 = item.spanCount) == -1) ? anonymousClass2.mSpanCount : i6;
                }
            };
            this.layoutManager = r3;
            setLayoutManager(r3);
        }
        UniversalAdapter universalAdapter = new UniversalAdapter(this, context, i, i2, z, callback2, resourcesProvider);
        this.adapter = universalAdapter;
        setAdapter(universalAdapter);
        if (callback5 != null) {
            setOnItemClickListener(new RateCallLayout$$ExternalSyntheticLambda1(20, this, callback5));
        }
        if (callback5Return != null) {
            setOnItemLongClickListener((RecyclerListView.OnItemLongClickListenerExtended) new RateCallLayout$$ExternalSyntheticLambda1(21, this, callback5Return));
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onAddAnimationUpdate() {
                UniversalRecyclerView universalRecyclerView = UniversalRecyclerView.this;
                if (universalRecyclerView.hasSections()) {
                    universalRecyclerView.invalidate();
                }
                universalRecyclerView.onLayoutUpdate();
            }

            @Override
            public final void onChangeAnimationUpdate() {
                UniversalRecyclerView universalRecyclerView = UniversalRecyclerView.this;
                if (universalRecyclerView.hasSections()) {
                    universalRecyclerView.invalidate();
                }
                universalRecyclerView.onLayoutUpdate();
            }

            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                UniversalRecyclerView universalRecyclerView = UniversalRecyclerView.this;
                universalRecyclerView.invalidate();
                universalRecyclerView.onLayoutUpdate();
            }

            @Override
            public final void onRemoveAnimationUpdate() {
                UniversalRecyclerView universalRecyclerView = UniversalRecyclerView.this;
                if (universalRecyclerView.hasSections()) {
                    universalRecyclerView.invalidate();
                }
                universalRecyclerView.onLayoutUpdate();
            }
        };
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        setItemAnimator(defaultItemAnimator);
    }

    @Override
    public void setSections(boolean z) {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z);
    }

    @Override
    public final void setSections(int i, float f, boolean z) {
        setSections(new WebActionBar$$ExternalSyntheticLambda9(this, 6), new ChatActivity$$ExternalSyntheticLambda29(5), i, f, new VideoEditTextureView$$ExternalSyntheticLambda1(this, 2), z);
    }

    public final class AnonymousClass6 extends ExtendedGridLayoutManager {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass6() {
            super(100, false);
            this.this$0 = new Size();
        }

        @Override
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            switch (this.$r8$classId) {
                case 1:
                    super.calculateExtraLayoutSpace(state, iArr);
                    iArr[1] = Math.max(iArr[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                    break;
                default:
                    super.calculateExtraLayoutSpace(state, iArr);
                    break;
            }
        }

        @Override
        public int getExtraLayoutSpace(RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 0:
                    return ((UniversalRecyclerView) this.this$0).doNotDetachViews ? AndroidUtilities.displaySize.y : super.getExtraLayoutSpace(state);
                default:
                    return super.getExtraLayoutSpace(state);
            }
        }

        @Override
        public int getFlowItemCount() {
            switch (this.$r8$classId) {
                case 1:
                    return 0;
                default:
                    return super.getFlowItemCount();
            }
        }

        @Override
        public Size getSizeForItem(int i) {
            switch (this.$r8$classId) {
                case 1:
                    Size size = (Size) this.this$0;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    return size;
                default:
                    return super.getSizeForItem(i);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            switch (this.$r8$classId) {
                case 1:
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                    zzbe zzbeVar = collectionItemInfo != null ? new zzbe(collectionItemInfo, 10) : null;
                    if (zzbeVar != null) {
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzbeVar.zza;
                        if (collectionItemInfo2.isHeading()) {
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        }
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    break;
            }
        }

        public AnonymousClass6(UniversalRecyclerView universalRecyclerView, int i) {
            super(i, false);
            this.this$0 = universalRecyclerView;
        }
    }
}
