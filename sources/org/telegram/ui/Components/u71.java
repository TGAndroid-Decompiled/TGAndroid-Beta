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
public final class u71 extends Drawable {
    public final Drawable f33266a;
    public final Drawable f33267b;
    public final TextPaint f33268c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f33269f;
    public final RectF f33270g;
    public final xc h;
    public final pe.b f33271i;
    public Runnable f33272j;
    public StaticLayout f33273k;
    public StaticLayout f33274l;
    public StaticLayout f33275m;
    public String f33276n;
    public String f33277o;
    public String f33278p;
    public int f33279q;
    public int f33280r;
    public final int f33281s;
    public final int f33282t;
    public final int f33283u;
    public final int v;
    public final int f33284w;
    public final int f33285x;
    public final int f33286y;

    public u71() {
        TextPaint textPaint = new TextPaint(1);
        this.f33268c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f33269f = new Paint(1);
        this.f33270g = new RectF();
        xc xcVar = new xc((View) null);
        this.h = xcVar;
        this.f33271i = new pe.b(new li.h5(this));
        this.f33281s = AndroidUtilities.dp(62.33f);
        this.f33282t = AndroidUtilities.dp(12.0f);
        this.f33283u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f33284w = AndroidUtilities.dp(7.0f);
        this.f33285x = AndroidUtilities.dp(12.0f);
        this.f33286y = AndroidUtilities.dp(2.0f);
        this.f33266a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f33267b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        xcVar.f34685f = new s51(this, 4);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f33279q = i10;
        String str = this.f33278p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f33275m = new StaticLayout(this.f33278p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f33281s) - ((int) ((this.f33282t * 2) + measureText))) - this.f33285x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f33268c;
        this.f33273k = new StaticLayout(TextUtils.ellipsize(this.f33276n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f33274l = new StaticLayout(this.f33277o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f33284w * 2) + Math.max(this.f33274l.getHeight() + this.f33273k.getHeight() + this.f33286y, this.f33283u);
        this.f33280r = max;
        setBounds(0, 0, this.f33279q, max);
        return this.f33280r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23451ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f33266a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f33267b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216), mode));
        this.f33268c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f33269f.setColor(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f33273k != null && this.f33274l != null && this.f33275m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f33273k.getHeight();
            int i14 = this.f33286y;
            canvas.save();
            canvas.translate(this.f33281s + i12, centerY - ((this.f33274l.getHeight() + (height + i14)) / 2));
            this.f33273k.draw(canvas);
            canvas.translate(0.0f, this.f33273k.getHeight() + i14);
            this.f33274l.draw(canvas);
            canvas.restore();
            int i15 = this.f33282t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f33283u / 2);
            RectF rectF = this.f33270g;
            rectF.set(dp - ((int) (this.f33275m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.y6.o1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f33269f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f33275m.getHeight()) / 2.0f) + f7);
            this.f33275m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f33267b;
            ag.v.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f33266a;
            ag.v.d(drawable2, dp2, f10, 17);
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
