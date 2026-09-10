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
public abstract class z41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int f29585a;
    public final long f29586b;
    public final org.telegram.ui.eo f29587c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Cells.t3 e;
    public final Drawable f29588f;
    public final SpannableString h;
    public final ImageView f29589n;
    public final boolean[] f29590r;

    public z41(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.eo eoVar) {
        super(context);
        final int currentAccount = eoVar.getCurrentAccount();
        final long a2 = eoVar.a();
        this.f29590r = new boolean[1];
        this.f29585a = currentAccount;
        this.f29586b = a2;
        this.f29587c = eoVar;
        this.d = f6Var;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 2);
        this.e = t3Var;
        t3Var.b(0.3f, 450L, wr.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        t3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        t3Var.setGravity(1);
        t3Var.setIgnoreRTL(!LocaleController.isRTL);
        t3Var.f25682n = false;
        final org.telegram.ui.bl blVar = (org.telegram.ui.bl) this;
        t3Var.setOnClickListener(new g80(blVar, 24));
        addView(t3Var, w7.a6.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f29588f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f29589n = imageView;
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
                org.telegram.ui.bl blVar2 = org.telegram.ui.bl.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.eo eoVar2 = blVar2.f31282s;
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + eoVar2.a(), 140).commit();
                    eoVar2.Qc(true);
                    return;
                }
                int i12 = blVar2.f29585a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = blVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.f6 f6Var2 = blVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, f6Var2);
                org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var2));
                LinearLayout linearLayout = new LinearLayout(blVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(blVar2.getContext());
                scrollView.f29248b = new d6((View) scrollView, 350L, wr.h);
                LinearLayout linearLayout2 = new LinearLayout(blVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f17520c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, blVar2.getContext(), blVar2.d, true, false);
                g1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j3 = blVar2.f29586b;
                g1Var.setSubtext(i41.y(i41.D(translateController.getDialogTranslateTo(j3), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, blVar2.getContext(), blVar2.d, true, false);
                g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new g80(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, w7.a6.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j3);
                i41.D(dialogDetectedLanguage, null, null);
                boolean[] zArr = blVar2.f29590r;
                String D = i41.D(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.m1(blVar2.getContext(), f6Var2), w7.a6.n(-1, 8));
                g1Var.setOnClickListener(new org.telegram.ui.Cells.wa(new x41(blVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, p1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 10));
                if (UserConfig.getInstance(i12).isPremium() && D != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, blVar2.getContext(), blVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, D);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, D);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.g(bi.x4.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new hi.c(blVar2, dialogDetectedLanguage, translateController, D, p1Var, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, blVar2.getContext(), blVar2.d, false, false);
                g1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new bi.q(blVar2, translateController, p1Var, 24));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.m1(blVar2.getContext(), f6Var2), w7.a6.n(-1, 8));
                m90 m90Var = new m90(blVar2.getContext(), null);
                m90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                m90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.j6.f18034j5;
                m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var2));
                m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var2));
                m90Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new yo0(15, blVar2, p1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new y5(5197252827247841976L, m90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                m90Var.setText(bi.x4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), m90Var.getPaint()));
                m90Var.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var2), 0, 12));
                m90Var.setOnClickListener(new u10(17, blVar2, p1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m90Var);
                p1Var.e = true;
                p1Var.f18535c = 220;
                p1Var.setOutsideTouchable(true);
                p1Var.setClippingEnabled(true);
                p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                p1Var.setFocusable(true);
                p1Var.setInputMethodMode(2);
                p1Var.setSoftInputMode(0);
                ImageView imageView2 = blVar2.f29589n;
                p1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.a6.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, f6Var, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        h3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
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
        s51[] s51VarArr = (s51[]) replaceTags.getSpans(0, replaceTags.length(), s51.class);
        for (int i10 = 0; i10 < s51VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(s51VarArr[i10]), replaceTags.getSpanEnd(s51VarArr[i10]), replaceTags.getSpanFlags(s51VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.a6.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f7.addView(frameLayout, w7.a6.c(-2.0f, -1));
        f7.addView(new bi.l4(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new u41(h3VarArr, context, 0)), f6Var), w7.a6.t(-1, -2, 49, 32, 16, 32, 16));
        f7.addView(new bi.l4(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), f6Var), w7.a6.t(-1, -2, 49, 32, 0, 32, 16));
        f7.addView(new bi.l4(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new u41(h3VarArr, context, 1)), f6Var), w7.a6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, f6Var));
        f7.addView(view, w7.a6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        m90 m90Var = new m90(context, null);
        m90Var.setTextSize(1, 12.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setGravity(17);
        m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new u41(h3VarArr, context, 2)));
        m90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        m90Var.setDisablePaddingsOffsetY(true);
        f7.addView(m90Var, w7.a6.t(-1, -2, 7, 32, 0, 32, 0));
        bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
        g10.setText(xh.x3.g2(LocaleController.getString(R.string.Understood)));
        g10.setOnClickListener(new l2(h3VarArr, 3));
        f7.addView(g10, w7.a6.t(-1, 48, 7, 16, 0, 16, 16));
        h3Var.customView = f7;
        h3VarArr[0] = h3Var;
        h3Var.fixNavigationBar();
        h3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f29585a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f29586b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.t3 t3Var = this.e;
        if (isTranslatingDialog) {
            String D = i41.D(translateController.getDialogDetectedLanguage(j3), null, null);
            if (!TextUtils.isEmpty(D)) {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, D)));
            } else {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f29590r;
            String D2 = i41.D(dialogTranslateTo, zArr, null);
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
        this.f29589n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.f18006he;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        org.telegram.ui.Cells.t3 t3Var = this.e;
        t3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        t3Var.setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.j6.M(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 0, 0);
        ImageView imageView = this.f29589n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17936de, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f29588f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }
}
