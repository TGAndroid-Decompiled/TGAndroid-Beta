package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class tm0 implements View.OnClickListener {
    public final int f31103a;
    public final an0 f31104b;

    public tm0(an0 an0Var, int i10) {
        this.f31103a = i10;
        this.f31104b = an0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31103a) {
            case 0:
                this.f31104b.f24592f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f31104b.f24592f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f31104b.f24592f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f31104b.f24592f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f31104b.f24592f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
