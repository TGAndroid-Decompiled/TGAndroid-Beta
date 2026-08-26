package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.TextViewSwitcher;

public final class DialogsEmptyCell extends LinearLayout {
    public static final int $r8$clinit = 0;
    public final int currentAccount;
    public int currentType;
    public final RLottieImageView imageView;
    public Runnable onUtyanAnimationEndListener;
    public Consumer onUtyanAnimationUpdateListener;
    public int prevIcon;
    public final TextViewSwitcher subtitleView;
    public final TextView titleView;
    public boolean utyanAnimationTriggered;
    public ValueAnimator utyanAnimator;
    public float utyanCollapseProgress;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final DialogsEmptyCell this$0;

        public AnonymousClass1(DialogsEmptyCell dialogsEmptyCell, int i) {
            this.$r8$classId = i;
            this.this$0 = dialogsEmptyCell;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    DialogsEmptyCell dialogsEmptyCell = this.this$0;
                    Runnable runnable = dialogsEmptyCell.onUtyanAnimationEndListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (animator == dialogsEmptyCell.utyanAnimator) {
                        dialogsEmptyCell.utyanAnimator = null;
                    }
                    break;
                default:
                    DialogsEmptyCell dialogsEmptyCell2 = this.this$0;
                    Runnable runnable2 = dialogsEmptyCell2.onUtyanAnimationEndListener;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (animator == dialogsEmptyCell2.utyanAnimator) {
                        dialogsEmptyCell2.utyanAnimator = null;
                    }
                    break;
            }
        }
    }

    public DialogsEmptyCell(final Context context) {
        super(context);
        this.currentType = -1;
        this.currentAccount = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new BottomSheet$$ExternalSyntheticLambda6(2));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(rLottieImageView, LayoutHelper.createFrame(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        rLottieImageView.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 10));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_chats_nameMessage_threeLines, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
        this.subtitleView = textViewSwitcher;
        textViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        textViewSwitcher.setInAnimation(context, R.anim.alpha_in);
        textViewSwitcher.setOutAnimation(context, R.anim.alpha_out);
        addView(textViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    @Override
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        updateLayout();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateLayout();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        int i3 = this.currentType;
        if (i3 == 0 || i3 == 1) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            if (size == 0) {
                size = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.utyanCollapseProgress) + size), 1073741824));
            return;
        }
        if (i3 != 2 && i3 != 3) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= AndroidUtilities.statusBarHeight;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        if (size2 == 0) {
            size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        if (getParent() instanceof BlurredRecyclerView) {
            size2 -= ((BlurredRecyclerView) getParent()).blurTopPadding;
        }
        ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.currentAccount).hintDialogs;
        if (!arrayList.isEmpty()) {
            size2 = OKLCH.m$1(50.0f, (arrayList.size() + (arrayList.size() * AndroidUtilities.dp(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.onUtyanAnimationEndListener = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(Consumer consumer) {
        this.onUtyanAnimationUpdateListener = consumer;
    }

    public final void startUtyanCollapseAnimation(boolean z) {
        int i = 1;
        ValueAnimator valueAnimator = this.utyanAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.utyanAnimationTriggered = true;
        if (z) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.subtitleView.setText(string, true);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.utyanCollapseProgress, 1.0f).setDuration(250L);
        this.utyanAnimator = duration;
        duration.setInterpolator(Easings.easeOutQuad);
        this.utyanAnimator.addUpdateListener(new DialogsEmptyCell$$ExternalSyntheticLambda3(this, 0));
        this.utyanAnimator.addListener(new AnonymousClass1(this, i));
        this.utyanAnimator.start();
    }

    public final void updateLayout() {
        int i;
        int currentActionBarHeight = 0;
        if ((getParent() instanceof View) && (((i = this.currentType) == 2 || i == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            currentActionBarHeight = 0 - (getTop() / 2);
        }
        int i2 = this.currentType;
        if (i2 == 0 || i2 == 1) {
            currentActionBarHeight -= (int) ((1.0f - this.utyanCollapseProgress) * (ActionBar.getCurrentActionBarHeight() / 2.0f));
        }
        float f = currentActionBarHeight;
        this.imageView.setTranslationY(f);
        this.titleView.setTranslationY(f);
        this.subtitleView.setTranslationY(f);
    }
}
