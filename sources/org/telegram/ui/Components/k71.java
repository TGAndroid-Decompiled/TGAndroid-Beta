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
    public final Drawable f26234a;
    public final Drawable f26235b;
    public final TextPaint f26236c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f26237f;
    public final RectF f26238g;
    public final ad h;
    public final oe.b f26239i;
    public Runnable f26240j;
    public StaticLayout f26241k;
    public StaticLayout f26242l;
    public StaticLayout f26243m;
    public String f26244n;
    public String f26245o;
    public String f26246p;
    public int f26247q;
    public int f26248r;
    public final int f26249s;
    public final int f26250t;
    public final int f26251u;
    public final int v;
    public final int f26252w;
    public final int f26253x;
    public final int f26254y;

    public k71() {
        TextPaint textPaint = new TextPaint(1);
        this.f26236c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f26237f = new Paint(1);
        this.f26238g = new RectF();
        ad adVar = new ad((View) null);
        this.h = adVar;
        this.f26239i = new oe.b(new ee.l(this));
        this.f26249s = AndroidUtilities.dp(62.33f);
        this.f26250t = AndroidUtilities.dp(12.0f);
        this.f26251u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26252w = AndroidUtilities.dp(7.0f);
        this.f26253x = AndroidUtilities.dp(12.0f);
        this.f26254y = AndroidUtilities.dp(2.0f);
        this.f26234a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26235b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        adVar.f23199f = new kr0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26247q = i10;
        String str = this.f26246p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26243m = new StaticLayout(this.f26246p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26249s) - ((int) ((this.f26250t * 2) + measureText))) - this.f26253x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26236c;
        this.f26241k = new StaticLayout(TextUtils.ellipsize(this.f26244n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26242l = new StaticLayout(this.f26245o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26252w * 2) + Math.max(this.f26242l.getHeight() + this.f26241k.getHeight() + this.f26254y, this.f26251u);
        this.f26248r = max;
        setBounds(0, 0, this.f26247q, max);
        return this.f26248r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19695ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26234a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f26235b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.m1(0.11f, -16777216), mode));
        this.f26236c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.e.setColor(x02);
        this.f26237f.setColor(org.telegram.ui.ActionBar.g6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26241k != null && this.f26242l != null && this.f26243m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26241k.getHeight();
            int i14 = this.f26254y;
            canvas.save();
            canvas.translate(this.f26249s + i12, centerY - ((this.f26242l.getHeight() + (height + i14)) / 2));
            this.f26241k.draw(canvas);
            canvas.translate(0.0f, this.f26241k.getHeight() + i14);
            this.f26242l.draw(canvas);
            canvas.restore();
            int i15 = this.f26250t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26251u / 2);
            RectF rectF = this.f26238g;
            rectF.set(dp - ((int) (this.f26243m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.g6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26237f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26243m.getHeight()) / 2.0f) + f7);
            this.f26243m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26235b;
            zf.q.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26234a;
            zf.q.d(drawable2, dp2, f10, 17);
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
