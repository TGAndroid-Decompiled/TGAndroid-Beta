package org.telegram.ui.Stories.recorder;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
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
                selectAudioAlert.getClass();
                universalAdapter.itemsOffset = 1;
                int iDp = AndroidUtilities.dp(64.0f);
                int iDp2 = AndroidUtilities.dp(64.0f);
                UItem uItem = new UItem(28);
                uItem.intValue = iDp2;
                arrayList.add(uItem);
                if (selectAudioAlert.local || selectAudioAlert.withoutSavedMusic) {
                    iDp += selectAudioAlert.addSection(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), selectAudioAlert.localAudio, false, false, -1);
                }
                if (!selectAudioAlert.local) {
                    if (TextUtils.isEmpty(selectAudioAlert.query) && !selectAudioAlert.withoutSavedMusic) {
                        universalAdapter.whiteSectionStart();
                        UItem uItemAsButton = UItem.asButton(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        uItemAsButton.accent = true;
                        arrayList.add(uItemAsButton);
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
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i = ChatAttachAlertAudioLayout.EmptyView.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(ChatAttachAlertAudioLayout.EmptyView.Factory.class);
                        uItemOfFactory.text = string;
                        uItemOfFactory.subtext = string2;
                        arrayList.add(uItemOfFactory);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(selectAudioAlert.query.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, selectAudioAlert.query));
                        int i2 = ChatAttachAlertAudioLayout.EmptyView.Factory.$r8$clinit;
                        UItem uItemOfFactory2 = UItem.ofFactory(ChatAttachAlertAudioLayout.EmptyView.Factory.class);
                        uItemOfFactory2.text = string3;
                        uItemOfFactory2.subtext = spannableStringBuilderReplaceTags;
                        arrayList.add(uItemOfFactory2);
                    }
                }
                UItem uItem2 = new UItem(7);
                uItem2.text = null;
                arrayList.add(uItem2);
                int iM = MessageObject$$ExternalSyntheticOutline0.m(((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + iDp)) - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight(), 24.0f, 0);
                UItem uItem3 = new UItem(28);
                uItem3.intValue = iM;
                arrayList.add(uItem3);
                break;
            default:
                this.f$0.lambda$loadGlobalAudio$5((TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
