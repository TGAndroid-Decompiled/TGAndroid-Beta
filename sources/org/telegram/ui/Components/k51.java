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
    public final Drawable f36784a;
    public final Drawable f36785b;
    public final TextPaint f36786c;
    public final TextPaint d;
    public final TextPaint f36787e;
    public final Paint f36788f;
    public final RectF f36789g;
    public final mc h;
    public final org.telegram.ui.Cells.m9 f36790i;
    public Runnable f36791j;
    public StaticLayout f36792k;
    public StaticLayout f36793l;
    public StaticLayout f36794m;
    public String f36795n;
    public String f36796o;
    public String f36797p;
    public int f36798q;
    public int f36799r;
    public final int f36800s;
    public final int f36801t;
    public final int f36802u;
    public final int v;
    public final int f36803w;
    public final int f36804x;
    public final int f36805y;

    public k51() {
        TextPaint textPaint = new TextPaint(1);
        this.f36786c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36787e = textPaint3;
        this.f36788f = new Paint(1);
        this.f36789g = new RectF();
        mc mcVar = new mc((View) null);
        this.h = mcVar;
        this.f36790i = new org.telegram.ui.Cells.m9(new qf(this, 7));
        this.f36800s = org.telegram.messenger.g0.L(62.33f);
        this.f36801t = org.telegram.messenger.g0.L(12.0f);
        this.f36802u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f36803w = org.telegram.messenger.g0.L(7.0f);
        this.f36804x = org.telegram.messenger.g0.L(12.0f);
        this.f36805y = org.telegram.messenger.g0.L(2.0f);
        this.f36784a = org.telegram.messenger.t0.f26941b.getDrawable(2131232697).mutate();
        this.f36785b = org.telegram.messenger.t0.f26941b.getDrawable(2131231618).mutate();
        mcVar.f37477f = new cp0(this, 29);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f36798q = i7;
        String str = this.f36797p;
        int length = str.length();
        TextPaint textPaint = this.f36787e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f36794m = new StaticLayout(this.f36797p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f36800s) - ((int) ((this.f36801t * 2) + measureText))) - this.f36804x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f36786c;
        this.f36792k = new StaticLayout(TextUtils.ellipsize(this.f36795n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f36793l = new StaticLayout(this.f36796o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f36803w * 2) + Math.max(this.f36793l.getHeight() + this.f36792k.getHeight() + this.f36805y, this.f36802u);
        this.f36799r = max;
        setBounds(0, 0, this.f36798q, max);
        return this.f36799r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36784a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f36785b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216), mode));
        this.f36786c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f36787e.setColor(x02);
        this.f36788f.setColor(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f36792k != null && this.f36793l != null && this.f36794m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f36792k.getHeight();
            int i13 = this.f36805y;
            canvas.save();
            canvas.translate(this.f36800s + i11, centerY - ((this.f36793l.getHeight() + (height + i13)) / 2));
            this.f36792k.draw(canvas);
            canvas.translate(0.0f, this.f36792k.getHeight() + i13);
            this.f36793l.draw(canvas);
            canvas.restore();
            int i14 = this.f36801t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f36802u / 2);
            RectF rectF = this.f36789g;
            rectF.set(L - ((int) (this.f36794m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.m6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f36788f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f36794m.getHeight()) / 2.0f) + f10);
            this.f36794m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f36785b;
            bg.t.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f36784a;
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
