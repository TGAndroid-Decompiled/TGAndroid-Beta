package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.ReactionTabHolderView;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda7 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;

    public OAuthSheet$$ExternalSyntheticLambda7(int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, LinearLayout linearLayout, long[] jArr, WearAuthSheet$$ExternalSyntheticLambda3 wearAuthSheet$$ExternalSyntheticLambda3) {
        this.$r8$classId = 5;
        this.f$5 = i;
        this.f$2 = bottomSheet;
        this.f$0 = resourcesProvider;
        this.f$1 = linearLayout;
        this.f$3 = jArr;
        this.f$4 = wearAuthSheet$$ExternalSyntheticLambda3;
    }

    @Override
    public final void onClick(View view) {
        long j;
        JSONObject jSONObject = null;
        int i = this.f$5;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$0;
        Object obj4 = this.f$1;
        Object obj5 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = (boolean[]) obj4;
                BottomSheet bottomSheet = (BottomSheet) obj5;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                    if (!buttonWithCounterView.loading) {
                        buttonWithCounterView.setLoading(true);
                        BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj;
                        if (botWebViewContainer != null) {
                            int i2 = BotWebViewContainer.tags;
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                            botWebViewContainer.notifyEvent("oauth_result_failed", jSONObject);
                        }
                        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda18(0, zArr, bottomSheet));
                        break;
                    }
                } else {
                    zArr[0] = true;
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 1:
                ViewPager viewPager = (ViewPager) obj3;
                int currentItem = viewPager.getCurrentItem();
                if (i != currentItem) {
                    final ReactionTabHolderView reactionTabHolderView = (ReactionTabHolderView) ((LinearLayout) obj4).getChildAt(currentItem);
                    ((AtomicBoolean) obj5).set(true);
                    viewPager.setCurrentItem(i, true);
                    final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                    final float scrollX = horizontalScrollView.getScrollX();
                    final ReactionTabHolderView reactionTabHolderView2 = (ReactionTabHolderView) obj;
                    final float x = reactionTabHolderView2.getX() - ((horizontalScrollView.getWidth() - reactionTabHolderView2.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float f = x;
                            float f2 = scrollX;
                            horizontalScrollView.setScrollX((int) DiffUtil.m(f, f2, fFloatValue, f2));
                            reactionTabHolderView.setOutlineProgress(1.0f - fFloatValue);
                            reactionTabHolderView2.setOutlineProgress(fFloatValue);
                        }
                    });
                    duration.start();
                    break;
                }
                break;
            case 2:
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((NumberPicker) obj3).getValue();
                tL_birthday.month = ((NumberPicker) obj4).getValue() + 1;
                NumberPicker numberPicker = (NumberPicker) obj5;
                if (numberPicker.getValue() != i) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = numberPicker.getValue();
                }
                ((BottomSheet.Builder) obj2).bottomSheet.dismissRunnable.run();
                ((Utilities.Callback) obj).run(tL_birthday);
                break;
            case 3:
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = (CreateRtmpStreamBottomSheet) obj3;
                createRtmpStreamBottomSheet.getClass();
                AlertDialog.Builder builder = new AlertDialog.Builder((Context) obj4, 0, (DarkThemeResourceProvider) obj5);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new VoIPFragment$$ExternalSyntheticLambda37(createRtmpStreamBottomSheet, (ButtonWithCounterView) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f$5, 4));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.makeRed(-1);
                builder.show();
                break;
            case 4:
                ButtonWithCounterView buttonWithCounterView2 = (ButtonWithCounterView) obj2;
                if (!buttonWithCounterView2.loading) {
                    buttonWithCounterView2.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj3).id;
                    int i3 = this.f$5;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_changeStarsSubscription, new GroupCallSheet$$ExternalSyntheticLambda0(buttonWithCounterView2, (BottomSheet[]) obj4, i3, (TLObject) obj5, (String) obj, 11));
                    break;
                }
                break;
            default:
                BotStarsController botStarsController = BotStarsController.getInstance(i);
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
                arrayList.add(0, UserConfig.getInstance(i).getCurrentUser());
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((BottomSheet) obj5).getContainerView(), (Theme.ResourcesProvider) obj3, (LinearLayout) obj4);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj6 = arrayList.get(i4);
                    i4++;
                    TLObject tLObject = (TLObject) obj6;
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j = -chat.id;
                        }
                    }
                    long j2 = j;
                    long[] jArr = (long[]) obj2;
                    itemOptionsMakeOptions.addChat(tLObject, j2 == jArr[0], new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16(jArr, j2, (WearAuthSheet$$ExternalSyntheticLambda3) obj, 0));
                }
                itemOptionsMakeOptions.drawScrim = false;
                itemOptionsMakeOptions.dimAlpha = 0;
                itemOptionsMakeOptions.setGravity(5);
                itemOptionsMakeOptions.translate(AndroidUtilities.dp(24.0f), 0.0f);
                itemOptionsMakeOptions.show();
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda7(ViewPager viewPager, int i, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ReactionTabHolderView reactionTabHolderView) {
        this.$r8$classId = 1;
        this.f$0 = viewPager;
        this.f$5 = i;
        this.f$1 = linearLayout;
        this.f$2 = atomicBoolean;
        this.f$3 = horizontalScrollView;
        this.f$4 = reactionTabHolderView;
    }

    public OAuthSheet$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, ButtonWithCounterView buttonWithCounterView, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = buttonWithCounterView;
        this.f$4 = obj4;
        this.f$5 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda7(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, int i, BottomSheet.Builder builder, Utilities.Callback callback) {
        this.$r8$classId = 2;
        this.f$0 = numberPicker;
        this.f$1 = numberPicker2;
        this.f$2 = numberPicker3;
        this.f$5 = i;
        this.f$3 = builder;
        this.f$4 = callback;
    }

    public OAuthSheet$$ExternalSyntheticLambda7(ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, int i, BottomSheet[] bottomSheetArr, TLObject tLObject, String str) {
        this.$r8$classId = 4;
        this.f$3 = buttonWithCounterView;
        this.f$0 = starsSubscription;
        this.f$5 = i;
        this.f$1 = bottomSheetArr;
        this.f$2 = tLObject;
        this.f$4 = str;
    }
}
