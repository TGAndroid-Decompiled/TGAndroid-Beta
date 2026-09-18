package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class cv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23333f;
    public boolean h;
    public final zu0[] f23334n;
    public final long f23335r;
    public final long f23336s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f23337w;
    public boolean f23339y;
    public int[] f23330a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23331b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23332c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23338x = new ArrayList();

    public cv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23337w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f23335r = a2;
            this.v = bhVar.I();
            this.f23336s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final cv0 f23084b;

                    {
                        this.f23084b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                cv0 cv0Var = this.f23084b;
                                ArrayList arrayList = cv0Var.f23338x;
                                boolean booleanValue = bool.booleanValue();
                                cv0Var.f23333f = booleanValue;
                                cv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((dv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                cv0 cv0Var2 = this.f23084b;
                                ArrayList arrayList2 = cv0Var2.f23338x;
                                boolean booleanValue2 = bool.booleanValue();
                                cv0Var2.f23333f = booleanValue2;
                                cv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((dv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31535h1) {
                this.f23335r = profileActivity.getUserConfig().getClientUserId();
                this.f23336s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23335r = a10;
                this.f23336s = profileActivity.f31528g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31624u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final cv0 f23084b;

                        {
                            this.f23084b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    cv0 cv0Var = this.f23084b;
                                    ArrayList arrayList = cv0Var.f23338x;
                                    boolean booleanValue = bool.booleanValue();
                                    cv0Var.f23333f = booleanValue;
                                    cv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((dv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    cv0 cv0Var2 = this.f23084b;
                                    ArrayList arrayList2 = cv0Var2.f23338x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    cv0Var2.f23333f = booleanValue2;
                                    cv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((dv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof ka0) {
            this.f23335r = ((ka0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f23335r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23335r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f23335r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23334n = new zu0[9];
        int i11 = 0;
        while (true) {
            zu0[] zu0VarArr = this.f23334n;
            if (i11 >= zu0VarArr.length) {
                break;
            }
            zu0VarArr[i11] = new zu0();
            zu0 zu0Var = this.f23334n[i11];
            if (DialogObject.isEncryptedDialog(this.f23335r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            zu0Var.f30883j[0] = i10;
            this.f23334n[i11].f30883j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f23337w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23337w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f23335r, this.f23336s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23336s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f23337w) {
            this.f23338x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23337w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23336s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
