package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class dv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23751f;
    public boolean h;
    public final av0[] f23752n;
    public final long f23753r;
    public final long f23754s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f23755w;
    public boolean f23757y;
    public int[] f23748a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23749b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23750c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23756x = new ArrayList();

    public dv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23755w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f23753r = a2;
            this.v = bhVar.I();
            this.f23754s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final dv0 f23451b;

                    {
                        this.f23451b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                dv0 dv0Var = this.f23451b;
                                ArrayList arrayList = dv0Var.f23756x;
                                boolean booleanValue = bool.booleanValue();
                                dv0Var.f23751f = booleanValue;
                                dv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ev0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                dv0 dv0Var2 = this.f23451b;
                                ArrayList arrayList2 = dv0Var2.f23756x;
                                boolean booleanValue2 = bool.booleanValue();
                                dv0Var2.f23751f = booleanValue2;
                                dv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ev0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31596h1) {
                this.f23753r = profileActivity.getUserConfig().getClientUserId();
                this.f23754s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23753r = a10;
                this.f23754s = profileActivity.f31589g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31685u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final dv0 f23451b;

                        {
                            this.f23451b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    dv0 dv0Var = this.f23451b;
                                    ArrayList arrayList = dv0Var.f23756x;
                                    boolean booleanValue = bool.booleanValue();
                                    dv0Var.f23751f = booleanValue;
                                    dv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ev0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    dv0 dv0Var2 = this.f23451b;
                                    ArrayList arrayList2 = dv0Var2.f23756x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    dv0Var2.f23751f = booleanValue2;
                                    dv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ev0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof ma0) {
            this.f23753r = ((ma0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f23753r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23753r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f23753r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23752n = new av0[9];
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f23752n;
            if (i11 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i11] = new av0();
            av0 av0Var = this.f23752n[i11];
            if (DialogObject.isEncryptedDialog(this.f23753r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            av0Var.f22750j[0] = i10;
            this.f23752n[i11].f22750j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f23755w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23755w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f23753r, this.f23754s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23754s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f23755w) {
            this.f23756x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f23755w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f23754s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
