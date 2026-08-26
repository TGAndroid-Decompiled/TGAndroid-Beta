package org.telegram.ui.bots;

import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.biometric.BiometricPrompt$CryptoObject;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.poll.WebPageLoader;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;

public final class BotBiometry$$ExternalSyntheticLambda10 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BotBiometry$$ExternalSyntheticLambda10(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.WebPage webPage;
        int i;
        int i2;
        boolean z;
        int i3 = 0;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((Utilities.Callback3) obj4).run((Boolean) obj, (BiometricPrompt$AuthenticationResult) obj2, (BiometricPrompt$CryptoObject) obj3);
                break;
            case 1:
                ((ChatActionCell) obj4).lambda$didPressCustomBotButton$7((BaseFragment) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = (BoostViaGiftsBottomSheet) obj4;
                boostViaGiftsBottomSheet.actionBtn.button.setLoading(false);
                if (boostViaGiftsBottomSheet.getContext() != null) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    FireworksOverlay fireworksOverlay = LaunchActivity.instance.getFireworksOverlay();
                    if (safeLastFragment != null) {
                        if (bool.booleanValue()) {
                            boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                            ChatActivity chatActivityOf = ChatActivity.of(-boostViaGiftsBottomSheet.currentChat.id);
                            safeLastFragment.presentFragment(chatActivityOf);
                            safeLastFragment.whenFullyVisible(new GiftSheet$$ExternalSyntheticLambda26(6, chatActivityOf, (TL_stars.TL_starsGiveawayOption) obj3));
                            if (fireworksOverlay != null) {
                                fireworksOverlay.start(true);
                            }
                        } else if (str != null) {
                            boostViaGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                            zzkh.m(R.string.UnknownErrorCode, new Object[]{str}, BulletinFactory.of(safeLastFragment), R.raw.error);
                        }
                        break;
                    }
                }
                break;
            case 3:
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                WebPageLoader webPageLoader = (WebPageLoader) obj4;
                if (webpagepreview != null) {
                    int i4 = webPageLoader.currentAccount;
                    MessagesController.getInstance(i4).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i4).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        webPage = messageMedia.webpage;
                    } else {
                        webPage = null;
                    }
                } else {
                    webPage = null;
                }
                String str2 = (String) obj3;
                webPageLoader.pages.put(str2, webPage);
                ArrayList arrayList = (ArrayList) webPageLoader.callbacks.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj5 = arrayList.get(i3);
                        i3++;
                        ((Utilities.Callback2) obj5).run(webPage, tL_error);
                    }
                }
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj;
                ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) obj4;
                unpinSheet.getClass();
                ArrayList arrayList3 = ((StarsController.GiftsList) obj3).gifts;
                int size2 = arrayList3.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj6 = arrayList3.get(i5);
                    i5++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
                    if (savedStarGift.pinned_to_top) {
                        arrayList2.add(PeerColorActivity.GiftCell.Factory.asGiftCell(savedStarGift).setChecked(unpinSheet.selectedGift == savedStarGift.gift.id).setSpanCount(1));
                    }
                }
                break;
            case 5:
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj4;
                HintView2 hintView2 = craftTopView.currentHint;
                if (hintView2 != null) {
                    hintView2.hide();
                    craftTopView.currentHint = null;
                }
                craftTopView.crafted = true;
                craftTopView.failed = starGift == null;
                craftTopView.openCraftedGift = runnable;
                StarGiftSheet.CraftTopView.Cube3D.AnimSequence animSequence = new StarGiftSheet.CraftTopView.Cube3D.AnimSequence(craftTopView.cube);
                ArrayList arrayList4 = new ArrayList();
                int i6 = 0;
                while (true) {
                    StarGiftSheet.CraftTopView.SelectGiftView[] selectGiftViewArr = craftTopView.gifts;
                    if (i6 >= selectGiftViewArr.length) {
                        int i7 = 4;
                        if (arrayList4.size() == 1) {
                            animSequence.put(selectGiftViewArr[((Integer) arrayList4.get(0)).intValue()], 5, 0.0f);
                            animSequence.friction(false);
                            animSequence.fling(26.0f, -26.0f);
                            animSequence.delay(90);
                            animSequence.friction(true);
                            animSequence.delay(20);
                            i2 = 40;
                        } else {
                            int[] iArr = {5, 0, 2, 3, 4};
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView = selectGiftViewArr[0];
                            if (selectGiftView == null) {
                                i = 0;
                            } else {
                                TL_stars.StarGift starGift2 = selectGiftView.gift;
                                if (starGift2 == null) {
                                    starGift2 = null;
                                }
                                if (starGift2 != null) {
                                    animSequence.put(selectGiftView, iArr[0], 0.0f);
                                    animSequence.fling(25.0f, -22.0f);
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView2 = selectGiftViewArr[1];
                            if (selectGiftView2 != null) {
                                TL_stars.StarGift starGift3 = selectGiftView2.gift;
                                if (starGift3 == null) {
                                    starGift3 = null;
                                }
                                if (starGift3 != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[1], iArr[i], 0.0f);
                                    animSequence.fling(25.0f, 31.0f);
                                    i++;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView3 = selectGiftViewArr[2];
                            if (selectGiftView3 != null) {
                                TL_stars.StarGift starGift4 = selectGiftView3.gift;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[2], iArr[i], 180.0f);
                                    animSequence.fling(-36.0f, -36.0f);
                                    i++;
                                }
                            }
                            StarGiftSheet.CraftTopView.SelectGiftView selectGiftView4 = selectGiftViewArr[3];
                            if (selectGiftView4 != null) {
                                TL_stars.StarGift starGift5 = selectGiftView4.gift;
                                if ((starGift5 != null ? starGift5 : null) != null) {
                                    if (i > 0) {
                                        animSequence.delay(42);
                                    }
                                    animSequence.put(selectGiftViewArr[3], iArr[i], 0.0f);
                                    animSequence.fling(-31.0f, 31.0f);
                                    i++;
                                }
                            }
                            animSequence.friction(false);
                            animSequence.delay(40);
                            animSequence.friction(true);
                            animSequence.delay(40);
                            i7 = iArr[i];
                            i2 = 80;
                        }
                        RichTextCell$2$$ExternalSyntheticLambda1 richTextCell$2$$ExternalSyntheticLambda1 = new RichTextCell$2$$ExternalSyntheticLambda1(craftTopView, i7, starGift, 13);
                        ArrayList arrayList5 = animSequence.commands;
                        arrayList5.add(new StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd(1, 0.0f, 0.0f, 0, -1, 0.0f, null, richTextCell$2$$ExternalSyntheticLambda1));
                        arrayList5.add(new StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd(4, 0.0f, 0.0f, i2, i7, -90, null, null));
                        animSequence.onComplete = new Theme$$ExternalSyntheticLambda17(25, craftTopView, starGift, (ArrayList) obj3, runnable);
                        animSequence.cancelled = false;
                        animSequence.currentIndex = 0;
                        animSequence.waitingForPull = false;
                        int size3 = arrayList5.size();
                        while (true) {
                            StarGiftSheet.CraftTopView.Cube3D cube3D = animSequence.cube;
                            if (i3 >= size3) {
                                cube3D.sequence = animSequence;
                                animSequence.executeNext();
                                break;
                            } else {
                                Object obj7 = arrayList5.get(i3);
                                i3++;
                                StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd cmd = (StarGiftSheet.CraftTopView.Cube3D.AnimSequence.Cmd) obj7;
                                int i8 = cmd.face;
                                if (i8 >= 0 && i8 < 6) {
                                    float f = cmd.rotation;
                                    if (f != 0.0f) {
                                        cube3D.faceRotations[i8] = f;
                                    }
                                }
                            }
                        }
                    } else {
                        StarGiftSheet.CraftTopView.SelectGiftView selectGiftView5 = selectGiftViewArr[i6];
                        if (selectGiftView5 != null) {
                            TL_stars.StarGift starGift6 = selectGiftView5.gift;
                            if (starGift6 == null) {
                                starGift6 = null;
                            }
                            if (starGift6 != null) {
                                arrayList4.add(Integer.valueOf(i6));
                            }
                        }
                        i6++;
                    }
                }
                break;
            case 6:
                ((StarsIntroActivity) obj4).lambda$onItemClick$8((UItem) obj3, (Boolean) obj, (String) obj2);
                break;
            case 7:
                ((StarsIntroActivity.StarsNeededSheet) obj4).lambda$onItemClick$2((UItem) obj3, (Boolean) obj, (String) obj2);
                break;
            case 8:
                ((StarsIntroActivity.StarsOptionsSheet) obj4).lambda$onItemClick$2$1((UItem) obj3, (Boolean) obj, (String) obj2);
                break;
            case 9:
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) obj4;
                anonymousClass10.polling = false;
                TLRPC.InputGroupCall inputGroupCall = anonymousClass10.inputCall;
                if (inputGroupCall != null && inputGroupCall.id == ((TL_phone.getGroupCallStars) obj3).call.id) {
                    if (groupcallstars != null) {
                        int i9 = anonymousClass10.currentAccount;
                        MessagesController.getInstance(i9).putUsers(groupcallstars.users, false);
                        MessagesController.getInstance(i9).putChats(groupcallstars.chats, false);
                        int i10 = 0;
                        while (true) {
                            if (i10 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i10).my) {
                                    z = groupcallstars.top_donors.get(i10).stars > 0;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        long j = groupcallstars.total_stars;
                        i3 = (j == anonymousClass10.totalStars && anonymousClass10.sentStars == z) ? 0 : 1;
                        anonymousClass10.totalStars = j;
                        anonymousClass10.topDonors = groupcallstars.top_donors;
                        anonymousClass10.sentStars = z;
                        if (i3 != 0) {
                            anonymousClass10.onStarsCountUpdated();
                        }
                        anonymousClass10.updateMessagesPlaces();
                    }
                    if (anonymousClass10.isAttachedToWindow()) {
                        LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = anonymousClass10.pollStarsRunnable;
                        AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
                        AndroidUtilities.runOnUIThread(liveCommentsView$$ExternalSyntheticLambda2, 5000L);
                    }
                    break;
                }
                break;
            case 10:
                Vector vector = (Vector) obj;
                UserListPoller.AnonymousClass1 anonymousClass1 = (UserListPoller.AnonymousClass1) obj4;
                anonymousClass1.getClass();
                if (vector != null) {
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    int i11 = 0;
                    while (true) {
                        int size4 = vector.objects.size();
                        UserListPoller userListPoller = anonymousClass1.this$0;
                        if (i11 >= size4) {
                            MessagesStorage.getInstance(userListPoller.currentAccount).putUsersAndChats(arrayList6, arrayList7, true, true);
                            NotificationCenter.getInstance(userListPoller.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                        } else {
                            ArrayList arrayList8 = (ArrayList) obj3;
                            if (((Long) arrayList8.get(i11)).longValue() > 0) {
                                TLRPC.User user = MessagesController.getInstance(userListPoller.currentAccount).getUser((Long) arrayList8.get(i11));
                                if (user != null) {
                                    TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i11);
                                    user.stories_max_id = tL_recentStory;
                                    if (tL_recentStory != null) {
                                        user.flags2 |= 32;
                                    } else {
                                        user.flags2 &= -33;
                                    }
                                    arrayList6.add(user);
                                }
                            } else {
                                TLRPC.Chat chat = MessagesController.getInstance(userListPoller.currentAccount).getChat((Long) arrayList8.get(i11));
                                if (chat != null) {
                                    TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i11);
                                    chat.stories_max_id = tL_recentStory2;
                                    if (tL_recentStory2 != null) {
                                        chat.flags2 |= 16;
                                    } else {
                                        chat.flags2 &= -17;
                                    }
                                    arrayList7.add(chat);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 11:
                PaintView paintView = (PaintView) obj4;
                paintView.getClass();
                EntityView entityView = (EntityView) obj3;
                ((LocationView) entityView).setLocation(paintView.currentAccount, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                paintView.appearAnimation(entityView);
                break;
            default:
                ((BotWebViewContainer) obj4).lambda$onEventReceived$48((BotWebViewContainer.BotWebViewProxy) obj3, (String) obj, (ArrayList) obj2);
                break;
        }
    }
}
