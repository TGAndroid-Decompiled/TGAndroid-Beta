package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ev0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f24054f;
    public boolean h;
    public final bv0[] f24055n;
    public final long f24056r;
    public final long f24057s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f24058w;
    public boolean f24060y;
    public int[] f24051a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f24052b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f24053c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f24059x = new ArrayList();

    public ev0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f24058w = m2Var;
        if (m2Var instanceof dh) {
            dh dhVar = (dh) m2Var;
            long a2 = dhVar.a();
            this.f24056r = a2;
            this.v = dhVar.I();
            this.f24057s = dhVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final ev0 f23740b;

                    {
                        this.f23740b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ev0 ev0Var = this.f23740b;
                                ArrayList arrayList = ev0Var.f24059x;
                                boolean booleanValue = bool.booleanValue();
                                ev0Var.f24054f = booleanValue;
                                ev0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((fv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                ev0 ev0Var2 = this.f23740b;
                                ArrayList arrayList2 = ev0Var2.f24059x;
                                boolean booleanValue2 = bool.booleanValue();
                                ev0Var2.f24054f = booleanValue2;
                                ev0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((fv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31651h1) {
                this.f24056r = profileActivity.getUserConfig().getClientUserId();
                this.f24057s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f24056r = a10;
                this.f24057s = profileActivity.f31644g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31740u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final ev0 f23740b;

                        {
                            this.f23740b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ev0 ev0Var = this.f23740b;
                                    ArrayList arrayList = ev0Var.f24059x;
                                    boolean booleanValue = bool.booleanValue();
                                    ev0Var.f24054f = booleanValue;
                                    ev0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((fv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ev0 ev0Var2 = this.f23740b;
                                    ArrayList arrayList2 = ev0Var2.f24059x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ev0Var2.f24054f = booleanValue2;
                                    ev0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((fv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof qa0) {
            this.f24056r = ((qa0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.qy) {
            this.f24056r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f24056r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f24056r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f24055n = new bv0[9];
        int i11 = 0;
        while (true) {
            bv0[] bv0VarArr = this.f24055n;
            if (i11 >= bv0VarArr.length) {
                break;
            }
            bv0VarArr[i11] = new bv0();
            bv0 bv0Var = this.f24055n[i11];
            if (DialogObject.isEncryptedDialog(this.f24056r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            bv0Var.f23021j[0] = i10;
            this.f24055n[i11].f23021j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f24058w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24058w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f24056r, this.f24057s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f24057s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f24058w) {
            this.f24059x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24058w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f24057s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ev0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
