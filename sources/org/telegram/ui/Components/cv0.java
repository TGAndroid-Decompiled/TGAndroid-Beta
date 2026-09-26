package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class cv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23411f;
    public boolean h;
    public final zu0[] f23412n;
    public final long f23413r;
    public final long f23414s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f23415w;
    public boolean f23417y;
    public int[] f23408a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23409b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23410c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23416x = new ArrayList();

    public cv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23415w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f23413r = a2;
            this.v = chVar.I();
            this.f23414s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final cv0 f23116b;

                    {
                        this.f23116b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                cv0 cv0Var = this.f23116b;
                                ArrayList arrayList = cv0Var.f23416x;
                                boolean booleanValue = bool.booleanValue();
                                cv0Var.f23411f = booleanValue;
                                cv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((dv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                cv0 cv0Var2 = this.f23116b;
                                ArrayList arrayList2 = cv0Var2.f23416x;
                                boolean booleanValue2 = bool.booleanValue();
                                cv0Var2.f23411f = booleanValue2;
                                cv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((dv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31576h1) {
                this.f23413r = profileActivity.getUserConfig().getClientUserId();
                this.f23414s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23413r = a10;
                this.f23414s = profileActivity.f31569g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31665u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final cv0 f23116b;

                        {
                            this.f23116b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    cv0 cv0Var = this.f23116b;
                                    ArrayList arrayList = cv0Var.f23416x;
                                    boolean booleanValue = bool.booleanValue();
                                    cv0Var.f23411f = booleanValue;
                                    cv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((dv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    cv0 cv0Var2 = this.f23116b;
                                    ArrayList arrayList2 = cv0Var2.f23416x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    cv0Var2.f23411f = booleanValue2;
                                    cv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((dv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof oa0) {
            this.f23413r = ((oa0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.qy) {
            this.f23413r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23413r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f23413r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23412n = new zu0[9];
        int i11 = 0;
        while (true) {
            zu0[] zu0VarArr = this.f23412n;
            if (i11 >= zu0VarArr.length) {
                break;
            }
            zu0VarArr[i11] = new zu0();
            zu0 zu0Var = this.f23412n[i11];
            if (DialogObject.isEncryptedDialog(this.f23413r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            zu0Var.f30975j[0] = i10;
            this.f23412n[i11].f30975j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f23415w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23415w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f23413r, this.f23414s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23414s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f23415w) {
            this.f23416x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23415w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23414s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
