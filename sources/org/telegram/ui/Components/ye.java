package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ye implements Runnable {
    public final int f31004a;
    public int f31005b;
    public final KeyEvent.Callback f31006c;

    public ye(KeyEvent.Callback callback, int i10, int i11) {
        this.f31004a = i11;
        this.f31006c = callback;
        this.f31005b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z4;
        boolean z10;
        int max;
        int i10 = this.f31004a;
        KeyEvent.Callback callback = this.f31006c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null && (currentPage = ufVar.getCurrentPage()) != this.f31005b) {
                    this.f31005b = currentPage;
                    boolean z11 = chatActivityEnterView.f22813t3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    chatActivityEnterView.f22813t3 = z4;
                    boolean z12 = chatActivityEnterView.f22818u3;
                    if (currentPage == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatActivityEnterView.f22818u3 = z10;
                    if (chatActivityEnterView.f22823v3) {
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
                    if (z11 != chatActivityEnterView.f22813t3 || z12 != chatActivityEnterView.f22818u3) {
                        chatActivityEnterView.J(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f31005b;
                jp jpVar = (jp) callback;
                f2.v0 layoutManager = jpVar.f26017w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > jpVar.N) {
                        max = Math.min(i12 + 1, jpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    cp cpVar = jpVar.E;
                    cpVar.f5712a = max;
                    layoutManager.w0(cpVar);
                }
                jpVar.N = i12;
                return;
            default:
                int i13 = this.f31005b;
                sd0 sd0Var = (sd0) callback;
                if (((ye) sd0Var.f28728f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) sd0Var.f28726b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) sd0Var.f28727c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    sd0Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) sd0Var.e).playTogether(arrayList);
                    ((AnimatorSet) sd0Var.e).addListener(new od0(this, 1));
                    ((AnimatorSet) sd0Var.e).start();
                    return;
                }
                return;
        }
    }

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.f31004a = 0;
        this.f31006c = chatActivityEnterView;
        this.f31005b = -1;
    }
}
