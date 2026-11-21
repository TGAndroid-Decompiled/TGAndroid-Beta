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
public final class ey0 extends TableLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f35013a;
    public final Path f35014b;
    public final float[] f35015c;
    public final Paint d;
    public final Paint f35016e;
    public final float f35017f;
    public final float h;
    public ArrayList f35018n;
    public ArrayList f35019r;

    public ey0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f35014b = new Path();
        this.f35015c = new float[8];
        this.d = new Paint(1);
        this.f35016e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f35017f = max;
        this.h = max / 2.0f;
        this.f35013a = h6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final cy0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        org.telegram.ui.ActionBar.t6.U(lVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(lVar, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        cy0 cy0Var = new cy0(this, lVar, true);
        tableRow.addView(cy0Var, layoutParams);
        addView(tableRow);
        return cy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        x5 x5Var = new x5(getContext());
        org.telegram.ui.ActionBar.t6.U(x5Var, org.telegram.ui.ActionBar.m6.G6, this.f35013a);
        x5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.fj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        x5Var.setText(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, x5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ks.i(x5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new cy0(this, x5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable, Integer num) {
        nc ncVar = new nc(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        org.telegram.ui.ActionBar.t6.U(ncVar, i7, h6Var);
        ncVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) oc.b(str, runnable, h6Var, num));
        }
        ncVar.setText(spannableStringBuilder);
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow e(CharSequence charSequence, CharSequence charSequence2, dy0[] dy0VarArr, nc[] ncVarArr) {
        nc ncVar = new nc(getContext());
        org.telegram.ui.ActionBar.t6.U(ncVar, org.telegram.ui.ActionBar.m6.G6, this.f35013a);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setText(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        dy0 dy0Var = new dy0(this, charSequence);
        if (dy0VarArr != null) {
            dy0VarArr[0] = dy0Var;
        }
        tableRow.addView(dy0Var, layoutParams);
        tableRow.addView(new by0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ncVarArr != null) {
            ncVarArr[0] = ncVar;
        }
        return tableRow;
    }

    public final TableRow f(CharSequence charSequence, String str) {
        return e(str, charSequence, null, null);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        e(str, org.telegram.messenger.gd.a0(null, null, 2131742519, org.telegram.messenger.gd.E0().s0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.g5 g5Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        nc ncVar = new nc(context, h6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.U(ncVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(ncVar, i7, h6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        ncVar.setText(spannableStringBuilder);
        if (str != null) {
            ncVar.P = new oc(str, g5Var, h6Var);
        }
        return l(ncVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.f2 f2Var, String str, org.telegram.ui.Wallet.f5 f5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final m80 m80Var = new m80(getContext(), null);
        m80Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        m80Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.m6.f29486j5;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        m80Var.setMaxLines(4);
        int i11 = 0;
        m80Var.setSingleLine(false);
        m80Var.setText(charSequence2);
        m80Var.setDisablePaddingsOffsetY(true);
        m80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(m80Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            oc ocVar = new oc(str, f5Var, h6Var);
            final nc ncVar = new nc(getContext(), h6Var);
            ncVar.setTextSize(1, f10);
            ncVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ocVar, 0, spannableString.length(), 33);
            ncVar.setText(spannableString);
            if (f2Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) m80Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + ocVar.a();
            frameLayout.addView(ncVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    m80 m80Var2 = m80.this;
                    if (m80Var2.getLayout() != null && m80Var2.getLayout().getLineCount() > 0) {
                        int left = m80Var2.getLeft();
                        float lineRight = m80Var2.getLayout().getLineRight(0) + m80Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        nc ncVar2 = ncVar;
                        ncVar2.setTranslationX(Math.min(0.0f, lineRight - ncVar2.getLeft()));
                    }
                }
            });
        }
        if (f2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232105);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.m6.f29713v6;
            org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new m8(25, charSequence2, f2Var));
            c8.ra.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var)), 7, -1);
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
            frameLayout.addView(imageView, c8.ma.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.f2 f2Var) {
        j(str, charSequence, i7, f2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        nc ncVar = new nc(context, h6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(ncVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.G(ncVar, i10, h6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, ncVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47581b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.N0(2131744708, null);
            oq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f38339e = L;
            a10.f38340f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.o10.B(j3)) {
            str3 = org.telegram.messenger.gd.N0(2131744684, null);
            oq a11 = di.kb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f38339e = L3;
            a11.f38340f = L4;
            imageReceiver.w0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                if (c22 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str2 = org.telegram.messenger.o10.q(c22);
                f5Var.e(c22);
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (O0 == null) {
                    str2 = "";
                } else {
                    str2 = O0.title;
                }
                f5Var.b(O0);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ncVar.P = new oc(str, runnable2, h6Var);
        }
        ncVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ncVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        final k80 k80Var = new k80(context, h6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.X(k80Var, i10, h6Var);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        k80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, k80Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47581b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.N0(2131744708, null);
            oq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f38339e = L;
            a10.f38340f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.o10.B(j3)) {
                str3 = org.telegram.messenger.gd.N0(2131744684, null);
                oq a11 = di.kb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f38339e = L3;
                a11.f38340f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                String q10 = org.telegram.messenger.o10.q(c22);
                f5Var.e(c22);
                str3 = q10;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == null) {
                    str2 = "";
                } else {
                    str2 = O0.title;
                }
                f5Var.b(O0);
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            k80Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        final n5 n5Var = new n5(org.telegram.messenger.g0.L(20.0f), k80Var);
        n5Var.k(Integer.valueOf(w02));
        n5Var.J = org.telegram.messenger.g0.L(12.0f);
        n5Var.K = 0;
        if (this.f35018n == null) {
            this.f35018n = new ArrayList();
            this.f35019r = new ArrayList();
        }
        this.f35018n.add(k80Var);
        this.f35019r.add(n5Var);
        k80Var.addOnAttachStateChangeListener(new bi.s2(n5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(2131232309).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ay0.a(java.lang.Object):void");
            }
        };
        x10Var.a(null);
        k80Var.i(n5Var);
        org.telegram.messenger.ks.f(i7).h(k80Var, org.telegram.messenger.ks.f25205r, x10Var);
        org.telegram.messenger.ks.f(i7).h(k80Var, org.telegram.messenger.ks.f25198p5, x10Var);
        k80Var.l(spannableStringBuilder, false);
        return l(k80Var, str);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f35016e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f35017f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.m6.f29462hi;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29445gi, h6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z16 = true;
                    if (childAt instanceof dy0) {
                        dy0 dy0Var = (dy0) childAt;
                        if (i14 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (dy0Var.f34617b != z15 || dy0Var.f34618c != z16) {
                            dy0Var.f34617b = z15;
                            dy0Var.f34618c = z16;
                            dy0Var.invalidate();
                        }
                    } else if (childAt instanceof by0) {
                        by0 by0Var = (by0) childAt;
                        if (i14 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i14 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (by0Var.f33948b != z12 || by0Var.f33949c != z13) {
                            by0Var.f33948b = z12;
                            by0Var.f33949c = z13;
                            by0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (by0Var.d != z14 || by0Var.f33950e != z16) {
                            by0Var.d = z14;
                            by0Var.f33950e = z16;
                            by0Var.invalidate();
                        }
                    } else if (childAt instanceof cy0) {
                        cy0 cy0Var = (cy0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (cy0Var.f34338c != z11 || cy0Var.d != z16) {
                            cy0Var.f34338c = z11;
                            cy0Var.d = z16;
                            cy0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.f29462hi;
        org.telegram.ui.ActionBar.h6 h6Var = this.f35013a;
        this.f35016e.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29445gi, h6Var));
        try {
            if (this.f35018n != null && this.f35019r != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
                for (int i10 = 0; i10 < this.f35018n.size(); i10++) {
                    k80 k80Var = (k80) this.f35018n.get(i10);
                    if (k80Var != null) {
                        k80Var.setLinkTextColor(w02);
                        k80Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f35019r.size(); i11++) {
                    n5 n5Var = (n5) this.f35019r.get(i11);
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(w02));
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
