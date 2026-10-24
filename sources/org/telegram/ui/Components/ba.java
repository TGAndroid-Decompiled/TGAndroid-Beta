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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ba extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public TextView f24942a;
    public TextView f24943b;
    public ah.x f24944c;
    public ah.x d;
    public bk0 e;
    public ScrollView f24945f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f24946n;
    public String f24947r;
    public int f24948s;
    public int v;
    public GradientDrawable f24949w;
    public GradientDrawable f24950x;
    public boolean f24951y;

    public final void a(boolean z10) {
        ah.x xVar = this.d;
        TextView textView = this.f24943b;
        ah.x xVar2 = this.f24944c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            xVar2.setVisibility(0);
            xVar.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, property3, 0.1f), ObjectAnimator.ofFloat(textView, property2, 0.1f), ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(xVar2, property3, 1.0f), ObjectAnimator.ofFloat(xVar2, property2, 1.0f), ObjectAnimator.ofFloat(xVar2, property, 1.0f));
        } else {
            textView.setVisibility(0);
            xVar.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(xVar2, property3, 0.1f), ObjectAnimator.ofFloat(xVar2, property2, 0.1f), ObjectAnimator.ofFloat(xVar2, property, 0.0f), ObjectAnimator.ofFloat(textView, property3, 1.0f), ObjectAnimator.ofFloat(textView, property2, 1.0f), ObjectAnimator.ofFloat(textView, property, 1.0f));
        }
        this.h.addListener(new org.telegram.ui.ho(1, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.f24947r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.f24946n.document);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.f24947r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.f24947r;
            if (str6 != null && str6.equals(str5)) {
                this.e.e(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f24949w;
        ScrollView scrollView = this.f24945f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f24950x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            NotificationCenter.getInstance(this.f24948s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f24948s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.f24948s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }

    @Override
    public final void updateColors() {
        boolean z10;
        boolean z11;
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.f24950x;
        GradientDrawable gradientDrawable2 = this.f24949w;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false);
            if (this.f24951y) {
                if (x03 != this.E) {
                }
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21463s8, false);
                scrollView = this.f24945f;
                if (scrollView != null && (!this.f24951y || x02 != this.F)) {
                    this.F = x02;
                    AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, x02);
                }
                this.f24951y = true;
                invalidate();
            }
            this.E = x03;
            if (gradientDrawable2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                gradientDrawable2.setColors(new int[]{x03, 0});
            }
            if (gradientDrawable != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                gradientDrawable.setColors(new int[]{x03, 0});
            }
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21463s8, false);
            scrollView = this.f24945f;
            if (scrollView != null) {
                this.F = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, x02);
            }
            this.f24951y = true;
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
