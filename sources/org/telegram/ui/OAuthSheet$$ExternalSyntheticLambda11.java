package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.CheckBox2;

public final class OAuthSheet$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public OAuthSheet$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$2((TextCheckCell) this.f$0, view);
                break;
            case 1:
                ((AutoDeleteMessagesActivity) this.f$0).lambda$updateItems$2(view);
                break;
            case 2:
                ((CacheControlActivity) this.f$0).lambda$createView$17(view);
                break;
            case 3:
                ((TodoItemMenu$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            case 4:
                ((ChannelColorActivity) this.f$0).lambda$createView$5(view);
                break;
            case 5:
                DataAutoDownloadActivity.lambda$createView$1((TextCheckCell[]) this.f$0, view);
                break;
            case 6:
                DataAutoDownloadActivity.lambda$createView$2((BottomSheet.Builder) this.f$0, view);
                break;
            case 7:
                ((DebugRecordingCanvasReplayFragment) this.f$0).lambda$createView$0(view);
                break;
            case 8:
                OKLCH.m(3, (BaseFragment) this.f$0);
                break;
            case 9:
                ((DialogCacheBottomSheet) this.f$0).lambda$createButton$3(view);
                break;
            case 10:
                DialogsActivity.lambda$showChatPreview$95((ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$0, view);
                break;
            case 11:
                DialogsActivity.lambda$updateDialogsHint$63((String) this.f$0, view);
                break;
            case 12:
                ((FilterCreateActivity.FilterInvitesBottomSheet) this.f$0).lambda$new$2(view);
                break;
            case 13:
                ((FilterCreateActivity.HintInnerCell) this.f$0).lambda$new$0(view);
                break;
            case 14:
                ((FiltersSetupActivity.FilterCell) this.f$0).lambda$new$1(view);
                break;
            case 15:
                ((FiltersSetupActivity.HintInnerCell) this.f$0).lambda$new$0(view);
                break;
            case 16:
                GroupCallSheet.lambda$show$5((CheckBox2) this.f$0, view);
                break;
            case 17:
                ((GroupCreateActivity.GroupCreateAdapter) this.f$0).lambda$onBindViewHolder$1(view);
                break;
            case 18:
                ((InviteContactsActivity) this.f$0).lambda$createView$1(view);
                break;
            case 19:
                ((LaunchActivity) this.f$0).lambda$showLanguageAlertInternal$171(view);
                break;
            case 20:
                ((LoginActivity.LoginActivityRecoverView) this.f$0).lambda$new$4(view);
                break;
            case 21:
                ((LoginActivity.LoginActivityResetWaitView) this.f$0).lambda$new$3(view);
                break;
            case 22:
                ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$new$3(view);
                break;
            case 23:
                ((MessageStatisticActivity) this.f$0).lambda$createView$3(view);
                break;
            case 24:
                PasscodeActivity.lambda$createView$7((Context) this.f$0, view);
                break;
            case 25:
                ((PasscodeActivity) this.f$0).lambda$createView$12(view);
                break;
            case 26:
                ((PasskeysActivity) this.f$0).openMenu(view);
                break;
            case 27:
                ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$new$0(view);
                break;
            case 28:
                ((PhotoAlbumPickerActivity) this.f$0).lambda$createView$3(view);
                break;
            default:
                ((PhotoPickerActivity) this.f$0).lambda$createView$5(view);
                break;
        }
    }
}
