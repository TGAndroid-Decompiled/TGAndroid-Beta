package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class bm0 implements View.OnClickListener {
    public final int f22822a;
    public final im0 f22823b;

    public bm0(im0 im0Var, int i10) {
        this.f22822a = i10;
        this.f22823b = im0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22822a) {
            case 0:
                this.f22823b.f25068f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f22823b.f25068f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f22823b.f25068f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f22823b.f25068f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f22823b.f25068f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
