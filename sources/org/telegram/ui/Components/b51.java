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
public abstract class b51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f22901a;
    public final long f22902b;
    public final org.telegram.ui.xn f22903c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Cells.u3 e;
    public final Drawable f22904f;
    public final SpannableString h;
    public final ImageView f22905n;
    public final boolean[] f22906r;

    public b51(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.xn xnVar) {
        super(context);
        final int currentAccount = xnVar.getCurrentAccount();
        final long a2 = xnVar.a();
        this.f22906r = new boolean[1];
        this.f22901a = currentAccount;
        this.f22902b = a2;
        this.f22903c = xnVar;
        this.d = e6Var;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 2);
        this.e = u3Var;
        u3Var.b(0.3f, 450L, sr.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        u3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        u3Var.setGravity(1);
        u3Var.setIgnoreRTL(!LocaleController.isRTL);
        u3Var.f27291n = false;
        final org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this;
        u3Var.setOnClickListener(new k80(ykVar, 24));
        addView(u3Var, w7.y5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f22904f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f22905n = imageView;
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
                org.telegram.ui.yk ykVar2 = org.telegram.ui.yk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.xn xnVar2 = ykVar2.f40270s;
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar2.a(), 140).commit();
                    xnVar2.Qc(true);
                    return;
                }
                int i12 = ykVar2.f22901a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = ykVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.e6 e6Var2 = ykVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, e6Var2);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var2));
                LinearLayout linearLayout = new LinearLayout(ykVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(ykVar2.getContext());
                scrollView.f22556b = new e6((View) scrollView, 350L, sr.h);
                LinearLayout linearLayout2 = new LinearLayout(ykVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f18647c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, ykVar2.getContext(), ykVar2.d, true, false);
                g1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j3 = ykVar2.f22902b;
                g1Var.setSubtext(k41.y(k41.E(translateController.getDialogTranslateTo(j3), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, ykVar2.getContext(), ykVar2.d, true, false);
                g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new k80(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, w7.y5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j3);
                k41.E(dialogDetectedLanguage, null, null);
                boolean[] zArr = ykVar2.f22906r;
                String E = k41.E(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.l1(ykVar2.getContext(), e6Var2), w7.y5.n(-1, 8));
                g1Var.setOnClickListener(new org.telegram.ui.Cells.ua(new z41(ykVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, o1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 10));
                if (UserConfig.getInstance(i12).isPremium() && E != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, ykVar2.getContext(), ykVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, E);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, E);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.g(ci.e4.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new ai.s0(ykVar2, dialogDetectedLanguage, translateController, E, o1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, ykVar2.getContext(), ykVar2.d, false, false);
                g1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new ai.d0(ykVar2, translateController, o1Var, 28));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(ykVar2.getContext(), e6Var2), w7.y5.n(-1, 8));
                p90 p90Var = new p90(ykVar2.getContext(), null);
                p90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                p90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.i6.f19164j5;
                p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var2));
                p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var2));
                p90Var.setEmojiColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new dp0(14, ykVar2, o1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new z5(5197252827247841976L, p90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                p90Var.setText(ci.e4.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), p90Var.getPaint()));
                p90Var.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var2), 0, 12));
                p90Var.setOnClickListener(new ft(20, ykVar2, o1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p90Var);
                o1Var.e = true;
                o1Var.f19685c = 220;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                o1Var.setInputMethodMode(2);
                o1Var.setSoftInputMode(0);
                ImageView imageView2 = ykVar2.f22905n;
                o1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.y5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, context, e6Var, false);
        g3Var.fixNavigationBar();
        g3Var.applyBottomPadding = false;
        g3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
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
        frameLayout.addView(linearLayout, w7.y5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.y5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.y5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        u51[] u51VarArr = (u51[]) replaceTags.getSpans(0, replaceTags.length(), u51.class);
        for (int i10 = 0; i10 < u51VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(u51VarArr[i10]), replaceTags.getSpanEnd(u51VarArr[i10]), replaceTags.getSpanFlags(u51VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.y5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f7.addView(frameLayout, w7.y5.c(-2.0f, -1));
        f7.addView(new ai.w5(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new w41(g3VarArr, context, 0)), e6Var), w7.y5.t(-1, -2, 49, 32, 16, 32, 16));
        f7.addView(new ai.w5(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), e6Var), w7.y5.t(-1, -2, 49, 32, 0, 32, 16));
        f7.addView(new ai.w5(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new w41(g3VarArr, context, 1)), e6Var), w7.y5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, e6Var));
        f7.addView(view, w7.y5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        p90 p90Var = new p90(context, null);
        p90Var.setTextSize(1, 12.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19442y6, e6Var));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        p90Var.setGravity(17);
        p90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new w41(g3VarArr, context, 2)));
        p90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        p90Var.setDisablePaddingsOffsetY(true);
        f7.addView(p90Var, w7.y5.t(-1, -2, 7, 32, 0, 32, 0));
        ci.d g10 = org.telegram.messenger.qk.g(24, context, e6Var, true);
        g10.setText(yh.x3.g2(LocaleController.getString(R.string.Understood)));
        g10.setOnClickListener(new k2(g3VarArr, 3));
        f7.addView(g10, w7.y5.t(-1, 48, 7, 16, 0, 16, 16));
        g3Var.customView = f7;
        g3VarArr[0] = g3Var;
        g3Var.fixNavigationBar();
        g3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f22901a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f22902b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.u3 u3Var = this.e;
        if (isTranslatingDialog) {
            String E = k41.E(translateController.getDialogDetectedLanguage(j3), null, null);
            if (!TextUtils.isEmpty(E)) {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, E)));
            } else {
                u3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j3);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f22906r;
            String E2 = k41.E(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, E2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, E2);
            }
            u3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f22905n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f19136he;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        org.telegram.ui.Cells.u3 u3Var = this.e;
        u3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        u3Var.setBackground(org.telegram.ui.ActionBar.i6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.i6.M(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var), 0, 0);
        ImageView imageView = this.f22905n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19065de, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f22904f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }
}
