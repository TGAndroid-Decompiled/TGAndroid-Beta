package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class yr0 extends bi.z {
    public final kv0 G;

    public yr0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(context, m2Var, j3);
        this.G = kv0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        kv0 kv0Var = this.G;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        if (messageObject.getDialogId() == kv0Var.f25841j1) {
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
        kv0 kv0Var = this.G;
        ArrayList arrayList = kv0Var.N0;
        NumberTextView numberTextView = kv0Var.A0;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == kv0Var.f25841j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        kv0Var.f25818a1++;
                    }
                    if (!kv0Var.C1) {
                        AndroidUtilities.hideKeyboard(kv0Var.f25866v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.u0 u0Var = kv0Var.f25844l0;
                        int i12 = 8;
                        if (kv0Var.f25818a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.u0 u0Var2 = kv0Var.f25863u0;
                        if (u0Var2 != null) {
                            if (kv0Var.getClosestTab() != 8 && kv0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            u0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = kv0Var.f25865v0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = kv0Var.f25868w0;
                        if (u0Var4 != null) {
                            u0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var5 = kv0Var.f25861t0;
                        if (u0Var5 != null) {
                            if (kv0Var.getClosestTab() != 8 && kv0Var.getClosestTab() != 13) {
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
                        kv0Var.f25821b1 = false;
                        kv0Var.b1(true);
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
        kv0 kv0Var = this.G;
        ArrayList arrayList = kv0Var.N0;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == kv0Var.f25841j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    kv0Var.f25818a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(kv0Var.f25866v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.u0 u0Var = kv0Var.f25844l0;
                    int i12 = 8;
                    if (kv0Var.f25818a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    u0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.u0 u0Var2 = kv0Var.f25863u0;
                    if (u0Var2 != null) {
                        if (kv0Var.getClosestTab() != 8 && kv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        u0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = kv0Var.f25865v0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = kv0Var.f25868w0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var5 = kv0Var.f25861t0;
                    if (u0Var5 != null) {
                        if (kv0Var.getClosestTab() != 8 && kv0Var.getClosestTab() != 13) {
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
                    kv0Var.f25821b1 = false;
                    AndroidUtilities.runOnUIThread(new xq0(this, 2), 20L);
                } else {
                    kv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f25877z1;
    }
}
