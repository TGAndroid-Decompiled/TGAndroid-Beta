package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class xe implements Runnable {
    public final int f41987a;
    public int f41988b;
    public final KeyEvent.Callback f41989c;

    public xe(KeyEvent.Callback callback, int i7, int i10) {
        this.f41987a = i10;
        this.f41989c = callback;
        this.f41988b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i7 = this.f41987a;
        KeyEvent.Callback callback = this.f41989c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null && (currentPage = egVar.getCurrentPage()) != this.f41988b) {
                    this.f41988b = currentPage;
                    boolean z12 = chatActivityEnterView.f32741n4;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f32741n4 = z10;
                    boolean z13 = chatActivityEnterView.o4;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.o4 = z11;
                    if (chatActivityEnterView.f32756p4) {
                        if (chatActivityEnterView.H2 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.R1(i10, true);
                            chatActivityEnterView.Q();
                        } else if (!z10) {
                            chatActivityEnterView.S1(false, true, false, true);
                        }
                    }
                    if (z12 != chatActivityEnterView.f32741n4 || z13 != chatActivityEnterView.o4) {
                        chatActivityEnterView.P(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f41988b;
                kp kpVar = (kp) callback;
                v4.p0 layoutManager = kpVar.f36839w1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > kpVar.K1) {
                        max = Math.min(i11 + 1, kpVar.f36834r1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    fp fpVar = kpVar.B1;
                    fpVar.f59190a = max;
                    layoutManager.w0(fpVar);
                }
                kpVar.K1 = i11;
                return;
            default:
                int i12 = this.f41988b;
                hi.s8 s8Var = (hi.s8) callback;
                if (((xe) s8Var.f15404f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) s8Var.f15401b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) s8Var.f15402c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    s8Var.f15403e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) s8Var.f15403e).playTogether(arrayList);
                    ((AnimatorSet) s8Var.f15403e).addListener(new p60(this, 8));
                    ((AnimatorSet) s8Var.f15403e).start();
                    return;
                }
                return;
        }
    }

    public xe(ChatActivityEnterView chatActivityEnterView) {
        this.f41987a = 0;
        this.f41989c = chatActivityEnterView;
        this.f41988b = -1;
    }
}
