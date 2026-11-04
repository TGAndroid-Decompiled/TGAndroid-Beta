package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class om extends org.telegram.ui.ActionBar.m0 {
    public float f48310a;
    public final wm f48311b;

    public om(wm wmVar) {
        this.f48311b = wmVar;
    }

    @Override
    public final boolean a() {
        if (this.f48311b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        wm wmVar;
        wm wmVar2 = this.f48311b;
        if (!wmVar2.f51320fd.f53841f) {
            if (wmVar2.J3 != null && wmVar2.E1 != null) {
                View currentView = wmVar2.F1.getCurrentView();
                if (currentView instanceof ym) {
                    wmVar = ((ym) currentView).f52363a;
                } else {
                    wmVar = wmVar2;
                }
                if (!wmVar.f51291dd.f53841f) {
                    wmVar.oc(true);
                    return false;
                }
                int currentPosition = wmVar2.E1.f32330a.getCurrentPosition();
                int i3 = wmVar2.G1;
                if (currentPosition != i3) {
                    wmVar2.E1.f32330a.d(i3, i3);
                    return false;
                }
            } else if (wmVar2.f51291dd.f53841f) {
                wmVar2.oc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f48311b.C3;
    }

    @Override
    public final void f() {
        int i3;
        wm wmVar = this.f48311b;
        wmVar.a8();
        if (wmVar.D3 == null && wmVar.E3 == null) {
            if (wmVar.C3) {
                wmVar.X1.getAdapter().U(null, 0, null, false, true);
                wmVar.C3 = false;
                wmVar.f51371k0.P("", true);
            }
            org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51371k0;
            if (wmVar.ca()) {
                i3 = 2131745878;
            } else {
                i3 = 2131745846;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.bd.M0(i3, null));
            wmVar.f51337h3.setVisibility(0);
            ImageView imageView = wmVar.i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            wmVar.D3 = null;
            wmVar.E3 = null;
            return;
        }
        ImageView imageView2 = wmVar.i3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i3;
        int i10;
        int i11;
        org.telegram.messenger.zi ziVar;
        TLRPC.Chat chat;
        wm wmVar = this.f48311b;
        wmVar.H3 = false;
        wmVar.Zc();
        wmVar.md();
        ImageView imageView = wmVar.f51337h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wmVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wmVar.C3) {
            wmVar.X1.getAdapter().U(null, 0, null, false, true);
            wmVar.C3 = false;
        }
        wmVar.X1.setReversed(false);
        wmVar.X1.getAdapter().f17004l0 = false;
        wmVar.A7();
        wmVar.D3 = null;
        wmVar.E3 = null;
        wmVar.J3 = null;
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51371k0;
        if (wmVar.ca()) {
            i3 = 2131745878;
        } else {
            i3 = 2131745846;
        }
        q0Var.setSearchFieldHint(org.telegram.messenger.bd.M0(i3, null));
        wmVar.f51371k0.setSearchFieldCaption(null);
        wmVar.f51305ed.a(false, true);
        wmVar.f51320fd.a(false, true);
        if (wmVar.f51237a0.h0() && TextUtils.isEmpty(wmVar.f51237a0.getSlowModeTimer()) && (((chat = wmVar.f51292e) == null || org.telegram.messenger.t3.q(chat)) && !wmVar.aa())) {
            org.telegram.ui.ActionBar.q0 q0Var2 = wmVar.f51359j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = wmVar.f51321g0;
            if (wVar != null) {
                wVar.e(0);
            }
            ar arVar = wmVar.f51307f0;
            if (arVar != null) {
                arVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = wmVar.f51432p0;
            if (q0Var3 != null && wmVar.ea) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar2 = wmVar.f51445q0;
            if (wVar2 != null && wmVar.f51317fa) {
                wVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = wmVar.f51383l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = wmVar.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var6 = wmVar.f51359j0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w wVar3 = wmVar.f51445q0;
            if (wVar3 != null && wmVar.f51317fa) {
                wVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = wmVar.f51383l0;
            if (q0Var7 != null) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var8 = wmVar.f51432p0;
            if (q0Var8 != null && wmVar.ea) {
                q0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w wVar4 = wmVar.f51321g0;
            if (wVar4 != null) {
                wVar4.e(8);
            }
            ar arVar2 = wmVar.f51307f0;
            if (arVar2 != null) {
                arVar2.b(false);
            }
        }
        if (wmVar.F1 != null) {
            if (wmVar.E1.f32330a.getCurrentPosition() != 0) {
                wmVar.E1.f32330a.d(0, 0);
                wmVar.H1 = true;
            } else {
                wmVar.F1.h.clear();
            }
        }
        int i12 = wmVar.f51325g4;
        if (i12 == 3 || i12 == 8 || ((wmVar.f51475s4 == 0 && !org.telegram.messenger.l10.z(wmVar.f51306f)) || ((ziVar = wmVar.f51397m4) != null && ziVar.N1() < 10))) {
            wmVar.f51371k0.setVisibility(8);
        }
        wmVar.f51459r0 = false;
        wmVar.zd();
        org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.f24010a1.clear();
        mediaDataController.f24013b1.clear();
        if (wmVar.f51282d4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(i10);
            a10.f22907b.a();
            a10.f22908c.a();
        }
        kg.i1 i1Var = wmVar.f51255b4;
        if (i1Var != null) {
            i1Var.f();
        }
        wmVar.hb();
        wmVar.Lc(false);
        wmVar.cd(0, true);
        wmVar.Cd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48310a, 0.0f);
        ofFloat.addUpdateListener(new nm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wmVar.f51291dd.a(false, true);
        wmVar.ld();
        wmVar.F3 = null;
        wmVar.md();
        wmVar.Zc();
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            wjVar.d.M(new cq(2));
            wjVar.h = 0L;
            wmVar.D1.g(false);
        }
        jj jjVar = wmVar.E1;
        if (jjVar != null) {
            jjVar.b(false);
        }
        wmVar.Mb(false);
    }

    @Override
    public final void i() {
        jj jjVar;
        int i3;
        wm wmVar = this.f48311b;
        boolean z10 = true;
        wmVar.H3 = true;
        wmVar.Zc();
        wmVar.md();
        if (((wmVar.f51475s4 != 0 && wmVar.f51325g4 != 3) || org.telegram.messenger.l10.z(wmVar.f51306f)) && !wmVar.Hc) {
            wmVar.La(null);
        }
        if (wmVar.f51364j5) {
            wmVar.saveKeyboardPositionBeforeTransition();
            if (!wmVar.jb) {
                Activity parentActivity = wmVar.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i3);
            }
            org.telegram.messenger.g0.i3(new xg(this, 10), 500L);
            gi.l3 l3Var = wmVar.f51509v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            gi.l3 l3Var2 = wmVar.f51537x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48310a, 1.0f);
        ofFloat.addUpdateListener(new nm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            if (wmVar.jb || !wjVar.a() || wmVar.J3 != null) {
                z10 = false;
            }
            wjVar.g(z10);
        }
        if (wmVar.J3 != null && (jjVar = wmVar.E1) != null) {
            int currentPosition = jjVar.f32330a.getCurrentPosition();
            int i10 = wmVar.G1;
            if (currentPosition != i10) {
                wmVar.E1.f32330a.d(i10, i10);
            }
        }
    }

    @Override
    public final void j(kg.l0 l0Var) {
        wm wmVar = this.f48311b;
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            wjVar.d.M(new cq(2));
            wjVar.h = 0L;
        }
        wmVar.F3 = null;
        wmVar.md();
        wmVar.Zc();
        wmVar.Mb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i3;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        wm wmVar = this.f48311b;
        boolean z10 = false;
        wmVar.jd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = wmVar.I3;
        }
        wmVar.I3 = str;
        if (!TextUtils.isEmpty(str) && (wmVar.I3.startsWith("$") || wmVar.I3.startsWith("#"))) {
            wmVar.b8();
            if (wmVar.I3.contains("@")) {
                String str2 = wmVar.I3;
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                wmVar.presentFragment(new org.telegram.ui.Components.n20(str2, e6Var));
                return;
            }
            if (wmVar.J3 == null) {
                wmVar.J3 = wmVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f48310a, 1.0f);
                ofFloat.addUpdateListener(new nm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                wj wjVar = wmVar.D1;
                if (wjVar != null) {
                    if (!wmVar.jb && wjVar.a() && wmVar.J3 == null) {
                        z10 = true;
                    }
                    wjVar.g(z10);
                }
            }
            wmVar.J3 = wmVar.I3;
            wmVar.f7(true);
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha.a(i10).c(wmVar.J3);
            wmVar.I1.f37038f.O(true);
            View currentView = wmVar.F1.getCurrentView();
            if (wmVar.f51282d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.ha.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(i11);
                a10.f22907b.a();
                a10.f22908c.a();
            }
            if (currentView instanceof ym) {
                ((ym) currentView).f52363a.nd(wmVar.J3);
            }
            wmVar.ld();
            wmVar.f51473s2.e(true, true);
            wmVar.oc(true);
            z10 = true;
        } else {
            wmVar.J3 = null;
            jj jjVar = wmVar.E1;
            if (jjVar != null) {
                jjVar.b(false);
                wmVar.ld();
            }
            jj jjVar2 = wmVar.E1;
            if (jjVar2 != null && jjVar2.f32330a.getCurrentPosition() != 0) {
                wmVar.E1.f32330a.d(0, 0);
            }
        }
        jj jjVar3 = wmVar.E1;
        if (jjVar3 != null) {
            jjVar3.b(z10);
        }
        org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
        String str3 = wmVar.I3;
        long j10 = wmVar.f51376k6;
        long j11 = wmVar.f51272c7;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        mediaDataController.X1(str3, j10, j11, i3, 0, wmVar.f51475s4, false, wmVar.D3, wmVar.E3, true, wmVar.F3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        wm wmVar = this.f48311b;
        qe.a aVar = wmVar.f51320fd;
        if (wmVar.J3 == null) {
            wmVar.oc(false);
        }
        wmVar.a8();
        if (wmVar.C3) {
            wmVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, wmVar.L6, true, true);
        } else if (wmVar.D3 == null && wmVar.E3 == null && wmVar.i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.bd.M0(2131745776, null))) {
            wmVar.i3.callOnClick();
        }
        if (wmVar.J3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f53841f) {
                if (z10) {
                    wmVar.b8();
                }
                aVar.a(z10, true);
                gi.g1 g1Var = wmVar.F1;
                if (g1Var != null) {
                    g1Var.D(0);
                }
                if (z10) {
                    wmVar.oc(true);
                }
                wmVar.Lc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f48311b.J3 == null) {
            return true;
        }
        return false;
    }
}
