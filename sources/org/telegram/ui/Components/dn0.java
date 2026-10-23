package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class dn0 implements View.OnClickListener {
    public final int f25676a;
    public final kn0 f25677b;

    public dn0(kn0 kn0Var, int i10) {
        this.f25676a = i10;
        this.f25677b = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25676a) {
            case 0:
                this.f25677b.f28076f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f25677b.f28076f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f25677b.f28076f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f25677b.f28076f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f25677b.f28076f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
