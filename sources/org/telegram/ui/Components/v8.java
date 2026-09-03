package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class v8 extends FrameLayout {
    public float B;
    public final w8 C;
    public long f31818a;
    public TLRPC.Document f31819b;
    public final oh.a4 f31820c;
    public final q20 d;
    public final q20 f31821e;
    public float f31822f;
    public s8 h;
    public boolean f31823n;
    public final PorterDuffColorFilter f31824r;
    public final z5 f31825s;
    public boolean v;
    public float f31826w;
    public float f31827x;
    public float f31828y;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.C = w8Var;
        this.d = new q20();
        this.f31821e = new q20();
        this.f31822f = 1.0f;
        this.f31824r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f31825s = new z5(this, 200L, pr.f30169g);
        this.f31826w = -1.0f;
        oh.a4 a4Var = new oh.a4(this, context, 6);
        this.f31820c = a4Var;
        a4Var.getImageReceiver().setAutoRepeatCount(1);
        a4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(a4Var, k7.c6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f31825s.f33763c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f12, 0.0f, f14);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(s8 s8Var, boolean z4) {
        s8 s8Var2 = this.h;
        if (s8Var2 != null) {
            this.f31821e.d(s8Var2.f31002c, s8Var2.d, s8Var2.f31003e, s8Var2.f31004f);
            this.f31822f = 0.0f;
            this.C.f32680n = true;
        }
        this.h = s8Var;
        this.f31823n = z4;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v8.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        oh.a4 a4Var = this.f31820c;
        ImageReceiver imageReceiver = a4Var.getImageReceiver();
        l5 l5Var = a4Var.f30014e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28637k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        oh.a4 a4Var = this.f31820c;
        ImageReceiver imageReceiver = a4Var.getImageReceiver();
        l5 l5Var = a4Var.f30014e;
        if (l5Var != null) {
            oh.z2 z2Var = l5Var.f28637k;
            l5Var.setColorFilter(this.f31824r);
            return z2Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.C.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.C.R) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z4) {
        oh.z2 z2Var;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        if (z4) {
            oh.a4 a4Var = this.f31820c;
            l5 l5Var = a4Var.f30014e;
            if (l5Var != null && (z2Var = l5Var.f28637k) != null) {
                z2Var.startAnimation();
            }
            a4Var.f30011a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
