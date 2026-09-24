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
    public ImageReceiver f29927a;
    public ImageReceiver f29928b;
    public int f29929c;
    public int d;
    public q5 e;
    public ColorFilter f29930f;
    public h9 h;
    public boolean f29931n;
    public boolean f29932r;
    public boolean f29933s;
    public boolean v;
    public boolean f29934w;
    public ValueAnimator f29935x;
    public t01 f29936y;

    public w9(Context context) {
        super(context);
        this.f29929c = -1;
        this.d = -1;
        this.f29934w = true;
        ImageReceiver c10 = c();
        this.f29927a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f29927a.setAllowLoadingOnAttachedOnly(true);
        this.f29927a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f29932r && this.f29928b.getBitmap() == null && this.f29927a.getBitmap() != null && (bitmap = this.f29927a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f29928b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f29927a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f29932r) {
            if (this.f29928b.getBitmap() != null && !this.f29928b.getBitmap().isRecycled()) {
                this.f29928b.getBitmap().recycle();
            }
            this.f29928b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, h9 h9Var) {
        this.f29927a.setForUserOrChat(tLObject, h9Var);
        d();
    }

    public final void f(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public q5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public h9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new h9((org.telegram.ui.ActionBar.d6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f29927a;
    }

    public int[] getRoundRadius() {
        return this.f29927a.getRoundRadius();
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
        this.f29927a.setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f29927a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f29927a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(d71 d71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (d71Var != null) {
            this.f29927a.setImageBitmap(d71Var);
        } else {
            this.f29927a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29931n = true;
        if (this.f29934w) {
            this.f29927a.onAttachedToWindow();
        }
        if (this.f29933s) {
            this.f29928b.onAttachedToWindow();
        }
        q5 q5Var = this.e;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29931n = false;
        if (this.f29934w) {
            this.f29927a.onDetachedFromWindow();
        }
        if (this.f29933s) {
            this.f29928b.onDetachedFromWindow();
        }
        q5 q5Var = this.e;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i10;
        ColorFilter colorFilter;
        q5 q5Var = this.e;
        if (q5Var != null) {
            imageReceiver = q5Var.f27498k;
        } else {
            imageReceiver = this.f29927a;
        }
        if (imageReceiver != null) {
            if (q5Var != null && (colorFilter = this.f29930f) != null) {
                q5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f29929c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f29933s) {
                        this.f29928b.setImageCoords(0.0f, 0.0f, this.f29929c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f29929c) / 2, (height - i12) / 2, this.f29929c, i12);
                    if (this.f29933s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f29928b.setImageCoords((getWidth() - this.f29929c) / 2, (height2 - i13) / 2, this.f29929c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f29933s) {
                    this.f29928b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f29933s) {
                this.f29928b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f29927a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f29927a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f29927a.setRoundRadius(i10, i11, i12, i13);
        if (this.f29933s) {
            this.f29928b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f29929c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(q5 q5Var) {
        q5 q5Var2 = this.e;
        if (q5Var2 == q5Var) {
            return;
        }
        if (this.f29931n && q5Var2 != null) {
            q5Var2.o(this);
        }
        this.e = q5Var;
        if (this.f29931n && q5Var != null) {
            q5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f29927a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f29931n) {
            this.f29933s = z10;
            if (z10) {
                this.f29928b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f29936y = null;
            return;
        }
        this.f29936y = new t01(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f29927a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f29930f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f29933s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f29932r = z10;
        if (!z10) {
            if (this.f29928b.getBitmap() != null && !this.f29928b.getBitmap().isRecycled()) {
                this.f29928b.getBitmap().recycle();
            }
            this.f29928b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f29927a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f29927a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f29927a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f29927a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f29927a.setRoundRadius(i10);
        if (this.f29933s) {
            this.f29928b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29927a.getDrawable() && drawable != this.f29927a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
