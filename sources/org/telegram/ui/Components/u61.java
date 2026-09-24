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
    public final Drawable f28699a;
    public final Drawable f28700b;
    public final TextPaint f28701c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f28702f;
    public final RectF f28703g;
    public final zc h;
    public final me.b f28704i;
    public Runnable f28705j;
    public StaticLayout f28706k;
    public StaticLayout f28707l;
    public StaticLayout f28708m;
    public String f28709n;
    public String f28710o;
    public String f28711p;
    public int f28712q;
    public int f28713r;
    public final int f28714s;
    public final int f28715t;
    public final int f28716u;
    public final int v;
    public final int f28717w;
    public final int f28718x;
    public final int f28719y;

    public u61() {
        TextPaint textPaint = new TextPaint(1);
        this.f28701c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f28702f = new Paint(1);
        this.f28703g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f28704i = new me.b(new k2.u(this, 16));
        this.f28714s = AndroidUtilities.dp(62.33f);
        this.f28715t = AndroidUtilities.dp(12.0f);
        this.f28716u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f28717w = AndroidUtilities.dp(7.0f);
        this.f28718x = AndroidUtilities.dp(12.0f);
        this.f28719y = AndroidUtilities.dp(2.0f);
        this.f28699a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28700b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f30840f = new wq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f28712q = i10;
        String str = this.f28711p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f28708m = new StaticLayout(this.f28711p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f28714s) - ((int) ((this.f28715t * 2) + measureText))) - this.f28718x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28701c;
        this.f28706k = new StaticLayout(TextUtils.ellipsize(this.f28709n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f28707l = new StaticLayout(this.f28710o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f28717w * 2) + Math.max(this.f28707l.getHeight() + this.f28706k.getHeight() + this.f28719y, this.f28716u);
        this.f28713r = max;
        setBounds(0, 0, this.f28712q, max);
        return this.f28713r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19140ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28699a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f28700b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f28701c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f28702f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f28706k != null && this.f28707l != null && this.f28708m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f28706k.getHeight();
            int i14 = this.f28719y;
            canvas.save();
            canvas.translate(this.f28714s + i12, centerY - ((this.f28707l.getHeight() + (height + i14)) / 2));
            this.f28706k.draw(canvas);
            canvas.translate(0.0f, this.f28706k.getHeight() + i14);
            this.f28707l.draw(canvas);
            canvas.restore();
            int i15 = this.f28715t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f28716u / 2);
            RectF rectF = this.f28703g;
            rectF.set(dp - ((int) (this.f28708m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28702f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f28708m.getHeight()) / 2.0f) + f7);
            this.f28708m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f28700b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28699a;
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
