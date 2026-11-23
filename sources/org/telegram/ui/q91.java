package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class q91 extends org.telegram.ui.Components.dk0 {
    public final s91 f51388c;

    public q91(s91 s91Var) {
        this.f51388c = s91Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        s91 s91Var = this.f51388c;
        if (s91Var.f52019o0) {
            return 0;
        }
        return s91Var.f52018n0;
    }

    @Override
    public final int d(int i7) {
        s91 s91Var = this.f51388c;
        if (i7 != s91Var.f52016k0 && i7 != s91Var.f52013h0) {
            if (i7 >= s91Var.f52014i0 && i7 < s91Var.f52015j0) {
                return 2;
            }
            if (i7 >= s91Var.f52017l0 && i7 < s91Var.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        boolean z11;
        View view = f1Var.f59245a;
        s91 s91Var = this.f51388c;
        w91 w91Var = s91Var.f52027w0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i7 == s91Var.f52013h0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131743749, null));
            }
            if (i7 == s91Var.f52016k0) {
                y3Var.setText(org.telegram.messenger.gd.N0(2131745560, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) view;
            maVar.setTopic((TLRPC.TL_forumTopic) s91Var.f52011f0.get(i7 - s91Var.f52014i0));
            if (i7 != s91Var.f52015j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            maVar.d = z11;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) s91Var.f52012g0.get(i7 - s91Var.f52017l0);
            t91 t91Var = (t91) view;
            if (i7 != s91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t91Var.f52317b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            long b22 = org.telegram.messenger.fj.b2(i10, fjVar.f24073k, true, false);
            if (b22 == 0) {
                b22 = 1;
            }
            TLRPC.TL_forumTopic f10 = w91Var.f53256s.f(w91Var.f53216a, b22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + b22);
                return;
            }
            t91Var.h0(f10, org.telegram.messenger.fj.B0(fjVar.f24073k), fjVar, false, false);
            t91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z10;
        w91 w91Var = this.f51388c.f52027w0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? t91Var = new t91(w91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.g2) w91Var).inPreviewMode;
                    t91Var.f32027l0 = z10;
                    frameLayout = t91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ma(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(frameLayout);
    }
}
