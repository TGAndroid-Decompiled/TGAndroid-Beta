package org.telegram.p009ui.Components;

import org.telegram.messenger.ChatObject;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;

public interface ChatActivityInterface {

    public final class CC {
        public static void $default$checkAndUpdateAvatar(ChatActivityInterface chatActivityInterface) {
        }

        public static TLRPC$User $default$getCurrentUser(ChatActivityInterface chatActivityInterface) {
            return null;
        }

        public static long $default$getMergeDialogId(ChatActivityInterface chatActivityInterface) {
            return 0L;
        }

        public static int $default$getTopicId(ChatActivityInterface chatActivityInterface) {
            return 0;
        }

        public static boolean $default$openedWithLivestream(ChatActivityInterface chatActivityInterface) {
            return false;
        }

        public static void $default$scrollToMessageId(ChatActivityInterface chatActivityInterface, int i, int i2, boolean z, int i3, boolean z2, int i4) {
        }

        public static boolean $default$shouldShowImport(ChatActivityInterface chatActivityInterface) {
            return false;
        }
    }

    void checkAndUpdateAvatar();

    C1069ActionBar getActionBar();

    ChatAvatarContainer getAvatarContainer();

    SizeNotifierFrameLayout getContentView();

    TLRPC$Chat getCurrentChat();

    TLRPC$User getCurrentUser();

    long getDialogId();

    ChatObject.Call getGroupCall();

    long getMergeDialogId();

    Theme.ResourcesProvider getResourceProvider();

    int getTopicId();

    boolean openedWithLivestream();

    void scrollToMessageId(int i, int i2, boolean z, int i3, boolean z2, int i4);

    boolean shouldShowImport();
}
