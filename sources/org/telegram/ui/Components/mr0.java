package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mr0 extends bi.z {
    public final yu0 G;

    public mr0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(context, n2Var, j3);
        this.G = yu0Var;
    }

    @Override
    public final boolean c(MessageObject messageObject) {
        char c10;
        yu0 yu0Var = this.G;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        if (messageObject.getDialogId() == yu0Var.f30425j1) {
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
        yu0 yu0Var = this.G;
        ArrayList arrayList = yu0Var.N0;
        NumberTextView numberTextView = yu0Var.A0;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == yu0Var.f30425j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        yu0Var.f30402a1++;
                    }
                    if (!yu0Var.C1) {
                        AndroidUtilities.hideKeyboard(yu0Var.f30450v1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30428l0;
                        int i12 = 8;
                        if (yu0Var.f30402a1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.f30447u0;
                        if (v0Var2 != null) {
                            if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            v0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = yu0Var.f30449v0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = yu0Var.f30452w0;
                        if (v0Var4 != null) {
                            v0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var5 = yu0Var.f30445t0;
                        if (v0Var5 != null) {
                            if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
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
                        yu0Var.f30405b1 = false;
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
        char c10;
        int i10;
        int i11;
        yu0 yu0Var = this.G;
        ArrayList arrayList = yu0Var.N0;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        if (messageObject != null) {
            if (messageObject.getDialogId() == yu0Var.f30425j1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    yu0Var.f30402a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(yu0Var.f30450v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30428l0;
                    int i12 = 8;
                    if (yu0Var.f30402a1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    v0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.f30447u0;
                    if (v0Var2 != null) {
                        if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        v0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = yu0Var.f30449v0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = yu0Var.f30452w0;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var5 = yu0Var.f30445t0;
                    if (v0Var5 != null) {
                        if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
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
                    yu0Var.f30405b1 = false;
                    AndroidUtilities.runOnUIThread(new jq0(this, 1), 20L);
                } else {
                    yu0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.f30461z1;
    }
}
