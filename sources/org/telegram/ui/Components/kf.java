package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class kf implements Runnable {
    public final int f26697a;
    public int f26698b;
    public final KeyEvent.Callback f26699c;

    public kf(KeyEvent.Callback callback, int i10, int i11) {
        this.f26697a = i11;
        this.f26699c = callback;
        this.f26698b = i10;
    }

    @Override
    public final void run() {
        int currentPage;
        boolean z10;
        boolean z11;
        int max;
        int i10 = this.f26697a;
        KeyEvent.Callback callback = this.f26699c;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) callback;
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null && (currentPage = fgVar.getCurrentPage()) != this.f26698b) {
                    this.f26698b = currentPage;
                    boolean z12 = chatActivityEnterView.f22986x3;
                    int i11 = 2;
                    if (currentPage != 1 && currentPage != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    chatActivityEnterView.f22986x3 = z10;
                    boolean z13 = chatActivityEnterView.y3;
                    if (currentPage == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    chatActivityEnterView.y3 = z11;
                    if (chatActivityEnterView.f22996z3) {
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
                    if (z12 != chatActivityEnterView.f22986x3 || z13 != chatActivityEnterView.y3) {
                        chatActivityEnterView.I(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i12 = this.f26698b;
                zp zpVar = (zp) callback;
                s4.n0 layoutManager = zpVar.f31954w.getLayoutManager();
                if (layoutManager != null) {
                    if (i12 > zpVar.Q) {
                        max = Math.min(i12 + 1, zpVar.h.d.size() - 1);
                    } else {
                        max = Math.max(i12 - 1, 0);
                    }
                    tp tpVar = zpVar.H;
                    tpVar.f44979a = max;
                    layoutManager.w0(tpVar);
                }
                zpVar.Q = i12;
                return;
            default:
                int i13 = this.f26698b;
                di.i9 i9Var = (di.i9) callback;
                if (((kf) i9Var.f7083f) == this) {
                    ArrayList arrayList = new ArrayList();
                    TextView textView = (TextView) ((ArrayList) i9Var.f7081b).get(i13);
                    Property property = View.SCALE_X;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                    Property property2 = View.SCALE_Y;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    Property property3 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    TextView textView2 = (TextView) ((ArrayList) i9Var.f7082c).get(i13);
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, property3, 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    i9Var.e = animatorSet;
                    animatorSet.setDuration(150L);
                    ((AnimatorSet) i9Var.e).playTogether(arrayList);
                    ((AnimatorSet) i9Var.e).addListener(new k90(this, 6));
                    ((AnimatorSet) i9Var.e).start();
                    return;
                }
                return;
        }
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.f26697a = 0;
        this.f26699c = chatActivityEnterView;
        this.f26698b = -1;
    }
}
