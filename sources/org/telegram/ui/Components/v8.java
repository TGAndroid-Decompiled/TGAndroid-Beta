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
    public float A;
    public final w8 B;
    public long f33311a;
    public TLRPC.Document f33312b;
    public final ih.d4 f33313c;
    public final z10 d;
    public final z10 f33314e;
    public float f33315f;
    public s8 h;
    public boolean f33316n;
    public final PorterDuffColorFilter f33317r;
    public final y5 f33318s;
    public boolean v;
    public float f33319w;
    public float f33320x;
    public float f33321y;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.B = w8Var;
        this.d = new z10();
        this.f33314e = new z10();
        this.f33315f = 1.0f;
        this.f33317r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f33318s = new y5(this, 200L, gr.f28845g);
        this.f33319w = -1.0f;
        ih.d4 d4Var = new ih.d4(this, context, 6);
        this.f33313c = d4Var;
        d4Var.getImageReceiver().setAutoRepeatCount(1);
        d4Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(d4Var, g7.e6.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f33318s.f34854c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float lerp = AndroidUtilities.lerp(f12, 0.0f, f14);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
    }

    public final void b(s8 s8Var, boolean z10) {
        s8 s8Var2 = this.h;
        if (s8Var2 != null) {
            this.f33314e.d(s8Var2.f32393c, s8Var2.d, s8Var2.f32394e, s8Var2.f32395f);
            this.f33315f = 0.0f;
            this.B.f34143n = true;
        }
        this.h = s8Var;
        this.f33316n = z10;
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
        ih.d4 d4Var = this.f33313c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        k5 k5Var = d4Var.f31331e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        }
        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
            return imageReceiver.getLottieAnimation().p();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        ih.d4 d4Var = this.f33313c;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        k5 k5Var = d4Var.f31331e;
        if (k5Var != null) {
            ih.z2 z2Var = k5Var.f29951k;
            k5Var.setColorFilter(this.f33317r);
            return z2Var;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.B.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.B.Q) {
            super.onMeasure(i9, i10);
        } else {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        ih.z2 z2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            ih.d4 d4Var = this.f33313c;
            k5 k5Var = d4Var.f31331e;
            if (k5Var != null && (z2Var = k5Var.f29951k) != null) {
                z2Var.startAnimation();
            }
            d4Var.f31328a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
