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
public final class g71 extends Drawable {
    public final Drawable f26690a;
    public final Drawable f26691b;
    public final TextPaint f26692c;
    public final TextPaint d;
    public final TextPaint f26693e;
    public final Paint f26694f;
    public final RectF f26695g;
    public final zc h;
    public final me.b f26696i;
    public Runnable f26697j;
    public StaticLayout f26698k;
    public StaticLayout f26699l;
    public StaticLayout f26700m;
    public String f26701n;
    public String f26702o;
    public String f26703p;
    public int f26704q;
    public int f26705r;
    public final int f26706s;
    public final int f26707t;
    public final int f26708u;
    public final int v;
    public final int f26709w;
    public final int f26710x;
    public final int f26711y;

    public g71() {
        TextPaint textPaint = new TextPaint(1);
        this.f26692c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26693e = textPaint3;
        this.f26694f = new Paint(1);
        this.f26695g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f26696i = new me.b(new ii.n4(this, 16));
        this.f26706s = AndroidUtilities.dp(62.33f);
        this.f26707t = AndroidUtilities.dp(12.0f);
        this.f26708u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26709w = AndroidUtilities.dp(7.0f);
        this.f26710x = AndroidUtilities.dp(12.0f);
        this.f26711y = AndroidUtilities.dp(2.0f);
        this.f26690a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26691b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33472f = new f71(this, 0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26704q = i10;
        String str = this.f26703p;
        int length = str.length();
        TextPaint textPaint = this.f26693e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26700m = new StaticLayout(this.f26703p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26706s) - ((int) ((this.f26707t * 2) + measureText))) - this.f26710x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26692c;
        this.f26698k = new StaticLayout(TextUtils.ellipsize(this.f26701n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26699l = new StaticLayout(this.f26702o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26709w * 2) + Math.max(this.f26699l.getHeight() + this.f26698k.getHeight() + this.f26711y, this.f26708u);
        this.f26705r = max;
        setBounds(0, 0, this.f26704q, max);
        return this.f26705r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20915ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26690a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f26691b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216), mode));
        this.f26692c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f26693e.setColor(w02);
        this.f26694f.setColor(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26698k != null && this.f26699l != null && this.f26700m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26698k.getHeight();
            int i14 = this.f26711y;
            canvas.save();
            canvas.translate(this.f26706s + i12, centerY - ((this.f26699l.getHeight() + (height + i14)) / 2));
            this.f26698k.draw(canvas);
            canvas.translate(0.0f, this.f26698k.getHeight() + i14);
            this.f26699l.draw(canvas);
            canvas.restore();
            int i15 = this.f26707t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26708u / 2);
            RectF rectF = this.f26695g;
            rectF.set(dp - ((int) (this.f26700m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26694f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26700m.getHeight()) / 2.0f) + f7);
            this.f26700m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26691b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26690a;
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
