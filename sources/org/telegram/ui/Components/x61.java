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
public final class x61 extends Drawable {
    public final Drawable f30127a;
    public final Drawable f30128b;
    public final TextPaint f30129c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f30130f;
    public final RectF f30131g;
    public final zc h;
    public final me.b f30132i;
    public Runnable f30133j;
    public StaticLayout f30134k;
    public StaticLayout f30135l;
    public StaticLayout f30136m;
    public String f30137n;
    public String f30138o;
    public String f30139p;
    public int f30140q;
    public int f30141r;
    public final int f30142s;
    public final int f30143t;
    public final int f30144u;
    public final int v;
    public final int f30145w;
    public final int f30146x;
    public final int f30147y;

    public x61() {
        TextPaint textPaint = new TextPaint(1);
        this.f30129c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f30130f = new Paint(1);
        this.f30131g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f30132i = new me.b(new k2.u(this, 16));
        this.f30142s = AndroidUtilities.dp(62.33f);
        this.f30143t = AndroidUtilities.dp(12.0f);
        this.f30144u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30145w = AndroidUtilities.dp(7.0f);
        this.f30146x = AndroidUtilities.dp(12.0f);
        this.f30147y = AndroidUtilities.dp(2.0f);
        this.f30127a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30128b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f30947f = new zq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f30140q = i10;
        String str = this.f30139p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30136m = new StaticLayout(this.f30139p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f30142s) - ((int) ((this.f30143t * 2) + measureText))) - this.f30146x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30129c;
        this.f30134k = new StaticLayout(TextUtils.ellipsize(this.f30137n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f30135l = new StaticLayout(this.f30138o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f30145w * 2) + Math.max(this.f30135l.getHeight() + this.f30134k.getHeight() + this.f30147y, this.f30144u);
        this.f30141r = max;
        setBounds(0, 0, this.f30140q, max);
        return this.f30141r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19171ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30127a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f30128b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f30129c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f30130f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f30134k != null && this.f30135l != null && this.f30136m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f30134k.getHeight();
            int i14 = this.f30147y;
            canvas.save();
            canvas.translate(this.f30142s + i12, centerY - ((this.f30135l.getHeight() + (height + i14)) / 2));
            this.f30134k.draw(canvas);
            canvas.translate(0.0f, this.f30134k.getHeight() + i14);
            this.f30135l.draw(canvas);
            canvas.restore();
            int i15 = this.f30143t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f30144u / 2);
            RectF rectF = this.f30131g;
            rectF.set(dp - ((int) (this.f30136m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f30130f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f30136m.getHeight()) / 2.0f) + f7);
            this.f30136m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f30128b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f30127a;
            yf.p.d(drawable2, dp2, f10, 17);
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
