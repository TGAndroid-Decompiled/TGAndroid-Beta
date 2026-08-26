package org.telegram.ui;

import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class TopicsFragment$$ExternalSyntheticLambda25 implements Utilities.Callback2Return, AlertDialog.OnButtonClickListener, SimpleFloatPropertyCompat.Getter, SimpleFloatPropertyCompat.Setter, GenericProvider {
    public final int $r8$classId;

    public TopicsFragment$$ExternalSyntheticLambda25(int i) {
        this.$r8$classId = i;
    }

    @Override
    public float get(Object obj) {
        switch (this.$r8$classId) {
            case 3:
                return ((BotWebViewSheet) obj).actionBarTransitionProgress;
            case 4:
            default:
                return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
            case 5:
                return ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).loadProgress;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                alertDialog.dismiss();
                break;
            case 2:
                alertDialog.dismiss();
                break;
            case 10:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        SimpleFloatPropertyCompat simpleFloatPropertyCompat = ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.SWIPE_OFFSET_Y;
        return Boolean.FALSE;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override
    public void set(Object obj, float f) {
        switch (this.$r8$classId) {
            case 4:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) obj;
                botWebViewSheet.actionBarTransitionProgress = f;
                botWebViewSheet.windowView.invalidate();
                botWebViewSheet.actionBar.setAlpha(f);
                botWebViewSheet.updateLightStatusBar$2();
                botWebViewSheet.updateDownloadBulletinArrow();
                break;
            case 5:
            default:
                ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).setSwipeOffsetY(f);
                break;
            case 6:
                ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).setLoadProgress(f);
                break;
        }
    }
}
