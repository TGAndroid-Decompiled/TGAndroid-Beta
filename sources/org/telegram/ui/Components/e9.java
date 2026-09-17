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
public abstract class e9 extends FrameLayout {
    public float E;
    public final f9 F;
    public long f25606a;
    public TLRPC.Document f25607b;
    public final bi.i5 f25608c;
    public final o20 d;
    public final o20 f25609e;
    public float f25610f;
    public b9 h;
    public boolean f25611n;
    public final PorterDuffColorFilter f25612r;
    public final e6 f25613s;
    public boolean v;
    public float f25614w;
    public float f25615x;
    public float f25616y;

    public e9(f9 f9Var, Context context) {
        super(context);
        this.F = f9Var;
        this.d = new o20();
        this.f25609e = new o20();
        this.f25610f = 1.0f;
        this.f25612r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f25613s = new e6(this, 200L, pr.f29468g);
        this.f25614w = -1.0f;
        bi.i5 i5Var = new bi.i5(this, context, 7);
        this.f25608c = i5Var;
        i5Var.getImageReceiver().setAutoRepeatCount(1);
        i5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(i5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f25613s.f25566c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(b9 b9Var, boolean z10) {
        b9 b9Var2 = this.h;
        if (b9Var2 != null) {
            this.f25609e.d(b9Var2.f24602c, b9Var2.d, b9Var2.f24603e, b9Var2.f24604f);
            this.f25610f = 0.0f;
            this.F.f25972n = true;
        }
        this.h = b9Var;
        this.f25611n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        bi.i5 i5Var = this.f25608c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.f32480e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29585k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        bi.i5 i5Var = this.f25608c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.f32480e;
        if (q5Var != null) {
            bi.y3 y3Var = q5Var.f29585k;
            q5Var.setColorFilter(this.f25612r);
            return y3Var;
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
        bi.y3 y3Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            bi.i5 i5Var = this.f25608c;
            q5 q5Var = i5Var.f32480e;
            if (q5Var != null && (y3Var = q5Var.f29585k) != null) {
                y3Var.startAnimation();
            }
            i5Var.f32477a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
