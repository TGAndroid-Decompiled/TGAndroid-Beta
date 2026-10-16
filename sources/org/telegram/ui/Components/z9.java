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
public class z9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f31507a;
    public ImageReceiver f31508b;
    public int f31509c;
    public int d;
    public s5 e;
    public ColorFilter f31510f;
    public k9 h;
    public boolean f31511n;
    public boolean f31512r;
    public boolean f31513s;
    public boolean v;
    public boolean f31514w;
    public ValueAnimator f31515x;
    public i11 f31516y;

    public z9(Context context) {
        super(context);
        this.f31509c = -1;
        this.d = -1;
        this.f31514w = true;
        ImageReceiver c10 = c();
        this.f31507a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f31507a.setAllowLoadingOnAttachedOnly(true);
        this.f31507a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f31512r && this.f31508b.getBitmap() == null && this.f31507a.getBitmap() != null && (bitmap = this.f31507a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f31508b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f31507a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f31512r) {
            if (this.f31508b.getBitmap() != null && !this.f31508b.getBitmap().isRecycled()) {
                this.f31508b.getBitmap().recycle();
            }
            this.f31508b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, k9 k9Var) {
        this.f31507a.setForUserOrChat(tLObject, k9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public s5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public k9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new k9((org.telegram.ui.ActionBar.c6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f31507a;
    }

    public int[] getRoundRadius() {
        return this.f31507a.getRoundRadius();
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
        this.f31507a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f31507a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f31507a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(t71 t71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (t71Var != null) {
            this.f31507a.setImageBitmap(t71Var);
        } else {
            this.f31507a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31511n = true;
        if (this.f31514w) {
            this.f31507a.onAttachedToWindow();
        }
        if (this.f31513s) {
            this.f31508b.onAttachedToWindow();
        }
        s5 s5Var = this.e;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31511n = false;
        if (this.f31514w) {
            this.f31507a.onDetachedFromWindow();
        }
        if (this.f31513s) {
            this.f31508b.onDetachedFromWindow();
        }
        s5 s5Var = this.e;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        s5 s5Var = this.e;
        if (s5Var != null) {
            imageReceiver = s5Var.f28739k;
        } else {
            imageReceiver = this.f31507a;
        }
        if (imageReceiver != null) {
            if (s5Var != null && (colorFilter = this.f31510f) != null) {
                s5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f31509c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f31513s) {
                        this.f31508b.setImageCoords(0.0f, 0.0f, this.f31509c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f31509c) / 2, (height - i12) / 2, this.f31509c, i12);
                    if (this.f31513s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f31508b.setImageCoords((getWidth() - this.f31509c) / 2, (height2 - i13) / 2, this.f31509c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f31513s) {
                    this.f31508b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f31513s) {
                this.f31508b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f31507a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f31507a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f31507a.setRoundRadius(i10, i11, i12, i13);
        if (this.f31513s) {
            this.f31508b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f31509c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(s5 s5Var) {
        s5 s5Var2 = this.e;
        if (s5Var2 == s5Var) {
            return;
        }
        if (this.f31511n && s5Var2 != null) {
            s5Var2.o(this);
        }
        this.e = s5Var;
        if (this.f31511n && s5Var != null) {
            s5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f31507a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f31511n) {
            this.f31513s = z10;
            if (z10) {
                this.f31508b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f31516y = null;
            return;
        }
        this.f31516y = new i11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f31507a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f31510f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f31513s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f31512r = z10;
        if (!z10) {
            if (this.f31508b.getBitmap() != null && !this.f31508b.getBitmap().isRecycled()) {
                this.f31508b.getBitmap().recycle();
            }
            this.f31508b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f31507a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f31507a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f31507a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f31507a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f31507a.setRoundRadius(i10);
        if (this.f31513s) {
            this.f31508b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31507a.getDrawable() && drawable != this.f31507a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
