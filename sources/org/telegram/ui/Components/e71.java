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
public final class e71 extends Drawable {
    public final Drawable f25790a;
    public final Drawable f25791b;
    public final TextPaint f25792c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25793f;
    public final RectF f25794g;
    public final yc h;
    public final oe.b f25795i;
    public Runnable f25796j;
    public StaticLayout f25797k;
    public StaticLayout f25798l;
    public StaticLayout f25799m;
    public String f25800n;
    public String f25801o;
    public String f25802p;
    public int f25803q;
    public int f25804r;
    public final int f25805s;
    public final int f25806t;
    public final int f25807u;
    public final int v;
    public final int f25808w;
    public final int f25809x;
    public final int f25810y;

    public e71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25792c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25793f = new Paint(1);
        this.f25794g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25795i = new oe.b(new k2.w0(this, 15));
        this.f25805s = AndroidUtilities.dp(62.33f);
        this.f25806t = AndroidUtilities.dp(12.0f);
        this.f25807u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25808w = AndroidUtilities.dp(7.0f);
        this.f25809x = AndroidUtilities.dp(12.0f);
        this.f25810y = AndroidUtilities.dp(2.0f);
        this.f25790a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25791b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32634f = new hr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25803q = i10;
        String str = this.f25802p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25799m = new StaticLayout(this.f25802p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25805s) - ((int) ((this.f25806t * 2) + measureText))) - this.f25809x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25792c;
        this.f25797k = new StaticLayout(TextUtils.ellipsize(this.f25800n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25798l = new StaticLayout(this.f25801o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25808w * 2) + Math.max(this.f25798l.getHeight() + this.f25797k.getHeight() + this.f25810y, this.f25807u);
        this.f25804r = max;
        setBounds(0, 0, this.f25803q, max);
        return this.f25804r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21088ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25790a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25791b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25792c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f25793f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25797k != null && this.f25798l != null && this.f25799m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25797k.getHeight();
            int i14 = this.f25810y;
            canvas.save();
            canvas.translate(this.f25805s + i12, centerY - ((this.f25798l.getHeight() + (height + i14)) / 2));
            this.f25797k.draw(canvas);
            canvas.translate(0.0f, this.f25797k.getHeight() + i14);
            this.f25798l.draw(canvas);
            canvas.restore();
            int i15 = this.f25806t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25807u / 2);
            RectF rectF = this.f25794g;
            rectF.set(dp - ((int) (this.f25799m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25793f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25799m.getHeight()) / 2.0f) + f7);
            this.f25799m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25791b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25790a;
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
