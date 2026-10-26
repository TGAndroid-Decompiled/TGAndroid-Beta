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
public class y9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f34984a;
    public ImageReceiver f34985b;
    public int f34986c;
    public int d;
    public t5 e;
    public ColorFilter f34987f;
    public j9 h;
    public boolean f34988n;
    public boolean f34989r;
    public boolean f34990s;
    public boolean v;
    public boolean f34991w;
    public ValueAnimator f34992x;
    public q11 f34993y;

    public y9(Context context) {
        super(context);
        this.f34986c = -1;
        this.d = -1;
        this.f34991w = true;
        ImageReceiver c10 = c();
        this.f34984a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f34984a.setAllowLoadingOnAttachedOnly(true);
        this.f34984a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f34989r && this.f34985b.getBitmap() == null && this.f34984a.getBitmap() != null && (bitmap = this.f34984a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f34985b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f34984a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f34989r) {
            if (this.f34985b.getBitmap() != null && !this.f34985b.getBitmap().isRecycled()) {
                this.f34985b.getBitmap().recycle();
            }
            this.f34985b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void f(TLObject tLObject, j9 j9Var) {
        this.f34984a.setForUserOrChat(tLObject, j9Var);
        d();
    }

    public final void g(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public t5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public j9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new j9((org.telegram.ui.ActionBar.u6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f34984a;
    }

    public int[] getRoundRadius() {
        return this.f34984a.getRoundRadius();
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
        this.f34984a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f34984a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f34984a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(d81 d81Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (d81Var != null) {
            this.f34984a.setImageBitmap(d81Var);
        } else {
            this.f34984a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34988n = true;
        if (this.f34991w) {
            this.f34984a.onAttachedToWindow();
        }
        if (this.f34990s) {
            this.f34985b.onAttachedToWindow();
        }
        t5 t5Var = this.e;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34988n = false;
        if (this.f34991w) {
            this.f34984a.onDetachedFromWindow();
        }
        if (this.f34990s) {
            this.f34985b.onDetachedFromWindow();
        }
        t5 t5Var = this.e;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        t5 t5Var = this.e;
        if (t5Var != null) {
            imageReceiver = t5Var.f32852k;
        } else {
            imageReceiver = this.f34984a;
        }
        if (imageReceiver != null) {
            if (t5Var != null && (colorFilter = this.f34987f) != null) {
                t5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f34986c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f34990s) {
                        this.f34985b.setImageCoords(0.0f, 0.0f, this.f34986c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f34986c) / 2, (height - i12) / 2, this.f34986c, i12);
                    if (this.f34990s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f34985b.setImageCoords((getWidth() - this.f34986c) / 2, (height2 - i13) / 2, this.f34986c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f34990s) {
                    this.f34985b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f34990s) {
                this.f34985b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f34984a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f34984a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f34984a.setRoundRadius(i10, i11, i12, i13);
        if (this.f34990s) {
            this.f34985b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f34986c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(t5 t5Var) {
        t5 t5Var2 = this.e;
        if (t5Var2 == t5Var) {
            return;
        }
        if (this.f34988n && t5Var2 != null) {
            t5Var2.o(this);
        }
        this.e = t5Var;
        if (this.f34988n && t5Var != null) {
            t5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f34984a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f34988n) {
            this.f34990s = z10;
            if (z10) {
                this.f34985b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f34993y = null;
            return;
        }
        this.f34993y = new q11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f34984a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f34987f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f34990s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f34989r = z10;
        if (!z10) {
            if (this.f34985b.getBitmap() != null && !this.f34985b.getBitmap().isRecycled()) {
                this.f34985b.getBitmap().recycle();
            }
            this.f34985b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f34984a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f34984a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f34984a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f34984a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f34984a.setRoundRadius(i10);
        if (this.f34990s) {
            this.f34985b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34984a.getDrawable() && drawable != this.f34984a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
