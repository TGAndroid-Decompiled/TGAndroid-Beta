package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

public final class zt0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup A;

    public boolean f35352f;
    public boolean h;

    public final wt0[] f35353n;

    public final long f35354r;

    public final long f35355s;
    public long v;

    public final org.telegram.ui.ActionBar.n2 f35356w;

    public boolean f35358y;

    public int[] f35348a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public int[] f35349b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public final int[] f35350c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public final int[] f35351e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public final ArrayList f35357x = new ArrayList();

    public zt0(org.telegram.ui.ActionBar.n2 n2Var) {
        TLRPC.ChatFull chatFull;
        this.f35356w = n2Var;
        final int i10 = 1;
        final int i11 = 0;
        if (n2Var instanceof ng) {
            ng ngVar = (ng) n2Var;
            long jA = ngVar.a();
            this.f35354r = jA;
            this.v = ngVar.I();
            this.f35355s = ngVar.b();
            if (jA != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(jA, new Utilities.Callback(this) {

                    public final zt0 f34963b;

                    {
                        this.f34963b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i11) {
                            case 0:
                                zt0 zt0Var = this.f34963b;
                                ArrayList arrayList = zt0Var.f35357x;
                                boolean zBooleanValue = bool.booleanValue();
                                zt0Var.f35352f = zBooleanValue;
                                zt0Var.h = true;
                                if (zBooleanValue) {
                                    int size = arrayList.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        ((au0) arrayList.get(i12)).M();
                                    }
                                }
                                break;
                            default:
                                zt0 zt0Var2 = this.f34963b;
                                ArrayList arrayList2 = zt0Var2.f35357x;
                                boolean zBooleanValue2 = bool.booleanValue();
                                zt0Var2.f35352f = zBooleanValue2;
                                zt0Var2.h = true;
                                if (zBooleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        ((au0) arrayList2.get(i13)).M();
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        } else if (n2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) n2Var;
            if (profileActivity.f35944d1) {
                this.f35354r = profileActivity.getUserConfig().getClientUserId();
                this.f35355s = profileActivity.a();
            } else {
                long jA2 = profileActivity.a();
                this.f35354r = jA2;
                this.f35355s = profileActivity.f35937c1;
                TLRPC.ChatFull chatFull2 = profileActivity.f36036q2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (jA2 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(jA2, new Utilities.Callback(this) {

                        public final zt0 f34963b;

                        {
                            this.f34963b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i10) {
                                case 0:
                                    zt0 zt0Var = this.f34963b;
                                    ArrayList arrayList = zt0Var.f35357x;
                                    boolean zBooleanValue = bool.booleanValue();
                                    zt0Var.f35352f = zBooleanValue;
                                    zt0Var.h = true;
                                    if (zBooleanValue) {
                                        int size = arrayList.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ((au0) arrayList.get(i12)).M();
                                        }
                                    }
                                    break;
                                default:
                                    zt0 zt0Var2 = this.f34963b;
                                    ArrayList arrayList2 = zt0Var2.f35357x;
                                    boolean zBooleanValue2 = bool.booleanValue();
                                    zt0Var2.f35352f = zBooleanValue2;
                                    zt0Var2.h = true;
                                    if (zBooleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i13 = 0; i13 < size2; i13++) {
                                            ((au0) arrayList2.get(i13)).M();
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof o90) {
            this.f35354r = ((o90) n2Var).f31239e;
        } else if (n2Var instanceof org.telegram.ui.gy) {
            this.f35354r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f35354r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f35354r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f35353n = new wt0[9];
        int i12 = 0;
        while (true) {
            wt0[] wt0VarArr = this.f35353n;
            if (i12 >= wt0VarArr.length) {
                break;
            }
            wt0VarArr[i12] = new wt0();
            this.f35353n[i12].f34332j[0] = DialogObject.isEncryptedDialog(this.f35354r) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            this.f35353n[i12].f34332j[1] = Integer.MAX_VALUE;
            i12++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f35356w;
        if (n2Var2 == null) {
            this.A = null;
        } else {
            this.A = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f35356w;
        if (n2Var == null) {
            return;
        }
        n2Var.getMediaDataController().getMediaCounts(this.f35354r, this.f35355s, n2Var.getClassGuid());
        if (this.v != 0) {
            n2Var.getMediaDataController().getMediaCounts(this.v, this.f35355s, n2Var.getClassGuid());
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != this.f35356w) {
            return;
        }
        this.f35357x.clear();
        NotificationCenter.ObserversGroup observersGroup = this.A;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f35356w;
        if (n2Var == null || chatFull == null) {
            return;
        }
        long j10 = chatFull.migrated_from_chat_id;
        if (j10 == 0 || this.v != 0) {
            return;
        }
        this.v = -j10;
        n2Var.getMediaDataController().getMediaCounts(this.v, this.f35355s, n2Var.getClassGuid());
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int mediaType;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        boolean z10 = true;
        if (i10 == NotificationCenter.mediaCountsDidLoad) {
            long jLongValue = ((Long) objArr[0]).longValue();
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (this.f35355s == jLongValue2) {
                long j10 = this.f35354r;
                if (jLongValue == j10 || jLongValue == this.v) {
                    int[] iArr = (int[]) objArr[2];
                    if (jLongValue == j10) {
                        this.f35348a = iArr;
                    } else {
                        this.f35349b = iArr;
                    }
                    for (int i18 = 0; i18 < iArr.length; i18++) {
                        int i19 = this.f35348a[i18];
                        if (i19 >= 0 && (i16 = this.f35349b[i18]) >= 0) {
                            this.f35350c[i18] = i19 + i16;
                        } else if (i19 >= 0) {
                            this.f35350c[i18] = i19;
                        } else {
                            this.f35350c[i18] = Math.max(this.f35349b[i18], 0);
                        }
                        if (jLongValue == this.f35354r && this.f35350c[i18] != 0 && this.d[i18] != this.f35348a[i18]) {
                            if (i18 != 0) {
                                i15 = i18;
                            } else {
                                int i20 = this.f35353n[0].f34339q;
                                if (i20 == 1) {
                                    i15 = 6;
                                } else if (i20 == 2) {
                                    i15 = 7;
                                } else {
                                    i15 = i18;
                                }
                            }
                            this.f35356w.getMediaDataController().loadMedia(jLongValue, this.d[i18] == -1 ? 30 : 20, 0, 0, i15, jLongValue2, 1, this.f35356w.getClassGuid(), this.f35353n[i18].f34338p, null, null);
                            this.d[i18] = this.f35348a[i18];
                        } else if (jLongValue == this.v && this.f35350c[i18] != 0 && this.f35351e[i18] != this.f35349b[i18]) {
                            if (i18 != 0) {
                                i14 = i18;
                            } else {
                                int i21 = this.f35353n[0].f34339q;
                                if (i21 == 1) {
                                    i14 = 6;
                                } else if (i21 == 2) {
                                    i14 = 7;
                                } else {
                                    i14 = i18;
                                }
                            }
                            this.f35356w.getMediaDataController().loadMedia(jLongValue, this.f35351e[i18] == -1 ? 30 : 20, 0, 0, i14, jLongValue2, 1, this.f35356w.getClassGuid(), this.f35353n[i18].f34338p, null, null);
                            this.f35351e[i18] = this.f35349b[i18];
                        }
                    }
                    this.f35358y = true;
                    int size = this.f35357x.size();
                    while (i17 < size) {
                        ((au0) this.f35357x.get(i17)).M();
                        i17++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mediaCountDidLoad) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            long jLongValue4 = ((Long) objArr[1]).longValue();
            if ((jLongValue3 == this.f35354r || jLongValue3 == this.v) && this.f35355s == jLongValue4) {
                int iIntValue = ((Integer) objArr[4]).intValue();
                int iIntValue2 = ((Integer) objArr[2]).intValue();
                if (jLongValue3 == this.f35354r) {
                    this.f35348a[iIntValue] = iIntValue2;
                } else {
                    this.f35349b[iIntValue] = iIntValue2;
                }
                int i22 = this.f35348a[iIntValue];
                if (i22 >= 0 && (i13 = this.f35349b[iIntValue]) >= 0) {
                    this.f35350c[iIntValue] = i22 + i13;
                } else if (i22 >= 0) {
                    this.f35350c[iIntValue] = i22;
                } else {
                    this.f35350c[iIntValue] = Math.max(this.f35349b[iIntValue], 0);
                }
                int size2 = this.f35357x.size();
                while (i17 < size2) {
                    ((au0) this.f35357x.get(i17)).M();
                    i17++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long jLongValue5 = ((Long) objArr[0]).longValue();
            long j11 = this.f35354r;
            if (jLongValue5 == j11 || jLongValue5 == this.v) {
                int i23 = jLongValue5 == j11 ? 0 : 1;
                boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(jLongValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.n2 n2Var = this.f35356w;
                int currentAccount = n2Var != null ? n2Var.getCurrentAccount() : -1;
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i24);
                    if (!messageObject.isEphemeral()) {
                        long j12 = this.f35355s;
                        if ((j12 == 0 || j12 == MessageObject.getTopicId(currentAccount, messageObject.messageOwner, true)) && MessageObject.getMedia(messageObject.messageOwner) != null && !messageObject.needDrawBluredPreview() && (mediaType = MediaDataController.getMediaType(messageObject.messageOwner)) != -1 && ((mediaType != 0 || this.f35353n[0].f34339q != 2 || messageObject.isVideo()) && (mediaType != 0 || this.f35353n[0].f34339q != 1 || !messageObject.isVideo()))) {
                            wt0 wt0Var = this.f35353n[mediaType];
                            if (wt0Var.f34334l) {
                                wt0Var.a(messageObject, i23, true, zIsEncryptedDialog);
                            }
                            if (this.f35355s == 0) {
                                int[] iArr2 = this.f35353n[mediaType].f34329f;
                                iArr2[i23] = iArr2[i23] + 1;
                            }
                            if (i23 == 0) {
                                for (int i25 = 0; i25 < this.f35353n[mediaType].f34328e.size(); i25++) {
                                    ((et0) this.f35353n[mediaType].f34328e.get(i25)).f28150b++;
                                }
                            }
                        }
                    }
                }
                a();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messageReceivedByServer) {
            if (i10 == NotificationCenter.mediaDidLoad) {
                long jLongValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.f35356w.getClassGuid()) {
                    int iIntValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean zIsEncryptedDialog2 = DialogObject.isEncryptedDialog(jLongValue6);
                    int i26 = jLongValue6 == this.f35354r ? 0 : 1;
                    if (iIntValue3 == 0 || iIntValue3 == 6 || iIntValue3 == 7) {
                        if (iIntValue3 != this.f35353n[0].f34339q) {
                            return;
                        } else {
                            iIntValue3 = 0;
                        }
                    }
                    if (iIntValue3 != 0 && iIntValue3 != 1 && iIntValue3 != 2 && iIntValue3 != 4) {
                        this.f35353n[iIntValue3].f34329f[i26] = ((Integer) objArr[1]).intValue();
                    }
                    this.f35353n[iIntValue3].f34331i[i26] = ((Boolean) objArr[5]).booleanValue();
                    for (int i27 = 0; i27 < arrayList2.size(); i27++) {
                        this.f35353n[iIntValue3].a((MessageObject) arrayList2.get(i27), i26, false, zIsEncryptedDialog2);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagesDeleted) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long jLongValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat chat = DialogObject.isChatDialog(this.f35354r) ? this.f35356w.getMessagesController().getChat(Long.valueOf(-this.f35354r)) : null;
                if (ChatObject.isChannel(chat)) {
                    if ((jLongValue7 != 0 || this.v == 0) && jLongValue7 != chat.f22380id) {
                        return;
                    }
                } else if (jLongValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f35356w;
                int currentAccount2 = n2Var2 != null ? n2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                boolean z11 = false;
                for (int i28 = 0; i28 < size3; i28++) {
                    int i29 = 0;
                    while (true) {
                        wt0[] wt0VarArr = this.f35353n;
                        if (i29 < wt0VarArr.length) {
                            MessageObject messageObjectB = wt0VarArr[i29].b(((Integer) arrayList3.get(i28)).intValue(), 0);
                            if (messageObjectB != null) {
                                if (messageObjectB.getDialogId() == this.f35354r && (this.f35355s == 0 || MessageObject.getTopicId(currentAccount2, messageObjectB.messageOwner, true) == this.f35355s)) {
                                    int[] iArr3 = this.f35348a;
                                    int i30 = iArr3[i29];
                                    if (i30 > 0) {
                                        iArr3[i29] = i30 - 1;
                                    }
                                } else {
                                    int[] iArr4 = this.f35349b;
                                    int i31 = iArr4[i29];
                                    if (i31 > 0) {
                                        iArr4[i29] = i31 - 1;
                                    }
                                }
                                z11 = true;
                            }
                            i29++;
                        }
                    }
                }
                if (z11) {
                    int i32 = 0;
                    while (true) {
                        int[] iArr5 = this.f35348a;
                        if (i32 >= iArr5.length) {
                            break;
                        }
                        int i33 = iArr5[i32];
                        if (i33 >= 0 && (i12 = this.f35349b[i32]) >= 0) {
                            this.f35350c[i32] = i33 + i12;
                        } else if (i33 >= 0) {
                            this.f35350c[i32] = i33;
                        } else {
                            this.f35350c[i32] = Math.max(this.f35349b[i32], 0);
                        }
                        i32++;
                    }
                    int size4 = this.f35357x.size();
                    while (i17 < size4) {
                        ((au0) this.f35357x.get(i17)).M();
                        i17++;
                    }
                }
                a();
                return;
            }
            if (i10 != NotificationCenter.replaceMessagesObjects) {
                if (i10 == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j13 = this.f35354r;
                    if (j13 >= 0 || chatFull.f22381id != (-j13)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i10 == NotificationCenter.fileLoaded) {
                    ArrayList arrayList4 = new ArrayList();
                    int i34 = 0;
                    while (true) {
                        wt0[] wt0VarArr2 = this.f35353n;
                        if (i34 >= wt0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(wt0VarArr2[i34].f34325a);
                        i34++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.globalQueue.postRunnable(new androidx.activity.g(arrayList4, str, i11, 7));
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.savedMessagesDialogsUpdate) {
                    org.telegram.ui.ActionBar.n2 n2Var3 = this.f35356w;
                    boolean z12 = n2Var3 != null && n2Var3.getMessagesController().getSavedMessagesController().containsDialog(this.f35354r);
                    if (!this.h || this.f35352f == z12) {
                        return;
                    }
                    this.f35352f = z12;
                    int size5 = this.f35357x.size();
                    for (int i35 = 0; i35 < size5; i35++) {
                        ((au0) this.f35357x.get(i35)).M();
                    }
                    return;
                }
                return;
            }
            long jLongValue8 = ((Long) objArr[0]).longValue();
            long j14 = this.f35354r;
            if (jLongValue8 == j14 || jLongValue8 == this.v) {
                int i36 = jLongValue8 == j14 ? 0 : 1;
                ArrayList arrayList5 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.n2 n2Var4 = this.f35356w;
                int currentAccount3 = n2Var4 != null ? n2Var4.getCurrentAccount() : -1;
                int size6 = arrayList5.size();
                int i37 = 0;
                while (i37 < size6) {
                    MessageObject messageObject2 = (MessageObject) arrayList5.get(i37);
                    int id2 = messageObject2.getId();
                    long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z10);
                    int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                    long j15 = this.f35355s;
                    if (j15 == 0 || topicId == j15) {
                        int i38 = 0;
                        while (true) {
                            wt0[] wt0VarArr3 = this.f35353n;
                            if (i38 >= wt0VarArr3.length) {
                                break;
                            }
                            MessageObject messageObject3 = (MessageObject) wt0VarArr3[i38].f34326b[i36].get(id2);
                            if (messageObject3 != null) {
                                int mediaType3 = MediaDataController.getMediaType(messageObject2.messageOwner);
                                if (mediaType2 != -1 && mediaType3 == mediaType2) {
                                    int iIndexOf = this.f35353n[i38].f34325a.indexOf(messageObject3);
                                    if (iIndexOf < 0) {
                                        break;
                                    }
                                    this.f35353n[i38].f34326b[i36].put(id2, messageObject2);
                                    this.f35353n[i38].f34325a.set(iIndexOf, messageObject2);
                                    break;
                                }
                                this.f35353n[i38].b(id2, i36);
                                if (i36 != 0) {
                                    int[] iArr6 = this.f35349b;
                                    int i39 = iArr6[i38];
                                    if (i39 <= 0) {
                                        break;
                                    }
                                    iArr6[i38] = i39 - 1;
                                    break;
                                }
                                int[] iArr7 = this.f35348a;
                                int i40 = iArr7[i38];
                                if (i40 <= 0) {
                                    break;
                                }
                                iArr7[i38] = i40 - 1;
                                break;
                            }
                            i38++;
                        }
                    }
                    i37++;
                    z10 = true;
                }
                return;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l10 = (Long) objArr[3];
        if (l10.longValue() != this.f35354r && l10.longValue() != this.v) {
            return;
        }
        int i41 = l10.longValue() == this.f35354r ? 0 : 1;
        while (true) {
            wt0[] wt0VarArr4 = this.f35353n;
            if (i17 >= wt0VarArr4.length) {
                return;
            }
            wt0VarArr4[i17].f(i41, num.intValue(), num2.intValue());
            i17++;
        }
    }
}
