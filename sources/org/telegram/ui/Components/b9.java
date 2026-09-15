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
    public long f22711a;
    public TLRPC.Document f22712b;
    public final ai.z5 f22713c;
    public final o20 d;
    public final o20 e;
    public float f22714f;
    public y8 h;
    public boolean f22715n;
    public final PorterDuffColorFilter f22716r;
    public final c6 f22717s;
    public boolean v;
    public float f22718w;
    public float f22719x;
    public float f22720y;

    public b9(c9 c9Var, Context context) {
        super(context);
        this.F = c9Var;
        this.d = new o20();
        this.e = new o20();
        this.f22714f = 1.0f;
        this.f22716r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f22717s = new c6(this, 200L, qr.f27424g);
        this.f22718w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f22713c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f22717s.f22953c;
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
            this.e.d(y8Var2.f30175c, y8Var2.d, y8Var2.e, y8Var2.f30176f);
            this.f22714f = 0.0f;
            this.F.f22987n = true;
        }
        this.h = y8Var;
        this.f22715n = z10;
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
        ai.z5 z5Var = this.f22713c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var != null) {
            imageReceiver = o5Var.f26692k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f22713c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        o5 o5Var = z5Var.e;
        if (o5Var != null) {
            ai.l4 l4Var = o5Var.f26692k;
            o5Var.setColorFilter(this.f22716r);
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
            ai.z5 z5Var = this.f22713c;
            o5 o5Var = z5Var.e;
            if (o5Var != null && (l4Var = o5Var.f26692k) != null) {
                l4Var.startAnimation();
            }
            z5Var.f28314a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
