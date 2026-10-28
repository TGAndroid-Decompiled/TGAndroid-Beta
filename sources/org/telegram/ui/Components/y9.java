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
    public ImageReceiver f35004a;
    public ImageReceiver f35005b;
    public int f35006c;
    public int d;
    public t5 e;
    public ColorFilter f35007f;
    public j9 h;
    public boolean f35008n;
    public boolean f35009r;
    public boolean f35010s;
    public boolean v;
    public boolean f35011w;
    public ValueAnimator f35012x;
    public r11 f35013y;

    public y9(Context context) {
        super(context);
        this.f35006c = -1;
        this.d = -1;
        this.f35011w = true;
        ImageReceiver c10 = c();
        this.f35004a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f35004a.setAllowLoadingOnAttachedOnly(true);
        this.f35004a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f35009r && this.f35005b.getBitmap() == null && this.f35004a.getBitmap() != null && (bitmap = this.f35004a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f35005b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f35004a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f35009r) {
            if (this.f35005b.getBitmap() != null && !this.f35005b.getBitmap().isRecycled()) {
                this.f35005b.getBitmap().recycle();
            }
            this.f35005b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void f(TLObject tLObject, j9 j9Var) {
        this.f35004a.setForUserOrChat(tLObject, j9Var);
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
        return this.f35004a;
    }

    public int[] getRoundRadius() {
        return this.f35004a.getRoundRadius();
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
        this.f35004a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f35004a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f35004a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(e81 e81Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (e81Var != null) {
            this.f35004a.setImageBitmap(e81Var);
        } else {
            this.f35004a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35008n = true;
        if (this.f35011w) {
            this.f35004a.onAttachedToWindow();
        }
        if (this.f35010s) {
            this.f35005b.onAttachedToWindow();
        }
        t5 t5Var = this.e;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35008n = false;
        if (this.f35011w) {
            this.f35004a.onDetachedFromWindow();
        }
        if (this.f35010s) {
            this.f35005b.onDetachedFromWindow();
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
            imageReceiver = t5Var.f32860k;
        } else {
            imageReceiver = this.f35004a;
        }
        if (imageReceiver != null) {
            if (t5Var != null && (colorFilter = this.f35007f) != null) {
                t5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f35006c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f35010s) {
                        this.f35005b.setImageCoords(0.0f, 0.0f, this.f35006c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f35006c) / 2, (height - i12) / 2, this.f35006c, i12);
                    if (this.f35010s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f35005b.setImageCoords((getWidth() - this.f35006c) / 2, (height2 - i13) / 2, this.f35006c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f35010s) {
                    this.f35005b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f35010s) {
                this.f35005b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f35004a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f35004a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f35004a.setRoundRadius(i10, i11, i12, i13);
        if (this.f35010s) {
            this.f35005b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f35006c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(t5 t5Var) {
        t5 t5Var2 = this.e;
        if (t5Var2 == t5Var) {
            return;
        }
        if (this.f35008n && t5Var2 != null) {
            t5Var2.o(this);
        }
        this.e = t5Var;
        if (this.f35008n && t5Var != null) {
            t5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f35004a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f35008n) {
            this.f35010s = z10;
            if (z10) {
                this.f35005b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f35013y = null;
            return;
        }
        this.f35013y = new r11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35004a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f35007f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f35010s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f35009r = z10;
        if (!z10) {
            if (this.f35005b.getBitmap() != null && !this.f35005b.getBitmap().isRecycled()) {
                this.f35005b.getBitmap().recycle();
            }
            this.f35005b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f35004a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f35004a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f35004a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f35004a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f35004a.setRoundRadius(i10);
        if (this.f35010s) {
            this.f35005b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f35004a.getDrawable() && drawable != this.f35004a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
