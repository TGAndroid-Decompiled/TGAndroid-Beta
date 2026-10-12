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
public abstract class o51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f27848a;
    public final long f27849b;
    public final org.telegram.ui.fo f27850c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Cells.u3 e;
    public final Drawable f27851f;
    public final SpannableString h;
    public final ImageView f27852n;
    public final boolean[] f27853r;

    public o51(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.fo foVar) {
        super(context);
        final int currentAccount = foVar.getCurrentAccount();
        final long a2 = foVar.a();
        this.f27853r = new boolean[1];
        this.f27848a = currentAccount;
        this.f27849b = a2;
        this.f27850c = foVar;
        this.d = c6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.e = u3Var;
        u3Var.b(0.3f, 450L, es.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f29047n = false;
        final org.telegram.ui.el elVar = (org.telegram.ui.el) this;
        u3Var.setOnClickListener(new z80(elVar, 23));
        addView(u3Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 3));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f27851f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f27852n = imageView;
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
                    org.telegram.ui.fo foVar2 = elVar2.f35632s;
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + foVar2.a(), 140).commit();
                    foVar2.Uc(true);
                    return;
                }
                int i12 = elVar2.f27848a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = elVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.c6 c6Var2 = elVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, c6Var2);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var2));
                LinearLayout linearLayout = new LinearLayout(elVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(elVar2.getContext());
                scrollView.f27588b = new g6((View) scrollView, 350L, es.h);
                LinearLayout linearLayout2 = new LinearLayout(elVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f19540c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, true, false);
                e1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = elVar2.f27849b;
                e1Var.setSubtext(x41.A(x41.F(translateController.getDialogTranslateTo(j10), null, null)));
                e1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, true, false);
                e1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                e1Var2.setOnClickListener(new z80(actionBarPopupWindow$ActionBarPopupWindowLayout, 24));
                linearLayout.addView(e1Var2);
                linearLayout.addView((View) scrollView, w7.a6.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                x41.F(dialogDetectedLanguage, null, null);
                boolean[] zArr = elVar2.f27853r;
                String F = x41.F(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.j1(elVar2.getContext(), c6Var2), w7.a6.n(-1, 8));
                e1Var.setOnClickListener(new org.telegram.ui.Cells.sa(new m51(elVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, m1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 11));
                if (UserConfig.getInstance(i12).isPremium() && F != null) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, F);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, F);
                    }
                    e1Var3.setMultiline(false);
                    e1Var3.g(di.d4.b(formatString, e1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    e1Var3.setOnClickListener(new bi.l0(elVar2, dialogDetectedLanguage, translateController, F, m1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
                }
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, elVar2.getContext(), elVar2.d, false, false);
                e1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                e1Var4.setOnClickListener(new bi.x(elVar2, translateController, m1Var, 28));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(elVar2.getContext(), c6Var2), w7.a6.n(-1, 8));
                da0 da0Var = new da0(elVar2.getContext(), null);
                da0Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                da0Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.g6.f20007j5;
                da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var2));
                da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var2));
                da0Var.setEmojiColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new k31(4, elVar2, m1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new b6(5197252827247841976L, da0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                da0Var.setText(di.d4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), da0Var.getPaint()));
                da0Var.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var2), 0, 12));
                da0Var.setOnClickListener(new rt(20, elVar2, m1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(da0Var);
                m1Var.e = true;
                m1Var.f20521c = 220;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                ImageView imageView2 = elVar2.f27852n;
                m1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.a6.a(30.0f, 0.0f, 0.0f, 7.0f, 0.0f, 30, 21));
        d();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        e3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
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
        frameLayout.addView(linearLayout, w7.a6.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.a6.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.a6.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        i61[] i61VarArr = (i61[]) replaceTags.getSpans(0, replaceTags.length(), i61.class);
        for (int i10 = 0; i10 < i61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(i61VarArr[i10]), replaceTags.getSpanEnd(i61VarArr[i10]), replaceTags.getSpanFlags(i61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.a6.a(-2.0f, 32.0f, 14.0f, 32.0f, 20.0f, -1, 49));
        e.addView(frameLayout, w7.a6.d(-2.0f, -1));
        e.addView(new bi.i5(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new j51(e3VarArr, context, 0)), c6Var), w7.a6.t(-1, -2, 49, 32, 16, 32, 16));
        e.addView(new bi.i5(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), c6Var), w7.a6.t(-1, -2, 49, 32, 0, 32, 16));
        e.addView(new bi.i5(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new j51(e3VarArr, context, 1)), c6Var), w7.a6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, c6Var));
        e.addView(view, w7.a6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        da0 da0Var = new da0(context, null);
        da0Var.setTextSize(1, 12.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var));
        da0Var.setGravity(17);
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new j51(e3VarArr, context, 2)));
        da0Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        da0Var.setDisablePaddingsOffsetY(true);
        e.addView(da0Var, w7.a6.t(-1, -2, 7, 32, 0, 32, 0));
        di.d f7 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        f7.setText(zh.r3.i2(LocaleController.getString(R.string.Understood)));
        f7.setOnClickListener(new m2(e3VarArr, 3));
        e.addView(f7, w7.a6.t(-1, 48, 7, 16, 0, 16, 16));
        e3Var.customView = e;
        e3VarArr[0] = e3Var;
        e3Var.fixNavigationBar();
        e3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f27848a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f27849b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.e;
        if (isTranslatingDialog) {
            String F = x41.F(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(F)) {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, F)));
            } else {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f27853r;
            String F2 = x41.F(dialogTranslateTo, zArr, null);
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
        this.f27852n.setImageResource(i10);
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.he;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        org.telegram.ui.Cells.u3 u3Var = this.e;
        u3Var.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.g6.X(AndroidUtilities.dp(15.0f), w03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z N = org.telegram.ui.ActionBar.g6.N(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 0, 0);
        ImageView imageView = this.f27852n;
        imageView.setBackground(N);
        int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19907de, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        this.f27851f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }
}
