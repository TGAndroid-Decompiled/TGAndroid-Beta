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
public abstract class a41 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f26658a;
    public final long f26659b;
    public final org.telegram.ui.tn f26660c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Cells.r3 f26661e;
    public final Drawable f26662f;
    public final SpannableString h;
    public final ImageView f26663n;
    public final boolean[] f26664r;

    public a41(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.tn tnVar) {
        super(context);
        final int currentAccount = tnVar.getCurrentAccount();
        final long a2 = tnVar.a();
        this.f26664r = new boolean[1];
        this.f26658a = currentAccount;
        this.f26659b = a2;
        this.f26660c = tnVar;
        this.d = c6Var;
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, true, true, false, 2);
        this.f26661e = r3Var;
        r3Var.b(0.3f, 450L, jr.h);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        r3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        r3Var.setGravity(1);
        r3Var.setIgnoreRTL(!LocaleController.isRTL);
        r3Var.f31268n = false;
        final org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this;
        r3Var.setOnClickListener(new u70(qkVar, 24));
        addView(r3Var, i7.f6.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f26662f = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f26663n = imageView;
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
                org.telegram.ui.qk qkVar2 = org.telegram.ui.qk.this;
                if (!isPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.tn tnVar2 = qkVar2.f41741s;
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar2).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + tnVar2.a(), 140).commit();
                    tnVar2.Qc(true);
                    return;
                }
                int i12 = qkVar2.f26658a;
                TranslateController translateController = MessagesController.getInstance(i12).getTranslateController();
                Context context2 = qkVar2.getContext();
                int i13 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.c6 c6Var2 = qkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i13, 1, context2, c6Var2);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var2));
                LinearLayout linearLayout = new LinearLayout(qkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(qkVar2.getContext());
                scrollView.f35201b = new d6((View) scrollView, 350L, jr.h);
                LinearLayout linearLayout2 = new LinearLayout(qkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22705c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, qkVar2.getContext(), qkVar2.d, true, false);
                g1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = qkVar2.f26659b;
                g1Var.setSubtext(k31.y(k31.D(translateController.getDialogTranslateTo(j10), null, null)));
                g1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, qkVar2.getContext(), qkVar2.d, true, false);
                g1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                g1Var2.setOnClickListener(new u70(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(g1Var2);
                linearLayout.addView((View) scrollView, i7.f6.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                k31.D(dialogDetectedLanguage, null, null);
                boolean[] zArr = qkVar2.f26664r;
                String D = k31.D(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.l1(qkVar2.getContext(), c6Var2), i7.f6.n(-1, 8));
                g1Var.setOnClickListener(new bg.p2(new y31(qkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, o1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                if (UserConfig.getInstance(i12).isPremium() && D != null) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, qkVar2.getContext(), qkVar2.d, false, false);
                    if (zArr[0]) {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguage, D);
                    } else {
                        formatString = LocaleController.formatString(R.string.DoNotTranslateLanguageOther, D);
                    }
                    g1Var3.setMultiline(false);
                    g1Var3.g(nh.t3.b(formatString, g1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    g1Var3.setOnClickListener(new lh.b0(qkVar2, dialogDetectedLanguage, translateController, D, o1Var, 11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
                }
                org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, qkVar2.getContext(), qkVar2.d, false, false);
                g1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                g1Var4.setOnClickListener(new ya0(qkVar2, translateController, o1Var, 4));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.l1(qkVar2.getContext(), c6Var2), i7.f6.n(-1, 8));
                y80 y80Var = new y80(qkVar2.getContext(), null);
                y80Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                y80Var.setDisablePaddingsOffsetY(true);
                int i14 = org.telegram.ui.ActionBar.g6.f23169j5;
                y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                y80Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                CharSequence concat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new ii0(21, qkVar2, o1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new y5(5197252827247841976L, y80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                y80Var.setText(nh.t3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", concat, spannableStringBuilder2), spannableStringBuilder), y80Var.getPaint()));
                y80Var.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var2), 0, 12));
                y80Var.setOnClickListener(new fi0(8, qkVar2, o1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y80Var);
                o1Var.f23712e = true;
                o1Var.f23711c = 220;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                o1Var.setInputMethodMode(2);
                o1Var.setSoftInputMode(0);
                ImageView imageView2 = qkVar2.f26663n;
                o1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, i7.f6.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        e();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        f3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
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
        frameLayout.addView(linearLayout, i7.f6.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, i7.f6.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, i7.f6.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        t41[] t41VarArr = (t41[]) replaceTags.getSpans(0, replaceTags.length(), t41.class);
        for (int i10 = 0; i10 < t41VarArr.length; i10++) {
            replaceTags.setSpan(new ForegroundColorSpan(-1), replaceTags.getSpanStart(t41VarArr[i10]), replaceTags.getSpanEnd(t41VarArr[i10]), replaceTags.getSpanFlags(t41VarArr[i10]));
        }
        textView.setText(replaceTags);
        linearLayout.addView(textView, i7.f6.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, i7.f6.c(-2.0f, -1));
        g10.addView(new bh.d(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new jh.c8(f3VarArr, context, 1)), c6Var), i7.f6.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new bh.d(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), c6Var), i7.f6.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new bh.d(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new jh.c8(f3VarArr, context, 2)), c6Var), i7.f6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, c6Var));
        g10.addView(view, i7.f6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        y80 y80Var = new y80(context, null);
        y80Var.setTextSize(1, 12.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setGravity(17);
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new jh.c8(f3VarArr, context, 3)));
        y80Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        y80Var.setDisablePaddingsOffsetY(true);
        g10.addView(y80Var, i7.f6.t(-1, -2, 7, 32, 0, 32, 0));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.setText(jh.h5.g2(LocaleController.getString(R.string.Understood)));
        o10.setOnClickListener(new k2(f3VarArr, 3));
        g10.addView(o10, i7.f6.t(-1, 48, 7, 16, 0, 16, 16));
        f3Var.customView = g10;
        f3VarArr[0] = f3Var;
        f3Var.fixNavigationBar();
        f3VarArr[0].show();
    }

    public final void b() {
        String formatString;
        int i10;
        int i11 = this.f26658a;
        TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f26659b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean isTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.r3 r3Var = this.f26661e;
        if (isTranslatingDialog) {
            String D = k31.D(translateController.getDialogDetectedLanguage(j10), null, null);
            if (!TextUtils.isEmpty(D)) {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, D)));
            } else {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f26664r;
            String D2 = k31.D(dialogTranslateTo, zArr, null);
            if (zArr[0]) {
                formatString = LocaleController.formatString(R.string.TranslateToButton, D2);
            } else {
                formatString = LocaleController.formatString(R.string.TranslateToButtonOther, D2);
            }
            r3Var.setText(TextUtils.concat(spannableString, " ", formatString));
        }
        if (!UserConfig.getInstance(i11).isPremium() && (chat == null || !chat.autotranslation)) {
            i10 = R.drawable.msg_close;
        } else {
            i10 = R.drawable.msg_mini_customize;
        }
        this.f26663n.setImageResource(i10);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.f23141he;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        org.telegram.ui.Cells.r3 r3Var = this.f26661e;
        r3Var.setTextColor(v02);
        int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var) & 436207615;
        int dp = AndroidUtilities.dp(3.0f);
        r3Var.setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(15.0f), v03, dp, dp, dp, dp));
        org.telegram.ui.Cells.z M = org.telegram.ui.ActionBar.g6.M(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 0, 0);
        ImageView imageView = this.f26663n;
        imageView.setBackground(M);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23069de, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        this.f26662f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f9) {
        this.f26661e.setTranslationX(f9 / 2.0f);
    }
}
