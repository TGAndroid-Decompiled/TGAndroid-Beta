package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RLottieImageView;

public final class PhotoViewer$$ExternalSyntheticLambda91 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda91(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$71((Activity) this.f$1, view);
                break;
            case 1:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$174((ItemOptions) this.f$1, view);
                break;
            case 2:
                FragmentUsernameBottomSheet.lambda$open$1((Context) this.f$0, (TL_fragment.TL_collectibleInfo) this.f$1, view);
                break;
            case 3:
                FragmentUsernameBottomSheet.lambda$open$2((OAuthSheet$$ExternalSyntheticLambda9) this.f$0, (BottomSheet) this.f$1, view);
                break;
            case 4:
                ((GroupCallActivity.CallEncryptionCell) this.f$0).lambda$new$0((Context) this.f$1, view);
                break;
            case 5:
                ((IntroActivity) this.f$0).lambda$createView$0((RLottieImageView) this.f$1, view);
                break;
            case 6:
                ((KeepMediaPopupView) this.f$0).lambda$new$2((BaseFragment) this.f$1, view);
                break;
            case 7:
                LaunchActivity.lambda$showLanguageAlertInternal$170((LocaleController.LocaleInfo[]) this.f$0, (LanguageCell[]) this.f$1, view);
                break;
            case 8:
                ((LinkEditActivity) this.f$0).lambda$createView$7((Runnable[]) this.f$1, view);
                break;
            case 9:
                ((LinkEditActivity) this.f$0).lambda$createView$1((Context) this.f$1, view);
                break;
            case 10:
                ((LocationActivity) this.f$0).lambda$createView$11((LocationActivity.LiveLocation) this.f$1, view);
                break;
            case 11:
                ((LocationActivity.MapOverlayView) this.f$0).lambda$addInfoView$1((LocationActivity.VenueLocation) this.f$1, view);
                break;
            case 12:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$new$7((Context) this.f$1, view);
                break;
            case 13:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$new$6((Context) this.f$1, view);
                break;
            case 14:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$new$9((Context) this.f$1, view);
                break;
            case 15:
                ((LoginActivity.PhoneView) this.f$0).lambda$new$1((Context) this.f$1, view);
                break;
            case 16:
                ((PasscodeActivity) this.f$0).lambda$createView$9((AtomicBoolean) this.f$1, view);
                break;
            case 17:
                ((PaymentFormActivity) this.f$0).lambda$createView$23((String) this.f$1, view);
                break;
            case 18:
                ((PhotoViewer) this.f$0).lambda$openAdsMenu$159((ItemOptions) this.f$1, view);
                break;
            case 19:
                ((ItemOptions) this.f$0).openSwipeback((ItemOptions) this.f$1);
                break;
            case 20:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$6((AlertDialog.Builder) this.f$1, view);
                break;
            case 21:
                ((ProfileActivity) this.f$0).lambda$createView$35((TLRPC.Chat) this.f$1, view);
                break;
            case 22:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$66((TL_fragment.TL_collectibleInfo) this.f$1, view);
                break;
            case 23:
                ((ProxySettingsActivity) this.f$0).lambda$createView$4((Context) this.f$1, view);
                break;
            case 24:
                ((SelectStoriesBottomSheet) this.f$0).lambda$new$0((Utilities.Callback) this.f$1, view);
                break;
            case 25:
                ((SessionsActivity) this.f$0).lambda$createView$2((AlertDialog.Builder) this.f$1, view);
                break;
            case 26:
                StakedDiceSheet.lambda$new$3((EditTextBoldCursor) this.f$0, (Long) this.f$1, view);
                break;
            case 27:
                StakedDiceSheet.lambda$new$0((Context) this.f$0, (Theme.ResourcesProvider) this.f$1, view);
                break;
            case 28:
                ((SuggestClearDatabaseBottomSheet) this.f$0).lambda$new$1((BaseFragment) this.f$1, view);
                break;
            default:
                ((ThemeSetUrlActivity) this.f$0).lambda$createView$5((Context) this.f$1, view);
                break;
        }
    }
}
