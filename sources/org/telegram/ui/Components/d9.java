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
    public long f23626a;
    public TLRPC.Document f23627b;
    public final ai.y5 f23628c;
    public final q20 d;
    public final q20 e;
    public float f23629f;
    public a9 h;
    public boolean f23630n;
    public final PorterDuffColorFilter f23631r;
    public final e6 f23632s;
    public boolean v;
    public float f23633w;
    public float f23634x;
    public float f23635y;

    public d9(e9 e9Var, Context context) {
        super(context);
        this.F = e9Var;
        this.d = new q20();
        this.e = new q20();
        this.f23629f = 1.0f;
        this.f23631r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f23632s = new e6(this, 200L, sr.f28340g);
        this.f23633w = -1.0f;
        ai.y5 y5Var = new ai.y5(this, context, 7);
        this.f23628c = y5Var;
        y5Var.getImageReceiver().setAutoRepeatCount(1);
        y5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(y5Var, w7.y5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f23632s.f23850c;
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
            this.e.d(a9Var2.f22572c, a9Var2.d, a9Var2.e, a9Var2.f22573f);
            this.f23629f = 0.0f;
            this.F.f23883n = true;
        }
        this.h = a9Var;
        this.f23630n = z10;
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
        ai.y5 y5Var = this.f23628c;
        ImageReceiver imageReceiver = y5Var.getImageReceiver();
        q5 q5Var = y5Var.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27588k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().r();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ai.y5 y5Var = this.f23628c;
        ImageReceiver imageReceiver = y5Var.getImageReceiver();
        q5 q5Var = y5Var.e;
        if (q5Var != null) {
            ai.l4 l4Var = q5Var.f27588k;
            q5Var.setColorFilter(this.f23631r);
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
            ai.y5 y5Var = this.f23628c;
            q5 q5Var = y5Var.e;
            if (q5Var != null && (l4Var = q5Var.f27588k) != null) {
                l4Var.startAnimation();
            }
            y5Var.f29958a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
