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
public final class u61 extends Drawable {
    public final Drawable f28712a;
    public final Drawable f28713b;
    public final TextPaint f28714c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f28715f;
    public final RectF f28716g;
    public final yc h;
    public final me.b f28717i;
    public Runnable f28718j;
    public StaticLayout f28719k;
    public StaticLayout f28720l;
    public StaticLayout f28721m;
    public String f28722n;
    public String f28723o;
    public String f28724p;
    public int f28725q;
    public int f28726r;
    public final int f28727s;
    public final int f28728t;
    public final int f28729u;
    public final int v;
    public final int f28730w;
    public final int f28731x;
    public final int f28732y;

    public u61() {
        TextPaint textPaint = new TextPaint(1);
        this.f28714c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f28715f = new Paint(1);
        this.f28716g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f28717i = new me.b(new k2.u(this, 16));
        this.f28727s = AndroidUtilities.dp(62.33f);
        this.f28728t = AndroidUtilities.dp(12.0f);
        this.f28729u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28730w = AndroidUtilities.dp(7.0f);
        this.f28731x = AndroidUtilities.dp(12.0f);
        this.f28732y = AndroidUtilities.dp(2.0f);
        this.f28712a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28713b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30588f = new wq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28725q = i10;
        String str = this.f28724p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28721m = new StaticLayout(this.f28724p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28727s) - ((int) ((this.f28728t * 2) + measureText))) - this.f28731x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28714c;
        this.f28719k = new StaticLayout(TextUtils.ellipsize(this.f28722n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28720l = new StaticLayout(this.f28723o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28730w * 2) + Math.max(this.f28720l.getHeight() + this.f28719k.getHeight() + this.f28732y, this.f28729u);
        this.f28726r = max;
        setBounds(0, 0, this.f28725q, max);
        return this.f28726r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19154ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28712a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f28713b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f28714c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f28715f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28719k != null && this.f28720l != null && this.f28721m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28719k.getHeight();
            int i14 = this.f28732y;
            canvas.save();
            canvas.translate(this.f28727s + i12, centerY - ((this.f28720l.getHeight() + (height + i14)) / 2));
            this.f28719k.draw(canvas);
            canvas.translate(0.0f, this.f28719k.getHeight() + i14);
            this.f28720l.draw(canvas);
            canvas.restore();
            int i15 = this.f28728t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f28729u / 2);
            RectF rectF = this.f28716g;
            rectF.set(dp - ((int) (this.f28721m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28715f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28721m.getHeight()) / 2.0f) + f7);
            this.f28721m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f28713b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28712a;
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
