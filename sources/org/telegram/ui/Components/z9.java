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
    public ImageReceiver f31813a;
    public ImageReceiver f31814b;
    public int f31815c;
    public int d;
    public s5 e;
    public ColorFilter f31816f;
    public k9 h;
    public boolean f31817n;
    public boolean f31818r;
    public boolean f31819s;
    public boolean v;
    public boolean f31820w;
    public ValueAnimator f31821x;
    public h11 f31822y;

    public z9(Context context) {
        super(context);
        this.f31815c = -1;
        this.d = -1;
        this.f31820w = true;
        ImageReceiver c10 = c();
        this.f31813a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f31813a.setAllowLoadingOnAttachedOnly(true);
        this.f31813a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f31818r && this.f31814b.getBitmap() == null && this.f31813a.getBitmap() != null && (bitmap = this.f31813a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f31814b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f31813a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f31818r) {
            if (this.f31814b.getBitmap() != null && !this.f31814b.getBitmap().isRecycled()) {
                this.f31814b.getBitmap().recycle();
            }
            this.f31814b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, k9 k9Var) {
        this.f31813a.setForUserOrChat(tLObject, k9Var);
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
        return this.f31813a;
    }

    public int[] getRoundRadius() {
        return this.f31813a.getRoundRadius();
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
        this.f31813a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f31813a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f31813a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(s71 s71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (s71Var != null) {
            this.f31813a.setImageBitmap(s71Var);
        } else {
            this.f31813a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31817n = true;
        if (this.f31820w) {
            this.f31813a.onAttachedToWindow();
        }
        if (this.f31819s) {
            this.f31814b.onAttachedToWindow();
        }
        s5 s5Var = this.e;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31817n = false;
        if (this.f31820w) {
            this.f31813a.onDetachedFromWindow();
        }
        if (this.f31819s) {
            this.f31814b.onDetachedFromWindow();
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
            imageReceiver = s5Var.f29031k;
        } else {
            imageReceiver = this.f31813a;
        }
        if (imageReceiver != null) {
            if (s5Var != null && (colorFilter = this.f31816f) != null) {
                s5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f31815c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f31819s) {
                        this.f31814b.setImageCoords(0.0f, 0.0f, this.f31815c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f31815c) / 2, (height - i12) / 2, this.f31815c, i12);
                    if (this.f31819s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f31814b.setImageCoords((getWidth() - this.f31815c) / 2, (height2 - i13) / 2, this.f31815c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f31819s) {
                    this.f31814b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f31819s) {
                this.f31814b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f31813a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f31813a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f31813a.setRoundRadius(i10, i11, i12, i13);
        if (this.f31819s) {
            this.f31814b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f31815c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(s5 s5Var) {
        s5 s5Var2 = this.e;
        if (s5Var2 == s5Var) {
            return;
        }
        if (this.f31817n && s5Var2 != null) {
            s5Var2.o(this);
        }
        this.e = s5Var;
        if (this.f31817n && s5Var != null) {
            s5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f31813a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f31817n) {
            this.f31819s = z10;
            if (z10) {
                this.f31814b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f31822y = null;
            return;
        }
        this.f31822y = new h11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f31813a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f31816f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f31819s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f31818r = z10;
        if (!z10) {
            if (this.f31814b.getBitmap() != null && !this.f31814b.getBitmap().isRecycled()) {
                this.f31814b.getBitmap().recycle();
            }
            this.f31814b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f31813a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f31813a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f31813a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f31813a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f31813a.setRoundRadius(i10);
        if (this.f31819s) {
            this.f31814b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31813a.getDrawable() && drawable != this.f31813a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
