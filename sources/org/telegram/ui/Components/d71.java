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
public final class d71 extends Drawable {
    public final Drawable f25437a;
    public final Drawable f25438b;
    public final TextPaint f25439c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25440f;
    public final RectF f25441g;
    public final yc h;
    public final oe.b f25442i;
    public Runnable f25443j;
    public StaticLayout f25444k;
    public StaticLayout f25445l;
    public StaticLayout f25446m;
    public String f25447n;
    public String f25448o;
    public String f25449p;
    public int f25450q;
    public int f25451r;
    public final int f25452s;
    public final int f25453t;
    public final int f25454u;
    public final int v;
    public final int f25455w;
    public final int f25456x;
    public final int f25457y;

    public d71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25439c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25440f = new Paint(1);
        this.f25441g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25442i = new oe.b(new k2.w0(this, 15));
        this.f25452s = AndroidUtilities.dp(62.33f);
        this.f25453t = AndroidUtilities.dp(12.0f);
        this.f25454u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25455w = AndroidUtilities.dp(7.0f);
        this.f25456x = AndroidUtilities.dp(12.0f);
        this.f25457y = AndroidUtilities.dp(2.0f);
        this.f25437a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25438b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32596f = new gr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25450q = i10;
        String str = this.f25449p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25446m = new StaticLayout(this.f25449p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25452s) - ((int) ((this.f25453t * 2) + measureText))) - this.f25456x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25439c;
        this.f25444k = new StaticLayout(TextUtils.ellipsize(this.f25447n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25445l = new StaticLayout(this.f25448o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25455w * 2) + Math.max(this.f25445l.getHeight() + this.f25444k.getHeight() + this.f25457y, this.f25454u);
        this.f25451r = max;
        setBounds(0, 0, this.f25450q, max);
        return this.f25451r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21081ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25437a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25438b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25439c.setColor(x02);
        this.d.setColor(i0.a.o(x02, 179));
        this.e.setColor(x02);
        this.f25440f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25444k != null && this.f25445l != null && this.f25446m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25444k.getHeight();
            int i14 = this.f25457y;
            canvas.save();
            canvas.translate(this.f25452s + i12, centerY - ((this.f25445l.getHeight() + (height + i14)) / 2));
            this.f25444k.draw(canvas);
            canvas.translate(0.0f, this.f25444k.getHeight() + i14);
            this.f25445l.draw(canvas);
            canvas.restore();
            int i15 = this.f25453t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25454u / 2);
            RectF rectF = this.f25441g;
            rectF.set(dp - ((int) (this.f25446m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25440f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25446m.getHeight()) / 2.0f) + f7);
            this.f25446m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25438b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25437a;
            zf.p.d(drawable2, dp2, f10, 17);
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
