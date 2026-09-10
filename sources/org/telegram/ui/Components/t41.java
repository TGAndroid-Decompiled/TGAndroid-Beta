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
public final class t41 extends ab {
    public final ImageView X;
    public final FrameLayout Y;
    public final bi.d Z;
    public CharSequence f27315a0;
    public boolean f27316b0;
    public CharSequence f27317c0;
    public yt f27318d0;
    public String f27319e0;
    public String f27320f0;
    public int f27321g0;
    public final String[] f27322h0;
    public final String[] f27323i0;
    public j61 f27324j0;
    public boolean f27325k0;
    public int f27326l0;

    public t41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        this.f27321g0 = 1;
        this.f27322h0 = new String[]{"formal", "neutral", "casual"};
        this.f27323i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f27325k0 = true;
        this.f27326l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.a6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.c6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new k41(this, 2));
        String A = i41.A();
        this.f27320f0 = A;
        if (A == null) {
            this.f27320f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, w7.a6.e(-1, -2, 80));
        vl0 vl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new ai.b0(13, this, f6Var));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f27324j0.N(false);
    }

    public static void P(t41 t41Var, View view) {
        boolean z10;
        w70 F = w70.F(t41Var.container, t41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f28702t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(t41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(t41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < t41Var.f27322h0.length; i11++) {
            if (t41Var.f27321g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            t41Var.T(F, linearLayout, z10, t41Var.f27323i0[i11], new zd(t41Var, i11, 10));
        }
        View m1Var = new org.telegram.ui.ActionBar.m1(t41Var.getContext(), t41Var.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, w7.a6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(t41Var.f27320f0)) {
            t41Var.T(F, linearLayout, true, i41.y(i41.D(t41Var.f27320f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, t41Var.f27320f0)) {
                t41Var.T(F, linearLayout, false, language.displayName, new Runnable(t41Var) {
                    public final t41 f24235b;

                    {
                        this.f24235b = t41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t41 t41Var2 = this.f24235b;
                                t41Var2.U();
                                String str = language.code;
                                t41Var2.f27320f0 = str;
                                i41.I(str);
                                t41Var2.V();
                                return;
                            default:
                                t41 t41Var3 = this.f24235b;
                                t41Var3.U();
                                String str2 = language.code;
                                t41Var3.f27320f0 = str2;
                                i41.I(str2);
                                t41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View m1Var2 = new org.telegram.ui.ActionBar.m1(t41Var.getContext(), t41Var.resourcesProvider);
        m1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var2, w7.a6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            t41Var.T(F, linearLayout, TextUtils.equals(language3.code, t41Var.f27320f0), language3.displayName, new Runnable(t41Var) {
                public final t41 f24235b;

                {
                    this.f24235b = t41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            t41 t41Var2 = this.f24235b;
                            t41Var2.U();
                            String str = language3.code;
                            t41Var2.f27320f0 = str;
                            i41.I(str);
                            t41Var2.V();
                            return;
                        default:
                            t41 t41Var3 = this.f24235b;
                            t41Var3.U();
                            String str2 = language3.code;
                            t41Var3.f27320f0 = str2;
                            i41.I(str2);
                            t41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(t41 t41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(t41Var.containerView);
    }

    public static void R(t41 t41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        t41Var.f27326l0 = -1;
        bi.d dVar = t41Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.r6.q(t41Var.topBulletinContainer, t41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new k41(t41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            t41Var.f27317c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            t41Var.f27316b0 = false;
            t41Var.f27324j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new k41(t41Var, 1));
        }
    }

    public static void S(t41 t41Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        v51 G = t41Var.f27324j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = t41Var.f27317c0;
                if (charSequence != null && !t41Var.f27316b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(t41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new qg.a1(t41Var.getContext(), 13, f6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(t41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                t41Var.dismiss();
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
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new i(w70Var, z10, runnable, 1));
        linearLayout.addView(g1Var, w7.a6.n(-1, -2));
    }

    public final void U() {
        if (this.f27326l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27326l0, true);
            this.f27326l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f27315a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f27318d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new r90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f27317c0 = spannableStringBuilder;
        this.f27316b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f27320f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f27321g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f27322h0[i10];
        }
        this.f27326l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new l41(this, 1));
        this.f27324j0.N(true);
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
        this.f27324j0.N(false);
        V();
        if (this.f27318d0 != null) {
            bi.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new k41(this, 3));
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new l41(this, 0), this.resourcesProvider);
        this.f27324j0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
