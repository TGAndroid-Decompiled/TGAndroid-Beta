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
public final class da extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public TextView f25537a;
    public TextView f25538b;
    public ah.x f25539c;
    public ah.x d;
    public yj0 e;
    public ScrollView f25540f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate f25541n;
    public String f25542r;
    public int f25543s;
    public int v;
    public GradientDrawable f25544w;
    public GradientDrawable f25545x;

    public final void a(boolean z10) {
        ah.x xVar = this.d;
        TextView textView = this.f25538b;
        ah.x xVar2 = this.f25539c;
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
            String str2 = this.f25542r;
            if (str2 != null && str2.equals(str)) {
                a(false);
                ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.f25541n.document);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.f25542r;
            if (str4 != null && str4.equals(str3)) {
                a(false);
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.f25542r;
            if (str6 != null && str6.equals(str5)) {
                this.e.e(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.f25544w;
        ScrollView scrollView = this.f25540f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.f25545x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            NotificationCenter.getInstance(this.f25543s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f25543s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.f25543s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }
}
