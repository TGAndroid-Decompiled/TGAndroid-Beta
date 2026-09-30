package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class as0 extends bi.z {
    public final mv0 G;

    public as0(mv0 mv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(context, m2Var, j3);
        this.G = mv0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        mv0 mv0Var = this.G;
        SparseArray[] sparseArrayArr = mv0Var.Z0;
        if (messageObject.getDialogId() == mv0Var.f26424j1) {
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
        mv0 mv0Var = this.G;
        ArrayList arrayList = mv0Var.N0;
        NumberTextView numberTextView = mv0Var.A0;
        SparseArray[] sparseArrayArr = mv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == mv0Var.f26424j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        mv0Var.f26401a1++;
                    }
                    if (!mv0Var.C1) {
                        AndroidUtilities.hideKeyboard(mv0Var.f26449v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26427l0;
                        int i12 = 8;
                        if (mv0Var.f26401a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.u0 u0Var2 = mv0Var.f26446u0;
                        if (u0Var2 != null) {
                            if (mv0Var.getClosestTab() != 8 && mv0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            u0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = mv0Var.f26448v0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = mv0Var.f26451w0;
                        if (u0Var4 != null) {
                            u0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var5 = mv0Var.f26444t0;
                        if (u0Var5 != null) {
                            if (mv0Var.getClosestTab() != 8 && mv0Var.getClosestTab() != 13) {
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
                        mv0Var.f26404b1 = false;
                        mv0Var.b1(true);
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
        mv0 mv0Var = this.G;
        ArrayList arrayList = mv0Var.N0;
        SparseArray[] sparseArrayArr = mv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == mv0Var.f26424j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    mv0Var.f26401a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(mv0Var.f26449v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26427l0;
                    int i12 = 8;
                    if (mv0Var.f26401a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    u0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.u0 u0Var2 = mv0Var.f26446u0;
                    if (u0Var2 != null) {
                        if (mv0Var.getClosestTab() != 8 && mv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        u0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = mv0Var.f26448v0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = mv0Var.f26451w0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var5 = mv0Var.f26444t0;
                    if (u0Var5 != null) {
                        if (mv0Var.getClosestTab() != 8 && mv0Var.getClosestTab() != 13) {
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
                    mv0Var.f26404b1 = false;
                    AndroidUtilities.runOnUIThread(new zq0(this, 2), 20L);
                } else {
                    mv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f26460z1;
    }
}
