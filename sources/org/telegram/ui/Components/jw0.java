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
public final class jw0 extends Drawable {
    public final int f29858a;
    public final int f29859b;
    public final k5[] f29860c;
    public final boolean f29861e;
    public int d = 255;
    public final RectF f29862f = new RectF();
    public boolean f29863g = false;

    public jw0(int i9, ArrayList arrayList, boolean z10) {
        int i10;
        this.f29861e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f29858a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f29859b = min;
        this.f29860c = new k5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < this.f29859b; i11++) {
            this.f29860c[i11] = k5.m(i9, i10, (TLRPC.Document) arrayList.get(i11));
        }
    }

    public final void a(org.telegram.ui.Cells.t1 t1Var) {
        for (int i9 = 0; i9 < this.f29859b; i9++) {
            this.f29860c[i9].o(t1Var);
        }
    }

    public final boolean b() {
        return this.f29863g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        k5[] k5VarArr = this.f29860c;
        if (k5VarArr.length == arrayList.size()) {
            for (int i9 = 0; i9 < k5VarArr.length; i9++) {
                TLRPC.Document document = k5VarArr[i9].f29946e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f22386id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i9)).f22386id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f29863g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        k5 k5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f29862f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i9 = this.f29858a;
        float f10 = dp / i9;
        float dp2 = AndroidUtilities.dp(48.0f) / i9;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i10 * i9) + i11;
                if (i12 >= 0) {
                    k5[] k5VarArr = this.f29860c;
                    if (i12 < k5VarArr.length && (k5Var = k5VarArr[i12]) != null) {
                        k5Var.setBounds((int) ((i11 * f10) + centerX), (int) ((i10 * dp2) + centerY), (int) (((i11 + 1) * f10) + centerX), (int) (((i10 + 1) * dp2) + centerY));
                        k5VarArr[i12].setAlpha(this.d);
                        k5 k5Var2 = k5VarArr[i12];
                        if (this.f29861e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.f6.f23331w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.f6.f23317v3;
                        }
                        k5Var2.setColorFilter(porterDuffColorFilter);
                        k5VarArr[i12].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f29863g = true;
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
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
