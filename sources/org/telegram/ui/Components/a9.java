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
public abstract class a9 extends FrameLayout {
    public float A;
    public final b9 B;
    public long f26707a;
    public TLRPC.Document f26708b;
    public final lh.y3 f26709c;
    public final k20 d;
    public final k20 f26710e;
    public float f26711f;
    public x8 h;
    public boolean f26712n;
    public final PorterDuffColorFilter f26713r;
    public final d6 f26714s;
    public boolean v;
    public float f26715w;
    public float f26716x;
    public float f26717y;

    public a9(b9 b9Var, Context context) {
        super(context);
        this.B = b9Var;
        this.d = new k20();
        this.f26710e = new k20();
        this.f26711f = 1.0f;
        this.f26713r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f26714s = new d6(this, 200L, jr.f29801g);
        this.f26715w = -1.0f;
        lh.y3 y3Var = new lh.y3(this, context, 6);
        this.f26709c = y3Var;
        y3Var.getImageReceiver().setAutoRepeatCount(1);
        y3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y3Var, i7.f6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f9, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f26714s.f27666c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f9, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9 - f12, f10 - f12, f9 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(x8 x8Var, boolean z10) {
        x8 x8Var2 = this.h;
        if (x8Var2 != null) {
            this.f26710e.d(x8Var2.f34650c, x8Var2.d, x8Var2.f34651e, x8Var2.f34652f);
            this.f26711f = 0.0f;
            this.B.f27008n = true;
        }
        this.h = x8Var;
        this.f26712n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        lh.y3 y3Var = this.f26709c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        p5 p5Var = y3Var.f32906e;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        lh.y3 y3Var = this.f26709c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        p5 p5Var = y3Var.f32906e;
        if (p5Var != null) {
            lh.x2 x2Var = p5Var.f31593k;
            p5Var.setColorFilter(this.f26713r);
            return x2Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.B.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.B.Q) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        lh.x2 x2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            lh.y3 y3Var = this.f26709c;
            p5 p5Var = y3Var.f32906e;
            if (p5Var != null && (x2Var = p5Var.f31593k) != null) {
                x2Var.startAnimation();
            }
            y3Var.f32903a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
