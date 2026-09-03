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
    public long f29398a;
    public TLRPC.Document f29399b;
    public final nh.y3 f29400c;
    public final q20 d;
    public final q20 e;
    public float f29401f;
    public s8 h;
    public boolean f29402n;
    public final PorterDuffColorFilter f29403r;
    public final z5 f29404s;
    public boolean v;
    public float f29405w;
    public float f29406x;
    public float f29407y;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.C = w8Var;
        this.d = new q20();
        this.e = new q20();
        this.f29401f = 1.0f;
        this.f29403r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f29404s = new z5(this, 200L, mr.f27123g);
        this.f29405w = -1.0f;
        nh.y3 y3Var = new nh.y3(this, context, 6);
        this.f29400c = y3Var;
        y3Var.getImageReceiver().setAutoRepeatCount(1);
        y3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y3Var, k7.b6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f29404s.f31253c;
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
            this.e.d(s8Var2.f28692c, s8Var2.d, s8Var2.e, s8Var2.f28693f);
            this.f29401f = 0.0f;
            this.C.f30177n = true;
        }
        this.h = s8Var;
        this.f29402n = z4;
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
        nh.y3 y3Var = this.f29400c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var != null) {
            imageReceiver = l5Var.f26587k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        nh.y3 y3Var = this.f29400c;
        ImageReceiver imageReceiver = y3Var.getImageReceiver();
        l5 l5Var = y3Var.e;
        if (l5Var != null) {
            nh.y2 y2Var = l5Var.f26587k;
            l5Var.setColorFilter(this.f29403r);
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
            nh.y3 y3Var = this.f29400c;
            l5 l5Var = y3Var.e;
            if (l5Var != null && (y2Var = l5Var.f26587k) != null) {
                y2Var.startAnimation();
            }
            y3Var.f27801a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
