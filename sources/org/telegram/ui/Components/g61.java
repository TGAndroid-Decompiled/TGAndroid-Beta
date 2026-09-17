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
public final class g61 extends Drawable {
    public final Drawable f26294a;
    public final Drawable f26295b;
    public final TextPaint f26296c;
    public final TextPaint d;
    public final TextPaint f26297e;
    public final Paint f26298f;
    public final RectF f26299g;
    public final zc h;
    public final me.b f26300i;
    public Runnable f26301j;
    public StaticLayout f26302k;
    public StaticLayout f26303l;
    public StaticLayout f26304m;
    public String f26305n;
    public String f26306o;
    public String f26307p;
    public int f26308q;
    public int f26309r;
    public final int f26310s;
    public final int f26311t;
    public final int f26312u;
    public final int v;
    public final int f26313w;
    public final int f26314x;
    public final int f26315y;

    public g61() {
        TextPaint textPaint = new TextPaint(1);
        this.f26296c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26297e = textPaint3;
        this.f26298f = new Paint(1);
        this.f26299g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f26300i = new me.b(new mg.n(this, 9));
        this.f26310s = AndroidUtilities.dp(62.33f);
        this.f26311t = AndroidUtilities.dp(12.0f);
        this.f26312u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26313w = AndroidUtilities.dp(7.0f);
        this.f26314x = AndroidUtilities.dp(12.0f);
        this.f26315y = AndroidUtilities.dp(2.0f);
        this.f26294a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26295b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33150f = new jq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26308q = i10;
        String str = this.f26307p;
        int length = str.length();
        TextPaint textPaint = this.f26297e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26304m = new StaticLayout(this.f26307p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26310s) - ((int) ((this.f26311t * 2) + measureText))) - this.f26314x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26296c;
        this.f26302k = new StaticLayout(TextUtils.ellipsize(this.f26305n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26303l = new StaticLayout(this.f26306o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26313w * 2) + Math.max(this.f26303l.getHeight() + this.f26302k.getHeight() + this.f26315y, this.f26312u);
        this.f26309r = max;
        setBounds(0, 0, this.f26308q, max);
        return this.f26309r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20787ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26294a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f26295b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f26296c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f26297e.setColor(w02);
        this.f26298f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26302k != null && this.f26303l != null && this.f26304m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26302k.getHeight();
            int i14 = this.f26315y;
            canvas.save();
            canvas.translate(this.f26310s + i12, centerY - ((this.f26303l.getHeight() + (height + i14)) / 2));
            this.f26302k.draw(canvas);
            canvas.translate(0.0f, this.f26302k.getHeight() + i14);
            this.f26303l.draw(canvas);
            canvas.restore();
            int i15 = this.f26311t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26312u / 2);
            RectF rectF = this.f26299g;
            rectF.set(dp - ((int) (this.f26304m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26298f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26304m.getHeight()) / 2.0f) + f7);
            this.f26304m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26295b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26294a;
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
