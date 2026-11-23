package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class r31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f39169a;
    public final long f39170b;
    public final org.telegram.ui.bn f39171c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Cells.x3 f39172e;
    public final Drawable f39173f;
    public final SpannableString h;
    public final ImageView f39174n;
    public final boolean[] f39175r;
    public int f39176s;
    public int f39177w;
    public int f39178x;
    public boolean f39179y;

    public r31(Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.bn bnVar) {
        super(context);
        final int currentAccount = bnVar.getCurrentAccount();
        final long a10 = bnVar.a();
        this.f39175r = new boolean[1];
        this.f39169a = currentAccount;
        this.f39170b = a10;
        this.f39171c = bnVar;
        this.d = i6Var;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, false, 2);
        this.f39172e = x3Var;
        x3Var.b(0.3f, 450L, kr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        x3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        x3Var.setGravity(1);
        x3Var.setIgnoreRTL(!org.telegram.messenger.gd.f24314a0);
        x3Var.f37685n = false;
        final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this;
        x3Var.setOnClickListener(new g70(ckVar, 22));
        addView(x3Var, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232413).mutate();
        this.f39173f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f39174n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232242);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a02;
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.i10.i(i10).q();
                org.telegram.ui.ck ckVar2 = org.telegram.ui.ck.this;
                if (!q10 && (O0 == null || !O0.autotranslation)) {
                    org.telegram.ui.bn bnVar2 = ckVar2.E;
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).f25753g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar2.a(), 140).commit();
                    bnVar2.zd(true);
                    return;
                }
                int i11 = ckVar2.f39169a;
                org.telegram.messenger.y00 y00Var = org.telegram.messenger.mp.u1(i11).f25882v7;
                Context context2 = ckVar2.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = ckVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, 1, context2, i6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i6Var2);
                LinearLayout linearLayout = new LinearLayout(ckVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(ckVar2.getContext());
                scrollView.f38682b = new c6((View) scrollView, 350L, kr.h);
                LinearLayout linearLayout2 = new LinearLayout(ckVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28826c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var.j(org.telegram.messenger.gd.N0(2131743706, null), 2131232413, null);
                long j3 = ckVar2.f39170b;
                y0Var.setSubtext(a31.L0(a31.P0(y00Var.m(j3), null, null)));
                y0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var2.j(org.telegram.messenger.gd.N0(2131753753, null), 2131231243, null);
                y0Var2.setOnClickListener(new g70(actionBarPopupWindow$ActionBarPopupWindowLayout, 23));
                linearLayout.addView(y0Var2);
                linearLayout.addView((View) scrollView, c8.na.o(-1, 420));
                String str = (String) y00Var.f28183e.get(Long.valueOf(j3));
                a31.P0(str, null, null);
                boolean[] zArr = ckVar2.f39175r;
                String P0 = a31.P0(str, zArr, null);
                String m10 = y00Var.m(j3);
                ArrayList o4 = org.telegram.messenger.y00.o(m10);
                ArrayList n10 = org.telegram.messenger.y00.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), i6Var2), c8.na.o(-1, 8));
                y0Var.setOnClickListener(new bi.k5(new o31(ckVar2, new boolean[1], m10, linearLayout2, o4, str, y00Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                if (org.telegram.messenger.i10.i(i11).q() && P0 != null) {
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                    if (zArr[0]) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751345, P0);
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751344, P0);
                    }
                    y0Var3.setMultiline(false);
                    y0Var3.j(hi.u3.b(a02, y0Var3.getTextView().getPaint()), 2131232073, null);
                    y0Var3.setOnClickListener(new fi.d0(ckVar2, str, y00Var, P0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
                }
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                y0Var4.j(org.telegram.messenger.gd.N0(2131749132, null), 2131232092, null);
                y0Var4.setOnClickListener(new qt(ckVar2, y00Var, g1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), i6Var2), c8.na.o(-1, 8));
                j80 j80Var = new j80(ckVar2.getContext(), null);
                j80Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                j80Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
                org.telegram.ui.ActionBar.u6.U(j80Var, i12, i6Var2);
                org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var2);
                j80Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752014, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131752013, null), new sh0(20, ckVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new x5(5197252827247841976L, j80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                j80Var.setText(hi.u3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), j80Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.n6.f29543i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var2), 0, 12);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                j80Var.setBackground(a03);
                org.telegram.ui.ActionBar.u6.j(j80Var, a03, null, M, i6Var2);
                j80Var.setOnClickListener(new p31(0, ckVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j80Var);
                g1Var.f29036e = true;
                g1Var.f29035c = 220;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(2131755192);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = ckVar2.f39174n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.na.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        j3.f30264w0 = false;
        j3.f30262v0 = false;
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(org.telegram.messenger.g0.L(150.0f));
        float L = org.telegram.messenger.g0.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, c8.na.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231009);
        linearLayout.addView(imageView, c8.na.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231010);
        linearLayout.addView(imageView2, c8.na.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752012, null));
        k41[] k41VarArr = (k41[]) W2.getSpans(0, W2.length(), k41.class);
        for (int i7 = 0; i7 < k41VarArr.length; i7++) {
            W2.setSpan(new ForegroundColorSpan(-1), W2.getSpanStart(k41VarArr[i7]), W2.getSpanEnd(k41VarArr[i7]), W2.getSpanFlags(k41VarArr[i7]));
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.na.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, c8.na.c(-2.0f, -1));
        g10.addView(new bi.v2(context, 2131231864, org.telegram.messenger.gd.N0(2131752022, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752024, null), new di.o9(w2VarArr, context, 1)), i6Var), c8.na.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new bi.v2(context, 2131232383, org.telegram.messenger.gd.N0(2131752020, null), org.telegram.messenger.gd.N0(2131752021, null), i6Var), c8.na.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new bi.v2(context, 2131231831, org.telegram.messenger.gd.N0(2131752017, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752019, null), new di.o9(w2VarArr, context, 2)), i6Var), c8.na.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, i6Var);
        g10.addView(view, c8.na.n(1.0f / org.telegram.messenger.g0.f24225p, -1, 7, 24, 0, 24, 0));
        j80 j80Var = new j80(context, null);
        j80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var.setGravity(17);
        j80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752016, null), new di.o9(w2VarArr, context, 3)));
        j80Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        j80Var.setDisablePaddingsOffsetY(true);
        g10.addView(j80Var, c8.na.t(-1, -2, 7, 32, 0, 32, 0));
        hi.e g11 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        g11.setText(di.f6.t2(org.telegram.messenger.gd.N0(2131743641, null)));
        g11.setOnClickListener(new q2(w2VarArr, 2));
        g10.addView(g11, c8.na.t(-1, 48, 7, 16, 0, 16, 16));
        j3.O = g10;
        w2VarArr[0] = j3;
        j3.O();
        w2VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ue));
    }

    public final void b() {
        String a02;
        int i7;
        int i10 = this.f39169a;
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.mp.u1(i10).f25882v7;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
        long j3 = this.f39170b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        boolean B = y00Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.x3 x3Var = this.f39172e;
        if (B) {
            String P0 = a31.P0((String) y00Var.f28183e.get(Long.valueOf(j3)), null, null);
            if (!TextUtils.isEmpty(P0)) {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.a0(null, null, 2131745137, P0)));
            } else {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.N0(2131745138, null)));
            }
        } else {
            String m10 = y00Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.f39175r;
            String P02 = a31.P0(m10, zArr, null);
            if (zArr[0]) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131743705, P02);
            } else {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131743704, P02);
            }
            x3Var.setText(TextUtils.concat(spannableString, " ", a02));
        }
        if (!org.telegram.messenger.i10.i(i10).q() && (O0 == null || !O0.autotranslation)) {
            i7 = 2131232101;
        } else {
            i7 = 2131232242;
        }
        this.f39174n.setImageResource(i7);
    }

    public void setLeftMargin(float f10) {
        this.f39172e.setTranslationX(f10 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.Ye;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Ue;
        int w04 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        if (this.f39179y && w02 == this.f39176s && w03 == this.f39177w && w04 == this.f39178x) {
            return;
        }
        this.f39179y = true;
        this.f39176s = w02;
        this.f39177w = w03;
        this.f39178x = w04;
        int w05 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.Cells.x3 x3Var = this.f39172e;
        x3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var) & 436207615;
        int L = org.telegram.messenger.g0.L(3.0f);
        x3Var.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(15.0f), w06, L, L, L, L));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.n6.O(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 0, 0);
        ImageView imageView = this.f39174n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f39173f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
    }
}
