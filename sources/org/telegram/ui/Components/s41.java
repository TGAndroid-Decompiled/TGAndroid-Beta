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
public final class s41 extends Drawable {
    public final Drawable f37899a;
    public final Drawable f37900b;
    public final TextPaint f37901c;
    public final TextPaint d;
    public final TextPaint f37902e;
    public final Paint f37903f;
    public final RectF f37904g;
    public final ic h;
    public final org.telegram.ui.Cells.l9 f37905i;
    public Runnable f37906j;
    public StaticLayout f37907k;
    public StaticLayout f37908l;
    public StaticLayout f37909m;
    public String f37910n;
    public String f37911o;
    public String f37912p;
    public int f37913q;
    public int f37914r;
    public final int f37915s;
    public final int f37916t;
    public final int f37917u;
    public final int v;
    public final int f37918w;
    public final int f37919x;
    public final int f37920y;

    public s41() {
        TextPaint textPaint = new TextPaint(1);
        this.f37901c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f37902e = textPaint3;
        this.f37903f = new Paint(1);
        this.f37904g = new RectF();
        ic icVar = new ic((View) null);
        this.h = icVar;
        this.f37905i = new org.telegram.ui.Cells.l9(new rt(this, 5));
        this.f37915s = org.telegram.messenger.g0.L(62.33f);
        this.f37916t = org.telegram.messenger.g0.L(12.0f);
        this.f37917u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f37918w = org.telegram.messenger.g0.L(7.0f);
        this.f37919x = org.telegram.messenger.g0.L(12.0f);
        this.f37920y = org.telegram.messenger.g0.L(2.0f);
        this.f37899a = org.telegram.messenger.t0.f25566b.getDrawable(2131232695).mutate();
        this.f37900b = org.telegram.messenger.t0.f25566b.getDrawable(2131231617).mutate();
        icVar.f34627f = new ir0(this, 27);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f37913q = i7;
        String str = this.f37912p;
        int length = str.length();
        TextPaint textPaint = this.f37902e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f37909m = new StaticLayout(this.f37912p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f37915s) - ((int) ((this.f37916t * 2) + measureText))) - this.f37919x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f37901c;
        this.f37907k = new StaticLayout(TextUtils.ellipsize(this.f37910n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f37908l = new StaticLayout(this.f37911o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f37918w * 2) + Math.max(this.f37908l.getHeight() + this.f37907k.getHeight() + this.f37920y, this.f37917u);
        this.f37914r = max;
        setBounds(0, 0, this.f37913q, max);
        return this.f37914r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f37899a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f37900b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216), mode));
        this.f37901c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f37902e.setColor(x02);
        this.f37903f.setColor(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f37907k != null && this.f37908l != null && this.f37909m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f37907k.getHeight();
            int i13 = this.f37920y;
            canvas.save();
            canvas.translate(this.f37915s + i11, centerY - ((this.f37908l.getHeight() + (height + i13)) / 2));
            this.f37907k.draw(canvas);
            canvas.translate(0.0f, this.f37907k.getHeight() + i13);
            this.f37908l.draw(canvas);
            canvas.restore();
            int i14 = this.f37916t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f37917u / 2);
            RectF rectF = this.f37904g;
            rectF.set(L - ((int) (this.f37909m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f37903f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f37909m.getHeight()) / 2.0f) + f10);
            this.f37909m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f37900b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f37899a;
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
