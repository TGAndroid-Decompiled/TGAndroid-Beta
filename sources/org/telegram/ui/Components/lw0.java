package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class lw0 extends Drawable {

    public final int f30477a;

    public final int f30478b;

    public final k5[] f30479c;

    public final boolean f30480e;
    public int d = 255;

    public final RectF f30481f = new RectF();

    public boolean f30482g = false;

    public lw0(int i10, ArrayList arrayList, boolean z10) {
        this.f30480e = z10;
        int iMax = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f30477a = iMax;
        int iMin = Math.min(iMax * iMax, arrayList.size());
        this.f30478b = iMin;
        this.f30479c = new k5[iMin];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        int i11 = iMax < 2 ? 1 : 0;
        for (int i12 = 0; i12 < this.f30478b; i12++) {
            this.f30479c[i12] = k5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.s1 s1Var) {
        for (int i10 = 0; i10 < this.f30478b; i10++) {
            this.f30479c[i10].o(s1Var);
        }
    }

    public final boolean b() {
        return this.f30482g;
    }

    public final boolean c(ArrayList arrayList) {
        k5[] k5VarArr = this.f30479c;
        if (k5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < k5VarArr.length; i10++) {
                TLRPC.Document document = k5VarArr[i10].f29956e;
                if ((document == null ? 0L : document.f22386id) == ((TLRPC.Document) arrayList.get(i10)).f22386id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f30482g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        k5 k5Var;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f30481f;
        rectF.set(bounds);
        float fCenterX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float fCenterY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int iDp = AndroidUtilities.dp(48.0f);
        int i10 = this.f30477a;
        float f10 = iDp / i10;
        float fDp = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(fCenterX, fCenterY, AndroidUtilities.dp(48.0f) + fCenterX, AndroidUtilities.dp(48.0f) + fCenterY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    k5[] k5VarArr = this.f30479c;
                    if (i13 < k5VarArr.length && (k5Var = k5VarArr[i13]) != null) {
                        k5Var.setBounds((int) ((i12 * f10) + fCenterX), (int) ((i11 * fDp) + fCenterY), (int) (((i12 + 1) * f10) + fCenterX), (int) (((i11 + 1) * fDp) + fCenterY));
                        k5VarArr[i13].setAlpha(this.d);
                        k5VarArr[i13].setColorFilter(this.f30480e ? org.telegram.ui.ActionBar.g6.f23388w3 : org.telegram.ui.ActionBar.g6.f23371v3);
                        k5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f30482g = true;
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
