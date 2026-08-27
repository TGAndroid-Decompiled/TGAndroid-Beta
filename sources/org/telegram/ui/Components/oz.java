package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class oz implements qk0, rk0 {

    public final yz f31447a;

    public oz(yz yzVar) {
        this.f31447a = yzVar;
    }

    @Override
    public boolean a(int i10, View view) {
        MessagesController.DialogFilter dialogFilter;
        boolean z10;
        MessagesController.DialogFilter dialogFilter2;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        int i13;
        int i14;
        int i15;
        boolean z16;
        TLRPC.Chat chat;
        yz yzVar = this.f31447a;
        tz tzVar = yzVar.F;
        if (!((org.telegram.ui.gw) tzVar).f38485b.f38527f2 && !yzVar.f35085n) {
            wz wzVar = (wz) view;
            org.telegram.ui.gw gwVar = (org.telegram.ui.gw) tzVar;
            org.telegram.ui.gy gyVar = gwVar.f38485b;
            if (gyVar.N0 == 0 && !((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t() && gyVar.P == 0.0f) {
                b70 b70Var = gyVar.H0;
                if (b70Var != null && b70Var.D()) {
                    gyVar.H0.u();
                    gyVar.H0 = null;
                    return false;
                }
                if (wzVar.getId() == gyVar.f38604v0.getDefaultTabId()) {
                    dialogFilter = null;
                } else {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = gyVar.getMessagesController().getDialogFilters();
                    int id2 = wzVar.getId();
                    if (dialogFilters == null || id2 < 0 || id2 >= dialogFilters.size()) {
                        dialogFilter = null;
                    } else {
                        dialogFilter = dialogFilters.get(wzVar.getId());
                    }
                }
                boolean z17 = dialogFilter == null;
                boolean[] zArr = {true};
                MessagesController messagesController = gyVar.getMessagesController();
                ArrayList arrayList = new ArrayList(z17 ? messagesController.getDialogs(gyVar.R2) : messagesController.getAllDialogs());
                if (dialogFilter != null) {
                    MessagesController.DialogFilter dialogFilter3 = gyVar.getMessagesController().getDialogFilters().get(wzVar.getId());
                    if (dialogFilter3 != null) {
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            boolean z18 = z17;
                            if (!dialogFilter3.includesDialog(gyVar.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i16)).f22384id)) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                            z17 = z18;
                        }
                        z10 = z17;
                        z11 = dialogFilter3.isChatlist() || (dialogFilter3.neverShow.isEmpty() && (dialogFilter3.flags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0);
                        if (z11) {
                            for (int i17 = 0; i17 < dialogFilter3.alwaysShow.size(); i17++) {
                                long jLongValue = dialogFilter3.alwaysShow.get(i17).longValue();
                                if (jLongValue < 0 && (chat = gyVar.getMessagesController().getChat(Long.valueOf(-jLongValue))) != null && org.telegram.ui.q00.g0(chat)) {
                                    zArr[0] = false;
                                    break;
                                }
                            }
                        }
                    } else {
                        z10 = z17;
                        z11 = false;
                    }
                    if (arrayList.isEmpty()) {
                        dialogFilter2 = dialogFilter3;
                    } else {
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList.size()) {
                                dialogFilter2 = dialogFilter3;
                                z16 = true;
                                break;
                            }
                            dialogFilter2 = dialogFilter3;
                            int i19 = i18;
                            if (!gyVar.getMessagesController().isDialogMuted(((TLRPC.Dialog) arrayList.get(i18)).f22384id, 0L)) {
                                z16 = false;
                                break;
                            }
                            i18 = i19 + 1;
                            dialogFilter3 = dialogFilter2;
                        }
                        z12 = !z16;
                    }
                    z13 = false;
                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                        if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark || ((TLRPC.Dialog) arrayList.get(i11)).unread_count > 0) {
                            z13 = true;
                        }
                    }
                    b70 b70VarH = b70.H(gyVar, wzVar);
                    lv lvVar = new lv(3, (byte) 0);
                    Paint paint = new Paint(1);
                    lvVar.f30473c = paint;
                    lvVar.f30472b = new RectF();
                    paint.setColor(gwVar.f38485b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    b70VarH.W(lvVar);
                    if (gyVar.getMessagesController().getDialogFilters().size() > 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b70VarH.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ti(gwVar, 23), z14);
                    int i20 = R.drawable.msg_edit;
                    if (z10) {
                        i12 = R.string.FilterEditAll;
                    } else {
                        i12 = R.string.FilterEdit;
                    }
                    boolean z19 = z10;
                    b70VarH.c(i20, LocaleController.getString(i12), new hh.t5(gwVar, z19, dialogFilter, 22), false);
                    if (dialogFilter != null || arrayList.isEmpty()) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z12) {
                        i13 = R.drawable.msg_mute;
                    } else {
                        i13 = R.drawable.msg_unmute;
                    }
                    if (z12) {
                        i14 = R.string.FilterMuteAll;
                    } else {
                        i14 = R.string.FilterUnmuteAll;
                    }
                    b70VarH.l(i13, LocaleController.getString(i14), new hh.t5(gwVar, arrayList, z12, 23), z15);
                    b70VarH.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new r61(14, gwVar, arrayList), z13);
                    int i21 = R.drawable.msg_share;
                    if (dialogFilter2 == null && dialogFilter2.isMyChatlist()) {
                        i15 = -1;
                    } else {
                        i15 = 0;
                    }
                    b70VarH.l(i21, org.telegram.ui.q00.x0(i15, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.lq(gwVar, zArr, dialogFilter2, 3), z11);
                    b70VarH.m(!z19, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new r61(15, gwVar, dialogFilter));
                    b70VarH.f26992s = 96;
                    b70VarH.f26974i = 3;
                    b70VarH.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                    b70VarH.Z();
                    gyVar.H0 = b70VarH;
                    yzVar.B.d1(true);
                    return true;
                }
                z10 = z17;
                dialogFilter2 = null;
                z11 = false;
                z12 = false;
                z13 = false;
                while (i11 < arrayList.size()) {
                    if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                }
                b70 b70VarH2 = b70.H(gyVar, wzVar);
                lv lvVar2 = new lv(3, (byte) 0);
                Paint paint2 = new Paint(1);
                lvVar2.f30473c = paint2;
                lvVar2.f30472b = new RectF();
                paint2.setColor(gwVar.f38485b.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                b70VarH2.W(lvVar2);
                if (gyVar.getMessagesController().getDialogFilters().size() > 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                b70VarH2.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new org.telegram.ui.ti(gwVar, 23), z14);
                int i22 = R.drawable.msg_edit;
                if (z10) {
                    i12 = R.string.FilterEditAll;
                } else {
                    i12 = R.string.FilterEdit;
                }
                boolean z110 = z10;
                b70VarH2.c(i22, LocaleController.getString(i12), new hh.t5(gwVar, z110, dialogFilter, 22), false);
                if (dialogFilter != null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z12) {
                    i13 = R.drawable.msg_mute;
                } else {
                    i13 = R.drawable.msg_unmute;
                }
                if (z12) {
                    i14 = R.string.FilterMuteAll;
                } else {
                    i14 = R.string.FilterUnmuteAll;
                }
                b70VarH2.l(i13, LocaleController.getString(i14), new hh.t5(gwVar, arrayList, z12, 23), z15);
                b70VarH2.l(R.drawable.msg_markread, LocaleController.getString(R.string.MarkAllAsRead), new r61(14, gwVar, arrayList), z13);
                int i23 = R.drawable.msg_share;
                if (dialogFilter2 == null) {
                    i15 = 0;
                } else {
                    i15 = 0;
                }
                b70VarH2.l(i23, org.telegram.ui.q00.x0(i15, LocaleController.getString(R.string.LinkActionShare), true), new org.telegram.ui.lq(gwVar, zArr, dialogFilter2, 3), z11);
                b70VarH2.m(!z110, R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), true, new r61(15, gwVar, dialogFilter));
                b70VarH2.f26992s = 96;
                b70VarH2.f26974i = 3;
                b70VarH2.a0(AndroidUtilities.dp(-12.0f), AndroidUtilities.dp(-4.0f));
                b70VarH2.Z();
                gyVar.H0 = b70VarH2;
                yzVar.B.d1(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        yz yzVar = this.f31447a;
        tz tzVar = yzVar.F;
        if (((org.telegram.ui.gw) tzVar).f38485b.f38527f2) {
            return;
        }
        wz wzVar = (wz) view;
        if (!yzVar.f35085n) {
            if (i10 != yzVar.G || tzVar == null) {
                yzVar.f(wzVar.f34380b, i10);
                return;
            } else {
                ((org.telegram.ui.gw) tzVar).f38485b.x4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int iDp = AndroidUtilities.dp(6.0f);
            RectF rectF = wzVar.f34387f;
            float f12 = iDp;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.gw gwVar = (org.telegram.ui.gw) yzVar.F;
            gwVar.d(gwVar.f38485b.getMessagesController().getDialogFilters().get(wzVar.f34380b.f34072a));
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
