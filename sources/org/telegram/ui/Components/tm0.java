package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class tm0 implements View.OnClickListener {
    public final int f31190a;
    public final an0 f31191b;

    public tm0(an0 an0Var, int i10) {
        this.f31190a = i10;
        this.f31191b = an0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31190a) {
            case 0:
                this.f31191b.f24658f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f31191b.f24658f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f31191b.f24658f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f31191b.f24658f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f31191b.f24658f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
