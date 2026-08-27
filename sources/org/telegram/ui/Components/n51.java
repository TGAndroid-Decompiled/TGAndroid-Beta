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

public final class n51 extends Drawable {

    public final Drawable f30866a;

    public final Drawable f30867b;

    public final TextPaint f30868c;
    public final TextPaint d;

    public final TextPaint f30869e;

    public final Paint f30870f;

    public final RectF f30871g;
    public final nc h;

    public final vd.b f30872i;

    public Runnable f30873j;

    public StaticLayout f30874k;

    public StaticLayout f30875l;

    public StaticLayout f30876m;

    public String f30877n;

    public String f30878o;

    public String f30879p;

    public int f30880q;

    public int f30881r;

    public final int f30882s;

    public final int f30883t;

    public final int f30884u;
    public final int v;

    public final int f30885w;

    public final int f30886x;

    public final int f30887y;

    public n51() {
        TextPaint textPaint = new TextPaint(1);
        this.f30868c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f30869e = textPaint3;
        this.f30870f = new Paint(1);
        this.f30871g = new RectF();
        nc ncVar = new nc((View) null);
        this.h = ncVar;
        this.f30872i = new vd.b(new n1.d(this, 13));
        this.f30882s = AndroidUtilities.dp(62.33f);
        this.f30883t = AndroidUtilities.dp(12.0f);
        this.f30884u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.f30885w = AndroidUtilities.dp(7.0f);
        this.f30886x = AndroidUtilities.dp(12.0f);
        this.f30887y = AndroidUtilities.dp(2.0f);
        this.f30866a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.f30867b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ncVar.f30948f = new up0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        b();
    }

    public final int a(int i10) {
        this.f30880q = i10;
        String str = this.f30879p;
        int length = str.length();
        TextPaint textPaint = this.f30869e;
        float fMeasureText = textPaint.measureText((CharSequence) str, 0, length);
        int i11 = (int) ((this.f30883t * 2) + fMeasureText);
        String str2 = this.f30879p;
        int iCeil = (int) Math.ceil(fMeasureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f30876m = new StaticLayout(str2, textPaint, iCeil, alignment, 1.0f, 0.0f, false);
        int iDp = (((i10 - this.f30882s) - i11) - this.f30886x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.f30868c;
        this.f30874k = new StaticLayout(TextUtils.ellipsize(this.f30877n, textPaint2, iDp, truncateAt), textPaint2, iDp, alignment, 1.0f, 0.0f, false);
        this.f30875l = new StaticLayout(this.f30878o, this.d, iDp, alignment, 1.0f, 0.0f, false);
        int iMax = (this.f30885w * 2) + Math.max(this.f30875l.getHeight() + this.f30874k.getHeight() + this.f30887y, this.f30884u);
        this.f30881r = iMax;
        setBounds(0, 0, this.f30880q, iMax);
        return this.f30881r;
    }

    public final void b() {
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23150ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30866a.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        this.f30867b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216), mode));
        this.f30868c.setColor(iW0);
        this.d.setColor(i0.b.k(iW0, 179));
        this.f30869e.setColor(iW0);
        this.f30870f.setColor(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30874k == null || this.f30875l == null || this.f30876m == null) {
            return;
        }
        int i10 = getBounds().left;
        int i11 = getBounds().right;
        int iCenterY = getBounds().centerY();
        int height = this.f30874k.getHeight();
        int i12 = this.f30887y;
        int height2 = iCenterY - ((this.f30875l.getHeight() + (height + i12)) / 2);
        canvas.save();
        canvas.translate(this.f30882s + i10, height2);
        this.f30874k.draw(canvas);
        canvas.translate(0.0f, this.f30874k.getHeight() + i12);
        this.f30875l.draw(canvas);
        canvas.restore();
        float width = this.f30876m.getWidth();
        int i13 = this.f30883t;
        int iDp = i11 - AndroidUtilities.dp(11.0f);
        int i14 = iDp - ((int) (width + (i13 * 2)));
        int i15 = this.f30884u;
        int i16 = iCenterY - (i15 / 2);
        float f10 = i16;
        RectF rectF = this.f30871g;
        rectF.set(i14, f10, iDp, i16 + i15);
        float fA = this.h.a(0.05f);
        canvas.save();
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        org.telegram.ui.ActionBar.g6.l1(0.18f, -1);
        int i17 = this.v;
        canvas.drawRoundRect(rectF, i17, i17, this.f30870f);
        canvas.save();
        canvas.translate(i14 + i13, ((i15 - this.f30876m.getHeight()) / 2.0f) + f10);
        this.f30876m.draw(canvas);
        canvas.restore();
        canvas.restore();
        float fDp = AndroidUtilities.dp(29.66f) + i10;
        float f11 = iCenterY + 1;
        Drawable drawable = this.f30867b;
        gf.s.d(drawable, fDp, f11, 17);
        drawable.draw(canvas);
        float fDp2 = AndroidUtilities.dp(29.66f) + i10;
        Drawable drawable2 = this.f30866a;
        gf.s.d(drawable2, fDp2, f11, 17);
        drawable2.draw(canvas);
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
