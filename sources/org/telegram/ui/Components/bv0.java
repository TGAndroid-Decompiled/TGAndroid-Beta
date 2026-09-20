package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class bv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23060f;
    public boolean h;
    public final yu0[] f23061n;
    public final long f23062r;
    public final long f23063s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f23064w;
    public boolean f23066y;
    public int[] f23057a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23058b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23059c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23065x = new ArrayList();

    public bv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23064w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f23062r = a2;
            this.v = bhVar.I();
            this.f23063s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final bv0 f22778b;

                    {
                        this.f22778b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                bv0 bv0Var = this.f22778b;
                                ArrayList arrayList = bv0Var.f23065x;
                                boolean booleanValue = bool.booleanValue();
                                bv0Var.f23060f = booleanValue;
                                bv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((cv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                bv0 bv0Var2 = this.f22778b;
                                ArrayList arrayList2 = bv0Var2.f23065x;
                                boolean booleanValue2 = bool.booleanValue();
                                bv0Var2.f23060f = booleanValue2;
                                bv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((cv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31575h1) {
                this.f23062r = profileActivity.getUserConfig().getClientUserId();
                this.f23063s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23062r = a10;
                this.f23063s = profileActivity.f31568g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31664u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final bv0 f22778b;

                        {
                            this.f22778b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    bv0 bv0Var = this.f22778b;
                                    ArrayList arrayList = bv0Var.f23065x;
                                    boolean booleanValue = bool.booleanValue();
                                    bv0Var.f23060f = booleanValue;
                                    bv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((cv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    bv0 bv0Var2 = this.f22778b;
                                    ArrayList arrayList2 = bv0Var2.f23065x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    bv0Var2.f23060f = booleanValue2;
                                    bv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((cv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof ja0) {
            this.f23062r = ((ja0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f23062r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23062r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f23062r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23061n = new yu0[9];
        int i11 = 0;
        while (true) {
            yu0[] yu0VarArr = this.f23061n;
            if (i11 >= yu0VarArr.length) {
                break;
            }
            yu0VarArr[i11] = new yu0();
            yu0 yu0Var = this.f23061n[i11];
            if (DialogObject.isEncryptedDialog(this.f23062r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            yu0Var.f30618j[0] = i10;
            this.f23061n[i11].f30618j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f23064w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23064w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f23062r, this.f23063s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23063s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f23064w) {
            this.f23065x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23064w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23063s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
