package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class rs0 implements org.telegram.messenger.ls {
    public boolean D;
    public final ab.b0 E;
    public boolean f37797f;
    public boolean h;
    public final os0[] f37798n;
    public final long f37799r;
    public final long f37800s;
    public long f37801w;
    public final org.telegram.ui.ActionBar.f2 f37802x;
    public int[] f37793a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f37794b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37795c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37796e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f37803y = new ArrayList();

    public rs0(org.telegram.ui.ActionBar.f2 f2Var) {
        int i7;
        TLRPC.ChatFull N0;
        this.f37802x = f2Var;
        if (f2Var instanceof kg) {
            kg kgVar = (kg) f2Var;
            long a10 = kgVar.a();
            this.f37799r = a10;
            this.f37801w = kgVar.L();
            this.f37800s = kgVar.b();
            if (a10 != f2Var.getUserConfig().e()) {
                f2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.c20(this) {
                    public final rs0 f37474b;

                    {
                        this.f37474b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                rs0 rs0Var = this.f37474b;
                                ArrayList arrayList = rs0Var.f37803y;
                                boolean booleanValue = bool.booleanValue();
                                rs0Var.f37797f = booleanValue;
                                rs0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((ss0) arrayList.get(i10)).Q();
                                    }
                                    return;
                                }
                                return;
                            default:
                                rs0 rs0Var2 = this.f37474b;
                                ArrayList arrayList2 = rs0Var2.f37803y;
                                boolean booleanValue2 = bool.booleanValue();
                                rs0Var2.f37797f = booleanValue2;
                                rs0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((ss0) arrayList2.get(i11)).Q();
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
            if (profileActivity.f41745g1) {
                this.f37799r = profileActivity.getUserConfig().e();
                this.f37800s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f37799r = a11;
                this.f37800s = profileActivity.f41738f1;
                TLRPC.ChatFull chatFull = profileActivity.f41834t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != f2Var.getUserConfig().e()) {
                    f2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.c20(this) {
                        public final rs0 f37474b;

                        {
                            this.f37474b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    rs0 rs0Var = this.f37474b;
                                    ArrayList arrayList = rs0Var.f37803y;
                                    boolean booleanValue = bool.booleanValue();
                                    rs0Var.f37797f = booleanValue;
                                    rs0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((ss0) arrayList.get(i10)).Q();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    rs0 rs0Var2 = this.f37474b;
                                    ArrayList arrayList2 = rs0Var2.f37803y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    rs0Var2.f37797f = booleanValue2;
                                    rs0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((ss0) arrayList2.get(i11)).Q();
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
            this.f37799r = ((v80) f2Var).f39006e;
        } else if (f2Var instanceof org.telegram.ui.yw) {
            this.f37799r = f2Var.getUserConfig().e();
        }
        if (this.f37801w == 0 && org.telegram.messenger.m5.z(this.f37799r) && (N0 = f2Var.getMessagesController().N0(-this.f37799r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f37801w = -j3;
            }
        }
        this.f37798n = new os0[9];
        int i10 = 0;
        while (true) {
            os0[] os0VarArr = this.f37798n;
            if (i10 >= os0VarArr.length) {
                break;
            }
            os0VarArr[i10] = new os0();
            os0 os0Var = this.f37798n[i10];
            if (org.telegram.messenger.m5.C(this.f37799r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            os0Var.f36785j[0] = i7;
            this.f37798n[i10].f36785j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.f2 f2Var2 = this.f37802x;
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
        b0Var.c(org.telegram.messenger.qs.f25096w);
        b0Var.c(org.telegram.messenger.qs.m0);
        b0Var.c(org.telegram.messenger.qs.T);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.f25109x5);
        b0Var.c(org.telegram.messenger.qs.f25005g3);
        this.E = b0Var;
    }

    public final void a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37802x;
        if (f2Var != null) {
            org.telegram.messenger.ui mediaDataController = f2Var.getMediaDataController();
            long j3 = this.f37800s;
            mediaDataController.e0(this.f37799r, f2Var.getClassGuid(), j3);
            if (this.f37801w != 0) {
                f2Var.getMediaDataController().e0(this.f37801w, f2Var.getClassGuid(), this.f37800s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == this.f37802x) {
            this.f37803y.clear();
            ab.b0 b0Var = this.E;
            if (b0Var != null) {
                b0Var.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37802x;
        if (f2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f37801w == 0) {
                this.f37801w = -j3;
                f2Var.getMediaDataController().e0(this.f37801w, f2Var.getClassGuid(), this.f37800s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
