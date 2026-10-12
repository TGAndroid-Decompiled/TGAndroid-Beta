package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f28182a;
    public int f28183b;
    public final KeyEvent.Callback f28184c;

    public lf(KeyEvent.Callback callback, int i10, int i11) {
        this.f28182a = i11;
        this.f28184c = callback;
        this.f28183b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f28182a;
        KeyEvent.Callback callback = this.f28184c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                ig igVar = chatActivityEnterView.U0;
                if (igVar != null && (currentPage = igVar.getCurrentPage()) != this.f28183b) {
                    this.f28183b = currentPage;
                    boolean z12 = chatActivityEnterView.Z3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.Z3 = z10;
                    boolean z13 = chatActivityEnterView.f23620a4;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f23620a4 = z11;
                    if (chatActivityEnterView.f23627b4) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.o1(i11, true);
                            chatActivityEnterView.M();
                        } else if (!z10) {
                            chatActivityEnterView.p1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.Z3 || z13 != chatActivityEnterView.f23620a4) {
                        chatActivityEnterView.L(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f28183b;
                eq eqVar = (eq) callback;
                s4.p0 layoutManager = eqVar.f25759w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > eqVar.Q) {
                        max = Math.min(i12 + 1, eqVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    yp ypVar = eqVar.H;
                    ypVar.f48058a = max;
                    layoutManager.w0(ypVar);
                }
                eqVar.Q = i12;
                return;
            default:
                int i13 = this.f28183b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((lf) j9Var.f5288f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) j9Var.f5285b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) j9Var.f5286c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    j9Var.f5287e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) j9Var.f5287e).playTogether(arrayList);
                    ((AnimatorSet) j9Var.f5287e).addListener(new zd0(this, 3));
                    ((AnimatorSet) j9Var.f5287e).start();
                    return;
                }
                return;
        }
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f28182a = 0;
        this.f28184c = chatActivityEnterView;
        this.f28183b = -1;
    }
}
