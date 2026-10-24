package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class cn0 implements View.OnClickListener {
    public final int f25354a;
    public final jn0 f25355b;

    public cn0(jn0 jn0Var, int i10) {
        this.f25354a = i10;
        this.f25355b = jn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25354a) {
            case 0:
                this.f25355b.f27737f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f25355b.f27737f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f25355b.f27737f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f25355b.f27737f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f25355b.f27737f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
