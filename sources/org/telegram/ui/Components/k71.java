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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class k71 extends Drawable {
    public final Drawable f27930a;
    public final Drawable f27931b;
    public final TextPaint f27932c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f27933f;
    public final RectF f27934g;
    public final wc h;
    public final oe.b f27935i;
    public Runnable f27936j;
    public StaticLayout f27937k;
    public StaticLayout f27938l;
    public StaticLayout f27939m;
    public String f27940n;
    public String f27941o;
    public String f27942p;
    public int f27943q;
    public int f27944r;
    public final int f27945s;
    public final int f27946t;
    public final int f27947u;
    public final int v;
    public final int f27948w;
    public final int f27949x;
    public final int f27950y;

    public k71() {
        TextPaint textPaint = new TextPaint(1);
        this.f27932c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f27933f = new Paint(1);
        this.f27934g = new RectF();
        wc wcVar = new wc((View) null);
        this.h = wcVar;
        this.f27935i = new oe.b(new k2.w0(this, 15));
        this.f27945s = AndroidUtilities.dp(62.33f);
        this.f27946t = AndroidUtilities.dp(12.0f);
        this.f27947u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f27948w = AndroidUtilities.dp(7.0f);
        this.f27949x = AndroidUtilities.dp(12.0f);
        this.f27950y = AndroidUtilities.dp(2.0f);
        this.f27930a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f27931b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        wcVar.f32183f = new jr0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f27943q = i10;
        String str = this.f27942p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27939m = new StaticLayout(this.f27942p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f27945s) - ((int) ((this.f27946t * 2) + measureText))) - this.f27949x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f27932c;
        this.f27937k = new StaticLayout(TextUtils.ellipsize(this.f27940n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f27938l = new StaticLayout(this.f27941o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f27948w * 2) + Math.max(this.f27938l.getHeight() + this.f27937k.getHeight() + this.f27950y, this.f27947u);
        this.f27944r = max;
        setBounds(0, 0, this.f27943q, max);
        return this.f27944r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21278ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f27930a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f27931b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.o1(0.11f, -16777216), mode));
        this.f27932c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f27933f.setColor(org.telegram.ui.ActionBar.k6.o1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f27937k != null && this.f27938l != null && this.f27939m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f27937k.getHeight();
            int i14 = this.f27950y;
            canvas.save();
            canvas.translate(this.f27945s + i12, centerY - ((this.f27938l.getHeight() + (height + i14)) / 2));
            this.f27937k.draw(canvas);
            canvas.translate(0.0f, this.f27937k.getHeight() + i14);
            this.f27938l.draw(canvas);
            canvas.restore();
            int i15 = this.f27946t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f27947u / 2);
            RectF rectF = this.f27934g;
            rectF.set(dp - ((int) (this.f27939m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.o1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f27933f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f27939m.getHeight()) / 2.0f) + f7);
            this.f27939m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f27931b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f27930a;
            zf.p.d(drawable2, dp2, f10, 17);
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
