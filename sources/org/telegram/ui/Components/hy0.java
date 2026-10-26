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
public final class hy0 extends Drawable {
    public final int f29069a;
    public final int f29070b;
    public final t5[] f29071c;
    public final boolean e;
    public int d = 255;
    public final RectF f29072f = new RectF();
    public boolean f29073g = false;

    public hy0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f29069a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f29070b = min;
        this.f29071c = new t5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f29070b; i12++) {
            this.f29071c[i12] = t5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.s1 s1Var) {
        for (int i10 = 0; i10 < this.f29070b; i10++) {
            this.f29071c[i10].o(s1Var);
        }
    }

    public final boolean b() {
        return this.f29073g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        t5[] t5VarArr = this.f29071c;
        if (t5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < t5VarArr.length; i10++) {
                TLRPC.Document document = t5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f22033id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f22033id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f29073g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        t5 t5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f29072f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f29069a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    t5[] t5VarArr = this.f29071c;
                    if (i13 < t5VarArr.length && (t5Var = t5VarArr[i13]) != null) {
                        t5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        t5VarArr[i13].setAlpha(this.d);
                        t5 t5Var2 = t5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.y6.f23708w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.y6.f23689v3;
                        }
                        t5Var2.setColorFilter(porterDuffColorFilter);
                        t5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f29073g = true;
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
