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
public final class e51 extends cb {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence f25920a0;
    public boolean f25921b0;
    public CharSequence f25922c0;
    public xt f25923d0;
    public String f25924e0;
    public String f25925f0;
    public int f25926g0;
    public final String[] f25927h0;
    public final String[] f25928i0;
    public u61 f25929j0;
    public boolean f25930k0;
    public int f25931l0;

    public e51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, 2, d6Var);
        this.f25926g0 = 1;
        this.f25927h0 = new String[]{"formal", "neutral", "casual"};
        this.f25928i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f25930k0 = true;
        this.f25931l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f25302e.addView(imageView, w7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new v41(this, 2));
        String A = t41.A();
        this.f25925f0 = A;
        if (A == null) {
            this.f25925f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.i6.f20762a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 80));
        zl0 zl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.s1();
        this.d.setOnItemClickListener(new ai.n6(14, this, d6Var));
        s4.j jVar = new s4.j();
        jVar.f46563m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f25929j0.N(false);
    }

    public static void N(e51 e51Var, View view) {
        boolean z10;
        b80 F = b80.F(e51Var.container, e51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f24846t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(e51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(e51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < e51Var.f25927h0.length; i11++) {
            if (e51Var.f25926g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            e51Var.R(F, linearLayout, z10, e51Var.f25928i0[i11], new ld(e51Var, i11, 10));
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(e51Var.getContext(), e51Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(e51Var.f25925f0)) {
            e51Var.R(F, linearLayout, true, t41.y(t41.C(e51Var.f25925f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, e51Var.f25925f0)) {
                e51Var.R(F, linearLayout, false, language.displayName, new Runnable(e51Var) {
                    public final e51 f31287b;

                    {
                        this.f31287b = e51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e51 e51Var2 = this.f31287b;
                                e51Var2.S();
                                String str = language.code;
                                e51Var2.f25925f0 = str;
                                t41.G(str);
                                e51Var2.T();
                                return;
                            default:
                                e51 e51Var3 = this.f31287b;
                                e51Var3.S();
                                String str2 = language.code;
                                e51Var3.f25925f0 = str2;
                                t41.G(str2);
                                e51Var3.T();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(e51Var.getContext(), e51Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            e51Var.R(F, linearLayout, TextUtils.equals(language3.code, e51Var.f25925f0), language3.displayName, new Runnable(e51Var) {
                public final e51 f31287b;

                {
                    this.f31287b = e51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e51 e51Var2 = this.f31287b;
                            e51Var2.S();
                            String str = language3.code;
                            e51Var2.f25925f0 = str;
                            t41.G(str);
                            e51Var2.T();
                            return;
                        default:
                            e51 e51Var3 = this.f31287b;
                            e51Var3.S();
                            String str2 = language3.code;
                            e51Var3.f25925f0 = str2;
                            t41.G(str2);
                            e51Var3.T();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void O(e51 e51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(e51Var.containerView);
    }

    public static void P(e51 e51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        e51Var.f25931l0 = -1;
        ci.d dVar = e51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.r(e51Var.topBulletinContainer, e51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new v41(e51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            e51Var.f25922c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            e51Var.f25921b0 = false;
            e51Var.f25929j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new v41(e51Var, 1));
        }
    }

    public static void Q(e51 e51Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        g61 G = e51Var.f25929j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = e51Var.f25922c0;
                if (charSequence != null && !e51Var.f25921b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(e51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new rg.y0(e51Var.getContext(), 13, d6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(e51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                e51Var.dismiss();
            }
        }
    }

    @Override
    public final void A(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void R(b80 b80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        int i11 = org.telegram.ui.ActionBar.i6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(b80Var, z10, runnable, 1));
        linearLayout.addView(f1Var, w7.z5.n(-1, -2));
    }

    public final void S() {
        if (this.f25931l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25931l0, true);
            this.f25931l0 = -1;
        }
    }

    public final void T() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f25920a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f25923d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new v90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f25922c0 = spannableStringBuilder;
        this.f25921b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f25925f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f25926g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f25927h0[i10];
        }
        this.f25931l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new w41(this, 1));
        this.f25929j0.N(true);
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.Y;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void show() {
        super.show();
        ya yaVar = this.f25302e;
        if (yaVar != null) {
            yaVar.setTitle("Translate");
        }
        this.f25929j0.N(false);
        T();
        if (this.f25923d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new v41(this, 3));
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, 0, true, new w41(this, 0), this.resourcesProvider);
        this.f25929j0 = u61Var;
        u61Var.f31307r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
