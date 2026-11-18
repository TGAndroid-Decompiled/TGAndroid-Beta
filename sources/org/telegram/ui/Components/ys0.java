package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class ys0 implements org.telegram.messenger.fs {
    public boolean E;
    public final xi.e F;
    public boolean f42630f;
    public boolean h;
    public final vs0[] f42631n;
    public final long f42632r;
    public final long f42633s;
    public long f42634w;
    public final org.telegram.ui.ActionBar.h2 f42635x;
    public int[] f42626a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f42627b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f42628c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f42629e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f42636y = new ArrayList();

    public ys0(org.telegram.ui.ActionBar.h2 h2Var) {
        int i7;
        TLRPC.ChatFull P0;
        this.f42635x = h2Var;
        if (h2Var instanceof zg) {
            zg zgVar = (zg) h2Var;
            long a10 = zgVar.a();
            this.f42632r = a10;
            this.f42634w = zgVar.M();
            this.f42633s = zgVar.d();
            if (a10 != h2Var.getUserConfig().e()) {
                h2Var.getMessagesController().I1().f(a10, new org.telegram.messenger.x10(this) {
                    public final ys0 f42180b;

                    {
                        this.f42180b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                ys0 ys0Var = this.f42180b;
                                ArrayList arrayList = ys0Var.f42636y;
                                boolean booleanValue = bool.booleanValue();
                                ys0Var.f42630f = booleanValue;
                                ys0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((zs0) arrayList.get(i10)).R();
                                    }
                                    return;
                                }
                                return;
                            default:
                                ys0 ys0Var2 = this.f42180b;
                                ArrayList arrayList2 = ys0Var2.f42636y;
                                boolean booleanValue2 = bool.booleanValue();
                                ys0Var2.f42630f = booleanValue2;
                                ys0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((zs0) arrayList2.get(i11)).R();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (h2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) h2Var;
            if (profileActivity.f43562h1) {
                this.f42632r = profileActivity.getUserConfig().e();
                this.f42633s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f42632r = a11;
                this.f42633s = profileActivity.f43555g1;
                TLRPC.ChatFull chatFull = profileActivity.f43657v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != h2Var.getUserConfig().e()) {
                    h2Var.getMessagesController().I1().f(a11, new org.telegram.messenger.x10(this) {
                        public final ys0 f42180b;

                        {
                            this.f42180b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    ys0 ys0Var = this.f42180b;
                                    ArrayList arrayList = ys0Var.f42636y;
                                    boolean booleanValue = bool.booleanValue();
                                    ys0Var.f42630f = booleanValue;
                                    ys0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((zs0) arrayList.get(i10)).R();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    ys0 ys0Var2 = this.f42180b;
                                    ArrayList arrayList2 = ys0Var2.f42636y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ys0Var2.f42630f = booleanValue2;
                                    ys0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((zs0) arrayList2.get(i11)).R();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (h2Var instanceof i90) {
            this.f42632r = ((i90) h2Var).f36078e;
        } else if (h2Var instanceof org.telegram.ui.cx) {
            this.f42632r = h2Var.getUserConfig().e();
        }
        if (this.f42634w == 0 && org.telegram.messenger.n5.z(this.f42632r) && (P0 = h2Var.getMessagesController().P0(-this.f42632r)) != null) {
            long j3 = P0.migrated_from_chat_id;
            if (j3 != 0) {
                this.f42634w = -j3;
            }
        }
        this.f42631n = new vs0[9];
        int i10 = 0;
        while (true) {
            vs0[] vs0VarArr = this.f42631n;
            if (i10 >= vs0VarArr.length) {
                break;
            }
            vs0VarArr[i10] = new vs0();
            vs0 vs0Var = this.f42631n[i10];
            if (org.telegram.messenger.n5.C(this.f42632r)) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            vs0Var.f41419j[0] = i7;
            this.f42631n[i10].f41419j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.h2 h2Var2 = this.f42635x;
        if (h2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.ks notificationCenter = h2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(org.telegram.messenger.ks.X);
        eVar.c(org.telegram.messenger.ks.W);
        eVar.c(1);
        eVar.c(org.telegram.messenger.ks.K);
        eVar.c(org.telegram.messenger.ks.V);
        eVar.c(org.telegram.messenger.ks.f25212w);
        eVar.c(org.telegram.messenger.ks.m0);
        eVar.c(org.telegram.messenger.ks.T);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.f25239z5);
        eVar.c(org.telegram.messenger.ks.f25133i3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f42635x;
        if (h2Var != null) {
            org.telegram.messenger.ri mediaDataController = h2Var.getMediaDataController();
            long j3 = this.f42633s;
            mediaDataController.g0(this.f42632r, h2Var.getClassGuid(), j3);
            if (this.f42634w != 0) {
                h2Var.getMediaDataController().g0(this.f42634w, h2Var.getClassGuid(), this.f42633s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var == this.f42635x) {
            this.f42636y.clear();
            xi.e eVar = this.F;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f42635x;
        if (h2Var != null && chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f42634w == 0) {
                this.f42634w = -j3;
                h2Var.getMediaDataController().g0(this.f42634w, h2Var.getClassGuid(), this.f42633s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
