package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class pu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f29522f;
    public boolean h;
    public final mu0[] f29523n;
    public final long f29524r;
    public final long f29525s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f29526w;
    public boolean f29528y;
    public int[] f29518a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f29519b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29520c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f29521e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f29527x = new ArrayList();

    public pu0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f29526w = n2Var;
        if (n2Var instanceof ch) {
            ch chVar = (ch) n2Var;
            long a2 = chVar.a();
            this.f29524r = a2;
            this.v = chVar.I();
            this.f29525s = chVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final pu0 f29216b;

                    {
                        this.f29216b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                pu0 pu0Var = this.f29216b;
                                ArrayList arrayList = pu0Var.f29527x;
                                boolean booleanValue = bool.booleanValue();
                                pu0Var.f29522f = booleanValue;
                                pu0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((qu0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                pu0 pu0Var2 = this.f29216b;
                                ArrayList arrayList2 = pu0Var2.f29527x;
                                boolean booleanValue2 = bool.booleanValue();
                                pu0Var2.f29522f = booleanValue2;
                                pu0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((qu0) arrayList2.get(i12)).M();
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
            if (profileActivity.f33937h1) {
                this.f29524r = profileActivity.getUserConfig().getClientUserId();
                this.f29525s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f29524r = a10;
                this.f29525s = profileActivity.f33930g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34026u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final pu0 f29216b;

                        {
                            this.f29216b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    pu0 pu0Var = this.f29216b;
                                    ArrayList arrayList = pu0Var.f29527x;
                                    boolean booleanValue = bool.booleanValue();
                                    pu0Var.f29522f = booleanValue;
                                    pu0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((qu0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    pu0 pu0Var2 = this.f29216b;
                                    ArrayList arrayList2 = pu0Var2.f29527x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    pu0Var2.f29522f = booleanValue2;
                                    pu0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((qu0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof ca0) {
            this.f29524r = ((ca0) n2Var).f24977e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f29524r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f29524r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f29524r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f29523n = new mu0[9];
        int i11 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f29523n;
            if (i11 >= mu0VarArr.length) {
                break;
            }
            mu0VarArr[i11] = new mu0();
            mu0 mu0Var = this.f29523n[i11];
            if (DialogObject.isEncryptedDialog(this.f29524r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            mu0Var.f28550j[0] = i10;
            this.f29523n[i11].f28550j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f29526w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29526w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f29524r, this.f29525s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f29525s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f29526w) {
            this.f29527x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29526w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f29525s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
