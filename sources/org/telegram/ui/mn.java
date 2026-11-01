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
    public float f39576a;
    public final un f39577b;

    public mn(un unVar) {
        this.f39577b = unVar;
    }

    @Override
    public final boolean a() {
        if (this.f39577b.I3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        un unVar;
        un unVar2 = this.f39577b;
        if (!unVar2.Xc.f7022f) {
            if (unVar2.I3 != null && unVar2.D1 != null) {
                View currentView = unVar2.E1.getCurrentView();
                if (currentView instanceof wn) {
                    unVar = ((wn) currentView).f43128a;
                } else {
                    unVar = unVar2;
                }
                if (!unVar.Vc.f7022f) {
                    unVar.jc(true);
                    return false;
                }
                int currentPosition = unVar2.D1.f28232a.getCurrentPosition();
                int i10 = unVar2.F1;
                if (currentPosition != i10) {
                    unVar2.D1.f28232a.d(i10, i10);
                    return false;
                }
            } else if (unVar2.Vc.f7022f) {
                unVar2.jc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f39577b.B3;
    }

    @Override
    public final void f() {
        int i10;
        un unVar = this.f39577b;
        unVar.X7();
        if (unVar.C3 == null && unVar.D3 == null) {
            if (unVar.B3) {
                unVar.W1.getAdapter().U(null, 0, null, false, true);
                unVar.B3 = false;
                unVar.f42102j0.P("", true);
            }
            org.telegram.ui.ActionBar.t0 t0Var = unVar.f42102j0;
            if (unVar.X9()) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var.setSearchFieldHint(org.telegram.messenger.dd.L0(i10, null));
            unVar.f42070g3.setVisibility(0);
            ImageView imageView = unVar.f42081h3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            unVar.C3 = null;
            unVar.D3 = null;
            return;
        }
        ImageView imageView2 = unVar.f42081h3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i10;
        int i11;
        int i12;
        org.telegram.messenger.kj kjVar;
        TLRPC.Chat chat;
        un unVar = this.f39577b;
        unVar.G3 = false;
        unVar.Uc();
        unVar.hd();
        ImageView imageView = unVar.f42070g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = unVar.f42081h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (unVar.B3) {
            unVar.W1.getAdapter().U(null, 0, null, false, true);
            unVar.B3 = false;
        }
        unVar.W1.setReversed(false);
        unVar.W1.getAdapter().f55675k0 = false;
        unVar.y7();
        unVar.C3 = null;
        unVar.D3 = null;
        unVar.I3 = null;
        org.telegram.ui.ActionBar.t0 t0Var = unVar.f42102j0;
        if (unVar.X9()) {
            i10 = 2131745885;
        } else {
            i10 = 2131745853;
        }
        t0Var.setSearchFieldHint(org.telegram.messenger.dd.L0(i10, null));
        unVar.f42102j0.setSearchFieldCaption(null);
        unVar.Wc.a(false, true);
        unVar.Xc.a(false, true);
        if (unVar.Z.g0() && TextUtils.isEmpty(unVar.Z.getSlowModeTimer()) && (((chat = unVar.e) == null || org.telegram.messenger.w3.q(chat)) && !unVar.V9())) {
            org.telegram.ui.ActionBar.t0 t0Var2 = unVar.f42090i0;
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = unVar.f42055f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cs csVar = unVar.f42043e0;
            if (csVar != null) {
                csVar.b(true);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = unVar.f42165o0;
            if (t0Var3 != null && unVar.f42040da) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = unVar.f42178p0;
            if (xVar2 != null && unVar.f42052ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = unVar.f42115k0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var5 = unVar.f42128l0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.t0 t0Var6 = unVar.f42090i0;
            if (t0Var6 != null) {
                t0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = unVar.f42178p0;
            if (xVar3 != null && unVar.f42052ea) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var7 = unVar.f42115k0;
            if (t0Var7 != null) {
                t0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var8 = unVar.f42165o0;
            if (t0Var8 != null && unVar.f42040da) {
                t0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = unVar.f42055f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            cs csVar2 = unVar.f42043e0;
            if (csVar2 != null) {
                csVar2.b(false);
            }
        }
        if (unVar.E1 != null) {
            if (unVar.D1.f28232a.getCurrentPosition() != 0) {
                unVar.D1.f28232a.d(0, 0);
                unVar.G1 = true;
            } else {
                unVar.E1.h.clear();
            }
        }
        int i13 = unVar.f42059f4;
        if (i13 == 3 || i13 == 8 || ((unVar.f42205r4 == 0 && !org.telegram.messenger.i20.z(unVar.f42054f)) || ((kjVar = unVar.l4) != null && kjVar.N1() < 10))) {
            unVar.f42102j0.setVisibility(8);
        }
        unVar.f42189q0 = false;
        unVar.ud();
        org.telegram.messenger.vi mediaDataController = unVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.f18635a1.clear();
        if (unVar.f42021c4 == 3) {
            i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.pa.a(i12).b(3).a();
        } else {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.pa a2 = org.telegram.messenger.pa.a(i11);
            a2.f17578b.a();
            a2.f17579c.a();
        }
        zf.b1 b1Var = unVar.f41992a4;
        if (b1Var != null) {
            b1Var.f();
        }
        unVar.cb();
        unVar.Gc(false);
        unVar.Xc(0, true);
        unVar.xd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39576a, 0.0f);
        ofFloat.addUpdateListener(new ln(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        unVar.Vc.a(false, true);
        unVar.gd();
        unVar.E3 = null;
        unVar.hd();
        unVar.Uc();
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
        unVar.Hb(false);
    }

    @Override
    public final void i() {
        kk kkVar;
        int i10;
        un unVar = this.f39577b;
        boolean z10 = true;
        unVar.G3 = true;
        unVar.Uc();
        unVar.hd();
        if (((unVar.f42205r4 != 0 && unVar.f42059f4 != 3) || org.telegram.messenger.i20.z(unVar.f42054f)) && !unVar.f42314zc) {
            unVar.Ga(null);
        }
        if (unVar.f42095i5) {
            unVar.saveKeyboardPositionBeforeTransition();
            if (!unVar.f42100ib) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                org.telegram.messenger.i0.Z2(parentActivity, i10);
            }
            org.telegram.messenger.i0.h3(new rh(this, 11), 500L);
            ij ijVar = unVar.f42242u2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.q30 q30Var = unVar.f42267w2;
            if (q30Var != null) {
                q30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39576a, 1.0f);
        ofFloat.addUpdateListener(new ln(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            if (unVar.f42100ib || !wkVar.a() || unVar.I3 != null) {
                z10 = false;
            }
            wkVar.g(z10);
        }
        if (unVar.I3 != null && (kkVar = unVar.D1) != null) {
            int currentPosition = kkVar.f28232a.getCurrentPosition();
            int i11 = unVar.F1;
            if (currentPosition != i11) {
                unVar.D1.f28232a.d(i11, i11);
            }
        }
    }

    @Override
    public final void j(zf.e0 e0Var) {
        un unVar = this.f39577b;
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.d.M(new fr(2));
            wkVar.h = 0L;
        }
        unVar.E3 = null;
        unVar.hd();
        unVar.Uc();
        unVar.Hb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.f39577b;
        boolean z10 = false;
        unVar.ed(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = unVar.H3;
        }
        unVar.H3 = str;
        if (!TextUtils.isEmpty(str) && (unVar.H3.startsWith("$") || unVar.H3.startsWith("#"))) {
            unVar.Y7();
            if (unVar.H3.contains("@")) {
                String str2 = unVar.H3;
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                unVar.presentFragment(new org.telegram.ui.Components.j30(str2, p6Var));
                return;
            }
            if (unVar.I3 == null) {
                unVar.I3 = unVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39576a, 1.0f);
                ofFloat.addUpdateListener(new ln(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                wk wkVar = unVar.C1;
                if (wkVar != null) {
                    if (!unVar.f42100ib && wkVar.a() && unVar.I3 == null) {
                        z10 = true;
                    }
                    wkVar.g(z10);
                }
            }
            unVar.I3 = unVar.H3;
            unVar.d7(true);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.pa.a(i11).c(unVar.I3);
            unVar.H1.f28041f.O(true);
            View currentView = unVar.E1.getCurrentView();
            if (unVar.f42021c4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.pa.a(i13).b(3).a();
            } else {
                i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.pa a2 = org.telegram.messenger.pa.a(i12);
                a2.f17578b.a();
                a2.f17579c.a();
            }
            if (currentView instanceof wn) {
                ((wn) currentView).f43128a.id(unVar.I3);
            }
            unVar.gd();
            unVar.f42203r2.e(true, true);
            unVar.jc(true);
            z10 = true;
        } else {
            unVar.I3 = null;
            kk kkVar = unVar.D1;
            if (kkVar != null) {
                kkVar.b(false);
                unVar.gd();
            }
            kk kkVar2 = unVar.D1;
            if (kkVar2 != null && kkVar2.f28232a.getCurrentPosition() != 0) {
                unVar.D1.f28232a.d(0, 0);
            }
        }
        kk kkVar3 = unVar.D1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        org.telegram.messenger.vi mediaDataController = unVar.getMediaDataController();
        String str3 = unVar.H3;
        long j10 = unVar.f42108j6;
        long j11 = unVar.f42010b7;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        mediaDataController.X1(str3, j10, j11, i10, 0, unVar.f42205r4, false, unVar.C3, unVar.D3, true, unVar.E3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        un unVar = this.f39577b;
        fe.b bVar = unVar.Xc;
        if (unVar.I3 == null) {
            unVar.jc(false);
        }
        unVar.X7();
        if (unVar.B3) {
            unVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, unVar.K6, true, true);
        } else if (unVar.C3 == null && unVar.D3 == null && unVar.f42081h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.dd.L0(2131745783, null))) {
            unVar.f42081h3.callOnClick();
        }
        if (unVar.I3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f7022f) {
                if (z10) {
                    unVar.Y7();
                }
                bVar.a(z10, true);
                hk hkVar = unVar.E1;
                if (hkVar != null) {
                    hkVar.E(0);
                }
                if (z10) {
                    unVar.jc(true);
                }
                unVar.Gc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f39577b.I3 == null) {
            return true;
        }
        return false;
    }
}
