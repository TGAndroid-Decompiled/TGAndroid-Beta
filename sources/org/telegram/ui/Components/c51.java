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
public final class c51 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final ei.d Z;
    public CharSequence f25088a0;
    public boolean f25089b0;
    public CharSequence f25090c0;
    public du f25091d0;
    public String f25092e0;
    public String f25093f0;
    public int f25094g0;
    public final String[] f25095h0;
    public final String[] f25096i0;
    public s61 f25097j0;
    public boolean f25098k0;
    public int f25099l0;

    public c51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, 2, d6Var);
        this.f25094g0 = 1;
        this.f25095h0 = new String[]{"formal", "neutral", "casual"};
        this.f25096i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f25098k0 = true;
        this.f25099l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.z5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new t41(this, 2));
        String C = r41.C();
        this.f25093f0 = C;
        if (C == null) {
            this.f25093f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.h6.f20928a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 12.0f, 6.0f, 12.0f, 12.0f, -1, 119);
        int i12 = a2.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        a2.leftMargin = i12 + i13;
        a2.rightMargin += i13;
        frameLayout.addView(dVar, a2);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 80));
        im0 im0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        im0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ci.y4(14, this, d6Var));
        s4.k kVar = new s4.k();
        kVar.f45972m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.f25097j0.N(false);
    }

    public static void Q(c51 c51Var, View view) {
        boolean z10;
        i80 F = i80.F(c51Var.container, c51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f27135t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(c51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(c51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < c51Var.f25095h0.length; i11++) {
            if (c51Var.f25094g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            c51Var.U(F, linearLayout, z10, c51Var.f25096i0[i11], new e2(c51Var, i11, 13));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(c51Var.getContext(), c51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(c51Var.f25093f0)) {
            c51Var.U(F, linearLayout, true, r41.A(r41.F(c51Var.f25093f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, c51Var.f25093f0)) {
                c51Var.U(F, linearLayout, false, language.displayName, new Runnable(c51Var) {
                    public final c51 f30193b;

                    {
                        this.f30193b = c51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c51 c51Var2 = this.f30193b;
                                c51Var2.V();
                                String str = language.code;
                                c51Var2.f25093f0 = str;
                                r41.J(str);
                                c51Var2.W();
                                return;
                            default:
                                c51 c51Var3 = this.f30193b;
                                c51Var3.V();
                                String str2 = language.code;
                                c51Var3.f25093f0 = str2;
                                r41.J(str2);
                                c51Var3.W();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(c51Var.getContext(), c51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            c51Var.U(F, linearLayout, TextUtils.equals(language3.code, c51Var.f25093f0), language3.displayName, new Runnable(c51Var) {
                public final c51 f30193b;

                {
                    this.f30193b = c51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c51 c51Var2 = this.f30193b;
                            c51Var2.V();
                            String str = language3.code;
                            c51Var2.f25093f0 = str;
                            r41.J(str);
                            c51Var2.W();
                            return;
                        default:
                            c51 c51Var3 = this.f30193b;
                            c51Var3.V();
                            String str2 = language3.code;
                            c51Var3.f25093f0 = str2;
                            r41.J(str2);
                            c51Var3.W();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void R(c51 c51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(c51Var.containerView);
    }

    public static void S(c51 c51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        c51Var.f25099l0 = -1;
        ei.d dVar = c51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.t0.t(c51Var.topBulletinContainer, c51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new t41(c51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            c51Var.f25090c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            c51Var.f25089b0 = false;
            c51Var.f25097j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new t41(c51Var, 1));
        }
    }

    public static void T(c51 c51Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        f61 G = c51Var.f25097j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = c51Var.f25090c0;
                if (charSequence != null && !c51Var.f25089b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(c51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new sg.x0(c51Var.getContext(), 13, d6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(c51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                c51Var.dismiss();
            }
        }
    }

    @Override
    public final CharSequence A() {
        return "Translate";
    }

    @Override
    public final void C(float f7) {
        float f10 = 1.0f - f7;
        ImageView imageView = this.X;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void U(i80 i80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.c(org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(i80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.z5.n(-1, -2));
    }

    public final void V() {
        if (this.f25099l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25099l0, true);
            this.f25099l0 = -1;
        }
    }

    public final void W() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f25088a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f25091d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ca0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f25090c0 = spannableStringBuilder;
        this.f25089b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f25093f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f25094g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f25095h0[i10];
        }
        this.f25099l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new u41(this, 1));
        this.f25097j0.N(true);
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
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle("Translate");
        }
        this.f25097j0.N(false);
        W();
        if (this.f25091d0 != null) {
            ei.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new t41(this, 3));
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(im0Var, getContext(), this.currentAccount, 0, true, new u41(this, 0), this.resourcesProvider);
        this.f25097j0 = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }
}
