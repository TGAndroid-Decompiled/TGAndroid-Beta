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
public final class pn extends org.telegram.ui.ActionBar.g5 {
    public float f36508f;
    public final xn h;

    public pn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f39941u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        xn xnVar;
        xn xnVar2 = this.h;
        if (!xnVar2.f40014zc.f14203f) {
            if (xnVar2.f39941u3 != null && xnVar2.f39875p1 != null) {
                View currentView = xnVar2.f39887q1.getCurrentView();
                if (currentView instanceof zn) {
                    xnVar = ((zn) currentView).f40556a;
                } else {
                    xnVar = xnVar2;
                }
                if (!xnVar.xc.f14203f) {
                    xnVar.Lb(true);
                    return false;
                }
                int currentPosition = xnVar2.f39875p1.f29188a.getCurrentPosition();
                int i10 = xnVar2.f39900r1;
                if (currentPosition != i10) {
                    xnVar2.f39875p1.f29188a.d(i10, i10);
                    return false;
                }
            } else if (xnVar2.xc.f14203f) {
                xnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f39854n3;
    }

    @Override
    public final void k() {
        int i10;
        xn xnVar = this.h;
        xnVar.L7();
        if (xnVar.f39865o3 == null && xnVar.f39877p3 == null) {
            if (xnVar.f39854n3) {
                xnVar.I1.getAdapter().U(null, 0, null, false, true);
                xnVar.f39854n3 = false;
                xnVar.f39802j0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39802j0;
            if (xnVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            xnVar.S2.setVisibility(0);
            ImageView imageView = xnVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            xnVar.f39865o3 = null;
            xnVar.f39877p3 = null;
            return;
        }
        ImageView imageView2 = xnVar.T2;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void m() {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        MessageObject messageObject;
        xn xnVar = this.h;
        xnVar.f39916s3 = false;
        xnVar.vc();
        xnVar.Ic();
        ImageView imageView = xnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = xnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (xnVar.f39854n3) {
            xnVar.I1.getAdapter().U(null, 0, null, false, true);
            xnVar.f39854n3 = false;
        }
        xnVar.I1.setReversed(false);
        xnVar.I1.getAdapter().f9814k0 = false;
        xnVar.m7();
        xnVar.f39865o3 = null;
        xnVar.f39877p3 = null;
        xnVar.f39941u3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39802j0;
        if (xnVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        xnVar.f39802j0.setSearchFieldCaption(null);
        xnVar.f40001yc.a(false, true);
        xnVar.f40014zc.a(false, true);
        org.telegram.ui.ActionBar.z zVar = xnVar.f39789i0;
        if (zVar != null && zVar.f19964o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39777h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = xnVar.f39789i0;
            if (zVar2 != null) {
                zVar2.f(0);
                xn.J3(xnVar);
            }
            org.telegram.ui.ActionBar.z zVar3 = xnVar.f39741e0;
            if (zVar3 != null) {
                zVar3.f(8);
            }
            es esVar = xnVar.f39728d0;
            if (esVar != null) {
                esVar.b(false, true);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.m0;
            if (w0Var3 != null && xnVar.K9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar4 = xnVar.f39851n0;
            if (zVar4 != null && xnVar.L9) {
                zVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = xnVar.f39814k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (xnVar.Y.k0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer()) && ((chat = xnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = xnVar.f39777h0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar5 = xnVar.f39789i0;
            if (zVar5 != null) {
                zVar5.f(8);
            }
            org.telegram.ui.ActionBar.z zVar6 = xnVar.f39741e0;
            if (zVar6 != null) {
                zVar6.f(0);
            }
            es esVar2 = xnVar.f39728d0;
            if (esVar2 != null) {
                esVar2.b(true, true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = xnVar.m0;
            if (w0Var6 != null && xnVar.K9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar7 = xnVar.f39851n0;
            if (zVar7 != null && xnVar.L9) {
                zVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = xnVar.f39814k0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = xnVar.f39777h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar8 = xnVar.f39851n0;
            if (zVar8 != null && xnVar.L9) {
                zVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = xnVar.f39814k0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = xnVar.m0;
            if (w0Var10 != null && xnVar.K9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar9 = xnVar.f39789i0;
            if (zVar9 != null) {
                zVar9.f(8);
            }
            org.telegram.ui.ActionBar.z zVar10 = xnVar.f39741e0;
            if (zVar10 != null) {
                zVar10.f(8);
            }
            es esVar3 = xnVar.f39728d0;
            if (esVar3 != null) {
                esVar3.b(false, true);
            }
        }
        if (xnVar.f39887q1 != null) {
            if (xnVar.f39875p1.f29188a.getCurrentPosition() != 0) {
                xnVar.f39875p1.f29188a.d(0, 0);
                xnVar.f39914s1 = true;
            } else {
                xnVar.f39887q1.h.clear();
            }
        }
        int i13 = xnVar.R3;
        if (i13 == 3 || i13 == 8 || ((xnVar.f39732d4 == 0 && !UserObject.isReplyUser(xnVar.f39752f)) || ((messageObject = xnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            xnVar.f39802j0.setVisibility(8);
        }
        xnVar.f39862o0 = false;
        xnVar.getMediaDataController().clearFoundMessageObjects();
        if (xnVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = xnVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        xnVar.Ia();
        xnVar.hc(false);
        xnVar.yc(0, true);
        xnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36508f, 0.0f);
        ofFloat.addUpdateListener(new on(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xnVar.xc.a(false, true);
        xnVar.Hc();
        xnVar.f39889q3 = null;
        xnVar.Ic();
        xnVar.vc();
        xk xkVar = xnVar.f39863o1;
        if (xkVar != null) {
            xkVar.d.N(new gr(2));
            xkVar.h = 0L;
            xnVar.f39863o1.g(false);
        }
        jk jkVar = xnVar.f39875p1;
        if (jkVar != null) {
            jkVar.b(false);
        }
        xnVar.kb(false);
    }

    @Override
    public final void n() {
        jk jkVar;
        int i10;
        xn xnVar = this.h;
        boolean z10 = true;
        xnVar.f39916s3 = true;
        xnVar.vc();
        xnVar.Ic();
        if (((xnVar.f39732d4 != 0 && xnVar.R3 != 3) || UserObject.isReplyUser(xnVar.f39752f)) && !xnVar.f39727cc) {
            xnVar.la(null);
        }
        if (xnVar.W4) {
            xnVar.saveKeyboardPositionBeforeTransition();
            if (!xnVar.Oa) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new cj(this, 9), 500L);
            hj hjVar = xnVar.f39767g2;
            if (hjVar != null) {
                hjVar.b(true);
            }
            org.telegram.ui.Components.l40 l40Var = xnVar.f39791i2;
            if (l40Var != null) {
                l40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36508f, 1.0f);
        ofFloat.addUpdateListener(new on(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xk xkVar = xnVar.f39863o1;
        if (xkVar != null) {
            xkVar.g((!xnVar.Oa && xkVar.a() && xnVar.f39941u3 == null) ? false : false);
        }
        if (xnVar.f39941u3 != null && (jkVar = xnVar.f39875p1) != null) {
            int currentPosition = jkVar.f29188a.getCurrentPosition();
            int i11 = xnVar.f39900r1;
            if (currentPosition != i11) {
                xnVar.f39875p1.f29188a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        xn xnVar = this.h;
        xk xkVar = xnVar.f39863o1;
        if (xkVar != null) {
            xkVar.d.N(new gr(2));
            xkVar.h = 0L;
        }
        xnVar.f39889q3 = null;
        xnVar.Ic();
        xnVar.vc();
        xnVar.kb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        xn xnVar = this.h;
        boolean z10 = false;
        xnVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = xnVar.f39929t3;
        }
        xnVar.f39929t3 = str;
        if (!TextUtils.isEmpty(str) && (xnVar.f39929t3.startsWith("$") || xnVar.f39929t3.startsWith("#"))) {
            xnVar.M7();
            if (xnVar.f39929t3.contains("@")) {
                String str2 = xnVar.f39929t3;
                e6Var = ((org.telegram.ui.ActionBar.o2) xnVar).resourceProvider;
                xnVar.presentFragment(new org.telegram.ui.Components.e40(str2, e6Var));
                return;
            }
            if (xnVar.f39941u3 == null) {
                xnVar.f39941u3 = xnVar.f39929t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36508f, 1.0f);
                ofFloat.addUpdateListener(new on(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                xk xkVar = xnVar.f39863o1;
                if (xkVar != null) {
                    if (!xnVar.Oa && xkVar.a() && xnVar.f39941u3 == null) {
                        z10 = true;
                    }
                    xkVar.g(z10);
                }
            }
            xnVar.f39941u3 = xnVar.f39929t3;
            xnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(xnVar.f39941u3);
            xnVar.f39927t1.f24455f.N(true);
            View currentView = xnVar.f39887q1.getCurrentView();
            if (xnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof zn) {
                ((zn) currentView).f40556a.Jc(xnVar.f39941u3);
            }
            xnVar.Hc();
            xnVar.f39730d2.e(true, true);
            xnVar.Lb(true);
            z10 = true;
        } else {
            xnVar.f39941u3 = null;
            jk jkVar = xnVar.f39875p1;
            if (jkVar != null) {
                jkVar.b(false);
                xnVar.Hc();
            }
            jk jkVar2 = xnVar.f39875p1;
            if (jkVar2 != null && jkVar2.f29188a.getCurrentPosition() != 0) {
                xnVar.f39875p1.f29188a.d(0, 0);
            }
        }
        jk jkVar3 = xnVar.f39875p1;
        if (jkVar3 != null) {
            jkVar3.b(z10);
        }
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str3 = xnVar.f39929t3;
        long j3 = xnVar.T5;
        long j10 = xnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, xnVar.f39732d4, xnVar.f39865o3, xnVar.f39877p3, xnVar.f39889q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        xn xnVar = this.h;
        le.c cVar = xnVar.f40014zc;
        if (xnVar.f39941u3 == null) {
            xnVar.Lb(false);
        }
        xnVar.L7();
        if (xnVar.f39854n3) {
            gg.k1 adapter = xnVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, xnVar.f39944u6, true, true);
        } else if (xnVar.f39865o3 == null && xnVar.f39877p3 == null && xnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            xnVar.T2.callOnClick();
        }
        if (xnVar.f39941u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != cVar.f14203f) {
                if (z10) {
                    xnVar.M7();
                }
                cVar.a(z10, true);
                ci.i1 i1Var = xnVar.f39887q1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    xnVar.Lb(true);
                }
                xnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f39941u3 == null) {
            return true;
        }
        return false;
    }
}
