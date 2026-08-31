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
public final class l61 extends Drawable {
    public final Drawable f28612a;
    public final Drawable f28613b;
    public final TextPaint f28614c;
    public final TextPaint d;
    public final TextPaint f28615e;
    public final Paint f28616f;
    public final RectF f28617g;
    public final rc h;
    public final yd.b f28618i;
    public Runnable f28619j;
    public StaticLayout f28620k;
    public StaticLayout f28621l;
    public StaticLayout f28622m;
    public String f28623n;
    public String f28624o;
    public String f28625p;
    public int f28626q;
    public int f28627r;
    public final int f28628s;
    public final int f28629t;
    public final int f28630u;
    public final int v;
    public final int f28631w;
    public final int f28632x;
    public final int f28633y;

    public l61() {
        TextPaint textPaint = new TextPaint(1);
        this.f28614c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f28615e = textPaint3;
        this.f28616f = new Paint(1);
        this.f28617g = new RectF();
        rc rcVar = new rc((View) null);
        this.h = rcVar;
        this.f28618i = new yd.b(new ai(this, 4));
        this.f28628s = AndroidUtilities.dp(62.33f);
        this.f28629t = AndroidUtilities.dp(12.0f);
        this.f28630u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28631w = AndroidUtilities.dp(7.0f);
        this.f28632x = AndroidUtilities.dp(12.0f);
        this.f28633y = AndroidUtilities.dp(2.0f);
        this.f28612a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28613b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        rcVar.f30677f = new oq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28626q = i10;
        String str = this.f28625p;
        int length = str.length();
        TextPaint textPaint = this.f28615e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28622m = new StaticLayout(this.f28625p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28628s) - ((int) ((this.f28629t * 2) + measureText))) - this.f28632x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28614c;
        this.f28620k = new StaticLayout(TextUtils.ellipsize(this.f28623n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28621l = new StaticLayout(this.f28624o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28631w * 2) + Math.max(this.f28621l.getHeight() + this.f28620k.getHeight() + this.f28633y, this.f28630u);
        this.f28627r = max;
        setBounds(0, 0, this.f28626q, max);
        return this.f28627r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28612a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f28613b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.l1(0.11f, -16777216), mode));
        this.f28614c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f28615e.setColor(w02);
        this.f28616f.setColor(org.telegram.ui.ActionBar.k6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28620k != null && this.f28621l != null && this.f28622m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28620k.getHeight();
            int i14 = this.f28633y;
            canvas.save();
            canvas.translate(this.f28628s + i12, centerY - ((this.f28621l.getHeight() + (height + i14)) / 2));
            this.f28620k.draw(canvas);
            canvas.translate(0.0f, this.f28620k.getHeight() + i14);
            this.f28621l.draw(canvas);
            canvas.restore();
            int i15 = this.f28629t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f10 = centerY - (this.f28630u / 2);
            RectF rectF = this.f28617g;
            rectF.set(dp - ((int) (this.f28622m.getWidth() + (i15 * 2))), f10, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28616f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28622m.getHeight()) / 2.0f) + f10);
            this.f28622m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f28613b;
            lf.r.d(drawable, AndroidUtilities.dp(29.66f) + i12, f11, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28612a;
            lf.r.d(drawable2, dp2, f11, 17);
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
