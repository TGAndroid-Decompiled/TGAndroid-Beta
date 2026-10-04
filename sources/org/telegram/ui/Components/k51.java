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
public abstract class k51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final int f27956a;
    public final long f27957b;
    public final org.telegram.ui.yn f27958c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Cells.u3 f27959e;
    public final Drawable f27960f;
    public final SpannableString h;
    public final ImageView f27961n;
    public final boolean[] f27962r;

    public k51(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.yn ynVar) {
        super(context);
        final int currentAccount = ynVar.getCurrentAccount();
        final long a2 = ynVar.a();
        this.f27962r = new boolean[1];
        this.f27956a = currentAccount;
        this.f27957b = a2;
        this.f27958c = ynVar;
        this.d = d6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.f27959e = u3Var;
        u3Var.b(0.3f, 450L, tr.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f29519n = false;
        final org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this;
        u3Var.setOnClickListener(new l80(wkVar, 24));
        addView(u3Var, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f27960f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f27961n = imageView;
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
                    org.telegram.ui.yn ynVar2 = wkVar2.f42507s;
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + ynVar2.a(), 140).commit();
                    ynVar2.Pc(true);
                    return;
                }
                int i12 = wkVar2.f27956a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = wkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.d6 d6Var2 = wkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, d6Var2);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var2));
                LinearLayout linearLayout = new LinearLayout(wkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(wkVar2.getContext());
                scrollView.f27602b = new e6((View) scrollView, 350L, tr.h);
                LinearLayout linearLayout2 = new LinearLayout(wkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20358c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, wkVar2.getContext(), wkVar2.d, true, false);
                f1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j3 = wkVar2.f27957b;
                f1Var.setSubtext(t41.y(t41.C(translateController.getDialogTranslateTo(j3), null, null)));
                f1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, wkVar2.getContext(), wkVar2.d, true, false);
                f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var2.setOnClickListener(new l80(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(f1Var2);
                linearLayout.addView((View) scrollView, w7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j3);
                t41.C(dialogDetectedLanguage, null, null);
                boolean[] zArr = wkVar2.f27962r;
                String C = t41.C(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.k1(wkVar2.getContext(), d6Var2), w7.z5.n(-1, 8));
                f1Var.setOnClickListener(new org.telegram.ui.Cells.ua(new i51(wkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, n1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 10));
                if (UserConfig.getInstance(i12).isPremium() && C != null) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, wkVar2.getContext(), wkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, C);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, C);
                    }
                    f1Var3.setMultiline(false);
                    f1Var3.g(ci.e4.b(formatString, f1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    f1Var3.setOnClickListener(new ai.s0(wkVar2, dialogDetectedLanguage, translateController, C, n1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
                }
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, wkVar2.getContext(), wkVar2.d, false, false);
                f1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                f1Var4.setOnClickListener(new ai.d0(wkVar2, translateController, n1Var, 28));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(wkVar2.getContext(), d6Var2), w7.z5.n(-1, 8));
                q90 q90Var = new q90(wkVar2.getContext(), null);
                q90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                q90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.i6.f20925j5;
                q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var2));
                q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var2));
                q90Var.setEmojiColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new uo0(16, wkVar2, n1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new z5(5197252827247841976L, q90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                q90Var.setText(ci.e4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), q90Var.getPaint()));
                q90Var.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var2), 0, 12));
                q90Var.setOnClickListener(new gt(20, wkVar2, n1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q90Var);
                n1Var.f21408e = true;
                n1Var.f21407c = 220;
                n1Var.setOutsideTouchable(true);
                n1Var.setClippingEnabled(true);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(true);
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                ImageView imageView2 = wkVar2.f27961n;
                n1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        f3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
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
        d61[] d61VarArr = (d61[]) replaceTags.getSpans(0, replaceTags.length(), d61.class);
        for (int i10 = 0; i10 < d61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(d61VarArr[i10]), replaceTags.getSpanEnd(d61VarArr[i10]), replaceTags.getSpanFlags(d61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f7.addView(frameLayout, w7.z5.c(-2.0f, -1));
        f7.addView(new ai.w5(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new f51(f3VarArr, context, 0)), d6Var), w7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        f7.addView(new ai.w5(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), d6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        f7.addView(new ai.w5(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new f51(f3VarArr, context, 1)), d6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d7, d6Var));
        f7.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        q90 q90Var = new q90(context, null);
        q90Var.setTextSize(1, 12.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21204y6, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        q90Var.setGravity(17);
        q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new f51(f3VarArr, context, 2)));
        q90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        q90Var.setDisablePaddingsOffsetY(true);
        f7.addView(q90Var, w7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        g10.setText(yh.x3.g2(LocaleController.getString(R.string.Understood)));
        g10.setOnClickListener(new k2(f3VarArr, 3));
        f7.addView(g10, w7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        f3Var.customView = f7;
        f3VarArr[0] = f3Var;
        f3Var.fixNavigationBar();
        f3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f27956a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f27957b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.f27959e;
        if (isTranslatingDialog) {
            String C = t41.C(translateController.getDialogDetectedLanguage(j3), null, null);
            if (!TextUtils.isEmpty(C)) {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, C)));
            } else {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f27962r;
            String C2 = t41.C(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, C2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, C2);
            }
            u3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f27961n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f20897he;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        org.telegram.ui.Cells.u3 u3Var = this.f27959e;
        u3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.i6.M(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var), 0, 0);
        ImageView imageView = this.f27961n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20825de, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f27960f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.f27959e.setTranslationX(f7 / 2.0f);
    }
}
