package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class ProfileActivity$$ExternalSyntheticLambda106 implements TwoStepVerificationActivity.TwoStepVerificationActivityDelegate, AlertsCreator.ScheduleDatePickerDelegate, LanguageDetector.StringCallback {
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final Object f$5;

    public ProfileActivity$$ExternalSyntheticLambda106(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TL_keyboard.KeyboardButtonProto keyboardButtonProto, ChatActivity chatActivity, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$4 = z;
        this.f$1 = messageObject;
        this.f$2 = keyboardButtonProto;
        this.f$3 = twoStepVerificationActivity;
        this.f$5 = chatActivity;
    }

    @Override
    public void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f$3;
        ((SendMessagesHelper) this.f$0).lambda$sendCallback$40(this.f$4, (MessageObject) this.f$1, (TL_keyboard.KeyboardButtonProto) this.f$2, twoStepVerificationActivity, (ChatActivity) this.f$5, tL_inputCheckPasswordSRP);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ((ChatActivityEnterView) this.f$0).onStickerSelected((TLRPC.Document) this.f$1, (String) this.f$3, this.f$2, (MessageObject.SendAnimationData) this.f$5, this.f$4, z, i, i2);
    }

    @Override
    public void run(String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = (ProfileActivity) this.f$0;
        profileActivity.getClass();
        ((String[]) this.f$1)[0] = str;
        ((boolean[]) this.f$2)[0] = str != null && (!str.equals((String) this.f$3) || str.equals("und")) && ((this.f$4 && !RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str)) || ((chat = profileActivity.currentChat) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str) || "ru".equals(str)))));
        ((ArticleViewer$$ExternalSyntheticLambda70) this.f$5).run();
    }

    public ProfileActivity$$ExternalSyntheticLambda106(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = document;
        this.f$3 = str;
        this.f$2 = obj;
        this.f$5 = sendAnimationData;
        this.f$4 = z;
    }

    public ProfileActivity$$ExternalSyntheticLambda106(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z, ArticleViewer$$ExternalSyntheticLambda70 articleViewer$$ExternalSyntheticLambda70) {
        this.f$0 = profileActivity;
        this.f$1 = strArr;
        this.f$2 = zArr;
        this.f$3 = str;
        this.f$4 = z;
        this.f$5 = articleViewer$$ExternalSyntheticLambda70;
    }
}
