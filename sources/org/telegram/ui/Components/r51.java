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
public final class r51 extends bb {
    public final ImageView X;
    public final FrameLayout Y;
    public final fi.d Z;
    public CharSequence f32103a0;
    public boolean f32104b0;
    public CharSequence f32105c0;
    public eu f32106d0;
    public String f32107e0;
    public String f32108f0;
    public int f32109g0;
    public final String[] f32110h0;
    public final String[] f32111i0;
    public j71 f32112j0;
    public boolean f32113k0;
    public int f32114l0;
    public int m0;
    public int f32115n0;

    public r51(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, 2, u6Var);
        this.f32109g0 = 1;
        this.f32110h0 = new String[]{"formal", "neutral", "casual"};
        this.f32111i0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f32113k0 = true;
        this.f32114l0 = -1;
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
        this.e.addView(imageView, gb1.h(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        gb1.c(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new h51(this, 2));
        String L2 = f51.L();
        this.f32108f0 = L2;
        if (L2 == null) {
            this.f32108f0 = TranslateController.currentLanguage();
        }
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23297a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = h.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        h.leftMargin = i12 + i13;
        h.rightMargin += i13;
        frameLayout.addView(dVar, h);
        this.containerView.addView(frameLayout, gb1.i(-1, -2, 80));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.u1();
        this.d.setOnItemClickListener(new di.x4(14, this, u6Var));
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f32112j0.O(false);
    }

    public static void P(r51 r51Var, View view) {
        boolean z10;
        k80 F = k80.F(r51Var.container, r51Var.resourcesProvider, view);
        F.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        F.f29867t = false;
        F.Y = true;
        ScrollView scrollView = new ScrollView(r51Var.getContext());
        LinearLayout linearLayout = new LinearLayout(r51Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        F.q(scrollView);
        for (int i11 = 0; i11 < r51Var.f32110h0.length; i11++) {
            if (r51Var.f32109g0 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            r51Var.T(F, linearLayout, z10, r51Var.f32111i0[i11], new h2(r51Var, i11, 11));
        }
        View l1Var = new org.telegram.ui.ActionBar.l1(r51Var.getContext(), r51Var.resourcesProvider);
        l1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var, gb1.r(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(r51Var.f32108f0)) {
            r51Var.T(F, linearLayout, true, f51.J(f51.N(r51Var.f32108f0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, r51Var.f32108f0)) {
                r51Var.T(F, linearLayout, false, language.displayName, new Runnable(r51Var) {
                    public final r51 f28430b;

                    {
                        this.f28430b = r51Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r51 r51Var2 = this.f28430b;
                                r51Var2.U();
                                String str = language.code;
                                r51Var2.f32108f0 = str;
                                f51.R(str);
                                r51Var2.V();
                                return;
                            default:
                                r51 r51Var3 = this.f28430b;
                                r51Var3.U();
                                String str2 = language.code;
                                r51Var3.f32108f0 = str2;
                                f51.R(str2);
                                r51Var3.V();
                                return;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View l1Var2 = new org.telegram.ui.ActionBar.l1(r51Var.getContext(), r51Var.resourcesProvider);
        l1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(l1Var2, gb1.r(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            r51Var.T(F, linearLayout, TextUtils.equals(language3.code, r51Var.f32108f0), language3.displayName, new Runnable(r51Var) {
                public final r51 f28430b;

                {
                    this.f28430b = r51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            r51 r51Var2 = this.f28430b;
                            r51Var2.U();
                            String str = language3.code;
                            r51Var2.f32108f0 = str;
                            f51.R(str);
                            r51Var2.V();
                            return;
                        default:
                            r51 r51Var3 = this.f28430b;
                            r51Var3.U();
                            String str2 = language3.code;
                            r51Var3.f32108f0 = str2;
                            f51.R(str2);
                            r51Var3.V();
                            return;
                    }
                }
            });
        }
        F.Z();
    }

    public static void Q(r51 r51Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(r51Var.containerView);
    }

    public static void R(r51 r51Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        r51Var.f32114l0 = -1;
        fi.d dVar = r51Var.Z;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.d3.t(r51Var.topBulletinContainer, r51Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new h51(r51Var, 0));
        } else if (tL_messages_translateResult != null && !tL_messages_translateResult.result.isEmpty()) {
            r51Var.f32105c0 = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            r51Var.f32104b0 = false;
            r51Var.f32112j0.O(true);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new h51(r51Var, 1));
        }
    }

    public static void S(r51 r51Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        t61 G = r51Var.f32112j0.G(i10 - 1);
        if (G != null) {
            int i11 = G.d;
            if (i11 == 1) {
                CharSequence charSequence = r51Var.f32105c0;
                if (charSequence != null && !r51Var.f32104b0) {
                    AndroidUtilities.addToClipboard(charSequence);
                }
            } else if (i11 == 2) {
                if (!UserConfig.getInstance(r51Var.currentAccount).isPremium()) {
                    if (LaunchActivity.U() != null) {
                        new tg.y0(r51Var.getContext(), 13, u6Var).show();
                        return;
                    }
                    return;
                }
                MessagesController.getInstance(r51Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                r51Var.dismiss();
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

    public final void T(k80 k80Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        int i11 = org.telegram.ui.ActionBar.y6.F8;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, getContext(), this.resourcesProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(str);
        g1Var.setChecked(z10);
        g1Var.d(org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.y6.w0(i11, this.resourcesProvider));
        g1Var.setSelectorColor(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider)));
        g1Var.setOnClickListener(new h(k80Var, z10, runnable, 1));
        linearLayout.addView(g1Var, gb1.r(-1, -2));
    }

    public final void U() {
        if (this.f32114l0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32114l0, true);
            this.f32114l0 = -1;
        }
    }

    public final void V() {
        String charSequence;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.f32103a0};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f32106d0 != null) {
            this.Z.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new ea0(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.f32105c0 = spannableStringBuilder;
        this.f32104b0 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f32108f0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.f32109g0;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f32110h0[i10];
        }
        this.f32114l0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new Object(), new i51(this, 1));
        this.f32112j0.O(true);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
            if (themedColor != this.f32115n0) {
                this.f32115n0 = themedColor;
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
        this.f32112j0.O(false);
        V();
        if (this.f32106d0 != null) {
            fi.d dVar = this.Z;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new h51(this, 3));
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new i51(this, 0), this.resourcesProvider);
        this.f32112j0 = j71Var;
        j71Var.f29505r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return "Translate";
    }
}
