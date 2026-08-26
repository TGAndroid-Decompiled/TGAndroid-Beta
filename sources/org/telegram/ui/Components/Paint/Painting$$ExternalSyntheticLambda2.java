package org.telegram.ui.Components.Paint;

import com.stripe.android.Stripe;

public final class Painting$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Painting f$0;

    public Painting$$ExternalSyntheticLambda2(Painting painting, int i) {
        this.$r8$classId = i;
        this.f$0 = painting;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Painting painting = this.f$0;
                painting.activeShape = null;
                Stripe.AnonymousClass1 anonymousClass1 = painting.delegate;
                if (anonymousClass1 != null) {
                    anonymousClass1.contentChanged();
                }
                break;
            default:
                this.f$0.clearStrokeInternal();
                break;
        }
    }
}
