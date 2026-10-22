package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
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
public final class pe implements org.telegram.ui.Components.n60, org.telegram.ui.Components.q60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.kk0, ResultCallback, xh.c, kh.a, kh.b, g60, es, org.telegram.ui.Components.zl0, kh.d, org.telegram.ui.Components.ll0 {
    public final int f40201a;
    public final qn f40202b;

    public pe(qn qnVar, int i10) {
        this.f40201a = i10;
        this.f40202b = qnVar;
    }

    @Override
    public boolean a(int i10, View view) {
        qn qnVar = this.f40202b;
        boolean z10 = false;
        if (qnVar.getParentActivity() != null) {
            hg.j1 adapter = qnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = qnVar.I1.getAdapter();
                if (adapter2.f11946w0 != null && !adapter2.f11928h0) {
                    return false;
                }
                Object J = qnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (qnVar.I1.getAdapter().J != null && org.telegram.ui.Components.i61.h) {
                        qnVar.Y.setFieldText("");
                        fk fkVar = qnVar.Y;
                        String str = g1Var.f11869a;
                        TLRPC.Chat chat = qnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        fkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (qnVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.i61.h) {
                            qnVar.Y.setFieldText("");
                            fk fkVar2 = qnVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = qnVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            fkVar2.X0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40676ea);
                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(qnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        qnVar.showDialog(alertDialog$Builder.f20608a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        qn qnVar = this.f40202b;
        qnVar.v9(1);
        qnVar.w9();
    }

    @Override
    public void c() {
        qn qnVar = this.f40202b;
        if (qnVar.y3 == null && qnVar.getParentActivity() != null) {
            qnVar.T7();
            qnVar.y3.m(qnVar.T5, qnVar.f40679f, 8);
        }
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f40201a) {
            case 4:
                qn.j0(this.f40202b, document);
                return;
            default:
                qn.D0(this.f40202b, document);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f40201a) {
            case 11:
                qn qnVar = this.f40202b;
                if (qnVar.getParentActivity() != null && qnVar.getParentActivity() != null) {
                    ai aiVar = new ai(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f40676ea, arrayList);
                    aiVar.setCalcMandatoryInsets(qnVar.C9());
                    aiVar.setDimBehind(false);
                    qnVar.D7(false);
                    qnVar.showDialog(aiVar);
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f40202b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    xi xiVar = new xi(qnVar2, qnVar2, qnVar2.getParentActivity(), qnVar2.f40676ea, arrayList);
                    xiVar.setCalcMandatoryInsets(qnVar2.C9());
                    xiVar.setDimBehind(false);
                    qnVar2.D7(false);
                    qnVar2.showDialog(xiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        qn qnVar = this.f40202b;
        qnVar.M0.i(qnVar.f40689fa.c(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40201a) {
            case 2:
                lk lkVar = this.f40202b.B0;
                if (lkVar != null) {
                    lkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f40202b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                qn qnVar = this.f40202b;
                MessageObject messageObject = (MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) qnVar.f40796o6[0].get(qnVar.L4);
                }
                qnVar.hc(messageObject);
                return;
            case 6:
                qn qnVar2 = this.f40202b;
                MessagePreviewParams messagePreviewParams = qnVar2.f40685f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, qnVar2.T5);
                }
                qnVar2.m8();
                return;
            case 7:
                this.f40202b.ha(1);
                return;
            case 8:
                qn qnVar3 = this.f40202b;
                qnVar3.getMessagesController().unblockPeer(qnVar3.f40679f.f20426id);
                return;
            case 10:
                this.f40202b.finishFragment();
                return;
            case 12:
                hg.j1 adapter = this.f40202b.I1.getAdapter();
                adapter.f11945w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.db0 db0Var = adapter.V;
                if (db0Var != null) {
                    db0Var.a(false);
                    return;
                }
                return;
            case 15:
                qn qnVar4 = this.f40202b;
                qnVar4.showDialog(new ol(qnVar4, qnVar4.getParentActivity(), qnVar4));
                return;
            case 16:
                qn qnVar5 = this.f40202b;
                qnVar5.T7();
                UndoView undoView = qnVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                qn qnVar6 = this.f40202b;
                MessagePreviewParams messagePreviewParams2 = qnVar6.f40685f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    qnVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f40202b.j9(true);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        qn qnVar = this.f40202b;
        qnVar.getMessagesController().addUsersToChat(qnVar.e, qnVar, arrayList, i10, null, null, null);
        qnVar.getMessagesController().hidePeerSettingsBar(qnVar.T5, qnVar.f40679f, qnVar.e);
        qnVar.Vc(true);
        qnVar.tc(true);
    }

    @Override
    public void j(int i10) {
        qn qnVar = this.f40202b;
        if (i10 == 1) {
            qnVar.Z9();
        } else if (i10 == 2) {
            qnVar.M9();
        } else if (i10 == 3) {
            qnVar.D4 = true;
            qnVar.getMessagesController().getNextReactionMention(qnVar.T5, qnVar.d(), qnVar.l1, new eg(qnVar, 0));
        } else if (i10 == 4) {
            qnVar.D4 = true;
            qnVar.getMessagesController().getNextPollVotesMention(qnVar.T5, qnVar.d(), qnVar.f40764m1, new eg(qnVar, 1));
        } else if (i10 == 6) {
            qnVar.d9(true);
        } else if (i10 == 5) {
            qnVar.d9(false);
        } else if (i10 == 0) {
            ci.b3 b3Var = qnVar.J1;
            if (b3Var != null) {
                b3Var.L1(null, 0);
            }
            qnVar.ca();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) obj;
        qn qnVar = this.f40202b;
        on onVar = qnVar.f40676ea;
        TLRPC.WallPaper wallPaper = onVar.h;
        if (qnVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        onVar.k(c4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        qn qnVar = this.f40202b;
        NotificationCenter notificationCenter = qnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(qnVar, i10);
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        qnVar.finishFragment();
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(qnVar.T5), qnVar.f40679f, qnVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
