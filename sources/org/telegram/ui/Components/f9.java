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
public abstract class f9 extends FrameLayout {
    public float E;
    public final g9 F;
    public long f26292a;
    public TLRPC.Document f26293b;
    public final ai.z5 f26294c;
    public final g30 d;
    public final g30 f26295e;
    public float f26296f;
    public c9 h;
    public boolean f26297n;
    public final PorterDuffColorFilter f26298r;
    public final g6 f26299s;
    public boolean v;
    public float f26300w;
    public float f26301x;
    public float f26302y;

    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        this.d = new g30();
        this.f26295e = new g30();
        this.f26296f = 1.0f;
        this.f26298r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f26299s = new g6(this, 200L, is.f27452g);
        this.f26300w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f26294c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f26299s.f26613c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(c9 c9Var, boolean z10) {
        c9 c9Var2 = this.h;
        if (c9Var2 != null) {
            this.f26295e.d(c9Var2.f25149c, c9Var2.d, c9Var2.f25150e, c9Var2.f25151f);
            this.f26296f = 0.0f;
            this.F.f26640n = true;
        }
        this.h = c9Var;
        this.f26297n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.z5 z5Var = this.f26294c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f33133e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30634k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f26294c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f33133e;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30634k;
            s5Var.setColorFilter(this.f26298r);
            return m4Var;
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
        ai.m4 m4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ai.z5 z5Var = this.f26294c;
            s5 s5Var = z5Var.f33133e;
            if (s5Var != null && (m4Var = s5Var.f30634k) != null) {
                m4Var.startAnimation();
            }
            z5Var.f33130a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
