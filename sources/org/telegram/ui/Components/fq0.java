package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class fq0 extends gi.q {
    public final jt0 H;

    public fq0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        super(context, g2Var, j3);
        this.H = jt0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.fj fjVar) {
        char c10;
        jt0 jt0Var = this.H;
        SparseArray[] sparseArrayArr = jt0Var.f36624c1;
        if (org.telegram.messenger.fj.B0(fjVar.f23993k) == jt0Var.f36653m1) {
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
        jt0 jt0Var = this.H;
        ArrayList arrayList = jt0Var.Q0;
        SparseArray[] sparseArrayArr = jt0Var.f36624c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f23993k) == jt0Var.f36653m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        jt0Var.f36627d1++;
                    }
                    if (!jt0Var.F1) {
                        org.telegram.messenger.g0.v1(jt0Var.f36689y1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36658o0;
                        int i11 = 8;
                        if (jt0Var.f36627d1 == 0) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        q0Var.setVisibility(i7);
                        org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.f36685x0;
                        if (q0Var2 != null) {
                            if (jt0Var.getClosestTab() != 8 && jt0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            q0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = jt0Var.f36688y0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = jt0Var.f36690z0;
                        if (q0Var4 != null) {
                            q0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var5 = jt0Var.f36682w0;
                        if (q0Var5 != null) {
                            if (jt0Var.getClosestTab() != 8 && jt0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            q0Var5.setVisibility(i11);
                        }
                        jt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        jt0Var.f36630e1 = false;
                        jt0Var.q1(true);
                    } else {
                        jt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
        jt0 jt0Var = this.H;
        ArrayList arrayList = jt0Var.Q0;
        SparseArray[] sparseArrayArr = jt0Var.f36624c1;
        if (fjVar != null) {
            if (org.telegram.messenger.fj.B0(fjVar.f23993k) == jt0Var.f36653m1) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(fjVar.e1());
                if (!fjVar.s(null, false)) {
                    jt0Var.f36627d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(jt0Var.f36689y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36658o0;
                    int i11 = 8;
                    if (jt0Var.f36627d1 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    q0Var.setVisibility(i7);
                    org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.f36685x0;
                    if (q0Var2 != null) {
                        if (jt0Var.getClosestTab() != 8 && jt0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        q0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = jt0Var.f36688y0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = jt0Var.f36690z0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = jt0Var.f36682w0;
                    if (q0Var5 != null) {
                        if (jt0Var.getClosestTab() != 8 && jt0Var.getClosestTab() != 13) {
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
                    jt0Var.f36630e1 = false;
                    org.telegram.messenger.g0.h3(new cp0(this, 1), 20L);
                } else {
                    jt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
