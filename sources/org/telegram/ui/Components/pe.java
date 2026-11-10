package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f36895a;
    public int f36896b;
    public final KeyEvent.Callback f36897c;

    public pe(KeyEvent.Callback callback, int i7, int i10) {
        this.f36895a = i10;
        this.f36897c = callback;
        this.f36896b = i7;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z9;
        boolean z10;
        int max;
        int i7 = this.f36895a;
        KeyEvent.Callback callback = this.f36897c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                lf lfVar = chatActivityEnterView.U0;
                if (lfVar != null && (currentPage = lfVar.getCurrentPage()) != this.f36896b) {
                    this.f36896b = currentPage;
                    boolean z11 = chatActivityEnterView.f31169x3;
                    int i10 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    chatActivityEnterView.f31169x3 = z9;
                    boolean z12 = chatActivityEnterView.f31175y3;
                    if (currentPage == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatActivityEnterView.f31175y3 = z10;
                    if (chatActivityEnterView.f31180z3) {
                        if (chatActivityEnterView.R1 != 0) {
                            if (currentPage != 0) {
                                i10 = 1;
                            }
                            chatActivityEnterView.m1(i10, true);
                            chatActivityEnterView.G();
                        } else if (!z9) {
                            chatActivityEnterView.n1(false, true, false, true);
                        }
                    }
                    if (z11 != chatActivityEnterView.f31169x3 || z12 != chatActivityEnterView.f31175y3) {
                        chatActivityEnterView.E(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = this.f36896b;
                vo voVar = (vo) callback;
                v4.n0 layoutManager = voVar.f39072v1.getLayoutManager();
                if (layoutManager != null) {
                    if (i11 > voVar.J1) {
                        max = Math.min(i11 + 1, voVar.f39067q1.d.size() - 1);
                    } else {
                        max = Math.max(i11 - 1, 0);
                    }
                    po poVar = voVar.A1;
                    poVar.f57221a = max;
                    layoutManager.w0(poVar);
                }
                voVar.J1 = i11;
                return;
            default:
                int i12 = this.f36896b;
                fi.a8 a8Var = (fi.a8) callback;
                if (((pe) a8Var.f11620f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) a8Var.f11617b).get(i12);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) a8Var.f11618c).get(i12);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    a8Var.f11619e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) a8Var.f11619e).playTogether(arrayList);
                    ((AnimatorSet) a8Var.f11619e).addListener(new e60(this, 8));
                    ((AnimatorSet) a8Var.f11619e).start();
                    return;
                }
                return;
        }
    }

    public pe(ChatActivityEnterView chatActivityEnterView) {
        this.f36895a = 0;
        this.f36897c = chatActivityEnterView;
        this.f36896b = -1;
    }
}
