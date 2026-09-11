package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class jf implements Runnable {
    public final int f27464a;
    public int f27465b;
    public final KeyEvent.Callback f27466c;

    public jf(KeyEvent.Callback callback, int i10, int i11) {
        this.f27464a = i11;
        this.f27466c = callback;
        this.f27465b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f27464a;
        KeyEvent.Callback callback = this.f27466c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.f27465b) {
                    this.f27465b = currentPage;
                    boolean z12 = chatActivityEnterView.f23791w3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f23791w3 = z10;
                    boolean z13 = chatActivityEnterView.f23797x3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f23797x3 = z11;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.m1(i11, true);
                            chatActivityEnterView.L();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f23791w3 || z13 != chatActivityEnterView.f23797x3) {
                        chatActivityEnterView.K(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f27465b;
                lp lpVar = (lp) callback;
                s4.o0 layoutManager = lpVar.f28270w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > lpVar.Q) {
                        max = Math.min(i12 + 1, lpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    fp fpVar = lpVar.H;
                    fpVar.f45906a = max;
                    layoutManager.w0(fpVar);
                }
                lpVar.Q = i12;
                return;
            default:
                int i13 = this.f27465b;
                di.l9 l9Var = (di.l9) callback;
                if (((jf) l9Var.f7576f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) l9Var.f7573b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) l9Var.f7574c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    l9Var.f7575e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) l9Var.f7575e).playTogether(arrayList);
                    ((AnimatorSet) l9Var.f7575e).addListener(new r80(this, 5));
                    ((AnimatorSet) l9Var.f7575e).start();
                    return;
                }
                return;
        }
    }

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f27464a = 0;
        this.f27466c = chatActivityEnterView;
        this.f27465b = -1;
    }
}
