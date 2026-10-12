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
public abstract class x51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f32656a;
    public final long f32657b;
    public final org.telegram.ui.eo f32658c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Cells.u3 f32659e;
    public final Drawable f32660f;
    public final SpannableString h;
    public final ImageView f32661n;
    public final boolean[] f32662r;

    public x51(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.eo eoVar) {
        super(context);
        final int currentAccount = eoVar.getCurrentAccount();
        final long a2 = eoVar.a();
        this.f32662r = new boolean[1];
        this.f32656a = currentAccount;
        this.f32657b = a2;
        this.f32658c = eoVar;
        this.d = c6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.f32659e = u3Var;
        u3Var.b(0.3f, 450L, js.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f30059n = false;
        final org.telegram.ui.el elVar = (org.telegram.ui.el) this;
        u3Var.setOnClickListener(new f90(elVar, 24));
        addView(u3Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 3));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f32660f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f32661n = imageView;
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
                org.telegram.ui.el elVar2 = org.telegram.ui.el.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.eo eoVar2 = elVar2.f37182s;
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + eoVar2.a(), 140).commit();
                    eoVar2.Uc(true);
                    return;
                }
                int i12 = elVar2.f32656a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = elVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.c6 c6Var2 = elVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, c6Var2);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, c6Var2));
                LinearLayout linearLayout = new LinearLayout(elVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(elVar2.getContext());
                scrollView.f32268b = new g6((View) scrollView, 350L, js.h);
                LinearLayout linearLayout2 = new LinearLayout(elVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20133c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, true, false);
                e1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j3 = elVar2.f32657b;
                e1Var.setSubtext(g51.A(g51.F(translateController.getDialogTranslateTo(j3), null, null)));
                e1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, true, false);
                e1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                e1Var2.setOnClickListener(new f90(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(e1Var2);
                linearLayout.addView((View) scrollView, w7.w5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j3);
                g51.F(dialogDetectedLanguage, null, null);
                boolean[] zArr = elVar2.f32662r;
                String F = g51.F(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.j1(elVar2.getContext(), c6Var2), w7.w5.n(-1, 8));
                e1Var.setOnClickListener(new org.telegram.ui.Cells.sa(new v51(elVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, m1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 11));
                if (UserConfig.getInstance(i12).isPremium() && F != null) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, F);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, F);
                    }
                    e1Var3.setMultiline(false);
                    e1Var3.g(ci.d4.b(formatString, e1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    e1Var3.setOnClickListener(new ai.s0(elVar2, dialogDetectedLanguage, translateController, F, m1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
                }
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, false, false);
                e1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                e1Var4.setOnClickListener(new ai.d0(elVar2, translateController, m1Var, 28));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(elVar2.getContext(), c6Var2), w7.w5.n(-1, 8));
                ia0 ia0Var = new ia0(elVar2.getContext(), null);
                ia0Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                ia0Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.h6.f20668j5;
                ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var2));
                ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var2));
                ia0Var.setEmojiColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new gi0(21, elVar2, m1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new b6(5197252827247841976L, ia0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                ia0Var.setText(ci.d4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), ia0Var.getPaint()));
                ia0Var.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var2), 0, 12));
                ia0Var.setOnClickListener(new xt(20, elVar2, m1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(ia0Var);
                m1Var.f21147e = true;
                m1Var.f21146c = 220;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                ImageView imageView2 = elVar2.f32661n;
                m1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.w5.a(30.0f, 0.0f, 0.0f, 7.0f, 0.0f, 30, 21));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        e3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
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
        frameLayout.addView(linearLayout, w7.w5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.w5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.w5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        r61[] r61VarArr = (r61[]) replaceTags.getSpans(0, replaceTags.length(), r61.class);
        for (int i10 = 0; i10 < r61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(r61VarArr[i10]), replaceTags.getSpanEnd(r61VarArr[i10]), replaceTags.getSpanFlags(r61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.w5.a(-2.0f, 32.0f, 14.0f, 32.0f, 20.0f, -1, 49));
        e7.addView(frameLayout, w7.w5.d(-2.0f, -1));
        e7.addView(new ai.x5(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new s51(e3VarArr, context, 0)), c6Var), w7.w5.t(-1, -2, 49, 32, 16, 32, 16));
        e7.addView(new ai.x5(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), c6Var), w7.w5.t(-1, -2, 49, 32, 0, 32, 16));
        e7.addView(new ai.x5(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new s51(e3VarArr, context, 1)), c6Var), w7.w5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, c6Var));
        e7.addView(view, w7.w5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        ia0 ia0Var = new ia0(context, null);
        ia0Var.setTextSize(1, 12.0f);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20946y6, c6Var));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        ia0Var.setGravity(17);
        ia0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new s51(e3VarArr, context, 2)));
        ia0Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        ia0Var.setDisablePaddingsOffsetY(true);
        e7.addView(ia0Var, w7.w5.t(-1, -2, 7, 32, 0, 32, 0));
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        f7.setText(yh.s3.i2(LocaleController.getString(R.string.Understood)));
        f7.setOnClickListener(new m2(e3VarArr, 3));
        e7.addView(f7, w7.w5.t(-1, 48, 7, 16, 0, 16, 16));
        e3Var.customView = e7;
        e3VarArr[0] = e3Var;
        e3Var.fixNavigationBar();
        e3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f32656a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f32657b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.f32659e;
        if (isTranslatingDialog) {
            String F = g51.F(translateController.getDialogDetectedLanguage(j3), null, null);
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
            boolean[] zArr = this.f32662r;
            String F2 = g51.F(dialogTranslateTo, zArr, null);
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
        this.f32661n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.f20639he;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        org.telegram.ui.Cells.u3 u3Var = this.f32659e;
        u3Var.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(15.0f), w03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z N = org.telegram.ui.ActionBar.h6.N(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 0, 0);
        ImageView imageView = this.f32661n;
        imageView.setBackground(N);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20568de, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        this.f32660f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.f32659e.setTranslationX(f7 / 2.0f);
    }
}
