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

    public static void $r8$lambda$2XCcAruOv5QszSEYM9slNEERuNA() {
    }

    @Override
    protected boolean isTouchOutside(float f, float f2) {
        if (f < this.balanceCloud.getX() || f > this.balanceCloud.getX() + this.balanceCloud.getWidth() || f2 < this.balanceCloud.getY() || f2 > this.balanceCloud.getY() + this.balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public StakedDiceSheet(final Context context, final int i, final Theme.ResourcesProvider resourcesProvider, final Utilities.Callback callback) {
        super(context, null, true, false, false, BottomSheetWithRecyclerListView.ActionBarType.FADING, resourcesProvider);
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
        ScaleStateListAnimator.apply(balanceCloud);
        balanceCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                new StarsIntroActivity.StarsOptionsSheet(context, resourcesProvider).show();
            }
        });
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
            LinearLayout linearLayout = new LinearLayout(context);
            this.topView = linearLayout;
            linearLayout.setOrientation(1);
            this.topView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            this.topView.setClipChildren(false);
            this.topView.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            int i2 = R.drawable.dice6;
            imageView.setImageResource(i2);
            this.topView.addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 0, 0, 8));
            int i3 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true);
            textViewMakeTextView.setGravity(17);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                final Text text = new Text(LocaleController.getString(R.string.StakeDiceTitleBeta), 12.0f, AndroidUtilities.bold());
                final Paint bgPaint = new Paint(1);

                @Override
                public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                    return (int) (AndroidUtilities.dp(16.0f) + this.text.getCurrentWidth());
                }

                @Override
                public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                    float fDp = ((i6 + i8) / 2.0f) + AndroidUtilities.dp(1.0f);
                    this.bgPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f, fDp - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f) + f + this.text.getCurrentWidth(), AndroidUtilities.dp(9.0f) + fDp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), this.bgPaint);
                    this.text.draw(canvas, f + AndroidUtilities.dp(8.0f), fDp, -1, 1.0f);
                }
            }, length, spannableStringBuilder.length(), 33);
            textViewMakeTextView.setText(spannableStringBuilder);
            this.topView.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 8.0f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false);
            textViewMakeTextView2.setGravity(17);
            textViewMakeTextView2.setText(LocaleController.getString(R.string.StakeDiceText));
            this.topView.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 32.0f, 0.0f, 32.0f, 12.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlueHeader, true);
            textViewMakeTextView3.setText(LocaleController.getString(R.string.StakeDiceReturns));
            linearLayout2.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 8.0f));
            final TableView tableView = new TableView(context, resourcesProvider);
            linearLayout2.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            TableRow tableRow = new TableRow(context);
            tableView.addView(tableRow);
            TableRow tableRow2 = new TableRow(context);
            tableView.addView(tableRow2);
            final int[] iArr = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, i2, i2};
            Utilities.Callback2Return callback2Return = new Utilities.Callback2Return() {
                @Override
                public final Object run(Object obj, Object obj2) {
                    return StakedDiceSheet.m4073$r8$lambda$Avzvs7HEBCdkCHlzfUQfHJlva8(context, iArr, resourcesProvider, tableView, (Integer) obj, (Float) obj2);
                }
            };
            if (tL_emojiGameDiceInfo.params.size() == 7) {
                tableRow.addView((View) callback2Return.run(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) callback2Return.run(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) callback2Return.run(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) callback2Return.run(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) callback2Return.run(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) callback2Return.run(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) callback2Return.run(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
            }
            TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            textViewMakeTextView4.setGravity(17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(i2);
            coloredImageSpan.recolorDrawable = false;
            coloredImageSpan.setScale(0.8f, 0.8f);
            spannableStringBuilder2.setSpan(coloredImageSpan, 0, spannableStringBuilder2.length(), 33);
            textViewMakeTextView4.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
            linearLayout2.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 0.0f, 4.0f, 0.0f, 16.0f));
            this.topView.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 8.0f, 0.0f, 8.0f, 0.0f));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.editView = linearLayout3;
            linearLayout3.setOrientation(1);
            this.editView.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
            this.editView.setClipToPadding(false);
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
            editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    outlineTextContainerView.animateSelection(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                }
            });
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(R.drawable.diamond);
            linearLayout4.addView(imageView2, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
            linearLayout4.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            outlineTextContainerView.attachEditText(editTextBoldCursor);
            outlineTextContainerView.addView(linearLayout4, LayoutHelper.createFrame(-1, -2, 48));
            this.editView.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2));
            final TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3));
            outlineTextContainerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
            long j = tL_emojiGameDiceInfo.prev_stake;
            j = j <= 0 ? 1000000000L : j;
            editTextBoldCursor.setText(StarsIntroActivity.formatTON(j));
            textView.setAlpha(1.0f);
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j / 1.0E9d) * MessagesController.getInstance(i).config.tonUsdRate.get() * 100.0d), "USD", 2));
            final int[] iArr2 = {2};
            outlineTextContainerView.animateSelection(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
            int i4 = 3;
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                private boolean ignore;

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

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
                    textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (d * MessagesController.getInstance(i).config.tonUsdRate.get() * 100.0d), "USD", 2));
                }
            });
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return StakedDiceSheet.m4074$r8$lambda$U3QzNjIEL4Nod70FOH84Lt4RXk(context, resourcesProvider, editTextBoldCursor, (Long) obj);
                }
            };
            long[] jArr = MessagesController.getInstance(i).tonStakediceStakeSuggestedAmounts;
            int i5 = 0;
            while (i5 < Utilities.divCeil(jArr.length, i4)) {
                LinearLayout linearLayout5 = new LinearLayout(context);
                linearLayout5.setOrientation(0);
                int i6 = 0;
                while (true) {
                    int i7 = i5 * 3;
                    if (i6 < Math.min(i4, jArr.length - i7)) {
                        linearLayout5.addView((View) callbackReturn.run(Long.valueOf(jArr[i7 + i6])), LayoutHelper.createLinear(0, 26, 1.0f, 112, 0, 0, i6 == 2 ? 0 : 6, 0));
                        i6++;
                        i4 = 3;
                    }
                }
                this.editView.addView(linearLayout5, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                i5++;
                i4 = 3;
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_roll);
            coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder3.setSpan(coloredImageSpan2, 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
            buttonWithCounterView.setText(spannableStringBuilder3, false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StakedDiceSheet.$r8$lambda$HSdzoQwWTn8d3fxJFrqvkYCT0kg(this.f$0, editTextBoldCursor, i, outlineTextContainerView, iArr2, context, resourcesProvider, callback, view);
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87, 16, 0, 16, 10));
            ViewGroup viewGroup = this.containerView;
            int i8 = this.backgroundPaddingLeft;
            viewGroup.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i8, 0, i8, 0));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i9 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i9, 0, i9, AndroidUtilities.dp(68.0f));
            this.adapter.update(false);
        }
    }

    public static TableView.TableRowContent m4073$r8$lambda$Avzvs7HEBCdkCHlzfUQfHJlva8(Context context, int[] iArr, Theme.ResourcesProvider resourcesProvider, TableView tableView, Integer num, Float f) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(iArr[num.intValue() - 1]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(imageView, LayoutHelper.createLinear(24, 24));
        if (num.intValue() == 7) {
            for (int i = 0; i < 2; i++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout2.addView(imageView2, LayoutHelper.createLinear(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        StringBuilder sb = new StringBuilder();
        sb.append("x");
        sb.append(f.floatValue() <= 0.0f ? "0" : f);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 3.0f, 0.0f, 0.0f));
        return new TableView.TableRowContent(tableView, linearLayout, false);
    }

    public static View m4074$r8$lambda$U3QzNjIEL4Nod70FOH84Lt4RXk(Context context, Theme.ResourcesProvider resourcesProvider, final EditTextBoldCursor editTextBoldCursor, final Long l) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(1, 13.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i = Theme.key_featuredStickers_addButton;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.15f)));
        textView.setText(StarsIntroActivity.replaceDiamond(StarsIntroActivity.formatTON(l.longValue()) + " 💎", 0.75f));
        ScaleStateListAnimator.apply(textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StakedDiceSheet.$r8$lambda$zzvBunEOVdmRliQ0b4YCyQVjPHw(editTextBoldCursor, l, view);
            }
        });
        return textView;
    }

    public static void $r8$lambda$zzvBunEOVdmRliQ0b4YCyQVjPHw(EditTextBoldCursor editTextBoldCursor, Long l, View view) {
        editTextBoldCursor.setText(StarsIntroActivity.formatTON(l.longValue()));
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void $r8$lambda$HSdzoQwWTn8d3fxJFrqvkYCT0kg(StakedDiceSheet stakedDiceSheet, EditTextBoldCursor editTextBoldCursor, int i, OutlineTextContainerView outlineTextContainerView, int[] iArr, Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback, View view) {
        stakedDiceSheet.getClass();
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
                    new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, AmountUtils$Amount.fromNano((long) (d * 1.0E9d), AmountUtils$Currency.TON), true, new Runnable() {
                        @Override
                        public final void run() {
                            StakedDiceSheet.$r8$lambda$2XCcAruOv5QszSEYM9slNEERuNA();
                        }
                    });
                    return;
                } else {
                    callback.run(Long.valueOf((long) (d * 1.0E9d)));
                    stakedDiceSheet.dismiss();
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

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.isOpenAnimationEnd = true;
        checkBalanceCloudVisibility();
    }

    @Override
    public void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.isOpenAnimationEnd = false;
        checkBalanceCloudVisibility();
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        super.onContainerTranslationYChanged(f);
        checkBalanceCloudVisibility();
    }

    private void checkBalanceCloudVisibility() {
        boolean z = (!this.isOpenAnimationEnd || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.balanceCloudVisible != z) {
            this.balanceCloudVisible = z;
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setEnabled(z);
                this.balanceCloud.setClickable(z);
                this.balanceCloud.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        LinearLayout linearLayout = this.topView;
        if (linearLayout != null) {
            arrayList.add(UItem.asCustom(linearLayout));
        }
        LinearLayout linearLayout2 = this.editView;
        if (linearLayout2 != null) {
            arrayList.add(UItem.asCustom(linearLayout2));
        }
    }

    public static void showStakeToast(BaseFragment baseFragment, int i, long j, final Utilities.Callback callback) {
        final BaseFragment safeLastFragment = baseFragment == null ? LaunchActivity.getSafeLastFragment() : baseFragment;
        if (safeLastFragment == null) {
            return;
        }
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(safeLastFragment.getCurrentAccount()).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            final long j2 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
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
            spannableStringBuilder.append((CharSequence) "  ").append(ButtonSpan.make(LocaleController.getString(R.string.StakeDiceToastChange), new Runnable() {
                @Override
                public final void run() {
                    BaseFragment baseFragment2 = safeLastFragment;
                    new StakedDiceSheet(baseFragment2.getContext(), baseFragment2.getCurrentAccount(), baseFragment2.getResourceProvider(), callback).show();
                }
            }, safeLastFragment.getResourceProvider()));
            AndroidUtilities.removeFromParent(lottieLayout.textView);
            ButtonSpan.TextViewButtons textViewButtons = new ButtonSpan.TextViewButtons(safeLastFragment.getContext());
            lottieLayout.textView = textViewButtons;
            textViewButtons.setSingleLine();
            lottieLayout.textView.setTypeface(Typeface.SANS_SERIF);
            lottieLayout.textView.setTextSize(1, 15.0f);
            lottieLayout.textView.setEllipsize(TextUtils.TruncateAt.END);
            lottieLayout.textView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            lottieLayout.addView(lottieLayout.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
            lottieLayout.textView.setText(StarsIntroActivity.replaceDiamond(spannableStringBuilder));
            lottieLayout.textView.setLinkTextColor(Theme.getColor(Theme.key_undo_cancelColor, safeLastFragment.getResourceProvider()));
            lottieLayout.setTextColor(Theme.getColor(Theme.key_undo_infoColor, safeLastFragment.getResourceProvider()));
            lottieLayout.textView.setSingleLine(false);
            lottieLayout.textView.setMaxLines(2);
            lottieLayout.setButton(new Bulletin.UndoButton(safeLastFragment.getContext(), true, safeLastFragment.getResourceProvider()).setText(LocaleController.getString(R.string.StakeDiceToastButton)).setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    callback.run(Long.valueOf(j2));
                }
            }));
            BulletinFactory.of(safeLastFragment).create(lottieLayout, 2750).show();
        }
    }
}
