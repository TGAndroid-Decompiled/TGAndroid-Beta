package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class i81 extends org.telegram.ui.Components.qa {
    public static final int Z = 0;
    public final hh.b T;
    public final LinearLayout U;
    public final LinearLayout V;
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.b51 Y;

    public i81(final Context context, final int i10, final org.telegram.ui.ActionBar.c6 c6Var, final df dfVar) {
        super(context, null, true, false, false, 1, c6Var);
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        hh.b bVar = new hh.b(context, i10, hf.b.f8922b, c6Var);
        this.T = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, 0, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h7.b6.a(bVar);
        bVar.setOnClickListener(new gh.n(context, 2, c6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i10).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
            LinearLayout linearLayout = new LinearLayout(context);
            this.U = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.dice6);
            linearLayout.addView(imageView, h7.z5.t(80, 80, 1, 0, 0, 0, 8));
            int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
            TextView textViewB = h7.d6.b(context, 20.0f, i11, true, null);
            textViewB.setGravity(17);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
            spannableStringBuilder.setSpan(new g81(c6Var), length, spannableStringBuilder.length(), 33);
            textViewB.setText(spannableStringBuilder);
            linearLayout.addView(textViewB, h7.z5.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
            TextView textViewB2 = h7.d6.b(context, 14.0f, i11, false, null);
            textViewB2.setGravity(17);
            textViewB2.setText(LocaleController.getString(R.string.StakeDiceText));
            linearLayout.addView(textViewB2, h7.z5.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView textViewB3 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.L6, true, null);
            textViewB3.setText(LocaleController.getString(R.string.StakeDiceReturns));
            linearLayout2.addView(textViewB3, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
            org.telegram.ui.Components.yy0 yy0Var = new org.telegram.ui.Components.yy0(context, c6Var);
            linearLayout2.addView(yy0Var, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            TableRow tableRow = new TableRow(context);
            yy0Var.addView(tableRow);
            TableRow tableRow2 = new TableRow(context);
            yy0Var.addView(tableRow2);
            int i12 = R.drawable.dice1;
            int i13 = R.drawable.dice2;
            int i14 = R.drawable.dice3;
            int i15 = R.drawable.dice4;
            int i16 = R.drawable.dice5;
            int i17 = R.drawable.dice6;
            a1.d dVar = new a1.d(context, new int[]{i12, i13, i14, i15, i16, i17, i17}, c6Var, yy0Var, 20);
            if (tL_emojiGameDiceInfo.params.size() == 7) {
                tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
            }
            TextView textViewB4 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, null);
            textViewB4.setGravity(17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.dice6, 0);
            cqVar.recolorDrawable = false;
            cqVar.setScale(0.8f, 0.8f);
            spannableStringBuilder2.setSpan(cqVar, 0, spannableStringBuilder2.length(), 33);
            textViewB4.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
            linearLayout2.addView(textViewB4, h7.z5.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
            linearLayout.addView(linearLayout2, h7.z5.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.V = linearLayout3;
            linearLayout3.setOrientation(1);
            linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
            linearLayout3.setClipToPadding(false);
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            final org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, c6Var);
            jc0Var.setForceForceUseCenter(true);
            jc0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
            jc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
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
            editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366uf, c6Var));
            editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
            editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
            editTextBoldCursor.setOnFocusChangeListener(new hh.p8(jc0Var, editTextBoldCursor, 2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(R.drawable.diamond);
            linearLayout4.addView(imageView2, h7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
            linearLayout4.addView(editTextBoldCursor, h7.z5.o(-1, -2, 1.0f, 119));
            jc0Var.e(editTextBoldCursor);
            jc0Var.addView(linearLayout4, h7.z5.e(-1, -2, 48));
            linearLayout3.addView(jc0Var, h7.z5.n(-1, -2));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
            jc0Var.addView(textView, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
            long j10 = tL_emojiGameDiceInfo.prev_stake;
            j10 = j10 <= 0 ? 1000000000L : j10;
            editTextBoldCursor.setText(hh.oa.M0(j10));
            textView.setAlpha(1.0f);
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
            final int[] iArr = {2};
            jc0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
            editTextBoldCursor.addTextChangedListener(new h81(i10, editTextBoldCursor, jc0Var, iArr, textView));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    Long l10 = (Long) obj;
                    TextView textView2 = new TextView(context);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    int i18 = org.telegram.ui.ActionBar.g6.Oh;
                    org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var2));
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(i18, c6Var2))));
                    textView2.setText(hh.oa.O0(hh.oa.M0(l10.longValue()) + " 💎", 0.75f));
                    h7.b6.a(textView2);
                    textView2.setOnClickListener(new u70(23, editTextBoldCursor, l10));
                    return textView2;
                }
            };
            long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
            for (int i18 = 0; i18 < Utilities.divCeil(jArr.length, 3); i18++) {
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
                int i19 = 0;
                while (true) {
                    int i20 = i18 * 3;
                    if (i19 < Math.min(3, jArr.length - i20)) {
                        linearLayoutG.addView((View) callbackReturn.run(Long.valueOf(jArr[i20 + i19])), h7.z5.p(0, 26, 1.0f, 112, 0, 0, i19 == 2 ? 0 : 6, 0));
                        i19++;
                    }
                }
                this.V.addView(linearLayoutG, h7.z5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            }
            lh.d dVar2 = new lh.d(context, c6Var, true);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.cq cqVar2 = new org.telegram.ui.Components.cq(R.drawable.mini_roll, 0);
            cqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder3.setSpan(cqVar2, 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
            dVar2.g(spannableStringBuilder3, false, true);
            dVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    Editable text = editTextBoldCursor2.getText();
                    try {
                        double d = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                        int i21 = i10;
                        double d10 = MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d;
                        org.telegram.ui.Components.jc0 jc0Var2 = jc0Var;
                        int[] iArr2 = iArr;
                        if (d > d10) {
                            editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i22 = -iArr2[0];
                            iArr2[0] = i22;
                            AndroidUtilities.shakeViewSpring(jc0Var2, i22);
                            return;
                        }
                        if (TextUtils.isEmpty(text) || d >= MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d) {
                            if (hh.u7.y(i21, true).f10155f.toDouble() < d) {
                                new mh.f(context, c6Var, hf.a.i((long) (d * 1.0E9d), hf.b.f8922b), true, new tq0(4));
                                return;
                            } else {
                                dfVar.run(Long.valueOf((long) (d * 1.0E9d)));
                                this.f38001a.dismiss();
                                return;
                            }
                        }
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i23 = -iArr2[0];
                        iArr2[0] = i23;
                        AndroidUtilities.shakeViewSpring(jc0Var2, i23);
                    } catch (Exception unused) {
                    }
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(dVar2, h7.z5.t(-1, 48, 87, 16, 0, 16, 10));
            ViewGroup viewGroup = this.containerView;
            int i21 = this.backgroundPaddingLeft;
            viewGroup.addView(frameLayout, h7.z5.f(-2.0f, 87, i21, 0, i21, 0));
            org.telegram.ui.Components.zk0 zk0Var = this.d;
            int i22 = this.backgroundPaddingLeft;
            zk0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(68.0f));
            this.Y.N(false);
        }
    }

    public final void P() {
        boolean z10 = (!this.W || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.X != z10) {
            this.X = z10;
            hh.b bVar = this.T;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        hh.b bVar = this.T;
        if (f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        P();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.W = false;
        P();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.W = true;
        P();
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, false, new b5(this, 27), this.resourcesProvider);
        this.Y = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
