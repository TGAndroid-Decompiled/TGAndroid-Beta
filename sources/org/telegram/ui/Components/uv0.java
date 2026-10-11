package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class uv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f31726f;
    public boolean h;
    public final rv0[] f31727n;
    public final long f31728r;
    public final long f31729s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f31730w;
    public boolean f31732y;
    public int[] f31722a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f31723b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31724c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31725e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f31731x = new ArrayList();

    public uv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f31730w = m2Var;
        if (m2Var instanceof eh) {
            eh ehVar = (eh) m2Var;
            long a2 = ehVar.a();
            this.f31728r = a2;
            this.v = ehVar.I();
            this.f31729s = ehVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final uv0 f31346b;

                    {
                        this.f31346b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                uv0 uv0Var = this.f31346b;
                                ArrayList arrayList = uv0Var.f31731x;
                                boolean booleanValue = bool.booleanValue();
                                uv0Var.f31726f = booleanValue;
                                uv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((vv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                uv0 uv0Var2 = this.f31346b;
                                ArrayList arrayList2 = uv0Var2.f31731x;
                                boolean booleanValue2 = bool.booleanValue();
                                uv0Var2.f31726f = booleanValue2;
                                uv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((vv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f34327h1) {
                this.f31728r = profileActivity.getUserConfig().getClientUserId();
                this.f31729s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f31728r = a10;
                this.f31729s = profileActivity.f34320g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34416u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final uv0 f31346b;

                        {
                            this.f31346b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    uv0 uv0Var = this.f31346b;
                                    ArrayList arrayList = uv0Var.f31731x;
                                    boolean booleanValue = bool.booleanValue();
                                    uv0Var.f31726f = booleanValue;
                                    uv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((vv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    uv0 uv0Var2 = this.f31346b;
                                    ArrayList arrayList2 = uv0Var2.f31731x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    uv0Var2.f31726f = booleanValue2;
                                    uv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((vv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof db0) {
            this.f31728r = ((db0) m2Var).f25747e;
        } else if (m2Var instanceof org.telegram.ui.sy) {
            this.f31728r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f31728r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f31728r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f31727n = new rv0[9];
        int i11 = 0;
        while (true) {
            rv0[] rv0VarArr = this.f31727n;
            if (i11 >= rv0VarArr.length) {
                break;
            }
            rv0VarArr[i11] = new rv0();
            rv0 rv0Var = this.f31727n[i11];
            if (DialogObject.isEncryptedDialog(this.f31728r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            rv0Var.f30644j[0] = i10;
            this.f31727n[i11].f30644j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f31730w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f31730w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f31728r, this.f31729s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f31729s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f31730w) {
            this.f31731x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f31730w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f31729s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
