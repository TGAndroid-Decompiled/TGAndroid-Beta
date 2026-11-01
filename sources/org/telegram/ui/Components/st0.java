package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class st0 implements org.telegram.messenger.vs {
    public boolean D;
    public final xa.n E;
    public boolean f30443f;
    public boolean h;
    public final pt0[] f30444n;
    public final long f30445r;
    public final long f30446s;
    public long f30447w;
    public final org.telegram.ui.ActionBar.k2 f30448x;
    public int[] f30440a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f30441b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f30442c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f30449y = new ArrayList();

    public st0(org.telegram.ui.ActionBar.k2 k2Var) {
        int i10;
        TLRPC.ChatFull M0;
        this.f30448x = k2Var;
        if (k2Var instanceof gg) {
            gg ggVar = (gg) k2Var;
            long a2 = ggVar.a();
            this.f30445r = a2;
            this.f30447w = ggVar.M();
            this.f30446s = ggVar.b();
            if (a2 != k2Var.getUserConfig().e()) {
                k2Var.getMessagesController().F1().f(a2, new org.telegram.messenger.r20(this) {
                    public final st0 f30086b;

                    {
                        this.f30086b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                st0 st0Var = this.f30086b;
                                ArrayList arrayList = st0Var.f30449y;
                                boolean booleanValue = bool.booleanValue();
                                st0Var.f30443f = booleanValue;
                                st0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((tt0) arrayList.get(i11)).R();
                                    }
                                    return;
                                }
                                return;
                            default:
                                st0 st0Var2 = this.f30086b;
                                ArrayList arrayList2 = st0Var2.f30449y;
                                boolean booleanValue2 = bool.booleanValue();
                                st0Var2.f30443f = booleanValue2;
                                st0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((tt0) arrayList2.get(i12)).R();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (k2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) k2Var;
            if (profileActivity.f33825g1) {
                this.f30445r = profileActivity.getUserConfig().e();
                this.f30446s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f30445r = a10;
                this.f30446s = profileActivity.f33818f1;
                TLRPC.ChatFull chatFull = profileActivity.f33915t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a10 != k2Var.getUserConfig().e()) {
                    k2Var.getMessagesController().F1().f(a10, new org.telegram.messenger.r20(this) {
                        public final st0 f30086b;

                        {
                            this.f30086b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    st0 st0Var = this.f30086b;
                                    ArrayList arrayList = st0Var.f30449y;
                                    boolean booleanValue = bool.booleanValue();
                                    st0Var.f30443f = booleanValue;
                                    st0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((tt0) arrayList.get(i11)).R();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    st0 st0Var2 = this.f30086b;
                                    ArrayList arrayList2 = st0Var2.f30449y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    st0Var2.f30443f = booleanValue2;
                                    st0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((tt0) arrayList2.get(i12)).R();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (k2Var instanceof n90) {
            this.f30445r = ((n90) k2Var).e;
        } else if (k2Var instanceof org.telegram.ui.zx) {
            this.f30445r = k2Var.getUserConfig().e();
        }
        if (this.f30447w == 0 && org.telegram.messenger.o5.z(this.f30445r) && (M0 = k2Var.getMessagesController().M0(-this.f30445r)) != null) {
            long j10 = M0.migrated_from_chat_id;
            if (j10 != 0) {
                this.f30447w = -j10;
            }
        }
        this.f30444n = new pt0[9];
        int i11 = 0;
        while (true) {
            pt0[] pt0VarArr = this.f30444n;
            if (i11 >= pt0VarArr.length) {
                break;
            }
            pt0VarArr[i11] = new pt0();
            pt0 pt0Var = this.f30444n[i11];
            if (org.telegram.messenger.o5.C(this.f30445r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            pt0Var.f29538j[0] = i10;
            this.f30444n[i11].f29538j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.k2 k2Var2 = this.f30448x;
        if (k2Var2 == null) {
            this.E = null;
            return;
        }
        org.telegram.messenger.at notificationCenter = k2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar = new xa.n(notificationCenter, this);
        nVar.e(org.telegram.messenger.at.X);
        nVar.e(org.telegram.messenger.at.W);
        nVar.e(1);
        nVar.e(org.telegram.messenger.at.K);
        nVar.e(org.telegram.messenger.at.V);
        nVar.e(org.telegram.messenger.at.f14806w);
        nVar.e(org.telegram.messenger.at.m0);
        nVar.e(org.telegram.messenger.at.T);
        nVar.e(org.telegram.messenger.at.Y1);
        nVar.e(org.telegram.messenger.at.f14819x5);
        nVar.e(org.telegram.messenger.at.f14713g3);
        this.E = nVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30448x;
        if (k2Var != null) {
            org.telegram.messenger.vi mediaDataController = k2Var.getMediaDataController();
            long j10 = this.f30446s;
            mediaDataController.e0(this.f30445r, k2Var.getClassGuid(), j10);
            if (this.f30447w != 0) {
                k2Var.getMediaDataController().e0(this.f30447w, k2Var.getClassGuid(), this.f30446s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var == this.f30448x) {
            this.f30449y.clear();
            xa.n nVar = this.E;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30448x;
        if (k2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f30447w == 0) {
                this.f30447w = -j10;
                k2Var.getMediaDataController().e0(this.f30447w, k2Var.getClassGuid(), this.f30446s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.st0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
