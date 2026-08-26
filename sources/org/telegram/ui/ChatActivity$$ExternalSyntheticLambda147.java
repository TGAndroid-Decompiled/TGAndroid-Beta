package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatAttachAlert;

public final class ChatActivity$$ExternalSyntheticLambda147 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ChatActivity$$ExternalSyntheticLambda147(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.AnonymousClass9 anonymousClass9 = (ArticleViewer.AnonymousClass9) this.f$3;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f$1;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) TLKeyboardHelper.getType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (chatActivity.getParentActivity() == null) {
                    return false;
                }
                if ((chatActivity.bottomChannelButtonsLayout.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !TLKeyboardHelper.isType(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                chatActivity.openClickableLink(null, tL_inlineButtonTypeUrl.url, true, null, (MessageObject) this.f$2);
                try {
                    anonymousClass9.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                }
                return true;
            default:
                return ((ChatAttachAlert) this.f$0).lambda$new$37((Context) this.f$1, (Theme.ResourcesProvider) this.f$2, (BaseFragment) this.f$3, view);
        }
    }
}
