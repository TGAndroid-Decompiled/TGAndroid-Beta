package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yx0 extends Drawable {
    public final int f33078a;
    public final int f33079b;
    public final p5[] f33080c;
    public final boolean e;
    public int d = 255;
    public final RectF f33081f = new RectF();
    public boolean f33082g = false;

    public yx0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f33078a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f33079b = min;
        this.f33080c = new p5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f33079b; i12++) {
            this.f33080c[i12] = p5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.t1 t1Var) {
        for (int i10 = 0; i10 < this.f33079b; i10++) {
            this.f33080c[i10].o(t1Var);
        }
    }

    public final boolean b() {
        return this.f33082g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        p5[] p5VarArr = this.f33080c;
        if (p5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < p5VarArr.length; i10++) {
                TLRPC.Document document = p5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f20350id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f20350id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f33082g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        p5 p5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f33081f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f33078a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    p5[] p5VarArr = this.f33080c;
                    if (i13 < p5VarArr.length && (p5Var = p5VarArr[i13]) != null) {
                        p5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        p5VarArr[i13].setAlpha(this.d);
                        p5 p5Var2 = p5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.k6.f21533w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.k6.f21514v3;
                        }
                        p5Var2.setColorFilter(porterDuffColorFilter);
                        p5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f33082g = true;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
