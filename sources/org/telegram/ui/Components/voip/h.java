package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.v8;
public final class h extends View {
    public final ImageReceiver f39237a;
    public final ImageReceiver f39238b;
    public final v8 f39239c;
    public final q9 d;
    public final q9 f39240e;
    public final Paint f39241f;
    public final Paint h;
    public float f39242n;
    public float f39243r;
    public float f39244s;
    public boolean f39245w;
    public long f39246x;

    public h(Context context) {
        super(context);
        this.f39237a = new ImageReceiver(this);
        this.f39238b = new ImageReceiver(this);
        this.f39239c = new v8((h6) null);
        q9 q9Var = new q9(9);
        this.d = q9Var;
        q9 q9Var2 = new q9(12);
        this.f39240e = q9Var2;
        Paint paint = new Paint(1);
        this.f39241f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(m6.x0(null, m6.f27919eh, false));
        q9Var.f37178a = 48.0f;
        q9Var.f37179b = 58.999996f;
        q9Var2.f37178a = 51.0f;
        q9Var2.f37179b = 61.0f;
        q9Var.b();
        q9Var2.b();
    }

    public final void a(TLObject tLObject) {
        hc hcVar;
        hc a10;
        v8 v8Var = this.f39239c;
        v8Var.p(tLObject);
        this.f39237a.i0(tLObject, v8Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = hc.l(p10.f24474s0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a10 = hc.a(1, (TLRPC.Chat) tLObject);
        } else {
            hcVar = null;
            this.f39238b.q0(hcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.f27973hh, false)), null, tLObject, 0);
            invalidate();
        }
        hcVar = a10;
        this.f39238b.q0(hcVar, "50_50_b", new ColorDrawable(m6.x0(null, m6.f27973hh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39237a.P();
        this.f39238b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39237a.R();
        this.f39238b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f10;
        int width = getWidth();
        float f11 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.f39238b;
        imageReceiver.y0(0.0f, 0.0f, f11, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f11, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f39246x;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.f39246x = uptimeMillis;
        float f12 = this.f39242n;
        float f13 = (float) min;
        this.f39242n = (Math.min(1.0f, f13 / 120.0f) * (this.f39243r - f12)) + f12;
        float f14 = this.f39244s;
        if (this.f39245w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f39244s = (Math.min(1.0f, f13 / 200.0f) * (f10 - f14)) + f14;
        float min2 = Math.min(width, height) * 0.42f;
        float f15 = f11 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.f39244s > 0.01f) {
            float f16 = this.f39242n;
            q9 q9Var = this.f39240e;
            q9Var.e(f16, 1.0f);
            float f17 = this.f39242n;
            q9 q9Var2 = this.d;
            q9Var2.e(f17, 1.0f);
            float f18 = (((this.f39242n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f15, min3);
            canvas.scale(f18, f18);
            int i7 = (int) (this.f39244s * 76.0f);
            Paint paint = this.f39241f;
            paint.setAlpha(i7);
            q9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.f39244s * 110.0f));
            q9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f19 = (this.f39242n * 0.2f * this.f39244s) + 1.0f;
        float f20 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.f39237a;
        imageReceiver2.J0((int) f20);
        imageReceiver2.y0(f15 - f20, min3 - f20, min2, min2);
        canvas.save();
        canvas.scale(f19, f19, f15, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.f39244s <= 0.01f && Math.abs(this.f39243r - this.f39242n) <= 0.005f) {
            this.f39246x = 0L;
        } else {
            invalidate();
        }
    }
}
