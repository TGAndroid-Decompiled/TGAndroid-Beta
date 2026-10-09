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
public final class m71 extends Drawable {
    public final Drawable f28715a;
    public final Drawable f28716b;
    public final TextPaint f28717c;
    public final TextPaint d;
    public final TextPaint f28718e;
    public final Paint f28719f;
    public final RectF f28720g;
    public final bd h;
    public final ne.b f28721i;
    public Runnable f28722j;
    public StaticLayout f28723k;
    public StaticLayout f28724l;
    public StaticLayout f28725m;
    public String f28726n;
    public String f28727o;
    public String f28728p;
    public int f28729q;
    public int f28730r;
    public final int f28731s;
    public final int f28732t;
    public final int f28733u;
    public final int v;
    public final int f28734w;
    public final int f28735x;
    public final int f28736y;

    public m71() {
        TextPaint textPaint = new TextPaint(1);
        this.f28717c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f28718e = textPaint3;
        this.f28719f = new Paint(1);
        this.f28720g = new RectF();
        bd bdVar = new bd((View) null);
        this.h = bdVar;
        this.f28721i = new ne.b(new de.m(this));
        this.f28731s = AndroidUtilities.dp(62.33f);
        this.f28732t = AndroidUtilities.dp(12.0f);
        this.f28733u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28734w = AndroidUtilities.dp(7.0f);
        this.f28735x = AndroidUtilities.dp(12.0f);
        this.f28736y = AndroidUtilities.dp(2.0f);
        this.f28715a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28716b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        bdVar.f24975f = new or0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28729q = i10;
        String str = this.f28728p;
        int length = str.length();
        TextPaint textPaint = this.f28718e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28725m = new StaticLayout(this.f28728p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28731s) - ((int) ((this.f28732t * 2) + measureText))) - this.f28735x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28717c;
        this.f28723k = new StaticLayout(TextUtils.ellipsize(this.f28726n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28724l = new StaticLayout(this.f28727o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28734w * 2) + Math.max(this.f28724l.getHeight() + this.f28723k.getHeight() + this.f28736y, this.f28733u);
        this.f28730r = max;
        setBounds(0, 0, this.f28729q, max);
        return this.f28730r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20894ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28715a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f28716b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.m1(0.11f, -16777216), mode));
        this.f28717c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.f28718e.setColor(x02);
        this.f28719f.setColor(org.telegram.ui.ActionBar.i6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28723k != null && this.f28724l != null && this.f28725m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28723k.getHeight();
            int i14 = this.f28736y;
            canvas.save();
            canvas.translate(this.f28731s + i12, centerY - ((this.f28724l.getHeight() + (height + i14)) / 2));
            this.f28723k.draw(canvas);
            canvas.translate(0.0f, this.f28723k.getHeight() + i14);
            this.f28724l.draw(canvas);
            canvas.restore();
            int i15 = this.f28732t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f28733u / 2);
            RectF rectF = this.f28720g;
            rectF.set(dp - ((int) (this.f28725m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28719f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28725m.getHeight()) / 2.0f) + f7);
            this.f28725m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f28716b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28715a;
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
