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
public final class n71 extends View {
    public final p6 f28674a;
    public final p6 f28675b;
    public final Paint f28676c;
    public final Paint d;
    public final Paint e;
    public boolean f28677f;
    public final f6 h;
    public final int[] f28678n;

    public n71(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f28676c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        bs bsVar = bs.h;
        this.h = new f6(this, 0L, 300L, bsVar);
        this.f28678n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        p6 p6Var = new p6(true, false, false);
        this.f28674a = p6Var;
        p6Var.n(0.4f, 360L, bsVar);
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.u(-1);
        p6Var.w(AndroidUtilities.dpf2(10.6f));
        p6Var.setCallback(this);
        p6Var.f29199b = 17;
        p6 p6Var2 = new p6(true, false, false);
        this.f28675b = p6Var2;
        p6Var2.n(0.2f, 360L, bsVar);
        p6Var2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var2.u(-1);
        p6Var2.w(AndroidUtilities.dpf2(8.6f));
        p6Var2.setCallback(this);
        p6Var2.f29199b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        p6Var2.f29197a.setXfermode(new PorterDuffXfermode(mode));
        p6Var2.M = AndroidUtilities.displaySize.x;
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
        this.f28677f = z12;
        p6 p6Var = this.f28674a;
        p6 p6Var2 = this.f28675b;
        if (z11) {
            p6Var.t("GIF", true, true);
            p6Var2.t("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            p6Var.t(str, true, true);
            int[] iArr = this.f28678n;
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
                p6Var2.t("", true, true);
            } else if (length == 6) {
                p6Var2.t("2K", TextUtils.isEmpty(p6Var2.f29205i), true);
            } else if (length == 7) {
                p6Var2.t("4K", TextUtils.isEmpty(p6Var2.f29205i), true);
            } else {
                p6Var2.t("" + iArr[length], TextUtils.isEmpty(p6Var2.f29205i), true);
            }
        }
        setClickable(!this.f28677f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = com.google.android.gms.internal.play_billing.k3.B(this.h.e(this.f28677f), 0.35f, 1.0f, 255.0f);
        int i10 = (int) B;
        Paint paint = this.f28676c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        p6 p6Var = this.f28674a;
        float max = Math.max(dpf2, p6Var.c() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        p6Var.setBounds(rect);
        p6Var.B = i10;
        p6Var.draw(canvas);
        p6 p6Var2 = this.f28675b;
        float c10 = p6Var2.c() + (AndroidUtilities.dpf2(2.0f) * p6Var2.i());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - c10), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (p6Var2.i() * B));
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
        this.f28677f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f28674a.t(str, true, true);
        this.f28675b.t("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28674a != drawable && this.f28675b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
