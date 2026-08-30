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
    public long f29379a;
    public TLRPC.Document f29380b;
    public final nh.y3 f29381c;
    public final p20 d;
    public final p20 e;
    public float f29382f;
    public s8 h;
    public boolean f29383n;
    public final PorterDuffColorFilter f29384r;
    public final z5 f29385s;
    public boolean v;
    public float f29386w;
    public float f29387x;
    public float f29388y;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.C = w8Var;
        this.d = new p20();
        this.e = new p20();
        this.f29382f = 1.0f;
        this.f29384r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f29385s = new z5(this, 200L, nr.f27347g);
        this.f29386w = -1.0f;
        nh.y3 y3Var = new nh.y3(this, context, 6);
        this.f29381c = y3Var;
        y3Var.getImageReceiver().setAutoRepeatCount(1);
        y3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y3Var, k7.b6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f29385s.f31241c;
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
            this.e.d(s8Var2.f28667c, s8Var2.d, s8Var2.e, s8Var2.f28668f);
            this.f29382f = 0.0f;
            this.C.f30269n = true;
        }
        this.h = s8Var;
        this.f29383n = z4;
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
        nh.y3 y3Var = this.f29381c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var != null) {
            imageReceiver = l5Var.f26569k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        nh.y3 y3Var = this.f29381c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var != null) {
            nh.y2 y2Var = l5Var.f26569k;
            l5Var.setColorFilter(this.f29384r);
            return y2Var;
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
        nh.y2 y2Var;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        if (z4) {
            nh.y3 y3Var = this.f29381c;
            l5 l5Var = y3Var.e;
            if (l5Var != null && (y2Var = l5Var.f26569k) != null) {
                y2Var.startAnimation();
            }
            y3Var.f27785a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
