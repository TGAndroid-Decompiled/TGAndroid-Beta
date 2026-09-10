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
public abstract class c9 extends FrameLayout {
    public float E;
    public final d9 F;
    public long f22044a;
    public TLRPC.Document f22045b;
    public final gg.i1 f22046c;
    public final x20 d;
    public final x20 e;
    public float f22047f;
    public z8 h;
    public boolean f22048n;
    public final PorterDuffColorFilter f22049r;
    public final d6 f22050s;
    public boolean v;
    public float f22051w;
    public float f22052x;
    public float f22053y;

    public c9(d9 d9Var, Context context) {
        super(context);
        this.F = d9Var;
        this.d = new x20();
        this.e = new x20();
        this.f22047f = 1.0f;
        this.f22049r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f22050s = new d6(this, 200L, wr.f28820g);
        this.f22051w = -1.0f;
        gg.i1 i1Var = new gg.i1(this, context, 6);
        this.f22046c = i1Var;
        i1Var.getImageReceiver().setAutoRepeatCount(1);
        i1Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(i1Var, w7.a6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f22050s.f22295c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(z8 z8Var, boolean z10) {
        z8 z8Var2 = this.h;
        if (z8Var2 != null) {
            this.e.d(z8Var2.f29615c, z8Var2.d, z8Var2.e, z8Var2.f29616f);
            this.f22047f = 0.0f;
            this.F.f22331n = true;
        }
        this.h = z8Var;
        this.f22048n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        gg.i1 i1Var = this.f22046c;
        ImageReceiver imageReceiver = i1Var.getImageReceiver();
        p5 p5Var = i1Var.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        gg.i1 i1Var = this.f22046c;
        ImageReceiver imageReceiver = i1Var.getImageReceiver();
        p5 p5Var = i1Var.e;
        if (p5Var != null) {
            gg.h1 h1Var = p5Var.f26033k;
            p5Var.setColorFilter(this.f22049r);
            return h1Var;
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
        gg.h1 h1Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            gg.i1 i1Var = this.f22046c;
            p5 p5Var = i1Var.e;
            if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
                h1Var.startAnimation();
            }
            i1Var.f28728a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
