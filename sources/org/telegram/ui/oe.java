package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class oe implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.xn, MessagesStorage.BooleanCallback, org.telegram.ui.Components.bj0, ResultCallback, eh.d, rg.a, rg.b, f60, hs, org.telegram.ui.Components.ok0, rg.d, org.telegram.ui.Components.ck0, FlagSecureReason.FlagSecureCondition, ku0 {
    public final int f41127a;
    public final qn f41128b;

    public oe(qn qnVar, int i9) {
        this.f41127a = i9;
        this.f41128b = qnVar;
    }

    @Override
    public boolean a(int i9, View view) {
        qn qnVar = this.f41128b;
        boolean z10 = false;
        if (qnVar.getParentActivity() != null) {
            of.f1 adapter = qnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i9 != 0) {
                of.f1 adapter2 = qnVar.E1.getAdapter();
                if (adapter2.f19343s0 != null && !adapter2.f19324d0) {
                    return false;
                }
                Object J = qnVar.E1.getAdapter().J(i9 - 1);
                if (J instanceof of.c1) {
                    of.c1 c1Var = (of.c1) J;
                    if (qnVar.E1.getAdapter().F != null && org.telegram.ui.Components.m41.h) {
                        qnVar.U.setFieldText("");
                        ak akVar = qnVar.U;
                        String str = c1Var.f19265a;
                        TLRPC.Chat chat = qnVar.f41890e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        akVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (qnVar.E1.getAdapter().F != null) {
                        if (org.telegram.ui.Components.m41.h) {
                            qnVar.U.setFieldText("");
                            ak akVar2 = qnVar.U;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = qnVar.f41890e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            akVar2.a1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new oe(qnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(alertDialog$Builder.f22702a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        qn qnVar = this.f41128b;
        qnVar.q9(1);
        qnVar.r9();
    }

    @Override
    public void c() {
        qn qnVar = this.f41128b;
        if (qnVar.f42093u3 == null && qnVar.getParentActivity() != null) {
            qnVar.Q7();
            qnVar.f42093u3.m(qnVar.P5, qnVar.f41903f, 8);
        }
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f41127a) {
            case 2:
                qn.t0(this.f41128b, document);
                return;
            default:
                qn.u0(this.f41128b, document);
                return;
        }
    }

    @Override
    public void e(boolean z10, boolean z11) {
        qn qnVar = this.f41128b;
        qnVar.I0.i(qnVar.ba.c(), z10, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f41127a) {
            case 0:
                hk hkVar = this.f41128b.f42127x0;
                if (hkVar != null) {
                    hkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f41128b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                qn qnVar = this.f41128b;
                MessageObject messageObject = (MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) qnVar.f41972k6[0].get(qnVar.H4);
                }
                qnVar.cc(messageObject);
                return;
            case 4:
                qn qnVar2 = this.f41128b;
                MessagePreviewParams messagePreviewParams = qnVar2.f41857b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, qnVar2.P5);
                }
                qnVar2.j8();
                return;
            case 5:
                this.f41128b.ca(1);
                return;
            case 6:
                qn qnVar3 = this.f41128b;
                qnVar3.getMessagesController().unblockPeer(qnVar3.f41903f.f22527id);
                return;
            case 8:
                this.f41128b.finishFragment();
                return;
            case 10:
                of.f1 adapter = this.f41128b.E1.getAdapter();
                adapter.f19347w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.r90 r90Var = adapter.R;
                if (r90Var != null) {
                    r90Var.a(false);
                    return;
                }
                return;
            case 12:
                qn qnVar4 = this.f41128b;
                qnVar4.showDialog(new ll(qnVar4, qnVar4.getParentActivity(), qnVar4));
                return;
            case 13:
                qn qnVar5 = this.f41128b;
                qnVar5.Q7();
                UndoView undoView = qnVar5.f42093u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                qn qnVar6 = this.f41128b;
                MessagePreviewParams messagePreviewParams2 = qnVar6.f41857b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    qnVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f41128b.e9(true);
                return;
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        switch (this.f41127a) {
            case 9:
                qn qnVar = this.f41128b;
                if (qnVar.getParentActivity() != null && qnVar.getParentActivity() != null) {
                    xh xhVar = new xh(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f41848aa, arrayList);
                    xhVar.setCalcMandatoryInsets(qnVar.x9());
                    xhVar.setDimBehind(false);
                    qnVar.A7(false);
                    qnVar.showDialog(xhVar);
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f41128b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    ui uiVar = new ui(qnVar2, qnVar2, qnVar2.getParentActivity(), qnVar2.f41848aa, arrayList);
                    uiVar.setCalcMandatoryInsets(qnVar2.x9());
                    uiVar.setDimBehind(false);
                    qnVar2.A7(false);
                    qnVar2.showDialog(uiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(float[] fArr) {
        qn qnVar = this.f41128b;
        fArr[1] = qnVar.f42077t0.getBottom() - qnVar.f42123wa;
        fArr[0] = (qnVar.f42077t0.getTop() + qnVar.o9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void j(int i9, ArrayList arrayList) {
        qn qnVar = this.f41128b;
        qnVar.getMessagesController().addUsersToChat(qnVar.f41890e, qnVar, arrayList, i9, null, null, null);
        qnVar.getMessagesController().hidePeerSettingsBar(qnVar.P5, qnVar.f41903f, qnVar.f41890e);
        qnVar.Qc(true);
        qnVar.oc(true);
    }

    @Override
    public void k(int i9) {
        qn qnVar = this.f41128b;
        if (i9 == 1) {
            qnVar.U9();
        } else if (i9 == 2) {
            qnVar.H9();
        } else if (i9 == 3) {
            qnVar.f42157z4 = true;
            qnVar.getMessagesController().getNextReactionMention(qnVar.P5, qnVar.b(), qnVar.f41930h1, new fg(qnVar, 0));
        } else if (i9 == 4) {
            qnVar.f42157z4 = true;
            qnVar.getMessagesController().getNextPollVotesMention(qnVar.P5, qnVar.b(), qnVar.f41943i1, new fg(qnVar, 1));
        } else if (i9 == 6) {
            qnVar.Y8(true);
        } else if (i9 == 5) {
            qnVar.Y8(false);
        } else if (i9 == 0) {
            ih.u2 u2Var = qnVar.F1;
            if (u2Var != null) {
                u2Var.I1(null, 0);
            }
            qnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        qn qnVar = this.f41128b;
        on onVar = qnVar.f41848aa;
        TLRPC.WallPaper wallPaper = onVar.h;
        if (qnVar.L5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        onVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public void run(boolean z10) {
        qn qnVar = this.f41128b;
        NotificationCenter notificationCenter = qnVar.getNotificationCenter();
        int i9 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(qnVar, i9);
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
        qnVar.finishFragment();
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.P5), qnVar.f41903f, qnVar.f41890e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public boolean run() {
        qn qnVar = this.f41128b;
        return qnVar.h != null || qnVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
