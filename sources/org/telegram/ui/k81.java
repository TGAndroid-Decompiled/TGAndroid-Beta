package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
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
public final class k81 extends org.telegram.ui.Components.sa {
    public static final int Z = 0;
    public final gh.b T;
    public final LinearLayout U;
    public final LinearLayout V;
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.z41 Y;

    public k81(final Context context, final int i9, final org.telegram.ui.ActionBar.b6 b6Var, final df dfVar) {
        super(context, null, true, false, false, 1, b6Var);
        int i10;
        int i11;
        this.currentAccount = i9;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        gh.b bVar = new gh.b(context, i9, gf.b.f7750b, b6Var);
        this.T = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, 0, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar);
        bVar.setOnClickListener(new fh.o(context, 2, b6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i9).stakeDiceInfo;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.dice6);
        linearLayout.addView(imageView, g7.e6.t(80, 80, 1, 0, 0, 0, 8));
        int i12 = org.telegram.ui.ActionBar.f6.f23108j5;
        TextView b10 = g7.i6.b(context, 20.0f, i12, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new i81(b6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, g7.e6.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = g7.i6.b(context, 14.0f, i12, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.StakeDiceText));
        linearLayout.addView(b11, g7.e6.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.L6, true, null);
        b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(b12, g7.e6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0(context, b6Var);
        linearLayout2.addView(wy0Var, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        wy0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        wy0Var.addView(tableRow2);
        int i13 = R.drawable.dice1;
        int i14 = R.drawable.dice2;
        int i15 = R.drawable.dice3;
        int i16 = R.drawable.dice4;
        int i17 = R.drawable.dice5;
        int i18 = R.drawable.dice6;
        a1.d dVar = new a1.d(context, new int[]{i13, i14, i15, i16, i17, i18, i18}, b6Var, wy0Var, 20);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.f23369y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.dice6, 0);
        eqVar.recolorDrawable = false;
        eqVar.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(eqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(b13, g7.e6.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, g7.e6.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.V = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, b6Var);
        fc0Var.setForceForceUseCenter(true);
        fc0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        fc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23312uf, b6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, b6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new gh.q8(fc0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, g7.e6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, g7.e6.o(-1, -2, 1.0f, 119));
        fc0Var.e(editTextBoldCursor);
        fc0Var.addView(linearLayout4, g7.e6.e(-1, -2, 48));
        linearLayout3.addView(fc0Var, g7.e6.n(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
        fc0Var.addView(textView, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        j10 = j10 <= 0 ? 1000000000L : j10;
        editTextBoldCursor.setText(gh.oa.M0(j10));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i9).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
        final int[] iArr = {2};
        fc0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        editTextBoldCursor.addTextChangedListener(new j81(i9, editTextBoldCursor, fc0Var, iArr, textView));
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                int i19 = org.telegram.ui.ActionBar.f6.Oh;
                org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i19, b6Var2));
                textView2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, org.telegram.ui.ActionBar.f6.v0(i19, b6Var2))));
                textView2.setText(gh.oa.O0(gh.oa.M0(l10.longValue()) + " 💎", 0.75f));
                g7.g6.a(textView2);
                textView2.setOnClickListener(new v80(22, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = MessagesController.getInstance(i9).tonStakediceStakeSuggestedAmounts;
        for (int i19 = 0; i19 < Utilities.divCeil(jArr.length, 3); i19++) {
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            int i20 = 0;
            while (true) {
                int i21 = i19 * 3;
                if (i20 < Math.min(3, jArr.length - i21)) {
                    View view = (View) callbackReturn.run(Long.valueOf(jArr[i21 + i20]));
                    if (i20 == 2) {
                        i11 = 0;
                    } else {
                        i11 = 6;
                    }
                    f10.addView(view, g7.e6.p(0, 26, 1.0f, 112, 0, 0, i11, 0));
                    i20++;
                }
            }
            this.V.addView(f10, g7.e6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
        }
        kh.d dVar2 = new kh.d(context, b6Var, true);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.mini_roll, 0);
        eqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder3.setSpan(eqVar2, 0, spannableStringBuilder3.length(), 33);
        spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                double parseDouble;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                Editable text = editTextBoldCursor2.getText();
                try {
                    if (TextUtils.isEmpty(text)) {
                        parseDouble = 0.0d;
                    } else {
                        parseDouble = Double.parseDouble(text.toString());
                    }
                    int i22 = i9;
                    org.telegram.ui.Components.fc0 fc0Var2 = fc0Var;
                    int[] iArr2 = iArr;
                    if (parseDouble > MessagesController.getInstance(i22).tonStakeddiceStakeAmountMax / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i22).tonStakeddiceStakeAmountMax / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i23 = -iArr2[0];
                        iArr2[0] = i23;
                        AndroidUtilities.shakeViewSpring(fc0Var2, i23);
                    } else if (!TextUtils.isEmpty(text) && parseDouble < MessagesController.getInstance(i22).tonStakeddiceStakeAmountMin / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i22).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i24 = -iArr2[0];
                        iArr2[0] = i24;
                        AndroidUtilities.shakeViewSpring(fc0Var2, i24);
                    } else if (gh.v7.y(i22, true).f9049f.toDouble() < parseDouble) {
                        new lh.f(context, b6Var, gf.a.i((long) (parseDouble * 1.0E9d), gf.b.f7750b), true, new lj0(5));
                    } else {
                        dfVar.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                        k81.this.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dVar2, g7.e6.t(-1, 48, 87, 16, 0, 16, 10));
        ViewGroup viewGroup = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, g7.e6.f(-2.0f, 87, i22, 0, i22, 0));
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        int i23 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i23, 0, i23, AndroidUtilities.dp(68.0f));
        this.Y.N(false);
    }

    public final void O() {
        boolean z10;
        float f10;
        if (this.W && !isDismissed() && !isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X != z10) {
            this.X = z10;
            gh.b bVar = this.T;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                scaleY.alpha(f12).setDuration(180L).start();
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f10, float f11) {
        gh.b bVar = this.T;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f10, f11);
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        O();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.W = false;
        O();
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.W = true;
        O();
    }

    @Override
    public final org.telegram.ui.Components.vk0 v(org.telegram.ui.Components.wk0 wk0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(wk0Var, getContext(), this.currentAccount, 0, false, new a5(this, 27), this.resourcesProvider);
        this.Y = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
