package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class dv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23732f;
    public boolean h;
    public final av0[] f23733n;
    public final long f23734r;
    public final long f23735s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f23736w;
    public boolean f23738y;
    public int[] f23729a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23730b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23731c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23737x = new ArrayList();

    public dv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23736w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f23734r = a2;
            this.v = chVar.I();
            this.f23735s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final dv0 f23405b;

                    {
                        this.f23405b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                dv0 dv0Var = this.f23405b;
                                ArrayList arrayList = dv0Var.f23737x;
                                boolean booleanValue = bool.booleanValue();
                                dv0Var.f23732f = booleanValue;
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
                                dv0 dv0Var2 = this.f23405b;
                                ArrayList arrayList2 = dv0Var2.f23737x;
                                boolean booleanValue2 = bool.booleanValue();
                                dv0Var2.f23732f = booleanValue2;
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
            if (profileActivity.f31577h1) {
                this.f23734r = profileActivity.getUserConfig().getClientUserId();
                this.f23735s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23734r = a10;
                this.f23735s = profileActivity.f31570g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31666u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final dv0 f23405b;

                        {
                            this.f23405b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    dv0 dv0Var = this.f23405b;
                                    ArrayList arrayList = dv0Var.f23737x;
                                    boolean booleanValue = bool.booleanValue();
                                    dv0Var.f23732f = booleanValue;
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
                                    dv0 dv0Var2 = this.f23405b;
                                    ArrayList arrayList2 = dv0Var2.f23737x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    dv0Var2.f23732f = booleanValue2;
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
            this.f23734r = ((pa0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.qy) {
            this.f23734r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23734r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f23734r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23733n = new av0[9];
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f23733n;
            if (i11 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i11] = new av0();
            av0 av0Var = this.f23733n[i11];
            if (DialogObject.isEncryptedDialog(this.f23734r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            av0Var.f22736j[0] = i10;
            this.f23733n[i11].f22736j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f23736w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23736w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f23734r, this.f23735s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23735s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f23736w) {
            this.f23737x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23736w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23735s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
