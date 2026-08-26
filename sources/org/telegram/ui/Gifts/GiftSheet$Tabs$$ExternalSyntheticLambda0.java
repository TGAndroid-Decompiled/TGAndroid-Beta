package org.telegram.ui.Gifts;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class GiftSheet$Tabs$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final int f$1;

    public GiftSheet$Tabs$$ExternalSyntheticLambda0(int i, int i2, Utilities.Callback callback) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$0;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f$1));
                }
                break;
            default:
                this.f$0.run(Integer.valueOf(this.f$1));
                break;
        }
    }
}
