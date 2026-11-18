package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class hj0 implements s9, org.telegram.ui.Components.qi {
    public final hk0 f48365a;

    public hj0(hk0 hk0Var) {
        this.f48365a = hk0Var;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K0() {
        org.telegram.messenger.g0.v1(this.f48365a.fragmentView.findFocus());
    }

    @Override
    public void S0(org.telegram.messenger.ur urVar) {
        boolean isEmpty = TextUtils.isEmpty(urVar.f27212b);
        hk0 hk0Var = this.f48365a;
        if (!isEmpty) {
            hk0Var.Z[0].setText(urVar.f27212b);
        }
        if (!TextUtils.isEmpty(urVar.d)) {
            hk0Var.Z[1].setText(urVar.d);
        }
        if (!TextUtils.isEmpty(urVar.f27213c)) {
            hk0Var.Z[2].setText(urVar.f27213c);
        }
        int i7 = urVar.f27222n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    hk0Var.f48421x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
                }
            } else {
                hk0Var.f48421x = "male";
                hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
            }
        }
        if (!TextUtils.isEmpty(urVar.f27221m)) {
            String str = urVar.f27221m;
            hk0Var.f48409s = str;
            String str2 = (String) hk0Var.Z0.get(str);
            if (str2 != null) {
                hk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(urVar.f27220l)) {
            String str3 = urVar.f27220l;
            hk0Var.f48418w = str3;
            String str4 = (String) hk0Var.Z0.get(str3);
            if (str4 != null) {
                hk0Var.Z[6].setText(str4);
            }
        }
        int i10 = urVar.f27219k;
        if (i10 > 0 && urVar.f27218j > 0 && urVar.f27217i > 0) {
            hk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(urVar.f27218j), Integer.valueOf(urVar.f27217i)));
        }
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public void f0(org.telegram.ui.Components.eh ehVar) {
        ehVar.run();
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.si siVar;
        hk0 hk0Var = this.f48365a;
        if (hk0Var.getParentActivity() != null && (siVar = hk0Var.S0) != null) {
            if (i7 != 8 && i7 != 7) {
                siVar.M(i7);
                hk0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                siVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = hk0Var.S0.f39670e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = hk0Var.S0.f39670e2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = efVar.h;
                    if (str != null) {
                        obj.f28211c = str;
                    } else {
                        obj.f28211c = efVar.I;
                    }
                    arrayList.add(obj);
                    efVar.e();
                }
                hk0Var.K1(arrayList);
            }
        }
    }

    @Override
    public void J(String str) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
