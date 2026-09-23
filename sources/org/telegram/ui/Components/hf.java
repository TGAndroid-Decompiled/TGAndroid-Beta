package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class hf implements Runnable {
    public final int f24658a;
    public int f24659b;
    public final KeyEvent.Callback f24660c;

    public hf(KeyEvent.Callback callback, int i10, int i11) {
        this.f24658a = i11;
        this.f24660c = callback;
        this.f24659b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f24658a;
        int i11 = 2;
        KeyEvent.Callback callback = this.f24660c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null && (currentPage = dgVar.getCurrentPage()) != this.f24659b) {
                    this.f24659b = currentPage;
                    boolean z12 = chatActivityEnterView.f21831w3;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f21831w3 = z10;
                    boolean z13 = chatActivityEnterView.f21837x3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.f21837x3 = z11;
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
                    if (z12 != chatActivityEnterView.f21831w3 || z13 != chatActivityEnterView.f21837x3) {
                        chatActivityEnterView.L(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f24659b;
                np npVar = (np) callback;
                s4.o0 layoutManager = npVar.f26473w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > npVar.Q) {
                        max = Math.min(i12 + 1, npVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    hp hpVar = npVar.H;
                    hpVar.f42777a = max;
                    layoutManager.w0(hpVar);
                }
                npVar.Q = i12;
                return;
            default:
                int i13 = this.f24659b;
                ci.j9 j9Var = (ci.j9) callback;
                if (((hf) j9Var.f4866f) == this) {
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
                    ((AnimatorSet) j9Var.e).addListener(new jd0(this, 2));
                    ((AnimatorSet) j9Var.e).start();
                    return;
                }
                return;
        }
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.f24658a = 0;
        this.f24660c = chatActivityEnterView;
        this.f24659b = -1;
    }
}
