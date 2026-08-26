package org.telegram.ui.bots;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Stars.BotStarsController;

public abstract class BotCommandsMenuContainer extends FrameLayout {
    private BlurredBackgroundDrawable backgroundDrawable;
    private float containerY;
    private ObjectAnimator currentAnimation;
    boolean dismissed;
    private boolean entering;
    public RecyclerListView listView;
    private NestedScrollingParentHelper nestedScrollingParentHelper;
    float scrollYOffset;
    Paint topBackground;

    public final class AnonymousClass2 extends RecyclerView.OnScrollListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onScrolled(recyclerView, i, i2);
                    BotCommandsMenuContainer botCommandsMenuContainer = (BotCommandsMenuContainer) this.this$0;
                    View viewFindViewByPosition = botCommandsMenuContainer.listView.getLayoutManager().findViewByPosition(0);
                    float y = viewFindViewByPosition != null ? viewFindViewByPosition.getY() : 0.0f;
                    botCommandsMenuContainer.scrollYOffset = y >= 0.0f ? y : 0.0f;
                    BotCommandsMenuContainer.access$200(botCommandsMenuContainer);
                    break;
                default:
                    ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.this$0;
                    if (ChannelAffiliateProgramsFragment.access$000(channelAffiliateProgramsFragment) || !recyclerView.canScrollVertically(1)) {
                        BotStarsController botStarsController = BotStarsController.getInstance(((BaseFragment) channelAffiliateProgramsFragment).currentAccount);
                        long j = channelAffiliateProgramsFragment.dialogId;
                        botStarsController.getChannelConnectedBots(j).load();
                        BotStarsController.getInstance(((BaseFragment) channelAffiliateProgramsFragment).currentAccount).getChannelSuggestedBots(j).load();
                    }
                    break;
            }
        }
    }

    public BotCommandsMenuContainer(Context context) {
        super(context);
        this.currentAnimation = null;
        this.topBackground = new Paint(1);
        this.dismissed = true;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                BotCommandsMenuContainer botCommandsMenuContainer = BotCommandsMenuContainer.this;
                if (botCommandsMenuContainer.listView.getLayoutManager() == null || botCommandsMenuContainer.listView.getAdapter() == null || botCommandsMenuContainer.listView.getAdapter().getItemCount() == 0) {
                    super.dispatchDraw(canvas);
                    return;
                }
                float fDp = botCommandsMenuContainer.scrollYOffset - AndroidUtilities.dp(8.0f);
                botCommandsMenuContainer.containerY = fDp - AndroidUtilities.dp(16.0f);
                if (botCommandsMenuContainer.backgroundDrawable != null) {
                    botCommandsMenuContainer.backgroundDrawable.draw(canvas);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), fDp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), fDp);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), botCommandsMenuContainer.topBackground);
                super.dispatchDraw(canvas);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setOverScrollMode(2);
        this.listView.setClipToPadding(false);
        this.listView.setClipToOutline(true);
        this.listView.addOnScrollListener(new AnonymousClass2(this, 0));
        addView(this.listView);
        updateColors();
        setClipChildren(false);
    }

    public static void access$200(BotCommandsMenuContainer botCommandsMenuContainer) {
        BlurredBackgroundDrawable blurredBackgroundDrawable = botCommandsMenuContainer.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) botCommandsMenuContainer.scrollYOffset) - AndroidUtilities.dp(25.0f), botCommandsMenuContainer.getMeasuredWidth(), AndroidUtilities.dp(5.0f) + botCommandsMenuContainer.getMeasuredHeight());
            botCommandsMenuContainer.listView.invalidateOutline();
            botCommandsMenuContainer.listView.invalidate();
        }
    }

    public float clipBottom() {
        if (this.dismissed) {
            return 0.0f;
        }
        return Math.max(0.0f, getMeasuredHeight() - (this.listView.getTranslationY() + this.containerY));
    }

    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        ObjectAnimator objectAnimator = this.currentAnimation;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.currentAnimation.cancel();
            this.currentAnimation = null;
        }
        RecyclerListView recyclerListView = this.listView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) FrameLayout.TRANSLATION_Y, recyclerListView.getTranslationY(), (getMeasuredHeight() - this.scrollYOffset) + AndroidUtilities.dp(40.0f));
        this.currentAnimation = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new BaseChartView.AnonymousClass4(this, 27));
        this.currentAnimation.setDuration(150L);
        this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.currentAnimation.start();
        onDismiss();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.scrollYOffset - AndroidUtilities.dp(24.0f)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    @Override
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.nestedScrollingParentHelper;
        return nestedScrollingParentHelper.mNestedScrollAxesNonTouch | nestedScrollingParentHelper.mNestedScrollAxesTouch;
    }

    public abstract void onDismiss();

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.entering && !this.dismissed) {
            RecyclerListView recyclerListView = this.listView;
            recyclerListView.setTranslationY(AndroidUtilities.dp(16.0f) + (recyclerListView.getMeasuredHeight() - this.listView.getPaddingTop()));
            playEnterAnim(true);
            this.entering = false;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) this.scrollYOffset) - AndroidUtilities.dp(25.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + getMeasuredHeight());
            this.listView.invalidateOutline();
            this.listView.invalidate();
        }
    }

    @Override
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.dismissed) {
            return;
        }
        ObjectAnimator objectAnimator = this.currentAnimation;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.currentAnimation.cancel();
            this.currentAnimation = null;
        }
        float translationY = this.listView.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        this.listView.setTranslationY(f >= 0.0f ? f : 0.0f);
        invalidate();
    }

    @Override
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.dismissed) {
            return;
        }
        ObjectAnimator objectAnimator = this.currentAnimation;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.currentAnimation.cancel();
            this.currentAnimation = null;
        }
        if (i4 != 0) {
            float translationY = this.listView.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            this.listView.setTranslationY(translationY);
            invalidate();
        }
    }

    @Override
    public void onNestedScrollAccepted(View view, View view2, int i) {
        ObjectAnimator objectAnimator;
        this.nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        if (this.dismissed || (objectAnimator = this.currentAnimation) == null) {
            return;
        }
        objectAnimator.removeAllListeners();
        this.currentAnimation.cancel();
        this.currentAnimation = null;
    }

    @Override
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return !this.dismissed && i == 2;
    }

    @Override
    public void onStopNestedScroll(View view) {
        this.nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        boolean z = this.dismissed;
        if (z || z) {
            return;
        }
        if (this.listView.getTranslationY() > AndroidUtilities.dp(16.0f)) {
            dismiss();
        } else {
            playEnterAnim(false);
        }
    }

    public final void playEnterAnim(boolean z) {
        if (this.dismissed) {
            return;
        }
        RecyclerListView recyclerListView = this.listView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) FrameLayout.TRANSLATION_Y, recyclerListView.getTranslationY(), 0.0f);
        this.currentAnimation = objectAnimatorOfFloat;
        if (z) {
            objectAnimatorOfFloat.setDuration(320L);
            this.currentAnimation.setInterpolator(new OvershootInterpolator(0.8f));
        } else {
            objectAnimatorOfFloat.setDuration(150L);
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        }
        this.currentAnimation.start();
    }

    public void setBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
        this.backgroundDrawable.setPadding(AndroidUtilities.dp(5.0f));
        RecyclerListView recyclerListView = this.listView;
        if (blurredBackgroundDrawable.viewOutlineProvider == null) {
            blurredBackgroundDrawable.viewOutlineProvider = new ActionBarLayout.AnonymousClass4(blurredBackgroundDrawable, 1);
        }
        recyclerListView.setOutlineProvider(blurredBackgroundDrawable.viewOutlineProvider);
    }

    public void show() {
        if (getVisibility() != 0) {
            setVisibility(0);
            this.listView.scrollToPosition(0);
            this.entering = true;
            this.dismissed = false;
            return;
        }
        if (this.dismissed) {
            this.dismissed = false;
            ObjectAnimator objectAnimator = this.currentAnimation;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.currentAnimation.cancel();
                this.currentAnimation = null;
            }
            playEnterAnim(false);
        }
    }

    public void updateColors() {
        this.topBackground.setColor(Theme.getColor(null, Theme.key_sheet_scrollUp, false));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        invalidate();
    }
}
