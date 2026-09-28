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
public final class w61 extends Drawable {
    public final Drawable f29821a;
    public final Drawable f29822b;
    public final TextPaint f29823c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f29824f;
    public final RectF f29825g;
    public final yc h;
    public final me.b f29826i;
    public Runnable f29827j;
    public StaticLayout f29828k;
    public StaticLayout f29829l;
    public StaticLayout f29830m;
    public String f29831n;
    public String f29832o;
    public String f29833p;
    public int f29834q;
    public int f29835r;
    public final int f29836s;
    public final int f29837t;
    public final int f29838u;
    public final int v;
    public final int f29839w;
    public final int f29840x;
    public final int f29841y;

    public w61() {
        TextPaint textPaint = new TextPaint(1);
        this.f29823c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f29824f = new Paint(1);
        this.f29825g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f29826i = new me.b(new k2.u(this, 16));
        this.f29836s = AndroidUtilities.dp(62.33f);
        this.f29837t = AndroidUtilities.dp(12.0f);
        this.f29838u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f29839w = AndroidUtilities.dp(7.0f);
        this.f29840x = AndroidUtilities.dp(12.0f);
        this.f29841y = AndroidUtilities.dp(2.0f);
        this.f29821a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f29822b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f30640f = new yq0(this, 29);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f29834q = i10;
        String str = this.f29833p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f29830m = new StaticLayout(this.f29833p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f29836s) - ((int) ((this.f29837t * 2) + measureText))) - this.f29840x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f29823c;
        this.f29828k = new StaticLayout(TextUtils.ellipsize(this.f29831n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f29829l = new StaticLayout(this.f29832o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f29839w * 2) + Math.max(this.f29829l.getHeight() + this.f29828k.getHeight() + this.f29841y, this.f29838u);
        this.f29835r = max;
        setBounds(0, 0, this.f29834q, max);
        return this.f29835r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19154ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f29821a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.f29822b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216), mode));
        this.f29823c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f29824f.setColor(org.telegram.ui.ActionBar.h6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f29828k != null && this.f29829l != null && this.f29830m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f29828k.getHeight();
            int i14 = this.f29841y;
            canvas.save();
            canvas.translate(this.f29836s + i12, centerY - ((this.f29829l.getHeight() + (height + i14)) / 2));
            this.f29828k.draw(canvas);
            canvas.translate(0.0f, this.f29828k.getHeight() + i14);
            this.f29829l.draw(canvas);
            canvas.restore();
            int i15 = this.f29837t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f29838u / 2);
            RectF rectF = this.f29825g;
            rectF.set(dp - ((int) (this.f29830m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.l1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f29824f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f29830m.getHeight()) / 2.0f) + f7);
            this.f29830m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f29822b;
            yf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f29821a;
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
