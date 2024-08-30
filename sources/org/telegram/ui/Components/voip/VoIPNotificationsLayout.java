package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.StaticLayoutEx;

public class VoIPNotificationsLayout extends LinearLayout {
    VoIPBackgroundProvider backgroundProvider;
    boolean lockAnimation;
    Runnable onViewsUpdated;
    TextPaint textPaint;
    TransitionSet transitionSet;
    ArrayList viewToAdd;
    ArrayList viewToRemove;
    HashMap viewsByTag;
    boolean wasChanged;

    public static class NotificationView extends FrameLayout {
        private final VoIPBackgroundProvider backgroundProvider;
        private final RectF bgRect;
        ImageView iconView;
        boolean ignoreShader;
        public String tag;
        TextView textView;

        public NotificationView(Context context, VoIPBackgroundProvider voIPBackgroundProvider, int i) {
            super(context);
            this.bgRect = new RectF();
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.backgroundProvider = voIPBackgroundProvider;
            voIPBackgroundProvider.attach(this);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(-1);
            this.textView.setTextSize(1, 14.0f);
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 16, i == 0 ? 14.0f : 36.0f, 2.0f, 14.0f, 2.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.bgRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.backgroundProvider.setDarkTranslation(getX() + ((View) getParent()).getX(), getY() + ((View) getParent()).getY());
            int alpha = this.backgroundProvider.getDarkPaint(this.ignoreShader).getAlpha();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
            this.backgroundProvider.getDarkPaint(this.ignoreShader).setAlpha(255);
            canvas.drawRoundRect(this.bgRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.backgroundProvider.getDarkPaint(this.ignoreShader));
            this.backgroundProvider.getDarkPaint(this.ignoreShader).setAlpha(alpha);
            if (this.backgroundProvider.isReveal()) {
                int alpha2 = this.backgroundProvider.getRevealDarkPaint().getAlpha();
                this.backgroundProvider.getRevealDarkPaint().setAlpha(255);
                canvas.drawRoundRect(this.bgRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.backgroundProvider.getRevealDarkPaint());
                this.backgroundProvider.getRevealDarkPaint().setAlpha(alpha2);
            }
            canvas.restore();
            super.dispatchDraw(canvas);
        }

        public void setText(CharSequence charSequence) {
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
            StaticLayout createStaticLayout = StaticLayoutEx.createStaticLayout(charSequence, this.textView.getPaint(), dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp, 10);
            int i = 0;
            for (int i2 = 0; i2 < createStaticLayout.getLineCount(); i2++) {
                i = (int) Math.max(i, Math.ceil(createStaticLayout.getLineWidth(i2)));
            }
            this.textView.setMaxWidth(i);
            this.textView.setText(charSequence);
        }
    }

    public VoIPNotificationsLayout(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.viewsByTag = new HashMap();
        this.viewToAdd = new ArrayList();
        this.viewToRemove = new ArrayList();
        this.textPaint = new TextPaint();
        setOrientation(1);
        this.backgroundProvider = voIPBackgroundProvider;
        TransitionSet transitionSet = new TransitionSet();
        this.transitionSet = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new Visibility() {
            @Override
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                view.setAlpha(0.0f);
                view.setScaleY(0.6f);
                view.setScaleX(0.6f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f));
                animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK);
                return animatorSet;
            }

            @Override
            public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (view instanceof NotificationView) {
                    ((NotificationView) view).ignoreShader = true;
                }
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.6f));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }
        }.setDuration(200L));
        this.transitionSet.setOrdering(0);
        this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
    }

    public void lambda$lock$0() {
        this.lockAnimation = false;
        runDelayed();
    }

    private void lock() {
        this.lockAnimation = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPNotificationsLayout.this.lambda$lock$0();
            }
        }, 700L);
    }

    private void runDelayed() {
        if (this.viewToAdd.isEmpty() && this.viewToRemove.isEmpty()) {
            return;
        }
        if (getParent() != null) {
            TransitionManager.beginDelayedTransition(this, this.transitionSet);
        }
        int i = 0;
        while (i < this.viewToAdd.size()) {
            NotificationView notificationView = (NotificationView) this.viewToAdd.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= this.viewToRemove.size()) {
                    break;
                }
                if (notificationView.tag.equals(((NotificationView) this.viewToRemove.get(i2)).tag)) {
                    this.viewToAdd.remove(i);
                    this.viewToRemove.remove(i2);
                    i--;
                    break;
                }
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < this.viewToAdd.size(); i3++) {
            addView((View) this.viewToAdd.get(i3), LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
        }
        for (int i4 = 0; i4 < this.viewToRemove.size(); i4++) {
            removeView((View) this.viewToRemove.get(i4));
        }
        this.viewsByTag.clear();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            NotificationView notificationView2 = (NotificationView) getChildAt(i5);
            this.viewsByTag.put(notificationView2.tag, notificationView2);
        }
        this.viewToAdd.clear();
        this.viewToRemove.clear();
        lock();
        Runnable runnable = this.onViewsUpdated;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addNotification(int i, String str, String str2, boolean z) {
        if (this.viewsByTag.get(str2) != null) {
            return;
        }
        NotificationView notificationView = new NotificationView(getContext(), this.backgroundProvider, i);
        notificationView.tag = str2;
        notificationView.setText(str);
        notificationView.iconView.setImageResource(i);
        this.viewsByTag.put(str2, notificationView);
        if (this.lockAnimation) {
            this.viewToAdd.add(notificationView);
        } else {
            this.wasChanged = true;
            addView(notificationView, LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public void animateLayoutChanges() {
        if (this.wasChanged) {
            lock();
        }
        this.wasChanged = false;
    }

    public void beforeLayoutChanges() {
        this.wasChanged = false;
        if (this.lockAnimation || getParent() == null) {
            return;
        }
        TransitionManager.beginDelayedTransition(this, this.transitionSet);
    }

    public CharSequence ellipsize(CharSequence charSequence) {
        return charSequence == null ? "" : TextUtils.ellipsize(charSequence, this.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return (childCount > 0 ? AndroidUtilities.dp(16.0f) : 0) + (childCount * AndroidUtilities.dp(32.0f));
    }

    public void removeNotification(String str) {
        NotificationView notificationView = (NotificationView) this.viewsByTag.remove(str);
        this.backgroundProvider.detach(notificationView);
        if (notificationView != null) {
            if (!this.lockAnimation) {
                this.wasChanged = true;
                removeView(notificationView);
            } else {
                if (this.viewToAdd.remove(notificationView)) {
                    return;
                }
                this.viewToRemove.add(notificationView);
            }
        }
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.onViewsUpdated = runnable;
    }
}
