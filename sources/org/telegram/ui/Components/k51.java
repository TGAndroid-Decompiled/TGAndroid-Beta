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
public final class k51 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final ei.d Z;
    public CharSequence f27873a0;
    public boolean f27874b0;
    public CharSequence f27875c0;
    public du f27876d0;
    public String f27877e0;
    public String f27878f0;
    public int f27879g0;
    public final String[] f27880h0;
    public final String[] f27881i0;
    public b71 f27882j0;
    public boolean f27883k0;
    public int f27884l0;
    public int m0;
    public int f27885n0;

    public k51(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, 2, g6Var);
        this.f27879g0 = 1;
        this.f27880h0 = new String[]{"formal", "neutral", "casual"};
        this.f27881i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f27883k0 = true;
        this.f27884l0 = -1;
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
        imageView.setOnClickListener(new a51(this, 2));
        String L = y41.L();
        this.f27878f0 = L;
        if (L == null) {
            this.f27878f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
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
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new ci.x4(14, this, g6Var));
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.f27882j0.N(false);
    }

    public static void P(k51 k51Var, View view) {
        boolean z10;
        j80 F = j80.F(k51Var.container, k51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f27581t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(k51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(k51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < k51Var.f27880h0.length; i11++) {
            if (k51Var.f27879g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            k51Var.T(F, linearLayout, z10, k51Var.f27881i0[i11], new d2(k51Var, i11, 13));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(k51Var.getContext(), k51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(k51Var.f27878f0)) {
            k51Var.T(F, linearLayout, true, y41.J(y41.N(k51Var.f27878f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, k51Var.f27878f0)) {
                k51Var.T(F, linearLayout, false, language.displayName, new Runnable(k51Var) {
                    public final k51 f33142b;

                    {
                        this.f33142b = k51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k51 k51Var2 = this.f33142b;
                                k51Var2.U();
                                String str = language.code;
                                k51Var2.f27878f0 = str;
                                y41.R(str);
                                k51Var2.V();
                                return;
                            default:
                                k51 k51Var3 = this.f33142b;
                                k51Var3.U();
                                String str2 = language.code;
                                k51Var3.f27878f0 = str2;
                                y41.R(str2);
                                k51Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(k51Var.getContext(), k51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            k51Var.T(F, linearLayout, TextUtils.equals(language3.code, k51Var.f27878f0), language3.displayName, new Runnable(k51Var) {
                public final k51 f33142b;

                {
                    this.f33142b = k51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k51 k51Var2 = this.f33142b;
                            k51Var2.U();
                            String str = language3.code;
                            k51Var2.f27878f0 = str;
                            y41.R(str);
                            k51Var2.V();
                            return;
                        default:
                            k51 k51Var3 = this.f33142b;
                            k51Var3.U();
                            String str2 = language3.code;
                            k51Var3.f27878f0 = str2;
                            y41.R(str2);
                            k51Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(k51 k51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(k51Var.containerView);
    }

    public static void R(k51 k51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        k51Var.f27884l0 = -1;
        ei.d dVar = k51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.b1.s(k51Var.topBulletinContainer, k51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new a51(k51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            k51Var.f27875c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            k51Var.f27874b0 = false;
            k51Var.f27882j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new a51(k51Var, 1));
        }
    }

    public static void S(k51 k51Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        m61 G = k51Var.f27882j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = k51Var.f27875c0;
                if (charSequence != null && !k51Var.f27874b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(k51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new sg.y0(k51Var.getContext(), 13, g6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(k51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                k51Var.dismiss();
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

    public final void T(j80 j80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.d(org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.k6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(j80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.z5.n(-1, -2));
    }

    public final void U() {
        if (this.f27884l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27884l0, true);
            this.f27884l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f27873a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f27876d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new da0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f27875c0 = spannableStringBuilder;
        this.f27874b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f27878f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f27879g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f27880h0[i10];
        }
        this.f27884l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new b51(this, 1));
        this.f27882j0.N(true);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
            if (themedColor != this.f27885n0) {
                this.f27885n0 = themedColor;
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
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle("Translate");
        }
        this.f27882j0.N(false);
        V();
        if (this.f27876d0 != null) {
            ei.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new a51(this, 3));
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new b51(this, 0), this.resourcesProvider);
        this.f27882j0 = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return "Translate";
    }
}
