package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class dq0 extends gi.q {
    public final gt0 H;

    public dq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, long j3) {
        super(context, h2Var, j3);
        this.H = gt0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.fj fjVar) {
        char c10;
        gt0 gt0Var = this.H;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        if (org.telegram.messenger.fj.B0(fjVar.f23968k) == gt0Var.f35606m1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.fj fjVar) {
        char c10;
        int i7;
        int i10;
        gt0 gt0Var = this.H;
        ArrayList arrayList = gt0Var.Q0;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f23968k) == gt0Var.f35606m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        gt0Var.f35580d1++;
                    }
                    if (!gt0Var.F1) {
                        org.telegram.messenger.g0.v1(gt0Var.f35642y1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35611o0;
                        int i11 = 8;
                        if (gt0Var.f35580d1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        r0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.f35638x0;
                        if (r0Var2 != null) {
                            if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            r0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.f35641y0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.f35643z0;
                        if (r0Var4 != null) {
                            r0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var5 = gt0Var.f35635w0;
                        if (r0Var5 != null) {
                            if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            r0Var5.setVisibility(i11);
                        }
                        gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            View view = (View) arrayList.get(i12);
                            org.telegram.messenger.g0.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        gt0Var.f35583e1 = false;
                        gt0Var.q1(true);
                    } else {
                        gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.fj fjVar) {
        char c10;
        int i7;
        int i10;
        gt0 gt0Var = this.H;
        ArrayList arrayList = gt0Var.Q0;
        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f23968k) == gt0Var.f35606m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(fjVar.e1());
                if (!fjVar.s(null, false)) {
                    gt0Var.f35580d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(gt0Var.f35642y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35611o0;
                    int i11 = 8;
                    if (gt0Var.f35580d1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.f35638x0;
                    if (r0Var2 != null) {
                        if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        r0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.f35641y0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.f35643z0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = gt0Var.f35635w0;
                    if (r0Var5 != null) {
                        if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        r0Var5.setVisibility(i11);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        View view = (View) arrayList.get(i12);
                        org.telegram.messenger.g0.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    gt0Var.f35583e1 = false;
                    org.telegram.messenger.g0.h3(new ap0(this, 1), 20L);
                } else {
                    gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
