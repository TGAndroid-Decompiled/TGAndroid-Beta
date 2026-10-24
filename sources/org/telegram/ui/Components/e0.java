package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
public final class e0 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Cells.h3 A0;
    public ei.x3 B0;
    public final LinearLayout C0;
    public final ei.d D0;
    public final ei.d E0;
    public final ei.d F0;
    public final FrameLayout G0;
    public boolean H0;
    public String I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public String M0;
    public xj0 N0;
    public a71 O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public final TLRPC.TL_messages_composeMessageWithAI[] S0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] T0;
    public int U0;
    public CharSequence X;
    public TL_iv.RichMessage Y;
    public boolean Z;
    public CharSequence f25876a0;
    public TL_iv.RichMessage f25877b0;
    public boolean f25878c0;
    public CharSequence f25879d0;
    public TL_iv.RichMessage f25880e0;
    public boolean f25881f0;
    public CharSequence f25882g0;
    public TL_iv.RichMessage f25883h0;
    public CharSequence f25884i0;
    public Utilities.Callback f25885j0;
    public Utilities.Callback f25886k0;
    public long f25887l0;
    public boolean m0;
    public Utilities.Callback4 f25888n0;
    public ae f25889o0;
    public final boolean[] f25890p0;
    public final boolean[] f25891q0;
    public String f25892r0;
    public String f25893s0;
    public boolean f25894t0;
    public final AiTonesController f25895u0;
    public final FrameLayout f25896v0;
    public final d0 f25897w0;
    public final d0 f25898x0;
    public final ImageView f25899y0;
    public final FrameLayout f25900z0;

    public e0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, 2, g6Var);
        this.f25890p0 = new boolean[1];
        this.f25891q0 = new boolean[1];
        this.P0 = true;
        this.Q0 = -1;
        this.S0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.T0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.f25895u0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.f25899y0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
        this.e.addView(imageView, w7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25896v0 = frameLayout;
        d0 d0Var = new d0(this.currentAccount, context, g6Var, false);
        this.f25897w0 = d0Var;
        d0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        d0Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(d0Var, c02, O, null, g6Var);
        d0Var.setRoundRadius(28);
        d0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        d0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        d0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        d0Var.c(1);
        frameLayout.addView(d0Var, w7.z5.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25900z0 = frameLayout2;
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.A0 = h3Var;
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i11);
        h3Var.setBackground(c03);
        org.telegram.ui.ActionBar.r6.k(h3Var, c03, O2, null, g6Var);
        f3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(h3Var, w7.z5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        f3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        d0 d0Var2 = new d0(this.currentAccount, context, g6Var, true);
        this.f25898x0 = d0Var2;
        d0Var2.setDivider(true);
        d0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d0Var2.setRoundRadius(12);
        d0Var2.f25505n = new ei.e5(this, g6Var, context, 1);
        s0();
        d0Var2.c(-1);
        String L = x41.L();
        this.f25893s0 = L;
        if (L == null) {
            this.f25893s0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.k6.f21126a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.C0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.setRoundRadius(24);
        this.E0 = dVar;
        linearLayout.addView(dVar, w7.z5.o(-1, 48, 1.0f, 119));
        ei.d g10 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.F0 = g10;
        g10.setOnClickListener(new b(this, 9));
        g10.setOnLongClickListener(new i(this, g6Var, context, 0));
        linearLayout.addView(g10, w7.z5.t(48, 48, 5, 10, 0, 0, 0));
        ei.d g11 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.D0 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new ig.u1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new org.telegram.ui.ActionBar.s1(18, this, g6Var));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(linearLayout, e);
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.G0 = frameLayout3;
        FrameLayout.LayoutParams d10 = w7.z5.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = d10.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d10.leftMargin = i17 + i18;
        d10.rightMargin += i18;
        this.containerView.addView(frameLayout3, d10);
        p0(false);
        lm0 lm0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new j(this, 0));
        this.O = true;
        m mVar = new m(this);
        mVar.f46376m = false;
        mVar.C = false;
        mVar.o(zr.h);
        mVar.n(350L);
        this.d.setItemAnimator(mVar);
        this.d.setOnScrollListener(new ah.d0(this, 18));
        this.O0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(e0 e0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.c2 c2Var) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(e0Var.currentAccount).sendRequestTyped(deletetone, new Object(), new ai.s0(e0Var, h, tL_aiComposeTone, 3));
    }

    public static void Q(e0 e0Var) {
        ei.x3 x3Var = e0Var.B0;
        if (x3Var != null) {
            x3Var.e(true);
            e0Var.B0 = null;
        }
        ei.x3 x3Var2 = new ei.x3(e0Var.getContext(), 1);
        e0Var.B0 = x3Var2;
        x3Var2.r();
        e0Var.B0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        e0Var.B0.q(20.0f);
        ei.x3 x3Var3 = e0Var.B0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.25f, -16777216);
        Paint paint = x3Var3.F;
        x3Var3.f10094i0 = dp;
        x3Var3.f10095j0 = dp2;
        x3Var3.f10096k0 = o12;
        paint.setShadowLayer(dp, 0.0f, dp2, o12);
        e0Var.B0.s(LocaleController.getString(R.string.AIEditorChooseStyle));
        e0Var.B0.l(0.5f, 0.0f);
        ei.x3 x3Var4 = e0Var.B0;
        x3Var4.d = 8000L;
        e0Var.containerView.addView(x3Var4, w7.z5.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e0Var.B0.u();
        e0Var.r0();
    }

    public static void R(e0 e0Var, View view) {
        e0Var.f25894t0 = !e0Var.f25894t0;
        e0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof vp) {
                ((vp) linearLayout.getChildAt(0)).a(e0Var.f25894t0, true);
            }
        }
    }

    public static void S(e0 e0Var, int i10) {
        d0 d0Var = e0Var.f25897w0;
        if (d0Var.getSelectedTab() == i10) {
            return;
        }
        ei.x3 x3Var = e0Var.B0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        d0Var.c(i10);
        e0Var.k0();
        e0Var.O0.N(true);
    }

    public static void T(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        e0Var.f25895u0.tones.add(0, aiComposeTone);
        e0Var.s0();
        new vc(e0Var.G0, e0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i10;
        d0 d0Var = e0Var.f25898x0;
        ei.x3 x3Var = e0Var.B0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (aiComposeTone instanceof z) {
            d0Var.d(aiComposeTone);
            e0Var.O0.N(true);
            AndroidUtilities.runOnUIThread(new c(e0Var, 2), 150L);
        } else if (aiComposeTone == null) {
            int savedTonesCount = e0Var.f25895u0.getSavedTonesCount() + 1;
            if (UserConfig.getInstance(e0Var.currentAccount).isPremium()) {
                i10 = MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get();
            } else {
                i10 = MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get();
            }
            if (savedTonesCount > i10) {
                o0(e0Var.currentAccount, new vc(e0Var.G0, e0Var.resourcesProvider));
                return;
            }
            y yVar = new y(e0Var.getContext(), e0Var.resourcesProvider);
            yVar.f32758k0 = new e(e0Var, 1);
            yVar.show();
        } else if (d0Var.getSelectedTone() == aiComposeTone) {
        } else {
            d0Var.d(aiComposeTone);
            e0Var.k0();
            e0Var.O0.N(true);
        }
    }

    public static void V(e0 e0Var, org.telegram.ui.ActionBar.n5 n5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.G0;
        e0Var.Q0 = -1;
        e0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new vc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.K0 = true;
            e0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.b1.s(frameLayout, e0Var.resourcesProvider, tL_error, false);
            n5Var.i(null);
            e0Var.J0 = true;
            e0Var.K0 = false;
            e0Var.p0(true);
        } else if (tL_composedRichMessageWithAI == null) {
            n5Var.i(null);
            e0Var.J0 = true;
            e0Var.K0 = false;
            e0Var.p0(true);
        } else {
            n5Var.i(null);
            e0Var.K0 = false;
            e0Var.p0(true);
            e0Var.T0[i10] = tL_messages_composeRichMessageWithAI;
            if (i10 == 0) {
                e0Var.Z = false;
                e0Var.f25877b0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 1) {
                e0Var.f25878c0 = false;
                e0Var.f25880e0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 2) {
                e0Var.f25881f0 = false;
                e0Var.f25883h0 = tL_composedRichMessageWithAI.result;
            }
            e0Var.O0.N(true);
        }
    }

    public static void W(e0 e0Var, pf.c cVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        cVar.c(false);
        MessagesController.getInstance(e0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        e0Var.s0();
    }

    public static boolean X(e0 e0Var, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        boolean z10;
        int i10;
        if (e0Var.m0 || (e0Var.f25889o0 == null ? e0Var.f25888n0 == null || e0Var.h0() == null : e0Var.g0() == null)) {
            return false;
        }
        if (e0Var.f25887l0 == UserConfig.getInstance(e0Var.currentAccount).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        h80 F = h80.F(e0Var.container, g6Var, e0Var.F0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(e0Var, 3), !z10);
        int i11 = R.drawable.msg_calendar2;
        if (z10) {
            i10 = R.string.SetReminder;
        } else {
            i10 = R.string.ScheduleMessage;
        }
        F.c(i11, LocaleController.getString(i10), new ig.d2(e0Var, context, g6Var, 26), false);
        F.Z();
        return true;
    }

    public static void Y(e0 e0Var, View view) {
        final e0 e0Var2;
        h80 F = h80.F(e0Var.container, e0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f26930t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(e0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(e0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(e0Var.f25893s0)) {
            e0Var2 = e0Var;
            e0Var2.b0(F, linearLayout, true, x41.J(x41.N(e0Var.f25893s0, null, null)), null);
        } else {
            e0Var2 = e0Var;
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, e0Var2.f25893s0)) {
                e0Var2.b0(F, linearLayout, false, language2.displayName, new Runnable(e0Var2) {
                    public final e0 f26448b;

                    {
                        this.f26448b = e0Var2;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var3 = this.f26448b;
                                e0Var3.c0();
                                String str = language2.code;
                                e0Var3.f25893s0 = str;
                                x41.R(str);
                                e0Var3.k0();
                                return;
                            default:
                                e0 e0Var4 = this.f26448b;
                                e0Var4.c0();
                                String str2 = language2.code;
                                e0Var4.f25893s0 = str2;
                                x41.R(str2);
                                e0Var4.k0();
                                return;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(e0Var2.getContext(), e0Var2.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            e0Var2.b0(F, linearLayout, TextUtils.equals(language4.code, e0Var2.f25893s0), language4.displayName, new Runnable(e0Var2) {
                public final e0 f26448b;

                {
                    this.f26448b = e0Var2;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e0 e0Var3 = this.f26448b;
                            e0Var3.c0();
                            String str = language4.code;
                            e0Var3.f25893s0 = str;
                            x41.R(str);
                            e0Var3.k0();
                            return;
                        default:
                            e0 e0Var4 = this.f26448b;
                            e0Var4.c0();
                            String str2 = language4.code;
                            e0Var4.f25893s0 = str2;
                            x41.R(str2);
                            e0Var4.k0();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Z(e0 e0Var, org.telegram.ui.ActionBar.n5 n5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.G0;
        e0Var.Q0 = -1;
        e0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new vc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.K0 = true;
            e0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.b1.s(frameLayout, e0Var.resourcesProvider, tL_error, false);
            n5Var.i(null);
            e0Var.J0 = true;
            e0Var.K0 = false;
            e0Var.p0(true);
        } else if (tL_composedMessageWithAI == null) {
            n5Var.i(null);
            e0Var.J0 = true;
            e0Var.K0 = false;
            e0Var.p0(true);
        } else {
            n5Var.i(null);
            e0Var.K0 = false;
            e0Var.p0(true);
            e0Var.S0[i10] = tL_messages_composeMessageWithAI;
            if (i10 == 0) {
                e0Var.Z = false;
                e0Var.f25876a0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 1) {
                e0Var.f25878c0 = false;
                e0Var.f25879d0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 2) {
                e0Var.f25881f0 = false;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                if (tL_textWithEntities != null) {
                    e0Var.f25882g0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                    e0Var.f25884i0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                } else {
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                    e0Var.f25884i0 = formatTextWithEntities;
                    e0Var.f25882g0 = formatTextWithEntities;
                }
            }
            e0Var.O0.N(true);
        }
    }

    public static void d0(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        e0(richText, sb2);
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                        if (i10 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            e0(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (i11 > 0) {
                                    sb2.append("\n");
                                }
                                d0(arrayList.get(i11), sb2);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                        if (i12 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            e0(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (i13 > 0) {
                                    sb2.append("\n");
                                }
                                d0(arrayList2.get(i13), sb2);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                e0(pageCaption.text, sb2);
                return;
            }
            return;
        }
        e0(pageBlock.text, sb2);
    }

    public static void e0(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                e0(textconcat.texts.get(i10), sb2);
            }
        } else if (richText != null) {
            e0(richText.text, sb2);
        }
    }

    public static void f0(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) ki.e6.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                        if (i10 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) ki.e6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (i11 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                f0(arrayList.get(i11), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            spannableStringBuilder.append((CharSequence) ki.e6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (i13 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                f0(arrayList2.get(i13), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) ki.e6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) ki.e6.r(pageBlock.text, pageBlock, true));
    }

    public static void o0(int i10, vc vcVar) {
        int i11;
        String formatString;
        if (vcVar.W() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        if (!isPremium) {
            i11 = R.raw.star_premium_2;
        } else {
            i11 = R.raw.error;
        }
        String string = LocaleController.getString(R.string.AIEditorStyleLimitTitle);
        if (!isPremium) {
            formatString = LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        } else {
            formatString = LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        }
        vcVar.M(string, AndroidUtilities.replaceSingleTag(formatString, new ng(vcVar, 1)), i11).j();
    }

    @Override
    public final void B(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.f25899y0;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void b0(h80 h80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.k6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(h80Var, z10, runnable, 0));
        linearLayout.addView(e1Var, w7.z5.n(-1, -2));
    }

    public final void c0() {
        if (this.Q0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q0, true);
            this.Q0 = -1;
        }
        this.R0 = false;
        org.telegram.ui.ActionBar.n5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            s0();
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.f25895u0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (!this.R0) {
            int selectedTab = this.f25897w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f25877b0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f25881f0) {
                    return this.f25883h0;
                }
                return null;
            } else if (this.f25878c0) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f25880e0;
                if (richMessage == null) {
                    return this.Y;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence h0() {
        if (i0()) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < g02.blocks.size(); i10++) {
                    if (i10 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    f0(g02.blocks.get(i10), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.R0) {
            int selectedTab = this.f25897w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f25876a0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f25881f0) {
                    return this.f25884i0;
                }
                return null;
            } else if (this.f25878c0) {
                return null;
            } else {
                CharSequence charSequence = this.f25879d0;
                if (charSequence == null) {
                    return this.X;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean i0() {
        if (this.Y != null) {
            return true;
        }
        return false;
    }

    public final l61 j0(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.Y;
        }
        l61 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
        of2.d = i10;
        of2.e = z10;
        return of2;
    }

    public final void k0() {
        String charSequence;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str2;
        String str3;
        String str4;
        boolean i02 = i0();
        va vaVar = this.e;
        d0 d0Var = this.f25898x0;
        d0 d0Var2 = this.f25897w0;
        if (i02) {
            int selectedTab = d0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.Y;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                    tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i10)));
                }
                ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputRichMessage.flags |= 4;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Photo photo = arrayList2.get(i11);
                        i11++;
                        TLRPC.Photo photo2 = photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        String str6 = str5;
                        tL_inputPhoto.f20363id = photo2.f20368id;
                        tL_inputPhoto.access_hash = photo2.access_hash;
                        byte[] bArr = photo2.file_reference;
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        tL_inputPhoto.file_reference = bArr;
                        tL_inputRichMessage.photos.add(tL_inputPhoto);
                        str5 = str6;
                    }
                }
                str2 = str5;
                str3 = null;
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    tL_inputRichMessage.flags |= 8;
                    ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                    int size2 = arrayList4.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TLRPC.Document document = arrayList4.get(i12);
                        i12++;
                        TLRPC.Document document2 = document;
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f20356id = document2.f20350id;
                        tL_inputDocument.access_hash = document2.access_hash;
                        byte[] bArr2 = document2.file_reference;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        tL_inputDocument.file_reference = bArr2;
                        tL_inputRichMessage.documents.add(tL_inputDocument);
                    }
                }
            }
            tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
            if (selectedTab == 0) {
                tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f25893s0);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f25894t0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
                if (selectedTone instanceof z) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.I0)) {
                        str4 = str2;
                    } else {
                        str4 = this.I0;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f20553id = tL_aiComposeTone.f20552id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f25894t0;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.T0[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.R0 = true;
                    this.J0 = false;
                    p0(true);
                    org.telegram.ui.ActionBar.n5 titleTextView = vaVar.getTitleTextView();
                    titleTextView.i(this.N0);
                    this.N0.start();
                    if (selectedTab == 0) {
                        this.Z = true;
                    } else if (selectedTab == 1) {
                        this.f25878c0 = true;
                    } else if (selectedTab == 2) {
                        this.f25881f0 = true;
                    }
                    this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new Object(), new ai.u0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 6));
                    this.O0.N(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.X};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence6 = charSequenceArr[0];
        if (charSequence6 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence6.toString();
        }
        tL_textWithEntities.text = charSequence;
        int selectedTab2 = d0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f25893s0);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f25894t0;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = d0Var.getSelectedTone();
            if (selectedTone2 instanceof z) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.I0)) {
                    str = "";
                } else {
                    str = this.I0;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f20553id = tL_aiComposeTone2.f20552id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f25894t0;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.S0[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.R0 = true;
            this.J0 = false;
            p0(true);
            org.telegram.ui.ActionBar.n5 titleTextView2 = vaVar.getTitleTextView();
            titleTextView2.i(this.N0);
            this.N0.start();
            int selectedTab3 = d0Var2.getSelectedTab();
            CharSequence charSequence7 = this.X;
            if (selectedTab3 == 0 && (charSequence5 = this.f25876a0) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.f25879d0) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f25882g0) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
            int i13 = this.backgroundPaddingLeft;
            int b10 = w7.r.b(new StaticLayout(charSequence2, textPaint, (dp - i13) - i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < b10; i14++) {
                if (i14 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                ba0 ba0Var = new ba0(null, dp2, 0, null);
                ba0Var.f24955f = AndroidUtilities.dp(6.0f);
                ba0Var.h = 0.5f;
                ba0Var.f24956n = true;
                spannableStringBuilder.setSpan(ba0Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.Z = true;
                this.f25876a0 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.f25878c0 = true;
                this.f25879d0 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f25881f0 = true;
                this.f25882g0 = spannableStringBuilder;
            }
            this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new Object(), new ai.u0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 5));
            this.O0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z10) {
        if (this.f25889o0 != null) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                this.f25889o0.run(g02, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
            }
        } else if (this.f25888n0 != null && h0() != null) {
            this.f25888n0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
        }
    }

    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.gms.internal.play_billing.k3.s(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {q11.class, mi.h.class, zw0.class, s61.class, r61.class, o61.class, p61.class, n10.class, n61.class, m61.class, y5.class};
            for (int i10 = 0; i10 < 11; i10++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i10])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.X = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, 0), new org.telegram.ui.tr(8));
        }
    }

    public final void n0(TL_iv.RichMessage richMessage) {
        this.Y = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.Y;
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < richMessage2.blocks.size(); i10++) {
                if (i10 > 0) {
                    sb2.append("\n");
                }
                d0(richMessage2.blocks.get(i10), sb2);
            }
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new org.telegram.ui.tr(9));
        }
        s0();
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.C0;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            if (themedColor != this.U0) {
                this.U0 = themedColor;
                setBackgroundColor(themedColor);
                this.C0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        boolean z11 = this.J0;
        int i12 = 0;
        ei.d dVar = this.E0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            d0 d0Var = this.f25897w0;
            if (d0Var != null) {
                i10 = d0Var.getSelectedTab();
            } else {
                i10 = 0;
            }
            if (i10 == 1 && (this.f25898x0.getSelectedTone() instanceof z) && !TextUtils.equals(this.A0.getText().toString(), this.I0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.f25886k0 == null && this.f25885j0 == null) {
                dVar.setText(LocaleController.getString(R.string.OK));
                dVar.setOnClickListener(new b(this, 3));
            } else {
                dVar.setText(LocaleController.getString(R.string.AIEditorApply));
                dVar.setOnClickListener(new b(this, 2));
            }
        }
        dVar.setLoading(this.R0);
        if (z10 && this.L0 == this.K0) {
            return;
        }
        boolean z12 = this.K0;
        this.L0 = z12;
        float f11 = 0.0f;
        LinearLayout linearLayout = this.C0;
        ei.d dVar2 = this.D0;
        if (z10) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.K0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            zr zrVar = zr.h;
            alpha.setInterpolator(zrVar).setDuration(320L).withEndAction(new c(this, 0)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.K0) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(zrVar).setDuration(320L).withEndAction(new c(this, 1)).start();
            return;
        }
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        dVar2.setVisibility(i11);
        if (this.K0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        dVar2.setAlpha(f7);
        if (this.K0) {
            i12 = 8;
        }
        linearLayout.setVisibility(i12);
        if (!this.K0) {
            f11 = 1.0f;
        }
        linearLayout.setAlpha(f11);
    }

    public final void q0() {
        float f7;
        String str = this.I0;
        org.telegram.ui.Cells.h3 h3Var = this.A0;
        boolean equals = TextUtils.equals(str, h3Var.d.getText().toString());
        boolean z10 = !equals;
        if (this.H0 == z10) {
            return;
        }
        ViewPropertyAnimator animate = h3Var.d.animate();
        this.H0 = z10;
        if (!equals) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        org.telegram.messenger.tl.s(animate, f7, 320L);
        this.O0.N(true);
    }

    public final void r0() {
        lm0 lm0Var;
        View view;
        if (this.B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            lm0Var = this.d;
            if (i10 < lm0Var.getChildCount()) {
                view = lm0Var.getChildAt(i10);
                l61 G = this.O0.G(RecyclerView.R(view) - 1);
                if (G != null && G.f28221c == this.f25898x0) {
                    break;
                }
                i10++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.B0.setVisibility(0);
            this.B0.setTranslationY(view.getY() + lm0Var.getY() + view.getHeight());
            return;
        }
        this.B0.setVisibility(4);
        this.B0.e(true);
    }

    public final void s0() {
        d0 d0Var = this.f25898x0;
        TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
        d0Var.f25503c.removeAllViews();
        if (i0()) {
            d0Var.b(new TL_aicompose.AiComposeTone(), new e(this, 0));
        }
        d0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.f25895u0.tones;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i10);
            i10++;
            d0Var.b(aiComposeTone, new e(this, 0));
        }
        if (selectedTone != d0Var.getSelectedTone()) {
            d0Var.d(null);
        }
    }

    @Override
    public final void show() {
        int i10;
        int i11;
        super.show();
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(z());
        }
        if (!this.m0 && (this.f25889o0 != null || this.f25888n0 != null)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ei.d dVar = this.F0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        if (this.m0) {
            i11 = R.drawable.filled_profile_edit_24;
        } else {
            i11 = R.drawable.send_plane_24;
        }
        vq vqVar = new vq(i11, 0);
        vqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(vqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.O0.N(false);
        k0();
        p0(true);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.O0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        if (this.M0 == null) {
            this.M0 = LocaleController.getString(R.string.AIEditor);
            xj0 xj0Var = new xj0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.N0 = xj0Var;
            xj0Var.J(true);
            this.N0.K(1);
        }
        return this.M0;
    }
}
