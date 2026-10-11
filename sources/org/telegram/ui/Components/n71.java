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
public final class n71 extends Drawable {
    public final Drawable f29062a;
    public final Drawable f29063b;
    public final TextPaint f29064c;
    public final TextPaint d;
    public final TextPaint f29065e;
    public final Paint f29066f;
    public final RectF f29067g;
    public final bd h;
    public final ne.b f29068i;
    public Runnable f29069j;
    public StaticLayout f29070k;
    public StaticLayout f29071l;
    public StaticLayout f29072m;
    public String f29073n;
    public String f29074o;
    public String f29075p;
    public int f29076q;
    public int f29077r;
    public final int f29078s;
    public final int f29079t;
    public final int f29080u;
    public final int v;
    public final int f29081w;
    public final int f29082x;
    public final int f29083y;

    public n71() {
        TextPaint textPaint = new TextPaint(1);
        this.f29064c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f29065e = textPaint3;
        this.f29066f = new Paint(1);
        this.f29067g = new RectF();
        bd bdVar = new bd((View) null);
        this.h = bdVar;
        this.f29068i = new ne.b(new de.m(this));
        this.f29078s = AndroidUtilities.dp(62.33f);
        this.f29079t = AndroidUtilities.dp(12.0f);
        this.f29080u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29081w = AndroidUtilities.dp(7.0f);
        this.f29082x = AndroidUtilities.dp(12.0f);
        this.f29083y = AndroidUtilities.dp(2.0f);
        this.f29062a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f29063b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        bdVar.f24979f = new pr0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29076q = i10;
        String str = this.f29075p;
        int length = str.length();
        TextPaint textPaint = this.f29065e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29072m = new StaticLayout(this.f29075p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29078s) - ((int) ((this.f29079t * 2) + measureText))) - this.f29082x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f29064c;
        this.f29070k = new StaticLayout(TextUtils.ellipsize(this.f29073n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29071l = new StaticLayout(this.f29074o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29081w * 2) + Math.max(this.f29071l.getHeight() + this.f29070k.getHeight() + this.f29083y, this.f29080u);
        this.f29077r = max;
        setBounds(0, 0, this.f29076q, max);
        return this.f29077r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20919ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f29062a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f29063b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f29064c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.f29065e.setColor(x02);
        this.f29066f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29070k != null && this.f29071l != null && this.f29072m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29070k.getHeight();
            int i14 = this.f29083y;
            canvas.save();
            canvas.translate(this.f29078s + i12, centerY - ((this.f29071l.getHeight() + (height + i14)) / 2));
            this.f29070k.draw(canvas);
            canvas.translate(0.0f, this.f29070k.getHeight() + i14);
            this.f29071l.draw(canvas);
            canvas.restore();
            int i15 = this.f29079t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29080u / 2);
            RectF rectF = this.f29067g;
            rectF.set(dp - ((int) (this.f29072m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f29066f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29072m.getHeight()) / 2.0f) + f7);
            this.f29072m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f29063b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f29062a;
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
