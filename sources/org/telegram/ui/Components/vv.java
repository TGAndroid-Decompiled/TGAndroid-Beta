package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class vv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] f30662a;
    public bi.b4 f30663b;
    public b6 f30664c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        b6 b6Var = this.f30664c;
        if (b6Var != null) {
            TLRPC.Document document = b6Var.document;
            if (document == null) {
                return s5.f(UserConfig.selectedAccount, b6Var.getDocumentId());
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
                    ofFloat.addUpdateListener(new n6(this, 18));
                    this.d.addListener(new l6(this, 21));
                    org.telegram.ui.Cells.d0.l(5.0f, this.d);
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
