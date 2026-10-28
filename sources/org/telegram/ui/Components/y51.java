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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class y51 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int f34966a;
    public final long f34967b;
    public final org.telegram.ui.wn f34968c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final org.telegram.ui.Cells.y3 e;
    public final Drawable f34969f;
    public final SpannableString h;
    public final ImageView f34970n;
    public final boolean[] f34971r;
    public int f34972s;
    public int v;
    public int f34973w;
    public boolean f34974x;

    public y51(Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.wn wnVar) {
        super(context);
        final int currentAccount = wnVar.getCurrentAccount();
        final long a2 = wnVar.a();
        this.f34971r = new boolean[1];
        this.f34966a = currentAccount;
        this.f34967b = a2;
        this.f34968c = wnVar;
        this.d = u6Var;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, false, 2);
        this.e = y3Var;
        y3Var.b(0.3f, 450L, ds.h);
        y3Var.setTextSize(AndroidUtilities.dp(14.0f));
        y3Var.setTypeface(AndroidUtilities.bold());
        y3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        y3Var.setGravity(1);
        y3Var.setIgnoreRTL(!LocaleController.isRTL);
        y3Var.f32492n = false;
        final org.telegram.ui.vk vkVar = (org.telegram.ui.vk) this;
        y3Var.setOnClickListener(new x80(vkVar, 22));
        addView(y3Var, kb1.h(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f34969f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f34970n = imageView;
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
                org.telegram.ui.vk vkVar2 = org.telegram.ui.vk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.wn wnVar2 = vkVar2.f44367y;
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + wnVar2.a(), 140).commit();
                    wnVar2.hd(true);
                    return;
                }
                int i12 = vkVar2.f34966a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = vkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.u6 u6Var2 = vkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, u6Var2);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, u6Var2);
                LinearLayout linearLayout = new LinearLayout(vkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(vkVar2.getContext());
                scrollView.f34680b = new h6((View) scrollView, 350L, ds.h);
                LinearLayout linearLayout2 = new LinearLayout(vkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22361c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, vkVar2.getContext(), vkVar2.d, true, false);
                g1Var.j(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = vkVar2.f34967b;
                g1Var.setSubtext(g51.J(g51.N(translateController.getDialogTranslateTo(j10), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, vkVar2.getContext(), vkVar2.d, true, false);
                g1Var2.j(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new x80(actionBarPopupWindow$ActionBarPopupWindowLayout, 23));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, kb1.r(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                g51.N(dialogDetectedLanguage, null, null);
                boolean[] zArr = vkVar2.f34971r;
                String N = g51.N(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.l1(vkVar2.getContext(), u6Var2), kb1.r(-1, 8));
                g1Var.setOnClickListener(new bi.pa(new w51(vkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, o1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (UserConfig.getInstance(i12).isPremium() && N != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, vkVar2.getContext(), vkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, N);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, N);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.j(fi.v3.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new di.e0(vkVar2, dialogDetectedLanguage, translateController, N, o1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, vkVar2.getContext(), vkVar2.d, false, false);
                g1Var4.j(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new b51(vkVar2, translateController, o1Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(vkVar2.getContext(), u6Var2), kb1.r(-1, 8));
                aa0 aa0Var = new aa0(vkVar2.getContext(), null);
                aa0Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                aa0Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.y6.f23465j5;
                org.telegram.ui.ActionBar.f7.V(aa0Var, i14, u6Var2);
                org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var2);
                aa0Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i14, u6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new u90(28, vkVar2, o1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new c6(5197252827247841976L, aa0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                aa0Var.setText(fi.v3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), aa0Var.getPaint()));
                int i15 = org.telegram.ui.ActionBar.y6.f23449i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i15, u6Var2), 0, 12);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
                aa0Var.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(aa0Var, Z, null, N2, u6Var2);
                aa0Var.setOnClickListener(new l51(1, vkVar2, o1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(aa0Var);
                o1Var.e = true;
                o1Var.f22910c = 220;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                o1Var.setInputMethodMode(2);
                o1Var.setSoftInputMode(0);
                ImageView imageView2 = vkVar2.f34970n;
                o1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, kb1.h(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var, false);
        k3Var.fixNavigationBar();
        k3Var.applyBottomPadding = false;
        k3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
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
        frameLayout.addView(linearLayout, kb1.i(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, kb1.x(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, kb1.x(-2, -2, 49, 32, 12, 32, 0));
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
        linearLayout.addView(textView, kb1.h(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        d.addView(frameLayout, kb1.g(-2.0f, -1));
        d.addView(new di.i4(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new bi.ta(k3VarArr, context, 1)), u6Var), kb1.x(-1, -2, 49, 32, 16, 32, 16));
        d.addView(new di.i4(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), u6Var), kb1.x(-1, -2, 49, 32, 0, 32, 16));
        d.addView(new di.i4(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new bi.ta(k3VarArr, context, 2)), u6Var), kb1.x(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, u6Var);
        d.addView(view, kb1.w(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        aa0 aa0Var = new aa0(context, null);
        aa0Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23749y6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setGravity(17);
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new bi.ta(k3VarArr, context, 3)));
        aa0Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        aa0Var.setDisablePaddingsOffsetY(true);
        d.addView(aa0Var, kb1.x(-1, -2, 7, 32, 0, 32, 0));
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        f7.setText(bi.h7.H2(LocaleController.getString(R.string.Understood)));
        f7.setOnClickListener(new n2(k3VarArr, 3));
        d.addView(f7, kb1.x(-1, 48, 7, 16, 0, 16, 16));
        k3Var.customView = d;
        k3VarArr[0] = k3Var;
        k3Var.fixNavigationBar();
        k3VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23437he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23365de));
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f34966a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f34967b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.y3 y3Var = this.e;
        if (isTranslatingDialog) {
            String N = g51.N(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(N)) {
                y3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, N)));
            } else {
                y3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f34971r;
            String N2 = g51.N(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, N2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, N2);
            }
            y3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f34970n.setImageResource(i10);
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.f23437he;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.f23365de;
        int w04 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        if (this.f34974x && w02 == this.f34972s && w03 == this.v && w04 == this.f34973w) {
            return;
        }
        this.f34974x = true;
        this.f34972s = w02;
        this.v = w03;
        this.f34973w = w04;
        int w05 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.Cells.y3 y3Var = this.e;
        y3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        y3Var.setBackground(org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(15.0f), w06, dp, dp, dp, dp));
        org.telegram.ui.Cells.y N = org.telegram.ui.ActionBar.y6.N(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 0, 0);
        ImageView imageView = this.f34970n;
        imageView.setBackground(N);
        int w07 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f34969f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), mode));
    }
}
