package org.telegram.ui.Components;

import android.view.View;
public final class pl0 implements View.OnClickListener {
    public final int f29450a;
    public final vl0 f29451b;

    public pl0(vl0 vl0Var, int i10) {
        this.f29450a = i10;
        this.f29451b = vl0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29450a;
        vl0 vl0Var = this.f29451b;
        switch (i10) {
            case 0:
                vl0Var.f31324f.a(((Integer) view.getTag(2131296461)).intValue());
                return;
            case 1:
                vl0Var.f31324f.a(((Integer) view.getTag(2131296461)).intValue());
                return;
            case 2:
                vl0Var.f31324f.a(((Integer) view.getTag(2131296461)).intValue());
                return;
            case 3:
                vl0Var.f31324f.a(((Integer) view.getTag(2131296461)).intValue());
                return;
            default:
                vl0Var.f31324f.a(((Integer) view.getTag(2131296461)).intValue());
                return;
        }
    }
}
