package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class fp0 implements View.OnClickListener {
    public final int f26977a;
    public final mq0 f26978b;

    public fp0(mq0 mq0Var, int i10) {
        this.f26977a = i10;
        this.f26978b = mq0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26977a) {
            case 0:
                mq0 mq0Var = this.f26978b;
                np npVar = mq0Var.f29198b0;
                npVar.a(!npVar.f29606a.f24809q, true);
                mq0Var.Z0();
                return;
            case 1:
                mq0 mq0Var2 = this.f26978b;
                org.telegram.ui.ActionBar.p1 p1Var = mq0Var2.G0;
                if (p1Var != null && p1Var.isShowing()) {
                    mq0Var2.G0.d(true);
                }
                mq0Var2.V0(false);
                return;
            case 2:
                mq0 mq0Var3 = this.f26978b;
                org.telegram.ui.ActionBar.p1 p1Var2 = mq0Var3.G0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    mq0Var3.G0.d(true);
                }
                mq0Var3.V0(true);
                return;
            case 3:
                mq0 mq0Var4 = this.f26978b;
                String[] strArr = mq0Var4.f29211l0;
                if (mq0Var4.R.m() == 0) {
                    if (mq0Var4.f29210k0 || strArr[0] != null) {
                        mq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] == null && mq0Var4.f29208i0) {
                            mq0Var4.f29209j0 = true;
                            Toast.makeText(mq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mq0Var4.getContext();
                        mq0Var4.M0();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                mq0 mq0Var5 = this.f26978b;
                String[] strArr2 = mq0Var5.f29211l0;
                if (mq0Var5.R.m() == 0) {
                    if (mq0Var5.f29210k0 || strArr2[0] != null) {
                        mq0Var5.dismiss();
                        if (strArr2[0] == null && mq0Var5.f29208i0) {
                            mq0Var5.f29209j0 = true;
                            Toast.makeText(mq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mq0Var5.getContext();
                        mq0Var5.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mq0 mq0Var6 = this.f26978b;
                String[] strArr3 = mq0Var6.f29211l0;
                if (mq0Var6.R.m() == 0) {
                    if (mq0Var6.f29210k0 || strArr3[0] != null) {
                        mq0Var6.dismiss();
                        if (strArr3[0] == null && mq0Var6.f29208i0) {
                            mq0Var6.f29209j0 = true;
                            Toast.makeText(mq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            return;
                        }
                        mq0Var6.getContext();
                        mq0Var6.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f26978b.V0(true);
                return;
        }
    }
}
