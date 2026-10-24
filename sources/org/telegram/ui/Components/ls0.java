package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ls0 extends di.v {
    public final wv0 G;

    public ls0(wv0 wv0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(context, o2Var, j10);
        this.G = wv0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        wv0 wv0Var = this.G;
        SparseArray[] sparseArrayArr = wv0Var.Z0;
        if (messageObject.getDialogId() == wv0Var.f32385j1) {
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
        wv0 wv0Var = this.G;
        ArrayList arrayList = wv0Var.N0;
        NumberTextView numberTextView = wv0Var.A0;
        SparseArray[] sparseArrayArr = wv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == wv0Var.f32385j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        wv0Var.f32359a1++;
                    }
                    if (!wv0Var.C1) {
                        AndroidUtilities.hideKeyboard(wv0Var.f32410v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32388l0;
                        int i12 = 8;
                        if (wv0Var.f32359a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.u0 u0Var2 = wv0Var.f32407u0;
                        if (u0Var2 != null) {
                            if (wv0Var.getClosestTab() != 8 && wv0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            u0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = wv0Var.f32409v0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = wv0Var.f32412w0;
                        if (u0Var4 != null) {
                            u0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var5 = wv0Var.f32405t0;
                        if (u0Var5 != null) {
                            if (wv0Var.getClosestTab() != 8 && wv0Var.getClosestTab() != 13) {
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
                        wv0Var.f32362b1 = false;
                        wv0Var.e1(true);
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
        wv0 wv0Var = this.G;
        ArrayList arrayList = wv0Var.N0;
        SparseArray[] sparseArrayArr = wv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == wv0Var.f32385j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    wv0Var.f32359a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(wv0Var.f32410v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32388l0;
                    int i12 = 8;
                    if (wv0Var.f32359a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    u0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.u0 u0Var2 = wv0Var.f32407u0;
                    if (u0Var2 != null) {
                        if (wv0Var.getClosestTab() != 8 && wv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        u0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = wv0Var.f32409v0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = wv0Var.f32412w0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var5 = wv0Var.f32405t0;
                    if (u0Var5 != null) {
                        if (wv0Var.getClosestTab() != 8 && wv0Var.getClosestTab() != 13) {
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
                    wv0Var.f32362b1 = false;
                    AndroidUtilities.runOnUIThread(new jr0(this, 2), 20L);
                } else {
                    wv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f32421z1;
    }
}
