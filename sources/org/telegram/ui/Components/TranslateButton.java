package org.telegram.ui.Components;

import android.app.Activity;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda222;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda26;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;

public abstract class TranslateButton extends FrameLayout implements Theme.Colorable {
    public final boolean[] accusative;
    public final int currentAccount;
    public final long dialogId;
    public final ChatActivity fragment;
    public final ImageView menuView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass1 textView;
    public final Drawable translateDrawable;
    public final SpannableString translateIcon;

    public TranslateButton(final int i, final long j, Activity activity, Theme.ResourcesProvider resourcesProvider, ChatActivity chatActivity) {
        super(activity);
        boolean z = true;
        this.accusative = new boolean[1];
        this.currentAccount = i;
        this.dialogId = j;
        this.fragment = chatActivity;
        this.resourcesProvider = resourcesProvider;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity, z, z, false, 0);
        this.textView = anonymousClass1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = anonymousClass1.drawable;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 450L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        anonymousClass1.setTextSize(AndroidUtilities.dp(14.0f));
        anonymousClass1.setTypeface(AndroidUtilities.bold());
        anonymousClass1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        anonymousClass1.setGravity(1);
        anonymousClass1.setIgnoreRTL(!LocaleController.isRTL);
        anonymousClass1.adaptWidth = false;
        final ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) this;
        anonymousClass1.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(anonymousClass55, 8));
        addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.translateDrawable = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.translateIcon = spannableString;
        spannableString.setSpan(new ImageSpan(drawableMutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(activity);
        this.menuView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivity.AnonymousClass55 anonymousClass56 = anonymousClass55;
                int i2 = i;
                TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-j));
                if (!UserConfig.getInstance(i2).isPremium() && (chat == null || !chat.autotranslation)) {
                    ChatActivity chatActivity2 = ChatActivity.this;
                    MessagesController.getNotificationsSettings(((BaseFragment) chatActivity2).currentAccount).edit().putInt("dialog_show_translate_count" + chatActivity2.getDialogId(), 140).commit();
                    chatActivity2.updateTopPanel(true);
                    return;
                }
                int i3 = anonymousClass56.currentAccount;
                TranslateController translateController = MessagesController.getInstance(i3).getTranslateController();
                Context context = anonymousClass56.getContext();
                int i4 = R.drawable.popup_fixed_alert4;
                Theme.ResourcesProvider resourcesProvider2 = anonymousClass56.resourcesProvider;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(i4, 1, context, resourcesProvider2);
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
                actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider2));
                LinearLayout linearLayout = new LinearLayout(anonymousClass56.getContext());
                linearLayout.setOrientation(1);
                ScrollView scrollView = new ScrollView(anonymousClass56.getContext()) {
                    public final AnimatedFloat alphaFloat = new AnimatedFloat(350, this, CubicBezierInterpolator.EASE_OUT_QUINT);
                    public Drawable topShadowDrawable;
                    public boolean wasCanScrollVertically;

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        super.dispatchDraw(canvas);
                        float f = this.alphaFloat.set(canScrollVertically(-1) ? 1.0f : 0.0f, false) * 0.5f;
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
                    public final void onNestedScroll(View view2, int i5, int i6, int i7, int i8) {
                        super.onNestedScroll(view2, i5, i6, i7, i8);
                        boolean zCanScrollVertically = canScrollVertically(-1);
                        if (this.wasCanScrollVertically != zCanScrollVertically) {
                            invalidate();
                            this.wasCanScrollVertically = zCanScrollVertically;
                        }
                    }
                };
                LinearLayout linearLayout2 = new LinearLayout(anonymousClass56.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindowLayout.swipeBackGravityRight = true;
                int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(linearLayout);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, anonymousClass56.getContext(), anonymousClass56.resourcesProvider, true, false);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j2 = anonymousClass56.dialogId;
                actionBarMenuSubItem.setSubtext(TranslateAlert2.capitalFirst(TranslateAlert2.languageName(translateController.getDialogTranslateTo(j2), null, null)));
                actionBarMenuSubItem.setItemHeight(56);
                ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                anonymousClass2.addView(actionBarMenuSubItem);
                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, anonymousClass56.getContext(), anonymousClass56.resourcesProvider, true, false);
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                actionBarMenuSubItem2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda222(actionBarPopupWindowLayout, 2));
                linearLayout.addView(actionBarMenuSubItem2);
                linearLayout.addView(scrollView, LayoutHelper.createLinear(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j2);
                TranslateAlert2.languageName(dialogDetectedLanguage, null, null);
                boolean[] zArr = anonymousClass56.accusative;
                String strLanguageName = TranslateAlert2.languageName(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j2);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                Context context2 = anonymousClass56.getContext();
                int i5 = Theme.key_actionBarDefaultSubmenuSeparator;
                linearLayout2.addView(new ActionBarPopupWindow.GapView(context2, i5, resourcesProvider2), LayoutHelper.createLinear(-1, 8));
                actionBarMenuSubItem.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(new TranslateButton$$ExternalSyntheticLambda3(anonymousClass56, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, actionBarPopupWindow, languages), actionBarPopupWindowLayout, iAddViewToSwipeBack, 12));
                if (UserConfig.getInstance(i3).isPremium() && strLanguageName != null) {
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, anonymousClass56.getContext(), anonymousClass56.resourcesProvider, false, false);
                    String string = zArr[0] ? LocaleController.formatString(R.string.DoNotTranslateLanguage, strLanguageName) : LocaleController.formatString(R.string.DoNotTranslateLanguageOther, strLanguageName);
                    actionBarMenuSubItem3.setMultiline(false);
                    actionBarMenuSubItem3.setTextAndIcon(HintView2.cutInFancyHalfText(string, actionBarMenuSubItem3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    actionBarMenuSubItem3.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(anonymousClass56, dialogDetectedLanguage, translateController, strLanguageName, actionBarPopupWindow, 8));
                    anonymousClass2.addView(actionBarMenuSubItem3);
                }
                ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, anonymousClass56.getContext(), anonymousClass56.resourcesProvider, false, false);
                actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                actionBarMenuSubItem4.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(anonymousClass56, translateController, actionBarPopupWindow, 1));
                anonymousClass2.addView(actionBarMenuSubItem4);
                anonymousClass2.addView(new ActionBarPopupWindow.GapView(anonymousClass56.getContext(), i5, resourcesProvider2), LayoutHelper.createLinear(-1, 8));
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(anonymousClass56.getContext(), null);
                linksTextView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                linksTextView.setDisablePaddingsOffsetY(true);
                int i6 = Theme.key_dialogTextBlack;
                linksTextView.setTextColor(Theme.getColor(i6, resourcesProvider2));
                linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider2));
                linksTextView.setEmojiColor(Theme.getColor(i6, resourcesProvider2));
                CharSequence charSequenceConcat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new DialogsActivity$$ExternalSyntheticLambda8(1, anonymousClass56, actionBarPopupWindow)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(5197252827247841976L, 1.2f, linksTextView.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                linksTextView.setText(HintView2.cutInFancyHalfText(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", charSequenceConcat, spannableStringBuilder2), spannableStringBuilder), linksTextView.getPaint()));
                linksTextView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider2), 0, 12));
                linksTextView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(22, anonymousClass56, actionBarPopupWindow));
                anonymousClass2.addView(linksTextView);
                actionBarPopupWindow.pauseNotifications = true;
                actionBarPopupWindow.dismissAnimationDuration = 220;
                actionBarPopupWindow.setOutsideTouchable(true);
                actionBarPopupWindow.setClippingEnabled(true);
                actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                actionBarPopupWindow.setFocusable(true);
                actionBarPopupWindow.setInputMethodMode(2);
                actionBarPopupWindow.setSoftInputMode(0);
                ImageView imageView2 = anonymousClass56.menuView;
                actionBarPopupWindow.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, LayoutHelper.createFrame(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors$1();
    }

    public static void showCocoonAlert(Context context, Theme.ResourcesProvider resourcesProvider) {
        BottomSheet bottomSheet = new BottomSheet(context, resourcesProvider, false, false);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        bottomSheet.applyTopPadding = false;
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayoutM = zzkf.m(context, 1);
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
        linearLayoutM.addView(frameLayout, LayoutHelper.createFrame(-2.0f, -1));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new StarsIntroActivity$$ExternalSyntheticLambda26(bottomSheetArr, context, 1)), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 16, 32, 16));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 16));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new StarsIntroActivity$$ExternalSyntheticLambda26(bottomSheetArr, context, 2)), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        linearLayoutM.addView(view, LayoutHelper.createLinear(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setGravity(17);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new StarsIntroActivity$$ExternalSyntheticLambda26(bottomSheetArr, context, 3)));
        linksTextView.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        linksTextView.setDisablePaddingsOffsetY(true);
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)));
        buttonWithCounterView.setOnClickListener(new AccountFrozenAlert$$ExternalSyntheticLambda3(bottomSheetArr, 4));
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 16, 0, 16, 16));
        bottomSheet.customView = linearLayoutM;
        bottomSheetArr[0] = bottomSheet;
        bottomSheet.fixNavigationBar();
        bottomSheetArr[0].show();
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f) {
        this.textView.setTranslationX(f / 2.0f);
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_chat_addContact;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        AnonymousClass1 anonymousClass1 = this.textView;
        anonymousClass1.setTextColor(color);
        int color2 = Theme.getColor(i, resourcesProvider) & 436207615;
        float fDp = AndroidUtilities.dp(15.0f);
        int iDp = AndroidUtilities.dp(3.0f);
        anonymousClass1.setBackground(Theme.createInsetRoundRectDrawable(fDp, color2, iDp, iDp, iDp, iDp));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateCircleSelectorDrawable = Theme.createCircleSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 0);
        ImageView imageView = this.menuView;
        imageView.setBackground(rippleDrawableSafeCreateCircleSelectorDrawable);
        int color3 = Theme.getColor(Theme.key_chat_topPanelClose, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color3, mode));
        this.translateDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), mode));
    }

    public final void updateText$1() {
        int i = this.currentAccount;
        TranslateController translateController = MessagesController.getInstance(i).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i);
        long j = this.dialogId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
        boolean zIsTranslatingDialog = translateController.isTranslatingDialog(j);
        SpannableString spannableString = this.translateIcon;
        AnonymousClass1 anonymousClass1 = this.textView;
        if (zIsTranslatingDialog) {
            String strLanguageName = TranslateAlert2.languageName(translateController.getDialogDetectedLanguage(j), null, null);
            if (TextUtils.isEmpty(strLanguageName)) {
                anonymousClass1.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            } else {
                anonymousClass1.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, strLanguageName)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.accusative;
            String strLanguageName2 = TranslateAlert2.languageName(dialogTranslateTo, zArr, null);
            anonymousClass1.setText(TextUtils.concat(spannableString, " ", zArr[0] ? LocaleController.formatString(R.string.TranslateToButton, strLanguageName2) : LocaleController.formatString(R.string.TranslateToButtonOther, strLanguageName2)));
        }
        this.menuView.setImageResource((UserConfig.getInstance(i).isPremium() || (chat != null && chat.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public final class AnonymousClass1 extends AnimatedTextView {
        public final int $r8$classId;

        public AnonymousClass1(Context context, boolean z, boolean z2, boolean z3, int i) {
            super(context, z, z2, z3);
            this.$r8$classId = i;
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 2:
                    if (!HwEmojis.grab(this)) {
                        super.invalidate();
                        break;
                    }
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(17.0f), 0.0f);
                    super.onDraw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    super.onMeasure(i, i2);
                    setPivotX(getMeasuredWidth());
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 2:
                    if (!HwEmojis.grab(this)) {
                        super.invalidate(i, i2, i3, i4);
                        break;
                    }
                    break;
                default:
                    super.invalidate(i, i2, i3, i4);
                    break;
            }
        }
    }
}
