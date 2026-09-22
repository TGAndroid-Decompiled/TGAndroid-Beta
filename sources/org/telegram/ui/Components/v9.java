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
public class v9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f29034a;
    public ImageReceiver f29035b;
    public int f29036c;
    public int d;
    public p5 e;
    public ColorFilter f29037f;
    public g9 h;
    public boolean f29038n;
    public boolean f29039r;
    public boolean f29040s;
    public boolean v;
    public boolean f29041w;
    public ValueAnimator f29042x;
    public w01 f29043y;

    public v9(Context context) {
        super(context);
        this.f29036c = -1;
        this.d = -1;
        this.f29041w = true;
        ImageReceiver c10 = c();
        this.f29034a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f29034a.setAllowLoadingOnAttachedOnly(true);
        this.f29034a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f29039r && this.f29035b.getBitmap() == null && this.f29034a.getBitmap() != null && (bitmap = this.f29034a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f29035b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f29034a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f29039r) {
            if (this.f29035b.getBitmap() != null && !this.f29035b.getBitmap().isRecycled()) {
                this.f29035b.getBitmap().recycle();
            }
            this.f29035b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, g9 g9Var) {
        this.f29034a.setForUserOrChat(tLObject, g9Var);
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
        return this.f29034a;
    }

    public int[] getRoundRadius() {
        return this.f29034a.getRoundRadius();
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
        this.f29034a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f29034a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f29034a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(g71 g71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (g71Var != null) {
            this.f29034a.setImageBitmap(g71Var);
        } else {
            this.f29034a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29038n = true;
        if (this.f29041w) {
            this.f29034a.onAttachedToWindow();
        }
        if (this.f29040s) {
            this.f29035b.onAttachedToWindow();
        }
        p5 p5Var = this.e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29038n = false;
        if (this.f29041w) {
            this.f29034a.onDetachedFromWindow();
        }
        if (this.f29040s) {
            this.f29035b.onDetachedFromWindow();
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
            imageReceiver = p5Var.f27256k;
        } else {
            imageReceiver = this.f29034a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f29037f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f29036c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f29040s) {
                        this.f29035b.setImageCoords(0.0f, 0.0f, this.f29036c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f29036c) / 2, (height - i12) / 2, this.f29036c, i12);
                    if (this.f29040s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f29035b.setImageCoords((getWidth() - this.f29036c) / 2, (height2 - i13) / 2, this.f29036c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f29040s) {
                    this.f29035b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f29040s) {
                this.f29035b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f29034a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f29034a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f29034a.setRoundRadius(i10, i11, i12, i13);
        if (this.f29040s) {
            this.f29035b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f29036c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f29038n && p5Var2 != null) {
            p5Var2.o(this);
        }
        this.e = p5Var;
        if (this.f29038n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f29034a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f29038n) {
            this.f29040s = z10;
            if (z10) {
                this.f29035b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f29043y = null;
            return;
        }
        this.f29043y = new w01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29034a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29037f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f29040s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f29039r = z10;
        if (!z10) {
            if (this.f29035b.getBitmap() != null && !this.f29035b.getBitmap().isRecycled()) {
                this.f29035b.getBitmap().recycle();
            }
            this.f29035b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f29034a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f29034a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f29034a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f29034a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f29034a.setRoundRadius(i10);
        if (this.f29040s) {
            this.f29035b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29034a.getDrawable() && drawable != this.f29034a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
