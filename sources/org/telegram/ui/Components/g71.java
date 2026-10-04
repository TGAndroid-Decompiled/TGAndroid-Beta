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
    public final Drawable f26689a;
    public final Drawable f26690b;
    public final TextPaint f26691c;
    public final TextPaint d;
    public final TextPaint f26692e;
    public final Paint f26693f;
    public final RectF f26694g;
    public final zc h;
    public final me.b f26695i;
    public Runnable f26696j;
    public StaticLayout f26697k;
    public StaticLayout f26698l;
    public StaticLayout f26699m;
    public String f26700n;
    public String f26701o;
    public String f26702p;
    public int f26703q;
    public int f26704r;
    public final int f26705s;
    public final int f26706t;
    public final int f26707u;
    public final int v;
    public final int f26708w;
    public final int f26709x;
    public final int f26710y;

    public g71() {
        TextPaint textPaint = new TextPaint(1);
        this.f26691c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26692e = textPaint3;
        this.f26693f = new Paint(1);
        this.f26694g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f26695i = new me.b(new ii.n4(this, 16));
        this.f26705s = AndroidUtilities.dp(62.33f);
        this.f26706t = AndroidUtilities.dp(12.0f);
        this.f26707u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26708w = AndroidUtilities.dp(7.0f);
        this.f26709x = AndroidUtilities.dp(12.0f);
        this.f26710y = AndroidUtilities.dp(2.0f);
        this.f26689a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26690b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33471f = new f71(this, 0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26703q = i10;
        String str = this.f26702p;
        int length = str.length();
        TextPaint textPaint = this.f26692e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26699m = new StaticLayout(this.f26702p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26705s) - ((int) ((this.f26706t * 2) + measureText))) - this.f26709x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26691c;
        this.f26697k = new StaticLayout(TextUtils.ellipsize(this.f26700n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26698l = new StaticLayout(this.f26701o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26708w * 2) + Math.max(this.f26698l.getHeight() + this.f26697k.getHeight() + this.f26710y, this.f26707u);
        this.f26704r = max;
        setBounds(0, 0, this.f26703q, max);
        return this.f26704r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20914ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26689a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f26690b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216), mode));
        this.f26691c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f26692e.setColor(w02);
        this.f26693f.setColor(org.telegram.ui.ActionBar.i6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26697k != null && this.f26698l != null && this.f26699m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26697k.getHeight();
            int i14 = this.f26710y;
            canvas.save();
            canvas.translate(this.f26705s + i12, centerY - ((this.f26698l.getHeight() + (height + i14)) / 2));
            this.f26697k.draw(canvas);
            canvas.translate(0.0f, this.f26697k.getHeight() + i14);
            this.f26698l.draw(canvas);
            canvas.restore();
            int i15 = this.f26706t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26707u / 2);
            RectF rectF = this.f26694g;
            rectF.set(dp - ((int) (this.f26699m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.i6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26693f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26699m.getHeight()) / 2.0f) + f7);
            this.f26699m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26690b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26689a;
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
