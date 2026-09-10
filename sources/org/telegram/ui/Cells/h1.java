package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
public final class h1 extends n1 {
    public final int e;
    public final t1 f19248f;

    public h1(int i10, t1 t1Var) {
        super(0);
        this.f19248f = t1Var;
        this.e = i10;
    }

    @Override
    public final void e() {
        float f7;
        boolean z10;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i10;
        int i11;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.f19556b;
        path.rewind();
        t1 t1Var = this.f19248f;
        int[] iArr = t1Var.f20385x3;
        int i12 = this.e;
        int i13 = iArr[i12];
        if (i13 != 3 && i13 != 4) {
            float f10 = 0.0f;
            if (i13 == 2) {
                MessageObject messageObject = t1Var.f20403y7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (!t1Var.f20280q3) {
                        if (z10) {
                            i10 = 3;
                        } else {
                            i10 = 2;
                        }
                        if (i14 == i10) {
                            float[] fArr = t1.Ee;
                            int i15 = i14 * 2;
                            float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                            fArr[i15 + 1] = dp;
                            fArr[i15] = dp;
                        } else if (((t1Var.f20202k8 && t1Var.L == null) || t1Var.F) && (i14 == 2 || i14 == 3)) {
                            float[] fArr2 = t1.Ee;
                            int i16 = i14 * 2;
                            int i17 = i16 + 1;
                            if (t1Var.F) {
                                i11 = Math.min(5, SharedConfig.bubbleRadius);
                            } else {
                                i11 = SharedConfig.bubbleRadius;
                            }
                            float dp2 = AndroidUtilities.dp(i11);
                            fArr2[i17] = dp2;
                            fArr2[i16] = dp2;
                        }
                    }
                    float[] fArr3 = t1.Ee;
                    int i18 = i14 * 2;
                    fArr3[i18 + 1] = 0.0f;
                    fArr3[i18] = 0.0f;
                }
                if (!z10 && !t1Var.J && (groupedMessagePosition = t1Var.L) == null && (groupedMessagePosition == null || t1Var.f20056a3)) {
                    path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
                    path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f11 = rectF.right;
                    float[] fArr4 = t1.Ee;
                    float f12 = rectF.bottom;
                    rectF2.set(f11 - (fArr4[4] * 2.0f), f12 - (fArr4[5] * 2.0f), f11, f12);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, t1.Ee, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i13 == 0) {
                f10 = AndroidUtilities.dp(6.0f);
            }
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[i12] == 3) {
            f7 = 16.0f;
        } else {
            f7 = 20.0f;
        }
        path.addCircle(centerX, centerY, AndroidUtilities.dp(f7), Path.Direction.CW);
    }
}
