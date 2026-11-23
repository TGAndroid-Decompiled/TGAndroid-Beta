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
public final class j51 extends Drawable {
    public final Drawable f36277a;
    public final Drawable f36278b;
    public final TextPaint f36279c;
    public final TextPaint d;
    public final TextPaint f36280e;
    public final Paint f36281f;
    public final RectF f36282g;
    public final lc h;
    public final org.telegram.ui.Cells.l9 f36283i;
    public Runnable f36284j;
    public StaticLayout f36285k;
    public StaticLayout f36286l;
    public StaticLayout f36287m;
    public String f36288n;
    public String f36289o;
    public String f36290p;
    public int f36291q;
    public int f36292r;
    public final int f36293s;
    public final int f36294t;
    public final int f36295u;
    public final int v;
    public final int f36296w;
    public final int f36297x;
    public final int f36298y;

    public j51() {
        TextPaint textPaint = new TextPaint(1);
        this.f36279c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f36280e = textPaint3;
        this.f36281f = new Paint(1);
        this.f36282g = new RectF();
        lc lcVar = new lc((View) null);
        this.h = lcVar;
        this.f36283i = new org.telegram.ui.Cells.l9(new org.telegram.ui.Cells.aa(this, 9));
        this.f36293s = org.telegram.messenger.g0.L(62.33f);
        this.f36294t = org.telegram.messenger.g0.L(12.0f);
        this.f36295u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.f36296w = org.telegram.messenger.g0.L(7.0f);
        this.f36297x = org.telegram.messenger.g0.L(12.0f);
        this.f36298y = org.telegram.messenger.g0.L(2.0f);
        this.f36277a = org.telegram.messenger.t0.f27013b.getDrawable(2131232700).mutate();
        this.f36278b = org.telegram.messenger.t0.f27013b.getDrawable(2131231621).mutate();
        lcVar.f37107f = new bp0(this, 29);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i7) {
        this.f36291q = i7;
        String str = this.f36290p;
        int length = str.length();
        TextPaint textPaint = this.f36280e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f36287m = new StaticLayout(this.f36290p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int L = (((i7 - this.f36293s) - ((int) ((this.f36294t * 2) + measureText))) - this.f36297x) - org.telegram.messenger.g0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f36279c;
        this.f36285k = new StaticLayout(TextUtils.ellipsize(this.f36288n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.f36286l = new StaticLayout(this.f36289o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.f36296w * 2) + Math.max(this.f36286l.getHeight() + this.f36285k.getHeight() + this.f36298y, this.f36295u);
        this.f36292r = max;
        setBounds(0, 0, this.f36291q, max);
        return this.f36292r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36277a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f36278b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.r1(0.11f, -16777216), mode));
        this.f36279c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.f36280e.setColor(x02);
        this.f36281f.setColor(org.telegram.ui.ActionBar.n6.r1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i7;
        int i10;
        if (this.f36285k != null && this.f36286l != null && this.f36287m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f36285k.getHeight();
            int i13 = this.f36298y;
            canvas.save();
            canvas.translate(this.f36293s + i11, centerY - ((this.f36286l.getHeight() + (height + i13)) / 2));
            this.f36285k.draw(canvas);
            canvas.translate(0.0f, this.f36285k.getHeight() + i13);
            this.f36286l.draw(canvas);
            canvas.restore();
            int i14 = this.f36294t;
            int L = i12 - org.telegram.messenger.g0.L(11.0f);
            float f10 = centerY - (this.f36295u / 2);
            RectF rectF = this.f36282g;
            rectF.set(L - ((int) (this.f36287m.getWidth() + (i14 * 2))), f10, L, i10 + i7);
            float a10 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.n6.r1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f36281f);
            canvas.save();
            canvas.translate(width + i14, ((i7 - this.f36287m.getHeight()) / 2.0f) + f10);
            this.f36287m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f36278b;
            bg.t.d(drawable, org.telegram.messenger.g0.L(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(29.66f) + i11;
            Drawable drawable2 = this.f36277a;
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
