package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class pm0 implements View.OnClickListener {
    public final int f27391a;
    public final wm0 f27392b;

    public pm0(wm0 wm0Var, int i10) {
        this.f27391a = i10;
        this.f27392b = wm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27391a) {
            case 0:
                this.f27392b.f30027f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27392b.f30027f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27392b.f30027f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27392b.f30027f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27392b.f30027f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
