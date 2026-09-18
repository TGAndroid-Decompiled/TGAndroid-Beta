package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class cm0 implements View.OnClickListener {
    public final int f23089a;
    public final jm0 f23090b;

    public cm0(jm0 jm0Var, int i10) {
        this.f23089a = i10;
        this.f23090b = jm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23089a) {
            case 0:
                this.f23090b.f25338f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f23090b.f25338f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f23090b.f25338f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f23090b.f25338f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f23090b.f25338f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
