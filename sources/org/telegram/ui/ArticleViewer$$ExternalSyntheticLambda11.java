package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.NumberPicker;

public final class ArticleViewer$$ExternalSyntheticLambda11 implements AlertsCreator.ScheduleDatePickerDelegate, AlertDialog.OnButtonClickListener, NumberPicker.OnValueChangeListener, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda11(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                ContentPreviewViewer.AnonymousClass1.lambda$run$9((ContentPreviewViewer.ContentPreviewViewerDelegate) this.f$0, (TLRPC.Document) this.f$1, (TLRPC.BotInlineResult) this.f$2, this.f$3, z, i, i2);
                break;
            case 2:
                ((ContentPreviewViewer.ContentPreviewViewerDelegate) this.f$0).sendSticker((TLRPC.Document) this.f$2, (String) this.f$1, this.f$3, z, i, i2);
                break;
            default:
                ((ChatActivity) this.f$0).lambda$createView$36((TLRPC.TL_document) this.f$2, (String) this.f$1, this.f$3, z, i, i2);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$openWebpageUrl$8((String) this.f$1, (String) this.f$2, (Browser.Progress) this.f$3, alertDialog, i);
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            default:
                ((TopicsFragment) this.f$0).lambda$deleteTopics$14((HashSet) this.f$1, (ArrayList) this.f$2, (Runnable) this.f$3, alertDialog, i);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$214((TLRPC.User) this.f$1, (AtomicBoolean) this.f$2, (TLRPC.TL_attachMenuBot) this.f$3, alertDialog, i);
                break;
            case 6:
                ((LaunchActivity) this.f$0).lambda$handleIntent$27((BaseFragment) this.f$3, (String) this.f$1, (String) this.f$2, alertDialog, i);
                break;
            case 7:
                ((LoginActivity) this.f$0).lambda$tryResetAccount$33((String) this.f$1, (String) this.f$2, (String) this.f$3, alertDialog, i);
                break;
            case 8:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$16((SharedPreferences) this.f$2, (String) this.f$1, (boolean[]) this.f$3, alertDialog, i);
                break;
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        ((GroupCallActivity) this.f$0).lambda$new$47((NumberPicker) this.f$1, (NumberPicker) this.f$2, (NumberPicker) this.f$3, numberPicker, i, i2);
    }

    @Override
    public void run(long j) {
        ((SelectChatUserSheet) this.f$0).lambda$initTransfer$3((TLRPC.User) this.f$1, (TLRPC.InputCheckPasswordSRP) this.f$2, (TwoStepVerificationActivity) this.f$3, j);
    }

    public ArticleViewer$$ExternalSyntheticLambda11(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = str;
        this.f$3 = obj3;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.$r8$classId) {
            case 9:
                SelectAnimatedEmojiDialog.lambda$search$28((HashMap) this.f$0, (HashMap) this.f$1, (ArrayList) this.f$2, (Runnable) this.f$3, arrayList, str);
                break;
            default:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$18((ArrayList) this.f$1, (ArrayList) this.f$2, (Runnable) this.f$3, arrayList, str);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda11(LaunchActivity launchActivity, BaseFragment baseFragment, String str, String str2) {
        this.$r8$classId = 6;
        this.f$0 = launchActivity;
        this.f$3 = baseFragment;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
