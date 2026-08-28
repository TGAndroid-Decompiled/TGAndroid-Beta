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
public final class e0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final kh.d A0;
    public final kh.d B0;
    public final FrameLayout C0;
    public boolean D0;
    public String E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public String I0;
    public mi0 J0;
    public z41 K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public final TLRPC.TL_messages_composeMessageWithAI[] O0;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] P0;
    public CharSequence T;
    public TL_iv.RichMessage U;
    public boolean V;
    public CharSequence W;
    public TL_iv.RichMessage X;
    public boolean Y;
    public CharSequence Z;
    public TL_iv.RichMessage f27852a0;
    public boolean f27853b0;
    public CharSequence f27854c0;
    public TL_iv.RichMessage f27855d0;
    public CharSequence f27856e0;
    public Utilities.Callback f27857f0;
    public Utilities.Callback f27858g0;
    public long f27859h0;
    public boolean f27860i0;
    public Utilities.Callback4 f27861j0;
    public td f27862k0;
    public final boolean[] f27863l0;
    public final boolean[] m0;
    public String f27864n0;
    public String f27865o0;
    public boolean f27866p0;
    public final AiTonesController f27867q0;
    public final FrameLayout f27868r0;
    public final d0 f27869s0;
    public final d0 f27870t0;
    public final ImageView f27871u0;
    public final FrameLayout f27872v0;
    public final org.telegram.ui.Cells.j3 f27873w0;
    public kh.x3 f27874x0;
    public final LinearLayout f27875y0;
    public final kh.d f27876z0;

    public e0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, false, false, 2, b6Var);
        this.f27863l0 = new boolean[1];
        this.m0 = new boolean[1];
        this.L0 = true;
        this.M0 = -1;
        this.O0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.P0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.f27867q0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.f27871u0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(getThemedColor(i9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i9)), 1, -1));
        this.f32408e.addView(imageView, g7.e6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        g7.g6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27868r0 = frameLayout;
        d0 d0Var = new d0(this.currentAccount, context, b6Var, false);
        this.f27869s0 = d0Var;
        d0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        d0Var.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        d0Var.setRoundRadius(28);
        d0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        d0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        d0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        d0Var.c(1);
        frameLayout.addView(d0Var, g7.e6.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27872v0 = frameLayout2;
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), b6Var);
        this.f27873w0 = j3Var;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        h3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(j3Var, g7.e6.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        h3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        d0 d0Var2 = new d0(this.currentAccount, context, b6Var, true);
        this.f27870t0 = d0Var2;
        d0Var2.setDivider(true);
        d0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d0Var2.setRoundRadius(12);
        d0Var2.f27607n = new kh.f5(this, b6Var, context, 1);
        r0();
        d0Var2.c(-1);
        String A = z21.A();
        this.f27865o0 = A;
        if (A == null) {
            this.f27865o0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        setBackgroundColor(getThemedColor(i11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27875y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        linearLayout.addView(dVar, g7.e6.o(-1, 48, 1.0f, 119));
        kh.d i12 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.B0 = i12;
        i12.setOnClickListener(new b(this, 9));
        i12.setOnLongClickListener(new i(this, b6Var, context, 0));
        linearLayout.addView(i12, g7.e6.t(48, 48, 5, 10, 0, 0, 0));
        kh.d i13 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.f27876z0 = i13;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new z(), length, spannableStringBuilder.length(), 33);
        i13.setText(spannableStringBuilder);
        i13.setOnClickListener(new mh.k3(25, this, b6Var));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.containerView.addView(linearLayout, e10);
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(i13, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C0 = frameLayout3;
        FrameLayout.LayoutParams d9 = g7.e6.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i18 = d9.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        d9.leftMargin = i18 + i19;
        d9.rightMargin += i19;
        this.containerView.addView(frameLayout3, d9);
        o0(false);
        wk0 wk0Var = this.d;
        int i20 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 0));
        this.K = true;
        m mVar = new m(this);
        mVar.f5532m = false;
        mVar.C = false;
        mVar.o(gr.h);
        mVar.n(350L);
        this.d.setItemAnimator(mVar);
        this.d.setOnScrollListener(new bg.o2(this, 20));
        this.K0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void O(e0 e0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.c2 c2Var) {
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(e0Var.currentAccount).sendRequestTyped(deletetone, new Object(), new fh.f0(e0Var, g10, tL_aiComposeTone, 5));
    }

    public static void P(e0 e0Var) {
        kh.x3 x3Var = e0Var.f27874x0;
        if (x3Var != null) {
            x3Var.e(true);
            e0Var.f27874x0 = null;
        }
        kh.x3 x3Var2 = new kh.x3(e0Var.getContext(), 1);
        e0Var.f27874x0 = x3Var2;
        x3Var2.s();
        e0Var.f27874x0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        e0Var.f27874x0.r(20.0f);
        kh.x3 x3Var3 = e0Var.f27874x0;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.25f, -16777216);
        Paint paint = x3Var3.B;
        x3Var3.f16348e0 = dp;
        x3Var3.f16350f0 = dp2;
        x3Var3.f16351g0 = l1;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        e0Var.f27874x0.t(LocaleController.getString(R.string.AIEditorChooseStyle));
        e0Var.f27874x0.m(0.5f, 0.0f);
        kh.x3 x3Var4 = e0Var.f27874x0;
        x3Var4.d = 8000L;
        e0Var.containerView.addView(x3Var4, g7.e6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e0Var.f27874x0.v();
        e0Var.q0();
    }

    public static void Q(e0 e0Var, View view) {
        e0Var.f27866p0 = !e0Var.f27866p0;
        e0Var.j0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof dp) {
                ((dp) linearLayout.getChildAt(0)).a(e0Var.f27866p0, true);
            }
        }
    }

    public static void R(e0 e0Var, int i9) {
        d0 d0Var = e0Var.f27869s0;
        if (d0Var.getSelectedTab() == i9) {
            return;
        }
        kh.x3 x3Var = e0Var.f27874x0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        d0Var.c(i9);
        e0Var.j0();
        e0Var.K0.N(true);
    }

    public static void S(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        e0Var.f27867q0.tones.add(0, aiComposeTone);
        e0Var.r0();
        new oc(e0Var.C0, e0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void T(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        int i9;
        d0 d0Var = e0Var.f27870t0;
        kh.x3 x3Var = e0Var.f27874x0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            d0Var.d(aiComposeTone);
            e0Var.K0.N(true);
            AndroidUtilities.runOnUIThread(new c(e0Var, 2), 150L);
        } else if (aiComposeTone == null) {
            int savedTonesCount = e0Var.f27867q0.getSavedTonesCount() + 1;
            if (UserConfig.getInstance(e0Var.currentAccount).isPremium()) {
                i9 = MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get();
            } else {
                i9 = MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get();
            }
            if (savedTonesCount > i9) {
                n0(e0Var.currentAccount, new oc(e0Var.C0, e0Var.resourcesProvider));
                return;
            }
            y yVar = new y(e0Var.getContext(), e0Var.resourcesProvider);
            yVar.f34816g0 = new e(e0Var, 1);
            yVar.show();
        } else if (d0Var.getSelectedTone() == aiComposeTone) {
        } else {
            d0Var.d(aiComposeTone);
            e0Var.j0();
            e0Var.K0.N(true);
        }
    }

    public static void U(e0 e0Var, org.telegram.ui.ActionBar.h5 h5Var, int i9, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.C0;
        e0Var.M0 = -1;
        e0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new oc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.G0 = true;
            e0Var.o0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.j2.s(frameLayout, e0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.o0(true);
        } else if (tL_composedRichMessageWithAI == null) {
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.o0(true);
        } else {
            h5Var.i(null);
            e0Var.G0 = false;
            e0Var.o0(true);
            e0Var.P0[i9] = tL_messages_composeRichMessageWithAI;
            if (i9 == 0) {
                e0Var.V = false;
                e0Var.X = tL_composedRichMessageWithAI.result;
            } else if (i9 == 1) {
                e0Var.Y = false;
                e0Var.f27852a0 = tL_composedRichMessageWithAI.result;
            } else if (i9 == 2) {
                e0Var.f27853b0 = false;
                e0Var.f27855d0 = tL_composedRichMessageWithAI.result;
            }
            e0Var.K0.N(true);
        }
    }

    public static void V(e0 e0Var, ve.d dVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        dVar.c(false);
        MessagesController.getInstance(e0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        e0Var.r0();
    }

    public static boolean W(e0 e0Var, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        boolean z10;
        int i9;
        if (e0Var.f27860i0 || (e0Var.f27862k0 == null ? e0Var.f27861j0 == null || e0Var.g0() == null : e0Var.f0() == null)) {
            return false;
        }
        if (e0Var.f27859h0 == UserConfig.getInstance(e0Var.currentAccount).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x60 F = x60.F(e0Var.container, b6Var, e0Var.B0);
        F.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(e0Var, 3), !z10);
        int i10 = R.drawable.msg_calendar2;
        if (z10) {
            i9 = R.string.SetReminder;
        } else {
            i9 = R.string.ScheduleMessage;
        }
        F.c(i10, LocaleController.getString(i9), new org.telegram.messenger.video.e(e0Var, context, b6Var, 11), false);
        F.Z();
        return true;
    }

    public static void X(e0 e0Var, View view) {
        final e0 e0Var2;
        x60 F = x60.F(e0Var.container, e0Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i9 = 0;
        F.f34581t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(e0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(e0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(e0Var.f27865o0)) {
            e0Var2 = e0Var;
            e0Var2.a0(F, linearLayout, true, z21.y(z21.D(e0Var.f27865o0, null, null)), null);
        } else {
            e0Var2 = e0Var;
        }
        int size = suggestedLanguages.size();
        int i10 = 0;
        while (i10 < size) {
            TranslateController.Language language = suggestedLanguages.get(i10);
            i10++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, e0Var2.f27865o0)) {
                e0Var2.a0(F, linearLayout, false, language2.displayName, new Runnable(e0Var2) {
                    public final e0 f28614b;

                    {
                        this.f28614b = e0Var2;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var3 = this.f28614b;
                                e0Var3.b0();
                                String str = language2.code;
                                e0Var3.f27865o0 = str;
                                z21.H(str);
                                e0Var3.j0();
                                return;
                            default:
                                e0 e0Var4 = this.f28614b;
                                e0Var4.b0();
                                String str2 = language2.code;
                                e0Var4.f27865o0 = str2;
                                z21.H(str2);
                                e0Var4.j0();
                                return;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(e0Var2.getContext(), e0Var2.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, g7.e6.n(-1, 8));
        int size2 = languages.size();
        while (i9 < size2) {
            TranslateController.Language language3 = languages.get(i9);
            i9++;
            final TranslateController.Language language4 = language3;
            e0Var2.a0(F, linearLayout, TextUtils.equals(language4.code, e0Var2.f27865o0), language4.displayName, new Runnable(e0Var2) {
                public final e0 f28614b;

                {
                    this.f28614b = e0Var2;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e0 e0Var3 = this.f28614b;
                            e0Var3.b0();
                            String str = language4.code;
                            e0Var3.f27865o0 = str;
                            z21.H(str);
                            e0Var3.j0();
                            return;
                        default:
                            e0 e0Var4 = this.f28614b;
                            e0Var4.b0();
                            String str2 = language4.code;
                            e0Var4.f27865o0 = str2;
                            z21.H(str2);
                            e0Var4.j0();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Y(e0 e0Var, org.telegram.ui.ActionBar.h5 h5Var, int i9, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.C0;
        e0Var.M0 = -1;
        e0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new oc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.G0 = true;
            e0Var.o0(true);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.j2.s(frameLayout, e0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.o0(true);
        } else if (tL_composedMessageWithAI == null) {
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.o0(true);
        } else {
            h5Var.i(null);
            e0Var.G0 = false;
            e0Var.o0(true);
            e0Var.O0[i9] = tL_messages_composeMessageWithAI;
            if (i9 == 0) {
                e0Var.V = false;
                e0Var.W = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i9 == 1) {
                e0Var.Y = false;
                e0Var.Z = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else if (i9 == 2) {
                e0Var.f27853b0 = false;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                if (tL_textWithEntities != null) {
                    e0Var.f27854c0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                    e0Var.f27856e0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                } else {
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                    e0Var.f27856e0 = formatTextWithEntities;
                    e0Var.f27854c0 = formatTextWithEntities;
                }
            }
            e0Var.K0.N(true);
        }
    }

    public static void c0(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        d0(richText, sb2);
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i9 = 0; i9 < pageblocklist.items.size(); i9++) {
                        if (i9 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i9);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            d0(((TL_iv.TL_pageListItemText) pageListItem).text, sb2);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    sb2.append("\n");
                                }
                                c0(arrayList.get(i10), sb2);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                        if (i11 > 0) {
                            sb2.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            d0(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb2);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    sb2.append("\n");
                                }
                                c0(arrayList2.get(i12), sb2);
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
                d0(pageCaption.text, sb2);
                return;
            }
            return;
        }
        d0(pageBlock.text, sb2);
    }

    public static void d0(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i9 = 0; i9 < textconcat.texts.size(); i9++) {
                d0(textconcat.texts.get(i9), sb2);
            }
        } else if (richText != null) {
            d0(richText.text, sb2);
        }
    }

    public static void e0(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) qh.u5.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i9 = 0; i9 < pageblocklist.items.size(); i9++) {
                        if (i9 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i9);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) qh.u5.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (i10 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                e0(arrayList.get(i10), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i11 = 0; i11 < pageblockorderedlist.items.size(); i11++) {
                        if (i11 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i11);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            spannableStringBuilder.append((CharSequence) qh.u5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                e0(arrayList2.get(i12), spannableStringBuilder);
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
                spannableStringBuilder.append((CharSequence) qh.u5.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) qh.u5.r(pageBlock.text, pageBlock, true));
    }

    public static void n0(int i9, oc ocVar) {
        int i10;
        String formatString;
        if (ocVar.W() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i9);
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        if (!isPremium) {
            i10 = R.raw.star_premium_2;
        } else {
            i10 = R.raw.error;
        }
        String string = LocaleController.getString(R.string.AIEditorStyleLimitTitle);
        if (!isPremium) {
            formatString = LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        } else {
            formatString = LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get()));
        }
        ocVar.M(string, AndroidUtilities.replaceSingleTag(formatString, new fg(ocVar, 1)), i10).j();
    }

    @Override
    public final void A(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f27871u0;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void a0(x60 x60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        int i10 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(x60Var, z10, runnable, 0));
        linearLayout.addView(g1Var, g7.e6.n(-1, -2));
    }

    public final void b0() {
        if (this.M0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.M0, true);
            this.M0 = -1;
        }
        this.N0 = false;
        org.telegram.ui.ActionBar.h5 titleTextView = this.f32408e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.loadedAiComposeTones) {
            r0();
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
        AiTonesController aiTonesController = this.f27867q0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage f0() {
        if (!this.N0) {
            int selectedTab = this.f27869s0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V) {
                    return this.X;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f27853b0) {
                    return this.f27855d0;
                }
                return null;
            } else if (this.Y) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.f27852a0;
                if (richMessage == null) {
                    return this.U;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence g0() {
        if (h0()) {
            TL_iv.RichMessage f02 = f0();
            if (f02 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i9 = 0; i9 < f02.blocks.size(); i9++) {
                    if (i9 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    e0(f02.blocks.get(i9), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.N0) {
            int selectedTab = this.f27869s0.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.V) {
                    return this.W;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.f27853b0) {
                    return this.f27856e0;
                }
                return null;
            } else if (this.Y) {
                return null;
            } else {
                CharSequence charSequence = this.Z;
                if (charSequence == null) {
                    return this.T;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean h0() {
        if (this.U != null) {
            return true;
        }
        return false;
    }

    public final l41 i0(int i9, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U;
        }
        l41 of2 = RichMessageLayout.PreviewView.Factory.of(richMessage);
        of2.d = i9;
        of2.f30333e = z10;
        return of2;
    }

    public final void j0() {
        String charSequence;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str2;
        String str3;
        String str4;
        boolean h02 = h0();
        pa paVar = this.f32408e;
        d0 d0Var = this.f27870t0;
        d0 d0Var2 = this.f27869s0;
        if (h02) {
            int selectedTab = d0Var2.getSelectedTab();
            String str5 = "";
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.U;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str2 = str5;
                str3 = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i9 = 0; i9 < richMessage.blocks.size(); i9++) {
                    tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i9)));
                }
                ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputRichMessage.flags |= 4;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Photo photo = arrayList2.get(i10);
                        i10++;
                        TLRPC.Photo photo2 = photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        String str6 = str5;
                        tL_inputPhoto.f22399id = photo2.f22404id;
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
                    int i11 = 0;
                    while (i11 < size2) {
                        TLRPC.Document document = arrayList4.get(i11);
                        i11++;
                        TLRPC.Document document2 = document;
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.f22392id = document2.f22386id;
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f27865o0);
                tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str3);
                tL_messages_composeRichMessageWithAI.emojify = this.f27866p0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (TextUtils.isEmpty(this.E0)) {
                        str4 = str2;
                    } else {
                        str4 = this.E0;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str4;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f22592id = tL_aiComposeTone.f22591id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.f27866p0;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.P0[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.N0 = true;
                    this.F0 = false;
                    o0(true);
                    org.telegram.ui.ActionBar.h5 titleTextView = paVar.getTitleTextView();
                    titleTextView.i(this.J0);
                    this.J0.start();
                    if (selectedTab == 0) {
                        this.V = true;
                    } else if (selectedTab == 1) {
                        this.Y = true;
                    } else if (selectedTab == 2) {
                        this.f27853b0 = true;
                    }
                    this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new Object(), new gh.j0(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, 5));
                    this.K0.N(true);
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.T};
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
            tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f27865o0);
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
            tL_messages_composeMessageWithAI.emojify = this.f27866p0;
        } else if (selectedTab2 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = d0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.E0)) {
                    str = "";
                } else {
                    str = this.E0;
                }
                inputaicomposetonesingleuse2.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f22592id = tL_aiComposeTone2.f22591id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeMessageWithAI.emojify = this.f27866p0;
        } else if (selectedTab2 == 2) {
            tL_messages_composeMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.O0[selectedTab2];
        if (tL_messages_composeMessageWithAI2 == null || tL_messages_composeMessageWithAI2.proofread != tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI2.emojify != tL_messages_composeMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
            if (!tL_messages_composeMessageWithAI.emojify && !tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI.tone == null && tL_messages_composeMessageWithAI.translate_to_lang == null) {
                return;
            }
            this.N0 = true;
            this.F0 = false;
            o0(true);
            org.telegram.ui.ActionBar.h5 titleTextView2 = paVar.getTitleTextView();
            titleTextView2.i(this.J0);
            this.J0.start();
            int selectedTab3 = d0Var2.getSelectedTab();
            CharSequence charSequence7 = this.T;
            if (selectedTab3 == 0 && (charSequence5 = this.W) != null) {
                charSequence7 = charSequence5;
            }
            if (selectedTab3 == 1 && (charSequence4 = this.Z) != null) {
                charSequence7 = charSequence4;
            }
            if (selectedTab3 == 2 && (charSequence3 = this.f27854c0) != null) {
                charSequence2 = charSequence3;
            } else {
                charSequence2 = charSequence7;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
            int i12 = this.backgroundPaddingLeft;
            int b10 = g7.n.b(new StaticLayout(charSequence2, textPaint, (dp - i12) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < b10; i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int dp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                q80 q80Var = new q80(null, dp2, 0, null);
                q80Var.f31863f = AndroidUtilities.dp(6.0f);
                q80Var.h = 0.5f;
                q80Var.f31864n = true;
                spannableStringBuilder.setSpan(q80Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.V = true;
                this.W = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.Y = true;
                this.Z = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.f27853b0 = true;
                this.f27854c0 = spannableStringBuilder;
            }
            this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new Object(), new gh.j0(this, titleTextView2, selectedTab2, tL_messages_composeMessageWithAI, 4));
            this.K0.N(true);
        }
    }

    public final void k0(int i9, int i10, boolean z10) {
        if (this.f27862k0 != null) {
            TL_iv.RichMessage f02 = f0();
            if (f02 != null) {
                this.f27862k0.run(f02, Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z10));
            }
        } else if (this.f27861j0 != null && g0() != null) {
            this.f27861j0.run(g0(), Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z10));
        }
    }

    public final void l0(Editable editable) {
        ?? spannableStringBuilder;
        Object[] spans;
        if (!e2.c.v(editable)) {
            spannableStringBuilder = editable.toString();
        } else {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {wz0.class, CodeHighlighting.Span.class, jv0.class, s41.class, r41.class, o41.class, p41.class, s00.class, n41.class, m41.class, t5.class};
            for (int i9 = 0; i9 < 11; i9++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i9])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        }
        this.T = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, 0), new org.telegram.ui.tr(4));
        }
    }

    public final void m0(TL_iv.RichMessage richMessage) {
        this.U = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.U;
            StringBuilder sb2 = new StringBuilder();
            for (int i9 = 0; i9 < richMessage2.blocks.size(); i9++) {
                if (i9 > 0) {
                    sb2.append("\n");
                }
                c0(richMessage2.blocks.get(i9), sb2);
            }
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new org.telegram.ui.tr(5));
        }
        r0();
    }

    public final void o0(boolean z10) {
        int i9;
        int i10;
        float f10;
        float f11;
        boolean z11 = this.F0;
        int i11 = 0;
        kh.d dVar = this.A0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            d0 d0Var = this.f27869s0;
            if (d0Var != null) {
                i9 = d0Var.getSelectedTab();
            } else {
                i9 = 0;
            }
            if (i9 == 1 && (this.f27870t0.getSelectedTone() instanceof a0) && !TextUtils.equals(this.f27873w0.getText().toString(), this.E0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.f27858g0 == null && this.f27857f0 == null) {
                dVar.setText(LocaleController.getString(R.string.OK));
                dVar.setOnClickListener(new b(this, 3));
            } else {
                dVar.setText(LocaleController.getString(R.string.AIEditorApply));
                dVar.setOnClickListener(new b(this, 2));
            }
        }
        dVar.setLoading(this.N0);
        if (z10 && this.H0 == this.G0) {
            return;
        }
        boolean z12 = this.G0;
        this.H0 = z12;
        float f12 = 0.0f;
        LinearLayout linearLayout = this.f27875y0;
        kh.d dVar2 = this.f27876z0;
        if (z10) {
            dVar2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = dVar2.animate();
            if (this.G0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            gr grVar = gr.h;
            alpha.setInterpolator(grVar).setDuration(320L).withEndAction(new c(this, 0)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.G0) {
                f12 = 1.0f;
            }
            animate2.alpha(f12).setInterpolator(grVar).setDuration(320L).withEndAction(new c(this, 1)).start();
            return;
        }
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dVar2.setVisibility(i10);
        if (this.G0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        dVar2.setAlpha(f10);
        if (this.G0) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        if (!this.G0) {
            f12 = 1.0f;
        }
        linearLayout.setAlpha(f12);
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.f27875y0;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void p0() {
        float f10;
        String str = this.E0;
        org.telegram.ui.Cells.j3 j3Var = this.f27873w0;
        boolean equals = TextUtils.equals(str, j3Var.f24544b.getText().toString());
        boolean z10 = !equals;
        if (this.D0 == z10) {
            return;
        }
        ViewPropertyAnimator animate = j3Var.f24544b.animate();
        this.D0 = z10;
        if (!equals) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).start();
        this.K0.N(true);
    }

    public final void q0() {
        wk0 wk0Var;
        View view;
        if (this.f27874x0 == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            wk0Var = this.d;
            if (i9 < wk0Var.getChildCount()) {
                view = wk0Var.getChildAt(i9);
                l41 G = this.K0.G(RecyclerView.R(view) - 1);
                if (G != null && G.f30332c == this.f27870t0) {
                    break;
                }
                i9++;
            } else {
                view = null;
                break;
            }
        }
        if (view != null) {
            this.f27874x0.setVisibility(0);
            this.f27874x0.setTranslationY(view.getY() + wk0Var.getY() + view.getHeight());
            return;
        }
        this.f27874x0.setVisibility(4);
        this.f27874x0.e(true);
    }

    public final void r0() {
        d0 d0Var = this.f27870t0;
        TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
        d0Var.f27604c.removeAllViews();
        if (h0()) {
            d0Var.b(new TL_aicompose.AiComposeTone(), new e(this, 0));
        }
        d0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.f27867q0.tones;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_aicompose.AiComposeTone aiComposeTone = arrayList.get(i9);
            i9++;
            d0Var.b(aiComposeTone, new e(this, 0));
        }
        if (selectedTone != d0Var.getSelectedTone()) {
            d0Var.d(null);
        }
    }

    @Override
    public final void show() {
        int i9;
        int i10;
        super.show();
        pa paVar = this.f32408e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        if (!this.f27860i0 && (this.f27862k0 != null || this.f27861j0 != null)) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        kh.d dVar = this.B0;
        dVar.setVisibility(i9);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        if (this.f27860i0) {
            i10 = R.drawable.filled_profile_edit_24;
        } else {
            i10 = R.drawable.send_plane_24;
        }
        eq eqVar = new eq(i10, 0);
        eqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.K0.N(false);
        j0();
        o0(true);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.K0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        if (this.I0 == null) {
            this.I0 = LocaleController.getString(R.string.AIEditor);
            mi0 mi0Var = new mi0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), "emoji_stars", AndroidUtilities.dp(24.0f));
            this.J0 = mi0Var;
            mi0Var.H(true);
            this.J0.I(1);
        }
        return this.I0;
    }
}
