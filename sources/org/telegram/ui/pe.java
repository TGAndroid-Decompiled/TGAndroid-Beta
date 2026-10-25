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
public final class pe implements org.telegram.ui.Components.p60, org.telegram.ui.Components.s60, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.uo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mk0, ResultCallback, oi.m, yh.c, lh.a, lh.b, org.telegram.ui.Components.bm0, m60, is, lh.d {
    public final int f42478a;
    public final un f42479b;

    public pe(un unVar, int i10) {
        this.f42478a = i10;
        this.f42479b = unVar;
    }

    @Override
    public void a() {
        un unVar = this.f42479b;
        if (unVar.K3 == null && unVar.getParentActivity() != null) {
            unVar.X7();
            unVar.K3.m(unVar.f44249f6, unVar.f44242f, 8);
        }
    }

    @Override
    public void b(TLRPC.Document document) {
        switch (this.f42478a) {
            case 4:
                un.u0(this.f42479b, document);
                return;
            default:
                un.B0(this.f42479b, document);
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        un unVar = this.f42479b;
        boolean z10 = false;
        if (unVar.getParentActivity() != null) {
            ig.j1 adapter = unVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                ig.j1 adapter2 = unVar.U1.getAdapter();
                if (adapter2.f14137w0 != null && !adapter2.f14119h0) {
                    return false;
                }
                Object J = unVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof ig.g1) {
                    ig.g1 g1Var = (ig.g1) J;
                    if (unVar.U1.getAdapter().J != null && org.telegram.ui.Components.u61.h) {
                        unVar.Y.setFieldText("");
                        hk hkVar = unVar.Y;
                        String str = g1Var.f14060a;
                        TLRPC.Chat chat = unVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        hkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (unVar.U1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.u61.h) {
                            unVar.Y.setFieldText("");
                            hk hkVar2 = unVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = unVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            hkVar2.X0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(unVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        unVar.showDialog(alertDialog$Builder.f22366a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(boolean z10, boolean z11) {
        un unVar = this.f42479b;
        unVar.Y0.i(unVar.f44398ra.b(), z10, z11);
    }

    @Override
    public void f(int i10, ArrayList arrayList) {
        un unVar = this.f42479b;
        unVar.getMessagesController().addUsersToChat(unVar.e, unVar, arrayList, i10, null, null, null);
        unVar.getMessagesController().hidePeerSettingsBar(unVar.f44249f6, unVar.f44242f, unVar.e);
        unVar.dd(true);
        unVar.Bc(true);
    }

    @Override
    public void g(ArrayList arrayList) {
        switch (this.f42478a) {
            case 11:
                un unVar = this.f42479b;
                if (unVar.getParentActivity() != null && unVar.getParentActivity() != null) {
                    bi biVar = new bi(unVar, unVar, unVar.getParentActivity(), unVar.f44385qa, arrayList);
                    biVar.setCalcMandatoryInsets(unVar.F9());
                    biVar.setDimBehind(false);
                    unVar.H7(false);
                    unVar.showDialog(biVar);
                    return;
                }
                return;
            default:
                un unVar2 = this.f42479b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    yi yiVar = new yi(unVar2, unVar2, unVar2.getParentActivity(), unVar2.f44385qa, arrayList);
                    yiVar.setCalcMandatoryInsets(unVar2.F9());
                    yiVar.setDimBehind(false);
                    unVar2.H7(false);
                    unVar2.showDialog(yiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42478a) {
            case 2:
                nk nkVar = this.f42479b.B0;
                if (nkVar != null) {
                    nkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f42479b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            case 19:
            default:
                this.f42479b.o9(true);
                return;
            case 6:
                un unVar = this.f42479b;
                MessagePreviewParams messagePreviewParams = unVar.f44394r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, unVar.f44249f6);
                }
                unVar.q8();
                return;
            case 7:
                this.f42479b.ma(1);
                return;
            case 8:
                un unVar2 = this.f42479b;
                unVar2.getMessagesController().unblockPeer(unVar2.f44242f.f22174id);
                return;
            case 10:
                this.f42479b.finishFragment();
                return;
            case 12:
                ig.j1 adapter = this.f42479b.U1.getAdapter();
                adapter.f14136w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.bb0 bb0Var = adapter.V;
                if (bb0Var != null) {
                    bb0Var.a(false);
                    return;
                }
                return;
            case 15:
                un unVar3 = this.f42479b;
                unVar3.showDialog(new ql(unVar3, unVar3.getParentActivity(), unVar3));
                return;
            case 16:
                un unVar4 = this.f42479b;
                unVar4.X7();
                UndoView undoView = unVar4.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 18:
                un unVar5 = this.f42479b;
                MessageObject messageObject = (MessageObject) unVar5.V4.get(Integer.valueOf(unVar5.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) unVar5.A6[0].get(unVar5.X4);
                }
                unVar5.pc(messageObject);
                return;
            case 20:
                un unVar6 = this.f42479b;
                MessagePreviewParams messagePreviewParams2 = unVar6.f44394r5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    unVar6.ma(0);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(int i10) {
        un unVar = this.f42479b;
        if (i10 == 1) {
            unVar.ea();
        } else if (i10 == 2) {
            unVar.R9();
        } else if (i10 == 3) {
            unVar.P4 = true;
            unVar.getMessagesController().getNextReactionMention(unVar.f44249f6, unVar.b(), unVar.f44469x1, new hg(unVar, 0));
        } else if (i10 == 4) {
            unVar.P4 = true;
            unVar.getMessagesController().getNextPollVotesMention(unVar.f44249f6, unVar.b(), unVar.f44482y1, new hg(unVar, 1));
        } else if (i10 == 6) {
            unVar.i9(true);
        } else if (i10 == 5) {
            unVar.i9(false);
        } else if (i10 == 0) {
            di.a3 a3Var = unVar.V1;
            if (a3Var != null) {
                a3Var.O1(null, 0);
            }
            unVar.ha();
        }
    }

    @Override
    public void k(int i10) {
        un.b1(this.f42479b, i10);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) obj;
        un unVar = this.f42479b;
        sn snVar = unVar.f44385qa;
        TLRPC.WallPaper wallPaper = snVar.f43543g;
        if (unVar.f44196b6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.q(h4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        un unVar = this.f42479b;
        NotificationCenter notificationCenter = unVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(unVar, i10);
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        unVar.finishFragment();
        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(unVar.f44249f6), unVar.f44242f, unVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void e(TLRPC.User user) {
    }
}
