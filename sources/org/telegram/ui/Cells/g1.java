package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;

public final class g1 extends m1 {

    public final int f24365e;

    public final s1 f24366f;

    public g1(int i10, s1 s1Var) {
        super(0);
        this.f24366f = s1Var;
        this.f24365e = i10;
    }

    @Override
    public final void e() {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.f24651b;
        path.rewind();
        s1 s1Var = this.f24366f;
        int[] iArr = s1Var.f25527t3;
        int i10 = this.f24365e;
        int i11 = iArr[i10];
        if (i11 == 3 || i11 == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(iArr[i10] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i11 != 2) {
            float fDp = i11 == 0 ? AndroidUtilities.dp(6.0f) : 0.0f;
            path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            return;
        }
        MessageObject messageObject = s1Var.f25546u7;
        boolean z10 = messageObject != null && messageObject.isOutOwner();
        for (int i12 = 0; i12 < 4; i12++) {
            if (s1Var.f25427m3) {
                float[] fArr = s1.Ae;
                int i13 = i12 * 2;
                fArr[i13 + 1] = 0.0f;
                fArr[i13] = 0.0f;
            } else if (i12 == (z10 ? 3 : 2)) {
                float[] fArr2 = s1.Ae;
                int i14 = i12 * 2;
                float fDp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr2[i14 + 1] = fDp2;
                fArr2[i14] = fDp2;
            } else if (((s1Var.f25347g8 && s1Var.H == null) || s1Var.B) && (i12 == 2 || i12 == 3)) {
                float[] fArr3 = s1.Ae;
                int i15 = i12 * 2;
                int i16 = i15 + 1;
                float fDp3 = AndroidUtilities.dp(s1Var.B ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                fArr3[i16] = fDp3;
                fArr3[i15] = fDp3;
            } else {
                float[] fArr4 = s1.Ae;
                int i17 = i12 * 2;
                fArr4[i17 + 1] = 0.0f;
                fArr4[i17] = 0.0f;
            }
        }
        if (z10 || s1Var.F || (groupedMessagePosition = s1Var.H) != null || !(groupedMessagePosition == null || s1Var.W2)) {
            path.addRoundRect(rectF, s1.Ae, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
            path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f10 = rectF.right;
            float[] fArr5 = s1.Ae;
            float f11 = f10 - (fArr5[4] * 2.0f);
            float f12 = rectF.bottom;
            rectF2.set(f11, f12 - (fArr5[5] * 2.0f), f10, f12);
            path.arcTo(rectF2, 90.0f, -90.0f, false);
            path.lineTo(rectF.right, rectF.top);
            path.close();
        }
        path.close();
    }
}
