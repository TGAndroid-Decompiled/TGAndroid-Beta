package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class kk0 implements t9, org.telegram.ui.Components.ai {
    public final ll0 f38882a;

    public kk0(ll0 ll0Var) {
        this.f38882a = ll0Var;
    }

    @Override
    public void C(org.telegram.ui.Components.mg mgVar) {
        mgVar.run();
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.bi biVar;
        ll0 ll0Var = this.f38882a;
        if (ll0Var.getParentActivity() != null && (biVar = ll0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                biVar.N(i10);
                ll0Var.I1(i10);
                return;
            }
            if (i10 != 8) {
                biVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = ll0Var.R0.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = ll0Var.R0.a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i13));
                    ?? obj = new Object();
                    String str = efVar.h;
                    if (str != null) {
                        obj.f17515c = str;
                    } else {
                        obj.f17515c = efVar.I;
                    }
                    arrayList.add(obj);
                    efVar.e();
                }
                ll0Var.J1(arrayList);
            }
        }
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public void X0(org.telegram.messenger.is isVar) {
        boolean isEmpty = TextUtils.isEmpty(isVar.f16167b);
        ll0 ll0Var = this.f38882a;
        if (!isEmpty) {
            ll0Var.Y[0].setText(isVar.f16167b);
        }
        if (!TextUtils.isEmpty(isVar.d)) {
            ll0Var.Y[1].setText(isVar.d);
        }
        if (!TextUtils.isEmpty(isVar.f16168c)) {
            ll0Var.Y[2].setText(isVar.f16168c);
        }
        int i10 = isVar.f16176n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ll0Var.f39309x = "female";
                    ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747585, null));
                }
            } else {
                ll0Var.f39309x = "male";
                ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747524, null));
            }
        }
        if (!TextUtils.isEmpty(isVar.f16175m)) {
            String str = isVar.f16175m;
            ll0Var.f39297s = str;
            String str2 = (String) ll0Var.Y0.get(str);
            if (str2 != null) {
                ll0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(isVar.f16174l)) {
            String str3 = isVar.f16174l;
            ll0Var.f39306w = str3;
            String str4 = (String) ll0Var.Y0.get(str3);
            if (str4 != null) {
                ll0Var.Y[6].setText(str4);
            }
        }
        int i11 = isVar.f16173k;
        if (i11 > 0 && isVar.f16172j > 0 && isVar.f16171i > 0) {
            ll0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(isVar.f16172j), Integer.valueOf(isVar.f16171i)));
        }
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void j0() {
        org.telegram.messenger.i0.v1(this.f38882a.fragmentView.findFocus());
    }

    @Override
    public void L(String str) {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    @Override
    public void N() {
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
