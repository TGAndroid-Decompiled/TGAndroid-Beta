package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class rv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] f30054a;
    public ci.g3 f30055b;
    public a6 f30056c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        a6 a6Var = this.f30056c;
        if (a6Var != null) {
            TLRPC.Document document = a6Var.document;
            if (document == null) {
                return r5.f(UserConfig.selectedAccount, a6Var.getDocumentId());
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
                float f7 = this.e;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new l6(this, 18));
                    this.d.addListener(new org.telegram.ui.pq(this, 23));
                    org.telegram.messenger.wh.l(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
