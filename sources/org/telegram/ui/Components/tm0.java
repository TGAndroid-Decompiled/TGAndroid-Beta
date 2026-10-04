package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class tm0 implements View.OnClickListener {
    public final int f31097a;
    public final an0 f31098b;

    public tm0(an0 an0Var, int i10) {
        this.f31097a = i10;
        this.f31098b = an0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31097a) {
            case 0:
                this.f31098b.f24588f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f31098b.f24588f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f31098b.f24588f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f31098b.f24588f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f31098b.f24588f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
