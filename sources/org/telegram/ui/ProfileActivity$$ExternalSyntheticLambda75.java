package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda75 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;

    public ProfileActivity$$ExternalSyntheticLambda75(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$79((URLSpan) obj);
            case 1:
                return ((GradientHeaderActivity) this.f$0).lambda$createView$0((View) obj);
            default:
                return ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$8((TLRPC.TL_error) obj);
        }
    }
}
