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
public final class x61 extends Drawable {
    public final Drawable f30317a;
    public final Drawable f30318b;
    public final TextPaint f30319c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f30320f;
    public final RectF f30321g;
    public final yc h;
    public final me.b f30322i;
    public Runnable f30323j;
    public StaticLayout f30324k;
    public StaticLayout f30325l;
    public StaticLayout f30326m;
    public String f30327n;
    public String f30328o;
    public String f30329p;
    public int f30330q;
    public int f30331r;
    public final int f30332s;
    public final int f30333t;
    public final int f30334u;
    public final int v;
    public final int f30335w;
    public final int f30336x;
    public final int f30337y;

    public x61() {
        TextPaint textPaint = new TextPaint(1);
        this.f30319c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f30320f = new Paint(1);
        this.f30321g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f30322i = new me.b(new k2.u(this));
        this.f30332s = AndroidUtilities.dp(62.33f);
        this.f30333t = AndroidUtilities.dp(12.0f);
        this.f30334u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30335w = AndroidUtilities.dp(7.0f);
        this.f30336x = AndroidUtilities.dp(12.0f);
        this.f30337y = AndroidUtilities.dp(2.0f);
        this.f30317a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30318b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30648f = new w61(this, 0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f30330q = i10;
        String str = this.f30329p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30326m = new StaticLayout(this.f30329p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f30332s) - ((int) ((this.f30333t * 2) + measureText))) - this.f30336x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30319c;
        this.f30324k = new StaticLayout(TextUtils.ellipsize(this.f30327n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f30325l = new StaticLayout(this.f30328o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f30335w * 2) + Math.max(this.f30325l.getHeight() + this.f30324k.getHeight() + this.f30337y, this.f30334u);
        this.f30331r = max;
        setBounds(0, 0, this.f30330q, max);
        return this.f30331r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19153ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30317a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f30318b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216), mode));
        this.f30319c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f30320f.setColor(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f30324k != null && this.f30325l != null && this.f30326m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f30324k.getHeight();
            int i14 = this.f30337y;
            canvas.save();
            canvas.translate(this.f30332s + i12, centerY - ((this.f30325l.getHeight() + (height + i14)) / 2));
            this.f30324k.draw(canvas);
            canvas.translate(0.0f, this.f30324k.getHeight() + i14);
            this.f30325l.draw(canvas);
            canvas.restore();
            int i15 = this.f30333t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f30334u / 2);
            RectF rectF = this.f30321g;
            rectF.set(dp - ((int) (this.f30326m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f30320f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f30326m.getHeight()) / 2.0f) + f7);
            this.f30326m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f30318b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f30317a;
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
