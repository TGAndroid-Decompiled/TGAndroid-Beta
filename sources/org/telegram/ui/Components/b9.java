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
public abstract class b9 extends FrameLayout {
    public float E;
    public final c9 F;
    public long f22662a;
    public TLRPC.Document f22663b;
    public final ai.z5 f22664c;
    public final o20 d;
    public final o20 e;
    public float f22665f;
    public y8 h;
    public boolean f22666n;
    public final PorterDuffColorFilter f22667r;
    public final c6 f22668s;
    public boolean v;
    public float f22669w;
    public float f22670x;
    public float f22671y;

    public b9(c9 c9Var, Context context) {
        super(context);
        this.F = c9Var;
        this.d = new o20();
        this.e = new o20();
        this.f22665f = 1.0f;
        this.f22667r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f22668s = new c6(this, 200L, qr.f27384g);
        this.f22669w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f22664c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f22668s.f22940c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(y8 y8Var, boolean z10) {
        y8 y8Var2 = this.h;
        if (y8Var2 != null) {
            this.e.d(y8Var2.f30143c, y8Var2.d, y8Var2.e, y8Var2.f30144f);
            this.f22665f = 0.0f;
            this.F.f22972n = true;
        }
        this.h = y8Var;
        this.f22666n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.z5 z5Var = this.f22664c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.f26639k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f22664c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var != null) {
            ai.l4 l4Var = o5Var.f26639k;
            o5Var.setColorFilter(this.f22667r);
            return l4Var;
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
        ai.l4 l4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ai.z5 z5Var = this.f22664c;
            o5 o5Var = z5Var.e;
            if (o5Var != null && (l4Var = o5Var.f26639k) != null) {
                l4Var.startAnimation();
            }
            z5Var.f28304a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
