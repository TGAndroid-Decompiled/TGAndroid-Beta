package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class aq0 implements View.OnClickListener {
    public final int f24782a;
    public final hr0 f24783b;

    public aq0(hr0 hr0Var, int i10) {
        this.f24782a = i10;
        this.f24783b = hr0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24782a) {
            case 0:
                hr0 hr0Var = this.f24783b;
                vp vpVar = hr0Var.f27129f0;
                vpVar.a(!vpVar.f32005a.f24297q, true);
                hr0Var.f1();
                return;
            case 1:
                hr0 hr0Var2 = this.f24783b;
                org.telegram.ui.ActionBar.m1 m1Var = hr0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    hr0Var2.K0.d(true);
                }
                hr0Var2.a1(false);
                return;
            case 2:
                hr0 hr0Var3 = this.f24783b;
                org.telegram.ui.ActionBar.m1 m1Var2 = hr0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    hr0Var3.K0.d(true);
                }
                hr0Var3.a1(true);
                return;
            case 3:
                hr0 hr0Var4 = this.f24783b;
                String[] strArr = hr0Var4.f27139p0;
                if (hr0Var4.V.m() == 0) {
                    if (hr0Var4.f27138o0 || strArr[0] != null) {
                        hr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] == null && hr0Var4.m0) {
                            hr0Var4.f27137n0 = true;
                            Toast.makeText(hr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hr0Var4.getContext();
                        hr0Var4.R0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hr0 hr0Var5 = this.f24783b;
                String[] strArr2 = hr0Var5.f27139p0;
                if (hr0Var5.V.m() == 0) {
                    if (hr0Var5.f27138o0 || strArr2[0] != null) {
                        hr0Var5.dismiss();
                        if (strArr2[0] == null && hr0Var5.m0) {
                            hr0Var5.f27137n0 = true;
                            Toast.makeText(hr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hr0Var5.getContext();
                        hr0Var5.R0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                hr0 hr0Var6 = this.f24783b;
                String[] strArr3 = hr0Var6.f27139p0;
                if (hr0Var6.V.m() == 0) {
                    if (hr0Var6.f27138o0 || strArr3[0] != null) {
                        hr0Var6.dismiss();
                        if (strArr3[0] == null && hr0Var6.m0) {
                            hr0Var6.f27137n0 = true;
                            Toast.makeText(hr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        hr0Var6.getContext();
                        hr0Var6.R0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f24783b.a1(true);
                return;
        }
    }
}
