package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.RecyclerListView;

public abstract class BottomSheetWithRecyclerListView extends BottomSheet {
    protected ActionBar actionBar;
    private int contentHeight;
    protected RecyclerListView recyclerListView;
    boolean wasDrawn;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected abstract RecyclerListView.SelectionAdapter createAdapter();

    protected abstract CharSequence getTitle();

    public void onViewCreated(FrameLayout frameLayout) {
    }

    public BottomSheetWithRecyclerListView(final Context context, boolean z, final boolean z2) {
        super(context, z);
        final Drawable mutate = ContextCompat.getDrawable(context, R.drawable.header_shadow).mutate();
        final FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                super.onMeasure(i, i2);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (!z2) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = BottomSheetWithRecyclerListView.this.recyclerListView.findViewHolderForAdapterPosition(0);
                    int i = -AndroidUtilities.dp(16.0f);
                    if (findViewHolderForAdapterPosition != null) {
                        i = findViewHolderForAdapterPosition.itemView.getBottom() - AndroidUtilities.dp(16.0f);
                    }
                    float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i) / AndroidUtilities.dp(56.0f));
                    if (dp < 0.0f) {
                        dp = 0.0f;
                    }
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    AndroidUtilities.updateViewVisibilityAnimated(bottomSheetWithRecyclerListView.actionBar, dp != 0.0f, 1.0f, bottomSheetWithRecyclerListView.wasDrawn);
                    ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.setBounds(0, i, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                ActionBar actionBar = BottomSheetWithRecyclerListView.this.actionBar;
                if (!(actionBar == null || actionBar.getAlpha() == 0.0f)) {
                    mutate.setBounds(0, BottomSheetWithRecyclerListView.this.actionBar.getBottom(), getMeasuredWidth(), BottomSheetWithRecyclerListView.this.actionBar.getBottom() + mutate.getIntrinsicHeight());
                    mutate.setAlpha((int) (BottomSheetWithRecyclerListView.this.actionBar.getAlpha() * 255.0f));
                    mutate.draw(canvas);
                }
                BottomSheetWithRecyclerListView.this.wasDrawn = true;
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.recyclerListView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        final RecyclerListView.SelectionAdapter createAdapter = createAdapter();
        if (z2) {
            this.recyclerListView.setHasFixedSize(true);
            this.recyclerListView.setAdapter(createAdapter);
            setCustomView(frameLayout);
            frameLayout.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
        } else {
            this.recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
                @Override
                public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return createAdapter.isEnabled(viewHolder);
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    if (i == -1000) {
                        return new RecyclerListView.Holder(new View(context) {
                            @Override
                            protected void onMeasure(int i2, int i3) {
                                int i4;
                                if (BottomSheetWithRecyclerListView.this.contentHeight == 0) {
                                    i4 = AndroidUtilities.dp(300.0f);
                                } else {
                                    i4 = (int) (BottomSheetWithRecyclerListView.this.contentHeight * 0.5f);
                                }
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                            }
                        });
                    }
                    return createAdapter.onCreateViewHolder(viewGroup, i);
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    if (i != 0) {
                        createAdapter.onBindViewHolder(viewHolder, i - 1);
                    }
                }

                @Override
                public int getItemViewType(int i) {
                    if (i == 0) {
                        return -1000;
                    }
                    return createAdapter.getItemViewType(i - 1);
                }

                @Override
                public int getItemCount() {
                    return createAdapter.getItemCount() + 1;
                }
            });
            this.containerView = frameLayout;
            ActionBar actionBar = new ActionBar(this, context) {
                @Override
                public void setAlpha(float f) {
                    if (getAlpha() != f) {
                        super.setAlpha(f);
                        frameLayout.invalidate();
                    }
                }
            };
            this.actionBar = actionBar;
            actionBar.setBackgroundColor(getThemedColor("actionBarDefault"));
            this.actionBar.setItemsBackgroundColor(getThemedColor("actionBarDefaultSelector"), false);
            this.actionBar.setItemsBackgroundColor(getThemedColor("actionBarActionModeDefaultSelector"), true);
            this.actionBar.setItemsColor(getThemedColor("actionBarDefaultIcon"), false);
            this.actionBar.setItemsColor(getThemedColor("actionBarActionModeDefaultIcon"), true);
            this.actionBar.setCastShadows(true);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(getTitle());
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        BottomSheetWithRecyclerListView.this.dismiss();
                    }
                }
            });
            frameLayout.addView(this.recyclerListView);
            frameLayout.addView(this.actionBar);
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    frameLayout.invalidate();
                }
            });
        }
        onViewCreated(frameLayout);
    }

    public void notifyDataSetChanged() {
        this.recyclerListView.getAdapter().notifyDataSetChanged();
    }
}
