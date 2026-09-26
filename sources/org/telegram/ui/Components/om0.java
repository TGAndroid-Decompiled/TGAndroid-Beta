package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class om0 implements View.OnClickListener {
    public final int f27058a;
    public final vm0 f27059b;

    public om0(vm0 vm0Var, int i10) {
        this.f27058a = i10;
        this.f27059b = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27058a) {
            case 0:
                this.f27059b.f29132f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27059b.f29132f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27059b.f29132f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27059b.f29132f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27059b.f29132f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
