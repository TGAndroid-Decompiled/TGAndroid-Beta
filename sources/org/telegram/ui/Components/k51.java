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
public final class k51 extends Drawable {
    public final Drawable f36786a;
    public final Drawable f36787b;
    public final TextPaint f36788c;
    public final TextPaint d;
    public final TextPaint f36789e;
    public final Paint f36790f;
    public final RectF f36791g;
    public final mc h;
    public final org.telegram.ui.Cells.m9 f36792i;
    public Runnable f36793j;
    public StaticLayout f36794k;
    public StaticLayout f36795l;
    public StaticLayout f36796m;
    public String f36797n;
    public String f36798o;
    public String f36799p;
    public int f36800q;
    public int f36801r;
    public final int f36802s;
    public final int f36803t;
    public final int f36804u;
    public final int v;
    public final int f36805w;
    public final int f36806x;
    public final int f36807y;

    public k51() {
        TextPaint textPaint = new TextPaint(1);
        this.f36788c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36789e = textPaint3;
        this.f36790f = new Paint(1);
        this.f36791g = new RectF();
        mc mcVar = new mc((View) null);
        this.h = mcVar;
        this.f36792i = new org.telegram.ui.Cells.m9(new qf(this, 7));
        this.f36802s = org.telegram.messenger.g0.L(62.33f);
        this.f36803t = org.telegram.messenger.g0.L(12.0f);
        this.f36804u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f36805w = org.telegram.messenger.g0.L(7.0f);
        this.f36806x = org.telegram.messenger.g0.L(12.0f);
        this.f36807y = org.telegram.messenger.g0.L(2.0f);
        this.f36786a = org.telegram.messenger.t0.f26931b.getDrawable(2131232697).mutate();
        this.f36787b = org.telegram.messenger.t0.f26931b.getDrawable(2131231618).mutate();
        mcVar.f37475f = new cp0(this, 29);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f36800q = i7;
        String str = this.f36799p;
        int length = str.length();
        TextPaint textPaint = this.f36789e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f36796m = new StaticLayout(this.f36799p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f36802s) - ((int) ((this.f36803t * 2) + measureText))) - this.f36806x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f36788c;
        this.f36794k = new StaticLayout(TextUtils.ellipsize(this.f36797n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f36795l = new StaticLayout(this.f36798o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f36805w * 2) + Math.max(this.f36795l.getHeight() + this.f36794k.getHeight() + this.f36807y, this.f36804u);
        this.f36801r = max;
        setBounds(0, 0, this.f36800q, max);
        return this.f36801r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36786a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f36787b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216), mode));
        this.f36788c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f36789e.setColor(x02);
        this.f36790f.setColor(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f36794k != null && this.f36795l != null && this.f36796m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f36794k.getHeight();
            int i13 = this.f36807y;
            canvas.save();
            canvas.translate(this.f36802s + i11, centerY - ((this.f36795l.getHeight() + (height + i13)) / 2));
            this.f36794k.draw(canvas);
            canvas.translate(0.0f, this.f36794k.getHeight() + i13);
            this.f36795l.draw(canvas);
            canvas.restore();
            int i14 = this.f36803t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f36804u / 2);
            RectF rectF = this.f36791g;
            rectF.set(L - ((int) (this.f36796m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.m6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f36790f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f36796m.getHeight()) / 2.0f) + f10);
            this.f36796m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f36787b;
            bg.t.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f36786a;
            bg.t.d(drawable2, L2, f11, 17);
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
