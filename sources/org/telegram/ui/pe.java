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
public final class pe implements org.telegram.ui.Components.d60, org.telegram.ui.Components.g60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.jo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.xj0, ResultCallback, wh.c, jh.a, jh.b, u60, ls, org.telegram.ui.Components.ml0, jh.d, org.telegram.ui.Components.yk0 {
    public final int f36507a;
    public final wn f36508b;

    public pe(wn wnVar, int i10) {
        this.f36507a = i10;
        this.f36508b = wnVar;
    }

    @Override
    public void a() {
        wn wnVar = this.f36508b;
        wnVar.q9(1);
        wnVar.r9();
    }

    @Override
    public void b() {
        wn wnVar = this.f36508b;
        if (wnVar.y3 == null && wnVar.getParentActivity() != null) {
            wnVar.Q7();
            wnVar.y3.m(wnVar.T5, wnVar.f39472f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f36507a) {
            case 4:
                wn.b1(this.f36508b, document);
                return;
            default:
                wn.e1(this.f36508b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        wn wnVar = this.f36508b;
        boolean z10 = false;
        if (wnVar.getParentActivity() != null) {
            gg.k1 adapter = wnVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = wnVar.I1.getAdapter();
                if (adapter2.f9823w0 != null && !adapter2.f9805h0) {
                    return false;
                }
                Object J = wnVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (wnVar.I1.getAdapter().J != null && org.telegram.ui.Components.w51.h) {
                        wnVar.Y.setFieldText("");
                        jk jkVar = wnVar.Y;
                        String str = h1Var.f9738a;
                        TLRPC.Chat chat = wnVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        jkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (wnVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.w51.h) {
                            wnVar.Y.setFieldText("");
                            jk jkVar2 = wnVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = wnVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            jkVar2.a1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39470ea);
                        alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(wnVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        wnVar.showDialog(alertDialog$Builder.f18662a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f36507a) {
            case 11:
                wn wnVar = this.f36508b;
                if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
                    gi giVar = new gi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39470ea, arrayList);
                    giVar.setCalcMandatoryInsets(wnVar.x9());
                    giVar.setDimBehind(false);
                    wnVar.A7(false);
                    wnVar.showDialog(giVar);
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f36508b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    dj djVar = new dj(wnVar2, wnVar2, wnVar2.getParentActivity(), wnVar2.f39470ea, arrayList);
                    djVar.setCalcMandatoryInsets(wnVar2.x9());
                    djVar.setDimBehind(false);
                    wnVar2.A7(false);
                    wnVar2.showDialog(djVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36507a) {
            case 2:
                qk qkVar = this.f36508b.B0;
                if (qkVar != null) {
                    qkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f36508b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                this.f36508b.e9(true);
                return;
            case 6:
                wn wnVar = this.f36508b;
                MessagePreviewParams messagePreviewParams = wnVar.f39478f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, wnVar.T5);
                }
                wnVar.j8();
                return;
            case 7:
                this.f36508b.ca(1);
                return;
            case 8:
                wn wnVar2 = this.f36508b;
                wnVar2.getMessagesController().unblockPeer(wnVar2.f39472f.f18483id);
                return;
            case 10:
                this.f36508b.finishFragment();
                return;
            case 12:
                gg.k1 adapter = this.f36508b.I1.getAdapter();
                adapter.f9822w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ua0 ua0Var = adapter.V;
                if (ua0Var != null) {
                    ua0Var.a(false);
                    return;
                }
                return;
            case 15:
                wn wnVar3 = this.f36508b;
                wnVar3.showDialog(new tl(wnVar3, wnVar3.getParentActivity(), wnVar3));
                return;
            case 16:
                wn wnVar4 = this.f36508b;
                wnVar4.Q7();
                UndoView undoView = wnVar4.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                wn wnVar5 = this.f36508b;
                MessageObject messageObject = (MessageObject) wnVar5.J4.get(Integer.valueOf(wnVar5.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) wnVar5.f39587o6[0].get(wnVar5.L4);
                }
                wnVar5.cc(messageObject);
                return;
            case 19:
                wn wnVar6 = this.f36508b;
                MessagePreviewParams messagePreviewParams2 = wnVar6.f39478f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    wnVar6.ca(0);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(boolean z10, boolean z11) {
        wn wnVar = this.f36508b;
        wnVar.M0.i(wnVar.f39482fa.c(), z10, z11);
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        wn wnVar = this.f36508b;
        wnVar.getMessagesController().addUsersToChat(wnVar.e, wnVar, arrayList, i10, null, null, null);
        wnVar.getMessagesController().hidePeerSettingsBar(wnVar.T5, wnVar.f39472f, wnVar.e);
        wnVar.Qc(true);
        wnVar.oc(true);
    }

    @Override
    public void j(int i10) {
        wn wnVar = this.f36508b;
        if (i10 == 1) {
            wnVar.U9();
        } else if (i10 == 2) {
            wnVar.H9();
        } else if (i10 == 3) {
            wnVar.D4 = true;
            wnVar.getMessagesController().getNextReactionMention(wnVar.T5, wnVar.d(), wnVar.l1, new ng(wnVar, 0));
        } else if (i10 == 4) {
            wnVar.D4 = true;
            wnVar.getMessagesController().getNextPollVotesMention(wnVar.T5, wnVar.d(), wnVar.f39557m1, new ng(wnVar, 1));
        } else if (i10 == 6) {
            wnVar.Y8(true);
        } else if (i10 == 5) {
            wnVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = wnVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            wnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        wn wnVar = this.f36508b;
        un unVar = wnVar.f39470ea;
        TLRPC.WallPaper wallPaper = unVar.h;
        if (wnVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        wn wnVar = this.f36508b;
        NotificationCenter notificationCenter = wnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wnVar, i10);
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wnVar.finishFragment();
        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wnVar.T5), wnVar.f39472f, wnVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void g(TLRPC.User user) {
    }
}
