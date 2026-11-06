package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class p91 extends org.telegram.ui.Components.oj0 {
    public final r91 f48731c;

    public p91(r91 r91Var) {
        this.f48731c = r91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        r91 r91Var = this.f48731c;
        if (r91Var.f49407n0) {
            return 0;
        }
        return r91Var.m0;
    }

    @Override
    public final int d(int i7) {
        r91 r91Var = this.f48731c;
        if (i7 != r91Var.f49404j0 && i7 != r91Var.f49401g0) {
            if (i7 >= r91Var.f49402h0 && i7 < r91Var.f49403i0) {
                return 2;
            }
            if (i7 >= r91Var.f49405k0 && i7 < r91Var.f49406l0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10;
        boolean z10;
        View view = d1Var.f56927a;
        r91 r91Var = this.f48731c;
        v91 v91Var = r91Var.f49415v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == r91Var.f49401g0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131743995, null));
            }
            if (i7 == r91Var.f49404j0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131745757, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) r91Var.f49399e0.get(i7 - r91Var.f49402h0));
            if (i7 != r91Var.f49403i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.d = z10;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) r91Var.f49400f0.get(i7 - r91Var.f49405k0);
            s91 s91Var = (s91) view;
            if (i7 != r91Var.f49406l0 - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            s91Var.f49684a5 = z9;
            i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            long c22 = org.telegram.messenger.ij.c2(i10, ijVar.f23237k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f10 = v91Var.f50657s.f(v91Var.f50619a, c22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + c22);
                return;
            }
            s91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.f23237k), ijVar, false, false);
            s91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        v91 v91Var = this.f48731c.f49415v0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? s91Var = new s91(v91Var, viewGroup.getContext(), true);
                    z9 = ((org.telegram.ui.ActionBar.f2) v91Var).inPreviewMode;
                    s91Var.f30434k0 = z9;
                    frameLayout = s91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(frameLayout);
    }
}
