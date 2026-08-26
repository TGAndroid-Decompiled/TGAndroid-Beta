package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet.AnonymousClass1;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda6;
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
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Components.TranslateButton;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaFile;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLink;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaSticker;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ContactAddActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ContactAddActivity$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        StickerMakerView.SegmentedObject segmentedObjectObjectBehind;
        int i = 7;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                ContactAddActivity contactAddActivity = (ContactAddActivity) this.f$0;
                contactAddActivity.showDialog(AlertsCreator.createBirthdayPickerDialog(contactAddActivity.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.f$1)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new PollItemMenu$$ExternalSyntheticLambda14(contactAddActivity, 10), null, false, false, contactAddActivity.resourcesProvider).bottomSheet);
                break;
            case 1:
                ((JoinCallAlert) this.f$0).lambda$new$7((JoinCallAlert.JoinCallAlertDelegate) this.f$1);
                break;
            case 2:
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
                    colorPickerBottomSheet.pipetteDelegate.getContainerView().addView(anonymousClass1, LayoutHelper.createFrame(-1.0f, -1));
                    ColorPickerBottomSheet.PipetteDelegate pipetteDelegate = colorPickerBottomSheet.pipetteDelegate;
                    Objects.requireNonNull(pipetteDelegate);
                    anonymousClass1.setColorListener(new ChatActivity$$ExternalSyntheticLambda211(pipetteDelegate, 6));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    duration.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(anonymousClass1, 22));
                    duration.start();
                    colorPickerBottomSheet.pipetteDelegate.onStartColorPipette();
                    colorPickerBottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 3:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda91 = (PhotoViewer$$ExternalSyntheticLambda91) this.f$1;
                StickerMakerView.SegmentedObject[] segmentedObjectArr = stickerMakerView.objects;
                if (segmentedObjectArr != null && segmentedObjectArr.length != 0 && stickerMakerView.sourceBitmap != null && (segmentedObjectObjectBehind = stickerMakerView.objectBehind(stickerMakerView.tx, stickerMakerView.ty)) != null) {
                    photoViewer$$ExternalSyntheticLambda91.run(segmentedObjectObjectBehind);
                    break;
                }
                break;
            case 4:
                ((PhonebookShareAlert) this.f$0).lambda$new$6$1((Theme.ResourcesProvider) this.f$1);
                break;
            case 5:
                ((LimitReachedBottomSheet) this.f$0).lambda$onViewCreated$12((Context) this.f$1);
                break;
            case 6:
                ReassignBoostBottomSheet reassignBoostBottomSheet = (ReassignBoostBottomSheet) this.f$0;
                ArrayList arrayList = reassignBoostBottomSheet.selectedBoosts;
                if (!arrayList.isEmpty()) {
                    GradientButtonWithCounterView gradientButtonWithCounterView = reassignBoostBottomSheet.actionButton;
                    if (!gradientButtonWithCounterView.loading) {
                        gradientButtonWithCounterView.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                        BoostRepository.applyBoost(chat.id, arrayList2, new GiftSheet$$ExternalSyntheticLambda23(reassignBoostBottomSheet, chat, arrayList2, hashSet, 9), new DialogCell$$ExternalSyntheticLambda6(reassignBoostBottomSheet, 29));
                        break;
                    }
                }
                break;
            case 7:
                ((UserSelectorBottomSheet) this.f$0).lambda$openOptions$22((TLRPC.User) this.f$1, view);
                break;
            case 8:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.f$0;
                userSelectorBottomSheet.getClass();
                ArrayList arrayList3 = (ArrayList) this.f$1;
                int size2 = arrayList3.size();
                while (true) {
                    HashSet hashSet2 = userSelectorBottomSheet.selectedIds;
                    if (i2 >= size2) {
                        userSelectorBottomSheet.checkEditTextHint();
                        userSelectorBottomSheet.searchField.updateSpans(true, hashSet2, new UserSelectorBottomSheet$$ExternalSyntheticLambda0(userSelectorBottomSheet, i), null);
                        userSelectorBottomSheet.updateList(true, true);
                        userSelectorBottomSheet.clearSearchAfterSelect();
                    } else {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        Long l = (Long) obj2;
                        l.getClass();
                        hashSet2.remove(l);
                        userSelectorBottomSheet.allSelectedObjects.remove(l);
                    }
                    break;
                }
                break;
            case 9:
                final GiftInfoAdapter giftInfoAdapter = (GiftInfoAdapter) this.f$0;
                if (!giftInfoAdapter.isUnused) {
                    GiftInfoBottomSheet.this.lambda$showGiftOfferSheet$15();
                    break;
                } else {
                    final ActionBtnCell actionBtnCell = (ActionBtnCell) this.f$1;
                    ButtonWithCounterView buttonWithCounterView = actionBtnCell.button;
                    if (!buttonWithCounterView.loading) {
                        buttonWithCounterView.setLoading(true);
                        String str = giftInfoAdapter.slug;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (i2) {
                                    case 0:
                                        GiftInfoAdapter giftInfoAdapter2 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0((GiftInfoBottomSheet.AnonymousClass2) giftInfoAdapter2, 24), 200L);
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
                                switch (i3) {
                                    case 0:
                                        GiftInfoAdapter giftInfoAdapter2 = giftInfoAdapter;
                                        actionBtnCell.button.setLoading(false);
                                        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0((GiftInfoBottomSheet.AnonymousClass2) giftInfoAdapter2, 24), 200L);
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
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new BoostRepository$$ExternalSyntheticLambda6(callback2, callback, i3), 2);
                        break;
                    }
                }
                break;
            case 10:
                ChatCell.ChatDeleteListener chatDeleteListener = ((ChatCell) this.f$0).chatDeleteListener;
                if (chatDeleteListener != null) {
                    BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2) chatDeleteListener).f$0;
                    boostViaGiftsBottomSheet.selectedChats.remove((TLRPC.Chat) this.f$1);
                    boostViaGiftsBottomSheet.updateRows(true, true);
                }
                break;
            case 11:
                ((PollItemMenu$$ExternalSyntheticLambda14) this.f$0).run((TLRPC.TL_payments_checkedGiftCode) this.f$1);
                break;
            case 12:
                ((PollItemMenu$$ExternalSyntheticLambda14) this.f$0).run((TLRPC.Chat) this.f$1);
                break;
            case 13:
                ProximitySheet proximitySheet = (ProximitySheet) this.f$0;
                if (proximitySheet.buttonTextView.getTag() == null) {
                    int iMax = (int) Math.max(1.0f, proximitySheet.getValue());
                    DialogsActivity$$ExternalSyntheticLambda89 dialogsActivity$$ExternalSyntheticLambda89 = (DialogsActivity$$ExternalSyntheticLambda89) this.f$1;
                    LocationActivity locationActivity = (LocationActivity) dialogsActivity$$ExternalSyntheticLambda89.f$0;
                    LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                    TLRPC.User user = (TLRPC.User) dialogsActivity$$ExternalSyntheticLambda89.f$1;
                    if (sharingLocationInfo == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                        String string = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.ShareLocationAlertText);
                        builder.setPositiveButton(LocaleController.getString(R.string.ShareLocationAlertButton), new PassportActivity$$ExternalSyntheticLambda52(locationActivity, user, iMax, 13));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        locationActivity.showDialog(alertDialog);
                    } else {
                        locationActivity.proximitySheet.radiusSet = true;
                        locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert2);
                        locationActivity.getUndoView$1().showWithAction(0L, 24, Integer.valueOf(iMax), user, (Runnable) null, (Runnable) null);
                        locationActivity.getLocationController().setProximityLocation(locationActivity.dialogId, iMax, true);
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        proximitySheet.dismiss();
                    }
                    break;
                }
                break;
            case 14:
                Context context = (Context) this.f$1;
                QRCodeBottomSheet qRCodeBottomSheet = (QRCodeBottomSheet) this.f$0;
                qRCodeBottomSheet.getClass();
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(qRCodeBottomSheet.qrCode, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, qRCodeBottomSheet.getTitleView().getText()), 500);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 15:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) this.f$0);
                Intent intentCreateChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                intentCreateChooser.setFlags(268435456);
                ((Context) this.f$1).startActivity(intentCreateChooser);
                break;
            case 16:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$0;
                giftsList.sort_by_date = !giftsList.sort_by_date;
                ((SendMessagesHelper$$ExternalSyntheticLambda7) this.f$1).run();
                giftsList.invalidate(true);
                break;
            case 17:
                StickersAlert.GridAdapter gridAdapter = (StickersAlert.GridAdapter) this.f$0;
                gridAdapter.getClass();
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                StickersAlert.AnonymousClass1 anonymousClass2 = StickersAlert.this.previewDelegate;
                contentPreviewViewer.delegate = anonymousClass2;
                if (anonymousClass2 != null) {
                    contentPreviewViewer.isPhotoEditor = false;
                    contentPreviewViewer.isStickerEditor = false;
                }
                ContentPreviewViewer.getInstance().showMenuFor((StickerEmojiCell) this.f$1);
                break;
            case 18:
                AndroidUtilities.addToClipboard((CharSequence) this.f$0);
                ((StickersActivity$$ExternalSyntheticLambda18) this.f$1).run();
                break;
            case 19:
                ((BottomSheet) this.f$0).lambda$showGiftOfferSheet$15();
                boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                }
                break;
            case 20:
                TranslateAlert3 translateAlert3 = (TranslateAlert3) this.f$0;
                translateAlert3.collapsed = false;
                translateAlert3.saveScrollPosition$2();
                ((UniversalAdapter) this.f$1).update(true);
                translateAlert3.applyScrolledPosition$1();
                break;
            case 21:
                ImageView imageView = ((TranslateAlert3.Header) this.f$0).anotherExampleIcon;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                View.OnClickListener onClickListener = (View.OnClickListener) this.f$1;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 22:
                ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) this.f$0;
                ((ActionBarPopupWindow) this.f$1).dismiss(true);
                TranslateButton.showCocoonAlert(anonymousClass55.getContext(), anonymousClass55.resourcesProvider);
                break;
            case 23:
                UndoView undoView = (UndoView) this.f$0;
                undoView.hide(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                TLRPC.Message message = (TLRPC.Message) this.f$1;
                tL_payments_getPaymentReceipt.msg_id = message.id;
                BaseFragment baseFragment = undoView.parentFragment;
                tL_payments_getPaymentReceipt.peer = baseFragment.getMessagesController().getInputPeer(message.peer_id);
                baseFragment.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new LinkManager$$ExternalSyntheticLambda3(undoView, i), 2);
                break;
            case 24:
                UpdateAppAlertDialog updateAppAlertDialog = (UpdateAppAlertDialog) this.f$0;
                File file = (File) this.f$1;
                if (file == null) {
                    updateAppAlertDialog.getClass();
                    break;
                } else {
                    Activity activityFindActivity = AndroidUtilities.findActivity(updateAppAlertDialog.getContext());
                    if (activityFindActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", activityFindActivity, null, false);
                        updateAppAlertDialog.lambda$showGiftOfferSheet$15();
                        break;
                    }
                }
                break;
            case 25:
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.f$0;
                PollAttachedMedia pollAttachedMedia = pollAddOptionFieldLayout.attachedMedia;
                if (!(pollAttachedMedia instanceof PollAttachedMediaMusic) && !(pollAttachedMedia instanceof PollAttachedMediaFile)) {
                    if (pollAttachedMedia instanceof PollAttachedMediaSticker) {
                        boolean z = ((PollAttachedMediaSticker) pollAttachedMedia).isEmoji;
                    } else if (!(pollAttachedMedia instanceof PollAttachedMediaLocation)) {
                        boolean z2 = pollAttachedMedia instanceof PollAttachedMediaLink;
                    }
                }
                ChatAttachAlertPollLayout.openPollAttachMenu((ChatActivity) this.f$1, 41026, new PollItemMenu$$ExternalSyntheticLambda14(pollAddOptionFieldLayout, i), null);
                break;
            case 26:
                GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) this.f$0;
                boolean zIsRtmpStream = anonymousClass28.isRtmpStream();
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$1;
                if (!zIsRtmpStream) {
                    if (!AndroidUtilities.checkInlinePermissions(groupCallActivity.parentActivity)) {
                        AlertsCreator.createDrawOverlayGroupCallPermissionDialog(anonymousClass28.getContext()).show();
                    } else {
                        GroupCallPip.forceRemoved = false;
                        groupCallActivity.lambda$showGiftOfferSheet$15();
                    }
                } else if (PipUtils.checkPermissions(groupCallActivity.parentActivity) <= 0) {
                    AlertsCreator.createDrawOverlayPermissionDialog(groupCallActivity.parentActivity, null, true).show();
                } else {
                    RTMPStreamPipOverlay.instance.showInternal(groupCallActivity.parentActivity);
                    groupCallActivity.lambda$showGiftOfferSheet$15();
                }
                break;
            case 27:
                GroupCallActivity.AnonymousClass47 anonymousClass47 = (GroupCallActivity.AnonymousClass47) this.f$0;
                boolean z3 = anonymousClass47.micEnabled;
                anonymousClass47.micEnabled = !z3;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.f$1;
                if (z3) {
                    rLottieDrawable.setCurrentFrame(69, true, false);
                    rLottieDrawable.setCustomEndFrame(99);
                } else {
                    rLottieDrawable.setCurrentFrame(36, true, false);
                    rLottieDrawable.setCustomEndFrame(69);
                }
                rLottieDrawable.start();
                break;
            case 28:
                boolean[] zArr2 = (boolean[]) this.f$0;
                boolean z4 = !zArr2[0];
                zArr2[0] = z4;
                ((CheckBoxCell) this.f$1).setChecked(z4, true);
                break;
            default:
                ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.this;
                if (contentPreviewViewer2.parentActivity != null) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    ArrayList arrayList4 = (ArrayList) this.f$1;
                    if (((Integer) arrayList4.get(iIntValue)).intValue() == 0) {
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer2.delegate;
                        TLObject tLObject = contentPreviewViewer2.currentDocument;
                        if (tLObject == null) {
                            tLObject = contentPreviewViewer2.inlineResult;
                        }
                        contentPreviewViewerDelegate.sendGif(0, 0, contentPreviewViewer2.parentObject, tLObject, true);
                    } else if (((Integer) arrayList4.get(iIntValue)).intValue() == 4) {
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = contentPreviewViewer2.delegate;
                        TLObject tLObject2 = contentPreviewViewer2.currentDocument;
                        if (tLObject2 == null) {
                            tLObject2 = contentPreviewViewer2.inlineResult;
                        }
                        contentPreviewViewerDelegate2.sendGif(0, 0, contentPreviewViewer2.parentObject, tLObject2, false);
                    } else if (((Integer) arrayList4.get(iIntValue)).intValue() == 1) {
                        MediaDataController.getInstance(contentPreviewViewer2.currentAccount).removeRecentGif(contentPreviewViewer2.currentDocument);
                        contentPreviewViewer2.delegate.gifAddedOrDeleted();
                    } else if (((Integer) arrayList4.get(iIntValue)).intValue() == 2) {
                        MediaDataController.getInstance(contentPreviewViewer2.currentAccount).addRecentGif(contentPreviewViewer2.currentDocument, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(contentPreviewViewer2.currentAccount).saveGif("gif", contentPreviewViewer2.currentDocument);
                        contentPreviewViewer2.delegate.gifAddedOrDeleted();
                    } else if (((Integer) arrayList4.get(iIntValue)).intValue() == 3) {
                        TLRPC.Document document = contentPreviewViewer2.currentDocument;
                        TLRPC.BotInlineResult botInlineResult = contentPreviewViewer2.inlineResult;
                        Object obj3 = contentPreviewViewer2.parentObject;
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate3 = contentPreviewViewer2.delegate;
                        AlertsCreator.createScheduleDatePickerDialog(contentPreviewViewer2.parentActivity, contentPreviewViewerDelegate3.getDialogId(), -1L, 0, new ArticleViewer$$ExternalSyntheticLambda54(contentPreviewViewerDelegate3, document, botInlineResult, obj3, 8), null, contentPreviewViewer2.resourcesProvider);
                    } else if (((Integer) arrayList4.get(iIntValue)).intValue() == 11) {
                        ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate4 = contentPreviewViewer2.delegate;
                        TLObject tLObject3 = contentPreviewViewer2.currentDocument;
                        if (tLObject3 == null) {
                            tLObject3 = contentPreviewViewer2.inlineResult;
                        }
                        contentPreviewViewerDelegate4.addCaptionToGif(tLObject3, contentPreviewViewer2.parentObject);
                    }
                    contentPreviewViewer2.dismissPopupWindow();
                    break;
                }
                break;
        }
    }
}
