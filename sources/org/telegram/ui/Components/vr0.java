package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vr0 extends ai.g0 {
    public final iv0 G;

    public vr0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        super(context, p2Var, j3);
        this.G = iv0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        iv0 iv0Var = this.G;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        if (messageObject.getDialogId() == iv0Var.f24106j1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(MessageObject messageObject) {
        char c10;
        int i10;
        int i11;
        iv0 iv0Var = this.G;
        ArrayList arrayList = iv0Var.N0;
        NumberTextView numberTextView = iv0Var.A0;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == iv0Var.f24106j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        iv0Var.f24083a1++;
                    }
                    if (!iv0Var.C1) {
                        AndroidUtilities.hideKeyboard(iv0Var.f24131v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24109l0;
                        int i12 = 8;
                        if (iv0Var.f24083a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.f24128u0;
                        if (w0Var2 != null) {
                            if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            w0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = iv0Var.f24130v0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = iv0Var.f24133w0;
                        if (w0Var4 != null) {
                            w0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var5 = iv0Var.f24126t0;
                        if (w0Var5 != null) {
                            if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
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
                        iv0Var.f24086b1 = false;
                        iv0Var.b1(true);
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
        char c10;
        int i10;
        int i11;
        iv0 iv0Var = this.G;
        ArrayList arrayList = iv0Var.N0;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == iv0Var.f24106j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    iv0Var.f24083a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(iv0Var.f24131v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24109l0;
                    int i12 = 8;
                    if (iv0Var.f24083a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.f24128u0;
                    if (w0Var2 != null) {
                        if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = iv0Var.f24130v0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = iv0Var.f24133w0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var5 = iv0Var.f24126t0;
                    if (w0Var5 != null) {
                        if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
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
                    iv0Var.f24086b1 = false;
                    AndroidUtilities.runOnUIThread(new uq0(this, 1), 20L);
                } else {
                    iv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f24142z1;
    }
}
