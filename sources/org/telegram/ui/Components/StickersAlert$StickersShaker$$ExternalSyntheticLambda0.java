package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import com.google.firebase.messaging.GmsRpc;
import java.util.ArrayList;

public final class StickersAlert$StickersShaker$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final GmsRpc f$0;
    public final int f$1;

    public StickersAlert$StickersShaker$$ExternalSyntheticLambda0(GmsRpc gmsRpc, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = gmsRpc;
        this.f$1 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f$0.userAgentPublisher;
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                arrayList.set(this.f$1, f);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f$0.heartbeatInfo;
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                f2.getClass();
                arrayList2.set(this.f$1, f2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) this.f$0.firebaseInstallations;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                f3.getClass();
                arrayList3.set(this.f$1, f3);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) this.f$0.userAgentPublisher;
                Float f4 = (Float) valueAnimator.getAnimatedValue();
                f4.getClass();
                arrayList4.set(this.f$1, f4);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) this.f$0.heartbeatInfo;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                f5.getClass();
                arrayList5.set(this.f$1, f5);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) this.f$0.firebaseInstallations;
                Float f6 = (Float) valueAnimator.getAnimatedValue();
                f6.getClass();
                arrayList6.set(this.f$1, f6);
                break;
        }
    }
}
