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
public final class l51 extends Drawable {
    public final Drawable f30361a;
    public final Drawable f30362b;
    public final TextPaint f30363c;
    public final TextPaint d;
    public final TextPaint f30364e;
    public final Paint f30365f;
    public final RectF f30366g;
    public final pc h;
    public final ud.b f30367i;
    public Runnable f30368j;
    public StaticLayout f30369k;
    public StaticLayout f30370l;
    public StaticLayout f30371m;
    public String f30372n;
    public String f30373o;
    public String f30374p;
    public int f30375q;
    public int f30376r;
    public final int f30377s;
    public final int f30378t;
    public final int f30379u;
    public final int v;
    public final int f30380w;
    public final int f30381x;
    public final int f30382y;

    public l51() {
        TextPaint textPaint = new TextPaint(1);
        this.f30363c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f30364e = textPaint3;
        this.f30365f = new Paint(1);
        this.f30366g = new RectF();
        pc pcVar = new pc((View) null);
        this.h = pcVar;
        this.f30367i = new ud.b(new n5.e0(this, 12));
        this.f30377s = AndroidUtilities.dp(62.33f);
        this.f30378t = AndroidUtilities.dp(12.0f);
        this.f30379u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30380w = AndroidUtilities.dp(7.0f);
        this.f30381x = AndroidUtilities.dp(12.0f);
        this.f30382y = AndroidUtilities.dp(2.0f);
        this.f30361a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30362b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        pcVar.f31610f = new tp0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i9) {
        this.f30375q = i9;
        String str = this.f30374p;
        int length = str.length();
        TextPaint textPaint = this.f30364e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30371m = new StaticLayout(this.f30374p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i9 - this.f30377s) - ((int) ((this.f30378t * 2) + measureText))) - this.f30381x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30363c;
        this.f30369k = new StaticLayout(TextUtils.ellipsize(this.f30372n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f30370l = new StaticLayout(this.f30373o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f30380w * 2) + Math.max(this.f30370l.getHeight() + this.f30369k.getHeight() + this.f30382y, this.f30379u);
        this.f30376r = max;
        setBounds(0, 0, this.f30375q, max);
        return this.f30376r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23097ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30361a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f30362b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.l1(0.11f, -16777216), mode));
        this.f30363c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.f30364e.setColor(w02);
        this.f30365f.setColor(org.telegram.ui.ActionBar.f6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i9;
        int i10;
        if (this.f30369k != null && this.f30370l != null && this.f30371m != null) {
            int i11 = getBounds().left;
            int i12 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f30369k.getHeight();
            int i13 = this.f30382y;
            canvas.save();
            canvas.translate(this.f30377s + i11, centerY - ((this.f30370l.getHeight() + (height + i13)) / 2));
            this.f30369k.draw(canvas);
            canvas.translate(0.0f, this.f30369k.getHeight() + i13);
            this.f30370l.draw(canvas);
            canvas.restore();
            int i14 = this.f30378t;
            int dp = i12 - AndroidUtilities.dp(11.0f);
            float f10 = centerY - (this.f30379u / 2);
            RectF rectF = this.f30366g;
            rectF.set(dp - ((int) (this.f30371m.getWidth() + (i14 * 2))), f10, dp, i10 + i9);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.f6.l1(0.18f, -1);
            int i15 = this.v;
            canvas.drawRoundRect(rectF, i15, i15, this.f30365f);
            canvas.save();
            canvas.translate(width + i14, ((i9 - this.f30371m.getHeight()) / 2.0f) + f10);
            this.f30371m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f11 = centerY + 1;
            Drawable drawable = this.f30362b;
            ff.s.d(drawable, AndroidUtilities.dp(29.66f) + i11, f11, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i11;
            Drawable drawable2 = this.f30361a;
            ff.s.d(drawable2, dp2, f11, 17);
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
