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
public class t9 extends View {
    public Path A;
    public ColorMatrixColorFilter B;
    public ImageReceiver f32903a;
    public ImageReceiver f32904b;
    public int f32905c;
    public int d;
    public p5 f32906e;
    public ColorFilter f32907f;
    public e9 h;
    public boolean f32908n;
    public boolean f32909r;
    public boolean f32910s;
    public boolean v;
    public boolean f32911w;
    public ValueAnimator f32912x;
    public zz0 f32913y;

    public t9(Context context) {
        super(context);
        this.f32905c = -1;
        this.d = -1;
        this.f32911w = true;
        ImageReceiver c3 = c();
        this.f32903a = c3;
        c3.setCrossfadeByScale(0.0f);
        this.f32903a.setAllowLoadingOnAttachedOnly(true);
        this.f32903a.setDelegate(new u(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f32909r && this.f32904b.getBitmap() == null && this.f32903a.getBitmap() != null && (bitmap = this.f32903a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f32904b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f32903a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f32909r) {
            if (this.f32904b.getBitmap() != null && !this.f32904b.getBitmap().isRecycled()) {
                this.f32904b.getBitmap().recycle();
            }
            this.f32904b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, e9 e9Var) {
        this.f32903a.setForUserOrChat(tLObject, e9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public p5 getAnimatedEmojiDrawable() {
        return this.f32906e;
    }

    public e9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new e9((org.telegram.ui.ActionBar.c6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32903a;
    }

    public int[] getRoundRadius() {
        return this.f32903a.getRoundRadius();
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
        this.f32903a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f32903a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f32903a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(h61 h61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (h61Var != null) {
            this.f32903a.setImageBitmap(h61Var);
        } else {
            this.f32903a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32908n = true;
        if (this.f32911w) {
            this.f32903a.onAttachedToWindow();
        }
        if (this.f32910s) {
            this.f32904b.onAttachedToWindow();
        }
        p5 p5Var = this.f32906e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32908n = false;
        if (this.f32911w) {
            this.f32903a.onDetachedFromWindow();
        }
        if (this.f32910s) {
            this.f32904b.onDetachedFromWindow();
        }
        p5 p5Var = this.f32906e;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        p5 p5Var = this.f32906e;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        } else {
            imageReceiver = this.f32903a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f32907f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f32905c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f32910s) {
                        this.f32904b.setImageCoords(0.0f, 0.0f, this.f32905c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f32905c) / 2, (height - i12) / 2, this.f32905c, i12);
                    if (this.f32910s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f32904b.setImageCoords((getWidth() - this.f32905c) / 2, (height2 - i13) / 2, this.f32905c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f32910s) {
                    this.f32904b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f32910s) {
                this.f32904b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f32903a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f32903a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f32903a.setRoundRadius(i10, i11, i12, i13);
        if (this.f32910s) {
            this.f32904b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f32905c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.f32906e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f32908n && p5Var2 != null) {
            p5Var2.o(this);
        }
        this.f32906e = p5Var;
        if (this.f32908n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f32903a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f32908n) {
            this.f32910s = z10;
            if (z10) {
                this.f32904b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32913y = null;
            return;
        }
        this.f32913y = new zz0(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.B == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.B = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f32903a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f32907f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f32910s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f32909r = z10;
        if (!z10) {
            if (this.f32904b.getBitmap() != null && !this.f32904b.getBitmap().isRecycled()) {
                this.f32904b.getBitmap().recycle();
            }
            this.f32904b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f32903a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f32903a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f32903a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f32903a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f32903a.setRoundRadius(i10);
        if (this.f32910s) {
            this.f32904b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32903a.getDrawable() && drawable != this.f32903a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
