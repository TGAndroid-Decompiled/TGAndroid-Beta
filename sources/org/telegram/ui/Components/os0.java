package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class os0 implements org.telegram.messenger.cs {
    public boolean E;
    public final za.p F;
    public boolean f36938f;
    public boolean h;
    public final ls0[] f36939n;
    public final long f36940r;
    public final long f36941s;
    public long f36942w;
    public final org.telegram.ui.ActionBar.d2 f36943x;
    public int[] f36934a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f36935b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f36936c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f36937e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f36944y = new ArrayList();

    public os0(org.telegram.ui.ActionBar.d2 d2Var) {
        int i3;
        TLRPC.ChatFull N0;
        this.f36943x = d2Var;
        if (d2Var instanceof ig) {
            ig igVar = (ig) d2Var;
            long a10 = igVar.a();
            this.f36940r = a10;
            this.f36942w = igVar.L();
            this.f36941s = igVar.b();
            if (a10 != d2Var.getUserConfig().e()) {
                d2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.u10(this) {
                    public final os0 f36618b;

                    {
                        this.f36618b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                os0 os0Var = this.f36618b;
                                ArrayList arrayList = os0Var.f36944y;
                                boolean booleanValue = bool.booleanValue();
                                os0Var.f36938f = booleanValue;
                                os0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((ps0) arrayList.get(i10)).Q();
                                    }
                                    return;
                                }
                                return;
                            default:
                                os0 os0Var2 = this.f36618b;
                                ArrayList arrayList2 = os0Var2.f36944y;
                                boolean booleanValue2 = bool.booleanValue();
                                os0Var2.f36938f = booleanValue2;
                                os0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        ((ps0) arrayList2.get(i11)).Q();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (d2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) d2Var;
            if (profileActivity.f41773h1) {
                this.f36940r = profileActivity.getUserConfig().e();
                this.f36941s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.f36940r = a11;
                this.f36941s = profileActivity.f41766g1;
                TLRPC.ChatFull chatFull = profileActivity.f41861u2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != d2Var.getUserConfig().e()) {
                    d2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.u10(this) {
                        public final os0 f36618b;

                        {
                            this.f36618b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    os0 os0Var = this.f36618b;
                                    ArrayList arrayList = os0Var.f36944y;
                                    boolean booleanValue = bool.booleanValue();
                                    os0Var.f36938f = booleanValue;
                                    os0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            ((ps0) arrayList.get(i10)).Q();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    os0 os0Var2 = this.f36618b;
                                    ArrayList arrayList2 = os0Var2.f36944y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    os0Var2.f36938f = booleanValue2;
                                    os0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            ((ps0) arrayList2.get(i11)).Q();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (d2Var instanceof r80) {
            this.f36940r = ((r80) d2Var).f37684e;
        } else if (d2Var instanceof org.telegram.ui.uw) {
            this.f36940r = d2Var.getUserConfig().e();
        }
        if (this.f36942w == 0 && org.telegram.messenger.m5.z(this.f36940r) && (N0 = d2Var.getMessagesController().N0(-this.f36940r)) != null) {
            long j10 = N0.migrated_from_chat_id;
            if (j10 != 0) {
                this.f36942w = -j10;
            }
        }
        this.f36939n = new ls0[9];
        int i10 = 0;
        while (true) {
            ls0[] ls0VarArr = this.f36939n;
            if (i10 >= ls0VarArr.length) {
                break;
            }
            ls0VarArr[i10] = new ls0();
            ls0 ls0Var = this.f36939n[i10];
            if (org.telegram.messenger.m5.C(this.f36940r)) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = Integer.MAX_VALUE;
            }
            ls0Var.f35861j[0] = i3;
            this.f36939n[i10].f35861j[1] = Integer.MAX_VALUE;
            i10++;
        }
        a();
        org.telegram.ui.ActionBar.d2 d2Var2 = this.f36943x;
        if (d2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.hs notificationCenter = d2Var2.getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar = new za.p(notificationCenter, this);
        pVar.b(org.telegram.messenger.hs.X);
        pVar.b(org.telegram.messenger.hs.W);
        pVar.b(1);
        pVar.b(org.telegram.messenger.hs.K);
        pVar.b(org.telegram.messenger.hs.V);
        pVar.b(org.telegram.messenger.hs.f23325w);
        pVar.b(org.telegram.messenger.hs.m0);
        pVar.b(org.telegram.messenger.hs.T);
        pVar.b(org.telegram.messenger.hs.Y1);
        pVar.b(org.telegram.messenger.hs.f23338x5);
        pVar.b(org.telegram.messenger.hs.f23234g3);
        this.F = pVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f36943x;
        if (d2Var != null) {
            org.telegram.messenger.li mediaDataController = d2Var.getMediaDataController();
            long j10 = this.f36941s;
            mediaDataController.e0(this.f36940r, d2Var.getClassGuid(), j10);
            if (this.f36942w != 0) {
                d2Var.getMediaDataController().e0(this.f36942w, d2Var.getClassGuid(), this.f36941s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var == this.f36943x) {
            this.f36944y.clear();
            za.p pVar = this.F;
            if (pVar != null) {
                pVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f36943x;
        if (d2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f36942w == 0) {
                this.f36942w = -j10;
                d2Var.getMediaDataController().e0(this.f36942w, d2Var.getClassGuid(), this.f36941s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.os0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
