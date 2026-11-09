package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class dj0 implements r9, org.telegram.ui.Components.bi {
    public final dk0 f44990a;

    public dj0(dk0 dk0Var) {
        this.f44990a = dk0Var;
    }

    @Override
    public void F0() {
        org.telegram.messenger.g0.v1(this.f44990a.fragmentView.findFocus());
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
        boolean isEmpty = TextUtils.isEmpty(zrVar.f26910b);
        dk0 dk0Var = this.f44990a;
        if (!isEmpty) {
            dk0Var.Y[0].setText(zrVar.f26910b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            dk0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.f26911c)) {
            dk0Var.Y[2].setText(zrVar.f26911c);
        }
        int i7 = zrVar.f26920n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    dk0Var.f45043x = "female";
                    dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                }
            } else {
                dk0Var.f45043x = "male";
                dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26919m)) {
            String str = zrVar.f26919m;
            dk0Var.f45031s = str;
            String str2 = (String) dk0Var.Y0.get(str);
            if (str2 != null) {
                dk0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26918l)) {
            String str3 = zrVar.f26918l;
            dk0Var.f45040w = str3;
            String str4 = (String) dk0Var.Y0.get(str3);
            if (str4 != null) {
                dk0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.f26917k;
        if (i10 > 0 && zrVar.f26916j > 0 && zrVar.f26915i > 0) {
            dk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.f26916j), Integer.valueOf(zrVar.f26915i)));
        }
    }

    @Override
    public void c0(org.telegram.ui.Components.qg qgVar) {
        qgVar.run();
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
        org.telegram.ui.Components.di diVar;
        dk0 dk0Var = this.f44990a;
        if (dk0Var.getParentActivity() != null && (diVar = dk0Var.R0) != null) {
            if (i7 != 8 && i7 != 7) {
                diVar.L(i7);
                dk0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                diVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = dk0Var.R0.f32987a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = dk0Var.R0.f32987a2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i12));
                    ?? obj = new Object();
                    String str = gfVar.h;
                    if (str != null) {
                        obj.f22512c = str;
                    } else {
                        obj.f22512c = gfVar.I;
                    }
                    arrayList.add(obj);
                    gfVar.e();
                }
                dk0Var.K1(arrayList);
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
