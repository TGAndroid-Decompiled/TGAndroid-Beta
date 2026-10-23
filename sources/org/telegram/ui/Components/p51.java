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
public abstract class p51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f29425a;
    public final long f29426b;
    public final org.telegram.ui.sn f29427c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Cells.t3 e;
    public final Drawable f29428f;
    public final SpannableString h;
    public final ImageView f29429n;
    public final boolean[] f29430r;
    public int f29431s;
    public int v;
    public int f29432w;
    public boolean f29433x;

    public p51(Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.sn snVar) {
        super(context);
        final int currentAccount = snVar.getCurrentAccount();
        final long a2 = snVar.a();
        this.f29430r = new boolean[1];
        this.f29425a = currentAccount;
        this.f29426b = a2;
        this.f29427c = snVar;
        this.d = g6Var;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 2);
        this.e = t3Var;
        t3Var.b(0.3f, 450L, bs.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        t3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        t3Var.setGravity(1);
        t3Var.setIgnoreRTL(!LocaleController.isRTL);
        t3Var.f29776n = false;
        final org.telegram.ui.sk skVar = (org.telegram.ui.sk) this;
        t3Var.setOnClickListener(new v80(skVar, 23));
        addView(t3Var, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f29428f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f29429n = imageView;
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
                org.telegram.ui.sk skVar2 = org.telegram.ui.sk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.sn snVar2 = skVar2.f41429y;
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + snVar2.a(), 140).commit();
                    snVar2.Xc(true);
                    return;
                }
                int i12 = skVar2.f29425a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = skVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.g6 g6Var2 = skVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, g6Var2);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, g6Var2);
                LinearLayout linearLayout = new LinearLayout(skVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(skVar2.getContext());
                scrollView.f29099b = new f6((View) scrollView, 350L, bs.h);
                LinearLayout linearLayout2 = new LinearLayout(skVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20670c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, true, false);
                e1Var.j(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = skVar2.f29426b;
                e1Var.setSubtext(y41.J(y41.N(translateController.getDialogTranslateTo(j10), null, null)));
                e1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, true, false);
                e1Var2.j(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                e1Var2.setOnClickListener(new v80(actionBarPopupWindow$ActionBarPopupWindowLayout, 24));
                linearLayout.addView(e1Var2);
                linearLayout.addView((View) scrollView, w7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                y41.N(dialogDetectedLanguage, null, null);
                boolean[] zArr = skVar2.f29430r;
                String N = y41.N(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.j1(skVar2.getContext(), g6Var2), w7.z5.n(-1, 8));
                e1Var.setOnClickListener(new ai.ia(new n51(skVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, m1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 12));
                if (UserConfig.getInstance(i12).isPremium() && N != null) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, N);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, N);
                    }
                    e1Var3.setMultiline(false);
                    e1Var3.j(ei.x3.b(formatString, e1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    e1Var3.setOnClickListener(new ci.e0(skVar2, dialogDetectedLanguage, translateController, N, m1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
                }
                org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, skVar2.getContext(), skVar2.d, false, false);
                e1Var4.j(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                e1Var4.setOnClickListener(new t41(skVar2, translateController, m1Var, 1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.j1(skVar2.getContext(), g6Var2), w7.z5.n(-1, 8));
                y90 y90Var = new y90(skVar2.getContext(), null);
                y90Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                y90Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.k6.f21289j5;
                org.telegram.ui.ActionBar.r6.W(y90Var, i14, g6Var2);
                org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var2);
                y90Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new ko0(17, skVar2, m1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new a6(5197252827247841976L, y90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                y90Var.setText(ei.x3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), y90Var.getPaint()));
                int i15 = org.telegram.ui.ActionBar.k6.f21272i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i15, g6Var2), 0, 12);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                y90Var.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(y90Var, Z, null, O, g6Var2);
                y90Var.setOnClickListener(new d51(1, skVar2, m1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y90Var);
                m1Var.e = true;
                m1Var.f21631c = 220;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                m1Var.setInputMethodMode(2);
                m1Var.setSoftInputMode(0);
                ImageView imageView2 = skVar2.f29429n;
                m1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, w7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, g6Var, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        h3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
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
        j61[] j61VarArr = (j61[]) replaceTags.getSpans(0, replaceTags.length(), j61.class);
        for (int i10 = 0; i10 < j61VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(j61VarArr[i10]), replaceTags.getSpanEnd(j61VarArr[i10]), replaceTags.getSpanFlags(j61VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        e.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e.addView(new ci.h4(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new ai.ua(h3VarArr, context, 1)), g6Var), w7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        e.addView(new ci.h4(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), g6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        e.addView(new ci.h4(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new ai.ua(h3VarArr, context, 2)), g6Var), w7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, g6Var);
        e.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        y90 y90Var = new y90(context, null);
        y90Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.f21571y6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        y90Var.setGravity(17);
        y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new ai.ua(h3VarArr, context, 3)));
        y90Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        y90Var.setDisablePaddingsOffsetY(true);
        e.addView(y90Var, w7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        g10.setText(ai.l7.H2(LocaleController.getString(R.string.Understood)));
        g10.setOnClickListener(new k2(h3VarArr, 3));
        e.addView(g10, w7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        h3Var.customView = e;
        h3VarArr[0] = h3Var;
        h3Var.fixNavigationBar();
        h3VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21189de));
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f29425a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f29426b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.t3 t3Var = this.e;
        if (isTranslatingDialog) {
            String N = y41.N(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(N)) {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, N)));
            } else {
                t3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f29430r;
            String N2 = y41.N(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, N2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, N2);
            }
            t3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f29429n.setImageResource(i10);
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.he;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.f21272i6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.f21189de;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        if (this.f29433x && w02 == this.f29431s && w03 == this.v && w04 == this.f29432w) {
            return;
        }
        this.f29433x = true;
        this.f29431s = w02;
        this.v = w03;
        this.f29432w = w04;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.Cells.t3 t3Var = this.e;
        t3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        t3Var.setBackground(org.telegram.ui.ActionBar.k6.X(AndroidUtilities.dp(15.0f), w06, dp, dp, dp, dp));
        org.telegram.ui.Cells.y N = org.telegram.ui.ActionBar.k6.N(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 0, 0);
        ImageView imageView = this.f29429n;
        imageView.setBackground(N);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f29428f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), mode));
    }
}
