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
    public final Drawable f36787a;
    public final Drawable f36788b;
    public final TextPaint f36789c;
    public final TextPaint d;
    public final TextPaint f36790e;
    public final Paint f36791f;
    public final RectF f36792g;
    public final mc h;
    public final org.telegram.ui.Cells.m9 f36793i;
    public Runnable f36794j;
    public StaticLayout f36795k;
    public StaticLayout f36796l;
    public StaticLayout f36797m;
    public String f36798n;
    public String f36799o;
    public String f36800p;
    public int f36801q;
    public int f36802r;
    public final int f36803s;
    public final int f36804t;
    public final int f36805u;
    public final int v;
    public final int f36806w;
    public final int f36807x;
    public final int f36808y;

    public k51() {
        TextPaint textPaint = new TextPaint(1);
        this.f36789c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36790e = textPaint3;
        this.f36791f = new Paint(1);
        this.f36792g = new RectF();
        mc mcVar = new mc((View) null);
        this.h = mcVar;
        this.f36793i = new org.telegram.ui.Cells.m9(new qf(this, 7));
        this.f36803s = org.telegram.messenger.g0.L(62.33f);
        this.f36804t = org.telegram.messenger.g0.L(12.0f);
        this.f36805u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f36806w = org.telegram.messenger.g0.L(7.0f);
        this.f36807x = org.telegram.messenger.g0.L(12.0f);
        this.f36808y = org.telegram.messenger.g0.L(2.0f);
        this.f36787a = org.telegram.messenger.t0.f26931b.getDrawable(2131232697).mutate();
        this.f36788b = org.telegram.messenger.t0.f26931b.getDrawable(2131231618).mutate();
        mcVar.f37476f = new cp0(this, 29);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f36801q = i7;
        String str = this.f36800p;
        int length = str.length();
        TextPaint textPaint = this.f36790e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f36797m = new StaticLayout(this.f36800p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f36803s) - ((int) ((this.f36804t * 2) + measureText))) - this.f36807x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f36789c;
        this.f36795k = new StaticLayout(TextUtils.ellipsize(this.f36798n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f36796l = new StaticLayout(this.f36799o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f36806w * 2) + Math.max(this.f36796l.getHeight() + this.f36795k.getHeight() + this.f36808y, this.f36805u);
        this.f36802r = max;
        setBounds(0, 0, this.f36801q, max);
        return this.f36802r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36787a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f36788b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216), mode));
        this.f36789c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f36790e.setColor(x02);
        this.f36791f.setColor(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f36795k != null && this.f36796l != null && this.f36797m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f36795k.getHeight();
            int i13 = this.f36808y;
            canvas.save();
            canvas.translate(this.f36803s + i11, centerY - ((this.f36796l.getHeight() + (height + i13)) / 2));
            this.f36795k.draw(canvas);
            canvas.translate(0.0f, this.f36795k.getHeight() + i13);
            this.f36796l.draw(canvas);
            canvas.restore();
            int i14 = this.f36804t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f36805u / 2);
            RectF rectF = this.f36792g;
            rectF.set(L - ((int) (this.f36797m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.m6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f36791f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f36797m.getHeight()) / 2.0f) + f10);
            this.f36797m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f36788b;
            bg.t.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f36787a;
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
