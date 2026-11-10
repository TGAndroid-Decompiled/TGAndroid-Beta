package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class sp0 extends ei.r {
    public final ys0 G;

    public sp0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        super(context, f2Var, j3);
        this.G = ys0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.ij ijVar) {
        char c10;
        ys0 ys0Var = this.G;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
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
        ys0 ys0Var = this.G;
        ArrayList arrayList = ys0Var.P0;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(ijVar.e1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        ys0Var.f40658c1++;
                    }
                    if (!ys0Var.E1) {
                        org.telegram.messenger.g0.v1(ys0Var.f40719x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40690n0;
                        int i11 = 8;
                        if (ys0Var.f40658c1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        r0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.r0 r0Var2 = ys0Var.f40715w0;
                        if (r0Var2 != null) {
                            if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            r0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = ys0Var.f40718x0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = ys0Var.f40721y0;
                        if (r0Var4 != null) {
                            r0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var5 = ys0Var.f40712v0;
                        if (r0Var5 != null) {
                            if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            r0Var5.setVisibility(i11);
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
                        ys0Var.f40661d1 = false;
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
    public final boolean g(org.telegram.messenger.ij ijVar) {
        char c10;
        int i7;
        int i10;
        ys0 ys0Var = this.G;
        ArrayList arrayList = ys0Var.P0;
        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
        if (ijVar != null) {
            if (org.telegram.messenger.ij.B0(ijVar.f23266k) == ys0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(ijVar.e1());
                if (!ijVar.s(null, false)) {
                    ys0Var.f40658c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(ys0Var.f40719x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40690n0;
                    int i11 = 8;
                    if (ys0Var.f40658c1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.r0 r0Var2 = ys0Var.f40715w0;
                    if (r0Var2 != null) {
                        if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        r0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = ys0Var.f40718x0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = ys0Var.f40721y0;
                    if (r0Var4 != null) {
                        r0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var5 = ys0Var.f40712v0;
                    if (r0Var5 != null) {
                        if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
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
                    ys0Var.f40661d1 = false;
                    org.telegram.messenger.g0.i3(new ob0(this, 28), 20L);
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
        return this.G.B1;
    }
}
