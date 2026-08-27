package org.telegram.ui.Components;

import android.content.Context;
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

public abstract class r31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final int f32071a;

    public final long f32072b;

    public final org.telegram.ui.rn f32073c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final org.telegram.ui.Cells.r3 f32074e;

    public final Drawable f32075f;
    public final SpannableString h;

    public final ImageView f32076n;

    public final boolean[] f32077r;

    public r31(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.rn rnVar) {
        super(context);
        final int currentAccount = rnVar.getCurrentAccount();
        final long jA = rnVar.a();
        boolean z10 = true;
        this.f32077r = new boolean[1];
        this.f32071a = currentAccount;
        this.f32072b = jA;
        this.f32073c = rnVar;
        this.d = c6Var;
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, z10, z10, false, 2);
        this.f32074e = r3Var;
        r3Var.b(0.3f, 450L, er.h);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        r3Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        r3Var.setGravity(1);
        r3Var.setIgnoreRTL(!LocaleController.isRTL);
        r3Var.f29635n = false;
        final org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this;
        r3Var.setOnClickListener(new l70(pkVar, 24));
        addView(r3Var, h7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f32075f = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(drawableMutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f32076n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i10 = currentAccount;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-jA));
                boolean zIsPremium = UserConfig.getInstance(i10).isPremium();
                org.telegram.ui.pk pkVar2 = pkVar;
                if (!zIsPremium && (chat == null || !chat.autotranslation)) {
                    org.telegram.ui.rn rnVar2 = pkVar2.f41373s;
                    MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) rnVar2).currentAccount).edit().putInt("dialog_show_translate_count" + rnVar2.a(), 140).commit();
                    rnVar2.Qc(true);
                    return;
                }
                int i11 = pkVar2.f32071a;
                TranslateController translateController = MessagesController.getInstance(i11).getTranslateController();
                Context context2 = pkVar2.getContext();
                int i12 = R.drawable.popup_fixed_alert4;
                org.telegram.ui.ActionBar.c6 c6Var2 = pkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i12, 1, context2, c6Var2);
                org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var2));
                LinearLayout linearLayout = new LinearLayout(pkVar2.getContext());
                linearLayout.setOrientation(1);
                q31 q31Var = new q31(pkVar2.getContext());
                q31Var.f31777b = new y5(q31Var, 350L, er.h);
                LinearLayout linearLayout2 = new LinearLayout(pkVar2.getContext());
                q31Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = true;
                int iB = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, true, false);
                f1Var.g(LocaleController.getString(R.string.TranslateTo), R.drawable.msg_translate, null);
                long j10 = pkVar2.f32072b;
                f1Var.setSubtext(b31.z(b31.E(translateController.getDialogTranslateTo(j10), null, null)));
                f1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, true, false);
                f1Var2.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var2.setOnClickListener(new l70(actionBarPopupWindow$ActionBarPopupWindowLayout, 25));
                linearLayout.addView(f1Var2);
                linearLayout.addView(q31Var, h7.z5.n(-1, 420));
                String dialogDetectedLanguage = translateController.getDialogDetectedLanguage(j10);
                b31.E(dialogDetectedLanguage, null, null);
                boolean[] zArr = pkVar2.f32077r;
                String strE = b31.E(dialogDetectedLanguage, zArr, null);
                String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
                ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(dialogTranslateTo);
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                linearLayout2.addView(new org.telegram.ui.ActionBar.k1(pkVar2.getContext(), c6Var2), h7.z5.n(-1, 8));
                f1Var.setOnClickListener(new gh.v2(new p31(pkVar2, new boolean[1], dialogTranslateTo, linearLayout2, suggestedLanguages, dialogDetectedLanguage, translateController, n1Var, languages), actionBarPopupWindow$ActionBarPopupWindowLayout, iB, 13));
                if (UserConfig.getInstance(i11).isPremium() && strE != null) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, false, false);
                    String string = zArr[0] ? LocaleController.formatString(R.string.DoNotTranslateLanguage, strE) : LocaleController.formatString(R.string.DoNotTranslateLanguageOther, strE);
                    f1Var3.setMultiline(false);
                    f1Var3.g(lh.w3.b(string, f1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    f1Var3.setOnClickListener(new jh.b0(pkVar2, dialogDetectedLanguage, translateController, strE, n1Var, 11));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
                }
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, pkVar2.getContext(), pkVar2.d, false, false);
                f1Var4.g(LocaleController.getString(R.string.Hide), R.drawable.msg_cancel, null);
                f1Var4.setOnClickListener(new ld0(pkVar2, translateController, n1Var, 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.k1(pkVar2.getContext(), c6Var2), h7.z5.n(-1, 8));
                p80 p80Var = new p80(pkVar2.getContext(), null);
                p80Var.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.33f));
                p80Var.setDisablePaddingsOffsetY(true);
                int i13 = org.telegram.ui.ActionBar.g6.f23161j5;
                p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
                p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var2));
                p80Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
                CharSequence charSequenceConcat = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonPoweredBy)), " ", AndroidUtilities.premiumText(LocaleController.getString(R.string.CocoonPoweredByLink), new lg0(24, pkVar2, n1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new t5(5197252827247841976L, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                p80Var.setText(lh.w3.b(AndroidUtilities.replaceCharSequence("🥚", AndroidUtilities.replaceCharSequence("🥚 ", charSequenceConcat, spannableStringBuilder2), spannableStringBuilder), p80Var.getPaint()));
                p80Var.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var2), 0, 12));
                p80Var.setOnClickListener(new xh0(8, pkVar2, n1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p80Var);
                n1Var.f23684e = true;
                n1Var.f23683c = 220;
                n1Var.setOutsideTouchable(true);
                n1Var.setClippingEnabled(true);
                n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var.setFocusable(true);
                n1Var.setInputMethodMode(2);
                n1Var.setSoftInputMode(0);
                ImageView imageView2 = pkVar2.f32076n;
                n1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
            }
        });
        addView(imageView, h7.z5.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        d();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        e3Var.applyTopPadding = false;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(AndroidUtilities.dp(150.0f));
        float fDp = AndroidUtilities.dp(12.0f);
        gradientDrawable.setCornerRadii(new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, h7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, h7.z5.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, h7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.CocoonSubtitle));
        k41[] k41VarArr = (k41[]) spannableStringBuilderReplaceTags.getSpans(0, spannableStringBuilderReplaceTags.length(), k41.class);
        for (int i10 = 0; i10 < k41VarArr.length; i10++) {
            spannableStringBuilderReplaceTags.setSpan(new ForegroundColorSpan(-1), spannableStringBuilderReplaceTags.getSpanStart(k41VarArr[i10]), spannableStringBuilderReplaceTags.getSpanEnd(k41VarArr[i10]), spannableStringBuilderReplaceTags.getSpanFlags(k41VarArr[i10]));
        }
        textView.setText(spannableStringBuilderReplaceTags);
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        linearLayoutG.addView(frameLayout, h7.z5.c(-2.0f, -1));
        linearLayoutG.addView(new ag.d(context, R.drawable.menu_privacy, LocaleController.getString(R.string.CocoonFeature1Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature1Text), new hh.e8(e3VarArr, context, 1)), c6Var), h7.z5.t(-1, -2, 49, 32, 16, 32, 16));
        linearLayoutG.addView(new ag.d(context, R.drawable.msg_stats, LocaleController.getString(R.string.CocoonFeature2Title), LocaleController.getString(R.string.CocoonFeature2Text), c6Var), h7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        linearLayoutG.addView(new ag.d(context, R.drawable.menu_gift, LocaleController.getString(R.string.CocoonFeature3Title), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFeature3Text), new hh.e8(e3VarArr, context, 2)), c6Var), h7.z5.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        linearLayoutG.addView(view, h7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
        p80 p80Var = new p80(context, null);
        p80Var.setTextSize(1, 12.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setGravity(17);
        p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CocoonFooter), new hh.e8(e3VarArr, context, 3)));
        p80Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        p80Var.setDisablePaddingsOffsetY(true);
        linearLayoutG.addView(p80Var, h7.z5.t(-1, -2, 7, 32, 0, 32, 0));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        dVarG.setText(hh.i5.g2(LocaleController.getString(R.string.Understood)));
        dVarG.setOnClickListener(new h2(e3VarArr, 3));
        linearLayoutG.addView(dVarG, h7.z5.t(-1, 48, 7, 16, 0, 16, 16));
        e3Var.customView = linearLayoutG;
        e3VarArr[0] = e3Var;
        e3Var.fixNavigationBar();
        e3VarArr[0].show();
    }

    public final void b() {
        int i10 = this.f32071a;
        TranslateController translateController = MessagesController.getInstance(i10).getTranslateController();
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f32072b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        boolean zIsTranslatingDialog = translateController.isTranslatingDialog(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.r3 r3Var = this.f32074e;
        if (zIsTranslatingDialog) {
            String strE = b31.E(translateController.getDialogDetectedLanguage(j10), null, null);
            if (TextUtils.isEmpty(strE)) {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.ShowOriginalButton)));
            } else {
                r3Var.setText(TextUtils.concat(spannableString, " ", LocaleController.formatString(R.string.ShowOriginalButtonLanguage, strE)));
            }
        } else {
            String dialogTranslateTo = translateController.getDialogTranslateTo(j10);
            if (dialogTranslateTo == null) {
                dialogTranslateTo = "en";
            }
            boolean[] zArr = this.f32077r;
            String strE2 = b31.E(dialogTranslateTo, zArr, null);
            r3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? LocaleController.formatString(R.string.TranslateToButton, strE2) : LocaleController.formatString(R.string.TranslateToButtonOther, strE2)));
        }
        this.f32076n.setImageResource((UserConfig.getInstance(i10).isPremium() || (chat != null && chat.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.f23133he;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        org.telegram.ui.Cells.r3 r3Var = this.f32074e;
        r3Var.setTextColor(iV0);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var) & 436207615;
        float fDp = AndroidUtilities.dp(15.0f);
        int iDp = AndroidUtilities.dp(3.0f);
        r3Var.setBackground(org.telegram.ui.ActionBar.g6.W(fDp, iV1, iDp, iDp, iDp, iDp));
        org.telegram.ui.Cells.z zVarM = org.telegram.ui.ActionBar.g6.M(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 0, 0);
        ImageView imageView = this.f32076n;
        imageView.setBackground(zVarM);
        int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23061de, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iV2, mode));
        this.f32075f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), mode));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setLeftMargin(float f10) {
        this.f32074e.setTranslationX(f10 / 2.0f);
    }
}
