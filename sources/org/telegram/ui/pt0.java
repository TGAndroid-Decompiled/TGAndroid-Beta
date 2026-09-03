package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f40126a;
    public final org.telegram.ui.Components.mm0 f40127b;

    public pt0(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f40126a = i10;
        this.f40127b = mm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40126a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f40127b.f29180b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                nt0 nt0Var = photoViewer.Q1;
                nt0Var.f35260i0 = false;
                if (nt0Var.f35261j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) nt0Var.f35263l0.getLayoutParams()).topMargin = nt0Var.f35261j0;
                    nt0Var.f35261j0 = -1;
                    nt0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f40127b.f29180b).N1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40126a) {
            case 0:
                nt0 nt0Var = ((PhotoViewer) this.f40127b.f29180b).Q1;
                Method method = nt0Var.f35254c0;
                if (method != null) {
                    try {
                        method.invoke(nt0Var, null);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
