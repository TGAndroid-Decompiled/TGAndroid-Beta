package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class pv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f28113f;
    public boolean h;
    public final mv0[] f28114n;
    public final long f28115r;
    public final long f28116s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f28117w;
    public boolean f28119y;
    public int[] f28110a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f28111b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f28112c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28118x = new ArrayList();

    public pv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28117w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f28115r = a2;
            this.v = chVar.I();
            this.f28116s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final pv0 f27749b;

                    {
                        this.f27749b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                pv0 pv0Var = this.f27749b;
                                ArrayList arrayList = pv0Var.f28118x;
                                boolean booleanValue = bool.booleanValue();
                                pv0Var.f28113f = booleanValue;
                                pv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((qv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                pv0 pv0Var2 = this.f27749b;
                                ArrayList arrayList2 = pv0Var2.f28118x;
                                boolean booleanValue2 = bool.booleanValue();
                                pv0Var2.f28113f = booleanValue2;
                                pv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((qv0) arrayList2.get(i12)).M();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (m2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) m2Var;
            if (profileActivity.f32283h1) {
                this.f28115r = profileActivity.getUserConfig().getClientUserId();
                this.f28116s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28115r = a10;
                this.f28116s = profileActivity.f32276g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f32373u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final pv0 f27749b;

                        {
                            this.f27749b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    pv0 pv0Var = this.f27749b;
                                    ArrayList arrayList = pv0Var.f28118x;
                                    boolean booleanValue = bool.booleanValue();
                                    pv0Var.f28113f = booleanValue;
                                    pv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((qv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    pv0 pv0Var2 = this.f27749b;
                                    ArrayList arrayList2 = pv0Var2.f28118x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    pv0Var2.f28113f = booleanValue2;
                                    pv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((qv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof cb0) {
            this.f28115r = ((cb0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.yy) {
            this.f28115r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28115r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f28115r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28114n = new mv0[9];
        int i11 = 0;
        while (true) {
            mv0[] mv0VarArr = this.f28114n;
            if (i11 >= mv0VarArr.length) {
                break;
            }
            mv0VarArr[i11] = new mv0();
            mv0 mv0Var = this.f28114n[i11];
            if (DialogObject.isEncryptedDialog(this.f28115r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            mv0Var.f27217j[0] = i10;
            this.f28114n[i11].f27217j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f28117w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28117w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f28115r, this.f28116s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f28116s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f28117w) {
            this.f28118x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28117w;
        if (m2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f28116s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
