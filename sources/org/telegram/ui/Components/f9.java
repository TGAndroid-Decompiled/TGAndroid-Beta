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
    public long f25973a;
    public TLRPC.Document f25974b;
    public final ai.z5 f25975c;
    public final i30 d;
    public final i30 f25976e;
    public float f25977f;
    public c9 h;
    public boolean f25978n;
    public final PorterDuffColorFilter f25979r;
    public final g6 f25980s;
    public boolean v;
    public float f25981w;
    public float f25982x;
    public float f25983y;

    public f9(g9 g9Var, Context context) {
        super(context);
        this.F = g9Var;
        this.d = new i30();
        this.f25976e = new i30();
        this.f25977f = 1.0f;
        this.f25979r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f25980s = new g6(this, 200L, js.f27635g);
        this.f25981w = -1.0f;
        ai.z5 z5Var = new ai.z5(this, context, 7);
        this.f25975c = z5Var;
        z5Var.getImageReceiver().setAutoRepeatCount(1);
        z5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z5Var, w7.w5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f25980s.f26301c;
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
            this.f25976e.d(c9Var2.f24856c, c9Var2.d, c9Var2.f24857e, c9Var2.f24858f);
            this.f25977f = 0.0f;
            this.F.f26355n = true;
        }
        this.h = c9Var;
        this.f25978n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        ai.z5 z5Var = this.f25975c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f32997e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30402k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.z5 z5Var = this.f25975c;
        ImageReceiver imageReceiver = z5Var.getImageReceiver();
        s5 s5Var = z5Var.f32997e;
        if (s5Var != null) {
            ai.m4 m4Var = s5Var.f30402k;
            s5Var.setColorFilter(this.f25979r);
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
            ai.z5 z5Var = this.f25975c;
            s5 s5Var = z5Var.f32997e;
            if (s5Var != null && (m4Var = s5Var.f30402k) != null) {
                m4Var.startAnimation();
            }
            z5Var.f32994a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
