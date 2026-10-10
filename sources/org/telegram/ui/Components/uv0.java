package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class uv0 implements NotificationCenter.NotificationCenterDelegate {
    public final NotificationCenter.ObserversGroup E;
    public boolean f31644f;
    public boolean h;
    public final rv0[] f31645n;
    public final long f31646r;
    public final long f31647s;
    public long v;
    public final org.telegram.ui.ActionBar.n2 f31648w;
    public boolean f31650y;
    public int[] f31640a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f31641b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31642c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f31643e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f31649x = new ArrayList();

    public uv0(org.telegram.ui.ActionBar.n2 n2Var) {
        int i10;
        TLRPC.ChatFull chatFull;
        this.f31648w = n2Var;
        if (n2Var instanceof eh) {
            eh ehVar = (eh) n2Var;
            long a2 = ehVar.a();
            this.f31646r = a2;
            this.v = ehVar.I();
            this.f31647s = ehVar.d();
            if (a2 != n2Var.getUserConfig().getClientUserId()) {
                n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a2, new Utilities.Callback(this) {
                    public final uv0 f31227b;

                    {
                        this.f31227b = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                uv0 uv0Var = this.f31227b;
                                ArrayList arrayList = uv0Var.f31649x;
                                boolean booleanValue = bool.booleanValue();
                                uv0Var.f31644f = booleanValue;
                                uv0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((vv0) arrayList.get(i11)).M();
                                    }
                                    return;
                                }
                                return;
                            default:
                                uv0 uv0Var2 = this.f31227b;
                                ArrayList arrayList2 = uv0Var2.f31649x;
                                boolean booleanValue2 = bool.booleanValue();
                                uv0Var2.f31644f = booleanValue2;
                                uv0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((vv0) arrayList2.get(i12)).M();
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
            if (profileActivity.f34303h1) {
                this.f31646r = profileActivity.getUserConfig().getClientUserId();
                this.f31647s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f31646r = a10;
                this.f31647s = profileActivity.f34296g1;
                TLRPC.ChatFull chatFull2 = profileActivity.f34392u2;
                if (chatFull2 != null) {
                    c(chatFull2);
                }
                if (a10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.getMessagesController().getSavedMessagesController().hasSavedMessages(a10, new Utilities.Callback(this) {
                        public final uv0 f31227b;

                        {
                            this.f31227b = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    uv0 uv0Var = this.f31227b;
                                    ArrayList arrayList = uv0Var.f31649x;
                                    boolean booleanValue = bool.booleanValue();
                                    uv0Var.f31644f = booleanValue;
                                    uv0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((vv0) arrayList.get(i11)).M();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    uv0 uv0Var2 = this.f31227b;
                                    ArrayList arrayList2 = uv0Var2.f31649x;
                                    boolean booleanValue2 = bool.booleanValue();
                                    uv0Var2.f31644f = booleanValue2;
                                    uv0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((vv0) arrayList2.get(i12)).M();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (n2Var instanceof eb0) {
            this.f31646r = ((eb0) n2Var).f25996e;
        } else if (n2Var instanceof org.telegram.ui.ty) {
            this.f31646r = n2Var.getUserConfig().getClientUserId();
        }
        if (this.v == 0 && DialogObject.isChatDialog(this.f31646r) && (chatFull = n2Var.getMessagesController().getChatFull(-this.f31646r)) != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0) {
                this.v = -j3;
            }
        }
        this.f31645n = new rv0[9];
        int i11 = 0;
        while (true) {
            rv0[] rv0VarArr = this.f31645n;
            if (i11 >= rv0VarArr.length) {
                break;
            }
            rv0VarArr[i11] = new rv0();
            rv0 rv0Var = this.f31645n[i11];
            if (DialogObject.isEncryptedDialog(this.f31646r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            rv0Var.f30585j[0] = i10;
            this.f31645n[i11].f30585j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.n2 n2Var2 = this.f31648w;
        if (n2Var2 == null) {
            this.E = null;
        } else {
            this.E = n2Var2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
        }
    }

    public final void a() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f31648w;
        if (n2Var != null) {
            n2Var.getMediaDataController().getMediaCounts(this.f31646r, this.f31647s, n2Var.getClassGuid());
            if (this.v != 0) {
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f31647s, n2Var.getClassGuid());
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == this.f31648w) {
            this.f31649x.clear();
            NotificationCenter.ObserversGroup observersGroup = this.E;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f31648w;
        if (n2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.v == 0) {
                this.v = -j3;
                n2Var.getMediaDataController().getMediaCounts(this.v, this.f31647s, n2Var.getClassGuid());
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
