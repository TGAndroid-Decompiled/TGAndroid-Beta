package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public class q9 extends View {
    public vy0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver f38742a;
    public ImageReceiver f38743b;
    public int f38744c;
    public int d;
    public o5 f38745e;
    public ColorFilter f38746f;
    public b9 h;
    public boolean f38747n;
    public boolean f38748r;
    public boolean f38749s;
    public boolean f38750w;
    public boolean f38751x;
    public ValueAnimator f38752y;

    public q9(Context context) {
        super(context);
        this.f38744c = -1;
        this.d = -1;
        this.f38751x = true;
        ImageReceiver c10 = c();
        this.f38742a = c10;
        c10.f22654o1 = 0.0f;
        c10.A1 = true;
        c10.f22642h1 = new b0(this, 13);
    }

    public final void a() {
        Bitmap n10;
        if (this.f38748r && this.f38743b.n() == null && this.f38742a.n() != null && (n10 = this.f38742a.n()) != null && !n10.isRecycled()) {
            this.f38743b.v0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f38742a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f38748r) {
            if (this.f38743b.n() != null && !this.f38743b.n().isRecycled()) {
                this.f38743b.n().recycle();
            }
            this.f38743b.w0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, b9 b9Var) {
        this.f38742a.i0(tLObject, b9Var, null);
        d();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2) {
        this.f38742a.r0(fcVar, str, fcVar2, str2, null, j3, str3, obj, i7);
        d();
    }

    public o5 getAnimatedEmojiDrawable() {
        return this.f38745e;
    }

    public b9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new b9((org.telegram.ui.ActionBar.i6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f38742a;
    }

    public int[] getRoundRadius() {
        return this.f38742a.X0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        n(org.telegram.messenger.fc.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.fc fcVar, String str, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.fc fcVar, String str, String str2, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, int i7, Object obj) {
        n(fcVar, str, fcVar2, str2, null, null, i7, obj);
    }

    public final void m(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, Drawable drawable, Object obj) {
        this.f38742a.u0(fcVar, str, fcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void n(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.f38742a.r0(fcVar, str, fcVar2, str2, drawable, i7, str3, obj, 0);
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38747n = true;
        if (this.f38751x) {
            this.f38742a.P();
        }
        if (this.f38749s) {
            this.f38743b.P();
        }
        o5 o5Var = this.f38745e;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38747n = false;
        if (this.f38751x) {
            this.f38742a.R();
        }
        if (this.f38749s) {
            this.f38743b.R();
        }
        o5 o5Var = this.f38745e;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i7;
        ColorFilter colorFilter;
        o5 o5Var = this.f38745e;
        if (o5Var != null) {
            imageReceiver = o5Var.f37976k;
        } else {
            imageReceiver = this.f38742a;
        }
        if (imageReceiver != null) {
            if (o5Var != null && (colorFilter = this.f38746f) != null) {
                o5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f38744c;
            if (i10 != -1 && (i7 = this.d) != -1) {
                if (this.f38750w) {
                    imageReceiver.y0(0.0f, 0.0f, i10, i7);
                    if (this.f38749s) {
                        this.f38743b.y0(0.0f, 0.0f, this.f38744c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.y0((getWidth() - this.f38744c) / 2, (height - i11) / 2, this.f38744c, i11);
                    if (this.f38749s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f38743b.y0((getWidth() - this.f38744c) / 2, (height2 - i12) / 2, this.f38744c, i12);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f38749s) {
                    this.f38743b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f38749s) {
                this.f38743b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.fc fcVar, String str, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(q51 q51Var, org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, org.telegram.messenger.fc fcVar3, String str2, int i7, String str3) {
        if (q51Var != null) {
            this.f38742a.w0(q51Var);
        } else {
            this.f38742a.u0(fcVar, str, fcVar2, null, fcVar3, str2, null, i7, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.f38742a.G0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z10) {
        this.f38742a.G0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        o5 o5Var2 = this.f38745e;
        if (o5Var2 == o5Var) {
            return;
        }
        if (this.f38747n && o5Var2 != null) {
            o5Var2.n(this);
        }
        this.f38745e = o5Var;
        if (this.f38747n && o5Var != null) {
            o5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f38742a.S0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f38747n) {
            this.f38749s = z10;
            if (z10) {
                this.f38743b = new ImageReceiver(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.E = null;
            return;
        }
        this.E = new vy0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f38742a.f22656p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f38746f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f38749s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f38748r = z10;
        if (!z10) {
            if (this.f38743b.n() != null && !this.f38743b.n().isRecycled()) {
                this.f38743b.n().recycle();
            }
            this.f38743b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f38742a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f38742a.w0(drawable);
        d();
    }

    public void setImageResource(int i7) {
        this.f38742a.w0(getResources().getDrawable(i7));
        invalidate();
        d();
    }

    public void setLayerNum(int i7) {
        this.f38742a.E0(i7);
    }

    public void setRoundRadius(int i7) {
        this.f38742a.J0(i7);
        if (this.f38749s) {
            this.f38743b.J0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.f38742a.K0(i7, i10, i11, i12);
        if (this.f38749s) {
            this.f38743b.K0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.f38744c = i7;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f38742a.t() && drawable != this.f38742a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
