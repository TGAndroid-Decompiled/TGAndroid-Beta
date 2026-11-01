package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ik0 implements t9, org.telegram.ui.Components.ai {
    public final jl0 f38100a;

    public ik0(jl0 jl0Var) {
        this.f38100a = jl0Var;
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
        jl0 jl0Var = this.f38100a;
        if (jl0Var.getParentActivity() != null && (biVar = jl0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                biVar.M(i10);
                jl0Var.J1(i10);
                return;
            }
            if (i10 != 8) {
                biVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = jl0Var.R0.a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = jl0Var.R0.a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i13));
                    ?? obj = new Object();
                    String str = ffVar.h;
                    if (str != null) {
                        obj.f17850c = str;
                    } else {
                        obj.f17850c = ffVar.I;
                    }
                    arrayList.add(obj);
                    ffVar.e();
                }
                jl0Var.K1(arrayList);
            }
        }
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public void X0(org.telegram.messenger.js jsVar) {
        boolean isEmpty = TextUtils.isEmpty(jsVar.f16502b);
        jl0 jl0Var = this.f38100a;
        if (!isEmpty) {
            jl0Var.Y[0].setText(jsVar.f16502b);
        }
        if (!TextUtils.isEmpty(jsVar.d)) {
            jl0Var.Y[1].setText(jsVar.d);
        }
        if (!TextUtils.isEmpty(jsVar.f16503c)) {
            jl0Var.Y[2].setText(jsVar.f16503c);
        }
        int i10 = jsVar.f16511n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    jl0Var.f38461x = "female";
                    jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747585, null));
                }
            } else {
                jl0Var.f38461x = "male";
                jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747524, null));
            }
        }
        if (!TextUtils.isEmpty(jsVar.f16510m)) {
            String str = jsVar.f16510m;
            jl0Var.f38449s = str;
            String str2 = (String) jl0Var.Y0.get(str);
            if (str2 != null) {
                jl0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(jsVar.f16509l)) {
            String str3 = jsVar.f16509l;
            jl0Var.f38458w = str3;
            String str4 = (String) jl0Var.Y0.get(str3);
            if (str4 != null) {
                jl0Var.Y[6].setText(str4);
            }
        }
        int i11 = jsVar.f16508k;
        if (i11 > 0 && jsVar.f16507j > 0 && jsVar.f16506i > 0) {
            jl0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(jsVar.f16507j), Integer.valueOf(jsVar.f16506i)));
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
        org.telegram.messenger.i0.v1(this.f38100a.fragmentView.findFocus());
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
