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
public class x9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f32477a;
    public ImageReceiver f32478b;
    public int f32479c;
    public int d;
    public q5 f32480e;
    public ColorFilter f32481f;
    public i9 h;
    public boolean f32482n;
    public boolean f32483r;
    public boolean f32484s;
    public boolean v;
    public boolean f32485w;
    public ValueAnimator f32486x;
    public f01 f32487y;

    public x9(Context context) {
        super(context);
        this.f32479c = -1;
        this.d = -1;
        this.f32485w = true;
        ImageReceiver c10 = c();
        this.f32477a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f32477a.setAllowLoadingOnAttachedOnly(true);
        this.f32477a.setDelegate(new t(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f32483r && this.f32478b.getBitmap() == null && this.f32477a.getBitmap() != null && (bitmap = this.f32477a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f32478b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f32477a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f32483r) {
            if (this.f32478b.getBitmap() != null && !this.f32478b.getBitmap().isRecycled()) {
                this.f32478b.getBitmap().recycle();
            }
            this.f32478b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, i9 i9Var) {
        this.f32477a.setForUserOrChat(tLObject, i9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public q5 getAnimatedEmojiDrawable() {
        return this.f32480e;
    }

    public i9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new i9((org.telegram.ui.ActionBar.f6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32477a;
    }

    public int[] getRoundRadius() {
        return this.f32477a.getRoundRadius();
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
        this.f32477a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f32477a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f32477a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(q61 q61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (q61Var != null) {
            this.f32477a.setImageBitmap(q61Var);
        } else {
            this.f32477a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32482n = true;
        if (this.f32485w) {
            this.f32477a.onAttachedToWindow();
        }
        if (this.f32484s) {
            this.f32478b.onAttachedToWindow();
        }
        q5 q5Var = this.f32480e;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32482n = false;
        if (this.f32485w) {
            this.f32477a.onDetachedFromWindow();
        }
        if (this.f32484s) {
            this.f32478b.onDetachedFromWindow();
        }
        q5 q5Var = this.f32480e;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        q5 q5Var = this.f32480e;
        if (q5Var != null) {
            imageReceiver = q5Var.f29585k;
        } else {
            imageReceiver = this.f32477a;
        }
        if (imageReceiver != null) {
            if (q5Var != null && (colorFilter = this.f32481f) != null) {
                q5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f32479c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f32484s) {
                        this.f32478b.setImageCoords(0.0f, 0.0f, this.f32479c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f32479c) / 2, (height - i12) / 2, this.f32479c, i12);
                    if (this.f32484s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f32478b.setImageCoords((getWidth() - this.f32479c) / 2, (height2 - i13) / 2, this.f32479c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f32484s) {
                    this.f32478b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f32484s) {
                this.f32478b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f32477a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f32477a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f32477a.setRoundRadius(i10, i11, i12, i13);
        if (this.f32484s) {
            this.f32478b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f32479c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(q5 q5Var) {
        q5 q5Var2 = this.f32480e;
        if (q5Var2 == q5Var) {
            return;
        }
        if (this.f32482n && q5Var2 != null) {
            q5Var2.o(this);
        }
        this.f32480e = q5Var;
        if (this.f32482n && q5Var != null) {
            q5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f32477a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f32482n) {
            this.f32484s = z10;
            if (z10) {
                this.f32478b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32487y = null;
            return;
        }
        this.f32487y = new f01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f32477a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f32481f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f32484s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f32483r = z10;
        if (!z10) {
            if (this.f32478b.getBitmap() != null && !this.f32478b.getBitmap().isRecycled()) {
                this.f32478b.getBitmap().recycle();
            }
            this.f32478b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f32477a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f32477a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f32477a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f32477a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f32477a.setRoundRadius(i10);
        if (this.f32484s) {
            this.f32478b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32477a.getDrawable() && drawable != this.f32477a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
