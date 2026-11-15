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
public final class x41 extends Drawable {
    public final Drawable f41568a;
    public final Drawable f41569b;
    public final TextPaint f41570c;
    public final TextPaint d;
    public final TextPaint f41571e;
    public final Paint f41572f;
    public final RectF f41573g;
    public final dc h;
    public final org.telegram.ui.Cells.k9 f41574i;
    public Runnable f41575j;
    public StaticLayout f41576k;
    public StaticLayout f41577l;
    public StaticLayout f41578m;
    public String f41579n;
    public String f41580o;
    public String f41581p;
    public int f41582q;
    public int f41583r;
    public final int f41584s;
    public final int f41585t;
    public final int f41586u;
    public final int v;
    public final int f41587w;
    public final int f41588x;
    public final int f41589y;

    public x41() {
        TextPaint textPaint = new TextPaint(1);
        this.f41570c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f41571e = textPaint3;
        this.f41572f = new Paint(1);
        this.f41573g = new RectF();
        dc dcVar = new dc((View) null);
        this.h = dcVar;
        this.f41574i = new org.telegram.ui.Cells.k9(new ff(this, 7));
        this.f41584s = org.telegram.messenger.g0.L(62.33f);
        this.f41585t = org.telegram.messenger.g0.L(12.0f);
        this.f41586u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f41587w = org.telegram.messenger.g0.L(7.0f);
        this.f41588x = org.telegram.messenger.g0.L(12.0f);
        this.f41589y = org.telegram.messenger.g0.L(2.0f);
        this.f41568a = org.telegram.messenger.t0.f26609b.getDrawable(2131232696).mutate();
        this.f41569b = org.telegram.messenger.t0.f26609b.getDrawable(2131231617).mutate();
        dcVar.f33902f = new w41(this, 0);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f41582q = i7;
        String str = this.f41581p;
        int length = str.length();
        TextPaint textPaint = this.f41571e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f41578m = new StaticLayout(this.f41581p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f41584s) - ((int) ((this.f41585t * 2) + measureText))) - this.f41588x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f41570c;
        this.f41576k = new StaticLayout(TextUtils.ellipsize(this.f41579n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f41577l = new StaticLayout(this.f41580o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f41587w * 2) + Math.max(this.f41577l.getHeight() + this.f41576k.getHeight() + this.f41589y, this.f41586u);
        this.f41583r = max;
        setBounds(0, 0, this.f41582q, max);
        return this.f41583r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f41568a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f41569b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.r1(0.11f, -16777216), mode));
        this.f41570c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f41571e.setColor(x02);
        this.f41572f.setColor(org.telegram.ui.ActionBar.j6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f41576k != null && this.f41577l != null && this.f41578m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f41576k.getHeight();
            int i13 = this.f41589y;
            canvas.save();
            canvas.translate(this.f41584s + i11, centerY - ((this.f41577l.getHeight() + (height + i13)) / 2));
            this.f41576k.draw(canvas);
            canvas.translate(0.0f, this.f41576k.getHeight() + i13);
            this.f41577l.draw(canvas);
            canvas.restore();
            int i14 = this.f41585t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f41586u / 2);
            RectF rectF = this.f41573g;
            rectF.set(L - ((int) (this.f41578m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f41572f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f41578m.getHeight()) / 2.0f) + f10);
            this.f41578m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f41569b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f41568a;
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
