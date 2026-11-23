package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class hj0 implements s9, org.telegram.ui.Components.si {
    public final hk0 f48376a;

    public hj0(hk0 hk0Var) {
        this.f48376a = hk0Var;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K0() {
        org.telegram.messenger.g0.v1(this.f48376a.fragmentView.findFocus());
    }

    @Override
    public void S0(org.telegram.messenger.vr vrVar) {
        boolean isEmpty = TextUtils.isEmpty(vrVar.f27540b);
        hk0 hk0Var = this.f48376a;
        if (!isEmpty) {
            hk0Var.Z[0].setText(vrVar.f27540b);
        }
        if (!TextUtils.isEmpty(vrVar.d)) {
            hk0Var.Z[1].setText(vrVar.d);
        }
        if (!TextUtils.isEmpty(vrVar.f27541c)) {
            hk0Var.Z[2].setText(vrVar.f27541c);
        }
        int i7 = vrVar.f27550n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    hk0Var.f48432x = "female";
                    hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747375, null));
                }
            } else {
                hk0Var.f48432x = "male";
                hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747314, null));
            }
        }
        if (!TextUtils.isEmpty(vrVar.f27549m)) {
            String str = vrVar.f27549m;
            hk0Var.f48420s = str;
            String str2 = (String) hk0Var.Z0.get(str);
            if (str2 != null) {
                hk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(vrVar.f27548l)) {
            String str3 = vrVar.f27548l;
            hk0Var.f48429w = str3;
            String str4 = (String) hk0Var.Z0.get(str3);
            if (str4 != null) {
                hk0Var.Z[6].setText(str4);
            }
        }
        int i10 = vrVar.f27547k;
        if (i10 > 0 && vrVar.f27546j > 0 && vrVar.f27545i > 0) {
            hk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(vrVar.f27546j), Integer.valueOf(vrVar.f27545i)));
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
    public void f0(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ui uiVar;
        hk0 hk0Var = this.f48376a;
        if (hk0Var.getParentActivity() != null && (uiVar = hk0Var.S0) != null) {
            if (i7 != 8 && i7 != 7) {
                uiVar.M(i7);
                hk0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                uiVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = hk0Var.S0.f40363e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = hk0Var.S0.f40363e2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = ffVar.h;
                    if (str != null) {
                        obj.f28371c = str;
                    } else {
                        obj.f28371c = ffVar.I;
                    }
                    arrayList.add(obj);
                    ffVar.e();
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
