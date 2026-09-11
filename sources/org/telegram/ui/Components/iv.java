package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class iv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] f27267a;
    public bi.y3 f27268b;
    public z5 f27269c;
    public ValueAnimator d;
    public float f27270e;

    public TLRPC.Document getDocument() {
        z5 z5Var = this.f27269c;
        if (z5Var != null) {
            TLRPC.Document document = z5Var.document;
            if (document == null) {
                return q5.f(UserConfig.selectedAccount, z5Var.getDocumentId());
            }
            return document;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (!z10) {
                float f7 = this.f27270e;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new l6(this, 17));
                    this.d.addListener(new j6(this, 21));
                    this.d.setInterpolator(new OvershootInterpolator(5.0f));
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
