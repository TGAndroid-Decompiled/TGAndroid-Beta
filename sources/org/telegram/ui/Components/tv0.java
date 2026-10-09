package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class tv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f31285f;
    public boolean h;
    public final qv0[] f31286n;
    public final long f31287r;
    public final long f31288s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f31289w;
    public boolean f31291y;
    public int[] f31281a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f31282b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31283c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31284e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f31290x = new ArrayList();

    public tv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f31289w = n2Var;
        if (n2Var instanceof eh) {
            eh ehVar = (eh) n2Var;
            long a2 = ehVar.a();
            this.f31287r = a2;
            this.v = ehVar.I();
            this.f31288s = ehVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final tv0 f30901b;

                    {
                        this.f30901b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                tv0 tv0Var = this.f30901b;
                                ArrayList arrayList = tv0Var.f31290x;
                                boolean booleanValue = bool.booleanValue();
                                tv0Var.f31285f = booleanValue;
                                tv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((uv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                tv0 tv0Var2 = this.f30901b;
                                ArrayList arrayList2 = tv0Var2.f31290x;
                                boolean booleanValue2 = bool.booleanValue();
                                tv0Var2.f31285f = booleanValue2;
                                tv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((uv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f34265h1) {
                this.f31287r = profileActivity.getUserConfig().getClientUserId();
                this.f31288s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f31287r = a10;
                this.f31288s = profileActivity.f34258g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34354u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final tv0 f30901b;

                        {
                            this.f30901b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    tv0 tv0Var = this.f30901b;
                                    ArrayList arrayList = tv0Var.f31290x;
                                    boolean booleanValue = bool.booleanValue();
                                    tv0Var.f31285f = booleanValue;
                                    tv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((uv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    tv0 tv0Var2 = this.f30901b;
                                    ArrayList arrayList2 = tv0Var2.f31290x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    tv0Var2.f31285f = booleanValue2;
                                    tv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((uv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof db0) {
            this.f31287r = ((db0) n2Var).f25680e;
        } else if (n2Var instanceof org.telegram.ui.ty) {
            this.f31287r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f31287r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f31287r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f31286n = new qv0[9];
        int i11 = 0;
        while (true) {
            qv0[] qv0VarArr = this.f31286n;
            if (i11 >= qv0VarArr.length) {
                break;
            }
            qv0VarArr[i11] = new qv0();
            qv0 qv0Var = this.f31286n[i11];
            if (DialogObject.isEncryptedDialog(this.f31287r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            qv0Var.f30281j[0] = i10;
            this.f31286n[i11].f30281j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f31289w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f31289w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f31287r, this.f31288s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f31288s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f31289w) {
            this.f31290x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f31289w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f31288s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
