package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mn extends org.telegram.ui.ActionBar.s0 {
    public float f41593a;
    public final un f41594b;

    public mn(un unVar) {
        this.f41594b = unVar;
    }

    @Override
    public final boolean a() {
        if (this.f41594b.G3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        un unVar;
        un unVar2 = this.f41594b;
        if (!unVar2.Xc.f19327f) {
            if (unVar2.G3 != null && unVar2.B1 != null) {
                View currentView = unVar2.C1.getCurrentView();
                if (currentView instanceof wn) {
                    unVar = ((wn) currentView).f45521a;
                } else {
                    unVar = unVar2;
                }
                if (!unVar.Vc.f19327f) {
                    unVar.Xb(true);
                    return false;
                }
                int currentPosition = unVar2.B1.f28283a.getCurrentPosition();
                int i10 = unVar2.D1;
                if (currentPosition != i10) {
                    unVar2.B1.f28283a.d(i10, i10);
                    return false;
                }
            } else if (unVar2.Vc.f19327f) {
                unVar2.Xb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f41594b.f44499z3;
    }

    @Override
    public final void f() {
        int i10;
        un unVar = this.f41594b;
        unVar.S7();
        if (unVar.A3 == null && unVar.B3 == null) {
            if (unVar.f44499z3) {
                unVar.U1.getAdapter().U(null, 0, null, false, true);
                unVar.f44499z3 = false;
                unVar.f44294j0.P("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = unVar.f44294j0;
            if (unVar.N9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            unVar.f44236e3.setVisibility(0);
            ImageView imageView = unVar.f44249f3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            unVar.A3 = null;
            unVar.B3 = null;
            return;
        }
        ImageView imageView2 = unVar.f44249f3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        MessageObject messageObject;
        un unVar = this.f41594b;
        unVar.E3 = false;
        unVar.Ic();
        unVar.Vc();
        ImageView imageView = unVar.f44236e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = unVar.f44249f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (unVar.f44499z3) {
            unVar.U1.getAdapter().U(null, 0, null, false, true);
            unVar.f44499z3 = false;
        }
        unVar.U1.setReversed(false);
        unVar.U1.getAdapter().f14122k0 = false;
        unVar.t7();
        unVar.A3 = null;
        unVar.B3 = null;
        unVar.G3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = unVar.f44294j0;
        if (unVar.N9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        unVar.f44294j0.setSearchFieldCaption(null);
        unVar.Wc.a(false, true);
        unVar.Xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = unVar.f44282i0;
        if (yVar != null && yVar.f23282o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = unVar.f44269h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = unVar.f44282i0;
            if (yVar2 != null) {
                yVar2.f(0);
                un.T3(unVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = unVar.f44233e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            yr yrVar = unVar.f44220d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = unVar.m0;
            if (w0Var3 != null && unVar.W9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = unVar.f44343n0;
            if (yVar4 != null && unVar.X9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = unVar.f44306k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (unVar.Y.h0() && TextUtils.isEmpty(unVar.Y.getSlowModeTimer()) && ((chat = unVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = unVar.f44269h0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = unVar.f44282i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = unVar.f44233e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            yr yrVar2 = unVar.f44220d0;
            if (yrVar2 != null) {
                yrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = unVar.m0;
            if (w0Var6 != null && unVar.W9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = unVar.f44343n0;
            if (yVar7 != null && unVar.X9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = unVar.f44306k0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = unVar.f44269h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = unVar.f44343n0;
            if (yVar8 != null && unVar.X9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = unVar.f44306k0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = unVar.m0;
            if (w0Var10 != null && unVar.W9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = unVar.f44282i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = unVar.f44233e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            yr yrVar3 = unVar.f44220d0;
            if (yrVar3 != null) {
                yrVar3.b(false);
            }
        }
        if (unVar.C1 != null) {
            if (unVar.B1.f28283a.getCurrentPosition() != 0) {
                unVar.B1.f28283a.d(0, 0);
                unVar.E1 = true;
            } else {
                unVar.C1.h.clear();
            }
        }
        int i13 = unVar.f44224d4;
        if (i13 == 3 || i13 == 8 || ((unVar.f44373p4 == 0 && !UserObject.isReplyUser(unVar.f44245f)) || ((messageObject = unVar.f44298j4) != null && messageObject.getRepliesCount() < 10))) {
            unVar.f44294j0.setVisibility(8);
        }
        unVar.f44356o0 = false;
        unVar.getMediaDataController().clearFoundMessageObjects();
        if (unVar.f44183a4 == 3) {
            i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        ig.n1 n1Var = unVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        unVar.Ra();
        unVar.uc(false);
        unVar.Lc(0, true);
        unVar.jd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41593a, 0.0f);
        ofFloat.addUpdateListener(new ln(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        unVar.Vc.a(false, true);
        unVar.Uc();
        unVar.C3 = null;
        unVar.Vc();
        unVar.Ic();
        sk skVar = unVar.A1;
        if (skVar != null) {
            skVar.d.M(new ar(2));
            skVar.h = 0L;
            unVar.A1.g(false);
        }
        ek ekVar = unVar.B1;
        if (ekVar != null) {
            ekVar.b(false);
        }
        unVar.vb(false);
    }

    @Override
    public final void i() {
        ek ekVar;
        int i10;
        un unVar = this.f41594b;
        boolean z10 = true;
        unVar.E3 = true;
        unVar.Ic();
        unVar.Vc();
        if (((unVar.f44373p4 != 0 && unVar.f44224d4 != 3) || UserObject.isReplyUser(unVar.f44245f)) && !unVar.zc) {
            unVar.va(null);
        }
        if (unVar.f44287i5) {
            unVar.saveKeyboardPositionBeforeTransition();
            if (!unVar.f44204bb) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ui(this, 10), 500L);
            bj bjVar = unVar.f44407s2;
            if (bjVar != null) {
                bjVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var = unVar.f44433u2;
            if (t40Var != null) {
                t40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41593a, 1.0f);
        ofFloat.addUpdateListener(new ln(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        sk skVar = unVar.A1;
        if (skVar != null) {
            if (unVar.f44204bb || !skVar.a() || unVar.G3 != null) {
                z10 = false;
            }
            skVar.g(z10);
        }
        if (unVar.G3 != null && (ekVar = unVar.B1) != null) {
            int currentPosition = ekVar.f28283a.getCurrentPosition();
            int i11 = unVar.D1;
            if (currentPosition != i11) {
                unVar.B1.f28283a.d(i11, i11);
            }
        }
    }

    @Override
    public final void j(ig.p0 p0Var) {
        un unVar = this.f41594b;
        sk skVar = unVar.A1;
        if (skVar != null) {
            skVar.d.M(new ar(2));
            skVar.h = 0L;
        }
        unVar.C3 = null;
        unVar.Vc();
        unVar.Ic();
        unVar.vb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var;
        un unVar = this.f41594b;
        boolean z10 = false;
        unVar.Sc(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = unVar.F3;
        }
        unVar.F3 = str;
        if (!TextUtils.isEmpty(str) && (unVar.F3.startsWith("$") || unVar.F3.startsWith("#"))) {
            unVar.T7();
            if (unVar.F3.contains("@")) {
                String str2 = unVar.F3;
                u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                unVar.presentFragment(new org.telegram.ui.Components.m40(str2, u6Var));
                return;
            }
            if (unVar.G3 == null) {
                unVar.G3 = unVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41593a, 1.0f);
                ofFloat.addUpdateListener(new ln(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                sk skVar = unVar.A1;
                if (skVar != null) {
                    if (!unVar.f44204bb && skVar.a() && unVar.G3 == null) {
                        z10 = true;
                    }
                    skVar.g(z10);
                }
            }
            unVar.G3 = unVar.F3;
            unVar.Y6(true);
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(unVar.G3);
            unVar.F1.f31155f.O(true);
            View currentView = unVar.C1.getCurrentView();
            if (unVar.f44183a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof wn) {
                ((wn) currentView).f45521a.Wc(unVar.G3);
            }
            unVar.Uc();
            unVar.f44371p2.e(true, true);
            unVar.Xb(true);
            z10 = true;
        } else {
            unVar.G3 = null;
            ek ekVar = unVar.B1;
            if (ekVar != null) {
                ekVar.b(false);
                unVar.Uc();
            }
            ek ekVar2 = unVar.B1;
            if (ekVar2 != null && ekVar2.f28283a.getCurrentPosition() != 0) {
                unVar.B1.f28283a.d(0, 0);
            }
        }
        ek ekVar3 = unVar.B1;
        if (ekVar3 != null) {
            ekVar3.b(z10);
        }
        MediaDataController mediaDataController = unVar.getMediaDataController();
        String str3 = unVar.F3;
        long j10 = unVar.f44252f6;
        long j11 = unVar.X6;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, unVar.f44373p4, unVar.A3, unVar.B3, unVar.C3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        un unVar = this.f41594b;
        oe.b bVar = unVar.Xc;
        if (unVar.G3 == null) {
            unVar.Xb(false);
        }
        unVar.S7();
        if (unVar.f44499z3) {
            unVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, unVar.G6, true, true);
        } else if (unVar.A3 == null && unVar.B3 == null && unVar.f44249f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            unVar.f44249f3.callOnClick();
        }
        if (unVar.G3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f19327f) {
                if (z10) {
                    unVar.T7();
                }
                bVar.a(z10, true);
                fi.h1 h1Var = unVar.C1;
                if (h1Var != null) {
                    h1Var.E(0);
                }
                if (z10) {
                    unVar.Xb(true);
                }
                unVar.uc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f41594b.G3 == null) {
            return true;
        }
        return false;
    }
}
