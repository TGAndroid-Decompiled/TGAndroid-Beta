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
    public final Drawable f38272a;
    public final Drawable f38273b;
    public final TextPaint f38274c;
    public final TextPaint d;
    public final TextPaint f38275e;
    public final Paint f38276f;
    public final RectF f38277g;
    public final ic h;
    public final org.telegram.ui.Cells.l9 f38278i;
    public Runnable f38279j;
    public StaticLayout f38280k;
    public StaticLayout f38281l;
    public StaticLayout f38282m;
    public String f38283n;
    public String f38284o;
    public String f38285p;
    public int f38286q;
    public int f38287r;
    public final int f38288s;
    public final int f38289t;
    public final int f38290u;
    public final int v;
    public final int f38291w;
    public final int f38292x;
    public final int f38293y;

    public t41() {
        TextPaint textPaint = new TextPaint(1);
        this.f38274c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f38275e = textPaint3;
        this.f38276f = new Paint(1);
        this.f38277g = new RectF();
        ic icVar = new ic((View) null);
        this.h = icVar;
        this.f38278i = new org.telegram.ui.Cells.l9(new rt(this, 5));
        this.f38288s = org.telegram.messenger.g0.L(62.33f);
        this.f38289t = org.telegram.messenger.g0.L(12.0f);
        this.f38290u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f38291w = org.telegram.messenger.g0.L(7.0f);
        this.f38292x = org.telegram.messenger.g0.L(12.0f);
        this.f38293y = org.telegram.messenger.g0.L(2.0f);
        this.f38272a = org.telegram.messenger.t0.f25566b.getDrawable(2131232695).mutate();
        this.f38273b = org.telegram.messenger.t0.f25566b.getDrawable(2131231617).mutate();
        icVar.f34700f = new kr0(this, 27);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f38286q = i7;
        String str = this.f38285p;
        int length = str.length();
        TextPaint textPaint = this.f38275e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f38282m = new StaticLayout(this.f38285p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f38288s) - ((int) ((this.f38289t * 2) + measureText))) - this.f38292x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f38274c;
        this.f38280k = new StaticLayout(TextUtils.ellipsize(this.f38283n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f38281l = new StaticLayout(this.f38284o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f38291w * 2) + Math.max(this.f38281l.getHeight() + this.f38280k.getHeight() + this.f38293y, this.f38290u);
        this.f38287r = max;
        setBounds(0, 0, this.f38286q, max);
        return this.f38287r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f38272a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f38273b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.r1(0.11f, -16777216), mode));
        this.f38274c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f38275e.setColor(x02);
        this.f38276f.setColor(org.telegram.ui.ActionBar.l6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f38280k != null && this.f38281l != null && this.f38282m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f38280k.getHeight();
            int i13 = this.f38293y;
            canvas.save();
            canvas.translate(this.f38288s + i11, centerY - ((this.f38281l.getHeight() + (height + i13)) / 2));
            this.f38280k.draw(canvas);
            canvas.translate(0.0f, this.f38280k.getHeight() + i13);
            this.f38281l.draw(canvas);
            canvas.restore();
            int i14 = this.f38289t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f38290u / 2);
            RectF rectF = this.f38277g;
            rectF.set(L - ((int) (this.f38282m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.l6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f38276f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f38282m.getHeight()) / 2.0f) + f10);
            this.f38282m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f38273b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f38272a;
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
