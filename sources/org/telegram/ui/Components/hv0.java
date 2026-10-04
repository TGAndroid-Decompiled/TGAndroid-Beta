package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class hv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27242f;
    public boolean h;
    public final ev0[] f27243n;
    public final long f27244r;
    public final long f27245s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f27246w;
    public boolean f27248y;
    public int[] f27238a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27239b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27240c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27241e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27247x = new ArrayList();

    public hv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27246w = n2Var;
        if (n2Var instanceof dh) {
            dh dhVar = (dh) n2Var;
            long a2 = dhVar.a();
            this.f27244r = a2;
            this.v = dhVar.G();
            this.f27245s = dhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final hv0 f26927b;

                    {
                        this.f26927b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                hv0 hv0Var = this.f26927b;
                                ArrayList arrayList = hv0Var.f27247x;
                                boolean booleanValue = bool.booleanValue();
                                hv0Var.f27242f = booleanValue;
                                hv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((iv0) arrayList.get(i11)).K();
                                    }
                                    return;
                                }
                                return;
                            default:
                                hv0 hv0Var2 = this.f26927b;
                                ArrayList arrayList2 = hv0Var2.f27247x;
                                boolean booleanValue2 = bool.booleanValue();
                                hv0Var2.f27242f = booleanValue2;
                                hv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((iv0) arrayList2.get(i12)).K();
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
            if (profileActivity.f34255h1) {
                this.f27244r = profileActivity.getUserConfig().getClientUserId();
                this.f27245s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27244r = a10;
                this.f27245s = profileActivity.f34248g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34344u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final hv0 f26927b;

                        {
                            this.f26927b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    hv0 hv0Var = this.f26927b;
                                    ArrayList arrayList = hv0Var.f27247x;
                                    boolean booleanValue = bool.booleanValue();
                                    hv0Var.f27242f = booleanValue;
                                    hv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((iv0) arrayList.get(i11)).K();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    hv0 hv0Var2 = this.f26927b;
                                    ArrayList arrayList2 = hv0Var2.f27247x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    hv0Var2.f27242f = booleanValue2;
                                    hv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((iv0) arrayList2.get(i12)).K();
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
            this.f27244r = ((pa0) n2Var).f29586e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f27244r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27244r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f27244r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27243n = new ev0[9];
        int i11 = 0;
        while (true) {
            ev0[] ev0VarArr = this.f27243n;
            if (i11 >= ev0VarArr.length) {
                break;
            }
            ev0VarArr[i11] = new ev0();
            ev0 ev0Var = this.f27243n[i11];
            if (DialogObject.isEncryptedDialog(this.f27244r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ev0Var.f26145j[0] = i10;
            this.f27243n[i11].f26145j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f27246w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27246w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f27244r, this.f27245s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27245s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f27246w) {
            this.f27247x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27246w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27245s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
