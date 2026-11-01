package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class vq0 extends uh.m {
    public final au0 G;

    public vq0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        super(context, k2Var, j10);
        this.G = au0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.kj kjVar) {
        char c10;
        au0 au0Var = this.G;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
            c10 = 0;
        } else {
            c10 = 1;
        }
        if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.kj kjVar) {
        char c10;
        int i10;
        int i11;
        au0 au0Var = this.G;
        ArrayList arrayList = au0Var.P0;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        if (kjVar != null) {
            if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(kjVar.f1(), kjVar);
                    if (!kjVar.s(null, false)) {
                        au0Var.f24506c1++;
                    }
                    if (!au0Var.E1) {
                        org.telegram.messenger.i0.v1(au0Var.f24568x1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24538n0;
                        int i12 = 8;
                        if (au0Var.f24506c1 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        t0Var.setVisibility(i10);
                        org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.f24564w0;
                        if (t0Var2 != null) {
                            if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            t0Var2.setVisibility(i11);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var3 = au0Var.f24567x0;
                        if (t0Var3 != null) {
                            t0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var4 = au0Var.f24570y0;
                        if (t0Var4 != null) {
                            t0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var5 = au0Var.f24561v0;
                        if (t0Var5 != null) {
                            if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
                                i12 = 0;
                            }
                            t0Var5.setVisibility(i12);
                        }
                        au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        au0Var.f24509d1 = false;
                        au0Var.m1(true);
                    } else {
                        au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.kj kjVar) {
        char c10;
        int i10;
        int i11;
        au0 au0Var = this.G;
        ArrayList arrayList = au0Var.P0;
        SparseArray[] sparseArrayArr = au0Var.f24502b1;
        if (kjVar != null) {
            if (org.telegram.messenger.kj.B0(kjVar.f16690k) == au0Var.l1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                sparseArrayArr[c10].remove(kjVar.f1());
                if (!kjVar.s(null, false)) {
                    au0Var.f24506c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.i0.v1(au0Var.f24568x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24538n0;
                    int i12 = 8;
                    if (au0Var.f24506c1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    t0Var.setVisibility(i10);
                    org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.f24564w0;
                    if (t0Var2 != null) {
                        if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        t0Var2.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var3 = au0Var.f24567x0;
                    if (t0Var3 != null) {
                        t0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var4 = au0Var.f24570y0;
                    if (t0Var4 != null) {
                        t0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var5 = au0Var.f24561v0;
                    if (t0Var5 != null) {
                        if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
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
                    au0Var.f24509d1 = false;
                    org.telegram.messenger.i0.h3(new vo0(this, 3), 20L);
                } else {
                    au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
