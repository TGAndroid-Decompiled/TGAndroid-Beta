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
public class i9 extends View {
    public oy0 E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver f35508a;
    public ImageReceiver f35509b;
    public int f35510c;
    public int d;
    public g5 f35511e;
    public ColorFilter f35512f;
    public t8 h;
    public boolean f35513n;
    public boolean f35514r;
    public boolean f35515s;
    public boolean f35516w;
    public boolean f35517x;
    public ValueAnimator f35518y;

    public i9(Context context) {
        super(context);
        this.f35510c = -1;
        this.d = -1;
        this.f35517x = true;
        ImageReceiver c10 = c();
        this.f35508a = c10;
        c10.f22288o1 = 0.0f;
        c10.A1 = true;
        c10.f22276h1 = new s(this, 14);
    }

    public final void a() {
        Bitmap n10;
        if (this.f35514r && this.f35509b.n() == null && this.f35508a.n() != null && (n10 = this.f35508a.n()) != null && !n10.isRecycled()) {
            this.f35509b.v0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f35508a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void e() {
        if (this.f35514r) {
            if (this.f35509b.n() != null && !this.f35509b.n().isRecycled()) {
                this.f35509b.n().recycle();
            }
            this.f35509b.w0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, t8 t8Var) {
        this.f35508a.i0(tLObject, t8Var, null);
        e();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.gc gcVar, org.telegram.messenger.gc gcVar2) {
        this.f35508a.r0(gcVar, str, gcVar2, str2, null, j3, str3, obj, i7);
        e();
    }

    public g5 getAnimatedEmojiDrawable() {
        return this.f35511e;
    }

    public t8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new t8((org.telegram.ui.ActionBar.e6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f35508a;
    }

    public int[] getRoundRadius() {
        return this.f35508a.X0;
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
        this.f35508a.u0(gcVar, str, gcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        e();
    }

    public final void n(org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.f35508a.r0(gcVar, str, gcVar2, str2, drawable, i7, str3, obj, 0);
        e();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35513n = true;
        if (this.f35517x) {
            this.f35508a.P();
        }
        if (this.f35515s) {
            this.f35509b.P();
        }
        g5 g5Var = this.f35511e;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35513n = false;
        if (this.f35517x) {
            this.f35508a.R();
        }
        if (this.f35515s) {
            this.f35509b.R();
        }
        g5 g5Var = this.f35511e;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i7;
        ColorFilter colorFilter;
        g5 g5Var = this.f35511e;
        if (g5Var != null) {
            imageReceiver = g5Var.f34809k;
        } else {
            imageReceiver = this.f35508a;
        }
        if (imageReceiver != null) {
            if (g5Var != null && (colorFilter = this.f35512f) != null) {
                g5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f35510c;
            if (i10 != -1 && (i7 = this.d) != -1) {
                if (this.f35516w) {
                    imageReceiver.y0(0.0f, 0.0f, i10, i7);
                    if (this.f35515s) {
                        this.f35509b.y0(0.0f, 0.0f, this.f35510c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.y0((getWidth() - this.f35510c) / 2, (height - i11) / 2, this.f35510c, i11);
                    if (this.f35515s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f35509b.y0((getWidth() - this.f35510c) / 2, (height2 - i12) / 2, this.f35510c, i12);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f35515s) {
                    this.f35509b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f35515s) {
                this.f35509b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.gc gcVar, String str, Drawable drawable, Object obj) {
        n(gcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(g51 g51Var, org.telegram.messenger.gc gcVar, String str, org.telegram.messenger.gc gcVar2, org.telegram.messenger.gc gcVar3, String str2, int i7, String str3) {
        if (g51Var != null) {
            this.f35508a.w0(g51Var);
        } else {
            this.f35508a.u0(gcVar, str, gcVar2, null, gcVar3, str2, null, i7, null, str3, 1);
        }
        e();
    }

    public final void r() {
        this.f35508a.G0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z10) {
        this.f35508a.G0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(g5 g5Var) {
        g5 g5Var2 = this.f35511e;
        if (g5Var2 == g5Var) {
            return;
        }
        if (this.f35513n && g5Var2 != null) {
            g5Var2.n(this);
        }
        this.f35511e = g5Var;
        if (this.f35513n && g5Var != null) {
            g5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f35508a.S0 = z10;
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f35513n) {
            this.f35515s = z10;
            if (z10) {
                this.f35509b = new ImageReceiver(null);
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
        this.E = new oy0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35508a.f22290p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f35512f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f35515s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f35514r = z10;
        if (!z10) {
            if (this.f35509b.n() != null && !this.f35509b.n().isRecycled()) {
                this.f35509b.n().recycle();
            }
            this.f35509b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f35508a.v0(bitmap);
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f35508a.w0(drawable);
        e();
    }

    public void setImageResource(int i7) {
        this.f35508a.w0(getResources().getDrawable(i7));
        invalidate();
        e();
    }

    public void setLayerNum(int i7) {
        this.f35508a.E0(i7);
    }

    public void setRoundRadius(int i7) {
        this.f35508a.J0(i7);
        if (this.f35515s) {
            this.f35509b.J0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.f35508a.K0(i7, i10, i11, i12);
        if (this.f35515s) {
            this.f35509b.K0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.f35510c = i7;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35508a.t() && drawable != this.f35508a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
