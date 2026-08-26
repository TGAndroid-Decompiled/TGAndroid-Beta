package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RecyclerListView;

public final class TodoItemMenu$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, CountrySelectActivity.CountrySelectActivityDelegate, FileLoader.FileResolver, MediaDataController.KeywordResultCallback, PollCreateActivity.PollCreateActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public TodoItemMenu$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        ((PassportActivity) this.f$0).lambda$createIdentityInterface$45((View) this.f$1, country);
    }

    @Override
    public File getFile() {
        switch (this.$r8$classId) {
            case 8:
                return ((PhotoViewer) this.f$0).lambda$checkProgress$138((TLObject) this.f$1);
            default:
                return ((PhotoViewer) this.f$0).lambda$checkProgress$139((TLRPC.Message) this.f$1);
        }
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$new$7((Context) this.f$1, alertDialog, i);
                break;
            case 2:
            case 6:
            case 8:
            case 9:
            case 13:
            case 17:
            default:
                WebAppDisclaimerAlert.lambda$show$1((Consumer) this.f$0, (boolean[]) this.f$1, alertDialog, i);
                break;
            case 3:
                ((PassportActivity) this.f$0).lambda$createDocumentDeleteAlert$38((boolean[]) this.f$1, alertDialog, i);
                break;
            case 4:
                ((PassportActivity) this.f$0).lambda$createPasswordInterface$8((TLRPC.TL_auth_passwordRecovery) this.f$1, alertDialog, i);
                break;
            case 5:
                ((PassportActivity) this.f$0).lambda$createIdentityInterface$48((EditTextBoldCursor) this.f$1, alertDialog, i);
                break;
            case 7:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$45((String) this.f$1, alertDialog, i);
                break;
            case 10:
                ((PrivacyControlActivity) this.f$0).lambda$processDone$26((SharedPreferences) this.f$1, alertDialog, i);
                break;
            case 11:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$13((TextCheckCell) this.f$1, alertDialog, i);
                break;
            case 12:
                ((ProfileActivity) this.f$0).lambda$createView$23((CheckBoxCell[]) this.f$1, alertDialog, i);
                break;
            case 14:
                ((SelectChatUserSheet) this.f$0).lambda$initTransfer$5((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 15:
                ((SuggestClearDatabaseBottomSheet) this.f$0).lambda$new$0((BaseFragment) this.f$1, alertDialog, i);
                break;
            case 16:
                ((ThemeActivity) this.f$0).lambda$createView$10((ThemeActivity$$ExternalSyntheticLambda9) this.f$1, alertDialog, i);
                break;
            case 18:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$47((byte[]) this.f$1, alertDialog, i);
                break;
            case 19:
                ((VoIPFragment) this.f$0).lambda$updateViewState$29((boolean[]) this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 2:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$17((Context) this.f$1, view, i, f, f2);
                break;
            default:
                ((ThemeActivity) this.f$0).lambda$createView$13((Context) this.f$1, view, i, f, f2);
                break;
        }
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        SelectAnimatedEmojiDialog.lambda$search$15((LinkedHashSet) this.f$0, (Runnable) this.f$1, arrayList, str);
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia, ArrayList arrayList, boolean z, int i) {
        ((TodoItemMenu) this.f$0).lambda$setCell$6((ChatActivity) this.f$1, messageMedia, arrayList, z, i);
    }
}
