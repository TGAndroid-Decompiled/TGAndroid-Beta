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
    public final Drawable f26267a;
    public final Drawable f26268b;
    public final TextPaint f26269c;
    public final TextPaint d;
    public final TextPaint f26270e;
    public final Paint f26271f;
    public final RectF f26272g;
    public final zc h;
    public final me.b f26273i;
    public Runnable f26274j;
    public StaticLayout f26275k;
    public StaticLayout f26276l;
    public StaticLayout f26277m;
    public String f26278n;
    public String f26279o;
    public String f26280p;
    public int f26281q;
    public int f26282r;
    public final int f26283s;
    public final int f26284t;
    public final int f26285u;
    public final int v;
    public final int f26286w;
    public final int f26287x;
    public final int f26288y;

    public g61() {
        TextPaint textPaint = new TextPaint(1);
        this.f26269c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f26270e = textPaint3;
        this.f26271f = new Paint(1);
        this.f26272g = new RectF();
        zc zcVar = new zc((View) null);
        this.h = zcVar;
        this.f26273i = new me.b(new mg.n(this, 9));
        this.f26283s = AndroidUtilities.dp(62.33f);
        this.f26284t = AndroidUtilities.dp(12.0f);
        this.f26285u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f26286w = AndroidUtilities.dp(7.0f);
        this.f26287x = AndroidUtilities.dp(12.0f);
        this.f26288y = AndroidUtilities.dp(2.0f);
        this.f26267a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f26268b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        zcVar.f33123f = new jq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f26281q = i10;
        String str = this.f26280p;
        int length = str.length();
        TextPaint textPaint = this.f26270e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f26277m = new StaticLayout(this.f26280p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f26283s) - ((int) ((this.f26284t * 2) + measureText))) - this.f26287x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f26269c;
        this.f26275k = new StaticLayout(TextUtils.ellipsize(this.f26278n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f26276l = new StaticLayout(this.f26279o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f26286w * 2) + Math.max(this.f26276l.getHeight() + this.f26275k.getHeight() + this.f26288y, this.f26285u);
        this.f26282r = max;
        setBounds(0, 0, this.f26281q, max);
        return this.f26282r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20760ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26267a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f26268b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f26269c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f26270e.setColor(w02);
        this.f26271f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f26275k != null && this.f26276l != null && this.f26277m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f26275k.getHeight();
            int i14 = this.f26288y;
            canvas.save();
            canvas.translate(this.f26283s + i12, centerY - ((this.f26276l.getHeight() + (height + i14)) / 2));
            this.f26275k.draw(canvas);
            canvas.translate(0.0f, this.f26275k.getHeight() + i14);
            this.f26276l.draw(canvas);
            canvas.restore();
            int i15 = this.f26284t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f26285u / 2);
            RectF rectF = this.f26272g;
            rectF.set(dp - ((int) (this.f26277m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f26271f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f26277m.getHeight()) / 2.0f) + f7);
            this.f26277m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f26268b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f26267a;
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
