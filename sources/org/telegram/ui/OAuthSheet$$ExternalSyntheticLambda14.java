package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticLambda12;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.ReactionTabHolderView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda14 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;

    public OAuthSheet$$ExternalSyntheticLambda14(int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, LinearLayout linearLayout, long[] jArr, GiftSheet$$ExternalSyntheticLambda15 giftSheet$$ExternalSyntheticLambda15) {
        this.$r8$classId = 5;
        this.f$5 = i;
        this.f$2 = bottomSheet;
        this.f$0 = resourcesProvider;
        this.f$1 = linearLayout;
        this.f$3 = jArr;
        this.f$4 = giftSheet$$ExternalSyntheticLambda15;
    }

    @Override
    public final void onClick(View view) {
        long j;
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$8((TLRPC.TL_messages_requestUrlAuth) this.f$0, (boolean[]) this.f$1, (BottomSheet) this.f$2, (ButtonWithCounterView) this.f$3, (BotWebViewContainer) this.f$4, this.f$5, view);
                break;
            case 1:
                ChatActivity.lambda$createMenu$257((ViewPager) this.f$0, this.f$5, (LinearLayout) this.f$1, (AtomicBoolean) this.f$2, (HorizontalScrollView) this.f$3, (ReactionTabHolderView) this.f$4, view);
                break;
            case 2:
                AlertsCreator.lambda$createBirthdayPickerDialog$152((NumberPicker) this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, this.f$5, (BottomSheet.Builder) this.f$3, (Utilities.Callback) this.f$4, view);
                break;
            case 3:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$6((Context) this.f$1, (Theme.ResourcesProvider) this.f$2, (ButtonWithCounterView) this.f$3, (TL_phone.getGroupCallStreamRtmpUrl) this.f$4, this.f$5, view);
                break;
            case 4:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$3;
                if (!buttonWithCounterView.isLoading()) {
                    buttonWithCounterView.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) this.f$0).id;
                    int i = this.f$5;
                    ConnectionsManager.getInstance(i).sendRequest(tL_changeStarsSubscription, new ChatObject$Call$$ExternalSyntheticLambda12(buttonWithCounterView, (BottomSheet[]) this.f$1, i, (TLObject) this.f$2, (String) this.f$4, 5));
                    break;
                }
                break;
            default:
                int i2 = this.f$5;
                BotStarsController botStarsController = BotStarsController.getInstance(i2);
                botStarsController.loadAdminedBots();
                botStarsController.loadAdminedChannels();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = botStarsController.adminedBots;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = botStarsController.adminedChannels;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i2).getCurrentUser());
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((BottomSheet) this.f$2).getContainerView(), (Theme.ResourcesProvider) this.f$0, (LinearLayout) this.f$1);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j = -chat.id;
                        }
                    }
                    long j2 = j;
                    long[] jArr = (long[]) this.f$3;
                    itemOptionsMakeOptions.addChat(tLObject, j2 == jArr[0], new GiftSheet$$ExternalSyntheticLambda17(jArr, j2, (GiftSheet$$ExternalSyntheticLambda15) this.f$4, 17));
                }
                itemOptionsMakeOptions.setDrawScrim(false).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(24.0f), 0.0f).show();
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda14(ViewPager viewPager, int i, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ReactionTabHolderView reactionTabHolderView) {
        this.$r8$classId = 1;
        this.f$0 = viewPager;
        this.f$5 = i;
        this.f$1 = linearLayout;
        this.f$2 = atomicBoolean;
        this.f$3 = horizontalScrollView;
        this.f$4 = reactionTabHolderView;
    }

    public OAuthSheet$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3, ButtonWithCounterView buttonWithCounterView, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = buttonWithCounterView;
        this.f$4 = obj4;
        this.f$5 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda14(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i, BottomSheet.Builder builder, Utilities.Callback callback) {
        this.$r8$classId = 2;
        this.f$0 = numberPicker;
        this.f$1 = numberPicker2;
        this.f$2 = numberPicker3;
        this.f$5 = i;
        this.f$3 = builder;
        this.f$4 = callback;
    }

    public OAuthSheet$$ExternalSyntheticLambda14(ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, int i, BottomSheet[] bottomSheetArr, TLObject tLObject, String str) {
        this.$r8$classId = 4;
        this.f$3 = buttonWithCounterView;
        this.f$0 = starsSubscription;
        this.f$5 = i;
        this.f$1 = bottomSheetArr;
        this.f$2 = tLObject;
        this.f$4 = str;
    }
}
