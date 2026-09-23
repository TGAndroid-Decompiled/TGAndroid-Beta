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
public abstract class d9 extends FrameLayout {
    public float E;
    public final e9 F;
    public long f23325a;
    public TLRPC.Document f23326b;
    public final ai.y5 f23327c;
    public final p20 d;
    public final p20 e;
    public float f23328f;
    public a9 h;
    public boolean f23329n;
    public final PorterDuffColorFilter f23330r;
    public final e6 f23331s;
    public boolean v;
    public float f23332w;
    public float f23333x;
    public float f23334y;

    public d9(e9 e9Var, Context context) {
        super(context);
        this.F = e9Var;
        this.d = new p20();
        this.e = new p20();
        this.f23328f = 1.0f;
        this.f23330r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f23331s = new e6(this, 200L, rr.f27702g);
        this.f23332w = -1.0f;
        ai.y5 y5Var = new ai.y5(this, context, 7);
        this.f23327c = y5Var;
        y5Var.getImageReceiver().setAutoRepeatCount(1);
        y5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f23331s.f23575c;
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
            this.e.d(a9Var2.f22387c, a9Var2.d, a9Var2.e, a9Var2.f22388f);
            this.f23328f = 0.0f;
            this.F.f23613n = true;
        }
        this.h = a9Var;
        this.f23329n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.y5 y5Var = this.f23327c;
        ImageReceiver imageReceiver = y5Var.getImageReceiver();
        q5 q5Var = y5Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27230k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.y5 y5Var = this.f23327c;
        ImageReceiver imageReceiver = y5Var.getImageReceiver();
        q5 q5Var = y5Var.e;
        if (q5Var != null) {
            ai.l4 l4Var = q5Var.f27230k;
            q5Var.setColorFilter(this.f23330r);
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
            ai.y5 y5Var = this.f23327c;
            q5 q5Var = y5Var.e;
            if (q5Var != null && (l4Var = q5Var.f27230k) != null) {
                l4Var.startAnimation();
            }
            y5Var.f29579a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
