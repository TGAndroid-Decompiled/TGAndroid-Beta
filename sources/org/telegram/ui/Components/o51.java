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
public final class o51 extends db {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence f29261a0;
    public boolean f29262b0;
    public CharSequence f29263c0;
    public lu f29264d0;
    public String f29265e0;
    public String f29266f0;
    public int f29267g0;
    public final String[] f29268h0;
    public final String[] f29269i0;
    public e71 f29270j0;
    public boolean f29271k0;
    public int f29272l0;

    public o51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, 2, d6Var);
        this.f29267g0 = 1;
        this.f29268h0 = new String[]{"formal", "neutral", "casual"};
        this.f29269i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f29271k0 = true;
        this.f29272l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.f25521e.addView(imageView, w7.x5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new f51(this, 2));
        String D = d51.D();
        this.f29266f0 = D;
        if (D == null) {
            this.f29266f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.h6.f20730a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 12.0f, 6.0f, 12.0f, 12.0f, -1, 119);
        int i12 = a2.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        a2.leftMargin = i12 + i13;
        a2.rightMargin += i13;
        frameLayout.addView(dVar, a2);
        this.containerView.addView(frameLayout, w7.x5.e(-1, -2, 80));
        sm0 sm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ai.o6(14, this, d6Var));
        s4.j jVar = new s4.j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f29270j0.N(false);
    }

    public static void Q(o51 o51Var, View view) {
        boolean z10;
        q80 F = q80.F(o51Var.container, o51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f30084t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(o51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(o51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < o51Var.f29268h0.length; i11++) {
            if (o51Var.f29267g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            o51Var.U(F, linearLayout, z10, o51Var.f29269i0[i11], new nd(o51Var, i11, 12));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(o51Var.getContext(), o51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.x5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(o51Var.f29266f0)) {
            o51Var.U(F, linearLayout, true, d51.B(d51.F(o51Var.f29266f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, o51Var.f29266f0)) {
                o51Var.U(F, linearLayout, false, language.displayName, new Runnable(o51Var) {
                    public final o51 f25873b;

                    {
                        this.f25873b = o51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                o51 o51Var2 = this.f25873b;
                                o51Var2.V();
                                String str = language.code;
                                o51Var2.f29266f0 = str;
                                d51.J(str);
                                o51Var2.W();
                                return;
                            default:
                                o51 o51Var3 = this.f25873b;
                                o51Var3.V();
                                String str2 = language.code;
                                o51Var3.f29266f0 = str2;
                                d51.J(str2);
                                o51Var3.W();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(o51Var.getContext(), o51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            o51Var.U(F, linearLayout, TextUtils.equals(language3.code, o51Var.f29266f0), language3.displayName, new Runnable(o51Var) {
                public final o51 f25873b;

                {
                    this.f25873b = o51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            o51 o51Var2 = this.f25873b;
                            o51Var2.V();
                            String str = language3.code;
                            o51Var2.f29266f0 = str;
                            d51.J(str);
                            o51Var2.W();
                            return;
                        default:
                            o51 o51Var3 = this.f25873b;
                            o51Var3.V();
                            String str2 = language3.code;
                            o51Var3.f29266f0 = str2;
                            d51.J(str2);
                            o51Var3.W();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void R(o51 o51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(o51Var.containerView);
    }

    public static void S(o51 o51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        o51Var.f29272l0 = -1;
        ci.d dVar = o51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.p(o51Var.topBulletinContainer, o51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new f51(o51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            o51Var.f29263c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            o51Var.f29262b0 = false;
            o51Var.f29270j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new f51(o51Var, 1));
        }
    }

    public static void T(o51 o51Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        r61 G = o51Var.f29270j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = o51Var.f29263c0;
                if (charSequence != null && !o51Var.f29262b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(o51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new rg.y0(o51Var.getContext(), 13, d6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(o51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                o51Var.dismiss();
            }
        }
    }

    @Override
    public final CharSequence B() {
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

    public final void U(q80 q80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.c(org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(q80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.x5.n(-1, -2));
    }

    public final void V() {
        if (this.f29272l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29272l0, true);
            this.f29272l0 = -1;
        }
    }

    public final void W() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f29261a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f29264d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ka0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f29263c0 = spannableStringBuilder;
        this.f29262b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f29266f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f29267g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f29268h0[i10];
        }
        this.f29272l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new g51(this, 1));
        this.f29270j0.N(true);
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
        za zaVar = this.f25521e;
        if (zaVar != null) {
            zaVar.setTitle("Translate");
        }
        this.f29270j0.N(false);
        W();
        if (this.f29264d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new f51(this, 3));
        }
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(sm0Var, getContext(), this.currentAccount, 0, true, new g51(this, 0), this.resourcesProvider);
        this.f29270j0 = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
