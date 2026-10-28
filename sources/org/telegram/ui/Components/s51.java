package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
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
public final class s51 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final fi.d Z;
    public CharSequence f32475a0;
    public boolean f32476b0;
    public CharSequence f32477c0;
    public eu f32478d0;
    public String f32479e0;
    public String f32480f0;
    public int f32481g0;
    public final String[] f32482h0;
    public final String[] f32483i0;
    public k71 f32484j0;
    public boolean f32485k0;
    public int f32486l0;
    public int m0;
    public int f32487n0;

    public s51(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, 2, u6Var);
        this.f32481g0 = 1;
        this.f32482h0 = new String[]{"formal", "neutral", "casual"};
        this.f32483i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f32485k0 = true;
        this.f32486l0 = -1;
        ImageView imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
        this.e.addView(imageView, kb1.h(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        kb1.c(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new i51(this, 2));
        String L2 = g51.L();
        this.f32480f0 = L2;
        if (L2 == null) {
            this.f32480f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23300a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = h.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        h.leftMargin = i12 + i13;
        h.rightMargin += i13;
        frameLayout.addView(dVar, h);
        this.containerView.addView(frameLayout, kb1.i(-1, -2, 80));
        nm0 nm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.u1();
        this.d.setOnItemClickListener(new di.x4(14, this, u6Var));
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f32484j0.O(false);
    }

    public static void P(s51 s51Var, View view) {
        boolean z10;
        l80 F = l80.F(s51Var.container, s51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f30169t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(s51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(s51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < s51Var.f32482h0.length; i11++) {
            if (s51Var.f32481g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            s51Var.T(F, linearLayout, z10, s51Var.f32483i0[i11], new h2(s51Var, i11, 11));
        }
        View l1Var = new org.telegram.ui.ActionBar.l1(s51Var.getContext(), s51Var.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, kb1.r(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(s51Var.f32480f0)) {
            s51Var.T(F, linearLayout, true, g51.J(g51.N(s51Var.f32480f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, s51Var.f32480f0)) {
                s51Var.T(F, linearLayout, false, language.displayName, new Runnable(s51Var) {
                    public final s51 f28860b;

                    {
                        this.f28860b = s51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s51 s51Var2 = this.f28860b;
                                s51Var2.U();
                                String str = language.code;
                                s51Var2.f32480f0 = str;
                                g51.R(str);
                                s51Var2.V();
                                return;
                            default:
                                s51 s51Var3 = this.f28860b;
                                s51Var3.U();
                                String str2 = language.code;
                                s51Var3.f32480f0 = str2;
                                g51.R(str2);
                                s51Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View l1Var2 = new org.telegram.ui.ActionBar.l1(s51Var.getContext(), s51Var.resourcesProvider);
        l1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var2, kb1.r(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            s51Var.T(F, linearLayout, TextUtils.equals(language3.code, s51Var.f32480f0), language3.displayName, new Runnable(s51Var) {
                public final s51 f28860b;

                {
                    this.f28860b = s51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            s51 s51Var2 = this.f28860b;
                            s51Var2.U();
                            String str = language3.code;
                            s51Var2.f32480f0 = str;
                            g51.R(str);
                            s51Var2.V();
                            return;
                        default:
                            s51 s51Var3 = this.f28860b;
                            s51Var3.U();
                            String str2 = language3.code;
                            s51Var3.f32480f0 = str2;
                            g51.R(str2);
                            s51Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(s51 s51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(s51Var.containerView);
    }

    public static void R(s51 s51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        s51Var.f32486l0 = -1;
        fi.d dVar = s51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.d3.t(s51Var.topBulletinContainer, s51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new i51(s51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            s51Var.f32477c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            s51Var.f32476b0 = false;
            s51Var.f32484j0.O(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new i51(s51Var, 1));
        }
    }

    public static void S(s51 s51Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        u61 G = s51Var.f32484j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = s51Var.f32477c0;
                if (charSequence != null && !s51Var.f32476b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(s51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new tg.y0(s51Var.getContext(), 13, u6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(s51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                s51Var.dismiss();
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

    public final void T(l80 l80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        int i11 = org.telegram.ui.ActionBar.y6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.d(org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.y6.w0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(l80Var, z10, runnable, 1));
        linearLayout.addView(g1Var, kb1.r(-1, -2));
    }

    public final void U() {
        if (this.f32486l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32486l0, true);
            this.f32486l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f32475a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f32478d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new fa0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f32477c0 = spannableStringBuilder;
        this.f32476b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f32480f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f32481g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f32482h0[i10];
        }
        this.f32486l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new j51(this, 1));
        this.f32484j0.O(true);
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
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7);
            if (themedColor != this.f32487n0) {
                this.f32487n0 = themedColor;
                setBackgroundColor(themedColor);
            }
            FrameLayout frameLayout = this.Y;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && themedColor != this.m0) {
                this.m0 = themedColor;
                ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle("Translate");
        }
        this.f32484j0.O(false);
        V();
        if (this.f32478d0 != null) {
            fi.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new i51(this, 3));
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new j51(this, 0), this.resourcesProvider);
        this.f32484j0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
