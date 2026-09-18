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
public final class qe implements org.telegram.ui.Components.c60, org.telegram.ui.Components.e60, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.io, MessagesStorage.BooleanCallback, org.telegram.ui.Components.xj0, ResultCallback, wh.c, jh.a, jh.b, z60, rs, org.telegram.ui.Components.ml0, jh.d, org.telegram.ui.Components.yk0 {
    public final int f36797a;
    public final zn f36798b;

    public qe(zn znVar, int i10) {
        this.f36797a = i10;
        this.f36798b = znVar;
    }

    @Override
    public void a() {
        zn znVar = this.f36798b;
        znVar.q9(1);
        znVar.r9();
    }

    @Override
    public void b() {
        zn znVar = this.f36798b;
        if (znVar.y3 == null && znVar.getParentActivity() != null) {
            znVar.Q7();
            znVar.y3.m(znVar.T5, znVar.f40263f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f36797a) {
            case 4:
                zn.b1(this.f36798b, document);
                return;
            default:
                zn.e1(this.f36798b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        zn znVar = this.f36798b;
        boolean z10 = false;
        if (znVar.getParentActivity() != null) {
            gg.k1 adapter = znVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.k1 adapter2 = znVar.I1.getAdapter();
                if (adapter2.f9841w0 != null && !adapter2.f9823h0) {
                    return false;
                }
                Object J = znVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.h1) {
                    gg.h1 h1Var = (gg.h1) J;
                    if (znVar.I1.getAdapter().J != null && org.telegram.ui.Components.y51.h) {
                        znVar.Y.setFieldText("");
                        lk lkVar = znVar.Y;
                        String str = h1Var.f9756a;
                        TLRPC.Chat chat = znVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        lkVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.y51.h) {
                            znVar.Y.setFieldText("");
                            lk lkVar2 = znVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = znVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            lkVar2.Z0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40261ea);
                        alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qe(znVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.f18622a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f36797a) {
            case 11:
                zn znVar = this.f36798b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    ii iiVar = new ii(znVar, znVar, znVar.getParentActivity(), znVar.f40261ea, arrayList);
                    iiVar.setCalcMandatoryInsets(znVar.x9());
                    iiVar.setDimBehind(false);
                    znVar.A7(false);
                    znVar.showDialog(iiVar);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f36798b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    fj fjVar = new fj(znVar2, znVar2, znVar2.getParentActivity(), znVar2.f40261ea, arrayList);
                    fjVar.setCalcMandatoryInsets(znVar2.x9());
                    fjVar.setDimBehind(false);
                    znVar2.A7(false);
                    znVar2.showDialog(fjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36797a) {
            case 2:
                sk skVar = this.f36798b.B0;
                if (skVar != null) {
                    skVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f36798b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                this.f36798b.e9(true);
                return;
            case 6:
                zn znVar = this.f36798b;
                MessagePreviewParams messagePreviewParams = znVar.f40269f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar.T5);
                }
                znVar.j8();
                return;
            case 7:
                this.f36798b.ca(1);
                return;
            case 8:
                zn znVar2 = this.f36798b;
                znVar2.getMessagesController().unblockPeer(znVar2.f40263f.f18443id);
                return;
            case 10:
                this.f36798b.finishFragment();
                return;
            case 12:
                gg.k1 adapter = this.f36798b.I1.getAdapter();
                adapter.f9840w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.ra0 ra0Var = adapter.V;
                if (ra0Var != null) {
                    ra0Var.a(false);
                    return;
                }
                return;
            case 15:
                zn znVar3 = this.f36798b;
                znVar3.showDialog(new ul(znVar3, znVar3.getParentActivity(), znVar3));
                return;
            case 16:
                zn znVar4 = this.f36798b;
                znVar4.Q7();
                UndoView undoView = znVar4.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                zn znVar5 = this.f36798b;
                MessageObject messageObject = (MessageObject) znVar5.J4.get(Integer.valueOf(znVar5.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar5.f40379o6[0].get(znVar5.L4);
                }
                znVar5.cc(messageObject);
                return;
            case 19:
                zn znVar6 = this.f36798b;
                MessagePreviewParams messagePreviewParams2 = znVar6.f40269f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ca(0);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(boolean z10, boolean z11) {
        zn znVar = this.f36798b;
        znVar.M0.i(znVar.f40273fa.c(), z10, z11);
    }

    @Override
    public void i(int i10) {
        zn znVar = this.f36798b;
        if (i10 == 1) {
            znVar.U9();
        } else if (i10 == 2) {
            znVar.H9();
        } else if (i10 == 3) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.T5, znVar.d(), znVar.l1, new qg(znVar, 0));
        } else if (i10 == 4) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.T5, znVar.d(), znVar.f40349m1, new qg(znVar, 1));
        } else if (i10 == 6) {
            znVar.Y8(true);
        } else if (i10 == 5) {
            znVar.Y8(false);
        } else if (i10 == 0) {
            ai.g4 g4Var = znVar.J1;
            if (g4Var != null) {
                g4Var.I1(null, 0);
            }
            znVar.X9();
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        zn znVar = this.f36798b;
        znVar.getMessagesController().addUsersToChat(znVar.e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.T5, znVar.f40263f, znVar.e);
        znVar.Qc(true);
        znVar.oc(true);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) obj;
        zn znVar = this.f36798b;
        xn xnVar = znVar.f40261ea;
        TLRPC.WallPaper wallPaper = xnVar.h;
        if (znVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.i(d4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        zn znVar = this.f36798b;
        NotificationCenter notificationCenter = znVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(znVar, i10);
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        znVar.finishFragment();
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f40263f, znVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void g(TLRPC.User user) {
    }
}
