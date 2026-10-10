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
public final class n71 extends Drawable {
    public final Drawable f29022a;
    public final Drawable f29023b;
    public final TextPaint f29024c;
    public final TextPaint d;
    public final TextPaint f29025e;
    public final Paint f29026f;
    public final RectF f29027g;
    public final bd h;
    public final ne.b f29028i;
    public Runnable f29029j;
    public StaticLayout f29030k;
    public StaticLayout f29031l;
    public StaticLayout f29032m;
    public String f29033n;
    public String f29034o;
    public String f29035p;
    public int f29036q;
    public int f29037r;
    public final int f29038s;
    public final int f29039t;
    public final int f29040u;
    public final int v;
    public final int f29041w;
    public final int f29042x;
    public final int f29043y;

    public n71() {
        TextPaint textPaint = new TextPaint(1);
        this.f29024c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f29025e = textPaint3;
        this.f29026f = new Paint(1);
        this.f29027g = new RectF();
        bd bdVar = new bd((View) null);
        this.h = bdVar;
        this.f29028i = new ne.b(new de.m(this));
        this.f29038s = AndroidUtilities.dp(62.33f);
        this.f29039t = AndroidUtilities.dp(12.0f);
        this.f29040u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29041w = AndroidUtilities.dp(7.0f);
        this.f29042x = AndroidUtilities.dp(12.0f);
        this.f29043y = AndroidUtilities.dp(2.0f);
        this.f29022a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f29023b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        bdVar.f24926f = new pr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29036q = i10;
        String str = this.f29035p;
        int length = str.length();
        TextPaint textPaint = this.f29025e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29032m = new StaticLayout(this.f29035p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29038s) - ((int) ((this.f29039t * 2) + measureText))) - this.f29042x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f29024c;
        this.f29030k = new StaticLayout(TextUtils.ellipsize(this.f29033n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29031l = new StaticLayout(this.f29034o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29041w * 2) + Math.max(this.f29031l.getHeight() + this.f29030k.getHeight() + this.f29043y, this.f29040u);
        this.f29037r = max;
        setBounds(0, 0, this.f29036q, max);
        return this.f29037r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20898ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f29022a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f29023b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.m1(0.11f, -16777216), mode));
        this.f29024c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.f29025e.setColor(x02);
        this.f29026f.setColor(org.telegram.ui.ActionBar.i6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29030k != null && this.f29031l != null && this.f29032m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29030k.getHeight();
            int i14 = this.f29043y;
            canvas.save();
            canvas.translate(this.f29038s + i12, centerY - ((this.f29031l.getHeight() + (height + i14)) / 2));
            this.f29030k.draw(canvas);
            canvas.translate(0.0f, this.f29030k.getHeight() + i14);
            this.f29031l.draw(canvas);
            canvas.restore();
            int i15 = this.f29039t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29040u / 2);
            RectF rectF = this.f29027g;
            rectF.set(dp - ((int) (this.f29032m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f29026f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29032m.getHeight()) / 2.0f) + f7);
            this.f29032m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f29023b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f29022a;
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
