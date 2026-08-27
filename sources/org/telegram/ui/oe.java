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

public final class oe implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.vn, MessagesStorage.BooleanCallback, org.telegram.ui.Components.dj0, ResultCallback, fh.d, sg.a, sg.b, j60, is, org.telegram.ui.Components.rk0, sg.d, org.telegram.ui.Components.ek0, FlagSecureReason.FlagSecureCondition, lu0 {

    public final int f41068a;

    public final rn f41069b;

    public oe(rn rnVar, int i10) {
        this.f41068a = i10;
        this.f41069b = rnVar;
    }

    @Override
    public boolean a(int i10, View view) {
        rn rnVar = this.f41069b;
        boolean z10 = false;
        if (rnVar.getParentActivity() != null) {
            pf.u0 adapter = rnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i10 != 0) {
                pf.u0 adapter2 = rnVar.E1.getAdapter();
                if (adapter2.f45944s0 != null && !adapter2.f45925d0) {
                    return false;
                }
                Object objJ = rnVar.E1.getAdapter().J(i10 - 1);
                if (objJ instanceof pf.r0) {
                    pf.r0 r0Var = (pf.r0) objJ;
                    if (rnVar.E1.getAdapter().F != null && org.telegram.ui.Components.o41.h) {
                        rnVar.U.setFieldText("");
                        ck ckVar = rnVar.U;
                        String str = r0Var.f45906a;
                        TLRPC.Chat chat = rnVar.f42026e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        ckVar.Z0(null, str, true, z10);
                        return true;
                    }
                } else if (objJ instanceof String) {
                    if (rnVar.E1.getAdapter().F == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.f41983aa);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new oe(rnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        rnVar.showDialog(alertDialog$Builder.f22702a);
                        return true;
                    }
                    if (org.telegram.ui.Components.o41.h) {
                        rnVar.U.setFieldText("");
                        ck ckVar2 = rnVar.U;
                        String str2 = (String) objJ;
                        TLRPC.Chat chat2 = rnVar.f42026e;
                        if (chat2 != null && chat2.megagroup) {
                            z10 = true;
                        }
                        ckVar2.Z0(null, str2, true, z10);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void b() {
        rn rnVar = this.f41069b;
        rnVar.q9(1);
        rnVar.r9();
    }

    @Override
    public void c() {
        rn rnVar = this.f41069b;
        if (rnVar.f42229u3 != null || rnVar.getParentActivity() == null) {
            return;
        }
        rnVar.Q7();
        rnVar.f42229u3.m(rnVar.P5, rnVar.f42039f, 8);
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f41068a) {
            case 2:
                rn.u0(this.f41069b, document);
                break;
            default:
                rn.v0(this.f41069b, document);
                break;
        }
    }

    @Override
    public void e(boolean z10, boolean z11) {
        rn rnVar = this.f41069b;
        rnVar.I0.i(rnVar.f41997ba.c(), z10, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41068a) {
            case 0:
                jk jkVar = this.f41069b.f42264x0;
                if (jkVar != null) {
                    jkVar.callOnClick();
                }
                break;
            case 1:
                this.f41069b.finishFragment();
                break;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                rn rnVar = this.f41069b;
                MessageObject messageObject = (MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) rnVar.f42109k6[0].get(rnVar.H4);
                }
                rnVar.cc(messageObject);
                break;
            case 4:
                rn rnVar2 = this.f41069b;
                MessagePreviewParams messagePreviewParams = rnVar2.f41992b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, rnVar2.P5);
                }
                rnVar2.j8();
                break;
            case 5:
                this.f41069b.ca(1);
                break;
            case 6:
                rn rnVar3 = this.f41069b;
                rnVar3.getMessagesController().unblockPeer(rnVar3.f42039f.f22527id);
                break;
            case 8:
                this.f41069b.finishFragment();
                break;
            case 10:
                pf.u0 adapter = this.f41069b.E1.getAdapter();
                adapter.f45948w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.v90 v90Var = adapter.R;
                if (v90Var != null) {
                    v90Var.a(false);
                }
                break;
            case 12:
                rn rnVar4 = this.f41069b;
                rnVar4.showDialog(new nl(rnVar4, rnVar4.getParentActivity(), rnVar4));
                break;
            case 13:
                rn rnVar5 = this.f41069b;
                rnVar5.Q7();
                UndoView undoView = rnVar5.f42229u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    break;
                }
                break;
            case 15:
                rn rnVar6 = this.f41069b;
                MessagePreviewParams messagePreviewParams2 = rnVar6.f41992b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    rnVar6.ca(0);
                    break;
                }
                break;
            case 16:
                this.f41069b.e9(true);
                break;
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        switch (this.f41068a) {
            case 9:
                rn rnVar = this.f41069b;
                if (rnVar.getParentActivity() != null && rnVar.getParentActivity() != null) {
                    zh zhVar = new zh(rnVar, rnVar, rnVar.getParentActivity(), rnVar.f41983aa, arrayList);
                    zhVar.setCalcMandatoryInsets(rnVar.x9());
                    zhVar.setDimBehind(false);
                    rnVar.A7(false);
                    rnVar.showDialog(zhVar);
                    break;
                }
                break;
            default:
                rn rnVar2 = this.f41069b;
                if (rnVar2.getParentActivity() != null && rnVar2.getParentActivity() != null) {
                    wi wiVar = new wi(rnVar2, rnVar2, rnVar2.getParentActivity(), rnVar2.f41983aa, arrayList);
                    wiVar.setCalcMandatoryInsets(rnVar2.x9());
                    wiVar.setDimBehind(false);
                    rnVar2.A7(false);
                    rnVar2.showDialog(wiVar);
                    break;
                }
                break;
        }
    }

    @Override
    public void h(float[] fArr) {
        rn rnVar = this.f41069b;
        fArr[1] = rnVar.f42213t0.getBottom() - rnVar.wa;
        fArr[0] = (rnVar.f42213t0.getTop() + rnVar.f42160o9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        rn rnVar = this.f41069b;
        rnVar.getMessagesController().addUsersToChat(rnVar.f42026e, rnVar, arrayList, i10, null, null, null);
        rnVar.getMessagesController().hidePeerSettingsBar(rnVar.P5, rnVar.f42039f, rnVar.f42026e);
        rnVar.Qc(true);
        rnVar.oc(true);
    }

    @Override
    public void k(int i10) {
        rn rnVar = this.f41069b;
        if (i10 == 1) {
            rnVar.U9();
            return;
        }
        if (i10 == 2) {
            rnVar.H9();
            return;
        }
        if (i10 == 3) {
            rnVar.f42294z4 = true;
            rnVar.getMessagesController().getNextReactionMention(rnVar.P5, rnVar.b(), rnVar.f42065h1, new hg(rnVar, 0));
            return;
        }
        if (i10 == 4) {
            rnVar.f42294z4 = true;
            rnVar.getMessagesController().getNextPollVotesMention(rnVar.P5, rnVar.b(), rnVar.f42078i1, new hg(rnVar, 1));
            return;
        }
        if (i10 == 6) {
            rnVar.Y8(true);
            return;
        }
        if (i10 == 5) {
            rnVar.Y8(false);
        } else if (i10 == 0) {
            jh.t2 t2Var = rnVar.F1;
            if (t2Var != null) {
                t2Var.I1(null, 0);
            }
            rnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        rn rnVar = this.f41069b;
        pn pnVar = rnVar.f41983aa;
        pnVar.i(b4Var, pnVar.h, rnVar.L5 != 0, null, false);
    }

    @Override
    public void onError(Throwable th) {
        org.telegram.tgnet.k.a(this, th);
    }

    @Override
    public void run(boolean z10) {
        rn rnVar = this.f41069b;
        NotificationCenter notificationCenter = rnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(rnVar, i10);
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        rnVar.finishFragment();
        rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(rnVar.P5), rnVar.f42039f, rnVar.f42026e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public boolean run() {
        rn rnVar = this.f41069b;
        return rnVar.h != null || rnVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
