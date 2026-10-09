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
public final class dy0 extends Drawable {
    public final int f25844a;
    public final int f25845b;
    public final s5[] f25846c;
    public final boolean f25847e;
    public int d = 255;
    public final RectF f25848f = new RectF();
    public boolean f25849g = false;

    public dy0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.f25847e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f25844a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f25845b = min;
        this.f25846c = new s5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f25845b; i12++) {
            this.f25846c[i12] = s5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.u1 u1Var) {
        for (int i10 = 0; i10 < this.f25845b; i10++) {
            this.f25846c[i10].o(u1Var);
        }
    }

    public final boolean b() {
        return this.f25849g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        s5[] s5VarArr = this.f25846c;
        if (s5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < s5VarArr.length; i10++) {
                TLRPC.Document document = s5VarArr[i10].f30649e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f20044id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i10)).f20044id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f25849g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        s5 s5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f25848f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f25844a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    s5[] s5VarArr = this.f25846c;
                    if (i13 < s5VarArr.length && (s5Var = s5VarArr[i13]) != null) {
                        s5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        s5VarArr[i13].setAlpha(this.d);
                        s5 s5Var2 = s5VarArr[i13];
                        if (this.f25847e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.i6.f21143w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.i6.f21125v3;
                        }
                        s5Var2.setColorFilter(porterDuffColorFilter);
                        s5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f25849g = true;
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
