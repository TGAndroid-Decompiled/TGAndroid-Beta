package org.telegram.ui.Gifts;

import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.SharedMediaLayout;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda1 implements FactorAnimator.Target, Utilities.Callback2Return {
    public final SharedMediaLayout.AnonymousClass13 f$0;

    public ProfileGiftsContainer$$ExternalSyntheticLambda1(SharedMediaLayout.AnonymousClass13 anonymousClass13) {
        this.f$0 = anonymousClass13;
    }

    @Override
    public void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.updateButton$3();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        SharedMediaLayout.AnonymousClass13 anonymousClass13 = this.f$0;
        ProfileGiftsContainer.Page currentPage = anonymousClass13.getCurrentPage();
        if (currentPage != null) {
            currentPage.resetReordering();
        }
        anonymousClass13.setReorderingCollections(false);
        if (num.intValue() != -1) {
            return Boolean.FALSE;
        }
        anonymousClass13.openEnterNameAlert(null, new ProfileGiftsContainer$$ExternalSyntheticLambda10(anonymousClass13, 0));
        return Boolean.TRUE;
    }
}
