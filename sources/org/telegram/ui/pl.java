package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pl implements org.telegram.ui.Components.ai {
    public final un f40497a;

    public pl(un unVar) {
        this.f40497a = unVar;
    }

    @Override
    public final void C(org.telegram.ui.Components.mg mgVar) {
        this.f40497a.t8(mgVar);
    }

    @Override
    public final boolean D() {
        return this.f40497a.ka();
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
        un unVar = this.f40497a;
        if (unVar.getParentActivity() != null && (vVar = unVar.X1) != null) {
            boolean z19 = vVar.f24831x1;
            org.telegram.messenger.kj kjVar = vVar.B3;
            unVar.F5 = kjVar;
            if (kjVar != null && (message = kjVar.f16690k) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || vVar.a2.getSelectedPhotos().isEmpty())) {
                ag.v vVar2 = unVar.X1;
                if (vVar2 != null) {
                    vVar2.M(i10);
                }
                unVar.Ua(i10);
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
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i18));
                            ?? obj = new Object();
                            obj.f17849b = ffVar.h;
                            boolean d = ffVar.d();
                            obj.f17860p = d;
                            boolean z20 = ffVar.f14603b;
                            if (z19 && d) {
                                obj.f17860p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = ffVar.h) != null) {
                                obj.f17850c = str2;
                                if (!z19 && ffVar.c()) {
                                    obj.f17868y = ffVar.clone();
                                }
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f17850c = str3;
                                }
                            }
                            obj.e = ffVar.f14604c;
                            obj.f17851f = ffVar.f14606g;
                            obj.f17852g = ffVar.e;
                            obj.f17859o = z20;
                            obj.f17861q = ffVar.i();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f17869z = ffVar.f14611m;
                            obj.A = ffVar.P;
                            CharSequence charSequence = ffVar.f14602a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f17853i = ffVar.f14612n;
                            obj.f17854j = ffVar.f14616r;
                            obj.h = ffVar.f14621x;
                            obj.f17855k = ffVar.f14617s;
                            obj.f17862r = ffVar.L;
                            obj.f17864t = org.telegram.messenger.rz.h(ffVar.f14602a);
                            obj.f17865u = ffVar.M;
                            obj.f17866w = ffVar.N;
                            if (!z17 && ffVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f17867x = z18;
                            arrayList2.add(obj);
                            ffVar.e();
                        }
                        i17++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i15 == 0) {
                        unVar.y8(((org.telegram.messenger.qz) arrayList2.get(0)).d, ((org.telegram.messenger.qz) arrayList2.get(0)).f17853i);
                        z14 = ((org.telegram.messenger.qz) arrayList2.get(0)).f17864t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.kj kjVar2 = unVar.F5;
                    if (kjVar2 != null && kjVar2.p5()) {
                        org.telegram.messenger.pj pjVar = unVar.f42270w5;
                        if (pjVar == null) {
                            pjVar = org.telegram.messenger.pj.b(unVar.F5.f16690k.suggested_post);
                        }
                        org.telegram.messenger.pj pjVar2 = pjVar;
                        org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = unVar.f42108j6;
                        org.telegram.messenger.kj kjVar3 = unVar.F5;
                        int i20 = i15;
                        org.telegram.messenger.kj kjVar4 = unVar.l4;
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
                        org.telegram.messenger.rz.X(accountInstance, arrayList, j12, kjVar3, kjVar4, null, knVar, z16, z10, null, null, z11, i11, i12, z14, null, unVar.T8(), j10, z12, j11, unVar.e9(), pjVar2, null, false);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = unVar.getAccountInstance();
                        long j13 = unVar.f42108j6;
                        org.telegram.messenger.kj kjVar5 = unVar.D5;
                        org.telegram.messenger.kj kjVar6 = unVar.l4;
                        kn knVar2 = unVar.B5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.rz.X(accountInstance2, arrayList2, j13, kjVar5, kjVar6, null, knVar2, z15, z10, unVar.F5, null, z11, i11, i12, z14, null, unVar.T8(), j10, z12, j11, unVar.e9(), unVar.f42270w5, null, false);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                unVar.I6();
                unVar.Z.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (unVar.f42071g4 == -1) {
                    unVar.f42071g4 = 0;
                }
                unVar.f42071g4 += hashMap.size();
                unVar.dd(true);
            }
        }
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final void j0() {
        this.f40497a.Z.K();
    }

    @Override
    public final void v0(TLRPC.User user) {
        String n10 = org.telegram.messenger.i20.n(user);
        un unVar = this.f40497a;
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
