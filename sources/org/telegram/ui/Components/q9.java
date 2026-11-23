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
    public xy0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver f38789a;
    public ImageReceiver f38790b;
    public int f38791c;
    public int d;
    public p5 f38792e;
    public ColorFilter f38793f;
    public b9 h;
    public boolean f38794n;
    public boolean f38795r;
    public boolean f38796s;
    public boolean f38797w;
    public boolean f38798x;
    public ValueAnimator f38799y;

    public q9(Context context) {
        super(context);
        this.f38791c = -1;
        this.d = -1;
        this.f38798x = true;
        ImageReceiver c10 = c();
        this.f38789a = c10;
        c10.f22646o1 = 0.0f;
        c10.A1 = true;
        c10.f22634h1 = new c0(this, 13);
    }

    public final void a() {
        Bitmap n10;
        if (this.f38795r && this.f38790b.n() == null && this.f38789a.n() != null && (n10 = this.f38789a.n()) != null && !n10.isRecycled()) {
            this.f38790b.v0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f38789a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f38795r) {
            if (this.f38790b.n() != null && !this.f38790b.n().isRecycled()) {
                this.f38790b.n().recycle();
            }
            this.f38790b.w0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, b9 b9Var) {
        this.f38789a.i0(tLObject, b9Var, null);
        d();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.gc gcVar, org.telegram.messenger.gc gcVar2) {
        this.f38789a.r0(gcVar, str, gcVar2, str2, null, j3, str3, obj, i7);
        d();
    }

    public p5 getAnimatedEmojiDrawable() {
        return this.f38792e;
    }

    public b9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new b9((org.telegram.ui.ActionBar.h6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f38789a;
    }

    public int[] getRoundRadius() {
        return this.f38789a.X0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        n(org.telegram.messenger.gc.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.gc gcVar, String str, Drawable drawable, Object obj) {
        n(gcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.gc gcVar, String str, String str2, Drawable drawable, Object obj) {
        n(gcVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, String str2, int i7, Object obj) {
        n(gcVar, str, gcVar2, str2, null, null, i7, obj);
    }

    public final void m(org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, String str2, Drawable drawable, Object obj) {
        this.f38789a.u0(gcVar, str, gcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void n(org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.f38789a.r0(gcVar, str, gcVar2, str2, drawable, i7, str3, obj, 0);
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38794n = true;
        if (this.f38798x) {
            this.f38789a.P();
        }
        if (this.f38796s) {
            this.f38790b.P();
        }
        p5 p5Var = this.f38792e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38794n = false;
        if (this.f38798x) {
            this.f38789a.R();
        }
        if (this.f38796s) {
            this.f38790b.R();
        }
        p5 p5Var = this.f38792e;
        if (p5Var != null) {
            p5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i7;
        ColorFilter colorFilter;
        p5 p5Var = this.f38792e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38457k;
        } else {
            imageReceiver = this.f38789a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f38793f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f38791c;
            if (i10 != -1 && (i7 = this.d) != -1) {
                if (this.f38797w) {
                    imageReceiver.y0(0.0f, 0.0f, i10, i7);
                    if (this.f38796s) {
                        this.f38790b.y0(0.0f, 0.0f, this.f38791c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.y0((getWidth() - this.f38791c) / 2, (height - i11) / 2, this.f38791c, i11);
                    if (this.f38796s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f38790b.y0((getWidth() - this.f38791c) / 2, (height2 - i12) / 2, this.f38791c, i12);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f38796s) {
                    this.f38790b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f38796s) {
                this.f38790b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.gc gcVar, String str, Drawable drawable, Object obj) {
        n(gcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(t51 t51Var, org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, org.telegram.messenger.gc gcVar3, String str2, int i7, String str3) {
        if (t51Var != null) {
            this.f38789a.w0(t51Var);
        } else {
            this.f38789a.u0(gcVar, str, gcVar2, null, gcVar3, str2, null, i7, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.f38789a.G0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z10) {
        this.f38789a.G0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.f38792e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f38794n && p5Var2 != null) {
            p5Var2.n(this);
        }
        this.f38792e = p5Var;
        if (this.f38794n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f38789a.S0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f38794n) {
            this.f38796s = z10;
            if (z10) {
                this.f38790b = new ImageReceiver(null);
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
        this.E = new xy0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f38789a.f22648p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f38793f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f38796s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f38795r = z10;
        if (!z10) {
            if (this.f38790b.n() != null && !this.f38790b.n().isRecycled()) {
                this.f38790b.n().recycle();
            }
            this.f38790b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f38789a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f38789a.w0(drawable);
        d();
    }

    public void setImageResource(int i7) {
        this.f38789a.w0(getResources().getDrawable(i7));
        invalidate();
        d();
    }

    public void setLayerNum(int i7) {
        this.f38789a.E0(i7);
    }

    public void setRoundRadius(int i7) {
        this.f38789a.J0(i7);
        if (this.f38796s) {
            this.f38790b.J0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.f38789a.K0(i7, i10, i11, i12);
        if (this.f38796s) {
            this.f38790b.K0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.f38791c = i7;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f38789a.t() && drawable != this.f38789a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
