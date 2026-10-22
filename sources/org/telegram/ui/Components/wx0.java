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
public final class wx0 extends Drawable {
    public final int f32272a;
    public final int f32273b;
    public final r5[] f32274c;
    public final boolean e;
    public int d = 255;
    public final RectF f32275f = new RectF();
    public boolean f32276g = false;

    public wx0(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        this.e = z10;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f32272a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f32273b = min;
        this.f32274c = new r5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f32273b; i12++) {
            this.f32274c[i12] = r5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.u1 u1Var) {
        for (int i10 = 0; i10 < this.f32273b; i10++) {
            this.f32274c[i10].o(u1Var);
        }
    }

    public final boolean b() {
        return this.f32276g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        r5[] r5VarArr = this.f32274c;
        if (r5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < r5VarArr.length; i10++) {
                TLRPC.Document document = r5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f20285id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f20285id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f32276g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        r5 r5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f32275f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f32272a;
        float f7 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    r5[] r5VarArr = this.f32274c;
                    if (i13 < r5VarArr.length && (r5Var = r5VarArr[i13]) != null) {
                        r5Var.setBounds((int) ((i12 * f7) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f7) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        r5VarArr[i13].setAlpha(this.d);
                        r5 r5Var2 = r5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.h6.f21342w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.h6.f21323v3;
                        }
                        r5Var2.setColorFilter(porterDuffColorFilter);
                        r5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f32276g = true;
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
