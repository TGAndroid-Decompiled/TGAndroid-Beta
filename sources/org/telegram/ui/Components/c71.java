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
public final class c71 extends Drawable {
    public final Drawable f25116a;
    public final Drawable f25117b;
    public final TextPaint f25118c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25119f;
    public final RectF f25120g;
    public final yc h;
    public final oe.b f25121i;
    public Runnable f25122j;
    public StaticLayout f25123k;
    public StaticLayout f25124l;
    public StaticLayout f25125m;
    public String f25126n;
    public String f25127o;
    public String f25128p;
    public int f25129q;
    public int f25130r;
    public final int f25131s;
    public final int f25132t;
    public final int f25133u;
    public final int v;
    public final int f25134w;
    public final int f25135x;
    public final int f25136y;

    public c71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25118c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25119f = new Paint(1);
        this.f25120g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25121i = new oe.b(new k0.b(this, 17));
        this.f25131s = AndroidUtilities.dp(62.33f);
        this.f25132t = AndroidUtilities.dp(12.0f);
        this.f25133u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25134w = AndroidUtilities.dp(7.0f);
        this.f25135x = AndroidUtilities.dp(12.0f);
        this.f25136y = AndroidUtilities.dp(2.0f);
        this.f25116a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25117b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32611f = new fr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25129q = i10;
        String str = this.f25128p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25125m = new StaticLayout(this.f25128p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25131s) - ((int) ((this.f25132t * 2) + measureText))) - this.f25135x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25118c;
        this.f25123k = new StaticLayout(TextUtils.ellipsize(this.f25126n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25124l = new StaticLayout(this.f25127o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25134w * 2) + Math.max(this.f25124l.getHeight() + this.f25123k.getHeight() + this.f25136y, this.f25133u);
        this.f25130r = max;
        setBounds(0, 0, this.f25129q, max);
        return this.f25130r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21087ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25116a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25117b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25118c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f25119f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25123k != null && this.f25124l != null && this.f25125m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25123k.getHeight();
            int i14 = this.f25136y;
            canvas.save();
            canvas.translate(this.f25131s + i12, centerY - ((this.f25124l.getHeight() + (height + i14)) / 2));
            this.f25123k.draw(canvas);
            canvas.translate(0.0f, this.f25123k.getHeight() + i14);
            this.f25124l.draw(canvas);
            canvas.restore();
            int i15 = this.f25132t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25133u / 2);
            RectF rectF = this.f25120g;
            rectF.set(dp - ((int) (this.f25125m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25119f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25125m.getHeight()) / 2.0f) + f7);
            this.f25125m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25117b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25116a;
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
