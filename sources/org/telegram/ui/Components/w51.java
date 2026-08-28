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
public final class w51 extends View {
    public final i6 f34114a;
    public final i6 f34115b;
    public final Paint f34116c;
    public final Paint d;
    public final Paint f34117e;
    public boolean f34118f;
    public final y5 h;
    public final int[] f34119n;

    public w51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f34116c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f34117e = paint3;
        gr grVar = gr.h;
        this.h = new y5(this, 0L, 300L, grVar);
        this.f34119n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        i6 i6Var = new i6(true, false, false, false);
        this.f34114a = i6Var;
        i6Var.k(0.4f, 360L, grVar);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dpf2(10.6f));
        i6Var.setCallback(this);
        i6Var.f29333b = 17;
        i6 i6Var2 = new i6(true, false, false, false);
        this.f34115b = i6Var2;
        i6Var2.k(0.2f, 360L, grVar);
        i6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var2.r(-1);
        i6Var2.t(AndroidUtilities.dpf2(8.6f));
        i6Var2.setCallback(this);
        i6Var2.f29333b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        i6Var2.f29332a.setXfermode(new PorterDuffXfermode(mode));
        i6Var2.G = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i9, boolean z10, boolean z11) {
        boolean z12;
        String str;
        if (z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f34118f = z12;
        i6 i6Var = this.f34114a;
        i6 i6Var2 = this.f34115b;
        if (z11) {
            i6Var.q("GIF", true, true);
            i6Var2.q("", true, true);
        } else {
            if (i9 >= 720) {
                str = "HD";
            } else {
                str = "SD";
            }
            i6Var.q(str, true, true);
            int[] iArr = this.f34119n;
            int length = iArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (i9 >= iArr[length]) {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            if (length < 0) {
                i6Var2.q("", true, true);
            } else if (length == 6) {
                i6Var2.q("2K", TextUtils.isEmpty(i6Var2.f29337g), true);
            } else if (length == 7) {
                i6Var2.q("4K", TextUtils.isEmpty(i6Var2.f29337g), true);
            } else {
                i6Var2.q("" + iArr[length], TextUtils.isEmpty(i6Var2.f29337g), true);
            }
        }
        setClickable(!this.f34118f);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e10 = (1.0f - (this.h.e(this.f34118f) * 0.35f)) * 255.0f;
        int i9 = (int) e10;
        Paint paint = this.f34116c;
        paint.setAlpha(i9);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        i6 i6Var = this.f34114a;
        float max = Math.max(dpf2, i6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        i6Var.setBounds(rect);
        i6Var.f29351w = i9;
        i6Var.draw(canvas);
        i6 i6Var2 = this.f34115b;
        float d = i6Var2.d() + (AndroidUtilities.dpf2(2.0f) * i6Var2.g());
        float dpf24 = AndroidUtilities.dpf2(8.33f);
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - d), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + dpf24));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.f34117e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        Paint paint2 = this.d;
        paint2.setAlpha((int) (i6Var2.g() * e10));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        i6Var2.setBounds(rect);
        i6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        String str;
        this.f34118f = false;
        if (z10) {
            str = "HD";
        } else {
            str = "SD";
        }
        this.f34114a.q(str, true, true);
        this.f34115b.q("", false, true);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f34114a != drawable && this.f34115b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
