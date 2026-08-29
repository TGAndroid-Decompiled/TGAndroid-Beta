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
public final class m91 {
    public TLRPC.User f40500a;
    public String f40501b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f22539id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f40500a.f22539id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40500a, false);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final t91 t91Var, final org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40500a, false);
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
                if (j10 == this.f40500a.f22539id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
        boolean z13 = true;
        b.h(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(t91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var;
                c2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f22393id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f40500a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final m91 f38829b;

                {
                    this.f38829b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final m91 m91Var = this.f38829b;
                            final t91 t91Var2 = t91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            t91 t91Var3 = t91Var2;
                                            if (!t91Var3.isFinishing() && t91Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr2;
                                                if (c2VarArr3[0] != null) {
                                                    m91 m91Var2 = m91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = m91Var2.f40500a.f22539id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        m91Var2.c(chatFull3, t91Var3, c2VarArr3, true);
                                                        return;
                                                    }
                                                    m91Var2.c(chatFull3, t91Var3, c2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            t91 t91Var4 = t91Var2;
                                            if (!t91Var4.isFinishing() && t91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    m91 m91Var3 = m91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        m91Var3.c(chatFull4, t91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    m91Var3.c(chatFull4, t91Var4, c2VarArr4, false);
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
                            final m91 m91Var2 = this.f38829b;
                            final t91 t91Var3 = t91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            t91 t91Var32 = t91Var3;
                                            if (!t91Var32.isFinishing() && t91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    m91 m91Var22 = m91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = m91Var22.f40500a.f22539id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        m91Var22.c(chatFull32, t91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    m91Var22.c(chatFull32, t91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            t91 t91Var4 = t91Var3;
                                            if (!t91Var4.isFinishing() && t91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    m91 m91Var3 = m91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        m91Var3.c(chatFull4, t91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    m91Var3.c(chatFull4, t91Var4, c2VarArr4, false);
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
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(t91Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var2;
                c2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f22393id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final m91 f38829b;

                {
                    this.f38829b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final m91 m91Var = this.f38829b;
                            final t91 t91Var2 = t91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            t91 t91Var32 = t91Var2;
                                            if (!t91Var32.isFinishing() && t91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr2;
                                                if (c2VarArr32[0] != null) {
                                                    m91 m91Var22 = m91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = m91Var22.f40500a.f22539id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        m91Var22.c(chatFull32, t91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    m91Var22.c(chatFull32, t91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            t91 t91Var4 = t91Var2;
                                            if (!t91Var4.isFinishing() && t91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    m91 m91Var3 = m91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        m91Var3.c(chatFull4, t91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    m91Var3.c(chatFull4, t91Var4, c2VarArr4, false);
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
                            final m91 m91Var2 = this.f38829b;
                            final t91 t91Var3 = t91Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            t91 t91Var32 = t91Var3;
                                            if (!t91Var32.isFinishing() && t91Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    m91 m91Var22 = m91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = m91Var22.f40500a.f22539id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        m91Var22.c(chatFull32, t91Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    m91Var22.c(chatFull32, t91Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            t91 t91Var4 = t91Var3;
                                            if (!t91Var4.isFinishing() && t91Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    m91 m91Var3 = m91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        m91Var3.c(chatFull4, t91Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    m91Var3.c(chatFull4, t91Var4, c2VarArr4, false);
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
                    b.h(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t91Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    m91 m91Var = m91.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    t91 t91Var2 = t91Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = m91Var.f40500a.f22539id;
                        long j12 = chatFull2.f22393id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        k91 k91Var = new k91(m91Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, t91Var2);
                        k91Var.T0 = new l91(tL_chatChannelParticipant4, z15, zArr);
                        t91Var2.presentFragment(k91Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        m91Var.b(t91Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f22393id);
                        bundle.putLong("search_from_user_id", m91Var.f40500a.f22539id);
                        t91Var2.presentFragment(new tn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder.f22714a;
            c2Var4.L = charSequenceArr;
            c2Var4.M = intArray;
            c2Var4.I = onClickListener;
            t91Var.showDialog(c2Var4);
        }
    }
}
