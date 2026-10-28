package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class tv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f33160f;
    public boolean h;
    public final qv0[] f33161n;
    public final long f33162r;
    public final long f33163s;
    public long v;
    public final org.telegram.ui.ActionBar.r2 f33164w;
    public boolean f33166y;
    public int[] f33157a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f33158b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33159c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f33165x = new ArrayList();

    public tv0(org.telegram.ui.ActionBar.r2 r2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f33164w = r2Var;
        if (r2Var instanceof bh) {
            bh bhVar = (bh) r2Var;
            long a2 = bhVar.a();
            this.f33162r = a2;
            this.v = bhVar.J();
            this.f33163s = bhVar.b();
            if (a2 != r2Var.getUserConfig().getClientUserId()) {
                r2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final tv0 f32692b;

                    {
                        this.f32692b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                tv0 tv0Var = this.f32692b;
                                ArrayList arrayList = tv0Var.f33165x;
                                boolean booleanValue = bool.booleanValue();
                                tv0Var.f33160f = booleanValue;
                                tv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((uv0) arrayList.get(i11)).N();
                                    }
                                    return;
                                }
                                return;
                            default:
                                tv0 tv0Var2 = this.f32692b;
                                ArrayList arrayList2 = tv0Var2.f33165x;
                                boolean booleanValue2 = bool.booleanValue();
                                tv0Var2.f33160f = booleanValue2;
                                tv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((uv0) arrayList2.get(i12)).N();
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
            if (profileActivity.f36025h1) {
                this.f33162r = profileActivity.getUserConfig().getClientUserId();
                this.f33163s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f33162r = a10;
                this.f33163s = profileActivity.f36018g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f36115u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != r2Var.getUserConfig().getClientUserId()) {
                    r2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final tv0 f32692b;

                        {
                            this.f32692b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    tv0 tv0Var = this.f32692b;
                                    ArrayList arrayList = tv0Var.f33165x;
                                    boolean booleanValue = bool.booleanValue();
                                    tv0Var.f33160f = booleanValue;
                                    tv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((uv0) arrayList.get(i11)).N();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    tv0 tv0Var2 = this.f32692b;
                                    ArrayList arrayList2 = tv0Var2.f33165x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    tv0Var2.f33160f = booleanValue2;
                                    tv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((uv0) arrayList2.get(i12)).N();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (r2Var instanceof ua0) {
            this.f33162r = ((ua0) r2Var).e;
        } else if (r2Var instanceof org.telegram.ui.ey) {
            this.f33162r = r2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f33162r) && (chatFull = r2Var.getMessagesController().getChatFull(-this.f33162r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f33161n = new qv0[9];
        int i11 = 0;
        while (true) {
            qv0[] qv0VarArr = this.f33161n;
            if (i11 >= qv0VarArr.length) {
                break;
            }
            qv0VarArr[i11] = new qv0();
            qv0 qv0Var = this.f33161n[i11];
            if (DialogObject.isEncryptedDialog(this.f33162r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            qv0Var.f32039j[0] = i10;
            this.f33161n[i11].f32039j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.r2 r2Var2 = this.f33164w;
        if (r2Var2 == null) {
            this.E = null;
        } else {
            this.E = r2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33164w;
        if (r2Var != null) {
            r2Var.getMediaDataController().getMediaCounts(this.f33162r, this.f33163s, r2Var.getClassGuid());
            if (this.v != 0) {
                r2Var.getMediaDataController().getMediaCounts(this.v, this.f33163s, r2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var == this.f33164w) {
            this.f33165x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f33164w;
        if (r2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                r2Var.getMediaDataController().getMediaCounts(this.v, this.f33163s, r2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
