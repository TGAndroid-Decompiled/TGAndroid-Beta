package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class jf implements Runnable {
    public final int f25405a;
    public int f25406b;
    public final KeyEvent.Callback f25407c;

    public jf(KeyEvent.Callback callback, int i10, int i11) {
        this.f25405a = i11;
        this.f25407c = callback;
        this.f25406b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f25405a;
        KeyEvent.Callback callback = this.f25407c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.f25406b) {
                    this.f25406b = currentPage;
                    boolean z12 = chatActivityEnterView.f22074x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f22074x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f22084z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.m1(i11, true);
                            chatActivityEnterView.L();
                        } else if (!z10) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f22074x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.K(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f25406b;
                np npVar = (np) callback;
                s4.o0 layoutManager = npVar.f26759w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > npVar.Q) {
                        max = Math.min(i12 + 1, npVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    hp hpVar = npVar.H;
                    hpVar.f43096a = max;
                    layoutManager.w0(hpVar);
                }
                npVar.Q = i12;
                return;
            default:
                int i13 = this.f25406b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((jf) j9Var.f4866f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) j9Var.f4864b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) j9Var.f4865c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    j9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) j9Var.e).playTogether(arrayList);
                    ((AnimatorSet) j9Var.e).addListener(new fd0(this, 3));
                    ((AnimatorSet) j9Var.e).start();
                    return;
                }
                return;
        }
    }

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.f25405a = 0;
        this.f25407c = chatActivityEnterView;
        this.f25406b = -1;
    }
}
