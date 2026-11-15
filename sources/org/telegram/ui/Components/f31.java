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
public abstract class f31 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f34502a;
    public final long f34503b;
    public final org.telegram.ui.an f34504c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Cells.w3 f34505e;
    public final Drawable f34506f;
    public final SpannableString h;
    public final ImageView f34507n;
    public final boolean[] f34508r;
    public int f34509s;
    public int f34510w;
    public int f34511x;
    public boolean f34512y;

    public f31(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.an anVar) {
        super(context);
        final int currentAccount = anVar.getCurrentAccount();
        final long a10 = anVar.a();
        this.f34508r = new boolean[1];
        this.f34502a = currentAccount;
        this.f34503b = a10;
        this.f34504c = anVar;
        this.d = e6Var;
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, false, 2);
        this.f34505e = w3Var;
        w3Var.b(0.3f, 450L, er.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        w3Var.setGravity(1);
        w3Var.setIgnoreRTL(!org.telegram.messenger.hd.f24104a0);
        w3Var.f35178n = false;
        final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this;
        w3Var.setOnClickListener(new y60(bkVar, 21));
        addView(w3Var, c8.ja.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232409).mutate();
        this.f34506f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f34507n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232238);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a02;
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.m10.i(i10).q();
                org.telegram.ui.bk bkVar2 = org.telegram.ui.bk.this;
                if (!q10 && (M0 == null || !M0.autotranslation)) {
                    org.telegram.ui.an anVar2 = bkVar2.E;
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i7).f25273e7.edit();
                    edit.putInt("dialog_show_translate_count" + anVar2.a(), 140).commit();
                    anVar2.zd(true);
                    return;
                }
                int i11 = bkVar2.f34502a;
                org.telegram.messenger.c10 c10Var = org.telegram.messenger.np.s1(i11).f25403t7;
                Context context2 = bkVar2.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = bkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232568, 1, context2, e6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var2);
                LinearLayout linearLayout = new LinearLayout(bkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(bkVar2.getContext());
                scrollView.f34171b = new u5((View) scrollView, 350L, er.h);
                LinearLayout linearLayout2 = new LinearLayout(bkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28383c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, true, false);
                z0Var.j(org.telegram.messenger.hd.M0(2131743953, null), 2131232409, null);
                long j3 = bkVar2.f34503b;
                z0Var.setSubtext(p21.K0(p21.O0(c10Var.m(j3), null, null)));
                z0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, true, false);
                z0Var2.j(org.telegram.messenger.hd.M0(2131753756, null), 2131231240, null);
                z0Var2.setOnClickListener(new y60(actionBarPopupWindow$ActionBarPopupWindowLayout, 22));
                linearLayout.addView(z0Var2);
                linearLayout.addView((View) scrollView, c8.ja.o(-1, 420));
                String str = (String) c10Var.f22789e.get(Long.valueOf(j3));
                p21.O0(str, null, null);
                boolean[] zArr = bkVar2.f34508r;
                String O0 = p21.O0(str, zArr, null);
                String m10 = c10Var.m(j3);
                ArrayList o4 = org.telegram.messenger.c10.o(m10);
                ArrayList n10 = org.telegram.messenger.c10.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(bkVar2.getContext(), e6Var2), c8.ja.o(-1, 8));
                z0Var.setOnClickListener(new bi.x2(new d31(bkVar2, new boolean[1], m10, linearLayout2, o4, str, c10Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                if (org.telegram.messenger.m10.i(i11).q() && O0 != null) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, false, false);
                    if (zArr[0]) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751357, O0);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131751356, O0);
                    }
                    z0Var3.setMultiline(false);
                    z0Var3.j(hi.l3.b(a02, z0Var3.getTextView().getPaint()), 2131232069, null);
                    z0Var3.setOnClickListener(new fi.d0(bkVar2, str, c10Var, O0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
                }
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, false, false);
                z0Var4.j(org.telegram.messenger.hd.M0(2131749325, null), 2131232088, null);
                z0Var4.setOnClickListener(new lt(bkVar2, c10Var, g1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(bkVar2.getContext(), e6Var2), c8.ja.o(-1, 8));
                z70 z70Var = new z70(bkVar2.getContext(), null);
                z70Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                z70Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
                org.telegram.ui.ActionBar.q6.U(z70Var, i12, e6Var2);
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var2);
                z70Var.setEmojiColor(org.telegram.ui.ActionBar.j6.w0(i12, e6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752026, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131752025, null), new hh0(21, bkVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new p5(5197252827247841976L, z70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                z70Var.setText(hi.l3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), z70Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i13, e6Var2), 0, 12);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                z70Var.setBackground(a03);
                org.telegram.ui.ActionBar.q6.j(z70Var, a03, null, M, e6Var2);
                z70Var.setOnClickListener(new vv0(6, bkVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z70Var);
                g1Var.f28555e = true;
                g1Var.f28554c = 220;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(2131755192);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = bkVar2.f34507n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ja.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        k10.f29720w0 = false;
        k10.f29718v0 = false;
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
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
        frameLayout.addView(linearLayout, c8.ja.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231007);
        linearLayout.addView(imageView, c8.ja.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231008);
        linearLayout.addView(imageView2, c8.ja.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752024, null));
        y31[] y31VarArr = (y31[]) X2.getSpans(0, X2.length(), y31.class);
        for (int i7 = 0; i7 < y31VarArr.length; i7++) {
            X2.setSpan(new ForegroundColorSpan(-1), X2.getSpanStart(y31VarArr[i7]), X2.getSpanEnd(y31VarArr[i7]), X2.getSpanFlags(y31VarArr[i7]));
        }
        textView.setText(X2);
        linearLayout.addView(textView, c8.ja.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, c8.ja.c(-2.0f, -1));
        f10.addView(new bi.v1(context, 2131231860, org.telegram.messenger.hd.M0(2131752034, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752036, null), new di.k9(u2VarArr, context, 1)), e6Var), c8.ja.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new bi.v1(context, 2131232379, org.telegram.messenger.hd.M0(2131752032, null), org.telegram.messenger.hd.M0(2131752033, null), e6Var), c8.ja.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new bi.v1(context, 2131231827, org.telegram.messenger.hd.M0(2131752029, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752031, null), new di.k9(u2VarArr, context, 2)), e6Var), c8.ja.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, e6Var);
        f10.addView(view, c8.ja.n(1.0f / org.telegram.messenger.g0.f23610p, -1, 7, 24, 0, 24, 0));
        z70 z70Var = new z70(context, null);
        z70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setGravity(17);
        z70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752028, null), new di.k9(u2VarArr, context, 3)));
        z70Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        z70Var.setDisablePaddingsOffsetY(true);
        f10.addView(z70Var, c8.ja.t(-1, -2, 7, 32, 0, 32, 0));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.setText(di.c6.h2(org.telegram.messenger.hd.M0(2131743888, null)));
        g10.setOnClickListener(new h2(u2VarArr, 3));
        f10.addView(g10, c8.ja.t(-1, 48, 7, 16, 0, 16, 16));
        k10.O = f10;
        u2VarArr[0] = k10;
        k10.O();
        u2VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ue));
    }

    public final void b() {
        String a02;
        int i7;
        int i10 = this.f34502a;
        org.telegram.messenger.c10 c10Var = org.telegram.messenger.np.s1(i10).f25403t7;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
        long j3 = this.f34503b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        boolean B = c10Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.w3 w3Var = this.f34505e;
        if (B) {
            String O0 = p21.O0((String) c10Var.f22789e.get(Long.valueOf(j3)), null, null);
            if (!TextUtils.isEmpty(O0)) {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.a0(null, null, 2131745333, O0)));
            } else {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.M0(2131745334, null)));
            }
        } else {
            String m10 = c10Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.f34508r;
            String O02 = p21.O0(m10, zArr, null);
            if (zArr[0]) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131743952, O02);
            } else {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131743951, O02);
            }
            w3Var.setText(TextUtils.concat(spannableString, " ", a02));
        }
        if (!org.telegram.messenger.m10.i(i10).q() && (M0 == null || !M0.autotranslation)) {
            i7 = 2131232097;
        } else {
            i7 = 2131232238;
        }
        this.f34507n.setImageResource(i7);
    }

    public void setLeftMargin(float f10) {
        this.f34505e.setTranslationX(f10 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.Ye;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Ue;
        int w04 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        if (this.f34512y && w02 == this.f34509s && w03 == this.f34510w && w04 == this.f34511x) {
            return;
        }
        this.f34512y = true;
        this.f34509s = w02;
        this.f34510w = w03;
        this.f34511x = w04;
        int w05 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.Cells.w3 w3Var = this.f34505e;
        w3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var) & 436207615;
        int L = org.telegram.messenger.g0.L(3.0f);
        w3Var.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(15.0f), w06, L, L, L, L));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.j6.O(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 0, 0);
        ImageView imageView = this.f34507n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.j6.w0(i11, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f34506f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), mode));
    }
}
