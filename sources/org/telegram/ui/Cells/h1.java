package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
public final class h1 extends n1 {
    public final int f24424e;
    public final t1 f24425f;

    public h1(int i9, t1 t1Var) {
        super(0);
        this.f24425f = t1Var;
        this.f24424e = i9;
    }

    @Override
    public final void e() {
        float f10;
        boolean z10;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i9;
        int i10;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.f24744b;
        path.rewind();
        t1 t1Var = this.f24425f;
        int[] iArr = t1Var.f25574t3;
        int i11 = this.f24424e;
        int i12 = iArr[i11];
        if (i12 != 3 && i12 != 4) {
            float f11 = 0.0f;
            if (i12 == 2) {
                MessageObject messageObject = t1Var.f25593u7;
                if (messageObject != null && messageObject.isOutOwner()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (!t1Var.f25474m3) {
                        if (z10) {
                            i9 = 3;
                        } else {
                            i9 = 2;
                        }
                        if (i13 == i9) {
                            float[] fArr = t1.Ae;
                            int i14 = i13 * 2;
                            float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                            fArr[i14 + 1] = dp;
                            fArr[i14] = dp;
                        } else if (((t1Var.f25394g8 && t1Var.H == null) || t1Var.B) && (i13 == 2 || i13 == 3)) {
                            float[] fArr2 = t1.Ae;
                            int i15 = i13 * 2;
                            int i16 = i15 + 1;
                            if (t1Var.B) {
                                i10 = Math.min(5, SharedConfig.bubbleRadius);
                            } else {
                                i10 = SharedConfig.bubbleRadius;
                            }
                            float dp2 = AndroidUtilities.dp(i10);
                            fArr2[i16] = dp2;
                            fArr2[i15] = dp2;
                        }
                    }
                    float[] fArr3 = t1.Ae;
                    int i17 = i13 * 2;
                    fArr3[i17 + 1] = 0.0f;
                    fArr3[i17] = 0.0f;
                }
                if (!z10 && !t1Var.F && (groupedMessagePosition = t1Var.H) == null && (groupedMessagePosition == null || t1Var.W2)) {
                    path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
                    path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f12 = rectF.right;
                    float[] fArr4 = t1.Ae;
                    float f13 = rectF.bottom;
                    rectF2.set(f12 - (fArr4[4] * 2.0f), f13 - (fArr4[5] * 2.0f), f12, f13);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, t1.Ae, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i12 == 0) {
                f11 = AndroidUtilities.dp(6.0f);
            }
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[i11] == 3) {
            f10 = 16.0f;
        } else {
            f10 = 20.0f;
        }
        path.addCircle(centerX, centerY, AndroidUtilities.dp(f10), Path.Direction.CW);
    }
}
