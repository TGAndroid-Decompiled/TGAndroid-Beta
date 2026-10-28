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
public final class on extends org.telegram.ui.ActionBar.s0 {
    public float f42125a;
    public final wn f42126b;

    public on(wn wnVar) {
        this.f42126b = wnVar;
    }

    @Override
    public final boolean a() {
        if (this.f42126b.G3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        wn wnVar;
        wn wnVar2 = this.f42126b;
        if (!wnVar2.f45071bd.f19326f) {
            if (wnVar2.G3 != null && wnVar2.B1 != null) {
                View currentView = wnVar2.C1.getCurrentView();
                if (currentView instanceof yn) {
                    wnVar = ((yn) currentView).f46049a;
                } else {
                    wnVar = wnVar2;
                }
                if (!wnVar.Zc.f19326f) {
                    wnVar.bc(true);
                    return false;
                }
                int currentPosition = wnVar2.B1.f28710a.getCurrentPosition();
                int i10 = wnVar2.D1;
                if (currentPosition != i10) {
                    wnVar2.B1.f28710a.d(i10, i10);
                    return false;
                }
            } else if (wnVar2.Zc.f19326f) {
                wnVar2.bc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.f42126b.f45367z3;
    }

    @Override
    public final void f() {
        int i10;
        wn wnVar = this.f42126b;
        wnVar.U7();
        if (wnVar.A3 == null && wnVar.B3 == null) {
            if (wnVar.f45367z3) {
                wnVar.U1.getAdapter().U(null, 0, null, false, true);
                wnVar.f45367z3 = false;
                wnVar.f45162j0.P("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45162j0;
            if (wnVar.Q9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            wnVar.f45104e3.setVisibility(0);
            ImageView imageView = wnVar.f45117f3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            wnVar.A3 = null;
            wnVar.B3 = null;
            return;
        }
        ImageView imageView2 = wnVar.f45117f3;
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
        wn wnVar = this.f42126b;
        wnVar.E3 = false;
        wnVar.Mc();
        wnVar.Zc();
        ImageView imageView = wnVar.f45104e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wnVar.f45117f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wnVar.f45367z3) {
            wnVar.U1.getAdapter().U(null, 0, null, false, true);
            wnVar.f45367z3 = false;
        }
        wnVar.U1.setReversed(false);
        wnVar.U1.getAdapter().f14121k0 = false;
        wnVar.v7();
        wnVar.A3 = null;
        wnVar.B3 = null;
        wnVar.G3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45162j0;
        if (wnVar.Q9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        wnVar.f45162j0.setSearchFieldCaption(null);
        wnVar.ad.a(false, true);
        wnVar.f45071bd.a(false, true);
        org.telegram.ui.ActionBar.y yVar = wnVar.f45150i0;
        if (yVar != null && yVar.f23283o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = wnVar.f45137h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = wnVar.f45150i0;
            if (yVar2 != null) {
                yVar2.f(0);
                wn.U3(wnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = wnVar.f45101e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            as asVar = wnVar.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = wnVar.m0;
            if (w0Var3 != null && wnVar.f45054aa) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = wnVar.f45211n0;
            if (yVar4 != null && wnVar.f45068ba) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = wnVar.f45174k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (wnVar.Y.g0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer()) && ((chat = wnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = wnVar.f45137h0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = wnVar.f45150i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = wnVar.f45101e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            as asVar2 = wnVar.f45087d0;
            if (asVar2 != null) {
                asVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = wnVar.m0;
            if (w0Var6 != null && wnVar.f45054aa) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = wnVar.f45211n0;
            if (yVar7 != null && wnVar.f45068ba) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = wnVar.f45174k0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = wnVar.f45137h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = wnVar.f45211n0;
            if (yVar8 != null && wnVar.f45068ba) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = wnVar.f45174k0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = wnVar.m0;
            if (w0Var10 != null && wnVar.f45054aa) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = wnVar.f45150i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = wnVar.f45101e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            as asVar3 = wnVar.f45087d0;
            if (asVar3 != null) {
                asVar3.b(false);
            }
        }
        if (wnVar.C1 != null) {
            if (wnVar.B1.f28710a.getCurrentPosition() != 0) {
                wnVar.B1.f28710a.d(0, 0);
                wnVar.E1 = true;
            } else {
                wnVar.C1.h.clear();
            }
        }
        int i13 = wnVar.f45091d4;
        if (i13 == 3 || i13 == 8 || ((wnVar.f45241p4 == 0 && !UserObject.isReplyUser(wnVar.f45113f)) || ((messageObject = wnVar.f45166j4) != null && messageObject.getRepliesCount() < 10))) {
            wnVar.f45162j0.setVisibility(8);
        }
        wnVar.f45224o0 = false;
        wnVar.getMediaDataController().clearFoundMessageObjects();
        if (wnVar.f45048a4 == 3) {
            i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        ig.n1 n1Var = wnVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        wnVar.Ua();
        wnVar.yc(false);
        wnVar.Pc(0, true);
        wnVar.nd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42125a, 0.0f);
        ofFloat.addUpdateListener(new nn(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wnVar.Zc.a(false, true);
        wnVar.Yc();
        wnVar.C3 = null;
        wnVar.Zc();
        wnVar.Mc();
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            ukVar.d.M(new cr(2));
            ukVar.h = 0L;
            wnVar.A1.g(false);
        }
        gk gkVar = wnVar.B1;
        if (gkVar != null) {
            gkVar.b(false);
        }
        wnVar.zb(false);
    }

    @Override
    public final void i() {
        gk gkVar;
        int i10;
        wn wnVar = this.f42126b;
        boolean z10 = true;
        wnVar.E3 = true;
        wnVar.Mc();
        wnVar.Zc();
        if (((wnVar.f45241p4 != 0 && wnVar.f45091d4 != 3) || UserObject.isReplyUser(wnVar.f45113f)) && !wnVar.Dc) {
            wnVar.ya(null);
        }
        if (wnVar.f45155i5) {
            wnVar.saveKeyboardPositionBeforeTransition();
            if (!wnVar.f45124fb) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new xi(this, 10), 500L);
            ej ejVar = wnVar.f45275s2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var = wnVar.f45301u2;
            if (t40Var != null) {
                t40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42125a, 1.0f);
        ofFloat.addUpdateListener(new nn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            if (wnVar.f45124fb || !ukVar.a() || wnVar.G3 != null) {
                z10 = false;
            }
            ukVar.g(z10);
        }
        if (wnVar.G3 != null && (gkVar = wnVar.B1) != null) {
            int currentPosition = gkVar.f28710a.getCurrentPosition();
            int i11 = wnVar.D1;
            if (currentPosition != i11) {
                wnVar.B1.f28710a.d(i11, i11);
            }
        }
    }

    @Override
    public final void j(ig.p0 p0Var) {
        wn wnVar = this.f42126b;
        uk ukVar = wnVar.A1;
        if (ukVar != null) {
            ukVar.d.M(new cr(2));
            ukVar.h = 0L;
        }
        wnVar.C3 = null;
        wnVar.Zc();
        wnVar.Mc();
        wnVar.zb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var;
        wn wnVar = this.f42126b;
        boolean z10 = false;
        wnVar.Wc(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = wnVar.F3;
        }
        wnVar.F3 = str;
        if (!TextUtils.isEmpty(str) && (wnVar.F3.startsWith("$") || wnVar.F3.startsWith("#"))) {
            wnVar.V7();
            if (wnVar.F3.contains("@")) {
                String str2 = wnVar.F3;
                u6Var = ((org.telegram.ui.ActionBar.r2) wnVar).resourceProvider;
                wnVar.presentFragment(new org.telegram.ui.Components.m40(str2, u6Var));
                return;
            }
            if (wnVar.G3 == null) {
                wnVar.G3 = wnVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42125a, 1.0f);
                ofFloat.addUpdateListener(new nn(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                uk ukVar = wnVar.A1;
                if (ukVar != null) {
                    if (!wnVar.f45124fb && ukVar.a() && wnVar.G3 == null) {
                        z10 = true;
                    }
                    ukVar.g(z10);
                }
            }
            wnVar.G3 = wnVar.F3;
            wnVar.a7(true);
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(wnVar.G3);
            wnVar.F1.f31157f.O(true);
            View currentView = wnVar.C1.getCurrentView();
            if (wnVar.f45048a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof yn) {
                ((yn) currentView).f46049a.ad(wnVar.G3);
            }
            wnVar.Yc();
            wnVar.f45239p2.e(true, true);
            wnVar.bc(true);
            z10 = true;
        } else {
            wnVar.G3 = null;
            gk gkVar = wnVar.B1;
            if (gkVar != null) {
                gkVar.b(false);
                wnVar.Yc();
            }
            gk gkVar2 = wnVar.B1;
            if (gkVar2 != null && gkVar2.f28710a.getCurrentPosition() != 0) {
                wnVar.B1.f28710a.d(0, 0);
            }
        }
        gk gkVar3 = wnVar.B1;
        if (gkVar3 != null) {
            gkVar3.b(z10);
        }
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str3 = wnVar.F3;
        long j10 = wnVar.f45168j6;
        long j11 = wnVar.f45065b7;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, wnVar.f45241p4, wnVar.A3, wnVar.B3, wnVar.C3);
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        wn wnVar = this.f42126b;
        oe.b bVar = wnVar.f45071bd;
        if (wnVar.G3 == null) {
            wnVar.bc(false);
        }
        wnVar.U7();
        if (wnVar.f45367z3) {
            wnVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, wnVar.K6, true, true);
        } else if (wnVar.A3 == null && wnVar.B3 == null && wnVar.f45117f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            wnVar.f45117f3.callOnClick();
        }
        if (wnVar.G3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f19326f) {
                if (z10) {
                    wnVar.V7();
                }
                bVar.a(z10, true);
                fi.h1 h1Var = wnVar.C1;
                if (h1Var != null) {
                    h1Var.E(0);
                }
                if (z10) {
                    wnVar.bc(true);
                }
                wnVar.yc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.f42126b.G3 == null) {
            return true;
        }
        return false;
    }
}
