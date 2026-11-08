package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class q91 extends org.telegram.ui.Components.oj0 {
    public final s91 f49174c;

    public q91(s91 s91Var) {
        this.f49174c = s91Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        s91 s91Var = this.f49174c;
        if (s91Var.f49694n0) {
            return 0;
        }
        return s91Var.m0;
    }

    @Override
    public final int d(int i7) {
        s91 s91Var = this.f49174c;
        if (i7 != s91Var.f49691j0 && i7 != s91Var.f49688g0) {
            if (i7 >= s91Var.f49689h0 && i7 < s91Var.f49690i0) {
                return 2;
            }
            if (i7 >= s91Var.f49692k0 && i7 < s91Var.f49693l0) {
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
        View view = d1Var.f57044a;
        s91 s91Var = this.f49174c;
        w91 w91Var = s91Var.f49702v0;
        if (d(i7) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 == s91Var.f49688g0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131743997, null));
            }
            if (i7 == s91Var.f49691j0) {
                x3Var.setText(org.telegram.messenger.id.M0(2131745759, null));
            }
        }
        if (d(i7) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) s91Var.f49686e0.get(i7 - s91Var.f49689h0));
            if (i7 != s91Var.f49690i0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.d = z10;
        }
        if (d(i7) == 3) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) s91Var.f49687f0.get(i7 - s91Var.f49692k0);
            t91 t91Var = (t91) view;
            if (i7 != s91Var.f49693l0 - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            t91Var.f49984a5 = z9;
            i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            long c22 = org.telegram.messenger.ij.c2(i10, ijVar.f23262k, true, false);
            if (c22 == 0) {
                c22 = 1;
            }
            TLRPC.TL_forumTopic f10 = w91Var.f51030s.f(w91Var.f50992a, c22);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + c22);
                return;
            }
            t91Var.g0(f10, org.telegram.messenger.ij.B0(ijVar.f23262k), ijVar, false, false);
            t91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        boolean z9;
        w91 w91Var = this.f49174c.f49702v0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    ?? t91Var = new t91(w91Var, viewGroup.getContext(), true);
                    z9 = ((org.telegram.ui.ActionBar.f2) w91Var).inPreviewMode;
                    t91Var.f30439k0 = z9;
                    frameLayout = t91Var;
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
