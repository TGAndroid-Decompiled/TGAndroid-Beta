package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class av extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] f26893a;
    public lh.x2 f26894b;
    public y5 f26895c;
    public ValueAnimator d;
    public float f26896e;

    public TLRPC.Document getDocument() {
        y5 y5Var = this.f26895c;
        if (y5Var != null) {
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                return p5.f(UserConfig.selectedAccount, y5Var.getDocumentId());
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
                float f9 = this.f26896e;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.d = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 17));
                    this.d.addListener(new org.telegram.ui.bm(this, 26));
                    this.d.setInterpolator(new OvershootInterpolator(5.0f));
                    this.d.setDuration(350L);
                    this.d.start();
                }
            }
        }
    }
}
