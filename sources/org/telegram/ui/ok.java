package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ok implements org.telegram.ui.Components.zh {
    public final wm f48305a;

    public ok(wm wmVar) {
        this.f48305a = wmVar;
    }

    @Override
    public final boolean L1() {
        return false;
    }

    @Override
    public final void Y(org.telegram.ui.Components.ng ngVar) {
        this.f48305a.w8(ngVar);
    }

    @Override
    public final void a1(TLRPC.User user) {
        String n4 = org.telegram.messenger.l10.n(user);
        wm wmVar = this.f48305a;
        if (wmVar.f51237a0 != null && user != null && !TextUtils.isEmpty(n4)) {
            mj mjVar = wmVar.f51237a0;
            mjVar.setFieldText("@" + n4 + " ");
            wmVar.f51237a0.G0();
        }
    }

    @Override
    public final boolean g0() {
        return this.f48305a.pa();
    }

    @Override
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ei.x2 x2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        char c2;
        boolean z15;
        char c10;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        boolean z18;
        String str2;
        TLRPC.Message message;
        wm wmVar = this.f48305a;
        if (wmVar.getParentActivity() != null && (x2Var = wmVar.Y1) != null) {
            boolean z19 = x2Var.f32294y1;
            org.telegram.messenger.zi ziVar = x2Var.C3;
            wmVar.G5 = ziVar;
            if (ziVar != null && (message = ziVar.f26868k) != null) {
                message.invert_media = z12;
            }
            if (i3 != 8 && i3 != 7 && (i3 != 4 || x2Var.f32215b2.getSelectedPhotos().isEmpty())) {
                ei.x2 x2Var2 = wmVar.Y1;
                if (x2Var2 != null) {
                    x2Var2.L(i3);
                }
                wmVar.Za(i3);
                return;
            }
            ei.x2 x2Var3 = wmVar.Y1;
            if (x2Var3 != null && i3 != 8) {
                x2Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = wmVar.Y1.f32215b2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = wmVar.Y1.f32215b2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i14 = 0;
                while (i14 < ceil) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < min) {
                        int i17 = i15 + i16;
                        if (i17 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                        } else {
                            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            obj.f26476b = yeVar.h;
                            boolean d = yeVar.d();
                            obj.f26488p = d;
                            boolean z20 = yeVar.f25310b;
                            if (z19 && d) {
                                obj.f26488p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = yeVar.h) != null) {
                                obj.f26477c = str2;
                                if (!z19 && yeVar.c()) {
                                    obj.f26496y = yeVar.clone();
                                }
                            } else {
                                String str3 = yeVar.I;
                                if (str3 != null) {
                                    obj.f26477c = str3;
                                }
                            }
                            obj.f26478e = yeVar.f25311c;
                            obj.f26479f = yeVar.f25314g;
                            obj.f26480g = yeVar.f25312e;
                            obj.f26487o = z20;
                            obj.f26489q = yeVar.j();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f26497z = yeVar.f25319m;
                            obj.A = yeVar.P;
                            CharSequence charSequence = yeVar.f25309a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f26481i = yeVar.f25320n;
                            obj.f26482j = yeVar.f25324r;
                            obj.h = yeVar.f25329x;
                            obj.f26483k = yeVar.f25325s;
                            obj.f26490r = yeVar.L;
                            obj.f26492t = org.telegram.messenger.yy.h(yeVar.f25309a);
                            obj.f26493u = yeVar.M;
                            obj.f26494w = yeVar.N;
                            if (!z17 && yeVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f26495x = z18;
                            arrayList2.add(obj);
                            yeVar.e();
                        }
                        i16++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i14 == 0) {
                        wmVar.B8(((org.telegram.messenger.xy) arrayList2.get(0)).d, ((org.telegram.messenger.xy) arrayList2.get(0)).f26481i);
                        z14 = ((org.telegram.messenger.xy) arrayList2.get(0)).f26492t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.zi ziVar2 = wmVar.G5;
                    if (ziVar2 != null && ziVar2.q5()) {
                        org.telegram.messenger.ej ejVar = wmVar.f51540x5;
                        if (ejVar == null) {
                            ejVar = org.telegram.messenger.ej.b(wmVar.G5.f26868k.suggested_post);
                        }
                        org.telegram.messenger.ej ejVar2 = ejVar;
                        org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                        int i18 = ceil;
                        long j12 = wmVar.f51376k6;
                        org.telegram.messenger.zi ziVar3 = wmVar.G5;
                        int i19 = i14;
                        org.telegram.messenger.zi ziVar4 = wmVar.f51397m4;
                        mm mmVar = wmVar.C5;
                        if (i3 != 4 && !z13) {
                            c10 = 4;
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            c10 = 4;
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i13 = i19;
                        i12 = i18;
                        c2 = c10;
                        org.telegram.messenger.yy.X(accountInstance, arrayList, j12, ziVar3, ziVar4, null, mmVar, z16, z10, null, null, z11, i10, i11, z14, null, wmVar.W8(), j10, z12, j11, wmVar.h9(), ejVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c2 = 4;
                        org.telegram.messenger.c accountInstance2 = wmVar.getAccountInstance();
                        long j13 = wmVar.f51376k6;
                        org.telegram.messenger.zi ziVar5 = wmVar.E5;
                        org.telegram.messenger.zi ziVar6 = wmVar.f51397m4;
                        mm mmVar2 = wmVar.C5;
                        if (i3 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.yy.X(accountInstance2, arrayList2, j13, ziVar5, ziVar6, null, mmVar2, z15, z10, wmVar.G5, null, z11, i10, i11, z14, null, wmVar.W8(), j10, z12, j11, wmVar.h9(), wmVar.f51540x5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                wmVar.K6();
                wmVar.f51237a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (wmVar.f51338h4 == -1) {
                    wmVar.f51338h4 = 0;
                }
                wmVar.f51338h4 += hashMap.size();
                wmVar.id(true);
            }
        }
    }

    @Override
    public final void v0() {
        this.f48305a.f51237a0.L();
    }

    @Override
    public final void I0(Object obj) {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
