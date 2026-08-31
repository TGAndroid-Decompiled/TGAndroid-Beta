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
    public long f31841a;
    public TLRPC.Document f31842b;
    public final oh.a4 f31843c;
    public final q20 d;
    public final q20 f31844e;
    public float f31845f;
    public s8 h;
    public boolean f31846n;
    public final PorterDuffColorFilter f31847r;
    public final z5 f31848s;
    public boolean v;
    public float f31849w;
    public float f31850x;
    public float f31851y;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.C = w8Var;
        this.d = new q20();
        this.f31844e = new q20();
        this.f31845f = 1.0f;
        this.f31847r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f31848s = new z5(this, 200L, pr.f30184g);
        this.f31849w = -1.0f;
        oh.a4 a4Var = new oh.a4(this, context, 6);
        this.f31843c = a4Var;
        a4Var.getImageReceiver().setAutoRepeatCount(1);
        a4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(a4Var, k7.c6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f31848s.f33725c;
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
            this.f31844e.d(s8Var2.f31006c, s8Var2.d, s8Var2.f31007e, s8Var2.f31008f);
            this.f31845f = 0.0f;
            this.C.f32675n = true;
        }
        this.h = s8Var;
        this.f31846n = z4;
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
        oh.a4 a4Var = this.f31843c;
        ImageReceiver imageReceiver = a4Var.getImageReceiver();
        l5 l5Var = a4Var.f30001e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28604k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        oh.a4 a4Var = this.f31843c;
        ImageReceiver imageReceiver = a4Var.getImageReceiver();
        l5 l5Var = a4Var.f30001e;
        if (l5Var != null) {
            oh.z2 z2Var = l5Var.f28604k;
            l5Var.setColorFilter(this.f31847r);
            return z2Var;
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
        oh.z2 z2Var;
        if (this.v == z4) {
            return;
        }
        this.v = z4;
        if (z4) {
            oh.a4 a4Var = this.f31843c;
            l5 l5Var = a4Var.f30001e;
            if (l5Var != null && (z2Var = l5Var.f28604k) != null) {
                z2Var.startAnimation();
            }
            a4Var.f29998a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
