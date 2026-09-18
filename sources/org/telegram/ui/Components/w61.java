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
public final class w61 extends Drawable {
    public final Drawable f29870a;
    public final Drawable f29871b;
    public final TextPaint f29872c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f29873f;
    public final RectF f29874g;
    public final yc h;
    public final me.b f29875i;
    public Runnable f29876j;
    public StaticLayout f29877k;
    public StaticLayout f29878l;
    public StaticLayout f29879m;
    public String f29880n;
    public String f29881o;
    public String f29882p;
    public int f29883q;
    public int f29884r;
    public final int f29885s;
    public final int f29886t;
    public final int f29887u;
    public final int v;
    public final int f29888w;
    public final int f29889x;
    public final int f29890y;

    public w61() {
        TextPaint textPaint = new TextPaint(1);
        this.f29872c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f29873f = new Paint(1);
        this.f29874g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f29875i = new me.b(new k2.u(this, 16));
        this.f29885s = AndroidUtilities.dp(62.33f);
        this.f29886t = AndroidUtilities.dp(12.0f);
        this.f29887u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29888w = AndroidUtilities.dp(7.0f);
        this.f29889x = AndroidUtilities.dp(12.0f);
        this.f29890y = AndroidUtilities.dp(2.0f);
        this.f29870a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f29871b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30548f = new xq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29883q = i10;
        String str = this.f29882p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29879m = new StaticLayout(this.f29882p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29885s) - ((int) ((this.f29886t * 2) + measureText))) - this.f29889x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f29872c;
        this.f29877k = new StaticLayout(TextUtils.ellipsize(this.f29880n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29878l = new StaticLayout(this.f29881o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29888w * 2) + Math.max(this.f29878l.getHeight() + this.f29877k.getHeight() + this.f29890y, this.f29887u);
        this.f29884r = max;
        setBounds(0, 0, this.f29883q, max);
        return this.f29884r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19158ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f29870a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f29871b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f29872c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f29873f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29877k != null && this.f29878l != null && this.f29879m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29877k.getHeight();
            int i14 = this.f29890y;
            canvas.save();
            canvas.translate(this.f29885s + i12, centerY - ((this.f29878l.getHeight() + (height + i14)) / 2));
            this.f29877k.draw(canvas);
            canvas.translate(0.0f, this.f29877k.getHeight() + i14);
            this.f29878l.draw(canvas);
            canvas.restore();
            int i15 = this.f29886t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29887u / 2);
            RectF rectF = this.f29874g;
            rectF.set(dp - ((int) (this.f29879m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f29873f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29879m.getHeight()) / 2.0f) + f7);
            this.f29879m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f29871b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f29870a;
            yf.p.d(drawable2, dp2, f10, 17);
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
