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
public final class r41 extends Drawable {
    public final Drawable f37531a;
    public final Drawable f37532b;
    public final TextPaint f37533c;
    public final TextPaint d;
    public final TextPaint f37534e;
    public final Paint f37535f;
    public final RectF f37536g;
    public final ic h;
    public final org.telegram.ui.Cells.l9 f37537i;
    public Runnable f37538j;
    public StaticLayout f37539k;
    public StaticLayout f37540l;
    public StaticLayout f37541m;
    public String f37542n;
    public String f37543o;
    public String f37544p;
    public int f37545q;
    public int f37546r;
    public final int f37547s;
    public final int f37548t;
    public final int f37549u;
    public final int v;
    public final int f37550w;
    public final int f37551x;
    public final int f37552y;

    public r41() {
        TextPaint textPaint = new TextPaint(1);
        this.f37533c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f37534e = textPaint3;
        this.f37535f = new Paint(1);
        this.f37536g = new RectF();
        ic icVar = new ic((View) null);
        this.h = icVar;
        this.f37537i = new org.telegram.ui.Cells.l9(new qt(this, 5));
        this.f37547s = org.telegram.messenger.g0.L(62.33f);
        this.f37548t = org.telegram.messenger.g0.L(12.0f);
        this.f37549u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f37550w = org.telegram.messenger.g0.L(7.0f);
        this.f37551x = org.telegram.messenger.g0.L(12.0f);
        this.f37552y = org.telegram.messenger.g0.L(2.0f);
        this.f37531a = org.telegram.messenger.t0.f25555b.getDrawable(2131232695).mutate();
        this.f37532b = org.telegram.messenger.t0.f25555b.getDrawable(2131231617).mutate();
        icVar.f34553f = new ir0(this, 27);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f37545q = i7;
        String str = this.f37544p;
        int length = str.length();
        TextPaint textPaint = this.f37534e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f37541m = new StaticLayout(this.f37544p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f37547s) - ((int) ((this.f37548t * 2) + measureText))) - this.f37551x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f37533c;
        this.f37539k = new StaticLayout(TextUtils.ellipsize(this.f37542n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f37540l = new StaticLayout(this.f37543o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f37550w * 2) + Math.max(this.f37540l.getHeight() + this.f37539k.getHeight() + this.f37552y, this.f37549u);
        this.f37546r = max;
        setBounds(0, 0, this.f37545q, max);
        return this.f37546r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f37531a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f37532b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216), mode));
        this.f37533c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f37534e.setColor(x02);
        this.f37535f.setColor(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f37539k != null && this.f37540l != null && this.f37541m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f37539k.getHeight();
            int i13 = this.f37552y;
            canvas.save();
            canvas.translate(this.f37547s + i11, centerY - ((this.f37540l.getHeight() + (height + i13)) / 2));
            this.f37539k.draw(canvas);
            canvas.translate(0.0f, this.f37539k.getHeight() + i13);
            this.f37540l.draw(canvas);
            canvas.restore();
            int i14 = this.f37548t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f37549u / 2);
            RectF rectF = this.f37536g;
            rectF.set(L - ((int) (this.f37541m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f37535f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f37541m.getHeight()) / 2.0f) + f10);
            this.f37541m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f37532b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f37531a;
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
