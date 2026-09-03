package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class jm0 implements View.OnClickListener {
    public final int f28144a;
    public final pm0 f28145b;

    public jm0(pm0 pm0Var, int i10) {
        this.f28144a = i10;
        this.f28145b = pm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28144a) {
            case 0:
                this.f28145b.f30137f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f28145b.f30137f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f28145b.f30137f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f28145b.f30137f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f28145b.f30137f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
