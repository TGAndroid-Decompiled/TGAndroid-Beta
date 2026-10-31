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
public final class x51 extends Drawable {
    public final Drawable f32357a;
    public final Drawable f32358b;
    public final TextPaint f32359c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f32360f;
    public final RectF f32361g;
    public final dc h;
    public final ge.b f32362i;
    public Runnable f32363j;
    public StaticLayout f32364k;
    public StaticLayout f32365l;
    public StaticLayout f32366m;
    public String f32367n;
    public String f32368o;
    public String f32369p;
    public int f32370q;
    public int f32371r;
    public final int f32372s;
    public final int f32373t;
    public final int f32374u;
    public final int v;
    public final int f32375w;
    public final int f32376x;
    public final int f32377y;

    public x51() {
        TextPaint textPaint = new TextPaint(1);
        this.f32359c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f32360f = new Paint(1);
        this.f32361g = new RectF();
        dc dcVar = new dc((View) null);
        this.h = dcVar;
        this.f32362i = new ge.b(new l2.f(this, 20));
        this.f32372s = org.telegram.messenger.i0.L(62.33f);
        this.f32373t = org.telegram.messenger.i0.L(12.0f);
        this.f32374u = org.telegram.messenger.i0.L(30.0f);
        this.v = org.telegram.messenger.i0.L(15.0f);
        this.f32375w = org.telegram.messenger.i0.L(7.0f);
        this.f32376x = org.telegram.messenger.i0.L(12.0f);
        this.f32377y = org.telegram.messenger.i0.L(2.0f);
        this.f32357a = org.telegram.messenger.w0.f19025b.getDrawable(2131232692).mutate();
        this.f32358b = org.telegram.messenger.w0.f19025b.getDrawable(2131231618).mutate();
        dcVar.f25388f = new j51(this, 1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setTextSize(org.telegram.messenger.i0.L(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f32370q = i10;
        String str = this.f32369p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f32366m = new StaticLayout(this.f32369p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i10 - this.f32372s) - ((int) ((this.f32373t * 2) + measureText))) - this.f32376x) - org.telegram.messenger.i0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f32359c;
        this.f32364k = new StaticLayout(TextUtils.ellipsize(this.f32367n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f32365l = new StaticLayout(this.f32368o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f32375w * 2) + Math.max(this.f32365l.getHeight() + this.f32364k.getHeight() + this.f32377y, this.f32374u);
        this.f32371r = max;
        setBounds(0, 0, this.f32370q, max);
        return this.f32371r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f32357a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f32358b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216), mode));
        this.f32359c.setColor(x02);
        this.d.setColor(i0.b.o(x02, 179));
        this.e.setColor(x02);
        this.f32360f.setColor(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f32364k != null && this.f32365l != null && this.f32366m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f32364k.getHeight();
            int i14 = this.f32377y;
            canvas.save();
            canvas.translate(this.f32372s + i12, centerY - ((this.f32365l.getHeight() + (height + i14)) / 2));
            this.f32364k.draw(canvas);
            canvas.translate(0.0f, this.f32364k.getHeight() + i14);
            this.f32365l.draw(canvas);
            canvas.restore();
            int i15 = this.f32373t;
            int L = i13 - org.telegram.messenger.i0.L(11.0f);
            float f7 = centerY - (this.f32374u / 2);
            RectF rectF = this.f32361g;
            rectF.set(L - ((int) (this.f32366m.getWidth() + (i15 * 2))), f7, L, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.t6.r1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f32360f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f32366m.getHeight()) / 2.0f) + f7);
            this.f32366m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f32358b;
            rf.o.d(drawable, org.telegram.messenger.i0.L(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.i0.L(29.66f) + i12;
            Drawable drawable2 = this.f32357a;
            rf.o.d(drawable2, L2, f10, 17);
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
