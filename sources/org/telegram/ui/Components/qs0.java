package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class qs0 implements org.telegram.messenger.ls {
    public boolean D;
    public final ab.b0 E;
    public boolean f37387f;
    public boolean h;
    public final ns0[] f37388n;
    public final long f37389r;
    public final long f37390s;
    public long f37391w;
    public final org.telegram.ui.ActionBar.f2 f37392x;
    public int[] f37383a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f37384b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37385c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37386e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f37393y = new ArrayList();

    public qs0(org.telegram.ui.ActionBar.f2 f2Var) {
        int i7;
        TLRPC.ChatFull N0;
        this.f37392x = f2Var;
        if (f2Var instanceof jg) {
            jg jgVar = (jg) f2Var;
            long a10 = jgVar.a();
            this.f37389r = a10;
            this.f37391w = jgVar.L();
            this.f37390s = jgVar.b();
            if (a10 != f2Var.getUserConfig().e()) {
                f2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.c20(this) {
                    public final qs0 f37072b;

                    {
                        this.f37072b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                qs0 qs0Var = this.f37072b;
                                ArrayList arrayList = qs0Var.f37393y;
                                boolean booleanValue = bool.booleanValue();
                                qs0Var.f37387f = booleanValue;
                                qs0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((rs0) arrayList.get(i10)).Q();
                                    }
                                    return;
                                }
                                return;
                            default:
                                qs0 qs0Var2 = this.f37072b;
                                ArrayList arrayList2 = qs0Var2.f37393y;
                                boolean booleanValue2 = bool.booleanValue();
                                qs0Var2.f37387f = booleanValue2;
                                qs0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((rs0) arrayList2.get(i11)).Q();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (f2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) f2Var;
            if (profileActivity.f41736g1) {
                this.f37389r = profileActivity.getUserConfig().e();
                this.f37390s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f37389r = a11;
                this.f37390s = profileActivity.f41729f1;
                TLRPC.ChatFull chatFull = profileActivity.f41825t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != f2Var.getUserConfig().e()) {
                    f2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.c20(this) {
                        public final qs0 f37072b;

                        {
                            this.f37072b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    qs0 qs0Var = this.f37072b;
                                    ArrayList arrayList = qs0Var.f37393y;
                                    boolean booleanValue = bool.booleanValue();
                                    qs0Var.f37387f = booleanValue;
                                    qs0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((rs0) arrayList.get(i10)).Q();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    qs0 qs0Var2 = this.f37072b;
                                    ArrayList arrayList2 = qs0Var2.f37393y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    qs0Var2.f37387f = booleanValue2;
                                    qs0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((rs0) arrayList2.get(i11)).Q();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (f2Var instanceof v80) {
            this.f37389r = ((v80) f2Var).f38938e;
        } else if (f2Var instanceof org.telegram.ui.zw) {
            this.f37389r = f2Var.getUserConfig().e();
        }
        if (this.f37391w == 0 && org.telegram.messenger.m5.z(this.f37389r) && (N0 = f2Var.getMessagesController().N0(-this.f37389r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f37391w = -j3;
            }
        }
        this.f37388n = new ns0[9];
        int i10 = 0;
        while (true) {
            ns0[] ns0VarArr = this.f37388n;
            if (i10 >= ns0VarArr.length) {
                break;
            }
            ns0VarArr[i10] = new ns0();
            ns0 ns0Var = this.f37388n[i10];
            if (org.telegram.messenger.m5.C(this.f37389r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ns0Var.f36376j[0] = i7;
            this.f37388n[i10].f36376j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.f2 f2Var2 = this.f37392x;
        if (f2Var2 == null) {
            this.E = null;
            return;
        }
        org.telegram.messenger.qs notificationCenter = f2Var2.getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var = new ab.b0(notificationCenter, this);
        b0Var.c(org.telegram.messenger.qs.X);
        b0Var.c(org.telegram.messenger.qs.W);
        b0Var.c(1);
        b0Var.c(org.telegram.messenger.qs.K);
        b0Var.c(org.telegram.messenger.qs.V);
        b0Var.c(org.telegram.messenger.qs.f25100w);
        b0Var.c(org.telegram.messenger.qs.m0);
        b0Var.c(org.telegram.messenger.qs.T);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.f25113x5);
        b0Var.c(org.telegram.messenger.qs.f25009g3);
        this.E = b0Var;
    }

    public final void a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37392x;
        if (f2Var != null) {
            org.telegram.messenger.ui mediaDataController = f2Var.getMediaDataController();
            long j3 = this.f37390s;
            mediaDataController.e0(this.f37389r, f2Var.getClassGuid(), j3);
            if (this.f37391w != 0) {
                f2Var.getMediaDataController().e0(this.f37391w, f2Var.getClassGuid(), this.f37390s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == this.f37392x) {
            this.f37393y.clear();
            ab.b0 b0Var = this.E;
            if (b0Var != null) {
                b0Var.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37392x;
        if (f2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f37391w == 0) {
                this.f37391w = -j3;
                f2Var.getMediaDataController().e0(this.f37391w, f2Var.getClassGuid(), this.f37390s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qs0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
