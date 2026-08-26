package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;

public final class ThemeActivity$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ThemeActivity$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ThemeActivity) this.f$0).lambda$createView$6((AtomicReference) this.f$1, (Boolean) obj);
                break;
            case 1:
                ((SecretVoicePlayer) this.f$0).lambda$prepareBlur$2((View) this.f$1, (Bitmap) obj);
                break;
            default:
                ((ThemeActivity) this.f$0).lambda$createView$9((Runnable) this.f$1, (Boolean) obj);
                break;
        }
    }
}
