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
public final class t61 extends View {
    public final m6 f28027a;
    public final m6 f28028b;
    public final Paint f28029c;
    public final Paint d;
    public final Paint e;
    public boolean f28030f;
    public final c6 h;
    public final int[] f28031n;

    public t61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f28029c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        qr qrVar = qr.h;
        this.h = new c6(this, 0L, 300L, qrVar);
        this.f28031n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        m6 m6Var = new m6(true, false, false, false);
        this.f28027a = m6Var;
        m6Var.k(0.4f, 360L, qrVar);
        m6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var.r(-1);
        m6Var.t(AndroidUtilities.dpf2(10.6f));
        m6Var.setCallback(this);
        m6Var.f26070b = 17;
        m6 m6Var2 = new m6(true, false, false, false);
        this.f28028b = m6Var2;
        m6Var2.k(0.2f, 360L, qrVar);
        m6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var2.r(-1);
        m6Var2.t(AndroidUtilities.dpf2(8.6f));
        m6Var2.setCallback(this);
        m6Var2.f26070b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        m6Var2.f26069a.setXfermode(new PorterDuffXfermode(mode));
        m6Var2.G = AndroidUtilities.displaySize.x;
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
        this.f28030f = z12;
        m6 m6Var = this.f28027a;
        m6 m6Var2 = this.f28028b;
        if (z11) {
            m6Var.q("GIF", true, true);
            m6Var2.q("", true, true);
        } else {
            if (i10 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            m6Var.q(str, true, true);
            int[] iArr = this.f28031n;
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
                m6Var2.q("", true, true);
            } else if (length == 6) {
                m6Var2.q("2K", TextUtils.isEmpty(m6Var2.f26073g), true);
            } else if (length == 7) {
                m6Var2.q("4K", TextUtils.isEmpty(m6Var2.f26073g), true);
            } else {
                m6Var2.q("" + iArr[length], TextUtils.isEmpty(m6Var2.f26073g), true);
            }
        }
        setClickable(!this.f28030f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e = (1.0f - (this.h.e(this.f28030f) * 0.35f)) * 255.0f;
        int i10 = (int) e;
        Paint paint = this.f28029c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        m6 m6Var = this.f28027a;
        float max = Math.max(dpf2, m6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        m6Var.setBounds(rect);
        m6Var.f26087w = i10;
        m6Var.draw(canvas);
        m6 m6Var2 = this.f28028b;
        float d = m6Var2.d() + (AndroidUtilities.dpf2(2.0f) * m6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (m6Var2.g() * e));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        m6Var2.setBounds(rect);
        m6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f28030f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f28027a.q(str, true, true);
        this.f28028b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28027a != drawable && this.f28028b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
