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
    public long f25605a;
    public TLRPC.Document f25606b;
    public final bi.i5 f25607c;
    public final o20 d;
    public final o20 f25608e;
    public float f25609f;
    public b9 h;
    public boolean f25610n;
    public final PorterDuffColorFilter f25611r;
    public final e6 f25612s;
    public boolean v;
    public float f25613w;
    public float f25614x;
    public float f25615y;

    public e9(f9 f9Var, Context context) {
        super(context);
        this.F = f9Var;
        this.d = new o20();
        this.f25608e = new o20();
        this.f25609f = 1.0f;
        this.f25611r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f25612s = new e6(this, 200L, pr.f29467g);
        this.f25613w = -1.0f;
        bi.i5 i5Var = new bi.i5(this, context, 7);
        this.f25607c = i5Var;
        i5Var.getImageReceiver().setAutoRepeatCount(1);
        i5Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(i5Var, w7.x5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12, Paint paint) {
        float f13 = this.f25612s.f25565c;
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
            this.f25608e.d(b9Var2.f24601c, b9Var2.d, b9Var2.f24602e, b9Var2.f24603f);
            this.f25609f = 0.0f;
            this.F.f25971n = true;
        }
        this.h = b9Var;
        this.f25610n = z10;
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
        bi.i5 i5Var = this.f25607c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.f32479e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29584k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        bi.i5 i5Var = this.f25607c;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        q5 q5Var = i5Var.f32479e;
        if (q5Var != null) {
            bi.y3 y3Var = q5Var.f29584k;
            q5Var.setColorFilter(this.f25611r);
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
            bi.i5 i5Var = this.f25607c;
            q5 q5Var = i5Var.f32479e;
            if (q5Var != null && (y3Var = q5Var.f29584k) != null) {
                y3Var.startAnimation();
            }
            i5Var.f32476a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
