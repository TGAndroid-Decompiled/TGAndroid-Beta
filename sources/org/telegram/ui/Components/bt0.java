package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class bt0 implements org.telegram.messenger.gs {
    public boolean E;
    public final xi.e F;
    public boolean f33881f;
    public boolean h;
    public final ys0[] f33882n;
    public final long f33883r;
    public final long f33884s;
    public long f33885w;
    public final org.telegram.ui.ActionBar.g2 f33886x;
    public int[] f33877a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f33878b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33879c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f33880e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f33887y = new ArrayList();

    public bt0(org.telegram.ui.ActionBar.g2 g2Var) {
        int i7;
        TLRPC.ChatFull P0;
        this.f33886x = g2Var;
        if (g2Var instanceof bh) {
            bh bhVar = (bh) g2Var;
            long a10 = bhVar.a();
            this.f33883r = a10;
            this.f33885w = bhVar.M();
            this.f33884s = bhVar.d();
            if (a10 != g2Var.getUserConfig().e()) {
                g2Var.getMessagesController().I1().f(a10, new org.telegram.messenger.y10(this) {
                    public final bt0 f33620b;

                    {
                        this.f33620b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                bt0 bt0Var = this.f33620b;
                                ArrayList arrayList = bt0Var.f33887y;
                                boolean booleanValue = bool.booleanValue();
                                bt0Var.f33881f = booleanValue;
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
                                bt0 bt0Var2 = this.f33620b;
                                ArrayList arrayList2 = bt0Var2.f33887y;
                                boolean booleanValue2 = bool.booleanValue();
                                bt0Var2.f33881f = booleanValue2;
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
            if (profileActivity.f43572h1) {
                this.f33883r = profileActivity.getUserConfig().e();
                this.f33884s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f33883r = a11;
                this.f33884s = profileActivity.f43565g1;
                TLRPC.ChatFull chatFull = profileActivity.f43667v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != g2Var.getUserConfig().e()) {
                    g2Var.getMessagesController().I1().f(a11, new org.telegram.messenger.y10(this) {
                        public final bt0 f33620b;

                        {
                            this.f33620b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    bt0 bt0Var = this.f33620b;
                                    ArrayList arrayList = bt0Var.f33887y;
                                    boolean booleanValue = bool.booleanValue();
                                    bt0Var.f33881f = booleanValue;
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
                                    bt0 bt0Var2 = this.f33620b;
                                    ArrayList arrayList2 = bt0Var2.f33887y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    bt0Var2.f33881f = booleanValue2;
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
            this.f33883r = ((k90) g2Var).f36831e;
        } else if (g2Var instanceof org.telegram.ui.cx) {
            this.f33883r = g2Var.getUserConfig().e();
        }
        if (this.f33885w == 0 && org.telegram.messenger.n5.z(this.f33883r) && (P0 = g2Var.getMessagesController().P0(-this.f33883r)) != null) {
            long j3 = P0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f33885w = -j3;
            }
        }
        this.f33882n = new ys0[9];
        int i10 = 0;
        while (true) {
            ys0[] ys0VarArr = this.f33882n;
            if (i10 >= ys0VarArr.length) {
                break;
            }
            ys0VarArr[i10] = new ys0();
            ys0 ys0Var = this.f33882n[i10];
            if (org.telegram.messenger.n5.C(this.f33883r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            ys0Var.f42481j[0] = i7;
            this.f33882n[i10].f42481j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.g2 g2Var2 = this.f33886x;
        if (g2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.ls notificationCenter = g2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(org.telegram.messenger.ls.X);
        eVar.c(org.telegram.messenger.ls.W);
        eVar.c(1);
        eVar.c(org.telegram.messenger.ls.K);
        eVar.c(org.telegram.messenger.ls.V);
        eVar.c(org.telegram.messenger.ls.f25368w);
        eVar.c(org.telegram.messenger.ls.m0);
        eVar.c(org.telegram.messenger.ls.T);
        eVar.c(org.telegram.messenger.ls.Y1);
        eVar.c(org.telegram.messenger.ls.A5);
        eVar.c(org.telegram.messenger.ls.f25289i3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33886x;
        if (g2Var != null) {
            org.telegram.messenger.si mediaDataController = g2Var.getMediaDataController();
            long j3 = this.f33884s;
            mediaDataController.g0(this.f33883r, g2Var.getClassGuid(), j3);
            if (this.f33885w != 0) {
                g2Var.getMediaDataController().g0(this.f33885w, g2Var.getClassGuid(), this.f33884s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == this.f33886x) {
            this.f33887y.clear();
            xi.e eVar = this.F;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f33886x;
        if (g2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f33885w == 0) {
                this.f33885w = -j3;
                g2Var.getMediaDataController().g0(this.f33885w, g2Var.getClassGuid(), this.f33884s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
