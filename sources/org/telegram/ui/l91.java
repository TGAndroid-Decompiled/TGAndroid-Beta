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
public final class l91 {
    public TLRPC.User f40087a;
    public String f40088b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f22527id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f40087a.f22527id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40087a, false);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final s91 s91Var, final org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i9;
        int i10;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40087a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z10 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i11);
                long j10 = chatParticipant.user_id;
                if (j10 == this.f40087a.f22527id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
        org.telegram.ui.Cells.j2.j(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.j2.j(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(s91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var;
                c2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f22381id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f40087a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final l91 f38484b;

                {
                    this.f38484b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final l91 l91Var = this.f38484b;
                            final s91 s91Var2 = s91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            s91 s91Var3 = s91Var2;
                                            if (!s91Var3.isFinishing() && s91Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr2;
                                                if (c2VarArr3[0] != null) {
                                                    l91 l91Var2 = l91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = l91Var2.f40087a.f22527id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        l91Var2.c(chatFull3, s91Var3, c2VarArr3, true);
                                                        return;
                                                    }
                                                    l91Var2.c(chatFull3, s91Var3, c2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            s91 s91Var4 = s91Var2;
                                            if (!s91Var4.isFinishing() && s91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    l91 l91Var3 = l91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        l91Var3.c(chatFull4, s91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    l91Var3.c(chatFull4, s91Var4, c2VarArr4, false);
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
                            final l91 l91Var2 = this.f38484b;
                            final s91 s91Var3 = s91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            s91 s91Var32 = s91Var3;
                                            if (!s91Var32.isFinishing() && s91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    l91 l91Var22 = l91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = l91Var22.f40087a.f22527id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        l91Var22.c(chatFull32, s91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    l91Var22.c(chatFull32, s91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            s91 s91Var4 = s91Var3;
                                            if (!s91Var4.isFinishing() && s91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    l91 l91Var3 = l91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        l91Var3.c(chatFull4, s91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    l91Var3.c(chatFull4, s91Var4, c2VarArr4, false);
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
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(s91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var2;
                c2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f22381id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final l91 f38484b;

                {
                    this.f38484b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final l91 l91Var = this.f38484b;
                            final s91 s91Var2 = s91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            s91 s91Var32 = s91Var2;
                                            if (!s91Var32.isFinishing() && s91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr2;
                                                if (c2VarArr32[0] != null) {
                                                    l91 l91Var22 = l91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = l91Var22.f40087a.f22527id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        l91Var22.c(chatFull32, s91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    l91Var22.c(chatFull32, s91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            s91 s91Var4 = s91Var2;
                                            if (!s91Var4.isFinishing() && s91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    l91 l91Var3 = l91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        l91Var3.c(chatFull4, s91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    l91Var3.c(chatFull4, s91Var4, c2VarArr4, false);
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
                            final l91 l91Var2 = this.f38484b;
                            final s91 s91Var3 = s91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            s91 s91Var32 = s91Var3;
                                            if (!s91Var32.isFinishing() && s91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    l91 l91Var22 = l91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = l91Var22.f40087a.f22527id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        l91Var22.c(chatFull32, s91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    l91Var22.c(chatFull32, s91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            s91 s91Var4 = s91Var3;
                                            if (!s91Var4.isFinishing() && s91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    l91 l91Var3 = l91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        l91Var3.c(chatFull4, s91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    l91Var3.c(chatFull4, s91Var4, c2VarArr4, false);
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
                        i9 = R.string.SetAsAdmin;
                    } else {
                        str = "EditAdminRights";
                        i9 = R.string.EditAdminRights;
                    }
                    arrayList2.add(LocaleController.getString(str, i9));
                    if (z13) {
                        i10 = R.drawable.msg_admins;
                    } else {
                        i10 = R.drawable.msg_permissions;
                    }
                    org.telegram.ui.Cells.j2.j(i10, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s91Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i12)).intValue();
                    l91 l91Var = l91.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    s91 s91Var2 = s91Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = l91Var.f40087a.f22527id;
                        long j12 = chatFull2.f22381id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        j91 j91Var = new j91(l91Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, s91Var2);
                        j91Var.T0 = new k91(tL_chatChannelParticipant4, z15, zArr);
                        s91Var2.presentFragment(j91Var);
                    } else if (((Integer) arrayList5.get(i12)).intValue() == 2) {
                        l91Var.b(s91Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f22381id);
                        bundle.putLong("search_from_user_id", l91Var.f40087a.f22527id);
                        s91Var2.presentFragment(new qn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder.f22702a;
            c2Var4.L = charSequenceArr;
            c2Var4.M = intArray;
            c2Var4.I = onClickListener;
            s91Var.showDialog(c2Var4);
        }
    }
}
