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
public final class t41 extends Drawable {
    public final Drawable f38164a;
    public final Drawable f38165b;
    public final TextPaint f38166c;
    public final TextPaint d;
    public final TextPaint f38167e;
    public final Paint f38168f;
    public final RectF f38169g;
    public final hc h;
    public final org.telegram.ui.Cells.l9 f38170i;
    public Runnable f38171j;
    public StaticLayout f38172k;
    public StaticLayout f38173l;
    public StaticLayout f38174m;
    public String f38175n;
    public String f38176o;
    public String f38177p;
    public int f38178q;
    public int f38179r;
    public final int f38180s;
    public final int f38181t;
    public final int f38182u;
    public final int v;
    public final int f38183w;
    public final int f38184x;
    public final int f38185y;

    public t41() {
        TextPaint textPaint = new TextPaint(1);
        this.f38166c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f38167e = textPaint3;
        this.f38168f = new Paint(1);
        this.f38169g = new RectF();
        hc hcVar = new hc((View) null);
        this.h = hcVar;
        this.f38170i = new org.telegram.ui.Cells.l9(new qt(this, 5));
        this.f38180s = org.telegram.messenger.g0.L(62.33f);
        this.f38181t = org.telegram.messenger.g0.L(12.0f);
        this.f38182u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f38183w = org.telegram.messenger.g0.L(7.0f);
        this.f38184x = org.telegram.messenger.g0.L(12.0f);
        this.f38185y = org.telegram.messenger.g0.L(2.0f);
        this.f38164a = org.telegram.messenger.t0.f25570b.getDrawable(2131232695).mutate();
        this.f38165b = org.telegram.messenger.t0.f25570b.getDrawable(2131231617).mutate();
        hcVar.f34300f = new jr0(this, 27);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f38178q = i7;
        String str = this.f38177p;
        int length = str.length();
        TextPaint textPaint = this.f38167e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f38174m = new StaticLayout(this.f38177p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f38180s) - ((int) ((this.f38181t * 2) + measureText))) - this.f38184x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f38166c;
        this.f38172k = new StaticLayout(TextUtils.ellipsize(this.f38175n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f38173l = new StaticLayout(this.f38176o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f38183w * 2) + Math.max(this.f38173l.getHeight() + this.f38172k.getHeight() + this.f38185y, this.f38182u);
        this.f38179r = max;
        setBounds(0, 0, this.f38178q, max);
        return this.f38179r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f38164a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f38165b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216), mode));
        this.f38166c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f38167e.setColor(x02);
        this.f38168f.setColor(org.telegram.ui.ActionBar.m6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f38172k != null && this.f38173l != null && this.f38174m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f38172k.getHeight();
            int i13 = this.f38185y;
            canvas.save();
            canvas.translate(this.f38180s + i11, centerY - ((this.f38173l.getHeight() + (height + i13)) / 2));
            this.f38172k.draw(canvas);
            canvas.translate(0.0f, this.f38172k.getHeight() + i13);
            this.f38173l.draw(canvas);
            canvas.restore();
            int i14 = this.f38181t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f38182u / 2);
            RectF rectF = this.f38169g;
            rectF.set(L - ((int) (this.f38174m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.m6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f38168f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f38174m.getHeight()) / 2.0f) + f10);
            this.f38174m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f38165b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f38164a;
            bg.s.d(drawable2, L2, f11, 17);
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
