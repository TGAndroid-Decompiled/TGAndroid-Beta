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
public final class xy0 extends TableLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f32659a;
    public final Path f32660b;
    public final float[] f32661c;
    public final Paint d;
    public final Paint e;
    public final float f32662f;
    public final float h;
    public ArrayList f32663n;
    public ArrayList f32664r;

    public xy0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f32660b = new Path();
        this.f32661c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.i0.L(0.66f));
        this.f32662f = max;
        this.h = max / 2.0f;
        this.f32659a = p6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final vy0 a(CharSequence charSequence) {
        nh.p pVar = new nh.p(getContext());
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        org.telegram.ui.ActionBar.a7.V(pVar, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(pVar, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        pVar.setTextSize(1, 14.0f);
        pVar.setText(org.telegram.messenger.k6.m(charSequence, pVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.at.i(pVar);
        pVar.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        vy0 vy0Var = new vy0(this, pVar, true);
        tableRow.addView(vy0Var, layoutParams);
        addView(tableRow);
        return vy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        n5 n5Var = new n5(getContext());
        org.telegram.ui.ActionBar.a7.V(n5Var, org.telegram.ui.ActionBar.t6.G6, this.f32659a);
        n5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.kj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        n5Var.setText(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, n5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, n5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.at.i(n5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new vy0(this, n5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, wy0[] wy0VarArr, ec[] ecVarArr) {
        ec ecVar = new ec(getContext());
        org.telegram.ui.ActionBar.a7.V(ecVar, org.telegram.ui.ActionBar.t6.G6, this.f32659a);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setText(org.telegram.messenger.k6.m(charSequence2, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.at.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        wy0 wy0Var = new wy0(this, charSequence);
        if (wy0VarArr != null) {
            wy0VarArr[0] = wy0Var;
        }
        tableRow.addView(wy0Var, layoutParams);
        tableRow.addView(new uy0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ecVarArr != null) {
            ecVarArr[0] = ecVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ec ecVar = new ec(getContext());
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        org.telegram.ui.ActionBar.a7.V(ecVar, i10, p6Var);
        ecVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.k6.m(charSequence, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b(str2, runnable, p6Var, num));
        }
        ecVar.setText(spannableStringBuilder);
        org.telegram.messenger.at.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new wy0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new uy0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new wy0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new uy0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, org.telegram.messenger.dd.a0(null, null, 2131742808, org.telegram.messenger.dd.D0().r0().format(new Date(j10)), org.telegram.messenger.dd.D0().o0().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.t4 t4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        ec ecVar = new ec(context, p6Var);
        ecVar.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.a7.V(ecVar, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(ecVar, i10, p6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.y(5, runnable), 0, spannableStringBuilder.length(), 33);
        ecVar.setText(spannableStringBuilder);
        if (str != null) {
            ecVar.O = new fc(str, t4Var, p6Var);
        }
        return l(ecVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i10, rh.n nVar, String str, org.telegram.ui.Wallet.s4 s4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final p80 p80Var = new p80(getContext(), null);
        p80Var.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        float f7 = i10;
        p80Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        p80Var.setMaxLines(4);
        int i12 = 0;
        p80Var.setSingleLine(false);
        p80Var.setText(charSequence2);
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(10.66f), org.telegram.messenger.i0.L(9.33f));
        frameLayout.addView(p80Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            fc fcVar = new fc(str, s4Var, p6Var);
            final ec ecVar = new ec(getContext(), p6Var);
            ecVar.setTextSize(1, f7);
            ecVar.setPadding(0, org.telegram.messenger.i0.L(9.33f), 0, org.telegram.messenger.i0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(fcVar, 0, spannableString.length(), 33);
            ecVar.setText(spannableString);
            if (nVar != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) p80Var.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f10) + fcVar.a();
            frameLayout.addView(ecVar, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, f10, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    p80 p80Var2 = p80.this;
                    if (p80Var2.getLayout() != null && p80Var2.getLayout().getLineCount() > 0) {
                        int left = p80Var2.getLeft();
                        float lineRight = p80Var2.getLayout().getLineRight(0) + p80Var2.getPaddingLeft() + left + org.telegram.messenger.i0.L(6.0f);
                        ec ecVar2 = ecVar;
                        ecVar2.setTranslationX(Math.min(0.0f, lineRight - ecVar2.getLeft()));
                    }
                }
            });
        }
        if (nVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232102);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.t6.f21260v6;
            org.telegram.ui.ActionBar.a7.t(imageView, i13, p6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new sr(16, charSequence2, nVar));
            w7.e6.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var)), 7, -1);
            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i13);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var);
            frameLayout.addView(imageView, w7.b6.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i10, rh.n nVar) {
        j(str, charSequence, i10, nVar, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new wy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new uy0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        ec ecVar = new ec(context, p6Var);
        ecVar.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(ecVar, i11, p6Var);
        org.telegram.ui.ActionBar.a7.H(ecVar, i11, p6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i10, ecVar);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = e5Var.f36731b;
        if (i12 == 0) {
            str3 = org.telegram.messenger.dd.L0(2131744967, null);
            eq a2 = rh.c8.a(44, "anonymous");
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            a2.e = L;
            a2.f25904f = L2;
            imageReceiver.w0(a2);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.i20.A(j10)) {
            str3 = org.telegram.messenger.dd.L0(2131744943, null);
            eq a10 = rh.c8.a(44, "fragment");
            int L3 = org.telegram.messenger.i0.L(16.0f);
            int L4 = org.telegram.messenger.i0.L(16.0f);
            a10.e = L3;
            a10.f25904f = L4;
            imageReceiver.w0(a10);
            z11 = true;
            z10 = false;
        } else {
            if (j10 >= 0) {
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10));
                if (Z1 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str2 = org.telegram.messenger.i20.p(Z1);
                e5Var.e(Z1);
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
                if (L0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (L0 == null) {
                    str2 = "";
                } else {
                    str2 = L0.title;
                }
                e5Var.b(L0);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.y(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ecVar.O = new fc(str, runnable2, p6Var);
        }
        ecVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ecVar, charSequence);
    }

    public final void n(String str, int i10, long j10, Runnable runnable) {
        m(str, i10, j10, runnable, null, null);
    }

    public final TableRow o(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        final n80 n80Var = new n80(context, p6Var);
        n80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f));
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.Y(n80Var, i11, p6Var);
        n80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        n80Var.setTextSize(14);
        org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(24.0f, i10, n80Var);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = e5Var.f36731b;
        if (i12 == 0) {
            str3 = org.telegram.messenger.dd.L0(2131744967, null);
            eq a2 = rh.c8.a(44, "anonymous");
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            a2.e = L;
            a2.f25904f = L2;
            imageReceiver.w0(a2);
            z10 = false;
        } else {
            if (org.telegram.messenger.i20.A(j10)) {
                str3 = org.telegram.messenger.dd.L0(2131744943, null);
                eq a10 = rh.c8.a(44, "fragment");
                int L3 = org.telegram.messenger.i0.L(16.0f);
                int L4 = org.telegram.messenger.i0.L(16.0f);
                a10.e = L3;
                a10.f25904f = L4;
                imageReceiver.w0(a10);
            } else if (j10 >= 0) {
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10));
                String p5 = org.telegram.messenger.i20.p(Z1);
                e5Var.e(Z1);
                str3 = p5;
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
                if (L0 == null) {
                    str2 = "";
                } else {
                    str2 = L0.title;
                }
                e5Var.b(L0);
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(e5Var, 0, 1, 33);
        if (z10) {
            n80Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.y(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        final d5 d5Var = new d5(org.telegram.messenger.i0.L(20.0f), n80Var);
        d5Var.k(Integer.valueOf(w02));
        d5Var.I = org.telegram.messenger.i0.L(12.0f);
        d5Var.J = 0;
        if (this.f32663n == null) {
            this.f32663n = new ArrayList();
            this.f32664r = new ArrayList();
        }
        this.f32663n.add(n80Var);
        this.f32664r.add(d5Var);
        n80Var.addOnAttachStateChangeListener(new ty0(d5Var, 0));
        final Drawable mutate = getContext().getResources().getDrawable(2131232306).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, i11, p6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.r20 r20Var = new org.telegram.messenger.r20() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy0.a(java.lang.Object):void");
            }
        };
        r20Var.a(null);
        n80Var.i(d5Var);
        org.telegram.messenger.at.f(i10).h(n80Var, org.telegram.messenger.at.f14772r, r20Var);
        org.telegram.messenger.at.f(i10).h(n80Var, org.telegram.messenger.at.f14748m5, r20Var);
        n80Var.l(spannableStringBuilder, false);
        return l(n80Var, str);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f32662f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i14 = org.telegram.ui.ActionBar.t6.f20959ei;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20942di, p6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof wy0) {
                        wy0 wy0Var = (wy0) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (wy0Var.f32337b != z15 || wy0Var.f32338c != z16) {
                            wy0Var.f32337b = z15;
                            wy0Var.f32338c = z16;
                            wy0Var.invalidate();
                        }
                    } else if (childAt instanceof uy0) {
                        uy0 uy0Var = (uy0) childAt;
                        if (i15 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i15 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (uy0Var.f31114b != z12 || uy0Var.f31115c != z13) {
                            uy0Var.f31114b = z12;
                            uy0Var.f31115c = z13;
                            uy0Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (uy0Var.d != z14 || uy0Var.e != z16) {
                            uy0Var.d = z14;
                            uy0Var.e = z16;
                            uy0Var.invalidate();
                        }
                    } else if (childAt instanceof vy0) {
                        vy0 vy0Var = (vy0) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (vy0Var.f32021c != z11 || vy0Var.d != z16) {
                            vy0Var.f32021c = z11;
                            vy0Var.d = z16;
                            vy0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        p80 p80Var = new p80(getContext(), null);
        p80Var.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        p80Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setMaxLines(1);
        p80Var.setSingleLine();
        p80Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setPadding(org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(9.33f), org.telegram.messenger.i0.L(10.66f), org.telegram.messenger.i0.L(9.33f));
        frameLayout.addView(p80Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.f20959ei;
        org.telegram.ui.ActionBar.p6 p6Var = this.f32659a;
        this.e.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.d.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20942di, p6Var));
        try {
            if (this.f32663n != null && this.f32664r != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                for (int i11 = 0; i11 < this.f32663n.size(); i11++) {
                    n80 n80Var = (n80) this.f32663n.get(i11);
                    if (n80Var != null) {
                        n80Var.setLinkTextColor(w02);
                        n80Var.invalidate();
                    }
                }
                for (int i12 = 0; i12 < this.f32664r.size(); i12++) {
                    d5 d5Var = (d5) this.f32664r.get(i12);
                    if (d5Var != null) {
                        d5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i14 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i14 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i14).invalidate();
                        i14++;
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
