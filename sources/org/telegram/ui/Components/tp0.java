package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class tp0 extends ei.r {
    public final zs0 G;

    public tp0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        super(context, f2Var, j3);
        this.G = zs0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.ij ijVar) {
        char c10;
        zs0 zs0Var = this.G;
        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
        if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.ij ijVar) {
        char c10;
        int i7;
        int i10;
        zs0 zs0Var = this.G;
        ArrayList arrayList = zs0Var.P0;
        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(ijVar.e1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        zs0Var.f41066c1++;
                    }
                    if (!zs0Var.E1) {
                        org.telegram.messenger.g0.v1(zs0Var.f41127x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41098n0;
                        int i11 = 8;
                        if (zs0Var.f41066c1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        r0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.f41123w0;
                        if (r0Var2 != null) {
                            if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            r0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = zs0Var.f41126x0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = zs0Var.f41129y0;
                        if (r0Var4 != null) {
                            r0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var5 = zs0Var.f41120v0;
                        if (r0Var5 != null) {
                            if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            r0Var5.setVisibility(i11);
                        }
                        zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        zs0Var.f41069d1 = false;
                        zs0Var.q1(true);
                    } else {
                        zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.ij ijVar) {
        char c10;
        int i7;
        int i10;
        zs0 zs0Var = this.G;
        ArrayList arrayList = zs0Var.P0;
        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23262k) == zs0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(ijVar.e1());
                if (!ijVar.s(null, false)) {
                    zs0Var.f41066c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(zs0Var.f41127x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41098n0;
                    int i11 = 8;
                    if (zs0Var.f41066c1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.f41123w0;
                    if (r0Var2 != null) {
                        if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        r0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = zs0Var.f41126x0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = zs0Var.f41129y0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = zs0Var.f41120v0;
                    if (r0Var5 != null) {
                        if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
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
                    zs0Var.f41069d1 = false;
                    org.telegram.messenger.g0.i3(new pb0(this, 28), 20L);
                } else {
                    zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
