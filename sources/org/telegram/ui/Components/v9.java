package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class v9 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextView f33327a;
    public TextView f33328b;
    public fh.d2 f33329c;
    public fh.d2 d;
    public qi0 f33330e;
    public ScrollView f33331f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f33332n;
    public String f33333r;
    public int f33334s;
    public int v;
    public GradientDrawable f33335w;
    public GradientDrawable f33336x;

    public final void a(boolean z10) {
        fh.d2 d2Var = this.d;
        TextView textView = this.f33328b;
        fh.d2 d2Var2 = this.f33329c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            d2Var2.setVisibility(0);
            d2Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(d2Var2, property3, 1.0f), ObjectAnimator.ofFloat(d2Var2, property2, 1.0f), ObjectAnimator.ofFloat(d2Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            d2Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(d2Var2, property3, 0.1f), ObjectAnimator.ofFloat(d2Var2, property2, 0.1f), ObjectAnimator.ofFloat(d2Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new u9(0, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.f33333r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.f33332n.document);
            }
        } else if (i9 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.f33333r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i9 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.f33333r;
            if (str6 != null && str6.equals(str5)) {
                this.f33330e.e(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f33335w;
        ScrollView scrollView = this.f33331f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f33336x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 8) {
            NotificationCenter.getInstance(this.f33334s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f33334s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.f33334s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }
}
