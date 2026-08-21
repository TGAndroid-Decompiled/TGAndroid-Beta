package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class LinkEditActivity extends BaseFragment {
    private TextCheckCell approveCell;
    private TextInfoPrivacyCell approveHintCell;
    private FrameLayout buttonLayout;
    private Callback callback;
    private final long chatId;
    private TextView createTextView;
    int currentInviteDate;
    private TextInfoPrivacyCell divider;
    private TextInfoPrivacyCell dividerName;
    private TextInfoPrivacyCell dividerUses;
    private boolean finished;
    private boolean ignoreSet;
    TLRPC.TL_chatInviteExported inviteToEdit;
    boolean loading;
    private EditText nameEditText;
    AlertDialog progressDialog;
    private TextSettingsCell revokeLink;
    boolean scrollToEnd;
    boolean scrollToStart;
    private SectionsScrollView scrollView;
    private TextCheckCell subCell;
    private EditTextCell subEditPriceCell;
    private TextInfoPrivacyCell subInfoCell;
    private TextView subPriceView;
    private SlideChooseView timeChooseView;
    private TextView timeEditText;
    private HeaderCell timeHeaderCell;
    private int type;
    private SlideChooseView usesChooseView;
    private EditText usesEditText;
    private HeaderCell usesHeaderCell;
    private int shakeDp = -3;
    private boolean firstLayout = true;
    private ArrayList dispalyedDates = new ArrayList();
    private final int[] defaultDates = {3600, 86400, 604800};
    private ArrayList dispalyedUses = new ArrayList();
    private final int[] defaultUses = {1, 10, 100};

    public interface Callback {
        void onLinkCreated(TLObject tLObject);

        void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject);

        void onLinkRemoved(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);
    }

    public static void $r8$lambda$PtMwoxo3HJKRJNJVDYxszG_lC40(Integer num) {
    }

    public LinkEditActivity(int i, long j) {
        this.type = i;
        this.chatId = j;
    }

    @Override
    public View createView(final Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i;
        int i2;
        int i3;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i4 = this.type;
        if (i4 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i4 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    LinkEditActivity.this.finishFragment();
                    AndroidUtilities.hideKeyboard(LinkEditActivity.this.usesEditText);
                }
            }
        });
        TextView textView = new TextView(context);
        this.createTextView = textView;
        textView.setBackground(new Drawable() {
            final Paint p = new Paint(1);

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i5) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                this.p.setColor(Theme.getColor(Theme.key_telegram_color));
                canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, AndroidUtilities.dp(14.0f) + getBounds().exactCenterY(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
            }
        });
        this.createTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.createTextView.setGravity(17);
        this.createTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onCreateClicked(view);
            }
        });
        this.createTextView.setSingleLine();
        int i5 = this.type;
        if (i5 == 0) {
            this.createTextView.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i5 == 1) {
            this.createTextView.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.createTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.createTextView.setTextSize(1, 14.0f);
        this.createTextView.setTypeface(AndroidUtilities.bold());
        this.createTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ScaleStateListAnimator.apply(this.createTextView);
        this.actionBar.addView(this.createTextView, LayoutHelper.createFrame(-2, ActionBar.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        SectionsScrollView.SectionsLinearLayout sectionsLinearLayout = new SectionsScrollView.SectionsLinearLayout(context) {
            @Override
            protected void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity.this.firstLayout = false;
            }
        };
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, sectionsLinearLayout, this.resourceProvider);
        this.scrollView = sectionsScrollView;
        this.actionBar.setAdaptiveBackground(sectionsScrollView);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
                measureKeyboardHeight();
                int i8 = this.keyboardHeight;
                if (i8 != 0 && i8 < AndroidUtilities.dp(20.0f)) {
                    LinkEditActivity.this.usesEditText.clearFocus();
                    LinkEditActivity.this.nameEditText.clearFocus();
                }
                LinkEditActivity.this.buttonLayout.setVisibility(this.keyboardHeight > AndroidUtilities.dp(20.0f) ? 8 : 0);
            }

            @Override
            protected void onLayout(boolean z, int i6, int i7, int i8, int i9) {
                int scrollY = LinkEditActivity.this.scrollView.getScrollY();
                super.onLayout(z, i6, i7, i8, i9);
                if (scrollY != LinkEditActivity.this.scrollView.getScrollY()) {
                    LinkEditActivity linkEditActivity = LinkEditActivity.this;
                    if (linkEditActivity.scrollToEnd) {
                        return;
                    }
                    linkEditActivity.scrollView.setTranslationY(LinkEditActivity.this.scrollView.getScrollY() - scrollY);
                    LinkEditActivity.this.scrollView.animate().cancel();
                    LinkEditActivity.this.scrollView.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity linkEditActivity = LinkEditActivity.this;
                if (linkEditActivity.scrollToEnd) {
                    linkEditActivity.scrollToEnd = false;
                    linkEditActivity.scrollView.smoothScrollTo(0, Math.max(0, LinkEditActivity.this.scrollView.getChildAt(0).getMeasuredHeight() - LinkEditActivity.this.scrollView.getMeasuredHeight()));
                } else if (linkEditActivity.scrollToStart) {
                    linkEditActivity.scrollToStart = false;
                    linkEditActivity.scrollView.smoothScrollTo(0, 0);
                }
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        layoutTransition.setInterpolator(2, cubicBezierInterpolator);
        layoutTransition.setInterpolator(0, cubicBezierInterpolator);
        layoutTransition.setInterpolator(4, cubicBezierInterpolator);
        layoutTransition.setInterpolator(1, cubicBezierInterpolator);
        layoutTransition.setInterpolator(3, cubicBezierInterpolator);
        sectionsLinearLayout.setLayoutTransition(layoutTransition);
        sectionsLinearLayout.setOrientation(1);
        sectionsLinearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.scrollView.addView(sectionsLinearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        this.timeHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.LimitByPeriod));
        sectionsLinearLayout.addView(this.timeHeaderCell);
        SlideChooseView slideChooseView = new SlideChooseView(context);
        this.timeChooseView = slideChooseView;
        sectionsLinearLayout.addView(slideChooseView);
        TextView textView2 = new TextView(context);
        this.timeEditText = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.timeEditText.setGravity(16);
        this.timeEditText.setTextSize(1, 16.0f);
        this.timeEditText.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.timeEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkEditActivity.m3405$r8$lambda$YoooOzlJskdWIdDSFU0RBDHu5c(this.f$0, context, view);
            }
        });
        this.timeChooseView.setCallback(new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i6) {
                LinkEditActivity.m3400$r8$lambda$2citYq6ROglkaysQ9uqZ9fS0I4(this.f$0, i6);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        });
        resetDates();
        sectionsLinearLayout.addView(this.timeEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.divider = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TimeLimitHelp));
        sectionsLinearLayout.addView(this.divider);
        HeaderCell headerCell2 = new HeaderCell(context);
        this.usesHeaderCell = headerCell2;
        headerCell2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        sectionsLinearLayout.addView(this.usesHeaderCell);
        SlideChooseView slideChooseView2 = new SlideChooseView(context);
        this.usesChooseView = slideChooseView2;
        slideChooseView2.setCallback(new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i6) {
                LinkEditActivity.$r8$lambda$hry8wZRxqTLKXFaVsBz7njy1URQ(this.f$0, i6);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        });
        resetUses();
        sectionsLinearLayout.addView(this.usesChooseView);
        EditText editText = new EditText(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.usesEditText = editText;
        editText.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.usesEditText.setGravity(16);
        this.usesEditText.setTextSize(1, 16.0f);
        this.usesEditText.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.usesEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.usesEditText.setInputType(2);
        this.usesEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (LinkEditActivity.this.ignoreSet) {
                    return;
                }
                if (editable.toString().equals("0")) {
                    LinkEditActivity.this.usesEditText.setText("");
                    return;
                }
                try {
                    int i6 = Integer.parseInt(editable.toString());
                    if (i6 > 100000) {
                        LinkEditActivity.this.resetUses();
                    } else {
                        LinkEditActivity.this.chooseUses(i6);
                    }
                } catch (NumberFormatException unused) {
                    LinkEditActivity.this.resetUses();
                }
            }
        });
        sectionsLinearLayout.addView(this.usesEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.dividerUses = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        sectionsLinearLayout.addView(this.dividerUses);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        final boolean z = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        TextCheckCell textCheckCell = new TextCheckCell(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0, 0, getWidth(), getHeight());
                super.onDraw(canvas);
                canvas.restore();
            }
        };
        this.approveCell = textCheckCell;
        int i6 = Theme.key_windowBackgroundWhite;
        textCheckCell.setBackgroundColor(Theme.getColor(i6));
        this.approveCell.setTag(Integer.valueOf(i6));
        this.approveCell.setTextAndCheck(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.approveCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkEditActivity.m3403$r8$lambda$QfUvrSvB4lUtcWVVCyTWF1Te0(this.f$0, z, view);
            }
        });
        sectionsLinearLayout.addView(this.approveCell, LayoutHelper.createLinear(-1, 56));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.approveHintCell = textInfoPrivacyCell3;
        if (z) {
            this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            this.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            textInfoPrivacyCell3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        sectionsLinearLayout.addView(this.approveHintCell);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (!(this.inviteToEdit == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId))) && chatFull != null && chatFull.paid_media_allowed) && ((tL_chatInviteExported = this.inviteToEdit) == null || tL_chatInviteExported.subscription_pricing == null)) {
                i = -2;
                i2 = 12;
                i3 = -1;
            } else {
                TextCheckCell textCheckCell2 = new TextCheckCell(context);
                this.subCell = textCheckCell2;
                textCheckCell2.setBackgroundColor(Theme.getColor(i6));
                this.subCell.setDrawCheckRipple(true);
                this.subCell.setTextAndCheck(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.inviteToEdit != null) {
                    this.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                    this.subCell.setEnabled(false);
                }
                final Runnable[] runnableArr = new Runnable[1];
                this.subCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LinkEditActivity.$r8$lambda$PRvoJ6OrpVQhRUWgdzzWMaHqOe4(this.f$0, runnableArr, view);
                    }
                });
                sectionsLinearLayout.addView(this.subCell, LayoutHelper.createLinear(-1, 48));
                TextView textView3 = new TextView(context);
                this.subPriceView = textView3;
                textView3.setTextSize(1, 16.0f);
                this.subPriceView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3));
                i = -2;
                i2 = 12;
                i3 = -1;
                EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), false, false, -1, this.resourceProvider) {
                    private boolean ignoreTextChanged;

                    @Override
                    protected void onTextChanged(CharSequence charSequence) {
                        super.onTextChanged(charSequence);
                        if (this.ignoreTextChanged) {
                            return;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            LinkEditActivity.this.subPriceView.setText("");
                            return;
                        }
                        try {
                            long j = Long.parseLong(charSequence.toString());
                            if (j > LinkEditActivity.this.getMessagesController().starsSubscriptionAmountMax) {
                                this.ignoreTextChanged = true;
                                j = LinkEditActivity.this.getMessagesController().starsSubscriptionAmountMax;
                                setText(Long.toString(j));
                                this.ignoreTextChanged = false;
                            }
                            LinkEditActivity.this.subPriceView.setText(LocaleController.formatString(LinkEditActivity.this.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice, BillingController.getInstance().formatCurrency((long) ((j / 1000.0d) * ((double) MessagesController.getInstance(((BaseFragment) LinkEditActivity.this).currentAccount).starsUsdWithdrawRate1000)), "USD")));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                };
                this.subEditPriceCell = editTextCell;
                editTextCell.editText.setInputType(2);
                this.subEditPriceCell.editText.setRawInputType(2);
                this.subEditPriceCell.setBackgroundColor(getThemedColor(i6));
                this.subEditPriceCell.hideKeyboardOnEnter();
                this.subEditPriceCell.addView(this.subPriceView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ImageView leftDrawable = this.subEditPriceCell.setLeftDrawable(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate());
                leftDrawable.setScaleX(0.83f);
                leftDrawable.setScaleY(0.83f);
                leftDrawable.setTranslationY(AndroidUtilities.dp(-1.0f));
                leftDrawable.setTranslationX(AndroidUtilities.dp(1.0f));
                sectionsLinearLayout.addView(this.subEditPriceCell, LayoutHelper.createLinear(-1, 48));
                this.subEditPriceCell.setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
                this.subInfoCell = textInfoPrivacyCell4;
                if (this.inviteToEdit != null) {
                    textInfoPrivacyCell4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    textInfoPrivacyCell4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new Runnable() {
                        @Override
                        public final void run() {
                            Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                        }
                    }));
                }
                sectionsLinearLayout.addView(this.subInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            i = -2;
            i2 = 12;
            i3 = -1;
        }
        EditText editText2 = new EditText(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.nameEditText = editText2;
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Emoji.replaceEmoji(editable, LinkEditActivity.this.nameEditText.getPaint().getFontMetricsInt(), false);
            }
        });
        this.nameEditText.setCursorVisible(false);
        this.nameEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.nameEditText.setGravity(16);
        this.nameEditText.setHint(LocaleController.getString(R.string.LinkNameHint));
        EditText editText3 = this.nameEditText;
        int i7 = Theme.key_windowBackgroundWhiteGrayText;
        editText3.setHintTextColor(Theme.getColor(i7));
        this.nameEditText.setLines(1);
        this.nameEditText.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.nameEditText.setSingleLine();
        EditText editText4 = this.nameEditText;
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        editText4.setTextColor(Theme.getColor(i8));
        this.nameEditText.setTextSize(1, 16.0f);
        sectionsLinearLayout.addView(this.nameEditText, LayoutHelper.createLinear(i3, 50));
        TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context, i2, this.resourceProvider);
        this.dividerName = textInfoPrivacyCell5;
        textInfoPrivacyCell5.setText(LocaleController.getString(R.string.LinkNameHelp));
        sectionsLinearLayout.addView(this.dividerName);
        if (this.type == 1) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.revokeLink = textSettingsCell;
            textSettingsCell.setBackgroundColor(Theme.getColor(i6));
            this.revokeLink.setText(LocaleController.getString(R.string.RevokeLink), false);
            this.revokeLink.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            this.revokeLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LinkEditActivity.m3406$r8$lambda$eUSugxv82voLuaOFpNzqkK2H8I(this.f$0, view);
                }
            });
            sectionsLinearLayout.addView(this.revokeLink);
        }
        sizeNotifierFrameLayout.addView(this.scrollView, LayoutHelper.createFrame(i3, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonLayout = frameLayout;
        int i9 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i9));
        new KeyboardNotifier(sizeNotifierFrameLayout, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                LinkEditActivity.$r8$lambda$PtMwoxo3HJKRJNJVDYxszG_lC40((Integer) obj);
            }
        });
        sizeNotifierFrameLayout.addView(this.buttonLayout, LayoutHelper.createFrame(i3, i, 80));
        this.timeHeaderCell.setBackgroundColor(Theme.getColor(i6));
        this.timeChooseView.setBackgroundColor(Theme.getColor(i6));
        this.timeEditText.setBackgroundColor(Theme.getColor(i6));
        this.usesHeaderCell.setBackgroundColor(Theme.getColor(i6));
        this.usesChooseView.setBackgroundColor(Theme.getColor(i6));
        this.usesEditText.setBackgroundColor(Theme.getColor(i6));
        this.nameEditText.setBackgroundColor(Theme.getColor(i6));
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(i9));
        this.usesEditText.setTextColor(Theme.getColor(i8));
        this.usesEditText.setHintTextColor(Theme.getColor(i7));
        this.timeEditText.setTextColor(Theme.getColor(i8));
        this.timeEditText.setHintTextColor(Theme.getColor(i7));
        this.usesEditText.setCursorVisible(false);
        setInviteToEdit(this.inviteToEdit);
        sizeNotifierFrameLayout.setClipChildren(false);
        this.scrollView.setClipChildren(false);
        sectionsLinearLayout.setClipChildren(false);
        return sizeNotifierFrameLayout;
    }

    public static void m3405$r8$lambda$YoooOzlJskdWIdDSFU0RBDHu5c(final LinkEditActivity linkEditActivity, Context context, View view) {
        linkEditActivity.getClass();
        AlertsCreator.createDatePickerDialog(context, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i, int i2) {
                this.f$0.chooseDate(i);
            }
        });
    }

    public static void m3400$r8$lambda$2citYq6ROglkaysQ9uqZ9fS0I4(LinkEditActivity linkEditActivity, int i) {
        if (i < linkEditActivity.dispalyedDates.size()) {
            linkEditActivity.timeEditText.setText(LocaleController.formatDateAudio(((Integer) linkEditActivity.dispalyedDates.get(i)).intValue() + linkEditActivity.getConnectionsManager().getCurrentTime(), false));
        } else {
            linkEditActivity.timeEditText.setText("");
        }
    }

    public static void $r8$lambda$hry8wZRxqTLKXFaVsBz7njy1URQ(LinkEditActivity linkEditActivity, int i) {
        linkEditActivity.usesEditText.clearFocus();
        linkEditActivity.ignoreSet = true;
        if (i < linkEditActivity.dispalyedUses.size()) {
            linkEditActivity.usesEditText.setText(((Integer) linkEditActivity.dispalyedUses.get(i)).toString());
        } else {
            linkEditActivity.usesEditText.setText("");
        }
        linkEditActivity.ignoreSet = false;
    }

    public static void m3403$r8$lambda$QfUvrSvB4lUtcWVVCyTWF1Te0(LinkEditActivity linkEditActivity, boolean z, View view) {
        if (z) {
            linkEditActivity.getClass();
            return;
        }
        TextCheckCell textCheckCell = linkEditActivity.subCell;
        if (textCheckCell != null && textCheckCell.isChecked()) {
            TextCheckCell textCheckCell2 = linkEditActivity.subCell;
            int i = -linkEditActivity.shakeDp;
            linkEditActivity.shakeDp = i;
            AndroidUtilities.shakeViewSpring(textCheckCell2, i);
            return;
        }
        TextCheckCell textCheckCell3 = (TextCheckCell) view;
        boolean zIsChecked = textCheckCell3.isChecked();
        textCheckCell3.setChecked(!zIsChecked);
        linkEditActivity.setUsesVisible(zIsChecked);
        linkEditActivity.firstLayout = true;
        if (linkEditActivity.subCell != null) {
            if (textCheckCell3.isChecked()) {
                linkEditActivity.subCell.setChecked(false);
                linkEditActivity.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                linkEditActivity.subEditPriceCell.setVisibility(8);
            } else if (linkEditActivity.inviteToEdit == null) {
                linkEditActivity.subCell.setCheckBoxIcon(0);
            }
        }
    }

    public static void $r8$lambda$PRvoJ6OrpVQhRUWgdzzWMaHqOe4(final LinkEditActivity linkEditActivity, Runnable[] runnableArr, View view) {
        if (linkEditActivity.inviteToEdit != null) {
            return;
        }
        if (linkEditActivity.approveCell.isChecked()) {
            TextCheckCell textCheckCell = linkEditActivity.approveCell;
            int i = -linkEditActivity.shakeDp;
            linkEditActivity.shakeDp = i;
            AndroidUtilities.shakeViewSpring(textCheckCell, i);
            return;
        }
        TextCheckCell textCheckCell2 = (TextCheckCell) view;
        textCheckCell2.setChecked(!textCheckCell2.isChecked());
        linkEditActivity.subEditPriceCell.setVisibility(textCheckCell2.isChecked() ? 0 : 8);
        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
        if (textCheckCell2.isChecked()) {
            linkEditActivity.approveCell.setChecked(false);
            linkEditActivity.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            linkEditActivity.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LinkEditActivity.$r8$lambda$LfrCXoYplbGxAkgBi6BSQp98Wj8(this.f$0);
                }
            };
            runnableArr[0] = runnable;
            AndroidUtilities.runOnUIThread(runnable, 60L);
            return;
        }
        linkEditActivity.approveCell.setCheckBoxIcon(0);
        linkEditActivity.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.$r8$lambda$hG6CTVkHDDZ0AFoTmoeEbTmHUvg(this.f$0);
            }
        };
        runnableArr[0] = runnable2;
        AndroidUtilities.runOnUIThread(runnable2);
    }

    public static void $r8$lambda$LfrCXoYplbGxAkgBi6BSQp98Wj8(LinkEditActivity linkEditActivity) {
        linkEditActivity.subEditPriceCell.editText.requestFocus();
        AndroidUtilities.showKeyboard(linkEditActivity.subEditPriceCell.editText);
    }

    public static void $r8$lambda$hG6CTVkHDDZ0AFoTmoeEbTmHUvg(LinkEditActivity linkEditActivity) {
        linkEditActivity.subEditPriceCell.editText.clearFocus();
        AndroidUtilities.hideKeyboard(linkEditActivity.subEditPriceCell.editText);
    }

    public static void m3406$r8$lambda$eUSugxv82voLuaOFpNzqkK2H8I(final LinkEditActivity linkEditActivity, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(linkEditActivity.getParentActivity());
        builder.setMessage(LocaleController.getString(R.string.RevokeAlert));
        builder.setTitle(LocaleController.getString(R.string.RevokeLink));
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                LinkEditActivity.$r8$lambda$NAAxt6ng9pN7H7ZSMxIwSIokXfs(this.f$0, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        linkEditActivity.showDialog(builder.create());
    }

    public static void $r8$lambda$NAAxt6ng9pN7H7ZSMxIwSIokXfs(LinkEditActivity linkEditActivity, AlertDialog alertDialog, int i) {
        linkEditActivity.callback.revokeLink(linkEditActivity.inviteToEdit);
        linkEditActivity.finishFragment();
    }

    public void onCreateClicked(View view) {
        long j;
        boolean z;
        if (this.loading) {
            return;
        }
        int selectedIndex = this.timeChooseView.getSelectedIndex();
        if (selectedIndex < this.dispalyedDates.size() && ((Integer) this.dispalyedDates.get(selectedIndex)).intValue() < 0) {
            AndroidUtilities.shakeView(this.timeEditText);
            Vibrator vibrator = (Vibrator) this.timeEditText.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
                return;
            }
            return;
        }
        TextCheckCell textCheckCell = this.subCell;
        if (textCheckCell == null || !textCheckCell.isChecked()) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(this.subEditPriceCell.editText.getText().toString());
            } catch (Exception e) {
                FileLog.e(e);
                j = 0;
            }
        }
        int i = this.type;
        if (i == 0) {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.loading = true;
            AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3);
            this.progressDialog = alertDialog2;
            alertDialog2.showDelayed(500L);
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
            int selectedIndex2 = this.timeChooseView.getSelectedIndex();
            tL_messages_exportChatInvite.flags |= 1;
            if (selectedIndex2 < this.dispalyedDates.size()) {
                tL_messages_exportChatInvite.expire_date = ((Integer) this.dispalyedDates.get(selectedIndex2)).intValue() + getConnectionsManager().getCurrentTime();
            } else {
                tL_messages_exportChatInvite.expire_date = 0;
            }
            int selectedIndex3 = this.usesChooseView.getSelectedIndex();
            tL_messages_exportChatInvite.flags |= 2;
            if (selectedIndex3 < this.dispalyedUses.size()) {
                tL_messages_exportChatInvite.usage_limit = ((Integer) this.dispalyedUses.get(selectedIndex3)).intValue();
            } else {
                tL_messages_exportChatInvite.usage_limit = 0;
            }
            TextCheckCell textCheckCell2 = this.approveCell;
            boolean z2 = textCheckCell2 != null && textCheckCell2.isChecked();
            tL_messages_exportChatInvite.request_needed = z2;
            if (z2) {
                tL_messages_exportChatInvite.usage_limit = 0;
            }
            String string = this.nameEditText.getText().toString();
            tL_messages_exportChatInvite.title = string;
            if (!TextUtils.isEmpty(string)) {
                tL_messages_exportChatInvite.flags |= 16;
            }
            if (j > 0) {
                tL_messages_exportChatInvite.flags |= 32;
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                tL_starsSubscriptionPricing.period = getConnectionsManager().isTestBackend() ? 300 : 2592000;
                tL_messages_exportChatInvite.subscription_pricing.amount = j;
            }
            getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LinkEditActivity.$r8$lambda$kn83jnq827IT95LCZiQzxWHAiEM(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        if (i == 1) {
            AlertDialog alertDialog3 = this.progressDialog;
            if (alertDialog3 != null) {
                alertDialog3.dismiss();
            }
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = this.inviteToEdit.link;
            tL_messages_editExportedChatInvite.revoked = false;
            tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
            int selectedIndex4 = this.timeChooseView.getSelectedIndex();
            if (selectedIndex4 < this.dispalyedDates.size()) {
                if (this.currentInviteDate != ((Integer) this.dispalyedDates.get(selectedIndex4)).intValue()) {
                    tL_messages_editExportedChatInvite.flags |= 1;
                    tL_messages_editExportedChatInvite.expire_date = ((Integer) this.dispalyedDates.get(selectedIndex4)).intValue() + getConnectionsManager().getCurrentTime();
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.currentInviteDate != 0) {
                tL_messages_editExportedChatInvite.flags |= 1;
                tL_messages_editExportedChatInvite.expire_date = 0;
                z = true;
            } else {
                z = false;
            }
            int selectedIndex5 = this.usesChooseView.getSelectedIndex();
            if (selectedIndex5 < this.dispalyedUses.size()) {
                int iIntValue = ((Integer) this.dispalyedUses.get(selectedIndex5)).intValue();
                if (this.inviteToEdit.usage_limit != iIntValue) {
                    tL_messages_editExportedChatInvite.flags |= 2;
                    tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                    z = true;
                }
            } else if (this.inviteToEdit.usage_limit != 0) {
                tL_messages_editExportedChatInvite.flags |= 2;
                tL_messages_editExportedChatInvite.usage_limit = 0;
                z = true;
            }
            boolean z3 = this.inviteToEdit.request_needed;
            TextCheckCell textCheckCell3 = this.approveCell;
            if (z3 != (textCheckCell3 != null && textCheckCell3.isChecked())) {
                tL_messages_editExportedChatInvite.flags |= 8;
                TextCheckCell textCheckCell4 = this.approveCell;
                boolean z4 = textCheckCell4 != null && textCheckCell4.isChecked();
                tL_messages_editExportedChatInvite.request_needed = z4;
                if (z4) {
                    tL_messages_editExportedChatInvite.flags |= 2;
                    tL_messages_editExportedChatInvite.usage_limit = 0;
                }
                z = true;
            }
            String string2 = this.nameEditText.getText().toString();
            if (!TextUtils.equals(this.inviteToEdit.title, string2)) {
                tL_messages_editExportedChatInvite.title = string2;
                tL_messages_editExportedChatInvite.flags |= 16;
                z = true;
            }
            if (z) {
                this.loading = true;
                AlertDialog alertDialog4 = new AlertDialog(getParentActivity(), 3);
                this.progressDialog = alertDialog4;
                alertDialog4.showDelayed(500L);
                getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LinkEditActivity.$r8$lambda$lK1ciJKu4TJkUY0FJSLpilrti_I(this.f$0, tLObject, tL_error);
                    }
                });
                return;
            }
            finishFragment();
        }
    }

    public static void $r8$lambda$kn83jnq827IT95LCZiQzxWHAiEM(final LinkEditActivity linkEditActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        linkEditActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.m3401$r8$lambda$nxv476e8O6CIp8Aml46x7aPl4(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m3401$r8$lambda$nxv476e8O6CIp8Aml46x7aPl4(LinkEditActivity linkEditActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        linkEditActivity.loading = false;
        AlertDialog alertDialog = linkEditActivity.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tL_error == null) {
            Callback callback = linkEditActivity.callback;
            if (callback != null) {
                callback.onLinkCreated(tLObject);
            }
            linkEditActivity.finishFragment();
            return;
        }
        AlertsCreator.showSimpleAlert(linkEditActivity, tL_error.text);
    }

    public static void $r8$lambda$lK1ciJKu4TJkUY0FJSLpilrti_I(final LinkEditActivity linkEditActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        linkEditActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.m3402$r8$lambda$PGwSLGzJxmAOdJFmFz5CoKhpew(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m3402$r8$lambda$PGwSLGzJxmAOdJFmFz5CoKhpew(LinkEditActivity linkEditActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        linkEditActivity.loading = false;
        AlertDialog alertDialog = linkEditActivity.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
                linkEditActivity.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            }
            Callback callback = linkEditActivity.callback;
            if (callback != null) {
                callback.onLinkEdited(linkEditActivity.inviteToEdit, tLObject);
            }
            linkEditActivity.finishFragment();
            return;
        }
        AlertsCreator.showSimpleAlert(linkEditActivity, tL_error.text);
    }

    public void chooseUses(int i) {
        int i2;
        this.dispalyedUses.clear();
        int i3 = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (i3 >= iArr.length) {
                break;
            }
            if (!z && i <= (i2 = iArr[i3])) {
                if (i != i2) {
                    this.dispalyedUses.add(Integer.valueOf(i));
                }
                z = true;
                length = i3;
            }
            this.dispalyedUses.add(Integer.valueOf(this.defaultUses[i3]));
            i3++;
        }
        if (!z) {
            this.dispalyedUses.add(Integer.valueOf(i));
            length = this.defaultUses.length;
        }
        int size = this.dispalyedUses.size();
        int i4 = size + 1;
        String[] strArr = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == size) {
                strArr[i5] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i5] = ((Integer) this.dispalyedUses.get(i5)).toString();
            }
        }
        this.usesChooseView.setOptions(length, strArr);
    }

    public void chooseDate(int i) {
        long j = i;
        this.timeEditText.setText(LocaleController.formatDateAudio(j, false));
        int currentTime = i - getConnectionsManager().getCurrentTime();
        this.dispalyedDates.clear();
        int i2 = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (i2 >= iArr.length) {
                break;
            }
            if (!z && currentTime < iArr[i2]) {
                this.dispalyedDates.add(Integer.valueOf(currentTime));
                length = i2;
                z = true;
            }
            this.dispalyedDates.add(Integer.valueOf(this.defaultDates[i2]));
            i2++;
        }
        if (!z) {
            this.dispalyedDates.add(Integer.valueOf(currentTime));
            length = this.defaultDates.length;
        }
        int size = this.dispalyedDates.size();
        int i3 = size + 1;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == size) {
                strArr[i4] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) this.dispalyedDates.get(i4)).intValue() == this.defaultDates[0]) {
                strArr[i4] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) this.dispalyedDates.get(i4)).intValue() == this.defaultDates[1]) {
                strArr[i4] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) this.dispalyedDates.get(i4)).intValue() == this.defaultDates[2]) {
                strArr[i4] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i4] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j2 < 31449600) {
                    strArr[i4] = LocaleController.getInstance().getFormatterScheduleDay().format(j * 1000);
                } else {
                    strArr[i4] = LocaleController.getInstance().getFormatterYear().format(j * 1000);
                }
            }
        }
        this.timeChooseView.setOptions(length, strArr);
    }

    private void resetDates() {
        this.dispalyedDates.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (i < iArr.length) {
                this.dispalyedDates.add(Integer.valueOf(iArr[i]));
                i++;
            } else {
                this.timeChooseView.setOptions(3, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void resetUses() {
        this.dispalyedUses.clear();
        int i = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (i < iArr.length) {
                this.dispalyedUses.add(Integer.valueOf(iArr[i]));
                i++;
            } else {
                this.usesChooseView.setOptions(3, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
        }
    }

    public void setInviteToEdit(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.inviteToEdit = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i = tL_chatInviteExported.expire_date;
        if (i > 0) {
            chooseDate(i);
            this.currentInviteDate = ((Integer) this.dispalyedDates.get(this.timeChooseView.getSelectedIndex())).intValue();
        } else {
            this.currentInviteDate = 0;
        }
        int i2 = tL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            chooseUses(i2);
            this.usesEditText.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        TextCheckCell textCheckCell = this.approveCell;
        if (textCheckCell != null) {
            textCheckCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.approveCell.setChecked(tL_chatInviteExported.request_needed);
        }
        setUsesVisible(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.nameEditText.getPaint().getFontMetricsInt(), false);
            this.nameEditText.setText(spannableStringBuilder);
        }
        TextCheckCell textCheckCell2 = this.subCell;
        if (textCheckCell2 != null) {
            textCheckCell2.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            TextCheckCell textCheckCell3 = this.approveCell;
            if (textCheckCell3 != null) {
                textCheckCell3.setChecked(false);
                this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            }
            TextInfoPrivacyCell textInfoPrivacyCell = this.approveHintCell;
            if (textInfoPrivacyCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        EditTextCell editTextCell = this.subEditPriceCell;
        if (editTextCell != null) {
            editTextCell.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.subEditPriceCell.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.subEditPriceCell.editText.setClickable(false);
            this.subEditPriceCell.editText.setFocusable(false);
            this.subEditPriceCell.editText.setFocusableInTouchMode(false);
            this.subEditPriceCell.editText.setLongClickable(false);
        }
    }

    private void setUsesVisible(boolean z) {
        this.usesHeaderCell.setVisibility(z ? 0 : 8);
        this.usesChooseView.setVisibility(z ? 0 : 8);
        this.usesEditText.setVisibility(z ? 0 : 8);
        this.dividerUses.setVisibility(z ? 0 : 8);
    }

    @Override
    public void finishFragment() {
        this.scrollView.getLayoutParams().height = this.scrollView.getHeight();
        this.finished = true;
        super.finishFragment();
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                LinkEditActivity.m3407$r8$lambda$epYkJqVB7jD8xiTefNUNfxy61g(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.timeHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.usesHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        HeaderCell headerCell = this.timeHeaderCell;
        int i2 = ThemeDescription.FLAG_BACKGROUND;
        int i3 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(headerCell, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.usesHeaderCell, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.timeChooseView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.usesChooseView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.timeEditText, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.usesEditText, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.revokeLink, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(this.divider, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.dividerUses, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.dividerName, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_text_RedRegular));
        return arrayList;
    }

    public static void m3407$r8$lambda$epYkJqVB7jD8xiTefNUNfxy61g(LinkEditActivity linkEditActivity) {
        TextInfoPrivacyCell textInfoPrivacyCell = linkEditActivity.dividerUses;
        if (textInfoPrivacyCell != null) {
            textInfoPrivacyCell.getContext();
            EditText editText = linkEditActivity.usesEditText;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            editText.setTextColor(Theme.getColor(i));
            EditText editText2 = linkEditActivity.usesEditText;
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            editText2.setHintTextColor(Theme.getColor(i2));
            linkEditActivity.timeEditText.setTextColor(Theme.getColor(i));
            linkEditActivity.timeEditText.setHintTextColor(Theme.getColor(i2));
            TextSettingsCell textSettingsCell = linkEditActivity.revokeLink;
            if (textSettingsCell != null) {
                textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            }
            linkEditActivity.createTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            linkEditActivity.nameEditText.setTextColor(Theme.getColor(i));
            linkEditActivity.nameEditText.setHintTextColor(Theme.getColor(i2));
        }
    }
}
