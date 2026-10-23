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
    public ImageReceiver f31997a;
    public ImageReceiver f31998b;
    public int f31999c;
    public int d;
    public r5 e;
    public ColorFilter f32000f;
    public h9 h;
    public boolean f32001n;
    public boolean f32002r;
    public boolean f32003s;
    public boolean v;
    public boolean f32004w;
    public ValueAnimator f32005x;
    public f11 f32006y;

    public w9(Context context) {
        super(context);
        this.f31999c = -1;
        this.d = -1;
        this.f32004w = true;
        ImageReceiver c10 = c();
        this.f31997a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f31997a.setAllowLoadingOnAttachedOnly(true);
        this.f31997a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f32002r && this.f31998b.getBitmap() == null && this.f31997a.getBitmap() != null && (bitmap = this.f31997a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f31998b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f31997a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f32002r) {
            if (this.f31998b.getBitmap() != null && !this.f31998b.getBitmap().isRecycled()) {
                this.f31998b.getBitmap().recycle();
            }
            this.f31998b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, h9 h9Var) {
        this.f31997a.setForUserOrChat(tLObject, h9Var);
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
        return this.f31997a;
    }

    public int[] getRoundRadius() {
        return this.f31997a.getRoundRadius();
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
        this.f31997a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f31997a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f31997a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(n71 n71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (n71Var != null) {
            this.f31997a.setImageBitmap(n71Var);
        } else {
            this.f31997a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32001n = true;
        if (this.f32004w) {
            this.f31997a.onAttachedToWindow();
        }
        if (this.f32003s) {
            this.f31998b.onAttachedToWindow();
        }
        r5 r5Var = this.e;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32001n = false;
        if (this.f32004w) {
            this.f31997a.onDetachedFromWindow();
        }
        if (this.f32003s) {
            this.f31998b.onDetachedFromWindow();
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
            imageReceiver = r5Var.f29842k;
        } else {
            imageReceiver = this.f31997a;
        }
        if (imageReceiver != null) {
            if (r5Var != null && (colorFilter = this.f32000f) != null) {
                r5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f31999c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f32003s) {
                        this.f31998b.setImageCoords(0.0f, 0.0f, this.f31999c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f31999c) / 2, (height - i12) / 2, this.f31999c, i12);
                    if (this.f32003s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f31998b.setImageCoords((getWidth() - this.f31999c) / 2, (height2 - i13) / 2, this.f31999c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f32003s) {
                    this.f31998b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f32003s) {
                this.f31998b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f31997a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f31997a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f31997a.setRoundRadius(i10, i11, i12, i13);
        if (this.f32003s) {
            this.f31998b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f31999c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(r5 r5Var) {
        r5 r5Var2 = this.e;
        if (r5Var2 == r5Var) {
            return;
        }
        if (this.f32001n && r5Var2 != null) {
            r5Var2.o(this);
        }
        this.e = r5Var;
        if (this.f32001n && r5Var != null) {
            r5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f31997a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f32001n) {
            this.f32003s = z10;
            if (z10) {
                this.f31998b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f32006y = null;
            return;
        }
        this.f32006y = new f11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f31997a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f32000f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f32003s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f32002r = z10;
        if (!z10) {
            if (this.f31998b.getBitmap() != null && !this.f31998b.getBitmap().isRecycled()) {
                this.f31998b.getBitmap().recycle();
            }
            this.f31998b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f31997a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f31997a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f31997a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f31997a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f31997a.setRoundRadius(i10);
        if (this.f32003s) {
            this.f31998b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31997a.getDrawable() && drawable != this.f31997a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
