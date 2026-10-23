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
public final class l71 extends Drawable {
    public final Drawable f28239a;
    public final Drawable f28240b;
    public final TextPaint f28241c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f28242f;
    public final RectF f28243g;
    public final yc h;
    public final oe.b f28244i;
    public Runnable f28245j;
    public StaticLayout f28246k;
    public StaticLayout f28247l;
    public StaticLayout f28248m;
    public String f28249n;
    public String f28250o;
    public String f28251p;
    public int f28252q;
    public int f28253r;
    public final int f28254s;
    public final int f28255t;
    public final int f28256u;
    public final int v;
    public final int f28257w;
    public final int f28258x;
    public final int f28259y;

    public l71() {
        TextPaint textPaint = new TextPaint(1);
        this.f28241c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f28242f = new Paint(1);
        this.f28243g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f28244i = new oe.b(new k2.w0(this, 15));
        this.f28254s = AndroidUtilities.dp(62.33f);
        this.f28255t = AndroidUtilities.dp(12.0f);
        this.f28256u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28257w = AndroidUtilities.dp(7.0f);
        this.f28258x = AndroidUtilities.dp(12.0f);
        this.f28259y = AndroidUtilities.dp(2.0f);
        this.f28239a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28240b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32870f = new kr0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28252q = i10;
        String str = this.f28251p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28248m = new StaticLayout(this.f28251p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28254s) - ((int) ((this.f28255t * 2) + measureText))) - this.f28258x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28241c;
        this.f28246k = new StaticLayout(TextUtils.ellipsize(this.f28249n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28247l = new StaticLayout(this.f28250o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28257w * 2) + Math.max(this.f28247l.getHeight() + this.f28246k.getHeight() + this.f28259y, this.f28256u);
        this.f28253r = max;
        setBounds(0, 0, this.f28252q, max);
        return this.f28253r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21277ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28239a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f28240b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.o1(0.11f, -16777216), mode));
        this.f28241c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f28242f.setColor(org.telegram.ui.ActionBar.k6.o1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28246k != null && this.f28247l != null && this.f28248m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28246k.getHeight();
            int i14 = this.f28259y;
            canvas.save();
            canvas.translate(this.f28254s + i12, centerY - ((this.f28247l.getHeight() + (height + i14)) / 2));
            this.f28246k.draw(canvas);
            canvas.translate(0.0f, this.f28246k.getHeight() + i14);
            this.f28247l.draw(canvas);
            canvas.restore();
            int i15 = this.f28255t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f28256u / 2);
            RectF rectF = this.f28243g;
            rectF.set(dp - ((int) (this.f28248m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.o1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28242f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28248m.getHeight()) / 2.0f) + f7);
            this.f28248m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f28240b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28239a;
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
