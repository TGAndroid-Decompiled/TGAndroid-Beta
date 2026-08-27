package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class tu extends View {

    public ImageReceiver.BackgroundThreadDrawHolder[] f32889a;

    public jh.y2 f32890b;

    public t5 f32891c;
    public ValueAnimator d;

    public float f32892e;

    public TLRPC.Document getDocument() {
        t5 t5Var = this.f32891c;
        if (t5Var == null) {
            return null;
        }
        TLRPC.Document document = t5Var.document;
        if (document != null) {
            return document;
        }
        return k5.f(UserConfig.selectedAccount, t5Var.getDocumentId());
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
            if (z10) {
                return;
            }
            float f10 = this.f32892e;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.d = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 17));
                this.d.addListener(new org.telegram.ui.am(this, 26));
                this.d.setInterpolator(new OvershootInterpolator(5.0f));
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
