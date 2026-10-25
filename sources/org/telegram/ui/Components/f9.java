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
    public long f28090a;
    public TLRPC.Document f28091b;
    public final di.k4 f28092c;
    public final z20 d;
    public final z20 e;
    public float f28093f;
    public c9 h;
    public boolean f28094n;
    public final PorterDuffColorFilter f28095r;
    public final h6 f28096s;
    public boolean v;
    public float f28097w;
    public float f28098x;
    public float f28099y;

    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        this.d = new z20();
        this.e = new z20();
        this.f28093f = 1.0f;
        this.f28095r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f28096s = new h6(this, 200L, ds.f27585g);
        this.f28097w = -1.0f;
        di.k4 k4Var = new di.k4(this, context, 7);
        this.f28092c = k4Var;
        k4Var.getImageReceiver().setAutoRepeatCount(1);
        k4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(k4Var, gb1.i(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f28096s.f28809c;
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
            this.e.d(c9Var2.f27093c, c9Var2.d, c9Var2.e, c9Var2.f27094f);
            this.f28093f = 0.0f;
            this.F.f28493n = true;
        }
        this.h = c9Var;
        this.f28094n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        di.k4 k4Var = this.f28092c;
        ImageReceiver imageReceiver = k4Var.getImageReceiver();
        t5 t5Var = k4Var.e;
        if (t5Var != null) {
            imageReceiver = t5Var.f32849k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        di.k4 k4Var = this.f28092c;
        ImageReceiver imageReceiver = k4Var.getImageReceiver();
        t5 t5Var = k4Var.e;
        if (t5Var != null) {
            di.f3 f3Var = t5Var.f32849k;
            t5Var.setColorFilter(this.f28095r);
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
        di.f3 f3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            di.k4 k4Var = this.f28092c;
            t5 t5Var = k4Var.e;
            if (t5Var != null && (f3Var = t5Var.f32849k) != null) {
                f3Var.startAnimation();
            }
            k4Var.f34981a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
