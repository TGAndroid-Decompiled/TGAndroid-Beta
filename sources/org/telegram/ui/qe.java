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
public final class qe implements org.telegram.ui.Components.q60, org.telegram.ui.Components.t60, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.uo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, oi.m, yh.c, lh.a, lh.b, o60, ks, org.telegram.ui.Components.cm0, lh.d {
    public final int f42684a;
    public final wn f42685b;

    public qe(wn wnVar, int i10) {
        this.f42684a = i10;
        this.f42685b = wnVar;
    }

    @Override
    public void a() {
        wn wnVar = this.f42685b;
        if (wnVar.K3 == null && wnVar.getParentActivity() != null) {
            wnVar.Z7();
            wnVar.K3.m(wnVar.f45168j6, wnVar.f45113f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f42684a) {
            case 4:
                wn.E0(this.f42685b, document);
                return;
            default:
                wn.A1(this.f42685b, document);
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        wn wnVar = this.f42685b;
        boolean z10 = false;
        if (wnVar.getParentActivity() != null) {
            ig.j1 adapter = wnVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                ig.j1 adapter2 = wnVar.U1.getAdapter();
                if (adapter2.f14136w0 != null && !adapter2.f14118h0) {
                    return false;
                }
                Object J = wnVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof ig.g1) {
                    ig.g1 g1Var = (ig.g1) J;
                    if (wnVar.U1.getAdapter().J != null && org.telegram.ui.Components.v61.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar = wnVar.Y;
                        String str = g1Var.f14059a;
                        TLRPC.Chat chat = wnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.W0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wnVar.U1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.v61.h) {
                            wnVar.Y.setFieldText("");
                            jk jkVar2 = wnVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = wnVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            jkVar2.W0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qe(wnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(alertDialog$Builder.f22369a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10, boolean z11) {
        wn wnVar = this.f42685b;
        wnVar.Y0.i(wnVar.va.b(), z10, z11);
    }

    @Override
    public void f(int i10, ArrayList arrayList) {
        wn wnVar = this.f42685b;
        wnVar.getMessagesController().addUsersToChat(wnVar.e, wnVar, arrayList, i10, null, null, null);
        wnVar.getMessagesController().hidePeerSettingsBar(wnVar.f45168j6, wnVar.f45113f, wnVar.e);
        wnVar.hd(true);
        wnVar.Fc(true);
    }

    @Override
    public void g(ArrayList arrayList) {
        switch (this.f42684a) {
            case 11:
                wn wnVar = this.f42685b;
                if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
                    ei eiVar = new ei(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f45309ua, arrayList);
                    eiVar.setCalcMandatoryInsets(wnVar.I9());
                    eiVar.setDimBehind(false);
                    wnVar.J7(false);
                    wnVar.showDialog(eiVar);
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f42685b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    bj bjVar = new bj(wnVar2, wnVar2, wnVar2.getParentActivity(), wnVar2.f45309ua, arrayList);
                    bjVar.setCalcMandatoryInsets(wnVar2.I9());
                    bjVar.setDimBehind(false);
                    wnVar2.J7(false);
                    wnVar2.showDialog(bjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42684a) {
            case 2:
                pk pkVar = this.f42685b.B0;
                if (pkVar != null) {
                    pkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f42685b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 16:
            case 17:
            default:
                wn wnVar = this.f42685b;
                MessageObject messageObject = (MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) wnVar.E6[0].get(wnVar.X4);
                }
                wnVar.tc(messageObject);
                return;
            case 6:
                wn wnVar2 = this.f42685b;
                MessagePreviewParams messagePreviewParams = wnVar2.f45317v5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, wnVar2.f45168j6);
                }
                wnVar2.s8();
                return;
            case 7:
                this.f42685b.pa(1);
                return;
            case 8:
                wn wnVar3 = this.f42685b;
                wnVar3.getMessagesController().unblockPeer(wnVar3.f45113f.f22177id);
                return;
            case 10:
                this.f42685b.finishFragment();
                return;
            case 12:
                ig.j1 adapter = this.f42685b.U1.getAdapter();
                adapter.f14135w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.cb0 cb0Var = adapter.V;
                if (cb0Var != null) {
                    cb0Var.a(false);
                    return;
                }
                return;
            case 14:
                wn wnVar4 = this.f42685b;
                wnVar4.showDialog(new sl(wnVar4, wnVar4.getParentActivity(), wnVar4));
                return;
            case 15:
                wn wnVar5 = this.f42685b;
                wnVar5.Z7();
                UndoView undoView = wnVar5.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 18:
                wn wnVar6 = this.f42685b;
                MessagePreviewParams messagePreviewParams2 = wnVar6.f45317v5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    wnVar6.pa(0);
                    return;
                }
                return;
            case 19:
                this.f42685b.r9(true);
                return;
        }
    }

    @Override
    public void i(int i10) {
        wn wnVar = this.f42685b;
        if (i10 == 1) {
            wnVar.ha();
        } else if (i10 == 2) {
            wnVar.U9();
        } else if (i10 == 3) {
            wnVar.P4 = true;
            wnVar.getMessagesController().getNextReactionMention(wnVar.f45168j6, wnVar.b(), wnVar.f45340x1, new gg(wnVar, 0));
        } else if (i10 == 4) {
            wnVar.P4 = true;
            wnVar.getMessagesController().getNextPollVotesMention(wnVar.f45168j6, wnVar.b(), wnVar.f45353y1, new gg(wnVar, 1));
        } else if (i10 == 6) {
            wnVar.l9(true);
        } else if (i10 == 5) {
            wnVar.l9(false);
        } else if (i10 == 0) {
            di.a3 a3Var = wnVar.V1;
            if (a3Var != null) {
                a3Var.P1(null, 0);
            }
            wnVar.ka();
        }
    }

    @Override
    public void k(int i10) {
        wn.e1(this.f42685b, i10);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) obj;
        wn wnVar = this.f42685b;
        un unVar = wnVar.f45309ua;
        TLRPC.WallPaper wallPaper = unVar.f44060g;
        if (wnVar.f45120f6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.q(h4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        wn wnVar = this.f42685b;
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i10);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.f45168j6), wnVar.f45113f, wnVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void e(TLRPC.User user) {
    }
}
