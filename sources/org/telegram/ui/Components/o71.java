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
public final class o71 extends Drawable {
    public final Drawable f29280a;
    public final Drawable f29281b;
    public final TextPaint f29282c;
    public final TextPaint d;
    public final TextPaint f29283e;
    public final Paint f29284f;
    public final RectF f29285g;
    public final bd h;
    public final ne.b f29286i;
    public Runnable f29287j;
    public StaticLayout f29288k;
    public StaticLayout f29289l;
    public StaticLayout f29290m;
    public String f29291n;
    public String f29292o;
    public String f29293p;
    public int f29294q;
    public int f29295r;
    public final int f29296s;
    public final int f29297t;
    public final int f29298u;
    public final int v;
    public final int f29299w;
    public final int f29300x;
    public final int f29301y;

    public o71() {
        TextPaint textPaint = new TextPaint(1);
        this.f29282c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f29283e = textPaint3;
        this.f29284f = new Paint(1);
        this.f29285g = new RectF();
        bd bdVar = new bd((View) null);
        this.h = bdVar;
        this.f29286i = new ne.b(new de.m(this));
        this.f29296s = AndroidUtilities.dp(62.33f);
        this.f29297t = AndroidUtilities.dp(12.0f);
        this.f29298u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29299w = AndroidUtilities.dp(7.0f);
        this.f29300x = AndroidUtilities.dp(12.0f);
        this.f29301y = AndroidUtilities.dp(2.0f);
        this.f29280a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f29281b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        bdVar.f24911f = new qr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29294q = i10;
        String str = this.f29293p;
        int length = str.length();
        TextPaint textPaint = this.f29283e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29290m = new StaticLayout(this.f29293p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29296s) - ((int) ((this.f29297t * 2) + measureText))) - this.f29300x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f29282c;
        this.f29288k = new StaticLayout(TextUtils.ellipsize(this.f29291n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29289l = new StaticLayout(this.f29292o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29299w * 2) + Math.max(this.f29289l.getHeight() + this.f29288k.getHeight() + this.f29301y, this.f29298u);
        this.f29295r = max;
        setBounds(0, 0, this.f29294q, max);
        return this.f29295r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20883ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f29280a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f29281b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f29282c.setColor(x02);
        this.d.setColor(i0.a.k(x02, 179));
        this.f29283e.setColor(x02);
        this.f29284f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29288k != null && this.f29289l != null && this.f29290m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29288k.getHeight();
            int i14 = this.f29301y;
            canvas.save();
            canvas.translate(this.f29296s + i12, centerY - ((this.f29289l.getHeight() + (height + i14)) / 2));
            this.f29288k.draw(canvas);
            canvas.translate(0.0f, this.f29288k.getHeight() + i14);
            this.f29289l.draw(canvas);
            canvas.restore();
            int i15 = this.f29297t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29298u / 2);
            RectF rectF = this.f29285g;
            rectF.set(dp - ((int) (this.f29290m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f29284f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29290m.getHeight()) / 2.0f) + f7);
            this.f29290m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f29281b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f29280a;
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
