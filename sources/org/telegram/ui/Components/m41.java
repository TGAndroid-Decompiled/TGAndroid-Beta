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
public abstract class m41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int f26935a;
    public final long f26936b;
    public final org.telegram.ui.xn f26937c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Cells.t3 e;
    public final Drawable f26938f;
    public final SpannableString h;
    public final ImageView f26939n;
    public final boolean[] f26940r;

    public m41(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.xn xnVar) {
        super(context);
        final int currentAccount = xnVar.getCurrentAccount();
        final long a2 = xnVar.a();
        this.f26940r = new boolean[1];
        this.f26935a = currentAccount;
        this.f26936b = a2;
        this.f26937c = xnVar;
        this.d = f6Var;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 2);
        this.e = t3Var;
        t3Var.b(0.3f, 450L, nr.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        t3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        t3Var.setGravity(1);
        t3Var.setIgnoreRTL(!LocaleController.isRTL);
        t3Var.f26169n = false;
        final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this;
        t3Var.setOnClickListener(new z70(wkVar, 24));
        addView(t3Var, k7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f26938f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f26939n = imageView;
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
                org.telegram.ui.wk wkVar2 = org.telegram.ui.wk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.xn xnVar2 = wkVar2.f39757s;
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar2.a(), 140).commit();
                    xnVar2.Qc(true);
                    return;
                }
                int i12 = wkVar2.f26935a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = wkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.f6 f6Var2 = wkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, f6Var2);
                org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var2));
                LinearLayout linearLayout = new LinearLayout(wkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(wkVar2.getContext());
                scrollView.f26554b = new z5((View) scrollView, 350L, nr.h);
                LinearLayout linearLayout2 = new LinearLayout(wkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f19495c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, wkVar2.getContext(), wkVar2.d, true, false);
                g1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = wkVar2.f26936b;
                g1Var.setSubtext(v31.y(v31.D(translateController.getDialogTranslateTo(j10), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, wkVar2.getContext(), wkVar2.d, true, false);
                g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new z70(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, k7.b6.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                v31.D(dialogDetectedLanguage, null, null);
                boolean[] zArr = wkVar2.f26940r;
                String D = v31.D(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.m1(wkVar2.getContext(), f6Var2), k7.b6.n(-1, 8));
                g1Var.setOnClickListener(new dg.m2(new j41(wkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, p1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                if (UserConfig.getInstance(i12).isPremium() && D != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, wkVar2.getContext(), wkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, D);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, D);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.g(ph.f3.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new nh.c0(wkVar2, dialogDetectedLanguage, translateController, D, p1Var, 11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, wkVar2.getContext(), wkVar2.d, false, false);
                g1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new q31(wkVar2, translateController, p1Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(wkVar2.getContext(), f6Var2), k7.b6.n(-1, 8));
                e90 e90Var = new e90(wkVar2.getContext(), null);
                e90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                e90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.j6.f20012j5;
                e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var2));
                e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var2));
                e90Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new k41(0, wkVar2, p1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new u5(5197252827247841976L, e90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                e90Var.setText(ph.f3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), e90Var.getPaint()));
                e90Var.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var2), 0, 12));
                e90Var.setOnClickListener(new rx0(5, wkVar2, p1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e90Var);
                p1Var.e = true;
                p1Var.f20517c = 220;
                p1Var.setOutsideTouchable(true);
                p1Var.setClippingEnabled(true);
                p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                p1Var.setFocusable(true);
                p1Var.setInputMethodMode(2);
                p1Var.setSoftInputMode(0);
                ImageView imageView2 = wkVar2.f26939n;
                p1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, k7.b6.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
        g3Var.fixNavigationBar();
        g3Var.applyBottomPadding = false;
        g3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
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
        frameLayout.addView(linearLayout, k7.b6.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, k7.b6.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, k7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        f51[] f51VarArr = (f51[]) replaceTags.getSpans(0, replaceTags.length(), f51.class);
        for (int i10 = 0; i10 < f51VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(f51VarArr[i10]), replaceTags.getSpanEnd(f51VarArr[i10]), replaceTags.getSpanFlags(f51VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, k7.b6.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, k7.b6.c(-2.0f, -1));
        f10.addView(new dh.d(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new lh.d8(g3VarArr, context, 1)), f6Var), k7.b6.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new dh.d(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), f6Var), k7.b6.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new dh.d(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new lh.d8(g3VarArr, context, 2)), f6Var), k7.b6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, f6Var));
        f10.addView(view, k7.b6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        e90 e90Var = new e90(context, null);
        e90Var.setTextSize(1, 12.0f);
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var));
        e90Var.setGravity(17);
        e90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new lh.d8(g3VarArr, context, 3)));
        e90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        e90Var.setDisablePaddingsOffsetY(true);
        f10.addView(e90Var, k7.b6.t(-1, -2, 7, 32, 0, 32, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        p10.setText(lh.g5.g2(LocaleController.getString(R.string.Understood)));
        p10.setOnClickListener(new i2(g3VarArr, 3));
        f10.addView(p10, k7.b6.t(-1, 48, 7, 16, 0, 16, 16));
        g3Var.customView = f10;
        g3VarArr[0] = g3Var;
        g3Var.fixNavigationBar();
        g3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f26935a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f26936b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.t3 t3Var = this.e;
        if (isTranslatingDialog) {
            String D = v31.D(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(D)) {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, D)));
            } else {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f26940r;
            String D2 = v31.D(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, D2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, D2);
            }
            t3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f26939n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.f19985he;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        org.telegram.ui.Cells.t3 t3Var = this.e;
        t3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        t3Var.setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.j6.M(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 0, 0);
        ImageView imageView = this.f26939n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19914de, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f26938f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f10) {
        this.e.setTranslationX(f10 / 2.0f);
    }
}
