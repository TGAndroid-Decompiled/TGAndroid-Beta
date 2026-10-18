package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class d9 extends FrameLayout {
    public float E;
    public final e9 F;
    public long f25514a;
    public TLRPC.Document f25515b;
    public final ci.j4 f25516c;
    public final x20 d;
    public final x20 e;
    public float f25517f;
    public a9 h;
    public boolean f25518n;
    public final PorterDuffColorFilter f25519r;
    public final f6 f25520s;
    public boolean v;
    public float f25521w;
    public float f25522x;
    public float f25523y;

    public d9(e9 e9Var, Context context) {
        super(context);
        this.F = e9Var;
        this.d = new x20();
        this.e = new x20();
        this.f25517f = 1.0f;
        this.f25519r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f25520s = new f6(this, 200L, bs.f25031g);
        this.f25521w = -1.0f;
        ci.j4 j4Var = new ci.j4(this, context, 7);
        this.f25516c = j4Var;
        j4Var.getImageReceiver().setAutoRepeatCount(1);
        j4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(j4Var, w7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f25520s.f26093c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(a9 a9Var, boolean z10) {
        a9 a9Var2 = this.h;
        if (a9Var2 != null) {
            this.e.d(a9Var2.f24543c, a9Var2.d, a9Var2.e, a9Var2.f24544f);
            this.f25517f = 0.0f;
            this.F.f25880n = true;
        }
        this.h = a9Var;
        this.f25518n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ci.j4 j4Var = this.f25516c;
        ImageReceiver imageReceiver = j4Var.getImageReceiver();
        r5 r5Var = j4Var.e;
        if (r5Var != null) {
            imageReceiver = r5Var.f29842k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ci.j4 j4Var = this.f25516c;
        ImageReceiver imageReceiver = j4Var.getImageReceiver();
        r5 r5Var = j4Var.e;
        if (r5Var != null) {
            ci.f3 f3Var = r5Var.f29842k;
            r5Var.setColorFilter(this.f25519r);
            return f3Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.F.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.F.U) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        ci.f3 f3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ci.j4 j4Var = this.f25516c;
            r5 r5Var = j4Var.e;
            if (r5Var != null && (f3Var = r5Var.f29842k) != null) {
                f3Var.startAnimation();
            }
            j4Var.f32033a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
