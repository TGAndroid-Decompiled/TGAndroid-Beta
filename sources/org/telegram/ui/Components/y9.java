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
    public ImageReceiver f33188a;
    public ImageReceiver f33189b;
    public int f33190c;
    public int d;
    public s5 f33191e;
    public ColorFilter f33192f;
    public j9 h;
    public boolean f33193n;
    public boolean f33194r;
    public boolean f33195s;
    public boolean v;
    public boolean f33196w;
    public ValueAnimator f33197x;
    public m11 f33198y;

    public y9(Context context) {
        super(context);
        this.f33190c = -1;
        this.d = -1;
        this.f33196w = true;
        ImageReceiver c10 = c();
        this.f33188a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f33188a.setAllowLoadingOnAttachedOnly(true);
        this.f33188a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f33194r && this.f33189b.getBitmap() == null && this.f33188a.getBitmap() != null && (bitmap = this.f33188a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f33189b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f33188a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f33194r) {
            if (this.f33189b.getBitmap() != null && !this.f33189b.getBitmap().isRecycled()) {
                this.f33189b.getBitmap().recycle();
            }
            this.f33189b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, j9 j9Var) {
        this.f33188a.setForUserOrChat(tLObject, j9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public s5 getAnimatedEmojiDrawable() {
        return this.f33191e;
    }

    public j9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new j9((org.telegram.ui.ActionBar.d6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f33188a;
    }

    public int[] getRoundRadius() {
        return this.f33188a.getRoundRadius();
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
        this.f33188a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f33188a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f33188a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(w71 w71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (w71Var != null) {
            this.f33188a.setImageBitmap(w71Var);
        } else {
            this.f33188a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33193n = true;
        if (this.f33196w) {
            this.f33188a.onAttachedToWindow();
        }
        if (this.f33195s) {
            this.f33189b.onAttachedToWindow();
        }
        s5 s5Var = this.f33191e;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33193n = false;
        if (this.f33196w) {
            this.f33188a.onDetachedFromWindow();
        }
        if (this.f33195s) {
            this.f33189b.onDetachedFromWindow();
        }
        s5 s5Var = this.f33191e;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        s5 s5Var = this.f33191e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30739k;
        } else {
            imageReceiver = this.f33188a;
        }
        if (imageReceiver != null) {
            if (s5Var != null && (colorFilter = this.f33192f) != null) {
                s5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f33190c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f33195s) {
                        this.f33189b.setImageCoords(0.0f, 0.0f, this.f33190c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f33190c) / 2, (height - i12) / 2, this.f33190c, i12);
                    if (this.f33195s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f33189b.setImageCoords((getWidth() - this.f33190c) / 2, (height2 - i13) / 2, this.f33190c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f33195s) {
                    this.f33189b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f33195s) {
                this.f33189b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f33188a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f33188a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f33188a.setRoundRadius(i10, i11, i12, i13);
        if (this.f33195s) {
            this.f33189b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f33190c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(s5 s5Var) {
        s5 s5Var2 = this.f33191e;
        if (s5Var2 == s5Var) {
            return;
        }
        if (this.f33193n && s5Var2 != null) {
            s5Var2.o(this);
        }
        this.f33191e = s5Var;
        if (this.f33193n && s5Var != null) {
            s5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f33188a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f33193n) {
            this.f33195s = z10;
            if (z10) {
                this.f33189b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f33198y = null;
            return;
        }
        this.f33198y = new m11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f33188a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f33192f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f33195s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f33194r = z10;
        if (!z10) {
            if (this.f33189b.getBitmap() != null && !this.f33189b.getBitmap().isRecycled()) {
                this.f33189b.getBitmap().recycle();
            }
            this.f33189b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f33188a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f33188a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f33188a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f33188a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f33188a.setRoundRadius(i10);
        if (this.f33195s) {
            this.f33189b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33188a.getDrawable() && drawable != this.f33188a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
