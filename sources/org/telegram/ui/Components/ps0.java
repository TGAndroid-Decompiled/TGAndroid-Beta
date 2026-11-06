package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ps0 implements org.telegram.messenger.ls {
    public boolean D;
    public final ab.b0 E;
    public boolean f37066f;
    public boolean h;
    public final ms0[] f37067n;
    public final long f37068r;
    public final long f37069s;
    public long f37070w;
    public final org.telegram.ui.ActionBar.f2 f37071x;
    public int[] f37062a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f37063b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37064c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37065e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f37072y = new ArrayList();

    public ps0(org.telegram.ui.ActionBar.f2 f2Var) {
        int i7;
        TLRPC.ChatFull N0;
        this.f37071x = f2Var;
        if (f2Var instanceof kg) {
            kg kgVar = (kg) f2Var;
            long a10 = kgVar.a();
            this.f37068r = a10;
            this.f37070w = kgVar.L();
            this.f37069s = kgVar.b();
            if (a10 != f2Var.getUserConfig().e()) {
                f2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.c20(this) {
                    public final ps0 f36672b;

                    {
                        this.f36672b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ps0 ps0Var = this.f36672b;
                                ArrayList arrayList = ps0Var.f37072y;
                                boolean booleanValue = bool.booleanValue();
                                ps0Var.f37066f = booleanValue;
                                ps0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((qs0) arrayList.get(i10)).Q();
                                    }
                                    return;
                                }
                                return;
                            default:
                                ps0 ps0Var2 = this.f36672b;
                                ArrayList arrayList2 = ps0Var2.f37072y;
                                boolean booleanValue2 = bool.booleanValue();
                                ps0Var2.f37066f = booleanValue2;
                                ps0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((qs0) arrayList2.get(i11)).Q();
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
            if (profileActivity.f41734g1) {
                this.f37068r = profileActivity.getUserConfig().e();
                this.f37069s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f37068r = a11;
                this.f37069s = profileActivity.f41727f1;
                TLRPC.ChatFull chatFull = profileActivity.f41823t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != f2Var.getUserConfig().e()) {
                    f2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.c20(this) {
                        public final ps0 f36672b;

                        {
                            this.f36672b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ps0 ps0Var = this.f36672b;
                                    ArrayList arrayList = ps0Var.f37072y;
                                    boolean booleanValue = bool.booleanValue();
                                    ps0Var.f37066f = booleanValue;
                                    ps0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((qs0) arrayList.get(i10)).Q();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ps0 ps0Var2 = this.f36672b;
                                    ArrayList arrayList2 = ps0Var2.f37072y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ps0Var2.f37066f = booleanValue2;
                                    ps0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((qs0) arrayList2.get(i11)).Q();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (f2Var instanceof u80) {
            this.f37068r = ((u80) f2Var).f38542e;
        } else if (f2Var instanceof org.telegram.ui.ww) {
            this.f37068r = f2Var.getUserConfig().e();
        }
        if (this.f37070w == 0 && org.telegram.messenger.m5.z(this.f37068r) && (N0 = f2Var.getMessagesController().N0(-this.f37068r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f37070w = -j3;
            }
        }
        this.f37067n = new ms0[9];
        int i10 = 0;
        while (true) {
            ms0[] ms0VarArr = this.f37067n;
            if (i10 >= ms0VarArr.length) {
                break;
            }
            ms0VarArr[i10] = new ms0();
            ms0 ms0Var = this.f37067n[i10];
            if (org.telegram.messenger.m5.C(this.f37068r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ms0Var.f36070j[0] = i7;
            this.f37067n[i10].f36070j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.f2 f2Var2 = this.f37071x;
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
        b0Var.c(org.telegram.messenger.qs.f25087w);
        b0Var.c(org.telegram.messenger.qs.m0);
        b0Var.c(org.telegram.messenger.qs.T);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.f25100x5);
        b0Var.c(org.telegram.messenger.qs.f24996g3);
        this.E = b0Var;
    }

    public final void a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37071x;
        if (f2Var != null) {
            org.telegram.messenger.ui mediaDataController = f2Var.getMediaDataController();
            long j3 = this.f37069s;
            mediaDataController.e0(this.f37068r, f2Var.getClassGuid(), j3);
            if (this.f37070w != 0) {
                f2Var.getMediaDataController().e0(this.f37070w, f2Var.getClassGuid(), this.f37069s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == this.f37071x) {
            this.f37072y.clear();
            ab.b0 b0Var = this.E;
            if (b0Var != null) {
                b0Var.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37071x;
        if (f2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f37070w == 0) {
                this.f37070w = -j3;
                f2Var.getMediaDataController().e0(this.f37070w, f2Var.getClassGuid(), this.f37069s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
