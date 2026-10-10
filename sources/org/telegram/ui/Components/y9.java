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
    public ImageReceiver f33135a;
    public ImageReceiver f33136b;
    public int f33137c;
    public int d;
    public s5 f33138e;
    public ColorFilter f33139f;
    public j9 h;
    public boolean f33140n;
    public boolean f33141r;
    public boolean f33142s;
    public boolean v;
    public boolean f33143w;
    public ValueAnimator f33144x;
    public m11 f33145y;

    public y9(Context context) {
        super(context);
        this.f33137c = -1;
        this.d = -1;
        this.f33143w = true;
        ImageReceiver c10 = c();
        this.f33135a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f33135a.setAllowLoadingOnAttachedOnly(true);
        this.f33135a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f33141r && this.f33136b.getBitmap() == null && this.f33135a.getBitmap() != null && (bitmap = this.f33135a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f33136b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f33135a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f33141r) {
            if (this.f33136b.getBitmap() != null && !this.f33136b.getBitmap().isRecycled()) {
                this.f33136b.getBitmap().recycle();
            }
            this.f33136b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, j9 j9Var) {
        this.f33135a.setForUserOrChat(tLObject, j9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public s5 getAnimatedEmojiDrawable() {
        return this.f33138e;
    }

    public j9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new j9((org.telegram.ui.ActionBar.e6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f33135a;
    }

    public int[] getRoundRadius() {
        return this.f33135a.getRoundRadius();
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
        this.f33135a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f33135a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f33135a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(w71 w71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (w71Var != null) {
            this.f33135a.setImageBitmap(w71Var);
        } else {
            this.f33135a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33140n = true;
        if (this.f33143w) {
            this.f33135a.onAttachedToWindow();
        }
        if (this.f33142s) {
            this.f33136b.onAttachedToWindow();
        }
        s5 s5Var = this.f33138e;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33140n = false;
        if (this.f33143w) {
            this.f33135a.onDetachedFromWindow();
        }
        if (this.f33142s) {
            this.f33136b.onDetachedFromWindow();
        }
        s5 s5Var = this.f33138e;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        s5 s5Var = this.f33138e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30680k;
        } else {
            imageReceiver = this.f33135a;
        }
        if (imageReceiver != null) {
            if (s5Var != null && (colorFilter = this.f33139f) != null) {
                s5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f33137c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f33142s) {
                        this.f33136b.setImageCoords(0.0f, 0.0f, this.f33137c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f33137c) / 2, (height - i12) / 2, this.f33137c, i12);
                    if (this.f33142s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f33136b.setImageCoords((getWidth() - this.f33137c) / 2, (height2 - i13) / 2, this.f33137c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f33142s) {
                    this.f33136b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f33142s) {
                this.f33136b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f33135a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f33135a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f33135a.setRoundRadius(i10, i11, i12, i13);
        if (this.f33142s) {
            this.f33136b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f33137c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(s5 s5Var) {
        s5 s5Var2 = this.f33138e;
        if (s5Var2 == s5Var) {
            return;
        }
        if (this.f33140n && s5Var2 != null) {
            s5Var2.o(this);
        }
        this.f33138e = s5Var;
        if (this.f33140n && s5Var != null) {
            s5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f33135a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f33140n) {
            this.f33142s = z10;
            if (z10) {
                this.f33136b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f33145y = null;
            return;
        }
        this.f33145y = new m11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f33135a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f33139f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f33142s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f33141r = z10;
        if (!z10) {
            if (this.f33136b.getBitmap() != null && !this.f33136b.getBitmap().isRecycled()) {
                this.f33136b.getBitmap().recycle();
            }
            this.f33136b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f33135a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f33135a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f33135a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f33135a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f33135a.setRoundRadius(i10);
        if (this.f33142s) {
            this.f33136b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33135a.getDrawable() && drawable != this.f33135a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
