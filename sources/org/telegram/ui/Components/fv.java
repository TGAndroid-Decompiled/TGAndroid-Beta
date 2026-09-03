package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] f27008a;
    public oh.z2 f27009b;
    public u5 f27010c;
    public ValueAnimator d;
    public float f27011e;

    public TLRPC.Document getDocument() {
        u5 u5Var = this.f27010c;
        if (u5Var != null) {
            TLRPC.Document document = u5Var.document;
            if (document == null) {
                return l5.f(UserConfig.selectedAccount, u5Var.getDocumentId());
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
    public void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (!z4) {
                float f10 = this.f27011e;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new f6(this, 17));
                    this.d.addListener(new a9(this, 17));
                    this.d.setInterpolator(new OvershootInterpolator(5.0f));
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
