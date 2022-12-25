package org.telegram.p009ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.RecyclerListView;

public abstract class BottomSheetWithRecyclerListView extends BottomSheet {
    protected C1069ActionBar actionBar;
    private BaseFragment baseFragment;
    protected boolean clipToActionBar;
    private int contentHeight;
    public final boolean hasFixedSize;
    protected RecyclerListView recyclerListView;
    public float topPadding;
    boolean wasDrawn;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected abstract RecyclerListView.SelectionAdapter createAdapter();

    protected abstract CharSequence getTitle();

    protected void onPreDraw(Canvas canvas, int i, float f) {
    }

    public void onPreMeasure(int i, int i2) {
    }

    public void onViewCreated(FrameLayout frameLayout) {
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2) {
        this(baseFragment, z, z2, null);
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, final boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment.getParentActivity(), z, resourcesProvider);
        this.topPadding = 0.4f;
        this.baseFragment = baseFragment;
        this.hasFixedSize = z2;
        final Activity parentActivity = baseFragment.getParentActivity();
        final Drawable mutate = ContextCompat.getDrawable(parentActivity, C1010R.C1011drawable.header_shadow).mutate();
        final FrameLayout frameLayout = new FrameLayout(parentActivity) {
            @Override
            protected void onMeasure(int i, int i2) {
                BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                BottomSheetWithRecyclerListView.this.onPreMeasure(i, i2);
                super.onMeasure(i, i2);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (!z2) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = BottomSheetWithRecyclerListView.this.recyclerListView.findViewHolderForAdapterPosition(0);
                    int i = -AndroidUtilities.m35dp(16.0f);
                    if (findViewHolderForAdapterPosition != null) {
                        i = findViewHolderForAdapterPosition.itemView.getBottom() - AndroidUtilities.m35dp(16.0f);
                    }
                    float m35dp = 1.0f - ((AndroidUtilities.m35dp(16.0f) + i) / AndroidUtilities.m35dp(56.0f));
                    if (m35dp < 0.0f) {
                        m35dp = 0.0f;
                    }
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    AndroidUtilities.updateViewVisibilityAnimated(bottomSheetWithRecyclerListView.actionBar, m35dp != 0.0f, 1.0f, bottomSheetWithRecyclerListView.wasDrawn);
                    ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.setBounds(0, i, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.draw(canvas);
                    BottomSheetWithRecyclerListView.this.onPreDraw(canvas, i, m35dp);
                }
                super.dispatchDraw(canvas);
                C1069ActionBar c1069ActionBar = BottomSheetWithRecyclerListView.this.actionBar;
                if (c1069ActionBar != null && c1069ActionBar.getVisibility() == 0 && BottomSheetWithRecyclerListView.this.actionBar.getAlpha() != 0.0f) {
                    mutate.setBounds(0, BottomSheetWithRecyclerListView.this.actionBar.getBottom(), getMeasuredWidth(), BottomSheetWithRecyclerListView.this.actionBar.getBottom() + mutate.getIntrinsicHeight());
                    mutate.setAlpha((int) (BottomSheetWithRecyclerListView.this.actionBar.getAlpha() * 255.0f));
                    mutate.draw(canvas);
                }
                BottomSheetWithRecyclerListView.this.wasDrawn = true;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (!z2) {
                    BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                    if (bottomSheetWithRecyclerListView.clipToActionBar && view == bottomSheetWithRecyclerListView.recyclerListView) {
                        canvas.save();
                        canvas.clipRect(0, BottomSheetWithRecyclerListView.this.actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                        super.drawChild(canvas, view, j);
                        canvas.restore();
                        return true;
                    }
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((BottomSheet) BottomSheetWithRecyclerListView.this).shadowDrawable.getBounds().top) {
                    BottomSheetWithRecyclerListView.this.dismiss();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        RecyclerListView recyclerListView = new RecyclerListView(parentActivity);
        this.recyclerListView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(parentActivity));
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
                        return new RecyclerListView.Holder(new View(parentActivity) {
                            @Override
                            protected void onMeasure(int i2, int i3) {
                                int i4;
                                if (BottomSheetWithRecyclerListView.this.contentHeight != 0) {
                                    i4 = (int) (BottomSheetWithRecyclerListView.this.contentHeight * BottomSheetWithRecyclerListView.this.topPadding);
                                } else {
                                    i4 = AndroidUtilities.m35dp(300.0f);
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
            C1069ActionBar c1069ActionBar = new C1069ActionBar(parentActivity) {
                @Override
                public void setAlpha(float f) {
                    if (getAlpha() != f) {
                        super.setAlpha(f);
                        frameLayout.invalidate();
                    }
                }

                @Override
                public void setTag(Object obj) {
                    super.setTag(obj);
                    BottomSheetWithRecyclerListView.this.updateStatusBar();
                }
            };
            this.actionBar = c1069ActionBar;
            c1069ActionBar.setBackgroundColor(getThemedColor("dialogBackground"));
            this.actionBar.setTitleColor(getThemedColor("windowBackgroundWhiteBlackText"));
            this.actionBar.setItemsBackgroundColor(getThemedColor("actionBarActionModeDefaultSelector"), false);
            this.actionBar.setItemsColor(getThemedColor("actionBarActionModeDefaultIcon"), false);
            this.actionBar.setCastShadows(true);
            this.actionBar.setBackButtonImage(C1010R.C1011drawable.ic_ab_back);
            this.actionBar.setTitle(getTitle());
            this.actionBar.setActionBarMenuOnItemClick(new C1069ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        BottomSheetWithRecyclerListView.this.dismiss();
                    }
                }
            });
            frameLayout.addView(this.recyclerListView);
            frameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    frameLayout.invalidate();
                }
            });
        }
        onViewCreated(frameLayout);
        updateStatusBar();
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("dialogBackground")) > 0.699999988079071d;
    }

    public void notifyDataSetChanged() {
        this.recyclerListView.getAdapter().notifyDataSetChanged();
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public void updateStatusBar() {
        C1069ActionBar c1069ActionBar = this.actionBar;
        if (c1069ActionBar != null && c1069ActionBar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
        } else if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }
}
