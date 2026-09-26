package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class bv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23101f;
    public boolean h;
    public final yu0[] f23102n;
    public final long f23103r;
    public final long f23104s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f23105w;
    public boolean f23107y;
    public int[] f23098a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23099b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23100c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23106x = new ArrayList();

    public bv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23105w = m2Var;
        if (m2Var instanceof ch) {
            ch chVar = (ch) m2Var;
            long a2 = chVar.a();
            this.f23103r = a2;
            this.v = chVar.I();
            this.f23104s = chVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final bv0 f22783b;

                    {
                        this.f22783b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                bv0 bv0Var = this.f22783b;
                                ArrayList arrayList = bv0Var.f23106x;
                                boolean booleanValue = bool.booleanValue();
                                bv0Var.f23101f = booleanValue;
                                bv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((cv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                bv0 bv0Var2 = this.f22783b;
                                ArrayList arrayList2 = bv0Var2.f23106x;
                                boolean booleanValue2 = bool.booleanValue();
                                bv0Var2.f23101f = booleanValue2;
                                bv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((cv0) arrayList2.get(i12)).M();
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
                this.f23103r = profileActivity.getUserConfig().getClientUserId();
                this.f23104s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23103r = a10;
                this.f23104s = profileActivity.f31570g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31666u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final bv0 f22783b;

                        {
                            this.f22783b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    bv0 bv0Var = this.f22783b;
                                    ArrayList arrayList = bv0Var.f23106x;
                                    boolean booleanValue = bool.booleanValue();
                                    bv0Var.f23101f = booleanValue;
                                    bv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((cv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    bv0 bv0Var2 = this.f22783b;
                                    ArrayList arrayList2 = bv0Var2.f23106x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    bv0Var2.f23101f = booleanValue2;
                                    bv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((cv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof na0) {
            this.f23103r = ((na0) m2Var).e;
        } else if (m2Var instanceof org.telegram.ui.qy) {
            this.f23103r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23103r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f23103r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23102n = new yu0[9];
        int i11 = 0;
        while (true) {
            yu0[] yu0VarArr = this.f23102n;
            if (i11 >= yu0VarArr.length) {
                break;
            }
            yu0VarArr[i11] = new yu0();
            yu0 yu0Var = this.f23102n[i11];
            if (DialogObject.isEncryptedDialog(this.f23103r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            yu0Var.f30698j[0] = i10;
            this.f23102n[i11].f30698j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f23105w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23105w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f23103r, this.f23104s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23104s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f23105w) {
            this.f23106x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f23105w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f23104s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
