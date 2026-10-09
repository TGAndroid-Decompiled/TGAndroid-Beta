package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class s51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f30665a;
    public final long f30666b;
    public final org.telegram.ui.zn f30667c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Cells.u3 f30668e;
    public final Drawable f30669f;
    public final SpannableString h;
    public final ImageView f30670n;
    public final boolean[] f30671r;

    public s51(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.zn znVar) {
        super(context);
        final int currentAccount = znVar.getCurrentAccount();
        final long a2 = znVar.a();
        this.f30671r = new boolean[1];
        this.f30665a = currentAccount;
        this.f30666b = a2;
        this.f30667c = znVar;
        this.d = e6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.f30668e = u3Var;
        u3Var.b(0.3f, 450L, hs.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f30367n = false;
        final org.telegram.ui.al alVar = (org.telegram.ui.al) this;
        u3Var.setOnClickListener(new b90(alVar, 23));
        addView(u3Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 3));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f30669f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f30670n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String formatString;
                int i10;
                int i11 = currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-a2));
                boolean isPremium = UserConfig.getInstance(i11).isPremium();
                org.telegram.ui.al alVar2 = org.telegram.ui.al.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.zn znVar2 = alVar2.f35950s;
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + znVar2.a(), 140).commit();
                    znVar2.Uc(true);
                    return;
                }
                int i12 = alVar2.f30665a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = alVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.e6 e6Var2 = alVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, e6Var2);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var2));
                LinearLayout linearLayout = new LinearLayout(alVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(alVar2.getContext());
                scrollView.f30360b = new g6((View) scrollView, 350L, hs.h);
                LinearLayout linearLayout2 = new LinearLayout(alVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20365c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, alVar2.getContext(), alVar2.d, true, false);
                f1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j3 = alVar2.f30666b;
                f1Var.setSubtext(b51.B(b51.F(translateController.getDialogTranslateTo(j3), null, null)));
                f1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, alVar2.getContext(), alVar2.d, true, false);
                f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var2.setOnClickListener(new b90(actionBarPopupWindow$ActionBarPopupWindowLayout, 24));
                linearLayout.addView(f1Var2);
                linearLayout.addView((View) scrollView, w7.x5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j3);
                b51.F(dialogDetectedLanguage, null, null);
                boolean[] zArr = alVar2.f30671r;
                String F = b51.F(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.k1(alVar2.getContext(), e6Var2), w7.x5.n(-1, 8));
                f1Var.setOnClickListener(new org.telegram.ui.Cells.sa(new q51(alVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, n1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 11));
                if (UserConfig.getInstance(i12).isPremium() && F != null) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, alVar2.getContext(), alVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, F);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, F);
                    }
                    f1Var3.setMultiline(false);
                    f1Var3.g(ci.d4.b(formatString, f1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    f1Var3.setOnClickListener(new ai.s0(alVar2, dialogDetectedLanguage, translateController, F, n1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
                }
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, alVar2.getContext(), alVar2.d, false, false);
                f1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                f1Var4.setOnClickListener(new ai.d0(alVar2, translateController, n1Var, 28));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(alVar2.getContext(), e6Var2), w7.x5.n(-1, 8));
                ea0 ea0Var = new ea0(alVar2.getContext(), null);
                ea0Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                ea0Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.i6.f20905j5;
                ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var2));
                ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                ea0Var.setEmojiColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new ci0(23, alVar2, n1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new b6(5197252827247841976L, ea0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                ea0Var.setText(ci.d4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), ea0Var.getPaint()));
                ea0Var.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var2), 0, 12));
                ea0Var.setOnClickListener(new ut(20, alVar2, n1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(ea0Var);
                n1Var.f21415e = true;
                n1Var.f21414c = 220;
                n1Var.setOutsideTouchable(true);
                n1Var.setClippingEnabled(true);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(true);
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                ImageView imageView2 = alVar2.f30670n;
                n1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.x5.a(30.0f, 0.0f, 0.0f, 7.0f, 0.0f, 30, 21));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        f3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(AndroidUtilities.dp(150.0f));
        float dp = AndroidUtilities.dp(12.0f);
        gradientDrawable.setCornerRadii(new float[]{dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, w7.x5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.x5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.x5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        m61[] m61VarArr = (m61[]) replaceTags.getSpans(0, replaceTags.length(), m61.class);
        for (int i10 = 0; i10 < m61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(m61VarArr[i10]), replaceTags.getSpanEnd(m61VarArr[i10]), replaceTags.getSpanFlags(m61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.x5.a(-2.0f, 32.0f, 14.0f, 32.0f, 20.0f, -1, 49));
        e7.addView(frameLayout, w7.x5.d(-2.0f, -1));
        e7.addView(new ai.x5(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new n51(f3VarArr, context, 0)), e6Var), w7.x5.t(-1, -2, 49, 32, 16, 32, 16));
        e7.addView(new ai.x5(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), e6Var), w7.x5.t(-1, -2, 49, 32, 0, 32, 16));
        e7.addView(new ai.x5(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new n51(f3VarArr, context, 1)), e6Var), w7.x5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, e6Var));
        e7.addView(view, w7.x5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        ea0 ea0Var = new ea0(context, null);
        ea0Var.setTextSize(1, 12.0f);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        ea0Var.setGravity(17);
        ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new n51(f3VarArr, context, 2)));
        ea0Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        ea0Var.setDisablePaddingsOffsetY(true);
        e7.addView(ea0Var, w7.x5.t(-1, -2, 7, 32, 0, 32, 0));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        f7.setText(yh.s3.i2(LocaleController.getString(R.string.Understood)));
        f7.setOnClickListener(new m2(f3VarArr, 3));
        e7.addView(f7, w7.x5.t(-1, 48, 7, 16, 0, 16, 16));
        f3Var.customView = e7;
        f3VarArr[0] = f3Var;
        f3Var.fixNavigationBar();
        f3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f30665a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f30666b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.f30668e;
        if (isTranslatingDialog) {
            String F = b51.F(translateController.getDialogDetectedLanguage(j3), null, null);
            if (!TextUtils.isEmpty(F)) {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, F)));
            } else {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f30671r;
            String F2 = b51.F(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, F2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, F2);
            }
            u3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f30670n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f20876he;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        org.telegram.ui.Cells.u3 u3Var = this.f30668e;
        u3Var.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.i6.X(AndroidUtilities.dp(15.0f), w03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z N = org.telegram.ui.ActionBar.i6.N(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 0, 0);
        ImageView imageView = this.f30670n;
        imageView.setBackground(N);
        int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20805de, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        this.f30669f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.f30668e.setTranslationX(f7 / 2.0f);
    }
}
