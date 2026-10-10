package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class in0 implements View.OnClickListener {
    public final int f27415a;
    public final pn0 f27416b;

    public in0(pn0 pn0Var, int i10) {
        this.f27415a = i10;
        this.f27416b = pn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27415a) {
            case 0:
                this.f27416b.f29805f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27416b.f29805f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27416b.f29805f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27416b.f29805f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27416b.f29805f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
