package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
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
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class AIEditorAlert extends BottomSheetWithRecyclerListView {
    private boolean[] accusative;
    private UniversalAdapter adapter;
    private ButtonWithCounterView allButton;
    private FrameLayout bulletinContainer;
    private ButtonWithCounterView button;
    private LinearLayout buttonContainer;
    private boolean buttonShowLimit;
    private ImageView closeView;
    private boolean collapsed;
    private long dialogId;
    private boolean editing;
    private boolean emojify;
    private CharSequence fixedText;
    private boolean fixedTextLoading;
    private CharSequence fixedTextToCopy;
    private String from_lang;
    private boolean[] genitive;
    private TLRPC.TL_messages_composeMessageWithAI[] lastRequest;
    private boolean loading;
    private Utilities.Callback4 onSendListener;
    private Utilities.Callback onUseListener;
    private int requestId;
    private ButtonWithCounterView sendButton;
    private HintView2 styleHint;
    private Tabs styleTabs;
    private CharSequence styledText;
    private boolean styledTextLoading;
    private final Tabs tabs;
    private final FrameLayout tabsContainer;
    private CharSequence text;
    private CharSequence title;
    private RLottieDrawable titleLoadingDrawable;
    private String to_lang;
    private final Long[] toneDocumentId;
    private final String[] toneTitles;
    private final String[] tones;
    private String translateTone;
    private String translateToneTitle;
    private CharSequence translatedText;
    private boolean translatedTextLoading;

    public AIEditorAlert(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.accusative = new boolean[1];
        this.genitive = new boolean[1];
        this.collapsed = true;
        this.requestId = -1;
        this.lastRequest = new TLRPC.TL_messages_composeMessageWithAI[3];
        String[] strArrSplit = MessagesController.getInstance(this.currentAccount).aiComposeStyles.split(";;;");
        this.tones = new String[strArrSplit.length];
        this.toneTitles = new String[strArrSplit.length];
        this.toneDocumentId = new Long[strArrSplit.length];
        int i = 0;
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split("\\|");
            this.tones[i] = strArrSplit2[0];
            try {
                this.toneDocumentId[i] = Long.valueOf(Long.parseLong(strArrSplit2[1]));
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.toneTitles[i] = strArrSplit2[2];
            i++;
        }
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeView.setImageResource(R.drawable.ic_close_white);
        ImageView imageView2 = this.closeView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        imageView2.setColorFilter(getThemedColor(i2));
        this.closeView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i2), 0.1f)));
        this.actionBar.addView(this.closeView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(this.closeView, 0.1f, 1.5f);
        this.closeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.tabsContainer = frameLayout;
        Tabs tabs = new Tabs(context, this.currentAccount, false, resourcesProvider);
        this.tabs = tabs;
        tabs.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        tabs.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        tabs.setRoundRadius(28);
        tabs.addTab(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.selectTab(((Integer) obj).intValue());
            }
        });
        tabs.addTab(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.selectTab(((Integer) obj).intValue());
            }
        });
        tabs.addTab(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.selectTab(((Integer) obj).intValue());
            }
        });
        tabs.selectTab(1);
        frameLayout.addView(tabs, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        Tabs tabs2 = new Tabs(context, this.currentAccount, true, resourcesProvider);
        this.styleTabs = tabs2;
        tabs2.setDivider(true);
        this.styleTabs.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.styleTabs.setRoundRadius(12);
        for (int i3 = 0; i3 < this.tones.length; i3++) {
            this.styleTabs.addTab(null, this.toneTitles[i3], this.toneDocumentId[i3], new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.selectStyle(((Integer) obj).intValue());
                }
            });
        }
        this.styleTabs.selectTab(-1);
        String toLanguage = TranslateAlert2.getToLanguage();
        this.to_lang = toLanguage;
        if (toLanguage == null) {
            this.to_lang = TranslateController.currentLanguage();
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.topPadding = 0.35f;
        int i4 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i4));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.buttonContainer.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.buttonContainer.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i4), 0.0f), getThemedColor(i4), getThemedColor(i4)}));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.OK));
        this.buttonContainer.addView(this.button, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.sendButton = round2;
        round2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        this.sendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$4(resourcesProvider, context, view);
            }
        });
        this.buttonContainer.addView(this.sendButton, LayoutHelper.createLinear(48, 48, 5, 10, 0, 0, 0));
        this.allButton = new ButtonWithCounterView(context, resourcesProvider).setRound();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new LimitSpan("x50"), length, spannableStringBuilder.length(), 33);
        this.allButton.setText(spannableStringBuilder);
        this.allButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$5(resourcesProvider, view);
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
        int i5 = layoutParamsCreateFrame.leftMargin;
        int i6 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i5 + i6;
        layoutParamsCreateFrame.rightMargin += i6;
        this.containerView.addView(this.buttonContainer, layoutParamsCreateFrame);
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i7 = layoutParamsCreateFrame2.leftMargin;
        int i8 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame2.leftMargin = i7 + i8;
        layoutParamsCreateFrame2.rightMargin += i8;
        this.containerView.addView(this.allButton, layoutParamsCreateFrame2);
        this.bulletinContainer = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParamsCreateFrame3 = LayoutHelper.createFrame(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i9 = layoutParamsCreateFrame3.leftMargin;
        int i10 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame3.leftMargin = i9 + i10;
        layoutParamsCreateFrame3.rightMargin += i10;
        this.containerView.addView(this.bulletinContainer, layoutParamsCreateFrame3);
        updateButton(false, false);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i11 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i11, 0, i11, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i12) {
                this.f$0.lambda$new$6(view, i12);
            }
        });
        this.takeTranslationIntoAccount = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) AIEditorAlert.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i12, int i13) {
                AIEditorAlert.this.updateStyleHintY();
            }
        });
        this.adapter.update(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.showStyleHint();
            }
        });
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    public void lambda$new$1(View view) {
        if (this.onSendListener != null && getResultText() != null) {
            this.onSendListener.run(getResultText(), 0, 0, Boolean.TRUE);
        }
        lambda$new$0();
    }

    public boolean lambda$new$4(final Theme.ResourcesProvider resourcesProvider, final Context context, View view) {
        if (this.editing || this.onSendListener == null || getResultText() == null) {
            return false;
        }
        boolean z = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        ItemOptions.makeOptions(this.container, resourcesProvider, this.sendButton).addIf(!z, R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$2();
            }
        }).add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$3(context, resourcesProvider);
            }
        }).show();
        return true;
    }

    public void lambda$new$2() {
        this.onSendListener.run(getResultText(), 0, 0, Boolean.FALSE);
        lambda$new$0();
    }

    public void lambda$new$3(Context context, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createScheduleDatePickerDialog(context, this.dialogId, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public void didSelectDate(boolean z, int i, int i2) {
                AIEditorAlert.this.onSendListener.run(AIEditorAlert.this.getResultText(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
                AIEditorAlert.this.lambda$new$0();
            }
        }, resourcesProvider);
    }

    public void lambda$new$5(Theme.ResourcesProvider resourcesProvider, View view) {
        new PremiumFeatureBottomSheet(getContext(), 42, true, resourcesProvider).show();
    }

    public void lambda$new$6(View view, int i) {
        this.adapter.getItem(i - 1);
    }

    private void updateSendButtonIcon() {
        this.sendButton.setVisibility(this.editing ? 8 : 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(this.editing ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24);
        coloredImageSpan.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
        this.sendButton.setText(spannableStringBuilder);
    }

    private void updateButton(boolean z) {
        updateButton(z, true);
    }

    private void updateButton(final boolean z, boolean z2) {
        if (z2 && this.buttonShowLimit == z) {
            return;
        }
        this.buttonShowLimit = z;
        if (z2) {
            this.allButton.setVisibility(0);
            this.buttonContainer.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAlpha = this.allButton.animate().alpha(z ? 1.0f : 0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateButton$7(z);
                }
            }).start();
            this.buttonContainer.animate().alpha(z ? 0.0f : 1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateButton$8(z);
                }
            }).start();
            return;
        }
        this.allButton.setVisibility(z ? 0 : 8);
        this.allButton.setAlpha(z ? 1.0f : 0.0f);
        this.buttonContainer.setVisibility(z ? 8 : 0);
        this.buttonContainer.setAlpha(z ? 0.0f : 1.0f);
    }

    public void lambda$updateButton$7(boolean z) {
        if (z) {
            return;
        }
        this.allButton.setVisibility(8);
    }

    public void lambda$updateButton$8(boolean z) {
        if (z) {
            this.buttonContainer.setVisibility(8);
        }
    }

    public void showStyleHint() {
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide();
            this.styleHint = null;
        }
        HintView2 hintView22 = new HintView2(getContext(), 1);
        this.styleHint = hintView22;
        hintView22.setText(LocaleController.getString(R.string.AIEditorChooseStyle));
        this.styleHint.setJoint(0.5f, 0.0f);
        this.styleHint.setDuration(8000L);
        this.containerView.addView(this.styleHint, LayoutHelper.createFrame(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.styleHint.show();
        updateStyleHintY();
    }

    public void updateStyleHintY() {
        View childAt;
        if (this.styleHint == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.recyclerListView.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = this.recyclerListView.getChildAt(i);
            UItem item = this.adapter.getItem(this.recyclerListView.getChildAdapterPosition(childAt) - 1);
            if (item != null && item.view == this.styleTabs) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null) {
            this.styleHint.setVisibility(0);
            this.styleHint.setTranslationY(this.recyclerListView.getY() + childAt.getY() + childAt.getHeight());
        } else {
            this.styleHint.setVisibility(4);
            this.styleHint.hide();
        }
    }

    public void selectTab(int i) {
        if (this.tabs.getSelectedTab() == i) {
            return;
        }
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        this.tabs.selectTab(i);
        request();
        this.adapter.update(true);
    }

    public void selectStyle(int i) {
        if (this.styleTabs.getSelectedTab() == i) {
            return;
        }
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        this.styleTabs.selectTab(i);
        request();
        this.adapter.update(true);
    }

    @Override
    protected void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        if (valueAnimator != null) {
            this.buttonContainer.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            this.buttonContainer.setTranslationY(0.0f);
        }
    }

    @Override
    protected void onActionBarAlpha(float f) {
        float f2 = 1.0f - f;
        this.closeView.setAlpha(f2);
        this.closeView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
        this.closeView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
    }

    public static CharSequence copy(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence.toString();
        }
        Spanned spanned = (Spanned) charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
        Class[] clsArr = {TextStyleSpan.class, CodeHighlighting.Span.class, SquigglyLinesSpan.class, URLSpanUserMention.class, URLSpanReplacement.class, URLSpanMono.class, URLSpanNoUnderline.class, FormattedDateSpan.class, URLSpanBrowser.class, URLSpanBotCommand.class, AnimatedEmojiSpan.class};
        for (int i = 0; i < 11; i++) {
            for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i])) {
                spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
            }
        }
        return spannableStringBuilder;
    }

    public AIEditorAlert setText(CharSequence charSequence) {
        this.text = copy(charSequence);
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(charSequence.toString(), new LanguageDetector.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.lambda$setText$9(str);
                }
            }, new LanguageDetector.ExceptionCallback() {
                @Override
                public final void run(Exception exc) {
                    FileLog.e(exc);
                }
            });
        }
        return this;
    }

    public void lambda$setText$9(String str) {
        this.from_lang = str;
        this.adapter.update(true);
    }

    public AIEditorAlert setOnUse(Utilities.Callback callback) {
        this.onUseListener = callback;
        return this;
    }

    public AIEditorAlert setOnSend(long j, boolean z, Utilities.Callback4 callback4) {
        this.dialogId = j;
        this.editing = z;
        this.onSendListener = callback4;
        return this;
    }

    @Override
    protected CharSequence getTitle() {
        if (this.title == null) {
            this.title = LocaleController.getString(R.string.AIEditor);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.emoji_stars, "emoji_stars", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.titleLoadingDrawable = rLottieDrawable;
            rLottieDrawable.setAllowDecodeSingleFrame(true);
            this.titleLoadingDrawable.setAutoRepeat(1);
        }
        return this.title;
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void toggleEmojify(View view) {
        this.emojify = !this.emojify;
        request();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof CheckBox2) {
                ((CheckBox2) linearLayout.getChildAt(0)).setChecked(this.emojify, true);
            }
        }
    }

    public CharSequence getResultText() {
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

    public void copyResult(View view) {
        if (this.loading) {
            return;
        }
        AndroidUtilities.addToClipboard(getResultText());
    }

    public void collapse(View view) {
        this.collapsed = false;
        saveScrollPosition();
        this.adapter.update(true);
        applyScrolledPosition(true);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String strSubstring;
        String str;
        String strSubstring2;
        String strSubstring3;
        arrayList.add(UItem.asShadow(null));
        arrayList.add(UItem.asCustomShadow(this.tabsContainer));
        arrayList.add(UItem.asShadow(null));
        universalAdapter.itemsOffset = 1;
        universalAdapter.whiteSectionStart();
        Tabs tabs = this.tabs;
        int selectedTab = tabs != null ? tabs.getSelectedTab() : 0;
        if (selectedTab == 0) {
            String str2 = this.from_lang;
            String str3 = "";
            if (str2 != null && !str2.equalsIgnoreCase("und")) {
                String strLanguageName = TranslateAlert2.languageName(this.from_lang, null, this.genitive);
                boolean[] zArr = this.genitive;
                String string = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                int iIndexOf = string.indexOf("%s");
                if (iIndexOf < 0) {
                    strSubstring3 = "";
                    strSubstring2 = strSubstring3;
                } else {
                    strSubstring2 = string.substring(0, iIndexOf);
                    strSubstring3 = string.substring(iIndexOf + 2);
                }
                if (TextUtils.isEmpty(strSubstring2)) {
                    strLanguageName = TranslateAlert2.capitalFirst(strLanguageName);
                }
                arrayList.add(TranslateAlert3.Header.Factory.of(3, strSubstring2, strLanguageName, strSubstring3, null));
            } else {
                arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
            }
            arrayList.add(TranslateAlert3.Text.Factory.of(4, this.text, this.collapsed, false, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.collapse(view);
                }
            }, null, null));
            String strLanguageName2 = TranslateAlert2.languageName(this.to_lang, this.accusative);
            boolean[] zArr2 = this.accusative;
            String string2 = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
            int iIndexOf2 = string2.indexOf("%s");
            if (iIndexOf2 < 0) {
                str = "";
                strSubstring = str;
            } else {
                String strSubstring4 = string2.substring(0, iIndexOf2);
                strSubstring = string2.substring(iIndexOf2 + 2);
                str = strSubstring4;
            }
            if (TextUtils.isEmpty(str)) {
                strLanguageName2 = TranslateAlert2.capitalFirst(strLanguageName2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strLanguageName2);
            if (this.translateToneTitle != null) {
                str3 = " (" + this.translateToneTitle + ")";
            }
            sb.append(str3);
            arrayList.add(TranslateAlert3.Header.Factory.of(5, str, sb.toString(), strSubstring, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onToLangMenu(view);
                }
            }, this.emojify, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.toggleEmojify(view);
                }
            }));
            boolean z = this.translatedTextLoading;
            arrayList.add(TranslateAlert3.Text.Factory.of(z ? 7 : 6, this.translatedText, false, false, null, null, !z ? new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.copyResult(view);
                }
            } : null));
        } else if (selectedTab == 1) {
            arrayList.add(UItem.asCustom(this.styleTabs));
            Tabs tabs2 = this.styleTabs;
            if (tabs2 != null && tabs2.getSelectedTab() < 0 && !this.emojify) {
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, this.emojify, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.toggleEmojify(view);
                    }
                }));
                arrayList.add(TranslateAlert3.Text.Factory.of(this.styledTextLoading ? 7 : 6, this.text, false, false, null, null, null));
            } else {
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorResult), null, null, null, this.emojify, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.toggleEmojify(view);
                    }
                }));
                boolean z2 = this.styledTextLoading;
                arrayList.add(TranslateAlert3.Text.Factory.of(z2 ? 7 : 6, this.styledText, false, false, null, null, !z2 ? new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.copyResult(view);
                    }
                } : null));
            }
        } else if (selectedTab == 2) {
            arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
            arrayList.add(TranslateAlert3.Text.Factory.of(4, this.text, this.collapsed, false, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.collapse(view);
                }
            }, null, null));
            arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
            boolean z3 = this.fixedTextLoading;
            arrayList.add(TranslateAlert3.Text.Factory.of(z3 ? 7 : 6, this.fixedText, false, false, null, null, !z3 ? new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.copyResult(view);
                }
            } : null));
        }
        universalAdapter.whiteSectionEnd();
        arrayList.add(UItem.asShadow(null));
    }

    @Override
    public void show() {
        super.show();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        updateSendButtonIcon();
        this.adapter.update(false);
        request();
        if (this.onUseListener != null) {
            this.button.setText(LocaleController.getString(R.string.AIEditorApply));
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$show$11(view);
                }
            });
        }
    }

    public void lambda$show$11(View view) {
        if (this.onUseListener != null && getResultText() != null) {
            this.onUseListener.run(getResultText());
        }
        lambda$new$0();
    }

    public void onToLangMenu(View view) {
        String[] strArr;
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        itemOptionsMakeOptions.setMaxHeight(AndroidUtilities.dp(450.0f));
        itemOptionsMakeOptions.setDrawScrim(false);
        itemOptionsMakeOptions.setOnTopOfScrim();
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        itemOptionsMakeOptions.addView(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(this.to_lang)) {
            addChecked(itemOptionsMakeOptions, linearLayout, true, TranslateAlert2.capitalFirst(TranslateAlert2.languageName(this.to_lang)), null);
        }
        Iterator<TranslateController.Language> it = suggestedLanguages.iterator();
        while (it.hasNext()) {
            final TranslateController.Language next = it.next();
            if (!TextUtils.equals(next.code, this.to_lang)) {
                addChecked(itemOptionsMakeOptions, linearLayout, false, next.displayName, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onToLangMenu$12(next);
                    }
                });
            }
        }
        View gapView = new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        Iterator<TranslateController.Language> it2 = languages.iterator();
        while (it2.hasNext()) {
            final TranslateController.Language next2 = it2.next();
            addChecked(itemOptionsMakeOptions, linearLayout, TextUtils.equals(next2.code, this.to_lang), next2.displayName, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onToLangMenu$13(next2);
                }
            });
        }
        itemOptionsMakeOptions.addSpaceGap(false);
        Tabs tabs = new Tabs(getContext(), this.currentAccount, 1, false, this.resourcesProvider);
        tabs.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        tabs.setRoundRadius(12);
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$onToLangMenu$14(itemOptionsMakeOptions, (Integer) obj);
            }
        };
        tabs.addTab("🏳", LocaleController.getString(R.string.AIEditorToneNeutral), null, callback);
        int i = 0;
        while (true) {
            strArr = this.tones;
            if (i >= strArr.length) {
                break;
            }
            tabs.addTab(null, this.toneTitles[i], this.toneDocumentId[i], callback);
            i++;
        }
        String str = this.translateTone;
        tabs.selectTab(str == null ? 0 : indexOf(strArr, str) + 1, false);
        itemOptionsMakeOptions.addView(tabs, LayoutHelper.createLinear(72, -1));
        itemOptionsMakeOptions.show();
    }

    public void lambda$onToLangMenu$12(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        request();
    }

    public void lambda$onToLangMenu$13(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        request();
    }

    public void lambda$onToLangMenu$14(ItemOptions itemOptions, Integer num) {
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        this.translateTone = num.intValue() == 0 ? null : this.tones[num.intValue() - 1];
        this.translateToneTitle = num.intValue() != 0 ? this.toneTitles[num.intValue() - 1] : null;
        request();
        itemOptions.dismiss();
    }

    private int indexOf(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.equals(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    private void addChecked(final ItemOptions itemOptions, LinearLayout linearLayout, final boolean z, CharSequence charSequence, final Runnable runnable) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setChecked(z);
        actionBarMenuSubItem.setColors(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i2, this.resourcesProvider));
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AIEditorAlert.lambda$addChecked$15(itemOptions, z, runnable, view);
            }
        });
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    public static void lambda$addChecked$15(ItemOptions itemOptions, boolean z, Runnable runnable, View view) {
        itemOptions.dismiss();
        if (z || runnable == null) {
            return;
        }
        runnable.run();
    }

    private int estimateLinesCount() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int selectedTab = this.tabs.getSelectedTab();
        CharSequence charSequence4 = this.text;
        if (selectedTab == 0 && (charSequence3 = this.translatedText) != null) {
            charSequence4 = charSequence3;
        }
        if (selectedTab == 1 && (charSequence2 = this.styledText) != null) {
            charSequence4 = charSequence2;
        }
        CharSequence charSequence5 = (selectedTab != 2 || (charSequence = this.fixedText) == null) ? charSequence4 : charSequence;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
        int i = this.backgroundPaddingLeft;
        return MathUtils.clamp(new StaticLayout(charSequence5, textPaint, (iDp - i) - i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
    }

    private void request() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.text};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        final int selectedTab = this.tabs.getSelectedTab();
        final TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = this.to_lang;
            tL_messages_composeMessageWithAI.change_tone = this.translateTone;
            tL_messages_composeMessageWithAI.emojify = this.emojify;
        } else if (selectedTab == 1) {
            int selectedTab2 = this.styleTabs.getSelectedTab();
            if (selectedTab2 >= 0) {
                String[] strArr = this.tones;
                if (selectedTab2 < strArr.length) {
                    tL_messages_composeMessageWithAI.change_tone = strArr[selectedTab2];
                }
            }
            tL_messages_composeMessageWithAI.emojify = this.emojify;
        } else if (selectedTab == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.lastRequest[selectedTab];
        if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TextUtils.equals(tL_messages_composeMessageWithAI2.change_tone, tL_messages_composeMessageWithAI.change_tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.change_tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
            ButtonWithCounterView buttonWithCounterView = this.button;
            this.loading = true;
            buttonWithCounterView.setLoading(true);
            final SimpleTextView titleTextView = this.actionBar.getTitleTextView();
            titleTextView.setRightDrawable(this.titleLoadingDrawable);
            this.titleLoadingDrawable.start();
            int iEstimateLinesCount = estimateLinesCount();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < iEstimateLinesCount; i++) {
                if (i > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int iDp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                spannableStringBuilder.setSpan(new LoadingSpan(null, iDp, 0).setHeight(AndroidUtilities.dp(6.0f)).setAlpha(0.5f).setFullWidth(true), length, spannableStringBuilder.length(), 33);
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
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$request$18(titleTextView, selectedTab, tL_messages_composeMessageWithAI, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                }
            });
            this.adapter.update(true);
        }
    }

    public void lambda$request$18(SimpleTextView simpleTextView, int i, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        ButtonWithCounterView buttonWithCounterView = this.button;
        this.loading = false;
        buttonWithCounterView.setLoading(false);
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText))).show();
            updateButton(true);
            return;
        }
        if (tL_error != null) {
            BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).showForError(tL_error);
            simpleTextView.setRightDrawable((Drawable) null);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$request$16(view);
                }
            });
            updateButton(false);
            return;
        }
        if (tL_composedMessageWithAI == null) {
            simpleTextView.setRightDrawable((Drawable) null);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$request$17(view);
                }
            });
            updateButton(false);
            return;
        }
        simpleTextView.setRightDrawable((Drawable) null);
        updateButton(false);
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

    public void lambda$request$16(View view) {
        lambda$new$0();
    }

    public void lambda$request$17(View view) {
        lambda$new$0();
    }

    private void cancelRequest() {
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

    public static final class Tabs extends FrameLayout {
        private AnimatedFloat animatedSelectedTab;
        private final int currentAccount;
        private boolean divider;
        private final LinearLayout layout;
        private final Theme.ResourcesProvider resourcesProvider;
        private int roundRadiusDp;
        private final FrameLayout scrollView;
        private int selectedTab;

        public Tabs(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this(context, i, 0, z, resourcesProvider);
        }

        public Tabs(Context context, int i, int i2, boolean z, final Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayout = new LinearLayout(context) {
                private final RectF floorRect = new RectF();
                private final RectF ceilRect = new RectF();
                private final RectF rect = new RectF();
                private final Paint selectorPaint = new Paint(1);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    float f = Tabs.this.animatedSelectedTab == null ? 0.0f : Tabs.this.animatedSelectedTab.set(Tabs.this.selectedTab);
                    double d = f;
                    int iFloor = (int) Math.floor(d);
                    int iCeil = (int) Math.ceil(d);
                    float f2 = f - iFloor;
                    if (iFloor >= 0 && iFloor < getChildCount()) {
                        View childAt = getChildAt(iFloor);
                        this.floorRect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                    }
                    if (iCeil >= 0 && iCeil < getChildCount()) {
                        View childAt2 = getChildAt(iCeil);
                        this.ceilRect.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                    }
                    AndroidUtilities.lerp(this.floorRect, this.ceilRect, f2, this.rect);
                    this.selectorPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), 0.1f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(Tabs.this.roundRadiusDp), AndroidUtilities.dp(Tabs.this.roundRadiusDp), this.selectorPaint);
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        View childAt3 = getChildAt(i3);
                        if (childAt3 instanceof Tab) {
                            ((Tab) childAt3).updateSelected(Math.max(0.0f, 1.0f - Math.abs(i3 - f)), false);
                        }
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                protected void onMeasure(int i3, int i4) {
                    boolean z2 = getOrientation() == 0;
                    int size = z2 ? View.MeasureSpec.getSize(i3) : View.MeasureSpec.getSize(i4);
                    int i5 = 0;
                    int iMax = 0;
                    for (int i6 = 0; i6 < getChildCount(); i6++) {
                        View childAt = getChildAt(i6);
                        childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        childAt.measure(z2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i3, !z2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i4);
                        int measuredWidth = z2 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                        iMax = Math.max(iMax, measuredWidth);
                        i5 += measuredWidth;
                    }
                    boolean z3 = i5 <= size && ((float) iMax) < ((float) size) / ((float) getChildCount());
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt2 = getChildAt(i7);
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
                    super.onMeasure(i3, i4);
                }
            };
            this.layout = linearLayout;
            linearLayout.setOrientation(i2);
            this.animatedSelectedTab = new AnimatedFloat(linearLayout, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            if (z) {
                if (i2 == 0) {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    this.scrollView = horizontalScrollView;
                    horizontalScrollView.setFillViewport(true);
                } else {
                    ScrollView scrollView = new ScrollView(context);
                    this.scrollView = scrollView;
                    scrollView.setFillViewport(true);
                }
                this.scrollView.addView(linearLayout);
                addView(this.scrollView, LayoutHelper.createFrame(-1, -1, 119));
                return;
            }
            this.scrollView = null;
            addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
        }

        public void setDivider(boolean z) {
            this.divider = z;
        }

        public void setRoundRadius(int i) {
            this.roundRadiusDp = i;
        }

        public Tab addTab(int i, CharSequence charSequence, final Utilities.Callback callback) {
            final int childCount = this.layout.getChildCount();
            Tab tab = new Tab(getContext(), this.currentAccount, this.resourcesProvider);
            tab.setRoundRadius(this.roundRadiusDp);
            tab.set(i, charSequence);
            tab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AIEditorAlert.Tabs.lambda$addTab$0(callback, childCount, view);
                }
            });
            this.layout.addView(tab, LayoutHelper.createLinear(0, -1, 1.0f, 119));
            return tab;
        }

        public static void lambda$addTab$0(Utilities.Callback callback, int i, View view) {
            callback.run(Integer.valueOf(i));
        }

        public Tab addTab(String str, CharSequence charSequence, Long l, final Utilities.Callback callback) {
            final int childCount = this.layout.getChildCount();
            Tab tab = new Tab(getContext(), this.currentAccount, this.resourcesProvider);
            tab.setRoundRadius(this.roundRadiusDp);
            tab.set(str, charSequence, l);
            tab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AIEditorAlert.Tabs.lambda$addTab$1(callback, childCount, view);
                }
            });
            LinearLayout linearLayout = this.layout;
            linearLayout.addView(tab, LayoutHelper.createLinear(linearLayout.getOrientation() == 0 ? 0 : -1, this.layout.getOrientation() == 1 ? 0 : -1, 1.0f, 119));
            return tab;
        }

        public static void lambda$addTab$1(Utilities.Callback callback, int i, View view) {
            callback.run(Integer.valueOf(i));
        }

        public int getSelectedTab() {
            return this.selectedTab;
        }

        public void selectTab(int i) {
            selectTab(i, true);
        }

        public void selectTab(int i, boolean z) {
            if (this.selectedTab == i) {
                return;
            }
            this.selectedTab = i;
            if (!z) {
                this.animatedSelectedTab.force(i);
            }
            if (i >= 0 && i < this.layout.getChildCount()) {
                View childAt = this.layout.getChildAt(i);
                if (childAt instanceof Tab) {
                    Tab tab = (Tab) childAt;
                    if (tab.imageView.getAnimatedEmojiDrawable() != null) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = tab.imageView.getAnimatedEmojiDrawable();
                        if (animatedEmojiDrawable.getImageReceiver() != null) {
                            animatedEmojiDrawable.getImageReceiver().startAnimation();
                        }
                    } else {
                        tab.imageView.getImageReceiver().startAnimation();
                    }
                }
            }
            this.layout.invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.divider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), themePaint);
            }
        }

        public static final class Tab extends FrameLayout implements Theme.Colorable {
            private final int currentAccount;
            private final BackupImageView imageView;
            private boolean isEmoji;
            public final LinearLayout layout;
            private final Theme.ResourcesProvider resourcesProvider;
            private int roundRadiusDp;
            private float selected;
            private final TextView textView;

            public Tab(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.currentAccount = i;
                this.resourcesProvider = resourcesProvider;
                LinearLayout linearLayout = new LinearLayout(context);
                this.layout = linearLayout;
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

            public Tab setRoundRadius(int i) {
                this.roundRadiusDp = i;
                updateColors();
                return this;
            }

            public void set(int i, CharSequence charSequence) {
                this.isEmoji = false;
                this.imageView.setImageResource(i);
                this.textView.setText(charSequence);
            }

            public void set(final String str, CharSequence charSequence, Long l) {
                this.isEmoji = true;
                this.imageView.setColorFilter(null);
                this.imageView.setImageDrawable(Emoji.getEmojiDrawable(str));
                this.textView.setText(charSequence);
                int i = this.currentAccount;
                if (ConnectionsManager.getInstance(i).isTestBackend()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < 4) {
                            if (UserConfig.getInstance(i2).isClientActivated() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                                i = i2;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
                if (l != null) {
                    this.imageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(9, this.currentAccount, l.longValue()));
                } else {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                    MediaDataController.getInstance(i).getStickerSet(tL_inputStickerSetShortName, null, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$set$0(str, (TLRPC.TL_messages_stickerSet) obj);
                        }
                    });
                }
            }

            public void lambda$set$0(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
                TLRPC.Document document;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
                String strReplace = str.replace("️", "");
                int i = 0;
                while (true) {
                    if (i >= tL_messages_stickerSet.packs.size()) {
                        break;
                    }
                    if (tL_messages_stickerSet.packs.get(i).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i).emoticon.replace("️", ""), strReplace)) {
                        i++;
                    } else {
                        long jLongValue = tL_messages_stickerSet.packs.get(i).documents.get(0).longValue();
                        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                            if (tL_messages_stickerSet.documents.get(i2).id == jLongValue) {
                                document = tL_messages_stickerSet.documents.get(i2);
                                break;
                            }
                        }
                    }
                }
                document = null;
                if (document != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(document), "24_24", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 24), document), "24_24", Emoji.getEmojiDrawable(str), (Object) null);
                }
            }

            public void updateSelected(float f, boolean z) {
                if (z || Math.abs(f - this.selected) >= 0.01f) {
                    this.selected = f;
                    int i = Theme.key_windowBackgroundWhiteBlackText;
                    int color = Theme.getColor(i, this.resourcesProvider);
                    int i2 = Theme.key_featuredStickers_addButton;
                    int iBlendARGB = ColorUtils.blendARGB(color, Theme.getColor(i2, this.resourcesProvider), f);
                    int iBlendARGB2 = ColorUtils.blendARGB(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i2, this.resourcesProvider), f);
                    this.imageView.setColorFilter(!this.isEmoji ? new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN) : null);
                    this.imageView.invalidate();
                    this.textView.setTextColor(iBlendARGB2);
                }
            }

            @Override
            public void updateColors() {
                updateSelected(this.selected, true);
                int iMultAlpha = Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), 0.1f);
                int i = this.roundRadiusDp;
                setBackground(Theme.createRadSelectorDrawable(iMultAlpha, i, i));
            }
        }
    }

    private final class LimitSpan extends ReplacementSpan {
        private final Paint paint = new Paint(1);
        private final Text text;

        public LimitSpan(CharSequence charSequence) {
            Text text = new Text(charSequence, 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            this.text = text;
            text.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) (this.text.getCurrentWidth() + AndroidUtilities.dp(6.66f));
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float f2 = (i3 + i5) / 2.0f;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f, f2 - AndroidUtilities.dp(7.66f), this.text.getCurrentWidth() + f + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f2);
            canvas.saveLayerAlpha(rectF, 255, 31);
            this.paint.setColor(paint.getColor());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.paint);
            this.text.draw(canvas, f + AndroidUtilities.dp(3.33f), f2, -1, 1.0f);
            canvas.restore();
        }
    }
}
