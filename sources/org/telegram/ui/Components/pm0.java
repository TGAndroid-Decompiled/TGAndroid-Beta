package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class pm0 implements View.OnClickListener {
    public final int f27389a;
    public final wm0 f27390b;

    public pm0(wm0 wm0Var, int i10) {
        this.f27389a = i10;
        this.f27390b = wm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27389a) {
            case 0:
                this.f27390b.f30035f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27390b.f30035f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27390b.f30035f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27390b.f30035f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27390b.f30035f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
