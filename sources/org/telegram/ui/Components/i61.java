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
public final class i61 extends Drawable {
    public final Drawable f24826a;
    public final Drawable f24827b;
    public final TextPaint f24828c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f24829f;
    public final RectF f24830g;
    public final wc h;
    public final me.b f24831i;
    public Runnable f24832j;
    public StaticLayout f24833k;
    public StaticLayout f24834l;
    public StaticLayout f24835m;
    public String f24836n;
    public String f24837o;
    public String f24838p;
    public int f24839q;
    public int f24840r;
    public final int f24841s;
    public final int f24842t;
    public final int f24843u;
    public final int v;
    public final int f24844w;
    public final int f24845x;
    public final int f24846y;

    public i61() {
        TextPaint textPaint = new TextPaint(1);
        this.f24828c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f24829f = new Paint(1);
        this.f24830g = new RectF();
        wc wcVar = new wc((View) null);
        this.h = wcVar;
        this.f24831i = new me.b(new org.telegram.ui.Cells.ia(this, 4));
        this.f24841s = AndroidUtilities.dp(62.33f);
        this.f24842t = AndroidUtilities.dp(12.0f);
        this.f24843u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f24844w = AndroidUtilities.dp(7.0f);
        this.f24845x = AndroidUtilities.dp(12.0f);
        this.f24846y = AndroidUtilities.dp(2.0f);
        this.f24826a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f24827b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        wcVar.f29632f = new kq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f24839q = i10;
        String str = this.f24838p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f24835m = new StaticLayout(this.f24838p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f24841s) - ((int) ((this.f24842t * 2) + measureText))) - this.f24845x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f24828c;
        this.f24833k = new StaticLayout(TextUtils.ellipsize(this.f24836n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f24834l = new StaticLayout(this.f24837o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f24844w * 2) + Math.max(this.f24834l.getHeight() + this.f24833k.getHeight() + this.f24846y, this.f24843u);
        this.f24840r = max;
        setBounds(0, 0, this.f24839q, max);
        return this.f24840r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18958ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f24826a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f24827b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f24828c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f24829f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f24833k != null && this.f24834l != null && this.f24835m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f24833k.getHeight();
            int i14 = this.f24846y;
            canvas.save();
            canvas.translate(this.f24841s + i12, centerY - ((this.f24834l.getHeight() + (height + i14)) / 2));
            this.f24833k.draw(canvas);
            canvas.translate(0.0f, this.f24833k.getHeight() + i14);
            this.f24834l.draw(canvas);
            canvas.restore();
            int i15 = this.f24842t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f24843u / 2);
            RectF rectF = this.f24830g;
            rectF.set(dp - ((int) (this.f24835m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f24829f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f24835m.getHeight()) / 2.0f) + f7);
            this.f24835m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f24827b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f24826a;
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
