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
    public long f26306a;
    public TLRPC.Document f26307b;
    public final ai.z5 f26308c;
    public final f30 d;
    public final f30 f26309e;
    public float f26310f;
    public c9 h;
    public boolean f26311n;
    public final PorterDuffColorFilter f26312r;
    public final g6 f26313s;
    public boolean v;
    public float f26314w;
    public float f26315x;
    public float f26316y;

    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        this.d = new f30();
        this.f26309e = new f30();
        this.f26310f = 1.0f;
        this.f26312r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f26313s = new g6(this, 200L, hs.f27119g);
        this.f26314w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f26308c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f26313s.f26599c;
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
            this.f26309e.d(c9Var2.f25294c, c9Var2.d, c9Var2.f25295e, c9Var2.f25296f);
            this.f26310f = 0.0f;
            this.F.f26630n = true;
        }
        this.h = c9Var;
        this.f26311n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.z5 z5Var = this.f26308c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f33159e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30654k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f26308c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f33159e;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30654k;
            s5Var.setColorFilter(this.f26312r);
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
            ai.z5 z5Var = this.f26308c;
            s5 s5Var = z5Var.f33159e;
            if (s5Var != null && (m4Var = s5Var.f30654k) != null) {
                m4Var.startAnimation();
            }
            z5Var.f33156a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
