package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i8 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.x1 I;
    public int J;
    public int K;
    public int L;
    public y7 M;
    public org.telegram.messenger.ou N;
    public an O;
    public hi.l3 P;
    public int Q;
    public int R;
    public ValueAnimator S;
    public final SparseArray T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public final int Y;
    public boolean Z;
    public x7 f47938a;
    public final int f47939a0;
    public di.c1 f47940b;
    public final int f47941b0;
    public v4.b0 f47942c;
    public di.e1 f47943c0;
    public final TextPaint d;
    public int f47944d0;
    public final TextPaint f47945e;
    public boolean f47946e0;
    public final TextPaint f47947f;
    public int f47948f0;
    public fi.k6 f47949g0;
    public TextView h;
    public w7 f47950h0;
    public int f47951i0;
    public w0 f47952j0;
    public hi.n5 f47953k0;
    public View f47954l0;
    public final Path m0;
    public TextView f47955n;
    public final xh.f f47956n0;
    public int f47957o0;
    public boolean f47958p0;
    public int f47959q0;
    public final Paint f47960r;
    public int f47961r0;
    public final Paint f47962s;
    public int f47963s0;
    public bi.o2 f47964w;
    public final Paint f47965x;
    public long f47966y;

    public i8(int i7, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f47945e = new TextPaint(1);
        this.f47947f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f47960r = paint;
        this.f47962s = new Paint(1);
        this.f47965x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.f47956n0 = new xh.f();
        this.Y = i7;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.f47939a0 = calendar.get(1);
            this.f47941b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public static void Z(i8 i8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = i8Var.T;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i7 = 0; i7 < tL_messages_searchResultsCalendar.periods.size(); i7++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i7).date * 1000);
                int i10 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i10, sparseArray2);
                }
                g8 g8Var = new g8();
                g8Var.f47371a = new org.telegram.messenger.gj(i8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i7), false, false);
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = i8Var.V + tL_messages_searchResultsCalendar.periods.get(i7).count;
                i8Var.V = i11;
                g8Var.f47373c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((g8) sparseArray2.get(i12, null)).f47376g) {
                    sparseArray2.put(i12, g8Var);
                }
                int i13 = i8Var.X;
                if (i10 < i13 || i13 == 0) {
                    i8Var.X = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            i8Var.f47944d0 = i14;
            while (true) {
                calendar.setTimeInMillis(i14 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() / 1000 > currentTimeMillis) {
                    break;
                }
                int i15 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i15);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i15, sparseArray3);
                }
                int i16 = calendar.get(5) - 1;
                if (sparseArray3.get(i16, null) == null) {
                    g8 g8Var2 = new g8();
                    g8Var2.f47376g = false;
                    g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, g8Var2);
                }
                i14 += 86400;
            }
            i8Var.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                i8Var.W = ((TLRPC.Message) i5.c.h(1, tL_messages_searchResultsCalendar.messages)).f28072id;
                i8Var.U = false;
                i8Var.v0();
            } else {
                i8Var.U = true;
            }
            if (i8Var.Z) {
                i8Var.G = true;
            }
            i8Var.f47940b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            i8Var.M.k(0, i8Var.L);
            int i17 = i8Var.L;
            if (timeInMillis > i17) {
                i8Var.M.o(i17 + 1, timeInMillis);
                i8Var.L = timeInMillis;
            }
            if (i8Var.U) {
                i8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.o4 b0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.o4 c0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.o4 d0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.o4 e0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.o4 f0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.o4 g0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static void h0(i8 i8Var) {
        if (i8Var.f47964w == null) {
            return;
        }
        int measuredWidth = (int) (i8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (i8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        i8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        i8Var.f47964w.setBackground(new BitmapDrawable(createBitmap));
        i8Var.f47964w.setAlpha(0.0f);
        i8Var.f47964w.setVisibility(0);
    }

    public final void A0(f8 f8Var, boolean z10) {
        int i7;
        int i10;
        if (this.Q != 0 && this.R != 0) {
            if (f8Var.f47053n != null) {
                if (!z10) {
                    SparseArray sparseArray = f8Var.f47057x;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        f8Var.c(sparseArray.keyAt(i11), 0, 0, false, false);
                    }
                }
                int i12 = f8Var.f47051e;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < f8Var.d; i16++) {
                    g8 g8Var = (g8) f8Var.f47053n.get(i16, null);
                    if (g8Var != null && (i10 = g8Var.h) >= this.Q && i10 <= this.R) {
                        if (i13 == -1) {
                            i13 = i12;
                        }
                        i14 = i12;
                    }
                    i12++;
                    if (i12 >= 7) {
                        if (i13 != -1 && i14 != -1) {
                            i7 = i15;
                            f8Var.c(i7, i13, i14, true, z10);
                        } else {
                            i7 = i15;
                            f8Var.c(i7, 0, 0, false, z10);
                        }
                        i15 = i7 + 1;
                        i13 = -1;
                        i14 = -1;
                        i12 = 0;
                    }
                }
                int i17 = i15;
                if (i13 != -1 && i14 != -1) {
                    f8Var.c(i17, i13, i14, true, z10);
                    return;
                } else {
                    f8Var.c(i17, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = f8Var.f47057x;
        for (int i18 = 0; i18 < sparseArray2.size(); i18++) {
            f8Var.c(sparseArray2.keyAt(i18), 0, 0, false, z10);
        }
    }

    public final void B0() {
        int abs;
        boolean z10;
        String M0;
        TextView textView;
        hi.l3 l3Var;
        if (!this.f47946e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752642, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i7 = this.Q;
        int i10 = this.R;
        if (i7 == i10 && i7 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i7 - i10) / 86400) + 1;
        }
        boolean z11 = this.f47958p0;
        int i11 = this.f47957o0;
        if (abs == i11 && z11 == this.H) {
            return;
        }
        if (i11 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47957o0 = abs;
        boolean z12 = this.H;
        this.f47958p0 = z12;
        float f10 = 1.0f;
        if (abs > 0) {
            M0 = org.telegram.messenger.hd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            M0 = org.telegram.messenger.hd.M0(2131745660, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131752642, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.f47955n.setText(org.telegram.messenger.hd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.f47955n.setText(org.telegram.messenger.hd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        di.e1 e1Var = this.f47943c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.f47955n;
        }
        e1Var.a(textView, true);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        w4Var.getClass();
        w4Var.D(str, z10, 150L, org.telegram.ui.Components.er.h);
        if ((!this.H || abs > 0) && (l3Var = this.P) != null) {
            l3Var.f(true);
        }
        if (abs <= 0 && !this.H) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(org.telegram.messenger.g0.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f47955n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f47955n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new nn(this.f47955n)).start();
            this.h.setEnabled(true);
            this.f47955n.setEnabled(false);
            return;
        }
        if (this.f47955n.getVisibility() == 8) {
            this.f47955n.setAlpha(0.0f);
            this.f47955n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        }
        this.f47955n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f47955n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new nn(this.h)).start();
        ViewPropertyAnimator animate = this.f47955n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f47955n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f47947f;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint3 = this.f47945e;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextAlign(align);
        x7 x7Var = new x7(this, context);
        this.f47938a = x7Var;
        x7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        this.f47938a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752642, null));
        di.c1 c1Var = new di.c1(8, context, this);
        this.f47940b = c1Var;
        v4.b0 b0Var = new v4.b0();
        this.f47942c = b0Var;
        c1Var.setLayoutManager(b0Var);
        this.f47942c.k1(true);
        di.c1 c1Var2 = this.f47940b;
        y7 y7Var = new y7(this, 0);
        this.M = y7Var;
        c1Var2.setAdapter(y7Var);
        this.f47940b.j(new g3(this, 4));
        if (this.f47948f0 == 0 && this.f47946e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var2 = this.f47938a;
        di.c1 c1Var3 = this.f47940b;
        if (z10) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        x7Var2.addView(c1Var3, c8.ja.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        hi.n5 n5Var = new hi.n5(this, context, new String[]{org.telegram.messenger.hd.M0(2131752640, null), org.telegram.messenger.hd.M0(2131752636, null), org.telegram.messenger.hd.M0(2131752635, null), org.telegram.messenger.hd.M0(2131752637, null), org.telegram.messenger.hd.M0(2131752641, null), org.telegram.messenger.hd.M0(2131752639, null), org.telegram.messenger.hd.M0(2131752638, null)}, 2);
        this.f47953k0 = n5Var;
        n5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        hi.n5 n5Var2 = this.f47953k0;
        fh.g c10 = getBaseSimpleGlass().f56042c.c(this.f47953k0, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        n5Var2.setBackground(c10);
        this.f47953k0.setTranslationY(ri.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 28));
        this.fragmentView = this.f47938a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i7 = calendar.get(2);
        this.K = i7;
        int i10 = this.f47939a0;
        if (i10 != 0) {
            int v = com.google.android.gms.internal.vision.e2.v(this.J, i10, 12, i7) - this.f47941b0;
            this.L = v + 1;
            this.f47942c.h1(v, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.I = x1Var;
        this.simpleActionBar.setBackButtonDrawable(x1Var);
        this.I.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.f47943c0 = new di.e1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f51812b;

                {
                    this.f51812b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f51812b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f51812b;
                            int i11 = i8Var2.f47957o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    hi.l3 l3Var = new hi.l3(i8Var2.f47938a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.f14554e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.f14575v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f56042c);
                                    i8Var2.f47938a.addView(i8Var2.P, c8.ja.e(-1, 150, 55));
                                    i8Var2.P.u(org.telegram.messenger.hd.M0(2131745659, null));
                                }
                                i8Var2.P.y(i8Var2.f47943c0, true);
                                return;
                            }
                            org.telegram.ui.Components.t4.q(i8Var2, i11, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f47966y)), null, false, new w7(i8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(org.telegram.messenger.hd.M0(2131745660, null));
            this.f47943c0.addView(this.h, c8.ja.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f47955n = textView2;
            textView2.setGravity(17);
            this.f47955n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.f47955n.setSingleLine();
            this.f47955n.setTextSize(1, 15.0f);
            this.f47955n.setTypeface(org.telegram.messenger.g0.o());
            this.f47955n.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f51812b;

                {
                    this.f51812b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f51812b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f51812b;
                            int i11 = i8Var2.f47957o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    hi.l3 l3Var = new hi.l3(i8Var2.f47938a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.f14554e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.f14575v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f56042c);
                                    i8Var2.f47938a.addView(i8Var2.P, c8.ja.e(-1, 150, 55));
                                    i8Var2.P.u(org.telegram.messenger.hd.M0(2131745659, null));
                                }
                                i8Var2.P.y(i8Var2.f47943c0, true);
                                return;
                            }
                            org.telegram.ui.Components.t4.q(i8Var2, i11, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f47966y)), null, false, new w7(i8Var2), null);
                            return;
                    }
                }
            });
            this.f47955n.setVisibility(8);
            this.f47943c0.addView(this.f47955n, c8.ja.e(-2, 38, 17));
            this.f47938a.addView(this.f47943c0, c8.ja.e(-1, 50, 80));
            this.f47943c0.a(this.h, false);
            int L = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i11 = org.telegram.ui.ActionBar.j6.f29135sf;
            org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.a0(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 51), L, L), null, org.telegram.ui.ActionBar.q6.g(i11, 51), null);
            TextView textView4 = this.f47955n;
            int i12 = org.telegram.ui.ActionBar.j6.f29090q7;
            org.telegram.ui.ActionBar.q6.Q(textView4, org.telegram.ui.ActionBar.j6.a0(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 51), L, L), null, org.telegram.ui.ActionBar.q6.g(i12, 51), null);
            org.telegram.ui.ActionBar.q6.U(this.h, i11, null);
            org.telegram.ui.ActionBar.q6.U(this.f47955n, i12, null);
        }
        View view = new View(context);
        this.f47954l0 = view;
        this.f47938a.addView(view, c8.ja.e(-1, 0, 48));
        this.f47954l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
        this.f47938a.addView(this.f47953k0, c8.ja.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25605x5 && this.f47949g0 == ((fi.k6) objArr[0])) {
            z0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f47940b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i7 = org.telegram.ui.ActionBar.j6.f28784a;
        int i10 = org.telegram.ui.ActionBar.j6.f28784a;
        int i11 = org.telegram.ui.ActionBar.j6.f28784a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.H) {
            if (z10) {
                this.H = false;
                this.R = 0;
                this.Q = 0;
                B0();
                u0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f47966y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i7 = getArguments().getInt("type");
        this.f47948f0 = i7;
        if (i7 == 2) {
            this.f47949g0 = org.telegram.messenger.np.s1(this.currentAccount).P1().A(0, -1, this.f47966y, true);
        } else if (i7 == 3) {
            this.f47949g0 = org.telegram.messenger.np.s1(this.currentAccount).P1().A(1, -1, this.f47966y, true);
        }
        fi.k6 k6Var = this.f47949g0;
        if (k6Var != null) {
            this.f47950h0 = new w7(this);
        }
        if (this.f47966y >= 0) {
            this.f47946e0 = true;
        } else {
            this.f47946e0 = false;
        }
        if (k6Var != null) {
            org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25605x5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f47949g0 != null) {
            org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25605x5);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f47954l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.f47953k0.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f47947f != null && this.f47945e != null) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false);
            int x04 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
            if (x02 != this.f47959q0 || x03 != this.f47961r0 || x04 != this.f47963s0) {
                this.f47959q0 = x02;
                this.f47961r0 = x03;
                this.f47963s0 = x04;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.o2 o2Var;
        if (z10 && (o2Var = this.f47964w) != null && o2Var.getVisibility() == 0) {
            this.f47964w.setVisibility(8);
            this.f47964w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        bi.o2 o2Var = this.f47964w;
        if (o2Var != null && o2Var.getVisibility() == 0) {
            if (z10) {
                this.f47964w.setAlpha(1.0f - f10);
            } else {
                this.f47964w.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Z = true;
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.f47954l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.c cVar = this.mSystemInsets;
        w0(cVar.f15575b, cVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.er.f34420f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new ki.s3(this, 19));
        duration.start();
        this.S = duration;
        for (int i7 = 0; i7 < this.f47940b.getChildCount(); i7++) {
            A0((f8) this.f47940b.getChildAt(i7), true);
        }
        for (int i10 = 0; i10 < this.f47940b.getCachedChildCount(); i10++) {
            f8 f8Var = (f8) this.f47940b.P(i10);
            A0(f8Var, false);
            f8.a(f8Var, this.Q, this.R);
            f8.b(f8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.f47940b.getHiddenChildCount(); i11++) {
            f8 f8Var2 = (f8) this.f47940b.V(i11);
            A0(f8Var2, false);
            f8.a(f8Var2, this.Q, this.R);
            f8.b(f8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.f47940b.getAttachedScrapChildCount(); i12++) {
            f8 f8Var3 = (f8) this.f47940b.O(i12);
            A0(f8Var3, false);
            f8.a(f8Var3, this.Q, this.R);
            f8.b(f8Var3, 1.0f);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (!this.F && !this.U) {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < this.f47940b.getChildCount(); i10++) {
                View childAt = this.f47940b.getChildAt(i10);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    int i11 = (f8Var.f47049b * 100) + f8Var.f47050c;
                    if (i11 < i7) {
                        i7 = i11;
                    }
                }
            }
            int i12 = this.X;
            if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i7 % 100) + ((i7 / 100) * 12)) {
                x0();
            }
        }
    }

    public final void w0(int i7, int i10) {
        int i11;
        if (this.f47943c0 != null) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        ri.a.e(this.f47940b, i7, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), i11);
        di.e1 e1Var = this.f47943c0;
        if (e1Var != null) {
            e1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (!this.F && !this.U) {
            if (this.f47949g0 != null) {
                z0();
                this.f47949g0.p(100, false);
                this.F = this.f47949g0.k();
                return;
            }
            this.F = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i7 = this.Y;
            if (i7 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i7 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().j1(this.f47966y);
            if (this.E != 0 && this.f47966y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().j1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.f47940b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new v7(0, this, calendar));
        }
    }

    public final void y0() {
        this.f47945e.setColor(-1);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f47947f.setColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.I.a(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
    }

    public final void z0() {
        this.F = this.f47949g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.f47944d0 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < this.f47949g0.f11944i.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f47949g0.f11944i.get(i7);
            this.f47944d0 = Math.min(this.f47944d0, gjVar.f23817k.date);
            calendar.setTimeInMillis(gjVar.f23817k.date * 1000);
            int i10 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i10, sparseArray2);
            }
            int i11 = calendar.get(5) - 1;
            g8 g8Var = (g8) sparseArray2.get(i11);
            if (g8Var == null) {
                g8Var = new g8();
                g8Var.f47372b = new ArrayList();
            }
            g8Var.f47372b.add(Integer.valueOf(gjVar.e1()));
            g8Var.f47371a = gjVar;
            g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, g8Var);
            int i12 = this.X;
            if (i10 < i12 || i12 == 0) {
                this.X = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.f47944d0; i13 < currentTimeMillis; i13 += 86400) {
            calendar.setTimeInMillis(i13 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i14 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i14);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i14, sparseArray3);
            }
            int i15 = calendar.get(5) - 1;
            if (sparseArray3.get(i15, null) == null) {
                g8 g8Var2 = new g8();
                g8Var2.f47376g = false;
                g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, g8Var2);
            }
        }
        this.U = this.f47949g0.f11953r;
        if (this.Z) {
            this.G = true;
        }
        this.f47940b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f47944d0) / 2629800)) + 1;
        this.M.k(0, this.L);
        int i16 = this.L;
        if (timeInMillis > i16) {
            this.M.o(i16 + 1, timeInMillis);
            this.L = timeInMillis;
        }
        if (this.U) {
            resumeDelayedFragmentAnimation();
        }
    }
}
