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
public final class x51 extends Drawable {
    public final Drawable f34580a;
    public final Drawable f34581b;
    public final TextPaint f34582c;
    public final TextPaint d;
    public final TextPaint f34583e;
    public final Paint f34584f;
    public final RectF f34585g;
    public final uc h;
    public final wd.b f34586i;
    public Runnable f34587j;
    public StaticLayout f34588k;
    public StaticLayout f34589l;
    public StaticLayout f34590m;
    public String f34591n;
    public String f34592o;
    public String f34593p;
    public int f34594q;
    public int f34595r;
    public final int f34596s;
    public final int f34597t;
    public final int f34598u;
    public final int v;
    public final int f34599w;
    public final int f34600x;
    public final int f34601y;

    public x51() {
        TextPaint textPaint = new TextPaint(1);
        this.f34582c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f34583e = textPaint3;
        this.f34584f = new Paint(1);
        this.f34585g = new RectF();
        uc ucVar = new uc((View) null);
        this.h = ucVar;
        this.f34586i = new wd.b(new o4.g(this, 6));
        this.f34596s = AndroidUtilities.dp(62.33f);
        this.f34597t = AndroidUtilities.dp(12.0f);
        this.f34598u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f34599w = AndroidUtilities.dp(7.0f);
        this.f34600x = AndroidUtilities.dp(12.0f);
        this.f34601y = AndroidUtilities.dp(2.0f);
        this.f34580a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f34581b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ucVar.f33191f = new fq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f34594q = i10;
        String str = this.f34593p;
        int length = str.length();
        TextPaint textPaint = this.f34583e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f34590m = new StaticLayout(this.f34593p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f34596s) - ((int) ((this.f34597t * 2) + measureText))) - this.f34600x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f34582c;
        this.f34588k = new StaticLayout(TextUtils.ellipsize(this.f34591n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f34589l = new StaticLayout(this.f34592o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f34599w * 2) + Math.max(this.f34589l.getHeight() + this.f34588k.getHeight() + this.f34601y, this.f34598u);
        this.f34595r = max;
        setBounds(0, 0, this.f34594q, max);
        return this.f34595r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23158ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f34580a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f34581b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216), mode));
        this.f34582c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f34583e.setColor(w02);
        this.f34584f.setColor(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f34588k != null && this.f34589l != null && this.f34590m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f34588k.getHeight();
            int i14 = this.f34601y;
            canvas.save();
            canvas.translate(this.f34596s + i12, centerY - ((this.f34589l.getHeight() + (height + i14)) / 2));
            this.f34588k.draw(canvas);
            canvas.translate(0.0f, this.f34588k.getHeight() + i14);
            this.f34589l.draw(canvas);
            canvas.restore();
            int i15 = this.f34597t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f9 = centerY - (this.f34598u / 2);
            RectF rectF = this.f34585g;
            rectF.set(dp - ((int) (this.f34590m.getWidth() + (i15 * 2))), f9, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.g6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f34584f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f34590m.getHeight()) / 2.0f) + f9);
            this.f34590m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f34581b;
            jf.r.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f34580a;
            jf.r.d(drawable2, dp2, f10, 17);
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
