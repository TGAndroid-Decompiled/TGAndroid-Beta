package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class pv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f28427f;
    public boolean h;
    public final mv0[] f28428n;
    public final long f28429r;
    public final long f28430s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f28431w;
    public boolean f28433y;
    public int[] f28424a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f28425b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f28426c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28432x = new ArrayList();

    public pv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28431w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f28429r = a2;
            this.v = chVar.I();
            this.f28430s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final pv0 f28065b;

                    {
                        this.f28065b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                pv0 pv0Var = this.f28065b;
                                ArrayList arrayList = pv0Var.f28432x;
                                boolean booleanValue = bool.booleanValue();
                                pv0Var.f28427f = booleanValue;
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
                                pv0 pv0Var2 = this.f28065b;
                                ArrayList arrayList2 = pv0Var2.f28432x;
                                boolean booleanValue2 = bool.booleanValue();
                                pv0Var2.f28427f = booleanValue2;
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
            if (profileActivity.f32581h1) {
                this.f28429r = profileActivity.getUserConfig().getClientUserId();
                this.f28430s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28429r = a10;
                this.f28430s = profileActivity.f32574g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f32671u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final pv0 f28065b;

                        {
                            this.f28065b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    pv0 pv0Var = this.f28065b;
                                    ArrayList arrayList = pv0Var.f28432x;
                                    boolean booleanValue = bool.booleanValue();
                                    pv0Var.f28427f = booleanValue;
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
                                    pv0 pv0Var2 = this.f28065b;
                                    ArrayList arrayList2 = pv0Var2.f28432x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    pv0Var2.f28427f = booleanValue2;
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
            this.f28429r = ((cb0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.yy) {
            this.f28429r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28429r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f28429r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28428n = new mv0[9];
        int i11 = 0;
        while (true) {
            mv0[] mv0VarArr = this.f28428n;
            if (i11 >= mv0VarArr.length) {
                break;
            }
            mv0VarArr[i11] = new mv0();
            mv0 mv0Var = this.f28428n[i11];
            if (DialogObject.isEncryptedDialog(this.f28429r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            mv0Var.f27514j[0] = i10;
            this.f28428n[i11].f27514j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f28431w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28431w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f28429r, this.f28430s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f28430s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f28431w) {
            this.f28432x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f28431w;
        if (m2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f28430s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
