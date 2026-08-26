package org.telegram.ui.Components;

import android.view.View;
import androidx.core.util.Consumer;
import java.util.ArrayList;

public final class Bulletin$2$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public Bulletin$2$$ExternalSyntheticLambda2(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Bulletin.AnonymousClass2) this.f$0).lambda$onLayoutChange$1(this.f$1, (Float) obj);
                break;
            case 1:
                ChatAttachAlertPhotoLayout.lambda$onMenuItemClick$23((ArrayList) this.f$0, this.f$1, (View) obj);
                break;
            default:
                ChatAttachAlertPhotoLayout.lambda$onMenuItemClick$25((ArrayList) this.f$0, this.f$1, (View) obj);
                break;
        }
    }
}
