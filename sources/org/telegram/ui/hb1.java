package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class hb1 extends org.telegram.ui.Components.tk0 {
    public final jb1 f37777c;

    public hb1(jb1 jb1Var) {
        this.f37777c = jb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        jb1 jb1Var = this.f37777c;
        if (jb1Var.f38348n0) {
            return 0;
        }
        return jb1Var.m0;
    }

    @Override
    public final int d(int i10) {
        jb1 jb1Var = this.f37777c;
        if (i10 != jb1Var.f38345j0 && i10 != jb1Var.f38342g0) {
            if (i10 >= jb1Var.f38343h0 && i10 < jb1Var.f38344i0) {
                return 2;
            }
            if (i10 >= jb1Var.f38346k0 && i10 < jb1Var.f38347l0) {
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
        View view = c1Var.f47909a;
        jb1 jb1Var = this.f37777c;
        nb1 nb1Var = jb1Var.f38356v0;
        if (d(i10) == 1) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 == jb1Var.f38342g0) {
                z3Var.setText(org.telegram.messenger.dd.L0(2131744019, null));
            }
            if (i10 == jb1Var.f38345j0) {
                z3Var.setText(org.telegram.messenger.dd.L0(2131745773, null));
            }
        }
        if (d(i10) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) jb1Var.f38340e0.get(i10 - jb1Var.f38343h0));
            if (i10 != jb1Var.f38344i0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            jaVar.d = z11;
        }
        if (d(i10) == 3) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) jb1Var.f38341f0.get(i10 - jb1Var.f38346k0);
            kb1 kb1Var = (kb1) view;
            if (i10 != jb1Var.f38347l0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            kb1Var.f38788a5 = z10;
            i11 = ((org.telegram.ui.ActionBar.k2) nb1Var).currentAccount;
            long c22 = org.telegram.messenger.kj.c2(i11, kjVar.f16690k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f7 = nb1Var.f39835s.f(nb1Var.f39797a, c22);
            if (f7 == null) {
                org.telegram.messenger.f8.b("cant find topic " + c22);
                return;
            }
            kb1Var.f0(f7, org.telegram.messenger.kj.B0(kjVar.f16690k), kjVar, false, false);
            kb1Var.setTopicIcon(f7);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        nb1 nb1Var = this.f37777c.f38356v0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? kb1Var = new kb1(nb1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.k2) nb1Var).inPreviewMode;
                    kb1Var.f23224k0 = z10;
                    frameLayout = kb1Var;
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
