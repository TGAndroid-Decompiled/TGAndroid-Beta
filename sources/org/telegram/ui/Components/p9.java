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
public class p9 extends View {
    public Path B;
    public ColorMatrixColorFilter C;
    public ImageReceiver f29998a;
    public ImageReceiver f29999b;
    public int f30000c;
    public int d;
    public l5 f30001e;
    public ColorFilter f30002f;
    public z8 h;
    public boolean f30003n;
    public boolean f30004r;
    public boolean f30005s;
    public boolean v;
    public boolean f30006w;
    public ValueAnimator f30007x;
    public l01 f30008y;

    public p9(Context context) {
        super(context);
        this.f30000c = -1;
        this.d = -1;
        this.f30006w = true;
        ImageReceiver c3 = c();
        this.f29998a = c3;
        c3.setCrossfadeByScale(0.0f);
        this.f29998a.setAllowLoadingOnAttachedOnly(true);
        this.f29998a.setDelegate(new t(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f30004r && this.f29999b.getBitmap() == null && this.f29998a.getBitmap() != null && (bitmap = this.f29998a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f29999b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f29998a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f30004r) {
            if (this.f29999b.getBitmap() != null && !this.f29999b.getBitmap().isRecycled()) {
                this.f29999b.getBitmap().recycle();
            }
            this.f29999b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, z8 z8Var) {
        this.f29998a.setForUserOrChat(tLObject, z8Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public l5 getAnimatedEmojiDrawable() {
        return this.f30001e;
    }

    public z8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new z8((org.telegram.ui.ActionBar.g6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f29998a;
    }

    public int[] getRoundRadius() {
        return this.f29998a.getRoundRadius();
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
        this.f29998a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f29998a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f29998a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(u61 u61Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (u61Var != null) {
            this.f29998a.setImageBitmap(u61Var);
        } else {
            this.f29998a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30003n = true;
        if (this.f30006w) {
            this.f29998a.onAttachedToWindow();
        }
        if (this.f30005s) {
            this.f29999b.onAttachedToWindow();
        }
        l5 l5Var = this.f30001e;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30003n = false;
        if (this.f30006w) {
            this.f29998a.onDetachedFromWindow();
        }
        if (this.f30005s) {
            this.f29999b.onDetachedFromWindow();
        }
        l5 l5Var = this.f30001e;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        l5 l5Var = this.f30001e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28604k;
        } else {
            imageReceiver = this.f29998a;
        }
        if (imageReceiver != null) {
            if (l5Var != null && (colorFilter = this.f30002f) != null) {
                l5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f30000c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f30005s) {
                        this.f29999b.setImageCoords(0.0f, 0.0f, this.f30000c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f30000c) / 2, (height - i12) / 2, this.f30000c, i12);
                    if (this.f30005s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f29999b.setImageCoords((getWidth() - this.f30000c) / 2, (height2 - i13) / 2, this.f30000c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f30005s) {
                    this.f29999b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f30005s) {
                this.f29999b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z4) {
        this.f29998a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z4) {
        this.f29998a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f29998a.setRoundRadius(i10, i11, i12, i13);
        if (this.f30005s) {
            this.f29999b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f30000c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(l5 l5Var) {
        l5 l5Var2 = this.f30001e;
        if (l5Var2 == l5Var) {
            return;
        }
        if (this.f30003n && l5Var2 != null) {
            l5Var2.o(this);
        }
        this.f30001e = l5Var;
        if (this.f30003n && l5Var != null) {
            l5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z4) {
        this.f29998a.setAspectFit(z4);
    }

    public void setBlurAllowed(boolean z4) {
        if (!this.f30003n) {
            this.f30005s = z4;
            if (z4) {
                this.f29999b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f30008y = null;
            return;
        }
        this.f30008y = new l01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.C == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.C = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29998a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f30002f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z4) {
        if (z4 && !this.f30005s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f30004r = z4;
        if (!z4) {
            if (this.f29999b.getBitmap() != null && !this.f29999b.getBitmap().isRecycled()) {
                this.f29999b.getBitmap().recycle();
            }
            this.f29999b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f29998a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f29998a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f29998a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f29998a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f29998a.setRoundRadius(i10);
        if (this.f30005s) {
            this.f29999b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29998a.getDrawable() && drawable != this.f29998a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
