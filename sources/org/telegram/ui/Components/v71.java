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
public final class v71 extends Drawable {
    public final Drawable f33583a;
    public final Drawable f33584b;
    public final TextPaint f33585c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f33586f;
    public final RectF f33587g;
    public final xc h;
    public final pe.b f33588i;
    public Runnable f33589j;
    public StaticLayout f33590k;
    public StaticLayout f33591l;
    public StaticLayout f33592m;
    public String f33593n;
    public String f33594o;
    public String f33595p;
    public int f33596q;
    public int f33597r;
    public final int f33598s;
    public final int f33599t;
    public final int f33600u;
    public final int v;
    public final int f33601w;
    public final int f33602x;
    public final int f33603y;

    public v71() {
        TextPaint textPaint = new TextPaint(1);
        this.f33585c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f33586f = new Paint(1);
        this.f33587g = new RectF();
        xc xcVar = new xc((View) null);
        this.h = xcVar;
        this.f33588i = new pe.b(new li.h5(this));
        this.f33598s = AndroidUtilities.dp(62.33f);
        this.f33599t = AndroidUtilities.dp(12.0f);
        this.f33600u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f33601w = AndroidUtilities.dp(7.0f);
        this.f33602x = AndroidUtilities.dp(12.0f);
        this.f33603y = AndroidUtilities.dp(2.0f);
        this.f33583a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f33584b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        xcVar.f34723f = new t51(this, 4);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f33596q = i10;
        String str = this.f33595p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f33592m = new StaticLayout(this.f33595p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f33598s) - ((int) ((this.f33599t * 2) + measureText))) - this.f33602x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f33585c;
        this.f33590k = new StaticLayout(TextUtils.ellipsize(this.f33593n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f33591l = new StaticLayout(this.f33594o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f33601w * 2) + Math.max(this.f33591l.getHeight() + this.f33590k.getHeight() + this.f33603y, this.f33600u);
        this.f33597r = max;
        setBounds(0, 0, this.f33596q, max);
        return this.f33597r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23454ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f33583a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f33584b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216), mode));
        this.f33585c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f33586f.setColor(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f33590k != null && this.f33591l != null && this.f33592m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f33590k.getHeight();
            int i14 = this.f33603y;
            canvas.save();
            canvas.translate(this.f33598s + i12, centerY - ((this.f33591l.getHeight() + (height + i14)) / 2));
            this.f33590k.draw(canvas);
            canvas.translate(0.0f, this.f33590k.getHeight() + i14);
            this.f33591l.draw(canvas);
            canvas.restore();
            int i15 = this.f33599t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f33600u / 2);
            RectF rectF = this.f33587g;
            rectF.set(dp - ((int) (this.f33592m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.y6.o1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f33586f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f33592m.getHeight()) / 2.0f) + f7);
            this.f33592m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f33584b;
            ag.v.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f33583a;
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
