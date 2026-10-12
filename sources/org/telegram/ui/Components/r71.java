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
public final class r71 extends Drawable {
    public final Drawable f30068a;
    public final Drawable f30069b;
    public final TextPaint f30070c;
    public final TextPaint d;
    public final TextPaint f30071e;
    public final Paint f30072f;
    public final RectF f30073g;
    public final ad h;
    public final ne.b f30074i;
    public Runnable f30075j;
    public StaticLayout f30076k;
    public StaticLayout f30077l;
    public StaticLayout f30078m;
    public String f30079n;
    public String f30080o;
    public String f30081p;
    public int f30082q;
    public int f30083r;
    public final int f30084s;
    public final int f30085t;
    public final int f30086u;
    public final int v;
    public final int f30087w;
    public final int f30088x;
    public final int f30089y;

    public r71() {
        TextPaint textPaint = new TextPaint(1);
        this.f30070c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f30071e = textPaint3;
        this.f30072f = new Paint(1);
        this.f30073g = new RectF();
        ad adVar = new ad((View) null);
        this.h = adVar;
        this.f30074i = new ne.b(new de.m(this));
        this.f30084s = AndroidUtilities.dp(62.33f);
        this.f30085t = AndroidUtilities.dp(12.0f);
        this.f30086u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30087w = AndroidUtilities.dp(7.0f);
        this.f30088x = AndroidUtilities.dp(12.0f);
        this.f30089y = AndroidUtilities.dp(2.0f);
        this.f30068a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30069b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        adVar.f24284f = new ur0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f30082q = i10;
        String str = this.f30081p;
        int length = str.length();
        TextPaint textPaint = this.f30071e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30078m = new StaticLayout(this.f30081p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f30084s) - ((int) ((this.f30085t * 2) + measureText))) - this.f30088x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30070c;
        this.f30076k = new StaticLayout(TextUtils.ellipsize(this.f30079n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f30077l = new StaticLayout(this.f30080o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f30087w * 2) + Math.max(this.f30077l.getHeight() + this.f30076k.getHeight() + this.f30089y, this.f30086u);
        this.f30083r = max;
        setBounds(0, 0, this.f30082q, max);
        return this.f30083r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20656ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30068a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f30069b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f30070c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.f30071e.setColor(x02);
        this.f30072f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f30076k != null && this.f30077l != null && this.f30078m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f30076k.getHeight();
            int i14 = this.f30089y;
            canvas.save();
            canvas.translate(this.f30084s + i12, centerY - ((this.f30077l.getHeight() + (height + i14)) / 2));
            this.f30076k.draw(canvas);
            canvas.translate(0.0f, this.f30076k.getHeight() + i14);
            this.f30077l.draw(canvas);
            canvas.restore();
            int i15 = this.f30085t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f30086u / 2);
            RectF rectF = this.f30073g;
            rectF.set(dp - ((int) (this.f30078m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f30072f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f30078m.getHeight()) / 2.0f) + f7);
            this.f30078m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f30069b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f30068a;
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
