package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class AlertsCreator$$ExternalSyntheticLambda134 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public AlertsCreator$$ExternalSyntheticLambda134(KeyEvent.Callback callback, int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = i;
        this.f$2 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createBirthdayPickerDialog$151((NumberPicker) this.f$0, this.f$1, (AlertsCreator$$ExternalSyntheticLambda127) this.f$2, view);
                break;
            case 1:
                ((SharedMediaLayout.ChannelRecommendationsAdapter) this.f$0).lambda$openPreview$3((TLRPC.Chat) this.f$2, this.f$1, view);
                break;
            case 2:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$fillItems$11(this.f$1, (UniversalAdapter) this.f$2, view);
                break;
            case 3:
                ((HorizontalRoundTabsLayout) this.f$0).lambda$setTabs$2(this.f$1, (MessagesStorage.IntCallback) this.f$2, view);
                break;
            case 4:
                ((PhonebookShareAlert) this.f$0).lambda$new$2(this.f$1, (View) this.f$2, view);
                break;
            default:
                TranslateButton.lambda$onMenuClick$6((TranslateButton$$ExternalSyntheticLambda7) this.f$0, (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$2, this.f$1, view);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda134(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
