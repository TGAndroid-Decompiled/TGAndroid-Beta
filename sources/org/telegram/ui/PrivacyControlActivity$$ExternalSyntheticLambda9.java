package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.utils.FBool;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.utils.NinePatchBuilder$NinePathRenderer;

public final class PrivacyControlActivity$$ExternalSyntheticLambda9 implements NinePatchBuilder$NinePathRenderer, GroupCreateActivity.GroupCreateActivityDelegate {
    public final Object f$0;
    public final int f$1;
    public final boolean f$2;

    public PrivacyControlActivity$$ExternalSyntheticLambda9(int i, Object obj, boolean z) {
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = z;
    }

    @Override
    public void didSelectUsers(ArrayList arrayList, boolean z, boolean z2) {
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
        int i = privacyControlActivity.neverShareRow;
        int i2 = this.f$1;
        boolean z3 = this.f$2;
        boolean[] zArr = privacyControlActivity.currentPlusMiniapps;
        int i3 = 0;
        if (i2 == i) {
            privacyControlActivity.currentMinus = arrayList;
            zArr[privacyControlActivity.currentType] = z3 && z2;
            while (i3 < privacyControlActivity.currentMinus.size()) {
                privacyControlActivity.currentPlus.remove(privacyControlActivity.currentMinus.get(i3));
                i3++;
            }
        } else {
            int i4 = privacyControlActivity.currentType;
            privacyControlActivity.currentPlusPremium[i4 == 2 ? (char) 0 : (char) 1] = z;
            zArr[i4] = z3 && z2;
            privacyControlActivity.currentPlus = arrayList;
            while (i3 < privacyControlActivity.currentPlus.size()) {
                privacyControlActivity.currentMinus.remove(privacyControlActivity.currentPlus.get(i3));
                i3++;
            }
        }
        privacyControlActivity.updateDoneButton();
        privacyControlActivity.listAdapter.mObservable.notifyChanged();
    }

    @Override
    public void draw(Canvas canvas, RectF rectF, float[] fArr) {
        Paint paint;
        float f;
        BlurredBackgroundDrawable blurredBackgroundDrawable = (BlurredBackgroundDrawable) this.f$0;
        blurredBackgroundDrawable.getClass();
        Path path = new Path();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f$1);
        float f2 = blurredBackgroundDrawable.shadowLayerRadius;
        if (f2 > 0.0f) {
            paint2.setShadowLayer(f2, 0.0f, blurredBackgroundDrawable.shadowLayerDy, blurredBackgroundDrawable.shadowColor);
        }
        canvas.drawPath(path, paint2);
        if (blurredBackgroundDrawable.shadowLayerRadius > 0.0f) {
            paint2.clearShadowLayer();
            canvas.drawPath(path, paint2);
        }
        if (this.f$2) {
            BlurredBackgroundDrawable.Props props = blurredBackgroundDrawable.boundProps;
            float[] fArrCopyOf = Arrays.copyOf(props.radii, 8);
            boolean zRadiiAreSame = FBool.radiiAreSame(fArrCopyOf);
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            Paint paint3 = new Paint(1);
            int iAlpha = Color.alpha(blurredBackgroundDrawable.strokeColorTop);
            float[] fArr2 = BlurredBackgroundDrawable.tmpRadii;
            if (iAlpha <= 0 || fArrCopyOf[0] <= 0.0f) {
                paint = paint3;
                f = 0.0f;
            } else {
                Arrays.fill(fArr2, 0.0f);
                fArr2[0] = fArrCopyOf[0];
                fArr2[1] = fArrCopyOf[1];
                fArr2[2] = fArrCopyOf[2];
                fArr2[3] = fArrCopyOf[3];
                if (zRadiiAreSame && fArrCopyOf[0] > fMin) {
                    fArr2[3] = fMin;
                    fArr2[2] = fMin;
                    fArr2[1] = fMin;
                    fArr2[0] = fMin;
                }
                Path path2 = new Path();
                float f3 = rectF.left;
                float f4 = rectF.top;
                f = 0.0f;
                paint = paint3;
                path2.addRoundRect(f3, f4, rectF.right, Math.min(Math.max(fArrCopyOf[0], fArrCopyOf[2]) + f4, rectF.bottom), fArr2, direction);
                float f5 = rectF.left;
                float f6 = rectF.top;
                path2.addRoundRect(f5, f6 + props.strokeWidthTop, rectF.right, Math.min(Math.max(fArrCopyOf[0], fArrCopyOf[2]) + f6, rectF.bottom), fArr2, Path.Direction.CCW);
                fArr2 = fArr2;
                paint.setColor(blurredBackgroundDrawable.strokeColorTop);
                canvas.drawPath(path2, paint);
            }
            if (Color.alpha(blurredBackgroundDrawable.strokeColorBottom) <= 0 || fArrCopyOf[4] <= f) {
                return;
            }
            Arrays.fill(fArr2, 0.0f);
            fArr2[4] = fArrCopyOf[4];
            fArr2[5] = fArrCopyOf[5];
            fArr2[6] = fArrCopyOf[6];
            fArr2[7] = fArrCopyOf[7];
            if (zRadiiAreSame && fArrCopyOf[0] > fMin) {
                fArr2[7] = fMin;
                fArr2[6] = fMin;
                fArr2[5] = fMin;
                fArr2[4] = fMin;
            }
            Path path3 = new Path();
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(fArrCopyOf[4], fArrCopyOf[6]), rectF.top), rectF.right, rectF.bottom, fArr2, direction);
            path3.addRoundRect(rectF.left, Math.max(rectF.bottom - Math.max(fArrCopyOf[4], fArrCopyOf[6]), rectF.top), rectF.right, rectF.bottom - props.strokeWidthBottom, fArr2, Path.Direction.CCW);
            paint.setColor(blurredBackgroundDrawable.strokeColorBottom);
            canvas.drawPath(path3, paint);
        }
    }
}
