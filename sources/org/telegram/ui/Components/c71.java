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
public final class c71 extends Drawable {
    public final Drawable f25109a;
    public final Drawable f25110b;
    public final TextPaint f25111c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f25112f;
    public final RectF f25113g;
    public final yc h;
    public final oe.b f25114i;
    public Runnable f25115j;
    public StaticLayout f25116k;
    public StaticLayout f25117l;
    public StaticLayout f25118m;
    public String f25119n;
    public String f25120o;
    public String f25121p;
    public int f25122q;
    public int f25123r;
    public final int f25124s;
    public final int f25125t;
    public final int f25126u;
    public final int v;
    public final int f25127w;
    public final int f25128x;
    public final int f25129y;

    public c71() {
        TextPaint textPaint = new TextPaint(1);
        this.f25111c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f25112f = new Paint(1);
        this.f25113g = new RectF();
        yc ycVar = new yc((View) null);
        this.h = ycVar;
        this.f25114i = new oe.b(new k0.b(this, 17));
        this.f25124s = AndroidUtilities.dp(62.33f);
        this.f25125t = AndroidUtilities.dp(12.0f);
        this.f25126u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f25127w = AndroidUtilities.dp(7.0f);
        this.f25128x = AndroidUtilities.dp(12.0f);
        this.f25129y = AndroidUtilities.dp(2.0f);
        this.f25109a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f25110b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ycVar.f32604f = new fr0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f25122q = i10;
        String str = this.f25121p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f25118m = new StaticLayout(this.f25121p, textPaint, (int) Math.ceil(measureText), alignment, 1.0f, 0.0f, false);
        int dp = (((i10 - this.f25124s) - ((int) ((this.f25125t * 2) + measureText))) - this.f25128x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f25111c;
        this.f25116k = new StaticLayout(TextUtils.ellipsize(this.f25119n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.f25117l = new StaticLayout(this.f25120o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.f25127w * 2) + Math.max(this.f25117l.getHeight() + this.f25116k.getHeight() + this.f25129y, this.f25126u);
        this.f25123r = max;
        setBounds(0, 0, this.f25122q, max);
        return this.f25123r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21080ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f25109a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f25110b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216), mode));
        this.f25111c.setColor(x02);
        this.d.setColor(i0.b.o(x02, 179));
        this.e.setColor(x02);
        this.f25112f.setColor(org.telegram.ui.ActionBar.h6.m1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width;
        int i10;
        int i11;
        if (this.f25116k != null && this.f25117l != null && this.f25118m != null) {
            int i12 = getBounds().left;
            int i13 = getBounds().right;
            int centerY = getBounds().centerY();
            int height = this.f25116k.getHeight();
            int i14 = this.f25129y;
            canvas.save();
            canvas.translate(this.f25124s + i12, centerY - ((this.f25117l.getHeight() + (height + i14)) / 2));
            this.f25116k.draw(canvas);
            canvas.translate(0.0f, this.f25116k.getHeight() + i14);
            this.f25117l.draw(canvas);
            canvas.restore();
            int i15 = this.f25125t;
            int dp = i13 - AndroidUtilities.dp(11.0f);
            float f7 = centerY - (this.f25126u / 2);
            RectF rectF = this.f25113g;
            rectF.set(dp - ((int) (this.f25118m.getWidth() + (i15 * 2))), f7, dp, i11 + i10);
            float a2 = this.h.a(0.05f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            org.telegram.ui.ActionBar.h6.m1(0.18f, -1);
            int i16 = this.v;
            canvas.drawRoundRect(rectF, i16, i16, this.f25112f);
            canvas.save();
            canvas.translate(width + i15, ((i10 - this.f25118m.getHeight()) / 2.0f) + f7);
            this.f25118m.draw(canvas);
            canvas.restore();
            canvas.restore();
            float f10 = centerY + 1;
            Drawable drawable = this.f25110b;
            zf.p.d(drawable, AndroidUtilities.dp(29.66f) + i12, f10, 17);
            drawable.draw(canvas);
            float dp2 = AndroidUtilities.dp(29.66f) + i12;
            Drawable drawable2 = this.f25109a;
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
