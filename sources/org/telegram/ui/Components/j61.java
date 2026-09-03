package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class j61 extends Drawable {
    public final Drawable f25872a;
    public final Drawable f25873b;
    public final TextPaint f25874c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25875f;
    public final RectF f25876g;
    public final rc h;
    public final yd.b f25877i;
    public Runnable f25878j;
    public StaticLayout f25879k;
    public StaticLayout f25880l;
    public StaticLayout f25881m;
    public String f25882n;
    public String f25883o;
    public String f25884p;
    public int f25885q;
    public int f25886r;
    public final int f25887s;
    public final int f25888t;
    public final int f25889u;
    public final int v;
    public final int f25890w;
    public final int f25891x;
    public final int f25892y;

    public j61() {
        TextPaint textPaint = new TextPaint(1);
        this.f25874c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25875f = new Paint(1);
        this.f25876g = new RectF();
        rc rcVar = new rc((View) null);
        this.h = rcVar;
        this.f25877i = new yd.b(new o2.i(this, 8));
        this.f25887s = AndroidUtilities.dp(62.33f);
        this.f25888t = AndroidUtilities.dp(12.0f);
        this.f25889u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25890w = AndroidUtilities.dp(7.0f);
        this.f25891x = AndroidUtilities.dp(12.0f);
        this.f25892y = AndroidUtilities.dp(2.0f);
        this.f25872a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25873b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        rcVar.f28453f = new nq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25885q = i10;
        String str = this.f25884p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25881m = new StaticLayout(this.f25884p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25887s) - ((int) ((this.f25888t * 2) + measureText))) - this.f25891x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25874c;
        this.f25879k = new StaticLayout(TextUtils.ellipsize(this.f25882n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25880l = new StaticLayout(this.f25883o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25890w * 2) + Math.max(this.f25880l.getHeight() + this.f25879k.getHeight() + this.f25892y, this.f25889u);
        this.f25886r = max;
        setBounds(0, 0, this.f25885q, max);
        return this.f25886r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25872a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f25873b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f25874c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f25875f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25879k != null && this.f25880l != null && this.f25881m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25879k.getHeight();
            int i14 = this.f25892y;
            canvas.save();
            canvas.translate(this.f25887s + i12, centerY - ((this.f25880l.getHeight() + (height + i14)) / 2));
            this.f25879k.draw(canvas);
            canvas.translate(0.0f, this.f25879k.getHeight() + i14);
            this.f25880l.draw(canvas);
            canvas.restore();
            int i15 = this.f25888t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f10 = centerY - (this.f25889u / 2);
            RectF rectF = this.f25876g;
            rectF.set(dp - ((int) (this.f25881m.getWidth() + (i15 * 2))), f10, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25875f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25881m.getHeight()) / 2.0f) + f10);
            this.f25881m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f25873b;
            kf.r.d(drawable, AndroidUtilities.dp(29.66f) + i12, f11, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25872a;
            kf.r.d(drawable2, dp2, f11, 17);
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
