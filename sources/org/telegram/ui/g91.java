package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class g91 extends org.telegram.ui.Components.sj0 {
    public final i91 f45609c;

    public g91(i91 i91Var) {
        this.f45609c = i91Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        i91 i91Var = this.f45609c;
        if (i91Var.f46214o0) {
            return 0;
        }
        return i91Var.f46213n0;
    }

    @Override
    public final int d(int i3) {
        i91 i91Var = this.f45609c;
        if (i3 != i91Var.f46211k0 && i3 != i91Var.f46208h0) {
            if (i3 >= i91Var.f46209i0 && i3 < i91Var.f46210j0) {
                return 2;
            }
            if (i3 >= i91Var.f46212l0 && i3 < i91Var.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10;
        boolean z11;
        View view = d1Var.f55540a;
        i91 i91Var = this.f45609c;
        m91 m91Var = i91Var.f46222w0;
        if (d(i3) == 1) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i3 == i91Var.f46208h0) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131744004, null));
            }
            if (i3 == i91Var.f46211k0) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131745766, null));
            }
        }
        if (d(i3) == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) view;
            jaVar.setTopic((TLRPC.TL_forumTopic) i91Var.f46206f0.get(i3 - i91Var.f46209i0));
            if (i3 != i91Var.f46210j0 - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            jaVar.d = z11;
        }
        if (d(i3) == 3) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) i91Var.f46207g0.get(i3 - i91Var.f46212l0);
            j91 j91Var = (j91) view;
            if (i3 != i91Var.m0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j91Var.f46565b5 = z10;
            i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            long c2 = org.telegram.messenger.zi.c2(i10, ziVar.f26868k, true, false);
            if (c2 == 0) {
                c2 = 1;
            }
            TLRPC.TL_forumTopic f10 = m91Var.f47614s.f(m91Var.f47575a, c2);
            if (f10 == null) {
                org.telegram.messenger.a8.b("cant find topic " + c2);
                return;
            }
            j91Var.f0(f10, org.telegram.messenger.zi.B0(ziVar.f26868k), ziVar, false, false);
            j91Var.setTopicIcon(f10);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        boolean z10;
        m91 m91Var = this.f45609c.f46222w0;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    ?? j91Var = new j91(m91Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.d2) m91Var).inPreviewMode;
                    j91Var.f30519l0 = z10;
                    frameLayout = j91Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ja(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(frameLayout);
    }
}
