package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class tx0 extends TableLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f38423a;
    public final Path f38424b;
    public final float[] f38425c;
    public final Paint d;
    public final Paint f38426e;
    public final float f38427f;
    public final float h;
    public ArrayList f38428n;
    public ArrayList f38429r;

    public tx0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38424b = new Path();
        this.f38425c = new float[8];
        this.d = new Paint(1);
        this.f38426e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f38427f = max;
        this.h = max / 2.0f;
        this.f38423a = h6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final rx0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        org.telegram.ui.ActionBar.t6.U(lVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(lVar, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.i6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        rx0 rx0Var = new rx0(this, lVar, true);
        tableRow.addView(rx0Var, layoutParams);
        addView(tableRow);
        return rx0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        p5 p5Var = new p5(getContext());
        org.telegram.ui.ActionBar.t6.U(p5Var, org.telegram.ui.ActionBar.m6.G6, this.f38423a);
        p5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.ij.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        p5Var.setText(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, p5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, p5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.qs.i(p5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new rx0(this, p5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, sx0[] sx0VarArr, ic[] icVarArr) {
        ic icVar = new ic(getContext());
        org.telegram.ui.ActionBar.t6.U(icVar, org.telegram.ui.ActionBar.m6.G6, this.f38423a);
        icVar.setTextSize(1, 14.0f);
        icVar.setText(org.telegram.messenger.i6.m(charSequence2, icVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(icVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        sx0 sx0Var = new sx0(this, charSequence);
        if (sx0VarArr != null) {
            sx0VarArr[0] = sx0Var;
        }
        tableRow.addView(sx0Var, layoutParams);
        tableRow.addView(new qx0(this, icVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (icVarArr != null) {
            icVarArr[0] = icVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ic icVar = new ic(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        org.telegram.ui.ActionBar.t6.U(icVar, i7, h6Var);
        icVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(charSequence, icVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jc.b(str2, runnable, h6Var, num));
        }
        icVar.setText(spannableStringBuilder);
        org.telegram.messenger.qs.i(icVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, icVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        c(str, org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(j3)), org.telegram.messenger.id.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.t4 t4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        ic icVar = new ic(context, h6Var);
        icVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        icVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.m6.Uc;
        org.telegram.ui.ActionBar.t6.U(icVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(icVar, i7, h6Var);
        icVar.setTextSize(1, 14.0f);
        icVar.setSingleLine(true);
        icVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        icVar.setText(spannableStringBuilder);
        if (str != null) {
            icVar.O = new jc(str, t4Var, h6Var);
        }
        return l(icVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, bi.a4 a4Var, String str, org.telegram.ui.Wallet.s4 s4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        w70Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        org.telegram.ui.ActionBar.t6.U(w70Var, i10, h6Var);
        w70Var.setMaxLines(4);
        int i11 = 0;
        w70Var.setSingleLine(false);
        w70Var.setText(charSequence2);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            jc jcVar = new jc(str, s4Var, h6Var);
            final ic icVar = new ic(getContext(), h6Var);
            icVar.setTextSize(1, f10);
            icVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(jcVar, 0, spannableString.length(), 33);
            icVar.setText(spannableString);
            if (a4Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) w70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + jcVar.a();
            frameLayout.addView(icVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    w70 w70Var2 = w70.this;
                    if (w70Var2.getLayout() != null && w70Var2.getLayout().getLineCount() > 0) {
                        int left = w70Var2.getLeft();
                        float lineRight = w70Var2.getLayout().getLineRight(0) + w70Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        ic icVar2 = icVar;
                        icVar2.setTranslationX(Math.min(0.0f, lineRight - icVar2.getLeft()));
                    }
                }
            });
        }
        if (a4Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232103);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.m6.f28225v6;
            org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new kk(23, charSequence2, a4Var));
            c8.ka.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var)), 7, -1);
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
            frameLayout.addView(imageView, c8.ha.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, bi.a4 a4Var) {
        j(str, charSequence, i7, a4Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z9;
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        ic icVar = new ic(context, h6Var);
        icVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        icVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.U(icVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.G(icVar, i10, h6Var);
        icVar.setTextSize(1, 14.0f);
        icVar.setSingleLine(true);
        icVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, icVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f45615b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.id.M0(2131744949, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f40377e = L;
            a10.f40378f = L2;
            imageReceiver.w0(a10);
            z9 = false;
            z10 = false;
        } else if (org.telegram.messenger.t10.A(j3)) {
            str3 = org.telegram.messenger.id.M0(2131744925, null);
            xp a11 = bi.yc.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f40377e = L3;
            a11.f40378f = L4;
            imageReceiver.w0(a11);
            z10 = true;
            z9 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                if (a22 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                str2 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
            }
            str3 = str2;
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            icVar.O = new jc(str, runnable2, h6Var);
        }
        icVar.setText(spannableStringBuilder);
        if (z9) {
            return null;
        }
        return l(icVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z9;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        final u70 u70Var = new u70(context, h6Var);
        u70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.X(u70Var, i10, h6Var);
        u70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        u70Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, u70Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f45615b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.id.M0(2131744949, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f40377e = L;
            a10.f40378f = L2;
            imageReceiver.w0(a10);
            z9 = false;
        } else {
            if (org.telegram.messenger.t10.A(j3)) {
                str3 = org.telegram.messenger.id.M0(2131744925, null);
                xp a11 = bi.yc.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f40377e = L3;
                a11.f40378f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                String p10 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
                str3 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
                str3 = str2;
            }
            z9 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z9) {
            u70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        final f5 f5Var2 = new f5(org.telegram.messenger.g0.L(20.0f), u70Var);
        f5Var2.k(Integer.valueOf(w02));
        f5Var2.I = org.telegram.messenger.g0.L(12.0f);
        f5Var2.J = 0;
        if (this.f38428n == null) {
            this.f38428n = new ArrayList();
            this.f38429r = new ArrayList();
        }
        this.f38428n.add(u70Var);
        this.f38429r.add(f5Var2);
        u70Var.addOnAttachStateChangeListener(new px0(f5Var2, 0));
        final Drawable mutate = getContext().getResources().getDrawable(2131232307).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ox0.a(java.lang.Object):void");
            }
        };
        c20Var.a(null);
        u70Var.i(f5Var2);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.f25067r, c20Var);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.f25044m5, c20Var);
        u70Var.l(spannableStringBuilder, false);
        return l(u70Var, str);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        super.onLayout(z9, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f38426e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f38427f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.m6.f27920ei;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27901di, h6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z15 = true;
                    if (childAt instanceof sx0) {
                        sx0 sx0Var = (sx0) childAt;
                        if (i14 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i14 != childCount - 1) {
                            z15 = false;
                        }
                        if (sx0Var.f38098b != z14 || sx0Var.f38099c != z15) {
                            sx0Var.f38098b = z14;
                            sx0Var.f38099c = z15;
                            sx0Var.invalidate();
                        }
                    } else if (childAt instanceof qx0) {
                        qx0 qx0Var = (qx0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 == childCount - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (qx0Var.f37423b != z11 || qx0Var.f37424c != z12) {
                            qx0Var.f37423b = z11;
                            qx0Var.f37424c = z12;
                            qx0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z15 = false;
                        }
                        if (qx0Var.d != z13 || qx0Var.f37425e != z15) {
                            qx0Var.d = z13;
                            qx0Var.f37425e = z15;
                            qx0Var.invalidate();
                        }
                    } else if (childAt instanceof rx0) {
                        rx0 rx0Var = (rx0) childAt;
                        if (i14 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 != childCount - 1) {
                            z15 = false;
                        }
                        if (rx0Var.f37755c != z10 || rx0Var.d != z15) {
                            rx0Var.f37755c = z10;
                            rx0Var.d = z15;
                            rx0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        w70Var.setTextSize(1, 13.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var.setMaxLines(1);
        w70Var.setSingleLine();
        w70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        w70Var.setText(spannableStringBuilder);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.f27920ei;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38423a;
        this.f38426e.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27901di, h6Var));
        try {
            if (this.f38428n != null && this.f38429r != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var);
                for (int i10 = 0; i10 < this.f38428n.size(); i10++) {
                    u70 u70Var = (u70) this.f38428n.get(i10);
                    if (u70Var != null) {
                        u70Var.setLinkTextColor(w02);
                        u70Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f38429r.size(); i11++) {
                    f5 f5Var = (f5) this.f38429r.get(i11);
                    if (f5Var != null) {
                        f5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i13 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i13 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i13).invalidate();
                        i13++;
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
