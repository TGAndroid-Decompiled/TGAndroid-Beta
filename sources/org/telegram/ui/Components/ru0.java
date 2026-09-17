package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ru0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27695f;
    public boolean h;
    public final ou0[] f27696n;
    public final long f27697r;
    public final long f27698s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f27699w;
    public boolean f27701y;
    public int[] f27692a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27693b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27694c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27700x = new ArrayList();

    public ru0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27699w = o2Var;
        if (o2Var instanceof ah) {
            ah ahVar = (ah) o2Var;
            long a2 = ahVar.a();
            this.f27697r = a2;
            this.v = ahVar.I();
            this.f27698s = ahVar.d();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final ru0 f27407b;

                    {
                        this.f27407b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ru0 ru0Var = this.f27407b;
                                ArrayList arrayList = ru0Var.f27700x;
                                boolean booleanValue = bool.booleanValue();
                                ru0Var.f27695f = booleanValue;
                                ru0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((su0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                ru0 ru0Var2 = this.f27407b;
                                ArrayList arrayList2 = ru0Var2.f27700x;
                                boolean booleanValue2 = bool.booleanValue();
                                ru0Var2.f27695f = booleanValue2;
                                ru0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((su0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31304h1) {
                this.f27697r = profileActivity.getUserConfig().getClientUserId();
                this.f27698s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27697r = a10;
                this.f27698s = profileActivity.f31297g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31393u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final ru0 f27407b;

                        {
                            this.f27407b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ru0 ru0Var = this.f27407b;
                                    ArrayList arrayList = ru0Var.f27700x;
                                    boolean booleanValue = bool.booleanValue();
                                    ru0Var.f27695f = booleanValue;
                                    ru0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((su0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ru0 ru0Var2 = this.f27407b;
                                    ArrayList arrayList2 = ru0Var2.f27700x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ru0Var2.f27695f = booleanValue2;
                                    ru0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((su0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (o2Var instanceof ba0) {
            this.f27697r = ((ba0) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.wy) {
            this.f27697r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27697r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f27697r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27696n = new ou0[9];
        int i11 = 0;
        while (true) {
            ou0[] ou0VarArr = this.f27696n;
            if (i11 >= ou0VarArr.length) {
                break;
            }
            ou0VarArr[i11] = new ou0();
            ou0 ou0Var = this.f27696n[i11];
            if (DialogObject.isEncryptedDialog(this.f27697r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ou0Var.f26855j[0] = i10;
            this.f27696n[i11].f26855j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f27699w;
        if (o2Var2 == null) {
            this.E = null;
        } else {
            this.E = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27699w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f27697r, this.f27698s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f27698s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f27699w) {
            this.f27700x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27699w;
        if (o2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f27698s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ru0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
