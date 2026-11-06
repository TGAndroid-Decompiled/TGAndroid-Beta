package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ps0 implements org.telegram.messenger.ls {
    public boolean D;
    public final ab.b0 E;
    public boolean f37050f;
    public boolean h;
    public final ms0[] f37051n;
    public final long f37052r;
    public final long f37053s;
    public long f37054w;
    public final org.telegram.ui.ActionBar.f2 f37055x;
    public int[] f37046a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f37047b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37048c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f37049e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f37056y = new ArrayList();

    public ps0(org.telegram.ui.ActionBar.f2 f2Var) {
        int i7;
        TLRPC.ChatFull N0;
        this.f37055x = f2Var;
        if (f2Var instanceof kg) {
            kg kgVar = (kg) f2Var;
            long a10 = kgVar.a();
            this.f37052r = a10;
            this.f37054w = kgVar.L();
            this.f37053s = kgVar.b();
            if (a10 != f2Var.getUserConfig().e()) {
                f2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.c20(this) {
                    public final ps0 f36654b;

                    {
                        this.f36654b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ps0 ps0Var = this.f36654b;
                                ArrayList arrayList = ps0Var.f37056y;
                                boolean booleanValue = bool.booleanValue();
                                ps0Var.f37050f = booleanValue;
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
                                ps0 ps0Var2 = this.f36654b;
                                ArrayList arrayList2 = ps0Var2.f37056y;
                                boolean booleanValue2 = bool.booleanValue();
                                ps0Var2.f37050f = booleanValue2;
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
            if (profileActivity.f41735g1) {
                this.f37052r = profileActivity.getUserConfig().e();
                this.f37053s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f37052r = a11;
                this.f37053s = profileActivity.f41728f1;
                TLRPC.ChatFull chatFull = profileActivity.f41824t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != f2Var.getUserConfig().e()) {
                    f2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.c20(this) {
                        public final ps0 f36654b;

                        {
                            this.f36654b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ps0 ps0Var = this.f36654b;
                                    ArrayList arrayList = ps0Var.f37056y;
                                    boolean booleanValue = bool.booleanValue();
                                    ps0Var.f37050f = booleanValue;
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
                                    ps0 ps0Var2 = this.f36654b;
                                    ArrayList arrayList2 = ps0Var2.f37056y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ps0Var2.f37050f = booleanValue2;
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
            this.f37052r = ((u80) f2Var).f38546e;
        } else if (f2Var instanceof org.telegram.ui.ww) {
            this.f37052r = f2Var.getUserConfig().e();
        }
        if (this.f37054w == 0 && org.telegram.messenger.m5.z(this.f37052r) && (N0 = f2Var.getMessagesController().N0(-this.f37052r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f37054w = -j3;
            }
        }
        this.f37051n = new ms0[9];
        int i10 = 0;
        while (true) {
            ms0[] ms0VarArr = this.f37051n;
            if (i10 >= ms0VarArr.length) {
                break;
            }
            ms0VarArr[i10] = new ms0();
            ms0 ms0Var = this.f37051n[i10];
            if (org.telegram.messenger.m5.C(this.f37052r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ms0Var.f36054j[0] = i7;
            this.f37051n[i10].f36054j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.f2 f2Var2 = this.f37055x;
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
        b0Var.c(org.telegram.messenger.qs.f25079w);
        b0Var.c(org.telegram.messenger.qs.m0);
        b0Var.c(org.telegram.messenger.qs.T);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.f25092x5);
        b0Var.c(org.telegram.messenger.qs.f24988g3);
        this.E = b0Var;
    }

    public final void a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37055x;
        if (f2Var != null) {
            org.telegram.messenger.ui mediaDataController = f2Var.getMediaDataController();
            long j3 = this.f37053s;
            mediaDataController.e0(this.f37052r, f2Var.getClassGuid(), j3);
            if (this.f37054w != 0) {
                f2Var.getMediaDataController().e0(this.f37054w, f2Var.getClassGuid(), this.f37053s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == this.f37055x) {
            this.f37056y.clear();
            ab.b0 b0Var = this.E;
            if (b0Var != null) {
                b0Var.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37055x;
        if (f2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f37054w == 0) {
                this.f37054w = -j3;
                f2Var.getMediaDataController().e0(this.f37054w, f2Var.getClassGuid(), this.f37053s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ps0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
