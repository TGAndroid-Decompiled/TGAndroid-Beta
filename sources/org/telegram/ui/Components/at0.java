package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class at0 implements org.telegram.messenger.fs {
    public boolean E;
    public final xi.e F;
    public boolean f33555f;
    public boolean h;
    public final xs0[] f33556n;
    public final long f33557r;
    public final long f33558s;
    public long f33559w;
    public final org.telegram.ui.ActionBar.g2 f33560x;
    public int[] f33551a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f33552b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33553c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33554e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f33561y = new ArrayList();

    public at0(org.telegram.ui.ActionBar.g2 g2Var) {
        int i7;
        TLRPC.ChatFull P0;
        this.f33560x = g2Var;
        if (g2Var instanceof ah) {
            ah ahVar = (ah) g2Var;
            long a10 = ahVar.a();
            this.f33557r = a10;
            this.f33559w = ahVar.M();
            this.f33558s = ahVar.b();
            if (a10 != g2Var.getUserConfig().e()) {
                g2Var.getMessagesController().I1().f(a10, new org.telegram.messenger.w10(this) {
                    public final at0 f43039b;

                    {
                        this.f43039b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                at0 at0Var = this.f43039b;
                                ArrayList arrayList = at0Var.f33561y;
                                boolean booleanValue = bool.booleanValue();
                                at0Var.f33555f = booleanValue;
                                at0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((bt0) arrayList.get(i10)).R();
                                    }
                                    return;
                                }
                                return;
                            default:
                                at0 at0Var2 = this.f43039b;
                                ArrayList arrayList2 = at0Var2.f33561y;
                                boolean booleanValue2 = bool.booleanValue();
                                at0Var2.f33555f = booleanValue2;
                                at0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((bt0) arrayList2.get(i11)).R();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (g2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) g2Var;
            if (profileActivity.f43688h1) {
                this.f33557r = profileActivity.getUserConfig().e();
                this.f33558s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f33557r = a11;
                this.f33558s = profileActivity.f43681g1;
                TLRPC.ChatFull chatFull = profileActivity.f43783v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != g2Var.getUserConfig().e()) {
                    g2Var.getMessagesController().I1().f(a11, new org.telegram.messenger.w10(this) {
                        public final at0 f43039b;

                        {
                            this.f43039b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    at0 at0Var = this.f43039b;
                                    ArrayList arrayList = at0Var.f33561y;
                                    boolean booleanValue = bool.booleanValue();
                                    at0Var.f33555f = booleanValue;
                                    at0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((bt0) arrayList.get(i10)).R();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    at0 at0Var2 = this.f43039b;
                                    ArrayList arrayList2 = at0Var2.f33561y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    at0Var2.f33555f = booleanValue2;
                                    at0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((bt0) arrayList2.get(i11)).R();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (g2Var instanceof h90) {
            this.f33557r = ((h90) g2Var).f35691e;
        } else if (g2Var instanceof org.telegram.ui.bx) {
            this.f33557r = g2Var.getUserConfig().e();
        }
        if (this.f33559w == 0 && org.telegram.messenger.n5.z(this.f33557r) && (P0 = g2Var.getMessagesController().P0(-this.f33557r)) != null) {
            long j3 = P0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f33559w = -j3;
            }
        }
        this.f33556n = new xs0[9];
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f33556n;
            if (i10 >= xs0VarArr.length) {
                break;
            }
            xs0VarArr[i10] = new xs0();
            xs0 xs0Var = this.f33556n[i10];
            if (org.telegram.messenger.n5.C(this.f33557r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            xs0Var.f42172j[0] = i7;
            this.f33556n[i10].f42172j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.g2 g2Var2 = this.f33560x;
        if (g2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.ks notificationCenter = g2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(org.telegram.messenger.ks.X);
        eVar.c(org.telegram.messenger.ks.W);
        eVar.c(1);
        eVar.c(org.telegram.messenger.ks.K);
        eVar.c(org.telegram.messenger.ks.V);
        eVar.c(org.telegram.messenger.ks.f25309w);
        eVar.c(org.telegram.messenger.ks.m0);
        eVar.c(org.telegram.messenger.ks.T);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.A5);
        eVar.c(org.telegram.messenger.ks.f25230i3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33560x;
        if (g2Var != null) {
            org.telegram.messenger.ri mediaDataController = g2Var.getMediaDataController();
            long j3 = this.f33558s;
            mediaDataController.g0(this.f33557r, g2Var.getClassGuid(), j3);
            if (this.f33559w != 0) {
                g2Var.getMediaDataController().g0(this.f33559w, g2Var.getClassGuid(), this.f33558s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == this.f33560x) {
            this.f33561y.clear();
            xi.e eVar = this.F;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33560x;
        if (g2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f33559w == 0) {
                this.f33559w = -j3;
                g2Var.getMediaDataController().g0(this.f33559w, g2Var.getClassGuid(), this.f33558s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.at0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
