package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class in0 implements View.OnClickListener {
    public final int f29322a;
    public final pn0 f29323b;

    public in0(pn0 pn0Var, int i10) {
        this.f29322a = i10;
        this.f29323b = pn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29322a) {
            case 0:
                this.f29323b.f31619f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f29323b.f31619f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f29323b.f31619f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f29323b.f31619f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f29323b.f31619f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
