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
public final class y51 extends Drawable {
    public final Drawable f32726a;
    public final Drawable f32727b;
    public final TextPaint f32728c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f32729f;
    public final RectF f32730g;
    public final dc h;
    public final ge.b f32731i;
    public Runnable f32732j;
    public StaticLayout f32733k;
    public StaticLayout f32734l;
    public StaticLayout f32735m;
    public String f32736n;
    public String f32737o;
    public String f32738p;
    public int f32739q;
    public int f32740r;
    public final int f32741s;
    public final int f32742t;
    public final int f32743u;
    public final int v;
    public final int f32744w;
    public final int f32745x;
    public final int f32746y;

    public y51() {
        TextPaint textPaint = new TextPaint(1);
        this.f32728c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f32729f = new Paint(1);
        this.f32730g = new RectF();
        dc dcVar = new dc((View) null);
        this.h = dcVar;
        this.f32731i = new ge.b(new l2.f(this, 20));
        this.f32741s = org.telegram.messenger.i0.L(62.33f);
        this.f32742t = org.telegram.messenger.i0.L(12.0f);
        this.f32743u = org.telegram.messenger.i0.L(30.0f);
        this.v = org.telegram.messenger.i0.L(15.0f);
        this.f32744w = org.telegram.messenger.i0.L(7.0f);
        this.f32745x = org.telegram.messenger.i0.L(12.0f);
        this.f32746y = org.telegram.messenger.i0.L(2.0f);
        this.f32726a = org.telegram.messenger.w0.f18945b.getDrawable(2131232692).mutate();
        this.f32727b = org.telegram.messenger.w0.f18945b.getDrawable(2131231618).mutate();
        dcVar.f25463f = new k51(this, 1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setTextSize(org.telegram.messenger.i0.L(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f32739q = i10;
        String str = this.f32738p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f32735m = new StaticLayout(this.f32738p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i10 - this.f32741s) - ((int) ((this.f32742t * 2) + measureText))) - this.f32745x) - org.telegram.messenger.i0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f32728c;
        this.f32733k = new StaticLayout(TextUtils.ellipsize(this.f32736n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f32734l = new StaticLayout(this.f32737o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f32744w * 2) + Math.max(this.f32734l.getHeight() + this.f32733k.getHeight() + this.f32746y, this.f32743u);
        this.f32740r = max;
        setBounds(0, 0, this.f32739q, max);
        return this.f32740r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f32726a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f32727b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216), mode));
        this.f32728c.setColor(x02);
        this.d.setColor(i0.b.o(x02, 179));
        this.e.setColor(x02);
        this.f32729f.setColor(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f32733k != null && this.f32734l != null && this.f32735m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f32733k.getHeight();
            int i14 = this.f32746y;
            canvas.save();
            canvas.translate(this.f32741s + i12, centerY - ((this.f32734l.getHeight() + (height + i14)) / 2));
            this.f32733k.draw(canvas);
            canvas.translate(0.0f, this.f32733k.getHeight() + i14);
            this.f32734l.draw(canvas);
            canvas.restore();
            int i15 = this.f32742t;
            int L = i13 - org.telegram.messenger.i0.L(11.0f);
            float f7 = centerY - (this.f32743u / 2);
            RectF rectF = this.f32730g;
            rectF.set(L - ((int) (this.f32735m.getWidth() + (i15 * 2))), f7, L, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.t6.r1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f32729f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f32735m.getHeight()) / 2.0f) + f7);
            this.f32735m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f32727b;
            rf.o.d(drawable, org.telegram.messenger.i0.L(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.i0.L(29.66f) + i12;
            Drawable drawable2 = this.f32726a;
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
