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
public final class o41 extends Drawable {
    public final Drawable f36691a;
    public final Drawable f36692b;
    public final TextPaint f36693c;
    public final TextPaint d;
    public final TextPaint f36694e;
    public final Paint f36695f;
    public final RectF f36696g;
    public final gc h;
    public final org.telegram.ui.Cells.k9 f36697i;
    public Runnable f36698j;
    public StaticLayout f36699k;
    public StaticLayout f36700l;
    public StaticLayout f36701m;
    public String f36702n;
    public String f36703o;
    public String f36704p;
    public int f36705q;
    public int f36706r;
    public final int f36707s;
    public final int f36708t;
    public final int f36709u;
    public final int v;
    public final int f36710w;
    public final int f36711x;
    public final int f36712y;

    public o41() {
        TextPaint textPaint = new TextPaint(1);
        this.f36693c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36694e = textPaint3;
        this.f36695f = new Paint(1);
        this.f36696g = new RectF();
        gc gcVar = new gc((View) null);
        this.h = gcVar;
        this.f36697i = new org.telegram.ui.Cells.k9(new i9(this, 8));
        this.f36707s = org.telegram.messenger.g0.L(62.33f);
        this.f36708t = org.telegram.messenger.g0.L(12.0f);
        this.f36709u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f36710w = org.telegram.messenger.g0.L(7.0f);
        this.f36711x = org.telegram.messenger.g0.L(12.0f);
        this.f36712y = org.telegram.messenger.g0.L(2.0f);
        this.f36691a = org.telegram.messenger.t0.f25457b.getDrawable(2131232693).mutate();
        this.f36692b = org.telegram.messenger.t0.f25457b.getDrawable(2131231617).mutate();
        gcVar.f34047f = new sp0(this, 28);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i3) {
        this.f36705q = i3;
        String str = this.f36704p;
        int length = str.length();
        TextPaint textPaint = this.f36694e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f36701m = new StaticLayout(this.f36704p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i3 - this.f36707s) - ((int) ((this.f36708t * 2) + measureText))) - this.f36711x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f36693c;
        this.f36699k = new StaticLayout(TextUtils.ellipsize(this.f36702n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f36700l = new StaticLayout(this.f36703o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f36710w * 2) + Math.max(this.f36700l.getHeight() + this.f36699k.getHeight() + this.f36712y, this.f36709u);
        this.f36706r = max;
        setBounds(0, 0, this.f36705q, max);
        return this.f36706r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36691a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f36692b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216), mode));
        this.f36693c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f36694e.setColor(x02);
        this.f36695f.setColor(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i3;
        int i10;
        if (this.f36699k != null && this.f36700l != null && this.f36701m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f36699k.getHeight();
            int i13 = this.f36712y;
            canvas.save();
            canvas.translate(this.f36707s + i11, centerY - ((this.f36700l.getHeight() + (height + i13)) / 2));
            this.f36699k.draw(canvas);
            canvas.translate(0.0f, this.f36699k.getHeight() + i13);
            this.f36700l.draw(canvas);
            canvas.restore();
            int i14 = this.f36708t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f36709u / 2);
            RectF rectF = this.f36696g;
            rectF.set(L - ((int) (this.f36701m.getWidth() + (i14 * 2))), f10, L, i10 + i3);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f36695f);
            canvas.save();
            canvas.translate(width + i14, ((i3 - this.f36701m.getHeight()) / 2.0f) + f10);
            this.f36701m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f36692b;
            cg.r.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f36691a;
            cg.r.d(drawable2, L2, f11, 17);
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
