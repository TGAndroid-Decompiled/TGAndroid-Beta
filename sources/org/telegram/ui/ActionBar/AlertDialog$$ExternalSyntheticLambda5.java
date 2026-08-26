package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet.AnonymousClass1;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GradientButtonWithCounterView;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.ChatCell;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda25;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;

public final class AlertDialog$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public AlertDialog$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        StickerMakerView.SegmentedObject segmentedObjectObjectBehind;
        TL_stars.SavedStarGift savedStarGift;
        int i = 14;
        int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        switch (this.$r8$classId) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) this.f$0;
                alertDialog.getClass();
                if (!((AlertDialog.AnonymousClass5) this.f$1).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener = alertDialog.positiveButtonListener;
                    if (onButtonClickListener != null) {
                        onButtonClickListener.onClick(alertDialog, -1);
                    }
                    if (alertDialog.dismissDialogByButtons) {
                        alertDialog.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                ((VideoAds) this.f$0).lambda$show$2((VideoAds.CloseDrawable) this.f$1, view);
                break;
            case 2:
                ((VideoAds) this.f$0).lambda$show$18((TLRPC.TL_sponsoredMessage) this.f$1, view);
                break;
            case 3:
                ((ActionBarMenuItem) this.f$0).lambda$onFiltersChanged$12((ActionBarMenuItem.SearchFilterView) this.f$1, view);
                break;
            case 4:
                ActionBarMenuItem.Item item = (ActionBarMenuItem.Item) this.f$0;
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.f$1;
                if (actionBarMenuItem.popupWindow != null && actionBarMenuItem.popupWindow.isShowing() && item.dismiss) {
                    if (!actionBarMenuItem.processedPopupClick) {
                        actionBarMenuItem.processedPopupClick = true;
                        actionBarMenuItem.popupWindow.dismiss(actionBarMenuItem.allowCloseAnimation);
                    }
                }
                if (actionBarMenuItem.parentMenu != null) {
                    actionBarMenuItem.parentMenu.onItemClick(((Integer) view.getTag()).intValue());
                } else if (actionBarMenuItem.delegate != null) {
                    actionBarMenuItem.delegate.onItemClick(((Integer) view.getTag()).intValue());
                }
                break;
            case 5:
                AlertDialog alertDialog2 = (AlertDialog) this.f$0;
                alertDialog2.getClass();
                if (!((AlertDialog.AnonymousClass6) this.f$1).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener2 = alertDialog2.negativeButtonListener;
                    if (onButtonClickListener2 != null) {
                        onButtonClickListener2.onClick(alertDialog2, -2);
                    }
                    if (alertDialog2.dismissDialogByButtons) {
                        alertDialog2.cancel();
                    }
                    break;
                }
                break;
            case 6:
                AlertDialog alertDialog3 = (AlertDialog) this.f$0;
                alertDialog3.getClass();
                if (!((AlertDialog.AnonymousClass7) this.f$1).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener3 = alertDialog3.neutralButtonListener;
                    if (onButtonClickListener3 != null) {
                        onButtonClickListener3.onClick(alertDialog3, -2);
                    }
                    if (alertDialog3.dismissDialogByButtons) {
                        alertDialog3.dismiss();
                    }
                    break;
                }
                break;
            case 7:
                AlertDialog alertDialog4 = (AlertDialog) this.f$0;
                alertDialog4.getClass();
                if (!((AlertDialog.AnonymousClass8) this.f$1).loading) {
                    AlertDialog.OnButtonClickListener onButtonClickListener4 = alertDialog4.negative2ButtonListener;
                    if (onButtonClickListener4 != null) {
                        onButtonClickListener4.onClick(alertDialog4, -2);
                    }
                    if (alertDialog4.dismissDialogByButtons) {
                        alertDialog4.cancel();
                    }
                    break;
                }
                break;
            case 8:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f$0).link);
                BulletinFactory.of((ChatActivity) this.f$1).createCopyLinkBulletin().show();
                break;
            case 9:
                ((ChatbotSheet) this.f$0).lambda$new$7((TL_account.TL_connectedBot) this.f$1);
                break;
            case 10:
                if (((DialogsHintCell) this.f$0).getAlpha() > 0.5f && (onClickListener = (View.OnClickListener) this.f$1) != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 11:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (!buttonWithCounterView.isTimerActive()) {
                    ((BottomSheet) this.f$1).lambda$showGiftOfferSheet$15();
                } else {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
                break;
            case 12:
                ColorPickerBottomSheet colorPickerBottomSheet = (ColorPickerBottomSheet) this.f$0;
                if (!colorPickerBottomSheet.pipetteDelegate.isPipetteVisible()) {
                    Bitmap bitmapSnapshotView = AndroidUtilities.snapshotView(colorPickerBottomSheet.pipetteDelegate.getSnapshotDrawingView());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapSnapshotView.getWidth(), bitmapSnapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawColor(-16777216);
                    colorPickerBottomSheet.pipetteDelegate.onDrawImageOverCanvas(canvas);
                    canvas.drawBitmap(bitmapSnapshotView, 0.0f, 0.0f, (Paint) null);
                    bitmapSnapshotView.recycle();
                    ColorPickerBottomSheet.AnonymousClass1 anonymousClass1 = colorPickerBottomSheet.new AnonymousClass1((Context) this.f$1, bitmapCreateBitmap);
                    colorPickerBottomSheet.pipetteDelegate.getContainerView().addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f));
                    ColorPickerBottomSheet.PipetteDelegate pipetteDelegate = colorPickerBottomSheet.pipetteDelegate;
                    Objects.requireNonNull(pipetteDelegate);
                    anonymousClass1.setColorListener(new SendGiftSheet$$ExternalSyntheticLambda12(pipetteDelegate, i2));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(anonymousClass1, i));
                    duration.start();
                    colorPickerBottomSheet.pipetteDelegate.onStartColorPipette();
                    colorPickerBottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 13:
                ((LPhotoPaintView) this.f$0).lambda$showMenuForEntity$36((EntityView) this.f$1, view);
                break;
            case 14:
                ((LPhotoPaintView) this.f$0).lambda$showMenuForEntity$38((StickerView) this.f$1, view);
                break;
            case 15:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                PhotoViewer$$ExternalSyntheticLambda25 photoViewer$$ExternalSyntheticLambda25 = (PhotoViewer$$ExternalSyntheticLambda25) this.f$1;
                StickerMakerView.SegmentedObject[] segmentedObjectArr = stickerMakerView.objects;
                if (segmentedObjectArr != null && segmentedObjectArr.length != 0 && stickerMakerView.sourceBitmap != null && (segmentedObjectObjectBehind = stickerMakerView.objectBehind(stickerMakerView.tx, stickerMakerView.ty)) != null) {
                    photoViewer$$ExternalSyntheticLambda25.run(segmentedObjectObjectBehind);
                    break;
                }
                break;
            case 16:
                ((LimitReachedBottomSheet) this.f$0).lambda$onViewCreated$12((Context) this.f$1, view);
                break;
            case 17:
                ReassignBoostBottomSheet reassignBoostBottomSheet = (ReassignBoostBottomSheet) this.f$0;
                ArrayList arrayList = reassignBoostBottomSheet.selectedBoosts;
                if (!arrayList.isEmpty()) {
                    GradientButtonWithCounterView gradientButtonWithCounterView = reassignBoostBottomSheet.actionButton;
                    if (!gradientButtonWithCounterView.isLoading()) {
                        gradientButtonWithCounterView.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                        BoostRepository.applyBoost(chat.id, arrayList2, new GiftSheet$$ExternalSyntheticLambda23(3, reassignBoostBottomSheet, chat, arrayList2, hashSet), new DialogCell$$ExternalSyntheticLambda6(reassignBoostBottomSheet, i));
                        break;
                    }
                }
                break;
            case 18:
                ((UserSelectorBottomSheet) this.f$0).lambda$openOptions$22((TLRPC.User) this.f$1, view);
                break;
            case 19:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.f$0;
                userSelectorBottomSheet.getClass();
                ArrayList arrayList3 = (ArrayList) this.f$1;
                int size2 = arrayList3.size();
                while (true) {
                    HashSet<Long> hashSet2 = userSelectorBottomSheet.selectedIds;
                    if (i3 >= size2) {
                        userSelectorBottomSheet.checkEditTextHint();
                        userSelectorBottomSheet.searchField.updateSpans(true, hashSet2, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(userSelectorBottomSheet, 7), null);
                        userSelectorBottomSheet.updateList(true, true);
                        userSelectorBottomSheet.clearSearchAfterSelect();
                    } else {
                        Object obj2 = arrayList3.get(i3);
                        i3++;
                        Long l = (Long) obj2;
                        l.getClass();
                        hashSet2.remove(l);
                        userSelectorBottomSheet.allSelectedObjects.remove(l);
                    }
                    break;
                }
                break;
            case 20:
                final GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) this.f$0;
                if (!giftInfoAdapter.isUnused) {
                    GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                    break;
                } else {
                    final ActionBtnCell actionBtnCell = (ActionBtnCell) this.f$1;
                    if (!actionBtnCell.button.isLoading()) {
                        actionBtnCell.button.setLoading(true);
                        String str = giftInfoAdapter.slug;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (i3) {
                                    case 0:
                                        GiftInfoAdapter giftInfoAdapter2 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9((GiftInfoBottomSheet.AnonymousClass2) giftInfoAdapter2, 2), 200L);
                                        GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                                        break;
                                    default:
                                        GiftInfoAdapter giftInfoAdapter3 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        BoostDialogs.processApplyGiftCodeError((TLRPC.TL_error) obj3, giftInfoAdapter3.container, giftInfoAdapter3.resourcesProvider, new GiftInfoAdapter$$ExternalSyntheticLambda2(giftInfoAdapter3, 0));
                                        break;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (i4) {
                                    case 0:
                                        GiftInfoAdapter giftInfoAdapter2 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9((GiftInfoBottomSheet.AnonymousClass2) giftInfoAdapter2, 2), 200L);
                                        GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                                        break;
                                    default:
                                        GiftInfoAdapter giftInfoAdapter3 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        BoostDialogs.processApplyGiftCodeError((TLRPC.TL_error) obj3, giftInfoAdapter3.container, giftInfoAdapter3.resourcesProvider, new GiftInfoAdapter$$ExternalSyntheticLambda2(giftInfoAdapter3, 0));
                                        break;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new BoostRepository$$ExternalSyntheticLambda15(callback2, callback, i4), 2);
                        break;
                    }
                }
                break;
            case 21:
                ChatCell.ChatDeleteListener chatDeleteListener = ((ChatCell) this.f$0).chatDeleteListener;
                if (chatDeleteListener != null) {
                    BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2) chatDeleteListener).f$0;
                    boostViaGiftsBottomSheet.selectedChats.remove((TLRPC.Chat) this.f$1);
                    boostViaGiftsBottomSheet.updateRows(true, true);
                }
                break;
            case 22:
                ((DialogCell$$ExternalSyntheticLambda6) this.f$0).run((TLRPC.TL_payments_checkedGiftCode) this.f$1);
                break;
            case 23:
                ((DialogCell$$ExternalSyntheticLambda6) this.f$0).run((TLRPC.Chat) this.f$1);
                break;
            case 24:
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.f$0;
                ChatAttachAlertPollLayout.openPollAttachMenu((ChatActivity) this.f$1, ChatAttachAlertPollLayout.getStartLayoutForMedia(pollAddOptionFieldLayout.attachedMedia), ChatAttachAlertPollLayout.getAllowedLayoutsForIndex(0), new DialogCell$$ExternalSyntheticLambda6(pollAddOptionFieldLayout, 19), null);
                break;
            case 25:
                ((GroupCallRenderersContainer) this.f$0).lambda$new$2((GroupCallActivity) this.f$1, view);
                break;
            case 26:
                ((PrivateVideoPreviewDialog) this.f$0).lambda$new$2((RLottieDrawable) this.f$1, view);
                break;
            case 27:
                boolean[] zArr = (boolean[]) this.f$0;
                boolean z = !zArr[0];
                zArr[0] = z;
                ((CheckBoxCell) this.f$1).setChecked(z, true);
                break;
            case 28:
                ((AcquiredGiftsSheet) this.f$0).lambda$fillItems$2((TL_stars.TL_StarGiftAuctionAcquiredGift) this.f$1);
                break;
            default:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) this.f$0;
                HashSet hashSet3 = selectGiftsBottomSheet.selectedGiftIds;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = selectGiftsBottomSheet.list.gifts;
                        int size3 = arrayList5.size();
                        int i5 = 0;
                        do {
                            if (i5 < size3) {
                                Object obj3 = arrayList5.get(i5);
                                i5++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i6 = savedStarGift.msg_id;
                                if (i6 == 0 || i6 != jLongValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                            if (savedStarGift != null) {
                                arrayList4.add(savedStarGift);
                            }
                        } while (savedStarGift.saved_id != jLongValue);
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    ((CommunityUtils$$ExternalSyntheticLambda2) this.f$1).run(arrayList4);
                    selectGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
        }
    }
}
