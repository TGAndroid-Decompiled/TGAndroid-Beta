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
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class AIEditorAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private final boolean[] accusative;
    private UniversalAdapter adapter;
    private final ButtonWithCounterView allButton;
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final LinearLayout buttonContainer;
    private boolean buttonShowLimit;
    private final ImageView closeView;
    private boolean collapsed;
    private long dialogId;
    private boolean editing;
    private boolean emojify;
    private CharSequence fixedText;
    private boolean fixedTextLoading;
    private CharSequence fixedTextToCopy;
    private String from_lang;
    private final boolean[] genitive;
    private TLRPC.TL_messages_composeMessageWithAI[] lastRequest;
    private boolean loading;
    private Utilities.Callback4 onSendListener;
    private Utilities.Callback onUseListener;
    private int requestId;
    private final ButtonWithCounterView sendButton;
    private HintView2 styleHint;
    private final Tabs styleTabs;
    private CharSequence styledText;
    private boolean styledTextLoading;
    private final Tabs tabs;
    private final FrameLayout tabsContainer;
    private CharSequence text;
    private CharSequence title;
    private RLottieDrawable titleLoadingDrawable;
    private String to_lang;
    private final AiTonesController tonesController;
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
        imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i), 0.1f)));
        this.actionBar.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener() {
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
        tabs2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        tabs2.setRoundRadius(12);
        tabs2.setOnItemLongClick(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return this.f$0.lambda$new$8(resourcesProvider, context, (AIEditorAlert.Tabs.Tab) obj);
            }
        });
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
        int i2 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonContainer = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i2), 0.0f), getThemedColor(i2), getThemedColor(i2)}));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.OK));
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.sendButton = round2;
        round2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$9(view);
            }
        });
        round2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$12(resourcesProvider, context, view);
            }
        });
        linearLayout.addView(round2, LayoutHelper.createLinear(48, 48, 5, 10, 0, 0, 0));
        ButtonWithCounterView round3 = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.allButton = round3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new LimitSpan("x50"), length, spannableStringBuilder.length(), 33);
        round3.setText(spannableStringBuilder);
        round3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$13(resourcesProvider, view);
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
        int i3 = layoutParamsCreateFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i3 + i4;
        layoutParamsCreateFrame.rightMargin += i4;
        this.containerView.addView(linearLayout, layoutParamsCreateFrame);
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i5 = layoutParamsCreateFrame2.leftMargin;
        int i6 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame2.leftMargin = i5 + i6;
        layoutParamsCreateFrame2.rightMargin += i6;
        this.containerView.addView(round3, layoutParamsCreateFrame2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        FrameLayout.LayoutParams layoutParamsCreateFrame3 = LayoutHelper.createFrame(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i7 = layoutParamsCreateFrame3.leftMargin;
        int i8 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame3.leftMargin = i7 + i8;
        layoutParamsCreateFrame3.rightMargin += i8;
        this.containerView.addView(frameLayout2, layoutParamsCreateFrame3);
        updateButton(false, false);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i9 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i9, 0, i9, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i10) {
                this.f$0.lambda$new$14(view, i10);
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
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
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
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    public Boolean lambda$new$8(final Theme.ResourcesProvider resourcesProvider, final Context context, Tabs.Tab tab) {
        TL_aicompose.AiComposeTone aiComposeTone = tab.tone;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            ItemOptions itemOptionsAdd = ItemOptions.makeOptions(this.container, resourcesProvider, tab).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider))).addIf(tL_aiComposeTone.creator, R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$2(resourcesProvider, tL_aiComposeTone);
                }
            }).add(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3(tL_aiComposeTone, context, resourcesProvider);
                }
            });
            boolean z = !tL_aiComposeTone.creator;
            int i = R.drawable.msg_delete;
            itemOptionsAdd.addIf(z, i, (CharSequence) LocaleController.getString(R.string.AIEditorRemoveStyle), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$4(tL_aiComposeTone);
                }
            }).addIf(tL_aiComposeTone.creator, i, (CharSequence) LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$7(resourcesProvider, tL_aiComposeTone);
                }
            }).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void lambda$new$2(Theme.ResourcesProvider resourcesProvider, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        new CreateAiStyleAlert(getContext(), resourcesProvider).setEditing(tL_aiComposeTone).setOnToneEdited(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$new$1((TL_aicompose.AiComposeTone) obj);
            }
        }).show();
    }

    public void lambda$new$1(TL_aicompose.AiComposeTone aiComposeTone) {
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            this.tonesController.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
        }
        updateStyles();
    }

    public void lambda$new$3(TL_aicompose.TL_aiComposeTone tL_aiComposeTone, Context context, Theme.ResourcesProvider resourcesProvider) {
        String str = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
        new ShareAlert(context, null, str, false, str, false, resourcesProvider) {
            @Override
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                BulletinFactory bulletinFactoryOf;
                if (z && (bulletinFactoryOf = BulletinFactory.of(AIEditorAlert.this.bulletinContainer, this.resourcesProvider)) != null) {
                    if (longSparseArray.size() == 1) {
                        long jKeyAt = longSparseArray.keyAt(0);
                        if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).show();
                        } else if (jKeyAt < 0) {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)), 5000).hideAfterBottomSheet(false).show();
                        } else {
                            bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)), 5000).hideAfterBottomSheet(false).show();
                        }
                    } else {
                        bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("AIEditorStyleSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).show();
                    }
                    try {
                        AIEditorAlert.this.bulletinContainer.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
        }.show();
    }

    public void lambda$new$4(TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        this.tonesController.unsave(tL_aiComposeTone);
    }

    public void lambda$new$7(Theme.ResourcesProvider resourcesProvider, final TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        new AlertDialog.Builder(getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.AIEditorDeleteStyle)).setMessage(LocaleController.getString(R.string.AIEditorDeleteStyleText)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$new$6(tL_aiComposeTone, alertDialog, i);
            }
        }).makeRed(-1).show();
    }

    public void lambda$new$6(final TL_aicompose.TL_aiComposeTone tL_aiComposeTone, AlertDialog alertDialog, int i) {
        final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
        progressMakeButtonLoading.init();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletetone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$new$5(progressMakeButtonLoading, tL_aiComposeTone, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$new$5(Browser.Progress progress, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        progress.end();
        MessagesController.getInstance(this.currentAccount).getTonesController().remove(tL_aiComposeTone);
        updateStyles();
    }

    public void lambda$new$9(View view) {
        if (this.onSendListener != null && getResultText() != null) {
            this.onSendListener.run(getResultText(), 0, 0, Boolean.TRUE);
        }
        lambda$new$0();
    }

    public boolean lambda$new$12(final Theme.ResourcesProvider resourcesProvider, final Context context, View view) {
        if (this.editing || this.onSendListener == null || getResultText() == null) {
            return false;
        }
        boolean z = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        ItemOptions.makeOptions(this.container, resourcesProvider, this.sendButton).addIf(!z, R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$10();
            }
        }).add(R.drawable.msg_calendar2, LocaleController.getString(z ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$11(context, resourcesProvider);
            }
        }).show();
        return true;
    }

    public void lambda$new$10() {
        this.onSendListener.run(getResultText(), 0, 0, Boolean.FALSE);
        lambda$new$0();
    }

    public void lambda$new$11(Context context, Theme.ResourcesProvider resourcesProvider) {
        AlertsCreator.createScheduleDatePickerDialog(context, this.dialogId, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public void didSelectDate(boolean z, int i, int i2) {
                AIEditorAlert.this.onSendListener.run(AIEditorAlert.this.getResultText(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
                AIEditorAlert.this.lambda$new$0();
            }
        }, resourcesProvider);
    }

    public void lambda$new$13(Theme.ResourcesProvider resourcesProvider, View view) {
        new PremiumFeatureBottomSheet(getContext(), 42, true, resourcesProvider).show();
    }

    public void lambda$new$14(View view, int i) {
        this.adapter.getItem(i - 1);
    }

    @Override
    public void lambda$new$0() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.tonesController;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.lambda$new$0();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.loadedAiComposeTones) {
            updateStyles();
        }
    }

    private void updateStyles() {
        TL_aicompose.AiComposeTone selectedTone = this.styleTabs.getSelectedTone();
        this.styleTabs.clearTabs();
        this.styleTabs.addTab(null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.selectStyle((TL_aicompose.AiComposeTone) obj);
            }
        });
        Iterator<TL_aicompose.AiComposeTone> it = this.tonesController.tones.iterator();
        while (it.hasNext()) {
            this.styleTabs.addTab(it.next(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.selectStyle((TL_aicompose.AiComposeTone) obj);
                }
            });
        }
        if (selectedTone != this.styleTabs.getSelectedTone()) {
            this.styleTabs.selectTone(null, true);
        }
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
                    this.f$0.lambda$updateButton$15(z);
                }
            }).start();
            this.buttonContainer.animate().alpha(z ? 0.0f : 1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateButton$16(z);
                }
            }).start();
            return;
        }
        this.allButton.setVisibility(z ? 0 : 8);
        this.allButton.setAlpha(z ? 1.0f : 0.0f);
        this.buttonContainer.setVisibility(z ? 8 : 0);
        this.buttonContainer.setAlpha(z ? 0.0f : 1.0f);
    }

    public void lambda$updateButton$15(boolean z) {
        if (z) {
            return;
        }
        this.allButton.setVisibility(8);
    }

    public void lambda$updateButton$16(boolean z) {
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

    public static void showStylesLimitToast(final BulletinFactory bulletinFactory, int i) {
        String string;
        if (bulletinFactory == null || bulletinFactory.getContext() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        boolean zIsPremium = UserConfig.getInstance(i).isPremium();
        int i2 = !zIsPremium ? R.raw.star_premium_2 : R.raw.error;
        String string2 = LocaleController.getString(R.string.AIEditorStyleLimitTitle);
        if (!zIsPremium) {
            string = LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        } else {
            string = LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        }
        bulletinFactory.createSimpleBulletin(i2, string2, AndroidUtilities.replaceSingleTag(string, new Runnable() {
            @Override
            public final void run() {
                AIEditorAlert.lambda$showStylesLimitToast$17(bulletinFactory);
            }
        })).show();
    }

    public static void lambda$showStylesLimitToast$17(BulletinFactory bulletinFactory) {
        new PremiumFeatureBottomSheet(bulletinFactory.getContext(), 42, true, bulletinFactory.getResourcesProvider()).show();
    }

    public void selectStyle(TL_aicompose.AiComposeTone aiComposeTone) {
        int i;
        if (aiComposeTone == null) {
            int savedTonesCount = this.tonesController.getSavedTonesCount() + 1;
            if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                i = MessagesController.getInstance(this.currentAccount).config.aicomposeToneSavedLimitPremium.get();
            } else {
                i = MessagesController.getInstance(this.currentAccount).config.aicomposeToneSavedLimitDefault.get();
            }
            if (savedTonesCount > i) {
                showStylesLimitToast(BulletinFactory.of(this.bulletinContainer, this.resourcesProvider), this.currentAccount);
                return;
            } else {
                new CreateAiStyleAlert(getContext(), this.resourcesProvider).setOnToneCreated(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$selectStyle$18((TL_aicompose.AiComposeTone) obj);
                    }
                }).show();
                return;
            }
        }
        if (this.styleTabs.getSelectedTone() == aiComposeTone) {
            return;
        }
        HintView2 hintView2 = this.styleHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        this.styleTabs.selectTone(aiComposeTone);
        request();
        this.adapter.update(true);
    }

    public void lambda$selectStyle$18(TL_aicompose.AiComposeTone aiComposeTone) {
        this.tonesController.tones.add(0, aiComposeTone);
        updateStyles();
        BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createEmojiBulletin(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).show();
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
                    this.f$0.lambda$setText$19(str);
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

    public void lambda$setText$19(String str) {
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
            }, null));
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
                }, null));
                arrayList.add(TranslateAlert3.Text.Factory.of(this.styledTextLoading ? 7 : 6, this.text, false, false, null, null, null));
            } else {
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorResult), null, null, null, this.emojify, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.toggleEmojify(view);
                    }
                }, null));
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
                    this.f$0.lambda$show$21(view);
                }
            });
        }
    }

    public void lambda$show$21(View view) {
        if (this.onUseListener != null && getResultText() != null) {
            this.onUseListener.run(getResultText());
        }
        lambda$new$0();
    }

    public void onToLangMenu(View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
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
                        this.f$0.lambda$onToLangMenu$22(next);
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
                    this.f$0.lambda$onToLangMenu$23(next2);
                }
            });
        }
        itemOptionsMakeOptions.show();
    }

    public void lambda$onToLangMenu$22(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        request();
    }

    public void lambda$onToLangMenu$23(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        request();
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
                AIEditorAlert.lambda$addChecked$24(itemOptions, z, runnable, view);
            }
        });
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    public static void lambda$addChecked$24(ItemOptions itemOptions, boolean z, Runnable runnable, View view) {
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
            tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.to_lang);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(this.translateTone);
            tL_messages_composeMessageWithAI.emojify = this.emojify;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.styleTabs.getSelectedTone();
            if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
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
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$request$27(titleTextView, selectedTab, tL_messages_composeMessageWithAI, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                }
            });
            this.adapter.update(true);
        }
    }

    public void lambda$request$27(SimpleTextView simpleTextView, int i, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
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
                    this.f$0.lambda$request$25(view);
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
                    this.f$0.lambda$request$26(view);
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

    public void lambda$request$25(View view) {
        lambda$new$0();
    }

    public void lambda$request$26(View view) {
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
        private Utilities.CallbackReturn onLongClick;
        private final Theme.ResourcesProvider resourcesProvider;
        private int roundRadiusDp;
        private final FrameLayout scrollView;
        private int selectedTab;

        public Tabs setOnItemLongClick(Utilities.CallbackReturn callbackReturn) {
            this.onLongClick = callbackReturn;
            return this;
        }

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

        @Override
        public void setPadding(int i, int i2, int i3, int i4) {
            this.layout.setPadding(i, i2, i3, i4);
        }

        public void setDivider(boolean z) {
            this.divider = z;
        }

        public void setRoundRadius(int i) {
            this.roundRadiusDp = i;
        }

        public void clearTabs() {
            this.layout.removeAllViews();
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

        public Tab addTab(final TL_aicompose.AiComposeTone aiComposeTone, final Utilities.Callback callback) {
            final Tab tab = new Tab(getContext(), this.currentAccount, this.resourcesProvider);
            tab.tone = aiComposeTone;
            tab.setRoundRadius(this.roundRadiusDp);
            if (aiComposeTone == null) {
                tab.accent = false;
                tab.updateColors();
                tab.set(R.drawable.tone_create, LocaleController.getString(R.string.AIEditorStyleNewCreate));
            } else {
                tab.set(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
            }
            tab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    callback.run(aiComposeTone);
                }
            });
            tab.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return this.f$0.lambda$addTab$3(tab, view);
                }
            });
            LinearLayout linearLayout = this.layout;
            linearLayout.addView(tab, LayoutHelper.createLinear(linearLayout.getOrientation() == 0 ? 0 : -1, this.layout.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
            return tab;
        }

        public boolean lambda$addTab$3(Tab tab, View view) {
            Utilities.CallbackReturn callbackReturn = this.onLongClick;
            if (callbackReturn != null) {
                return ((Boolean) callbackReturn.run(tab)).booleanValue();
            }
            return false;
        }

        public int getSelectedTab() {
            return this.selectedTab;
        }

        public TL_aicompose.AiComposeTone getSelectedTone() {
            int i = this.selectedTab;
            if (i < 0 || i >= this.layout.getChildCount()) {
                return null;
            }
            View childAt = this.layout.getChildAt(this.selectedTab);
            if (childAt instanceof Tab) {
                return ((Tab) childAt).tone;
            }
            return null;
        }

        public void selectTone(TL_aicompose.AiComposeTone aiComposeTone) {
            selectTone(aiComposeTone, true);
        }

        public void selectTone(TL_aicompose.AiComposeTone aiComposeTone, boolean z) {
            TL_aicompose.AiComposeTone aiComposeTone2;
            for (int i = 0; i < this.layout.getChildCount(); i++) {
                View childAt = this.layout.getChildAt(i);
                if ((childAt instanceof Tab) && (aiComposeTone2 = ((Tab) childAt).tone) != null && aiComposeTone2 == aiComposeTone) {
                    selectTab(i, z);
                    return;
                }
            }
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
            public boolean accent;
            private final int currentAccount;
            private final BackupImageView imageView;
            private boolean isEmoji;
            public final LinearLayout layout;
            private final Theme.ResourcesProvider resourcesProvider;
            private int roundRadiusDp;
            private float selected;
            private final TextView textView;
            public TL_aicompose.AiComposeTone tone;

            public Tab(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                this.accent = true;
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
                    this.imageView.setEmojiColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
                    this.imageView.invalidate();
                    this.textView.setTextColor(iBlendARGB2);
                }
            }

            @Override
            public void updateColors() {
                int color;
                updateSelected(this.selected, true);
                if (this.accent) {
                    color = Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), 0.1f);
                } else {
                    color = Theme.getColor(Theme.key_listSelector, this.resourcesProvider);
                }
                int i = this.roundRadiusDp;
                setBackground(Theme.createRadSelectorDrawable(color, i, i));
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

    public static class CreateAiStyleAlert extends BottomSheetWithRecyclerListView {
        private UniversalAdapter adapter;
        private final FrameLayout bulletinContainer;
        private final ButtonWithCounterView button;
        private final FrameLayout buttonContainer;
        private final CheckBox2 checkbox;
        private final FrameLayout checkboxCell;
        private final ImageView closeView;
        private TL_aicompose.TL_aiComposeTone editing;
        private Long emoji_id;
        private final BackupImageView icon;
        private final FrameLayout iconButton;
        private final FrameLayout iconCell;
        private Utilities.Callback onToneCreated;
        private Utilities.Callback onToneEdited;
        private final EditTextCell promptCell;
        private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
        private final EditTextCell titleCell;

        public CreateAiStyleAlert(Context context, final Theme.ResourcesProvider resourcesProvider) {
            super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
            ImageView imageView = new ImageView(context);
            this.closeView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.ic_close_white);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(getThemedColor(i));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i), 0.1f)));
            this.actionBar.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconCell = frameLayout;
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.iconButton = frameLayout2;
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            ScaleStateListAnimator.apply(frameLayout2);
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(100, 100, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.icon = backupImageView;
            updateIcon();
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(64, 64, 17));
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$1(view);
                }
            });
            EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), resourcesProvider);
            this.titleCell = editTextCell;
            editTextCell.editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    CreateAiStyleAlert.this.updateButton();
                }
            });
            EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), resourcesProvider);
            this.promptCell = editTextCell2;
            editTextCell2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
            editTextCell2.editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    CreateAiStyleAlert.this.updateButton();
                }
            });
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 24, 24));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.checkbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setChecked(false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.checkboxCell = frameLayout3;
            frameLayout3.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
            int i2 = Theme.key_windowBackgroundGray;
            this.behindKeyboardColorKey = i2;
            setBackgroundColor(getThemedColor(i2));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i3 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.dp(66.0f));
            this.recyclerListView.setClipToPadding(false);
            this.recyclerListView.setSections();
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i4) {
                    this.f$0.lambda$new$5(resourcesProvider, view, i4);
                }
            });
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(12.0f);
            this.topPadding = 0.35f;
            this.smoothKeyboardAnimationEnabled = true;
            this.takeTranslationIntoAccount = true;
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CreateAiStyleAlert.this).containerView.invalidate();
                }
            };
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.buttonContainer = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i2), 0.0f), getThemedColor(i2), getThemedColor(i2)}));
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2, 80);
            int i4 = layoutParamsCreateFrame.leftMargin;
            int i5 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame.leftMargin = i4 + i5;
            layoutParamsCreateFrame.rightMargin += i5;
            this.containerView.addView(frameLayout4, layoutParamsCreateFrame);
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.bulletinContainer = frameLayout5;
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
            int i6 = layoutParamsCreateFrame2.leftMargin;
            int i7 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame2.leftMargin = i6 + i7;
            layoutParamsCreateFrame2.rightMargin += i7;
            this.containerView.addView(frameLayout5, layoutParamsCreateFrame2);
            ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
            this.button = round;
            round.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
            round.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$8(resourcesProvider, view);
                }
            });
            frameLayout4.addView(round, LayoutHelper.createFrame(-1, 48, 119));
            updateButton();
            this.adapter.update(false);
        }

        public void lambda$new$0(View view) {
            lambda$new$0();
        }

        public void lambda$new$1(View view) {
            openIconDialog();
        }

        public void lambda$new$2(View view) {
            this.checkbox.setChecked(!r3.isChecked(), true);
        }

        public void lambda$new$5(Theme.ResourcesProvider resourcesProvider, View view, int i) {
            UItem item = this.adapter.getItem(i - 1);
            if (item != null && item.id == 1) {
                new AlertDialog.Builder(getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.AIEditorDeleteStyle)).setMessage(LocaleController.getString(R.string.AIEditorDeleteStyleText)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$new$4(alertDialog, i2);
                    }
                }).makeRed(-1).show();
            }
        }

        public void lambda$new$4(final AlertDialog alertDialog, int i) {
            final Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1);
            progressMakeButtonLoading.init();
            TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
            deletetone.tone = TL_aicompose.InputAiComposeTone.from(this.editing);
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(deletetone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$new$3(progressMakeButtonLoading, alertDialog, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public void lambda$new$3(Browser.Progress progress, AlertDialog alertDialog, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            progress.end();
            alertDialog.dismiss();
            lambda$new$0();
            MessagesController.getInstance(this.currentAccount).getTonesController().remove(this.editing);
        }

        public void lambda$new$8(final Theme.ResourcesProvider resourcesProvider, View view) {
            if (this.button.isLoading()) {
                return;
            }
            if (!this.button.isEnabled()) {
                if (this.emoji_id == null) {
                    openIconDialog();
                    return;
                }
                return;
            }
            this.button.setLoading(true);
            if (this.editing != null) {
                TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                updatetone.flags = 1 | updatetone.flags;
                updatetone.display_author = this.checkbox.isChecked();
                updatetone.tone = TL_aicompose.InputAiComposeTone.from(this.editing);
                updatetone.flags |= 2;
                updatetone.emoji_id = this.emoji_id.longValue();
                updatetone.flags |= 4;
                updatetone.title = this.titleCell.getText().toString();
                updatetone.flags |= 8;
                updatetone.prompt = this.promptCell.getText().toString();
                ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(updatetone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$new$6(resourcesProvider, (TL_aicompose.AiComposeTone) obj, (TLRPC.TL_error) obj2);
                    }
                });
                return;
            }
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = this.checkbox.isChecked();
            createtone.emoji_id = this.emoji_id.longValue();
            createtone.title = this.titleCell.getText().toString();
            createtone.prompt = this.promptCell.getText().toString();
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(createtone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$new$7(resourcesProvider, (TL_aicompose.AiComposeTone) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public void lambda$new$6(Theme.ResourcesProvider resourcesProvider, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (aiComposeTone == null) {
                if (tL_error != null) {
                    BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
                }
            } else {
                Utilities.Callback callback = this.onToneEdited;
                if (callback != null) {
                    callback.run(aiComposeTone);
                }
                lambda$new$0();
            }
        }

        public void lambda$new$7(Theme.ResourcesProvider resourcesProvider, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (aiComposeTone != null) {
                lambda$new$0();
                Utilities.Callback callback = this.onToneCreated;
                if (callback != null) {
                    callback.run(aiComposeTone);
                    return;
                }
                return;
            }
            if (tL_error != null) {
                if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                    AIEditorAlert.showStylesLimitToast(BulletinFactory.of(this.bulletinContainer, resourcesProvider), this.currentAccount);
                } else {
                    BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
                }
            }
        }

        private void openIconDialog() {
            if (this.selectAnimatedEmojiDialog != null) {
                return;
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(null, getContext(), true, Integer.valueOf(AndroidUtilities.dp(150.0f)), 15, this.resourcesProvider) {
                @Override
                protected boolean willApplyEmoji(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    return tL_starGiftUnique == null || StarsController.getInstance(((BottomSheet) CreateAiStyleAlert.this).currentAccount).findUserStarGift(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
                }

                @Override
                protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    CreateAiStyleAlert.this.emoji_id = l;
                    CreateAiStyleAlert.this.updateIcon();
                    CreateAiStyleAlert.this.updateButton();
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        CreateAiStyleAlert.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            selectAnimatedEmojiDialog.setSelected(this.emoji_id);
            selectAnimatedEmojiDialog.setSaveState(1);
            int i = -2;
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i, i) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    CreateAiStyleAlert.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = {selectAnimatedEmojiDialogWindow};
            selectAnimatedEmojiDialogWindow.showAsDropDown(this.iconButton, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }

        @Override
        protected void onSmoothContainerViewLayout(float f) {
            super.onSmoothContainerViewLayout(f);
            this.buttonContainer.setTranslationY(f);
        }

        public CreateAiStyleAlert setEditing(TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
            this.editing = tL_aiComposeTone;
            this.emoji_id = Long.valueOf(tL_aiComposeTone.emoji_id);
            updateIcon();
            this.titleCell.setText(this.editing.title);
            this.promptCell.setText(this.editing.prompt);
            this.checkbox.setChecked(this.editing.author_id != 0, false);
            this.actionBar.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
            this.button.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
            updateButton();
            this.adapter.update(false);
            return this;
        }

        public CreateAiStyleAlert setOnToneCreated(Utilities.Callback callback) {
            this.onToneCreated = callback;
            return this;
        }

        public CreateAiStyleAlert setOnToneEdited(Utilities.Callback callback) {
            this.onToneEdited = callback;
            return this;
        }

        public void updateIcon() {
            if (this.emoji_id == null) {
                this.icon.setImageResource(R.drawable.menu_smile_add);
                this.icon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            } else {
                this.icon.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(4, this.currentAccount, this.emoji_id.longValue()));
                this.icon.setColorFilter(null);
                this.icon.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
        }

        public void updateButton() {
            this.button.setEnabled(this.emoji_id != null && this.titleCell.getText().length() > 0 && this.promptCell.getText().length() > 0);
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

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCustomShadow(this.iconCell));
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCustom(this.titleCell));
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCustom(this.promptCell));
            arrayList.add(UItem.asShadow(null));
            if (this.editing != null) {
                arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.AIEditorDeleteStyle)).red());
                arrayList.add(UItem.asShadow(null));
            }
            arrayList.add(UItem.asCustomShadow(this.checkboxCell));
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(this.editing != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
        }
    }

    public static class AiStyleAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private UniversalAdapter adapter;
        private final FrameLayout bulletinContainer;
        private final ButtonWithCounterView button;
        private final FrameLayout buttonContainer;
        private final ImageView closeView;
        private int exampleIndex;
        private TL_aicompose.aiComposeToneExample[] examples;
        private final BackupImageView icon;
        private final FrameLayout iconButton;
        private final FrameLayout iconCell;
        private final TextView subtitle;
        private final TextView title;
        public final TL_aicompose.AiComposeTone tone;
        private final AiTonesController tonesController;

        public AiStyleAlert(Context context, final TL_aicompose.AiComposeTone aiComposeTone, final Theme.ResourcesProvider resourcesProvider) {
            super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
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
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i), 0.1f)));
            this.containerView.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            this.iconCell = frameLayout;
            frameLayout.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.iconButton = frameLayout2;
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.icon = backupImageView;
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
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i4) {
                    this.f$0.lambda$new$1(view, i4);
                }
            });
            this.ignoreTouchActionBar = false;
            this.headerMoveTop = AndroidUtilities.dp(36.0f);
            this.topPadding = 0.35f;
            this.takeTranslationIntoAccount = true;
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) AiStyleAlert.this).containerView.invalidate();
                }
            };
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.buttonContainer = frameLayout3;
            frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i2), 0.0f), getThemedColor(i2), getThemedColor(i2)}));
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
            ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
            this.button = round;
            round.setText(LocaleController.getString(isAlreadyAdded() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
            round.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(aiComposeTone, resourcesProvider, view);
                }
            });
            frameLayout3.addView(round, LayoutHelper.createFrame(-1, 48, 119));
            this.adapter.update(false);
        }

        public void lambda$new$0(View view) {
            lambda$new$0();
        }

        public void lambda$new$1(View view, int i) {
            this.adapter.getItem(i - 1);
        }

        public void lambda$new$3(final TL_aicompose.AiComposeTone aiComposeTone, final Theme.ResourcesProvider resourcesProvider, View view) {
            if (!this.button.isEnabled() || this.button.isLoading()) {
                return;
            }
            if (isAlreadyAdded()) {
                lambda$new$0();
                return;
            }
            this.button.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(savetone, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$new$2(resourcesProvider, aiComposeTone, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public void lambda$new$2(Theme.ResourcesProvider resourcesProvider, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            this.button.setLoading(false);
            if (tL_error != null) {
                if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                    AIEditorAlert.showStylesLimitToast(BulletinFactory.of(this.bulletinContainer, resourcesProvider), this.currentAccount);
                    return;
                } else {
                    BulletinFactory.of(this.bulletinContainer, resourcesProvider).showForError(tL_error);
                    return;
                }
            }
            MessagesController.getInstance(this.currentAccount).getTonesController().add(aiComposeTone);
            lambda$new$0();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createEmojiBulletin(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).show();
            }
        }

        private boolean isAlreadyAdded() {
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                for (int i = 0; i < this.tonesController.tones.size(); i++) {
                    TL_aicompose.AiComposeTone aiComposeTone2 = this.tonesController.tones.get(i);
                    if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public void show() {
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
        }

        @Override
        public void lambda$new$0() {
            super.lambda$new$0();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.loadedAiComposeTones) {
                this.button.setText(LocaleController.getString(isAlreadyAdded() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
            }
        }

        @Override
        protected void onActionBarAlpha(float f) {
            SimpleTextView titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setAlpha(f);
            }
            this.closeView.setTranslationY(this.actionBar.getTranslationY() + AndroidUtilities.statusBarHeight + (((this.actionBar.getHeight() - AndroidUtilities.statusBarHeight) - this.closeView.getHeight()) / 2.0f) + (AndroidUtilities.dp(28.0f) * (1.0f - f)));
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

        private CharSequence loadingText() {
            return loadingText(5);
        }

        private CharSequence loadingText(int i) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int iDp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                spannableStringBuilder.setSpan(new LoadingSpan(null, iDp, 0).setHeight(AndroidUtilities.dp(6.0f)).setAlpha(0.5f).setFullWidth(true), length, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }

        public void onAnotherExample(View view) {
            if (this.tone instanceof TL_aicompose.TL_aiComposeTone) {
                int i = this.exampleIndex + 1;
                this.exampleIndex = i;
                TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = this.examples;
                if (i >= aicomposetoneexampleArr.length) {
                    this.exampleIndex = 0;
                }
                final int i2 = this.exampleIndex;
                if (aicomposetoneexampleArr[i2] == null) {
                    TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                    gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(this.tone);
                    gettoneexample.num = i2;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(gettoneexample, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            this.f$0.lambda$onAnotherExample$4(i2, (TL_aicompose.aiComposeToneExample) obj, (TLRPC.TL_error) obj2);
                        }
                    });
                }
                this.adapter.update(true);
            }
        }

        public void lambda$onAnotherExample$4(int i, TL_aicompose.aiComposeToneExample aicomposetoneexample, TLRPC.TL_error tL_error) {
            if (aicomposetoneexample != null) {
                this.examples[i] = aicomposetoneexample;
                this.adapter.update(true);
            }
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            String str;
            String string;
            universalAdapter.itemsOffset = 1;
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCustomShadow((View) this.iconCell, true));
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asCustomShadow(this.title));
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(1.0f)));
            arrayList.add(UItem.asCustomShadow(this.subtitle));
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(24.0f)));
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = this.examples[this.exampleIndex];
                universalAdapter.whiteSectionStart();
                arrayList.add(TranslateAlert3.Header.Factory.of(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.onAnotherExample(view);
                    }
                }));
                arrayList.add(TranslateAlert3.Text.Factory.of(4, aicomposetoneexample == null ? loadingText() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, false, null, null, null));
                arrayList.add(TranslateAlert3.Header.Factory.of(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
                arrayList.add(TranslateAlert3.Text.Factory.of(6, aicomposetoneexample == null ? loadingText() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, false, null, null, null));
                universalAdapter.whiteSectionEnd();
                TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
                String publicUsername = UserObject.getPublicUsername(user);
                if (user == null) {
                    int i = tL_aiComposeTone.installs_count;
                    if (i > 0) {
                        arrayList.add(UItem.asShadow(LocaleController.formatPluralString("AIEditorUsedBy", i, new Object[0])));
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (tL_aiComposeTone.installs_count > 0) {
                        str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    if (TextUtils.isEmpty(publicUsername)) {
                        string = LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user));
                    } else {
                        string = LocaleController.formatString(R.string.AIEditorCreatedBy, "@" + publicUsername);
                    }
                    sb.append(string);
                    arrayList.add(UItem.asShadow(AndroidUtilities.replaceSingleLink(sb.toString(), getThemedColor(Theme.key_chat_messageLinkIn), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$fillItems$5(tL_aiComposeTone);
                        }
                    })));
                }
            }
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(32.0f)));
        }

        public void lambda$fillItems$5(TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            safeLastFragment.presentFragment(ProfileActivity.of(tL_aiComposeTone.author_id));
            lambda$new$0();
        }

        @Override
        protected CharSequence getTitle() {
            TL_aicompose.AiComposeTone aiComposeTone = this.tone;
            return aiComposeTone == null ? "" : aiComposeTone.title;
        }
    }
}
