package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ff implements Runnable {
    public final int f23921a;
    public int f23922b;
    public final KeyEvent.Callback f23923c;

    public ff(KeyEvent.Callback callback, int i10, int i11) {
        this.f23921a = i11;
        this.f23923c = callback;
        this.f23922b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f23921a;
        int i11 = 2;
        KeyEvent.Callback callback = this.f23923c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null && (currentPage = cgVar.getCurrentPage()) != this.f23922b) {
                    this.f23922b = currentPage;
                    boolean z12 = chatActivityEnterView.f21857w3;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f21857w3 = z10;
                    boolean z13 = chatActivityEnterView.f21863x3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f21863x3 = z11;
                    if (chatActivityEnterView.y3) {
                        if (chatActivityEnterView.Q1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.n1(i11, true);
                            chatActivityEnterView.M();
                        } else if (!z10) {
                            chatActivityEnterView.o1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f21857w3 || z13 != chatActivityEnterView.f21863x3) {
                        chatActivityEnterView.L(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f23922b;
                mp mpVar = (mp) callback;
                s4.o0 layoutManager = mpVar.f26206w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > mpVar.Q) {
                        max = Math.min(i12 + 1, mpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    gp gpVar = mpVar.H;
                    gpVar.f42821a = max;
                    layoutManager.w0(gpVar);
                }
                mpVar.Q = i12;
                return;
            default:
                int i13 = this.f23922b;
                ci.m9 m9Var = (ci.m9) callback;
                if (((ff) m9Var.f5048f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) m9Var.f5046b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) m9Var.f5047c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    m9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) m9Var.e).playTogether(arrayList);
                    ((AnimatorSet) m9Var.e).addListener(new jd0(this, 2));
                    ((AnimatorSet) m9Var.e).start();
                    return;
                }
                return;
        }
    }

    public ff(ChatActivityEnterView chatActivityEnterView) {
        this.f23921a = 0;
        this.f23923c = chatActivityEnterView;
        this.f23922b = -1;
    }
}
