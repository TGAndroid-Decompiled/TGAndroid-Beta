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
public final class ax0 extends Drawable {
    public final int f24492a;
    public final int f24493b;
    public final q5[] f24494c;
    public final boolean f24495e;
    public int d = 255;
    public final RectF f24496f = new RectF();
    public boolean f24497g = false;

    public ax0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.f24495e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f24492a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f24493b = min;
        this.f24494c = new q5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f24493b; i12++) {
            this.f24494c[i12] = q5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.t1 t1Var) {
        for (int i10 = 0; i10 < this.f24493b; i10++) {
            this.f24494c[i10].o(t1Var);
        }
    }

    public final boolean b() {
        return this.f24497g;
    }

    public final boolean c(ArrayList arrayList) {
        long j3;
        q5[] q5VarArr = this.f24494c;
        if (q5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < q5VarArr.length; i10++) {
                TLRPC.Document document = q5VarArr[i10].f29606e;
                if (document == null) {
                    j3 = 0;
                } else {
                    j3 = document.f19902id;
                }
                if (j3 == ((TLRPC.Document) arrayList.get(i10)).f19902id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f24497g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        q5 q5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f24496f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f24492a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    q5[] q5VarArr = this.f24494c;
                    if (i13 < q5VarArr.length && (q5Var = q5VarArr[i13]) != null) {
                        q5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        q5VarArr[i13].setAlpha(this.d);
                        q5 q5Var2 = q5VarArr[i13];
                        if (this.f24495e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f21032w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f21014v3;
                        }
                        q5Var2.setColorFilter(porterDuffColorFilter);
                        q5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f24497g = true;
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
