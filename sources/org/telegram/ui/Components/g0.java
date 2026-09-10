package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
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
import org.telegram.messenger.CodeHighlighting;
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
public final class g0 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Cells.i3 A0;
    public bi.x4 B0;
    public final LinearLayout C0;
    public final bi.d D0;
    public final bi.d E0;
    public final bi.d F0;
    public final FrameLayout G0;
    public boolean H0;
    public String I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public String M0;
    public hj0 N0;
    public j61 O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public final TLRPC.TL_messages_composeMessageWithAI[] S0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] T0;
    public CharSequence X;
    public TL_iv.RichMessage Y;
    public boolean Z;
    public CharSequence f23111a0;
    public TL_iv.RichMessage f23112b0;
    public boolean f23113c0;
    public CharSequence f23114d0;
    public TL_iv.RichMessage f23115e0;
    public boolean f23116f0;
    public CharSequence f23117g0;
    public TL_iv.RichMessage f23118h0;
    public CharSequence f23119i0;
    public Utilities.Callback f23120j0;
    public Utilities.Callback f23121k0;
    public long f23122l0;
    public boolean m0;
    public Utilities.Callback4 f23123n0;
    public ce f23124o0;
    public final boolean[] f23125p0;
    public final boolean[] f23126q0;
    public String f23127r0;
    public String f23128s0;
    public boolean f23129t0;
    public final AiTonesController f23130u0;
    public final FrameLayout f23131v0;
    public final f0 f23132w0;
    public final f0 f23133x0;
    public final ImageView f23134y0;
    public final FrameLayout f23135z0;

    public g0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        this.f23125p0 = new boolean[1];
        this.f23126q0 = new boolean[1];
        this.P0 = true;
        this.Q0 = -1;
        this.S0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.T0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.f23130u0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.f23134y0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.a6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.c6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new c(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23131v0 = frameLayout;
        f0 f0Var = new f0(this.currentAccount, context, f6Var, false);
        this.f23132w0 = f0Var;
        f0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        f0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        f0Var.setRoundRadius(28);
        f0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new f(this, 3));
        f0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new f(this, 3));
        f0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new f(this, 3));
        f0Var.c(1);
        frameLayout.addView(f0Var, w7.a6.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f23135z0 = frameLayout2;
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.A0 = i3Var;
        org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        g3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(i3Var, w7.a6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        g3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        f0 f0Var2 = new f0(this.currentAccount, context, f6Var, true);
        this.f23133x0 = f0Var2;
        f0Var2.setDivider(true);
        f0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f0Var2.setRoundRadius(12);
        f0Var2.f22796n = new bi.n6(this, f6Var, context, 1);
        s0();
        f0Var2.c(-1);
        String A = i41.A();
        this.f23128s0 = A;
        if (A == null) {
            this.f23128s0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.j6.f17872a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.C0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.E0 = dVar;
        linearLayout.addView(dVar, w7.a6.o(-1, 48, 1.0f, 119));
        bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
        this.F0 = g10;
        g10.setOnClickListener(new c(this, 9));
        g10.setOnLongClickListener(new j(this, f6Var, context, 0));
        linearLayout.addView(g10, w7.a6.t(48, 48, 5, 10, 0, 0, 0));
        bi.d g11 = org.telegram.messenger.em.g(24, context, f6Var, true);
        this.D0 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new gg.f2(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new org.telegram.ui.sh(5, this, f6Var));
        FrameLayout.LayoutParams e = w7.a6.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(linearLayout, e);
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.G0 = frameLayout3;
        FrameLayout.LayoutParams d10 = w7.a6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = d10.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d10.leftMargin = i17 + i18;
        d10.rightMargin += i18;
        this.containerView.addView(frameLayout3, d10);
        p0(false);
        vl0 vl0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 0));
        this.O = true;
        n nVar = new n(this);
        nVar.f41645m = false;
        nVar.C = false;
        nVar.o(wr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnScrollListener(new bi.a2(this, 11));
        this.O0.N(false);
        AndroidUtilities.runOnUIThread(new d(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(g0 g0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.d2 d2Var) {
        nf.e g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.g(g0Var, g10, tL_aiComposeTone, 1));
    }

    public static void Q(g0 g0Var) {
        bi.x4 x4Var = g0Var.B0;
        if (x4Var != null) {
            x4Var.e(true);
            g0Var.B0 = null;
        }
        bi.x4 x4Var2 = new bi.x4(g0Var.getContext(), 1);
        g0Var.B0 = x4Var2;
        x4Var2.r();
        g0Var.B0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        g0Var.B0.q(20.0f);
        bi.x4 x4Var3 = g0Var.B0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
        Paint paint = x4Var3.F;
        x4Var3.f3887i0 = dp;
        x4Var3.f3888j0 = dp2;
        x4Var3.f3889k0 = l1;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        g0Var.B0.s(LocaleController.getString(R.string.AIEditorChooseStyle));
        g0Var.B0.l(0.5f, 0.0f);
        bi.x4 x4Var4 = g0Var.B0;
        x4Var4.d = 8000L;
        g0Var.containerView.addView(x4Var4, w7.a6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        g0Var.B0.u();
        g0Var.r0();
    }

    public static void R(g0 g0Var, View view) {
        g0Var.f23129t0 = !g0Var.f23129t0;
        g0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof tp) {
                ((tp) linearLayout.getChildAt(0)).a(g0Var.f23129t0, true);
            }
        }
    }

    public static void S(g0 g0Var, int i10) {
        f0 f0Var = g0Var.f23132w0;
        if (f0Var.getSelectedTab() == i10) {
            return;
        }
        bi.x4 x4Var = g0Var.B0;
        if (x4Var != null) {
            x4Var.e(true);
        }
        f0Var.c(i10);
        g0Var.k0();
        g0Var.O0.N(true);
    }

    public static void T(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        g0Var.f23130u0.tones.add(0, aiComposeTone);
        g0Var.s0();
        new wc(g0Var.G0, g0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(g0 g0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i10;
        f0 f0Var = g0Var.f23133x0;
        bi.x4 x4Var = g0Var.B0;
        if (x4Var != null) {
            x4Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            f0Var.d(aiComposeTone);
            g0Var.O0.N(true);
            AndroidUtilities.runOnUIThread(new d(g0Var, 2), 150L);
        } else if (aiComposeTone == null) {
            int savedTonesCount = g0Var.f23130u0.getSavedTonesCount() + 1;
            if (UserConfig.getInstance(g0Var.currentAccount).isPremium()) {
                i10 = MessagesController.getInstance(g0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get();
            } else {
                i10 = MessagesController.getInstance(g0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get();
            }
            if (savedTonesCount > i10) {
                o0(g0Var.currentAccount, new wc(g0Var.G0, g0Var.resourcesProvider));
                return;
            }
            z zVar = new z(g0Var.getContext(), g0Var.resourcesProvider);
            zVar.f29548k0 = new f(g0Var, 1);
            zVar.show();
        } else if (f0Var.getSelectedTone() == aiComposeTone) {
        } else {
            f0Var.d(aiComposeTone);
            g0Var.k0();
            g0Var.O0.N(true);
        }
    }

    public static void V(g0 g0Var, org.telegram.ui.ActionBar.l5 l5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = g0Var.G0;
        g0Var.Q0 = -1;
        g0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new wc(frameLayout, g0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            g0Var.K0 = true;
            g0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.r6.q(frameLayout, g0Var.resourcesProvider, tL_error, false);
            l5Var.i(null);
            g0Var.J0 = true;
            g0Var.K0 = false;
            g0Var.p0(true);
        } else if (tL_composedRichMessageWithAI == null) {
            l5Var.i(null);
            g0Var.J0 = true;
            g0Var.K0 = false;
            g0Var.p0(true);
        } else {
            l5Var.i(null);
            g0Var.K0 = false;
            g0Var.p0(true);
            g0Var.T0[i10] = tL_messages_composeRichMessageWithAI;
            if (i10 == 0) {
                g0Var.Z = false;
                g0Var.f23112b0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 1) {
                g0Var.f23113c0 = false;
                g0Var.f23115e0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 2) {
                g0Var.f23116f0 = false;
                g0Var.f23118h0 = tL_composedRichMessageWithAI.result;
            }
            g0Var.O0.N(true);
        }
    }

    public static void W(g0 g0Var, nf.e eVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        eVar.c(false);
        MessagesController.getInstance(g0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        g0Var.s0();
    }

    public static boolean X(g0 g0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        boolean z10;
        int i10;
        if (g0Var.m0 || (g0Var.f23124o0 == null ? g0Var.f23123n0 == null || g0Var.h0() == null : g0Var.g0() == null)) {
            return false;
        }
        if (g0Var.f23122l0 == UserConfig.getInstance(g0Var.currentAccount).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        w70 F = w70.F(g0Var.container, f6Var, g0Var.F0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new d(g0Var, 3), !z10);
        int i11 = R.drawable.msg_calendar2;
        if (z10) {
            i10 = R.string.SetReminder;
        } else {
            i10 = R.string.ScheduleMessage;
        }
        F.c(i11, LocaleController.getString(i10), new gg.a0(g0Var, context, f6Var, 28), false);
        F.Z();
        return true;
    }

    public static void Y(g0 g0Var, View view) {
        final g0 g0Var2;
        w70 F = w70.F(g0Var.container, g0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f28702t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(g0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(g0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(g0Var.f23128s0)) {
            g0Var2 = g0Var;
            g0Var2.b0(F, linearLayout, true, i41.y(i41.D(g0Var.f23128s0, null, null)), null);
        } else {
            g0Var2 = g0Var;
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, g0Var2.f23128s0)) {
                g0Var2.b0(F, linearLayout, false, language2.displayName, new Runnable(g0Var2) {
                    public final g0 f23461b;

                    {
                        this.f23461b = g0Var2;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                g0 g0Var3 = this.f23461b;
                                g0Var3.c0();
                                String str = language2.code;
                                g0Var3.f23128s0 = str;
                                i41.I(str);
                                g0Var3.k0();
                                return;
                            default:
                                g0 g0Var4 = this.f23461b;
                                g0Var4.c0();
                                String str2 = language2.code;
                                g0Var4.f23128s0 = str2;
                                i41.I(str2);
                                g0Var4.k0();
                                return;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(g0Var2.getContext(), g0Var2.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, w7.a6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            g0Var2.b0(F, linearLayout, TextUtils.equals(language4.code, g0Var2.f23128s0), language4.displayName, new Runnable(g0Var2) {
                public final g0 f23461b;

                {
                    this.f23461b = g0Var2;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            g0 g0Var3 = this.f23461b;
                            g0Var3.c0();
                            String str = language4.code;
                            g0Var3.f23128s0 = str;
                            i41.I(str);
                            g0Var3.k0();
                            return;
                        default:
                            g0 g0Var4 = this.f23461b;
                            g0Var4.c0();
                            String str2 = language4.code;
                            g0Var4.f23128s0 = str2;
                            i41.I(str2);
                            g0Var4.k0();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Z(g0 g0Var, org.telegram.ui.ActionBar.l5 l5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = g0Var.G0;
        g0Var.Q0 = -1;
        g0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new wc(frameLayout, g0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            g0Var.K0 = true;
            g0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.r6.q(frameLayout, g0Var.resourcesProvider, tL_error, false);
            l5Var.i(null);
            g0Var.J0 = true;
            g0Var.K0 = false;
            g0Var.p0(true);
        } else if (tL_composedMessageWithAI == null) {
            l5Var.i(null);
            g0Var.J0 = true;
            g0Var.K0 = false;
            g0Var.p0(true);
        } else {
            l5Var.i(null);
            g0Var.K0 = false;
            g0Var.p0(true);
            g0Var.S0[i10] = tL_messages_composeMessageWithAI;
            if (i10 == 0) {
                g0Var.Z = false;
                g0Var.f23111a0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 1) {
                g0Var.f23113c0 = false;
                g0Var.f23114d0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 2) {
                g0Var.f23116f0 = false;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                if (tL_textWithEntities != null) {
                    g0Var.f23117g0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                    g0Var.f23119i0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                } else {
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                    g0Var.f23119i0 = formatTextWithEntities;
                    g0Var.f23117g0 = formatTextWithEntities;
                }
            }
            g0Var.O0.N(true);
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
                        spannableStringBuilder.append((CharSequence) hi.i6.r(richText, null, true));
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
                            spannableStringBuilder.append((CharSequence) hi.i6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                            spannableStringBuilder.append((CharSequence) hi.i6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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
                spannableStringBuilder.append((CharSequence) hi.i6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) hi.i6.r(pageBlock.text, pageBlock, true));
    }

    public static void o0(int i10, wc wcVar) {
        int i11;
        String formatString;
        if (wcVar.W() == null) {
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
        wcVar.M(string, AndroidUtilities.replaceSingleTag(formatString, new rg(wcVar, 1)), i11).j();
    }

    @Override
    public final void A(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.f23134y0;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void b0(w70 w70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new i(w70Var, z10, runnable, 0));
        linearLayout.addView(g1Var, w7.a6.n(-1, -2));
    }

    public final void c0() {
        if (this.Q0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q0, true);
            this.Q0 = -1;
        }
        this.R0 = false;
        org.telegram.ui.ActionBar.l5 titleTextView = this.e.getTitleTextView();
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
        AiTonesController aiTonesController = this.f23130u0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (!this.R0) {
            int selectedTab = this.f23132w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f23112b0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f23116f0) {
                    return this.f23118h0;
                }
                return null;
            } else if (this.f23113c0) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f23115e0;
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
            int selectedTab = this.f23132w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f23111a0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f23116f0) {
                    return this.f23119i0;
                }
                return null;
            } else if (this.f23113c0) {
                return null;
            } else {
                CharSequence charSequence = this.f23114d0;
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

    public final v51 j0(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.Y;
        }
        v51 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
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
        wa waVar = this.e;
        f0 f0Var = this.f23133x0;
        f0 f0Var2 = this.f23132w0;
        if (i02) {
            int selectedTab = f0Var2.getSelectedTab();
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
                        tL_inputPhoto.f17214id = photo2.f17219id;
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
                        tL_inputDocument.f17207id = document2.f17201id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f23128s0);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f23129t0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
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
                    inputaicomposetoneid.f17410id = tL_aiComposeTone.f17409id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f23129t0;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.T0[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.R0 = true;
                    this.J0 = false;
                    p0(true);
                    org.telegram.ui.ActionBar.l5 titleTextView = waVar.getTitleTextView();
                    titleTextView.i(this.N0);
                    this.N0.start();
                    if (selectedTab == 0) {
                        this.Z = true;
                    } else if (selectedTab == 1) {
                        this.f23113c0 = true;
                    } else if (selectedTab == 2) {
                        this.f23116f0 = true;
                    }
                    this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new Object(), new di.k1(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 4));
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
        int selectedTab2 = f0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f23128s0);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f23129t0;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = f0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
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
                inputaicomposetoneid2.f17410id = tL_aiComposeTone2.f17409id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f23129t0;
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
            org.telegram.ui.ActionBar.l5 titleTextView2 = waVar.getTitleTextView();
            titleTextView2.i(this.N0);
            this.N0.start();
            int selectedTab3 = f0Var2.getSelectedTab();
            CharSequence charSequence7 = this.X;
            if (selectedTab3 == 0 && (charSequence5 = this.f23111a0) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.f23114d0) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f23117g0) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
            int i13 = this.backgroundPaddingLeft;
            int b10 = w7.q.b(new StaticLayout(charSequence2, textPaint, (dp - i13) - i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < b10; i14++) {
                if (i14 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                r90 r90Var = new r90(null, dp2, 0, null);
                r90Var.f26638f = AndroidUtilities.dp(6.0f);
                r90Var.h = 0.5f;
                r90Var.f26639n = true;
                spannableStringBuilder.setSpan(r90Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.Z = true;
                this.f23111a0 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.f23113c0 = true;
                this.f23114d0 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f23116f0 = true;
                this.f23117g0 = spannableStringBuilder;
            }
            this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new Object(), new di.k1(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 3));
            this.O0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z10) {
        if (this.f23124o0 != null) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                this.f23124o0.run(g02, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
            }
        } else if (this.f23123n0 != null && h0() != null) {
            this.f23123n0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
        }
    }

    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.gms.internal.vision.e2.u(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {c11.class, CodeHighlighting.Span.class, mw0.class, c61.class, b61.class, y51.class, z51.class, p10.class, x51.class, w51.class, y5.class};
            for (int i10 = 0; i10 < 11; i10++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i10])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.X = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, 0), new b(0));
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
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new b(1));
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

    public final void p0(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        boolean z11 = this.J0;
        int i12 = 0;
        bi.d dVar = this.E0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new c(this, 0));
        } else {
            f0 f0Var = this.f23132w0;
            if (f0Var != null) {
                i10 = f0Var.getSelectedTab();
            } else {
                i10 = 0;
            }
            if (i10 == 1 && (this.f23133x0.getSelectedTone() instanceof a0) && !TextUtils.equals(this.A0.getText().toString(), this.I0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new c(this, 1));
            } else if (this.f23121k0 == null && this.f23120j0 == null) {
                dVar.setText(LocaleController.getString(R.string.OK));
                dVar.setOnClickListener(new c(this, 3));
            } else {
                dVar.setText(LocaleController.getString(R.string.AIEditorApply));
                dVar.setOnClickListener(new c(this, 2));
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
        bi.d dVar2 = this.D0;
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
            wr wrVar = wr.h;
            alpha.setInterpolator(wrVar).setDuration(320L).withEndAction(new d(this, 0)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.K0) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(wrVar).setDuration(320L).withEndAction(new d(this, 1)).start();
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
        org.telegram.ui.Cells.i3 i3Var = this.A0;
        boolean equals = TextUtils.equals(str, i3Var.f19293b.getText().toString());
        boolean z10 = !equals;
        if (this.H0 == z10) {
            return;
        }
        ViewPropertyAnimator animate = i3Var.f19293b.animate();
        this.H0 = z10;
        if (!equals) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).setDuration(320L).start();
        this.O0.N(true);
    }

    public final void r0() {
        vl0 vl0Var;
        View view;
        if (this.B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            vl0Var = this.d;
            if (i10 < vl0Var.getChildCount()) {
                view = vl0Var.getChildAt(i10);
                v51 G = this.O0.G(RecyclerView.R(view) - 1);
                if (G != null && G.f27823c == this.f23133x0) {
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
            this.B0.setTranslationY(view.getY() + vl0Var.getY() + view.getHeight());
            return;
        }
        this.B0.setVisibility(4);
        this.B0.e(true);
    }

    public final void s0() {
        f0 f0Var = this.f23133x0;
        TL_aicompose.AiComposeTone selectedTone = f0Var.getSelectedTone();
        f0Var.f22794c.removeAllViews();
        if (i0()) {
            f0Var.b(new TL_aicompose.AiComposeTone(), new f(this, 0));
        }
        f0Var.b(null, new f(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.f23130u0.tones;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i10);
            i10++;
            f0Var.b(aiComposeTone, new f(this, 0));
        }
        if (selectedTone != f0Var.getSelectedTone()) {
            f0Var.d(null);
        }
    }

    @Override
    public final void show() {
        int i10;
        int i11;
        super.show();
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle(y());
        }
        if (!this.m0 && (this.f23124o0 != null || this.f23123n0 != null)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bi.d dVar = this.F0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        if (this.m0) {
            i11 = R.drawable.filled_profile_edit_24;
        } else {
            i11 = R.drawable.send_plane_24;
        }
        uq uqVar = new uq(i11, 0);
        uqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(uqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.O0.N(false);
        k0();
        p0(true);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new e(this, 0), this.resourcesProvider);
        this.O0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        if (this.M0 == null) {
            this.M0 = LocaleController.getString(R.string.AIEditor);
            hj0 hj0Var = new hj0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.N0 = hj0Var;
            hj0Var.J(true);
            this.N0.K(1);
        }
        return this.M0;
    }
}
