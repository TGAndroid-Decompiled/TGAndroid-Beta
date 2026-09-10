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
public final class u61 extends Drawable {
    public final Drawable f27574a;
    public final Drawable f27575b;
    public final TextPaint f27576c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f27577f;
    public final RectF f27578g;
    public final xc h;
    public final me.b f27579i;
    public Runnable f27580j;
    public StaticLayout f27581k;
    public StaticLayout f27582l;
    public StaticLayout f27583m;
    public String f27584n;
    public String f27585o;
    public String f27586p;
    public int f27587q;
    public int f27588r;
    public final int f27589s;
    public final int f27590t;
    public final int f27591u;
    public final int v;
    public final int f27592w;
    public final int f27593x;
    public final int f27594y;

    public u61() {
        TextPaint textPaint = new TextPaint(1);
        this.f27576c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f27577f = new Paint(1);
        this.f27578g = new RectF();
        xc xcVar = new xc((View) null);
        this.h = xcVar;
        this.f27579i = new me.b(new ce.m(this));
        this.f27589s = AndroidUtilities.dp(62.33f);
        this.f27590t = AndroidUtilities.dp(12.0f);
        this.f27591u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f27592w = AndroidUtilities.dp(7.0f);
        this.f27593x = AndroidUtilities.dp(12.0f);
        this.f27594y = AndroidUtilities.dp(2.0f);
        this.f27574a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f27575b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        xcVar.f29006f = new uq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f27587q = i10;
        String str = this.f27586p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f27583m = new StaticLayout(this.f27586p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f27589s) - ((int) ((this.f27590t * 2) + measureText))) - this.f27593x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f27576c;
        this.f27581k = new StaticLayout(TextUtils.ellipsize(this.f27584n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f27582l = new StaticLayout(this.f27585o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f27592w * 2) + Math.max(this.f27582l.getHeight() + this.f27581k.getHeight() + this.f27594y, this.f27591u);
        this.f27588r = max;
        setBounds(0, 0, this.f27587q, max);
        return this.f27588r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18023ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f27574a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f27575b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f27576c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f27577f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f27581k != null && this.f27582l != null && this.f27583m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f27581k.getHeight();
            int i14 = this.f27594y;
            canvas.save();
            canvas.translate(this.f27589s + i12, centerY - ((this.f27582l.getHeight() + (height + i14)) / 2));
            this.f27581k.draw(canvas);
            canvas.translate(0.0f, this.f27581k.getHeight() + i14);
            this.f27582l.draw(canvas);
            canvas.restore();
            int i15 = this.f27590t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f27591u / 2);
            RectF rectF = this.f27578g;
            rectF.set(dp - ((int) (this.f27583m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f27577f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f27583m.getHeight()) / 2.0f) + f7);
            this.f27583m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f27575b;
            xf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f27574a;
            xf.p.d(drawable2, dp2, f10, 17);
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
