package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class cm0 implements View.OnClickListener {
    public final int f23086a;
    public final jm0 f23087b;

    public cm0(jm0 jm0Var, int i10) {
        this.f23086a = i10;
        this.f23087b = jm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23086a) {
            case 0:
                this.f23087b.f25335f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f23087b.f25335f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f23087b.f25335f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f23087b.f25335f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f23087b.f25335f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
