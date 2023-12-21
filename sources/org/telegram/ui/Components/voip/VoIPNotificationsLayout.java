package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
public class VoIPNotificationsLayout extends LinearLayout {
    boolean lockAnimation;
    Runnable onViewsUpdated;
    TransitionSet transitionSet;
    ArrayList<NotificationView> viewToAdd;
    ArrayList<NotificationView> viewToRemove;
    HashMap<String, NotificationView> viewsByTag;
    boolean wasChanged;

    public VoIPNotificationsLayout(Context context) {
        super(context);
        this.viewsByTag = new HashMap<>();
        this.viewToAdd = new ArrayList<>();
        this.viewToRemove = new ArrayList<>();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            this.transitionSet = transitionSet;
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new Visibility(this) {
                @Override
                public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    view.setAlpha(0.0f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getMeasuredHeight(), 0.0f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                }
            }.setDuration(200L));
            this.transitionSet.setOrdering(0);
        }
    }

    public void addNotification(int i, String str, String str2, boolean z) {
        if (this.viewsByTag.get(str2) != null) {
            return;
        }
        NotificationView notificationView = new NotificationView(getContext());
        notificationView.tag = str2;
        notificationView.iconView.setImageResource(i);
        notificationView.textView.setText(str);
        this.viewsByTag.put(str2, notificationView);
        if (z) {
            notificationView.startAnimation();
        }
        if (this.lockAnimation) {
            this.viewToAdd.add(notificationView);
            return;
        }
        this.wasChanged = true;
        addView(notificationView, LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
    }

    public void removeNotification(String str) {
        NotificationView remove = this.viewsByTag.remove(str);
        if (remove != null) {
            if (this.lockAnimation) {
                if (this.viewToAdd.remove(remove)) {
                    return;
                }
                this.viewToRemove.add(remove);
                return;
            }
            this.wasChanged = true;
            removeView(remove);
        }
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

    public void lambda$lock$0() {
        this.lockAnimation = false;
        runDelayed();
    }

    private void runDelayed() {
        if (this.viewToAdd.isEmpty() && this.viewToRemove.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19 && getParent() != null) {
            TransitionManager.beginDelayedTransition(this, this.transitionSet);
        }
        int i = 0;
        while (i < this.viewToAdd.size()) {
            NotificationView notificationView = this.viewToAdd.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= this.viewToRemove.size()) {
                    break;
                } else if (notificationView.tag.equals(this.viewToRemove.get(i2).tag)) {
                    this.viewToAdd.remove(i);
                    this.viewToRemove.remove(i2);
                    i--;
                    break;
                } else {
                    i2++;
                }
            }
            i++;
        }
        for (int i3 = 0; i3 < this.viewToAdd.size(); i3++) {
            addView(this.viewToAdd.get(i3), LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
        }
        for (int i4 = 0; i4 < this.viewToRemove.size(); i4++) {
            removeView(this.viewToRemove.get(i4));
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

    public void beforeLayoutChanges() {
        this.wasChanged = false;
        if (this.lockAnimation || Build.VERSION.SDK_INT < 19 || getParent() == null) {
            return;
        }
        TransitionManager.beginDelayedTransition(this, this.transitionSet);
    }

    public void animateLayoutChanges() {
        if (this.wasChanged) {
            lock();
        }
        this.wasChanged = false;
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return (childCount > 0 ? AndroidUtilities.dp(16.0f) : 0) + (childCount * AndroidUtilities.dp(32.0f));
    }

    public static class NotificationView extends FrameLayout {
        ImageView iconView;
        public String tag;
        TextView textView;

        public NotificationView(Context context) {
            super(context);
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.iconView = new ImageView(context);
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), ColorUtils.setAlphaComponent(-16777216, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu)));
            addView(this.iconView, LayoutHelper.createFrame(24, 24.0f, 0, 10.0f, 4.0f, 10.0f, 4.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(-1);
            this.textView.setTextSize(1, 14.0f);
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 16, 44.0f, 4.0f, 16.0f, 4.0f));
        }

        public void startAnimation() {
            this.textView.setVisibility(8);
            postDelayed(new Runnable() {
                @Override
                public final void run() {
                    VoIPNotificationsLayout.NotificationView.this.lambda$startAnimation$0();
                }
            }, 400L);
        }

        public void lambda$startAnimation$0() {
            if (Build.VERSION.SDK_INT >= 19) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade(1).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L));
                transitionSet.setOrdering(0);
                ViewParent parent = getParent();
                if (parent != null) {
                    TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                }
            }
            this.textView.setVisibility(0);
        }
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.onViewsUpdated = runnable;
    }
}
