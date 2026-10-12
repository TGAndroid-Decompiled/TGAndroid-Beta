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
public final class i51 extends db {
    public final ImageView X;
    public final FrameLayout Y;
    public final di.d Z;
    public CharSequence f25839a0;
    public boolean f25840b0;
    public CharSequence f25841c0;
    public hu f25842d0;
    public String f25843e0;
    public String f25844f0;
    public int f25845g0;
    public final String[] f25846h0;
    public final String[] f25847i0;
    public z61 f25848j0;
    public boolean f25849k0;
    public int f25850l0;

    public i51(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, 2, c6Var);
        this.f25845g0 = 1;
        this.f25846h0 = new String[]{"formal", "neutral", "casual"};
        this.f25847i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f25849k0 = true;
        this.f25850l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.a6.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.c6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new z41(this, 2));
        String D = x41.D();
        this.f25844f0 = D;
        if (D == null) {
            this.f25844f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        di.d dVar = new di.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams a2 = w7.a6.a(48.0f, 12.0f, 6.0f, 12.0f, 12.0f, -1, 119);
        int i12 = a2.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        a2.leftMargin = i12 + i13;
        a2.rightMargin += i13;
        frameLayout.addView(dVar, a2);
        this.containerView.addView(frameLayout, w7.a6.e(-1, -2, 80));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bi.z5(14, this, c6Var));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.f25848j0.N(false);
    }

    public static void Q(i51 i51Var, View view) {
        boolean z10;
        m80 F = m80.F(i51Var.container, i51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f27299t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(i51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(i51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < i51Var.f25846h0.length; i11++) {
            if (i51Var.f25845g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            i51Var.U(F, linearLayout, z10, i51Var.f25847i0[i11], new o8(i51Var, i11, 13));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(i51Var.getContext(), i51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.a6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(i51Var.f25844f0)) {
            i51Var.U(F, linearLayout, true, x41.A(x41.F(i51Var.f25844f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, i51Var.f25844f0)) {
                i51Var.U(F, linearLayout, false, language.displayName, new Runnable(i51Var) {
                    public final i51 f31495b;

                    {
                        this.f31495b = i51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i51 i51Var2 = this.f31495b;
                                i51Var2.V();
                                String str = language.code;
                                i51Var2.f25844f0 = str;
                                x41.J(str);
                                i51Var2.W();
                                return;
                            default:
                                i51 i51Var3 = this.f31495b;
                                i51Var3.V();
                                String str2 = language.code;
                                i51Var3.f25844f0 = str2;
                                x41.J(str2);
                                i51Var3.W();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(i51Var.getContext(), i51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.a6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            i51Var.U(F, linearLayout, TextUtils.equals(language3.code, i51Var.f25844f0), language3.displayName, new Runnable(i51Var) {
                public final i51 f31495b;

                {
                    this.f31495b = i51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            i51 i51Var2 = this.f31495b;
                            i51Var2.V();
                            String str = language3.code;
                            i51Var2.f25844f0 = str;
                            x41.J(str);
                            i51Var2.W();
                            return;
                        default:
                            i51 i51Var3 = this.f31495b;
                            i51Var3.V();
                            String str2 = language3.code;
                            i51Var3.f25844f0 = str2;
                            x41.J(str2);
                            i51Var3.W();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void R(i51 i51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(i51Var.containerView);
    }

    public static void S(i51 i51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        i51Var.f25850l0 = -1;
        di.d dVar = i51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.d0.r(i51Var.topBulletinContainer, i51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(i51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            i51Var.f25841c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            i51Var.f25840b0 = false;
            i51Var.f25848j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new z41(i51Var, 1));
        }
    }

    public static void T(i51 i51Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        l61 G = i51Var.f25848j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = i51Var.f25841c0;
                if (charSequence != null && !i51Var.f25840b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(i51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new sg.y0(i51Var.getContext(), 13, c6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(i51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                i51Var.dismiss();
            }
        }
    }

    @Override
    public final CharSequence A() {
        return "Translate";
    }

    @Override
    public final void D(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void U(m80 m80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.c(org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(m80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.a6.n(-1, -2));
    }

    public final void V() {
        if (this.f25850l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25850l0, true);
            this.f25850l0 = -1;
        }
    }

    public final void W() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f25839a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f25842d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ia0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f25841c0 = spannableStringBuilder;
        this.f25840b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f25844f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f25845g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f25846h0[i10];
        }
        this.f25850l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new a51(this, 1));
        this.f25848j0.N(true);
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
        za zaVar = this.e;
        if (zaVar != null) {
            zaVar.setTitle("Translate");
        }
        this.f25848j0.N(false);
        W();
        if (this.f25842d0 != null) {
            di.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new z41(this, 3));
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.currentAccount, 0, true, new a51(this, 0), this.resourcesProvider);
        this.f25848j0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
