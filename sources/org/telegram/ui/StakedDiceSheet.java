package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;

public class StakedDiceSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final BalanceCloud balanceCloud;
    private boolean balanceCloudVisible;
    private LinearLayout editView;
    private boolean isOpenAnimationEnd;
    private LinearLayout topView;

    public StakedDiceSheet(final Context context, final int i, Theme.ResourcesProvider resourcesProvider, final Utilities.Callback<Long> callback) {
        int i2;
        super(context, null, true, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
        Context context2 = context;
        final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
        this.currentAccount = i;
        this.topPadding = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        BalanceCloud balanceCloud = new BalanceCloud(context2, i, AmountUtils$Currency.TON, resourcesProvider2);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        this.container.addView(balanceCloud, 0, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud);
        balanceCloud.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(27, context2, resourcesProvider2));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i).stakeDiceInfo;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.topView = linearLayout;
        linearLayout.setOrientation(1);
        this.topView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        this.topView.setClipChildren(false);
        this.topView.setClipToPadding(false);
        ImageView imageView = new ImageView(context2);
        int i3 = R.drawable.dice6;
        imageView.setImageResource(i3);
        this.topView.addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 8));
        int i4 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context2, 20.0f, i4, true);
        textViewMakeTextView.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new ReplacementSpan() {
            final Text text = new Text(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
            final Paint bgPaint = new Paint(1);

            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f, int i7, int i8, int i9, Paint paint) {
                float fDp = ((i7 + i9) / 2.0f) + AndroidUtilities.dp(1.0f);
                this.bgPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f, fDp - AndroidUtilities.dp(9.0f), this.text.getCurrentWidth() + AndroidUtilities.dp(16.0f) + f, AndroidUtilities.dp(9.0f) + fDp);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), this.bgPaint);
                this.text.draw(canvas, f + AndroidUtilities.dp(8.0f), fDp, -1, 1.0f);
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                return (int) (this.text.getCurrentWidth() + AndroidUtilities.dp(16.0f));
            }
        }, length, spannableStringBuilder.length(), 33);
        textViewMakeTextView.setText(spannableStringBuilder);
        this.topView.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 8.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context2, 14.0f, i4, false);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.StakeDiceText));
        this.topView.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        TextView textViewMakeTextView3 = TextHelper.makeTextView(context2, 14.0f, Theme.key_windowBackgroundWhiteBlueHeader, true);
        textViewMakeTextView3.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
        TableView tableView = new TableView(context2, resourcesProvider2);
        linearLayout2.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
        TableRow tableRow = new TableRow(context2);
        tableView.addView(tableRow);
        TableRow tableRow2 = new TableRow(context2);
        tableView.addView(tableRow2);
        int[] iArr = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, i3, i3};
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView(lambda$new$1(context2, iArr, resourcesProvider2, tableView, 1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView(lambda$new$1(context, iArr, resourcesProvider, tableView, 2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView(lambda$new$1(context, iArr, resourcesProvider, tableView, 3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView(lambda$new$1(context, iArr, resourcesProvider, tableView, 4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView(lambda$new$1(context, iArr, resourcesProvider, tableView, 5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            i2 = 5;
            tableRow2.addView(lambda$new$1(context, iArr, resourcesProvider, tableView, 6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            context2 = context;
            resourcesProvider2 = resourcesProvider;
            tableRow2.addView(lambda$new$1(context2, iArr, resourcesProvider2, tableView, 7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        } else {
            i2 = 5;
        }
        TextView textViewMakeTextView4 = TextHelper.makeTextView(context2, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
        textViewMakeTextView4.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(i3);
        coloredImageSpan.recolorDrawable = false;
        coloredImageSpan.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(coloredImageSpan, 0, spannableStringBuilder2.length(), 33);
        textViewMakeTextView4.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 0.0f, 4.0f, 0.0f, 16.0f));
        this.topView.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 8.0f, 0.0f, 8.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.editView = linearLayout3;
        linearLayout3.setOrientation(1);
        this.editView.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        this.editView.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context2);
        final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context2, resourcesProvider2);
        outlineTextContainerView.setForceForceUseCenter(true);
        outlineTextContainerView.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider2));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider2));
        editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider2));
        editTextBoldCursor.setGravity(LocaleController.isRTL ? i2 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda6(outlineTextContainerView, editTextBoldCursor, 0));
        LinearLayout linearLayout4 = new LinearLayout(context2);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        outlineTextContainerView.attachEditText(editTextBoldCursor);
        outlineTextContainerView.addView(linearLayout4, LayoutHelper.createFrame(-1, -2, 48));
        this.editView.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
        final TextView textView = new TextView(context2);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
        outlineTextContainerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j = tL_emojiGameDiceInfo.prev_stake;
        j = j <= 0 ? 1000000000L : j;
        editTextBoldCursor.setText(StarsIntroActivity.formatTON(j));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (100.0d * MessagesController.getInstance(i).config.tonUsdRate.get() * (j / 1.0E9d)), "USD", 2));
        final int[] iArr2 = {2};
        outlineTextContainerView.animateSelection(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        final Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            private boolean ignore;

            @Override
            public void afterTextChanged(Editable editable) {
                double d;
                if (this.ignore) {
                    return;
                }
                try {
                    d = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
                    try {
                        if (d > MessagesController.getInstance(i).tonStakeddiceStakeAmountMax / 1.0E9d) {
                            this.ignore = true;
                            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                            d = MessagesController.getInstance(i).tonStakeddiceStakeAmountMax / 1.0E9d;
                            editTextBoldCursor2.setText(Double.toString(d));
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursor;
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.getText().length());
                            OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                            int[] iArr3 = iArr2;
                            int i5 = -iArr3[0];
                            iArr3[0] = i5;
                            AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i5);
                        } else if (d > 0.0d && d < MessagesController.getInstance(i).tonStakeddiceStakeAmountMin / 1.0E9d) {
                            this.ignore = true;
                            EditTextBoldCursor editTextBoldCursor4 = editTextBoldCursor;
                            d = MessagesController.getInstance(i).tonStakeddiceStakeAmountMin / 1.0E9d;
                            editTextBoldCursor4.setText(Double.toString(d));
                            EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursor;
                            editTextBoldCursor5.setSelection(editTextBoldCursor5.getText().length());
                            OutlineTextContainerView outlineTextContainerView3 = outlineTextContainerView;
                            int[] iArr4 = iArr2;
                            int i6 = -iArr4[0];
                            iArr4[0] = i6;
                            AndroidUtilities.shakeViewSpring(outlineTextContainerView3, i6);
                        }
                    } catch (Exception unused) {
                        this.ignore = true;
                        editTextBoldCursor.setText(d <= 0.0d ? "" : Double.toString(d));
                        EditTextBoldCursor editTextBoldCursor6 = editTextBoldCursor;
                        editTextBoldCursor6.setSelection(editTextBoldCursor6.getText().length());
                    }
                } catch (Exception unused2) {
                    d = 0.0d;
                }
                this.ignore = false;
                outlineTextContainerView.animateSelection(editTextBoldCursor.isFocused(), true ^ TextUtils.isEmpty(editTextBoldCursor.getText()));
                if (d == 0.0d) {
                    textView.animate().alpha(0.0f).start();
                    textView.setText("");
                    return;
                }
                textView.animate().alpha(1.0f).start();
                textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i).config.tonUsdRate.get() * d * 100.0d), "USD", 2));
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }
        });
        long[] jArr = MessagesController.getInstance(i).tonStakediceStakeSuggestedAmounts;
        int i5 = 0;
        while (true) {
            int i6 = 3;
            if (i5 >= Utilities.divCeil(jArr.length, 3)) {
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider3);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_roll);
                coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder3.setSpan(coloredImageSpan2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
                buttonWithCounterView.setText(spannableStringBuilder3, false);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$6(editTextBoldCursor, i, outlineTextContainerView, iArr2, context, resourcesProvider3, callback, view);
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.containerView;
                int i7 = this.backgroundPaddingLeft;
                viewGroup.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i7, 0, i7, 0));
                RecyclerListView recyclerListView = this.recyclerListView;
                int i8 = this.backgroundPaddingLeft;
                recyclerListView.setPadding(i8, 0, i8, AndroidUtilities.dp(68.0f));
                this.adapter.update(false);
                return;
            }
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
            int i9 = 0;
            while (true) {
                int i10 = i5 * 3;
                if (i9 < Math.min(i6, jArr.length - i10)) {
                    linearLayoutM.addView(lambda$new$4(context, resourcesProvider3, editTextBoldCursor, Long.valueOf(jArr[i10 + i9])), LayoutHelper.createLinear(0, 26, 1.0f, 112, 0, 0, i9 == 2 ? 0 : 6, 0));
                    i9++;
                    i6 = 3;
                }
            }
            this.editView.addView(linearLayoutM, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
            i5++;
        }
    }

    private void checkBalanceCloudVisibility() {
        boolean z = (!this.isOpenAnimationEnd || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                this.balanceCloud.setClickable(z);
                OKLCH.m(this.balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f), z ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        LinearLayout linearLayout = this.topView;
        if (linearLayout != null) {
            arrayList.add(UItem.asCustom(linearLayout));
        }
        LinearLayout linearLayout2 = this.editView;
        if (linearLayout2 != null) {
            arrayList.add(UItem.asCustom(linearLayout2));
        }
    }

    public static void lambda$new$0(Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
    }

    private static TableView.TableRowContent lambda$new$1(Context context, int[] iArr, Theme.ResourcesProvider resourcesProvider, TableView tableView, Integer num, Float f) {
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, LayoutHelper.createLinear(24, 24));
        if (num.intValue() == 7) {
            for (int i = 0; i < 2; i++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, LayoutHelper.createLinear(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        StringBuilder sb = new StringBuilder("x");
        sb.append(f.floatValue() <= 0.0f ? "0" : f);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 3.0f, 0.0f, 0.0f));
        return new TableView.TableRowContent(tableView, linearLayoutM, false);
    }

    public static void lambda$new$2(OutlineTextContainerView outlineTextContainerView, EditTextBoldCursor editTextBoldCursor, View view, boolean z) {
        outlineTextContainerView.animateSelection(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
    }

    public static void lambda$new$3(EditTextBoldCursor editTextBoldCursor, Long l, View view) {
        editTextBoldCursor.setText(StarsIntroActivity.formatTON(l.longValue()));
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    private static View lambda$new$4(Context context, Theme.ResourcesProvider resourcesProvider, EditTextBoldCursor editTextBoldCursor, Long l) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(1, 13.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i = Theme.key_featuredStickers_addButton;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.multAlpha(0.15f, Theme.getColor(i, resourcesProvider))));
        textView.setText(StarsIntroActivity.replaceDiamond(StarsIntroActivity.formatTON(l.longValue()) + " 💎", 0.75f, 0.0f, 1.0f));
        ScaleStateListAnimator.apply(textView);
        textView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(26, editTextBoldCursor, l));
        return textView;
    }

    public static void lambda$new$5() {
    }

    public void lambda$new$6(EditTextBoldCursor editTextBoldCursor, int i, OutlineTextContainerView outlineTextContainerView, int[] iArr, Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback, View view) {
        Editable text = editTextBoldCursor.getText();
        try {
            double d = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
            if (d > MessagesController.getInstance(i).tonStakeddiceStakeAmountMax / 1.0E9d) {
                editTextBoldCursor.setText(Double.toString(MessagesController.getInstance(i).tonStakeddiceStakeAmountMax / 1.0E9d));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                int i2 = -iArr[0];
                iArr[0] = i2;
                AndroidUtilities.shakeViewSpring(outlineTextContainerView, i2);
                return;
            }
            if (TextUtils.isEmpty(text) || d >= MessagesController.getInstance(i).tonStakeddiceStakeAmountMin / 1.0E9d) {
                if (StarsController.getInstance(i, true).balance.toDouble() < d) {
                    new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, AmountUtils$Amount.fromNano((long) (d * 1.0E9d), AmountUtils$Currency.TON), true, new OAuthSheet$$ExternalSyntheticLambda5(23));
                    return;
                } else {
                    callback.run(Long.valueOf((long) (d * 1.0E9d)));
                    lambda$showGiftOfferSheet$15();
                    return;
                }
            }
            editTextBoldCursor.setText(Double.toString(MessagesController.getInstance(i).tonStakeddiceStakeAmountMin / 1.0E9d));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            int i3 = -iArr[0];
            iArr[0] = i3;
            AndroidUtilities.shakeViewSpring(outlineTextContainerView, i3);
        } catch (Exception unused) {
        }
    }

    public static void lambda$showStakeToast$7(BaseFragment baseFragment, Utilities.Callback callback) {
        new StakedDiceSheet(baseFragment.getContext(), baseFragment.getCurrentAccount(), baseFragment.getResourceProvider(), callback).show();
    }

    public static void lambda$showStakeToast$8(Utilities.Callback callback, long j) {
        callback.run(Long.valueOf(j));
    }

    public static void showStakeToast(BaseFragment baseFragment, int i, long j, Utilities.Callback<Long> callback) {
        BaseFragment safeLastFragment = baseFragment == null ? LaunchActivity.getSafeLastFragment() : baseFragment;
        if (safeLastFragment == null) {
            return;
        }
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(safeLastFragment.getCurrentAccount()).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            long j2 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(safeLastFragment.getContext(), safeLastFragment.getResourceProvider());
            lottieLayout.imageView.setScaleX(1.25f);
            lottieLayout.imageView.setScaleY(1.25f);
            if (i == 1) {
                lottieLayout.imageView.setImageResource(R.drawable.dice1);
            } else if (i == 2) {
                lottieLayout.imageView.setImageResource(R.drawable.dice2);
            } else if (i == 3) {
                lottieLayout.imageView.setImageResource(R.drawable.dice3);
            } else if (i == 4) {
                lottieLayout.imageView.setImageResource(R.drawable.dice4);
            } else if (i == 5) {
                lottieLayout.imageView.setImageResource(R.drawable.dice5);
            } else if (i == 6) {
                lottieLayout.imageView.setImageResource(R.drawable.dice6);
            } else {
                lottieLayout.imageView.setScaleX(0.8f);
                lottieLayout.imageView.setScaleY(0.8f);
                lottieLayout.imageView.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
            spannableStringBuilder.append((CharSequence) StarsIntroActivity.formatTON(j2));
            spannableStringBuilder.append((CharSequence) "  ").append(ButtonSpan.make(LocaleController.getString(R.string.StakeDiceToastChange), new QrActivity$$ExternalSyntheticLambda5(27, safeLastFragment, callback), safeLastFragment.getResourceProvider()));
            AndroidUtilities.removeFromParent(lottieLayout.textView);
            ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(safeLastFragment.getContext());
            lottieLayout.textView = textViewButtons;
            textViewButtons.setSingleLine();
            lottieLayout.textView.setTypeface(Typeface.SANS_SERIF);
            lottieLayout.textView.setTextSize(1, 15.0f);
            lottieLayout.textView.setEllipsize(TextUtils.TruncateAt.END);
            lottieLayout.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            lottieLayout.addView(lottieLayout.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
            lottieLayout.textView.setText(StarsIntroActivity.replaceDiamond(spannableStringBuilder, 0.9f, 0.0f, 1.0f));
            lottieLayout.textView.setLinkTextColor(Theme.getColor(Theme.key_undo_cancelColor, safeLastFragment.getResourceProvider()));
            lottieLayout.setTextColor(Theme.getColor(Theme.key_undo_infoColor, safeLastFragment.getResourceProvider()));
            lottieLayout.textView.setSingleLine(false);
            lottieLayout.textView.setMaxLines(2);
            lottieLayout.setButton(new Bulletin.UndoButton(safeLastFragment.getContext(), true, safeLastFragment.getResourceProvider()).setText(LocaleController.getString(R.string.StakeDiceToastButton)).setUndoAction(new StakedDiceSheet$$ExternalSyntheticLambda4(j2, 0, callback)));
            BulletinFactory.of(safeLastFragment).create(lottieLayout, 2750).show();
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new LinkManager$$ExternalSyntheticLambda6(this, 27), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }

    @Override
    public boolean isTouchOutside(float f, float f2) {
        if (f < this.balanceCloud.getX() || f > this.balanceCloud.getX() + this.balanceCloud.getWidth() || f2 < this.balanceCloud.getY() || f2 > this.balanceCloud.getY() + this.balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility();
    }

    @Override
    public void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.isOpenAnimationEnd = false;
        checkBalanceCloudVisibility();
    }

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
        checkBalanceCloudVisibility();
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
