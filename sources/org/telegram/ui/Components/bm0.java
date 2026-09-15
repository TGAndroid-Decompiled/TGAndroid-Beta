package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class bm0 implements View.OnClickListener {
    public final int f22826a;
    public final im0 f22827b;

    public bm0(im0 im0Var, int i10) {
        this.f22826a = i10;
        this.f22827b = im0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22826a) {
            case 0:
                this.f22827b.f25062f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f22827b.f25062f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f22827b.f25062f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f22827b.f25062f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f22827b.f25062f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
