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
public final class pe implements org.telegram.ui.Components.o60, org.telegram.ui.Components.r60, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.so, MessagesStorage.BooleanCallback, org.telegram.ui.Components.nk0, ResultCallback, xh.c, kh.a, k60, gs, kh.b, org.telegram.ui.Components.cm0, kh.d, org.telegram.ui.Components.ol0 {
    public final int f40455a;
    public final sn f40456b;

    public pe(sn snVar, int i10) {
        this.f40455a = i10;
        this.f40456b = snVar;
    }

    @Override
    public void a() {
        sn snVar = this.f40456b;
        snVar.v9(1);
        snVar.w9();
    }

    @Override
    public void b() {
        sn snVar = this.f40456b;
        if (snVar.K3 == null && snVar.getParentActivity() != null) {
            snVar.T7();
            snVar.K3.m(snVar.f41519f6, snVar.f41512f, 8);
        }
    }

    @Override
    public void c(TLRPC.Document document) {
        switch (this.f40455a) {
            case 4:
                sn.i0(this.f40456b, document);
                return;
            default:
                sn.E0(this.f40456b, document);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        sn snVar = this.f40456b;
        boolean z10 = false;
        if (snVar.getParentActivity() != null) {
            hg.j1 adapter = snVar.U1.getAdapter();
            if ((adapter.I != null || adapter.J != null) && i10 != 0) {
                hg.j1 adapter2 = snVar.U1.getAdapter();
                if (adapter2.f11974w0 != null && !adapter2.f11956h0) {
                    return false;
                }
                Object J = snVar.U1.getAdapter().J(i10 - 1);
                if (J instanceof hg.g1) {
                    hg.g1 g1Var = (hg.g1) J;
                    if (snVar.U1.getAdapter().J != null && org.telegram.ui.Components.n61.h) {
                        snVar.Y.setFieldText("");
                        gk gkVar = snVar.Y;
                        String str = g1Var.f11896a;
                        TLRPC.Chat chat = snVar.e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        gkVar.X0(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (snVar.U1.getAdapter().J != null) {
                        if (org.telegram.ui.Components.n61.h) {
                            snVar.Y.setFieldText("");
                            gk gkVar2 = snVar.Y;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = snVar.e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            gkVar2.X0(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41654qa);
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pe(snVar, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        snVar.showDialog(alertDialog$Builder.f20678a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f40455a) {
            case 11:
                sn snVar = this.f40456b;
                if (snVar.getParentActivity() != null && snVar.getParentActivity() != null) {
                    ai aiVar = new ai(snVar, snVar, snVar.getParentActivity(), snVar.f41654qa, arrayList);
                    aiVar.setCalcMandatoryInsets(snVar.C9());
                    aiVar.setDimBehind(false);
                    snVar.D7(false);
                    snVar.showDialog(aiVar);
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40456b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    xi xiVar = new xi(snVar2, snVar2, snVar2.getParentActivity(), snVar2.f41654qa, arrayList);
                    xiVar.setCalcMandatoryInsets(snVar2.C9());
                    xiVar.setDimBehind(false);
                    snVar2.D7(false);
                    snVar2.showDialog(xiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        sn snVar = this.f40456b;
        snVar.Y0.i(snVar.f41668ra.b(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40455a) {
            case 2:
                mk mkVar = this.f40456b.B0;
                if (mkVar != null) {
                    mkVar.callOnClick();
                    return;
                }
                return;
            case 3:
                this.f40456b.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                sn snVar = this.f40456b;
                MessageObject messageObject = (MessageObject) snVar.V4.get(Integer.valueOf(snVar.X4));
                if (messageObject == null) {
                    messageObject = (MessageObject) snVar.A6[0].get(snVar.X4);
                }
                snVar.jc(messageObject);
                return;
            case 6:
                sn snVar2 = this.f40456b;
                MessagePreviewParams messagePreviewParams = snVar2.f41663r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, snVar2.f41519f6);
                }
                snVar2.m8();
                return;
            case 7:
                this.f40456b.ha(1);
                return;
            case 8:
                sn snVar3 = this.f40456b;
                snVar3.getMessagesController().unblockPeer(snVar3.f41512f.f20490id);
                return;
            case 10:
                this.f40456b.finishFragment();
                return;
            case 12:
                hg.j1 adapter = this.f40456b.U1.getAdapter();
                adapter.f11973w.c();
                adapter.I.clear();
                adapter.l();
                org.telegram.ui.Components.eb0 eb0Var = adapter.V;
                if (eb0Var != null) {
                    eb0Var.a(false);
                    return;
                }
                return;
            case 15:
                sn snVar4 = this.f40456b;
                snVar4.showDialog(new pl(snVar4, snVar4.getParentActivity(), snVar4));
                return;
            case 16:
                sn snVar5 = this.f40456b;
                snVar5.T7();
                UndoView undoView = snVar5.K3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                sn snVar6 = this.f40456b;
                MessagePreviewParams messagePreviewParams2 = snVar6.f41663r5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    snVar6.ha(0);
                    return;
                }
                return;
            case 18:
                this.f40456b.j9(true);
                return;
        }
    }

    @Override
    public void i(int i10, ArrayList arrayList) {
        sn snVar = this.f40456b;
        snVar.getMessagesController().addUsersToChat(snVar.e, snVar, arrayList, i10, null, null, null);
        snVar.getMessagesController().hidePeerSettingsBar(snVar.f41519f6, snVar.f41512f, snVar.e);
        snVar.Xc(true);
        snVar.vc(true);
    }

    @Override
    public void j(int i10) {
        sn snVar = this.f40456b;
        if (i10 == 1) {
            snVar.Z9();
        } else if (i10 == 2) {
            snVar.M9();
        } else if (i10 == 3) {
            snVar.P4 = true;
            snVar.getMessagesController().getNextReactionMention(snVar.f41519f6, snVar.d(), snVar.f41738x1, new hg(snVar, 0));
        } else if (i10 == 4) {
            snVar.P4 = true;
            snVar.getMessagesController().getNextPollVotesMention(snVar.f41519f6, snVar.d(), snVar.f41752y1, new hg(snVar, 1));
        } else if (i10 == 6) {
            snVar.d9(true);
        } else if (i10 == 5) {
            snVar.d9(false);
        } else if (i10 == 0) {
            ci.a3 a3Var = snVar.V1;
            if (a3Var != null) {
                a3Var.P1(null, 0);
            }
            snVar.ca();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) obj;
        sn snVar = this.f40456b;
        qn qnVar = snVar.f41654qa;
        TLRPC.WallPaper wallPaper = qnVar.f40872g;
        if (snVar.f41467b6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.q(f4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        sn snVar = this.f40456b;
        NotificationCenter notificationCenter = snVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(snVar, i10);
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        snVar.finishFragment();
        snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(snVar.f41519f6), snVar.f41512f, snVar.e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void h(TLRPC.User user) {
    }
}
