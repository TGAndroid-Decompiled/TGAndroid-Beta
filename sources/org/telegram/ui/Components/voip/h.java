package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.w9;
public final class h extends View {
    public final ImageReceiver f40984a;
    public final ImageReceiver f40985b;
    public final b9 f40986c;
    public final w9 d;
    public final w9 f40987e;
    public final Paint f40988f;
    public final Paint h;
    public float f40989n;
    public float f40990r;
    public float f40991s;
    public boolean f40992w;
    public long f40993x;

    public h(Context context) {
        super(context);
        this.f40984a = new ImageReceiver(this);
        this.f40985b = new ImageReceiver(this);
        this.f40986c = new b9((h6) null);
        w9 w9Var = new w9(9);
        this.d = w9Var;
        w9 w9Var2 = new w9(12);
        this.f40987e = w9Var2;
        Paint paint = new Paint(1);
        this.f40988f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(m6.x0(null, m6.f29430hh, false));
        w9Var.f41686a = 48.0f;
        w9Var.f41687b = 58.999996f;
        w9Var2.f41686a = 51.0f;
        w9Var2.f41687b = 61.0f;
        w9Var.b();
        w9Var2.b();
    }

    public final void a(TLObject tLObject) {
        gc gcVar;
        gc a10;
        b9 b9Var = this.f40986c;
        b9Var.p(tLObject);
        this.f40984a.i0(tLObject, b9Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = gc.l(k10.f24932t0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a10 = gc.a(1, (TLRPC.Chat) tLObject);
        } else {
            gcVar = null;
            this.f40985b.q0(gcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.f29486kh, false)), null, tLObject, 0);
            invalidate();
        }
        gcVar = a10;
        this.f40985b.q0(gcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.f29486kh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40984a.P();
        this.f40985b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40984a.R();
        this.f40985b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f10;
        int width = getWidth();
        float f11 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.f40985b;
        imageReceiver.y0(0.0f, 0.0f, f11, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f11, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f40993x;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.f40993x = uptimeMillis;
        float f12 = this.f40989n;
        float f13 = (float) min;
        this.f40989n = (Math.min(1.0f, f13 / 120.0f) * (this.f40990r - f12)) + f12;
        float f14 = this.f40991s;
        if (this.f40992w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40991s = (Math.min(1.0f, f13 / 200.0f) * (f10 - f14)) + f14;
        float min2 = Math.min(width, height) * 0.42f;
        float f15 = f11 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.f40991s > 0.01f) {
            float f16 = this.f40989n;
            w9 w9Var = this.f40987e;
            w9Var.e(f16, 1.0f);
            float f17 = this.f40989n;
            w9 w9Var2 = this.d;
            w9Var2.e(f17, 1.0f);
            float f18 = (((this.f40989n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f15, min3);
            canvas.scale(f18, f18);
            int i7 = (int) (this.f40991s * 76.0f);
            Paint paint = this.f40988f;
            paint.setAlpha(i7);
            w9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.f40991s * 110.0f));
            w9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f19 = (this.f40989n * 0.2f * this.f40991s) + 1.0f;
        float f20 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.f40984a;
        imageReceiver2.J0((int) f20);
        imageReceiver2.y0(f15 - f20, min3 - f20, min2, min2);
        canvas.save();
        canvas.scale(f19, f19, f15, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.f40991s <= 0.01f && Math.abs(this.f40990r - this.f40989n) <= 0.005f) {
            this.f40993x = 0L;
        } else {
            invalidate();
        }
    }
}
