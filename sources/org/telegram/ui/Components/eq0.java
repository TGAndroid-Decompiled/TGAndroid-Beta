package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class eq0 extends gi.q {
    public final it0 H;

    public eq0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        super(context, g2Var, j3);
        this.H = it0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.fj fjVar) {
        char c10;
        it0 it0Var = this.H;
        SparseArray[] sparseArrayArr = it0Var.f36101c1;
        if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
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
        it0 it0Var = this.H;
        ArrayList arrayList = it0Var.Q0;
        SparseArray[] sparseArrayArr = it0Var.f36101c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        it0Var.f36104d1++;
                    }
                    if (!it0Var.F1) {
                        org.telegram.messenger.g0.v1(it0Var.f36166y1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36135o0;
                        int i11 = 8;
                        if (it0Var.f36104d1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        q0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.f36162x0;
                        if (q0Var2 != null) {
                            if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            q0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = it0Var.f36165y0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = it0Var.f36167z0;
                        if (q0Var4 != null) {
                            q0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var5 = it0Var.f36159w0;
                        if (q0Var5 != null) {
                            if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            q0Var5.setVisibility(i11);
                        }
                        it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        it0Var.f36107e1 = false;
                        it0Var.q1(true);
                    } else {
                        it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
        it0 it0Var = this.H;
        ArrayList arrayList = it0Var.Q0;
        SparseArray[] sparseArrayArr = it0Var.f36101c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f24073k) == it0Var.f36130m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(fjVar.e1());
                if (!fjVar.s(null, false)) {
                    it0Var.f36104d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(it0Var.f36166y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36135o0;
                    int i11 = 8;
                    if (it0Var.f36104d1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    q0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.f36162x0;
                    if (q0Var2 != null) {
                        if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        q0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = it0Var.f36165y0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = it0Var.f36167z0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = it0Var.f36159w0;
                    if (q0Var5 != null) {
                        if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
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
                    it0Var.f36107e1 = false;
                    org.telegram.messenger.g0.h3(new bp0(this, 1), 20L);
                } else {
                    it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
