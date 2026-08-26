package org.telegram.ui.Components;

import android.view.View;

public final class LinkActionView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final LinkActionView f$0;

    public LinkActionView$$ExternalSyntheticLambda1(LinkActionView linkActionView, int i) {
        this.$r8$classId = i;
        this.f$0 = linkActionView;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$1(view);
                break;
            case 1:
                this.f$0.lambda$new$5(view);
                break;
            case 2:
                this.f$0.lambda$new$6(view);
                break;
            default:
                this.f$0.lambda$new$7(view);
                break;
        }
    }
}
