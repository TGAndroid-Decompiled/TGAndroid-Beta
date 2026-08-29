package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class iu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup A;
    public boolean f29479f;
    public boolean h;
    public final fu0[] f29480n;
    public final long f29481r;
    public final long f29482s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f29483w;
    public boolean f29485y;
    public int[] f29475a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f29476b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29477c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29478e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f29484x = new ArrayList();

    public iu0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f29483w = o2Var;
        if (o2Var instanceof ug) {
            ug ugVar = (ug) o2Var;
            long a2 = ugVar.a();
            this.f29481r = a2;
            this.v = ugVar.H();
            this.f29482s = ugVar.b();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final iu0 f29232b;

                    {
                        this.f29232b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                iu0 iu0Var = this.f29232b;
                                ArrayList arrayList = iu0Var.f29484x;
                                boolean booleanValue = bool.booleanValue();
                                iu0Var.f29479f = booleanValue;
                                iu0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ju0) arrayList.get(i11)).L();
                                    }
                                    return;
                                }
                                return;
                            default:
                                iu0 iu0Var2 = this.f29232b;
                                ArrayList arrayList2 = iu0Var2.f29484x;
                                boolean booleanValue2 = bool.booleanValue();
                                iu0Var2.f29479f = booleanValue2;
                                iu0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ju0) arrayList2.get(i12)).L();
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
            if (profileActivity.f36006d1) {
                this.f29481r = profileActivity.getUserConfig().getClientUserId();
                this.f29482s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f29481r = a10;
                this.f29482s = profileActivity.f36001c1;
                TLRPC.ChatFull chatFull2 = profileActivity.f36099q2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final iu0 f29232b;

                        {
                            this.f29232b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    iu0 iu0Var = this.f29232b;
                                    ArrayList arrayList = iu0Var.f29484x;
                                    boolean booleanValue = bool.booleanValue();
                                    iu0Var.f29479f = booleanValue;
                                    iu0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ju0) arrayList.get(i11)).L();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    iu0 iu0Var2 = this.f29232b;
                                    ArrayList arrayList2 = iu0Var2.f29484x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    iu0Var2.f29479f = booleanValue2;
                                    iu0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ju0) arrayList2.get(i12)).L();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (o2Var instanceof y90) {
            this.f29481r = ((y90) o2Var).f34997e;
        } else if (o2Var instanceof org.telegram.ui.fy) {
            this.f29481r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f29481r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f29481r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f29480n = new fu0[9];
        int i11 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f29480n;
            if (i11 >= fu0VarArr.length) {
                break;
            }
            fu0VarArr[i11] = new fu0();
            fu0 fu0Var = this.f29480n[i11];
            if (DialogObject.isEncryptedDialog(this.f29481r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            fu0Var.f28541j[0] = i10;
            this.f29480n[i11].f28541j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f29483w;
        if (o2Var2 == null) {
            this.A = null;
        } else {
            this.A = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29483w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f29481r, this.f29482s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29482s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f29483w) {
            this.f29484x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.A;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29483w;
        if (o2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f29482s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
