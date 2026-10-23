package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n91 {
    public TLRPC.User f39831a;
    public String f39832b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f20490id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f39831a.f20490id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f39831a, false);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final u91 u91Var, final org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f39831a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z10 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                long j10 = chatParticipant.user_id;
                if (j10 == this.f39831a.f20490id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        } else {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        org.telegram.ui.Cells.b1.n(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.b1.n(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(u91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var;
                c2Var.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20344id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f39831a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final n91 f38130b;

                {
                    this.f38130b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final n91 n91Var = this.f38130b;
                            final u91 u91Var2 = u91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            u91 u91Var3 = u91Var2;
                                            if (!u91Var3.isFinishing() && u91Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr2;
                                                if (c2VarArr3[0] != null) {
                                                    n91 n91Var2 = n91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = n91Var2.f39831a.f20490id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n91Var2.c(chatFull3, u91Var3, c2VarArr3, true);
                                                        return;
                                                    }
                                                    n91Var2.c(chatFull3, u91Var3, c2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            u91 u91Var4 = u91Var2;
                                            if (!u91Var4.isFinishing() && u91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    n91 n91Var3 = n91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n91Var3.c(chatFull4, u91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    n91Var3.c(chatFull4, u91Var4, c2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final n91 n91Var2 = this.f38130b;
                            final u91 u91Var3 = u91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            u91 u91Var32 = u91Var3;
                                            if (!u91Var32.isFinishing() && u91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    n91 n91Var22 = n91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = n91Var22.f39831a.f20490id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n91Var22.c(chatFull32, u91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    n91Var22.c(chatFull32, u91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            u91 u91Var4 = u91Var3;
                                            if (!u91Var4.isFinishing() && u91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    n91 n91Var3 = n91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n91Var3.c(chatFull4, u91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    n91Var3.c(chatFull4, u91Var4, c2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else if (z10 && tL_chatChannelParticipant2 == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(u91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var2;
                c2Var2.r(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20344id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final n91 f38130b;

                {
                    this.f38130b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final n91 n91Var = this.f38130b;
                            final u91 u91Var2 = u91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            u91 u91Var32 = u91Var2;
                                            if (!u91Var32.isFinishing() && u91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr2;
                                                if (c2VarArr32[0] != null) {
                                                    n91 n91Var22 = n91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = n91Var22.f39831a.f20490id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n91Var22.c(chatFull32, u91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    n91Var22.c(chatFull32, u91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            u91 u91Var4 = u91Var2;
                                            if (!u91Var4.isFinishing() && u91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    n91 n91Var3 = n91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n91Var3.c(chatFull4, u91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    n91Var3.c(chatFull4, u91Var4, c2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final n91 n91Var2 = this.f38130b;
                            final u91 u91Var3 = u91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            u91 u91Var32 = u91Var3;
                                            if (!u91Var32.isFinishing() && u91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    n91 n91Var22 = n91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = n91Var22.f39831a.f20490id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        n91Var22.c(chatFull32, u91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    n91Var22.c(chatFull32, u91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            u91 u91Var4 = u91Var3;
                                            if (!u91Var4.isFinishing() && u91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    n91 n91Var3 = n91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        n91Var3.c(chatFull4, u91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    n91Var3.c(chatFull4, u91Var4, c2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
            if (c2Var3 != null) {
                c2Var3.dismiss();
                c2VarArr[0] = null;
            }
            if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.add_admins) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z11 = false;
                }
                if (z11) {
                    if (channelParticipant.admin_rights != null) {
                        z13 = false;
                    }
                    if (z13) {
                        str = "SetAsAdmin";
                        i10 = R.string.SetAsAdmin;
                    } else {
                        str = "EditAdminRights";
                        i10 = R.string.EditAdminRights;
                    }
                    arrayList2.add(LocaleController.getString(str, i10));
                    if (z13) {
                        i11 = R.drawable.msg_admins;
                    } else {
                        i11 = R.drawable.msg_permissions;
                    }
                    org.telegram.ui.Cells.b1.n(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u91Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    n91 n91Var = n91.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    u91 u91Var2 = u91Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = n91Var.f39831a.f20490id;
                        long j12 = chatFull2.f20344id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        l91 l91Var = new l91(n91Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, u91Var2);
                        l91Var.Y0 = new m91(tL_chatChannelParticipant4, z15, zArr);
                        u91Var2.presentFragment(l91Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        n91Var.b(u91Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f20344id);
                        bundle.putLong("search_from_user_id", n91Var.f39831a.f20490id);
                        u91Var2.presentFragment(new sn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder.f20678a;
            c2Var4.P = charSequenceArr;
            c2Var4.Q = intArray;
            c2Var4.M = onClickListener;
            u91Var.showDialog(c2Var4);
        }
    }
}
