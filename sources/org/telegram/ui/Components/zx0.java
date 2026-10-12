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
public final class zx0 extends Drawable {
    public final int f32010a;
    public final int f32011b;
    public final s5[] f32012c;
    public final boolean e;
    public int d = 255;
    public final RectF f32013f = new RectF();
    public boolean f32014g = false;

    public zx0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f32010a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f32011b = min;
        this.f32012c = new s5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f32011b; i12++) {
            this.f32012c[i12] = s5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.u1 u1Var) {
        for (int i10 = 0; i10 < this.f32011b; i10++) {
            this.f32012c[i10].o(u1Var);
        }
    }

    public final boolean b() {
        return this.f32014g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        s5[] s5VarArr = this.f32012c;
        if (s5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < s5VarArr.length; i10++) {
                TLRPC.Document document = s5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f19222id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f19222id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f32014g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        s5 s5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f32013f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f32010a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    s5[] s5VarArr = this.f32012c;
                    if (i13 < s5VarArr.length && (s5Var = s5VarArr[i13]) != null) {
                        s5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        s5VarArr[i13].setAlpha(this.d);
                        s5 s5Var2 = s5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.g6.f20249w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.g6.f20230v3;
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
        this.f32014g = true;
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
