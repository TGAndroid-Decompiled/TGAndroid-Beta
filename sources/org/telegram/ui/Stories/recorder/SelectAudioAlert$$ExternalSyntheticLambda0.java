package org.telegram.ui.Stories.recorder;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public final class SelectAudioAlert$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final SelectAudioAlert f$0;

    public SelectAudioAlert$$ExternalSyntheticLambda0(SelectAudioAlert selectAudioAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAudioAlert;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        MessagesController.SavedMusicList savedMusicList;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                SelectAudioAlert selectAudioAlert = this.f$0;
                universalAdapter.itemsOffset = 1;
                int iDp = AndroidUtilities.dp(64.0f);
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(64.0f)));
                if (selectAudioAlert.local || selectAudioAlert.withoutSavedMusic) {
                    iDp += selectAudioAlert.addSection(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), selectAudioAlert.localAudio, false, false, -1);
                }
                if (!selectAudioAlert.local) {
                    if (TextUtils.isEmpty(selectAudioAlert.query) && !selectAudioAlert.withoutSavedMusic) {
                        universalAdapter.whiteSectionStart();
                        arrayList.add(UItem.asButton(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles)).accent());
                        universalAdapter.whiteSectionEnd();
                        iDp += AndroidUtilities.dp(50.0f);
                    }
                    if (!selectAudioAlert.withoutSavedMusic && (savedMusicList = selectAudioAlert.savedMusicList) != null) {
                        iDp += selectAudioAlert.addSection(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    iDp = iDp + selectAudioAlert.addSection(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), selectAudioAlert.sharedAudio, selectAudioAlert.willLoadSharedAudio || selectAudioAlert.loadingSharedAudio, selectAudioAlert.sharedAudioHasMore, 3) + selectAudioAlert.addSection(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), selectAudioAlert.globalAudio, selectAudioAlert.willLoadGlobalAudio || selectAudioAlert.loadingGlobalAudio, selectAudioAlert.globalAudioHasMore, 4);
                }
                if (arrayList.size() <= ((selectAudioAlert.local || !TextUtils.isEmpty(selectAudioAlert.query) || selectAudioAlert.withoutSavedMusic) ? 1 : 2)) {
                    if (TextUtils.isEmpty(selectAudioAlert.query)) {
                        arrayList.add(ChatAttachAlertAudioLayout.EmptyView.Factory.as(LocaleController.getString(R.string.NoAudioFound), LocaleController.getString(R.string.NoAudioFilesInfo)));
                    } else {
                        arrayList.add(ChatAttachAlertAudioLayout.EmptyView.Factory.as(LocaleController.getString(R.string.NoAudioFound), AndroidUtilities.replaceTags(LocaleController.formatString(selectAudioAlert.query.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, selectAudioAlert.query))));
                    }
                }
                arrayList.add(UItem.asShadow(null));
                arrayList.add(UItem.asSpace(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + iDp)) - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight()))));
                break;
            default:
                this.f$0.lambda$loadGlobalAudio$5((TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
