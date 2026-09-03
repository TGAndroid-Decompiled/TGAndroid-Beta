package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ye implements Runnable {
    public final int f33517a;
    public int f33518b;
    public final KeyEvent.Callback f33519c;

    public ye(KeyEvent.Callback callback, int i10, int i11) {
        this.f33517a = i11;
        this.f33519c = callback;
        this.f33518b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z4;
        boolean z10;
        int max;
        int i10 = this.f33517a;
        KeyEvent.Callback callback = this.f33519c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null && (currentPage = ufVar.getCurrentPage()) != this.f33518b) {
                    this.f33518b = currentPage;
                    boolean z11 = chatActivityEnterView.f24682t3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    chatActivityEnterView.f24682t3 = z4;
                    boolean z12 = chatActivityEnterView.f24687u3;
                    if (currentPage == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatActivityEnterView.f24687u3 = z10;
                    if (chatActivityEnterView.f24692v3) {
                        if (chatActivityEnterView.N1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.m1(i11, true);
                            chatActivityEnterView.K();
                        } else if (!z4) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z11 != chatActivityEnterView.f24682t3 || z12 != chatActivityEnterView.f24687u3) {
                        chatActivityEnterView.J(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f33518b;
                mp mpVar = (mp) callback;
                f2.w0 layoutManager = mpVar.f29221w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > mpVar.N) {
                        max = Math.min(i12 + 1, mpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    fp fpVar = mpVar.E;
                    fpVar.f5805a = max;
                    layoutManager.w0(fpVar);
                }
                mpVar.N = i12;
                return;
            default:
                int i13 = this.f33518b;
                td0 td0Var = (td0) callback;
                if (((ye) td0Var.f31345f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) td0Var.f31342b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) td0Var.f31343c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    td0Var.f31344e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) td0Var.f31344e).playTogether(arrayList);
                    ((AnimatorSet) td0Var.f31344e).addListener(new pd0(this, 1));
                    ((AnimatorSet) td0Var.f31344e).start();
                    return;
                }
                return;
        }
    }

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.f33517a = 0;
        this.f33519c = chatActivityEnterView;
        this.f33518b = -1;
    }
}
