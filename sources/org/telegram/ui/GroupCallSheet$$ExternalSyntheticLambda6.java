package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class GroupCallSheet$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Context f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;

    public GroupCallSheet$$ExternalSyntheticLambda6(Object obj, Context context, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = context;
        this.f$2 = obj2;
        this.f$3 = i;
        this.f$4 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                Activity activityFindActivity = AndroidUtilities.findActivity((Activity) this.f$1);
                if (activityFindActivity != null) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", ((CheckBox2) this.f$2).checkBoxBase.isChecked).apply();
                    VoIPHelper.joinConference(activityFindActivity, this.f$3, (TLRPC.TL_inputGroupCallSlug) this.f$4, false, null, null);
                    break;
                }
                break;
            default:
                ((ChatNotificationsPopupWrapper) this.f$0).dismiss();
                AlertsCreator.createMuteForPickerDialog(this.f$1, (Theme.ResourcesProvider) this.f$2, new LaunchActivity$$ExternalSyntheticLambda9(this.f$3, (ChatNotificationsPopupWrapper.Callback) this.f$4, 5));
                break;
        }
    }
}
