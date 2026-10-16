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
public abstract class g9 extends FrameLayout {
    public float E;
    public final h9 F;
    public long f24920a;
    public TLRPC.Document f24921b;
    public final bi.k5 f24922c;
    public final b30 d;
    public final b30 e;
    public float f24923f;
    public d9 h;
    public boolean f24924n;
    public final PorterDuffColorFilter f24925r;
    public final g6 f24926s;
    public boolean v;
    public float f24927w;
    public float f24928x;
    public float f24929y;

    public g9(h9 h9Var, Context context) {
        super(context);
        this.F = h9Var;
        this.d = new b30();
        this.e = new b30();
        this.f24923f = 1.0f;
        this.f24925r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f24926s = new g6(this, 200L, es.f24466g);
        this.f24927w = -1.0f;
        bi.k5 k5Var = new bi.k5(this, context, 7);
        this.f24922c = k5Var;
        k5Var.getImageReceiver().setAutoRepeatCount(1);
        k5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(k5Var, w7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f24926s.f24885c;
        if (f13 == 0.0f) {
            canvas.drawCircle(f7, f10, f12, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f11, 0.0f, f13);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7 - f12, f10 - f12, f7 + f12, f10 + f12);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(d9 d9Var, boolean z10) {
        d9 d9Var2 = this.h;
        if (d9Var2 != null) {
            this.e.d(d9Var2.f24014c, d9Var2.d, d9Var2.e, d9Var2.f24015f);
            this.f24923f = 0.0f;
            this.F.f25215n = true;
        }
        this.h = d9Var;
        this.f24924n = z10;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g9.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getDuration() {
        bi.k5 k5Var = this.f24922c;
        ImageReceiver imageReceiver = k5Var.getImageReceiver();
        s5 s5Var = k5Var.e;
        if (s5Var != null) {
            imageReceiver = s5Var.f28739k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        bi.k5 k5Var = this.f24922c;
        ImageReceiver imageReceiver = k5Var.getImageReceiver();
        s5 s5Var = k5Var.e;
        if (s5Var != null) {
            bi.b4 b4Var = s5Var.f28739k;
            s5Var.setColorFilter(this.f24925r);
            return b4Var;
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
        bi.b4 b4Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            bi.k5 k5Var = this.f24922c;
            s5 s5Var = k5Var.e;
            if (s5Var != null && (b4Var = s5Var.f28739k) != null) {
                b4Var.startAnimation();
            }
            k5Var.f31507a.startAnimation();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        invalidate();
    }
}
