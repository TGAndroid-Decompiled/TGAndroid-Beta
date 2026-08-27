package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class vq0 extends kh.v {
    public final hu0 C;

    public vq0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, n2Var, j10);
        this.C = hu0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        hu0 hu0Var = this.C;
        return hu0Var.V0[(messageObject.getDialogId() > hu0Var.f29121f1 ? 1 : (messageObject.getDialogId() == hu0Var.f29121f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override
    public final boolean e(MessageObject messageObject) {
        hu0 hu0Var = this.C;
        ArrayList arrayList = hu0Var.J0;
        NumberTextView numberTextView = hu0Var.f29156w0;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == hu0Var.f29121f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        hu0Var.W0++;
                    }
                    if (hu0Var.f29163y1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(hu0Var.f29145r1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        hu0Var.f29124h0.setVisibility(hu0Var.W0 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29141q0;
                        if (v0Var != null) {
                            v0Var.setVisibility((hu0Var.getClosestTab() == 8 || hu0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.f29144r0;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = hu0Var.f29147s0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = hu0Var.f29139p0;
                        if (v0Var4 != null) {
                            if (hu0Var.getClosestTab() != 8 && hu0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            v0Var4.setVisibility(i10);
                        }
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            View view = (View) arrayList.get(i11);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        hu0Var.X0 = false;
                        hu0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(MessageObject messageObject) {
        hu0 hu0Var = this.C;
        ArrayList arrayList = hu0Var.J0;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        if (messageObject != null) {
            int i10 = 1;
            char c10 = messageObject.getDialogId() == hu0Var.f29121f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    hu0Var.W0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(hu0Var.f29145r1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    hu0Var.f29124h0.setVisibility(hu0Var.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29141q0;
                    if (v0Var != null) {
                        v0Var.setVisibility((hu0Var.getClosestTab() == 8 || hu0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.f29144r0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = hu0Var.f29147s0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = hu0Var.f29139p0;
                    if (v0Var4 != null) {
                        if (hu0Var.getClosestTab() != 8 && hu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        v0Var4.setVisibility(i11);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        View view = (View) arrayList.get(i12);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    hu0Var.X0 = false;
                    AndroidUtilities.runOnUIThread(new up0(this, i10), 20L);
                } else {
                    hu0Var.f29156w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.C.f29154v1;
    }
}
