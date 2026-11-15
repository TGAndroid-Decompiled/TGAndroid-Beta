package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.t8;
public final class h extends View {
    public final ImageReceiver f40625a;
    public final ImageReceiver f40626b;
    public final t8 f40627c;
    public final o9 d;
    public final o9 f40628e;
    public final Paint f40629f;
    public final Paint h;
    public float f40630n;
    public float f40631r;
    public float f40632s;
    public boolean f40633w;
    public long f40634x;

    public h(Context context) {
        super(context);
        this.f40625a = new ImageReceiver(this);
        this.f40626b = new ImageReceiver(this);
        this.f40627c = new t8((e6) null);
        o9 o9Var = new o9(9);
        this.d = o9Var;
        o9 o9Var2 = new o9(12);
        this.f40628e = o9Var2;
        Paint paint = new Paint(1);
        this.f40629f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(j6.x0(null, j6.f28932hh, false));
        o9Var.f37864a = 48.0f;
        o9Var.f37865b = 58.999996f;
        o9Var2.f37864a = 51.0f;
        o9Var2.f37865b = 61.0f;
        o9Var.b();
        o9Var2.b();
    }

    public final void a(TLObject tLObject) {
        gc gcVar;
        gc a10;
        t8 t8Var = this.f40627c;
        t8Var.p(tLObject);
        this.f40625a.i0(tLObject, t8Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = gc.l(m10.f24940t0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a10 = gc.a(1, (TLRPC.Chat) tLObject);
        } else {
            gcVar = null;
            this.f40626b.q0(gcVar, "50_50_b", new ColorDrawable(j6.x0(null, j6.f28988kh, false)), null, tLObject, 0);
            invalidate();
        }
        gcVar = a10;
        this.f40626b.q0(gcVar, "50_50_b", new ColorDrawable(j6.x0(null, j6.f28988kh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40625a.P();
        this.f40626b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40625a.R();
        this.f40626b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f10;
        int width = getWidth();
        float f11 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.f40626b;
        imageReceiver.y0(0.0f, 0.0f, f11, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f11, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f40634x;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.f40634x = uptimeMillis;
        float f12 = this.f40630n;
        float f13 = (float) min;
        this.f40630n = (Math.min(1.0f, f13 / 120.0f) * (this.f40631r - f12)) + f12;
        float f14 = this.f40632s;
        if (this.f40633w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40632s = (Math.min(1.0f, f13 / 200.0f) * (f10 - f14)) + f14;
        float min2 = Math.min(width, height) * 0.42f;
        float f15 = f11 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.f40632s > 0.01f) {
            float f16 = this.f40630n;
            o9 o9Var = this.f40628e;
            o9Var.e(f16, 1.0f);
            float f17 = this.f40630n;
            o9 o9Var2 = this.d;
            o9Var2.e(f17, 1.0f);
            float f18 = (((this.f40630n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f15, min3);
            canvas.scale(f18, f18);
            int i7 = (int) (this.f40632s * 76.0f);
            Paint paint = this.f40629f;
            paint.setAlpha(i7);
            o9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.f40632s * 110.0f));
            o9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f19 = (this.f40630n * 0.2f * this.f40632s) + 1.0f;
        float f20 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.f40625a;
        imageReceiver2.J0((int) f20);
        imageReceiver2.y0(f15 - f20, min3 - f20, min2, min2);
        canvas.save();
        canvas.scale(f19, f19, f15, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.f40632s <= 0.01f && Math.abs(this.f40631r - this.f40630n) <= 0.005f) {
            this.f40634x = 0L;
        } else {
            invalidate();
        }
    }
}
