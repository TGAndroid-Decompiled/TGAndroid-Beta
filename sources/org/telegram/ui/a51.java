package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class a51 extends AnimatorListenerAdapter {
    public final int f31727a;
    public final org.telegram.ui.Components.fm0 f31728b;

    public a51(org.telegram.ui.Components.fm0 fm0Var, int i10) {
        this.f31727a = i10;
        this.f31728b = fm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31727a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f31728b.f23966b;
                secretMediaViewer.Z.getNextView().setText((CharSequence) null);
                du0 du0Var = secretMediaViewer.f31454a0;
                du0Var.f37037l0 = false;
                if (du0Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) du0Var.f37039o0.getLayoutParams()).topMargin = du0Var.m0;
                    du0Var.m0 = -1;
                    du0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f31728b.f23966b).Z.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31727a) {
            case 0:
                du0 du0Var = ((SecretMediaViewer) this.f31728b.f23966b).f31454a0;
                Method method = du0Var.f37031f0;
                if (method != null) {
                    try {
                        method.invoke(du0Var, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
