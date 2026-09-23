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
    public final Drawable f24177a;
    public final Drawable f24178b;
    public final TextPaint f24179c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f24180f;
    public final RectF f24181g;
    public final yc h;
    public final me.b f24182i;
    public Runnable f24183j;
    public StaticLayout f24184k;
    public StaticLayout f24185l;
    public StaticLayout f24186m;
    public String f24187n;
    public String f24188o;
    public String f24189p;
    public int f24190q;
    public int f24191r;
    public final int f24192s;
    public final int f24193t;
    public final int f24194u;
    public final int v;
    public final int f24195w;
    public final int f24196x;
    public final int f24197y;

    public g61() {
        TextPaint textPaint = new TextPaint(1);
        this.f24179c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f24180f = new Paint(1);
        this.f24181g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f24182i = new me.b(new org.telegram.ui.Cells.ja(this, 4));
        this.f24192s = AndroidUtilities.dp(62.33f);
        this.f24193t = AndroidUtilities.dp(12.0f);
        this.f24194u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f24195w = AndroidUtilities.dp(7.0f);
        this.f24196x = AndroidUtilities.dp(12.0f);
        this.f24197y = AndroidUtilities.dp(2.0f);
        this.f24177a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f24178b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30207f = new jq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f24190q = i10;
        String str = this.f24189p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f24186m = new StaticLayout(this.f24189p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f24192s) - ((int) ((this.f24193t * 2) + measureText))) - this.f24196x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f24179c;
        this.f24184k = new StaticLayout(TextUtils.ellipsize(this.f24187n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f24185l = new StaticLayout(this.f24188o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f24195w * 2) + Math.max(this.f24185l.getHeight() + this.f24184k.getHeight() + this.f24197y, this.f24194u);
        this.f24191r = max;
        setBounds(0, 0, this.f24190q, max);
        return this.f24191r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18884ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f24177a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f24178b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f24179c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f24180f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f24184k != null && this.f24185l != null && this.f24186m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f24184k.getHeight();
            int i14 = this.f24197y;
            canvas.save();
            canvas.translate(this.f24192s + i12, centerY - ((this.f24185l.getHeight() + (height + i14)) / 2));
            this.f24184k.draw(canvas);
            canvas.translate(0.0f, this.f24184k.getHeight() + i14);
            this.f24185l.draw(canvas);
            canvas.restore();
            int i15 = this.f24193t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f24194u / 2);
            RectF rectF = this.f24181g;
            rectF.set(dp - ((int) (this.f24186m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f24180f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f24186m.getHeight()) / 2.0f) + f7);
            this.f24186m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f24178b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f24177a;
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
