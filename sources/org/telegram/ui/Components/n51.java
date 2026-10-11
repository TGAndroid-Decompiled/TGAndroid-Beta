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
public final class n51 extends db {
    public final ImageView X;
    public final FrameLayout Y;
    public final ci.d Z;
    public CharSequence f29035a0;
    public boolean f29036b0;
    public CharSequence f29037c0;
    public lu f29038d0;
    public String f29039e0;
    public String f29040f0;
    public int f29041g0;
    public final String[] f29042h0;
    public final String[] f29043i0;
    public d71 f29044j0;
    public boolean f29045k0;
    public int f29046l0;

    public n51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, 2, d6Var);
        this.f29041g0 = 1;
        this.f29042h0 = new String[]{"formal", "neutral", "casual"};
        this.f29043i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f29045k0 = true;
        this.f29046l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10)), 1, -1));
        this.f25734e.addView(imageView, w7.x5.a(54.0f, 0.0f, 0.0f, 8.0f, 0.0f, 54, 85));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new e51(this, 2));
        String D = c51.D();
        this.f29040f0 = D;
        if (D == null) {
            this.f29040f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.h6.f20766a7;
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
        rm0 rm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new ai.o6(14, this, d6Var));
        s4.j jVar = new s4.j();
        jVar.f47822m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.f29044j0.N(false);
    }

    public static void Q(n51 n51Var, View view) {
        boolean z10;
        p80 F = p80.F(n51Var.container, n51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f29780t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(n51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(n51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < n51Var.f29042h0.length; i11++) {
            if (n51Var.f29041g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            n51Var.U(F, linearLayout, z10, n51Var.f29043i0[i11], new nd(n51Var, i11, 12));
        }
        View j1Var = new org.telegram.ui.ActionBar.j1(n51Var.getContext(), n51Var.resourcesProvider);
        j1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var, w7.x5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(n51Var.f29040f0)) {
            n51Var.U(F, linearLayout, true, c51.B(c51.F(n51Var.f29040f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, n51Var.f29040f0)) {
                n51Var.U(F, linearLayout, false, language.displayName, new Runnable(n51Var) {
                    public final n51 f25633b;

                    {
                        this.f25633b = n51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                n51 n51Var2 = this.f25633b;
                                n51Var2.V();
                                String str = language.code;
                                n51Var2.f29040f0 = str;
                                c51.J(str);
                                n51Var2.W();
                                return;
                            default:
                                n51 n51Var3 = this.f25633b;
                                n51Var3.V();
                                String str2 = language.code;
                                n51Var3.f29040f0 = str2;
                                c51.J(str2);
                                n51Var3.W();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View j1Var2 = new org.telegram.ui.ActionBar.j1(n51Var.getContext(), n51Var.resourcesProvider);
        j1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(j1Var2, w7.x5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            n51Var.U(F, linearLayout, TextUtils.equals(language3.code, n51Var.f29040f0), language3.displayName, new Runnable(n51Var) {
                public final n51 f25633b;

                {
                    this.f25633b = n51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            n51 n51Var2 = this.f25633b;
                            n51Var2.V();
                            String str = language3.code;
                            n51Var2.f29040f0 = str;
                            c51.J(str);
                            n51Var2.W();
                            return;
                        default:
                            n51 n51Var3 = this.f25633b;
                            n51Var3.V();
                            String str2 = language3.code;
                            n51Var3.f29040f0 = str2;
                            c51.J(str2);
                            n51Var3.W();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void R(n51 n51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(n51Var.containerView);
    }

    public static void S(n51 n51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        n51Var.f29046l0 = -1;
        ci.d dVar = n51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.c1.p(n51Var.topBulletinContainer, n51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new e51(n51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            n51Var.f29037c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            n51Var.f29036b0 = false;
            n51Var.f29044j0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new e51(n51Var, 1));
        }
    }

    public static void T(n51 n51Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        q61 G = n51Var.f29044j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = n51Var.f29037c0;
                if (charSequence != null && !n51Var.f29036b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(n51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new rg.y0(n51Var.getContext(), 13, d6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(n51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                n51Var.dismiss();
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

    public final void U(p80 p80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        int i11 = org.telegram.ui.ActionBar.h6.F8;
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, getContext(), this.resourcesProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(str);
        e1Var.setChecked(z10);
        e1Var.c(org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i10, this.resourcesProvider)));
        e1Var.setOnClickListener(new h(p80Var, z10, runnable, 1));
        linearLayout.addView(e1Var, w7.x5.n(-1, -2));
    }

    public final void V() {
        if (this.f29046l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29046l0, true);
            this.f29046l0 = -1;
        }
    }

    public final void W() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f29035a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f29038d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ja0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f29037c0 = spannableStringBuilder;
        this.f29036b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f29040f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f29041g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f29042h0[i10];
        }
        this.f29046l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new f51(this, 1));
        this.f29044j0.N(true);
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
        za zaVar = this.f25734e;
        if (zaVar != null) {
            zaVar.setTitle("Translate");
        }
        this.f29044j0.N(false);
        W();
        if (this.f29038d0 != null) {
            ci.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new e51(this, 3));
        }
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, 0, true, new f51(this, 0), this.resourcesProvider);
        this.f29044j0 = d71Var;
        d71Var.f25649r = false;
        return d71Var;
    }
}
