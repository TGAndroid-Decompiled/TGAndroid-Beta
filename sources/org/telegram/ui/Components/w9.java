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
public class w9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f28728a;
    public ImageReceiver f28729b;
    public int f28730c;
    public int d;
    public p5 e;
    public ColorFilter f28731f;
    public g9 h;
    public boolean f28732n;
    public boolean f28733r;
    public boolean f28734s;
    public boolean v;
    public boolean f28735w;
    public ValueAnimator f28736x;
    public t01 f28737y;

    public w9(Context context) {
        super(context);
        this.f28730c = -1;
        this.d = -1;
        this.f28735w = true;
        ImageReceiver c10 = c();
        this.f28728a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f28728a.setAllowLoadingOnAttachedOnly(true);
        this.f28728a.setDelegate(new t(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f28733r && this.f28729b.getBitmap() == null && this.f28728a.getBitmap() != null && (bitmap = this.f28728a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f28729b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f28728a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f28733r) {
            if (this.f28729b.getBitmap() != null && !this.f28729b.getBitmap().isRecycled()) {
                this.f28729b.getBitmap().recycle();
            }
            this.f28729b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, g9 g9Var) {
        this.f28728a.setForUserOrChat(tLObject, g9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public p5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public g9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new g9((org.telegram.ui.ActionBar.f6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f28728a;
    }

    public int[] getRoundRadius() {
        return this.f28728a.getRoundRadius();
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

    public final void k(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j3, String str3, Object obj, int i10) {
        this.f28728a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f28728a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f28728a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(d71 d71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (d71Var != null) {
            this.f28728a.setImageBitmap(d71Var);
        } else {
            this.f28728a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28732n = true;
        if (this.f28735w) {
            this.f28728a.onAttachedToWindow();
        }
        if (this.f28734s) {
            this.f28729b.onAttachedToWindow();
        }
        p5 p5Var = this.e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28732n = false;
        if (this.f28735w) {
            this.f28728a.onDetachedFromWindow();
        }
        if (this.f28734s) {
            this.f28729b.onDetachedFromWindow();
        }
        p5 p5Var = this.e;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        p5 p5Var = this.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        } else {
            imageReceiver = this.f28728a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f28731f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f28730c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f28734s) {
                        this.f28729b.setImageCoords(0.0f, 0.0f, this.f28730c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f28730c) / 2, (height - i12) / 2, this.f28730c, i12);
                    if (this.f28734s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f28729b.setImageCoords((getWidth() - this.f28730c) / 2, (height2 - i13) / 2, this.f28730c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f28734s) {
                    this.f28729b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f28734s) {
                this.f28729b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f28728a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f28728a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f28728a.setRoundRadius(i10, i11, i12, i13);
        if (this.f28734s) {
            this.f28729b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f28730c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f28732n && p5Var2 != null) {
            p5Var2.o(this);
        }
        this.e = p5Var;
        if (this.f28732n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f28728a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f28732n) {
            this.f28734s = z10;
            if (z10) {
                this.f28729b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f28737y = null;
            return;
        }
        this.f28737y = new t01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28728a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f28731f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f28734s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f28733r = z10;
        if (!z10) {
            if (this.f28729b.getBitmap() != null && !this.f28729b.getBitmap().isRecycled()) {
                this.f28729b.getBitmap().recycle();
            }
            this.f28729b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f28728a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f28728a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f28728a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f28728a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f28728a.setRoundRadius(i10);
        if (this.f28734s) {
            this.f28729b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28728a.getDrawable() && drawable != this.f28728a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
