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
public final class s61 extends View {
    public final p6 f30232a;
    public final p6 f30233b;
    public final Paint f30234c;
    public final Paint d;
    public final Paint f30235e;
    public boolean f30236f;
    public final e6 h;
    public final int[] f30237n;

    public s61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f30234c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f30235e = paint3;
        pr prVar = pr.h;
        this.h = new e6(this, 0L, 300L, prVar);
        this.f30237n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        p6 p6Var = new p6(true, false, false, false);
        this.f30232a = p6Var;
        p6Var.k(0.4f, 360L, prVar);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dpf2(10.6f));
        p6Var.setCallback(this);
        p6Var.f29312b = 17;
        p6 p6Var2 = new p6(true, false, false, false);
        this.f30233b = p6Var2;
        p6Var2.k(0.2f, 360L, prVar);
        p6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var2.r(-1);
        p6Var2.t(AndroidUtilities.dpf2(8.6f));
        p6Var2.setCallback(this);
        p6Var2.f29312b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        p6Var2.f29311a.setXfermode(new PorterDuffXfermode(mode));
        p6Var2.G = AndroidUtilities.displaySize.x;
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
        this.f30236f = z12;
        p6 p6Var = this.f30232a;
        p6 p6Var2 = this.f30233b;
        if (z11) {
            p6Var.q("GIF", true, true);
            p6Var2.q("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            p6Var.q(str, true, true);
            int[] iArr = this.f30237n;
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
                p6Var2.q("", true, true);
            } else if (length == 6) {
                p6Var2.q("2K", TextUtils.isEmpty(p6Var2.f29316g), true);
            } else if (length == 7) {
                p6Var2.q("4K", TextUtils.isEmpty(p6Var2.f29316g), true);
            } else {
                p6Var2.q("" + iArr[length], TextUtils.isEmpty(p6Var2.f29316g), true);
            }
        }
        setClickable(!this.f30236f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e7 = (1.0f - (this.h.e(this.f30236f) * 0.35f)) * 255.0f;
        int i10 = (int) e7;
        Paint paint = this.f30234c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        p6 p6Var = this.f30232a;
        float max = Math.max(dpf2, p6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        p6Var.setBounds(rect);
        p6Var.f29330w = i10;
        p6Var.draw(canvas);
        p6 p6Var2 = this.f30233b;
        float d = p6Var2.d() + (AndroidUtilities.dpf2(2.0f) * p6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.f30235e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (p6Var2.g() * e7));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        p6Var2.setBounds(rect);
        p6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f30236f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f30232a.q(str, true, true);
        this.f30233b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30232a != drawable && this.f30233b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
