package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
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
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

public abstract class BottomSheetWithRecyclerListView extends BottomSheet {
    protected ActionBar actionBar;
    protected boolean actionBarIgnoreTouchEvents;
    protected AnimatedFloat actionBarSlideProgress;
    private ActionBarType actionBarType;
    private BaseFragment baseFragment;
    protected boolean clipToActionBar;
    protected int contentHeight;
    protected boolean handleOffset;
    private RectF handleRect;
    public final boolean hasFixedSize;
    protected int headerHeight;
    protected int headerPaddingBottom;
    protected int headerPaddingTop;
    private final Drawable headerShadowDrawable;
    protected int headerTotalHeight;
    protected LinearLayoutManager layoutManager;
    public NestedSizeNotifierLayout nestedSizeNotifierLayout;
    protected RecyclerListView recyclerListView;
    private int savedScrollOffset;
    private int savedScrollPosition;
    private float shadowAlpha;
    private boolean showHandle;
    boolean showShadow;
    protected boolean takeTranslationIntoAccount;
    public float topPadding;
    boolean wasDrawn;

    public enum ActionBarType {
        FADING,
        SLIDING
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected boolean canHighlightChildAt(View view, float f, float f2) {
        return true;
    }

    protected abstract RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView);

    protected abstract CharSequence getTitle();

    protected boolean needPaddingShadow() {
        return true;
    }

    protected void onPreDraw(Canvas canvas, int i, float f) {
    }

    public void onPreMeasure(int i, int i2) {
    }

    public void onViewCreated(FrameLayout frameLayout) {
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2) {
        this(baseFragment, z, z2, false, baseFragment == null ? null : baseFragment.getResourceProvider());
    }

    public BottomSheetWithRecyclerListView(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment.getParentActivity(), baseFragment, z, z2, z3, resourcesProvider);
    }

    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, z2, z3, ActionBarType.FADING, resourcesProvider);
    }

    @SuppressLint({"AppCompatCustomView"})
    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, ActionBarType actionBarType, Theme.ResourcesProvider resourcesProvider) {
        this(context, baseFragment, z, z2, z3, false, actionBarType, resourcesProvider);
    }

    @SuppressLint({"AppCompatCustomView"})
    public BottomSheetWithRecyclerListView(Context context, BaseFragment baseFragment, boolean z, final boolean z2, boolean z3, final boolean z4, ActionBarType actionBarType, Theme.ResourcesProvider resourcesProvider) {
        super(context, z, resourcesProvider);
        final FrameLayout frameLayout;
        this.topPadding = 0.4f;
        this.showShadow = true;
        this.shadowAlpha = 1.0f;
        this.showHandle = false;
        this.handleRect = new RectF();
        this.actionBarType = ActionBarType.FADING;
        this.headerTotalHeight = 0;
        this.headerHeight = 0;
        this.headerPaddingTop = 0;
        this.headerPaddingBottom = 0;
        this.actionBarIgnoreTouchEvents = false;
        this.takeTranslationIntoAccount = false;
        this.savedScrollPosition = -1;
        this.baseFragment = baseFragment;
        this.hasFixedSize = z2;
        this.headerShadowDrawable = ContextCompat.getDrawable(context, R.drawable.header_shadow).mutate();
        if (z3) {
            NestedSizeNotifierLayout nestedSizeNotifierLayout = new NestedSizeNotifierLayout(context) {
                @Override
                public void onMeasure(int i, int i2) {
                    BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                    BottomSheetWithRecyclerListView.this.onPreMeasure(i, i2);
                    if (z4) {
                        i2 = View.MeasureSpec.makeMeasureSpec(BottomSheetWithRecyclerListView.this.contentHeight, 1073741824);
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView.this.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    BottomSheetWithRecyclerListView.this.postDrawInternal(canvas, this);
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
            this.nestedSizeNotifierLayout = nestedSizeNotifierLayout;
            frameLayout = nestedSizeNotifierLayout;
        } else {
            frameLayout = new FrameLayout(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    BottomSheetWithRecyclerListView.this.contentHeight = View.MeasureSpec.getSize(i2);
                    BottomSheetWithRecyclerListView.this.onPreMeasure(i, i2);
                    if (z4) {
                        i2 = View.MeasureSpec.makeMeasureSpec(BottomSheetWithRecyclerListView.this.contentHeight, 1073741824);
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    BottomSheetWithRecyclerListView.this.preDrawInternal(canvas, this);
                    super.dispatchDraw(canvas);
                    BottomSheetWithRecyclerListView.this.postDrawInternal(canvas, this);
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
        }
        this.recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public void onLayout(boolean z5, int i, int i2, int i3, int i4) {
                BottomSheetWithRecyclerListView.this.applyScrolledPosition();
                super.onLayout(z5, i, i2, i3, i4);
            }

            @Override
            public boolean canHighlightChildAt(View view, float f, float f2) {
                return BottomSheetWithRecyclerListView.this.canHighlightChildAt(view, f, f2);
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        if (z4) {
            linearLayoutManager.setStackFromEnd(true);
        }
        this.recyclerListView.setLayoutManager(this.layoutManager);
        NestedSizeNotifierLayout nestedSizeNotifierLayout2 = this.nestedSizeNotifierLayout;
        if (nestedSizeNotifierLayout2 != null) {
            nestedSizeNotifierLayout2.setBottomSheetContainerView(getContainer());
            this.nestedSizeNotifierLayout.setTargetListView(this.recyclerListView);
        }
        if (z2) {
            this.recyclerListView.setHasFixedSize(true);
            RecyclerListView recyclerListView = this.recyclerListView;
            recyclerListView.setAdapter(createAdapter(recyclerListView));
            setCustomView(frameLayout);
            frameLayout.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
        } else {
            resetAdapter(context);
            this.containerView = frameLayout;
            ActionBar actionBar = new ActionBar(context) {
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

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (BottomSheetWithRecyclerListView.this.actionBarIgnoreTouchEvents) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.actionBar = actionBar;
            actionBar.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            this.actionBar.setTitleColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setCastShadows(true);
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
            frameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    frameLayout.invalidate();
                }
            });
        }
        if (actionBarType == ActionBarType.SLIDING) {
            setSlidingActionBar();
        }
        onViewCreated(frameLayout);
        updateStatusBar();
    }

    public void setSlidingActionBar() {
        if (this.hasFixedSize) {
            return;
        }
        this.actionBarType = ActionBarType.SLIDING;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        this.headerHeight = currentActionBarHeight;
        this.headerTotalHeight = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.headerPaddingTop = AndroidUtilities.dp(16.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-20.0f);
        this.actionBarSlideProgress = new AnimatedFloat(this.containerView, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBar.backButtonImageView.setPivotX(0.0f);
        this.recyclerListView.setClipToPadding(true);
    }

    protected void resetAdapter(final Context context) {
        final RecyclerListView.SelectionAdapter createAdapter = createAdapter(this.recyclerListView);
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
                            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView = BottomSheetWithRecyclerListView.this;
                            int i5 = bottomSheetWithRecyclerListView.contentHeight;
                            if (i5 == 0) {
                                i4 = AndroidUtilities.dp(300.0f);
                            } else {
                                i4 = (int) (i5 * bottomSheetWithRecyclerListView.topPadding);
                            }
                            BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView2 = BottomSheetWithRecyclerListView.this;
                            int i6 = i4 - (((bottomSheetWithRecyclerListView2.headerTotalHeight - bottomSheetWithRecyclerListView2.headerHeight) - bottomSheetWithRecyclerListView2.headerPaddingTop) - bottomSheetWithRecyclerListView2.headerPaddingBottom);
                            if (i6 < 1) {
                                i6 = 1;
                            }
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                        }

                        @Override
                        public void setTranslationY(float f) {
                            super.setTranslationY(f);
                            ((BottomSheet) BottomSheetWithRecyclerListView.this).containerView.invalidate();
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

            @Override
            public void registerAdapterDataObserver(final RecyclerView.AdapterDataObserver adapterDataObserver) {
                createAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) {
                    @Override
                    public void onChanged() {
                        adapterDataObserver.onChanged();
                    }

                    @Override
                    public void onItemRangeChanged(int i, int i2) {
                        adapterDataObserver.onItemRangeChanged(i + 1, i2);
                    }

                    @Override
                    public void onItemRangeChanged(int i, int i2, Object obj) {
                        adapterDataObserver.onItemRangeChanged(i + 1, i2, obj);
                    }

                    @Override
                    public void onItemRangeInserted(int i, int i2) {
                        adapterDataObserver.onItemRangeInserted(i + 1, i2);
                    }

                    @Override
                    public void onItemRangeRemoved(int i, int i2) {
                        adapterDataObserver.onItemRangeRemoved(i + 1, i2);
                    }

                    @Override
                    public void onItemRangeMoved(int i, int i2, int i3) {
                        adapterDataObserver.onItemRangeMoved(i + 1, i2 + 1, i3);
                    }
                });
            }
        });
    }

    public void postDrawInternal(android.graphics.Canvas r8, android.view.View r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BottomSheetWithRecyclerListView.postDrawInternal(android.graphics.Canvas, android.view.View):void");
    }

    public void preDrawInternal(Canvas canvas, View view) {
        float f;
        if (this.hasFixedSize) {
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.recyclerListView.findViewHolderForAdapterPosition(0);
        int i = -AndroidUtilities.dp(16.0f);
        if (findViewHolderForAdapterPosition != null) {
            i = findViewHolderForAdapterPosition.itemView.getBottom() - AndroidUtilities.dp(16.0f);
            if (this.takeTranslationIntoAccount) {
                i += (int) findViewHolderForAdapterPosition.itemView.getTranslationY();
            }
        }
        int i2 = ((i - this.headerHeight) - this.headerPaddingTop) - this.headerPaddingBottom;
        if (this.showHandle && this.handleOffset) {
            i2 -= AndroidUtilities.dp(this.actionBarType == ActionBarType.SLIDING ? 8.0f : 16.0f);
        }
        ActionBarType actionBarType = this.actionBarType;
        float f2 = 1.0f;
        if (actionBarType == ActionBarType.FADING) {
            f = 1.0f - ((AndroidUtilities.dp(16.0f) + i2) / AndroidUtilities.dp(56.0f));
            if (f < 0.0f) {
                f = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, f != 0.0f, 1.0f, this.wasDrawn);
        } else if (actionBarType == ActionBarType.SLIDING) {
            float max = Math.max(((AndroidUtilities.dp(8.0f) + i2) + this.headerPaddingTop) - AndroidUtilities.statusBarHeight, 0.0f);
            float f3 = this.actionBarSlideProgress.set(max == 0.0f ? 1.0f : 0.0f);
            this.shadowAlpha = f3;
            f2 = AndroidUtilities.lerp(1.0f, 0.5f, f3);
            this.actionBar.backButtonImageView.setAlpha(f3);
            this.actionBar.backButtonImageView.setScaleX(f3);
            this.actionBar.backButtonImageView.setPivotY(r5.getMeasuredHeight() / 2.0f);
            this.actionBar.backButtonImageView.setScaleY(f3);
            this.actionBar.getTitleTextView().setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - r5.getLeft(), 0.0f, f3));
            this.actionBar.setTranslationY(max);
            i2 -= AndroidUtilities.lerp(0, (((this.headerTotalHeight - this.headerHeight) - this.headerPaddingTop) - this.headerPaddingBottom) + AndroidUtilities.dp(13.0f), f3);
            this.actionBar.getBackground().setBounds(0, AndroidUtilities.lerp(this.actionBar.getHeight(), 0, f3), this.actionBar.getWidth(), this.actionBar.getHeight());
            if (f3 > 0.5f) {
                if (this.actionBarIgnoreTouchEvents) {
                    this.actionBarIgnoreTouchEvents = false;
                    this.actionBar.setTag(1);
                }
            } else if (!this.actionBarIgnoreTouchEvents) {
                this.actionBarIgnoreTouchEvents = true;
                this.actionBar.setTag(null);
            }
            f = f3;
        } else {
            f = 0.0f;
        }
        if (needPaddingShadow()) {
            this.shadowDrawable.setBounds(0, i2, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i2, view.getMeasuredWidth() + AndroidUtilities.dp(6.0f), view.getMeasuredHeight());
        }
        this.shadowDrawable.draw(canvas);
        if (this.showHandle && f2 > 0.0f) {
            int dp = AndroidUtilities.dp(36.0f);
            this.handleRect.set((view.getMeasuredWidth() - dp) / 2.0f, AndroidUtilities.dp(20.0f) + i2, (view.getMeasuredWidth() + dp) / 2.0f, r2 + AndroidUtilities.dp(4.0f));
            Theme.dialogs_onlineCirclePaint.setColor(getThemedColor(Theme.key_sheet_scrollUp));
            Theme.dialogs_onlineCirclePaint.setAlpha((int) (r14.getAlpha() * f2));
            canvas.drawRoundRect(this.handleRect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
        }
        onPreDraw(canvas, i2, f);
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getTag() != null) {
            return isLightStatusBar();
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            return baseFragment.isLightStatusBar();
        }
        return isLightStatusBar();
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d;
    }

    public void notifyDataSetChanged() {
        this.recyclerListView.getAdapter().notifyDataSetChanged();
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public void updateStatusBar() {
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true, false);
            return;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
        } else if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    public void updateTitle() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
    }

    public void updateTitleAnimated() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitleAnimated(getTitle(), false, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }
    }

    public void setShowShadow(boolean z) {
        this.showShadow = z;
        this.nestedSizeNotifierLayout.invalidate();
    }

    public void setShowHandle(boolean z) {
        this.showHandle = z;
    }

    public void saveScrollPosition() {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < this.recyclerListView.getChildCount(); i3++) {
            View childAt = this.recyclerListView.getChildAt(i3);
            int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition > 0 && childAt.getTop() < i2) {
                i2 = childAt.getTop();
                view = childAt;
                i = childAdapterPosition;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i;
            this.savedScrollOffset = view.getTop() + this.containerView.getTop();
            smoothContainerViewLayout();
        }
    }

    public void applyScrolledPosition() {
        applyScrolledPosition(false);
    }

    public void applyScrolledPosition(boolean z) {
        if (this.recyclerListView == null || this.layoutManager == null || this.savedScrollPosition < 0) {
            return;
        }
        int top = (this.savedScrollOffset - this.containerView.getTop()) - this.recyclerListView.getPaddingTop();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.recyclerListView.findViewHolderForAdapterPosition(0);
        if (z && findViewHolderForAdapterPosition != null) {
            top -= Math.max(findViewHolderForAdapterPosition.itemView.getBottom() - this.recyclerListView.getPaddingTop(), 0);
        }
        this.layoutManager.scrollToPositionWithOffset(this.savedScrollPosition, top);
        this.savedScrollPosition = -1;
    }
}
