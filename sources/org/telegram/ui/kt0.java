package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;
public final class kt0 extends AnimatorListenerAdapter {
    public final int f38513a;
    public final org.telegram.ui.Components.nm0 f38514b;

    public kt0(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.f38513a = i10;
        this.f38514b = nm0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38513a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f38514b.f29565b;
                photoViewer.N1.getNextView().setText((CharSequence) null);
                it0 it0Var = photoViewer.Q1;
                it0Var.f42297i0 = false;
                if (it0Var.f42298j0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) it0Var.f42300l0.getLayoutParams()).topMargin = it0Var.f42298j0;
                    it0Var.f42298j0 = -1;
                    it0Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) this.f38514b.f29565b).N1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38513a) {
            case 0:
                it0 it0Var = ((PhotoViewer) this.f38514b.f29565b).Q1;
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
