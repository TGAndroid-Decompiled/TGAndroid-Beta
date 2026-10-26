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
    public final Drawable f33269a;
    public final Drawable f33270b;
    public final TextPaint f33271c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f33272f;
    public final RectF f33273g;
    public final xc h;
    public final pe.b f33274i;
    public Runnable f33275j;
    public StaticLayout f33276k;
    public StaticLayout f33277l;
    public StaticLayout f33278m;
    public String f33279n;
    public String f33280o;
    public String f33281p;
    public int f33282q;
    public int f33283r;
    public final int f33284s;
    public final int f33285t;
    public final int f33286u;
    public final int v;
    public final int f33287w;
    public final int f33288x;
    public final int f33289y;

    public u71() {
        TextPaint textPaint = new TextPaint(1);
        this.f33271c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f33272f = new Paint(1);
        this.f33273g = new RectF();
        xc xcVar = new xc((View) null);
        this.h = xcVar;
        this.f33274i = new pe.b(new li.h5(this));
        this.f33284s = AndroidUtilities.dp(62.33f);
        this.f33285t = AndroidUtilities.dp(12.0f);
        this.f33286u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f33287w = AndroidUtilities.dp(7.0f);
        this.f33288x = AndroidUtilities.dp(12.0f);
        this.f33289y = AndroidUtilities.dp(2.0f);
        this.f33269a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f33270b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        xcVar.f34688f = new s51(this, 4);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f33282q = i10;
        String str = this.f33281p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f33278m = new StaticLayout(this.f33281p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f33284s) - ((int) ((this.f33285t * 2) + measureText))) - this.f33288x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f33271c;
        this.f33276k = new StaticLayout(TextUtils.ellipsize(this.f33279n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f33277l = new StaticLayout(this.f33280o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f33287w * 2) + Math.max(this.f33277l.getHeight() + this.f33276k.getHeight() + this.f33289y, this.f33286u);
        this.f33283r = max;
        setBounds(0, 0, this.f33282q, max);
        return this.f33283r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23453ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f33269a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f33270b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216), mode));
        this.f33271c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f33272f.setColor(org.telegram.ui.ActionBar.y6.o1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f33276k != null && this.f33277l != null && this.f33278m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f33276k.getHeight();
            int i14 = this.f33289y;
            canvas.save();
            canvas.translate(this.f33284s + i12, centerY - ((this.f33277l.getHeight() + (height + i14)) / 2));
            this.f33276k.draw(canvas);
            canvas.translate(0.0f, this.f33276k.getHeight() + i14);
            this.f33277l.draw(canvas);
            canvas.restore();
            int i15 = this.f33285t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f33286u / 2);
            RectF rectF = this.f33273g;
            rectF.set(dp - ((int) (this.f33278m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.y6.o1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f33272f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f33278m.getHeight()) / 2.0f) + f7);
            this.f33278m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f33270b;
            ag.v.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f33269a;
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
