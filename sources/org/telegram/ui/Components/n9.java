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

public class n9 extends View {
    public Path A;
    public ColorMatrixColorFilter B;

    public ImageReceiver f30898a;

    public ImageReceiver f30899b;

    public int f30900c;
    public int d;

    public k5 f30901e;

    public ColorFilter f30902f;
    public y8 h;

    public boolean f30903n;

    public boolean f30904r;

    public boolean f30905s;
    public boolean v;

    public boolean f30906w;

    public ValueAnimator f30907x;

    public pz0 f30908y;

    public n9(Context context) {
        super(context);
        this.f30900c = -1;
        this.d = -1;
        this.f30906w = true;
        ImageReceiver imageReceiverC = c();
        this.f30898a = imageReceiverC;
        imageReceiverC.setCrossfadeByScale(0.0f);
        this.f30898a.setAllowLoadingOnAttachedOnly(true);
        this.f30898a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (!this.f30904r || this.f30899b.getBitmap() != null || this.f30898a.getBitmap() == null || (bitmap = this.f30898a.getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        this.f30899b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
        invalidate();
    }

    public final void b() {
        this.f30898a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f30904r) {
            if (this.f30899b.getBitmap() != null && !this.f30899b.getBitmap().isRecycled()) {
                this.f30899b.getBitmap().recycle();
            }
            this.f30899b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, y8 y8Var) {
        this.f30898a.setForUserOrChat(tLObject, y8Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public k5 getAnimatedEmojiDrawable() {
        return this.f30901e;
    }

    public y8 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new y8((org.telegram.ui.ActionBar.c6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f30898a;
    }

    public int[] getRoundRadius() {
        return this.f30898a.getRoundRadius();
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
        this.f30898a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f30898a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f30898a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(w51 w51Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (w51Var != null) {
            this.f30898a.setImageBitmap(w51Var);
        } else {
            this.f30898a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30903n = true;
        if (this.f30906w) {
            this.f30898a.onAttachedToWindow();
        }
        if (this.f30905s) {
            this.f30899b.onAttachedToWindow();
        }
        k5 k5Var = this.f30901e;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30903n = false;
        if (this.f30906w) {
            this.f30898a.onDetachedFromWindow();
        }
        if (this.f30905s) {
            this.f30899b.onDetachedFromWindow();
        }
        k5 k5Var = this.f30901e;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        ColorFilter colorFilter;
        k5 k5Var = this.f30901e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : this.f30898a;
        if (imageReceiver == null) {
            return;
        }
        if (k5Var != null && (colorFilter = this.f30902f) != null) {
            k5Var.setColorFilter(colorFilter);
        }
        int i11 = this.f30900c;
        if (i11 == -1 || (i10 = this.d) == -1) {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            if (this.f30905s) {
                this.f30899b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            }
        } else if (this.v) {
            imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
            if (this.f30905s) {
                this.f30899b.setImageCoords(0.0f, 0.0f, this.f30900c, this.d);
            }
        } else {
            float width = (getWidth() - this.f30900c) / 2;
            int height = getHeight();
            int i12 = this.d;
            imageReceiver.setImageCoords(width, (height - i12) / 2, this.f30900c, i12);
            if (this.f30905s) {
                ImageReceiver imageReceiver2 = this.f30899b;
                float width2 = (getWidth() - this.f30900c) / 2;
                int height2 = getHeight();
                int i13 = this.d;
                imageReceiver2.setImageCoords(width2, (height2 - i13) / 2, this.f30900c, i13);
            }
        }
        imageReceiver.draw(canvas);
        if (this.f30905s) {
            this.f30899b.draw(canvas);
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f30898a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f30898a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f30898a.setRoundRadius(i10, i11, i12, i13);
        if (this.f30905s) {
            this.f30899b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f30900c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        k5 k5Var2 = this.f30901e;
        if (k5Var2 == k5Var) {
            return;
        }
        if (this.f30903n && k5Var2 != null) {
            k5Var2.o(this);
        }
        this.f30901e = k5Var;
        if (this.f30903n && k5Var != null) {
            k5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f30898a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (this.f30903n) {
            throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
        }
        this.f30905s = z10;
        if (z10) {
            this.f30899b = new ImageReceiver();
        }
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f30908y = null;
            return;
        }
        this.f30908y = new pz0(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.B == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.B = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f30898a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f30902f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f30905s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f30904r = z10;
        if (!z10) {
            if (this.f30899b.getBitmap() != null && !this.f30899b.getBitmap().isRecycled()) {
                this.f30899b.getBitmap().recycle();
            }
            this.f30899b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f30898a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f30898a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f30898a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f30898a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f30898a.setRoundRadius(i10);
        if (this.f30905s) {
            this.f30899b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f30898a.getDrawable() || drawable == this.f30898a.getImageDrawable() || super.verifyDrawable(drawable);
    }
}
