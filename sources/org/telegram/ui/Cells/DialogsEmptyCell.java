package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
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
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.TextViewSwitcher;

public class DialogsEmptyCell extends LinearLayout {
    private int currentAccount;
    private int currentType;
    private RLottieImageView imageView;
    private Runnable onUtyanAnimationEndListener;
    private Consumer onUtyanAnimationUpdateListener;
    private int prevIcon;
    private TextViewSwitcher subtitleView;
    private TextView titleView;
    private boolean utyanAnimationTriggered;
    private ValueAnimator utyanAnimator;
    private float utyanCollapseProgress;

    public DialogsEmptyCell(final Context context) {
        super(context);
        this.currentType = -1;
        this.currentAccount = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$0;
                lambda$new$0 = DialogsEmptyCell.lambda$new$0(view, motionEvent);
                return lambda$new$0;
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.imageView, LayoutHelper.createFrame(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        this.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DialogsEmptyCell.this.lambda$new$1(view);
            }
        });
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_chats_nameMessage_threeLines));
        this.titleView.setTextSize(1, 20.0f);
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setGravity(17);
        addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
        this.subtitleView = textViewSwitcher;
        textViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                View lambda$new$2;
                lambda$new$2 = DialogsEmptyCell.lambda$new$2(context);
                return lambda$new$2;
            }
        });
        this.subtitleView.setInAnimation(context, R.anim.alpha_in);
        this.subtitleView.setOutAnimation(context, R.anim.alpha_out);
        addView(this.subtitleView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public static boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$1(View view) {
        if (this.imageView.isPlaying()) {
            return;
        }
        this.imageView.setProgress(0.0f);
        this.imageView.playAnimation();
    }

    public static View lambda$new$2(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_chats_message));
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        return textView;
    }

    public void lambda$startUtyanCollapseAnimation$4(ValueAnimator valueAnimator) {
        this.utyanCollapseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        requestLayout();
        Consumer consumer = this.onUtyanAnimationUpdateListener;
        if (consumer != null) {
            consumer.accept(Float.valueOf(this.utyanCollapseProgress));
        }
    }

    public void lambda$startUtyanExpandAnimation$3(ValueAnimator valueAnimator) {
        this.utyanCollapseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        requestLayout();
        Consumer consumer = this.onUtyanAnimationUpdateListener;
        if (consumer != null) {
            consumer.accept(Float.valueOf(this.utyanCollapseProgress));
        }
    }

    private int measureUtyanHeight(int i) {
        int size;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            size = view.getMeasuredHeight();
            if (view.getPaddingTop() != 0 && Build.VERSION.SDK_INT >= 21) {
                size -= AndroidUtilities.statusBarHeight;
            }
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        if (size == 0) {
            size = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
        }
        if (getParent() instanceof BlurredRecyclerView) {
            size -= ((BlurredRecyclerView) getParent()).blurTopPadding;
        }
        return (int) (size + ((AndroidUtilities.dp(320.0f) - size) * this.utyanCollapseProgress));
    }

    public boolean isUtyanAnimationTriggered() {
        return this.utyanAnimationTriggered;
    }

    @Override
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        updateLayout();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int measureUtyanHeight;
        int i3;
        int size;
        int i4 = this.currentType;
        if (i4 == 0 || i4 == 1) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            measureUtyanHeight = measureUtyanHeight(i2);
        } else {
            if (i4 == 2 || i4 == 3) {
                if (getParent() instanceof View) {
                    View view = (View) getParent();
                    size = view.getMeasuredHeight();
                    if (view.getPaddingTop() != 0 && Build.VERSION.SDK_INT >= 21) {
                        size -= AndroidUtilities.statusBarHeight;
                    }
                } else {
                    size = View.MeasureSpec.getSize(i2);
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                }
                if (getParent() instanceof BlurredRecyclerView) {
                    size -= ((BlurredRecyclerView) getParent()).blurTopPadding;
                }
                ArrayList<TLRPC$RecentMeUrl> arrayList = MessagesController.getInstance(this.currentAccount).hintDialogs;
                if (!arrayList.isEmpty()) {
                    size -= (((AndroidUtilities.dp(72.0f) * arrayList.size()) + arrayList.size()) - 1) + AndroidUtilities.dp(50.0f);
                }
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                super.onMeasure(i, i3);
            }
            measureUtyanHeight = AndroidUtilities.dp(166.0f);
        }
        i3 = View.MeasureSpec.makeMeasureSpec(measureUtyanHeight, 1073741824);
        super.onMeasure(i, i3);
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.onUtyanAnimationEndListener = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(Consumer consumer) {
        this.onUtyanAnimationUpdateListener = consumer;
    }

    public void setType(int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogsEmptyCell.setType(int, boolean):void");
    }

    public void startUtyanCollapseAnimation(boolean z) {
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
        this.utyanAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DialogsEmptyCell.this.lambda$startUtyanCollapseAnimation$4(valueAnimator2);
            }
        });
        this.utyanAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (DialogsEmptyCell.this.onUtyanAnimationEndListener != null) {
                    DialogsEmptyCell.this.onUtyanAnimationEndListener.run();
                }
                if (animator == DialogsEmptyCell.this.utyanAnimator) {
                    DialogsEmptyCell.this.utyanAnimator = null;
                }
            }
        });
        this.utyanAnimator.start();
    }

    public void startUtyanExpandAnimation() {
        ValueAnimator valueAnimator = this.utyanAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.utyanAnimationTriggered = false;
        ValueAnimator duration = ValueAnimator.ofFloat(this.utyanCollapseProgress, 0.0f).setDuration(250L);
        this.utyanAnimator = duration;
        duration.setInterpolator(Easings.easeOutQuad);
        this.utyanAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DialogsEmptyCell.this.lambda$startUtyanExpandAnimation$3(valueAnimator2);
            }
        });
        this.utyanAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (DialogsEmptyCell.this.onUtyanAnimationEndListener != null) {
                    DialogsEmptyCell.this.onUtyanAnimationEndListener.run();
                }
                if (animator == DialogsEmptyCell.this.utyanAnimator) {
                    DialogsEmptyCell.this.utyanAnimator = null;
                }
            }
        });
        this.utyanAnimator.start();
    }

    public void updateLayout() {
        int i;
        int i2 = 0;
        if ((getParent() instanceof View) && (((i = this.currentType) == 2 || i == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i2 = 0 - (getTop() / 2);
        }
        int i3 = this.currentType;
        if (i3 == 0 || i3 == 1) {
            i2 = (int) (i2 - (((int) (ActionBar.getCurrentActionBarHeight() / 2.0f)) * (1.0f - this.utyanCollapseProgress)));
        }
        float f = i2;
        this.imageView.setTranslationY(f);
        this.titleView.setTranslationY(f);
        this.subtitleView.setTranslationY(f);
    }
}
