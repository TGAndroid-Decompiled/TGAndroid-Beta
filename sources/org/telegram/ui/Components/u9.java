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
public class u9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f28314a;
    public ImageReceiver f28315b;
    public int f28316c;
    public int d;
    public o5 e;
    public ColorFilter f28317f;
    public f9 h;
    public boolean f28318n;
    public boolean f28319r;
    public boolean f28320s;
    public boolean v;
    public boolean f28321w;
    public ValueAnimator f28322x;
    public g01 f28323y;

    public u9(Context context) {
        super(context);
        this.f28316c = -1;
        this.d = -1;
        this.f28321w = true;
        ImageReceiver c10 = c();
        this.f28314a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f28314a.setAllowLoadingOnAttachedOnly(true);
        this.f28314a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f28319r && this.f28315b.getBitmap() == null && this.f28314a.getBitmap() != null && (bitmap = this.f28314a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f28315b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f28314a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f28319r) {
            if (this.f28315b.getBitmap() != null && !this.f28315b.getBitmap().isRecycled()) {
                this.f28315b.getBitmap().recycle();
            }
            this.f28315b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, f9 f9Var) {
        this.f28314a.setForUserOrChat(tLObject, f9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public o5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public f9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new f9((org.telegram.ui.ActionBar.e6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f28314a;
    }

    public int[] getRoundRadius() {
        return this.f28314a.getRoundRadius();
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
        this.f28314a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f28314a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f28314a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(q61 q61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (q61Var != null) {
            this.f28314a.setImageBitmap(q61Var);
        } else {
            this.f28314a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28318n = true;
        if (this.f28321w) {
            this.f28314a.onAttachedToWindow();
        }
        if (this.f28320s) {
            this.f28315b.onAttachedToWindow();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28318n = false;
        if (this.f28321w) {
            this.f28314a.onDetachedFromWindow();
        }
        if (this.f28320s) {
            this.f28315b.onDetachedFromWindow();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        o5 o5Var = this.e;
        if (o5Var != null) {
            imageReceiver = o5Var.f26692k;
        } else {
            imageReceiver = this.f28314a;
        }
        if (imageReceiver != null) {
            if (o5Var != null && (colorFilter = this.f28317f) != null) {
                o5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f28316c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f28320s) {
                        this.f28315b.setImageCoords(0.0f, 0.0f, this.f28316c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f28316c) / 2, (height - i12) / 2, this.f28316c, i12);
                    if (this.f28320s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f28315b.setImageCoords((getWidth() - this.f28316c) / 2, (height2 - i13) / 2, this.f28316c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f28320s) {
                    this.f28315b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f28320s) {
                this.f28315b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f28314a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f28314a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f28314a.setRoundRadius(i10, i11, i12, i13);
        if (this.f28320s) {
            this.f28315b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f28316c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(o5 o5Var) {
        o5 o5Var2 = this.e;
        if (o5Var2 == o5Var) {
            return;
        }
        if (this.f28318n && o5Var2 != null) {
            o5Var2.o(this);
        }
        this.e = o5Var;
        if (this.f28318n && o5Var != null) {
            o5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f28314a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f28318n) {
            this.f28320s = z10;
            if (z10) {
                this.f28315b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f28323y = null;
            return;
        }
        this.f28323y = new g01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28314a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f28317f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f28320s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f28319r = z10;
        if (!z10) {
            if (this.f28315b.getBitmap() != null && !this.f28315b.getBitmap().isRecycled()) {
                this.f28315b.getBitmap().recycle();
            }
            this.f28315b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f28314a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f28314a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f28314a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f28314a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f28314a.setRoundRadius(i10);
        if (this.f28320s) {
            this.f28315b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28314a.getDrawable() && drawable != this.f28314a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
