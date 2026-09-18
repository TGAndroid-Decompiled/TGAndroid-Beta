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
public final class cx0 extends Drawable {
    public final int f23151a;
    public final int f23152b;
    public final o5[] f23153c;
    public final boolean e;
    public int d = 255;
    public final RectF f23154f = new RectF();
    public boolean f23155g = false;

    public cx0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f23151a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f23152b = min;
        this.f23153c = new o5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f23152b; i12++) {
            this.f23153c[i12] = o5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.t1 t1Var) {
        for (int i10 = 0; i10 < this.f23152b; i10++) {
            this.f23153c[i10].o(t1Var);
        }
    }

    public final boolean b() {
        return this.f23155g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        o5[] o5VarArr = this.f23153c;
        if (o5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < o5VarArr.length; i10++) {
                TLRPC.Document document = o5VarArr[i10].e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f18127id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i10)).f18127id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f23155g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        o5 o5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f23154f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f23151a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    o5[] o5VarArr = this.f23153c;
                    if (i13 < o5VarArr.length && (o5Var = o5VarArr[i13]) != null) {
                        o5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        o5VarArr[i13].setAlpha(this.d);
                        o5 o5Var2 = o5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f19208w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f19190v3;
                        }
                        o5Var2.setColorFilter(porterDuffColorFilter);
                        o5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f23155g = true;
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
