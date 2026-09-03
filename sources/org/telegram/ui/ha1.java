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
public final class ha1 {
    public TLRPC.User f34624a;
    public String f34625b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f19306id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f34624a.f19306id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f34624a, false);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final oa1 oa1Var, final org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z10;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z11 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f34624a, false);
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
                if (j10 == this.f34624a.f19306id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(oa1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var;
                d2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19160id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f34624a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ha1 f33060b;

                {
                    this.f33060b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ha1 ha1Var = this.f33060b;
                            final oa1 oa1Var2 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            oa1 oa1Var3 = oa1Var2;
                                            if (!oa1Var3.isFinishing() && oa1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                                if (d2VarArr3[0] != null) {
                                                    ha1 ha1Var2 = ha1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var2.f34624a.f19306id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var2.c(chatFull3, oa1Var3, d2VarArr3, true);
                                                        return;
                                                    }
                                                    ha1Var2.c(chatFull3, oa1Var3, d2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            oa1 oa1Var4 = oa1Var2;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
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
                            final ha1 ha1Var2 = this.f33060b;
                            final oa1 oa1Var3 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var3;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.f34624a.f19306id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            oa1 oa1Var4 = oa1Var3;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
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
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(oa1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var2;
                d2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19160id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ha1 f33060b;

                {
                    this.f33060b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ha1 ha1Var = this.f33060b;
                            final oa1 oa1Var2 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var2;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr2;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.f34624a.f19306id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            oa1 oa1Var4 = oa1Var2;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
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
                            final ha1 ha1Var2 = this.f33060b;
                            final oa1 oa1Var3 = oa1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            oa1 oa1Var32 = oa1Var3;
                                            if (!oa1Var32.isFinishing() && oa1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ha1 ha1Var22 = ha1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ha1Var22.f34624a.f19306id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ha1Var22.c(chatFull32, oa1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            oa1 oa1Var4 = oa1Var3;
                                            if (!oa1Var4.isFinishing() && oa1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ha1 ha1Var3 = ha1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ha1Var3.c(chatFull4, oa1Var4, d2VarArr4, false);
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oa1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z13 = z11;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ha1 ha1Var = ha1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    oa1 oa1Var2 = oa1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = ha1Var.f34624a.f19306id;
                        long j12 = chatFull2.f19160id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        fa1 fa1Var = new fa1(ha1Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, oa1Var2);
                        fa1Var.U0 = new ga1(tL_chatChannelParticipant4, z14, zArr);
                        oa1Var2.presentFragment(fa1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ha1Var.b(oa1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f19160id);
                        bundle.putLong("search_from_user_id", ha1Var.f34624a.f19306id);
                        oa1Var2.presentFragment(new zn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.f19478a;
            d2Var4.M = charSequenceArr;
            d2Var4.N = intArray;
            d2Var4.J = onClickListener;
            oa1Var.showDialog(d2Var4);
        }
    }
}
