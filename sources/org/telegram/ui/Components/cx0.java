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
    public final int f24055a;
    public final int f24056b;
    public final l5[] f24057c;
    public final boolean e;
    public int d = 255;
    public final RectF f24058f = new RectF();
    public boolean f24059g = false;

    public cx0(int i10, ArrayList arrayList, boolean z4) {
        int i11;
        this.e = z4;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.f24055a = max;
        int min = Math.min(max * max, arrayList.size());
        this.f24056b = min;
        this.f24057c = new l5[min];
        if (!arrayList.isEmpty()) {
            MessageObject.isAnimatedEmoji((TLRPC.Document) arrayList.get(0));
        }
        if (max < 2) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f24056b; i12++) {
            this.f24057c[i12] = l5.m(i10, i11, (TLRPC.Document) arrayList.get(i12));
        }
    }

    public final void a(org.telegram.ui.Cells.s1 s1Var) {
        for (int i10 = 0; i10 < this.f24056b; i10++) {
            this.f24057c[i10].o(s1Var);
        }
    }

    public final boolean b() {
        return this.f24059g;
    }

    public final boolean c(ArrayList arrayList) {
        long j10;
        l5[] l5VarArr = this.f24057c;
        if (l5VarArr.length == arrayList.size()) {
            for (int i10 = 0; i10 < l5VarArr.length; i10++) {
                TLRPC.Document document = l5VarArr[i10].e;
                if (document == null) {
                    j10 = 0;
                } else {
                    j10 = document.f19165id;
                }
                if (j10 == ((TLRPC.Document) arrayList.get(i10)).f19165id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.f24059g = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        l5 l5Var;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f24058f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (AndroidUtilities.dp(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (AndroidUtilities.dp(48.0f) / 2.0f);
        int dp = AndroidUtilities.dp(48.0f);
        int i10 = this.f24055a;
        float f10 = dp / i10;
        float dp2 = AndroidUtilities.dp(48.0f) / i10;
        canvas.save();
        canvas.clipRect(centerX, centerY, AndroidUtilities.dp(48.0f) + centerX, AndroidUtilities.dp(48.0f) + centerY);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                if (i13 >= 0) {
                    l5[] l5VarArr = this.f24057c;
                    if (i13 < l5VarArr.length && (l5Var = l5VarArr[i13]) != null) {
                        l5Var.setBounds((int) ((i12 * f10) + centerX), (int) ((i11 * dp2) + centerY), (int) (((i12 + 1) * f10) + centerX), (int) (((i11 + 1) * dp2) + centerY));
                        l5VarArr[i13].setAlpha(this.d);
                        l5 l5Var2 = l5VarArr[i13];
                        if (this.e) {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f20216w3;
                        } else {
                            porterDuffColorFilter = org.telegram.ui.ActionBar.j6.f20197v3;
                        }
                        l5Var2.setColorFilter(porterDuffColorFilter);
                        l5VarArr[i13].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void e() {
        this.f24059g = true;
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
