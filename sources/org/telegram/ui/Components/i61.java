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
public final class i61 extends Drawable {
    public final Drawable f24829a;
    public final Drawable f24830b;
    public final TextPaint f24831c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f24832f;
    public final RectF f24833g;
    public final wc h;
    public final me.b f24834i;
    public Runnable f24835j;
    public StaticLayout f24836k;
    public StaticLayout f24837l;
    public StaticLayout f24838m;
    public String f24839n;
    public String f24840o;
    public String f24841p;
    public int f24842q;
    public int f24843r;
    public final int f24844s;
    public final int f24845t;
    public final int f24846u;
    public final int v;
    public final int f24847w;
    public final int f24848x;
    public final int f24849y;

    public i61() {
        TextPaint textPaint = new TextPaint(1);
        this.f24831c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f24832f = new Paint(1);
        this.f24833g = new RectF();
        wc wcVar = new wc((View) null);
        this.h = wcVar;
        this.f24834i = new me.b(new org.telegram.ui.Cells.ia(this, 4));
        this.f24844s = AndroidUtilities.dp(62.33f);
        this.f24845t = AndroidUtilities.dp(12.0f);
        this.f24846u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f24847w = AndroidUtilities.dp(7.0f);
        this.f24848x = AndroidUtilities.dp(12.0f);
        this.f24849y = AndroidUtilities.dp(2.0f);
        this.f24829a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f24830b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        wcVar.f29635f = new kq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f24842q = i10;
        String str = this.f24841p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f24838m = new StaticLayout(this.f24841p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f24844s) - ((int) ((this.f24845t * 2) + measureText))) - this.f24848x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f24831c;
        this.f24836k = new StaticLayout(TextUtils.ellipsize(this.f24839n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f24837l = new StaticLayout(this.f24840o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f24847w * 2) + Math.max(this.f24837l.getHeight() + this.f24836k.getHeight() + this.f24849y, this.f24846u);
        this.f24843r = max;
        setBounds(0, 0, this.f24842q, max);
        return this.f24843r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18959ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f24829a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f24830b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f24831c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f24832f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f24836k != null && this.f24837l != null && this.f24838m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f24836k.getHeight();
            int i14 = this.f24849y;
            canvas.save();
            canvas.translate(this.f24844s + i12, centerY - ((this.f24837l.getHeight() + (height + i14)) / 2));
            this.f24836k.draw(canvas);
            canvas.translate(0.0f, this.f24836k.getHeight() + i14);
            this.f24837l.draw(canvas);
            canvas.restore();
            int i15 = this.f24845t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f24846u / 2);
            RectF rectF = this.f24833g;
            rectF.set(dp - ((int) (this.f24838m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f24832f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f24838m.getHeight()) / 2.0f) + f7);
            this.f24838m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f24830b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f24829a;
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
