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
public final class me implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bo, MessagesStorage.BooleanCallback, org.telegram.ui.Components.mj0, ResultCallback, hh.d, ug.a, ug.b, h60, gs, org.telegram.ui.Components.bl0, ug.d, org.telegram.ui.Components.nk0, FlagSecureReason.FlagSecureCondition, iu0 {
    public final int f40540a;
    public final tn f40541b;

    public me(tn tnVar, int i10) {
        this.f40540a = i10;
        this.f40541b = tnVar;
    }

    @Override
    public void a() {
        tn tnVar = this.f40541b;
        tnVar.q9(1);
        tnVar.r9();
    }

    @Override
    public void b() {
        tn tnVar = this.f40541b;
        if (tnVar.f42989u3 == null && tnVar.getParentActivity() != null) {
            tnVar.Q7();
            tnVar.f42989u3.m(tnVar.P5, tnVar.f42801f, 8);
        }
    }

    @Override
    public boolean c(int i10, View view) {
        tn tnVar = this.f40541b;
        boolean z10 = false;
        if (tnVar.getParentActivity() != null) {
            rf.v0 adapter = tnVar.E1.getAdapter();
            if ((adapter.E != null || adapter.F != null) && i10 != 0) {
                rf.v0 adapter2 = tnVar.E1.getAdapter();
                if (adapter2.f47385s0 != null && !adapter2.f47366d0) {
                    return false;
                }
                Object J = tnVar.E1.getAdapter().J(i10 - 1);
                if (J instanceof rf.s0) {
                    rf.s0 s0Var = (rf.s0) J;
                    if (tnVar.E1.getAdapter().F != null && org.telegram.ui.Components.x41.h) {
                        tnVar.U.setFieldText("");
                        dk dkVar = tnVar.U;
                        String str = s0Var.f47347a;
                        TLRPC.Chat chat = tnVar.f42787e;
                        if (chat != null && chat.megagroup) {
                            z10 = true;
                        }
                        dkVar.a1(null, str, true, z10);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (tnVar.E1.getAdapter().F != null) {
                        if (org.telegram.ui.Components.x41.h) {
                            tnVar.U.setFieldText("");
                            dk dkVar2 = tnVar.U;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = tnVar.f42787e;
                            if (chat2 != null && chat2.megagroup) {
                                z10 = true;
                            }
                            dkVar2.a1(null, str2, true, z10);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearSearch);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new me(tnVar, 10));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        tnVar.showDialog(alertDialog$Builder.f22714a);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void d(TLRPC.Document document) {
        switch (this.f40540a) {
            case 2:
                tn.u0(this.f40541b, document);
                return;
            default:
                tn.v0(this.f40541b, document);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        switch (this.f40540a) {
            case 9:
                tn tnVar = this.f40541b;
                if (tnVar.getParentActivity() != null && tnVar.getParentActivity() != null) {
                    ai aiVar = new ai(tnVar, tnVar, tnVar.getParentActivity(), tnVar.f42746aa, arrayList);
                    aiVar.setCalcMandatoryInsets(tnVar.x9());
                    aiVar.setDimBehind(false);
                    tnVar.A7(false);
                    tnVar.showDialog(aiVar);
                    return;
                }
                return;
            default:
                tn tnVar2 = this.f40541b;
                if (tnVar2.getParentActivity() != null && tnVar2.getParentActivity() != null) {
                    xi xiVar = new xi(tnVar2, tnVar2, tnVar2.getParentActivity(), tnVar2.f42746aa, arrayList);
                    xiVar.setCalcMandatoryInsets(tnVar2.x9());
                    xiVar.setDimBehind(false);
                    tnVar2.A7(false);
                    tnVar2.showDialog(xiVar);
                    return;
                }
                return;
        }
    }

    @Override
    public void f(boolean z10, boolean z11) {
        tn tnVar = this.f40541b;
        tnVar.I0.i(tnVar.f42760ba.c(), z10, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40540a) {
            case 0:
                kk kkVar = this.f40541b.f43027x0;
                if (kkVar != null) {
                    kkVar.callOnClick();
                    return;
                }
                return;
            case 1:
                this.f40541b.finishFragment();
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            case 11:
            case 14:
            default:
                tn tnVar = this.f40541b;
                MessageObject messageObject = (MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4));
                if (messageObject == null) {
                    messageObject = (MessageObject) tnVar.f42870k6[0].get(tnVar.H4);
                }
                tnVar.cc(messageObject);
                return;
            case 4:
                tn tnVar2 = this.f40541b;
                MessagePreviewParams messagePreviewParams = tnVar2.f42755b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.updateForward(null, tnVar2.P5);
                }
                tnVar2.j8();
                return;
            case 5:
                this.f40541b.ca(1);
                return;
            case 6:
                tn tnVar3 = this.f40541b;
                tnVar3.getMessagesController().unblockPeer(tnVar3.f42801f.f22539id);
                return;
            case 8:
                this.f40541b.finishFragment();
                return;
            case 10:
                rf.v0 adapter = this.f40541b.E1.getAdapter();
                adapter.f47389w.c();
                adapter.E.clear();
                adapter.l();
                org.telegram.ui.Components.fa0 fa0Var = adapter.R;
                if (fa0Var != null) {
                    fa0Var.a(false);
                    return;
                }
                return;
            case 12:
                tn tnVar4 = this.f40541b;
                tnVar4.showDialog(new ol(tnVar4, tnVar4.getParentActivity(), tnVar4));
                return;
            case 13:
                tn tnVar5 = this.f40541b;
                tnVar5.Q7();
                UndoView undoView = tnVar5.f42989u3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 15:
                tn tnVar6 = this.f40541b;
                MessagePreviewParams messagePreviewParams2 = tnVar6.f42755b5;
                if (messagePreviewParams2 != null && messagePreviewParams2.quote != null) {
                    tnVar6.ca(0);
                    return;
                }
                return;
            case 16:
                this.f40541b.e9(true);
                return;
        }
    }

    @Override
    public void h(float[] fArr) {
        tn tnVar = this.f40541b;
        fArr[1] = tnVar.f42973t0.getBottom() - tnVar.f43023wa;
        fArr[0] = (tnVar.f42973t0.getTop() + tnVar.f42921o9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void j(int i10, ArrayList arrayList) {
        tn tnVar = this.f40541b;
        tnVar.getMessagesController().addUsersToChat(tnVar.f42787e, tnVar, arrayList, i10, null, null, null);
        tnVar.getMessagesController().hidePeerSettingsBar(tnVar.P5, tnVar.f42801f, tnVar.f42787e);
        tnVar.Qc(true);
        tnVar.oc(true);
    }

    @Override
    public void k(int i10) {
        tn tnVar = this.f40541b;
        if (i10 == 1) {
            tnVar.U9();
        } else if (i10 == 2) {
            tnVar.H9();
        } else if (i10 == 3) {
            tnVar.f43054z4 = true;
            tnVar.getMessagesController().getNextReactionMention(tnVar.P5, tnVar.b(), tnVar.f42827h1, new dg(tnVar, 0));
        } else if (i10 == 4) {
            tnVar.f43054z4 = true;
            tnVar.getMessagesController().getNextPollVotesMention(tnVar.P5, tnVar.b(), tnVar.f42839i1, new dg(tnVar, 1));
        } else if (i10 == 6) {
            tnVar.Y8(true);
        } else if (i10 == 5) {
            tnVar.Y8(false);
        } else if (i10 == 0) {
            lh.s2 s2Var = tnVar.F1;
            if (s2Var != null) {
                s2Var.I1(null, 0);
            }
            tnVar.X9();
        }
    }

    @Override
    public void onComplete(Object obj) {
        boolean z10;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) obj;
        tn tnVar = this.f40541b;
        rn rnVar = tnVar.f42746aa;
        TLRPC.WallPaper wallPaper = rnVar.h;
        if (tnVar.L5 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rnVar.i(b4Var, wallPaper, z10, null, false);
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(boolean z10) {
        tn tnVar = this.f40541b;
        NotificationCenter notificationCenter = tnVar.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(tnVar, i10);
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        tnVar.finishFragment();
        tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(tnVar.P5), tnVar.f42801f, tnVar.f42787e, Boolean.valueOf(z10));
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public boolean run() {
        tn tnVar = this.f40541b;
        return tnVar.h != null || tnVar.y9();
    }

    @Override
    public void i(TLRPC.User user) {
    }
}
