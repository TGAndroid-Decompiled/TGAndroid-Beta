package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
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
public final class j51 extends za {
    public final ImageView X;
    public final FrameLayout Y;
    public final ei.d Z;
    public CharSequence f27564a0;
    public boolean f27565b0;
    public CharSequence f27566c0;
    public bu f27567d0;
    public String f27568e0;
    public String f27569f0;
    public int f27570g0;
    public final String[] f27571h0;
    public final String[] f27572i0;
    public a71 f27573j0;
    public boolean f27574k0;
    public int f27575l0;
    public int m0;
    public int f27576n0;

    public j51(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, 2, g6Var);
        this.f27570g0 = 1;
        this.f27571h0 = new String[]{"formal", "neutral", "casual"};
        this.f27572i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f27574k0 = true;
        this.f27575l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
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
        imageView.setOnClickListener(new z41(this, 2));
        String L = x41.L();
        this.f27569f0 = L;
        if (L == null) {
            this.f27569f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21126a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ei.d dVar = new ei.d(context, g6Var, true);
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
        lm0 lm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new ci.x4(14, this, g6Var));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.f27573j0.N(false);
    }

    public static void P(j51 j51Var, View view) {
        boolean z10;
        h80 F = h80.F(j51Var.container, j51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f26930t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(j51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(j51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < j51Var.f27571h0.length; i11++) {
            if (j51Var.f27570g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            j51Var.T(F, linearLayout, z10, j51Var.f27572i0[i11], new c2(j51Var, i11, 13));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(j51Var.getContext(), j51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(j51Var.f27569f0)) {
            j51Var.T(F, linearLayout, true, x41.J(x41.N(j51Var.f27569f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, j51Var.f27569f0)) {
                j51Var.T(F, linearLayout, false, language.displayName, new Runnable(j51Var) {
                    public final j51 f32820b;

                    {
                        this.f32820b = j51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                j51 j51Var2 = this.f32820b;
                                j51Var2.U();
                                String str = language.code;
                                j51Var2.f27569f0 = str;
                                x41.R(str);
                                j51Var2.V();
                                return;
                            default:
                                j51 j51Var3 = this.f32820b;
                                j51Var3.U();
                                String str2 = language.code;
                                j51Var3.f27569f0 = str2;
                                x41.R(str2);
                                j51Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(j51Var.getContext(), j51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            j51Var.T(F, linearLayout, TextUtils.equals(language3.code, j51Var.f27569f0), language3.displayName, new Runnable(j51Var) {
                public final j51 f32820b;

                {
                    this.f32820b = j51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            j51 j51Var2 = this.f32820b;
                            j51Var2.U();
                            String str = language3.code;
                            j51Var2.f27569f0 = str;
                            x41.R(str);
                            j51Var2.V();
                            return;
                        default:
                            j51 j51Var3 = this.f32820b;
                            j51Var3.U();
                            String str2 = language3.code;
                            j51Var3.f27569f0 = str2;
                            x41.R(str2);
                            j51Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(j51 j51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(j51Var.containerView);
    }

    public static void R(j51 j51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        j51Var.f27575l0 = -1;
        ei.d dVar = j51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.b1.s(j51Var.topBulletinContainer, j51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(j51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            j51Var.f27566c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            j51Var.f27565b0 = false;
            j51Var.f27573j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(j51Var, 1));
        }
    }

    public static void S(j51 j51Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        l61 G = j51Var.f27573j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = j51Var.f27566c0;
                if (charSequence != null && !j51Var.f27565b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(j51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new sg.y0(j51Var.getContext(), 13, g6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(j51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                j51Var.dismiss();
            }
        }
    }

    @Override
    public final void B(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void T(h80 h80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.k6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(h80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.z5.n(-1, -2));
    }

    public final void U() {
        if (this.f27575l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27575l0, true);
            this.f27575l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f27564a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f27567d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ba0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f27566c0 = spannableStringBuilder;
        this.f27565b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f27569f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f27570g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f27571h0[i10];
        }
        this.f27575l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new a51(this, 1));
        this.f27573j0.N(true);
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            if (themedColor != this.f27576n0) {
                this.f27576n0 = themedColor;
                setBackgroundColor(themedColor);
            }
            FrameLayout frameLayout = this.Y;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && themedColor != this.m0) {
                this.m0 = themedColor;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle("Translate");
        }
        this.f27573j0.N(false);
        V();
        if (this.f27567d0 != null) {
            ei.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new z41(this, 3));
        }
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new a51(this, 0), this.resourcesProvider);
        this.f27573j0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return "Translate";
    }
}
