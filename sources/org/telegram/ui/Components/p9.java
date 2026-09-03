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
public class p9 extends View {
    public Path B;
    public ColorMatrixColorFilter C;
    public ImageReceiver f27801a;
    public ImageReceiver f27802b;
    public int f27803c;
    public int d;
    public l5 e;
    public ColorFilter f27804f;
    public z8 h;
    public boolean f27805n;
    public boolean f27806r;
    public boolean f27807s;
    public boolean v;
    public boolean f27808w;
    public ValueAnimator f27809x;
    public k01 f27810y;

    public p9(Context context) {
        super(context);
        this.f27803c = -1;
        this.d = -1;
        this.f27808w = true;
        ImageReceiver c3 = c();
        this.f27801a = c3;
        c3.setCrossfadeByScale(0.0f);
        this.f27801a.setAllowLoadingOnAttachedOnly(true);
        this.f27801a.setDelegate(new t(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f27806r && this.f27802b.getBitmap() == null && this.f27801a.getBitmap() != null && (bitmap = this.f27801a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f27802b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f27801a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f27806r) {
            if (this.f27802b.getBitmap() != null && !this.f27802b.getBitmap().isRecycled()) {
                this.f27802b.getBitmap().recycle();
            }
            this.f27802b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, z8 z8Var) {
        this.f27801a.setForUserOrChat(tLObject, z8Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public l5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public z8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new z8((org.telegram.ui.ActionBar.f6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f27801a;
    }

    public int[] getRoundRadius() {
        return this.f27801a.getRoundRadius();
    }

    public final void h(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void i(ImageLocation imageLocation, String str, String str2, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, str2, 0, obj);
    }

    public final void j(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i10, Object obj) {
        m(imageLocation, str, imageLocation2, str2, null, null, i10, obj);
    }

    public final void k(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j10, String str3, Object obj, int i10) {
        this.f27801a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f27801a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f27801a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(s61 s61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (s61Var != null) {
            this.f27801a.setImageBitmap(s61Var);
        } else {
            this.f27801a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27805n = true;
        if (this.f27808w) {
            this.f27801a.onAttachedToWindow();
        }
        if (this.f27807s) {
            this.f27802b.onAttachedToWindow();
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27805n = false;
        if (this.f27808w) {
            this.f27801a.onDetachedFromWindow();
        }
        if (this.f27807s) {
            this.f27802b.onDetachedFromWindow();
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        l5 l5Var = this.e;
        if (l5Var != null) {
            imageReceiver = l5Var.f26587k;
        } else {
            imageReceiver = this.f27801a;
        }
        if (imageReceiver != null) {
            if (l5Var != null && (colorFilter = this.f27804f) != null) {
                l5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f27803c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f27807s) {
                        this.f27802b.setImageCoords(0.0f, 0.0f, this.f27803c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f27803c) / 2, (height - i12) / 2, this.f27803c, i12);
                    if (this.f27807s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f27802b.setImageCoords((getWidth() - this.f27803c) / 2, (height2 - i13) / 2, this.f27803c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f27807s) {
                    this.f27802b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f27807s) {
                this.f27802b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z4) {
        this.f27801a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z4) {
        this.f27801a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f27801a.setRoundRadius(i10, i11, i12, i13);
        if (this.f27807s) {
            this.f27802b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f27803c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(l5 l5Var) {
        l5 l5Var2 = this.e;
        if (l5Var2 == l5Var) {
            return;
        }
        if (this.f27805n && l5Var2 != null) {
            l5Var2.o(this);
        }
        this.e = l5Var;
        if (this.f27805n && l5Var != null) {
            l5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z4) {
        this.f27801a.setAspectFit(z4);
    }

    public void setBlurAllowed(boolean z4) {
        if (!this.f27805n) {
            this.f27807s = z4;
            if (z4) {
                this.f27802b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f27810y = null;
            return;
        }
        this.f27810y = new k01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.C == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.C = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27801a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f27804f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z4) {
        if (z4 && !this.f27807s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f27806r = z4;
        if (!z4) {
            if (this.f27802b.getBitmap() != null && !this.f27802b.getBitmap().isRecycled()) {
                this.f27802b.getBitmap().recycle();
            }
            this.f27802b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f27801a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f27801a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f27801a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f27801a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f27801a.setRoundRadius(i10);
        if (this.f27807s) {
            this.f27802b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27801a.getDrawable() && drawable != this.f27801a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
