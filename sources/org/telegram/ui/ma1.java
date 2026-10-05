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
public final class ma1 {
    public TLRPC.User f38555a;
    public String f38556b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f20194id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f38555a.f20194id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f38555a, false);
        n2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final ta1 ta1Var, final org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f38555a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z10 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                long j3 = chatParticipant.user_id;
                if (j3 == this.f38555a.f20194id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        } else {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        org.telegram.ui.Cells.c1.m(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.c1.m(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ta1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var;
                b2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20048id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f38555a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ma1 f37050b;

                {
                    this.f37050b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ma1 ma1Var = this.f37050b;
                            final ta1 ta1Var2 = ta1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ta1 ta1Var3 = ta1Var2;
                                            if (!ta1Var3.isFinishing() && ta1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
                                                if (b2VarArr3[0] != null) {
                                                    ma1 ma1Var2 = ma1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ma1Var2.f38555a.f20194id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ma1Var2.c(chatFull3, ta1Var3, b2VarArr3, true);
                                                        return;
                                                    }
                                                    ma1Var2.c(chatFull3, ta1Var3, b2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ta1 ta1Var4 = ta1Var2;
                                            if (!ta1Var4.isFinishing() && ta1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ma1 ma1Var3 = ma1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, false);
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
                            final ma1 ma1Var2 = this.f37050b;
                            final ta1 ta1Var3 = ta1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ta1 ta1Var32 = ta1Var3;
                                            if (!ta1Var32.isFinishing() && ta1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ma1 ma1Var22 = ma1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ma1Var22.f38555a.f20194id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ta1 ta1Var4 = ta1Var3;
                                            if (!ta1Var4.isFinishing() && ta1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ma1 ma1Var3 = ma1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, false);
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
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(ta1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var2;
                b2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f20048id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ma1 f37050b;

                {
                    this.f37050b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ma1 ma1Var = this.f37050b;
                            final ta1 ta1Var2 = ta1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ta1 ta1Var32 = ta1Var2;
                                            if (!ta1Var32.isFinishing() && ta1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr2;
                                                if (b2VarArr32[0] != null) {
                                                    ma1 ma1Var22 = ma1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ma1Var22.f38555a.f20194id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ta1 ta1Var4 = ta1Var2;
                                            if (!ta1Var4.isFinishing() && ta1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ma1 ma1Var3 = ma1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, false);
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
                            final ma1 ma1Var2 = this.f37050b;
                            final ta1 ta1Var3 = ta1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ta1 ta1Var32 = ta1Var3;
                                            if (!ta1Var32.isFinishing() && ta1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ma1 ma1Var22 = ma1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ma1Var22.f38555a.f20194id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ma1Var22.c(chatFull32, ta1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ta1 ta1Var4 = ta1Var3;
                                            if (!ta1Var4.isFinishing() && ta1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ma1 ma1Var3 = ma1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ma1Var3.c(chatFull4, ta1Var4, b2VarArr4, false);
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
            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
            if (b2Var3 != null) {
                b2Var3.dismiss();
                b2VarArr[0] = null;
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
                    org.telegram.ui.Cells.c1.m(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ta1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ma1 ma1Var = ma1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    ta1 ta1Var2 = ta1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j10 = ma1Var.f38555a.f20194id;
                        long j11 = chatFull2.f20048id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        ka1 ka1Var = new ka1(ma1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, ta1Var2);
                        ka1Var.X0 = new la1(tL_chatChannelParticipant4, z15, zArr);
                        ta1Var2.presentFragment(ka1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ma1Var.b(ta1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f20048id);
                        bundle.putLong("search_from_user_id", ma1Var.f38555a.f20194id);
                        ta1Var2.presentFragment(new yn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.f20377a;
            b2Var4.P = charSequenceArr;
            b2Var4.Q = intArray;
            b2Var4.M = onClickListener;
            ta1Var.showDialog(b2Var4);
        }
    }
}
