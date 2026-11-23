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
public abstract class s31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f39470a;
    public final long f39471b;
    public final org.telegram.ui.bn f39472c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Cells.x3 f39473e;
    public final Drawable f39474f;
    public final SpannableString h;
    public final ImageView f39475n;
    public final boolean[] f39476r;
    public int f39477s;
    public int f39478w;
    public int f39479x;
    public boolean f39480y;

    public s31(Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.bn bnVar) {
        super(context);
        final int currentAccount = bnVar.getCurrentAccount();
        final long a10 = bnVar.a();
        this.f39476r = new boolean[1];
        this.f39470a = currentAccount;
        this.f39471b = a10;
        this.f39472c = bnVar;
        this.d = h6Var;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, false, 2);
        this.f39473e = x3Var;
        x3Var.b(0.3f, 450L, nr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        x3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        x3Var.setGravity(1);
        x3Var.setIgnoreRTL(!org.telegram.messenger.hd.f24444a0);
        x3Var.f38119n = false;
        final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this;
        x3Var.setOnClickListener(new j70(ckVar, 22));
        addView(x3Var, c8.ma.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232410).mutate();
        this.f39474f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f39475n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232239);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a02;
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.k10.i(i10).q();
                org.telegram.ui.ck ckVar2 = org.telegram.ui.ck.this;
                if (!q10 && (O0 == null || !O0.autotranslation)) {
                    org.telegram.ui.bn bnVar2 = ckVar2.E;
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i7).f25857g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar2.a(), 140).commit();
                    bnVar2.zd(true);
                    return;
                }
                int i11 = ckVar2.f39470a;
                org.telegram.messenger.a10 a10Var = org.telegram.messenger.np.u1(i11).f25986v7;
                Context context2 = ckVar2.getContext();
                org.telegram.ui.ActionBar.h6 h6Var2 = ckVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, context2, h6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h6Var2);
                LinearLayout linearLayout = new LinearLayout(ckVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(ckVar2.getContext());
                scrollView.f39065b = new d6((View) scrollView, 350L, nr.h);
                LinearLayout linearLayout2 = new LinearLayout(ckVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28768c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var.j(org.telegram.messenger.hd.N0(2131743708, null), 2131232410, null);
                long j3 = ckVar2.f39471b;
                y0Var.setSubtext(b31.L0(b31.P0(a10Var.m(j3), null, null)));
                y0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var2.j(org.telegram.messenger.hd.N0(2131753753, null), 2131231240, null);
                y0Var2.setOnClickListener(new j70(actionBarPopupWindow$ActionBarPopupWindowLayout, 23));
                linearLayout.addView(y0Var2);
                linearLayout.addView((View) scrollView, c8.ma.o(-1, 420));
                String str = (String) a10Var.f22844e.get(Long.valueOf(j3));
                b31.P0(str, null, null);
                boolean[] zArr = ckVar2.f39476r;
                String P0 = b31.P0(str, zArr, null);
                String m10 = a10Var.m(j3);
                ArrayList o4 = org.telegram.messenger.a10.o(m10);
                ArrayList n10 = org.telegram.messenger.a10.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), h6Var2), c8.ma.o(-1, 8));
                y0Var.setOnClickListener(new bi.h5(new p31(ckVar2, new boolean[1], m10, linearLayout2, o4, str, a10Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                if (org.telegram.messenger.k10.i(i11).q() && P0 != null) {
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                    if (zArr[0]) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751345, P0);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751344, P0);
                    }
                    y0Var3.setMultiline(false);
                    y0Var3.j(hi.l3.b(a02, y0Var3.getTextView().getPaint()), 2131232070, null);
                    y0Var3.setOnClickListener(new fi.d0(ckVar2, str, a10Var, P0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
                }
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                y0Var4.j(org.telegram.messenger.hd.N0(2131749132, null), 2131232089, null);
                y0Var4.setOnClickListener(new st(ckVar2, a10Var, g1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), h6Var2), c8.ma.o(-1, 8));
                m80 m80Var = new m80(ckVar2.getContext(), null);
                m80Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                m80Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.m6.f29489j5;
                org.telegram.ui.ActionBar.t6.U(m80Var, i12, h6Var2);
                org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var2);
                m80Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131752014, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131752013, null), new fm0(18, ckVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new y5(5197252827247841976L, m80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                m80Var.setText(hi.l3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), m80Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.m6.f29473i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i13, h6Var2), 0, 12);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                m80Var.setBackground(a03);
                org.telegram.ui.ActionBar.t6.j(m80Var, a03, null, M, h6Var2);
                m80Var.setOnClickListener(new q31(0, ckVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m80Var);
                g1Var.f28977e = true;
                g1Var.f28976c = 220;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(2131755192);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = ckVar2.f39475n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ma.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        j3.f30214w0 = false;
        j3.f30212v0 = false;
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
        frameLayout.addView(linearLayout, c8.ma.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231007);
        linearLayout.addView(imageView, c8.ma.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231008);
        linearLayout.addView(imageView2, c8.ma.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131752012, null));
        l41[] l41VarArr = (l41[]) W2.getSpans(0, W2.length(), l41.class);
        for (int i7 = 0; i7 < l41VarArr.length; i7++) {
            W2.setSpan(new ForegroundColorSpan(-1), W2.getSpanStart(l41VarArr[i7]), W2.getSpanEnd(l41VarArr[i7]), W2.getSpanFlags(l41VarArr[i7]));
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, c8.ma.c(-2.0f, -1));
        g10.addView(new bi.t2(context, 2131231861, org.telegram.messenger.hd.N0(2131752022, null), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752024, null), new di.o9(w2VarArr, context, 1)), h6Var), c8.ma.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new bi.t2(context, 2131232380, org.telegram.messenger.hd.N0(2131752020, null), org.telegram.messenger.hd.N0(2131752021, null), h6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new bi.t2(context, 2131231828, org.telegram.messenger.hd.N0(2131752017, null), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752019, null), new di.o9(w2VarArr, context, 2)), h6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29382d7, view, h6Var);
        g10.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.f24045p, -1, 7, 24, 0, 24, 0));
        m80 m80Var = new m80(context, null);
        m80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setGravity(17);
        m80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131752016, null), new di.o9(w2VarArr, context, 3)));
        m80Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        m80Var.setDisablePaddingsOffsetY(true);
        g10.addView(m80Var, c8.ma.t(-1, -2, 7, 32, 0, 32, 0));
        hi.e g11 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        g11.setText(di.f6.t2(org.telegram.messenger.hd.N0(2131743643, null)));
        g11.setOnClickListener(new r2(w2VarArr, 2));
        g10.addView(g11, c8.ma.t(-1, 48, 7, 16, 0, 16, 16));
        j3.O = g10;
        w2VarArr[0] = j3;
        j3.O();
        w2VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ue));
    }

    public final void b() {
        String a02;
        int i7;
        int i10 = this.f39470a;
        org.telegram.messenger.a10 a10Var = org.telegram.messenger.np.u1(i10).f25986v7;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i10);
        long j3 = this.f39471b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        boolean B = a10Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.x3 x3Var = this.f39473e;
        if (B) {
            String P0 = b31.P0((String) a10Var.f22844e.get(Long.valueOf(j3)), null, null);
            if (!TextUtils.isEmpty(P0)) {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.a0(null, null, 2131745137, P0)));
            } else {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.N0(2131745138, null)));
            }
        } else {
            String m10 = a10Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.f39476r;
            String P02 = b31.P0(m10, zArr, null);
            if (zArr[0]) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131743707, P02);
            } else {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131743706, P02);
            }
            x3Var.setText(TextUtils.concat(spannableString, " ", a02));
        }
        if (!org.telegram.messenger.k10.i(i10).q() && (O0 == null || !O0.autotranslation)) {
            i7 = 2131232098;
        } else {
            i7 = 2131232239;
        }
        this.f39475n.setImageResource(i7);
    }

    public void setLeftMargin(float f10) {
        this.f39473e.setTranslationX(f10 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.Ye;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.f29473i6;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Ue;
        int w04 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        if (this.f39480y && w02 == this.f39477s && w03 == this.f39478w && w04 == this.f39479x) {
            return;
        }
        this.f39480y = true;
        this.f39477s = w02;
        this.f39478w = w03;
        this.f39479x = w04;
        int w05 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.Cells.x3 x3Var = this.f39473e;
        x3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var) & 436207615;
        int L = org.telegram.messenger.g0.L(3.0f);
        x3Var.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(15.0f), w06, L, L, L, L));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.m6.O(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 0, 0);
        ImageView imageView = this.f39475n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f39474f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), mode));
    }
}
