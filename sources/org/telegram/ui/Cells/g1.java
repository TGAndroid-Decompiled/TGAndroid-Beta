package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
public final class g1 extends m1 {
    public final int e;
    public final s1 f21048f;

    public g1(int i10, s1 s1Var) {
        super(0);
        this.f21048f = s1Var;
        this.e = i10;
    }

    @Override
    public final void e() {
        float f10;
        boolean z4;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i10;
        int i11;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.f21346b;
        path.rewind();
        s1 s1Var = this.f21048f;
        int[] iArr = s1Var.f22191u3;
        int i12 = this.e;
        int i13 = iArr[i12];
        if (i13 != 3 && i13 != 4) {
            float f11 = 0.0f;
            if (i13 == 2) {
                MessageObject messageObject = s1Var.f22210v7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (!s1Var.f22094n3) {
                        if (z4) {
                            i10 = 3;
                        } else {
                            i10 = 2;
                        }
                        if (i14 == i10) {
                            float[] fArr = s1.Be;
                            int i15 = i14 * 2;
                            float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                            fArr[i15 + 1] = dp;
                            fArr[i15] = dp;
                        } else if (((s1Var.f22014h8 && s1Var.I == null) || s1Var.C) && (i14 == 2 || i14 == 3)) {
                            float[] fArr2 = s1.Be;
                            int i16 = i14 * 2;
                            int i17 = i16 + 1;
                            if (s1Var.C) {
                                i11 = Math.min(5, SharedConfig.bubbleRadius);
                            } else {
                                i11 = SharedConfig.bubbleRadius;
                            }
                            float dp2 = AndroidUtilities.dp(i11);
                            fArr2[i17] = dp2;
                            fArr2[i16] = dp2;
                        }
                    }
                    float[] fArr3 = s1.Be;
                    int i18 = i14 * 2;
                    fArr3[i18 + 1] = 0.0f;
                    fArr3[i18] = 0.0f;
                }
                if (!z4 && !s1Var.G && (groupedMessagePosition = s1Var.I) == null && (groupedMessagePosition == null || s1Var.X2)) {
                    path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
                    path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f12 = rectF.right;
                    float[] fArr4 = s1.Be;
                    float f13 = rectF.bottom;
                    rectF2.set(f12 - (fArr4[4] * 2.0f), f13 - (fArr4[5] * 2.0f), f12, f13);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, s1.Be, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i13 == 0) {
                f11 = AndroidUtilities.dp(6.0f);
            }
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[i12] == 3) {
            f10 = 16.0f;
        } else {
            f10 = 20.0f;
        }
        path.addCircle(centerX, centerY, AndroidUtilities.dp(f10), Path.Direction.CW);
    }
}
