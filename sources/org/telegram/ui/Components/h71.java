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
public final class h71 extends View {
    public final o6 f24578a;
    public final o6 f24579b;
    public final Paint f24580c;
    public final Paint d;
    public final Paint e;
    public boolean f24581f;
    public final e6 h;
    public final int[] f24582n;

    public h71(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f24580c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        qr qrVar = qr.h;
        this.h = new e6(this, 0L, 300L, qrVar);
        this.f24582n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        o6 o6Var = new o6(true, false, false, false);
        this.f24578a = o6Var;
        o6Var.k(0.4f, 360L, qrVar);
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.r(-1);
        o6Var.t(AndroidUtilities.dpf2(10.6f));
        o6Var.setCallback(this);
        o6Var.f26868b = 17;
        o6 o6Var2 = new o6(true, false, false, false);
        this.f24579b = o6Var2;
        o6Var2.k(0.2f, 360L, qrVar);
        o6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var2.r(-1);
        o6Var2.t(AndroidUtilities.dpf2(8.6f));
        o6Var2.setCallback(this);
        o6Var2.f26868b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        o6Var2.f26867a.setXfermode(new PorterDuffXfermode(mode));
        o6Var2.G = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        boolean z12;
        String str;
        if (z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f24581f = z12;
        o6 o6Var = this.f24578a;
        o6 o6Var2 = this.f24579b;
        if (z11) {
            o6Var.q("GIF", true, true);
            o6Var2.q("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            o6Var.q(str, true, true);
            int[] iArr = this.f24582n;
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
                o6Var2.q("", true, true);
            } else if (length == 6) {
                o6Var2.q("2K", TextUtils.isEmpty(o6Var2.f26871g), true);
            } else if (length == 7) {
                o6Var2.q("4K", TextUtils.isEmpty(o6Var2.f26871g), true);
            } else {
                o6Var2.q("" + iArr[length], TextUtils.isEmpty(o6Var2.f26871g), true);
            }
        }
        setClickable(!this.f24581f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e = (1.0f - (this.h.e(this.f24581f) * 0.35f)) * 255.0f;
        int i10 = (int) e;
        Paint paint = this.f24580c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        o6 o6Var = this.f24578a;
        float max = Math.max(dpf2, o6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        o6Var.setBounds(rect);
        o6Var.f26885w = i10;
        o6Var.draw(canvas);
        o6 o6Var2 = this.f24579b;
        float d = o6Var2.d() + (AndroidUtilities.dpf2(2.0f) * o6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (o6Var2.g() * e));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        o6Var2.setBounds(rect);
        o6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f24581f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f24578a.q(str, true, true);
        this.f24579b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f24578a != drawable && this.f24579b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
