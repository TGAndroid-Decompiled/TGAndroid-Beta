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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.BalanceCloud;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity;

public final class StakedDiceSheet extends BottomSheetWithRecyclerListView {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public final BalanceCloud balanceCloud;
    public boolean balanceCloudVisible;
    public final LinearLayout editView;
    public boolean isOpenAnimationEnd;
    public final LinearLayout topView;

    public StakedDiceSheet(final int i, final Context context, final ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, false, false, false, false, 1, resourcesProvider);
        this.currentAccount = i;
        this.topPadding = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        BalanceCloud balanceCloud = new BalanceCloud(context, i, AmountUtils$Currency.TON, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        this.container.addView(balanceCloud, 0, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud, 0.1f, 1.5f);
        balanceCloud.setOnClickListener(new StakedDiceSheet$$ExternalSyntheticLambda3(context, 0, resourcesProvider));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
            LinearLayout linearLayout = new LinearLayout(context);
            this.topView = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            int i2 = R.drawable.dice6;
            imageView.setImageResource(i2);
            linearLayout.addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 8));
            int i3 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true, null);
            textViewMakeTextView.setGravity(17);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                public final Text text = new Text(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
                public final Paint bgPaint = new Paint(1);

                @Override
                public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                    float fDp = ((i6 + i8) / 2.0f) + AndroidUtilities.dp(1.0f);
                    Paint paint2 = this.bgPaint;
                    paint2.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f, fDp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f + this.text.width, AndroidUtilities.dp(9.0f) + fDp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
                    this.text.draw(f + AndroidUtilities.dp(8.0f), fDp, 1.0f, -1, canvas);
                }

                @Override
                public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                    return (int) (AndroidUtilities.dp(16.0f) + this.text.width);
                }
            }, length, spannableStringBuilder.length(), 33);
            textViewMakeTextView.setText(spannableStringBuilder);
            linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false, null);
            textViewMakeTextView2.setGravity(17);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.StakeDiceText));
            linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlueHeader, true, null);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.StakeDiceReturns));
            linearLayout2.addView(textViewMakeTextView3, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
            TableView tableView = new TableView(context, resourcesProvider);
            linearLayout2.addView(tableView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            TableRow tableRow = new TableRow(context);
            tableView.addView(tableRow);
            TableRow tableRow2 = new TableRow(context);
            tableView.addView(tableRow2);
            ArticleViewer$$ExternalSyntheticLambda54 articleViewer$$ExternalSyntheticLambda54 = new ArticleViewer$$ExternalSyntheticLambda54(context, new int[]{R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, i2, i2}, resourcesProvider, tableView, 17);
            if (tL_emojiGameDiceInfo.params.size() == 7) {
                tableRow.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) articleViewer$$ExternalSyntheticLambda54.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
            }
            TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
            textViewMakeTextView4.setGravity(17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(i2);
            coloredImageSpan.recolorDrawable = false;
            coloredImageSpan.setScale(0.8f, 0.8f);
            spannableStringBuilder2.setSpan(coloredImageSpan, 0, spannableStringBuilder2.length(), 33);
            textViewMakeTextView4.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
            linearLayout2.addView(textViewMakeTextView4, LayoutHelper.createLinear(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.editView = linearLayout3;
            linearLayout3.setOrientation(1);
            linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
            linearLayout3.setClipToPadding(false);
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, resourcesProvider);
            outlineTextContainerView.setForceForceUseCenter(true);
            outlineTextContainerView.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
            outlineTextContainerView.setLeftPadding(AndroidUtilities.dp(36.0f));
            editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
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
            editTextBoldCursor.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
            editTextBoldCursor.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
            editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
            editTextBoldCursor.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda5(outlineTextContainerView, editTextBoldCursor, 0));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(R.drawable.diamond);
            linearLayout4.addView(imageView2, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
            linearLayout4.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            outlineTextContainerView.attachedEditText = editTextBoldCursor;
            outlineTextContainerView.invalidate();
            outlineTextContainerView.addView(linearLayout4, LayoutHelper.createFrame(-1, -2, 48));
            linearLayout3.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
            final TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
            outlineTextContainerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
            long j = tL_emojiGameDiceInfo.prev_stake;
            j = j <= 0 ? 1000000000L : j;
            editTextBoldCursor.setText(StarsIntroActivity.formatTON(j));
            textView.setAlpha(1.0f);
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i).config.tonUsdRate.get() * (j / 1.0E9d) * 100.0d), "USD", 2));
            final int[] iArr = {2};
            outlineTextContainerView.animateSelection(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
            int i4 = 3;
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                public boolean ignore;

                @Override
                public final void afterTextChanged(Editable editable) {
                    double d;
                    OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                    int i5 = i;
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    if (this.ignore) {
                        return;
                    }
                    try {
                        d = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
                        try {
                            double d2 = MessagesController.getInstance(i5).tonStakeddiceStakeAmountMax / 1.0E9d;
                            int[] iArr2 = iArr;
                            if (d > d2) {
                                this.ignore = true;
                                d = MessagesController.getInstance(i5).tonStakeddiceStakeAmountMax / 1.0E9d;
                                editTextBoldCursor2.setText(Double.toString(d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i6 = -iArr2[0];
                                iArr2[0] = i6;
                                AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i6);
                            } else if (d > 0.0d && d < MessagesController.getInstance(i5).tonStakeddiceStakeAmountMin / 1.0E9d) {
                                this.ignore = true;
                                d = MessagesController.getInstance(i5).tonStakeddiceStakeAmountMin / 1.0E9d;
                                editTextBoldCursor2.setText(Double.toString(d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i7 = -iArr2[0];
                                iArr2[0] = i7;
                                AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i7);
                            }
                        } catch (Exception unused) {
                            this.ignore = true;
                            editTextBoldCursor2.setText(d <= 0.0d ? "" : Double.toString(d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                    } catch (Exception unused2) {
                        d = 0.0d;
                    }
                    this.ignore = false;
                    outlineTextContainerView2.animateSelection(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(editTextBoldCursor2.getText()));
                    TextView textView2 = textView;
                    if (d == 0.0d) {
                        textView2.animate().alpha(0.0f).start();
                        textView2.setText("");
                    } else {
                        textView2.animate().alpha(1.0f).start();
                        textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i5).config.tonUsdRate.get() * d * 100.0d), "USD", 2));
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }
            });
            StakedDiceSheet$$ExternalSyntheticLambda6 stakedDiceSheet$$ExternalSyntheticLambda6 = new StakedDiceSheet$$ExternalSyntheticLambda6(context, resourcesProvider, editTextBoldCursor, 0);
            long[] jArr = MessagesController.getInstance(i).tonStakediceStakeSuggestedAmounts;
            int i5 = 0;
            while (i5 < Utilities.divCeil(jArr.length, i4)) {
                LinearLayout linearLayoutM = zzkf.m(context, 0);
                int i6 = 0;
                while (true) {
                    int i7 = i5 * 3;
                    if (i6 < Math.min(i4, jArr.length - i7)) {
                        linearLayoutM.addView((View) stakedDiceSheet$$ExternalSyntheticLambda6.run(Long.valueOf(jArr[i7 + i6])), LayoutHelper.createLinear(0, 26, 1.0f, 112, 0, 0, i6 == 2 ? 0 : 6, 0));
                        i6++;
                        i4 = 3;
                    }
                }
                this.editView.addView(linearLayoutM, LayoutHelper.createLinear(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i5++;
                i4 = 3;
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_roll);
            coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder3.setSpan(coloredImageSpan2, 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
            buttonWithCounterView.setText(spannableStringBuilder3, false, true);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StakedDiceSheet stakedDiceSheet = this.f$0;
                    stakedDiceSheet.getClass();
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    Editable text = editTextBoldCursor2.getText();
                    try {
                        double d = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                        int i8 = i;
                        double d2 = MessagesController.getInstance(i8).tonStakeddiceStakeAmountMax / 1.0E9d;
                        OutlineTextContainerView outlineTextContainerView2 = outlineTextContainerView;
                        int[] iArr2 = iArr;
                        if (d > d2) {
                            editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i8).tonStakeddiceStakeAmountMax / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i9 = -iArr2[0];
                            iArr2[0] = i9;
                            AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i9);
                            return;
                        }
                        if (TextUtils.isEmpty(text) || d >= MessagesController.getInstance(i8).tonStakeddiceStakeAmountMin / 1.0E9d) {
                            if (StarsController.getInstance(i8, true).balance.toDouble() < d) {
                                new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, AmountUtils$Amount.fromNano((long) (d * 1.0E9d), AmountUtils$Currency.TON), true, new QrActivity$5$$ExternalSyntheticLambda1(26));
                                return;
                            } else {
                                articleViewer$$ExternalSyntheticLambda21.run(Long.valueOf((long) (d * 1.0E9d)));
                                stakedDiceSheet.lambda$showGiftOfferSheet$15();
                                return;
                            }
                        }
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i8).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i10 = -iArr2[0];
                        iArr2[0] = i10;
                        AndroidUtilities.shakeViewSpring(outlineTextContainerView2, i10);
                    } catch (Exception unused) {
                    }
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87, 16, 0, 16, 10));
            ViewGroup viewGroup = this.containerView;
            int i8 = this.backgroundPaddingLeft;
            viewGroup.addView(frameLayout, LayoutHelper.createFrameMarginPx(-2.0f, 87, i8, 0, i8, 0));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i9 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i9, 0, i9, AndroidUtilities.dp(68.0f));
            this.adapter.update(false);
        }
    }

    public final void checkBalanceCloudVisibility$1() {
        boolean z = (!this.isOpenAnimationEnd || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                balanceCloud.setClickable(z);
                OKLCH.m(balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f), z ? 1.0f : 0.0f, 180L);
            }
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, false, new LinkManager$$ExternalSyntheticLambda1(this, 14), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }

    @Override
    public final boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud = this.balanceCloud;
        if (f < balanceCloud.getX() || f > balanceCloud.getX() + balanceCloud.getWidth() || f2 < balanceCloud.getY() || f2 > balanceCloud.getY() + balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility$1();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.isOpenAnimationEnd = false;
        checkBalanceCloudVisibility$1();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
        checkBalanceCloudVisibility$1();
    }
}
