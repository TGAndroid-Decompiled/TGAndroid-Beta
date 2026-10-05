package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class iv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27605f;
    public boolean h;
    public final fv0[] f27606n;
    public final long f27607r;
    public final long f27608s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f27609w;
    public boolean f27611y;
    public int[] f27601a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27602b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27603c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27604e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27610x = new ArrayList();

    public iv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27609w = n2Var;
        if (n2Var instanceof dh) {
            dh dhVar = (dh) n2Var;
            long a2 = dhVar.a();
            this.f27607r = a2;
            this.v = dhVar.G();
            this.f27608s = dhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final iv0 f27335b;

                    {
                        this.f27335b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                iv0 iv0Var = this.f27335b;
                                ArrayList arrayList = iv0Var.f27610x;
                                boolean booleanValue = bool.booleanValue();
                                iv0Var.f27605f = booleanValue;
                                iv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((jv0) arrayList.get(i11)).K();
                                    }
                                    return;
                                }
                                return;
                            default:
                                iv0 iv0Var2 = this.f27335b;
                                ArrayList arrayList2 = iv0Var2.f27610x;
                                boolean booleanValue2 = bool.booleanValue();
                                iv0Var2.f27605f = booleanValue2;
                                iv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((jv0) arrayList2.get(i12)).K();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (n2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) n2Var;
            if (profileActivity.f34275h1) {
                this.f27607r = profileActivity.getUserConfig().getClientUserId();
                this.f27608s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27607r = a10;
                this.f27608s = profileActivity.f34268g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34364u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final iv0 f27335b;

                        {
                            this.f27335b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    iv0 iv0Var = this.f27335b;
                                    ArrayList arrayList = iv0Var.f27610x;
                                    boolean booleanValue = bool.booleanValue();
                                    iv0Var.f27605f = booleanValue;
                                    iv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((jv0) arrayList.get(i11)).K();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    iv0 iv0Var2 = this.f27335b;
                                    ArrayList arrayList2 = iv0Var2.f27610x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    iv0Var2.f27605f = booleanValue2;
                                    iv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((jv0) arrayList2.get(i12)).K();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof pa0) {
            this.f27607r = ((pa0) n2Var).f29685e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f27607r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27607r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f27607r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27606n = new fv0[9];
        int i11 = 0;
        while (true) {
            fv0[] fv0VarArr = this.f27606n;
            if (i11 >= fv0VarArr.length) {
                break;
            }
            fv0VarArr[i11] = new fv0();
            fv0 fv0Var = this.f27606n[i11];
            if (DialogObject.isEncryptedDialog(this.f27607r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            fv0Var.f26598j[0] = i10;
            this.f27606n[i11].f26598j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f27609w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27609w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f27607r, this.f27608s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27608s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f27609w) {
            this.f27610x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27609w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27608s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
