package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class rt0 implements org.telegram.messenger.us {
    public boolean D;
    public final xa.n E;
    public boolean f30019f;
    public boolean h;
    public final ot0[] f30020n;
    public final long f30021r;
    public final long f30022s;
    public long f30023w;
    public final org.telegram.ui.ActionBar.k2 f30024x;
    public int[] f30016a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] f30017b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] f30018c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList f30025y = new ArrayList();

    public rt0(org.telegram.ui.ActionBar.k2 k2Var) {
        int i10;
        TLRPC.ChatFull M0;
        this.f30024x = k2Var;
        if (k2Var instanceof gg) {
            gg ggVar = (gg) k2Var;
            long a2 = ggVar.a();
            this.f30021r = a2;
            this.f30023w = ggVar.L();
            this.f30022s = ggVar.b();
            if (a2 != k2Var.getUserConfig().e()) {
                k2Var.getMessagesController().F1().f(a2, new org.telegram.messenger.q20(this) {
                    public final rt0 f29750b;

                    {
                        this.f29750b = this;
                    }

                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r2) {
                            case 0:
                                rt0 rt0Var = this.f29750b;
                                ArrayList arrayList = rt0Var.f30025y;
                                boolean booleanValue = bool.booleanValue();
                                rt0Var.f30019f = booleanValue;
                                rt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((st0) arrayList.get(i11)).Q();
                                    }
                                    return;
                                }
                                return;
                            default:
                                rt0 rt0Var2 = this.f29750b;
                                ArrayList arrayList2 = rt0Var2.f30025y;
                                boolean booleanValue2 = bool.booleanValue();
                                rt0Var2.f30019f = booleanValue2;
                                rt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((st0) arrayList2.get(i12)).Q();
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else if (k2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) k2Var;
            if (profileActivity.f33818g1) {
                this.f30021r = profileActivity.getUserConfig().e();
                this.f30022s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.f30021r = a10;
                this.f30022s = profileActivity.f33811f1;
                TLRPC.ChatFull chatFull = profileActivity.f33908t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a10 != k2Var.getUserConfig().e()) {
                    k2Var.getMessagesController().F1().f(a10, new org.telegram.messenger.q20(this) {
                        public final rt0 f29750b;

                        {
                            this.f29750b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (r2) {
                                case 0:
                                    rt0 rt0Var = this.f29750b;
                                    ArrayList arrayList = rt0Var.f30025y;
                                    boolean booleanValue = bool.booleanValue();
                                    rt0Var.f30019f = booleanValue;
                                    rt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((st0) arrayList.get(i11)).Q();
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    rt0 rt0Var2 = this.f29750b;
                                    ArrayList arrayList2 = rt0Var2.f30025y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    rt0Var2.f30019f = booleanValue2;
                                    rt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((st0) arrayList2.get(i12)).Q();
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (k2Var instanceof n90) {
            this.f30021r = ((n90) k2Var).e;
        } else if (k2Var instanceof org.telegram.ui.ay) {
            this.f30021r = k2Var.getUserConfig().e();
        }
        if (this.f30023w == 0 && org.telegram.messenger.o5.z(this.f30021r) && (M0 = k2Var.getMessagesController().M0(-this.f30021r)) != null) {
            long j10 = M0.migrated_from_chat_id;
            if (j10 != 0) {
                this.f30023w = -j10;
            }
        }
        this.f30020n = new ot0[9];
        int i11 = 0;
        while (true) {
            ot0[] ot0VarArr = this.f30020n;
            if (i11 >= ot0VarArr.length) {
                break;
            }
            ot0VarArr[i11] = new ot0();
            ot0 ot0Var = this.f30020n[i11];
            if (org.telegram.messenger.o5.C(this.f30021r)) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            ot0Var.f29183j[0] = i10;
            this.f30020n[i11].f29183j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.k2 k2Var2 = this.f30024x;
        if (k2Var2 == null) {
            this.E = null;
            return;
        }
        org.telegram.messenger.zs notificationCenter = k2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar = new xa.n(notificationCenter, this);
        nVar.e(org.telegram.messenger.zs.X);
        nVar.e(org.telegram.messenger.zs.W);
        nVar.e(1);
        nVar.e(org.telegram.messenger.zs.K);
        nVar.e(org.telegram.messenger.zs.V);
        nVar.e(org.telegram.messenger.zs.f19710w);
        nVar.e(org.telegram.messenger.zs.m0);
        nVar.e(org.telegram.messenger.zs.T);
        nVar.e(org.telegram.messenger.zs.Y1);
        nVar.e(org.telegram.messenger.zs.f19723x5);
        nVar.e(org.telegram.messenger.zs.f19617g3);
        this.E = nVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30024x;
        if (k2Var != null) {
            org.telegram.messenger.ui mediaDataController = k2Var.getMediaDataController();
            long j10 = this.f30022s;
            mediaDataController.e0(this.f30021r, k2Var.getClassGuid(), j10);
            if (this.f30023w != 0) {
                k2Var.getMediaDataController().e0(this.f30023w, k2Var.getClassGuid(), this.f30022s);
            }
        }
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var == this.f30024x) {
            this.f30025y.clear();
            xa.n nVar = this.E;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f30024x;
        if (k2Var != null && chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f30023w == 0) {
                this.f30023w = -j10;
                k2Var.getMediaDataController().e0(this.f30023w, k2Var.getClassGuid(), this.f30022s);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
