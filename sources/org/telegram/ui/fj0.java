package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class fj0 implements s9, org.telegram.ui.Components.ri {
    public final fk0 f47849a;

    public fj0(fk0 fk0Var) {
        this.f47849a = fk0Var;
    }

    @Override
    public void B0() {
        org.telegram.messenger.g0.v1(this.f47849a.fragmentView.findFocus());
    }

    @Override
    public void E0(org.telegram.messenger.ur urVar) {
        boolean isEmpty = TextUtils.isEmpty(urVar.f27316b);
        fk0 fk0Var = this.f47849a;
        if (!isEmpty) {
            fk0Var.Z[0].setText(urVar.f27316b);
        }
        if (!TextUtils.isEmpty(urVar.d)) {
            fk0Var.Z[1].setText(urVar.d);
        }
        if (!TextUtils.isEmpty(urVar.f27317c)) {
            fk0Var.Z[2].setText(urVar.f27317c);
        }
        int i7 = urVar.f27326n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    fk0Var.f47903x = "female";
                    fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
                }
            } else {
                fk0Var.f47903x = "male";
                fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
            }
        }
        if (!TextUtils.isEmpty(urVar.f27325m)) {
            String str = urVar.f27325m;
            fk0Var.f47891s = str;
            String str2 = (String) fk0Var.Z0.get(str);
            if (str2 != null) {
                fk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(urVar.f27324l)) {
            String str3 = urVar.f27324l;
            fk0Var.f47900w = str3;
            String str4 = (String) fk0Var.Z0.get(str3);
            if (str4 != null) {
                fk0Var.Z[6].setText(str4);
            }
        }
        int i10 = urVar.f27323k;
        if (i10 > 0 && urVar.f27322j > 0 && urVar.f27321i > 0) {
            fk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(urVar.f27322j), Integer.valueOf(urVar.f27321i)));
        }
    }

    @Override
    public void S(org.telegram.ui.Components.fh fhVar) {
        fhVar.run();
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public String w0() {
        return null;
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ti tiVar;
        fk0 fk0Var = this.f47849a;
        if (fk0Var.getParentActivity() != null && (tiVar = fk0Var.S0) != null) {
            if (i7 != 8 && i7 != 7) {
                tiVar.M(i7);
                fk0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                tiVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = fk0Var.S0.f39967e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = fk0Var.S0.f39967e2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = efVar.h;
                    if (str != null) {
                        obj.f28311c = str;
                    } else {
                        obj.f28311c = efVar.I;
                    }
                    arrayList.add(obj);
                    efVar.e();
                }
                fk0Var.K1(arrayList);
            }
        }
    }

    @Override
    public void H(String str) {
    }

    @Override
    public void O0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void l0() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
