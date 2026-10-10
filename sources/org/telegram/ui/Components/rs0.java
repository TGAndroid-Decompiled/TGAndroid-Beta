package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class rs0 extends bi.z {
    public final cw0 G;

    public rs0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(context, n2Var, j3);
        this.G = cw0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        cw0 cw0Var = this.G;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        if (messageObject.getDialogId() == cw0Var.f25449j1) {
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
        cw0 cw0Var = this.G;
        ArrayList arrayList = cw0Var.N0;
        NumberTextView numberTextView = cw0Var.A0;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == cw0Var.f25449j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        cw0Var.f25425a1++;
                    }
                    if (!cw0Var.C1) {
                        AndroidUtilities.hideKeyboard(cw0Var.f25474v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25452l0;
                        int i12 = 8;
                        if (cw0Var.f25425a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.v0 v0Var2 = cw0Var.f25471u0;
                        if (v0Var2 != null) {
                            if (cw0Var.getClosestTab() != 8 && cw0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            v0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = cw0Var.f25473v0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = cw0Var.f25476w0;
                        if (v0Var4 != null) {
                            v0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var5 = cw0Var.f25469t0;
                        if (v0Var5 != null) {
                            if (cw0Var.getClosestTab() != 8 && cw0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            v0Var5.setVisibility(i12);
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
                        cw0Var.f25428b1 = false;
                        cw0Var.b1(true);
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
        cw0 cw0Var = this.G;
        ArrayList arrayList = cw0Var.N0;
        SparseArray[] sparseArrayArr = cw0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == cw0Var.f25449j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    cw0Var.f25425a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(cw0Var.f25474v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25452l0;
                    int i12 = 8;
                    if (cw0Var.f25425a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    v0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.v0 v0Var2 = cw0Var.f25471u0;
                    if (v0Var2 != null) {
                        if (cw0Var.getClosestTab() != 8 && cw0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        v0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = cw0Var.f25473v0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = cw0Var.f25476w0;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var5 = cw0Var.f25469t0;
                    if (v0Var5 != null) {
                        if (cw0Var.getClosestTab() != 8 && cw0Var.getClosestTab() != 13) {
                            i12 = 0;
                        }
                        v0Var5.setVisibility(i12);
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
                    cw0Var.f25428b1 = false;
                    AndroidUtilities.runOnUIThread(new pr0(this, 1), 20L);
                } else {
                    cw0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f25485z1;
    }
}
