package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class bm0 implements View.OnClickListener {
    public final int f24774a;
    public final im0 f24775b;

    public bm0(im0 im0Var, int i10) {
        this.f24774a = i10;
        this.f24775b = im0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24774a) {
            case 0:
                this.f24775b.f27200f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f24775b.f27200f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f24775b.f27200f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f24775b.f27200f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f24775b.f27200f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
