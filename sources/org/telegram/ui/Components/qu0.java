package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class qu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup B;
    public boolean f28274f;
    public boolean h;
    public final nu0[] f28275n;
    public final long f28276r;
    public final long f28277s;
    public long v;
    public final org.telegram.ui.ActionBar.p2 f28278w;
    public boolean f28280y;
    public int[] f28271a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f28272b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f28273c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f28279x = new ArrayList();

    public qu0(org.telegram.ui.ActionBar.p2 p2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f28278w = p2Var;
        if (p2Var instanceof rg) {
            rg rgVar = (rg) p2Var;
            long a2 = rgVar.a();
            this.f28276r = a2;
            this.v = rgVar.H();
            this.f28277s = rgVar.d();
            if (a2 != p2Var.getUserConfig().getClientUserId()) {
                p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final qu0 f28012b;

                    {
                        this.f28012b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                qu0 qu0Var = this.f28012b;
                                ArrayList arrayList = qu0Var.f28279x;
                                boolean booleanValue = bool.booleanValue();
                                qu0Var.f28274f = booleanValue;
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
                                qu0 qu0Var2 = this.f28012b;
                                ArrayList arrayList2 = qu0Var2.f28279x;
                                boolean booleanValue2 = bool.booleanValue();
                                qu0Var2.f28274f = booleanValue2;
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
        } else if (p2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) p2Var;
            if (profileActivity.f32032e1) {
                this.f28276r = profileActivity.getUserConfig().getClientUserId();
                this.f28277s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f28276r = a10;
                this.f28277s = profileActivity.f32025d1;
                TLRPC.ChatFull chatFull2 = profileActivity.f32124r2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final qu0 f28012b;

                        {
                            this.f28012b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    qu0 qu0Var = this.f28012b;
                                    ArrayList arrayList = qu0Var.f28279x;
                                    boolean booleanValue = bool.booleanValue();
                                    qu0Var.f28274f = booleanValue;
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
                                    qu0 qu0Var2 = this.f28012b;
                                    ArrayList arrayList2 = qu0Var2.f28279x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qu0Var2.f28274f = booleanValue2;
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
        } else if (p2Var instanceof ea0) {
            this.f28276r = ((ea0) p2Var).e;
        } else if (p2Var instanceof org.telegram.ui.qy) {
            this.f28276r = p2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f28276r) && (chatFull = p2Var.getMessagesController().getChatFull(-this.f28276r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f28275n = new nu0[9];
        int i11 = 0;
        while (true) {
            nu0[] nu0VarArr = this.f28275n;
            if (i11 >= nu0VarArr.length) {
                break;
            }
            nu0VarArr[i11] = new nu0();
            nu0 nu0Var = this.f28275n[i11];
            if (DialogObject.isEncryptedDialog(this.f28276r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            nu0Var.f27374j[0] = i10;
            this.f28275n[i11].f27374j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.p2 p2Var2 = this.f28278w;
        if (p2Var2 == null) {
            this.B = null;
        } else {
            this.B = p2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28278w;
        if (p2Var != null) {
            p2Var.getMediaDataController().getMediaCounts(this.f28276r, this.f28277s, p2Var.getClassGuid());
            if (this.v != 0) {
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f28277s, p2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == this.f28278w) {
            this.f28279x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.B;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28278w;
        if (p2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f28277s, p2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
