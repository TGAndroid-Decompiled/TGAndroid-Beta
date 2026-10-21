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
public final class e71 extends Drawable {
    public final Drawable f25786a;
    public final Drawable f25787b;
    public final TextPaint f25788c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25789f;
    public final RectF f25790g;
    public final yc h;
    public final oe.b f25791i;
    public Runnable f25792j;
    public StaticLayout f25793k;
    public StaticLayout f25794l;
    public StaticLayout f25795m;
    public String f25796n;
    public String f25797o;
    public String f25798p;
    public int f25799q;
    public int f25800r;
    public final int f25801s;
    public final int f25802t;
    public final int f25803u;
    public final int v;
    public final int f25804w;
    public final int f25805x;
    public final int f25806y;

    public e71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25788c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25789f = new Paint(1);
        this.f25790g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25791i = new oe.b(new k2.w0(this, 15));
        this.f25801s = AndroidUtilities.dp(62.33f);
        this.f25802t = AndroidUtilities.dp(12.0f);
        this.f25803u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25804w = AndroidUtilities.dp(7.0f);
        this.f25805x = AndroidUtilities.dp(12.0f);
        this.f25806y = AndroidUtilities.dp(2.0f);
        this.f25786a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25787b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32630f = new hr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25799q = i10;
        String str = this.f25798p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25795m = new StaticLayout(this.f25798p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25801s) - ((int) ((this.f25802t * 2) + measureText))) - this.f25805x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25788c;
        this.f25793k = new StaticLayout(TextUtils.ellipsize(this.f25796n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25794l = new StaticLayout(this.f25797o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25804w * 2) + Math.max(this.f25794l.getHeight() + this.f25793k.getHeight() + this.f25806y, this.f25803u);
        this.f25800r = max;
        setBounds(0, 0, this.f25799q, max);
        return this.f25800r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21084ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25786a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25787b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25788c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f25789f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25793k != null && this.f25794l != null && this.f25795m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25793k.getHeight();
            int i14 = this.f25806y;
            canvas.save();
            canvas.translate(this.f25801s + i12, centerY - ((this.f25794l.getHeight() + (height + i14)) / 2));
            this.f25793k.draw(canvas);
            canvas.translate(0.0f, this.f25793k.getHeight() + i14);
            this.f25794l.draw(canvas);
            canvas.restore();
            int i15 = this.f25802t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25803u / 2);
            RectF rectF = this.f25790g;
            rectF.set(dp - ((int) (this.f25795m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25789f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25795m.getHeight()) / 2.0f) + f7);
            this.f25795m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25787b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25786a;
            zf.p.d(drawable2, dp2, f10, 17);
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
