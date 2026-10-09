package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f28447a;
    public int f28448b;
    public final KeyEvent.Callback f28449c;

    public lf(KeyEvent.Callback callback, int i10, int i11) {
        this.f28447a = i11;
        this.f28449c = callback;
        this.f28448b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f28447a;
        KeyEvent.Callback callback = this.f28449c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null && (currentPage = ggVar.getCurrentPage()) != this.f28448b) {
                    this.f28448b = currentPage;
                    boolean z12 = chatActivityEnterView.f23987x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f23987x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f23997z3) {
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
                    if (z12 != chatActivityEnterView.f23987x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.I(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f28448b;
                cq cqVar = (cq) callback;
                s4.p0 layoutManager = cqVar.f25476w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > cqVar.Q) {
                        max = Math.min(i12 + 1, cqVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    wp wpVar = cqVar.H;
                    wpVar.f47825a = max;
                    layoutManager.w0(wpVar);
                }
                cqVar.Q = i12;
                return;
            default:
                int i13 = this.f28448b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((lf) j9Var.f5290f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) j9Var.f5287b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) j9Var.f5288c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    j9Var.f5289e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) j9Var.f5289e).playTogether(arrayList);
                    ((AnimatorSet) j9Var.f5289e).addListener(new vd0(this, 3));
                    ((AnimatorSet) j9Var.f5289e).start();
                    return;
                }
                return;
        }
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f28447a = 0;
        this.f28449c = chatActivityEnterView;
        this.f28448b = -1;
    }
}
