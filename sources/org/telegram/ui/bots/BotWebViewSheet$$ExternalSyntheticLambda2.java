package org.telegram.ui.bots;

import android.view.WindowManager;
import com.google.android.exoplayer2.RendererCapabilities;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.recorder.GalleryListView;

public final class BotWebViewSheet$$ExternalSyntheticLambda2 implements SimpleFloatPropertyCompat.Setter, SimpleFloatPropertyCompat.Getter, AlertDialog.OnButtonClickListener, GenericProvider, Utilities.Callback2Return {
    public final int $r8$classId;

    public BotWebViewSheet$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override
    public float get(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((BotWebViewSheet) obj).actionBarTransitionProgress;
            case 2:
                return ((LiveStoryPipOverlay) obj).pipY;
            case 8:
                throw RendererCapabilities.CC.m(obj);
            case 11:
                return ((ChatActivityBotWebViewButton) obj).progress;
            case 13:
                return ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).loadProgress;
            default:
                return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                alertDialog.dismiss();
                break;
            case 5:
                alertDialog.dismiss();
                break;
            case 18:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        switch (this.$r8$classId) {
            case 6:
                MediaController.AlbumEntry albumEntry = GalleryListView.draftsAlbum;
                return 0;
            default:
                return Boolean.FALSE;
        }
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
            case 1:
                LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) obj;
                WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
                liveStoryPipOverlay.pipX = f;
                layoutParams.x = (int) f;
                AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, layoutParams);
                return;
            case 3:
                LiveStoryPipOverlay liveStoryPipOverlay2 = (LiveStoryPipOverlay) obj;
                WindowManager.LayoutParams layoutParams2 = liveStoryPipOverlay2.windowLayoutParams;
                liveStoryPipOverlay2.pipY = f;
                layoutParams2.y = (int) f;
                AndroidUtilities.updateViewLayout(liveStoryPipOverlay2.windowManager, liveStoryPipOverlay2.contentView, layoutParams2);
                return;
            case 9:
                throw RendererCapabilities.CC.m(obj);
            case 10:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) obj;
                botWebViewSheet.actionBarTransitionProgress = f;
                botWebViewSheet.windowView.invalidate();
                botWebViewSheet.actionBar.setAlpha(f);
                botWebViewSheet.updateLightStatusBar$2();
                botWebViewSheet.updateDownloadBulletinArrow();
                return;
            case 12:
                ((ChatActivityBotWebViewButton) obj).setProgress(f);
                return;
            case 14:
                ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).setLoadProgress(f);
                return;
            default:
                ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).setSwipeOffsetY(f);
                return;
        }
    }
}
