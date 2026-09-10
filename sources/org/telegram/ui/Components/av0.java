package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class av0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f21613f;
    public boolean h;
    public final xu0[] f21614n;
    public final long f21615r;
    public final long f21616s;
    public long v;
    public final org.telegram.ui.ActionBar.p2 f21617w;
    public boolean f21619y;
    public int[] f21610a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f21611b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f21612c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f21618x = new ArrayList();

    public av0(org.telegram.ui.ActionBar.p2 p2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f21617w = p2Var;
        if (p2Var instanceof eh) {
            eh ehVar = (eh) p2Var;
            long a2 = ehVar.a();
            this.f21615r = a2;
            this.v = ehVar.I();
            this.f21616s = ehVar.d();
            if (a2 != p2Var.getUserConfig().getClientUserId()) {
                p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final av0 f29820b;

                    {
                        this.f29820b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                av0 av0Var = this.f29820b;
                                ArrayList arrayList = av0Var.f21618x;
                                boolean booleanValue = bool.booleanValue();
                                av0Var.f21613f = booleanValue;
                                av0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((bv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                av0 av0Var2 = this.f29820b;
                                ArrayList arrayList2 = av0Var2.f21618x;
                                boolean booleanValue2 = bool.booleanValue();
                                av0Var2.f21613f = booleanValue2;
                                av0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((bv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f30403h1) {
                this.f21615r = profileActivity.getUserConfig().getClientUserId();
                this.f21616s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f21615r = a10;
                this.f21616s = profileActivity.f30396g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f30492u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final av0 f29820b;

                        {
                            this.f29820b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    av0 av0Var = this.f29820b;
                                    ArrayList arrayList = av0Var.f21618x;
                                    boolean booleanValue = bool.booleanValue();
                                    av0Var.f21613f = booleanValue;
                                    av0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((bv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    av0 av0Var2 = this.f29820b;
                                    ArrayList arrayList2 = av0Var2.f21618x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    av0Var2.f21613f = booleanValue2;
                                    av0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((bv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (p2Var instanceof la0) {
            this.f21615r = ((la0) p2Var).e;
        } else if (p2Var instanceof org.telegram.ui.wy) {
            this.f21615r = p2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f21615r) && (chatFull = p2Var.getMessagesController().getChatFull(-this.f21615r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f21614n = new xu0[9];
        int i11 = 0;
        while (true) {
            xu0[] xu0VarArr = this.f21614n;
            if (i11 >= xu0VarArr.length) {
                break;
            }
            xu0VarArr[i11] = new xu0();
            xu0 xu0Var = this.f21614n[i11];
            if (DialogObject.isEncryptedDialog(this.f21615r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            xu0Var.f29162j[0] = i10;
            this.f21614n[i11].f29162j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.p2 p2Var2 = this.f21617w;
        if (p2Var2 == null) {
            this.E = null;
        } else {
            this.E = p2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f21617w;
        if (p2Var != null) {
            p2Var.getMediaDataController().getMediaCounts(this.f21615r, this.f21616s, p2Var.getClassGuid());
            if (this.v != 0) {
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f21616s, p2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == this.f21617w) {
            this.f21618x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f21617w;
        if (p2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                p2Var.getMediaDataController().getMediaCounts(this.v, this.f21616s, p2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r25, int r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
