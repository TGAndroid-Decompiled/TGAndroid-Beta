package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class bt0 extends AnimatorListenerAdapter {
    public final int f36973a;
    public final org.telegram.ui.Components.pl0 f36974b;

    public bt0(org.telegram.ui.Components.pl0 pl0Var, int i9) {
        this.f36973a = i9;
        this.f36974b = pl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36973a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f36974b.f31689b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                zs0 zs0Var = photoViewer.P1;
                zs0Var.f40525h0 = false;
                if (zs0Var.f40526i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) zs0Var.f40528k0.getLayoutParams()).topMargin = zs0Var.f40526i0;
                    zs0Var.f40526i0 = -1;
                    zs0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f36974b.f31689b).M1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36973a) {
            case 0:
                zs0 zs0Var = ((PhotoViewer) this.f36974b.f31689b).P1;
                Method method = zs0Var.f40519b0;
                if (method != null) {
                    try {
                        method.invoke(zs0Var, null);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
