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
public final class f41 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final di.d Z;
    public CharSequence f25929a0;
    public boolean f25930b0;
    public CharSequence f25931c0;
    public st f25932d0;
    public String f25933e0;
    public String f25934f0;
    public int f25935g0;
    public final String[] f25936h0;
    public final String[] f25937i0;
    public v51 f25938j0;
    public boolean f25939k0;
    public int f25940l0;

    public f41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        this.f25935g0 = 1;
        this.f25936h0 = new String[]{"formal", "neutral", "casual"};
        this.f25937i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f25939k0 = true;
        this.f25940l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f24674e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new w31(this, 2));
        String B = u31.B();
        this.f25934f0 = B;
        if (B == null) {
            this.f25934f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f20634a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        di.d dVar = new di.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, w7.x5.e(-1, -2, 80));
        ll0 ll0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new bi.x5(14, this, f6Var));
        s4.j jVar = new s4.j();
        jVar.f45805m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f25938j0.N(false);
    }

    public static void P(f41 f41Var, View view) {
        boolean z10;
        n70 F = n70.F(f41Var.container, f41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f28688t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(f41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(f41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < f41Var.f25936h0.length; i11++) {
            if (f41Var.f25935g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            f41Var.T(F, linearLayout, z10, f41Var.f25937i0[i11], new m8(f41Var, i11, 12));
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(f41Var.getContext(), f41Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.x5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(f41Var.f25934f0)) {
            f41Var.T(F, linearLayout, true, u31.y(u31.D(f41Var.f25934f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, f41Var.f25934f0)) {
                f41Var.T(F, linearLayout, false, language.displayName, new Runnable(f41Var) {
                    public final f41 f31114b;

                    {
                        this.f31114b = f41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                f41 f41Var2 = this.f31114b;
                                f41Var2.U();
                                String str = language.code;
                                f41Var2.f25934f0 = str;
                                u31.I(str);
                                f41Var2.V();
                                return;
                            default:
                                f41 f41Var3 = this.f31114b;
                                f41Var3.U();
                                String str2 = language.code;
                                f41Var3.f25934f0 = str2;
                                u31.I(str2);
                                f41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(f41Var.getContext(), f41Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            f41Var.T(F, linearLayout, TextUtils.equals(language3.code, f41Var.f25934f0), language3.displayName, new Runnable(f41Var) {
                public final f41 f31114b;

                {
                    this.f31114b = f41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            f41 f41Var2 = this.f31114b;
                            f41Var2.U();
                            String str = language3.code;
                            f41Var2.f25934f0 = str;
                            u31.I(str);
                            f41Var2.V();
                            return;
                        default:
                            f41 f41Var3 = this.f31114b;
                            f41Var3.U();
                            String str2 = language3.code;
                            f41Var3.f25934f0 = str2;
                            u31.I(str2);
                            f41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(f41 f41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(f41Var.containerView);
    }

    public static void R(f41 f41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        f41Var.f25940l0 = -1;
        di.d dVar = f41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.p6.q(f41Var.topBulletinContainer, f41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new w31(f41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            f41Var.f25931c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            f41Var.f25930b0 = false;
            f41Var.f25938j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new w31(f41Var, 1));
        }
    }

    public static void S(f41 f41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        h51 G = f41Var.f25938j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = f41Var.f25931c0;
                if (charSequence != null && !f41Var.f25930b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(f41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new sg.a1(f41Var.getContext(), 13, f6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(f41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                f41Var.dismiss();
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

    public final void T(n70 n70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new i(n70Var, z10, runnable, 1));
        linearLayout.addView(f1Var, w7.x5.n(-1, -2));
    }

    public final void U() {
        if (this.f25940l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25940l0, true);
            this.f25940l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f25929a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f25932d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new i90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f25931c0 = spannableStringBuilder;
        this.f25930b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f25934f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f25935g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f25936h0[i10];
        }
        this.f25940l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new x31(this, 1));
        this.f25938j0.N(true);
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
        xa xaVar = this.f24674e;
        if (xaVar != null) {
            xaVar.setTitle("Translate");
        }
        this.f25938j0.N(false);
        V();
        if (this.f25932d0 != null) {
            di.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new w31(this, 3));
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new x31(this, 0), this.resourcesProvider);
        this.f25938j0 = v51Var;
        v51Var.f31162r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
