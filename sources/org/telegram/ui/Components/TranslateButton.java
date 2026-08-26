package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.RestrictedLanguagesSelectActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class TranslateButton extends FrameLayout implements Theme.Colorable {
    private boolean[] accusative;
    private final int currentAccount;
    private final long dialogId;
    private final BaseFragment fragment;
    private ImageView menuView;
    private Theme.ResourcesProvider resourcesProvider;
    private AnimatedTextView textView;
    private final Drawable translateDrawable;
    public final SpannableString translateIcon;

    public TranslateButton(Context context, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        this(context, chatActivity.getCurrentAccount(), chatActivity.getDialogId(), chatActivity, resourcesProvider);
    }

    public void lambda$new$0(View view) {
        onButtonClick();
    }

    public void lambda$new$1(int i, long j, View view) {
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (UserConfig.getInstance(i).isPremium() || (chat != null && chat.autotranslation)) {
            onMenuClick();
        } else {
            onCloseClick();
        }
    }

    public void lambda$onMenuClick$10(TranslateController translateController, ActionBarPopupWindow actionBarPopupWindow, View view) {
        String string;
        translateController.setHideTranslateDialog(this.dialogId, true);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
            string = chat != null ? LocaleController.getString(R.string.TranslationBarHiddenForGroup) : LocaleController.getString(R.string.TranslationBarHiddenForChat);
        } else {
            string = LocaleController.getString(R.string.TranslationBarHiddenForChannel);
        }
        BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.msg_translate, AndroidUtilities.replaceTags(string), LocaleController.getString(R.string.UndoNoCaps), new UndoView$$ExternalSyntheticLambda3(23, this, translateController)).show();
        actionBarPopupWindow.dismiss();
    }

    public void lambda$onMenuClick$11(ActionBarPopupWindow actionBarPopupWindow) {
        actionBarPopupWindow.dismiss();
        showCocoonAlert(getContext(), this.resourcesProvider);
    }

    public void lambda$onMenuClick$12(ActionBarPopupWindow actionBarPopupWindow, View view) {
        actionBarPopupWindow.dismiss();
        showCocoonAlert(getContext(), this.resourcesProvider);
    }

    public static void lambda$onMenuClick$2(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, View view) {
        actionBarPopupWindowLayout.getSwipeBack().closeForeground();
    }

    public void lambda$onMenuClick$3(TranslateController translateController, String str, ActionBarPopupWindow actionBarPopupWindow, View view) {
        translateController.setDialogTranslateTo(this.dialogId, str);
        actionBarPopupWindow.dismiss();
        updateText();
    }

    public void lambda$onMenuClick$4(TranslateController translateController, String str, ActionBarPopupWindow actionBarPopupWindow, View view) {
        translateController.setDialogTranslateTo(this.dialogId, str);
        actionBarPopupWindow.dismiss();
        updateText();
    }

    public void lambda$onMenuClick$5(boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, final TranslateController translateController, final ActionBarPopupWindow actionBarPopupWindow, ArrayList arrayList2) {
        String strCapitalFirst;
        final TranslateButton translateButton = this;
        if (zArr[0]) {
            return;
        }
        if (str != null && (strCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str))) != null) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, translateButton.getContext(), translateButton.resourcesProvider, false, false);
            actionBarMenuSubItem.setChecked(true);
            actionBarMenuSubItem.setText(strCapitalFirst);
            linearLayout.addView(actionBarMenuSubItem);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            TranslateController.Language language = (TranslateController.Language) arrayList.get(i);
            final String str3 = language.code;
            if (!TextUtils.equals(str3, str2)) {
                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, translateButton.getContext(), translateButton.resourcesProvider, false, false);
                boolean z = str != null && str.equals(str3);
                actionBarMenuSubItem2.setChecked(z);
                actionBarMenuSubItem2.setText(language.displayName);
                if (!z) {
                    final int i3 = 0;
                    actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(translateButton) {
                        public final TranslateButton f$0;

                        {
                            this.f$0 = translateButton;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$onMenuClick$3(translateController, str3, actionBarPopupWindow, view);
                                    break;
                                default:
                                    this.f$0.lambda$onMenuClick$4(translateController, str3, actionBarPopupWindow, view);
                                    break;
                            }
                        }
                    });
                }
                linearLayout.addView(actionBarMenuSubItem2);
            }
            i = i2;
        }
        linearLayout.addView(new ActionBarPopupWindow.GapView(translateButton.getContext(), translateButton.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator), LayoutHelper.createLinear(-1, 8));
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i4 + 1;
            TranslateController.Language language2 = (TranslateController.Language) arrayList2.get(i4);
            final String str4 = language2.code;
            if (!TextUtils.equals(str4, str2)) {
                boolean z2 = str != null && str.equals(str4);
                ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(2, translateButton.getContext(), translateButton.resourcesProvider, false, false);
                actionBarMenuSubItem3.setChecked(z2);
                actionBarMenuSubItem3.setText(language2.displayName);
                if (!z2) {
                    final int i6 = 1;
                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(translateButton) {
                        public final TranslateButton f$0;

                        {
                            this.f$0 = translateButton;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i6) {
                                case 0:
                                    this.f$0.lambda$onMenuClick$3(translateController, str4, actionBarPopupWindow, view);
                                    break;
                                default:
                                    this.f$0.lambda$onMenuClick$4(translateController, str4, actionBarPopupWindow, view);
                                    break;
                            }
                        }
                    });
                }
                linearLayout.addView(actionBarMenuSubItem3);
            }
            translateButton = this;
            i4 = i5;
        }
        zArr[0] = true;
    }

    public static void lambda$onMenuClick$6(Runnable runnable, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i, View view) {
        runnable.run();
        actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
    }

    public void lambda$onMenuClick$7() {
        this.fragment.presentFragment(new RestrictedLanguagesSelectActivity());
    }

    public void lambda$onMenuClick$8(String str, TranslateController translateController, String str2, ActionBarPopupWindow actionBarPopupWindow, View view) {
        RestrictedLanguagesSelectActivity.toggleLanguage(str, true);
        translateController.checkRestrictedLanguagesUpdate();
        translateController.setHideTranslateDialog(this.dialogId, true);
        BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.msg_translate, TranslateAlert2.capitalFirst(AndroidUtilities.replaceTags(this.accusative[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str2) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str2))), LocaleController.getString(R.string.Settings), new Tooltip$$ExternalSyntheticLambda0(this, 27)).show();
        actionBarPopupWindow.dismiss();
    }

    public void lambda$onMenuClick$9(TranslateController translateController) {
        translateController.setHideTranslateDialog(this.dialogId, false);
    }

    public static void lambda$showCocoonAlert$13(BottomSheet[] bottomSheetArr, Context context) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
        Browser.openUrl(context, LocaleController.getString(R.string.CocoonFeature1TextLink));
    }

    public static void lambda$showCocoonAlert$14(BottomSheet[] bottomSheetArr, Context context) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
        Browser.openUrlInSystemBrowser(context, LocaleController.getString(R.string.CocoonFeature3TextLink));
    }

    public static void lambda$showCocoonAlert$15(BottomSheet[] bottomSheetArr, Context context) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
        Browser.openUrl(context, LocaleController.getString(R.string.CocoonFooterLink));
    }

    public static void lambda$showCocoonAlert$16(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void showCocoonAlert(final Context context, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheet = new BottomSheet(context, false, false, resourcesProvider);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        bottomSheet.applyTopPadding = false;
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(AndroidUtilities.dp(150.0f));
        float fDp = AndroidUtilities.dp(12.0f);
        gradientDrawable.setCornerRadii(new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, LayoutHelper.createLinear(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) spannableStringBuilderReplaceTags.getSpans(0, spannableStringBuilderReplaceTags.length(), TypefaceSpan.class);
        for (int i = 0; i < typefaceSpanArr.length; i++) {
            spannableStringBuilderReplaceTags.setSpan(new ForegroundColorSpan(-1), spannableStringBuilderReplaceTags.getSpanStart(typefaceSpanArr[i]), spannableStringBuilderReplaceTags.getSpanEnd(typefaceSpanArr[i]), spannableStringBuilderReplaceTags.getSpanFlags(typefaceSpanArr[i]));
        }
        textView.setText(spannableStringBuilderReplaceTags);
        linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        linearLayoutM.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        final int i2 = 0;
        linearLayoutM.addView(new ChannelMonetizationLayout.FeatureCell(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new Runnable() {
            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        TranslateButton.lambda$showCocoonAlert$13(bottomSheetArr, context);
                        break;
                    case 1:
                        TranslateButton.lambda$showCocoonAlert$14(bottomSheetArr, context);
                        break;
                    default:
                        TranslateButton.lambda$showCocoonAlert$15(bottomSheetArr, context);
                        break;
                }
            }
        }), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 16, 32, 16));
        linearLayoutM.addView(new ChannelMonetizationLayout.FeatureCell(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 16));
        final int i3 = 1;
        linearLayoutM.addView(new ChannelMonetizationLayout.FeatureCell(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new Runnable() {
            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        TranslateButton.lambda$showCocoonAlert$13(bottomSheetArr, context);
                        break;
                    case 1:
                        TranslateButton.lambda$showCocoonAlert$14(bottomSheetArr, context);
                        break;
                    default:
                        TranslateButton.lambda$showCocoonAlert$15(bottomSheetArr, context);
                        break;
                }
            }
        }), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        linearLayoutM.addView(view, LayoutHelper.createLinear(-1, 1.0f / AndroidUtilities.density, 7, 24, 0, 24, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setGravity(17);
        final int i4 = 2;
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new Runnable() {
            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        TranslateButton.lambda$showCocoonAlert$13(bottomSheetArr, context);
                        break;
                    case 1:
                        TranslateButton.lambda$showCocoonAlert$14(bottomSheetArr, context);
                        break;
                    default:
                        TranslateButton.lambda$showCocoonAlert$15(bottomSheetArr, context);
                        break;
                }
            }
        }));
        linksTextView.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        linksTextView.setDisablePaddingsOffsetY(true);
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 0));
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        round.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)));
        round.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda95(bottomSheetArr, 4));
        linearLayoutM.addView(round, LayoutHelper.createLinear(-1, 48, 7, 16, 0, 16, 16));
        bottomSheet.customView = linearLayoutM;
        bottomSheetArr[0] = bottomSheet;
        bottomSheet.fixNavigationBar();
        bottomSheetArr[0].show();
    }

    public int[] getColorKeys() {
        return null;
    }

    public void onButtonClick() {
    }

    public void onCloseClick() {
    }

    public void onMenuClick() {
        TranslateController translateController = MessagesController.getInstance(this.currentAccount).getTranslateController();
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), R.drawable.popup_fixed_alert4, this.resourcesProvider, 1);
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ScrollView scrollView = new ScrollView(getContext()) {
            AnimatedFloat alphaFloat = new AnimatedFloat(this, 350, CubicBezierInterpolator.EASE_OUT_QUINT);
            Drawable topShadowDrawable;
            private boolean wasCanScrollVertically;

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                float f = this.alphaFloat.set(canScrollVertically(-1) ? 1.0f : 0.0f) * 0.5f;
                if (f > 0.0f) {
                    if (this.topShadowDrawable == null) {
                        this.topShadowDrawable = getContext().getResources().getDrawable(R.drawable.header_shadow);
                    }
                    this.topShadowDrawable.setBounds(0, getScrollY(), getWidth(), this.topShadowDrawable.getIntrinsicHeight() + getScrollY());
                    this.topShadowDrawable.setAlpha((int) (f * 255.0f));
                    this.topShadowDrawable.draw(canvas);
                }
            }

            @Override
            public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
                super.onNestedScroll(view, i, i2, i3, i4);
                boolean zCanScrollVertically = canScrollVertically(-1);
                if (this.wasCanScrollVertically != zCanScrollVertically) {
                    invalidate();
                    this.wasCanScrollVertically = zCanScrollVertically;
                }
            }
        };
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        scrollView.addView(linearLayout2);
        linearLayout2.setOrientation(1);
        actionBarPopupWindowLayout.swipeBackGravityRight = true;
        int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(linearLayout);
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, false);
        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate);
        actionBarMenuSubItem.setSubtext(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(translateController.getDialogTranslateTo(this.dialogId))));
        actionBarMenuSubItem.setItemHeight(56);
        actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, false);
        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back);
        actionBarMenuSubItem2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(actionBarPopupWindowLayout, 20));
        linearLayout.addView(actionBarMenuSubItem2);
        linearLayout.addView(scrollView, LayoutHelper.createLinear(-1, 420));
        String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(this.dialogId);
        TranslateAlert2.languageName(dialogDetectedLanguage);
        String strLanguageName = TranslateAlert2.languageName(dialogDetectedLanguage, this.accusative);
        String dialogTranslateTo = translateController.getDialogTranslateTo(this.dialogId);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i = Theme.key_actionBarDefaultSubmenuSeparator;
        linearLayout2.addView(new ActionBarPopupWindow.GapView(context, resourcesProvider, i), LayoutHelper.createLinear(-1, 8));
        actionBarMenuSubItem.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda134(new TranslateButton$$ExternalSyntheticLambda7(this, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, actionBarPopupWindow, languages), actionBarPopupWindowLayout, iAddViewToSwipeBack, 5));
        if (UserConfig.getInstance(this.currentAccount).isPremium() && strLanguageName != null) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
            String string = this.accusative[0] ? LocaleController.formatString(R.string.DoNotTranslateLanguage, strLanguageName) : LocaleController.formatString(R.string.DoNotTranslateLanguageOther, strLanguageName);
            actionBarMenuSubItem3.setMultiline(false);
            actionBarMenuSubItem3.setTextAndIcon(HintView2.cutInFancyHalfText(string, actionBarMenuSubItem3.getTextView().getPaint()), R.drawable.msg_block2);
            actionBarMenuSubItem3.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda70(this, dialogDetectedLanguage, translateController, strLanguageName, actionBarPopupWindow, 3));
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem3);
        }
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel);
        actionBarMenuSubItem4.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, translateController, actionBarPopupWindow, 18));
        actionBarPopupWindowLayout.addView(actionBarMenuSubItem4);
        actionBarPopupWindowLayout.addView(new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider, i), LayoutHelper.createLinear(-1, 8));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
        linksTextView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
        linksTextView.setDisablePaddingsOffsetY(true);
        int i2 = Theme.key_dialogTextBlack;
        linksTextView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
        linksTextView.setEmojiColor(Theme.getColor(i2, this.resourcesProvider));
        CharSequence charSequenceConcat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new UndoView$$ExternalSyntheticLambda3(24, this, actionBarPopupWindow)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(5197252827247841976L, linksTextView.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) " ");
        linksTextView.setText(HintView2.cutInFancyHalfText(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", charSequenceConcat, spannableStringBuilder2), spannableStringBuilder), linksTextView.getPaint()));
        linksTextView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 12));
        linksTextView.setOnClickListener(new UndoView$$ExternalSyntheticLambda6(11, this, actionBarPopupWindow));
        actionBarPopupWindowLayout.addView(linksTextView);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.setSoftInputMode(0);
        ImageView imageView = this.menuView;
        actionBarPopupWindow.showAsDropDown(imageView, 0, (-imageView.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
    }

    public void setLeftMargin(float f) {
        this.textView.setTranslationX(f / 2.0f);
    }

    @Override
    public void updateColors() {
        AnimatedTextView animatedTextView = this.textView;
        int i = Theme.key_chat_addContact;
        animatedTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        AnimatedTextView animatedTextView2 = this.textView;
        int color = Theme.getColor(i, this.resourcesProvider) & 436207615;
        float fDp = AndroidUtilities.dp(15.0f);
        int iDp = AndroidUtilities.dp(3.0f);
        animatedTextView2.setBackground(Theme.createInsetRoundRectDrawable(color, fDp, iDp, iDp, iDp, iDp));
        this.menuView.setBackground(Theme.createCircleSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 0));
        ImageView imageView = this.menuView;
        int color2 = Theme.getColor(Theme.key_chat_topPanelClose, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color2, mode));
        this.translateDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), mode));
    }

    public void updateText() {
        TranslateController translateController = MessagesController.getInstance(this.currentAccount).getTranslateController();
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (translateController.isTranslatingDialog(this.dialogId)) {
            String strLanguageName = TranslateAlert2.languageName(translateController.getDialogDetectedLanguage(this.dialogId));
            if (TextUtils.isEmpty(strLanguageName)) {
                this.textView.setText(TextUtils.concat(this.translateIcon, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            } else {
                this.textView.setText(TextUtils.concat(this.translateIcon, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, strLanguageName)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(this.dialogId);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            String strLanguageName2 = TranslateAlert2.languageName(dialogTranslateTo, this.accusative);
            this.textView.setText(TextUtils.concat(this.translateIcon, " ", this.accusative[0] ? LocaleController.formatString(R.string.TranslateToButton, strLanguageName2) : LocaleController.formatString(R.string.TranslateToButtonOther, strLanguageName2)));
        }
        this.menuView.setImageResource((UserConfig.getInstance(this.currentAccount).isPremium() || (chat != null && chat.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public TranslateButton(Context context, int i, long j, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.accusative = new boolean[1];
        this.currentAccount = i;
        this.dialogId = j;
        this.fragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false) {
            @Override
            public void onDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        };
        this.textView = animatedTextView;
        animatedTextView.setAnimationProperties(0.3f, 0L, 450L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.textView.setTextSize(AndroidUtilities.dp(14.0f));
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        this.textView.setGravity(1);
        this.textView.setIgnoreRTL(!LocaleController.isRTL);
        AnimatedTextView animatedTextView2 = this.textView;
        animatedTextView2.adaptWidth = false;
        animatedTextView2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 19));
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.translateDrawable = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.translateIcon = spannableString;
        spannableString.setSpan(new ImageSpan(drawableMutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.menuView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.menuView.setImageResource(R.drawable.msg_mini_customize);
        this.menuView.setOnClickListener(new JoinGroupAlert$$ExternalSyntheticLambda12(this, i, j));
        addView(this.menuView, LayoutHelper.createFrame(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }
}
