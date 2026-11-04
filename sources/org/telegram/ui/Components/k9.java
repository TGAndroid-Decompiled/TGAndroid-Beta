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
public class k9 extends View {
    public ly0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver f35342a;
    public ImageReceiver f35343b;
    public int f35344c;
    public int d;
    public g5 f35345e;
    public ColorFilter f35346f;
    public u8 h;
    public boolean f35347n;
    public boolean f35348r;
    public boolean f35349s;
    public boolean f35350w;
    public boolean f35351x;
    public ValueAnimator f35352y;

    public k9(Context context) {
        super(context);
        this.f35344c = -1;
        this.d = -1;
        this.f35351x = true;
        ImageReceiver c2 = c();
        this.f35342a = c2;
        c2.f21259o1 = 0.0f;
        c2.A1 = true;
        c2.f21247h1 = new t(this, 14);
    }

    public final void a() {
        Bitmap n4;
        if (this.f35348r && this.f35343b.n() == null && this.f35342a.n() != null && (n4 = this.f35342a.n()) != null && !n4.isRecycled()) {
            this.f35343b.v0(Utilities.D(n4, false));
            invalidate();
        }
    }

    public final void b() {
        this.f35342a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f35348r) {
            if (this.f35343b.n() != null && !this.f35343b.n().isRecycled()) {
                this.f35343b.n().recycle();
            }
            this.f35343b.w0(null);
            a();
        }
    }

    public final void e(TLObject tLObject, u8 u8Var) {
        this.f35342a.i0(tLObject, u8Var, null);
        d();
    }

    public final void g(int i3, long j10, Object obj, String str, String str2, String str3, org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2) {
        this.f35342a.r0(acVar, str, acVar2, str2, null, j10, str3, obj, i3);
        d();
    }

    public g5 getAnimatedEmojiDrawable() {
        return this.f35345e;
    }

    public u8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new u8((org.telegram.ui.ActionBar.e6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f35342a;
    }

    public int[] getRoundRadius() {
        return this.f35342a.X0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        n(org.telegram.messenger.ac.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.ac acVar, String str, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.ac acVar, String str, String str2, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, int i3, Object obj) {
        n(acVar, str, acVar2, str2, null, null, i3, obj);
    }

    public final void m(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, Drawable drawable, Object obj) {
        this.f35342a.u0(acVar, str, acVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void n(org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, String str2, Drawable drawable, String str3, int i3, Object obj) {
        this.f35342a.r0(acVar, str, acVar2, str2, drawable, i3, str3, obj, 0);
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35347n = true;
        if (this.f35351x) {
            this.f35342a.P();
        }
        if (this.f35349s) {
            this.f35343b.P();
        }
        g5 g5Var = this.f35345e;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35347n = false;
        if (this.f35351x) {
            this.f35342a.R();
        }
        if (this.f35349s) {
            this.f35343b.R();
        }
        g5 g5Var = this.f35345e;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i3;
        ColorFilter colorFilter;
        g5 g5Var = this.f35345e;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        } else {
            imageReceiver = this.f35342a;
        }
        if (imageReceiver != null) {
            if (g5Var != null && (colorFilter = this.f35346f) != null) {
                g5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f35344c;
            if (i10 != -1 && (i3 = this.d) != -1) {
                if (this.f35350w) {
                    imageReceiver.y0(0.0f, 0.0f, i10, i3);
                    if (this.f35349s) {
                        this.f35343b.y0(0.0f, 0.0f, this.f35344c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.y0((getWidth() - this.f35344c) / 2, (height - i11) / 2, this.f35344c, i11);
                    if (this.f35349s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f35343b.y0((getWidth() - this.f35344c) / 2, (height2 - i12) / 2, this.f35344c, i12);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f35349s) {
                    this.f35343b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f35349s) {
                this.f35343b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.ac acVar, String str, Drawable drawable, Object obj) {
        n(acVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(x41 x41Var, org.telegram.messenger.ac acVar, String str, org.telegram.messenger.ac acVar2, org.telegram.messenger.ac acVar3, String str2, int i3, String str3) {
        if (x41Var != null) {
            this.f35342a.w0(x41Var);
        } else {
            this.f35342a.u0(acVar, str, acVar2, null, acVar3, str2, null, i3, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.f35342a.G0(0, 0, true);
    }

    public final void s(int i3, int i10, boolean z10) {
        this.f35342a.G0(i3, i10, true);
    }

    public void setAnimatedEmojiDrawable(g5 g5Var) {
        g5 g5Var2 = this.f35345e;
        if (g5Var2 == g5Var) {
            return;
        }
        if (this.f35347n && g5Var2 != null) {
            g5Var2.n(this);
        }
        this.f35345e = g5Var;
        if (this.f35347n && g5Var != null) {
            g5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f35342a.S0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f35347n) {
            this.f35349s = z10;
            if (z10) {
                this.f35343b = new ImageReceiver(null);
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
        this.E = new ly0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35342a.f21261p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f35346f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f35349s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f35348r = z10;
        if (!z10) {
            if (this.f35343b.n() != null && !this.f35343b.n().isRecycled()) {
                this.f35343b.n().recycle();
            }
            this.f35343b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f35342a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f35342a.w0(drawable);
        d();
    }

    public void setImageResource(int i3) {
        this.f35342a.w0(getResources().getDrawable(i3));
        invalidate();
        d();
    }

    public void setLayerNum(int i3) {
        this.f35342a.E0(i3);
    }

    public void setRoundRadius(int i3) {
        this.f35342a.J0(i3);
        if (this.f35349s) {
            this.f35343b.J0(i3);
        }
        invalidate();
    }

    public final void t(int i3, int i10, int i11, int i12) {
        this.f35342a.K0(i3, i10, i11, i12);
        if (this.f35349s) {
            this.f35343b.K0(i3, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i3, int i10) {
        this.f35344c = i3;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35342a.t() && drawable != this.f35342a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
