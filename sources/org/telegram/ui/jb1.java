package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class jb1 extends org.telegram.ui.Components.sk0 {
    public final lb1 f38486c;

    public jb1(lb1 lb1Var) {
        this.f38486c = lb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        lb1 lb1Var = this.f38486c;
        if (lb1Var.f39161n0) {
            return 0;
        }
        return lb1Var.m0;
    }

    @Override
    public final int d(int i10) {
        lb1 lb1Var = this.f38486c;
        if (i10 != lb1Var.f39158j0 && i10 != lb1Var.f39155g0) {
            if (i10 >= lb1Var.f39156h0 && i10 < lb1Var.f39157i0) {
                return 2;
            }
            if (i10 >= lb1Var.f39159k0 && i10 < lb1Var.f39160l0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        View view = c1Var.f47898a;
        lb1 lb1Var = this.f38486c;
        pb1 pb1Var = lb1Var.f39169v0;
        if (d(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == lb1Var.f39155g0) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131744019, null));
            }
            if (i10 == lb1Var.f39158j0) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131745773, null));
            }
        }
        if (d(i10) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) lb1Var.f39153e0.get(i10 - lb1Var.f39156h0));
            if (i10 != lb1Var.f39157i0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            jaVar.d = z11;
        }
        if (d(i10) == 3) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) lb1Var.f39154f0.get(i10 - lb1Var.f39159k0);
            mb1 mb1Var = (mb1) view;
            if (i10 != lb1Var.f39160l0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mb1Var.f39626a5 = z10;
            i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
            long c22 = org.telegram.messenger.jj.c2(i11, jjVar.f16337k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f7 = pb1Var.f40604s.f(pb1Var.f40566a, c22);
            if (f7 == null) {
                org.telegram.messenger.f8.b("cant find topic " + c22);
                return;
            }
            mb1Var.f0(f7, org.telegram.messenger.jj.B0(jjVar.f16337k), jjVar, false, false);
            mb1Var.setTopicIcon(f7);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        pb1 pb1Var = this.f38486c.f39169v0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? mb1Var = new mb1(pb1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.k2) pb1Var).inPreviewMode;
                    mb1Var.f23223k0 = z10;
                    frameLayout = mb1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
