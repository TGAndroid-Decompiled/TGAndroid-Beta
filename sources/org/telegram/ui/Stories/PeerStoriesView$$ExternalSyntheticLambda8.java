package org.telegram.ui.Stories;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class PeerStoriesView$$ExternalSyntheticLambda8 implements View.OnClickListener {
    public final int $r8$classId;
    public final StoriesViewPager.AnonymousClass2.AnonymousClass1 f$0;

    public PeerStoriesView$$ExternalSyntheticLambda8(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void onClick(View view) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        boolean z;
        CharSequence charSequenceReplaceEmoji;
        HintView2 hintView2;
        int measuredWidth;
        ActionBarPopupWindow actionBarPopupWindow;
        int i = 3;
        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TL_stories.StoryItem storyItem = anonymousClass1.currentStory.storyItem;
                if (storyItem != null) {
                    if (anonymousClass1.isSelf) {
                        anonymousClass1.editPrivacy(storyItem.privacy.isEmpty() ? new StoryPrivacyBottomSheet.StoryPrivacy(3, anonymousClass1.currentAccount, new ArrayList()) : new StoryPrivacyBottomSheet.StoryPrivacy(anonymousClass1.currentAccount, storyItem.privacy), storyItem);
                        break;
                    } else {
                        HintView2 hintView3 = anonymousClass1.privacyHint;
                        PeerStoriesView.AnonymousClass4 anonymousClass4 = anonymousClass1.storyContainer;
                        if (hintView3 == null) {
                            HintView2 hintView4 = new HintView2(anonymousClass1.getContext(), 1);
                            hintView4.setMultilineText(true);
                            hintView4.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
                            hintView4.onHidden = new PeerStoriesView$$ExternalSyntheticLambda7(anonymousClass1, 2);
                            anonymousClass1.privacyHint = hintView4;
                            hintView4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            anonymousClass4.addView(anonymousClass1.privacyHint, LayoutHelper.createFrame(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId));
                        if (user != null) {
                            String strSubstring = user.first_name;
                            int iIndexOf = strSubstring.indexOf(32);
                            if (iIndexOf > 0) {
                                strSubstring = strSubstring.substring(0, iIndexOf);
                            }
                            if (!storyItem.close_friends) {
                                if (storyItem.contacts) {
                                    anonymousClass1.privacyHint.setInnerPadding(11.0f, 6.0f, 11.0f, 7.0f);
                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, strSubstring));
                                    z = false;
                                } else if (storyItem.selected_contacts) {
                                    anonymousClass1.privacyHint.setInnerPadding(15.0f, 8.0f, 15.0f, 8.0f);
                                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, strSubstring));
                                }
                                charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilderReplaceTags, anonymousClass1.privacyHint.getTextPaint().getFontMetricsInt(), false);
                                hintView2 = anonymousClass1.privacyHint;
                                if (z) {
                                    measuredWidth = HintView2.cutInFancyHalf(charSequenceReplaceEmoji, hintView2.getTextPaint());
                                } else {
                                    measuredWidth = anonymousClass4.getMeasuredWidth();
                                }
                                hintView2.textMaxWidth = measuredWidth;
                                anonymousClass1.privacyHint.setText(charSequenceReplaceEmoji);
                                anonymousClass1.privacyHint.setJoint(1.0f, (-(anonymousClass4.getWidth() - anonymousClass1.privacyButton.getCenterX())) / AndroidUtilities.density);
                                StoryViewer storyViewer = StoryViewer.this;
                                storyViewer.isHintVisible = true;
                                storyViewer.updatePlayingMode();
                                if (anonymousClass1.privacyHint.shown) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                anonymousClass1.privacyHint.show();
                            } else {
                                anonymousClass1.privacyHint.setInnerPadding(15.0f, 8.0f, 15.0f, 8.0f);
                                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, strSubstring));
                            }
                            z = true;
                            charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilderReplaceTags, anonymousClass1.privacyHint.getTextPaint().getFontMetricsInt(), false);
                            hintView2 = anonymousClass1.privacyHint;
                            if (z) {
                                measuredWidth = HintView2.cutInFancyHalf(charSequenceReplaceEmoji, hintView2.getTextPaint());
                            } else {
                                measuredWidth = anonymousClass4.getMeasuredWidth();
                            }
                            hintView2.textMaxWidth = measuredWidth;
                            anonymousClass1.privacyHint.setText(charSequenceReplaceEmoji);
                            anonymousClass1.privacyHint.setJoint(1.0f, (-(anonymousClass4.getWidth() - anonymousClass1.privacyButton.getCenterX())) / AndroidUtilities.density);
                            StoryViewer storyViewer2 = StoryViewer.this;
                            storyViewer2.isHintVisible = true;
                            storyViewer2.updatePlayingMode();
                            if (anonymousClass1.privacyHint.shown) {
                                BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                            }
                            anonymousClass1.privacyHint.show();
                            break;
                        }
                    }
                }
                break;
            case 1:
                PeerStoriesView.AnonymousClass5 anonymousClass5 = anonymousClass1.storyCaptionView;
                if (!anonymousClass5.expanded) {
                    anonymousClass1.checkBlackoutMode = true;
                    anonymousClass5.expand(false);
                    break;
                } else {
                    TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = anonymousClass5.textSelectionHelper;
                    if (!simpleTextSelectionHelper.isInSelectionMode()) {
                        anonymousClass5.collapse$1();
                        break;
                    } else if (simpleTextSelectionHelper.isInSelectionMode() && Math.abs(anonymousClass5.startMotionX - anonymousClass5.lastMotionX) < AndroidUtilities.touchSlop && Math.abs(anonymousClass5.startMotionY - anonymousClass5.lastMotionY) < AndroidUtilities.touchSlop) {
                        TextSelectionHelper.TextSelectionOverlay overlayView = simpleTextSelectionHelper.getOverlayView(anonymousClass5.getContext());
                        TextSelectionHelper.this.getCoordsInParent();
                        TextSelectionHelper textSelectionHelper = TextSelectionHelper.this;
                        int i2 = textSelectionHelper.textY;
                        if (!textSelectionHelper.movingHandle && textSelectionHelper.allowDiscard) {
                            textSelectionHelper.clear(false);
                            break;
                        }
                    }
                }
                break;
            case 2:
                anonymousClass1.shareStory(true);
                break;
            case 3:
                anonymousClass1.tryToOpenRepostStory();
                break;
            case 4:
                TL_stories.StoryItem storyItem2 = anonymousClass1.currentStory.storyItem;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    anonymousClass1.applyMessageToChat(new PeerStoriesView$$ExternalSyntheticLambda7(anonymousClass1, i));
                } else {
                    anonymousClass1.likeStory(null);
                }
                break;
            default:
                Context context = anonymousClass1.getContext();
                DarkThemeResourceProvider darkThemeResourceProvider = anonymousClass1.resourcesProvider;
                BottomSheet bottomSheet = new BottomSheet(context, darkThemeResourceProvider, false, false);
                bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, darkThemeResourceProvider));
                LinearLayout linearLayout = new LinearLayout(anonymousClass1.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                BackupImageView backupImageView = new BackupImageView(anonymousClass1.getContext());
                backupImageView.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(anonymousClass1.currentAccount).setPlaceholderImage(backupImageView, "tg_superplaceholders_android_2", "😎", "150_150");
                linearLayout.addView(backupImageView, LayoutHelper.createLinear(150, 150, 1, 0, 16, 0, 16));
                TextView textView = new TextView(anonymousClass1.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, darkThemeResourceProvider));
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(anonymousClass1.getContext());
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, darkThemeResourceProvider));
                textView2.setTextSize(1, 14.0f);
                FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(anonymousClass1.getContext(), darkThemeResourceProvider, true);
                buttonWithCounterView.setText(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                coloredImageSpan.setTopOffset(1);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                buttonWithCounterView.setSubText(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1));
                buttonWithCounterView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(25, anonymousClass1, bottomSheet));
                bottomSheet.setCustomView(linearLayout);
                StoryViewer.this.showDialog(bottomSheet);
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null && (actionBarPopupWindow = anonymousClass8.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                    break;
                }
                break;
        }
    }
}
