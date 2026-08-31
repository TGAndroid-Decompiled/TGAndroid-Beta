package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class h41 extends AnimatorListenerAdapter {
    public final int f37324a;
    public final org.telegram.ui.Components.nm0 f37325b;

    public h41(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.f37324a = i10;
        this.f37325b = nm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37324a) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37325b.f29565b;
                secretMediaViewer.W.getNextView().setText((CharSequence) null);
                it0 it0Var = secretMediaViewer.X;
                it0Var.f42297i0 = false;
                if (it0Var.f42298j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) it0Var.f42300l0.getLayoutParams()).topMargin = it0Var.f42298j0;
                    it0Var.f42298j0 = -1;
                    it0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) this.f37325b.f29565b).W.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37324a) {
            case 0:
                it0 it0Var = ((SecretMediaViewer) this.f37325b.f29565b).X;
                Method method = it0Var.f42291c0;
                if (method != null) {
                    try {
                        method.invoke(it0Var, null);
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
