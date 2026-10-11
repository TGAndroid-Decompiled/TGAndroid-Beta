package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class jn0 implements View.OnClickListener {
    public final int f27710a;
    public final qn0 f27711b;

    public jn0(qn0 qn0Var, int i10) {
        this.f27710a = i10;
        this.f27711b = qn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27710a) {
            case 0:
                this.f27711b.f30195f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27711b.f30195f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27711b.f30195f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27711b.f30195f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27711b.f30195f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
