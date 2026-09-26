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
public final class v61 extends Drawable {
    public final Drawable f28995a;
    public final Drawable f28996b;
    public final TextPaint f28997c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f28998f;
    public final RectF f28999g;
    public final yc h;
    public final me.b f29000i;
    public Runnable f29001j;
    public StaticLayout f29002k;
    public StaticLayout f29003l;
    public StaticLayout f29004m;
    public String f29005n;
    public String f29006o;
    public String f29007p;
    public int f29008q;
    public int f29009r;
    public final int f29010s;
    public final int f29011t;
    public final int f29012u;
    public final int v;
    public final int f29013w;
    public final int f29014x;
    public final int f29015y;

    public v61() {
        TextPaint textPaint = new TextPaint(1);
        this.f28997c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f28998f = new Paint(1);
        this.f28999g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f29000i = new me.b(new k2.u(this, 16));
        this.f29010s = AndroidUtilities.dp(62.33f);
        this.f29011t = AndroidUtilities.dp(12.0f);
        this.f29012u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29013w = AndroidUtilities.dp(7.0f);
        this.f29014x = AndroidUtilities.dp(12.0f);
        this.f29015y = AndroidUtilities.dp(2.0f);
        this.f28995a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f28996b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30622f = new xq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29008q = i10;
        String str = this.f29007p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29004m = new StaticLayout(this.f29007p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29010s) - ((int) ((this.f29011t * 2) + measureText))) - this.f29014x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f28997c;
        this.f29002k = new StaticLayout(TextUtils.ellipsize(this.f29005n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29003l = new StaticLayout(this.f29006o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29013w * 2) + Math.max(this.f29003l.getHeight() + this.f29002k.getHeight() + this.f29015y, this.f29012u);
        this.f29009r = max;
        setBounds(0, 0, this.f29008q, max);
        return this.f29009r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19154ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f28995a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f28996b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f28997c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f28998f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29002k != null && this.f29003l != null && this.f29004m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29002k.getHeight();
            int i14 = this.f29015y;
            canvas.save();
            canvas.translate(this.f29010s + i12, centerY - ((this.f29003l.getHeight() + (height + i14)) / 2));
            this.f29002k.draw(canvas);
            canvas.translate(0.0f, this.f29002k.getHeight() + i14);
            this.f29003l.draw(canvas);
            canvas.restore();
            int i15 = this.f29011t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29012u / 2);
            RectF rectF = this.f28999g;
            rectF.set(dp - ((int) (this.f29004m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f28998f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29004m.getHeight()) / 2.0f) + f7);
            this.f29004m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f28996b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f28995a;
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
