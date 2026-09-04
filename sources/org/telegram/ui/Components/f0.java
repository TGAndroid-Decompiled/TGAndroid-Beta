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
public final class f0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Cells.i3 A0;
    public di.f4 B0;
    public final LinearLayout C0;
    public final di.d D0;
    public final di.d E0;
    public final di.d F0;
    public final FrameLayout G0;
    public boolean H0;
    public String I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public String M0;
    public xi0 N0;
    public v51 O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public final TLRPC.TL_messages_composeMessageWithAI[] S0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] T0;
    public CharSequence X;
    public TL_iv.RichMessage Y;
    public boolean Z;
    public CharSequence f25819a0;
    public TL_iv.RichMessage f25820b0;
    public boolean f25821c0;
    public CharSequence f25822d0;
    public TL_iv.RichMessage f25823e0;
    public boolean f25824f0;
    public CharSequence f25825g0;
    public TL_iv.RichMessage f25826h0;
    public CharSequence f25827i0;
    public Utilities.Callback f25828j0;
    public Utilities.Callback f25829k0;
    public long f25830l0;
    public boolean m0;
    public Utilities.Callback4 f25831n0;
    public de f25832o0;
    public final boolean[] f25833p0;
    public final boolean[] f25834q0;
    public String f25835r0;
    public String f25836s0;
    public boolean f25837t0;
    public final AiTonesController f25838u0;
    public final FrameLayout f25839v0;
    public final e0 f25840w0;
    public final e0 f25841x0;
    public final ImageView f25842y0;
    public final FrameLayout f25843z0;

    public f0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        this.f25833p0 = new boolean[1];
        this.f25834q0 = new boolean[1];
        this.P0 = true;
        this.Q0 = -1;
        this.S0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.T0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.f25838u0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.f25842y0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f24647e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25839v0 = frameLayout;
        e0 e0Var = new e0(this.currentAccount, context, f6Var, false);
        this.f25840w0 = e0Var;
        e0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f20663d6;
        e0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        e0Var.setRoundRadius(28);
        e0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        e0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        e0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        e0Var.c(1);
        frameLayout.addView(e0Var, w7.x5.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25843z0 = frameLayout2;
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.A0 = i3Var;
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22074b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        g3Var.addTextChangedListener(new l(this));
        frameLayout2.addView(i3Var, w7.x5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        g3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        e0 e0Var2 = new e0(this.currentAccount, context, f6Var, true);
        this.f25841x0 = e0Var2;
        e0Var2.setDivider(true);
        e0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e0Var2.setRoundRadius(12);
        e0Var2.f25500n = new di.p5(this, f6Var, context, 1);
        s0();
        e0Var2.c(-1);
        String B = u31.B();
        this.f25836s0 = B;
        if (B == null) {
            this.f25836s0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.j6.f20607a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.C0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        di.d dVar = new di.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.E0 = dVar;
        linearLayout.addView(dVar, w7.x5.o(-1, 48, 1.0f, 119));
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.F0 = g10;
        g10.setOnClickListener(new b(this, 9));
        g10.setOnLongClickListener(new j(this, f6Var, context, 0));
        linearLayout.addView(g10, w7.x5.t(48, 48, 5, 10, 0, 0, 0));
        di.d g11 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.D0 = g11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new ig.w1(), length, spannableStringBuilder.length(), 33);
        g11.setText(spannableStringBuilder);
        g11.setOnClickListener(new org.telegram.ui.rf(8, this, f6Var));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 80);
        int i13 = e7.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e7.leftMargin = i13 + i14;
        e7.rightMargin += i14;
        this.containerView.addView(linearLayout, e7);
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(g11, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.G0 = frameLayout3;
        FrameLayout.LayoutParams d10 = w7.x5.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = d10.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d10.leftMargin = i17 + i18;
        d10.rightMargin += i18;
        this.containerView.addView(frameLayout3, d10);
        p0(false);
        ll0 ll0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 0));
        this.O = true;
        n nVar = new n(this);
        nVar.f45777m = false;
        nVar.C = false;
        nVar.o(pr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.d.setOnScrollListener(new ah.e0(this, 14));
        this.O0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(f0 f0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.b2 b2Var) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequestTyped(deletetone, new Object(), new org.telegram.tgnet.e(f0Var, g10, tL_aiComposeTone, 1));
    }

    public static void Q(f0 f0Var) {
        di.f4 f4Var = f0Var.B0;
        if (f4Var != null) {
            f4Var.e(true);
            f0Var.B0 = null;
        }
        di.f4 f4Var2 = new di.f4(f0Var.getContext(), 1);
        f0Var.B0 = f4Var2;
        f4Var2.r();
        f0Var.B0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        f0Var.B0.q(20.0f);
        di.f4 f4Var3 = f0Var.B0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
        Paint paint = f4Var3.F;
        f4Var3.f7207i0 = dp;
        f4Var3.f7208j0 = dp2;
        f4Var3.f7209k0 = l1;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        f0Var.B0.s(LocaleController.getString(R.string.AIEditorChooseStyle));
        f0Var.B0.l(0.5f, 0.0f);
        di.f4 f4Var4 = f0Var.B0;
        f4Var4.d = 8000L;
        f0Var.containerView.addView(f4Var4, w7.x5.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        f0Var.B0.u();
        f0Var.r0();
    }

    public static void R(f0 f0Var, View view) {
        f0Var.f25837t0 = !f0Var.f25837t0;
        f0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof mp) {
                ((mp) linearLayout.getChildAt(0)).a(f0Var.f25837t0, true);
            }
        }
    }

    public static void S(f0 f0Var, int i10) {
        e0 e0Var = f0Var.f25840w0;
        if (e0Var.getSelectedTab() == i10) {
            return;
        }
        di.f4 f4Var = f0Var.B0;
        if (f4Var != null) {
            f4Var.e(true);
        }
        e0Var.c(i10);
        f0Var.k0();
        f0Var.O0.N(true);
    }

    public static void T(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        f0Var.f25838u0.tones.add(0, aiComposeTone);
        f0Var.s0();
        new yc(f0Var.G0, f0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(f0 f0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i10;
        e0 e0Var = f0Var.f25841x0;
        di.f4 f4Var = f0Var.B0;
        if (f4Var != null) {
            f4Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            e0Var.d(aiComposeTone);
            f0Var.O0.N(true);
            AndroidUtilities.runOnUIThread(new c(f0Var, 2), 150L);
        } else if (aiComposeTone == null) {
            int savedTonesCount = f0Var.f25838u0.getSavedTonesCount() + 1;
            if (UserConfig.getInstance(f0Var.currentAccount).isPremium()) {
                i10 = MessagesController.getInstance(f0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get();
            } else {
                i10 = MessagesController.getInstance(f0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get();
            }
            if (savedTonesCount > i10) {
                o0(f0Var.currentAccount, new yc(f0Var.G0, f0Var.resourcesProvider));
                return;
            }
            z zVar = new z(f0Var.getContext(), f0Var.resourcesProvider);
            zVar.f33035k0 = new e(f0Var, 1);
            zVar.show();
        } else if (e0Var.getSelectedTone() == aiComposeTone) {
        } else {
            e0Var.d(aiComposeTone);
            f0Var.k0();
            f0Var.O0.N(true);
        }
    }

    public static void V(f0 f0Var, org.telegram.ui.ActionBar.j5 j5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = f0Var.G0;
        f0Var.Q0 = -1;
        f0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new yc(frameLayout, f0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            f0Var.K0 = true;
            f0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.p6.q(frameLayout, f0Var.resourcesProvider, tL_error, false);
            j5Var.i(null);
            f0Var.J0 = true;
            f0Var.K0 = false;
            f0Var.p0(true);
        } else if (tL_composedRichMessageWithAI == null) {
            j5Var.i(null);
            f0Var.J0 = true;
            f0Var.K0 = false;
            f0Var.p0(true);
        } else {
            j5Var.i(null);
            f0Var.K0 = false;
            f0Var.p0(true);
            f0Var.T0[i10] = tL_messages_composeRichMessageWithAI;
            if (i10 == 0) {
                f0Var.Z = false;
                f0Var.f25820b0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 1) {
                f0Var.f25821c0 = false;
                f0Var.f25823e0 = tL_composedRichMessageWithAI.result;
            } else if (i10 == 2) {
                f0Var.f25824f0 = false;
                f0Var.f25826h0 = tL_composedRichMessageWithAI.result;
            }
            f0Var.O0.N(true);
        }
    }

    public static void W(f0 f0Var, of.e eVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        eVar.c(false);
        MessagesController.getInstance(f0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        f0Var.s0();
    }

    public static boolean X(f0 f0Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        boolean z10;
        int i10;
        if (f0Var.m0 || (f0Var.f25832o0 == null ? f0Var.f25831n0 == null || f0Var.h0() == null : f0Var.g0() == null)) {
            return false;
        }
        if (f0Var.f25830l0 == UserConfig.getInstance(f0Var.currentAccount).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n70 F = n70.F(f0Var.container, f6Var, f0Var.F0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(f0Var, 3), !z10);
        int i11 = R.drawable.msg_calendar2;
        if (z10) {
            i10 = R.string.SetReminder;
        } else {
            i10 = R.string.ScheduleMessage;
        }
        F.c(i11, LocaleController.getString(i10), new org.telegram.ui.ActionBar.p(f0Var, context, f6Var, 6), false);
        F.Z();
        return true;
    }

    public static void Y(f0 f0Var, View view) {
        final f0 f0Var2;
        n70 F = n70.F(f0Var.container, f0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f28661t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(f0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(f0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(f0Var.f25836s0)) {
            f0Var2 = f0Var;
            f0Var2.b0(F, linearLayout, true, u31.y(u31.D(f0Var.f25836s0, null, null)), null);
        } else {
            f0Var2 = f0Var;
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, f0Var2.f25836s0)) {
                f0Var2.b0(F, linearLayout, false, language2.displayName, new Runnable(f0Var2) {
                    public final f0 f26542b;

                    {
                        this.f26542b = f0Var2;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                f0 f0Var3 = this.f26542b;
                                f0Var3.c0();
                                String str = language2.code;
                                f0Var3.f25836s0 = str;
                                u31.I(str);
                                f0Var3.k0();
                                return;
                            default:
                                f0 f0Var4 = this.f26542b;
                                f0Var4.c0();
                                String str2 = language2.code;
                                f0Var4.f25836s0 = str2;
                                u31.I(str2);
                                f0Var4.k0();
                                return;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(f0Var2.getContext(), f0Var2.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            f0Var2.b0(F, linearLayout, TextUtils.equals(language4.code, f0Var2.f25836s0), language4.displayName, new Runnable(f0Var2) {
                public final f0 f26542b;

                {
                    this.f26542b = f0Var2;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            f0 f0Var3 = this.f26542b;
                            f0Var3.c0();
                            String str = language4.code;
                            f0Var3.f25836s0 = str;
                            u31.I(str);
                            f0Var3.k0();
                            return;
                        default:
                            f0 f0Var4 = this.f26542b;
                            f0Var4.c0();
                            String str2 = language4.code;
                            f0Var4.f25836s0 = str2;
                            u31.I(str2);
                            f0Var4.k0();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Z(f0 f0Var, org.telegram.ui.ActionBar.j5 j5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = f0Var.G0;
        f0Var.Q0 = -1;
        f0Var.R0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new yc(frameLayout, f0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            f0Var.K0 = true;
            f0Var.p0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.p6.q(frameLayout, f0Var.resourcesProvider, tL_error, false);
            j5Var.i(null);
            f0Var.J0 = true;
            f0Var.K0 = false;
            f0Var.p0(true);
        } else if (tL_composedMessageWithAI == null) {
            j5Var.i(null);
            f0Var.J0 = true;
            f0Var.K0 = false;
            f0Var.p0(true);
        } else {
            j5Var.i(null);
            f0Var.K0 = false;
            f0Var.p0(true);
            f0Var.S0[i10] = tL_messages_composeMessageWithAI;
            if (i10 == 0) {
                f0Var.Z = false;
                f0Var.f25819a0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 1) {
                f0Var.f25821c0 = false;
                f0Var.f25822d0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i10 == 2) {
                f0Var.f25824f0 = false;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                if (tL_textWithEntities != null) {
                    f0Var.f25825g0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                    f0Var.f25827i0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                } else {
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                    f0Var.f25827i0 = formatTextWithEntities;
                    f0Var.f25825g0 = formatTextWithEntities;
                }
            }
            f0Var.O0.N(true);
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
                        spannableStringBuilder.append((CharSequence) ji.i6.r(richText, null, true));
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
                            spannableStringBuilder.append((CharSequence) ji.i6.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
                            spannableStringBuilder.append((CharSequence) ji.i6.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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
                spannableStringBuilder.append((CharSequence) ji.i6.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) ji.i6.r(pageBlock.text, pageBlock, true));
    }

    public static void o0(int i10, yc ycVar) {
        int i11;
        String formatString;
        if (ycVar.W() == null) {
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
        ycVar.M(string, AndroidUtilities.replaceSingleTag(formatString, new pg(ycVar, 1)), i11).j();
    }

    @Override
    public final void B(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.f25842y0;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void b0(n70 n70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new i(n70Var, z10, runnable, 0));
        linearLayout.addView(f1Var, w7.x5.n(-1, -2));
    }

    public final void c0() {
        if (this.Q0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q0, true);
            this.Q0 = -1;
        }
        this.R0 = false;
        org.telegram.ui.ActionBar.j5 titleTextView = this.f24647e.getTitleTextView();
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
        AiTonesController aiTonesController = this.f25838u0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (!this.R0) {
            int selectedTab = this.f25840w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f25820b0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f25824f0) {
                    return this.f25826h0;
                }
                return null;
            } else if (this.f25821c0) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f25823e0;
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
            int selectedTab = this.f25840w0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.Z) {
                    return this.f25819a0;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f25824f0) {
                    return this.f25827i0;
                }
                return null;
            } else if (this.f25821c0) {
                return null;
            } else {
                CharSequence charSequence = this.f25822d0;
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

    public final h51 j0(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.Y;
        }
        h51 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
        of2.d = i10;
        of2.f26588e = z10;
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
        xa xaVar = this.f24647e;
        e0 e0Var = this.f25841x0;
        e0 e0Var2 = this.f25840w0;
        if (i02) {
            int selectedTab = e0Var2.getSelectedTab();
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
                        tL_inputPhoto.f19888id = photo2.f19893id;
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
                        tL_inputDocument.f19881id = document2.f19875id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f25836s0);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f25837t0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
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
                    inputaicomposetoneid.f20082id = tL_aiComposeTone.f20081id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f25837t0;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.T0[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.R0 = true;
                    this.J0 = false;
                    p0(true);
                    org.telegram.ui.ActionBar.j5 titleTextView = xaVar.getTitleTextView();
                    titleTextView.i(this.N0);
                    this.N0.start();
                    if (selectedTab == 0) {
                        this.Z = true;
                    } else if (selectedTab == 1) {
                        this.f25821c0 = true;
                    } else if (selectedTab == 2) {
                        this.f25824f0 = true;
                    }
                    this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new Object(), new fi.h1(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 4));
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
        int selectedTab2 = e0Var2.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (selectedTab2 == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f25836s0);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f25837t0;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = e0Var.getSelectedTone();
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
                inputaicomposetoneid2.f20082id = tL_aiComposeTone2.f20081id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f25837t0;
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
            org.telegram.ui.ActionBar.j5 titleTextView2 = xaVar.getTitleTextView();
            titleTextView2.i(this.N0);
            this.N0.start();
            int selectedTab3 = e0Var2.getSelectedTab();
            CharSequence charSequence7 = this.X;
            if (selectedTab3 == 0 && (charSequence5 = this.f25819a0) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.f25822d0) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f25825g0) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
            int i13 = this.backgroundPaddingLeft;
            int b10 = w7.p.b(new StaticLayout(charSequence2, textPaint, (dp - i13) - i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < b10; i14++) {
                if (i14 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                i90 i90Var = new i90(null, dp2, 0, null);
                i90Var.f27052f = AndroidUtilities.dp(6.0f);
                i90Var.h = 0.5f;
                i90Var.f27053n = true;
                spannableStringBuilder.setSpan(i90Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.Z = true;
                this.f25819a0 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.f25821c0 = true;
                this.f25822d0 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f25824f0 = true;
                this.f25825g0 = spannableStringBuilder;
            }
            this.Q0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new Object(), new fi.h1(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 3));
            this.O0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z10) {
        if (this.f25832o0 != null) {
            TL_iv.RichMessage g02 = g0();
            if (g02 != null) {
                this.f25832o0.run(g02, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
            }
        } else if (this.f25831n0 != null && h0() != null) {
            this.f25831n0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
        }
    }

    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!com.google.android.gms.internal.vision.e2.u(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {o01.class, CodeHighlighting.Span.class, aw0.class, o51.class, n51.class, k51.class, l51.class, h10.class, j51.class, i51.class, z5.class};
            for (int i10 = 0; i10 < 11; i10++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i10])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.X = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, 0), new m4.t0(29));
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
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new f(0));
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
        di.d dVar = this.E0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            e0 e0Var = this.f25840w0;
            if (e0Var != null) {
                i10 = e0Var.getSelectedTab();
            } else {
                i10 = 0;
            }
            if (i10 == 1 && (this.f25841x0.getSelectedTone() instanceof a0) && !TextUtils.equals(this.A0.getText().toString(), this.I0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.f25829k0 == null && this.f25828j0 == null) {
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
        di.d dVar2 = this.D0;
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
            pr prVar = pr.h;
            alpha.setInterpolator(prVar).setDuration(320L).withEndAction(new c(this, 0)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.K0) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(prVar).setDuration(320L).withEndAction(new c(this, 1)).start();
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
        boolean equals = TextUtils.equals(str, i3Var.f22074b.getText().toString());
        boolean z10 = !equals;
        if (this.H0 == z10) {
            return;
        }
        ViewPropertyAnimator animate = i3Var.f22074b.animate();
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
        ll0 ll0Var;
        View view;
        if (this.B0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ll0Var = this.d;
            if (i10 < ll0Var.getChildCount()) {
                view = ll0Var.getChildAt(i10);
                h51 G = this.O0.G(RecyclerView.R(view) - 1);
                if (G != null && G.f26587c == this.f25841x0) {
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
            this.B0.setTranslationY(view.getY() + ll0Var.getY() + view.getHeight());
            return;
        }
        this.B0.setVisibility(4);
        this.B0.e(true);
    }

    public final void s0() {
        e0 e0Var = this.f25841x0;
        TL_aicompose.AiComposeTone selectedTone = e0Var.getSelectedTone();
        e0Var.f25497c.removeAllViews();
        if (i0()) {
            e0Var.b(new TL_aicompose.AiComposeTone(), new e(this, 0));
        }
        e0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.f25838u0.tones;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i10);
            i10++;
            e0Var.b(aiComposeTone, new e(this, 0));
        }
        if (selectedTone != e0Var.getSelectedTone()) {
            e0Var.d(null);
        }
    }

    @Override
    public final void show() {
        int i10;
        int i11;
        super.show();
        xa xaVar = this.f24647e;
        if (xaVar != null) {
            xaVar.setTitle(y());
        }
        if (!this.m0 && (this.f25832o0 != null || this.f25831n0 != null)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        di.d dVar = this.F0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        if (this.m0) {
            i11 = R.drawable.filled_profile_edit_24;
        } else {
            i11 = R.drawable.send_plane_24;
        }
        nq nqVar = new nq(i11, 0);
        nqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.O0.N(false);
        k0();
        p0(true);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.O0 = v51Var;
        v51Var.f31135r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        if (this.M0 == null) {
            this.M0 = LocaleController.getString(R.string.AIEditor);
            xi0 xi0Var = new xi0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            this.N0 = xi0Var;
            xi0Var.H(true);
            this.N0.I(1);
        }
        return this.M0;
    }
}
