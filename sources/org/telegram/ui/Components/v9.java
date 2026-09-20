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
    public ImageReceiver f29029a;
    public ImageReceiver f29030b;
    public int f29031c;
    public int d;
    public p5 e;
    public ColorFilter f29032f;
    public g9 h;
    public boolean f29033n;
    public boolean f29034r;
    public boolean f29035s;
    public boolean v;
    public boolean f29036w;
    public ValueAnimator f29037x;
    public u01 f29038y;

    public v9(Context context) {
        super(context);
        this.f29031c = -1;
        this.d = -1;
        this.f29036w = true;
        ImageReceiver c10 = c();
        this.f29029a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f29029a.setAllowLoadingOnAttachedOnly(true);
        this.f29029a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f29034r && this.f29030b.getBitmap() == null && this.f29029a.getBitmap() != null && (bitmap = this.f29029a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f29030b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f29029a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f29034r) {
            if (this.f29030b.getBitmap() != null && !this.f29030b.getBitmap().isRecycled()) {
                this.f29030b.getBitmap().recycle();
            }
            this.f29030b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, g9 g9Var) {
        this.f29029a.setForUserOrChat(tLObject, g9Var);
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
        return this.f29029a;
    }

    public int[] getRoundRadius() {
        return this.f29029a.getRoundRadius();
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
        this.f29029a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f29029a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f29029a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(e71 e71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (e71Var != null) {
            this.f29029a.setImageBitmap(e71Var);
        } else {
            this.f29029a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29033n = true;
        if (this.f29036w) {
            this.f29029a.onAttachedToWindow();
        }
        if (this.f29035s) {
            this.f29030b.onAttachedToWindow();
        }
        p5 p5Var = this.e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29033n = false;
        if (this.f29036w) {
            this.f29029a.onDetachedFromWindow();
        }
        if (this.f29035s) {
            this.f29030b.onDetachedFromWindow();
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
            imageReceiver = p5Var.f27162k;
        } else {
            imageReceiver = this.f29029a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f29032f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f29031c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f29035s) {
                        this.f29030b.setImageCoords(0.0f, 0.0f, this.f29031c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f29031c) / 2, (height - i12) / 2, this.f29031c, i12);
                    if (this.f29035s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f29030b.setImageCoords((getWidth() - this.f29031c) / 2, (height2 - i13) / 2, this.f29031c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f29035s) {
                    this.f29030b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f29035s) {
                this.f29030b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f29029a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f29029a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f29029a.setRoundRadius(i10, i11, i12, i13);
        if (this.f29035s) {
            this.f29030b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f29031c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f29033n && p5Var2 != null) {
            p5Var2.o(this);
        }
        this.e = p5Var;
        if (this.f29033n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f29029a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f29033n) {
            this.f29035s = z10;
            if (z10) {
                this.f29030b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f29038y = null;
            return;
        }
        this.f29038y = new u01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29029a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29032f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f29035s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f29034r = z10;
        if (!z10) {
            if (this.f29030b.getBitmap() != null && !this.f29030b.getBitmap().isRecycled()) {
                this.f29030b.getBitmap().recycle();
            }
            this.f29030b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f29029a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f29029a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f29029a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f29029a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f29029a.setRoundRadius(i10);
        if (this.f29035s) {
            this.f29030b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29029a.getDrawable() && drawable != this.f29029a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
