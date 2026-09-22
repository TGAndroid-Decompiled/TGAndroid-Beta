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
public final class w41 extends ab {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence f29917a0;
    public boolean f29918b0;
    public CharSequence f29919c0;
    public ut f29920d0;
    public String f29921e0;
    public String f29922f0;
    public int f29923g0;
    public final String[] f29924h0;
    public final String[] f29925i0;
    public m61 f29926j0;
    public boolean f29927k0;
    public int f29928l0;

    public w41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        this.f29923g0 = 1;
        this.f29924h0 = new String[]{"formal", "neutral", "casual"};
        this.f29925i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f29927k0 = true;
        this.f29928l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.y5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.a6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n41(this, 2));
        String A = l41.A();
        this.f29922f0 = A;
        if (A == null) {
            this.f29922f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f19053a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, w7.y5.e(-1, -2, 80));
        yl0 yl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(14, this, f6Var));
        s4.j jVar = new s4.j();
        jVar.f43030m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f29926j0.N(false);
    }

    public static void P(w41 w41Var, View view) {
        boolean z10;
        y70 F = y70.F(w41Var.container, w41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f30569t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(w41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(w41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < w41Var.f29924h0.length; i11++) {
            if (w41Var.f29923g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            w41Var.T(F, linearLayout, z10, w41Var.f29925i0[i11], new kd(w41Var, i11, 11));
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(w41Var.getContext(), w41Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.y5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(w41Var.f29922f0)) {
            w41Var.T(F, linearLayout, true, l41.y(l41.D(w41Var.f29922f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, w41Var.f29922f0)) {
                w41Var.T(F, linearLayout, false, language.displayName, new Runnable(w41Var) {
                    public final w41 f26321b;

                    {
                        this.f26321b = w41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w41 w41Var2 = this.f26321b;
                                w41Var2.U();
                                String str = language.code;
                                w41Var2.f29922f0 = str;
                                l41.I(str);
                                w41Var2.V();
                                return;
                            default:
                                w41 w41Var3 = this.f26321b;
                                w41Var3.U();
                                String str2 = language.code;
                                w41Var3.f29922f0 = str2;
                                l41.I(str2);
                                w41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(w41Var.getContext(), w41Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, w7.y5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            w41Var.T(F, linearLayout, TextUtils.equals(language3.code, w41Var.f29922f0), language3.displayName, new Runnable(w41Var) {
                public final w41 f26321b;

                {
                    this.f26321b = w41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            w41 w41Var2 = this.f26321b;
                            w41Var2.U();
                            String str = language3.code;
                            w41Var2.f29922f0 = str;
                            l41.I(str);
                            w41Var2.V();
                            return;
                        default:
                            w41 w41Var3 = this.f26321b;
                            w41Var3.U();
                            String str2 = language3.code;
                            w41Var3.f29922f0 = str2;
                            l41.I(str2);
                            w41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(w41 w41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(w41Var.containerView);
    }

    public static void R(w41 w41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        w41Var.f29928l0 = -1;
        ci.d dVar = w41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.s(w41Var.topBulletinContainer, w41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new n41(w41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            w41Var.f29919c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            w41Var.f29918b0 = false;
            w41Var.f29926j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new n41(w41Var, 1));
        }
    }

    public static void S(w41 w41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        y51 G = w41Var.f29926j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = w41Var.f29919c0;
                if (charSequence != null && !w41Var.f29918b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(w41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new rg.x0(w41Var.getContext(), 13, f6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(w41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                w41Var.dismiss();
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

    public final void T(y70 y70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(y70Var, z10, runnable, 1));
        linearLayout.addView(f1Var, w7.y5.n(-1, -2));
    }

    public final void U() {
        if (this.f29928l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29928l0, true);
            this.f29928l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f29917a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f29920d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new s90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f29919c0 = spannableStringBuilder;
        this.f29918b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f29922f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f29923g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f29924h0[i10];
        }
        this.f29928l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new o41(this, 1));
        this.f29926j0.N(true);
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
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle("Translate");
        }
        this.f29926j0.N(false);
        V();
        if (this.f29920d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new n41(this, 3));
        }
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.currentAccount, 0, true, new o41(this, 0), this.resourcesProvider);
        this.f29926j0 = m61Var;
        m61Var.f26342r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
