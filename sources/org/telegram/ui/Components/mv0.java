package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class mv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f28606f;
    public boolean h;
    public final jv0[] f28607n;
    public final long f28608r;
    public final long f28609s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f28610w;
    public boolean f28612y;
    public int[] f28603a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f28604b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f28605c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28611x = new ArrayList();

    public mv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28610w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f28608r = a2;
            this.v = bhVar.I();
            this.f28609s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final mv0 f28283b;

                    {
                        this.f28283b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                mv0 mv0Var = this.f28283b;
                                ArrayList arrayList = mv0Var.f28611x;
                                boolean booleanValue = bool.booleanValue();
                                mv0Var.f28606f = booleanValue;
                                mv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((nv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                mv0 mv0Var2 = this.f28283b;
                                ArrayList arrayList2 = mv0Var2.f28611x;
                                boolean booleanValue2 = bool.booleanValue();
                                mv0Var2.f28606f = booleanValue2;
                                mv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((nv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f33641i1) {
                this.f28608r = profileActivity.getUserConfig().getClientUserId();
                this.f28609s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28608r = a10;
                this.f28609s = profileActivity.f33634h1;
                TLRPC.ChatFull chatFull2 = profileActivity.f33731v2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final mv0 f28283b;

                        {
                            this.f28283b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    mv0 mv0Var = this.f28283b;
                                    ArrayList arrayList = mv0Var.f28611x;
                                    boolean booleanValue = bool.booleanValue();
                                    mv0Var.f28606f = booleanValue;
                                    mv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((nv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    mv0 mv0Var2 = this.f28283b;
                                    ArrayList arrayList2 = mv0Var2.f28611x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    mv0Var2.f28606f = booleanValue2;
                                    mv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((nv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof wa0) {
            this.f28608r = ((wa0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.cy) {
            this.f28608r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28608r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f28608r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28607n = new jv0[9];
        int i11 = 0;
        while (true) {
            jv0[] jv0VarArr = this.f28607n;
            if (i11 >= jv0VarArr.length) {
                break;
            }
            jv0VarArr[i11] = new jv0();
            jv0 jv0Var = this.f28607n[i11];
            if (DialogObject.isEncryptedDialog(this.f28608r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            jv0Var.f27647j[0] = i10;
            this.f28607n[i11].f27647j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f28610w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28610w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f28608r, this.f28609s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28609s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f28610w) {
            this.f28611x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28610w;
        if (n2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28609s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
