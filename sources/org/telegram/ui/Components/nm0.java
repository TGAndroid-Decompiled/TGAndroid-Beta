package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class nm0 implements View.OnClickListener {
    public final int f26708a;
    public final um0 f26709b;

    public nm0(um0 um0Var, int i10) {
        this.f26708a = i10;
        this.f26709b = um0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26708a) {
            case 0:
                this.f26709b.f28713f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f26709b.f28713f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f26709b.f28713f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f26709b.f28713f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f26709b.f28713f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
