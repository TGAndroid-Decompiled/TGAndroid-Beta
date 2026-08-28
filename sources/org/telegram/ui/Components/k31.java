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
public final class k31 extends sa {
    public final ImageView T;
    public final FrameLayout U;
    public final kh.d V;
    public CharSequence W;
    public boolean X;
    public CharSequence Y;
    public gt Z;
    public String f29924a0;
    public String f29925b0;
    public int f29926c0;
    public final String[] f29927d0;
    public final String[] f29928e0;
    public z41 f29929f0;
    public boolean f29930g0;
    public int f29931h0;

    public k31(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, false, false, false, 2, b6Var);
        this.f29926c0 = 1;
        this.f29927d0 = new String[]{"formal", "neutral", "casual"};
        this.f29928e0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f29930g0 = true;
        this.f29931h0 = -1;
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(getThemedColor(i9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i9)), 1, -1));
        this.f32408e.addView(imageView, g7.e6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        g7.g6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b31(this, 2));
        String A = z21.A();
        this.f29925b0 = A;
        if (A == null) {
            this.f29925b0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        setBackgroundColor(getThemedColor(i10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        frameLayout.addView(dVar, d);
        this.containerView.addView(frameLayout, g7.e6.e(-1, -2, 80));
        wk0 wk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bg.b1(16, this, b6Var));
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.f29929f0.N(false);
    }

    public static void O(k31 k31Var, View view) {
        boolean z10;
        x60 F = x60.F(k31Var.container, k31Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i9 = 0;
        F.f34581t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(k31Var.getContext());
        LinearLayout linearLayout = new LinearLayout(k31Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i10 = 0; i10 < k31Var.f29927d0.length; i10++) {
            if (k31Var.f29926c0 == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            k31Var.S(F, linearLayout, z10, k31Var.f29928e0[i10], new qd(k31Var, i10, 10));
        }
        View l1Var = new org.telegram.ui.ActionBar.l1(k31Var.getContext(), k31Var.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, g7.e6.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(k31Var.f29925b0)) {
            k31Var.S(F, linearLayout, true, z21.y(z21.D(k31Var.f29925b0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i11);
            if (!TextUtils.equals(language.code, k31Var.f29925b0)) {
                k31Var.S(F, linearLayout, false, language.displayName, new Runnable(k31Var) {
                    public final k31 f26658b;

                    {
                        this.f26658b = k31Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k31 k31Var2 = this.f26658b;
                                k31Var2.T();
                                String str = language.code;
                                k31Var2.f29925b0 = str;
                                z21.H(str);
                                k31Var2.U();
                                return;
                            default:
                                k31 k31Var3 = this.f26658b;
                                k31Var3.T();
                                String str2 = language.code;
                                k31Var3.f29925b0 = str2;
                                z21.H(str2);
                                k31Var3.U();
                                return;
                        }
                    }
                });
            }
            i11 = i12;
        }
        View l1Var2 = new org.telegram.ui.ActionBar.l1(k31Var.getContext(), k31Var.resourcesProvider);
        l1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var2, g7.e6.n(-1, 8));
        int size2 = languages.size();
        while (i9 < size2) {
            TranslateController.Language language2 = languages.get(i9);
            i9++;
            final TranslateController.Language language3 = language2;
            k31Var.S(F, linearLayout, TextUtils.equals(language3.code, k31Var.f29925b0), language3.displayName, new Runnable(k31Var) {
                public final k31 f26658b;

                {
                    this.f26658b = k31Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k31 k31Var2 = this.f26658b;
                            k31Var2.T();
                            String str = language3.code;
                            k31Var2.f29925b0 = str;
                            z21.H(str);
                            k31Var2.U();
                            return;
                        default:
                            k31 k31Var3 = this.f26658b;
                            k31Var3.T();
                            String str2 = language3.code;
                            k31Var3.f29925b0 = str2;
                            z21.H(str2);
                            k31Var3.U();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void P(k31 k31Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(k31Var.containerView);
    }

    public static void Q(k31 k31Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        k31Var.f29931h0 = -1;
        kh.d dVar = k31Var.V;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.j2.s(k31Var.topBulletinContainer, k31Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b31(k31Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            k31Var.Y = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            k31Var.X = false;
            k31Var.f29929f0.N(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new b31(k31Var, 1));
        }
    }

    public static void R(k31 k31Var, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        l41 G = k31Var.f29929f0.G(i9 - 1);
        if (G != null) {
            int i10 = G.d;
            if (i10 == 1) {
                CharSequence charSequence = k31Var.Y;
                if (charSequence != null && !k31Var.X) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i10 == 2) {
                if (!UserConfig.getInstance(k31Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new zf.x0(k31Var.getContext(), 13, b6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(k31Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                k31Var.dismiss();
            }
        }
    }

    @Override
    public final void A(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.T;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void S(x60 x60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        int i10 = org.telegram.ui.ActionBar.f6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.c(org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(x60Var, z10, runnable, 1));
        linearLayout.addView(g1Var, g7.e6.n(-1, -2));
    }

    public final void T() {
        if (this.f29931h0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29931h0, true);
            this.f29931h0 = -1;
        }
    }

    public final void U() {
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
        spannableStringBuilder.setSpan(new q80(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y = spannableStringBuilder;
        this.X = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f29925b0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i9 = this.f29926c0;
        if (i9 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f29927d0[i9];
        }
        this.f29931h0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new c31(this, 1));
        this.f29929f0.N(true);
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
        pa paVar = this.f32408e;
        if (paVar != null) {
            paVar.setTitle("Translate");
        }
        this.f29929f0.N(false);
        U();
        if (this.Z != null) {
            kh.d dVar = this.V;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new b31(this, 3));
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new c31(this, 0), this.resourcesProvider);
        this.f29929f0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
