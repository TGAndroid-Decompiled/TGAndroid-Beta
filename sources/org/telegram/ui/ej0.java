package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ej0 implements r9, org.telegram.ui.Components.ai {
    public final ek0 f45314a;

    public ej0(ek0 ek0Var) {
        this.f45314a = ek0Var;
    }

    @Override
    public void F0() {
        org.telegram.messenger.g0.v1(this.f45314a.fragmentView.findFocus());
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public void V0(org.telegram.messenger.zr zrVar) {
        boolean isEmpty = TextUtils.isEmpty(zrVar.f26914b);
        ek0 ek0Var = this.f45314a;
        if (!isEmpty) {
            ek0Var.Y[0].setText(zrVar.f26914b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            ek0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.f26915c)) {
            ek0Var.Y[2].setText(zrVar.f26915c);
        }
        int i7 = zrVar.f26924n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    ek0Var.f45367x = "female";
                    ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                }
            } else {
                ek0Var.f45367x = "male";
                ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26923m)) {
            String str = zrVar.f26923m;
            ek0Var.f45355s = str;
            String str2 = (String) ek0Var.Y0.get(str);
            if (str2 != null) {
                ek0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26922l)) {
            String str3 = zrVar.f26922l;
            ek0Var.f45364w = str3;
            String str4 = (String) ek0Var.Y0.get(str3);
            if (str4 != null) {
                ek0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.f26921k;
        if (i10 > 0 && zrVar.f26920j > 0 && zrVar.f26919i > 0) {
            ek0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.f26920j), Integer.valueOf(zrVar.f26919i)));
        }
    }

    @Override
    public void c0(org.telegram.ui.Components.pg pgVar) {
        pgVar.run();
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        org.telegram.ui.Components.ci ciVar;
        ek0 ek0Var = this.f45314a;
        if (ek0Var.getParentActivity() != null && (ciVar = ek0Var.R0) != null) {
            if (i7 != 8 && i7 != 7) {
                ciVar.L(i7);
                ek0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                ciVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = ek0Var.R0.d2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = ek0Var.R0.d2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = gfVar.h;
                    if (str != null) {
                        obj.f22516c = str;
                    } else {
                        obj.f22516c = gfVar.I;
                    }
                    arrayList.add(obj);
                    gfVar.e();
                }
                ek0Var.K1(arrayList);
            }
        }
    }

    @Override
    public void M(String str) {
    }

    @Override
    public void M0(Object obj) {
    }

    @Override
    public void Y0(TLRPC.User user) {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
