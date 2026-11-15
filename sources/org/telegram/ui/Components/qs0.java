package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class qs0 implements org.telegram.messenger.is {
    public boolean E;
    public final xi.e F;
    public boolean f38762f;
    public boolean h;
    public final ns0[] f38763n;
    public final long f38764r;
    public final long f38765s;
    public long f38766w;
    public final org.telegram.ui.ActionBar.e2 f38767x;
    public int[] f38758a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f38759b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f38760c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f38761e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f38768y = new ArrayList();

    public qs0(org.telegram.ui.ActionBar.e2 e2Var) {
        int i7;
        TLRPC.ChatFull N0;
        this.f38767x = e2Var;
        if (e2Var instanceof qg) {
            qg qgVar = (qg) e2Var;
            long a10 = qgVar.a();
            this.f38764r = a10;
            this.f38766w = qgVar.M();
            this.f38765s = qgVar.b();
            if (a10 != e2Var.getUserConfig().e()) {
                e2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.z10(this) {
                    public final qs0 f38407b;

                    {
                        this.f38407b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                qs0 qs0Var = this.f38407b;
                                ArrayList arrayList = qs0Var.f38768y;
                                boolean booleanValue = bool.booleanValue();
                                qs0Var.f38762f = booleanValue;
                                qs0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((rs0) arrayList.get(i10)).R();
                                    }
                                    return;
                                }
                                return;
                            default:
                                qs0 qs0Var2 = this.f38407b;
                                ArrayList arrayList2 = qs0Var2.f38768y;
                                boolean booleanValue2 = bool.booleanValue();
                                qs0Var2.f38762f = booleanValue2;
                                qs0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((rs0) arrayList2.get(i11)).R();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (e2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) e2Var;
            if (profileActivity.f43116h1) {
                this.f38764r = profileActivity.getUserConfig().e();
                this.f38765s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f38764r = a11;
                this.f38765s = profileActivity.f43109g1;
                TLRPC.ChatFull chatFull = profileActivity.f43211v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != e2Var.getUserConfig().e()) {
                    e2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.z10(this) {
                        public final qs0 f38407b;

                        {
                            this.f38407b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    qs0 qs0Var = this.f38407b;
                                    ArrayList arrayList = qs0Var.f38768y;
                                    boolean booleanValue = bool.booleanValue();
                                    qs0Var.f38762f = booleanValue;
                                    qs0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((rs0) arrayList.get(i10)).R();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    qs0 qs0Var2 = this.f38407b;
                                    ArrayList arrayList2 = qs0Var2.f38768y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qs0Var2.f38762f = booleanValue2;
                                    qs0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((rs0) arrayList2.get(i11)).R();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (e2Var instanceof y80) {
            this.f38764r = ((y80) e2Var).f41934e;
        } else if (e2Var instanceof org.telegram.ui.yw) {
            this.f38764r = e2Var.getUserConfig().e();
        }
        if (this.f38766w == 0 && org.telegram.messenger.m5.z(this.f38764r) && (N0 = e2Var.getMessagesController().N0(-this.f38764r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f38766w = -j3;
            }
        }
        this.f38763n = new ns0[9];
        int i10 = 0;
        while (true) {
            ns0[] ns0VarArr = this.f38763n;
            if (i10 >= ns0VarArr.length) {
                break;
            }
            ns0VarArr[i10] = new ns0();
            ns0 ns0Var = this.f38763n[i10];
            if (org.telegram.messenger.m5.C(this.f38764r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ns0Var.f37688j[0] = i7;
            this.f38763n[i10].f37688j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.e2 e2Var2 = this.f38767x;
        if (e2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.ns notificationCenter = e2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(org.telegram.messenger.ns.X);
        eVar.c(org.telegram.messenger.ns.W);
        eVar.c(1);
        eVar.c(org.telegram.messenger.ns.K);
        eVar.c(org.telegram.messenger.ns.V);
        eVar.c(org.telegram.messenger.ns.f25593w);
        eVar.c(org.telegram.messenger.ns.m0);
        eVar.c(org.telegram.messenger.ns.T);
        eVar.c(org.telegram.messenger.ns.Y1);
        eVar.c(org.telegram.messenger.ns.f25606x5);
        eVar.c(org.telegram.messenger.ns.f25502g3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f38767x;
        if (e2Var != null) {
            org.telegram.messenger.si mediaDataController = e2Var.getMediaDataController();
            long j3 = this.f38765s;
            mediaDataController.e0(this.f38764r, e2Var.getClassGuid(), j3);
            if (this.f38766w != 0) {
                e2Var.getMediaDataController().e0(this.f38766w, e2Var.getClassGuid(), this.f38765s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var == this.f38767x) {
            this.f38768y.clear();
            xi.e eVar = this.F;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f38767x;
        if (e2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f38766w == 0) {
                this.f38766w = -j3;
                e2Var.getMediaDataController().e0(this.f38766w, e2Var.getClassGuid(), this.f38765s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qs0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
