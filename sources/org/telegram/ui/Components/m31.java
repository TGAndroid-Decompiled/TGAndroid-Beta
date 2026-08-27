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

public final class m31 extends qa {
    public final ImageView T;
    public final FrameLayout U;
    public final lh.d V;
    public CharSequence W;
    public boolean X;
    public CharSequence Y;
    public ft Z;

    public String f30545a0;

    public String f30546b0;

    public int f30547c0;

    public final String[] f30548d0;

    public final String[] f30549e0;

    public b51 f30550f0;

    public boolean f30551g0;

    public int f30552h0;

    public m31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        this.f30547c0 = 1;
        this.f30548d0 = new String[]{"formal", "neutral", "casual"};
        this.f30549e0 = new String[]{"Formal", "Neutral", "Casual"};
        this.f30551g0 = true;
        this.f30552h0 = -1;
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.f31853e.addView(imageView, h7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        h7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new d31(this, 2));
        String strC = b31.C();
        this.f30546b0 = strC;
        if (strC == null) {
            this.f30546b0 = TranslateController.currentLanguage();
        }
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
        setBackgroundColor(getThemedColor(i11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i12 = layoutParamsD.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        layoutParamsD.leftMargin = i12 + i13;
        layoutParamsD.rightMargin += i13;
        frameLayout.addView(dVar, layoutParamsD);
        this.containerView.addView(frameLayout, h7.z5.e(-1, -2, 80));
        zk0 zk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new cg.x0(16, this, c6Var));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f30550f0.N(false);
    }

    public static void P(final m31 m31Var, View view) {
        b70 b70VarF = b70.F(m31Var.container, m31Var.resourcesProvider, view);
        b70VarF.X = AndroidUtilities.dp(450.0f);
        int i10 = 0;
        b70VarF.f26993t = false;
        b70VarF.Y = true;
        ScrollView scrollView = new ScrollView(m31Var.getContext());
        LinearLayout linearLayout = new LinearLayout(m31Var.getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        b70VarF.q(scrollView);
        int i11 = 0;
        while (i11 < m31Var.f30548d0.length) {
            m31Var.T(b70VarF, linearLayout, m31Var.f30547c0 == i11, m31Var.f30549e0[i11], new xl(m31Var, i11, 9));
            i11++;
        }
        View k1Var = new org.telegram.ui.ActionBar.k1(m31Var.getContext(), m31Var.resourcesProvider);
        k1Var.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var, h7.z5.n(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(m31Var.f30546b0)) {
            m31Var.T(b70VarF, linearLayout, true, b31.z(b31.E(m31Var.f30546b0, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i12);
            if (!TextUtils.equals(language.code, m31Var.f30546b0)) {
                final int i14 = 0;
                m31Var.T(b70VarF, linearLayout, false, language.displayName, new Runnable(m31Var) {

                    public final m31 f27314b;

                    {
                        this.f27314b = m31Var;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                m31 m31Var2 = this.f27314b;
                                m31Var2.U();
                                String str = language.code;
                                m31Var2.f30546b0 = str;
                                b31.I(str);
                                m31Var2.V();
                                break;
                            default:
                                m31 m31Var3 = this.f27314b;
                                m31Var3.U();
                                String str2 = language.code;
                                m31Var3.f30546b0 = str2;
                                b31.I(str2);
                                m31Var3.V();
                                break;
                        }
                    }
                });
            }
            i12 = i13;
        }
        View k1Var2 = new org.telegram.ui.ActionBar.k1(m31Var.getContext(), m31Var.resourcesProvider);
        k1Var2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(k1Var2, h7.z5.n(-1, 8));
        int size2 = languages.size();
        while (i10 < size2) {
            TranslateController.Language language2 = languages.get(i10);
            i10++;
            final TranslateController.Language language3 = language2;
            final int i15 = 1;
            m31Var.T(b70VarF, linearLayout, TextUtils.equals(language3.code, m31Var.f30546b0), language3.displayName, new Runnable(m31Var) {

                public final m31 f27314b;

                {
                    this.f27314b = m31Var;
                }

                @Override
                public final void run() {
                    switch (i15) {
                        case 0:
                            m31 m31Var2 = this.f27314b;
                            m31Var2.U();
                            String str = language3.code;
                            m31Var2.f30546b0 = str;
                            b31.I(str);
                            m31Var2.V();
                            break;
                        default:
                            m31 m31Var3 = this.f27314b;
                            m31Var3.U();
                            String str2 = language3.code;
                            m31Var3.f30546b0 = str2;
                            b31.I(str2);
                            m31Var3.V();
                            break;
                    }
                }
            });
        }
        b70VarF.Z();
    }

    public static void Q(m31 m31Var, ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(m31Var.containerView);
    }

    public static void R(m31 m31Var, TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        m31Var.f30552h0 = -1;
        lh.d dVar = m31Var.V;
        dVar.setLoading(false);
        if (tL_error != null) {
            org.telegram.ui.Cells.pa.t(m31Var.topBulletinContainer, m31Var.resourcesProvider, tL_error, false);
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new d31(m31Var, 0));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            dVar.setText(LocaleController.getString(R.string.OK));
            dVar.setOnClickListener(new d31(m31Var, 1));
        } else {
            m31Var.Y = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            m31Var.X = false;
            m31Var.f30550f0.N(true);
        }
    }

    public static void S(m31 m31Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        n41 n41VarG = m31Var.f30550f0.G(i10 - 1);
        if (n41VarG == null) {
            return;
        }
        int i11 = n41VarG.d;
        if (i11 == 1) {
            CharSequence charSequence = m31Var.Y;
            if (charSequence == null || m31Var.X) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i11 == 2) {
            if (UserConfig.getInstance(m31Var.currentAccount).isPremium()) {
                MessagesController.getInstance(m31Var.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                m31Var.dismiss();
            } else {
                if (LaunchActivity.U() == null) {
                    return;
                }
                new ag.g2(m31Var.getContext(), 13, c6Var).show();
            }
        }
    }

    @Override
    public final void C(float f10) {
        float f11 = 1.0f - f10;
        ImageView imageView = this.T;
        imageView.setAlpha(f11);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f11));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f11));
    }

    public final void T(b70 b70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        int i11 = org.telegram.ui.ActionBar.g6.F8;
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, getContext(), this.resourcesProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(str);
        f1Var.setChecked(z10);
        f1Var.c(org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider)));
        f1Var.setOnClickListener(new h(b70Var, z10, runnable, 1));
        linearLayout.addView(f1Var, h7.z5.n(-1, -2));
    }

    public final void U() {
        if (this.f30552h0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f30552h0, true);
            this.f30552h0 = -1;
        }
    }

    public final void V() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i10 = 1;
        CharSequence[] charSequenceArr = {this.W};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.Z != null) {
            this.V.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new u80(null, AndroidUtilities.dp(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y = spannableStringBuilder;
        this.X = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.f30546b0;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i11 = this.f30547c0;
        if (i11 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.f30548d0[i11];
        }
        this.f30552h0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new org.telegram.messenger.a(), new e31(this, i10));
        this.f30550f0.N(true);
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
        na naVar = this.f31853e;
        if (naVar != null) {
            naVar.setTitle("Translate");
        }
        this.f30550f0.N(false);
        V();
        if (this.Z != null) {
            lh.d dVar = this.V;
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new d31(this, 3));
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new e31(this, 0), this.resourcesProvider);
        this.f30550f0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return "Translate";
    }
}
