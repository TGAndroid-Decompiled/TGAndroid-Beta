package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class qu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f27450f;
    public boolean h;
    public final nu0[] f27451n;
    public final long f27452r;
    public final long f27453s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f27454w;
    public boolean f27456y;
    public int[] f27447a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27448b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27449c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f27455x = new ArrayList();

    public qu0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f27454w = n2Var;
        if (n2Var instanceof ah) {
            ah ahVar = (ah) n2Var;
            long a2 = ahVar.a();
            this.f27452r = a2;
            this.v = ahVar.I();
            this.f27453s = ahVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final qu0 f27151b;

                    {
                        this.f27151b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                qu0 qu0Var = this.f27151b;
                                ArrayList arrayList = qu0Var.f27455x;
                                boolean booleanValue = bool.booleanValue();
                                qu0Var.f27450f = booleanValue;
                                qu0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ru0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                qu0 qu0Var2 = this.f27151b;
                                ArrayList arrayList2 = qu0Var2.f27455x;
                                boolean booleanValue2 = bool.booleanValue();
                                qu0Var2.f27450f = booleanValue2;
                                qu0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ru0) arrayList2.get(i12)).M();
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
            if (profileActivity.f31291h1) {
                this.f27452r = profileActivity.getUserConfig().getClientUserId();
                this.f27453s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f27452r = a10;
                this.f27453s = profileActivity.f31284g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31380u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final qu0 f27151b;

                        {
                            this.f27151b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    qu0 qu0Var = this.f27151b;
                                    ArrayList arrayList = qu0Var.f27455x;
                                    boolean booleanValue = bool.booleanValue();
                                    qu0Var.f27450f = booleanValue;
                                    qu0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ru0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    qu0 qu0Var2 = this.f27151b;
                                    ArrayList arrayList2 = qu0Var2.f27455x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qu0Var2.f27450f = booleanValue2;
                                    qu0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ru0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof ba0) {
            this.f27452r = ((ba0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.uy) {
            this.f27452r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f27452r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f27452r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f27451n = new nu0[9];
        int i11 = 0;
        while (true) {
            nu0[] nu0VarArr = this.f27451n;
            if (i11 >= nu0VarArr.length) {
                break;
            }
            nu0VarArr[i11] = new nu0();
            nu0 nu0Var = this.f27451n[i11];
            if (DialogObject.isEncryptedDialog(this.f27452r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            nu0Var.f26582j[0] = i10;
            this.f27451n[i11].f26582j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f27454w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27454w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f27452r, this.f27453s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27453s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f27454w) {
            this.f27455x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27454w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f27453s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
