package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;

public final class AutoDeletePopupWrapper$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Context f$1;
    public final int f$2;
    public final Theme.ResourcesProvider f$3;
    public final Object f$4;

    public AutoDeletePopupWrapper$$ExternalSyntheticLambda7(AutoDeletePopupWrapper autoDeletePopupWrapper, Context context, int i, Theme.ResourcesProvider resourcesProvider, AutoDeletePopupWrapper.Callback callback) {
        this.f$0 = autoDeletePopupWrapper;
        this.f$1 = context;
        this.f$2 = i;
        this.f$3 = resourcesProvider;
        this.f$4 = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((AutoDeletePopupWrapper) this.f$0).lambda$new$5(this.f$1, this.f$2, this.f$3, (AutoDeletePopupWrapper.Callback) this.f$4, view);
                break;
            default:
                ((ChatNotificationsPopupWrapper) this.f$0).lambda$new$6(this.f$1, this.f$3, this.f$2, (ChatNotificationsPopupWrapper.Callback) this.f$4, view);
                break;
        }
    }

    public AutoDeletePopupWrapper$$ExternalSyntheticLambda7(ChatNotificationsPopupWrapper chatNotificationsPopupWrapper, Context context, Theme.ResourcesProvider resourcesProvider, int i, ChatNotificationsPopupWrapper.Callback callback) {
        this.f$0 = chatNotificationsPopupWrapper;
        this.f$1 = context;
        this.f$3 = resourcesProvider;
        this.f$2 = i;
        this.f$4 = callback;
    }
}
