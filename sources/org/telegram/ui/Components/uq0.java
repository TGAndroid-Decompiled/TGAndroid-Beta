package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class uq0 extends uh.m {
    public final zt0 G;

    public uq0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        super(context, k2Var, j10);
        this.G = zt0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.jj jjVar) {
        char c10;
        zt0 zt0Var = this.G;
        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
        if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.jj jjVar) {
        char c10;
        int i10;
        int i11;
        zt0 zt0Var = this.G;
        ArrayList arrayList = zt0Var.P0;
        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
        if (jjVar != null) {
            if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                    if (!jjVar.s(null, false)) {
                        zt0Var.f33178c1++;
                    }
                    if (!zt0Var.E1) {
                        org.telegram.messenger.i0.v1(zt0Var.f33240x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33210n0;
                        int i12 = 8;
                        if (zt0Var.f33178c1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        t0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.f33236w0;
                        if (t0Var2 != null) {
                            if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            t0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.f33239x0;
                        if (t0Var3 != null) {
                            t0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.f33242y0;
                        if (t0Var4 != null) {
                            t0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var5 = zt0Var.f33233v0;
                        if (t0Var5 != null) {
                            if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            t0Var5.setVisibility(i12);
                        }
                        zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            View view = (View) arrayList.get(i13);
                            org.telegram.messenger.i0.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        zt0Var.f33181d1 = false;
                        zt0Var.l1(true);
                    } else {
                        zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.jj jjVar) {
        char c10;
        int i10;
        int i11;
        zt0 zt0Var = this.G;
        ArrayList arrayList = zt0Var.P0;
        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
        if (jjVar != null) {
            if (org.telegram.messenger.jj.B0(jjVar.f16337k) == zt0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                sparseArrayArr[c10].remove(jjVar.f1());
                if (!jjVar.s(null, false)) {
                    zt0Var.f33178c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.i0.v1(zt0Var.f33240x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33210n0;
                    int i12 = 8;
                    if (zt0Var.f33178c1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    t0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.f33236w0;
                    if (t0Var2 != null) {
                        if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        t0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.f33239x0;
                    if (t0Var3 != null) {
                        t0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.f33242y0;
                    if (t0Var4 != null) {
                        t0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var5 = zt0Var.f33233v0;
                    if (t0Var5 != null) {
                        if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                            i12 = 0;
                        }
                        t0Var5.setVisibility(i12);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        View view = (View) arrayList.get(i13);
                        org.telegram.messenger.i0.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    zt0Var.f33181d1 = false;
                    org.telegram.messenger.i0.h3(new uo0(this, 3), 20L);
                } else {
                    zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getStartedTrackingX() {
        return this.G.B1;
    }
}
