package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gu0 extends View {
    public final Paint f37659a;
    public final org.telegram.ui.Components.n6 f37660b;
    public final TextPaint f37661c;
    public StaticLayout d;
    public float e;
    public float f37662f;
    public final org.telegram.ui.Components.n6 h;
    public String f37663n;
    public boolean f37664r;
    public final org.telegram.ui.Components.d6 f37665s;
    public boolean v;
    public int f37666w;

    public gu0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f37659a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f37661c = textPaint;
        this.f37664r = false;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.f37665s = new org.telegram.ui.Components.d6(this, 0L, 350L, zrVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f37660b = n6Var;
        n6Var.n(0.3f, 320L, zrVar);
        n6Var.u(-1);
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.x(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.t("0", true, true);
        n6Var.M = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, true);
        this.h = n6Var2;
        n6Var2.n(0.3f, 320L, zrVar);
        n6Var2.u(-1);
        n6Var2.w(AndroidUtilities.dp(14.0f));
        n6Var2.x(AndroidUtilities.bold());
        n6Var2.setCallback(this);
        n6Var2.t("0", true, true);
        n6Var2.M = AndroidUtilities.displaySize.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        boolean z12 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.f37663n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        if (LocaleController.isRTL) {
            i12 = max2;
        } else {
            i12 = max;
        }
        String format = String.format("%d", Integer.valueOf(i12));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37660b.t(format, z11, true);
        if (!LocaleController.isRTL) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z12 = true;
        }
        this.h.t(format2, z12, true);
        this.v = !z10;
    }

    public final void c() {
        this.f37663n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.f37661c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.e = this.d.getLineWidth(0);
            this.f37662f = this.d.getLineDescent(0);
            return;
        }
        this.e = 0.0f;
        this.f37662f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f7;
        if (this.f37664r != z10) {
            this.f37664r = z10;
            if (!z10) {
                this.v = true;
            }
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.f37665s.d(f7, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f37664r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f37664r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f37665s.d(f7, false);
        if (d <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.n6 n6Var = this.f37660b;
        float c10 = n6Var.c() + this.e;
        org.telegram.ui.Components.n6 n6Var2 = this.h;
        float c11 = n6Var2.c() + c10 + AndroidUtilities.dp(18.0f);
        float f10 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.f37666w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - c11) / 2.0f, AndroidUtilities.dpf2(10.0f) + f10, (getWidth() + c11) / 2.0f, AndroidUtilities.dpf2(33.0f) + f10);
        Paint paint = this.f37659a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - c11) / 2.0f) + AndroidUtilities.dp(9.0f), f10 + AndroidUtilities.dp(9.5f));
        n6Var.setBounds(0, 0, (int) n6Var.c(), AndroidUtilities.dp(23.0f));
        int i10 = (int) (d * 255.0f);
        n6Var.B = i10;
        n6Var.draw(canvas);
        canvas.translate(n6Var.c(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.e)) / 2.0f, ((this.f37662f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.f37661c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.e, 0.0f);
        n6Var2.setBounds(0, 0, (int) n6Var2.c(), AndroidUtilities.dp(23.0f));
        n6Var2.B = i10;
        n6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f37666w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.f37660b.M = size;
        this.h.M = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.tl.C(43.0f, this.f37666w, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f37660b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
