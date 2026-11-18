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
public abstract class p31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f38255a;
    public final long f38256b;
    public final org.telegram.ui.bn f38257c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.Cells.x3 f38258e;
    public final Drawable f38259f;
    public final SpannableString h;
    public final ImageView f38260n;
    public final boolean[] f38261r;
    public int f38262s;
    public int f38263w;
    public int f38264x;
    public boolean f38265y;

    public p31(Context context, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.bn bnVar) {
        super(context);
        final int currentAccount = bnVar.getCurrentAccount();
        final long a10 = bnVar.a();
        this.f38261r = new boolean[1];
        this.f38255a = currentAccount;
        this.f38256b = a10;
        this.f38257c = bnVar;
        this.d = i6Var;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, false, 2);
        this.f38258e = x3Var;
        x3Var.b(0.3f, 450L, lr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        x3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        x3Var.setGravity(1);
        x3Var.setIgnoreRTL(!org.telegram.messenger.gd.f24213a0);
        x3Var.f37740n = false;
        final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this;
        x3Var.setOnClickListener(new h70(ckVar, 21));
        addView(x3Var, c8.ma.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232410).mutate();
        this.f38259f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f38260n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232239);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a02;
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.j10.i(i10).q();
                org.telegram.ui.ck ckVar2 = org.telegram.ui.ck.this;
                if (!q10 && (O0 == null || !O0.autotranslation)) {
                    org.telegram.ui.bn bnVar2 = ckVar2.E;
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar2).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).f25658g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar2.a(), 140).commit();
                    bnVar2.zd(true);
                    return;
                }
                int i11 = ckVar2.f38255a;
                org.telegram.messenger.z00 z00Var = org.telegram.messenger.mp.u1(i11).f25787v7;
                Context context2 = ckVar2.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = ckVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, context2, i6Var2);
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i6Var2);
                LinearLayout linearLayout = new LinearLayout(ckVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(ckVar2.getContext());
                scrollView.f37950b = new c6((View) scrollView, 350L, lr.h);
                LinearLayout linearLayout2 = new LinearLayout(ckVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28735c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, ckVar2.getContext(), ckVar2.d, true, false);
                z0Var.j(org.telegram.messenger.gd.M0(2131743716, null), 2131232410, null);
                long j3 = ckVar2.f38256b;
                z0Var.setSubtext(y21.L0(y21.P0(z00Var.m(j3), null, null)));
                z0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, ckVar2.getContext(), ckVar2.d, true, false);
                z0Var2.j(org.telegram.messenger.gd.M0(2131753754, null), 2131231240, null);
                z0Var2.setOnClickListener(new h70(actionBarPopupWindow$ActionBarPopupWindowLayout, 22));
                linearLayout.addView(z0Var2);
                linearLayout.addView((View) scrollView, c8.ma.o(-1, 420));
                String str = (String) z00Var.f28240e.get(Long.valueOf(j3));
                y21.P0(str, null, null);
                boolean[] zArr = ckVar2.f38261r;
                String P0 = y21.P0(str, zArr, null);
                String m10 = z00Var.m(j3);
                ArrayList o4 = org.telegram.messenger.z00.o(m10);
                ArrayList n10 = org.telegram.messenger.z00.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.e1(ckVar2.getContext(), i6Var2), c8.ma.o(-1, 8));
                z0Var.setOnClickListener(new bi.e5(new n31(ckVar2, new boolean[1], m10, linearLayout2, o4, str, z00Var, h1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                if (org.telegram.messenger.j10.i(i11).q() && P0 != null) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, ckVar2.getContext(), ckVar2.d, false, false);
                    if (zArr[0]) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751346, P0);
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131751345, P0);
                    }
                    z0Var3.setMultiline(false);
                    z0Var3.j(hi.m3.b(a02, z0Var3.getTextView().getPaint()), 2131232070, null);
                    z0Var3.setOnClickListener(new fi.d0(ckVar2, str, z00Var, P0, h1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
                }
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, ckVar2.getContext(), ckVar2.d, false, false);
                z0Var4.j(org.telegram.messenger.gd.M0(2131749133, null), 2131232089, null);
                z0Var4.setOnClickListener(new qt(ckVar2, z00Var, h1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.e1(ckVar2.getContext(), i6Var2), c8.ma.o(-1, 8));
                k80 k80Var = new k80(ckVar2.getContext(), null);
                k80Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                k80Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.n6.f29502j5;
                org.telegram.ui.ActionBar.u6.U(k80Var, i12, i6Var2);
                org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var2);
                k80Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131752015, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131752014, null), new hn0(16, ckVar2, h1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new x5(5197252827247841976L, k80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                k80Var.setText(hi.m3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), k80Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.n6.f29486i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var2), 0, 12);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                k80Var.setBackground(a03);
                org.telegram.ui.ActionBar.u6.j(k80Var, a03, null, M, i6Var2);
                k80Var.setOnClickListener(new c31(2, ckVar2, h1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k80Var);
                h1Var.f28991e = true;
                h1Var.f28990c = 220;
                h1Var.setOutsideTouchable(true);
                h1Var.setClippingEnabled(true);
                h1Var.setAnimationStyle(2131755192);
                h1Var.setFocusable(true);
                h1Var.setInputMethodMode(2);
                h1Var.setSoftInputMode(0);
                ImageView imageView2 = ckVar2.f38260n;
                h1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ma.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        j3.f30228w0 = false;
        j3.f30226v0 = false;
        org.telegram.ui.ActionBar.x2[] x2VarArr = new org.telegram.ui.ActionBar.x2[1];
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
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131752013, null));
        i41[] i41VarArr = (i41[]) W2.getSpans(0, W2.length(), i41.class);
        for (int i7 = 0; i7 < i41VarArr.length; i7++) {
            W2.setSpan(new ForegroundColorSpan(-1), W2.getSpanStart(i41VarArr[i7]), W2.getSpanEnd(i41VarArr[i7]), W2.getSpanFlags(i41VarArr[i7]));
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, c8.ma.c(-2.0f, -1));
        g10.addView(new bi.p2(context, 2131231861, org.telegram.messenger.gd.M0(2131752023, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752025, null), new di.n9(x2VarArr, context, 1)), i6Var), c8.ma.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new bi.p2(context, 2131232380, org.telegram.messenger.gd.M0(2131752021, null), org.telegram.messenger.gd.M0(2131752022, null), i6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new bi.p2(context, 2131231828, org.telegram.messenger.gd.M0(2131752018, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752020, null), new di.n9(x2VarArr, context, 2)), i6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, view, i6Var);
        g10.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.f24117p, -1, 7, 24, 0, 24, 0));
        k80 k80Var = new k80(context, null);
        k80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var.setGravity(17);
        k80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752017, null), new di.n9(x2VarArr, context, 3)));
        k80Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        k80Var.setDisablePaddingsOffsetY(true);
        g10.addView(k80Var, c8.ma.t(-1, -2, 7, 32, 0, 32, 0));
        hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        g11.setText(di.f6.t2(org.telegram.messenger.gd.M0(2131743651, null)));
        g11.setOnClickListener(new q2(x2VarArr, 2));
        g10.addView(g11, c8.ma.t(-1, 48, 7, 16, 0, 16, 16));
        j3.O = g10;
        x2VarArr[0] = j3;
        j3.O();
        x2VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ue));
    }

    public final void b() {
        String a02;
        int i7;
        int i10 = this.f38255a;
        org.telegram.messenger.z00 z00Var = org.telegram.messenger.mp.u1(i10).f25787v7;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
        long j3 = this.f38256b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        boolean B = z00Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.x3 x3Var = this.f38258e;
        if (B) {
            String P0 = y21.P0((String) z00Var.f28240e.get(Long.valueOf(j3)), null, null);
            if (!TextUtils.isEmpty(P0)) {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.a0(null, null, 2131745138, P0)));
            } else {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.M0(2131745139, null)));
            }
        } else {
            String m10 = z00Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.f38261r;
            String P02 = y21.P0(m10, zArr, null);
            if (zArr[0]) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131743715, P02);
            } else {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131743714, P02);
            }
            x3Var.setText(TextUtils.concat(spannableString, " ", a02));
        }
        if (!org.telegram.messenger.j10.i(i10).q() && (O0 == null || !O0.autotranslation)) {
            i7 = 2131232098;
        } else {
            i7 = 2131232239;
        }
        this.f38260n.setImageResource(i7);
    }

    public void setLeftMargin(float f10) {
        this.f38258e.setTranslationX(f10 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.Ye;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.f29486i6;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Ue;
        int w04 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        if (this.f38265y && w02 == this.f38262s && w03 == this.f38263w && w04 == this.f38264x) {
            return;
        }
        this.f38265y = true;
        this.f38262s = w02;
        this.f38263w = w03;
        this.f38264x = w04;
        int w05 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.Cells.x3 x3Var = this.f38258e;
        x3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var) & 436207615;
        int L = org.telegram.messenger.g0.L(3.0f);
        x3Var.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(15.0f), w06, L, L, L, L));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.n6.O(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 0, 0);
        ImageView imageView = this.f38260n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f38259f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
    }
}
