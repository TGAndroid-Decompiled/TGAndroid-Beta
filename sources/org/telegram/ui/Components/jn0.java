package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class jn0 implements View.OnClickListener {
    public final int f29700a;
    public final qn0 f29701b;

    public jn0(qn0 qn0Var, int i10) {
        this.f29700a = i10;
        this.f29701b = qn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29700a) {
            case 0:
                this.f29701b.f31955f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f29701b.f31955f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f29701b.f31955f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f29701b.f31955f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f29701b.f31955f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
