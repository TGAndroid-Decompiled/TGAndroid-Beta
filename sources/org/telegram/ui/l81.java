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
public final class l81 extends org.telegram.ui.Components.xa {
    public static final int Z = 0;
    public final jh.b T;
    public final LinearLayout U;
    public final LinearLayout V;
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.k51 Y;

    public l81(final Context context, final int i10, final org.telegram.ui.ActionBar.c6 c6Var, final tm tmVar) {
        super(context, null, true, false, false, 1, c6Var);
        int i11;
        int i12;
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        jh.b bVar = new jh.b(context, i10, kf.b.f13636b, c6Var);
        this.T = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, 0, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        i7.h6.a(bVar);
        bVar.setOnClickListener(new ih.n(context, 2, c6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i10).stakeDiceInfo;
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
        linearLayout.addView(imageView, i7.f6.t(80, 80, 1, 0, 0, 0, 8));
        int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
        TextView b10 = i7.j6.b(context, 20.0f, i13, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
        spannableStringBuilder.setSpan(new j81(c6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, i7.f6.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = i7.j6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.StakeDiceText));
        linearLayout.addView(b11, i7.f6.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = i7.j6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.L6, true, null);
        b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
        linearLayout2.addView(b12, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.hz0 hz0Var = new org.telegram.ui.Components.hz0(context, c6Var);
        linearLayout2.addView(hz0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        hz0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        hz0Var.addView(tableRow2);
        int i14 = R.drawable.dice1;
        int i15 = R.drawable.dice2;
        int i16 = R.drawable.dice3;
        int i17 = R.drawable.dice4;
        int i18 = R.drawable.dice5;
        int i19 = R.drawable.dice6;
        a1.d dVar = new a1.d(context, new int[]{i14, i15, i16, i17, i18, i19, i19}, c6Var, hz0Var, 19);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = i7.j6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f23433y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.dice6, 0);
        iqVar.recolorDrawable = false;
        iqVar.setScale(0.8f, 0.8f);
        spannableStringBuilder2.setSpan(iqVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
        linearLayout2.addView(b13, i7.f6.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, i7.f6.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.V = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, c6Var);
        uc0Var.setForceForceUseCenter(true);
        uc0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
        uc0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23374uf, c6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392vf, c6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setOnFocusChangeListener(new jh.m8(uc0Var, editTextBoldCursor, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, i7.f6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, i7.f6.o(-1, -2, 1.0f, 119));
        uc0Var.e(editTextBoldCursor);
        uc0Var.addView(linearLayout4, i7.f6.e(-1, -2, 48));
        linearLayout3.addView(uc0Var, i7.f6.n(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
        uc0Var.addView(textView, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        j10 = j10 <= 0 ? 1000000000L : j10;
        editTextBoldCursor.setText(jh.ia.M0(j10));
        textView.setAlpha(1.0f);
        textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
        final int[] iArr = {2};
        uc0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
        editTextBoldCursor.addTextChangedListener(new k81(i10, editTextBoldCursor, uc0Var, iArr, textView));
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.g6.Oh;
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i20, c6Var2));
                textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.v0(i20, c6Var2))));
                textView2.setText(jh.ia.O0(jh.ia.M0(l10.longValue()) + " 💎", 0.75f));
                i7.h6.a(textView2);
                textView2.setOnClickListener(new t70(23, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
        for (int i20 = 0; i20 < Utilities.divCeil(jArr.length, 3); i20++) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            int i21 = 0;
            while (true) {
                int i22 = i20 * 3;
                if (i21 < Math.min(3, jArr.length - i22)) {
                    View view = (View) callbackReturn.run(Long.valueOf(jArr[i22 + i21]));
                    if (i21 == 2) {
                        i12 = 0;
                    } else {
                        i12 = 6;
                    }
                    g10.addView(view, i7.f6.p(0, 26, 1.0f, 112, 0, 0, i12, 0));
                    i21++;
                }
            }
            this.V.addView(g10, i7.f6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
        }
        nh.d dVar2 = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(R.drawable.mini_roll, 0);
        iqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder3.setSpan(iqVar2, 0, spannableStringBuilder3.length(), 33);
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
                    int i23 = i10;
                    org.telegram.ui.Components.uc0 uc0Var2 = uc0Var;
                    int[] iArr2 = iArr;
                    if (parseDouble > MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMax / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i24 = -iArr2[0];
                        iArr2[0] = i24;
                        AndroidUtilities.shakeViewSpring(uc0Var2, i24);
                    } else if (!TextUtils.isEmpty(text) && parseDouble < MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d) {
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i23).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i25 = -iArr2[0];
                        iArr2[0] = i25;
                        AndroidUtilities.shakeViewSpring(uc0Var2, i25);
                    } else if (jh.s7.y(i23, true).f12791f.toDouble() < parseDouble) {
                        new oh.f(context, c6Var, kf.a.i((long) (parseDouble * 1.0E9d), kf.b.f13636b), true, new ef0(7));
                    } else {
                        tmVar.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                        l81.this.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dVar2, i7.f6.t(-1, 48, 87, 16, 0, 16, 10));
        ViewGroup viewGroup = this.containerView;
        int i23 = this.backgroundPaddingLeft;
        viewGroup.addView(frameLayout, i7.f6.f(-2.0f, 87, i23, 0, i23, 0));
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        int i24 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i24, 0, i24, AndroidUtilities.dp(68.0f));
        this.Y.N(false);
    }

    public final void P() {
        boolean z10;
        float f9;
        if (this.W && !isDismissed() && !isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X != z10) {
            this.X = z10;
            jh.b bVar = this.T;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f9);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f9, float f10) {
        jh.b bVar = this.T;
        if (f9 >= bVar.getX() && f9 <= bVar.getX() + bVar.getWidth() && f10 >= bVar.getY() && f10 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.isTouchOutside(f9, f10);
    }

    @Override
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
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
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 27), this.resourcesProvider);
        this.Y = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
