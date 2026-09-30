package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class qm0 implements View.OnClickListener {
    public final int f27695a;
    public final xm0 f27696b;

    public qm0(xm0 xm0Var, int i10) {
        this.f27695a = i10;
        this.f27696b = xm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27695a) {
            case 0:
                this.f27696b.f30363f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27696b.f30363f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27696b.f30363f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27696b.f30363f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27696b.f30363f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
