package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v61 extends View {
    public final j6 f31806a;
    public final j6 f31807b;
    public final Paint f31808c;
    public final Paint d;
    public final Paint f31809e;
    public boolean f31810f;
    public final z5 h;
    public final int[] f31811n;

    public v61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31808c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31809e = paint3;
        pr prVar = pr.h;
        this.h = new z5(this, 0L, 300L, prVar);
        this.f31811n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        j6 j6Var = new j6(true, false, false, false);
        this.f31806a = j6Var;
        j6Var.k(0.4f, 360L, prVar);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dpf2(10.6f));
        j6Var.setCallback(this);
        j6Var.f27999b = 17;
        j6 j6Var2 = new j6(true, false, false, false);
        this.f31807b = j6Var2;
        j6Var2.k(0.2f, 360L, prVar);
        j6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var2.r(-1);
        j6Var2.t(AndroidUtilities.dpf2(8.6f));
        j6Var2.setCallback(this);
        j6Var2.f27999b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        j6Var2.f27998a.setXfermode(new PorterDuffXfermode(mode));
        j6Var2.G = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z4, boolean z10) {
        boolean z11;
        String str;
        if (z4 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f31810f = z11;
        j6 j6Var = this.f31806a;
        j6 j6Var2 = this.f31807b;
        if (z10) {
            j6Var.q("GIF", true, true);
            j6Var2.q("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            j6Var.q(str, true, true);
            int[] iArr = this.f31811n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i10 >= iArr[length]) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length < 0) {
                j6Var2.q("", true, true);
            } else if (length == 6) {
                j6Var2.q("2K", TextUtils.isEmpty(j6Var2.f28003g), true);
            } else if (length == 7) {
                j6Var2.q("4K", TextUtils.isEmpty(j6Var2.f28003g), true);
            } else {
                j6Var2.q("" + iArr[length], TextUtils.isEmpty(j6Var2.f28003g), true);
            }
        }
        setClickable(!this.f31810f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e6 = (1.0f - (this.h.e(this.f31810f) * 0.35f)) * 255.0f;
        int i10 = (int) e6;
        Paint paint = this.f31808c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        j6 j6Var = this.f31806a;
        float max = Math.max(dpf2, j6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        j6Var.setBounds(rect);
        j6Var.f28017w = i10;
        j6Var.draw(canvas);
        j6 j6Var2 = this.f31807b;
        float d = j6Var2.d() + (AndroidUtilities.dpf2(2.0f) * j6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.f31809e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (j6Var2.g() * e6));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        j6Var2.setBounds(rect);
        j6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z4) {
        String str;
        this.f31810f = false;
        if (z4) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f31806a.q(str, true, true);
        this.f31807b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31806a != drawable && this.f31807b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
