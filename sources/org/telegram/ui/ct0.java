package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.messenger.FileLog;

public final class ct0 extends AnimatorListenerAdapter {

    public final int f37148a;

    public final org.telegram.ui.Components.sl0 f37149b;

    public ct0(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f37148a = i10;
        this.f37149b = sl0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37148a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f37149b.f32482b;
                photoViewer.M1.getNextView().setText((CharSequence) null);
                at0 at0Var = photoViewer.P1;
                at0Var.f40925h0 = false;
                if (at0Var.f40926i0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) at0Var.f40928k0.getLayoutParams()).topMargin = at0Var.f40926i0;
                    at0Var.f40926i0 = -1;
                    at0Var.requestLayout();
                }
                break;
            default:
                ((PhotoViewer) this.f37149b.f32482b).M1.setTranslationY(0.0f);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37148a) {
            case 0:
                at0 at0Var = ((PhotoViewer) this.f37149b.f32482b).P1;
                Method method = at0Var.f40919b0;
                if (method != null) {
                    try {
                        method.invoke(at0Var, null);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
