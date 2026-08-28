package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class wt0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup A;
    public boolean f34365f;
    public boolean h;
    public final tt0[] f34366n;
    public final long f34367r;
    public final long f34368s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f34369w;
    public boolean f34371y;
    public int[] f34361a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f34362b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f34363c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f34364e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f34370x = new ArrayList();

    public wt0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i9;
        TLRPC.ChatFull chatFull;
        this.f34369w = o2Var;
        if (o2Var instanceof rg) {
            rg rgVar = (rg) o2Var;
            long a2 = rgVar.a();
            this.f34367r = a2;
            this.v = rgVar.H();
            this.f34368s = rgVar.b();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final wt0 f34004b;

                    {
                        this.f34004b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                wt0 wt0Var = this.f34004b;
                                ArrayList arrayList = wt0Var.f34370x;
                                boolean booleanValue = bool.booleanValue();
                                wt0Var.f34365f = booleanValue;
                                wt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((xt0) arrayList.get(i10)).L();
                                    }
                                    return;
                                }
                                return;
                            default:
                                wt0 wt0Var2 = this.f34004b;
                                ArrayList arrayList2 = wt0Var2.f34370x;
                                boolean booleanValue2 = bool.booleanValue();
                                wt0Var2.f34365f = booleanValue2;
                                wt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((xt0) arrayList2.get(i11)).L();
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
            if (profileActivity.f35941d1) {
                this.f34367r = profileActivity.getUserConfig().getClientUserId();
                this.f34368s = profileActivity.a();
            } else {
                long a3 = profileActivity.a();
                this.f34367r = a3;
                this.f34368s = profileActivity.f35934c1;
                TLRPC.ChatFull chatFull2 = profileActivity.f36032q2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a3 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a3, new Utilities.Callback(this) {
                        public final wt0 f34004b;

                        {
                            this.f34004b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    wt0 wt0Var = this.f34004b;
                                    ArrayList arrayList = wt0Var.f34370x;
                                    boolean booleanValue = bool.booleanValue();
                                    wt0Var.f34365f = booleanValue;
                                    wt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((xt0) arrayList.get(i10)).L();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    wt0 wt0Var2 = this.f34004b;
                                    ArrayList arrayList2 = wt0Var2.f34370x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    wt0Var2.f34365f = booleanValue2;
                                    wt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((xt0) arrayList2.get(i11)).L();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (o2Var instanceof k90) {
            this.f34367r = ((k90) o2Var).f30035e;
        } else if (o2Var instanceof org.telegram.ui.dy) {
            this.f34367r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f34367r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f34367r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f34366n = new tt0[9];
        int i10 = 0;
        while (true) {
            tt0[] tt0VarArr = this.f34366n;
            if (i10 >= tt0VarArr.length) {
                break;
            }
            tt0VarArr[i10] = new tt0();
            tt0 tt0Var = this.f34366n[i10];
            if (DialogObject.isEncryptedDialog(this.f34367r)) {
                i9 = Integer.MIN_VALUE;
            } else {
                i9 = Integer.MAX_VALUE;
            }
            tt0Var.f32795j[0] = i9;
            this.f34366n[i10].f32795j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f34369w;
        if (o2Var2 == null) {
            this.A = null;
        } else {
            this.A = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34369w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f34367r, this.f34368s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f34368s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f34369w) {
            this.f34370x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.A;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f34369w;
        if (o2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f34368s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
