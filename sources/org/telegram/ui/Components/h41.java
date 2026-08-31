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
public final class h41 extends sa {
    public final ImageView U;
    public final FrameLayout V;
    public final qh.d W;
    public CharSequence X;
    public boolean Y;
    public CharSequence Z;
    public st f27376a0;
    public String f27377b0;
    public String f27378c0;
    public int f27379d0;
    public final String[] f27380e0;
    public final String[] f27381f0;
    public x51 f27382g0;
    public boolean f27383h0;
    public int f27384i0;

    public h41(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, false, false, 2, g6Var);
        this.f27379d0 = 1;
        this.f27380e0 = new String[]{"formal", "neutral", "casual"};
        this.f27381f0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f27383h0 = true;
        this.f27384i0 = -1;
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f31015e.addView(imageView, k7.c6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new y31(this, 2));
        String B = w31.B();
        this.f27378c0 = B;
        if (B == null) {
            this.f27378c0 = TranslateController.currentLanguage();
        }
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        qh.d dVar = new qh.d(context, g6Var, true);
        dVar.setRoundRadius(24);
        this.W = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, k7.c6.e(-1, -2, 80));
        tl0 tl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new hg.v0(14, this, g6Var));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f27382g0.N(false);
    }

    public static void P(h41 h41Var, View view) {
        boolean z4;
        q70 F = q70.F(h41Var.container, h41Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f30330t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(h41Var.getContext());
        LinearLayout linearLayout = new LinearLayout(h41Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < h41Var.f27380e0.length; i11++) {
            if (h41Var.f27379d0 == i11) {
                z4 = true;
            } else {
                z4 = false;
            }
            h41Var.T(F, linearLayout, z4, h41Var.f27381f0[i11], new jm(h41Var, i11, 9));
        }
        View m1Var = new org.telegram.ui.ActionBar.m1(h41Var.getContext(), h41Var.resourcesProvider);
        m1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var, k7.c6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(h41Var.f27378c0)) {
            h41Var.T(F, linearLayout, true, w31.y(w31.D(h41Var.f27378c0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, h41Var.f27378c0)) {
                h41Var.T(F, linearLayout, false, language.displayName, new Runnable(h41Var) {
                    public final h41 f32942b;

                    {
                        this.f32942b = h41Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                h41 h41Var2 = this.f32942b;
                                h41Var2.U();
                                String str = language.code;
                                h41Var2.f27378c0 = str;
                                w31.H(str);
                                h41Var2.V();
                                return;
                            default:
                                h41 h41Var3 = this.f32942b;
                                h41Var3.U();
                                String str2 = language.code;
                                h41Var3.f27378c0 = str2;
                                w31.H(str2);
                                h41Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View m1Var2 = new org.telegram.ui.ActionBar.m1(h41Var.getContext(), h41Var.resourcesProvider);
        m1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(m1Var2, k7.c6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            h41Var.T(F, linearLayout, TextUtils.equals(language3.code, h41Var.f27378c0), language3.displayName, new Runnable(h41Var) {
                public final h41 f32942b;

                {
                    this.f32942b = h41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            h41 h41Var2 = this.f32942b;
                            h41Var2.U();
                            String str = language3.code;
                            h41Var2.f27378c0 = str;
                            w31.H(str);
                            h41Var2.V();
                            return;
                        default:
                            h41 h41Var3 = this.f32942b;
                            h41Var3.U();
                            String str2 = language3.code;
                            h41Var3.f27378c0 = str2;
                            w31.H(str2);
                            h41Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(h41 h41Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(h41Var.containerView);
    }

    public static void R(h41 h41Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        h41Var.f27384i0 = -1;
        qh.d dVar = h41Var.W;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.yh.u(h41Var.topBulletinContainer, h41Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new y31(h41Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            h41Var.Z = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            h41Var.Y = false;
            h41Var.f27382g0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new y31(h41Var, 1));
        }
    }

    public static void S(h41 h41Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        j51 G = h41Var.f27382g0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = h41Var.Z;
                if (charSequence != null && !h41Var.Y) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(h41Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new fg.n1(h41Var.getContext(), 13, g6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(h41Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                h41Var.dismiss();
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

    public final void T(q70 q70Var, LinearLayout linearLayout, boolean z4, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        int i11 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z4);
        g1Var.c(org.telegram.ui.ActionBar.k6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(q70Var, z4, runnable, 1));
        linearLayout.addView(g1Var, k7.c6.n(-1, -2));
    }

    public final void U() {
        if (this.f27384i0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f27384i0, true);
            this.f27384i0 = -1;
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
        if (this.f27376a0 != null) {
            this.W.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new l90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Z = spannableStringBuilder;
        this.Y = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f27378c0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f27379d0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f27380e0[i10];
        }
        this.f27384i0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new z31(this, 1));
        this.f27382g0.N(true);
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
        pa paVar = this.f31015e;
        if (paVar != null) {
            paVar.setTitle("Translate");
        }
        this.f27382g0.N(false);
        V();
        if (this.f27376a0 != null) {
            qh.d dVar = this.W;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new y31(this, 3));
        }
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new z31(this, 0), this.resourcesProvider);
        this.f27382g0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
