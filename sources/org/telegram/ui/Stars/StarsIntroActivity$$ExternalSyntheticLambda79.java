package org.telegram.ui.Stars;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StarsIntroActivity$$ExternalSyntheticLambda79 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;
    public final Context f$5;
    public final Theme.ResourcesProvider f$6;
    public final boolean f$7;
    public final Object f$8;

    public StarsIntroActivity$$ExternalSyntheticLambda79(StarsReactionsSheet starsReactionsSheet, MessageObject messageObject, ChatActivity chatActivity, int i, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, long j, TLRPC.Chat chat) {
        this.f$0 = starsReactionsSheet;
        this.f$2 = messageObject;
        this.f$3 = chatActivity;
        this.f$1 = i;
        this.f$7 = z;
        this.f$5 = context;
        this.f$6 = resourcesProvider;
        this.f$4 = j;
        this.f$8 = chat;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (!buttonWithCounterView.isLoading()) {
                    int i = this.f$1;
                    StarsController starsController = StarsController.getInstance(i, false);
                    BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$3;
                    TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.f$2;
                    long j = this.f$4;
                    BotForumHelper$$ExternalSyntheticLambda2 botForumHelper$$ExternalSyntheticLambda2 = new BotForumHelper$$ExternalSyntheticLambda2(buttonWithCounterView, starsSubscription, i, bottomSheetArr, j, 11);
                    if (starsController.balance.amount >= starsSubscription.pricing.amount) {
                        botForumHelper$$ExternalSyntheticLambda2.run();
                    } else {
                        new StarsIntroActivity.StarsNeededSheet(this.f$5, this.f$6, starsSubscription.pricing.amount, this.f$7 ? 8 : j < 0 ? 2 : 7, (String) this.f$8, botForumHelper$$ExternalSyntheticLambda2, j).show();
                    }
                    break;
                }
                break;
            default:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) this.f$0;
                if (!starsReactionsSheet.sending) {
                    long value = starsReactionsSheet.slider.getValue();
                    LiveCommentsView$$ExternalSyntheticLambda9 liveCommentsView$$ExternalSyntheticLambda9 = starsReactionsSheet.onSendListener;
                    MessageObject messageObject = (MessageObject) this.f$2;
                    ChatActivity chatActivity = (ChatActivity) this.f$3;
                    if ((liveCommentsView$$ExternalSyntheticLambda9 != null || (messageObject != null && chatActivity != null)) && starsReactionsSheet.iconAnimator == null) {
                        int i2 = this.f$1;
                        if (!MessagesController.getInstance(i2).isFrozen()) {
                            StarsController starsController2 = StarsController.getInstance(i2, false);
                            PhotoViewer$$ExternalSyntheticLambda22 photoViewer$$ExternalSyntheticLambda22 = new PhotoViewer$$ExternalSyntheticLambda22(starsReactionsSheet, value, starsController2, messageObject, chatActivity, 15);
                            if (starsController2.balanceLoaded && starsController2.getBalance().amount < value) {
                                boolean z = this.f$7;
                                Context context = this.f$5;
                                Theme.ResourcesProvider resourcesProvider = this.f$6;
                                long j2 = this.f$4;
                                if (!z) {
                                    TLRPC.Chat chat = (TLRPC.Chat) this.f$8;
                                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, value, 5, chat == null ? "" : chat.title, photoViewer$$ExternalSyntheticLambda22, j2).show();
                                } else {
                                    new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, value, 17, DialogObject.getShortName(i2, j2), photoViewer$$ExternalSyntheticLambda22, j2).show();
                                }
                            } else {
                                photoViewer$$ExternalSyntheticLambda22.run();
                            }
                        } else {
                            AccountFrozenAlert.show(i2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda79(ButtonWithCounterView buttonWithCounterView, int i, TL_stars.StarsSubscription starsSubscription, BottomSheet[] bottomSheetArr, long j, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, String str) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = i;
        this.f$2 = starsSubscription;
        this.f$3 = bottomSheetArr;
        this.f$4 = j;
        this.f$5 = context;
        this.f$6 = resourcesProvider;
        this.f$7 = z;
        this.f$8 = str;
    }
}
