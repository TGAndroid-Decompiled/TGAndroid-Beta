package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class lm0 implements View.OnClickListener {
    public final int f25056a;
    public final sm0 f25057b;

    public lm0(sm0 sm0Var, int i10) {
        this.f25056a = i10;
        this.f25057b = sm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25056a) {
            case 0:
                this.f25057b.f27108f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f25057b.f27108f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f25057b.f27108f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f25057b.f27108f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f25057b.f27108f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
