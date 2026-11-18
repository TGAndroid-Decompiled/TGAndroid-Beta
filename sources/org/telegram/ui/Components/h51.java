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
public final class h51 extends Drawable {
    public final Drawable f35733a;
    public final Drawable f35734b;
    public final TextPaint f35735c;
    public final TextPaint d;
    public final TextPaint f35736e;
    public final Paint f35737f;
    public final RectF f35738g;
    public final mc h;
    public final org.telegram.ui.Cells.m9 f35739i;
    public Runnable f35740j;
    public StaticLayout f35741k;
    public StaticLayout f35742l;
    public StaticLayout f35743m;
    public String f35744n;
    public String f35745o;
    public String f35746p;
    public int f35747q;
    public int f35748r;
    public final int f35749s;
    public final int f35750t;
    public final int f35751u;
    public final int v;
    public final int f35752w;
    public final int f35753x;
    public final int f35754y;

    public h51() {
        TextPaint textPaint = new TextPaint(1);
        this.f35735c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f35736e = textPaint3;
        this.f35737f = new Paint(1);
        this.f35738g = new RectF();
        mc mcVar = new mc((View) null);
        this.h = mcVar;
        this.f35739i = new org.telegram.ui.Cells.m9(new of(this, 7));
        this.f35749s = org.telegram.messenger.g0.L(62.33f);
        this.f35750t = org.telegram.messenger.g0.L(12.0f);
        this.f35751u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f35752w = org.telegram.messenger.g0.L(7.0f);
        this.f35753x = org.telegram.messenger.g0.L(12.0f);
        this.f35754y = org.telegram.messenger.g0.L(2.0f);
        this.f35733a = org.telegram.messenger.t0.f26913b.getDrawable(2131232697).mutate();
        this.f35734b = org.telegram.messenger.t0.f26913b.getDrawable(2131231618).mutate();
        mcVar.f37432f = new ap0(this, 29);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f35747q = i7;
        String str = this.f35746p;
        int length = str.length();
        TextPaint textPaint = this.f35736e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f35743m = new StaticLayout(this.f35746p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f35749s) - ((int) ((this.f35750t * 2) + measureText))) - this.f35753x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f35735c;
        this.f35741k = new StaticLayout(TextUtils.ellipsize(this.f35744n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f35742l = new StaticLayout(this.f35745o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f35752w * 2) + Math.max(this.f35742l.getHeight() + this.f35741k.getHeight() + this.f35754y, this.f35751u);
        this.f35748r = max;
        setBounds(0, 0, this.f35747q, max);
        return this.f35748r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f35733a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f35734b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.r1(0.11f, -16777216), mode));
        this.f35735c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f35736e.setColor(x02);
        this.f35737f.setColor(org.telegram.ui.ActionBar.n6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f35741k != null && this.f35742l != null && this.f35743m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f35741k.getHeight();
            int i13 = this.f35754y;
            canvas.save();
            canvas.translate(this.f35749s + i11, centerY - ((this.f35742l.getHeight() + (height + i13)) / 2));
            this.f35741k.draw(canvas);
            canvas.translate(0.0f, this.f35741k.getHeight() + i13);
            this.f35742l.draw(canvas);
            canvas.restore();
            int i14 = this.f35750t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f35751u / 2);
            RectF rectF = this.f35738g;
            rectF.set(L - ((int) (this.f35743m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.n6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f35737f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f35743m.getHeight()) / 2.0f) + f10);
            this.f35743m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f35734b;
            bg.t.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f35733a;
            bg.t.d(drawable2, L2, f11, 17);
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
