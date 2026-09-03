package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nr0 extends ph.p {
    public final yu0 D;

    public nr0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(context, p2Var, j10);
        this.D = yu0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c3;
        yu0 yu0Var = this.D;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        if (messageObject.getDialogId() == yu0Var.f33624g1) {
            c3 = 0;
        } else {
            c3 = 1;
        }
        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(MessageObject messageObject) {
        char c3;
        int i10;
        int i11;
        yu0 yu0Var = this.D;
        ArrayList arrayList = yu0Var.K0;
        NumberTextView numberTextView = yu0Var.f33660x0;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == yu0Var.f33624g1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        yu0Var.X0++;
                    }
                    if (!yu0Var.f33666z1) {
                        AndroidUtilities.hideKeyboard(yu0Var.f33649s1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f33627i0;
                        int i12 = 8;
                        if (yu0Var.X0 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.f33645r0;
                        if (w0Var2 != null) {
                            if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            w0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = yu0Var.f33648s0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = yu0Var.f33650t0;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var5 = yu0Var.f33642q0;
                        if (w0Var5 != null) {
                            if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            w0Var5.setVisibility(i12);
                        }
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            View view = (View) arrayList.get(i13);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        yu0Var.Y0 = false;
                        yu0Var.b1(true);
                    } else {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
        char c3;
        int i10;
        int i11;
        yu0 yu0Var = this.D;
        ArrayList arrayList = yu0Var.K0;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == yu0Var.f33624g1) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c3].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    yu0Var.X0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(yu0Var.f33649s1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f33627i0;
                    int i12 = 8;
                    if (yu0Var.X0 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.f33645r0;
                    if (w0Var2 != null) {
                        if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = yu0Var.f33648s0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = yu0Var.f33650t0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var5 = yu0Var.f33642q0;
                    if (w0Var5 != null) {
                        if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                            i12 = 0;
                        }
                        w0Var5.setVisibility(i12);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        View view = (View) arrayList.get(i13);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    yu0Var.Y0 = false;
                    AndroidUtilities.runOnUIThread(new nq0(this, 1), 20L);
                } else {
                    yu0Var.f33660x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.D.f33658w1;
    }
}
