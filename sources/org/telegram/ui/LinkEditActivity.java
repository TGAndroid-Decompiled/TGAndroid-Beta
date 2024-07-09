package org.telegram.ui;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvite;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideChooseView;

public class LinkEditActivity extends BaseFragment {
    private TextCheckCell approveCell;
    private TextView buttonTextView;
    private Callback callback;
    private final long chatId;
    private TextView createTextView;
    int currentInviteDate;
    private TextInfoPrivacyCell divider;
    private TextInfoPrivacyCell dividerName;
    private TextInfoPrivacyCell dividerUses;
    private boolean finished;
    private boolean ignoreSet;
    TLRPC$TL_chatInviteExported inviteToEdit;
    boolean loading;
    private TextCheckCell monthlyFeeCell;
    private EditText nameEditText;
    AlertDialog progressDialog;
    private TextSettingsCell revokeLink;
    boolean scrollToEnd;
    boolean scrollToStart;
    private ScrollView scrollView;
    private SlideChooseView timeChooseView;
    private TextView timeEditText;
    private HeaderCell timeHeaderCell;
    private int type;
    private SlideChooseView usesChooseView;
    private EditText usesEditText;
    private HeaderCell usesHeaderCell;
    private boolean firstLayout = true;
    private ArrayList<Integer> dispalyedDates = new ArrayList<>();
    private final int[] defaultDates = {3600, 86400, 604800};
    private ArrayList<Integer> dispalyedUses = new ArrayList<>();
    private final int[] defaultUses = {1, 10, 100};

    public interface Callback {
        void onLinkCreated(TLObject tLObject);

        void onLinkEdited(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLObject tLObject);

        void onLinkRemoved(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void revokeLink(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);
    }

    public LinkEditActivity(int i, long j) {
        this.type = i;
        this.chatId = j;
    }

    @Override
    public View createView(final Context context) {
        boolean z;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.type;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString("NewLink", R.string.NewLink));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString("EditLink", R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    LinkEditActivity.this.lambda$onBackPressed$306();
                    AndroidUtilities.hideKeyboard(LinkEditActivity.this.usesEditText);
                }
            }
        });
        TextView textView = new TextView(context);
        this.createTextView = textView;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.createTextView.setGravity(16);
        this.createTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkEditActivity.this.onCreateClicked(view);
            }
        });
        this.createTextView.setSingleLine();
        int i2 = this.type;
        if (i2 == 0) {
            this.createTextView.setText(LocaleController.getString("CreateLinkHeader", R.string.CreateLinkHeader));
        } else if (i2 == 1) {
            this.createTextView.setText(LocaleController.getString("SaveLinkHeader", R.string.SaveLinkHeader));
        }
        this.createTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle));
        this.createTextView.setTextSize(1, 14.0f);
        this.createTextView.setTypeface(AndroidUtilities.bold());
        this.createTextView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.0f));
        this.actionBar.addView(this.createTextView, LayoutHelper.createFrame(-2, -2.0f, 8388629, 0.0f, this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight / AndroidUtilities.dp(2.0f) : 0, 0.0f, 0.0f));
        this.scrollView = new ScrollView(context);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            int oldKeyboardHeight;

            @Override
            protected AdjustPanLayoutHelper createAdjustPanLayoutHelper() {
                AdjustPanLayoutHelper adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                    @Override
                    public void onTransitionStart(boolean z2, int i3) {
                        super.onTransitionStart(z2, i3);
                        LinkEditActivity.this.scrollView.getLayoutParams().height = i3;
                    }

                    @Override
                    public void onTransitionEnd() {
                        super.onTransitionEnd();
                        LinkEditActivity.this.scrollView.getLayoutParams().height = -1;
                        LinkEditActivity.this.scrollView.requestLayout();
                    }

                    @Override
                    public void onPanTranslationUpdate(float f, float f2, boolean z2) {
                        super.onPanTranslationUpdate(f, f2, z2);
                        setTranslationY(0.0f);
                    }

                    @Override
                    protected boolean heightAnimationEnabled() {
                        return !LinkEditActivity.this.finished;
                    }
                };
                adjustPanLayoutHelper.setCheckHierarchyHeight(true);
                return adjustPanLayoutHelper;
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }

            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                measureKeyboardHeight();
                boolean z2 = LinkEditActivity.this.usesEditText.isCursorVisible() || LinkEditActivity.this.nameEditText.isCursorVisible();
                int i5 = this.oldKeyboardHeight;
                int i6 = this.keyboardHeight;
                if (i5 == i6 || i6 <= AndroidUtilities.dp(20.0f) || !z2) {
                    if (LinkEditActivity.this.scrollView.getScrollY() == 0 && !z2) {
                        LinkEditActivity.this.scrollToStart = true;
                        invalidate();
                    }
                } else {
                    LinkEditActivity.this.scrollToEnd = true;
                    invalidate();
                }
                int i7 = this.keyboardHeight;
                if (i7 != 0 && i7 < AndroidUtilities.dp(20.0f)) {
                    LinkEditActivity.this.usesEditText.clearFocus();
                    LinkEditActivity.this.nameEditText.clearFocus();
                }
                this.oldKeyboardHeight = this.keyboardHeight;
            }

            @Override
            public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                int scrollY = LinkEditActivity.this.scrollView.getScrollY();
                super.onLayout(z2, i3, i4, i5, i6);
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
            public void dispatchDraw(Canvas canvas) {
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
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                int dp;
                super.onMeasure(i3, i4);
                int size = View.MeasureSpec.getSize(i4);
                int i5 = 0;
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt != LinkEditActivity.this.buttonTextView && childAt.getVisibility() != 8) {
                        i5 += childAt.getMeasuredHeight();
                    }
                }
                int dp2 = size - ((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(16.0f));
                if (i5 >= dp2) {
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    dp = (AndroidUtilities.dp(24.0f) + dp2) - i5;
                }
                if (((LinearLayout.LayoutParams) LinkEditActivity.this.buttonTextView.getLayoutParams()).topMargin != dp) {
                    int i7 = ((LinearLayout.LayoutParams) LinkEditActivity.this.buttonTextView.getLayoutParams()).topMargin;
                    ((LinearLayout.LayoutParams) LinkEditActivity.this.buttonTextView.getLayoutParams()).topMargin = dp;
                    if (!LinkEditActivity.this.firstLayout) {
                        LinkEditActivity.this.buttonTextView.setTranslationY(i7 - dp);
                        LinkEditActivity.this.buttonTextView.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                    }
                    super.onMeasure(i3, i4);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity.this.firstLayout = false;
            }
        };
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(100L);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(1);
        this.scrollView.addView(linearLayout);
        TextView textView2 = new TextView(context);
        this.buttonTextView = textView2;
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        int i3 = this.type;
        if (i3 == 0) {
            this.buttonTextView.setText(LocaleController.getString("CreateLink", R.string.CreateLink));
        } else if (i3 == 1) {
            this.buttonTextView.setText(LocaleController.getString("SaveLink", R.string.SaveLink));
        }
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (chat == null || chat.username == null) {
            TextCheckCell textCheckCell = new TextCheckCell(this, context) {
                @Override
                public void onDraw(Canvas canvas) {
                    canvas.save();
                    canvas.clipRect(0, 0, getWidth(), getHeight());
                    super.onDraw(canvas);
                    canvas.restore();
                }
            };
            this.approveCell = textCheckCell;
            int i4 = Theme.key_windowBackgroundUnchecked;
            textCheckCell.setBackgroundColor(Theme.getColor(i4));
            this.approveCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
            this.approveCell.setDrawCheckRipple(true);
            this.approveCell.setHeight(56);
            this.approveCell.setTag(Integer.valueOf(i4));
            this.approveCell.setTextAndCheck(LocaleController.getString("ApproveNewMembers", R.string.ApproveNewMembers), false, false);
            this.approveCell.setTypeface(AndroidUtilities.bold());
            this.approveCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LinkEditActivity.this.lambda$createView$0(view);
                }
            });
            linearLayout.addView(this.approveCell, LayoutHelper.createLinear(-1, 56));
            z = true;
        } else {
            z = false;
        }
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
        int i5 = R.drawable.greydivider;
        int i6 = Theme.key_windowBackgroundGrayShadow;
        textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(context, i5, i6));
        if (z) {
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescription));
            linearLayout.addView(textInfoPrivacyCell);
        }
        TextCheckCell textCheckCell2 = new TextCheckCell(context);
        this.monthlyFeeCell = textCheckCell2;
        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.RequiredMonthlyFee), false, false);
        linearLayout.addView(this.monthlyFeeCell);
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
        textInfoPrivacyCell2.setBackground(Theme.getThemedDrawableByKey(context, i5, i6));
        textInfoPrivacyCell2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RequiredMonthlyFeeDescription), new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.this.lambda$createView$1();
            }
        }), true));
        linearLayout.addView(textInfoPrivacyCell2);
        HeaderCell headerCell = new HeaderCell(context);
        this.timeHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString("LimitByPeriod", R.string.LimitByPeriod));
        linearLayout.addView(this.timeHeaderCell);
        SlideChooseView slideChooseView = new SlideChooseView(context);
        this.timeChooseView = slideChooseView;
        linearLayout.addView(slideChooseView);
        TextView textView3 = new TextView(context);
        this.timeEditText = textView3;
        textView3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.timeEditText.setGravity(16);
        this.timeEditText.setTextSize(1, 16.0f);
        this.timeEditText.setHint(LocaleController.getString("TimeLimitHint", R.string.TimeLimitHint));
        this.timeEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkEditActivity.this.lambda$createView$3(context, view);
            }
        });
        this.timeChooseView.setCallback(new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i7) {
                LinkEditActivity.this.lambda$createView$4(i7);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        });
        resetDates();
        linearLayout.addView(this.timeEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context);
        this.divider = textInfoPrivacyCell3;
        textInfoPrivacyCell3.setText(LocaleController.getString("TimeLimitHelp", R.string.TimeLimitHelp));
        linearLayout.addView(this.divider);
        HeaderCell headerCell2 = new HeaderCell(context);
        this.usesHeaderCell = headerCell2;
        headerCell2.setText(LocaleController.getString("LimitNumberOfUses", R.string.LimitNumberOfUses));
        linearLayout.addView(this.usesHeaderCell);
        SlideChooseView slideChooseView2 = new SlideChooseView(context);
        this.usesChooseView = slideChooseView2;
        slideChooseView2.setCallback(new SlideChooseView.Callback() {
            @Override
            public final void onOptionSelected(int i7) {
                LinkEditActivity.this.lambda$createView$5(i7);
            }

            @Override
            public void onTouchEnd() {
                SlideChooseView.Callback.CC.$default$onTouchEnd(this);
            }
        });
        resetUses();
        linearLayout.addView(this.usesChooseView);
        EditText editText = new EditText(this, context) {
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
        this.usesEditText.setHint(LocaleController.getString("UsesLimitHint", R.string.UsesLimitHint));
        this.usesEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.usesEditText.setInputType(2);
        this.usesEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
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
                    int parseInt = Integer.parseInt(editable.toString());
                    if (parseInt > 100000) {
                        LinkEditActivity.this.resetUses();
                    } else {
                        LinkEditActivity.this.chooseUses(parseInt);
                    }
                } catch (NumberFormatException unused) {
                    LinkEditActivity.this.resetUses();
                }
            }
        });
        linearLayout.addView(this.usesEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context);
        this.dividerUses = textInfoPrivacyCell4;
        textInfoPrivacyCell4.setText(LocaleController.getString("UsesLimitHelp", R.string.UsesLimitHelp));
        linearLayout.addView(this.dividerUses);
        EditText editText2 = new EditText(this, context) {
            @Override
            @SuppressLint({"ClickableViewAccessibility"})
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
                Emoji.replaceEmoji((CharSequence) editable, LinkEditActivity.this.nameEditText.getPaint().getFontMetricsInt(), (int) LinkEditActivity.this.nameEditText.getPaint().getTextSize(), false);
            }
        });
        this.nameEditText.setCursorVisible(false);
        this.nameEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.nameEditText.setGravity(16);
        this.nameEditText.setHint(LocaleController.getString("LinkNameHint", R.string.LinkNameHint));
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
        linearLayout.addView(this.nameEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context);
        this.dividerName = textInfoPrivacyCell5;
        int i9 = R.drawable.greydivider_bottom;
        textInfoPrivacyCell5.setBackground(Theme.getThemedDrawableByKey(context, i9, i6));
        this.dividerName.setText(LocaleController.getString("LinkNameHelp", R.string.LinkNameHelp));
        linearLayout.addView(this.dividerName);
        if (this.type == 1) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.revokeLink = textSettingsCell;
            textSettingsCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.revokeLink.setText(LocaleController.getString("RevokeLink", R.string.RevokeLink), false);
            this.revokeLink.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            this.revokeLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LinkEditActivity.this.lambda$createView$7(view);
                }
            });
            linearLayout.addView(this.revokeLink);
        }
        sizeNotifierFrameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
        linearLayout.addView(this.buttonTextView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        HeaderCell headerCell3 = this.timeHeaderCell;
        int i10 = Theme.key_windowBackgroundWhite;
        headerCell3.setBackgroundColor(Theme.getColor(i10));
        this.timeChooseView.setBackgroundColor(Theme.getColor(i10));
        this.timeEditText.setBackgroundColor(Theme.getColor(i10));
        this.usesHeaderCell.setBackgroundColor(Theme.getColor(i10));
        this.usesChooseView.setBackgroundColor(Theme.getColor(i10));
        this.usesEditText.setBackgroundColor(Theme.getColor(i10));
        this.nameEditText.setBackgroundColor(Theme.getColor(i10));
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LinkEditActivity.this.onCreateClicked(view);
            }
        });
        this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.dividerUses.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i9, i6));
        this.divider.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i5, i6));
        this.buttonTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed)));
        this.usesEditText.setTextColor(Theme.getColor(i8));
        this.usesEditText.setHintTextColor(Theme.getColor(i7));
        this.timeEditText.setTextColor(Theme.getColor(i8));
        this.timeEditText.setHintTextColor(Theme.getColor(i7));
        this.usesEditText.setCursorVisible(false);
        setInviteToEdit(this.inviteToEdit);
        sizeNotifierFrameLayout.setClipChildren(false);
        this.scrollView.setClipChildren(false);
        linearLayout.setClipChildren(false);
        return sizeNotifierFrameLayout;
    }

    public void lambda$createView$0(View view) {
        TextCheckCell textCheckCell = (TextCheckCell) view;
        boolean z = !textCheckCell.isChecked();
        textCheckCell.setBackgroundColorAnimated(z, Theme.getColor(z ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
        textCheckCell.setChecked(z);
        setUsesVisible(!z);
        this.firstLayout = true;
    }

    public void lambda$createView$1() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.RequiredMonthlyFeeDescriptionLink));
    }

    public void lambda$createView$2(boolean z, int i) {
        chooseDate(i);
    }

    public void lambda$createView$3(Context context, View view) {
        AlertsCreator.createDatePickerDialog(context, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i) {
                LinkEditActivity.this.lambda$createView$2(z, i);
            }
        });
    }

    public void lambda$createView$4(int i) {
        if (i < this.dispalyedDates.size()) {
            this.timeEditText.setText(LocaleController.formatDateAudio(this.dispalyedDates.get(i).intValue() + getConnectionsManager().getCurrentTime(), false));
        } else {
            this.timeEditText.setText("");
        }
    }

    public void lambda$createView$5(int i) {
        this.usesEditText.clearFocus();
        this.ignoreSet = true;
        if (i < this.dispalyedUses.size()) {
            this.usesEditText.setText(this.dispalyedUses.get(i).toString());
        } else {
            this.usesEditText.setText("");
        }
        this.ignoreSet = false;
    }

    public void lambda$createView$7(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setMessage(LocaleController.getString("RevokeAlert", R.string.RevokeAlert));
        builder.setTitle(LocaleController.getString("RevokeLink", R.string.RevokeLink));
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                LinkEditActivity.this.lambda$createView$6(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$createView$6(DialogInterface dialogInterface, int i) {
        this.callback.revokeLink(this.inviteToEdit);
        lambda$onBackPressed$306();
    }

    public void onCreateClicked(android.view.View r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LinkEditActivity.onCreateClicked(android.view.View):void");
    }

    public void lambda$onCreateClicked$9(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.this.lambda$onCreateClicked$8(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$onCreateClicked$8(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.loading = false;
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tLRPC$TL_error == null) {
            Callback callback = this.callback;
            if (callback != null) {
                callback.onLinkCreated(tLObject);
            }
            lambda$onBackPressed$306();
            return;
        }
        AlertsCreator.showSimpleAlert(this, tLRPC$TL_error.text);
    }

    public void lambda$onCreateClicked$11(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LinkEditActivity.this.lambda$onCreateClicked$10(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$onCreateClicked$10(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.loading = false;
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tLRPC$TL_error == null) {
            if (tLObject instanceof TLRPC$TL_messages_exportedChatInvite) {
                this.inviteToEdit = (TLRPC$TL_chatInviteExported) ((TLRPC$TL_messages_exportedChatInvite) tLObject).invite;
            }
            Callback callback = this.callback;
            if (callback != null) {
                callback.onLinkEdited(this.inviteToEdit, tLObject);
            }
            lambda$onBackPressed$306();
            return;
        }
        AlertsCreator.showSimpleAlert(this, tLRPC$TL_error.text);
    }

    public void chooseUses(int i) {
        this.dispalyedUses.clear();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (i2 >= iArr.length) {
                break;
            }
            if (!z && i <= iArr[i2]) {
                if (i != iArr[i2]) {
                    this.dispalyedUses.add(Integer.valueOf(i));
                }
                i3 = i2;
                z = true;
            }
            this.dispalyedUses.add(Integer.valueOf(this.defaultUses[i2]));
            i2++;
        }
        if (!z) {
            this.dispalyedUses.add(Integer.valueOf(i));
            i3 = this.defaultUses.length;
        }
        int size = this.dispalyedUses.size() + 1;
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == size - 1) {
                strArr[i4] = LocaleController.getString("NoLimit", R.string.NoLimit);
            } else {
                strArr[i4] = this.dispalyedUses.get(i4).toString();
            }
        }
        this.usesChooseView.setOptions(i3, strArr);
    }

    private void chooseDate(int i) {
        long j = i;
        this.timeEditText.setText(LocaleController.formatDateAudio(j, false));
        int currentTime = i - getConnectionsManager().getCurrentTime();
        this.dispalyedDates.clear();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (i2 >= iArr.length) {
                break;
            }
            if (!z && currentTime < iArr[i2]) {
                this.dispalyedDates.add(Integer.valueOf(currentTime));
                i3 = i2;
                z = true;
            }
            this.dispalyedDates.add(Integer.valueOf(this.defaultDates[i2]));
            i2++;
        }
        if (!z) {
            this.dispalyedDates.add(Integer.valueOf(currentTime));
            i3 = this.defaultDates.length;
        }
        int size = this.dispalyedDates.size() + 1;
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == size - 1) {
                strArr[i4] = LocaleController.getString("NoLimit", R.string.NoLimit);
            } else if (this.dispalyedDates.get(i4).intValue() == this.defaultDates[0]) {
                strArr[i4] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (this.dispalyedDates.get(i4).intValue() == this.defaultDates[1]) {
                strArr[i4] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (this.dispalyedDates.get(i4).intValue() == this.defaultDates[2]) {
                strArr[i4] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i4] = LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                } else if (j2 < 31449600) {
                    strArr[i4] = LocaleController.getInstance().getFormatterScheduleDay().format(j * 1000);
                } else {
                    strArr[i4] = LocaleController.getInstance().getFormatterYear().format(j * 1000);
                }
            }
        }
        this.timeChooseView.setOptions(i3, strArr);
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
                this.timeChooseView.setOptions(3, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString("NoLimit", R.string.NoLimit));
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
                this.usesChooseView.setOptions(3, "1", "10", "100", LocaleController.getString("NoLimit", R.string.NoLimit));
                return;
            }
        }
    }

    public void setInviteToEdit(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
        this.inviteToEdit = tLRPC$TL_chatInviteExported;
        if (this.fragmentView == null || tLRPC$TL_chatInviteExported == null) {
            return;
        }
        int i = tLRPC$TL_chatInviteExported.expire_date;
        if (i > 0) {
            chooseDate(i);
            this.currentInviteDate = this.dispalyedDates.get(this.timeChooseView.getSelectedIndex()).intValue();
        } else {
            this.currentInviteDate = 0;
        }
        int i2 = tLRPC$TL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            chooseUses(i2);
            this.usesEditText.setText(Integer.toString(tLRPC$TL_chatInviteExported.usage_limit));
        }
        TextCheckCell textCheckCell = this.approveCell;
        if (textCheckCell != null) {
            textCheckCell.setBackgroundColor(Theme.getColor(tLRPC$TL_chatInviteExported.request_needed ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            this.approveCell.setChecked(tLRPC$TL_chatInviteExported.request_needed);
        }
        setUsesVisible(!tLRPC$TL_chatInviteExported.request_needed);
        if (TextUtils.isEmpty(tLRPC$TL_chatInviteExported.title)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tLRPC$TL_chatInviteExported.title);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.nameEditText.getPaint().getFontMetricsInt(), (int) this.nameEditText.getPaint().getTextSize(), false);
        this.nameEditText.setText(spannableStringBuilder);
    }

    private void setUsesVisible(boolean z) {
        this.usesHeaderCell.setVisibility(z ? 0 : 8);
        this.usesChooseView.setVisibility(z ? 0 : 8);
        this.usesEditText.setVisibility(z ? 0 : 8);
        this.dividerUses.setVisibility(z ? 0 : 8);
        this.divider.setBackground(Theme.getThemedDrawableByKey(getParentActivity(), z ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
    }

    @Override
    public void lambda$onBackPressed$306() {
        this.scrollView.getLayoutParams().height = this.scrollView.getHeight();
        this.finished = true;
        super.lambda$onBackPressed$306();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                LinkEditActivity.this.lambda$getThemeDescriptions$12();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_text_RedRegular));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$12() {
        TextInfoPrivacyCell textInfoPrivacyCell = this.dividerUses;
        if (textInfoPrivacyCell != null) {
            Context context = textInfoPrivacyCell.getContext();
            TextInfoPrivacyCell textInfoPrivacyCell2 = this.dividerUses;
            int i = R.drawable.greydivider_bottom;
            int i2 = Theme.key_windowBackgroundGrayShadow;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i, i2));
            this.divider.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, i2));
            this.buttonTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_featuredStickers_addButton), Theme.getColor(Theme.key_featuredStickers_addButtonPressed)));
            EditText editText = this.usesEditText;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            editText.setTextColor(Theme.getColor(i3));
            EditText editText2 = this.usesEditText;
            int i4 = Theme.key_windowBackgroundWhiteGrayText;
            editText2.setHintTextColor(Theme.getColor(i4));
            this.timeEditText.setTextColor(Theme.getColor(i3));
            this.timeEditText.setHintTextColor(Theme.getColor(i4));
            this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            TextSettingsCell textSettingsCell = this.revokeLink;
            if (textSettingsCell != null) {
                textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            }
            this.createTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle));
            this.dividerName.setBackground(Theme.getThemedDrawableByKey(context, i, i2));
            this.nameEditText.setTextColor(Theme.getColor(i3));
            this.nameEditText.setHintTextColor(Theme.getColor(i4));
        }
    }
}
