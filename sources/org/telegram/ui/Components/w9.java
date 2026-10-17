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
    public ImageReceiver f32033a;
    public ImageReceiver f32034b;
    public int f32035c;
    public int d;
    public r5 e;
    public ColorFilter f32036f;
    public h9 h;
    public boolean f32037n;
    public boolean f32038r;
    public boolean f32039s;
    public boolean v;
    public boolean f32040w;
    public ValueAnimator f32041x;
    public d11 f32042y;

    public w9(Context context) {
        super(context);
        this.f32035c = -1;
        this.d = -1;
        this.f32040w = true;
        ImageReceiver c10 = c();
        this.f32033a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f32033a.setAllowLoadingOnAttachedOnly(true);
        this.f32033a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f32038r && this.f32034b.getBitmap() == null && this.f32033a.getBitmap() != null && (bitmap = this.f32033a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f32034b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f32033a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f32038r) {
            if (this.f32034b.getBitmap() != null && !this.f32034b.getBitmap().isRecycled()) {
                this.f32034b.getBitmap().recycle();
            }
            this.f32034b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, h9 h9Var) {
        this.f32033a.setForUserOrChat(tLObject, h9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public r5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public h9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new h9((org.telegram.ui.ActionBar.d6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32033a;
    }

    public int[] getRoundRadius() {
        return this.f32033a.getRoundRadius();
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
        this.f32033a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f32033a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f32033a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(l71 l71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (l71Var != null) {
            this.f32033a.setImageBitmap(l71Var);
        } else {
            this.f32033a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32037n = true;
        if (this.f32040w) {
            this.f32033a.onAttachedToWindow();
        }
        if (this.f32039s) {
            this.f32034b.onAttachedToWindow();
        }
        r5 r5Var = this.e;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32037n = false;
        if (this.f32040w) {
            this.f32033a.onDetachedFromWindow();
        }
        if (this.f32039s) {
            this.f32034b.onDetachedFromWindow();
        }
        r5 r5Var = this.e;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        r5 r5Var = this.e;
        if (r5Var != null) {
            imageReceiver = r5Var.f29841k;
        } else {
            imageReceiver = this.f32033a;
        }
        if (imageReceiver != null) {
            if (r5Var != null && (colorFilter = this.f32036f) != null) {
                r5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f32035c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f32039s) {
                        this.f32034b.setImageCoords(0.0f, 0.0f, this.f32035c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f32035c) / 2, (height - i12) / 2, this.f32035c, i12);
                    if (this.f32039s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f32034b.setImageCoords((getWidth() - this.f32035c) / 2, (height2 - i13) / 2, this.f32035c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f32039s) {
                    this.f32034b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f32039s) {
                this.f32034b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f32033a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f32033a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f32033a.setRoundRadius(i10, i11, i12, i13);
        if (this.f32039s) {
            this.f32034b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f32035c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(r5 r5Var) {
        r5 r5Var2 = this.e;
        if (r5Var2 == r5Var) {
            return;
        }
        if (this.f32037n && r5Var2 != null) {
            r5Var2.o(this);
        }
        this.e = r5Var;
        if (this.f32037n && r5Var != null) {
            r5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f32033a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f32037n) {
            this.f32039s = z10;
            if (z10) {
                this.f32034b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32042y = null;
            return;
        }
        this.f32042y = new d11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f32033a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f32036f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f32039s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f32038r = z10;
        if (!z10) {
            if (this.f32034b.getBitmap() != null && !this.f32034b.getBitmap().isRecycled()) {
                this.f32034b.getBitmap().recycle();
            }
            this.f32034b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f32033a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f32033a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f32033a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f32033a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f32033a.setRoundRadius(i10);
        if (this.f32039s) {
            this.f32034b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32033a.getDrawable() && drawable != this.f32033a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
