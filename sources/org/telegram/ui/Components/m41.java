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
public final class m41 extends Drawable {
    public final Drawable f35873a;
    public final Drawable f35874b;
    public final TextPaint f35875c;
    public final TextPaint d;
    public final TextPaint f35876e;
    public final Paint f35877f;
    public final RectF f35878g;
    public final ic h;
    public final org.telegram.ui.Cells.l9 f35879i;
    public Runnable f35880j;
    public StaticLayout f35881k;
    public StaticLayout f35882l;
    public StaticLayout f35883m;
    public String f35884n;
    public String f35885o;
    public String f35886p;
    public int f35887q;
    public int f35888r;
    public final int f35889s;
    public final int f35890t;
    public final int f35891u;
    public final int v;
    public final int f35892w;
    public final int f35893x;
    public final int f35894y;

    public m41() {
        TextPaint textPaint = new TextPaint(1);
        this.f35875c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f35876e = textPaint3;
        this.f35877f = new Paint(1);
        this.f35878g = new RectF();
        ic icVar = new ic((View) null);
        this.h = icVar;
        this.f35879i = new org.telegram.ui.Cells.l9(new qt(this, 5));
        this.f35889s = org.telegram.messenger.g0.L(62.33f);
        this.f35890t = org.telegram.messenger.g0.L(12.0f);
        this.f35891u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f35892w = org.telegram.messenger.g0.L(7.0f);
        this.f35893x = org.telegram.messenger.g0.L(12.0f);
        this.f35894y = org.telegram.messenger.g0.L(2.0f);
        this.f35873a = org.telegram.messenger.t0.f25555b.getDrawable(2131232695).mutate();
        this.f35874b = org.telegram.messenger.t0.f25555b.getDrawable(2131231617).mutate();
        icVar.f34590f = new ir0(this, 26);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f35887q = i7;
        String str = this.f35886p;
        int length = str.length();
        TextPaint textPaint = this.f35876e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f35883m = new StaticLayout(this.f35886p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f35889s) - ((int) ((this.f35890t * 2) + measureText))) - this.f35893x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f35875c;
        this.f35881k = new StaticLayout(TextUtils.ellipsize(this.f35884n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f35882l = new StaticLayout(this.f35885o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f35892w * 2) + Math.max(this.f35882l.getHeight() + this.f35881k.getHeight() + this.f35894y, this.f35891u);
        this.f35888r = max;
        setBounds(0, 0, this.f35887q, max);
        return this.f35888r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f35873a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f35874b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216), mode));
        this.f35875c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f35876e.setColor(x02);
        this.f35877f.setColor(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f35881k != null && this.f35882l != null && this.f35883m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f35881k.getHeight();
            int i13 = this.f35894y;
            canvas.save();
            canvas.translate(this.f35889s + i11, centerY - ((this.f35882l.getHeight() + (height + i13)) / 2));
            this.f35881k.draw(canvas);
            canvas.translate(0.0f, this.f35881k.getHeight() + i13);
            this.f35882l.draw(canvas);
            canvas.restore();
            int i14 = this.f35890t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f35891u / 2);
            RectF rectF = this.f35878g;
            rectF.set(L - ((int) (this.f35883m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f35877f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f35883m.getHeight()) / 2.0f) + f10);
            this.f35883m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f35874b;
            bg.s.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f35873a;
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
