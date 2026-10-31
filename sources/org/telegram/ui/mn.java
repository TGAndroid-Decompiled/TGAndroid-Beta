package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mn extends org.telegram.ui.ActionBar.p0 {
    public float f39736a;
    public final un f39737b;

    public mn(un unVar) {
        this.f39737b = unVar;
    }

    @Override
    public final boolean a() {
        if (this.f39737b.I3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        un unVar;
        un unVar2 = this.f39737b;
        if (!unVar2.Wc.f7021f) {
            if (unVar2.I3 != null && unVar2.D1 != null) {
                View currentView = unVar2.E1.getCurrentView();
                if (currentView instanceof wn) {
                    unVar = ((wn) currentView).f43336a;
                } else {
                    unVar = unVar2;
                }
                if (!unVar.Uc.f7021f) {
                    unVar.ec(true);
                    return false;
                }
                int currentPosition = unVar2.D1.f28147a.getCurrentPosition();
                int i10 = unVar2.F1;
                if (currentPosition != i10) {
                    unVar2.D1.f28147a.d(i10, i10);
                    return false;
                }
            } else if (unVar2.Uc.f7021f) {
                unVar2.ec(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f39737b.B3;
    }

    @Override
    public final void f() {
        int i10;
        un unVar = this.f39737b;
        unVar.T7();
        if (unVar.C3 == null && unVar.D3 == null) {
            if (unVar.B3) {
                unVar.W1.getAdapter().U(null, 0, null, false, true);
                unVar.B3 = false;
                unVar.f42291j0.P("", true);
            }
            org.telegram.ui.ActionBar.t0 t0Var = unVar.f42291j0;
            if (unVar.S9()) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var.setSearchFieldHint(org.telegram.messenger.cd.L0(i10, null));
            unVar.f42259g3.setVisibility(0);
            ImageView imageView = unVar.f42270h3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            unVar.C3 = null;
            unVar.D3 = null;
            return;
        }
        ImageView imageView2 = unVar.f42270h3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.jj jjVar;
        TLRPC.Chat chat;
        un unVar = this.f39737b;
        unVar.G3 = false;
        unVar.Pc();
        unVar.cd();
        ImageView imageView = unVar.f42259g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = unVar.f42270h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (unVar.B3) {
            unVar.W1.getAdapter().U(null, 0, null, false, true);
            unVar.B3 = false;
        }
        unVar.W1.setReversed(false);
        unVar.W1.getAdapter().f55657k0 = false;
        unVar.u7();
        unVar.C3 = null;
        unVar.D3 = null;
        unVar.I3 = null;
        org.telegram.ui.ActionBar.t0 t0Var = unVar.f42291j0;
        if (unVar.S9()) {
            i10 = 2131745885;
        } else {
            i10 = 2131745853;
        }
        t0Var.setSearchFieldHint(org.telegram.messenger.cd.L0(i10, null));
        unVar.f42291j0.setSearchFieldCaption(null);
        unVar.Vc.a(false, true);
        unVar.Wc.a(false, true);
        if (unVar.Z.g0() && TextUtils.isEmpty(unVar.Z.getSlowModeTimer()) && (((chat = unVar.e) == null || org.telegram.messenger.w3.q(chat)) && !unVar.Q9())) {
            org.telegram.ui.ActionBar.t0 t0Var2 = unVar.f42279i0;
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = unVar.f42244f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cs csVar = unVar.f42232e0;
            if (csVar != null) {
                csVar.b(true);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = unVar.f42354o0;
            if (t0Var3 != null && unVar.f42229da) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = unVar.f42367p0;
            if (xVar2 != null && unVar.f42241ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = unVar.f42304k0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var5 = unVar.f42317l0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.t0 t0Var6 = unVar.f42279i0;
            if (t0Var6 != null) {
                t0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = unVar.f42367p0;
            if (xVar3 != null && unVar.f42241ea) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var7 = unVar.f42304k0;
            if (t0Var7 != null) {
                t0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var8 = unVar.f42354o0;
            if (t0Var8 != null && unVar.f42229da) {
                t0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = unVar.f42244f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            cs csVar2 = unVar.f42232e0;
            if (csVar2 != null) {
                csVar2.b(false);
            }
        }
        if (unVar.E1 != null) {
            if (unVar.D1.f28147a.getCurrentPosition() != 0) {
                unVar.D1.f28147a.d(0, 0);
                unVar.G1 = true;
            } else {
                unVar.E1.h.clear();
            }
        }
        int i13 = unVar.f42248f4;
        if (i13 == 3 || i13 == 8 || ((unVar.f42394r4 == 0 && !org.telegram.messenger.h20.z(unVar.f42243f)) || ((jjVar = unVar.l4) != null && jjVar.N1() < 10))) {
            unVar.f42291j0.setVisibility(8);
        }
        unVar.f42378q0 = false;
        unVar.pd();
        org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.f18306a1.clear();
        if (unVar.f42210c4 == 3) {
            i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa.a(i12).b(3).a();
        } else {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(i11);
            a2.f17245b.a();
            a2.f17246c.a();
        }
        zf.b1 b1Var = unVar.f42182a4;
        if (b1Var != null) {
            b1Var.f();
        }
        unVar.Xa();
        unVar.Bc(false);
        unVar.Sc(0, true);
        unVar.sd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39736a, 0.0f);
        ofFloat.addUpdateListener(new ln(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        unVar.Uc.a(false, true);
        unVar.bd();
        unVar.E3 = null;
        unVar.cd();
        unVar.Pc();
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.d.M(new fr(2));
            wkVar.h = 0L;
            unVar.C1.g(false);
        }
        kk kkVar = unVar.D1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        unVar.Cb(false);
    }

    @Override
    public final void i() {
        kk kkVar;
        int i10;
        un unVar = this.f39737b;
        boolean z10 = true;
        unVar.G3 = true;
        unVar.Pc();
        unVar.cd();
        if (((unVar.f42394r4 != 0 && unVar.f42248f4 != 3) || org.telegram.messenger.h20.z(unVar.f42243f)) && !unVar.f42491yc) {
            unVar.Ba(null);
        }
        if (unVar.f42284i5) {
            unVar.saveKeyboardPositionBeforeTransition();
            if (!unVar.f42289ib) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                org.telegram.messenger.i0.Z2(parentActivity, i10);
            }
            org.telegram.messenger.i0.h3(new rh(this, 11), 500L);
            ij ijVar = unVar.f42431u2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.q30 q30Var = unVar.f42456w2;
            if (q30Var != null) {
                q30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39736a, 1.0f);
        ofFloat.addUpdateListener(new ln(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            if (unVar.f42289ib || !wkVar.a() || unVar.I3 != null) {
                z10 = false;
            }
            wkVar.g(z10);
        }
        if (unVar.I3 != null && (kkVar = unVar.D1) != null) {
            int currentPosition = kkVar.f28147a.getCurrentPosition();
            int i11 = unVar.F1;
            if (currentPosition != i11) {
                unVar.D1.f28147a.d(i11, i11);
            }
        }
    }

    @Override
    public final void j(zf.e0 e0Var) {
        un unVar = this.f39737b;
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.d.M(new fr(2));
            wkVar.h = 0L;
        }
        unVar.E3 = null;
        unVar.cd();
        unVar.Pc();
        unVar.Cb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.f39737b;
        boolean z10 = false;
        unVar.Zc(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = unVar.H3;
        }
        unVar.H3 = str;
        if (!TextUtils.isEmpty(str) && (unVar.H3.startsWith("$") || unVar.H3.startsWith("#"))) {
            unVar.U7();
            if (unVar.H3.contains("@")) {
                String str2 = unVar.H3;
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                unVar.presentFragment(new org.telegram.ui.Components.j30(str2, p6Var));
                return;
            }
            if (unVar.I3 == null) {
                unVar.I3 = unVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39736a, 1.0f);
                ofFloat.addUpdateListener(new ln(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                wk wkVar = unVar.C1;
                if (wkVar != null) {
                    if (!unVar.f42289ib && wkVar.a() && unVar.I3 == null) {
                        z10 = true;
                    }
                    wkVar.g(z10);
                }
            }
            unVar.I3 = unVar.H3;
            unVar.Z6(true);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa.a(i11).c(unVar.I3);
            unVar.H1.f28004f.O(true);
            View currentView = unVar.E1.getCurrentView();
            if (unVar.f42210c4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.oa.a(i13).b(3).a();
            } else {
                i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(i12);
                a2.f17245b.a();
                a2.f17246c.a();
            }
            if (currentView instanceof wn) {
                ((wn) currentView).f43336a.dd(unVar.I3);
            }
            unVar.bd();
            unVar.f42392r2.e(true, true);
            unVar.ec(true);
            z10 = true;
        } else {
            unVar.I3 = null;
            kk kkVar = unVar.D1;
            if (kkVar != null) {
                kkVar.b(false);
                unVar.bd();
            }
            kk kkVar2 = unVar.D1;
            if (kkVar2 != null && kkVar2.f28147a.getCurrentPosition() != 0) {
                unVar.D1.f28147a.d(0, 0);
            }
        }
        kk kkVar3 = unVar.D1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
        String str3 = unVar.H3;
        long j10 = unVar.f42297j6;
        long j11 = unVar.f42199b7;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        mediaDataController.X1(str3, j10, j11, i10, 0, unVar.f42394r4, false, unVar.C3, unVar.D3, true, unVar.E3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        un unVar = this.f39737b;
        fe.b bVar = unVar.Wc;
        if (unVar.I3 == null) {
            unVar.ec(false);
        }
        unVar.T7();
        if (unVar.B3) {
            unVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, unVar.K6, true, true);
        } else if (unVar.C3 == null && unVar.D3 == null && unVar.f42270h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.cd.L0(2131745783, null))) {
            unVar.f42270h3.callOnClick();
        }
        if (unVar.I3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f7021f) {
                if (z10) {
                    unVar.U7();
                }
                bVar.a(z10, true);
                hk hkVar = unVar.E1;
                if (hkVar != null) {
                    hkVar.E(0);
                }
                if (z10) {
                    unVar.ec(true);
                }
                unVar.Bc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f39737b.I3 == null) {
            return true;
        }
        return false;
    }
}
