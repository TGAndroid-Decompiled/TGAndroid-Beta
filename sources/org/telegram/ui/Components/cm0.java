package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class cm0 implements View.OnClickListener {
    public final int f23073a;
    public final jm0 f23074b;

    public cm0(jm0 jm0Var, int i10) {
        this.f23073a = i10;
        this.f23074b = jm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23073a) {
            case 0:
                this.f23074b.f25358f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f23074b.f25358f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f23074b.f25358f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f23074b.f25358f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f23074b.f25358f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
