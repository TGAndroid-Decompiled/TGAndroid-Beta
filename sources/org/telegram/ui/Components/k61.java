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
public final class k61 extends Drawable {
    public final Drawable f28292a;
    public final Drawable f28293b;
    public final TextPaint f28294c;
    public final TextPaint d;
    public final TextPaint f28295e;
    public final Paint f28296f;
    public final RectF f28297g;
    public final rc h;
    public final yd.b f28298i;
    public Runnable f28299j;
    public StaticLayout f28300k;
    public StaticLayout f28301l;
    public StaticLayout f28302m;
    public String f28303n;
    public String f28304o;
    public String f28305p;
    public int f28306q;
    public int f28307r;
    public final int f28308s;
    public final int f28309t;
    public final int f28310u;
    public final int v;
    public final int f28311w;
    public final int f28312x;
    public final int f28313y;

    public k61() {
        TextPaint textPaint = new TextPaint(1);
        this.f28294c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f28295e = textPaint3;
        this.f28296f = new Paint(1);
        this.f28297g = new RectF();
        rc rcVar = new rc((View) null);
        this.h = rcVar;
        this.f28298i = new yd.b(new ai(this, 4));
        this.f28308s = AndroidUtilities.dp(62.33f);
        this.f28309t = AndroidUtilities.dp(12.0f);
        this.f28310u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28311w = AndroidUtilities.dp(7.0f);
        this.f28312x = AndroidUtilities.dp(12.0f);
        this.f28313y = AndroidUtilities.dp(2.0f);
        this.f28292a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28293b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        rcVar.f30724f = new nq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28306q = i10;
        String str = this.f28305p;
        int length = str.length();
        TextPaint textPaint = this.f28295e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28302m = new StaticLayout(this.f28305p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28308s) - ((int) ((this.f28309t * 2) + measureText))) - this.f28312x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28294c;
        this.f28300k = new StaticLayout(TextUtils.ellipsize(this.f28303n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28301l = new StaticLayout(this.f28304o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28311w * 2) + Math.max(this.f28301l.getHeight() + this.f28300k.getHeight() + this.f28313y, this.f28310u);
        this.f28307r = max;
        setBounds(0, 0, this.f28306q, max);
        return this.f28307r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28292a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f28293b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.l1(0.11f, -16777216), mode));
        this.f28294c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f28295e.setColor(w02);
        this.f28296f.setColor(org.telegram.ui.ActionBar.k6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28300k != null && this.f28301l != null && this.f28302m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28300k.getHeight();
            int i14 = this.f28313y;
            canvas.save();
            canvas.translate(this.f28308s + i12, centerY - ((this.f28301l.getHeight() + (height + i14)) / 2));
            this.f28300k.draw(canvas);
            canvas.translate(0.0f, this.f28300k.getHeight() + i14);
            this.f28301l.draw(canvas);
            canvas.restore();
            int i15 = this.f28309t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f10 = centerY - (this.f28310u / 2);
            RectF rectF = this.f28297g;
            rectF.set(dp - ((int) (this.f28302m.getWidth() + (i15 * 2))), f10, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.k6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28296f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28302m.getHeight()) / 2.0f) + f10);
            this.f28302m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f28293b;
            lf.r.d(drawable, AndroidUtilities.dp(29.66f) + i12, f11, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28292a;
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
