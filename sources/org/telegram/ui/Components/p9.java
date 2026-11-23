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
public class p9 extends View {
    public wy0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver f38429a;
    public ImageReceiver f38430b;
    public int f38431c;
    public int d;
    public o5 f38432e;
    public ColorFilter f38433f;
    public a9 h;
    public boolean f38434n;
    public boolean f38435r;
    public boolean f38436s;
    public boolean f38437w;
    public boolean f38438x;
    public ValueAnimator f38439y;

    public p9(Context context) {
        super(context);
        this.f38431c = -1;
        this.d = -1;
        this.f38438x = true;
        ImageReceiver c10 = c();
        this.f38429a = c10;
        c10.f22749o1 = 0.0f;
        c10.A1 = true;
        c10.f22737h1 = new b0(this, 13);
    }

    public final void a() {
        Bitmap n10;
        if (this.f38435r && this.f38430b.n() == null && this.f38429a.n() != null && (n10 = this.f38429a.n()) != null && !n10.isRecycled()) {
            this.f38430b.w0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f38429a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void e() {
        if (this.f38435r) {
            if (this.f38430b.n() != null && !this.f38430b.n().isRecycled()) {
                this.f38430b.n().recycle();
            }
            this.f38430b.x0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, a9 a9Var) {
        this.f38429a.j0(tLObject, a9Var, null);
        e();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2) {
        this.f38429a.s0(fcVar, str, fcVar2, str2, null, j3, str3, obj, i7);
        e();
    }

    public o5 getAnimatedEmojiDrawable() {
        return this.f38432e;
    }

    public a9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new a9((org.telegram.ui.ActionBar.i6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f38429a;
    }

    public int[] getRoundRadius() {
        return this.f38429a.X0;
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
        this.f38429a.v0(fcVar, str, fcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        e();
    }

    public final void n(org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.f38429a.s0(fcVar, str, fcVar2, str2, drawable, i7, str3, obj, 0);
        e();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38434n = true;
        if (this.f38438x) {
            this.f38429a.Q();
        }
        if (this.f38436s) {
            this.f38430b.Q();
        }
        o5 o5Var = this.f38432e;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38434n = false;
        if (this.f38438x) {
            this.f38429a.S();
        }
        if (this.f38436s) {
            this.f38430b.S();
        }
        o5 o5Var = this.f38432e;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i7;
        ColorFilter colorFilter;
        o5 o5Var = this.f38432e;
        if (o5Var != null) {
            imageReceiver = o5Var.f38028k;
        } else {
            imageReceiver = this.f38429a;
        }
        if (imageReceiver != null) {
            if (o5Var != null && (colorFilter = this.f38433f) != null) {
                o5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f38431c;
            if (i10 != -1 && (i7 = this.d) != -1) {
                if (this.f38437w) {
                    imageReceiver.z0(0.0f, 0.0f, i10, i7);
                    if (this.f38436s) {
                        this.f38430b.z0(0.0f, 0.0f, this.f38431c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.z0((getWidth() - this.f38431c) / 2, (height - i11) / 2, this.f38431c, i11);
                    if (this.f38436s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f38430b.z0((getWidth() - this.f38431c) / 2, (height2 - i12) / 2, this.f38431c, i12);
                    }
                }
            } else {
                imageReceiver.z0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f38436s) {
                    this.f38430b.z0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f38436s) {
                this.f38430b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.fc fcVar, String str, Drawable drawable, Object obj) {
        n(fcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(s51 s51Var, org.telegram.messenger.fc fcVar, String str, org.telegram.messenger.fc fcVar2, org.telegram.messenger.fc fcVar3, String str2, int i7, String str3) {
        if (s51Var != null) {
            this.f38429a.x0(s51Var);
        } else {
            this.f38429a.v0(fcVar, str, fcVar2, null, fcVar3, str2, null, i7, null, str3, 1);
        }
        e();
    }

    public final void r() {
        this.f38429a.H0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z10) {
        this.f38429a.H0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        o5 o5Var2 = this.f38432e;
        if (o5Var2 == o5Var) {
            return;
        }
        if (this.f38434n && o5Var2 != null) {
            o5Var2.n(this);
        }
        this.f38432e = o5Var;
        if (this.f38434n && o5Var != null) {
            o5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f38429a.S0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f38434n) {
            this.f38436s = z10;
            if (z10) {
                this.f38430b = new ImageReceiver(null);
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
        this.E = new wy0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f38429a.f22751p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f38433f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f38436s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f38435r = z10;
        if (!z10) {
            if (this.f38430b.n() != null && !this.f38430b.n().isRecycled()) {
                this.f38430b.n().recycle();
            }
            this.f38430b.x0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f38429a.w0(bitmap);
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f38429a.x0(drawable);
        e();
    }

    public void setImageResource(int i7) {
        this.f38429a.x0(getResources().getDrawable(i7));
        invalidate();
        e();
    }

    public void setLayerNum(int i7) {
        this.f38429a.F0(i7);
    }

    public void setRoundRadius(int i7) {
        this.f38429a.K0(i7);
        if (this.f38436s) {
            this.f38430b.K0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.f38429a.L0(i7, i10, i11, i12);
        if (this.f38436s) {
            this.f38430b.L0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.f38431c = i7;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f38429a.t() && drawable != this.f38429a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
