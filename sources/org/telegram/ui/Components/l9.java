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
public class l9 extends View {
    public my0 D;
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f35582a;
    public ImageReceiver f35583b;
    public int f35584c;
    public int d;
    public i5 f35585e;
    public ColorFilter f35586f;
    public w8 h;
    public boolean f35587n;
    public boolean f35588r;
    public boolean f35589s;
    public boolean f35590w;
    public boolean f35591x;
    public ValueAnimator f35592y;

    public l9(Context context) {
        super(context);
        this.f35584c = -1;
        this.d = -1;
        this.f35591x = true;
        ImageReceiver c10 = c();
        this.f35582a = c10;
        c10.n1 = 0.0f;
        c10.f21233z1 = true;
        c10.f21192g1 = new u(this, 14);
    }

    public final void a() {
        Bitmap n10;
        if (this.f35588r && this.f35583b.n() == null && this.f35582a.n() != null && (n10 = this.f35582a.n()) != null && !n10.isRecycled()) {
            this.f35583b.v0(Utilities.D(n10, false));
            invalidate();
        }
    }

    public final void b() {
        this.f35582a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f35588r) {
            if (this.f35583b.n() != null && !this.f35583b.n().isRecycled()) {
                this.f35583b.n().recycle();
            }
            this.f35583b.w0(null);
            a();
        }
    }

    public final void e(TLObject tLObject, w8 w8Var) {
        this.f35582a.i0(tLObject, w8Var, null);
        d();
    }

    public final void g(int i7, long j3, Object obj, String str, String str2, String str3, org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2) {
        this.f35582a.r0(hcVar, str, hcVar2, str2, null, j3, str3, obj, i7);
        d();
    }

    public i5 getAnimatedEmojiDrawable() {
        return this.f35585e;
    }

    public w8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new w8((org.telegram.ui.ActionBar.f6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f35582a;
    }

    public int[] getRoundRadius() {
        return this.f35582a.W0;
    }

    public final void h(String str, String str2, Drawable drawable) {
        n(org.telegram.messenger.hc.g(str), str2, null, null, drawable, null, 0, null);
    }

    public final void j(org.telegram.messenger.hc hcVar, String str, Drawable drawable, Object obj) {
        n(hcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void k(org.telegram.messenger.hc hcVar, String str, String str2, Drawable drawable, Object obj) {
        n(hcVar, str, null, null, drawable, str2, 0, obj);
    }

    public final void l(org.telegram.messenger.hc hcVar, String str, org.telegram.messenger.hc hcVar2, String str2, int i7, Object obj) {
        n(hcVar, str, hcVar2, str2, null, null, i7, obj);
    }

    public final void m(org.telegram.messenger.hc hcVar, String str, org.telegram.messenger.hc hcVar2, String str2, Drawable drawable, Object obj) {
        this.f35582a.u0(hcVar, str, hcVar2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void n(org.telegram.messenger.hc hcVar, String str, org.telegram.messenger.hc hcVar2, String str2, Drawable drawable, String str3, int i7, Object obj) {
        this.f35582a.r0(hcVar, str, hcVar2, str2, drawable, i7, str3, obj, 0);
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35587n = true;
        if (this.f35591x) {
            this.f35582a.P();
        }
        if (this.f35589s) {
            this.f35583b.P();
        }
        i5 i5Var = this.f35585e;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35587n = false;
        if (this.f35591x) {
            this.f35582a.R();
        }
        if (this.f35589s) {
            this.f35583b.R();
        }
        i5 i5Var = this.f35585e;
        if (i5Var != null) {
            i5Var.n(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i7;
        ColorFilter colorFilter;
        i5 i5Var = this.f35585e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34497k;
        } else {
            imageReceiver = this.f35582a;
        }
        if (imageReceiver != null) {
            if (i5Var != null && (colorFilter = this.f35586f) != null) {
                i5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f35584c;
            if (i10 != -1 && (i7 = this.d) != -1) {
                if (this.f35590w) {
                    imageReceiver.y0(0.0f, 0.0f, i10, i7);
                    if (this.f35589s) {
                        this.f35583b.y0(0.0f, 0.0f, this.f35584c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.y0((getWidth() - this.f35584c) / 2, (height - i11) / 2, this.f35584c, i11);
                    if (this.f35589s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f35583b.y0((getWidth() - this.f35584c) / 2, (height2 - i12) / 2, this.f35584c, i12);
                    }
                }
            } else {
                imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f35589s) {
                    this.f35583b.y0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.f35589s) {
                this.f35583b.h(canvas, null);
            }
        }
    }

    public final void p(org.telegram.messenger.hc hcVar, String str, Drawable drawable, Object obj) {
        n(hcVar, str, null, null, drawable, null, 0, obj);
    }

    public final void q(d51 d51Var, org.telegram.messenger.hc hcVar, String str, org.telegram.messenger.hc hcVar2, org.telegram.messenger.hc hcVar3, String str2, int i7, String str3) {
        if (d51Var != null) {
            this.f35582a.w0(d51Var);
        } else {
            this.f35582a.u0(hcVar, str, hcVar2, null, hcVar3, str2, null, i7, null, str3, 1);
        }
        d();
    }

    public final void r() {
        this.f35582a.G0(0, 0, true);
    }

    public final void s(int i7, int i10, boolean z9) {
        this.f35582a.G0(i7, i10, true);
    }

    public void setAnimatedEmojiDrawable(i5 i5Var) {
        i5 i5Var2 = this.f35585e;
        if (i5Var2 == i5Var) {
            return;
        }
        if (this.f35587n && i5Var2 != null) {
            i5Var2.n(this);
        }
        this.f35585e = i5Var;
        if (this.f35587n && i5Var != null) {
            i5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z9) {
        this.f35582a.R0 = z9;
    }

    public void setBlurAllowed(boolean z9) {
        if (!this.f35587n) {
            this.f35589s = z9;
            if (z9) {
                this.f35583b = new ImageReceiver(null);
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
        this.D = new my0(charSequence, 16.5f, org.telegram.messenger.g0.o());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            org.telegram.messenger.g0.h(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35582a.f21206o1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f35586f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z9) {
        if (z9 && !this.f35589s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f35588r = z9;
        if (!z9) {
            if (this.f35583b.n() != null && !this.f35583b.n().isRecycled()) {
                this.f35583b.n().recycle();
            }
            this.f35583b.w0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f35582a.v0(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f35582a.w0(drawable);
        d();
    }

    public void setImageResource(int i7) {
        this.f35582a.w0(getResources().getDrawable(i7));
        invalidate();
        d();
    }

    public void setLayerNum(int i7) {
        this.f35582a.E0(i7);
    }

    public void setRoundRadius(int i7) {
        this.f35582a.J0(i7);
        if (this.f35589s) {
            this.f35583b.J0(i7);
        }
        invalidate();
    }

    public final void t(int i7, int i10, int i11, int i12) {
        this.f35582a.K0(i7, i10, i11, i12);
        if (this.f35589s) {
            this.f35583b.K0(i7, i10, i11, i12);
        }
        invalidate();
    }

    public final void u(int i7, int i10) {
        this.f35584c = i7;
        this.d = i10;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35582a.t() && drawable != this.f35582a.S && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
