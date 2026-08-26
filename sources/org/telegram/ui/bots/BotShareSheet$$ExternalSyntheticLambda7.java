package org.telegram.ui.bots;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;

public final class BotShareSheet$$ExternalSyntheticLambda7 implements Utilities.Callback2 {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public BotShareSheet$$ExternalSyntheticLambda7(int i, BaseFragment baseFragment, Browser.Progress progress, AlertDialog alertDialog) {
        this.f$3 = i;
        this.f$0 = baseFragment;
        this.f$1 = progress;
        this.f$2 = alertDialog;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((int[]) this.f$0)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                boolean z = messageMedia instanceof TLRPC.TL_messageMediaEmpty;
                final BotShareSheet$$ExternalSyntheticLambda2 botShareSheet$$ExternalSyntheticLambda2 = (BotShareSheet$$ExternalSyntheticLambda2) this.f$1;
                if (!z) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
                            botShareSheet$$ExternalSyntheticLambda2.run(null);
                        } else if (!(webPage instanceof TLRPC.TL_webPagePending)) {
                            botShareSheet$$ExternalSyntheticLambda2.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                        } else {
                            final long j = webPage.id;
                            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f$2;
                            final int i = this.f$3;
                            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
                                @Override
                                public final void didReceivedNotification(int i2, int i3, Object... objArr) {
                                    LongSparseArray longSparseArray;
                                    int i4 = NotificationCenter.didReceivedWebpagesInUpdates;
                                    if (i2 != i4 || (longSparseArray = (LongSparseArray) objArr[0]) == null) {
                                        return;
                                    }
                                    long j2 = j;
                                    if (longSparseArray.containsKey(j2)) {
                                        TLRPC.WebPage webPage2 = (TLRPC.WebPage) longSparseArray.get(j2);
                                        NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr2 = notificationCenterDelegateArr;
                                        if (notificationCenterDelegateArr2[0] != null) {
                                            NotificationCenter.getInstance(i).addObserver(notificationCenterDelegateArr2[0], i4);
                                            notificationCenterDelegateArr2[0] = null;
                                        }
                                        if (!(webPage2 instanceof TLRPC.TL_webPage)) {
                                            webPage2 = null;
                                        }
                                        botShareSheet$$ExternalSyntheticLambda2.run(webPage2);
                                    }
                                }
                            };
                            notificationCenterDelegateArr[0] = notificationCenterDelegate;
                            NotificationCenter.getInstance(i).addObserver(notificationCenterDelegate, NotificationCenter.didReceivedWebpagesInUpdates);
                        }
                    }
                }
                botShareSheet$$ExternalSyntheticLambda2.run(null);
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    MessagesController.getInstance(this.f$3).processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(19, (BaseFragment) this.f$0, tL_error, (Browser.Progress) this.f$1, (AlertDialog) this.f$2));
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$0;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    alertDialogArr[0] = null;
                }
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (tL_error2 != null) {
                    BulletinFactory.of(baseFragment).showForError(tL_error2);
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.CommunityNoChatsToAdd, BulletinFactory.of(baseFragment), R.raw.info);
                    } else if (!arrayList.isEmpty()) {
                        baseFragment.showDialog(new CommunitySheet(baseFragment, 0L, arrayList, new CommunityUtils$$ExternalSyntheticLambda2(baseFragment, (TLRPC.Chat) this.f$2, this.f$3)));
                    } else {
                        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.info, "").show();
                    }
                }
                break;
        }
    }

    public BotShareSheet$$ExternalSyntheticLambda7(int[] iArr, BotShareSheet$$ExternalSyntheticLambda2 botShareSheet$$ExternalSyntheticLambda2, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i) {
        this.f$0 = iArr;
        this.f$1 = botShareSheet$$ExternalSyntheticLambda2;
        this.f$2 = notificationCenterDelegateArr;
        this.f$3 = i;
    }

    public BotShareSheet$$ExternalSyntheticLambda7(AlertDialog[] alertDialogArr, BaseFragment baseFragment, int i, TLRPC.Chat chat) {
        this.f$0 = alertDialogArr;
        this.f$1 = baseFragment;
        this.f$3 = i;
        this.f$2 = chat;
    }
}
