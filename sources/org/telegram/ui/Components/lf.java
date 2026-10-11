package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f28374a;
    public int f28375b;
    public final KeyEvent.Callback f28376c;

    public lf(KeyEvent.Callback callback, int i10, int i11) {
        this.f28374a = i11;
        this.f28376c = callback;
        this.f28375b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f28374a;
        KeyEvent.Callback callback = this.f28376c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null && (currentPage = ggVar.getCurrentPage()) != this.f28375b) {
                    this.f28375b = currentPage;
                    boolean z12 = chatActivityEnterView.f24015x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f24015x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f24025z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.k1(i11, true);
                            chatActivityEnterView.J();
                        } else if (!z10) {
                            chatActivityEnterView.l1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f24015x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.I(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f28375b;
                cq cqVar = (cq) callback;
                s4.p0 layoutManager = cqVar.f25437w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > cqVar.Q) {
                        max = Math.min(i12 + 1, cqVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    wp wpVar = cqVar.H;
                    wpVar.f47951a = max;
                    layoutManager.w0(wpVar);
                }
                cqVar.Q = i12;
                return;
            default:
                int i13 = this.f28375b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((lf) j9Var.f5289f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) j9Var.f5286b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) j9Var.f5287c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    j9Var.f5288e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) j9Var.f5288e).playTogether(arrayList);
                    ((AnimatorSet) j9Var.f5288e).addListener(new vd0(this, 3));
                    ((AnimatorSet) j9Var.f5288e).start();
                    return;
                }
                return;
        }
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f28374a = 0;
        this.f28376c = chatActivityEnterView;
        this.f28375b = -1;
    }
}
