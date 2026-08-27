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

public final class e0 extends qa implements NotificationCenter.NotificationCenterDelegate {
    public final lh.d A0;
    public final lh.d B0;
    public final FrameLayout C0;
    public boolean D0;
    public String E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public String I0;
    public oi0 J0;
    public b51 K0;
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

    public TL_iv.RichMessage f27878a0;

    public boolean f27879b0;

    public CharSequence f27880c0;

    public TL_iv.RichMessage f27881d0;

    public CharSequence f27882e0;

    public Utilities.Callback f27883f0;

    public Utilities.Callback f27884g0;

    public long f27885h0;

    public boolean f27886i0;

    public Utilities.Callback4 f27887j0;

    public pd f27888k0;

    public final boolean[] f27889l0;
    public final boolean[] m0;

    public String f27890n0;

    public String f27891o0;

    public boolean f27892p0;

    public final AiTonesController f27893q0;

    public final FrameLayout f27894r0;

    public final d0 f27895s0;

    public final d0 f27896t0;

    public final ImageView f27897u0;

    public final FrameLayout f27898v0;

    public final org.telegram.ui.Cells.g3 f27899w0;

    public lh.w3 f27900x0;

    public final LinearLayout f27901y0;

    public final lh.d f27902z0;

    public e0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, false, false, 2, c6Var);
        this.f27889l0 = new boolean[1];
        this.m0 = new boolean[1];
        this.L0 = true;
        this.M0 = -1;
        this.O0 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.P0 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.f27893q0 = tonesController;
        tonesController.load();
        tonesController.open = true;
        ImageView imageView = new ImageView(context);
        this.f27897u0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f31853e.addView(imageView, h7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        h7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27894r0 = frameLayout;
        d0 d0Var = new d0(this.currentAccount, context, c6Var, false);
        this.f27895s0 = d0Var;
        d0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        int iDp = AndroidUtilities.dp(28.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        d0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        d0Var.setRoundRadius(28);
        d0Var.a(R.drawable.outline_ai_translate2, LocaleController.getString(R.string.AIEditorTabTranslate), new e(this, 3));
        d0Var.a(R.drawable.menu_rewrite, LocaleController.getString(R.string.AIEditorTabStyle), new e(this, 3));
        d0Var.a(R.drawable.menu_proofread, LocaleController.getString(R.string.AIEditorTabFix), new e(this, 3));
        d0Var.c(1);
        frameLayout.addView(d0Var, h7.z5.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27898v0 = frameLayout2;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.f27899w0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24370b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        e3Var.addTextChangedListener(new k(this));
        frameLayout2.addView(g3Var, h7.z5.c(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        e3Var.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(53.0f), AndroidUtilities.dp(15.0f));
        d0 d0Var2 = new d0(this.currentAccount, context, c6Var, true);
        this.f27896t0 = d0Var2;
        d0Var2.setDivider(true);
        d0Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d0Var2.setRoundRadius(12);
        d0Var2.f27589n = new lh.e5(this, c6Var, context, 1);
        s0();
        d0Var2.c(-1);
        String strC = b31.C();
        this.f27891o0 = strC;
        if (strC == null) {
            this.f27891o0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        int i12 = org.telegram.ui.ActionBar.g6.f22999a7;
        setBackgroundColor(getThemedColor(i12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27901y0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        linearLayout.addView(dVar, h7.z5.o(-1, 48, 1.0f, 119));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.B0 = dVarG;
        dVarG.setOnClickListener(new b(this, 9));
        dVarG.setOnLongClickListener(new i(this, c6Var, context, 0));
        linearLayout.addView(dVarG, h7.z5.t(48, 48, 5, 10, 0, 0, 0));
        lh.d dVarG2 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.f27902z0 = dVarG2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AIEditorLimitButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new z(), length, spannableStringBuilder.length(), 33);
        dVarG2.setText(spannableStringBuilder);
        dVarG2.setOnClickListener(new nh.x1(26, this, c6Var));
        FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, -2, 80);
        int i13 = layoutParamsE.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        layoutParamsE.leftMargin = i13 + i14;
        layoutParamsE.rightMargin += i14;
        this.containerView.addView(linearLayout, layoutParamsE);
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i15 = layoutParamsD.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i15 + i16;
        layoutParamsD.rightMargin += i16;
        this.containerView.addView(dVarG2, layoutParamsD);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.C0 = frameLayout3;
        FrameLayout.LayoutParams layoutParamsD2 = h7.z5.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i17 = layoutParamsD2.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        layoutParamsD2.leftMargin = i17 + i18;
        layoutParamsD2.rightMargin += i18;
        this.containerView.addView(frameLayout3, layoutParamsD2);
        p0(false);
        zk0 zk0Var = this.d;
        int i19 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 0));
        this.K = true;
        m mVar = new m(this);
        mVar.f5819m = false;
        mVar.C = false;
        mVar.o(er.h);
        mVar.n(350L);
        this.d.setItemAnimator(mVar);
        this.d.setOnScrollListener(new ag.z2(this, 21));
        this.K0.N(false);
        AndroidUtilities.runOnUIThread(new c(this, 4));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    public static void P(e0 e0Var, TL_aicompose.TL_aiComposeTone tL_aiComposeTone, org.telegram.ui.ActionBar.b2 b2Var) {
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
        ConnectionsManager.getInstance(e0Var.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new gh.d0(e0Var, dVarG, tL_aiComposeTone, 5));
    }

    public static void Q(e0 e0Var) {
        lh.w3 w3Var = e0Var.f27900x0;
        if (w3Var != null) {
            w3Var.e(true);
            e0Var.f27900x0 = null;
        }
        lh.w3 w3Var2 = new lh.w3(e0Var.getContext(), 1);
        e0Var.f27900x0 = w3Var2;
        w3Var2.s();
        e0Var.f27900x0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        e0Var.f27900x0.r(20.0f);
        lh.w3 w3Var3 = e0Var.f27900x0;
        float fDp = AndroidUtilities.dp(12.0f);
        float fDp2 = AndroidUtilities.dp(4.0f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -16777216);
        Paint paint = w3Var3.B;
        w3Var3.f16980e0 = fDp;
        w3Var3.f16982f0 = fDp2;
        w3Var3.f16983g0 = iL1;
        paint.setShadowLayer(fDp, 0.0f, fDp2, iL1);
        e0Var.f27900x0.t(LocaleController.getString(R.string.AIEditorChooseStyle));
        e0Var.f27900x0.m(0.5f, 0.0f);
        lh.w3 w3Var4 = e0Var.f27900x0;
        w3Var4.d = 8000L;
        e0Var.containerView.addView(w3Var4, h7.z5.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        e0Var.f27900x0.v();
        e0Var.r0();
    }

    public static void R(e0 e0Var, View view) {
        e0Var.f27892p0 = !e0Var.f27892p0;
        e0Var.k0();
        if (view instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) view;
            if (linearLayout.getChildAt(0) instanceof bp) {
                ((bp) linearLayout.getChildAt(0)).a(e0Var.f27892p0, true);
            }
        }
    }

    public static void S(e0 e0Var, int i10) {
        d0 d0Var = e0Var.f27895s0;
        if (d0Var.getSelectedTab() == i10) {
            return;
        }
        lh.w3 w3Var = e0Var.f27900x0;
        if (w3Var != null) {
            w3Var.e(true);
        }
        d0Var.c(i10);
        e0Var.k0();
        e0Var.K0.N(true);
    }

    public static void T(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        e0Var.f27893q0.tones.add(0, aiComposeTone);
        e0Var.s0();
        new mc(e0Var.C0, e0Var.resourcesProvider).p(aiComposeTone.emoji_id, LocaleController.formatString(R.string.AIEditorToneCreatedTitle, aiComposeTone.title), LocaleController.getString(R.string.AIEditorToneCreatedText)).j();
    }

    public static void U(e0 e0Var, TL_aicompose.AiComposeTone aiComposeTone) {
        d0 d0Var = e0Var.f27896t0;
        lh.w3 w3Var = e0Var.f27900x0;
        if (w3Var != null) {
            w3Var.e(true);
        }
        if (aiComposeTone instanceof a0) {
            d0Var.d(aiComposeTone);
            e0Var.K0.N(true);
            AndroidUtilities.runOnUIThread(new c(e0Var, 2), 150L);
        } else {
            if (aiComposeTone != null) {
                if (d0Var.getSelectedTone() == aiComposeTone) {
                    return;
                }
                d0Var.d(aiComposeTone);
                e0Var.k0();
                e0Var.K0.N(true);
                return;
            }
            if (e0Var.f27893q0.getSavedTonesCount() + 1 > (UserConfig.getInstance(e0Var.currentAccount).isPremium() ? MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitPremium.get() : MessagesController.getInstance(e0Var.currentAccount).config.aicomposeToneSavedLimitDefault.get())) {
                o0(e0Var.currentAccount, new mc(e0Var.C0, e0Var.resourcesProvider));
                return;
            }
            y yVar = new y(e0Var.getContext(), e0Var.resourcesProvider);
            yVar.f34744g0 = new e(e0Var, 1);
            yVar.show();
        }
    }

    public static void V(e0 e0Var, org.telegram.ui.ActionBar.h5 h5Var, int i10, TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI, TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.C0;
        e0Var.M0 = -1;
        e0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new mc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.G0 = true;
            e0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.Cells.pa.t(frameLayout, e0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.p0(true);
            return;
        }
        if (tL_composedRichMessageWithAI == null) {
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.p0(true);
            return;
        }
        h5Var.i(null);
        e0Var.G0 = false;
        e0Var.p0(true);
        e0Var.P0[i10] = tL_messages_composeRichMessageWithAI;
        if (i10 == 0) {
            e0Var.V = false;
            e0Var.X = tL_composedRichMessageWithAI.result;
        } else if (i10 == 1) {
            e0Var.Y = false;
            e0Var.f27878a0 = tL_composedRichMessageWithAI.result;
        } else if (i10 == 2) {
            e0Var.f27879b0 = false;
            e0Var.f27881d0 = tL_composedRichMessageWithAI.result;
        }
        e0Var.K0.N(true);
    }

    public static void W(e0 e0Var, we.d dVar, TL_aicompose.TL_aiComposeTone tL_aiComposeTone) {
        dVar.c(false);
        MessagesController.getInstance(e0Var.currentAccount).getTonesController().remove(tL_aiComposeTone);
        e0Var.s0();
    }

    public static boolean X(e0 e0Var, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        if (e0Var.f27886i0 || (e0Var.f27888k0 == null ? e0Var.f27887j0 == null || e0Var.h0() == null : e0Var.g0() == null)) {
            return false;
        }
        boolean z10 = e0Var.f27885h0 == UserConfig.getInstance(e0Var.currentAccount).getClientUserId();
        b70 b70VarF = b70.F(e0Var.container, c6Var, e0Var.B0);
        b70VarF.l(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new c(e0Var, 3), !z10);
        b70VarF.c(R.drawable.msg_calendar2, LocaleController.getString(z10 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.ActionBar.i3(e0Var, context, c6Var, 5), false);
        b70VarF.Z();
        return true;
    }

    public static void Y(e0 e0Var, View view) {
        final e0 e0Var2;
        b70 b70VarF = b70.F(e0Var.container, e0Var.resourcesProvider, view);
        b70VarF.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        b70VarF.f26993t = false;
        b70VarF.Y = true;
        ScrollView scrollView = new ScrollView(e0Var.getContext());
        LinearLayout linearLayout = new LinearLayout(e0Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        b70VarF.q(scrollView);
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (TextUtils.isEmpty(e0Var.f27891o0)) {
            e0Var2 = e0Var;
        } else {
            e0Var2 = e0Var;
            e0Var2.b0(b70VarF, linearLayout, true, b31.z(b31.E(e0Var.f27891o0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            TranslateController.Language language = suggestedLanguages.get(i11);
            i11++;
            final TranslateController.Language language2 = language;
            if (!TextUtils.equals(language2.code, e0Var2.f27891o0)) {
                final int i12 = 0;
                e0Var2.b0(b70VarF, linearLayout, false, language2.displayName, new Runnable(e0Var2) {

                    public final e0 f28475b;

                    {
                        this.f28475b = e0Var2;
                    }

                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e0 e0Var3 = this.f28475b;
                                e0Var3.c0();
                                String str = language2.code;
                                e0Var3.f27891o0 = str;
                                b31.I(str);
                                e0Var3.k0();
                                break;
                            default:
                                e0 e0Var4 = this.f28475b;
                                e0Var4.c0();
                                String str2 = language2.code;
                                e0Var4.f27891o0 = str2;
                                b31.I(str2);
                                e0Var4.k0();
                                break;
                        }
                    }
                });
            }
        }
        org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(e0Var2.getContext(), e0Var2.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, h7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language3 = languages.get(i10);
            i10++;
            final TranslateController.Language language4 = language3;
            final int i13 = 1;
            e0Var2.b0(b70VarF, linearLayout, TextUtils.equals(language4.code, e0Var2.f27891o0), language4.displayName, new Runnable(e0Var2) {

                public final e0 f28475b;

                {
                    this.f28475b = e0Var2;
                }

                @Override
                public final void run() {
                    switch (i13) {
                        case 0:
                            e0 e0Var3 = this.f28475b;
                            e0Var3.c0();
                            String str = language4.code;
                            e0Var3.f27891o0 = str;
                            b31.I(str);
                            e0Var3.k0();
                            break;
                        default:
                            e0 e0Var4 = this.f28475b;
                            e0Var4.c0();
                            String str2 = language4.code;
                            e0Var4.f27891o0 = str2;
                            b31.I(str2);
                            e0Var4.k0();
                            break;
                    }
                }
            });
        }
        b70VarF.Z();
    }

    public static void Z(e0 e0Var, org.telegram.ui.ActionBar.h5 h5Var, int i10, TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI, TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = e0Var.C0;
        e0Var.M0 = -1;
        e0Var.N0 = false;
        if (tL_error != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            new mc(frameLayout, e0Var.resourcesProvider).M(LocaleController.getString(R.string.AIEditorLimitTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AIEditorLimitText)), R.raw.star_premium_2).j();
            e0Var.G0 = true;
            e0Var.p0(true);
            return;
        }
        if (tL_error != null) {
            org.telegram.ui.Cells.pa.t(frameLayout, e0Var.resourcesProvider, tL_error, false);
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.p0(true);
            return;
        }
        if (tL_composedMessageWithAI == null) {
            h5Var.i(null);
            e0Var.F0 = true;
            e0Var.G0 = false;
            e0Var.p0(true);
            return;
        }
        h5Var.i(null);
        e0Var.G0 = false;
        e0Var.p0(true);
        e0Var.O0[i10] = tL_messages_composeMessageWithAI;
        if (i10 == 0) {
            e0Var.V = false;
            e0Var.W = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 1) {
            e0Var.Y = false;
            e0Var.Z = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
        } else if (i10 == 2) {
            e0Var.f27879b0 = false;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
            if (tL_textWithEntities != null) {
                e0Var.f27880c0 = MessageObject.formatTextWithEntities(tL_textWithEntities);
                e0Var.f27882e0 = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
            } else {
                CharSequence textWithEntities = MessageObject.formatTextWithEntities(tL_composedMessageWithAI.result_text);
                e0Var.f27882e0 = textWithEntities;
                e0Var.f27880c0 = textWithEntities;
            }
        }
        e0Var.K0.N(true);
    }

    public static void d0(TL_iv.PageBlock pageBlock, StringBuilder sb2) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            e0(pageBlock.text, sb2);
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                e0(pageCaption.text, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                e0(richText, sb2);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
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
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
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
        }
    }

    public static void e0(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (richText != null) {
                e0(richText.text, sb2);
            }
        } else {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i10 = 0; i10 < textconcat.texts.size(); i10++) {
                e0(textconcat.texts.get(i10), sb2);
            }
        }
    }

    public static void f0(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
            spannableStringBuilder.append((CharSequence) rh.v5.r(pageBlock.text, pageBlock, true));
            return;
        }
        if ((pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockCollage)) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) rh.v5.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText != null) {
                spannableStringBuilder.append((CharSequence) rh.v5.r(richText, null, true));
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i10 = 0; i10 < pageblocklist.items.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i10);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    spannableStringBuilder.append((CharSequence) rh.v5.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
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
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i12 = 0; i12 < pageblockorderedlist.items.size(); i12++) {
                if (i12 > 0) {
                    spannableStringBuilder.append("\n");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i12);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    spannableStringBuilder.append((CharSequence) rh.v5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
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
        }
    }

    public static void o0(int i10, mc mcVar) {
        if (mcVar.W() == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        boolean zIsPremium = UserConfig.getInstance(i10).isPremium();
        mcVar.M(LocaleController.getString(R.string.AIEditorStyleLimitTitle), AndroidUtilities.replaceSingleTag(!zIsPremium ? LocaleController.formatString(R.string.AIEditorStyleLimitTextPremium, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitDefault.get()), Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())) : LocaleController.formatString(R.string.AIEditorStyleLimitText, Integer.valueOf(messagesController.config.aicomposeToneSavedLimitPremium.get())), new bg(mcVar, 1)), !zIsPremium ? R.raw.star_premium_2 : R.raw.error).j();
    }

    @Override
    public final void C(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.f27897u0;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void b0(b70 b70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(b70Var, z10, runnable, 0));
        linearLayout.addView(f1Var, h7.z5.n(-1, -2));
    }

    public final void c0() {
        if (this.M0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.M0, true);
            this.M0 = -1;
        }
        this.N0 = false;
        org.telegram.ui.ActionBar.h5 titleTextView = this.f31853e.getTitleTextView();
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
        AiTonesController aiTonesController = this.f27893q0;
        if (aiTonesController != null) {
            aiTonesController.open = false;
        }
        super.dismiss();
    }

    public final TL_iv.RichMessage g0() {
        if (this.N0) {
            return null;
        }
        int selectedTab = this.f27895s0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V) {
                return null;
            }
            return this.X;
        }
        if (selectedTab == 2) {
            if (this.f27879b0) {
                return null;
            }
            return this.f27881d0;
        }
        if (this.Y) {
            return null;
        }
        TL_iv.RichMessage richMessage = this.f27878a0;
        return richMessage == null ? this.U : richMessage;
    }

    public final CharSequence h0() {
        if (i0()) {
            TL_iv.RichMessage richMessageG0 = g0();
            if (richMessageG0 == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < richMessageG0.blocks.size(); i10++) {
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                f0(richMessageG0.blocks.get(i10), spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
        if (this.N0) {
            return null;
        }
        int selectedTab = this.f27895s0.getSelectedTab();
        if (selectedTab == 0) {
            if (this.V) {
                return null;
            }
            return this.W;
        }
        if (selectedTab == 2) {
            if (this.f27879b0) {
                return null;
            }
            return this.f27882e0;
        }
        if (this.Y) {
            return null;
        }
        CharSequence charSequence = this.Z;
        return charSequence == null ? this.T : charSequence;
    }

    public final boolean i0() {
        return this.U != null;
    }

    public final n41 j0(int i10, TL_iv.RichMessage richMessage, boolean z10) {
        if (richMessage == null) {
            richMessage = this.U;
        }
        n41 n41VarOf = RichMessageLayout.PreviewView.Factory.of(richMessage);
        n41VarOf.d = i10;
        n41VarOf.f30838e = z10;
        return n41VarOf;
    }

    public final void k0() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        boolean zI0 = i0();
        na naVar = this.f31853e;
        d0 d0Var = this.f27896t0;
        d0 d0Var2 = this.f27895s0;
        if (!zI0) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            CharSequence[] charSequenceArr = {this.T};
            tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            CharSequence charSequence4 = charSequenceArr[0];
            tL_textWithEntities.text = charSequence4 == null ? "" : charSequence4.toString();
            int selectedTab = d0Var2.getSelectedTab();
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
            if (selectedTab == 0) {
                tL_messages_composeMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f27891o0);
                tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(null);
                tL_messages_composeMessageWithAI.emojify = this.f27892p0;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
                if (selectedTone instanceof a0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    inputaicomposetonesingleuse.custom_prompt = TextUtils.isEmpty(this.E0) ? "" : this.E0;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.f22592id = tL_aiComposeTone.f22591id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeMessageWithAI.emojify = this.f27892p0;
            } else if (selectedTab == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI2 = this.O0[selectedTab];
            if (tL_messages_composeMessageWithAI2 != null && tL_messages_composeMessageWithAI2.proofread == tL_messages_composeMessageWithAI.proofread && tL_messages_composeMessageWithAI2.emojify == tL_messages_composeMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI2.tone, tL_messages_composeMessageWithAI.tone) && TextUtils.equals(tL_messages_composeMessageWithAI2.translate_to_lang, tL_messages_composeMessageWithAI.translate_to_lang)) {
                return;
            }
            if (tL_messages_composeMessageWithAI.emojify || tL_messages_composeMessageWithAI.proofread || tL_messages_composeMessageWithAI.tone != null || tL_messages_composeMessageWithAI.translate_to_lang != null) {
                this.N0 = true;
                this.F0 = false;
                p0(true);
                org.telegram.ui.ActionBar.h5 titleTextView = naVar.getTitleTextView();
                titleTextView.i(this.J0);
                this.J0.start();
                int selectedTab2 = d0Var2.getSelectedTab();
                CharSequence charSequence5 = this.T;
                if (selectedTab2 == 0 && (charSequence3 = this.W) != null) {
                    charSequence5 = charSequence3;
                }
                if (selectedTab2 == 1 && (charSequence2 = this.Z) != null) {
                    charSequence5 = charSequence2;
                }
                CharSequence charSequence6 = (selectedTab2 != 2 || (charSequence = this.f27880c0) == null) ? charSequence5 : charSequence;
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(64.0f);
                int i10 = this.backgroundPaddingLeft;
                int iB = h7.n.b(new StaticLayout(charSequence6, textPaint, (iDp - i10) - i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < iB; i11++) {
                    if (i11 > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    int iDp2 = AndroidUtilities.dp((int) (Math.random() * 50.0d));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
                    u80 u80Var = new u80(null, iDp2, 0, null);
                    u80Var.f33017f = AndroidUtilities.dp(6.0f);
                    u80Var.h = 0.5f;
                    u80Var.f33018n = true;
                    spannableStringBuilder.setSpan(u80Var, length, spannableStringBuilder.length(), 33);
                }
                if (selectedTab == 0) {
                    this.V = true;
                    this.W = spannableStringBuilder;
                } else if (selectedTab == 1) {
                    this.Y = true;
                    this.Z = spannableStringBuilder;
                } else if (selectedTab == 2) {
                    this.f27879b0 = true;
                    this.f27880c0 = spannableStringBuilder;
                }
                this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeMessageWithAI, new org.telegram.messenger.a(), new hh.j0(this, titleTextView, selectedTab, tL_messages_composeMessageWithAI, 4));
                this.K0.N(true);
                return;
            }
            return;
        }
        int selectedTab3 = d0Var2.getSelectedTab();
        String str3 = "";
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
        tL_messages_composeRichMessageWithAI.flags |= 16;
        TL_iv.RichMessage richMessage = this.U;
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage == null) {
            str = str3;
            str2 = null;
        } else {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i12 = 0; i12 < richMessage.blocks.size(); i12++) {
                tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i12)));
            }
            ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    TLRPC.Photo photo = arrayList2.get(i13);
                    i13++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    String str4 = str3;
                    tL_inputPhoto.f22399id = photo2.f22404id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                    str3 = str4;
                }
            }
            str = str3;
            str2 = null;
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                int size2 = arrayList4.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document = arrayList4.get(i14);
                    i14++;
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
        if (selectedTab3 == 0) {
            tL_messages_composeRichMessageWithAI.translate_to_lang = TranslateController.normalizeLanguage(this.f27891o0);
            tL_messages_composeRichMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault(str2);
            tL_messages_composeRichMessageWithAI.emojify = this.f27892p0;
        } else if (selectedTab3 == 1) {
            TL_aicompose.AiComposeTone selectedTone2 = d0Var.getSelectedTone();
            if (selectedTone2 instanceof a0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse2 = new TL_aicompose.inputAiComposeToneSingleUse();
                inputaicomposetonesingleuse2.custom_prompt = TextUtils.isEmpty(this.E0) ? str : this.E0;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid2 = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) selectedTone2;
                inputaicomposetoneid2.f22592id = tL_aiComposeTone2.f22591id;
                inputaicomposetoneid2.access_hash = tL_aiComposeTone2.access_hash;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid2;
            } else if (selectedTone2 instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault2 = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault2.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone2).tone;
                tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault2;
            }
            tL_messages_composeRichMessageWithAI.emojify = this.f27892p0;
        } else if (selectedTab3 == 2) {
            tL_messages_composeRichMessageWithAI.proofread = true;
        }
        TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.P0[selectedTab3];
        if (tL_messages_composeRichMessageWithAI2 != null && tL_messages_composeRichMessageWithAI2.proofread == tL_messages_composeRichMessageWithAI.proofread && tL_messages_composeRichMessageWithAI2.emojify == tL_messages_composeRichMessageWithAI.emojify && TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) && TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
            return;
        }
        if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
            this.N0 = true;
            this.F0 = false;
            p0(true);
            org.telegram.ui.ActionBar.h5 titleTextView2 = naVar.getTitleTextView();
            titleTextView2.i(this.J0);
            this.J0.start();
            if (selectedTab3 == 0) {
                this.V = true;
            } else if (selectedTab3 == 1) {
                this.Y = true;
            } else if (selectedTab3 == 2) {
                this.f27879b0 = true;
            }
            this.M0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_composeRichMessageWithAI, new org.telegram.messenger.a(), new hh.j0(this, titleTextView2, selectedTab3, tL_messages_composeRichMessageWithAI, 5));
            this.K0.N(true);
        }
    }

    public final void l0(int i10, int i11, boolean z10) {
        if (this.f27888k0 != null) {
            TL_iv.RichMessage richMessageG0 = g0();
            if (richMessageG0 != null) {
                this.f27888k0.run(richMessageG0, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        if (this.f27887j0 == null || h0() == null) {
            return;
        }
        this.f27887j0.run(h0(), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
    }

    public final void m0(Editable editable) {
        ?? spannableStringBuilder;
        int i10 = 9;
        int i11 = 0;
        if (com.google.android.recaptcha.internal.a.u(editable)) {
            spannableStringBuilder = new SpannableStringBuilder(editable.toString());
            Class[] clsArr = {yz0.class, CodeHighlighting.Span.class, lv0.class, u41.class, t41.class, q41.class, r41.class, v00.class, p41.class, o41.class, t5.class};
            for (int i12 = 0; i12 < 11; i12++) {
                for (Object obj : editable.getSpans(0, editable.length(), clsArr[i12])) {
                    spannableStringBuilder.setSpan(obj, editable.getSpanStart(obj), editable.getSpanEnd(obj), 33);
                }
            }
        } else {
            spannableStringBuilder = editable.toString();
        }
        this.T = spannableStringBuilder;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(editable.toString(), new a(this, i11), new org.telegram.ui.fr(i10));
        }
    }

    public final void n0(TL_iv.RichMessage richMessage) {
        this.U = richMessage;
        if (LanguageDetector.hasSupport()) {
            TL_iv.RichMessage richMessage2 = this.U;
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < richMessage2.blocks.size(); i10++) {
                if (i10 > 0) {
                    sb2.append("\n");
                }
                d0(richMessage2.blocks.get(i10), sb2);
            }
            LanguageDetector.detectLanguage(sb2.toString(), new a(this, 1), new org.telegram.ui.fr(10));
        }
        s0();
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        LinearLayout linearLayout = this.f27901y0;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final void p0(boolean z10) {
        boolean z11 = this.F0;
        lh.d dVar = this.A0;
        if (z11) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b(this, 0));
        } else {
            d0 d0Var = this.f27895s0;
            if ((d0Var != null ? d0Var.getSelectedTab() : 0) == 1 && (this.f27896t0.getSelectedTone() instanceof a0) && !TextUtils.equals(this.f27899w0.getText().toString(), this.E0)) {
                dVar.setText(LocaleController.getString(R.string.ArticleAIGenerate));
                dVar.setOnClickListener(new b(this, 1));
            } else if (this.f27884g0 == null && this.f27883f0 == null) {
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
        LinearLayout linearLayout = this.f27901y0;
        lh.d dVar2 = this.f27902z0;
        if (!z10) {
            dVar2.setVisibility(z12 ? 0 : 8);
            dVar2.setAlpha(this.G0 ? 1.0f : 0.0f);
            linearLayout.setVisibility(this.G0 ? 8 : 0);
            linearLayout.setAlpha(this.G0 ? 0.0f : 1.0f);
            return;
        }
        dVar2.setVisibility(0);
        linearLayout.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = dVar2.animate().alpha(this.G0 ? 1.0f : 0.0f);
        er erVar = er.h;
        viewPropertyAnimatorAlpha.setInterpolator(erVar).setDuration(320L).withEndAction(new c(this, 0)).start();
        linearLayout.animate().alpha(this.G0 ? 0.0f : 1.0f).setInterpolator(erVar).setDuration(320L).withEndAction(new c(this, 1)).start();
    }

    public final void q0() {
        String str = this.E0;
        org.telegram.ui.Cells.g3 g3Var = this.f27899w0;
        boolean zEquals = TextUtils.equals(str, g3Var.f24370b.getText().toString());
        boolean z10 = !zEquals;
        if (this.D0 == z10) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = g3Var.f24370b.animate();
        this.D0 = z10;
        viewPropertyAnimatorAnimate.alpha(!zEquals ? 1.0f : 0.5f).setDuration(320L).start();
        this.K0.N(true);
    }

    public final void r0() {
        zk0 zk0Var;
        View childAt;
        if (this.f27900x0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = zk0Var.getChildAt(i10);
            n41 n41VarG = this.K0.G(RecyclerView.R(childAt) - 1);
            if (n41VarG != null && n41VarG.f30837c == this.f27896t0) {
                break;
            } else {
                i10++;
            }
        }
        if (childAt == null) {
            this.f27900x0.setVisibility(4);
            this.f27900x0.e(true);
        } else {
            this.f27900x0.setVisibility(0);
            this.f27900x0.setTranslationY(childAt.getY() + zk0Var.getY() + childAt.getHeight());
        }
    }

    public final void s0() {
        d0 d0Var = this.f27896t0;
        TL_aicompose.AiComposeTone selectedTone = d0Var.getSelectedTone();
        d0Var.f27586c.removeAllViews();
        if (i0()) {
            d0Var.b(new a0(), new e(this, 0));
        }
        d0Var.b(null, new e(this, 0));
        ArrayList<TL_aicompose.AiComposeTone> arrayList = this.f27893q0.tones;
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
        super.show();
        na naVar = this.f31853e;
        if (naVar != null) {
            naVar.setTitle(z());
        }
        int i10 = (this.f27886i0 || (this.f27888k0 == null && this.f27887j0 == null)) ? 8 : 0;
        lh.d dVar = this.B0;
        dVar.setVisibility(i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Send));
        cq cqVar = new cq(this.f27886i0 ? R.drawable.filled_profile_edit_24 : R.drawable.send_plane_24, 0);
        cqVar.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 33);
        dVar.setText(spannableStringBuilder);
        this.K0.N(false);
        k0();
        p0(true);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new d(this, 0), this.resourcesProvider);
        this.K0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        if (this.I0 == null) {
            this.I0 = LocaleController.getString(R.string.AIEditor);
            oi0 oi0Var = new oi0(R.raw.emoji_stars, AndroidUtilities.dp(24.0f), "emoji_stars", AndroidUtilities.dp(24.0f));
            this.J0 = oi0Var;
            oi0Var.H(true);
            this.J0.I(1);
        }
        return this.I0;
    }
}
