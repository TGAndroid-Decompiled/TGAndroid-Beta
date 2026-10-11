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
public final class qe implements org.telegram.ui.Components.v60, org.telegram.ui.Components.y60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.yo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.tk0, ResultCallback, wh.c, jh.a, jh.b, x60, os, org.telegram.ui.Components.im0, jh.d, org.telegram.ui.Components.ul0 {
    public final int f41155a;
    public final zn f41156b;

    public qe(zn znVar, int i10) {
        this.f41155a = i10;
        this.f41156b = znVar;
    }

    @Override
    public void a() {
        zn znVar = this.f41156b;
        znVar.v9(1);
        znVar.w9();
    }

    @Override
    public void b() {
        zn znVar = this.f41156b;
        if (znVar.y3 == null && znVar.getParentActivity() != null) {
            znVar.T7();
            znVar.y3.m(znVar.T5, znVar.f44764f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f41155a) {
            case 4:
                zn.j0(this.f41156b, document);
                return;
            default:
                zn.D0(this.f41156b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        zn znVar = this.f41156b;
        boolean z10 = false;
        if (znVar.getParentActivity() != null) {
            gg.j1 adapter = znVar.I1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                gg.j1 adapter2 = znVar.I1.getAdapter();
                if (adapter2.f10693w0 != null && !adapter2.f10675h0) {
                    return false;
                }
                Object J = znVar.I1.getAdapter().J(i10 - 1);
                if (J instanceof gg.g1) {
                    gg.g1 g1Var = (gg.g1) J;
                    if (znVar.I1.getAdapter().J != null && org.telegram.ui.Components.s61.h) {
                        znVar.Y.setFieldText("");
                        ok okVar = znVar.Y;
                        String str = g1Var.f10611a;
                        TLRPC.Chat chat = znVar.f44752e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        okVar.Y0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (znVar.I1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.s61.h) {
                            znVar.Y.setFieldText("");
                            ok okVar2 = znVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = znVar.f44752e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            okVar2.Y0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qe(znVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        znVar.showDialog(alertDialog$Builder.f20368a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f41155a) {
            case 11:
                zn znVar = this.f41156b;
                if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                    ji jiVar = new ji(znVar, znVar, znVar.getParentActivity(), znVar.f44762ea, arrayList);
                    jiVar.setCalcMandatoryInsets(znVar.C9());
                    jiVar.setDimBehind(false);
                    znVar.D7(false);
                    znVar.showDialog(jiVar);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f41156b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    gj gjVar = new gj(znVar2, znVar2, znVar2.getParentActivity(), znVar2.f44762ea, arrayList);
                    gjVar.setCalcMandatoryInsets(znVar2.C9());
                    gjVar.setDimBehind(false);
                    znVar2.D7(false);
                    znVar2.showDialog(gjVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41155a) {
            case 2:
                uk ukVar = this.f41156b.B0;
                if (ukVar != null) {
                    ukVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f41156b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                zn znVar = this.f41156b;
                MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
                if (messageObject == null) {
                    messageObject = (MessageObject) znVar.f44879o6[0].get(znVar.L4);
                }
                znVar.gc(messageObject);
                return;
            case 6:
                zn znVar2 = this.f41156b;
                MessagePreviewParams messagePreviewParams = znVar2.f44770f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, znVar2.T5);
                }
                znVar2.m8();
                return;
            case 7:
                this.f41156b.ha(1);
                return;
            case 8:
                zn znVar3 = this.f41156b;
                znVar3.getMessagesController().unblockPeer(znVar3.f44764f.f20179id);
                return;
            case 10:
                this.f41156b.finishFragment();
                return;
            case 12:
                gg.j1 adapter = this.f41156b.I1.getAdapter();
                adapter.f10692w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.lb0 lb0Var = adapter.V;
                if (lb0Var != null) {
                    lb0Var.a(false);
                    return;
                }
                return;
            case 15:
                zn znVar4 = this.f41156b;
                znVar4.showDialog(new xl(znVar4, znVar4.getParentActivity(), znVar4));
                return;
            case 16:
                zn znVar5 = this.f41156b;
                znVar5.T7();
                UndoView undoView = znVar5.y3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                zn znVar6 = this.f41156b;
                MessagePreviewParams messagePreviewParams2 = znVar6.f44770f5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    znVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f41156b.j9(true);
                return;
        }
    }

    @Override
    public void g(boolean z10, boolean z11) {
        zn znVar = this.f41156b;
        znVar.M0.i(znVar.f44774fa.c(), z10, z11);
    }

    @Override
    public void h(int i10) {
        zn znVar = this.f41156b;
        if (i10 == 1) {
            znVar.Z9();
        } else if (i10 == 2) {
            znVar.M9();
        } else if (i10 == 3) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextReactionMention(znVar.T5, znVar.d(), znVar.l1, new mg(znVar, 0));
        } else if (i10 == 4) {
            znVar.D4 = true;
            znVar.getMessagesController().getNextPollVotesMention(znVar.T5, znVar.d(), znVar.f44849m1, new mg(znVar, 1));
        } else if (i10 == 6) {
            znVar.d9(true);
        } else if (i10 == 5) {
            znVar.d9(false);
        } else if (i10 == 0) {
            ai.h4 h4Var = znVar.J1;
            if (h4Var != null) {
                h4Var.L1(null, 0);
            }
            znVar.ca();
        }
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        zn znVar = this.f41156b;
        znVar.getMessagesController().addUsersToChat(znVar.f44752e, znVar, arrayList, i10, null, null, null);
        znVar.getMessagesController().hidePeerSettingsBar(znVar.T5, znVar.f44764f, znVar.f44752e);
        znVar.Uc(true);
        znVar.sc(true);
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        zn znVar = this.f41156b;
        xn xnVar = znVar.f44762ea;
        TLRPC.WallPaper wallPaper = xnVar.h;
        if (znVar.P5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        zn znVar = this.f41156b;
        NotificationCenter notificationCenter = znVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(znVar, i10);
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        znVar.finishFragment();
        znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(znVar.T5), znVar.f44764f, znVar.f44752e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
