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
    public final Drawable f41565a;
    public final Drawable f41566b;
    public final TextPaint f41567c;
    public final TextPaint d;
    public final TextPaint f41568e;
    public final Paint f41569f;
    public final RectF f41570g;
    public final dc h;
    public final org.telegram.ui.Cells.k9 f41571i;
    public Runnable f41572j;
    public StaticLayout f41573k;
    public StaticLayout f41574l;
    public StaticLayout f41575m;
    public String f41576n;
    public String f41577o;
    public String f41578p;
    public int f41579q;
    public int f41580r;
    public final int f41581s;
    public final int f41582t;
    public final int f41583u;
    public final int v;
    public final int f41584w;
    public final int f41585x;
    public final int f41586y;

    public x41() {
        TextPaint textPaint = new TextPaint(1);
        this.f41567c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f41568e = textPaint3;
        this.f41569f = new Paint(1);
        this.f41570g = new RectF();
        dc dcVar = new dc((View) null);
        this.h = dcVar;
        this.f41571i = new org.telegram.ui.Cells.k9(new ff(this, 7));
        this.f41581s = org.telegram.messenger.g0.L(62.33f);
        this.f41582t = org.telegram.messenger.g0.L(12.0f);
        this.f41583u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f41584w = org.telegram.messenger.g0.L(7.0f);
        this.f41585x = org.telegram.messenger.g0.L(12.0f);
        this.f41586y = org.telegram.messenger.g0.L(2.0f);
        this.f41565a = org.telegram.messenger.t0.f26600b.getDrawable(2131232696).mutate();
        this.f41566b = org.telegram.messenger.t0.f26600b.getDrawable(2131231617).mutate();
        dcVar.f33915f = new w41(this, 0);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f41579q = i7;
        String str = this.f41578p;
        int length = str.length();
        TextPaint textPaint = this.f41568e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f41575m = new StaticLayout(this.f41578p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f41581s) - ((int) ((this.f41582t * 2) + measureText))) - this.f41585x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f41567c;
        this.f41573k = new StaticLayout(TextUtils.ellipsize(this.f41576n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f41574l = new StaticLayout(this.f41577o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f41584w * 2) + Math.max(this.f41574l.getHeight() + this.f41573k.getHeight() + this.f41586y, this.f41583u);
        this.f41580r = max;
        setBounds(0, 0, this.f41579q, max);
        return this.f41580r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f41565a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f41566b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.r1(0.11f, -16777216), mode));
        this.f41567c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f41568e.setColor(x02);
        this.f41569f.setColor(org.telegram.ui.ActionBar.j6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f41573k != null && this.f41574l != null && this.f41575m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f41573k.getHeight();
            int i13 = this.f41586y;
            canvas.save();
            canvas.translate(this.f41581s + i11, centerY - ((this.f41574l.getHeight() + (height + i13)) / 2));
            this.f41573k.draw(canvas);
            canvas.translate(0.0f, this.f41573k.getHeight() + i13);
            this.f41574l.draw(canvas);
            canvas.restore();
            int i14 = this.f41582t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f41583u / 2);
            RectF rectF = this.f41570g;
            rectF.set(L - ((int) (this.f41575m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f41569f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f41575m.getHeight()) / 2.0f) + f10);
            this.f41575m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f41566b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f41565a;
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
