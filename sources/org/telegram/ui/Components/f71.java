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
public final class f71 extends View {
    public final n6 f22919a;
    public final n6 f22920b;
    public final Paint f22921c;
    public final Paint d;
    public final Paint e;
    public boolean f22922f;
    public final d6 h;
    public final int[] f22923n;

    public f71(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f22921c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        wr wrVar = wr.h;
        this.h = new d6(this, 0L, 300L, wrVar);
        this.f22923n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        n6 n6Var = new n6(true, false, false, false);
        this.f22919a = n6Var;
        n6Var.k(0.4f, 360L, wrVar);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dpf2(10.6f));
        n6Var.setCallback(this);
        n6Var.f25425b = 17;
        n6 n6Var2 = new n6(true, false, false, false);
        this.f22920b = n6Var2;
        n6Var2.k(0.2f, 360L, wrVar);
        n6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var2.r(-1);
        n6Var2.t(AndroidUtilities.dpf2(8.6f));
        n6Var2.setCallback(this);
        n6Var2.f25425b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        n6Var2.f25424a.setXfermode(new PorterDuffXfermode(mode));
        n6Var2.G = AndroidUtilities.displaySize.x;
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
        this.f22922f = z12;
        n6 n6Var = this.f22919a;
        n6 n6Var2 = this.f22920b;
        if (z11) {
            n6Var.q("GIF", true, true);
            n6Var2.q("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            n6Var.q(str, true, true);
            int[] iArr = this.f22923n;
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
                n6Var2.q("", true, true);
            } else if (length == 6) {
                n6Var2.q("2K", TextUtils.isEmpty(n6Var2.f25428g), true);
            } else if (length == 7) {
                n6Var2.q("4K", TextUtils.isEmpty(n6Var2.f25428g), true);
            } else {
                n6Var2.q("" + iArr[length], TextUtils.isEmpty(n6Var2.f25428g), true);
            }
        }
        setClickable(!this.f22922f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e = (1.0f - (this.h.e(this.f22922f) * 0.35f)) * 255.0f;
        int i10 = (int) e;
        Paint paint = this.f22921c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        n6 n6Var = this.f22919a;
        float max = Math.max(dpf2, n6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        n6Var.setBounds(rect);
        n6Var.f25442w = i10;
        n6Var.draw(canvas);
        n6 n6Var2 = this.f22920b;
        float d = n6Var2.d() + (AndroidUtilities.dpf2(2.0f) * n6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (n6Var2.g() * e));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        n6Var2.setBounds(rect);
        n6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f22922f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f22919a.q(str, true, true);
        this.f22920b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22919a != drawable && this.f22920b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
