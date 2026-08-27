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

public final class t9 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public TextView f32714a;

    public TextView f32715b;

    public ag.p1 f32716c;
    public ag.p1 d;

    public si0 f32717e;

    public ScrollView f32718f;
    public AnimatorSet h;

    public TLRPC.TL_help_appUpdate f32719n;

    public String f32720r;

    public int f32721s;
    public int v;

    public GradientDrawable f32722w;

    public GradientDrawable f32723x;

    public final void a(boolean z10) {
        ag.p1 p1Var = this.d;
        TextView textView = this.f32715b;
        ag.p1 p1Var2 = this.f32716c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        int i10 = 1;
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            p1Var2.setVisibility(0);
            p1Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            p1Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property3, 0.1f), ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property2, 0.1f), ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.h.addListener(new org.telegram.ui.go(i10, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.f32720r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            a(false);
            ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.f32719n.document);
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.f32720r;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            a(false);
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.f32720r;
            if (str6 == null || !str6.equals(str5)) {
                return;
            }
            this.f32717e.e(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f32722w;
        ScrollView scrollView = this.f32718f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f32723x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            NotificationCenter.getInstance(this.f32721s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f32721s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.f32721s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }
}
