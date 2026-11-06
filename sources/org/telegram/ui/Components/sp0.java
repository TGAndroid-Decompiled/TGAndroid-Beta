package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class sp0 extends ei.r {
    public final xs0 G;

    public sp0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        super(context, f2Var, j3);
        this.G = xs0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.ij ijVar) {
        char c10;
        xs0 xs0Var = this.G;
        SparseArray[] sparseArrayArr = xs0Var.f40340b1;
        if (org.telegram.messenger.ij.B0(ijVar.f23237k) == xs0Var.l1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.ij ijVar) {
        char c10;
        int i7;
        int i10;
        xs0 xs0Var = this.G;
        ArrayList arrayList = xs0Var.P0;
        SparseArray[] sparseArrayArr = xs0Var.f40340b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23237k) == xs0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(ijVar.f1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        xs0Var.f40344c1++;
                    }
                    if (!xs0Var.E1) {
                        org.telegram.messenger.g0.v1(xs0Var.f40405x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40376n0;
                        int i11 = 8;
                        if (xs0Var.f40344c1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        r0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.f40401w0;
                        if (r0Var2 != null) {
                            if (xs0Var.getClosestTab() != 8 && xs0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            r0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = xs0Var.f40404x0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = xs0Var.f40407y0;
                        if (r0Var4 != null) {
                            r0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var5 = xs0Var.f40398v0;
                        if (r0Var5 != null) {
                            if (xs0Var.getClosestTab() != 8 && xs0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            r0Var5.setVisibility(i11);
                        }
                        xs0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        xs0Var.f40347d1 = false;
                        xs0Var.o1(true);
                    } else {
                        xs0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
        xs0 xs0Var = this.G;
        ArrayList arrayList = xs0Var.P0;
        SparseArray[] sparseArrayArr = xs0Var.f40340b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23237k) == xs0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                sparseArrayArr[c10].remove(ijVar.f1());
                if (!ijVar.s(null, false)) {
                    xs0Var.f40344c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(xs0Var.f40405x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40376n0;
                    int i11 = 8;
                    if (xs0Var.f40344c1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.f40401w0;
                    if (r0Var2 != null) {
                        if (xs0Var.getClosestTab() != 8 && xs0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        r0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = xs0Var.f40404x0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = xs0Var.f40407y0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = xs0Var.f40398v0;
                    if (r0Var5 != null) {
                        if (xs0Var.getClosestTab() != 8 && xs0Var.getClosestTab() != 13) {
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
                    xs0Var.f40347d1 = false;
                    org.telegram.messenger.g0.i3(new ob0(this, 28), 20L);
                } else {
                    xs0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
