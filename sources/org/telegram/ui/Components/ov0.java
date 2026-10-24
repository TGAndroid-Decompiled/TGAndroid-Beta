package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ov0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f29406f;
    public boolean h;
    public final lv0[] f29407n;
    public final long f29408r;
    public final long f29409s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f29410w;
    public boolean f29412y;
    public int[] f29403a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f29404b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29405c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f29411x = new ArrayList();

    public ov0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f29410w = o2Var;
        if (o2Var instanceof zg) {
            zg zgVar = (zg) o2Var;
            long a2 = zgVar.a();
            this.f29408r = a2;
            this.v = zgVar.I();
            this.f29409s = zgVar.d();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final ov0 f29041b;

                    {
                        this.f29041b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ov0 ov0Var = this.f29041b;
                                ArrayList arrayList = ov0Var.f29411x;
                                boolean booleanValue = bool.booleanValue();
                                ov0Var.f29406f = booleanValue;
                                ov0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((pv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                ov0 ov0Var2 = this.f29041b;
                                ArrayList arrayList2 = ov0Var2.f29411x;
                                boolean booleanValue2 = bool.booleanValue();
                                ov0Var2.f29406f = booleanValue2;
                                ov0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((pv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f33944i1) {
                this.f29408r = profileActivity.getUserConfig().getClientUserId();
                this.f29409s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f29408r = a10;
                this.f29409s = profileActivity.f33937h1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34034v2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final ov0 f29041b;

                        {
                            this.f29041b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ov0 ov0Var = this.f29041b;
                                    ArrayList arrayList = ov0Var.f29411x;
                                    boolean booleanValue = bool.booleanValue();
                                    ov0Var.f29406f = booleanValue;
                                    ov0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((pv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ov0 ov0Var2 = this.f29041b;
                                    ArrayList arrayList2 = ov0Var2.f29411x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ov0Var2.f29406f = booleanValue2;
                                    ov0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((pv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (o2Var instanceof va0) {
            this.f29408r = ((va0) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.ey) {
            this.f29408r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f29408r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f29408r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f29407n = new lv0[9];
        int i11 = 0;
        while (true) {
            lv0[] lv0VarArr = this.f29407n;
            if (i11 >= lv0VarArr.length) {
                break;
            }
            lv0VarArr[i11] = new lv0();
            lv0 lv0Var = this.f29407n[i11];
            if (DialogObject.isEncryptedDialog(this.f29408r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            lv0Var.f28445j[0] = i10;
            this.f29407n[i11].f28445j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f29410w;
        if (o2Var2 == null) {
            this.E = null;
        } else {
            this.E = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29410w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f29408r, this.f29409s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29409s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f29410w) {
            this.f29411x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29410w;
        if (o2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29409s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
