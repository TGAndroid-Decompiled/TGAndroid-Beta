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
    public final Drawable f25789a;
    public final Drawable f25790b;
    public final TextPaint f25791c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25792f;
    public final RectF f25793g;
    public final yc h;
    public final oe.b f25794i;
    public Runnable f25795j;
    public StaticLayout f25796k;
    public StaticLayout f25797l;
    public StaticLayout f25798m;
    public String f25799n;
    public String f25800o;
    public String f25801p;
    public int f25802q;
    public int f25803r;
    public final int f25804s;
    public final int f25805t;
    public final int f25806u;
    public final int v;
    public final int f25807w;
    public final int f25808x;
    public final int f25809y;

    public e71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25791c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25792f = new Paint(1);
        this.f25793g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25794i = new oe.b(new k2.w0(this, 15));
        this.f25804s = AndroidUtilities.dp(62.33f);
        this.f25805t = AndroidUtilities.dp(12.0f);
        this.f25806u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25807w = AndroidUtilities.dp(7.0f);
        this.f25808x = AndroidUtilities.dp(12.0f);
        this.f25809y = AndroidUtilities.dp(2.0f);
        this.f25789a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25790b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32633f = new hr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25802q = i10;
        String str = this.f25801p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25798m = new StaticLayout(this.f25801p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25804s) - ((int) ((this.f25805t * 2) + measureText))) - this.f25808x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25791c;
        this.f25796k = new StaticLayout(TextUtils.ellipsize(this.f25799n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25797l = new StaticLayout(this.f25800o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25807w * 2) + Math.max(this.f25797l.getHeight() + this.f25796k.getHeight() + this.f25809y, this.f25806u);
        this.f25803r = max;
        setBounds(0, 0, this.f25802q, max);
        return this.f25803r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21087ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25789a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25790b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25791c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f25792f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25796k != null && this.f25797l != null && this.f25798m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25796k.getHeight();
            int i14 = this.f25809y;
            canvas.save();
            canvas.translate(this.f25804s + i12, centerY - ((this.f25797l.getHeight() + (height + i14)) / 2));
            this.f25796k.draw(canvas);
            canvas.translate(0.0f, this.f25796k.getHeight() + i14);
            this.f25797l.draw(canvas);
            canvas.restore();
            int i15 = this.f25805t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25806u / 2);
            RectF rectF = this.f25793g;
            rectF.set(dp - ((int) (this.f25798m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25792f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25798m.getHeight()) / 2.0f) + f7);
            this.f25798m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25790b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25789a;
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
