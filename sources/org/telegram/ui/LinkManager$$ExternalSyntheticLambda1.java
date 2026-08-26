package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.BagRandomizer;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class LinkManager$$ExternalSyntheticLambda1 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList;
        ArrayList arrayList2;
        Utilities.Callback callback;
        int i = 17;
        String string = null;
        int i2 = 0;
        int i3 = 1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LinkManager linkManager = (LinkManager) obj3;
                linkManager.done();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(linkManager.currentAccount).putUsers(tL_tones.users, false);
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null && !tL_tones.tones.isEmpty()) {
                        new AIEditorAlert.AiStyleAlert(safeLastFragment.getContext(), tL_tones.tones.get(0), safeLastFragment.getResourceProvider()).show();
                    }
                } else if (tL_error != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error.text)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AIEditorStyleNotFound, LinkManager.getBulletinFactory(), R.raw.error, 36);
                    } else {
                        LinkManager.getBulletinFactory().showForError(false, tL_error);
                    }
                }
                break;
            case 1:
                ((ResaleGiftsFragment.SelectGiftSheet) obj3).fillItems$35((ArrayList) obj);
                break;
            case 2:
                Bitmap bitmap = (Bitmap) obj2;
                PollItemMenu pollItemMenu = (PollItemMenu) obj3;
                pollItemMenu.blurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                pollItemMenu.blurBitmapPaint = paint;
                Bitmap bitmap2 = pollItemMenu.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                pollItemMenu.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
                pollItemMenu.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                pollItemMenu.blurMatrix = new Matrix();
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = pollItemMenu.iBlur3SourceBitmap;
                blurredBackgroundSourceBitmap.setBitmap(bitmap);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap, pollItemMenu.windowView);
                pollItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                break;
            case 3:
                ArrayList arrayList3 = (ArrayList) obj;
                PostSuggestionsEditActivity postSuggestionsEditActivity = (PostSuggestionsEditActivity) obj3;
                String string2 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i4 = R.raw.bubble;
                UItem uItem = new UItem(2);
                uItem.text = string2;
                uItem.iconResId = i4;
                arrayList3.add(uItem);
                UItem uItemAsCheck = UItem.asCheck(1, LocaleController.getString(R.string.AllowPostSuggestions));
                uItemAsCheck.setChecked(postSuggestionsEditActivity.isSuggestionsEnabled);
                arrayList3.add(uItemAsCheck);
                arrayList3.add(UItem.asShadow(2, null));
                if (postSuggestionsEditActivity.isSuggestionsEnabled) {
                    String string3 = LocaleController.getString(R.string.PriceForEachSuggestion);
                    UItem uItem2 = new UItem(0);
                    uItem2.text = string3;
                    arrayList3.add(uItem2);
                    int[] iArrCut = SlideIntChooseView.cut((int) postSuggestionsEditActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    PhotoViewer$$ExternalSyntheticLambda97 photoViewer$$ExternalSyntheticLambda97 = new PhotoViewer$$ExternalSyntheticLambda97(i);
                    SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                    options.steps = iArrCut;
                    options.betweenSteps = 20;
                    options.toString = photoViewer$$ExternalSyntheticLambda97;
                    postSuggestionsEditActivity.slideView.set((int) Utilities.clamp(postSuggestionsEditActivity.suggestionsStarsCount, 10000L, 0L), options, new PollItemMenu$$ExternalSyntheticLambda14(postSuggestionsEditActivity, 24));
                    arrayList3.add(UItem.asCustom(3, postSuggestionsEditActivity.slideView));
                    if (postSuggestionsEditActivity.suggestionsStarsCount > 0) {
                        int i5 = postSuggestionsEditActivity.getMessagesController().starsPaidMessageCommissionPermille;
                        string = LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, AffiliateProgramFragment.percents(i5), String.valueOf(((double) ((int) ((((double) (postSuggestionsEditActivity.suggestionsStarsCount * (i5 / 1000.0f))) / 1000.0d) * ((double) postSuggestionsEditActivity.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d));
                    }
                    arrayList3.add(UItem.asShadow(4, string));
                    TLRPC.Chat chat = postSuggestionsEditActivity.getMessagesController().getChat(Long.valueOf(postSuggestionsEditActivity.currentChatId));
                    if (chat != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
                        postSuggestionsEditActivity.linkView.setLink(postSuggestionsEditActivity.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat) + "?direct");
                        String string4 = LocaleController.getString(R.string.ChannelLinkDirectMessages);
                        UItem uItem3 = new UItem(0);
                        uItem3.text = string4;
                        arrayList3.add(uItem3);
                        arrayList3.add(UItem.asCustom(5, postSuggestionsEditActivity.linkView));
                        break;
                    }
                }
                break;
            case 4:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.currentPasskeys = passkeys.passkeys;
                    privacySettingsActivity.updateRows(true);
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap2 = profileActivity.scrimBlur3SourceBitmap;
                blurredBackgroundSourceBitmap2.setBitmap((Bitmap) obj2);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap2, profileActivity.fragmentView);
                profileActivity.scrimBlur3Factory.invalidateAllLinkedViews();
                break;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                final ReportBottomSheet.Page page = (ReportBottomSheet.Page) obj3;
                ReportBottomSheet.Page.BigHeaderCell bigHeaderCell = page.headerView;
                if (bigHeaderCell.getMeasuredHeight() <= 0) {
                    bigHeaderCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                int measuredHeight = bigHeaderCell.getMeasuredHeight();
                UItem uItem4 = new UItem(28);
                uItem4.intValue = measuredHeight;
                uItem4.id = -1;
                uItem4.transparent = true;
                arrayList4.add(uItem4);
                int measuredHeight2 = (int) ((bigHeaderCell.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = page.sponsoredOption;
                ReportBottomSheet reportBottomSheet = ReportBottomSheet.this;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || page.option != null || page.commentOption != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || page.option != null) {
                        HeaderCell headerCell = new HeaderCell(page.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BottomSheet) reportBottomSheet).resourcesProvider);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = page.sponsoredOption;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            headerCell.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = page.option;
                            if (tL_reportResultChooseOption != null) {
                                headerCell.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        headerCell.setBackgroundColor(reportBottomSheet.getThemedColor(Theme.key_dialogBackground));
                        UItem uItemAsCustom = UItem.asCustom(headerCell);
                        uItemAsCustom.id = -2;
                        arrayList4.add(uItemAsCustom);
                        measuredHeight2 += 40;
                    }
                    if (page.sponsoredOption != null) {
                        for (int i6 = 0; i6 < page.sponsoredOption.options.size(); i6++) {
                            UItem uItem5 = new UItem(30);
                            uItem5.text = page.sponsoredOption.options.get(i6).text;
                            uItem5.iconResId = R.drawable.msg_arrowright;
                            uItem5.id = i6;
                            arrayList4.add(uItem5);
                            measuredHeight2 += 50;
                        }
                    } else if (page.option != null) {
                        for (int i7 = 0; i7 < page.option.options.size(); i7++) {
                            UItem uItem6 = new UItem(30);
                            uItem6.text = page.option.options.get(i7).text;
                            uItem6.iconResId = R.drawable.msg_arrowright;
                            uItem6.id = i7;
                            arrayList4.add(uItem6);
                            measuredHeight2 += 50;
                        }
                    } else if (page.commentOption != null) {
                        if (page.editTextCell == null) {
                            ?? r5 = new EditTextCell(page.getContext(), ((BottomSheet) reportBottomSheet).resourcesProvider) {
                                @Override
                                public final void onTextChanged(Editable editable) {
                                    Page page2 = Page.this;
                                    ButtonWithCounterView buttonWithCounterView = page2.button;
                                    if (buttonWithCounterView != null) {
                                        buttonWithCounterView.setEnabled(page2.commentOption.optional || !TextUtils.isEmpty(page2.editTextCell.getText()));
                                    }
                                }
                            };
                            page.editTextCell = r5;
                            r5.setShowLimitWhenNear(100);
                        }
                        page.editTextCell.editText.setHint(LocaleController.getString(page.commentOption.optional ? R.string.Report2CommentOptional : R.string.Report2Comment));
                        UItem uItemAsCustom2 = UItem.asCustom(page.editTextCell);
                        uItemAsCustom2.id = -3;
                        arrayList4.add(uItemAsCustom2);
                        ArrayList arrayList5 = reportBottomSheet.messageIds;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            long j = reportBottomSheet.dialogId;
                            if (DialogObject.isUserDialog(j)) {
                                String string5 = LocaleController.getString(R.string.Report2CommentInfoUser);
                                UItem uItem7 = new UItem(7);
                                uItem7.text = string5;
                                arrayList4.add(uItem7);
                            } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(((BottomSheet) reportBottomSheet).currentAccount).getChat(Long.valueOf(-j)))) {
                                String string6 = LocaleController.getString(R.string.Report2CommentInfoChannel);
                                UItem uItem8 = new UItem(7);
                                uItem8.text = string6;
                                arrayList4.add(uItem8);
                            } else {
                                String string7 = LocaleController.getString(R.string.Report2CommentInfoGroup);
                                UItem uItem9 = new UItem(7);
                                uItem9.text = string7;
                                arrayList4.add(uItem9);
                            }
                        } else {
                            String string8 = LocaleController.getString(reportBottomSheet.messageIds.size() > 1 ? R.string.Report2CommentInfoMany : R.string.Report2CommentInfo);
                            UItem uItem10 = new UItem(7);
                            uItem10.text = string8;
                            arrayList4.add(uItem10);
                        }
                        if (page.buttonContainer == null) {
                            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(page.getContext(), ((BottomSheet) reportBottomSheet).resourcesProvider, true);
                            page.button = buttonWithCounterView;
                            buttonWithCounterView.setText(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(page.getContext());
                            page.buttonContainer = frameLayout;
                            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, ((BottomSheet) reportBottomSheet).resourcesProvider));
                            page.buttonContainer.addView(page.button, LayoutHelper.createFrame(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(page.getContext());
                            view.setBackgroundColor(Theme.getColor(Theme.key_divider, ((BottomSheet) reportBottomSheet).resourcesProvider));
                            page.buttonContainer.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 48));
                        }
                        page.button.setEnabled(page.commentOption.optional || !TextUtils.isEmpty(page.editTextCell.getText()));
                        page.button.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(page, 27));
                        UItem uItemAsCustom3 = UItem.asCustom(page.buttonContainer);
                        uItemAsCustom3.id = -4;
                        arrayList4.add(uItemAsCustom3);
                        measuredHeight2 += 112;
                    }
                    ((UItem) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList4)).hideDivider = true;
                    if (reportBottomSheet.sponsored && page.pageType == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(page.getContext());
                        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(reportBottomSheet.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(page.getContext(), R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ((BottomSheet) reportBottomSheet).resourcesProvider)), 0, 0);
                        combinedDrawable.fullSize = true;
                        frameLayout2.setBackground(combinedDrawable);
                        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(page.getContext(), null);
                        linksTextView.setTextSize(1, 14.0f);
                        linksTextView.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), ((BottomSheet) reportBottomSheet).resourcesProvider));
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, ((BottomSheet) reportBottomSheet).resourcesProvider));
                        linksTextView.setGravity(17);
                        frameLayout2.addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        UItem uItemAsCustom4 = UItem.asCustom(frameLayout2);
                        uItemAsCustom4.id = -3;
                        arrayList4.add(uItemAsCustom4);
                        measuredHeight2 += 46;
                    }
                }
                UniversalRecyclerView universalRecyclerView = page.listView;
                if (universalRecyclerView != null) {
                    if (((BottomSheet) reportBottomSheet).containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight2)) {
                        universalRecyclerView.layoutManager.setReverseLayout(false);
                    } else {
                        Collections.reverse(arrayList4);
                        universalRecyclerView.layoutManager.setReverseLayout(true);
                    }
                }
                break;
            case 7:
                ((ArrayList) obj).add(UItem.asCustom(((RevenueSharingAdsInfoBottomSheet) obj3).customView));
                break;
            case 8:
                ((ArrayList) obj).add(UItem.asCustom(((SearchAdsInfoBottomSheet) obj3).customView));
                break;
            case 9:
                ((SecretMediaViewer) obj3).getClass();
                break;
            case 10:
                ((SelectChatUserSheet) obj3).fillItems$36((ArrayList) obj);
                break;
            case 11:
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                SelectChatUserSheet.ParticipantsList participantsList = (SelectChatUserSheet.ParticipantsList) obj3;
                ArrayList arrayList6 = participantsList.listeners;
                ArrayList arrayList7 = participantsList.users;
                if (tL_error2 != null) {
                    if (participantsList.clearOnLoad) {
                        arrayList7.clear();
                        z = false;
                        participantsList.clearOnLoad = false;
                    } else {
                        z = false;
                    }
                    int i8 = 1;
                    participantsList.endReached = true;
                    participantsList.loading = z;
                    int size = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj4 = arrayList6.get(i9);
                        i9 += i8;
                        ((Runnable) obj4).run();
                        i8 = 1;
                    }
                } else {
                    int i10 = participantsList.currentAccount;
                    MessagesController.getInstance(i10).putUsers(channels_channelparticipants.users, false);
                    MessagesController.getInstance(i10).putChats(channels_channelparticipants.chats, false);
                    if (participantsList.clearOnLoad) {
                        arrayList7.clear();
                        participantsList.clearOnLoad = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList8 = channels_channelparticipants.participants;
                    int size2 = arrayList8.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList8.get(i11);
                        i11++;
                        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                        if (userOrChat != null) {
                            arrayList7.add(userOrChat);
                        }
                    }
                    int i12 = 1;
                    if (channels_channelparticipants.participants.size() < 30) {
                        participantsList.endReached = true;
                    }
                    participantsList.loading = false;
                    int size3 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj5 = arrayList6.get(i13);
                        i13 += i12;
                        ((Runnable) obj5).run();
                        i12 = 1;
                    }
                }
                break;
            case 12:
                ArrayList arrayList9 = (ArrayList) obj;
                SelectStoriesBottomSheet selectStoriesBottomSheet = (SelectStoriesBottomSheet) obj3;
                StoriesController.StoriesList storiesList = selectStoriesBottomSheet.storiesList;
                if (storiesList != null) {
                    int iDp = AndroidUtilities.dp(16.0f);
                    UItem uItem11 = new UItem(28);
                    uItem11.intValue = iDp;
                    arrayList9.add(uItem11);
                    ArrayList arrayList10 = storiesList.messageObjects;
                    int size4 = arrayList10.size();
                    int i14 = selectStoriesBottomSheet.columnsCount;
                    int i15 = i14;
                    int i16 = 0;
                    while (i16 < size4) {
                        Object obj6 = arrayList10.get(i16);
                        i16++;
                        MessageObject messageObject = (MessageObject) obj6;
                        int i17 = StoryCellFactory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(StoryCellFactory.class);
                        uItemOfFactory.spanCount = 1;
                        uItemOfFactory.intValue = 0;
                        uItemOfFactory.object = messageObject;
                        uItemOfFactory.longValue = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
                        uItemOfFactory.collapsed = true;
                        uItemOfFactory.parentSpanCount = i14;
                        uItemOfFactory.setChecked(selectStoriesBottomSheet.selectedStoriesIds.containsKey(Integer.valueOf(messageObject.getId())));
                        uItemOfFactory.spanCount = 1;
                        arrayList9.add(uItemOfFactory);
                        i15--;
                        if (i15 == 0) {
                            i15 = i14;
                        }
                    }
                    if (storiesList.isLoading() || !storiesList.done) {
                        int i18 = 0;
                        while (true) {
                            if (i18 < (i15 <= 0 ? i14 : i15)) {
                                i18++;
                                UItem uItemAsFlicker = UItem.asFlicker(i18, 34);
                                uItemAsFlicker.spanCount = 1;
                                arrayList9.add(uItemAsFlicker);
                            }
                        }
                    }
                    int iDp2 = AndroidUtilities.dp(68.0f);
                    UItem uItem12 = new UItem(28);
                    uItem12.intValue = iDp2;
                    arrayList9.add(uItem12);
                    break;
                }
                break;
            case 13:
                ((SettingsActivity) obj3).fillItems$14((ArrayList) obj);
                break;
            case 14:
                ArrayList arrayList11 = (ArrayList) obj;
                StakedDiceSheet stakedDiceSheet = (StakedDiceSheet) obj3;
                LinearLayout linearLayout = stakedDiceSheet.topView;
                if (linearLayout != null) {
                    arrayList11.add(UItem.asCustom(linearLayout));
                }
                LinearLayout linearLayout2 = stakedDiceSheet.editView;
                if (linearLayout2 != null) {
                    arrayList11.add(UItem.asCustom(linearLayout2));
                }
                break;
            case 15:
                ((BotStarsActivity) obj3).fillItems$15((ArrayList) obj);
                break;
            case 16:
                ArrayList arrayList12 = (ArrayList) obj;
                ExplainStarsSheet explainStarsSheet = (ExplainStarsSheet) obj3;
                arrayList12.add(UItem.asCustom(explainStarsSheet.headerView));
                int i19 = R.drawable.msg_gift_premium;
                String string9 = LocaleController.getString(R.string.ExplainStarsFeature1Title);
                String string10 = LocaleController.getString(R.string.ExplainStarsFeature1Text);
                int i20 = ExplainStarsSheet.FeatureCell.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
                uItemOfFactory2.selectable = false;
                uItemOfFactory2.intValue = i19;
                uItemOfFactory2.text = string9;
                uItemOfFactory2.subtext = string10;
                arrayList12.add(uItemOfFactory2);
                int i21 = R.drawable.msg_bot;
                String string11 = LocaleController.getString(R.string.ExplainStarsFeature2Title);
                CharSequence charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new ProfileActivity$9$$ExternalSyntheticLambda1(explainStarsSheet, 19)), true);
                UItem uItemOfFactory3 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
                uItemOfFactory3.selectable = false;
                uItemOfFactory3.intValue = i21;
                uItemOfFactory3.text = string11;
                uItemOfFactory3.subtext = charSequenceReplaceArrows;
                arrayList12.add(uItemOfFactory3);
                int i22 = R.drawable.menu_unlock;
                String string12 = LocaleController.getString(R.string.ExplainStarsFeature3Title);
                String string13 = LocaleController.getString(R.string.ExplainStarsFeature3Text);
                UItem uItemOfFactory4 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
                uItemOfFactory4.selectable = false;
                uItemOfFactory4.intValue = i22;
                uItemOfFactory4.text = string12;
                uItemOfFactory4.subtext = string13;
                arrayList12.add(uItemOfFactory4);
                int i23 = R.drawable.menu_feature_paid;
                String string14 = LocaleController.getString(R.string.ExplainStarsFeature4Title);
                String string15 = LocaleController.getString(R.string.ExplainStarsFeature4Text);
                UItem uItemOfFactory5 = UItem.ofFactory(ExplainStarsSheet.FeatureCell.Factory.class);
                uItemOfFactory5.selectable = false;
                uItemOfFactory5.intValue = i23;
                uItemOfFactory5.text = string14;
                uItemOfFactory5.subtext = string15;
                arrayList12.add(uItemOfFactory5);
                int iDp3 = AndroidUtilities.dp(68.0f);
                UItem uItem13 = new UItem(28);
                uItem13.intValue = iDp3;
                arrayList12.add(uItem13);
                break;
            case 17:
                ArrayList arrayList13 = (ArrayList) obj;
                UItem uItem14 = ((GiftOfferSheet) obj3).mainItem;
                if (uItem14 != null) {
                    arrayList13.add(uItem14);
                }
                break;
            case 18:
                ArrayList arrayList14 = (ArrayList) obj;
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj3;
                ArrayList arrayList15 = starGiftPreviewSheet.models;
                if (arrayList15 != null && (arrayList = starGiftPreviewSheet.backdrops) != null && (arrayList2 = starGiftPreviewSheet.patterns) != null) {
                    int iDp4 = AndroidUtilities.dp(315.0f);
                    UItem uItem15 = new UItem(28);
                    uItem15.intValue = iDp4;
                    arrayList14.add(uItem15);
                    BagRandomizer bagRandomizer = starGiftPreviewSheet.rBackdrops;
                    bagRandomizer.currentIndex = 0;
                    bagRandomizer.next();
                    BagRandomizer bagRandomizer2 = starGiftPreviewSheet.rPatterns;
                    bagRandomizer2.currentIndex = 0;
                    bagRandomizer2.next();
                    BagRandomizer bagRandomizer3 = starGiftPreviewSheet.rModels;
                    bagRandomizer3.currentIndex = 0;
                    bagRandomizer3.next();
                    int i24 = starGiftPreviewSheet.tabsSelectorView.selectedTab;
                    if (i24 == 0) {
                        boolean z2 = starGiftPreviewSheet.crafting;
                        arrayList14.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z2 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList15.size()))));
                        int size5 = arrayList15.size();
                        int i25 = 0;
                        while (i25 < size5) {
                            Object obj7 = arrayList15.get(i25);
                            i25 += i3;
                            StarGiftPreviewSheet.Attributes attributes = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) obj7);
                            int i26 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                            UItem uItemOfFactory6 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class);
                            uItemOfFactory6.spanCount = 1;
                            uItemOfFactory6.intValue = i24;
                            uItemOfFactory6.object = attributes;
                            arrayList14.add(uItemOfFactory6);
                            i3 = 1;
                        }
                        ArrayList arrayList16 = starGiftPreviewSheet.simpleModels;
                        if (!arrayList16.isEmpty()) {
                            arrayList14.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z2 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList15.size()))));
                            int size6 = arrayList16.size();
                            int i27 = 0;
                            while (i27 < size6) {
                                Object obj8 = arrayList16.get(i27);
                                i27++;
                                StarGiftPreviewSheet.Attributes attributes2 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) obj8);
                                int i28 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                                UItem uItemOfFactory7 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class);
                                uItemOfFactory7.spanCount = 1;
                                uItemOfFactory7.intValue = i24;
                                uItemOfFactory7.object = attributes2;
                                arrayList14.add(uItemOfFactory7);
                            }
                        }
                    } else {
                        int i29 = 1;
                        if (i24 == 1) {
                            arrayList14.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList.size()))));
                            int size7 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size7) {
                                Object obj9 = arrayList.get(i30);
                                i30 += i29;
                                StarGiftPreviewSheet.Attributes attributes3 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) obj9, (TL_stars.starGiftAttributePattern) bagRandomizer2.next(), (TL_stars.starGiftAttributeModel) bagRandomizer3.next());
                                int i31 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                                UItem uItemOfFactory8 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class);
                                uItemOfFactory8.spanCount = i29;
                                uItemOfFactory8.intValue = i24;
                                uItemOfFactory8.object = attributes3;
                                arrayList14.add(uItemOfFactory8);
                                i29 = 1;
                            }
                        } else if (i24 == 2) {
                            arrayList14.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList2.size()))));
                            int size8 = arrayList2.size();
                            int i32 = 0;
                            while (i32 < size8) {
                                Object obj10 = arrayList2.get(i32);
                                i32++;
                                StarGiftPreviewSheet.Attributes attributes4 = new StarGiftPreviewSheet.Attributes((TL_stars.starGiftAttributeBackdrop) bagRandomizer.next(), (TL_stars.starGiftAttributePattern) obj10, (TL_stars.starGiftAttributeModel) bagRandomizer3.next());
                                int i33 = StarGiftPreviewSheet.GiftAttributeCell.Factory.$r8$clinit;
                                UItem uItemOfFactory9 = UItem.ofFactory(StarGiftPreviewSheet.GiftAttributeCell.Factory.class);
                                uItemOfFactory9.spanCount = 1;
                                uItemOfFactory9.intValue = i24;
                                uItemOfFactory9.object = attributes4;
                                arrayList14.add(uItemOfFactory9);
                            }
                        }
                    }
                    break;
                }
                break;
            case 19:
                Long l = (Long) obj;
                Boolean bool = (Boolean) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                if (callback2 != null) {
                    callback2.run(l, bool);
                }
                break;
            case 20:
                ((StarsIntroActivity) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 21:
                ((StarsIntroActivity.GiftStarsSheet) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 22:
                ((StarsIntroActivity.StarsNeededSheet) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 23:
                ((StarsIntroActivity.StarsOptionsSheet) obj3).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 24:
                ArrayList arrayList17 = (ArrayList) obj;
                StarsIntroActivity.StarsTransactionsLayout.Page page2 = (StarsIntroActivity.StarsTransactionsLayout.Page) obj3;
                int i34 = page2.currentAccount;
                int i35 = page2.type;
                long j2 = page2.bot_id;
                if (j2 != 0) {
                    BotStarsController botStarsController = BotStarsController.getInstance(i34);
                    ArrayList arrayList18 = botStarsController.getTransactionsState(j2).transactions[i35];
                    int size9 = arrayList18.size();
                    while (i2 < size9) {
                        Object obj11 = arrayList18.get(i2);
                        i2++;
                        int i36 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory10 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory10.object = (TL_stars.StarsTransaction) obj11;
                        uItemOfFactory10.accent = true;
                        arrayList17.add(uItemOfFactory10);
                    }
                    if (!botStarsController.getTransactionsState(j2).endReached[i35]) {
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                    }
                } else {
                    StarsController starsController = StarsController.getInstance(i34, page2.ton);
                    ArrayList arrayList19 = starsController.transactions[i35];
                    int size10 = arrayList19.size();
                    int i37 = 0;
                    while (i37 < size10) {
                        Object obj12 = arrayList19.get(i37);
                        i37++;
                        int i38 = StarsIntroActivity.StarsTransactionView.Factory.$r8$clinit;
                        UItem uItemOfFactory11 = UItem.ofFactory(StarsIntroActivity.StarsTransactionView.Factory.class);
                        uItemOfFactory11.object = (TL_stars.StarsTransaction) obj12;
                        uItemOfFactory11.accent = false;
                        arrayList17.add(uItemOfFactory11);
                    }
                    if (!starsController.endReached[i35]) {
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                        arrayList17.add(UItem.asFlicker(arrayList17.size(), 7));
                    }
                }
                break;
            case 25:
                ArrayList arrayList20 = (ArrayList) obj;
                ((BotPreviewsEditContainer.ChooseLanguageSheet) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size11 = languages.size();
                while (i2 < size11) {
                    TranslateController.Language language = languages.get(i2);
                    i2++;
                    int i39 = BotPreviewsEditContainer.ChooseLanguageSheet.LanguageView.Factory.$r8$clinit;
                    UItem uItemOfFactory12 = UItem.ofFactory(BotPreviewsEditContainer.ChooseLanguageSheet.LanguageView.Factory.class);
                    uItemOfFactory12.object = language;
                    arrayList20.add(uItemOfFactory12);
                }
                break;
            case 26:
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                CaptionContainerView captionContainerView = (CaptionContainerView) obj3;
                boolean zCustomBlur = captionContainerView.customBlur();
                CaptionContainerView.AnonymousClass3 anonymousClass3 = captionContainerView.editText;
                if (!zCustomBlur) {
                    Paint paint$1 = captionContainerView.captionBlur.getPaint$1(1.0f);
                    anonymousClass3.getEditText().setHintColor(paint$1 == null ? -2130706433 : -1);
                    if (paint$1 == null) {
                        runnable.run();
                    } else {
                        EditTextCaption editText = anonymousClass3.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), paint$1);
                        canvas.restore();
                    }
                } else if (captionContainerView.hintTextBitmap == null) {
                    runnable.run();
                } else {
                    EditTextCaption editText2 = anonymousClass3.getEditText();
                    canvas.translate(-editText2.hintLayoutX, 0.0f);
                    canvas.saveLayerAlpha(0.0f, 0.0f, captionContainerView.hintTextBitmap.getWidth(), captionContainerView.hintTextBitmap.getHeight(), 255, 31);
                    RectF rectF = captionContainerView.rectF;
                    rectF.set(0.0f, 1.0f, captionContainerView.hintTextBitmap.getWidth(), captionContainerView.hintTextBitmap.getHeight() - 1);
                    captionContainerView.drawBlur(captionContainerView.captionBlur, canvas, rectF, 0.0f, true, (-anonymousClass3.getX()) - editText2.getPaddingLeft(), ((-anonymousClass3.getY()) - editText2.getPaddingTop()) - editText2.getExtendedPaddingTop(), true);
                    canvas.save();
                    Paint paint2 = captionContainerView.hintTextBitmapPaint;
                    paint2.setAlpha(165);
                    canvas.drawBitmap(captionContainerView.hintTextBitmap, 0.0f, 0.0f, paint2);
                    canvas.restore();
                    canvas.restore();
                }
                break;
            case 27:
                String str = (String) obj;
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) obj3;
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                emojiBottomSheet.query = str;
                emojiBottomSheet.categoryIndex = ((Integer) obj2).intValue();
                gifPage.adapter.updateItems(str);
                break;
            case 28:
                String str2 = (String) obj;
                EmojiBottomSheet.Page page3 = (EmojiBottomSheet.Page) obj3;
                EmojiBottomSheet emojiBottomSheet2 = EmojiBottomSheet.this;
                emojiBottomSheet2.query = str2;
                emojiBottomSheet2.categoryIndex = ((Integer) obj2).intValue();
                page3.adapter.updateItems$1(str2);
                break;
            default:
                GallerySheet gallerySheet = (GallerySheet) obj3;
                if (obj == null) {
                    gallerySheet.getClass();
                } else if (gallerySheet.galleryListViewOpening == null && (obj instanceof MediaController.PhotoEntry) && (callback = gallerySheet.onGalleryListener) != null) {
                    callback.run((MediaController.PhotoEntry) obj);
                }
                break;
        }
    }
}
