package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
public final class tp0 extends fi.q {
    public final ws0 H;

    public tp0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        super(context, d2Var, j10);
        this.H = ws0Var;
    }

    @Override
    public final boolean c(org.telegram.messenger.zi ziVar) {
        char c2;
        ws0 ws0Var = this.H;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
            c2 = 0;
        } else {
            c2 = 1;
        }
        if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e(org.telegram.messenger.zi ziVar) {
        char c2;
        int i3;
        int i10;
        ws0 ws0Var = this.H;
        ArrayList arrayList = ws0Var.Q0;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        if (ziVar != null) {
            if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
                c2 = 0;
            } else {
                c2 = 1;
            }
            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                    if (!ziVar.s(null, false)) {
                        ws0Var.f40079d1++;
                    }
                    if (!ws0Var.F1) {
                        org.telegram.messenger.g0.v1(ws0Var.f40142y1.getParentActivity().getCurrentFocus());
                        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40111o0;
                        int i11 = 8;
                        if (ws0Var.f40079d1 == 0) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        q0Var.setVisibility(i3);
                        org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.f40138x0;
                        if (q0Var2 != null) {
                            if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
                                i10 = 0;
                            } else {
                                i10 = 8;
                            }
                            q0Var2.setVisibility(i10);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.f40141y0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.f40143z0;
                        if (q0Var4 != null) {
                            q0Var4.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var5 = ws0Var.f40135w0;
                        if (q0Var5 != null) {
                            if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
                                i11 = 0;
                            }
                            q0Var5.setVisibility(i11);
                        }
                        ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        ws0Var.f40083e1 = false;
                        ws0Var.o1(true);
                    } else {
                        ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean g(org.telegram.messenger.zi ziVar) {
        char c2;
        int i3;
        int i10;
        ws0 ws0Var = this.H;
        ArrayList arrayList = ws0Var.Q0;
        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
        if (ziVar != null) {
            if (org.telegram.messenger.zi.B0(ziVar.f26868k) == ws0Var.m1) {
                c2 = 0;
            } else {
                c2 = 1;
            }
            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                sparseArrayArr[c2].remove(ziVar.f1());
                if (!ziVar.s(null, false)) {
                    ws0Var.f40079d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(ws0Var.f40142y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40111o0;
                    int i11 = 8;
                    if (ws0Var.f40079d1 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    q0Var.setVisibility(i3);
                    org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.f40138x0;
                    if (q0Var2 != null) {
                        if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        q0Var2.setVisibility(i10);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.f40141y0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.f40143z0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = ws0Var.f40135w0;
                    if (q0Var5 != null) {
                        if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
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
                    ws0Var.f40083e1 = false;
                    org.telegram.messenger.g0.i3(new sp0(this, 0), 20L);
                } else {
                    ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
