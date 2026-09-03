package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class g41 extends sa {
    public final ImageView U;
    public final FrameLayout V;
    public final ph.d W;
    public CharSequence X;
    public boolean Y;
    public CharSequence Z;
    public pt f25042a0;
    public String f25043b0;
    public String f25044c0;
    public int f25045d0;
    public final String[] f25046e0;
    public final String[] f25047f0;
    public w51 f25048g0;
    public boolean f25049h0;
    public int f25050i0;

    public g41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, false, false, false, 2, f6Var);
        this.f25045d0 = 1;
        this.f25046e0 = new String[]{"formal", "neutral", "casual"};
        this.f25047f0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f25049h0 = true;
        this.f25050i0 = -1;
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, k7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.d6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new x31(this, 2));
        String B = v31.B();
        this.f25044c0 = B;
        if (B == null) {
            this.f25044c0 = TranslateController.currentLanguage();
        }
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f19827a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.W = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, k7.b6.e(-1, -2, 80));
        rl0 rl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new gg.v0(15, this, f6Var));
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f25048g0.N(false);
    }

    public static void P(g41 g41Var, View view) {
        boolean z4;
        p70 F = p70.F(g41Var.container, g41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f27778t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(g41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(g41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < g41Var.f25046e0.length; i11++) {
            if (g41Var.f25045d0 == i11) {
                z4 = true;
            } else {
                z4 = false;
            }
            g41Var.T(F, linearLayout, z4, g41Var.f25047f0[i11], new dw(g41Var, i11, 8));
        }
        View m1Var = new org.telegram.ui.ActionBar.m1(g41Var.getContext(), g41Var.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, k7.b6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(g41Var.f25044c0)) {
            g41Var.T(F, linearLayout, true, v31.y(v31.D(g41Var.f25044c0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, g41Var.f25044c0)) {
                g41Var.T(F, linearLayout, false, language.displayName, new Runnable(g41Var) {
                    public final g41 f30140b;

                    {
                        this.f30140b = g41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                g41 g41Var2 = this.f30140b;
                                g41Var2.U();
                                String str = language.code;
                                g41Var2.f25044c0 = str;
                                v31.H(str);
                                g41Var2.V();
                                return;
                            default:
                                g41 g41Var3 = this.f30140b;
                                g41Var3.U();
                                String str2 = language.code;
                                g41Var3.f25044c0 = str2;
                                v31.H(str2);
                                g41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View m1Var2 = new org.telegram.ui.ActionBar.m1(g41Var.getContext(), g41Var.resourcesProvider);
        m1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var2, k7.b6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            g41Var.T(F, linearLayout, TextUtils.equals(language3.code, g41Var.f25044c0), language3.displayName, new Runnable(g41Var) {
                public final g41 f30140b;

                {
                    this.f30140b = g41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            g41 g41Var2 = this.f30140b;
                            g41Var2.U();
                            String str = language3.code;
                            g41Var2.f25044c0 = str;
                            v31.H(str);
                            g41Var2.V();
                            return;
                        default:
                            g41 g41Var3 = this.f30140b;
                            g41Var3.U();
                            String str2 = language3.code;
                            g41Var3.f25044c0 = str2;
                            v31.H(str2);
                            g41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(g41 g41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(g41Var.containerView);
    }

    public static void R(g41 g41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        g41Var.f25050i0 = -1;
        ph.d dVar = g41Var.W;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.ai.u(g41Var.topBulletinContainer, g41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            g41Var.Z = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            g41Var.Y = false;
            g41Var.f25048g0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new x31(g41Var, 1));
        }
    }

    public static void S(g41 g41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        i51 G = g41Var.f25048g0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = g41Var.Z;
                if (charSequence != null && !g41Var.Y) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(g41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new eg.o1(g41Var.getContext(), 13, f6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(g41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                g41Var.dismiss();
            }
        }
    }

    @Override
    public final void B(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.U;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void T(p70 p70Var, LinearLayout linearLayout, boolean z4, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z4);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(p70Var, z4, runnable, 1));
        linearLayout.addView(g1Var, k7.b6.n(-1, -2));
    }

    public final void U() {
        if (this.f25050i0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25050i0, true);
            this.f25050i0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.X};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f25042a0 != null) {
            this.W.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new k90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Z = spannableStringBuilder;
        this.Y = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f25044c0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f25045d0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f25046e0[i10];
        }
        this.f25050i0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new y31(this, 1));
        this.f25048g0.N(true);
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.V;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void show() {
        super.show();
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle("Translate");
        }
        this.f25048g0.N(false);
        V();
        if (this.f25042a0 != null) {
            ph.d dVar = this.W;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new x31(this, 3));
        }
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new y31(this, 0), this.resourcesProvider);
        this.f25048g0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
