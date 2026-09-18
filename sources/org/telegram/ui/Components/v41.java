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
public final class v41 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence f28915a0;
    public boolean f28916b0;
    public CharSequence f28917c0;
    public ut f28918d0;
    public String f28919e0;
    public String f28920f0;
    public int f28921g0;
    public final String[] f28922h0;
    public final String[] f28923i0;
    public l61 f28924j0;
    public boolean f28925k0;
    public int f28926l0;

    public v41(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
        this.f28921g0 = 1;
        this.f28922h0 = new String[]{"formal", "neutral", "casual"};
        this.f28923i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f28925k0 = true;
        this.f28926l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.y5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.a6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new m41(this, 2));
        String A = k41.A();
        this.f28920f0 = A;
        if (A == null) {
            this.f28920f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f19006a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, e6Var, true);
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
        wl0 wl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(14, this, e6Var));
        s4.j jVar = new s4.j();
        jVar.f42964m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f28924j0.N(false);
    }

    public static void P(v41 v41Var, View view) {
        boolean z10;
        w70 F = w70.F(v41Var.container, v41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f29925t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(v41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(v41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < v41Var.f28922h0.length; i11++) {
            if (v41Var.f28921g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            v41Var.T(F, linearLayout, z10, v41Var.f28923i0[i11], new x2(v41Var, i11, 13));
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(v41Var.getContext(), v41Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, w7.y5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(v41Var.f28920f0)) {
            v41Var.T(F, linearLayout, true, k41.y(k41.E(v41Var.f28920f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, v41Var.f28920f0)) {
                v41Var.T(F, linearLayout, false, language.displayName, new Runnable(v41Var) {
                    public final v41 f26022b;

                    {
                        this.f26022b = v41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v41 v41Var2 = this.f26022b;
                                v41Var2.U();
                                String str = language.code;
                                v41Var2.f28920f0 = str;
                                k41.I(str);
                                v41Var2.V();
                                return;
                            default:
                                v41 v41Var3 = this.f26022b;
                                v41Var3.U();
                                String str2 = language.code;
                                v41Var3.f28920f0 = str2;
                                k41.I(str2);
                                v41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(v41Var.getContext(), v41Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, w7.y5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            v41Var.T(F, linearLayout, TextUtils.equals(language3.code, v41Var.f28920f0), language3.displayName, new Runnable(v41Var) {
                public final v41 f26022b;

                {
                    this.f26022b = v41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v41 v41Var2 = this.f26022b;
                            v41Var2.U();
                            String str = language3.code;
                            v41Var2.f28920f0 = str;
                            k41.I(str);
                            v41Var2.V();
                            return;
                        default:
                            v41 v41Var3 = this.f26022b;
                            v41Var3.U();
                            String str2 = language3.code;
                            v41Var3.f28920f0 = str2;
                            k41.I(str2);
                            v41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(v41 v41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(v41Var.containerView);
    }

    public static void R(v41 v41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        v41Var.f28926l0 = -1;
        ci.d dVar = v41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.p(v41Var.topBulletinContainer, v41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new m41(v41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            v41Var.f28917c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            v41Var.f28916b0 = false;
            v41Var.f28924j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new m41(v41Var, 1));
        }
    }

    public static void S(v41 v41Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        x51 G = v41Var.f28924j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = v41Var.f28917c0;
                if (charSequence != null && !v41Var.f28916b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(v41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new rg.x0(v41Var.getContext(), 13, e6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(v41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                v41Var.dismiss();
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

    public final void T(w70 w70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        int i11 = org.telegram.ui.ActionBar.j6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(w70Var, z10, runnable, 1));
        linearLayout.addView(f1Var, w7.y5.n(-1, -2));
    }

    public final void U() {
        if (this.f28926l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f28926l0, true);
            this.f28926l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f28915a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f28918d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new q90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f28917c0 = spannableStringBuilder;
        this.f28916b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f28920f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f28921g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f28922h0[i10];
        }
        this.f28926l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new n41(this, 1));
        this.f28924j0.N(true);
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
        this.f28924j0.N(false);
        V();
        if (this.f28918d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new m41(this, 3));
        }
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(wl0Var, getContext(), this.currentAccount, 0, true, new n41(this, 0), this.resourcesProvider);
        this.f28924j0 = l61Var;
        l61Var.f26042r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
