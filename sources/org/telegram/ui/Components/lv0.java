package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class lv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f28314f;
    public boolean h;
    public final iv0[] f28315n;
    public final long f28316r;
    public final long f28317s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f28318w;
    public boolean f28320y;
    public int[] f28311a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f28312b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f28313c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28319x = new ArrayList();

    public lv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28318w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f28316r = a2;
            this.v = bhVar.I();
            this.f28317s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final lv0 f27980b;

                    {
                        this.f27980b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                lv0 lv0Var = this.f27980b;
                                ArrayList arrayList = lv0Var.f28319x;
                                boolean booleanValue = bool.booleanValue();
                                lv0Var.f28314f = booleanValue;
                                lv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((mv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                lv0 lv0Var2 = this.f27980b;
                                ArrayList arrayList2 = lv0Var2.f28319x;
                                boolean booleanValue2 = bool.booleanValue();
                                lv0Var2.f28314f = booleanValue2;
                                lv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((mv0) arrayList2.get(i12)).M();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (n2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) n2Var;
            if (profileActivity.f33634i1) {
                this.f28316r = profileActivity.getUserConfig().getClientUserId();
                this.f28317s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28316r = a10;
                this.f28317s = profileActivity.f33627h1;
                TLRPC.ChatFull chatFull2 = profileActivity.f33724v2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final lv0 f27980b;

                        {
                            this.f27980b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    lv0 lv0Var = this.f27980b;
                                    ArrayList arrayList = lv0Var.f28319x;
                                    boolean booleanValue = bool.booleanValue();
                                    lv0Var.f28314f = booleanValue;
                                    lv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((mv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    lv0 lv0Var2 = this.f27980b;
                                    ArrayList arrayList2 = lv0Var2.f28319x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    lv0Var2.f28314f = booleanValue2;
                                    lv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((mv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof wa0) {
            this.f28316r = ((wa0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.cy) {
            this.f28316r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28316r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f28316r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28315n = new iv0[9];
        int i11 = 0;
        while (true) {
            iv0[] iv0VarArr = this.f28315n;
            if (i11 >= iv0VarArr.length) {
                break;
            }
            iv0VarArr[i11] = new iv0();
            iv0 iv0Var = this.f28315n[i11];
            if (DialogObject.isEncryptedDialog(this.f28316r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            iv0Var.f27369j[0] = i10;
            this.f28315n[i11].f27369j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f28318w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28318w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f28316r, this.f28317s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28317s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f28318w) {
            this.f28319x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28318w;
        if (n2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28317s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
