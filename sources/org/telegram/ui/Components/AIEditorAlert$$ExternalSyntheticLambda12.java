package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class AIEditorAlert$$ExternalSyntheticLambda12 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AIEditorAlert$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        ChatActivityEnterView.AnonymousClass50 anonymousClass50;
        switch (this.$r8$classId) {
            case 0:
                return ((AIEditorAlert) this.f$0).lambda$new$12((Context) this.f$2, (Theme.ResourcesProvider) this.f$1);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.getClass();
                MessageObject messageObject = (MessageObject) this.f$1;
                if (messageObject.isMediaEmpty() || (anonymousClass50 = chatActivityEnterView.messageEditText) == null || TextUtils.isEmpty(anonymousClass50.getTextToUse())) {
                    return false;
                }
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f$2;
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i = messageObject.type;
                if (i != 1 && i != 3 && i != 8) {
                    return false;
                }
                Context context = chatActivityEnterView.getContext();
                Theme.ResourcesProvider resourcesProvider = chatActivityEnterView.resourcesProvider;
                MessageSendPreview messageSendPreview = new MessageSendPreview(context, resourcesProvider);
                messageSendPreview.allowRelayout = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i2 = 0;
                    while (i2 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.editingMessageObjectPreview(groupedMessages.messages.get(i2), i2 == 0));
                        i2++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.editingMessageObjectPreview(messageObject, true));
                }
                messageSendPreview.setMessageObjects(arrayList);
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(chatActivityEnterView.sizeNotifierLayout, resourcesProvider, chatActivityEnterView.doneButton);
                MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.resourcesProvider);
                toggleButton.setState(!chatActivityEnterView.captionAbove, false);
                toggleButton.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(chatActivityEnterView, arrayList, toggleButton, messageSendPreview, 7));
                itemOptionsMakeOptions.addView(toggleButton);
                itemOptionsMakeOptions.setupSelectors();
                messageSendPreview.setItemOptions(itemOptionsMakeOptions);
                messageSendPreview.setSendButton(chatActivityEnterView.doneButton, false, new BotAdView$$ExternalSyntheticLambda2(chatActivityEnterView, groupedMessages, messageObject, messageSendPreview, 8));
                messageSendPreview.show();
                return true;
        }
    }
}
