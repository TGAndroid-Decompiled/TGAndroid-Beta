package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class le implements Runnable {
    public final int f28094a;
    public int f28095b;
    public final KeyEvent.Callback f28096c;

    public le(KeyEvent.Callback callback, int i10, int i11) {
        this.f28094a = i11;
        this.f28096c = callback;
        this.f28095b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f28094a;
        KeyEvent.Callback callback = this.f28096c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null && (currentPage = gfVar.getCurrentPage()) != this.f28095b) {
                    this.f28095b = currentPage;
                    boolean z12 = chatActivityEnterView.f23813x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f23813x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f23823z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i11 = 1;
                            }
                            chatActivityEnterView.k1(i11, true);
                            chatActivityEnterView.G();
                        } else if (!z10) {
                            chatActivityEnterView.l1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f23813x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.F(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f28095b;
                dp dpVar = (dp) callback;
                s4.n0 layoutManager = dpVar.f25492s1.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > dpVar.G1) {
                        max = Math.min(i12 + 1, dpVar.f25487n1.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    yo yoVar = dpVar.f25497x1;
                    yoVar.f48045a = max;
                    layoutManager.w0(yoVar);
                }
                dpVar.G1 = i12;
                return;
            default:
                int i13 = this.f28095b;
                uc0 uc0Var = (uc0) callback;
                if (((le) uc0Var.f30905f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) uc0Var.f30903b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) uc0Var.f30904c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    uc0Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) uc0Var.e).playTogether(arrayList);
                    ((AnimatorSet) uc0Var.e).addListener(new t60(this, 8));
                    ((AnimatorSet) uc0Var.e).start();
                    return;
                }
                return;
        }
    }

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.f28094a = 0;
        this.f28096c = chatActivityEnterView;
        this.f28095b = -1;
    }
}
