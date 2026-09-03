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
    public TextView f29410a;
    public TextView f29411b;
    public dg.u2 f29412c;
    public dg.u2 d;
    public kj0 e;
    public ScrollView f29413f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f29414n;
    public String f29415r;
    public int f29416s;
    public int v;
    public GradientDrawable f29417w;
    public GradientDrawable f29418x;

    public final void a(boolean z4) {
        dg.u2 u2Var = this.d;
        TextView textView = this.f29411b;
        dg.u2 u2Var2 = this.f29412c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z4) {
            u2Var2.setVisibility(0);
            u2Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(u2Var2, property3, 1.0f), ObjectAnimator.ofFloat(u2Var2, property2, 1.0f), ObjectAnimator.ofFloat(u2Var2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            u2Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(u2Var2, property3, 0.1f), ObjectAnimator.ofFloat(u2Var2, property2, 0.1f), ObjectAnimator.ofFloat(u2Var2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new dg.w2(22, this, z4));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.f29415r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.f29414n.document);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.f29415r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.f29415r;
            if (str6 != null && str6.equals(str5)) {
                this.e.e(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f29417w;
        ScrollView scrollView = this.f29413f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f29418x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            NotificationCenter.getInstance(this.f29416s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f29416s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.f29416s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }
}
