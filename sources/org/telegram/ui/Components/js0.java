package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class js0 extends di.v {
    public final uv0 G;

    public js0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, n2Var, j10);
        this.G = uv0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        uv0 uv0Var = this.G;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        if (messageObject.getDialogId() == uv0Var.f31049j1) {
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
        uv0 uv0Var = this.G;
        ArrayList arrayList = uv0Var.N0;
        NumberTextView numberTextView = uv0Var.A0;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == uv0Var.f31049j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        uv0Var.f31026a1++;
                    }
                    if (!uv0Var.C1) {
                        AndroidUtilities.hideKeyboard(uv0Var.f31074v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31052l0;
                        int i12 = 8;
                        if (uv0Var.f31026a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.f31071u0;
                        if (u0Var2 != null) {
                            if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            u0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = uv0Var.f31073v0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = uv0Var.f31076w0;
                        if (u0Var4 != null) {
                            u0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var5 = uv0Var.f31069t0;
                        if (u0Var5 != null) {
                            if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            u0Var5.setVisibility(i12);
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
                        uv0Var.f31029b1 = false;
                        uv0Var.d1(true);
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
        uv0 uv0Var = this.G;
        ArrayList arrayList = uv0Var.N0;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == uv0Var.f31049j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    uv0Var.f31026a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(uv0Var.f31074v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31052l0;
                    int i12 = 8;
                    if (uv0Var.f31026a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    u0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.f31071u0;
                    if (u0Var2 != null) {
                        if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        u0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = uv0Var.f31073v0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = uv0Var.f31076w0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var5 = uv0Var.f31069t0;
                    if (u0Var5 != null) {
                        if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
                            i12 = 0;
                        }
                        u0Var5.setVisibility(i12);
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
                    uv0Var.f31029b1 = false;
                    AndroidUtilities.runOnUIThread(new hr0(this, 1), 20L);
                } else {
                    uv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f31085z1;
    }
}
