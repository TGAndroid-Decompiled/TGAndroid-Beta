package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class dv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23733f;
    public boolean h;
    public final av0[] f23734n;
    public final long f23735r;
    public final long f23736s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f23737w;
    public boolean f23739y;
    public int[] f23730a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23731b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23732c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23738x = new ArrayList();

    public dv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23737w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f23735r = a2;
            this.v = chVar.I();
            this.f23736s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final dv0 f23406b;

                    {
                        this.f23406b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                dv0 dv0Var = this.f23406b;
                                ArrayList arrayList = dv0Var.f23738x;
                                boolean booleanValue = bool.booleanValue();
                                dv0Var.f23733f = booleanValue;
                                dv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ev0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                dv0 dv0Var2 = this.f23406b;
                                ArrayList arrayList2 = dv0Var2.f23738x;
                                boolean booleanValue2 = bool.booleanValue();
                                dv0Var2.f23733f = booleanValue2;
                                dv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ev0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31578h1) {
                this.f23735r = profileActivity.getUserConfig().getClientUserId();
                this.f23736s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23735r = a10;
                this.f23736s = profileActivity.f31571g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31667u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final dv0 f23406b;

                        {
                            this.f23406b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    dv0 dv0Var = this.f23406b;
                                    ArrayList arrayList = dv0Var.f23738x;
                                    boolean booleanValue = bool.booleanValue();
                                    dv0Var.f23733f = booleanValue;
                                    dv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ev0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    dv0 dv0Var2 = this.f23406b;
                                    ArrayList arrayList2 = dv0Var2.f23738x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    dv0Var2.f23733f = booleanValue2;
                                    dv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ev0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof pa0) {
            this.f23735r = ((pa0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.qy) {
            this.f23735r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23735r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f23735r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23734n = new av0[9];
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f23734n;
            if (i11 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i11] = new av0();
            av0 av0Var = this.f23734n[i11];
            if (DialogObject.isEncryptedDialog(this.f23735r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            av0Var.f22737j[0] = i10;
            this.f23734n[i11].f22737j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f23737w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23737w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f23735r, this.f23736s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23736s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f23737w) {
            this.f23738x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23737w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23736s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
