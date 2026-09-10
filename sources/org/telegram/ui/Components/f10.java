package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class f10 extends AnimatorListenerAdapter {
    public final int f22801a;

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f22801a) {
            case 2:
                pf.e eVar = zh.x0.Z.L;
                if (eVar == null || (view = eVar.f39925j) == null) {
                    return;
                }
                eVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f22801a) {
            case 0:
                return;
            case 1:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
