package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class vp0 extends gi.q {
    public final ys0 H;

    public vp0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, long j3) {
        super(context, e2Var, j3);
        this.H = ys0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.gj gjVar) {
        char c10;
        ys0 ys0Var = this.H;
        SparseArray[] sparseArrayArr = ys0Var.f42085c1;
        if (org.telegram.messenger.gj.B0(gjVar.f23817k) == ys0Var.f42114m1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.gj gjVar) {
        char c10;
        int i7;
        int i10;
        ys0 ys0Var = this.H;
        ArrayList arrayList = ys0Var.Q0;
        SparseArray[] sparseArrayArr = ys0Var.f42085c1;
        if (gjVar != null) {
            if (org.telegram.messenger.gj.B0(gjVar.f23817k) == ys0Var.f42114m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
                        ys0Var.f42088d1++;
                    }
                    if (!ys0Var.F1) {
                        org.telegram.messenger.g0.v1(ys0Var.f42150y1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42119o0;
                        int i11 = 8;
                        if (ys0Var.f42088d1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        q0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.f42146x0;
                        if (q0Var2 != null) {
                            if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            q0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.f42149y0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.f42151z0;
                        if (q0Var4 != null) {
                            q0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var5 = ys0Var.f42143w0;
                        if (q0Var5 != null) {
                            if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            q0Var5.setVisibility(i11);
                        }
                        ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        ys0Var.f42091e1 = false;
                        ys0Var.q1(true);
                    } else {
                        ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.gj gjVar) {
        char c10;
        int i7;
        int i10;
        ys0 ys0Var = this.H;
        ArrayList arrayList = ys0Var.Q0;
        SparseArray[] sparseArrayArr = ys0Var.f42085c1;
        if (gjVar != null) {
            if (org.telegram.messenger.gj.B0(gjVar.f23817k) == ys0Var.f42114m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(gjVar.e1());
                if (!gjVar.s(null, false)) {
                    ys0Var.f42088d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(ys0Var.f42150y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42119o0;
                    int i11 = 8;
                    if (ys0Var.f42088d1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    q0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.f42146x0;
                    if (q0Var2 != null) {
                        if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        q0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.f42149y0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.f42151z0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = ys0Var.f42143w0;
                    if (q0Var5 != null) {
                        if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        q0Var5.setVisibility(i11);
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
                    ys0Var.f42091e1 = false;
                    org.telegram.messenger.g0.i3(new ro0(this, 1), 20L);
                } else {
                    ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
