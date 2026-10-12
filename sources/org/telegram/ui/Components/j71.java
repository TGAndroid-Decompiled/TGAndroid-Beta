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
public final class j71 extends Drawable {
    public final Drawable f26213a;
    public final Drawable f26214b;
    public final TextPaint f26215c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f26216f;
    public final RectF f26217g;
    public final ad h;
    public final oe.b f26218i;
    public Runnable f26219j;
    public StaticLayout f26220k;
    public StaticLayout f26221l;
    public StaticLayout f26222m;
    public String f26223n;
    public String f26224o;
    public String f26225p;
    public int f26226q;
    public int f26227r;
    public final int f26228s;
    public final int f26229t;
    public final int f26230u;
    public final int v;
    public final int f26231w;
    public final int f26232x;
    public final int f26233y;

    public j71() {
        TextPaint textPaint = new TextPaint(1);
        this.f26215c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f26216f = new Paint(1);
        this.f26217g = new RectF();
        ad adVar = new ad((View) null);
        this.h = adVar;
        this.f26218i = new oe.b(new ee.l(this));
        this.f26228s = AndroidUtilities.dp(62.33f);
        this.f26229t = AndroidUtilities.dp(12.0f);
        this.f26230u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26231w = AndroidUtilities.dp(7.0f);
        this.f26232x = AndroidUtilities.dp(12.0f);
        this.f26233y = AndroidUtilities.dp(2.0f);
        this.f26213a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26214b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        adVar.f23520f = new lr0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26226q = i10;
        String str = this.f26225p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26222m = new StaticLayout(this.f26225p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26228s) - ((int) ((this.f26229t * 2) + measureText))) - this.f26232x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26215c;
        this.f26220k = new StaticLayout(TextUtils.ellipsize(this.f26223n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26221l = new StaticLayout(this.f26224o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26231w * 2) + Math.max(this.f26221l.getHeight() + this.f26220k.getHeight() + this.f26233y, this.f26230u);
        this.f26227r = max;
        setBounds(0, 0, this.f26226q, max);
        return this.f26227r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19995ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26213a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f26214b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.m1(0.11f, -16777216), mode));
        this.f26215c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.e.setColor(x02);
        this.f26216f.setColor(org.telegram.ui.ActionBar.g6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26220k != null && this.f26221l != null && this.f26222m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26220k.getHeight();
            int i14 = this.f26233y;
            canvas.save();
            canvas.translate(this.f26228s + i12, centerY - ((this.f26221l.getHeight() + (height + i14)) / 2));
            this.f26220k.draw(canvas);
            canvas.translate(0.0f, this.f26220k.getHeight() + i14);
            this.f26221l.draw(canvas);
            canvas.restore();
            int i15 = this.f26229t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26230u / 2);
            RectF rectF = this.f26217g;
            rectF.set(dp - ((int) (this.f26222m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.g6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26216f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26222m.getHeight()) / 2.0f) + f7);
            this.f26222m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26214b;
            zf.q.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26213a;
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
