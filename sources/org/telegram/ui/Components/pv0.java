package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class pv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f29676f;
    public boolean h;
    public final mv0[] f29677n;
    public final long f29678r;
    public final long f29679s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f29680w;
    public boolean f29682y;
    public int[] f29673a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f29674b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29675c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f29681x = new ArrayList();

    public pv0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f29680w = o2Var;
        if (o2Var instanceof bh) {
            bh bhVar = (bh) o2Var;
            long a2 = bhVar.a();
            this.f29678r = a2;
            this.v = bhVar.I();
            this.f29679s = bhVar.d();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final pv0 f29322b;

                    {
                        this.f29322b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                pv0 pv0Var = this.f29322b;
                                ArrayList arrayList = pv0Var.f29681x;
                                boolean booleanValue = bool.booleanValue();
                                pv0Var.f29676f = booleanValue;
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
                                pv0 pv0Var2 = this.f29322b;
                                ArrayList arrayList2 = pv0Var2.f29681x;
                                boolean booleanValue2 = bool.booleanValue();
                                pv0Var2.f29676f = booleanValue2;
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
        } else if (o2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) o2Var;
            if (profileActivity.f33942i1) {
                this.f29678r = profileActivity.getUserConfig().getClientUserId();
                this.f29679s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f29678r = a10;
                this.f29679s = profileActivity.f33935h1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34032v2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final pv0 f29322b;

                        {
                            this.f29322b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    pv0 pv0Var = this.f29322b;
                                    ArrayList arrayList = pv0Var.f29681x;
                                    boolean booleanValue = bool.booleanValue();
                                    pv0Var.f29676f = booleanValue;
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
                                    pv0 pv0Var2 = this.f29322b;
                                    ArrayList arrayList2 = pv0Var2.f29681x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    pv0Var2.f29676f = booleanValue2;
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
        } else if (o2Var instanceof xa0) {
            this.f29678r = ((xa0) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.ey) {
            this.f29678r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f29678r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f29678r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f29677n = new mv0[9];
        int i11 = 0;
        while (true) {
            mv0[] mv0VarArr = this.f29677n;
            if (i11 >= mv0VarArr.length) {
                break;
            }
            mv0VarArr[i11] = new mv0();
            mv0 mv0Var = this.f29677n[i11];
            if (DialogObject.isEncryptedDialog(this.f29678r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            mv0Var.f28763j[0] = i10;
            this.f29677n[i11].f28763j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f29680w;
        if (o2Var2 == null) {
            this.E = null;
        } else {
            this.E = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29680w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f29678r, this.f29679s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29679s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f29680w) {
            this.f29681x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29680w;
        if (o2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29679s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
