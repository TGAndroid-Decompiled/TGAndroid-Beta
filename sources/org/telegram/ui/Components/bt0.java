package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class bt0 implements org.telegram.messenger.fs {
    public boolean E;
    public final xi.e F;
    public boolean f33927f;
    public boolean h;
    public final ys0[] f33928n;
    public final long f33929r;
    public final long f33930s;
    public long f33931w;
    public final org.telegram.ui.ActionBar.g2 f33932x;
    public int[] f33923a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f33924b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33925c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33926e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f33933y = new ArrayList();

    public bt0(org.telegram.ui.ActionBar.g2 g2Var) {
        int i7;
        TLRPC.ChatFull P0;
        this.f33932x = g2Var;
        if (g2Var instanceof bh) {
            bh bhVar = (bh) g2Var;
            long a10 = bhVar.a();
            this.f33929r = a10;
            this.f33931w = bhVar.M();
            this.f33930s = bhVar.d();
            if (a10 != g2Var.getUserConfig().e()) {
                g2Var.getMessagesController().I1().f(a10, new org.telegram.messenger.x10(this) {
                    public final bt0 f33623b;

                    {
                        this.f33623b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                bt0 bt0Var = this.f33623b;
                                ArrayList arrayList = bt0Var.f33933y;
                                boolean booleanValue = bool.booleanValue();
                                bt0Var.f33927f = booleanValue;
                                bt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((ct0) arrayList.get(i10)).R();
                                    }
                                    return;
                                }
                                return;
                            default:
                                bt0 bt0Var2 = this.f33623b;
                                ArrayList arrayList2 = bt0Var2.f33933y;
                                boolean booleanValue2 = bool.booleanValue();
                                bt0Var2.f33927f = booleanValue2;
                                bt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((ct0) arrayList2.get(i11)).R();
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
            if (profileActivity.f43603h1) {
                this.f33929r = profileActivity.getUserConfig().e();
                this.f33930s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f33929r = a11;
                this.f33930s = profileActivity.f43596g1;
                TLRPC.ChatFull chatFull = profileActivity.f43698v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != g2Var.getUserConfig().e()) {
                    g2Var.getMessagesController().I1().f(a11, new org.telegram.messenger.x10(this) {
                        public final bt0 f33623b;

                        {
                            this.f33623b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    bt0 bt0Var = this.f33623b;
                                    ArrayList arrayList = bt0Var.f33933y;
                                    boolean booleanValue = bool.booleanValue();
                                    bt0Var.f33927f = booleanValue;
                                    bt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((ct0) arrayList.get(i10)).R();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    bt0 bt0Var2 = this.f33623b;
                                    ArrayList arrayList2 = bt0Var2.f33933y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    bt0Var2.f33927f = booleanValue2;
                                    bt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((ct0) arrayList2.get(i11)).R();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (g2Var instanceof k90) {
            this.f33929r = ((k90) g2Var).f36863e;
        } else if (g2Var instanceof org.telegram.ui.cx) {
            this.f33929r = g2Var.getUserConfig().e();
        }
        if (this.f33931w == 0 && org.telegram.messenger.n5.z(this.f33929r) && (P0 = g2Var.getMessagesController().P0(-this.f33929r)) != null) {
            long j3 = P0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f33931w = -j3;
            }
        }
        this.f33928n = new ys0[9];
        int i10 = 0;
        while (true) {
            ys0[] ys0VarArr = this.f33928n;
            if (i10 >= ys0VarArr.length) {
                break;
            }
            ys0VarArr[i10] = new ys0();
            ys0 ys0Var = this.f33928n[i10];
            if (org.telegram.messenger.n5.C(this.f33929r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ys0Var.f42528j[0] = i7;
            this.f33928n[i10].f42528j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.g2 g2Var2 = this.f33932x;
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
        eVar.c(org.telegram.messenger.ks.f25238w);
        eVar.c(org.telegram.messenger.ks.m0);
        eVar.c(org.telegram.messenger.ks.T);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.A5);
        eVar.c(org.telegram.messenger.ks.f25159i3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33932x;
        if (g2Var != null) {
            org.telegram.messenger.ri mediaDataController = g2Var.getMediaDataController();
            long j3 = this.f33930s;
            mediaDataController.g0(this.f33929r, g2Var.getClassGuid(), j3);
            if (this.f33931w != 0) {
                g2Var.getMediaDataController().g0(this.f33931w, g2Var.getClassGuid(), this.f33930s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == this.f33932x) {
            this.f33933y.clear();
            xi.e eVar = this.F;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33932x;
        if (g2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f33931w == 0) {
                this.f33931w = -j3;
                g2Var.getMediaDataController().g0(this.f33931w, g2Var.getClassGuid(), this.f33930s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
