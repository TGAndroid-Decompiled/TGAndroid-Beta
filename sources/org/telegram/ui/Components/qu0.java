package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class qu0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup B;
    public boolean f30532f;
    public boolean h;
    public final nu0[] f30533n;
    public final long f30534r;
    public final long f30535s;
    public long v;
    public final org.telegram.ui.ActionBar.p2 f30536w;
    public boolean f30538y;
    public int[] f30528a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f30529b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f30530c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f30531e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f30537x = new ArrayList();

    public qu0(org.telegram.ui.ActionBar.p2 p2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f30536w = p2Var;
        if (p2Var instanceof rg) {
            rg rgVar = (rg) p2Var;
            long a2 = rgVar.a();
            this.f30534r = a2;
            this.v = rgVar.H();
            this.f30535s = rgVar.b();
            if (a2 != p2Var.getUserConfig().getClientUserId()) {
                p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final qu0 f30190b;

                    {
                        this.f30190b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                qu0 qu0Var = this.f30190b;
                                ArrayList arrayList = qu0Var.f30537x;
                                boolean booleanValue = bool.booleanValue();
                                qu0Var.f30532f = booleanValue;
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
                                qu0 qu0Var2 = this.f30190b;
                                ArrayList arrayList2 = qu0Var2.f30537x;
                                boolean booleanValue2 = bool.booleanValue();
                                qu0Var2.f30532f = booleanValue2;
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
            if (profileActivity.f34591e1) {
                this.f30534r = profileActivity.getUserConfig().getClientUserId();
                this.f30535s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f30534r = a10;
                this.f30535s = profileActivity.f34583d1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34683r2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final qu0 f30190b;

                        {
                            this.f30190b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    qu0 qu0Var = this.f30190b;
                                    ArrayList arrayList = qu0Var.f30537x;
                                    boolean booleanValue = bool.booleanValue();
                                    qu0Var.f30532f = booleanValue;
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
                                    qu0 qu0Var2 = this.f30190b;
                                    ArrayList arrayList2 = qu0Var2.f30537x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qu0Var2.f30532f = booleanValue2;
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
        } else if (p2Var instanceof fa0) {
            this.f30534r = ((fa0) p2Var).f26852e;
        } else if (p2Var instanceof org.telegram.ui.py) {
            this.f30534r = p2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f30534r) && (chatFull = p2Var.getMessagesController().getChatFull(-this.f30534r)) != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0) {
                this.v = -j10;
            }
        }
        this.f30533n = new nu0[9];
        int i11 = 0;
        while (true) {
            nu0[] nu0VarArr = this.f30533n;
            if (i11 >= nu0VarArr.length) {
                break;
            }
            nu0VarArr[i11] = new nu0();
            nu0 nu0Var = this.f30533n[i11];
            if (DialogObject.isEncryptedDialog(this.f30534r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            nu0Var.f29587j[0] = i10;
            this.f30533n[i11].f29587j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.p2 p2Var2 = this.f30536w;
        if (p2Var2 == null) {
            this.B = null;
        } else {
            this.B = p2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30536w;
        if (p2Var != null) {
            p2Var.getMediaDataController().getMediaCounts(this.f30534r, this.f30535s, p2Var.getClassGuid());
            if (this.v != 0) {
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f30535s, p2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == this.f30536w) {
            this.f30537x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.B;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30536w;
        if (p2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.v == 0) {
                this.v = -j10;
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f30535s, p2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
