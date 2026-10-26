package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class sv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f32692f;
    public boolean h;
    public final pv0[] f32693n;
    public final long f32694r;
    public final long f32695s;
    public long v;
    public final org.telegram.ui.ActionBar.r2 f32696w;
    public boolean f32698y;
    public int[] f32689a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f32690b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f32691c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f32697x = new ArrayList();

    public sv0(org.telegram.ui.ActionBar.r2 r2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f32696w = r2Var;
        if (r2Var instanceof bh) {
            bh bhVar = (bh) r2Var;
            long a2 = bhVar.a();
            this.f32694r = a2;
            this.v = bhVar.J();
            this.f32695s = bhVar.b();
            if (a2 != r2Var.getUserConfig().getClientUserId()) {
                r2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final sv0 f32344b;

                    {
                        this.f32344b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                sv0 sv0Var = this.f32344b;
                                ArrayList arrayList = sv0Var.f32697x;
                                boolean booleanValue = bool.booleanValue();
                                sv0Var.f32692f = booleanValue;
                                sv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((tv0) arrayList.get(i11)).N();
                                    }
                                    return;
                                }
                                return;
                            default:
                                sv0 sv0Var2 = this.f32344b;
                                ArrayList arrayList2 = sv0Var2.f32697x;
                                boolean booleanValue2 = bool.booleanValue();
                                sv0Var2.f32692f = booleanValue2;
                                sv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((tv0) arrayList2.get(i12)).N();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (r2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) r2Var;
            if (profileActivity.f36001h1) {
                this.f32694r = profileActivity.getUserConfig().getClientUserId();
                this.f32695s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f32694r = a10;
                this.f32695s = profileActivity.f35994g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f36091u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != r2Var.getUserConfig().getClientUserId()) {
                    r2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final sv0 f32344b;

                        {
                            this.f32344b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    sv0 sv0Var = this.f32344b;
                                    ArrayList arrayList = sv0Var.f32697x;
                                    boolean booleanValue = bool.booleanValue();
                                    sv0Var.f32692f = booleanValue;
                                    sv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((tv0) arrayList.get(i11)).N();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    sv0 sv0Var2 = this.f32344b;
                                    ArrayList arrayList2 = sv0Var2.f32697x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    sv0Var2.f32692f = booleanValue2;
                                    sv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((tv0) arrayList2.get(i12)).N();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (r2Var instanceof ta0) {
            this.f32694r = ((ta0) r2Var).e;
        } else if (r2Var instanceof org.telegram.ui.cy) {
            this.f32694r = r2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f32694r) && (chatFull = r2Var.getMessagesController().getChatFull(-this.f32694r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f32693n = new pv0[9];
        int i11 = 0;
        while (true) {
            pv0[] pv0VarArr = this.f32693n;
            if (i11 >= pv0VarArr.length) {
                break;
            }
            pv0VarArr[i11] = new pv0();
            pv0 pv0Var = this.f32693n[i11];
            if (DialogObject.isEncryptedDialog(this.f32694r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            pv0Var.f31712j[0] = i10;
            this.f32693n[i11].f31712j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.r2 r2Var2 = this.f32696w;
        if (r2Var2 == null) {
            this.E = null;
        } else {
            this.E = r2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f32696w;
        if (r2Var != null) {
            r2Var.getMediaDataController().getMediaCounts(this.f32694r, this.f32695s, r2Var.getClassGuid());
            if (this.v != 0) {
                r2Var.getMediaDataController().getMediaCounts(this.v, this.f32695s, r2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var == this.f32696w) {
            this.f32697x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f32696w;
        if (r2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                r2Var.getMediaDataController().getMediaCounts(this.v, this.f32695s, r2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
