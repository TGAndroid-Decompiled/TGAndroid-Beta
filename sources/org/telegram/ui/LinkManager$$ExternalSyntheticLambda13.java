package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stories.recorder.ScannedLinkPreview;
import org.telegram.ui.Stories.recorder.ScannedLinkPreview$$ExternalSyntheticLambda0;

public final class LinkManager$$ExternalSyntheticLambda13 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        Utilities.Callback callback;
        switch (this.$r8$classId) {
            case 0:
                Long l = (Long) obj;
                LinkManager linkManager = (LinkManager) this.f$0;
                if (l == null) {
                    linkManager.getClass();
                    user = null;
                } else {
                    user = MessagesController.getInstance(linkManager.currentAccount).getUser(l);
                }
                ((TLRPC.User[]) this.f$1)[0] = user;
                if (user != null) {
                    ((LinkManager$$ExternalSyntheticLambda12) this.f$2).run();
                } else {
                    linkManager.done();
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NoUsernameFound, LinkManager.getBulletinFactory(), null);
                }
                break;
            case 1:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$211((TLRPC.TL_attachMenuBot) this.f$2, (TLRPC.User) this.f$1);
                break;
            case 2:
                ((LimitReachedBottomSheet) this.f$0).lambda$boostChannel$16((Loadable) this.f$1, (TL_stories.TL_premium_myBoosts) this.f$2, (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 3:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$170((TLRPC.TL_attachMenuBot) this.f$1, (LaunchActivity) this.f$2);
                break;
            case 4:
                Long l2 = (Long) obj;
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                Browser.Progress progress = (Browser.Progress) this.f$1;
                if (progress != null) {
                    launchActivity.getClass();
                    progress.end();
                }
                if (MessagesController.getInstance(launchActivity.currentAccount).getUserOrChat(l2.longValue()) != null) {
                    new GiftSheet(launchActivity, ((int[]) this.f$2)[0], l2.longValue(), null, null).show();
                    break;
                } else {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    if (lastFragment != null && (lastFragment instanceof ChatActivity)) {
                        ((ChatActivity) lastFragment).shakeContent();
                        break;
                    }
                }
                break;
            case 5:
                Long l3 = (Long) obj;
                ScannedLinkPreview$$ExternalSyntheticLambda0 scannedLinkPreview$$ExternalSyntheticLambda0 = (ScannedLinkPreview$$ExternalSyntheticLambda0) this.f$0;
                if (l3 != null) {
                    TLObject userOrChat = ((MessagesController) this.f$1).getUserOrChat(l3.longValue());
                    boolean z = userOrChat instanceof TLRPC.User;
                    String str = (String) this.f$2;
                    if (z) {
                        TLRPC.User user2 = (TLRPC.User) userOrChat;
                        scannedLinkPreview$$ExternalSyntheticLambda0.run(user2 != null ? new ScannedLinkPreview.ResolvedLink.AnonymousClass1(str, user2) : null);
                    } else if (userOrChat instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) userOrChat;
                        scannedLinkPreview$$ExternalSyntheticLambda0.run(chat != null ? new ScannedLinkPreview.ResolvedLink.AnonymousClass2(str, chat) : null);
                    }
                } else {
                    scannedLinkPreview$$ExternalSyntheticLambda0.run(null);
                }
                break;
            default:
                ((AlertDialog) this.f$0).dismiss();
                if (((Boolean) obj).booleanValue() && (callback = (Utilities.Callback) this.f$1) != null) {
                    callback.run((TLRPC.InputPeer) this.f$2);
                    break;
                }
                break;
        }
    }
}
