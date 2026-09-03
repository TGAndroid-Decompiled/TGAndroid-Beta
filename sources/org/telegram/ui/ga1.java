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
public final class ga1 {
    public TLRPC.User f37049a;
    public String f37050b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f20992id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f37049a.f20992id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f37049a, false);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final na1 na1Var, final org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z10;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z11 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f37049a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z4 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                long j10 = chatParticipant.user_id;
                if (j10 == this.f37049a.f20992id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
        b.h(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z12 = true;
        b.h(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z4 && tL_chatChannelParticipant == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(na1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var;
                d2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20846id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f37049a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ga1 f35419b;

                {
                    this.f35419b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ga1 ga1Var = this.f35419b;
                            final na1 na1Var2 = na1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            na1 na1Var3 = na1Var2;
                                            if (!na1Var3.isFinishing() && na1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                                if (d2VarArr3[0] != null) {
                                                    ga1 ga1Var2 = ga1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ga1Var2.f37049a.f20992id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ga1Var2.c(chatFull3, na1Var3, d2VarArr3, true);
                                                        return;
                                                    }
                                                    ga1Var2.c(chatFull3, na1Var3, d2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            na1 na1Var4 = na1Var2;
                                            if (!na1Var4.isFinishing() && na1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ga1 ga1Var3 = ga1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ga1Var3.c(chatFull4, na1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ga1Var3.c(chatFull4, na1Var4, d2VarArr4, false);
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
                            final ga1 ga1Var2 = this.f35419b;
                            final na1 na1Var3 = na1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            na1 na1Var32 = na1Var3;
                                            if (!na1Var32.isFinishing() && na1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ga1 ga1Var22 = ga1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ga1Var22.f37049a.f20992id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ga1Var22.c(chatFull32, na1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ga1Var22.c(chatFull32, na1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            na1 na1Var4 = na1Var3;
                                            if (!na1Var4.isFinishing() && na1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ga1 ga1Var3 = ga1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ga1Var3.c(chatFull4, na1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ga1Var3.c(chatFull4, na1Var4, d2VarArr4, false);
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
        } else if (z4 && tL_chatChannelParticipant2 == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(na1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var2;
                d2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20846id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ga1 f35419b;

                {
                    this.f35419b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ga1 ga1Var = this.f35419b;
                            final na1 na1Var2 = na1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            na1 na1Var32 = na1Var2;
                                            if (!na1Var32.isFinishing() && na1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr2;
                                                if (d2VarArr32[0] != null) {
                                                    ga1 ga1Var22 = ga1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ga1Var22.f37049a.f20992id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ga1Var22.c(chatFull32, na1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ga1Var22.c(chatFull32, na1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            na1 na1Var4 = na1Var2;
                                            if (!na1Var4.isFinishing() && na1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ga1 ga1Var3 = ga1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ga1Var3.c(chatFull4, na1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ga1Var3.c(chatFull4, na1Var4, d2VarArr4, false);
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
                            final ga1 ga1Var2 = this.f35419b;
                            final na1 na1Var3 = na1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            na1 na1Var32 = na1Var3;
                                            if (!na1Var32.isFinishing() && na1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ga1 ga1Var22 = ga1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ga1Var22.f37049a.f20992id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ga1Var22.c(chatFull32, na1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ga1Var22.c(chatFull32, na1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            na1 na1Var4 = na1Var3;
                                            if (!na1Var4.isFinishing() && na1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ga1 ga1Var3 = ga1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ga1Var3.c(chatFull4, na1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ga1Var3.c(chatFull4, na1Var4, d2VarArr4, false);
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
            org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
            if (d2Var3 != null) {
                d2Var3.dismiss();
                d2VarArr[0] = null;
            }
            if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.add_admins) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z10 = false;
                }
                if (z10) {
                    if (channelParticipant.admin_rights != null) {
                        z12 = false;
                    }
                    if (z12) {
                        str = "SetAsAdmin";
                        i10 = R.string.SetAsAdmin;
                    } else {
                        str = "EditAdminRights";
                        i10 = R.string.EditAdminRights;
                    }
                    arrayList2.add(LocaleController.getString(str, i10));
                    if (z12) {
                        i11 = R.drawable.msg_admins;
                    } else {
                        i11 = R.drawable.msg_permissions;
                    }
                    b.h(i11, 0, arrayList4, arrayList3);
                    z11 = z12;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(na1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z13 = z11;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ga1 ga1Var = ga1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    na1 na1Var2 = na1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = ga1Var.f37049a.f20992id;
                        long j12 = chatFull2.f20846id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        ea1 ea1Var = new ea1(ga1Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, na1Var2);
                        ea1Var.U0 = new fa1(tL_chatChannelParticipant4, z14, zArr);
                        na1Var2.presentFragment(ea1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ga1Var.b(na1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f20846id);
                        bundle.putLong("search_from_user_id", ga1Var.f37049a.f20992id);
                        na1Var2.presentFragment(new xn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.f21168a;
            d2Var4.M = charSequenceArr;
            d2Var4.N = intArray;
            d2Var4.J = onClickListener;
            na1Var.showDialog(d2Var4);
        }
    }
}
