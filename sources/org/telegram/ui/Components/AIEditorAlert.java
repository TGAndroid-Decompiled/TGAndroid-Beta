package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda57;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda102;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda131;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda464;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda77;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.voip.VoIPEllipsizeSpan;
import org.telegram.ui.Gifts.GiftSheet$Tabs$$ExternalSyntheticLambda0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda130;
import org.telegram.ui.ReportBottomSheet$3$$ExternalSyntheticLambda0;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichTextStyle;

public final class AIEditorAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] accusative;
    public UniversalAdapter adapter;
    public final ButtonWithCounterView allButton;
    public final FrameLayout bulletinContainer;
    public final ButtonWithCounterView button;
    public final LinearLayout buttonContainer;
    public boolean buttonShowLimit;
    public final ImageView closeView;
    public boolean collapsed;
    public long dialogId;
    public boolean editing;
    public boolean emojify;
    public boolean errored;
    public CharSequence fixedText;
    public boolean fixedTextLoading;
    public TL_iv.RichMessage fixedTextRich;
    public CharSequence fixedTextToCopy;
    public String from_lang;
    public final boolean[] genitive;
    public final TLRPC.TL_messages_composeMessageWithAI[] lastRequest;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] lastRequestRich;
    public boolean loading;
    public boolean newPrompt;
    public Utilities.Callback4 onSendListener;
    public ChatActivityEnterView$$ExternalSyntheticLambda54 onSendRichListener;
    public Utilities.Callback onUseListener;
    public Utilities.Callback onUseRichListener;
    public final FrameLayout promptBox;
    public final EditTextCell promptCell;
    public String promptText;
    public int requestId;
    public final ButtonWithCounterView sendButton;
    public boolean showLimit;
    public HintView2 styleHint;
    public final Tabs styleTabs;
    public CharSequence styledText;
    public boolean styledTextLoading;
    public TL_iv.RichMessage styledTextRich;
    public final Tabs tabs;
    public final FrameLayout tabsContainer;
    public CharSequence text;
    public TL_iv.RichMessage textRich;
    public String title;
    public RLottieDrawable titleLoadingDrawable;
    public String to_lang;
    public final AiTonesController tonesController;
    public CharSequence translatedText;
    public boolean translatedTextLoading;
    public TL_iv.RichMessage translatedTextRich;

    public final class AiStyleAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        public UniversalAdapter adapter;
        public final FrameLayout bulletinContainer;
        public final ButtonWithCounterView button;
        public final ImageView closeView;
        public int exampleIndex;
        public final TL_aicompose.aiComposeToneExample[] examples;
        public final FrameLayout iconCell;
        public final TextView subtitle;
        public final TextView title;
        public final TL_aicompose.AiComposeTone tone;
        public final AiTonesController tonesController;

        public AiStyleAlert(Context context, TL_aicompose.AiComposeTone aiComposeTone, Theme.ResourcesProvider resourcesProvider) {
            super(context, null, false, false, false, false, false, 2, resourcesProvider);
            this.exampleIndex = 0;
            AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
            this.tonesController = tonesController;
            tonesController.load();
            this.tone = aiComposeTone;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
            this.examples = aicomposetoneexampleArr;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
            }
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.ic_close_white);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(getThemedColor(i));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, getThemedColor(i)), 1, -1));
            this.containerView.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new AIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1(this, 0));
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconCell = frameLayout;
            frameLayout.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(4, this.currentAccount, aiComposeTone.emoji_id));
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(64, 64, 17));
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setTextColor(getThemedColor(i));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(aiComposeTone.title);
            TextView textView2 = new TextView(context);
            this.subtitle = textView2;
            textView2.setTextColor(getThemedColor(i));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
            this.actionBar.setTitle(aiComposeTone.title);
            int i2 = Theme.key_windowBackgroundGray;
            this.behindKeyboardColorKey = i2;
            setBackgroundColor(getThemedColor(i2));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i3 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.dp(66.0f));
            this.recyclerListView.setClipToPadding(false);
            this.recyclerListView.setSections();
            this.recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 10));
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(36.0f);
            this.topPadding = 0.35f;
            this.takeTranslationIntoAccount = true;
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) AiStyleAlert.this).containerView.invalidate();
                }
            };
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i2)), getThemedColor(i2), getThemedColor(i2)}));
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
            int i4 = layoutParamsCreateFrame.leftMargin;
            int i5 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame.leftMargin = i4 + i5;
            layoutParamsCreateFrame.rightMargin += i5;
            this.containerView.addView(frameLayout3, layoutParamsCreateFrame);
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.bulletinContainer = frameLayout4;
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
            int i6 = layoutParamsCreateFrame2.leftMargin;
            int i7 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame2.leftMargin = i6 + i7;
            layoutParamsCreateFrame2.rightMargin += i7;
            this.containerView.addView(frameLayout4, layoutParamsCreateFrame2);
            ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
            this.button = buttonWithCounterViewM;
            buttonWithCounterViewM.setText(LocaleController.getString(isAlreadyAdded() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
            buttonWithCounterViewM.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, aiComposeTone, resourcesProvider, 12));
            frameLayout3.addView(buttonWithCounterViewM, LayoutHelper.createFrame(-1, 48, 119));
            this.adapter.update(false);
        }

        public static SpannableStringBuilder loadingText() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < 5; i++) {
                if (i > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int iDp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                LoadingSpan loadingSpan = new LoadingSpan(iDp, 0, null, null);
                loadingSpan.height = AndroidUtilities.dp(6.0f);
                loadingSpan.alpha = 0.5f;
                loadingSpan.fullWidth = true;
                spannableStringBuilder.setSpan(loadingSpan, length, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 18), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.applyBackground = false;
            return universalAdapter;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.loadedAiComposeTones) {
                this.button.setText(LocaleController.getString(isAlreadyAdded() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
            }
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        }

        public final void fillItems$8(ArrayList arrayList, UniversalAdapter universalAdapter) {
            String str;
            universalAdapter.itemsOffset = 1;
            UItem uItem = new UItem(7);
            uItem.text = null;
            arrayList.add(uItem);
            FrameLayout frameLayout = this.iconCell;
            UItem uItem2 = new UItem(-4);
            uItem2.view = frameLayout;
            uItem2.intValue = -1;
            uItem2.checked = true;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem2, 7);
            uItemM.text = null;
            arrayList.add(uItemM);
            arrayList.add(UItem.asCustomShadow(this.title));
            int iDp = AndroidUtilities.dp(1.0f);
            UItem uItem3 = new UItem(28);
            uItem3.intValue = iDp;
            arrayList.add(uItem3);
            arrayList.add(UItem.asCustomShadow(this.subtitle));
            int iDp2 = AndroidUtilities.dp(24.0f);
            UItem uItem4 = new UItem(28);
            uItem4.intValue = iDp2;
            arrayList.add(uItem4);
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = this.examples[this.exampleIndex];
                universalAdapter.whiteSectionStart();
                arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new AIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1(this, 1)));
                arrayList.add(TranslateAlert3.Text.Factory.of(4, aicomposetoneexample == null ? loadingText() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null, false, null, null));
                arrayList.add(TranslateAlert3.Text.Factory.of(6, aicomposetoneexample == null ? loadingText() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
                universalAdapter.whiteSectionEnd();
                TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                String publicUsername = UserObject.getPublicUsername(user);
                if (user == null) {
                    int i = tL_aiComposeTone.installs_count;
                    if (i > 0) {
                        String pluralString = LocaleController.formatPluralString("AIEditorUsedBy", i, new Object[0]);
                        UItem uItem5 = new UItem(7);
                        uItem5.text = pluralString;
                        arrayList.add(uItem5);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (tL_aiComposeTone.installs_count > 0) {
                        str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, zzil.m("@", publicUsername)));
                    SpannableStringBuilder spannableStringBuilderReplaceSingleLink = AndroidUtilities.replaceSingleLink(sb.toString(), getThemedColor(Theme.key_chat_messageLinkIn), new ChatLinkActivity$$ExternalSyntheticLambda9(15, this, tL_aiComposeTone));
                    UItem uItem6 = new UItem(7);
                    uItem6.text = spannableStringBuilderReplaceSingleLink;
                    arrayList.add(uItem6);
                }
            }
            int iDp3 = AndroidUtilities.dp(32.0f);
            UItem uItem7 = new UItem(28);
            uItem7.intValue = iDp3;
            arrayList.add(uItem7);
        }

        @Override
        public final CharSequence getTitle() {
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            return aiComposeTone == null ? "" : aiComposeTone.title;
        }

        public final boolean isAlreadyAdded() {
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                int i = 0;
                while (true) {
                    AiTonesController aiTonesController = this.tonesController;
                    if (i >= aiTonesController.tones.size()) {
                        break;
                    }
                    TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i);
                    if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }

        public final void lambda$new$2(Theme.ResourcesProvider resourcesProvider, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (tL_error != null) {
                boolean zEqualsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                FrameLayout frameLayout = this.bulletinContainer;
                if (zEqualsIgnoreCase) {
                    AIEditorAlert.showStylesLimitToast(this.currentAccount, new BulletinFactory(frameLayout, resourcesProvider));
                    return;
                } else {
                    zzlu.m(frameLayout, resourcesProvider, tL_error);
                    return;
                }
            }
            MessagesController.getInstance(this.currentAccount).getTonesController().add(aiComposeTone);
            lambda$showGiftOfferSheet$15();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
                long j = aiComposeTone.emoji_id;
                String string = LocaleController.getString(R.string.AIEditorToneAddedTitle);
                String string2 = LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title);
                bulletinFactoryOf.getClass();
                Context context = bulletinFactoryOf.getContext();
                Theme.ResourcesProvider resourcesProvider2 = bulletinFactoryOf.resourcesProvider;
                Bulletin.TwoLineBackupLayout twoLineBackupLayout = new Bulletin.TwoLineBackupLayout(context, resourcesProvider2);
                BackupImageView backupImageView = twoLineBackupLayout.imageView;
                backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(1, UserConfig.selectedAccount, j));
                backupImageView.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2), PorterDuff.Mode.SRC_IN));
                twoLineBackupLayout.titleTextView.setText(string);
                twoLineBackupLayout.subtitleTextView.setText(string2);
                bulletinFactoryOf.create(twoLineBackupLayout, 2750).show();
            }
        }

        public final void lambda$new$3(TL_aicompose.AiComposeTone aiComposeTone, Theme.ResourcesProvider resourcesProvider) {
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (!buttonWithCounterView.enabled || buttonWithCounterView.loading) {
                return;
            }
            if (isAlreadyAdded()) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            buttonWithCounterView.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(savetone, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda464(this, resourcesProvider, aiComposeTone, 4));
        }

        @Override
        public final void onActionBarAlpha(float f) {
            BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
            SimpleTextView titleTextView = anonymousClass4.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setAlpha(f);
            }
            float translationY = anonymousClass4.getTranslationY() + AndroidUtilities.statusBarHeight;
            int height = anonymousClass4.getHeight() - AndroidUtilities.statusBarHeight;
            ImageView imageView = this.closeView;
            imageView.setTranslationY(((1.0f - f) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
        }

        public final void onAnotherExample() {
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                int i = this.exampleIndex + 1;
                this.exampleIndex = i;
                TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = this.examples;
                if (i >= aicomposetoneexampleArr.length) {
                    this.exampleIndex = 0;
                }
                final int i2 = this.exampleIndex;
                if (aicomposetoneexampleArr[i2] == null) {
                    TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                    gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    gettoneexample.num = i2;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettoneexample, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                            AIEditorAlert.AiStyleAlert aiStyleAlert = this.f$0;
                            if (aicomposetoneexample == null) {
                                aiStyleAlert.getClass();
                            } else {
                                aiStyleAlert.examples[i2] = aicomposetoneexample;
                                aiStyleAlert.adapter.update(true);
                            }
                        }
                    });
                }
                this.adapter.update(true);
            }
        }

        @Override
        public final void show() {
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
        }
    }

    public final class CreateAiStyleAlert extends BottomSheetWithRecyclerListView {
        public UniversalAdapter adapter;
        public final FrameLayout bulletinContainer;
        public final ButtonWithCounterView button;
        public final FrameLayout buttonContainer;
        public final CheckBox2 checkbox;
        public final FrameLayout checkboxCell;
        public TL_aicompose.TL_aiComposeTone editing;
        public Long emoji_id;
        public final BackupImageView icon;
        public final FrameLayout iconButton;
        public final FrameLayout iconCell;
        public AIEditorAlert$$ExternalSyntheticLambda7 onToneCreated;
        public AIEditorAlert$$ExternalSyntheticLambda7 onToneEdited;
        public final EditTextCell promptCell;
        public AnonymousClass5 selectAnimatedEmojiDialog;
        public final EditTextCell titleCell;

        public CreateAiStyleAlert(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, null, true, false, false, false, false, 2, resourcesProvider);
            final int i = 0;
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.ic_close_white);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(getThemedColor(i2));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, getThemedColor(i2)), 1, -1));
            this.actionBar.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final AIEditorAlert.CreateAiStyleAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$0$33(view);
                            break;
                        case 1:
                            this.f$0.openIconDialog();
                            break;
                        default:
                            CheckBoxBase checkBoxBase = this.f$0.checkbox.checkBoxBase;
                            checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                            break;
                    }
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconCell = frameLayout;
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.iconButton = frameLayout2;
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            ScaleStateListAnimator.apply(frameLayout2, 0.1f, 1.5f);
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(100, 100, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.icon = backupImageView;
            updateIcon();
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(64, 64, 17));
            final int i3 = 1;
            frameLayout2.setOnClickListener(new View.OnClickListener(this) {
                public final AIEditorAlert.CreateAiStyleAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$0$33(view);
                            break;
                        case 1:
                            this.f$0.openIconDialog();
                            break;
                        default:
                            CheckBoxBase checkBoxBase = this.f$0.checkbox.checkBoxBase;
                            checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                            break;
                    }
                }
            });
            EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), resourcesProvider);
            this.titleCell = editTextCell;
            final int i4 = 0;
            editTextCell.editText.addTextChangedListener(new TextWatcher(this) {
                public final CreateAiStyleAlert this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void afterTextChanged(Editable editable) {
                    switch (i4) {
                        case 0:
                            this.this$0.updateButton$4();
                            break;
                        default:
                            this.this$0.updateButton$4();
                            break;
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    int i8 = i4;
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    int i8 = i4;
                }

                private final void beforeTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$1(int i5, int i6, int i7, CharSequence charSequence) {
                }

                private final void beforeTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$2(int i5, int i6, int i7, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$1(int i5, int i6, int i7, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$2(int i5, int i6, int i7, CharSequence charSequence) {
                }
            });
            final int i5 = 1;
            EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), resourcesProvider);
            this.promptCell = editTextCell2;
            editTextCell2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
            editTextCell2.editText.addTextChangedListener(new TextWatcher(this) {
                public final CreateAiStyleAlert this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void afterTextChanged(Editable editable) {
                    switch (i5) {
                        case 0:
                            this.this$0.updateButton$4();
                            break;
                        default:
                            this.this$0.updateButton$4();
                            break;
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    int i9 = i5;
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    int i9 = i5;
                }

                private final void beforeTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$1(int i6, int i7, int i8, CharSequence charSequence) {
                }

                private final void beforeTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$2(int i6, int i7, int i8, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$1(int i6, int i7, int i8, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$Components$AIEditorAlert$CreateAiStyleAlert$2(int i6, int i7, int i8, CharSequence charSequence) {
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 24, 24));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.checkbox = checkBox2;
            int i6 = Theme.key_radioBackgroundChecked;
            int i7 = Theme.key_checkboxDisabled;
            int i8 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(i6, i7, i8);
            checkBox2.setDrawUnchecked(true);
            checkBoxBase.setChecked(-1, false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            OKLCH.m(Theme.key_dialogTextGray2, resourcesProvider, textView, 14.0f);
            textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            final int i9 = 2;
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                public final AIEditorAlert.CreateAiStyleAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            this.f$0.lambda$new$0$33(view);
                            break;
                        case 1:
                            this.f$0.openIconDialog();
                            break;
                        default:
                            CheckBoxBase checkBoxBase2 = this.f$0.checkbox.checkBoxBase;
                            checkBoxBase2.setChecked(-1, !checkBoxBase2.isChecked, true);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.checkboxCell = frameLayout3;
            frameLayout3.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
            int i10 = Theme.key_windowBackgroundGray;
            this.behindKeyboardColorKey = i10;
            setBackgroundColor(getThemedColor(i10));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i11 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i11, 0, i11, AndroidUtilities.dp(66.0f));
            this.recyclerListView.setClipToPadding(false);
            this.recyclerListView.setSections();
            this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(5, this, resourcesProvider));
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(12.0f);
            this.topPadding = 0.35f;
            this.smoothKeyboardAnimationEnabled = true;
            this.takeTranslationIntoAccount = true;
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CreateAiStyleAlert.this).containerView.invalidate();
                }
            };
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.buttonContainer = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
            int i12 = layoutParamsCreateFrame.leftMargin;
            int i13 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame.leftMargin = i12 + i13;
            layoutParamsCreateFrame.rightMargin += i13;
            this.containerView.addView(frameLayout4, layoutParamsCreateFrame);
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.bulletinContainer = frameLayout5;
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
            int i14 = layoutParamsCreateFrame2.leftMargin;
            int i15 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame2.leftMargin = i14 + i15;
            layoutParamsCreateFrame2.rightMargin += i15;
            this.containerView.addView(frameLayout5, layoutParamsCreateFrame2);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            buttonWithCounterView.setRoundRadius(24);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
            buttonWithCounterView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(29, this, resourcesProvider));
            frameLayout4.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48, 119));
            updateButton$4();
            this.adapter.update(false);
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 19), this.resourcesProvider);
            this.adapter = universalAdapter;
            universalAdapter.applyBackground = false;
            return universalAdapter;
        }

        @Override
        public final CharSequence getTitle() {
            return LocaleController.getString(this.editing != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
        }

        public final void lambda$new$3(Browser.Progress progress, AlertDialog alertDialog) {
            progress.end(false);
            alertDialog.dismiss();
            lambda$showGiftOfferSheet$15();
            MessagesController.getInstance(this.currentAccount).getTonesController().remove(this.editing);
        }

        public final void lambda$new$4(AlertDialog alertDialog) {
            Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
            progressMakeButtonLoading.init();
            TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
            deletetone.tone = TL_aicompose.InputAiComposeTone.from(this.editing);
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletetone, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda464(this, progressMakeButtonLoading, alertDialog, 5));
        }

        public final void lambda$new$7(Theme.ResourcesProvider resourcesProvider, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (aiComposeTone != null) {
                lambda$showGiftOfferSheet$15();
                AIEditorAlert$$ExternalSyntheticLambda7 aIEditorAlert$$ExternalSyntheticLambda7 = this.onToneCreated;
                if (aIEditorAlert$$ExternalSyntheticLambda7 != null) {
                    aIEditorAlert$$ExternalSyntheticLambda7.run(aiComposeTone);
                    return;
                }
                return;
            }
            if (tL_error != null) {
                boolean zEqualsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                FrameLayout frameLayout = this.bulletinContainer;
                if (!zEqualsIgnoreCase) {
                    zzlu.m(frameLayout, resourcesProvider, tL_error);
                } else {
                    AIEditorAlert.showStylesLimitToast(this.currentAccount, new BulletinFactory(frameLayout, resourcesProvider));
                }
            }
        }

        public final void lambda$new$8$1(final Theme.ResourcesProvider resourcesProvider) {
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView.loading) {
                return;
            }
            if (!buttonWithCounterView.enabled) {
                if (this.emoji_id == null) {
                    openIconDialog();
                    return;
                }
                return;
            }
            buttonWithCounterView.setLoading(true);
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = this.editing;
            EditTextCell editTextCell = this.promptCell;
            EditTextCell editTextCell2 = this.titleCell;
            CheckBox2 checkBox2 = this.checkbox;
            if (tL_aiComposeTone == null) {
                TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                createtone.display_author = checkBox2.checkBoxBase.isChecked;
                createtone.emoji_id = this.emoji_id.longValue();
                createtone.title = editTextCell2.getText().toString();
                createtone.prompt = editTextCell.getText().toString();
                final int i = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(createtone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2(this) {
                    public final AIEditorAlert.CreateAiStyleAlert f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        switch (i) {
                            case 0:
                                AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = this.f$0;
                                createAiStyleAlert.button.setLoading(false);
                                if (aiComposeTone != null) {
                                    AIEditorAlert$$ExternalSyntheticLambda7 aIEditorAlert$$ExternalSyntheticLambda7 = createAiStyleAlert.onToneEdited;
                                    if (aIEditorAlert$$ExternalSyntheticLambda7 != null) {
                                        aIEditorAlert$$ExternalSyntheticLambda7.run(aiComposeTone);
                                    }
                                    createAiStyleAlert.lambda$showGiftOfferSheet$15();
                                } else if (tL_error != null) {
                                    zzlu.m(createAiStyleAlert.bulletinContainer, resourcesProvider, tL_error);
                                }
                                break;
                            default:
                                this.f$0.lambda$new$7(resourcesProvider, aiComposeTone, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
            updatetone.flags = 1 | updatetone.flags;
            updatetone.display_author = checkBox2.checkBoxBase.isChecked;
            updatetone.tone = TL_aicompose.InputAiComposeTone.from(this.editing);
            updatetone.flags |= 2;
            updatetone.emoji_id = this.emoji_id.longValue();
            updatetone.flags |= 4;
            updatetone.title = editTextCell2.getText().toString();
            updatetone.flags |= 8;
            updatetone.prompt = editTextCell.getText().toString();
            final int i2 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(updatetone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2(this) {
                public final AIEditorAlert.CreateAiStyleAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i2) {
                        case 0:
                            AIEditorAlert.CreateAiStyleAlert createAiStyleAlert = this.f$0;
                            createAiStyleAlert.button.setLoading(false);
                            if (aiComposeTone != null) {
                                AIEditorAlert$$ExternalSyntheticLambda7 aIEditorAlert$$ExternalSyntheticLambda7 = createAiStyleAlert.onToneEdited;
                                if (aIEditorAlert$$ExternalSyntheticLambda7 != null) {
                                    aIEditorAlert$$ExternalSyntheticLambda7.run(aiComposeTone);
                                }
                                createAiStyleAlert.lambda$showGiftOfferSheet$15();
                            } else if (tL_error != null) {
                                zzlu.m(createAiStyleAlert.bulletinContainer, resourcesProvider, tL_error);
                            }
                            break;
                        default:
                            this.f$0.lambda$new$7(resourcesProvider, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
        }

        @Override
        public final void onSmoothContainerViewLayout(float f) {
            super.onSmoothContainerViewLayout(f);
            this.buttonContainer.setTranslationY(f);
        }

        public final void openIconDialog() {
            if (this.selectAnimatedEmojiDialog != null) {
                return;
            }
            ?? r1 = new SelectAnimatedEmojiDialog(getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider) {
                @Override
                public final void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    CreateAiStyleAlert createAiStyleAlert = CreateAiStyleAlert.this;
                    createAiStyleAlert.emoji_id = l;
                    createAiStyleAlert.updateIcon();
                    createAiStyleAlert.updateButton$4();
                    SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                    if (selectAnimatedEmojiDialogWindow != null) {
                        createAiStyleAlert.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindow.dismiss();
                    }
                }

                @Override
                public final boolean willApplyEmoji(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
                    return tL_starGiftUnique == null || StarsController.getInstance(((BottomSheet) CreateAiStyleAlert.this).currentAccount, false).findUserStarGift(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
                }
            };
            r1.setSelected(this.emoji_id);
            r1.setSaveState(1);
            ?? r0 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r1) {
                @Override
                public final void dismiss() {
                    super.dismiss();
                    CreateAiStyleAlert.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = r0;
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = {r0};
            r0.showAsDropDown(this.iconButton, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }

        public final void updateButton$4() {
            this.button.setEnabled(this.emoji_id != null && this.titleCell.getText().length() > 0 && this.promptCell.getText().length() > 0);
        }

        public final void updateIcon() {
            Long l = this.emoji_id;
            BackupImageView backupImageView = this.icon;
            if (l == null) {
                backupImageView.setImageResource(R.drawable.menu_smile_add);
                backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            } else {
                backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(4, this.currentAccount, this.emoji_id.longValue()));
                backupImageView.setColorFilter(null);
                backupImageView.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final class PromptTone extends TL_aicompose.AiComposeTone {
    }

    public AIEditorAlert(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, false, false, false, false, 2, resourcesProvider);
        this.accusative = new boolean[1];
        this.genitive = new boolean[1];
        this.collapsed = true;
        this.requestId = -1;
        this.lastRequest = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.lastRequestRich = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.tonesController = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(getThemedColor(i));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, getThemedColor(i)), 1, -1));
        this.actionBar.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.tabsContainer = frameLayout;
        Tabs tabs = new Tabs(this.currentAccount, context, resourcesProvider, false);
        this.tabs = tabs;
        tabs.layout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int iDp = AndroidUtilities.dp(28.0f);
        int i2 = Theme.key_windowBackgroundWhite;
        tabs.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i2, resourcesProvider)));
        tabs.setRoundRadius(28);
        tabs.addTab(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new AIEditorAlert$$ExternalSyntheticLambda7(this, 3));
        tabs.addTab(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new AIEditorAlert$$ExternalSyntheticLambda7(this, 3));
        tabs.addTab(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new AIEditorAlert$$ExternalSyntheticLambda7(this, 3));
        tabs.selectTab(1);
        frameLayout.addView(tabs, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.promptBox = frameLayout2;
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), resourcesProvider);
        this.promptCell = editTextCell;
        EditTextCell.AnonymousClass2 anonymousClass2 = editTextCell.editText;
        anonymousClass2.setImeOptions(6);
        anonymousClass2.setMaxLines(5);
        editTextCell.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), Theme.getColor(i2, resourcesProvider)));
        anonymousClass2.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                Tabs tabs2;
                AIEditorAlert aIEditorAlert = AIEditorAlert.this;
                Tabs tabs3 = aIEditorAlert.tabs;
                if ((tabs3 != null ? tabs3.getSelectedTab() : 0) == 1 && (tabs2 = aIEditorAlert.styleTabs) != null && (tabs2.getSelectedTone() instanceof PromptTone)) {
                    aIEditorAlert.cancelRequest();
                    aIEditorAlert.updatePromptEditText();
                    aIEditorAlert.updateButton$1(true);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        frameLayout2.addView(editTextCell, LayoutHelper.createFrame(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        anonymousClass2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        Tabs tabs2 = new Tabs(this.currentAccount, context, resourcesProvider, true);
        this.styleTabs = tabs2;
        tabs2.setDivider(true);
        tabs2.layout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        tabs2.setRoundRadius(12);
        tabs2.onLongClick = new StakedDiceSheet$$ExternalSyntheticLambda6(this, resourcesProvider, context);
        updateStyles();
        tabs2.selectTab(-1);
        String toLanguage = TranslateAlert2.getToLanguage();
        this.to_lang = toLanguage;
        if (toLanguage == null) {
            this.to_lang = TranslateController.currentLanguage();
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.topPadding = 0.35f;
        int i3 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i3));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonContainer = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i3)), getThemedColor(i3), getThemedColor(i3)}));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.button = buttonWithCounterView;
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        this.sendButton = buttonWithCounterViewM;
        buttonWithCounterViewM.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 1));
        buttonWithCounterViewM.setOnLongClickListener(new AIEditorAlert$$ExternalSyntheticLambda12(this, resourcesProvider, context, 0));
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(48, 48, 5, 10, 0, 0, 0));
        ButtonWithCounterView buttonWithCounterViewM2 = zzlp.m(context, resourcesProvider, true);
        this.allButton = buttonWithCounterViewM2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new VoIPEllipsizeSpan(), length, spannableStringBuilder.length(), 33);
        buttonWithCounterViewM2.setText(spannableStringBuilder);
        buttonWithCounterViewM2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(28, this, resourcesProvider));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
        int i4 = layoutParamsCreateFrame.leftMargin;
        int i5 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i4 + i5;
        layoutParamsCreateFrame.rightMargin += i5;
        this.containerView.addView(linearLayout, layoutParamsCreateFrame);
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i6 = layoutParamsCreateFrame2.leftMargin;
        int i7 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame2.leftMargin = i6 + i7;
        layoutParamsCreateFrame2.rightMargin += i7;
        this.containerView.addView(buttonWithCounterViewM2, layoutParamsCreateFrame2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bulletinContainer = frameLayout3;
        FrameLayout.LayoutParams layoutParamsCreateFrame3 = LayoutHelper.createFrame(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i8 = layoutParamsCreateFrame3.leftMargin;
        int i9 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame3.leftMargin = i8 + i9;
        layoutParamsCreateFrame3.rightMargin += i9;
        this.containerView.addView(frameLayout3, layoutParamsCreateFrame3);
        updateButton$1(false);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i10 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i10, 0, i10, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 9));
        this.takeTranslationIntoAccount = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) AIEditorAlert.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 12));
        this.adapter.update(false);
        AndroidUtilities.runOnUIThread(new AIEditorAlert$$ExternalSyntheticLambda4(this, 1));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void format(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                format(richText.text, sb);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                format(textconcat.texts.get(i), sb);
            }
        }
    }

    public static void formatStyled(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) RichTextStyle.toSpannable(pageBlock.text, pageBlock));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) RichTextStyle.toSpannable(pageCaption.text, null));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) RichTextStyle.toSpannable(richText, null));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i = 0; i < pageblocklist.items.size(); i++) {
                if (i > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) RichTextStyle.toSpannable(((TL_iv.TL_pageListItemText) pageListItem).text, null));
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (i2 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        formatStyled(arrayList.get(i2), spannableStringBuilder);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                if (i3 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) RichTextStyle.toSpannable(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null));
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        if (i4 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        formatStyled(arrayList2.get(i4), spannableStringBuilder);
                    }
                }
            }
        }
    }

    public static void showStylesLimitToast(int i, BulletinFactory bulletinFactory) {
        int i2 = 1;
        if (bulletinFactory.getContext() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        boolean zIsPremium = UserConfig.getInstance(i).isPremium();
        bulletinFactory.createSimpleBulletin(LocaleController.getString(R.string.AIEditorStyleLimitTitle), AndroidUtilities.replaceSingleTag(!zIsPremium ? LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())) : LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())), new ReportBottomSheet$3$$ExternalSyntheticLambda0(i2, bulletinFactory)), !zIsPremium ? R.raw.star_premium_2 : R.raw.error).show();
    }

    public final void addChecked(ItemOptions itemOptions, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(str);
        actionBarMenuSubItem.setChecked(z);
        int color = Theme.getColor(i, this.resourcesProvider);
        int color2 = Theme.getColor(i2, this.resourcesProvider);
        actionBarMenuSubItem.setTextColor(color);
        actionBarMenuSubItem.setIconColor(color2);
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda40(itemOptions, z, runnable, 0));
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    public final void cancelRequest() {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
        this.loading = false;
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setRightDrawable((Drawable) null);
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 17), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.loadedAiComposeTones) {
            updateStyles();
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.tonesController;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.lambda$showGiftOfferSheet$15();
    }

    public final TL_iv.RichMessage getResultRich() {
        if (this.loading) {
            return null;
        }
        int selectedTab = this.tabs.getSelectedTab();
        if (selectedTab == 0) {
            if (this.translatedTextLoading) {
                return null;
            }
            return this.translatedTextRich;
        }
        if (selectedTab == 2) {
            if (this.fixedTextLoading) {
                return null;
            }
            return this.fixedTextRich;
        }
        if (this.styledTextLoading) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.styledTextRich;
        return richMessage == null ? this.textRich : richMessage;
    }

    public final CharSequence getResultText() {
        if (isRich()) {
            TL_iv.RichMessage resultRich = getResultRich();
            if (resultRich == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < resultRich.blocks.size(); i++) {
                if (i > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                formatStyled(resultRich.blocks.get(i), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.loading) {
            return null;
        }
        int selectedTab = this.tabs.getSelectedTab();
        if (selectedTab == 0) {
            if (this.translatedTextLoading) {
                return null;
            }
            return this.translatedText;
        }
        if (selectedTab == 2) {
            if (this.fixedTextLoading) {
                return null;
            }
            return this.fixedTextToCopy;
        }
        if (this.styledTextLoading) {
            return null;
        }
        CharSequence charSequence = this.styledText;
        return charSequence == null ? this.text : charSequence;
    }

    @Override
    public final CharSequence getTitle() {
        if (this.title == null) {
            this.title = LocaleController.getString(R.string.AIEditor);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.emoji_stars, "emoji_stars", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
            this.titleLoadingDrawable = rLottieDrawable;
            rLottieDrawable.decodeSingleFrame = true;
            rLottieDrawable.scheduleNextGetFrame();
            this.titleLoadingDrawable.setAutoRepeat(1);
        }
        return this.title;
    }

    public final boolean isRich() {
        return this.textRich != null;
    }

    public final boolean lambda$new$12(Context context, Theme.ResourcesProvider resourcesProvider) {
        if (this.editing || (this.onSendRichListener == null ? this.onSendListener == null || getResultText() == null : getResultRich() == null)) {
            return false;
        }
        boolean z = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, resourcesProvider, this.sendButton);
        itemOptionsMakeOptions.addIf(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new AIEditorAlert$$ExternalSyntheticLambda4(this, 3), !z);
        itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new ChatActivity$$ExternalSyntheticLambda102(this, context, resourcesProvider, 29), false);
        itemOptionsMakeOptions.show();
        return true;
    }

    public final void lambda$new$5(Browser.Progress progress, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        progress.end(false);
        MessagesController.getInstance(this.currentAccount).getTonesController().remove(tL_aiComposeTone);
        updateStyles();
    }

    public final void lambda$new$6(TL_aicompose.TL_aiComposeTone tL_aiComposeTone, AlertDialog alertDialog) {
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletetone, new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda464(this, progressMakeButtonLoading, tL_aiComposeTone, 3));
    }

    public final void lambda$request$31(SimpleTextView simpleTextView, int i, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.loading = false;
        FrameLayout frameLayout = this.bulletinContainer;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new BulletinFactory(frameLayout, this.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).show();
            this.showLimit = true;
            updateButton$1(true);
            return;
        }
        if (tL_error != null) {
            zzlu.m(frameLayout, this.resourcesProvider, tL_error);
            simpleTextView.setRightDrawable((Drawable) null);
            this.errored = true;
            this.showLimit = false;
            updateButton$1(true);
            return;
        }
        if (tL_composedMessageWithAI == null) {
            simpleTextView.setRightDrawable((Drawable) null);
            this.errored = true;
            this.showLimit = false;
            updateButton$1(true);
            return;
        }
        simpleTextView.setRightDrawable((Drawable) null);
        this.showLimit = false;
        updateButton$1(true);
        this.lastRequest[i] = tL_messages_composeMessageWithAI;
        if (i == 0) {
            this.translatedTextLoading = false;
            this.translatedText = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i == 1) {
            this.styledTextLoading = false;
            this.styledText = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i == 2) {
            this.fixedTextLoading = false;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
            if (tL_textWithEntities != null) {
                this.fixedText = MessageObject.formatTextWithEntities(tL_textWithEntities);
                this.fixedTextToCopy = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else {
                CharSequence textWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                this.fixedTextToCopy = textWithEntities;
                this.fixedText = textWithEntities;
            }
        }
        this.adapter.update(true);
    }

    public final void lambda$requestRich$32(SimpleTextView simpleTextView, int i, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.loading = false;
        FrameLayout frameLayout = this.bulletinContainer;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new BulletinFactory(frameLayout, this.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).show();
            this.showLimit = true;
            updateButton$1(true);
            return;
        }
        if (tL_error != null) {
            zzlu.m(frameLayout, this.resourcesProvider, tL_error);
            simpleTextView.setRightDrawable((Drawable) null);
            this.errored = true;
            this.showLimit = false;
            updateButton$1(true);
            return;
        }
        if (tL_composedRichMessageWithAI == null) {
            simpleTextView.setRightDrawable((Drawable) null);
            this.errored = true;
            this.showLimit = false;
            updateButton$1(true);
            return;
        }
        simpleTextView.setRightDrawable((Drawable) null);
        this.showLimit = false;
        updateButton$1(true);
        this.lastRequestRich[i] = tL_messages_composeRichMessageWithAI;
        if (i == 0) {
            this.translatedTextLoading = false;
            this.translatedTextRich = tL_composedRichMessageWithAI.result;
        } else if (i == 1) {
            this.styledTextLoading = false;
            this.styledTextRich = tL_composedRichMessageWithAI.result;
        } else if (i == 2) {
            this.fixedTextLoading = false;
            this.fixedTextRich = tL_composedRichMessageWithAI.result;
        }
        this.adapter.update(true);
    }

    public final void lambda$selectStyle$23(TL_aicompose.AiComposeTone aiComposeTone) {
        this.tonesController.tones.add(0, aiComposeTone);
        updateStyles();
        FrameLayout frameLayout = this.bulletinContainer;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        long j = aiComposeTone.emoji_id;
        String string = LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title);
        String string2 = LocaleController.getString(R.string.AIEditorToneCreatedText);
        Context context = frameLayout != null ? frameLayout.getContext() : null;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Bulletin.TwoLineBackupLayout twoLineBackupLayout = new Bulletin.TwoLineBackupLayout(context, resourcesProvider);
        twoLineBackupLayout.imageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(1, UserConfig.selectedAccount, j));
        twoLineBackupLayout.imageView.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), PorterDuff.Mode.SRC_IN));
        twoLineBackupLayout.titleTextView.setText(string);
        twoLineBackupLayout.subtitleTextView.setText(string2);
        Bulletin.make(frameLayout, twoLineBackupLayout, 2750).show();
    }

    @Override
    public final void onActionBarAlpha(float f) {
        ImageView imageView = this.closeView;
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
    }

    @Override
    public final void onContainerViewTranslation() {
        checkBackDrawableInsets();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.buttonContainer;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void onToLangMenu(View view) {
        AIEditorAlert aIEditorAlert;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        itemOptionsMakeOptions.maxHeight = AndroidUtilities.dp(450.0f);
        int i = 0;
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.onTopOfScrim = true;
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        itemOptionsMakeOptions.addView(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (TextUtils.isEmpty(this.to_lang)) {
            aIEditorAlert = this;
        } else {
            aIEditorAlert = this;
            aIEditorAlert.addChecked(itemOptionsMakeOptions, linearLayout, true, TranslateAlert2.capitalFirst(TranslateAlert2.languageName(this.to_lang, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i2);
            if (!TextUtils.equals(language.code, aIEditorAlert.to_lang)) {
                final int i4 = 0;
                aIEditorAlert.addChecked(itemOptionsMakeOptions, linearLayout, false, language.displayName, new Runnable(this) {
                    public final AIEditorAlert f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                AIEditorAlert aIEditorAlert2 = this.f$0;
                                aIEditorAlert2.cancelRequest();
                                String str = language.code;
                                aIEditorAlert2.to_lang = str;
                                TranslateAlert2.setToLanguage(str);
                                aIEditorAlert2.request();
                                break;
                            default:
                                AIEditorAlert aIEditorAlert3 = this.f$0;
                                aIEditorAlert3.cancelRequest();
                                String str2 = language.code;
                                aIEditorAlert3.to_lang = str2;
                                TranslateAlert2.setToLanguage(str2);
                                aIEditorAlert3.request();
                                break;
                        }
                    }
                });
            }
            i2 = i3;
        }
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), Theme.key_actionBarDefaultSubmenuSeparator, aIEditorAlert.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        int size2 = languages.size();
        while (i < size2) {
            TranslateController.Language language2 = languages.get(i);
            i++;
            final TranslateController.Language language3 = language2;
            final int i5 = 1;
            aIEditorAlert.addChecked(itemOptionsMakeOptions, linearLayout, TextUtils.equals(language3.code, aIEditorAlert.to_lang), language3.displayName, new Runnable(this) {
                public final AIEditorAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i5) {
                        case 0:
                            AIEditorAlert aIEditorAlert2 = this.f$0;
                            aIEditorAlert2.cancelRequest();
                            String str = language3.code;
                            aIEditorAlert2.to_lang = str;
                            TranslateAlert2.setToLanguage(str);
                            aIEditorAlert2.request();
                            break;
                        default:
                            AIEditorAlert aIEditorAlert3 = this.f$0;
                            aIEditorAlert3.cancelRequest();
                            String str2 = language3.code;
                            aIEditorAlert3.to_lang = str2;
                            TranslateAlert2.setToLanguage(str2);
                            aIEditorAlert3.request();
                            break;
                    }
                }
            });
            aIEditorAlert = this;
        }
        itemOptionsMakeOptions.show();
    }

    public final UItem previewItem(int i, TL_iv.RichMessage richMessage, boolean z) {
        if (richMessage == null) {
            richMessage = this.textRich;
        }
        UItem uItemOf = RichMessageLayout.PreviewView.Factory.of(richMessage);
        uItemOf.id = i;
        uItemOf.checked = z;
        return uItemOf;
    }

    public final void request() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean zIsRich = isRich();
        BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
        Tabs tabs = this.styleTabs;
        Tabs tabs2 = this.tabs;
        int i = 1;
        if (!zIsRich) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.text};
            tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = tabs2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.to_lang);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.emojify;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = tabs.getSelectedTone();
                if (selectedTone instanceof PromptTone) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.promptText) ? "" : this.promptText;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.id = tL_aiComposeTone.id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeMessageWithAI.emojify = this.emojify;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.lastRequest[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.loading = true;
                this.errored = false;
                updateButton$1(true);
                SimpleTextView titleTextView = anonymousClass4.getTitleTextView();
                titleTextView.setRightDrawable(this.titleLoadingDrawable);
                this.titleLoadingDrawable.start();
                int selectedTab2 = tabs2.getSelectedTab();
                CharSequence charSequence5 = this.text;
                if (selectedTab2 == 0 && (charSequence3 = this.translatedText) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.styledText) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.fixedText) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
                int i2 = this.backgroundPaddingLeft;
                int iClamp = MathUtils.clamp(new StaticLayout(charSequence6, textPaint, (iDp - i2) - i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i3 = 0; i3 < iClamp; i3++) {
                    if (i3 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int iDp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                    LoadingSpan loadingSpan = new LoadingSpan(iDp2, 0, null, null);
                    loadingSpan.height = AndroidUtilities.dp(6.0f);
                    loadingSpan.alpha = 0.5f;
                    loadingSpan.fullWidth = true;
                    spannableStringBuilder.setSpan(loadingSpan, length, spannableStringBuilder.length(), 33);
                }
                if (selectedTab == 0) {
                    this.translatedTextLoading = true;
                    this.translatedText = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.styledTextLoading = true;
                    this.styledText = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.fixedTextLoading = true;
                    this.fixedText = spannableStringBuilder;
                }
                this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new AiTonesController$$ExternalSyntheticLambda0(), new ArticleViewer$$ExternalSyntheticLambda57(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 2));
                this.adapter.update(true);
                return;
            }
            return;
        }
        int selectedTab3 = tabs2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.textRich;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i4 = 0; i4 < richMessage.blocks.size(); i4++) {
                tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i4)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    TLRPC.Photo photo = arrayList2.get(i5);
                    i5 += i;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    String str4 = str3;
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                    str3 = str4;
                    i = 1;
                }
            }
            str = str3;
            str2 = null;
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                int size2 = arrayList4.size();
                int i6 = 0;
                while (i6 < size2) {
                    TLRPC.Document document = arrayList4.get(i6);
                    i6++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
        }
        tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
        if (selectedTab3 == 0) {
            tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.to_lang);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.emojify;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = tabs.getSelectedTone();
            if (selectedTone2 instanceof PromptTone) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.promptText) ? str : this.promptText;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.id = tL_aiComposeTone2.id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeRichMessageWithAI.emojify = this.emojify;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.lastRequestRich[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.loading = true;
            this.errored = false;
            updateButton$1(true);
            SimpleTextView titleTextView2 = anonymousClass4.getTitleTextView();
            titleTextView2.setRightDrawable(this.titleLoadingDrawable);
            this.titleLoadingDrawable.start();
            if (selectedTab3 == 0) {
                this.translatedTextLoading = true;
            } else if (selectedTab3 == 1) {
                this.styledTextLoading = true;
            } else if (selectedTab3 == 2) {
                this.fixedTextLoading = true;
            }
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new AiTonesController$$ExternalSyntheticLambda0(), new ArticleViewer$$ExternalSyntheticLambda57(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 1));
            this.adapter.update(true);
        }
    }

    public final void runSend(int i, int i2, boolean z) {
        if (this.onSendRichListener != null) {
            TL_iv.RichMessage resultRich = getResultRich();
            if (resultRich != null) {
                this.onSendRichListener.run(resultRich, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (this.onSendListener == null || getResultText() == null) {
            return;
        }
        this.onSendListener.run(getResultText(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public final void selectStyle(TL_aicompose.AiComposeTone aiComposeTone) {
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
        boolean z = aiComposeTone instanceof PromptTone;
        Tabs tabs = this.styleTabs;
        if (z) {
            tabs.selectTone(aiComposeTone);
            this.adapter.update(true);
            AndroidUtilities.runOnUIThread(new AIEditorAlert$$ExternalSyntheticLambda4(this, 2), 150L);
        } else {
            if (aiComposeTone != null) {
                if (tabs.getSelectedTone() == aiComposeTone) {
                    return;
                }
                tabs.selectTone(aiComposeTone);
                request();
                this.adapter.update(true);
                return;
            }
            if (this.tonesController.getSavedTonesCount() + 1 > (UserConfig.getInstance(this.currentAccount).isPremium() ? MessagesController.getInstance(this.currentAccount).config.aicomposeToneSavedLimitPremium.get() : MessagesController.getInstance(this.currentAccount).config.aicomposeToneSavedLimitDefault.get())) {
                showStylesLimitToast(this.currentAccount, new BulletinFactory(this.bulletinContainer, this.resourcesProvider));
                return;
            }
            CreateAiStyleAlert createAiStyleAlert = new CreateAiStyleAlert(getContext(), this.resourcesProvider);
            createAiStyleAlert.onToneCreated = new AIEditorAlert$$ExternalSyntheticLambda7(this, 1);
            createAiStyleAlert.show();
        }
    }

    public final void setText(Editable editable) {
        ?? string;
        if (editable != null) {
            string = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {TextStyleSpan.class, CodeHighlighting.Span.class, SquigglyLinesSpan.class, URLSpanUserMention.class, URLSpanReplacement.class, URLSpanMono.class, URLSpanNoUnderline.class, FormattedDateSpan.class, URLSpanBrowser.class, URLSpanBotCommand.class, AnimatedEmojiSpan.class};
            for (int i = 0; i < 11; i++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i])) {
                    string.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            string = editable.toString();
        }
        this.text = string;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new AIEditorAlert$$ExternalSyntheticLambda16(this, 0), new ChatActivity$$ExternalSyntheticLambda131(16));
        }
    }

    @Override
    public final void show() {
        super.show();
        BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 != null) {
            anonymousClass4.setTitle(getTitle());
        }
        int i = (this.editing || (this.onSendRichListener == null && this.onSendListener == null)) ? 8 : 0;
        ButtonWithCounterView buttonWithCounterView = this.sendButton;
        buttonWithCounterView.setVisibility(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(this.editing ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24);
        coloredImageSpan.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
        buttonWithCounterView.setText(spannableStringBuilder);
        this.adapter.update(false);
        request();
        updateButton$1(true);
    }

    public final void showStyleHint() {
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide(true);
            this.styleHint = null;
        }
        HintView2 hintView3 = new HintView2(getContext(), 1);
        this.styleHint = hintView3;
        hintView3.roundWithCornerEffect = false;
        hintView3.backgroundPaint.setPathEffect(null);
        this.styleHint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.styleHint.setRounding(20.0f);
        HintView2 hintView4 = this.styleHint;
        float fDp = AndroidUtilities.dp(12.0f);
        float fDp2 = AndroidUtilities.dp(4.0f);
        int iMultAlpha = Theme.multAlpha(0.25f, -16777216);
        Paint paint = hintView4.backgroundPaint;
        hintView4.shadowRadius = fDp;
        hintView4.shadowDy = fDp2;
        hintView4.shadowColor = iMultAlpha;
        paint.setShadowLayer(fDp, 0.0f, fDp2, iMultAlpha);
        this.styleHint.setText(LocaleController.getString(R.string.AIEditorChooseStyle));
        this.styleHint.setJoint(0.5f, 0.0f);
        HintView2 hintView5 = this.styleHint;
        hintView5.duration = 8000L;
        this.containerView.addView(hintView5, LayoutHelper.createFrame(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.styleHint.show();
        updateStyleHintY();
    }

    public final void updateButton$1(boolean z) {
        boolean z2 = this.errored;
        ButtonWithCounterView buttonWithCounterView = this.button;
        if (z2) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            buttonWithCounterView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 0));
        } else {
            Tabs tabs = this.tabs;
            if ((tabs != null ? tabs.getSelectedTab() : 0) == 1 && (this.styleTabs.getSelectedTone() instanceof PromptTone) && !TextUtils.equals(this.promptCell.getText().toString(), this.promptText)) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                buttonWithCounterView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 2));
            } else if (this.onUseRichListener == null && this.onUseListener == null) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
                buttonWithCounterView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 7));
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.AIEditorApply));
                buttonWithCounterView.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda0(this, 8));
            }
        }
        buttonWithCounterView.setLoading(this.loading);
        if (z && this.buttonShowLimit == this.showLimit) {
            return;
        }
        boolean z3 = this.showLimit;
        this.buttonShowLimit = z3;
        LinearLayout linearLayout = this.buttonContainer;
        ButtonWithCounterView buttonWithCounterView2 = this.allButton;
        if (!z) {
            buttonWithCounterView2.setVisibility(z3 ? 0 : 8);
            buttonWithCounterView2.setAlpha(this.showLimit ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.showLimit ? 8 : 0);
            linearLayout.setAlpha(this.showLimit ? 0.0f : 1.0f);
            return;
        }
        buttonWithCounterView2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = buttonWithCounterView2.animate().alpha(this.showLimit ? 1.0f : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new AIEditorAlert$$ExternalSyntheticLambda4(this, 0)).start();
        linearLayout.animate().alpha(this.showLimit ? 0.0f : 1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new AIEditorAlert$$ExternalSyntheticLambda4(this, 4)).start();
    }

    public final void updatePromptEditText() {
        String str = this.promptText;
        EditTextCell editTextCell = this.promptCell;
        boolean zEquals = TextUtils.equals(str, editTextCell.editText.getText().toString());
        boolean z = !zEquals;
        if (this.newPrompt == z) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = editTextCell.editText.animate();
        this.newPrompt = z;
        OKLCH.m(viewPropertyAnimatorAnimate, !zEquals ? 1.0f : 0.5f, 320L);
        this.adapter.update(true);
    }

    public final void updateStyleHintY() {
        RecyclerListView recyclerListView;
        View childAt;
        if (this.styleHint == null) {
            return;
        }
        int i = 0;
        while (true) {
            recyclerListView = this.recyclerListView;
            if (i >= recyclerListView.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = recyclerListView.getChildAt(i);
            recyclerListView.getClass();
            UItem item = this.adapter.getItem(RecyclerView.getChildAdapterPosition(childAt) - 1);
            if (item != null && item.view == this.styleTabs) {
                break;
            } else {
                i++;
            }
        }
        if (childAt == null) {
            this.styleHint.setVisibility(4);
            this.styleHint.hide(true);
        } else {
            this.styleHint.setVisibility(0);
            this.styleHint.setTranslationY(childAt.getY() + recyclerListView.getY() + childAt.getHeight());
        }
    }

    public final void updateStyles() {
        Tabs tabs = this.styleTabs;
        TL_aicompose.AiComposeTone selectedTone = tabs.getSelectedTone();
        tabs.layout.removeAllViews();
        if (isRich()) {
            tabs.addTab(new PromptTone(), new AIEditorAlert$$ExternalSyntheticLambda7(this, 0));
        }
        tabs.addTab(null, new AIEditorAlert$$ExternalSyntheticLambda7(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.tonesController.tones;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i);
            i++;
            tabs.addTab(aiComposeTone, new AIEditorAlert$$ExternalSyntheticLambda7(this, 0));
        }
        if (selectedTone != tabs.getSelectedTone()) {
            tabs.selectTone(null);
        }
    }

    public static void format(TL_iv.PageBlock pageBlock, StringBuilder sb) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        format(richText, sb);
                        return;
                    }
                    return;
                }
                if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i = 0; i < pageblocklist.items.size(); i++) {
                        if (i > 0) {
                            sb.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            format(((TL_iv.TL_pageListItemText) pageListItem).text, sb);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (i2 > 0) {
                                    sb.append("\n");
                                }
                                format(arrayList.get(i2), sb);
                            }
                        }
                    }
                    return;
                }
                if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                        if (i3 > 0) {
                            sb.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            format(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    sb.append("\n");
                                }
                                format(arrayList2.get(i4), sb);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                format(pageCaption.text, sb);
                return;
            }
            return;
        }
        format(pageBlock.text, sb);
    }

    public final class Tabs extends FrameLayout {
        public final AnimatedFloat animatedSelectedTab;
        public final int currentAccount;
        public boolean divider;
        public final AnonymousClass1 layout;
        public StakedDiceSheet$$ExternalSyntheticLambda6 onLongClick;
        public final Theme.ResourcesProvider resourcesProvider;
        public int roundRadiusDp;
        public int selectedTab;

        public final class Tab extends FrameLayout implements Theme.Colorable {
            public boolean accent;
            public final int currentAccount;
            public final BackupImageView imageView;
            public boolean isEmoji;
            public final Theme.ResourcesProvider resourcesProvider;
            public int roundRadiusDp;
            public float selected;
            public final TextView textView;
            public TL_aicompose.AiComposeTone tone;

            public Tab(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.accent = true;
                this.currentAccount = i;
                this.resourcesProvider = resourcesProvider;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setOrientation(1);
                addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                NotificationCenter.listenEmojiLoading(backupImageView);
                linearLayout.addView(backupImageView, LayoutHelper.createLinear(24, 24, 49, 0, 4, 0, 0));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setGravity(17);
                textView.setSingleLine();
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 2, 0, 0));
                ScaleStateListAnimator.apply(this, 0.05f, 1.5f);
                updateSelected(0.0f, true);
            }

            public int[] getColorKeys() {
                return null;
            }

            @Override
            public final void updateColors$1() {
                updateSelected(this.selected, true);
                boolean z = this.accent;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                int iMultAlpha = z ? Theme.multAlpha(0.1f, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)) : Theme.getColor(Theme.key_listSelector, resourcesProvider);
                int i = this.roundRadiusDp;
                setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i, i));
            }

            public final void updateSelected(float f, boolean z) {
                if (z || Math.abs(f - this.selected) >= 0.01f) {
                    this.selected = f;
                    int i = Theme.key_windowBackgroundWhiteBlackText;
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    int color = Theme.getColor(i, resourcesProvider);
                    int i2 = Theme.key_featuredStickers_addButton;
                    int iBlendARGB = ColorUtils.blendARGB(f, color, Theme.getColor(i2, resourcesProvider));
                    int iBlendARGB2 = ColorUtils.blendARGB(f, Theme.getColor(i, resourcesProvider), Theme.getColor(i2, resourcesProvider));
                    PorterDuffColorFilter porterDuffColorFilter = !this.isEmoji ? new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN) : null;
                    BackupImageView backupImageView = this.imageView;
                    backupImageView.setColorFilter(porterDuffColorFilter);
                    backupImageView.setEmojiColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
                    backupImageView.invalidate();
                    this.textView.setTextColor(iBlendARGB2);
                }
            }
        }

        public Tabs(int i, Context context, final Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ?? r1 = new LinearLayout(context) {
                public final RectF floorRect = new RectF();
                public final RectF ceilRect = new RectF();
                public final RectF rect = new RectF();
                public final Paint selectorPaint = new Paint(1);

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Tabs tabs = Tabs.this;
                    AnimatedFloat animatedFloat = tabs.animatedSelectedTab;
                    float f = animatedFloat == null ? 0.0f : animatedFloat.set(tabs.selectedTab, false);
                    double d = f;
                    int iFloor = (int) Math.floor(d);
                    int iCeil = (int) Math.ceil(d);
                    float f2 = f - iFloor;
                    RectF rectF = this.floorRect;
                    if (iFloor >= 0 && iFloor < getChildCount()) {
                        View childAt = getChildAt(iFloor);
                        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                    }
                    RectF rectF2 = this.ceilRect;
                    if (iCeil >= 0 && iCeil < getChildCount()) {
                        View childAt2 = getChildAt(iCeil);
                        rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                    }
                    RectF rectF3 = this.rect;
                    AndroidUtilities.lerp(rectF, rectF2, f2, rectF3);
                    Paint paint = this.selectorPaint;
                    paint.setColor(Theme.multAlpha(0.1f, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(tabs.roundRadiusDp), AndroidUtilities.dp(tabs.roundRadiusDp), paint);
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        View childAt3 = getChildAt(i2);
                        if (childAt3 instanceof Tab) {
                            ((Tab) childAt3).updateSelected(Math.max(0.0f, 1.0f - Math.abs(i2 - f)), false);
                        }
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    boolean z2 = getOrientation() == 0;
                    int size = z2 ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i3);
                    int i4 = 0;
                    int iMax = 0;
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        childAt.measure(z2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i2, !z2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i3);
                        int measuredWidth = z2 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                        iMax = Math.max(iMax, measuredWidth);
                        i4 += measuredWidth;
                    }
                    boolean z3 = i4 <= size && ((float) iMax) < ((float) size) / ((float) getChildCount());
                    for (int i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt2 = getChildAt(i6);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                        childAt2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        if (z3) {
                            if (z2) {
                                layoutParams.width = 0;
                            } else {
                                layoutParams.height = 0;
                            }
                            layoutParams.weight = 1.0f;
                        } else {
                            if (z2) {
                                layoutParams.width = -2;
                            } else {
                                layoutParams.height = -2;
                            }
                            layoutParams.weight = 0.0f;
                        }
                    }
                    super.onMeasure(i2, i3);
                }
            };
            this.layout = r1;
            r1.setOrientation(0);
            this.animatedSelectedTab = new AnimatedFloat((View) r1, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            if (!z) {
                addView((View) r1, LayoutHelper.createFrame(-1, -1, 119));
                return;
            }
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(r1);
            addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1, 119));
        }

        public final void addTab(int i, String str, Utilities.Callback callback) {
            AnonymousClass1 anonymousClass1 = this.layout;
            int childCount = anonymousClass1.getChildCount();
            Tab tab = new Tab(getContext(), this.currentAccount, this.resourcesProvider);
            tab.roundRadiusDp = this.roundRadiusDp;
            tab.updateColors$1();
            tab.isEmoji = false;
            tab.imageView.setImageResource(i);
            tab.textView.setText(str);
            tab.setOnClickListener(new GiftSheet$Tabs$$ExternalSyntheticLambda0(childCount, 1, callback));
            anonymousClass1.addView(tab, LayoutHelper.createLinear(0, -1, 1.0f, 119));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.divider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), themePaint);
            }
        }

        public int getSelectedTab() {
            return this.selectedTab;
        }

        public TL_aicompose.AiComposeTone getSelectedTone() {
            int i = this.selectedTab;
            if (i >= 0) {
                AnonymousClass1 anonymousClass1 = this.layout;
                if (i < anonymousClass1.getChildCount()) {
                    View childAt = anonymousClass1.getChildAt(this.selectedTab);
                    if (childAt instanceof Tab) {
                        return ((Tab) childAt).tone;
                    }
                    return null;
                }
            }
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void selectTab(int i) {
            if (this.selectedTab == i) {
                return;
            }
            this.selectedTab = i;
            AnonymousClass1 anonymousClass1 = this.layout;
            if (i >= 0 && i < anonymousClass1.getChildCount()) {
                View childAt = anonymousClass1.getChildAt(i);
                if (childAt instanceof Tab) {
                    Tab tab = (Tab) childAt;
                    AnimatedEmojiDrawable animatedEmojiDrawable = tab.imageView.getAnimatedEmojiDrawable();
                    BackupImageView backupImageView = tab.imageView;
                    if (animatedEmojiDrawable != null) {
                        PhotoViewer.AnonymousClass11 anonymousClass11 = backupImageView.getAnimatedEmojiDrawable().imageReceiver;
                        if (anonymousClass11 != null) {
                            anonymousClass11.startAnimation();
                        }
                    } else {
                        backupImageView.getImageReceiver().startAnimation();
                    }
                }
            }
            anonymousClass1.invalidate();
        }

        public final void selectTone(TL_aicompose.AiComposeTone aiComposeTone) {
            TL_aicompose.AiComposeTone aiComposeTone2;
            int i = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = this.layout;
                if (i >= anonymousClass1.getChildCount()) {
                    return;
                }
                View childAt = anonymousClass1.getChildAt(i);
                if ((childAt instanceof Tab) && (aiComposeTone2 = ((Tab) childAt).tone) != null && aiComposeTone2 == aiComposeTone) {
                    selectTab(i);
                    return;
                }
                i++;
            }
        }

        public void setDivider(boolean z) {
            this.divider = z;
        }

        @Override
        public final void setPadding(int i, int i2, int i3, int i4) {
            setPadding(i, i2, i3, i4);
        }

        public void setRoundRadius(int i) {
            this.roundRadiusDp = i;
        }

        public final void addTab(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
            Tab tab = new Tab(getContext(), this.currentAccount, this.resourcesProvider);
            tab.tone = aiComposeTone;
            tab.roundRadiusDp = this.roundRadiusDp;
            tab.updateColors$1();
            TextView textView = tab.textView;
            BackupImageView backupImageView = tab.imageView;
            if (aiComposeTone == null) {
                tab.accent = false;
                tab.updateColors$1();
                int i = R.drawable.tone_create;
                String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
                tab.isEmoji = false;
                backupImageView.setImageResource(i);
                textView.setText(string);
            } else if (aiComposeTone instanceof PromptTone) {
                tab.accent = false;
                tab.updateColors$1();
                int i2 = R.drawable.iv_prompt;
                String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
                tab.isEmoji = false;
                backupImageView.setImageResource(i2);
                textView.setText(string2);
            } else {
                String str = aiComposeTone.title;
                long j = aiComposeTone.emoji_id;
                tab.isEmoji = true;
                backupImageView.setColorFilter(null);
                backupImageView.setImageDrawable(Emoji.getEmojiDrawable(null));
                textView.setText(str);
                int i3 = tab.currentAccount;
                if (ConnectionsManager.getInstance(i3).isTestBackend()) {
                    for (int i4 = 0; i4 < 4 && (!UserConfig.getInstance(i4).isClientActivated() || ConnectionsManager.getInstance(i4).isTestBackend()); i4++) {
                    }
                }
                backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(9, i3, j));
            }
            tab.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(1, callback, aiComposeTone));
            tab.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda130(1, this, tab));
            AnonymousClass1 anonymousClass1 = this.layout;
            anonymousClass1.addView(tab, LayoutHelper.createLinear(anonymousClass1.getOrientation() == 0 ? 0 : -1, anonymousClass1.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
        }
    }

    public final void setText(TL_iv.RichMessage richMessage) {
        this.textRich = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.textRich;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < richMessage2.blocks.size(); i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                format(richMessage2.blocks.get(i), sb);
            }
            LanguageDetector.detectLanguage(sb.toString(), new AIEditorAlert$$ExternalSyntheticLambda16(this, 1), new ChatActivity$$ExternalSyntheticLambda131(17));
        }
        updateStyles();
    }
}
