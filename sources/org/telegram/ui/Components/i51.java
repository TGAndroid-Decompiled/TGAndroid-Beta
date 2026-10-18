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
public abstract class i51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final int f27076a;
    public final long f27077b;
    public final org.telegram.ui.sn f27078c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Cells.t3 e;
    public final Drawable f27079f;
    public final SpannableString h;
    public final ImageView f27080n;
    public final boolean[] f27081r;

    public i51(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.sn snVar) {
        super(context);
        final int currentAccount = snVar.getCurrentAccount();
        final long a2 = snVar.a();
        this.f27081r = new boolean[1];
        this.f27076a = currentAccount;
        this.f27077b = a2;
        this.f27078c = snVar;
        this.d = d6Var;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 2);
        this.e = t3Var;
        t3Var.b(0.3f, 450L, bs.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        t3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        t3Var.setGravity(1);
        t3Var.setIgnoreRTL(!LocaleController.isRTL);
        t3Var.f29579n = false;
        final org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this;
        t3Var.setOnClickListener(new u80(tkVar, 23));
        addView(t3Var, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f27079f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f27080n = imageView;
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
                org.telegram.ui.tk tkVar2 = org.telegram.ui.tk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.sn snVar2 = tkVar2.f41746s;
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + snVar2.a(), 140).commit();
                    snVar2.Uc(true);
                    return;
                }
                int i12 = tkVar2.f27076a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = tkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.d6 d6Var2 = tkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, d6Var2);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var2));
                LinearLayout linearLayout = new LinearLayout(tkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(tkVar2.getContext());
                scrollView.f26772b = new f6((View) scrollView, 350L, bs.h);
                LinearLayout linearLayout2 = new LinearLayout(tkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20593c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, tkVar2.getContext(), tkVar2.d, true, false);
                e1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = tkVar2.f27077b;
                e1Var.setSubtext(r41.A(r41.F(translateController.getDialogTranslateTo(j10), null, null)));
                e1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, tkVar2.getContext(), tkVar2.d, true, false);
                e1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                e1Var2.setOnClickListener(new u80(actionBarPopupWindow$ActionBarPopupWindowLayout, 24));
                linearLayout.addView(e1Var2);
                linearLayout.addView((View) scrollView, w7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                r41.F(dialogDetectedLanguage, null, null);
                boolean[] zArr = tkVar2.f27081r;
                String F = r41.F(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.j1(tkVar2.getContext(), d6Var2), w7.z5.n(-1, 8));
                e1Var.setOnClickListener(new ai.ha(new f51(tkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, m1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 12));
                if (UserConfig.getInstance(i12).isPremium() && F != null) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, tkVar2.getContext(), tkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, F);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, F);
                    }
                    e1Var3.setMultiline(false);
                    e1Var3.g(ei.x3.b(formatString, e1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    e1Var3.setOnClickListener(new ci.e0(tkVar2, dialogDetectedLanguage, translateController, F, m1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
                }
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, tkVar2.getContext(), tkVar2.d, false, false);
                e1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                e1Var4.setOnClickListener(new m41(tkVar2, translateController, m1Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(tkVar2.getContext(), d6Var2), w7.z5.n(-1, 8));
                x90 x90Var = new x90(tkVar2.getContext(), null);
                x90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                x90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.h6.f21092j5;
                x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var2));
                x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var2));
                x90Var.setEmojiColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new go0(17, tkVar2, m1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new a6(5197252827247841976L, x90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                x90Var.setText(ei.x3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), x90Var.getPaint()));
                x90Var.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var2), 0, 12));
                x90Var.setOnClickListener(new g51(0, tkVar2, m1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(x90Var);
                m1Var.e = true;
                m1Var.f21573c = 220;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                ImageView imageView2 = tkVar2.f27080n;
                m1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        d();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        f3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout e = org.telegram.messenger.lk.e(context, 1);
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
        frameLayout.addView(linearLayout, w7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.z5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        c61[] c61VarArr = (c61[]) replaceTags.getSpans(0, replaceTags.length(), c61.class);
        for (int i10 = 0; i10 < c61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(c61VarArr[i10]), replaceTags.getSpanEnd(c61VarArr[i10]), replaceTags.getSpanFlags(c61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        e.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e.addView(new ci.h4(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new ai.ta(f3VarArr, context, 1)), d6Var), w7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        e.addView(new ci.h4(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), d6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        e.addView(new ci.h4(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new ai.ta(f3VarArr, context, 2)), d6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d7, d6Var));
        e.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        x90 x90Var = new x90(context, null);
        x90Var.setTextSize(1, 12.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21374y6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new ai.ta(f3VarArr, context, 3)));
        x90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        x90Var.setDisablePaddingsOffsetY(true);
        e.addView(x90Var, w7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        ei.d f7 = org.telegram.messenger.lk.f(24, context, d6Var, true);
        f7.setText(ai.k7.B2(LocaleController.getString(R.string.Understood)));
        f7.setOnClickListener(new l2(f3VarArr, 3));
        e.addView(f7, w7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        f3Var.customView = e;
        f3VarArr[0] = f3Var;
        f3Var.fixNavigationBar();
        f3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f27076a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f27077b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.t3 t3Var = this.e;
        if (isTranslatingDialog) {
            String F = r41.F(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(F)) {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, F)));
            } else {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f27081r;
            String F2 = r41.F(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, F2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, F2);
            }
            t3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f27080n.setImageResource(i10);
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.he;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        org.telegram.ui.Cells.t3 t3Var = this.e;
        t3Var.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        t3Var.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(15.0f), w03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z N = org.telegram.ui.ActionBar.h6.N(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var), 0, 0);
        ImageView imageView = this.f27080n;
        imageView.setBackground(N);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20992de, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        this.f27079f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }
}
