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
    public final Paint f37267a;
    public final org.telegram.ui.Components.j6 f37268b;
    public final TextPaint f37269c;
    public StaticLayout d;
    public float f37270e;
    public float f37271f;
    public final org.telegram.ui.Components.j6 h;
    public String f37272n;
    public boolean f37273r;
    public final org.telegram.ui.Components.z5 f37274s;
    public boolean v;
    public int f37275w;

    public gu0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f37267a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f37269c = textPaint;
        this.f37273r = false;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f37274s = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f37268b = j6Var;
        j6Var.k(0.3f, 320L, prVar);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(this);
        j6Var.q("0", true, true);
        j6Var.G = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
        this.h = j6Var2;
        j6Var2.k(0.3f, 320L, prVar);
        j6Var2.r(-1);
        j6Var2.t(AndroidUtilities.dp(14.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.setCallback(this);
        j6Var2.q("0", true, true);
        j6Var2.G = AndroidUtilities.displaySize.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z4) {
        int i12;
        boolean z10;
        boolean z11 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.f37272n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        if (LocaleController.isRTL) {
            i12 = max2;
        } else {
            i12 = max;
        }
        String format = String.format("%d", Integer.valueOf(i12));
        if (z4 && !this.v && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37268b.q(format, z10, true);
        if (!LocaleController.isRTL) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z4 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        }
        this.h.q(format2, z11, true);
        this.v = !z4;
    }

    public final void c() {
        this.f37272n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.f37269c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f37270e = this.d.getLineWidth(0);
            this.f37271f = this.d.getLineDescent(0);
            return;
        }
        this.f37270e = 0.0f;
        this.f37271f = 0.0f;
    }

    public final void d(boolean z4, boolean z10) {
        float f10;
        if (this.f37273r != z4) {
            this.f37273r = z4;
            if (!z4) {
                this.v = true;
            }
            if (!z10) {
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f37274s.d(f10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f37273r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f37273r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f37274s.d(f10, false);
        if (d <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.j6 j6Var = this.f37268b;
        float d10 = j6Var.d() + this.f37270e;
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        float d11 = j6Var2.d() + d10 + AndroidUtilities.dp(18.0f);
        float f11 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.f37275w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - d11) / 2.0f, AndroidUtilities.dpf2(10.0f) + f11, (getWidth() + d11) / 2.0f, AndroidUtilities.dpf2(33.0f) + f11);
        Paint paint = this.f37267a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - d11) / 2.0f) + AndroidUtilities.dp(9.0f), f11 + AndroidUtilities.dp(9.5f));
        j6Var.setBounds(0, 0, (int) j6Var.d(), AndroidUtilities.dp(23.0f));
        int i10 = (int) (d * 255.0f);
        j6Var.f28047w = i10;
        j6Var.draw(canvas);
        canvas.translate(j6Var.d(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f37270e)) / 2.0f, ((this.f37271f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.f37269c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f37270e, 0.0f);
        j6Var2.setBounds(0, 0, (int) j6Var2.d(), AndroidUtilities.dp(23.0f));
        j6Var2.f28047w = i10;
        j6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f37275w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.f37268b.G = size;
        this.h.G = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), b.B(43.0f, this.f37275w, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f37268b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
