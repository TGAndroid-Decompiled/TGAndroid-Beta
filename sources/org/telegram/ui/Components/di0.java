package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class di0 {

    public final View f27776a;

    public final int f27777b;

    public final int f27778c;
    public final int d;

    public final hi0 f27779e;

    public final TextPaint f27780f;

    public RectF f27781g;

    public di0(nt ntVar, Layout layout, Spanned spanned, hi0 hi0Var) {
        int i10;
        int i11;
        this.f27776a = ntVar;
        this.f27779e = hi0Var;
        this.f27780f = layout.getPaint();
        hi0Var.f29028c = spanned.getSpanStart(hi0Var);
        boolean z10 = hi0Var.f29026a;
        int spanEnd = spanned.getSpanEnd(hi0Var);
        hi0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(hi0Var.d) != '\n' && spanned.charAt(hi0Var.d - 1) == '\n') {
            hi0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(hi0Var.f29028c);
        int lineForOffset2 = layout.getLineForOffset(hi0Var.d);
        hi0Var.f29030f = lineForOffset2 - lineForOffset < 1;
        hi0Var.h = lineForOffset <= 0;
        hi0Var.f29031n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z10) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (hi0Var.f29030f) {
                i10 = 0;
            } else {
                i10 = (hi0Var.h ? 2 : 0) + 3;
            }
            this.f27777b = AndroidUtilities.dp(3 - i10) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (hi0Var.f29030f) {
                i11 = 0;
            } else {
                i11 = (hi0Var.f29031n ? 2 : 0) + 3;
            }
            this.f27778c = lineBottom - AndroidUtilities.dp(2 - i11);
        } else {
            this.f27777b = AndroidUtilities.dp(3 - (hi0Var.f29030f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.f27778c = layout.getLineBottom(lineForOffset2) - AndroidUtilities.dp(2 - (hi0Var.f29030f ? 1 : 2));
        }
        hi0Var.f29032r = false;
        float fMax = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            fMax = Math.max(fMax, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                hi0Var.f29032r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(fMax);
        if (z10 && ntVar != null && hi0Var.F == null) {
            hi0Var.F = new zh0(ntVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        RectF rectF;
        Path.Direction direction;
        hi0 hi0Var = this.f27779e;
        int i12 = hi0Var.E;
        float[] fArr = hi0Var.f29036y;
        boolean z10 = hi0Var.f29026a;
        Paint paint = hi0Var.f29035x;
        Paint paint2 = hi0Var.B;
        Path path = hi0Var.D;
        float[] fArr2 = hi0Var.C;
        Path path2 = hi0Var.A;
        Drawable drawable = hi0Var.f29034w;
        if (i12 != i11) {
            hi0Var.E = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.b.k(i11, 30));
        }
        int iDp = z10 ? i10 : AndroidUtilities.dp(32.0f) + this.d;
        int i13 = ((double) iDp) >= ((double) i10) * 0.95d ? i10 : iDp;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i14 = this.f27777b;
        float f10 = i14;
        float f11 = i13;
        int i15 = i13;
        int i16 = this.f27778c;
        float f12 = i16;
        rectF2.set(0.0f, f10, f11, f12);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float fDp = AndroidUtilities.dp(4.0f);
        fArr[5] = fDp;
        fArr[4] = fDp;
        fArr[3] = fDp;
        fArr[2] = fDp;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (!z10 || this.f27776a == null || hi0Var.F == null) {
            rectF = rectF2;
            direction = direction2;
        } else {
            if (this.f27781g == null) {
                this.f27781g = new RectF();
            }
            int iDp2 = AndroidUtilities.dp(3.333f);
            direction = direction2;
            rectF = rectF2;
            hi0Var.F.a(canvas, this.f27781g, i15 - iDp2, i16 - iDp2, i11, hi0Var.f29029e, b());
        }
        rectF.set(-AndroidUtilities.dp(3.0f), f10, 0.0f, f12);
        float fDp2 = AndroidUtilities.dp(4.0f);
        fArr2[7] = fDp2;
        fArr2[6] = fDp2;
        fArr2[1] = fDp2;
        fArr2[0] = fDp2;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!hi0Var.f29032r) {
            int intrinsicHeight = (int) (((i14 + i16) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i14) {
                intrinsicHeight = AndroidUtilities.dp(4.0f) + i14;
            }
            drawable.setBounds((i15 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i15 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f27779e.f29026a && ((float) (this.f27778c - this.f27777b)) > (this.f27780f.getTextSize() * 1.3f) * ((float) 3);
    }
}
