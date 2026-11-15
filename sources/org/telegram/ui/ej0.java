package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ej0 implements s9, org.telegram.ui.Components.ii {
    public final ek0 f46800a;

    public ej0(ek0 ek0Var) {
        this.f46800a = ek0Var;
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public void K0() {
        org.telegram.messenger.g0.v1(this.f46800a.fragmentView.findFocus());
    }

    @Override
    public void S0(org.telegram.messenger.wr wrVar) {
        boolean isEmpty = TextUtils.isEmpty(wrVar.f27380b);
        ek0 ek0Var = this.f46800a;
        if (!isEmpty) {
            ek0Var.Z[0].setText(wrVar.f27380b);
        }
        if (!TextUtils.isEmpty(wrVar.d)) {
            ek0Var.Z[1].setText(wrVar.d);
        }
        if (!TextUtils.isEmpty(wrVar.f27381c)) {
            ek0Var.Z[2].setText(wrVar.f27381c);
        }
        int i7 = wrVar.f27390n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    ek0Var.f46854x = "female";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                }
            } else {
                ek0Var.f46854x = "male";
                ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
            }
        }
        if (!TextUtils.isEmpty(wrVar.f27389m)) {
            String str = wrVar.f27389m;
            ek0Var.f46842s = str;
            String str2 = (String) ek0Var.Z0.get(str);
            if (str2 != null) {
                ek0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(wrVar.f27388l)) {
            String str3 = wrVar.f27388l;
            ek0Var.f46851w = str3;
            String str4 = (String) ek0Var.Z0.get(str3);
            if (str4 != null) {
                ek0Var.Z[6].setText(str4);
            }
        }
        int i10 = wrVar.f27387k;
        if (i10 > 0 && wrVar.f27386j > 0 && wrVar.f27385i > 0) {
            ek0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(wrVar.f27386j), Integer.valueOf(wrVar.f27385i)));
        }
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public void d0(org.telegram.ui.Components.vg vgVar) {
        vgVar.run();
    }

    @Override
    public boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ki kiVar;
        ek0 ek0Var = this.f46800a;
        if (ek0Var.getParentActivity() != null && (kiVar = ek0Var.S0) != null) {
            if (i7 != 8 && i7 != 7) {
                kiVar.M(i7);
                ek0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                kiVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = ek0Var.S0.f36447e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = ek0Var.S0.f36447e2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = ffVar.h;
                    if (str != null) {
                        obj.f23189c = str;
                    } else {
                        obj.f23189c = ffVar.I;
                    }
                    arrayList.add(obj);
                    ffVar.e();
                }
                ek0Var.K1(arrayList);
            }
        }
    }

    @Override
    public void M(String str) {
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
