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
public final class h71 extends Drawable {
    public final Drawable f27113a;
    public final Drawable f27114b;
    public final TextPaint f27115c;
    public final TextPaint d;
    public final TextPaint f27116e;
    public final Paint f27117f;
    public final RectF f27118g;
    public final zc h;
    public final me.b f27119i;
    public Runnable f27120j;
    public StaticLayout f27121k;
    public StaticLayout f27122l;
    public StaticLayout f27123m;
    public String f27124n;
    public String f27125o;
    public String f27126p;
    public int f27127q;
    public int f27128r;
    public final int f27129s;
    public final int f27130t;
    public final int f27131u;
    public final int v;
    public final int f27132w;
    public final int f27133x;
    public final int f27134y;

    public h71() {
        TextPaint textPaint = new TextPaint(1);
        this.f27115c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f27116e = textPaint3;
        this.f27117f = new Paint(1);
        this.f27118g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f27119i = new me.b(new ii.n4(this, 16));
        this.f27129s = AndroidUtilities.dp(62.33f);
        this.f27130t = AndroidUtilities.dp(12.0f);
        this.f27131u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f27132w = AndroidUtilities.dp(7.0f);
        this.f27133x = AndroidUtilities.dp(12.0f);
        this.f27134y = AndroidUtilities.dp(2.0f);
        this.f27113a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f27114b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33486f = new q61(this, 1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f27127q = i10;
        String str = this.f27126p;
        int length = str.length();
        TextPaint textPaint = this.f27116e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27123m = new StaticLayout(this.f27126p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f27129s) - ((int) ((this.f27130t * 2) + measureText))) - this.f27133x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f27115c;
        this.f27121k = new StaticLayout(TextUtils.ellipsize(this.f27124n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f27122l = new StaticLayout(this.f27125o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f27132w * 2) + Math.max(this.f27122l.getHeight() + this.f27121k.getHeight() + this.f27134y, this.f27131u);
        this.f27128r = max;
        setBounds(0, 0, this.f27127q, max);
        return this.f27128r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20924ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f27113a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f27114b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216), mode));
        this.f27115c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f27116e.setColor(w02);
        this.f27117f.setColor(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f27121k != null && this.f27122l != null && this.f27123m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f27121k.getHeight();
            int i14 = this.f27134y;
            canvas.save();
            canvas.translate(this.f27129s + i12, centerY - ((this.f27122l.getHeight() + (height + i14)) / 2));
            this.f27121k.draw(canvas);
            canvas.translate(0.0f, this.f27121k.getHeight() + i14);
            this.f27122l.draw(canvas);
            canvas.restore();
            int i15 = this.f27130t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f27131u / 2);
            RectF rectF = this.f27118g;
            rectF.set(dp - ((int) (this.f27123m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f27117f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f27123m.getHeight()) / 2.0f) + f7);
            this.f27123m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f27114b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f27113a;
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
