package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class o91 extends org.telegram.ui.Components.tj0 {
    public final q91 f49879c;

    public o91(q91 q91Var) {
        this.f49879c = q91Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        q91 q91Var = this.f49879c;
        if (q91Var.f50531o0) {
            return 0;
        }
        return q91Var.f50530n0;
    }

    @Override
    public final int d(int i7) {
        q91 q91Var = this.f49879c;
        if (i7 != q91Var.f50528k0 && i7 != q91Var.f50525h0) {
            if (i7 >= q91Var.f50526i0 && i7 < q91Var.f50527j0) {
                return 2;
            }
            if (i7 >= q91Var.f50529l0 && i7 < q91Var.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10;
        boolean z11;
        View view = e1Var.f58535a;
        q91 q91Var = this.f49879c;
        u91 u91Var = q91Var.f50539w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == q91Var.f50525h0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131743994, null));
            }
            if (i7 == q91Var.f50528k0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131745756, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) q91Var.f50523f0.get(i7 - q91Var.f50526i0));
            if (i7 != q91Var.f50527j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            jaVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) q91Var.f50524g0.get(i7 - q91Var.f50529l0);
            r91 r91Var = (r91) view;
            if (i7 != q91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r91Var.f50880b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
            long b22 = org.telegram.messenger.gj.b2(i10, gjVar.f23817k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = u91Var.f51873s.f(u91Var.f51834a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            r91Var.h0(f10, org.telegram.messenger.gj.B0(gjVar.f23817k), gjVar, false, false);
            r91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        u91 u91Var = this.f49879c.f50539w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? r91Var = new r91(u91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.e2) u91Var).inPreviewMode;
                    r91Var.f31596l0 = z10;
                    frameLayout = r91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(frameLayout);
    }
}
