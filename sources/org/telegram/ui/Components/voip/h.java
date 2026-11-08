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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.w8;
public final class h extends View {
    public final ImageReceiver f39228a;
    public final ImageReceiver f39229b;
    public final w8 f39230c;
    public final r9 d;
    public final r9 f39231e;
    public final Paint f39232f;
    public final Paint h;
    public float f39233n;
    public float f39234r;
    public float f39235s;
    public boolean f39236w;
    public long f39237x;

    public h(Context context) {
        super(context);
        this.f39228a = new ImageReceiver(this);
        this.f39229b = new ImageReceiver(this);
        this.f39230c = new w8((f6) null);
        r9 r9Var = new r9(9);
        this.d = r9Var;
        r9 r9Var2 = new r9(12);
        this.f39231e = r9Var2;
        Paint paint = new Paint(1);
        this.f39232f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(k6.x0(null, k6.f27881eh, false));
        r9Var.f37573a = 48.0f;
        r9Var.f37574b = 58.999996f;
        r9Var2.f37573a = 51.0f;
        r9Var2.f37574b = 61.0f;
        r9Var.b();
        r9Var2.b();
    }

    public final void a(TLObject tLObject) {
        hc hcVar;
        hc a10;
        w8 w8Var = this.f39230c;
        w8Var.p(tLObject);
        this.f39228a.i0(tLObject, w8Var, null);
        if (tLObject instanceof TLRPC.User) {
            a10 = hc.l(p10.f24470s0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a10 = hc.a(1, (TLRPC.Chat) tLObject);
        } else {
            hcVar = null;
            this.f39229b.q0(hcVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.f27935hh, false)), null, tLObject, 0);
            invalidate();
        }
        hcVar = a10;
        this.f39229b.q0(hcVar, "50_50_b", new ColorDrawable(k6.x0(null, k6.f27935hh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39228a.P();
        this.f39229b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39228a.R();
        this.f39229b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f10;
        int width = getWidth();
        float f11 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.f39229b;
        imageReceiver.y0(0.0f, 0.0f, f11, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f11, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.f39237x;
        if (j3 == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j3);
        }
        this.f39237x = uptimeMillis;
        float f12 = this.f39233n;
        float f13 = (float) min;
        this.f39233n = (Math.min(1.0f, f13 / 120.0f) * (this.f39234r - f12)) + f12;
        float f14 = this.f39235s;
        if (this.f39236w) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f39235s = (Math.min(1.0f, f13 / 200.0f) * (f10 - f14)) + f14;
        float min2 = Math.min(width, height) * 0.42f;
        float f15 = f11 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.f39235s > 0.01f) {
            float f16 = this.f39233n;
            r9 r9Var = this.f39231e;
            r9Var.e(f16, 1.0f);
            float f17 = this.f39233n;
            r9 r9Var2 = this.d;
            r9Var2.e(f17, 1.0f);
            float f18 = (((this.f39233n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f15, min3);
            canvas.scale(f18, f18);
            int i7 = (int) (this.f39235s * 76.0f);
            Paint paint = this.f39232f;
            paint.setAlpha(i7);
            r9Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.f39235s * 110.0f));
            r9Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f19 = (this.f39233n * 0.2f * this.f39235s) + 1.0f;
        float f20 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.f39228a;
        imageReceiver2.J0((int) f20);
        imageReceiver2.y0(f15 - f20, min3 - f20, min2, min2);
        canvas.save();
        canvas.scale(f19, f19, f15, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.f39235s <= 0.01f && Math.abs(this.f39234r - this.f39233n) <= 0.005f) {
            this.f39237x = 0L;
        } else {
            invalidate();
        }
    }
}
