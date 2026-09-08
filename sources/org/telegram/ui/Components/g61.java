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
    public final Drawable f26293a;
    public final Drawable f26294b;
    public final TextPaint f26295c;
    public final TextPaint d;
    public final TextPaint f26296e;
    public final Paint f26297f;
    public final RectF f26298g;
    public final zc h;
    public final me.b f26299i;
    public Runnable f26300j;
    public StaticLayout f26301k;
    public StaticLayout f26302l;
    public StaticLayout f26303m;
    public String f26304n;
    public String f26305o;
    public String f26306p;
    public int f26307q;
    public int f26308r;
    public final int f26309s;
    public final int f26310t;
    public final int f26311u;
    public final int v;
    public final int f26312w;
    public final int f26313x;
    public final int f26314y;

    public g61() {
        TextPaint textPaint = new TextPaint(1);
        this.f26295c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26296e = textPaint3;
        this.f26297f = new Paint(1);
        this.f26298g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f26299i = new me.b(new mg.n(this, 9));
        this.f26309s = AndroidUtilities.dp(62.33f);
        this.f26310t = AndroidUtilities.dp(12.0f);
        this.f26311u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26312w = AndroidUtilities.dp(7.0f);
        this.f26313x = AndroidUtilities.dp(12.0f);
        this.f26314y = AndroidUtilities.dp(2.0f);
        this.f26293a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26294b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33149f = new jq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26307q = i10;
        String str = this.f26306p;
        int length = str.length();
        TextPaint textPaint = this.f26296e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26303m = new StaticLayout(this.f26306p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26309s) - ((int) ((this.f26310t * 2) + measureText))) - this.f26313x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26295c;
        this.f26301k = new StaticLayout(TextUtils.ellipsize(this.f26304n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26302l = new StaticLayout(this.f26305o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26312w * 2) + Math.max(this.f26302l.getHeight() + this.f26301k.getHeight() + this.f26314y, this.f26311u);
        this.f26308r = max;
        setBounds(0, 0, this.f26307q, max);
        return this.f26308r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20786ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26293a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f26294b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f26295c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f26296e.setColor(w02);
        this.f26297f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26301k != null && this.f26302l != null && this.f26303m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26301k.getHeight();
            int i14 = this.f26314y;
            canvas.save();
            canvas.translate(this.f26309s + i12, centerY - ((this.f26302l.getHeight() + (height + i14)) / 2));
            this.f26301k.draw(canvas);
            canvas.translate(0.0f, this.f26301k.getHeight() + i14);
            this.f26302l.draw(canvas);
            canvas.restore();
            int i15 = this.f26310t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26311u / 2);
            RectF rectF = this.f26298g;
            rectF.set(dp - ((int) (this.f26303m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26297f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26303m.getHeight()) / 2.0f) + f7);
            this.f26303m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26294b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26293a;
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
