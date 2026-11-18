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
public final class cy0 extends TableLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f34196a;
    public final Path f34197b;
    public final float[] f34198c;
    public final Paint d;
    public final Paint f34199e;
    public final float f34200f;
    public final float h;
    public ArrayList f34201n;
    public ArrayList f34202r;

    public cy0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f34197b = new Path();
        this.f34198c = new float[8];
        this.d = new Paint(1);
        this.f34199e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f34200f = max;
        this.h = max / 2.0f;
        this.f34196a = i6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final ay0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        org.telegram.ui.ActionBar.u6.U(lVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(lVar, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        ay0 ay0Var = new ay0(this, lVar, true);
        tableRow.addView(ay0Var, layoutParams);
        addView(tableRow);
        return ay0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        w5 w5Var = new w5(getContext());
        org.telegram.ui.ActionBar.u6.U(w5Var, org.telegram.ui.ActionBar.n6.G6, this.f34196a);
        w5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.fj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        w5Var.setText(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, w5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ks.i(w5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new ay0(this, w5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new by0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new zx0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable, Integer num) {
        nc ncVar = new nc(getContext());
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        org.telegram.ui.ActionBar.u6.U(ncVar, i7, i6Var);
        ncVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) oc.b(str, runnable, i6Var, num));
        }
        ncVar.setText(spannableStringBuilder);
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new by0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new zx0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow e(CharSequence charSequence, CharSequence charSequence2, by0[] by0VarArr, nc[] ncVarArr) {
        nc ncVar = new nc(getContext());
        org.telegram.ui.ActionBar.u6.U(ncVar, org.telegram.ui.ActionBar.n6.G6, this.f34196a);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setText(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        by0 by0Var = new by0(this, charSequence);
        if (by0VarArr != null) {
            by0VarArr[0] = by0Var;
        }
        tableRow.addView(by0Var, layoutParams);
        tableRow.addView(new zx0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
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
        e(str, org.telegram.messenger.gd.a0(null, null, 2131742525, org.telegram.messenger.gd.E0().s0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.g5 g5Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        nc ncVar = new nc(context, i6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.U(ncVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(ncVar, i7, i6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        ncVar.setText(spannableStringBuilder);
        if (str != null) {
            ncVar.P = new oc(str, g5Var, i6Var);
        }
        return l(ncVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.w2 w2Var, String str, org.telegram.ui.Wallet.f5 f5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final k80 k80Var = new k80(getContext(), null);
        k80Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        k80Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
        k80Var.setMaxLines(4);
        int i11 = 0;
        k80Var.setSingleLine(false);
        k80Var.setText(charSequence2);
        k80Var.setDisablePaddingsOffsetY(true);
        k80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(k80Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            oc ocVar = new oc(str, f5Var, i6Var);
            final nc ncVar = new nc(getContext(), i6Var);
            ncVar.setTextSize(1, f10);
            ncVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ocVar, 0, spannableString.length(), 33);
            ncVar.setText(spannableString);
            if (w2Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) k80Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + ocVar.a();
            frameLayout.addView(ncVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    k80 k80Var2 = k80.this;
                    if (k80Var2.getLayout() != null && k80Var2.getLayout().getLineCount() > 0) {
                        int left = k80Var2.getLeft();
                        float lineRight = k80Var2.getLayout().getLineRight(0) + k80Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        nc ncVar2 = ncVar;
                        ncVar2.setTranslationX(Math.min(0.0f, lineRight - ncVar2.getLeft()));
                    }
                }
            });
        }
        if (w2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232105);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.n6.f29731v6;
            org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new y7(27, charSequence2, w2Var));
            c8.ra.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var)), 7, -1);
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
            frameLayout.addView(imageView, c8.ma.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.w2 w2Var) {
        j(str, charSequence, i7, w2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new by0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new zx0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        nc ncVar = new nc(context, i6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(ncVar, i10, i6Var);
        org.telegram.ui.ActionBar.u6.G(ncVar, i10, i6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, ncVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47557b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.M0(2131744714, null);
            mq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f37610e = L;
            a10.f37611f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.o10.B(j3)) {
            str3 = org.telegram.messenger.gd.M0(2131744690, null);
            mq a11 = di.kb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f37610e = L3;
            a11.f37611f = L4;
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
            ncVar.P = new oc(str, runnable2, i6Var);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        final i80 i80Var = new i80(context, i6Var);
        i80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.X(i80Var, i10, i6Var);
        i80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        i80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, i80Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47557b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.M0(2131744714, null);
            mq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f37610e = L;
            a10.f37611f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.o10.B(j3)) {
                str3 = org.telegram.messenger.gd.M0(2131744690, null);
                mq a11 = di.kb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f37610e = L3;
                a11.f37611f = L4;
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
            i80Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        final m5 m5Var = new m5(org.telegram.messenger.g0.L(20.0f), i80Var);
        m5Var.k(Integer.valueOf(w02));
        m5Var.J = org.telegram.messenger.g0.L(12.0f);
        m5Var.K = 0;
        if (this.f34201n == null) {
            this.f34201n = new ArrayList();
            this.f34202r = new ArrayList();
        }
        this.f34201n.add(i80Var);
        this.f34202r.add(m5Var);
        i80Var.addOnAttachStateChangeListener(new bi.o2(m5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(2131232309).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yx0.a(java.lang.Object):void");
            }
        };
        x10Var.a(null);
        i80Var.i(m5Var);
        org.telegram.messenger.ks.f(i7).h(i80Var, org.telegram.messenger.ks.f25179r, x10Var);
        org.telegram.messenger.ks.f(i7).h(i80Var, org.telegram.messenger.ks.f25166o5, x10Var);
        i80Var.l(spannableStringBuilder, false);
        return l(i80Var, str);
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
        Paint paint = this.f34199e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f34200f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.n6.f29480hi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29463gi, i6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z16 = true;
                    if (childAt instanceof by0) {
                        by0 by0Var = (by0) childAt;
                        if (i14 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (by0Var.f33815b != z15 || by0Var.f33816c != z16) {
                            by0Var.f33815b = z15;
                            by0Var.f33816c = z16;
                            by0Var.invalidate();
                        }
                    } else if (childAt instanceof zx0) {
                        zx0 zx0Var = (zx0) childAt;
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
                        if (zx0Var.f42967b != z12 || zx0Var.f42968c != z13) {
                            zx0Var.f42967b = z12;
                            zx0Var.f42968c = z13;
                            zx0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (zx0Var.d != z14 || zx0Var.f42969e != z16) {
                            zx0Var.d = z14;
                            zx0Var.f42969e = z16;
                            zx0Var.invalidate();
                        }
                    } else if (childAt instanceof ay0) {
                        ay0 ay0Var = (ay0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (ay0Var.f33491c != z11 || ay0Var.d != z16) {
                            ay0Var.f33491c = z11;
                            ay0Var.d = z16;
                            ay0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.f29480hi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34196a;
        this.f34199e.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29463gi, i6Var));
        try {
            if (this.f34201n != null && this.f34202r != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                for (int i10 = 0; i10 < this.f34201n.size(); i10++) {
                    i80 i80Var = (i80) this.f34201n.get(i10);
                    if (i80Var != null) {
                        i80Var.setLinkTextColor(w02);
                        i80Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f34202r.size(); i11++) {
                    m5 m5Var = (m5) this.f34202r.get(i11);
                    if (m5Var != null) {
                        m5Var.k(Integer.valueOf(w02));
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
