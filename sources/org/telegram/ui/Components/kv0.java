package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class kv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f28000f;
    public boolean h;
    public final hv0[] f28001n;
    public final long f28002r;
    public final long f28003s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f28004w;
    public boolean f28006y;
    public int[] f27997a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f27998b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f27999c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28005x = new ArrayList();

    public kv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28004w = n2Var;
        if (n2Var instanceof bh) {
            bh bhVar = (bh) n2Var;
            long a2 = bhVar.a();
            this.f28002r = a2;
            this.v = bhVar.I();
            this.f28003s = bhVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final kv0 f27612b;

                    {
                        this.f27612b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                kv0 kv0Var = this.f27612b;
                                ArrayList arrayList = kv0Var.f28005x;
                                boolean booleanValue = bool.booleanValue();
                                kv0Var.f28000f = booleanValue;
                                kv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((lv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                kv0 kv0Var2 = this.f27612b;
                                ArrayList arrayList2 = kv0Var2.f28005x;
                                boolean booleanValue2 = bool.booleanValue();
                                kv0Var2.f28000f = booleanValue2;
                                kv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((lv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f33635i1) {
                this.f28002r = profileActivity.getUserConfig().getClientUserId();
                this.f28003s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28002r = a10;
                this.f28003s = profileActivity.f33628h1;
                TLRPC.ChatFull chatFull2 = profileActivity.f33725v2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final kv0 f27612b;

                        {
                            this.f27612b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    kv0 kv0Var = this.f27612b;
                                    ArrayList arrayList = kv0Var.f28005x;
                                    boolean booleanValue = bool.booleanValue();
                                    kv0Var.f28000f = booleanValue;
                                    kv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((lv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    kv0 kv0Var2 = this.f27612b;
                                    ArrayList arrayList2 = kv0Var2.f28005x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    kv0Var2.f28000f = booleanValue2;
                                    kv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((lv0) arrayList2.get(i12)).M();
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
            this.f28002r = ((wa0) n2Var).e;
        } else if (n2Var instanceof org.telegram.ui.ey) {
            this.f28002r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28002r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f28002r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28001n = new hv0[9];
        int i11 = 0;
        while (true) {
            hv0[] hv0VarArr = this.f28001n;
            if (i11 >= hv0VarArr.length) {
                break;
            }
            hv0VarArr[i11] = new hv0();
            hv0 hv0Var = this.f28001n[i11];
            if (DialogObject.isEncryptedDialog(this.f28002r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            hv0Var.f26955j[0] = i10;
            this.f28001n[i11].f26955j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f28004w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28004w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f28002r, this.f28003s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28003s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f28004w) {
            this.f28005x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28004w;
        if (n2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f28003s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
