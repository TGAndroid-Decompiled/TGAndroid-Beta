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
public abstract class p31 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final int f31532a;
    public final long f31533b;
    public final org.telegram.ui.qn f31534c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.Cells.u3 f31535e;
    public final Drawable f31536f;
    public final SpannableString h;
    public final ImageView f31537n;
    public final boolean[] f31538r;

    public p31(Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.qn qnVar) {
        super(context);
        final int currentAccount = qnVar.getCurrentAccount();
        final long a2 = qnVar.a();
        this.f31538r = new boolean[1];
        this.f31532a = currentAccount;
        this.f31533b = a2;
        this.f31534c = qnVar;
        this.d = b6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.f31535e = u3Var;
        u3Var.b(0.3f, 450L, gr.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f29650n = false;
        final org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this;
        u3Var.setOnClickListener(new h70(nkVar, 24));
        addView(u3Var, g7.e6.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f31536f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f31537n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String formatString;
                int i9;
                int i10 = currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-a2));
                boolean isPremium = UserConfig.getInstance(i10).isPremium();
                org.telegram.ui.nk nkVar2 = org.telegram.ui.nk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.qn qnVar2 = nkVar2.f40757s;
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i9).edit();
                    edit.putInt("dialog_show_translate_count" + qnVar2.a(), 140).commit();
                    qnVar2.Qc(true);
                    return;
                }
                int i11 = nkVar2.f31532a;
                TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
                Context context2 = nkVar2.getContext();
                int i12 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.b6 b6Var2 = nkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i12, 1, context2, b6Var2);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var2));
                LinearLayout linearLayout = new LinearLayout(nkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(nkVar2.getContext());
                scrollView.f31279b = new y5((View) scrollView, 350L, gr.h);
                LinearLayout linearLayout2 = new LinearLayout(nkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, nkVar2.getContext(), nkVar2.d, true, false);
                g1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = nkVar2.f31533b;
                g1Var.setSubtext(z21.y(z21.D(translateController.getDialogTranslateTo(j10), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, nkVar2.getContext(), nkVar2.d, true, false);
                g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new h70(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, g7.e6.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                z21.D(dialogDetectedLanguage, null, null);
                boolean[] zArr = nkVar2.f31538r;
                String D = z21.D(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.l1(nkVar2.getContext(), b6Var2), g7.e6.n(-1, 8));
                g1Var.setOnClickListener(new fh.a3(new n31(nkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, o1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (UserConfig.getInstance(i11).isPremium() && D != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, nkVar2.getContext(), nkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, D);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, D);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.g(kh.x3.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new ih.d0(nkVar2, dialogDetectedLanguage, translateController, D, o1Var, 11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, nkVar2.getContext(), nkVar2.d, false, false);
                g1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new gd0(nkVar2, translateController, o1Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(nkVar2.getContext(), b6Var2), g7.e6.n(-1, 8));
                l80 l80Var = new l80(nkVar2.getContext(), null);
                l80Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                l80Var.setDisablePaddingsOffsetY(true);
                int i13 = org.telegram.ui.ActionBar.f6.f23108j5;
                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var2));
                l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var2));
                l80Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new jg0(24, nkVar2, o1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new t5(5197252827247841976L, l80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                l80Var.setText(kh.x3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), l80Var.getPaint()));
                l80Var.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var2), 0, 12));
                l80Var.setOnClickListener(new vh0(7, nkVar2, o1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l80Var);
                o1Var.f23690e = true;
                o1Var.f23689c = 220;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                o1Var.setInputMethodMode(2);
                o1Var.setSoftInputMode(0);
                ImageView imageView2 = nkVar2.f31537n;
                o1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, g7.e6.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        d();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        f3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
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
        frameLayout.addView(linearLayout, g7.e6.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, g7.e6.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, g7.e6.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        i41[] i41VarArr = (i41[]) replaceTags.getSpans(0, replaceTags.length(), i41.class);
        for (int i9 = 0; i9 < i41VarArr.length; i9++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(i41VarArr[i9]), replaceTags.getSpanEnd(i41VarArr[i9]), replaceTags.getSpanFlags(i41VarArr[i9]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, g7.e6.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, g7.e6.c(-2.0f, -1));
        f10.addView(new dh.g(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new gh.f8(f3VarArr, context, 1)), b6Var), g7.e6.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new dh.g(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), b6Var), g7.e6.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new dh.g(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new gh.f8(f3VarArr, context, 2)), b6Var), g7.e6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
        f10.addView(view, g7.e6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        l80 l80Var = new l80(context, null);
        l80Var.setTextSize(1, 12.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        l80Var.setGravity(17);
        l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new gh.f8(f3VarArr, context, 3)));
        l80Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        l80Var.setDisablePaddingsOffsetY(true);
        f10.addView(l80Var, g7.e6.t(-1, -2, 7, 32, 0, 32, 0));
        kh.d i10 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        i10.setText(gh.k5.g2(LocaleController.getString(R.string.Understood)));
        i10.setOnClickListener(new h2(f3VarArr, 3));
        f10.addView(i10, g7.e6.t(-1, 48, 7, 16, 0, 16, 16));
        f3Var.customView = f10;
        f3VarArr[0] = f3Var;
        f3Var.fixNavigationBar();
        f3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i9;
        int i10 = this.f31532a;
        TranslateController translateController = MessagesController.getInstance(i10).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f31533b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.f31535e;
        if (isTranslatingDialog) {
            String D = z21.D(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(D)) {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, D)));
            } else {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f31538r;
            String D2 = z21.D(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, D2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, D2);
            }
            u3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i10).isPremium() && (chat == null || !chat.autotranslation)) {
            i9 = R.drawable.msg_close;
        } else {
            i9 = R.drawable.msg_mini_customize;
        }
        this.f31537n.setImageResource(i9);
    }

    @Override
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.f23081he;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        org.telegram.ui.Cells.u3 u3Var = this.f31535e;
        u3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.f6.M(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 0, 0);
        ImageView imageView = this.f31537n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23008de, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f31536f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f10) {
        this.f31535e.setTranslationX(f10 / 2.0f);
    }
}
