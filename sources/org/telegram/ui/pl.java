package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pl implements org.telegram.ui.Components.ai {
    public final un f40683a;

    public pl(un unVar) {
        this.f40683a = unVar;
    }

    @Override
    public final void C(org.telegram.ui.Components.mg mgVar) {
        this.f40683a.p8(mgVar);
    }

    @Override
    public final boolean D() {
        return this.f40683a.fa();
    }

    @Override
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        char c10;
        boolean z15;
        char c11;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        boolean z18;
        String str2;
        TLRPC.Message message;
        un unVar = this.f40683a;
        if (unVar.getParentActivity() != null && (vVar = unVar.X1) != null) {
            boolean z19 = vVar.f24740x1;
            org.telegram.messenger.jj jjVar = vVar.B3;
            unVar.F5 = jjVar;
            if (jjVar != null && (message = jjVar.f16337k) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || vVar.a2.getSelectedPhotos().isEmpty())) {
                ag.v vVar2 = unVar.X1;
                if (vVar2 != null) {
                    vVar2.N(i10);
                }
                unVar.Pa(i10);
                return;
            }
            ag.v vVar3 = unVar.X1;
            if (vVar3 != null && i10 != 8) {
                vVar3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = unVar.X1.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = unVar.X1.a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i15 = 0;
                while (i15 < ceil) {
                    int i16 = i15 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i16);
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (i17 < min) {
                        int i18 = i16 + i17;
                        if (i18 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                        } else {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i18));
                            ?? obj = new Object();
                            obj.f17514b = efVar.h;
                            boolean d = efVar.d();
                            obj.f17525p = d;
                            boolean z20 = efVar.f19507b;
                            if (z19 && d) {
                                obj.f17525p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = efVar.h) != null) {
                                obj.f17515c = str2;
                                if (!z19 && efVar.c()) {
                                    obj.f17533y = efVar.clone();
                                }
                            } else {
                                String str3 = efVar.I;
                                if (str3 != null) {
                                    obj.f17515c = str3;
                                }
                            }
                            obj.e = efVar.f19508c;
                            obj.f17516f = efVar.f19510g;
                            obj.f17517g = efVar.e;
                            obj.f17524o = z20;
                            obj.f17526q = efVar.i();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f17534z = efVar.f19515m;
                            obj.A = efVar.P;
                            CharSequence charSequence = efVar.f19506a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f17518i = efVar.f19516n;
                            obj.f17519j = efVar.f19520r;
                            obj.h = efVar.f19525x;
                            obj.f17520k = efVar.f19521s;
                            obj.f17527r = efVar.L;
                            obj.f17529t = org.telegram.messenger.qz.h(efVar.f19506a);
                            obj.f17530u = efVar.M;
                            obj.f17531w = efVar.N;
                            if (!z17 && efVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f17532x = z18;
                            arrayList2.add(obj);
                            efVar.e();
                        }
                        i17++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i15 == 0) {
                        unVar.u8(((org.telegram.messenger.pz) arrayList2.get(0)).d, ((org.telegram.messenger.pz) arrayList2.get(0)).f17518i);
                        z14 = ((org.telegram.messenger.pz) arrayList2.get(0)).f17529t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.jj jjVar2 = unVar.F5;
                    if (jjVar2 != null && jjVar2.p5()) {
                        org.telegram.messenger.oj ojVar = unVar.f42459w5;
                        if (ojVar == null) {
                            ojVar = org.telegram.messenger.oj.b(unVar.F5.f16337k.suggested_post);
                        }
                        org.telegram.messenger.oj ojVar2 = ojVar;
                        org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = unVar.f42297j6;
                        org.telegram.messenger.jj jjVar3 = unVar.F5;
                        int i20 = i15;
                        org.telegram.messenger.jj jjVar4 = unVar.l4;
                        kn knVar = unVar.B5;
                        if (i10 != 4 && !z13) {
                            c11 = 4;
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            c11 = 4;
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        c10 = c11;
                        org.telegram.messenger.qz.X(accountInstance, arrayList, j12, jjVar3, jjVar4, null, knVar, z16, z10, null, null, z11, i11, i12, z14, null, unVar.P8(), j10, z12, j11, unVar.a9(), ojVar2, null, false);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = unVar.getAccountInstance();
                        long j13 = unVar.f42297j6;
                        org.telegram.messenger.jj jjVar5 = unVar.D5;
                        org.telegram.messenger.jj jjVar6 = unVar.l4;
                        kn knVar2 = unVar.B5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.qz.X(accountInstance2, arrayList2, j13, jjVar5, jjVar6, null, knVar2, z15, z10, unVar.F5, null, z11, i11, i12, z14, null, unVar.P8(), j10, z12, j11, unVar.a9(), unVar.f42459w5, null, false);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                unVar.F6();
                unVar.Z.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (unVar.f42260g4 == -1) {
                    unVar.f42260g4 = 0;
                }
                unVar.f42260g4 += hashMap.size();
                unVar.Yc(true);
            }
        }
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void j0() {
        this.f40683a.Z.L();
    }

    @Override
    public final void v0(TLRPC.User user) {
        String n10 = org.telegram.messenger.h20.n(user);
        un unVar = this.f40683a;
        if (unVar.Z != null && user != null && !TextUtils.isEmpty(n10)) {
            mk mkVar = unVar.Z;
            mkVar.setFieldText("@" + n10 + " ");
            unVar.Z.F0();
        }
    }

    @Override
    public final void n0(Object obj) {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
