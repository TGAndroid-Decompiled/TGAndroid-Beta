package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class bj0 implements r9, org.telegram.ui.Components.bi {
    public final bk0 f44361a;

    public bj0(bk0 bk0Var) {
        this.f44361a = bk0Var;
    }

    @Override
    public void F0() {
        org.telegram.messenger.g0.v1(this.f44361a.fragmentView.findFocus());
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
        bk0 bk0Var = this.f44361a;
        if (!isEmpty) {
            bk0Var.Y[0].setText(zrVar.f26910b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            bk0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.f26911c)) {
            bk0Var.Y[2].setText(zrVar.f26911c);
        }
        int i7 = zrVar.f26920n;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    bk0Var.f44414x = "female";
                    bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747570, null));
                }
            } else {
                bk0Var.f44414x = "male";
                bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747509, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26919m)) {
            String str = zrVar.f26919m;
            bk0Var.f44402s = str;
            String str2 = (String) bk0Var.Y0.get(str);
            if (str2 != null) {
                bk0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.f26918l)) {
            String str3 = zrVar.f26918l;
            bk0Var.f44411w = str3;
            String str4 = (String) bk0Var.Y0.get(str3);
            if (str4 != null) {
                bk0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.f26917k;
        if (i10 > 0 && zrVar.f26916j > 0 && zrVar.f26915i > 0) {
            bk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.f26916j), Integer.valueOf(zrVar.f26915i)));
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
        bk0 bk0Var = this.f44361a;
        if (bk0Var.getParentActivity() != null && (diVar = bk0Var.R0) != null) {
            if (i7 != 8 && i7 != 7) {
                diVar.L(i7);
                bk0Var.J1(i7);
                return;
            }
            if (i7 != 8) {
                diVar.a(true);
            }
            HashMap<Object, Object> selectedPhotos = bk0Var.R0.f32932a2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = bk0Var.R0.f32932a2.getSelectedPhotosOrder();
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
                bk0Var.K1(arrayList);
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
