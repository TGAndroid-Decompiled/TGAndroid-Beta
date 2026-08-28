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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public class o9 extends View {
    public Path A;
    public ColorMatrixColorFilter B;
    public ImageReceiver f31328a;
    public ImageReceiver f31329b;
    public int f31330c;
    public int d;
    public k5 f31331e;
    public ColorFilter f31332f;
    public z8 h;
    public boolean f31333n;
    public boolean f31334r;
    public boolean f31335s;
    public boolean v;
    public boolean f31336w;
    public ValueAnimator f31337x;
    public nz0 f31338y;

    public o9(Context context) {
        super(context);
        this.f31330c = -1;
        this.d = -1;
        this.f31336w = true;
        ImageReceiver c10 = c();
        this.f31328a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f31328a.setAllowLoadingOnAttachedOnly(true);
        this.f31328a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f31334r && this.f31329b.getBitmap() == null && this.f31328a.getBitmap() != null && (bitmap = this.f31328a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f31329b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f31328a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f31334r) {
            if (this.f31329b.getBitmap() != null && !this.f31329b.getBitmap().isRecycled()) {
                this.f31329b.getBitmap().recycle();
            }
            this.f31329b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, z8 z8Var) {
        this.f31328a.setForUserOrChat(tLObject, z8Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public k5 getAnimatedEmojiDrawable() {
        return this.f31331e;
    }

    public z8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new z8((org.telegram.ui.ActionBar.b6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f31328a;
    }

    public int[] getRoundRadius() {
        return this.f31328a.getRoundRadius();
    }

    public final void h(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void i(ImageLocation imageLocation, String str, String str2, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, str2, 0, obj);
    }

    public final void j(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i9, Object obj) {
        m(imageLocation, str, imageLocation2, str2, null, null, i9, obj);
    }

    public final void k(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j10, String str3, Object obj, int i9) {
        this.f31328a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i9);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f31328a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i9, Object obj) {
        this.f31328a.setImage(imageLocation, str, imageLocation2, str2, drawable, i9, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(u51 u51Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i9, String str3) {
        if (u51Var != null) {
            this.f31328a.setImageBitmap(u51Var);
        } else {
            this.f31328a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i9, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31333n = true;
        if (this.f31336w) {
            this.f31328a.onAttachedToWindow();
        }
        if (this.f31335s) {
            this.f31329b.onAttachedToWindow();
        }
        k5 k5Var = this.f31331e;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31333n = false;
        if (this.f31336w) {
            this.f31328a.onDetachedFromWindow();
        }
        if (this.f31335s) {
            this.f31329b.onDetachedFromWindow();
        }
        k5 k5Var = this.f31331e;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i9;
        ColorFilter colorFilter;
        k5 k5Var = this.f31331e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        } else {
            imageReceiver = this.f31328a;
        }
        if (imageReceiver != null) {
            if (k5Var != null && (colorFilter = this.f31332f) != null) {
                k5Var.setColorFilter(colorFilter);
            }
            int i10 = this.f31330c;
            if (i10 != -1 && (i9 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i10, i9);
                    if (this.f31335s) {
                        this.f31329b.setImageCoords(0.0f, 0.0f, this.f31330c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i11 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f31330c) / 2, (height - i11) / 2, this.f31330c, i11);
                    if (this.f31335s) {
                        int height2 = getHeight();
                        int i12 = this.d;
                        this.f31329b.setImageCoords((getWidth() - this.f31330c) / 2, (height2 - i12) / 2, this.f31330c, i12);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f31335s) {
                    this.f31329b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f31335s) {
                this.f31329b.draw(canvas);
            }
        }
    }

    public final void p(int i9, int i10, boolean z10) {
        this.f31328a.setOrientation(i9, i10, true);
    }

    public final void q(int i9, boolean z10) {
        this.f31328a.setOrientation(0, true);
    }

    public final void r(int i9, int i10, int i11, int i12) {
        this.f31328a.setRoundRadius(i9, i10, i11, i12);
        if (this.f31335s) {
            this.f31329b.setRoundRadius(i9, i10, i11, i12);
        }
        invalidate();
    }

    public final void s(int i9, int i10) {
        this.f31330c = i9;
        this.d = i10;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        k5 k5Var2 = this.f31331e;
        if (k5Var2 == k5Var) {
            return;
        }
        if (this.f31333n && k5Var2 != null) {
            k5Var2.o(this);
        }
        this.f31331e = k5Var;
        if (this.f31333n && k5Var != null) {
            k5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f31328a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f31333n) {
            this.f31335s = z10;
            if (z10) {
                this.f31329b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f31338y = null;
            return;
        }
        this.f31338y = new nz0(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.B == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.B = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f31328a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f31332f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f31335s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f31334r = z10;
        if (!z10) {
            if (this.f31329b.getBitmap() != null && !this.f31329b.getBitmap().isRecycled()) {
                this.f31329b.getBitmap().recycle();
            }
            this.f31329b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f31328a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f31328a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i9) {
        this.f31328a.setImageBitmap(getResources().getDrawable(i9));
        invalidate();
        d();
    }

    public void setLayerNum(int i9) {
        this.f31328a.setLayerNum(i9);
    }

    public void setRoundRadius(int i9) {
        this.f31328a.setRoundRadius(i9);
        if (this.f31335s) {
            this.f31329b.setRoundRadius(i9);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31328a.getDrawable() && drawable != this.f31328a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
