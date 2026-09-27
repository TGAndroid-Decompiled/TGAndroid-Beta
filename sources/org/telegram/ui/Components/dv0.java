package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class dv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f23737f;
    public boolean h;
    public final av0[] f23738n;
    public final long f23739r;
    public final long f23740s;
    public long v;
    public final org.telegram.ui.ActionBar.o2 f23741w;
    public boolean f23743y;
    public int[] f23734a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f23735b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f23736c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f23742x = new ArrayList();

    public dv0(org.telegram.ui.ActionBar.o2 o2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f23741w = o2Var;
        if (o2Var instanceof ch) {
            ch chVar = (ch) o2Var;
            long a2 = chVar.a();
            this.f23739r = a2;
            this.v = chVar.I();
            this.f23740s = chVar.d();
            if (a2 != o2Var.getUserConfig().getClientUserId()) {
                o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final dv0 f23419b;

                    {
                        this.f23419b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                dv0 dv0Var = this.f23419b;
                                ArrayList arrayList = dv0Var.f23742x;
                                boolean booleanValue = bool.booleanValue();
                                dv0Var.f23737f = booleanValue;
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
                                dv0 dv0Var2 = this.f23419b;
                                ArrayList arrayList2 = dv0Var2.f23742x;
                                boolean booleanValue2 = bool.booleanValue();
                                dv0Var2.f23737f = booleanValue2;
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
        } else if (o2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) o2Var;
            if (profileActivity.f31579h1) {
                this.f23739r = profileActivity.getUserConfig().getClientUserId();
                this.f23740s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f23739r = a10;
                this.f23740s = profileActivity.f31572g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f31668u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final dv0 f23419b;

                        {
                            this.f23419b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    dv0 dv0Var = this.f23419b;
                                    ArrayList arrayList = dv0Var.f23742x;
                                    boolean booleanValue = bool.booleanValue();
                                    dv0Var.f23737f = booleanValue;
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
                                    dv0 dv0Var2 = this.f23419b;
                                    ArrayList arrayList2 = dv0Var2.f23742x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    dv0Var2.f23737f = booleanValue2;
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
        } else if (o2Var instanceof oa0) {
            this.f23739r = ((oa0) o2Var).e;
        } else if (o2Var instanceof org.telegram.ui.ty) {
            this.f23739r = o2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f23739r) && (chatFull = o2Var.getMessagesController().getChatFull(-this.f23739r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f23738n = new av0[9];
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f23738n;
            if (i11 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i11] = new av0();
            av0 av0Var = this.f23738n[i11];
            if (DialogObject.isEncryptedDialog(this.f23739r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            av0Var.f22773j[0] = i10;
            this.f23738n[i11].f22773j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.o2 o2Var2 = this.f23741w;
        if (o2Var2 == null) {
            this.E = null;
        } else {
            this.E = o2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f23741w;
        if (o2Var != null) {
            o2Var.getMediaDataController().getMediaCounts(this.f23739r, this.f23740s, o2Var.getClassGuid());
            if (this.v != 0) {
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f23740s, o2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == this.f23741w) {
            this.f23742x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f23741w;
        if (o2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                o2Var.getMediaDataController().getMediaCounts(this.v, this.f23740s, o2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
