package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class hv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27243f;
    public boolean h;
    public final ev0[] f27244n;
    public final long f27245r;
    public final long f27246s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f27247w;
    public boolean f27249y;
    public int[] f27239a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27240b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27241c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27242e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27248x = new ArrayList();

    public hv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27247w = n2Var;
        if (n2Var instanceof dh) {
            dh dhVar = (dh) n2Var;
            long a2 = dhVar.a();
            this.f27245r = a2;
            this.v = dhVar.G();
            this.f27246s = dhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final hv0 f26928b;

                    {
                        this.f26928b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                hv0 hv0Var = this.f26928b;
                                ArrayList arrayList = hv0Var.f27248x;
                                boolean booleanValue = bool.booleanValue();
                                hv0Var.f27243f = booleanValue;
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
                                hv0 hv0Var2 = this.f26928b;
                                ArrayList arrayList2 = hv0Var2.f27248x;
                                boolean booleanValue2 = bool.booleanValue();
                                hv0Var2.f27243f = booleanValue2;
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
            if (profileActivity.f34256h1) {
                this.f27245r = profileActivity.getUserConfig().getClientUserId();
                this.f27246s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27245r = a10;
                this.f27246s = profileActivity.f34249g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34345u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final hv0 f26928b;

                        {
                            this.f26928b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    hv0 hv0Var = this.f26928b;
                                    ArrayList arrayList = hv0Var.f27248x;
                                    boolean booleanValue = bool.booleanValue();
                                    hv0Var.f27243f = booleanValue;
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
                                    hv0 hv0Var2 = this.f26928b;
                                    ArrayList arrayList2 = hv0Var2.f27248x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    hv0Var2.f27243f = booleanValue2;
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
            this.f27245r = ((pa0) n2Var).f29587e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f27245r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27245r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f27245r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27244n = new ev0[9];
        int i11 = 0;
        while (true) {
            ev0[] ev0VarArr = this.f27244n;
            if (i11 >= ev0VarArr.length) {
                break;
            }
            ev0VarArr[i11] = new ev0();
            ev0 ev0Var = this.f27244n[i11];
            if (DialogObject.isEncryptedDialog(this.f27245r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ev0Var.f26146j[0] = i10;
            this.f27244n[i11].f26146j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f27247w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27247w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f27245r, this.f27246s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27246s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f27247w) {
            this.f27248x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27247w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27246s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
