package org.telegram.ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Log;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.TimezonesController;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.BulletinFactory$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ColorPicker$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FlatCheckBox;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.VideoCompressButton;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda19;

public final class PhotoViewer$$ExternalSyntheticLambda52 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda52(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        Integer num;
        int i5 = 6;
        int i6 = 21;
        int i7 = 3;
        BottomSheet.Builder builder = null;
        CharSequence charSequenceCoerceToText = null;
        attributes = null;
        StarGiftPreviewSheet.Attributes attributes = null;
        int i8 = 0;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                Activity activity = (Activity) this.f$1;
                if (!photoViewer.isCaptionOpen() && !photoViewer.muteVideo) {
                    int i9 = photoViewer.currentIndex;
                    if (i9 >= 0 && i9 < photoViewer.imagesArrLocals.size()) {
                        Object obj = photoViewer.imagesArrLocals.get(photoViewer.currentIndex);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer.compressItem.setPhotoState(photoEntry.isHighQuality());
                                boolean zIsHighQuality = photoEntry.isHighQuality();
                                HintView2 hintView2 = photoViewer.compressPhotoHint;
                                if (hintView2 != null) {
                                    hintView2.hide(true);
                                    photoViewer.compressPhotoHint = null;
                                }
                                if (photoViewer.activityContext == null) {
                                    i = 0;
                                } else {
                                    photoViewer.compressPhotoHint = new HintView2(photoViewer.activityContext, 3);
                                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(zIsHighQuality ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
                                    spannableStringBuilderAppend.setSpan(new ColoredImageSpan(zIsHighQuality ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled), 0, 1, 33);
                                    photoViewer.compressPhotoHint.setText(spannableStringBuilderAppend);
                                    photoViewer.containerView.addView(photoViewer.compressPhotoHint, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer.compressPhotoHint.setTranslationY(photoViewer.pickerView.getTranslationY());
                                    photoViewer.compressPhotoHint.setJointPx(0.0f, (photoViewer.compressItem.getWidth() / 2.0f) + photoViewer.compressItem.getX() + photoViewer.itemsLayout.getX());
                                    HintView2 hintView3 = photoViewer.compressPhotoHint;
                                    i = 0;
                                    hintView3.onHidden = new PhotoViewer$$ExternalSyntheticLambda127(hintView3, i);
                                    hintView3.duration = 3500L;
                                    hintView3.show();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", i).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                            }
                        }
                    }
                    if (photoViewer.compressItem.getTag() != null) {
                        photoViewer.showQualityView(true);
                        photoViewer.requestVideoPreview(1);
                    } else if (photoViewer.videoConvertSupported) {
                        if (photoViewer.tooltip == null) {
                            photoViewer.tooltip = new Tooltip(activity, photoViewer.containerView);
                        }
                        photoViewer.tooltip.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                        Tooltip tooltip = photoViewer.tooltip;
                        VideoCompressButton videoCompressButton = photoViewer.compressItem;
                        if (videoCompressButton != null) {
                            tooltip.anchor = videoCompressButton;
                            tooltip.updateTooltipPosition();
                            tooltip.showing = true;
                            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = tooltip.dismissRunnable;
                            AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
                            AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = tooltip.animator;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                tooltip.animator.cancel();
                                tooltip.animator = null;
                            }
                            if (tooltip.getVisibility() != 0) {
                                tooltip.setAlpha(0.0f);
                                tooltip.setVisibility(0);
                                ViewPropertyAnimator listener = tooltip.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                tooltip.animator = listener;
                                listener.start();
                            }
                        } else {
                            tooltip.getClass();
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((PaymentFormActivity) this.f$0).lambda$createView$23(view, (String) this.f$1);
                break;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f$0;
                if (photoViewer2.currentMessageObject != null) {
                    ((ItemOptions) this.f$1).dismiss();
                    BaseFragment baseFragment = photoViewer2.parentFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).logSponsoredClicked(photoViewer2.currentMessageObject, false, true);
                    }
                    Browser.openUrl(photoViewer2.activityContext, Uri.parse(photoViewer2.currentMessageObject.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer2.currentAccount).sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 3:
                ((ItemOptions) this.f$0).openSwipeback((ItemOptions) this.f$1);
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f$0;
                privacySettingsActivity.getClass();
                ((AlertDialog.Builder) this.f$1).alertDialog.dismissRunnable.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i2 = 30;
                } else if (num2.intValue() == 1) {
                    i2 = 90;
                } else if (num2.intValue() == 2) {
                    i2 = 182;
                } else if (num2.intValue() == 3) {
                    i2 = 365;
                } else if (num2.intValue() == 4) {
                    i2 = 548;
                } else {
                    i2 = num2.intValue() == 5 ? 730 : 0;
                }
                AlertDialog alertDialog = new AlertDialog(privacySettingsActivity.getParentActivity(), 3, null);
                alertDialog.canCacnel = false;
                alertDialog.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i2;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new LinkManager$$ExternalSyntheticLambda0(privacySettingsActivity, alertDialog, setaccountttl, 21));
                break;
            case 5:
                Bulletin bulletin = Bulletin.visibleBulletin;
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (bulletin != null) {
                    profileActivity.getClass();
                    bulletin.hide();
                }
                Browser.openUrl(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f$1).url);
                break;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                long j = profileActivity2.userId;
                long j2 = profileActivity2.banFromGroup;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.currentChannelParticipant;
                final ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, j2, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    public final TLRPC.Chat val$chat;
                    public final ChatRightsEditActivity val$fragment;

                    public AnonymousClass18() {
                        chat = chat;
                        chatRightsEditActivity = chatRightsEditActivity;
                    }

                    @Override
                    public final void didChangeOwner(TLRPC.User user) {
                        ProfileActivity profileActivity3 = ProfileActivity.this;
                        profileActivity3.undoView.showWithAction(-profileActivity3.chatId, profileActivity3.currentChat.megagroup ? 10 : 9, user, (Object) null, (Runnable) null, (Runnable) null);
                    }

                    @Override
                    public final void didSetRights(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str3) {
                        ProfileActivity profileActivity3 = ProfileActivity.this;
                        profileActivity3.removeSelfFromStack();
                        TLRPC.User user = profileActivity3.getMessagesController().getUser(Long.valueOf(profileActivity3.userId));
                        if (user == null || profileActivity3.userId == 0) {
                            return;
                        }
                        ChatRightsEditActivity chatRightsEditActivity2 = chatRightsEditActivity;
                        if (!chatRightsEditActivity2.banning || chatRightsEditActivity2.getParentLayout() == null) {
                            return;
                        }
                        for (BaseFragment baseFragment2 : ((ActionBarLayout) chatRightsEditActivity2.getParentLayout()).getFragmentStack()) {
                            if (baseFragment2 instanceof ChannelAdminLogActivity) {
                                ((ChannelAdminLogActivity) baseFragment2).reloadLastMessages();
                                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8((ChannelAdminLogActivity) baseFragment2, user, chat, 12));
                                return;
                            }
                        }
                    }
                };
                profileActivity2.presentFragment(chatRightsEditActivity);
                break;
            case 7:
                StringBuilder sb = new StringBuilder();
                ProxySettingsActivity proxySettingsActivity = (ProxySettingsActivity) this.f$0;
                String string = proxySettingsActivity.inputFields[0].getText().toString();
                String string2 = proxySettingsActivity.inputFields[3].getText().toString();
                String string3 = proxySettingsActivity.inputFields[2].getText().toString();
                String string4 = proxySettingsActivity.inputFields[1].getText().toString();
                String string5 = proxySettingsActivity.inputFields[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(string)) {
                        sb.append("server=");
                        sb.append(URLEncoder.encode(string, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("port=");
                        sb.append(URLEncoder.encode(string4, "UTF-8"));
                    }
                    if (proxySettingsActivity.currentType != 1) {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(string3)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("user=");
                            sb.append(URLEncoder.encode(string3, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("pass=");
                            sb.append(URLEncoder.encode(string2, "UTF-8"));
                            str2 = "https://t.me/socks?";
                        }
                        if (sb.length() == 0) {
                            StringBuilder sbM = Log.m(str);
                            sbM.append(sb.toString());
                            QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet((Context) this.f$1, LocaleController.getString(R.string.ShareQrCode), sbM.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                            qRCodeBottomSheet.iconImage.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                            proxySettingsActivity.showDialog(qRCodeBottomSheet);
                            break;
                        }
                    } else {
                        str2 = "https://t.me/proxy?";
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("secret=");
                        sb.append(URLEncoder.encode(string5, "UTF-8"));
                    }
                    str = str2;
                    if (sb.length() == 0) {
                        StringBuilder sbM2 = Log.m(str);
                        sbM2.append(sb.toString());
                        QRCodeBottomSheet qRCodeBottomSheet2 = new QRCodeBottomSheet((Context) this.f$1, LocaleController.getString(R.string.ShareQrCode), sbM2.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        qRCodeBottomSheet2.iconImage.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        proxySettingsActivity.showDialog(qRCodeBottomSheet2);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 8:
                SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.f$0;
                if (anonymousClass1.dateBottomSheet == null) {
                    boolean[] zArr = new boolean[1];
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 = new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(i8, anonymousClass1, zArr);
                    Pattern pattern = AlertsCreator.URL_PATTERN;
                    Context context = (Context) this.f$1;
                    if (context != null) {
                        int color = Theme.getColor(null, Theme.key_dialogTextBlack, false);
                        int color2 = Theme.getColor(null, Theme.key_dialogBackground, false);
                        Theme.getColor(null, Theme.key_sheet_other, false);
                        Theme.getColor(null, Theme.key_player_actionBarSelector, false);
                        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
                        Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
                        Theme.getColor(null, Theme.key_listSelector, false);
                        int color3 = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
                        int color4 = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
                        int color5 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
                        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, null);
                        BottomSheet bottomSheet = builder2.bottomSheet;
                        bottomSheet.applyBottomPadding = false;
                        NumberPicker numberPicker = new NumberPicker(context, 18, null);
                        numberPicker.setTextColor(color);
                        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
                        numberPicker.setItemCount(5);
                        AlertsCreator.AnonymousClass41 anonymousClass41 = new AlertsCreator.AnonymousClass41(context, 18, null);
                        anonymousClass41.setItemCount(5);
                        anonymousClass41.setTextColor(color);
                        anonymousClass41.setTextOffset(-AndroidUtilities.dp(10.0f));
                        AlertsCreator.AnonymousClass42 anonymousClass42 = new AlertsCreator.AnonymousClass42(context, 18, null);
                        anonymousClass42.setItemCount(5);
                        anonymousClass42.setTextColor(color);
                        anonymousClass42.setTextOffset(-AndroidUtilities.dp(34.0f));
                        AlertsCreator.AnonymousClass27 anonymousClass27 = new AlertsCreator.AnonymousClass27(context, numberPicker, anonymousClass41, anonymousClass42, 3);
                        anonymousClass27.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context);
                        anonymousClass27.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(color);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        anonymousClass27.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        AlertsCreator.AnonymousClass44 anonymousClass44 = new AlertsCreator.AnonymousClass44(context);
                        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(365);
                        numberPicker.setWrapSelectorWheel(false);
                        numberPicker.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(21));
                        ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248 = new ChatActivity$$ExternalSyntheticLambda248(numberPicker, anonymousClass41, anonymousClass42, 19);
                        numberPicker.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
                        anonymousClass41.setMinValue(0);
                        anonymousClass41.setMaxValue(23);
                        linearLayout.addView(anonymousClass41, LayoutHelper.createLinear(0.2f, 0, 270));
                        anonymousClass41.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(22));
                        anonymousClass41.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
                        anonymousClass42.setMinValue(0);
                        anonymousClass42.setMaxValue(59);
                        anonymousClass42.setValue(0);
                        anonymousClass42.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(23));
                        linearLayout.addView(anonymousClass42, LayoutHelper.createLinear(0.3f, 0, 270));
                        anonymousClass42.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda248);
                        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis != 2147483646) {
                            long j3 = jCurrentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j3);
                            if (timeInMillis >= 0) {
                                anonymousClass42.setValue(calendar.get(12));
                                anonymousClass41.setValue(calendar.get(11));
                                numberPicker.setValue(timeInMillis);
                            }
                        }
                        AlertsCreator.checkScheduleDate(null, null, 0L, 0L, 0, numberPicker, anonymousClass41, anonymousClass42);
                        anonymousClass44.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        anonymousClass44.setGravity(17);
                        anonymousClass44.setTextColor(color3);
                        anonymousClass44.setTextSize(1, 14.0f);
                        anonymousClass44.setTypeface(AndroidUtilities.bold());
                        int iDp = AndroidUtilities.dp(8.0f);
                        anonymousClass44.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color4, color5, color5));
                        anonymousClass44.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        anonymousClass27.addView(anonymousClass44, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
                        anonymousClass44.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(numberPicker, anonymousClass41, anonymousClass42, calendar, selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10, builder2, 1));
                        bottomSheet.customView = anonymousClass27;
                        bottomSheet.show();
                        bottomSheet.setBackgroundColor(color2);
                        bottomSheet.fixNavigationBar(color2);
                        builder = builder2;
                    }
                    builder.bottomSheet.setOnHideListener(new VoIPFragment$$ExternalSyntheticLambda16(11, anonymousClass1, zArr));
                    BottomSheet bottomSheet2 = builder.bottomSheet;
                    bottomSheet2.show();
                    anonymousClass1.dateBottomSheet = bottomSheet2;
                    anonymousClass1.animateMenuShow(false);
                    break;
                }
                break;
            case 9:
                SelectStoriesBottomSheet selectStoriesBottomSheet = (SelectStoriesBottomSheet) this.f$0;
                if (selectStoriesBottomSheet.storiesList.getCount() != 0) {
                    ((BulletinFactory$$ExternalSyntheticLambda4) this.f$1).run(new ArrayList(selectStoriesBottomSheet.selectedStoriesIds.values()));
                    selectStoriesBottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 10:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f$0;
                sessionsActivity.getClass();
                ((AlertDialog.Builder) this.f$1).alertDialog.dismissRunnable.run();
                Integer num3 = (Integer) view.getTag();
                if (num3.intValue() == 0) {
                    i3 = 7;
                } else if (num3.intValue() == 1) {
                    i3 = 90;
                } else if (num3.intValue() == 2) {
                    i3 = 183;
                } else {
                    i3 = num3.intValue() == 3 ? 365 : 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i3;
                sessionsActivity.ttlDays = i3;
                SessionsActivity.ListAdapter listAdapter = sessionsActivity.listAdapter;
                if (listAdapter != null) {
                    listAdapter.mObservable.notifyChanged();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new PassportActivity$$ExternalSyntheticLambda1(1));
                break;
            case 11:
                String ton = StarsIntroActivity.formatTON(((Long) this.f$1).longValue());
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$0;
                editTextBoldCursor.setText(ton);
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 12:
                ((BotStarsActivity) this.f$0).lambda$createView$7((Context) this.f$1, view);
                break;
            case 13:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) this.f$0;
                giftOfferSheet.getClass();
                String[] strArr = new String[6];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = GiftOfferSheet.ALLOWED_DURATIONS;
                    if (i10 >= 6) {
                        String string6 = LocaleController.getString(R.string.GiftOfferDuration);
                        PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(giftOfferSheet, 28);
                        Pattern pattern2 = AlertsCreator.URL_PATTERN;
                        TimezonesController timezonesController = TimezonesController.getInstance(UserConfig.selectedAccount);
                        timezonesController.load();
                        if (!timezonesController.timezones.isEmpty()) {
                            int color6 = Theme.getColor(null, Theme.key_dialogTextBlack, false);
                            int color7 = Theme.getColor(null, Theme.key_dialogBackground, false);
                            Theme.getColor(null, Theme.key_sheet_other, false);
                            Theme.getColor(null, Theme.key_player_actionBarSelector, false);
                            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
                            Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
                            Theme.getColor(null, Theme.key_listSelector, false);
                            Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
                            Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
                            Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
                            Context context2 = (Context) this.f$1;
                            BottomSheet bottomSheet3 = new BottomSheet(context2, null, false, false);
                            bottomSheet3.fixNavigationBar();
                            bottomSheet3.applyBottomPadding = false;
                            LinearLayout linearLayout2 = new LinearLayout(context2);
                            linearLayout2.setOrientation(0);
                            linearLayout2.setWeightSum(1.0f);
                            final NumberPicker numberPicker2 = new NumberPicker(context2, 18, null);
                            numberPicker2.setAllItemsCount(6);
                            numberPicker2.setItemCount(Math.min(6, 8));
                            numberPicker2.setTextColor(color6);
                            numberPicker2.setGravity(17);
                            numberPicker2.setMinValue(0);
                            numberPicker2.setMaxValue(5);
                            numberPicker2.setValue(i11);
                            linearLayout2.addView(numberPicker2, LayoutHelper.createLinear(1.0f, 0, 432));
                            numberPicker2.setFormatter(new ColorPicker$$ExternalSyntheticLambda6(strArr, 1));
                            LinearLayout linearLayout3 = new LinearLayout(context2) {
                                public boolean ignoreLayout = false;
                                public final NumberPicker val$picker;

                                public AnonymousClass69(Context context3) {
                                    super(context3);
                                    numberPicker = numberPicker2;
                                    this.ignoreLayout = false;
                                }

                                @Override
                                public final void onMeasure(int i12, int i13) {
                                    this.ignoreLayout = true;
                                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(42.0f) * 8;
                                    this.ignoreLayout = false;
                                    super.onMeasure(i12, i13);
                                }

                                @Override
                                public final void requestLayout() {
                                    if (this.ignoreLayout) {
                                        return;
                                    }
                                    super.requestLayout();
                                }
                            };
                            linearLayout3.setOrientation(1);
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            TextView textView2 = new TextView(context3);
                            textView2.setText(string6);
                            textView2.setTextColor(color6);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
                            linearLayout3.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
                            linearLayout3.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context3, null, true);
                            buttonWithCounterView.setText(LocaleController.getString(R.string.Select), false, true);
                            buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 2));
                            linearLayout3.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 0, 16, 12, 16, 12));
                            bottomSheet3.customView = linearLayout3;
                            bottomSheet3.show();
                            bottomSheet3.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(i5, pollItemMenu$$ExternalSyntheticLambda14, numberPicker2));
                            bottomSheet3.setBackgroundColor(color7);
                            bottomSheet3.fixNavigationBar(color7);
                            BottomSheet[] bottomSheetArr = {bottomSheet3};
                            break;
                        }
                    } else {
                        strArr[i10] = LocaleController.formatPluralString("GiftOfferHours", iArr[i10] / 3600, new Object[0]);
                        if (iArr[i10] == giftOfferSheet.selectedDuration) {
                            i11 = i10;
                        }
                        i10++;
                    }
                }
                break;
            case 14:
                SellGiftEnterPriceSheet sellGiftEnterPriceSheet = (SellGiftEnterPriceSheet) this.f$0;
                ButtonWithCounterView buttonWithCounterView2 = sellGiftEnterPriceSheet.buttonView;
                if (buttonWithCounterView2.enabled && !buttonWithCounterView2.loading) {
                    AndroidUtilities.hideKeyboard(sellGiftEnterPriceSheet.starsCountEditField);
                    buttonWithCounterView2.setLoading(true);
                    ((OAuthSheet$$ExternalSyntheticLambda13) this.f$1).run(sellGiftEnterPriceSheet.inputAmount);
                    break;
                }
                break;
            case 15:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.f$0;
                int i12 = starGiftPreviewSheet.mode;
                StarGiftPreviewSheet.AnonymousClass4 anonymousClass4 = starGiftPreviewSheet.topView;
                if (i12 == 2) {
                    anonymousClass4.setPreviewingAttributes((ArrayList) this.f$1);
                    starGiftPreviewSheet.setMode(1);
                } else if (i12 == 1) {
                    StarGiftPreviewSheet.Attributes attributes2 = new StarGiftPreviewSheet.Attributes(anonymousClass4.getUpgradeBackdropAttribute(), anonymousClass4.getUpgradePatternAttribute(), anonymousClass4.getUpgradeImageViewAttribute());
                    starGiftPreviewSheet.selectedAttributes = attributes2;
                    anonymousClass4.setPreviewAttributes(attributes2);
                    starGiftPreviewSheet.setMode(2);
                }
                break;
            case 16:
                StarGiftPreviewSheet starGiftPreviewSheet2 = StarGiftPreviewSheet.this;
                int i13 = starGiftPreviewSheet2.mode;
                StarGiftPreviewSheet.AnonymousClass4 anonymousClass5 = starGiftPreviewSheet2.topView;
                if (i13 == 1) {
                    starGiftPreviewSheet2.selectedAttributes = new StarGiftPreviewSheet.Attributes(anonymousClass5.getUpgradeBackdropAttribute(), anonymousClass5.getUpgradePatternAttribute(), anonymousClass5.getUpgradeImageViewAttribute());
                    starGiftPreviewSheet2.setMode(2);
                }
                int i14 = starGiftPreviewSheet2.tabsSelectorView.selectedTab;
                StarGiftPreviewSheet.Attributes attributes3 = starGiftPreviewSheet2.selectedAttributes;
                if (attributes3 != null) {
                    StarGiftPreviewSheet.Attributes attributes4 = (StarGiftPreviewSheet.Attributes) this.f$1;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = attributes3.model;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = attributes3.pattern;
                    if (i14 == 1) {
                        attributes = new StarGiftPreviewSheet.Attributes(attributes4.backdrop, stargiftattributepattern, stargiftattributemodel);
                    } else {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = attributes3.backdrop;
                        if (i14 == 2) {
                            attributes = new StarGiftPreviewSheet.Attributes(stargiftattributebackdrop, attributes4.pattern, stargiftattributemodel);
                        } else if (i14 == 0) {
                            attributes = new StarGiftPreviewSheet.Attributes(stargiftattributebackdrop, stargiftattributepattern, attributes4.model);
                        }
                    }
                }
                starGiftPreviewSheet2.selectedAttributes = attributes;
                anonymousClass5.setPreviewAttributes(attributes);
                starGiftPreviewSheet2.updateSelectedForVisibleViews();
                break;
            case 17:
                Browser.openUrlInSystemBrowser(((StarGiftSheet) this.f$0).getContext(), ((TL_stars.UniqueStarGiftValueInfo) this.f$1).fragment_listed_url);
                break;
            case 18:
                ((StarGiftSheet) this.f$0).showDeleteDescriptionAlert((CharSequence) this.f$1);
                break;
            case 19:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) this.f$0;
                if (craftTopView.variantsButton.getAlpha() >= 1.0f && !craftTopView.crafting && !craftTopView.failed && craftTopView.previewAttributes != null) {
                    new StarGiftPreviewSheet(craftTopView.getContext(), (Theme.ResourcesProvider) this.f$1, craftTopView.currentAccount, craftTopView.collectionTitle, craftTopView.previewAttributes, true).show();
                    break;
                }
                break;
            case 20:
                Browser.openUrl((Context) this.f$0, ((TL_stars.StarsTransaction) this.f$1).transaction_url);
                break;
            case 21:
                StatisticActivity statisticActivity = StatisticActivity.this;
                statisticActivity.getOrCreateStoryViewer().open(statisticActivity.getParentActivity(), ((StatisticActivity.RecentPostInfo) this.f$1).getId(), statisticActivity.storiesList, new StoriesListPlaceProvider(statisticActivity.recyclerListView, false));
                break;
            case 22:
                StatisticActivity.BaseChartCell.CheckBoxHolder checkBoxHolder = (StatisticActivity.BaseChartCell.CheckBoxHolder) this.f$0;
                FlatCheckBox flatCheckBox = checkBoxHolder.checkBox;
                if (flatCheckBox.enabled) {
                    StatisticActivity.BaseChartCell baseChartCell = StatisticActivity.BaseChartCell.this;
                    int size = baseChartCell.checkBoxes.size();
                    int i15 = 0;
                    while (true) {
                        i4 = checkBoxHolder.position;
                        if (i15 < size) {
                            if (i15 != i4) {
                                ArrayList arrayList = baseChartCell.checkBoxes;
                                if (!((StatisticActivity.BaseChartCell.CheckBoxHolder) arrayList.get(i15)).checkBox.enabled || !((StatisticActivity.BaseChartCell.CheckBoxHolder) arrayList.get(i15)).checkBox.checked) {
                                }
                            }
                            i15++;
                        } else {
                            i8 = 1;
                        }
                    }
                    baseChartCell.zoomCanceled();
                    if (i8 == 0) {
                        flatCheckBox.setChecked(!flatCheckBox.checked);
                        ((LineViewData) this.f$1).enabled = flatCheckBox.checked;
                        baseChartCell.chartView.onCheckChanged();
                        if (baseChartCell.data.activeZoom > 0) {
                            BaseChartView baseChartView = baseChartCell.zoomedChartView;
                            if (i4 < baseChartView.lines.size()) {
                                ((LineViewData) baseChartView.lines.get(i4)).enabled = flatCheckBox.checked;
                                baseChartView.onCheckChanged();
                            }
                        }
                    } else {
                        AndroidUtilities.shakeView(flatCheckBox);
                    }
                    break;
                }
                break;
            case 23:
                LivePlayer livePlayer = (LivePlayer) this.f$0;
                if (livePlayer != null) {
                    int i16 = UserConfig.selectedAccount;
                    int i17 = livePlayer.currentAccount;
                    if (i17 != i16) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity != null) {
                            launchActivity.switchToAccount(i17);
                        }
                    }
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        TL_stories.StoryItem storyItemFindStory = MessagesController.getInstance(i17).getStoriesController().findStory(livePlayer.storyId, livePlayer.dialogId);
                        if (storyItemFindStory == null) {
                            storyItemFindStory = livePlayer.storyItem;
                        }
                        if (storyItemFindStory != null) {
                            safeLastFragment.getOrCreateStoryViewer().open(i17, (Context) this.f$1, storyItemFindStory, (StoriesListPlaceProvider) null);
                            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda31(i7), 200L);
                            break;
                        }
                    }
                }
                break;
            case 24:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.getClass();
                StoryCaptionView.Panel panel = (StoryCaptionView.Panel) this.f$1;
                if (panel.peerId == null) {
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(peerStoriesView.storyContainer, peerStoriesView.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                    bulletinCreateSimpleBulletinWithIconSize.tag = 3;
                    bulletinCreateSimpleBulletinWithIconSize.show(true);
                } else {
                    Bundle bundle = new Bundle();
                    if (panel.peerId.longValue() >= 0) {
                        bundle.putLong("user_id", panel.peerId.longValue());
                    } else {
                        bundle.putLong("chat_id", -panel.peerId.longValue());
                    }
                    boolean z = panel.isRepostMessage;
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    if (z && (num = panel.messageId) != null) {
                        bundle.putInt("message_id", num.intValue());
                        storyViewer.presentFragment(new ChatActivity(bundle));
                    } else {
                        storyViewer.presentFragment(new ProfileActivity(bundle, null));
                    }
                }
                break;
            case 25:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.f$0;
                StoryViewer.this.showDialog(new PremiumFeatureBottomSheet(anonymousClass2.storyViewer.fragment, 14, false));
                ((BottomSheet) this.f$1).lambda$showGiftOfferSheet$15();
                break;
            case 26:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                anonymousClass8.getClass();
                EmojiPacksAlert alert = ((StoryContainsEmojiButton) this.f$1).getAlert();
                if (alert != null) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass8.this$0;
                    PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass3).delegate;
                    if (delegate != null) {
                        StoryViewer.this.showDialog(alert);
                        ActionBarPopupWindow actionBarPopupWindow = anonymousClass3.popupMenu.popupWindow;
                        if (actionBarPopupWindow != null) {
                            actionBarPopupWindow.dismiss(true);
                        }
                    }
                }
                break;
            case 27:
                GalleryListView galleryListView = (GalleryListView) this.f$0;
                galleryListView.selectAlbum((MediaController.AlbumEntry) this.f$1, false);
                galleryListView.dropDownContainer.closeSubMenu();
                break;
            case 28:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                try {
                    charSequenceCoerceToText = ((ClipboardManager) storyLinkSheet.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(storyLinkSheet.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequenceCoerceToText != null) {
                    EditTextCell editTextCell = storyLinkSheet.urlEditText;
                    editTextCell.editText.setText(charSequenceCoerceToText.toString());
                    EditTextCell.AnonymousClass2 anonymousClass6 = editTextCell.editText;
                    anonymousClass6.setSelection(0, anonymousClass6.getText().length());
                }
                ((TodoItemMenu$$ExternalSyntheticLambda9) this.f$1).run();
                break;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                storyRecorder.getClass();
                new StoryPrivacyBottomSheet.ChoosePeerSheet((Activity) this.f$1, storyRecorder.currentAccount, true, storyRecorder.livePeer, new StoryRecorder$$ExternalSyntheticLambda19(storyRecorder, i6), storyRecorder.resourcesProvider).show();
                break;
        }
    }
}
