package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ru0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27698f;
    public boolean h;
    public final ou0[] f27699n;
    public final long f27700r;
    public final long f27701s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f27702w;
    public boolean f27704y;
    public int[] f27695a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27696b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27697c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27703x = new ArrayList();

    public ru0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27702w = o2Var;
        if (o2Var instanceof ah) {
            ah ahVar = (ah) o2Var;
            long a2 = ahVar.a();
            this.f27700r = a2;
            this.v = ahVar.I();
            this.f27701s = ahVar.d();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final ru0 f27410b;

                    {
                        this.f27410b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ru0 ru0Var = this.f27410b;
                                ArrayList arrayList = ru0Var.f27703x;
                                boolean booleanValue = bool.booleanValue();
                                ru0Var.f27698f = booleanValue;
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
                                ru0 ru0Var2 = this.f27410b;
                                ArrayList arrayList2 = ru0Var2.f27703x;
                                boolean booleanValue2 = bool.booleanValue();
                                ru0Var2.f27698f = booleanValue2;
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
            if (profileActivity.f31308h1) {
                this.f27700r = profileActivity.getUserConfig().getClientUserId();
                this.f27701s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27700r = a10;
                this.f27701s = profileActivity.f31301g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31397u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final ru0 f27410b;

                        {
                            this.f27410b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ru0 ru0Var = this.f27410b;
                                    ArrayList arrayList = ru0Var.f27703x;
                                    boolean booleanValue = bool.booleanValue();
                                    ru0Var.f27698f = booleanValue;
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
                                    ru0 ru0Var2 = this.f27410b;
                                    ArrayList arrayList2 = ru0Var2.f27703x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ru0Var2.f27698f = booleanValue2;
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
            this.f27700r = ((ba0) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.wy) {
            this.f27700r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27700r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f27700r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27699n = new ou0[9];
        int i11 = 0;
        while (true) {
            ou0[] ou0VarArr = this.f27699n;
            if (i11 >= ou0VarArr.length) {
                break;
            }
            ou0VarArr[i11] = new ou0();
            ou0 ou0Var = this.f27699n[i11];
            if (DialogObject.isEncryptedDialog(this.f27700r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ou0Var.f26858j[0] = i10;
            this.f27699n[i11].f26858j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f27702w;
        if (o2Var2 == null) {
            this.E = null;
        } else {
            this.E = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27702w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f27700r, this.f27701s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f27701s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f27702w) {
            this.f27703x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27702w;
        if (o2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f27701s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ru0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
