package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class jm0 implements View.OnClickListener {
    public final int f26008a;
    public final pm0 f26009b;

    public jm0(pm0 pm0Var, int i10) {
        this.f26008a = i10;
        this.f26009b = pm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26008a) {
            case 0:
                this.f26009b.f27942f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f26009b.f27942f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f26009b.f27942f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f26009b.f27942f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f26009b.f27942f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
