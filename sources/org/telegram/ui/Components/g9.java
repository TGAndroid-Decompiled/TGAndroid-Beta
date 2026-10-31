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
public class g9 extends View {
    public qz0 D;
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f26292a;
    public ImageReceiver f26293b;
    public int f26294c;
    public int d;
    public f5 e;
    public ColorFilter f26295f;
    public r8 h;
    public boolean f26296n;
    public boolean f26297r;
    public boolean f26298s;
    public boolean f26299w;
    public boolean f26300x;
    public ValueAnimator f26301y;

    public g9(Context context) {
        super(context);
        this.f26294c = -1;
        this.d = -1;
        this.f26300x = true;
        ImageReceiver c10 = c();
        this.f26292a = c10;
        c10.f14395n1 = 0.0f;
        c10.f14424z1 = true;
        c10.f14382g1 = new t(this, 14);
    }

    public final void a() {
        Bitmap n10;
        if (this.f26297r && this.f26293b.n() == null && this.f26292a.n() != null && (n10 = this.f26292a.n()) != null && !n10.isRecycled()) {
            this.f26293b.v0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f26292a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f26297r) {
            if (this.f26293b.n() != null && !this.f26293b.n().isRecycled()) {
                this.f26293b.n().recycle();
            }
            this.f26293b.w0(null);
            a();
        }
    }

    public final void e(TLObject tLObject, r8 r8Var) {
        this.f26292a.i0(tLObject, r8Var, null);
        d();
    }

    public final void g(int i10, long j10, Object obj, String str, String str2, String str3, org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        this.f26292a.r0(icVar, str, icVar2, str2, null, j10, str3, obj, i10);
        d();
    }

    public f5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public r8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new r8((org.telegram.ui.ActionBar.p6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26292a;
    }

    public int[] getRoundRadius() {
        return this.f26292a.W0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        o(org.telegram.messenger.ic.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.ic icVar, String str, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.ic icVar, String str, String str2, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, int i10, Object obj) {
        o(icVar, str, icVar2, str2, null, null, i10, obj);
    }

    public final void m(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, Drawable drawable, Object obj) {
        this.f26292a.u0(icVar, str, icVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void o(org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f26292a.r0(icVar, str, icVar2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26296n = true;
        if (this.f26300x) {
            this.f26292a.P();
        }
        if (this.f26298s) {
            this.f26293b.P();
        }
        f5 f5Var = this.e;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26296n = false;
        if (this.f26300x) {
            this.f26292a.R();
        }
        if (this.f26298s) {
            this.f26293b.R();
        }
        f5 f5Var = this.e;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        f5 f5Var = this.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f25975k;
        } else {
            imageReceiver = this.f26292a;
        }
        if (imageReceiver != null) {
            if (f5Var != null && (colorFilter = this.f26295f) != null) {
                f5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f26294c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.f26299w) {
                    imageReceiver.y0(0.0f, 0.0f, i11, i10);
                    if (this.f26298s) {
                        this.f26293b.y0(0.0f, 0.0f, this.f26294c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.y0((getWidth() - this.f26294c) / 2, (height - i12) / 2, this.f26294c, i12);
                    if (this.f26298s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f26293b.y0((getWidth() - this.f26294c) / 2, (height2 - i13) / 2, this.f26294c, i13);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f26298s) {
                    this.f26293b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f26298s) {
                this.f26293b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.ic icVar, String str, Drawable drawable, Object obj) {
        o(icVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(g61 g61Var, org.telegram.messenger.ic icVar, String str, org.telegram.messenger.ic icVar2, org.telegram.messenger.ic icVar3, String str2, int i10, String str3) {
        if (g61Var != null) {
            this.f26292a.w0(g61Var);
        } else {
            this.f26292a.u0(icVar, str, icVar2, null, icVar3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.f26292a.G0(0, 0, true);
    }

    public final void s(int i10, int i11, boolean z10) {
        this.f26292a.G0(i10, i11, true);
    }

    public void setAnimatedEmojiDrawable(f5 f5Var) {
        f5 f5Var2 = this.e;
        if (f5Var2 == f5Var) {
            return;
        }
        if (this.f26296n && f5Var2 != null) {
            f5Var2.n(this);
        }
        this.e = f5Var;
        if (this.f26296n && f5Var != null) {
            f5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f26292a.R0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f26296n) {
            this.f26298s = z10;
            if (z10) {
                this.f26293b = new ImageReceiver(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.D = null;
            return;
        }
        this.D = new qz0(charSequence, 16.5f, org.telegram.messenger.i0.o());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.i0.h(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f26292a.f14397o1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f26295f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f26298s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f26297r = z10;
        if (!z10) {
            if (this.f26293b.n() != null && !this.f26293b.n().isRecycled()) {
                this.f26293b.n().recycle();
            }
            this.f26293b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f26292a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f26292a.w0(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f26292a.w0(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f26292a.E0(i10);
    }

    public void setRoundRadius(int i10) {
        this.f26292a.J0(i10);
        if (this.f26298s) {
            this.f26293b.J0(i10);
        }
        invalidate();
    }

    public final void t(int i10, int i11, int i12, int i13) {
        this.f26292a.K0(i10, i11, i12, i13);
        if (this.f26298s) {
            this.f26293b.K0(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void u(int i10, int i11) {
        this.f26294c = i10;
        this.d = i11;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26292a.t() && drawable != this.f26292a.S && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
