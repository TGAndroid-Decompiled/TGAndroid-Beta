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
public final class x61 extends Drawable {
    public final Drawable f30229a;
    public final Drawable f30230b;
    public final TextPaint f30231c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f30232f;
    public final RectF f30233g;
    public final yc h;
    public final me.b f30234i;
    public Runnable f30235j;
    public StaticLayout f30236k;
    public StaticLayout f30237l;
    public StaticLayout f30238m;
    public String f30239n;
    public String f30240o;
    public String f30241p;
    public int f30242q;
    public int f30243r;
    public final int f30244s;
    public final int f30245t;
    public final int f30246u;
    public final int v;
    public final int f30247w;
    public final int f30248x;
    public final int f30249y;

    public x61() {
        TextPaint textPaint = new TextPaint(1);
        this.f30231c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f30232f = new Paint(1);
        this.f30233g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f30234i = new me.b(new k2.e(this, 14));
        this.f30244s = AndroidUtilities.dp(62.33f);
        this.f30245t = AndroidUtilities.dp(12.0f);
        this.f30246u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30247w = AndroidUtilities.dp(7.0f);
        this.f30248x = AndroidUtilities.dp(12.0f);
        this.f30249y = AndroidUtilities.dp(2.0f);
        this.f30229a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30230b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30630f = new yq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f30242q = i10;
        String str = this.f30241p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30238m = new StaticLayout(this.f30241p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f30244s) - ((int) ((this.f30245t * 2) + measureText))) - this.f30248x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30231c;
        this.f30236k = new StaticLayout(TextUtils.ellipsize(this.f30239n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f30237l = new StaticLayout(this.f30240o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f30247w * 2) + Math.max(this.f30237l.getHeight() + this.f30236k.getHeight() + this.f30249y, this.f30246u);
        this.f30243r = max;
        setBounds(0, 0, this.f30242q, max);
        return this.f30243r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19205ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30229a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f30230b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216), mode));
        this.f30231c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f30232f.setColor(org.telegram.ui.ActionBar.j6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f30236k != null && this.f30237l != null && this.f30238m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f30236k.getHeight();
            int i14 = this.f30249y;
            canvas.save();
            canvas.translate(this.f30244s + i12, centerY - ((this.f30237l.getHeight() + (height + i14)) / 2));
            this.f30236k.draw(canvas);
            canvas.translate(0.0f, this.f30236k.getHeight() + i14);
            this.f30237l.draw(canvas);
            canvas.restore();
            int i15 = this.f30245t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f30246u / 2);
            RectF rectF = this.f30233g;
            rectF.set(dp - ((int) (this.f30238m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.j6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f30232f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f30238m.getHeight()) / 2.0f) + f7);
            this.f30238m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f30230b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f30229a;
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
