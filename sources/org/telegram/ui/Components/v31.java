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
public final class v31 extends xa {
    public final ImageView T;
    public final FrameLayout U;
    public final nh.d V;
    public CharSequence W;
    public boolean X;
    public CharSequence Y;
    public nt Z;
    public String f33444a0;
    public String f33445b0;
    public int f33446c0;
    public final String[] f33447d0;
    public final String[] f33448e0;
    public k51 f33449f0;
    public boolean f33450g0;
    public int f33451h0;

    public v31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.f33446c0 = 1;
        this.f33447d0 = new String[]{"formal", "neutral", "casual"};
        this.f33448e0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f33450g0 = true;
        this.f33451h0 = -1;
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f34660e.addView(imageView, i7.f6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        i7.h6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new m31(this, 2));
        String B = k31.B();
        this.f33445b0 = B;
        if (B == null) {
            this.f33445b0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = d.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        d.leftMargin = i12 + i13;
        d.rightMargin += i13;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, i7.f6.e(-1, -2, 80));
        jl0 jl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new eg.w0(15, this, c6Var));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f33449f0.N(false);
    }

    public static void P(v31 v31Var, View view) {
        boolean z10;
        j70 F = j70.F(v31Var.container, v31Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f29601t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(v31Var.getContext());
        LinearLayout linearLayout = new LinearLayout(v31Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < v31Var.f33447d0.length; i11++) {
            if (v31Var.f33446c0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            v31Var.T(F, linearLayout, z10, v31Var.f33448e0[i11], new i8(v31Var, i11, 12));
        }
        View l1Var = new org.telegram.ui.ActionBar.l1(v31Var.getContext(), v31Var.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, i7.f6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(v31Var.f33445b0)) {
            v31Var.T(F, linearLayout, true, k31.y(k31.D(v31Var.f33445b0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, v31Var.f33445b0)) {
                v31Var.T(F, linearLayout, false, language.displayName, new Runnable(v31Var) {
                    public final v31 f30222b;

                    {
                        this.f30222b = v31Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v31 v31Var2 = this.f30222b;
                                v31Var2.U();
                                String str = language.code;
                                v31Var2.f33445b0 = str;
                                k31.H(str);
                                v31Var2.V();
                                return;
                            default:
                                v31 v31Var3 = this.f30222b;
                                v31Var3.U();
                                String str2 = language.code;
                                v31Var3.f33445b0 = str2;
                                k31.H(str2);
                                v31Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View l1Var2 = new org.telegram.ui.ActionBar.l1(v31Var.getContext(), v31Var.resourcesProvider);
        l1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var2, i7.f6.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            v31Var.T(F, linearLayout, TextUtils.equals(language3.code, v31Var.f33445b0), language3.displayName, new Runnable(v31Var) {
                public final v31 f30222b;

                {
                    this.f30222b = v31Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            v31 v31Var2 = this.f30222b;
                            v31Var2.U();
                            String str = language3.code;
                            v31Var2.f33445b0 = str;
                            k31.H(str);
                            v31Var2.V();
                            return;
                        default:
                            v31 v31Var3 = this.f30222b;
                            v31Var3.U();
                            String str2 = language3.code;
                            v31Var3.f33445b0 = str2;
                            k31.H(str2);
                            v31Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(v31 v31Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(v31Var.containerView);
    }

    public static void R(v31 v31Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        v31Var.f33451h0 = -1;
        nh.d dVar = v31Var.V;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.th.t(v31Var.topBulletinContainer, v31Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new m31(v31Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            v31Var.Y = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            v31Var.X = false;
            v31Var.f33449f0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new m31(v31Var, 1));
        }
    }

    public static void S(v31 v31Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        w41 G = v31Var.f33449f0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = v31Var.Y;
                if (charSequence != null && !v31Var.X) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(v31Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new cg.p1(v31Var.getContext(), 13, c6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(v31Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                v31Var.dismiss();
            }
        }
    }

    @Override
    public final void B(float f9) {
        float f10 = 1.0f - f9;
        ImageView imageView = this.T;
        imageView.setAlpha(f10);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f10));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f10));
    }

    public final void T(j70 j70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new i(j70Var, z10, runnable, 1));
        linearLayout.addView(g1Var, i7.f6.n(-1, -2));
    }

    public final void U() {
        if (this.f33451h0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f33451h0, true);
            this.f33451h0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.W};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.Z != null) {
            this.V.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new d90(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y = spannableStringBuilder;
        this.X = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f33445b0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f33446c0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f33447d0[i10];
        }
        this.f33451h0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new n31(this, 1));
        this.f33449f0.N(true);
    }

    @Override
    public final void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.U;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void show() {
        super.show();
        ua uaVar = this.f34660e;
        if (uaVar != null) {
            uaVar.setTitle("Translate");
        }
        this.f33449f0.N(false);
        V();
        if (this.Z != null) {
            nh.d dVar = this.V;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new m31(this, 3));
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new n31(this, 0), this.resourcesProvider);
        this.f33449f0 = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
