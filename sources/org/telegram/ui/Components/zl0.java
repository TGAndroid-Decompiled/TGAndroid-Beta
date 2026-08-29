package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class zl0 implements View.OnClickListener {
    public final int f35367a;
    public final fm0 f35368b;

    public zl0(fm0 fm0Var, int i10) {
        this.f35367a = i10;
        this.f35368b = fm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35367a) {
            case 0:
                this.f35368b.f28492f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f35368b.f28492f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f35368b.f28492f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f35368b.f28492f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f35368b.f28492f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
