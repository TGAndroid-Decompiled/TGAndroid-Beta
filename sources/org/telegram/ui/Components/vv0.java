package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class vv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f32491f;
    public boolean h;
    public final sv0[] f32492n;
    public final long f32493r;
    public final long f32494s;
    public long v;
    public final org.telegram.ui.ActionBar.m2 f32495w;
    public boolean f32497y;
    public int[] f32487a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f32488b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f32489c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f32490e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f32496x = new ArrayList();

    public vv0(org.telegram.ui.ActionBar.m2 m2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f32495w = m2Var;
        if (m2Var instanceof eh) {
            eh ehVar = (eh) m2Var;
            long a2 = ehVar.a();
            this.f32493r = a2;
            this.v = ehVar.I();
            this.f32494s = ehVar.d();
            if (a2 != m2Var.getUserConfig().getClientUserId()) {
                m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final vv0 f31572b;

                    {
                        this.f31572b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                vv0 vv0Var = this.f31572b;
                                ArrayList arrayList = vv0Var.f32496x;
                                boolean booleanValue = bool.booleanValue();
                                vv0Var.f32491f = booleanValue;
                                vv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((wv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                vv0 vv0Var2 = this.f31572b;
                                ArrayList arrayList2 = vv0Var2.f32496x;
                                boolean booleanValue2 = bool.booleanValue();
                                vv0Var2.f32491f = booleanValue2;
                                vv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((wv0) arrayList2.get(i12)).M();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (m2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) m2Var;
            if (profileActivity.f34293h1) {
                this.f32493r = profileActivity.getUserConfig().getClientUserId();
                this.f32494s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f32493r = a10;
                this.f32494s = profileActivity.f34286g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34382u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final vv0 f31572b;

                        {
                            this.f31572b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    vv0 vv0Var = this.f31572b;
                                    ArrayList arrayList = vv0Var.f32496x;
                                    boolean booleanValue = bool.booleanValue();
                                    vv0Var.f32491f = booleanValue;
                                    vv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((wv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    vv0 vv0Var2 = this.f31572b;
                                    ArrayList arrayList2 = vv0Var2.f32496x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    vv0Var2.f32491f = booleanValue2;
                                    vv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((wv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (m2Var instanceof eb0) {
            this.f32493r = ((eb0) m2Var).f25960e;
        } else if (m2Var instanceof org.telegram.ui.sy) {
            this.f32493r = m2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f32493r) && (chatFull = m2Var.getMessagesController().getChatFull(-this.f32493r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f32492n = new sv0[9];
        int i11 = 0;
        while (true) {
            sv0[] sv0VarArr = this.f32492n;
            if (i11 >= sv0VarArr.length) {
                break;
            }
            sv0VarArr[i11] = new sv0();
            sv0 sv0Var = this.f32492n[i11];
            if (DialogObject.isEncryptedDialog(this.f32493r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            sv0Var.f30874j[0] = i10;
            this.f32492n[i11].f30874j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.m2 m2Var2 = this.f32495w;
        if (m2Var2 == null) {
            this.E = null;
        } else {
            this.E = m2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f32495w;
        if (m2Var != null) {
            m2Var.getMediaDataController().getMediaCounts(this.f32493r, this.f32494s, m2Var.getClassGuid());
            if (this.v != 0) {
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f32494s, m2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == this.f32495w) {
            this.f32496x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f32495w;
        if (m2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                m2Var.getMediaDataController().getMediaCounts(this.v, this.f32494s, m2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
