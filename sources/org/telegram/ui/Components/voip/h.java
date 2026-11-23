package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.v9;
public final class h extends View {
    public final ImageReceiver f40901a;
    public final ImageReceiver f40902b;
    public final a9 f40903c;
    public final v9 d;
    public final v9 f40904e;
    public final Paint f40905f;
    public final Paint h;
    public float f40906n;
    public float f40907r;
    public float f40908s;
    public boolean f40909w;
    public long f40910x;

    public h(Context context) {
        super(context);
        this.f40901a = new ImageReceiver(this);
        this.f40902b = new ImageReceiver(this);
        this.f40903c = new a9((i6) null);
        v9 v9Var = new v9(9);
        this.d = v9Var;
        v9 v9Var2 = new v9(12);
        this.f40904e = v9Var2;
        Paint paint = new Paint(1);
        this.f40905f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(n6.x0(null, n6.f29534hh, false));
        v9Var.f40595a = 48.0f;
        v9Var.f40596b = 58.999996f;
        v9Var2.f40595a = 51.0f;
        v9Var2.f40596b = 61.0f;
        v9Var.b();
        v9Var2.b();
    }

    public final void a(TLObject tLObject) {
        fc fcVar;
        fc a10;
        a9 a9Var = this.f40903c;
        a9Var.p(tLObject);
        this.f40901a.j0(tLObject, a9Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = fc.l(i10.f24637t0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a10 = fc.a(1, (TLRPC.Chat) tLObject);
        } else {
            fcVar = null;
            this.f40902b.r0(fcVar, "50_50_b", new ColorDrawable(n6.x0(null, n6.f29590kh, false)), null, tLObject, 0);
            invalidate();
        }
        fcVar = a10;
        this.f40902b.r0(fcVar, "50_50_b", new ColorDrawable(n6.x0(null, n6.f29590kh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40901a.Q();
        this.f40902b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40901a.S();
        this.f40902b.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f10;
        int width = getWidth();
        float f11 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.f40902b;
        imageReceiver.z0(0.0f, 0.0f, f11, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f11, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f40910x;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.f40910x = uptimeMillis;
        float f12 = this.f40906n;
        float f13 = (float) min;
        this.f40906n = (Math.min(1.0f, f13 / 120.0f) * (this.f40907r - f12)) + f12;
        float f14 = this.f40908s;
        if (this.f40909w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40908s = (Math.min(1.0f, f13 / 200.0f) * (f10 - f14)) + f14;
        float min2 = Math.min(width, height) * 0.42f;
        float f15 = f11 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.f40908s > 0.01f) {
            float f16 = this.f40906n;
            v9 v9Var = this.f40904e;
            v9Var.e(f16, 1.0f);
            float f17 = this.f40906n;
            v9 v9Var2 = this.d;
            v9Var2.e(f17, 1.0f);
            float f18 = (((this.f40906n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f15, min3);
            canvas.scale(f18, f18);
            int i7 = (int) (this.f40908s * 76.0f);
            Paint paint = this.f40905f;
            paint.setAlpha(i7);
            v9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.f40908s * 110.0f));
            v9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f19 = (this.f40906n * 0.2f * this.f40908s) + 1.0f;
        float f20 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.f40901a;
        imageReceiver2.K0((int) f20);
        imageReceiver2.z0(f15 - f20, min3 - f20, min2, min2);
        canvas.save();
        canvas.scale(f19, f19, f15, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.f40908s <= 0.01f && Math.abs(this.f40907r - this.f40906n) <= 0.005f) {
            this.f40910x = 0L;
        } else {
            invalidate();
        }
    }
}
