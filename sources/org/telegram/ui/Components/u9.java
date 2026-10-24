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
public class u9 extends View {
    public Path E;
    public ColorMatrixColorFilter F;
    public ImageReceiver f31064a;
    public ImageReceiver f31065b;
    public int f31066c;
    public int d;
    public p5 e;
    public ColorFilter f31067f;
    public f9 h;
    public boolean f31068n;
    public boolean f31069r;
    public boolean f31070s;
    public boolean v;
    public boolean f31071w;
    public ValueAnimator f31072x;
    public h11 f31073y;

    public u9(Context context) {
        super(context);
        this.f31066c = -1;
        this.d = -1;
        this.f31071w = true;
        ImageReceiver c10 = c();
        this.f31064a = c10;
        c10.setCrossfadeByScale(0.0f);
        this.f31064a.setAllowLoadingOnAttachedOnly(true);
        this.f31064a.setDelegate(new s(this, 14));
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f31069r && this.f31065b.getBitmap() == null && this.f31064a.getBitmap() != null && (bitmap = this.f31064a.getBitmap()) != null && !bitmap.isRecycled()) {
            this.f31065b.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap));
            invalidate();
        }
    }

    public final void b() {
        this.f31064a.clearImage();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void d() {
        if (this.f31069r) {
            if (this.f31065b.getBitmap() != null && !this.f31065b.getBitmap().isRecycled()) {
                this.f31065b.getBitmap().recycle();
            }
            this.f31065b.setImageBitmap((Bitmap) null);
            a();
        }
    }

    public final void e(TLObject tLObject, f9 f9Var) {
        this.f31064a.setForUserOrChat(tLObject, f9Var);
        d();
    }

    public final void g(String str, String str2, Drawable drawable) {
        m(ImageLocation.getForPath(str), str2, null, null, drawable, null, 0, null);
    }

    public p5 getAnimatedEmojiDrawable() {
        return this.e;
    }

    public f9 getAvatarDrawable() {
        if (this.h == null) {
            this.h = new f9((org.telegram.ui.ActionBar.g6) null);
        }
        return this.h;
    }

    public ImageReceiver getImageReceiver() {
        return this.f31064a;
    }

    public int[] getRoundRadius() {
        return this.f31064a.getRoundRadius();
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
        this.f31064a.setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
        d();
    }

    public final void l(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj) {
        this.f31064a.setImage(imageLocation, str, imageLocation2, str2, null, null, drawable, 0L, null, obj, 1);
        d();
    }

    public final void m(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, String str3, int i10, Object obj) {
        this.f31064a.setImage(imageLocation, str, imageLocation2, str2, drawable, i10, str3, obj, 0);
        d();
    }

    public final void n(ImageLocation imageLocation, String str, Drawable drawable, Object obj) {
        m(imageLocation, str, null, null, drawable, null, 0, obj);
    }

    public final void o(t71 t71Var, ImageLocation imageLocation, String str, ImageLocation imageLocation2, ImageLocation imageLocation3, String str2, int i10, String str3) {
        if (t71Var != null) {
            this.f31064a.setImageBitmap(t71Var);
        } else {
            this.f31064a.setImage(imageLocation, str, imageLocation2, null, imageLocation3, str2, null, i10, null, str3, 1);
        }
        d();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31068n = true;
        if (this.f31071w) {
            this.f31064a.onAttachedToWindow();
        }
        if (this.f31070s) {
            this.f31065b.onAttachedToWindow();
        }
        p5 p5Var = this.e;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31068n = false;
        if (this.f31071w) {
            this.f31064a.onDetachedFromWindow();
        }
        if (this.f31070s) {
            this.f31065b.onDetachedFromWindow();
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
            imageReceiver = p5Var.f29484k;
        } else {
            imageReceiver = this.f31064a;
        }
        if (imageReceiver != null) {
            if (p5Var != null && (colorFilter = this.f31067f) != null) {
                p5Var.setColorFilter(colorFilter);
            }
            int i11 = this.f31066c;
            if (i11 != -1 && (i10 = this.d) != -1) {
                if (this.v) {
                    imageReceiver.setImageCoords(0.0f, 0.0f, i11, i10);
                    if (this.f31070s) {
                        this.f31065b.setImageCoords(0.0f, 0.0f, this.f31066c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i12 = this.d;
                    imageReceiver.setImageCoords((getWidth() - this.f31066c) / 2, (height - i12) / 2, this.f31066c, i12);
                    if (this.f31070s) {
                        int height2 = getHeight();
                        int i13 = this.d;
                        this.f31065b.setImageCoords((getWidth() - this.f31066c) / 2, (height2 - i13) / 2, this.f31066c, i13);
                    }
                }
            } else {
                imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                if (this.f31070s) {
                    this.f31065b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.draw(canvas);
            if (this.f31070s) {
                this.f31065b.draw(canvas);
            }
        }
    }

    public final void p(int i10, int i11, boolean z10) {
        this.f31064a.setOrientation(i10, i11, true);
    }

    public final void q(int i10, boolean z10) {
        this.f31064a.setOrientation(0, true);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f31064a.setRoundRadius(i10, i11, i12, i13);
        if (this.f31070s) {
            this.f31065b.setRoundRadius(i10, i11, i12, i13);
        }
        invalidate();
    }

    public final void s(int i10, int i11) {
        this.f31066c = i10;
        this.d = i11;
        invalidate();
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        p5 p5Var2 = this.e;
        if (p5Var2 == p5Var) {
            return;
        }
        if (this.f31068n && p5Var2 != null) {
            p5Var2.o(this);
        }
        this.e = p5Var;
        if (this.f31068n && p5Var != null) {
            p5Var.a(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z10) {
        this.f31064a.setAspectFit(z10);
    }

    public void setBlurAllowed(boolean z10) {
        if (!this.f31068n) {
            this.f31070s = z10;
            if (z10) {
                this.f31065b = new ImageReceiver();
                return;
            }
            return;
        }
        throw new IllegalStateException("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f31073y = null;
            return;
        }
        this.f31073y = new h11(charSequence, 16.5f, AndroidUtilities.bold());
        if (this.F == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.2f);
            this.F = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f31064a.setColorFilter(colorFilter);
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f31067f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z10) {
        if (z10 && !this.f31070s) {
            throw new IllegalStateException("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
        }
        this.f31069r = z10;
        if (!z10) {
            if (this.f31065b.getBitmap() != null && !this.f31065b.getBitmap().isRecycled()) {
                this.f31065b.getBitmap().recycle();
            }
            this.f31065b.setImageBitmap((Bitmap) null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f31064a.setImageBitmap(bitmap);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f31064a.setImageBitmap(drawable);
        d();
    }

    public void setImageResource(int i10) {
        this.f31064a.setImageBitmap(getResources().getDrawable(i10));
        invalidate();
        d();
    }

    public void setLayerNum(int i10) {
        this.f31064a.setLayerNum(i10);
    }

    public void setRoundRadius(int i10) {
        this.f31064a.setRoundRadius(i10);
        if (this.f31070s) {
            this.f31065b.setRoundRadius(i10);
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31064a.getDrawable() && drawable != this.f31064a.getImageDrawable() && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
