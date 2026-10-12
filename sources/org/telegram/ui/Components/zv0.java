package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class zv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f33500f;
    public boolean h;
    public final wv0[] f33501n;
    public final long f33502r;
    public final long f33503s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f33504w;
    public boolean f33506y;
    public int[] f33496a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f33497b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33498c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33499e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f33505x = new ArrayList();

    public zv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f33504w = m2Var;
        if (m2Var instanceof gh) {
            gh ghVar = (gh) m2Var;
            long a2 = ghVar.a();
            this.f33502r = a2;
            this.v = ghVar.I();
            this.f33503s = ghVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final zv0 f33178b;

                    {
                        this.f33178b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                zv0 zv0Var = this.f33178b;
                                ArrayList arrayList = zv0Var.f33505x;
                                boolean booleanValue = bool.booleanValue();
                                zv0Var.f33500f = booleanValue;
                                zv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((aw0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                zv0 zv0Var2 = this.f33178b;
                                ArrayList arrayList2 = zv0Var2.f33505x;
                                boolean booleanValue2 = bool.booleanValue();
                                zv0Var2.f33500f = booleanValue2;
                                zv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((aw0) arrayList2.get(i12)).M();
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
            if (profileActivity.f34102h1) {
                this.f33502r = profileActivity.getUserConfig().getClientUserId();
                this.f33503s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f33502r = a10;
                this.f33503s = profileActivity.f34095g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34191u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final zv0 f33178b;

                        {
                            this.f33178b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    zv0 zv0Var = this.f33178b;
                                    ArrayList arrayList = zv0Var.f33505x;
                                    boolean booleanValue = bool.booleanValue();
                                    zv0Var.f33500f = booleanValue;
                                    zv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((aw0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    zv0 zv0Var2 = this.f33178b;
                                    ArrayList arrayList2 = zv0Var2.f33505x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    zv0Var2.f33500f = booleanValue2;
                                    zv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((aw0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof hb0) {
            this.f33502r = ((hb0) m2Var).f26737e;
        } else if (m2Var instanceof org.telegram.ui.vy) {
            this.f33502r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f33502r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f33502r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f33501n = new wv0[9];
        int i11 = 0;
        while (true) {
            wv0[] wv0VarArr = this.f33501n;
            if (i11 >= wv0VarArr.length) {
                break;
            }
            wv0VarArr[i11] = new wv0();
            wv0 wv0Var = this.f33501n[i11];
            if (DialogObject.isEncryptedDialog(this.f33502r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            wv0Var.f32560j[0] = i10;
            this.f33501n[i11].f32560j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f33504w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f33504w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f33502r, this.f33503s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f33503s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f33504w) {
            this.f33505x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f33504w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f33503s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
