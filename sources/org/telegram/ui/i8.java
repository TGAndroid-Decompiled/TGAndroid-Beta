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
public final class i8 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.y1 I;
    public int J;
    public int K;
    public int L;
    public y7 M;
    public org.telegram.ui.Components.hn N;
    public bn O;
    public hi.m3 P;
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
    public w7 f48605a;
    public final int f48606a0;
    public di.b1 f48607b;
    public final int f48608b0;
    public v4.c0 f48609c;
    public di.d1 f48610c0;
    public final TextPaint d;
    public int f48611d0;
    public final TextPaint f48612e;
    public boolean f48613e0;
    public final TextPaint f48614f;
    public int f48615f0;
    public fi.h6 f48616g0;
    public TextView h;
    public v7 f48617h0;
    public int f48618i0;
    public w0 f48619j0;
    public hi.m5 f48620k0;
    public View f48621l0;
    public final Path m0;
    public TextView f48622n;
    public final xh.f f48623n0;
    public int f48624o0;
    public boolean f48625p0;
    public int f48626q0;
    public final Paint f48627r;
    public int f48628r0;
    public final Paint f48629s;
    public int f48630s0;
    public bi.i3 f48631w;
    public final Paint f48632x;
    public long f48633y;

    public i8(int i7, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f48612e = new TextPaint(1);
        this.f48614f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f48627r = paint;
        this.f48629s = new Paint(1);
        this.f48632x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.f48623n0 = new xh.f();
        this.Y = i7;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.f48606a0 = calendar.get(1);
            this.f48608b0 = calendar.get(2);
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
                g8Var.f47989a = new org.telegram.messenger.fj(i8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i7), false, false);
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = i8Var.V + tL_messages_searchResultsCalendar.periods.get(i7).count;
                i8Var.V = i11;
                g8Var.f47991c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((g8) sparseArray2.get(i12, null)).f47994g) {
                    sparseArray2.put(i12, g8Var);
                }
                int i13 = i8Var.X;
                if (i10 < i13 || i13 == 0) {
                    i8Var.X = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            i8Var.f48611d0 = i14;
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
                    g8Var2.f47994g = false;
                    g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, g8Var2);
                }
                i14 += 86400;
            }
            i8Var.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                i8Var.W = ((TLRPC.Message) i5.c.h(1, tL_messages_searchResultsCalendar.messages)).f28426id;
                i8Var.U = false;
                i8Var.v0();
            } else {
                i8Var.U = true;
            }
            if (i8Var.Z) {
                i8Var.G = true;
            }
            i8Var.f48607b.invalidate();
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

    public static org.telegram.ui.ActionBar.s4 b0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.s4 c0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.s4 d0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.s4 e0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.s4 f0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.s4 g0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static void h0(i8 i8Var) {
        if (i8Var.f48631w == null) {
            return;
        }
        int measuredWidth = (int) (i8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (i8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        i8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        i8Var.f48631w.setBackground(new BitmapDrawable(createBitmap));
        i8Var.f48631w.setAlpha(0.0f);
        i8Var.f48631w.setVisibility(0);
    }

    public final void A0(f8 f8Var, boolean z10) {
        int i7;
        int i10;
        if (this.Q != 0 && this.R != 0) {
            if (f8Var.f47603n != null) {
                if (!z10) {
                    SparseArray sparseArray = f8Var.f47607x;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        f8Var.c(sparseArray.keyAt(i11), 0, 0, false, false);
                    }
                }
                int i12 = f8Var.f47601e;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < f8Var.d; i16++) {
                    g8 g8Var = (g8) f8Var.f47603n.get(i16, null);
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
        SparseArray sparseArray2 = f8Var.f47607x;
        for (int i18 = 0; i18 < sparseArray2.size(); i18++) {
            f8Var.c(sparseArray2.keyAt(i18), 0, 0, false, z10);
        }
    }

    public final void B0() {
        int abs;
        boolean z10;
        String M0;
        TextView textView;
        hi.m3 m3Var;
        if (!this.f48613e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752631, null));
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
        boolean z11 = this.f48625p0;
        int i11 = this.f48624o0;
        if (abs == i11 && z11 == this.H) {
            return;
        }
        if (i11 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48624o0 = abs;
        boolean z12 = this.H;
        this.f48625p0 = z12;
        float f10 = 1.0f;
        if (abs > 0) {
            M0 = org.telegram.messenger.gd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            M0 = org.telegram.messenger.gd.M0(2131745465, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131752631, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.f48622n.setText(org.telegram.messenger.gd.a0("ClearHistoryForTheseDays", null, 2131752076, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.f48622n.setText(org.telegram.messenger.gd.a0("ClearHistoryForThisDay", null, 2131752075, new Object[0]));
        }
        di.d1 d1Var = this.f48610c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.f48622n;
        }
        d1Var.a(textView, true);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        a5Var.getClass();
        a5Var.I(str, z10, 150L, org.telegram.ui.Components.lr.h);
        if ((!this.H || abs > 0) && (m3Var = this.P) != null) {
            m3Var.f(true);
        }
        if (abs <= 0 && !this.H) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(org.telegram.messenger.g0.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f48622n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f48622n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.f48622n)).start();
            this.h.setEnabled(true);
            this.f48622n.setEnabled(false);
            return;
        }
        if (this.f48622n.getVisibility() == 8) {
            this.f48622n.setAlpha(0.0f);
            this.f48622n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        }
        this.f48622n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f48622n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.h)).start();
        ViewPropertyAnimator animate = this.f48622n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f48622n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f48614f;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint3 = this.f48612e;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextAlign(align);
        w7 w7Var = new w7(this, context);
        this.f48605a = w7Var;
        w7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29339a7));
        this.f48605a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752631, null));
        di.b1 b1Var = new di.b1(8, context, this);
        this.f48607b = b1Var;
        v4.c0 c0Var = new v4.c0();
        this.f48609c = c0Var;
        b1Var.setLayoutManager(c0Var);
        this.f48609c.k1(true);
        di.b1 b1Var2 = this.f48607b;
        y7 y7Var = new y7(this, 0);
        this.M = y7Var;
        b1Var2.setAdapter(y7Var);
        this.f48607b.j(new g3(this, 4));
        if (this.f48615f0 == 0 && this.f48613e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7 w7Var2 = this.f48605a;
        di.b1 b1Var3 = this.f48607b;
        if (z10) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        w7Var2.addView(b1Var3, c8.ma.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        hi.m5 m5Var = new hi.m5(this, context, new String[]{org.telegram.messenger.gd.M0(2131752629, null), org.telegram.messenger.gd.M0(2131752625, null), org.telegram.messenger.gd.M0(2131752624, null), org.telegram.messenger.gd.M0(2131752626, null), org.telegram.messenger.gd.M0(2131752630, null), org.telegram.messenger.gd.M0(2131752628, null), org.telegram.messenger.gd.M0(2131752627, null)}, 2);
        this.f48620k0 = m5Var;
        m5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        hi.m5 m5Var2 = this.f48620k0;
        fh.g c10 = getBaseSimpleGlass().f56616c.c(this.f48620k0, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        m5Var2.setBackground(c10);
        this.f48620k0.setTranslationY(ri.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, 0));
        this.fragmentView = this.f48605a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i7 = calendar.get(2);
        this.K = i7;
        int i10 = this.f48606a0;
        if (i10 != 0) {
            int v = com.google.android.gms.internal.vision.e2.v(this.J, i10, 12, i7) - this.f48608b0;
            this.L = v + 1;
            this.f48609c.h1(v, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.I = y1Var;
        this.simpleActionBar.setBackButtonDrawable(y1Var);
        this.I.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.f48610c0 = new di.d1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f52193b;

                {
                    this.f52193b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f52193b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f52193b;
                            int i11 = i8Var2.f48624o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    hi.m3 m3Var = new hi.m3(i8Var2.f48605a.getContext(), 3);
                                    m3Var.r(true);
                                    m3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    m3Var.d = 2300L;
                                    m3Var.U = true;
                                    m3Var.f14998e = true;
                                    m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var.f15019v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = m3Var;
                                    m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f56616c);
                                    i8Var2.f48605a.addView(i8Var2.P, c8.ma.e(-1, 150, 55));
                                    i8Var2.P.v(org.telegram.messenger.gd.M0(2131745464, null));
                                }
                                i8Var2.P.z(i8Var2.f48610c0, true);
                                return;
                            }
                            org.telegram.ui.Components.b5.q(i8Var2, i11, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.f48633y)), null, false, new v7(i8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(org.telegram.messenger.gd.M0(2131745465, null));
            this.f48610c0.addView(this.h, c8.ma.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f48622n = textView2;
            textView2.setGravity(17);
            this.f48622n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.f48622n.setSingleLine();
            this.f48622n.setTextSize(1, 15.0f);
            this.f48622n.setTypeface(org.telegram.messenger.g0.o());
            this.f48622n.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f52193b;

                {
                    this.f52193b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f52193b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f52193b;
                            int i11 = i8Var2.f48624o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    hi.m3 m3Var = new hi.m3(i8Var2.f48605a.getContext(), 3);
                                    m3Var.r(true);
                                    m3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    m3Var.d = 2300L;
                                    m3Var.U = true;
                                    m3Var.f14998e = true;
                                    m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var.f15019v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = m3Var;
                                    m3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f56616c);
                                    i8Var2.f48605a.addView(i8Var2.P, c8.ma.e(-1, 150, 55));
                                    i8Var2.P.v(org.telegram.messenger.gd.M0(2131745464, null));
                                }
                                i8Var2.P.z(i8Var2.f48610c0, true);
                                return;
                            }
                            org.telegram.ui.Components.b5.q(i8Var2, i11, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.f48633y)), null, false, new v7(i8Var2), null);
                            return;
                    }
                }
            });
            this.f48622n.setVisibility(8);
            this.f48610c0.addView(this.f48622n, c8.ma.e(-2, 38, 17));
            this.f48605a.addView(this.f48610c0, c8.ma.e(-1, 50, 80));
            this.f48610c0.a(this.h, false);
            int L = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i11 = org.telegram.ui.ActionBar.n6.f29682sf;
            org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.a0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 51), L, L), null, org.telegram.ui.ActionBar.u6.g(i11, 51), null);
            TextView textView4 = this.f48622n;
            int i12 = org.telegram.ui.ActionBar.n6.f29637q7;
            org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.n6.a0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 51), L, L), null, org.telegram.ui.ActionBar.u6.g(i12, 51), null);
            org.telegram.ui.ActionBar.u6.U(this.h, i11, null);
            org.telegram.ui.ActionBar.u6.U(this.f48622n, i12, null);
        }
        View view = new View(context);
        this.f48621l0 = view;
        this.f48605a.addView(view, c8.ma.e(-1, 0, 48));
        this.f48621l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15893b;
        this.f48605a.addView(this.f48620k0, c8.ma.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25239z5 && this.f48616g0 == ((fi.h6) objArr[0])) {
            z0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f48607b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i7 = org.telegram.ui.ActionBar.n6.f29331a;
        int i10 = org.telegram.ui.ActionBar.n6.f29331a;
        int i11 = org.telegram.ui.ActionBar.n6.f29331a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, true)) > 0.699999988079071d) {
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
        this.f48633y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i7 = getArguments().getInt("type");
        this.f48615f0 = i7;
        if (i7 == 2) {
            this.f48616g0 = org.telegram.messenger.mp.u1(this.currentAccount).R1().A(0, -1, this.f48633y, true);
        } else if (i7 == 3) {
            this.f48616g0 = org.telegram.messenger.mp.u1(this.currentAccount).R1().A(1, -1, this.f48633y, true);
        }
        fi.h6 h6Var = this.f48616g0;
        if (h6Var != null) {
            this.f48617h0 = new v7(this);
        }
        if (this.f48633y >= 0) {
            this.f48613e0 = true;
        } else {
            this.f48613e0 = false;
        }
        if (h6Var != null) {
            org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25239z5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f48616g0 != null) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25239z5);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f48621l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.f48620k0.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f48614f != null && this.f48612e != null) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29488i6, false);
            if (x02 != this.f48626q0 || x03 != this.f48628r0 || x04 != this.f48630s0) {
                this.f48626q0 = x02;
                this.f48628r0 = x03;
                this.f48630s0 = x04;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.i3 i3Var;
        if (z10 && (i3Var = this.f48631w) != null && i3Var.getVisibility() == 0) {
            this.f48631w.setVisibility(8);
            this.f48631w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        bi.i3 i3Var = this.f48631w;
        if (i3Var != null && i3Var.getVisibility() == 0) {
            if (z10) {
                this.f48631w.setAlpha(1.0f - f10);
            } else {
                this.f48631w.setAlpha(f10);
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
        this.f48621l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.f15893b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new ki.n3(this, 19));
        duration.start();
        this.S = duration;
        for (int i7 = 0; i7 < this.f48607b.getChildCount(); i7++) {
            A0((f8) this.f48607b.getChildAt(i7), true);
        }
        for (int i10 = 0; i10 < this.f48607b.getCachedChildCount(); i10++) {
            f8 f8Var = (f8) this.f48607b.P(i10);
            A0(f8Var, false);
            f8.a(f8Var, this.Q, this.R);
            f8.b(f8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.f48607b.getHiddenChildCount(); i11++) {
            f8 f8Var2 = (f8) this.f48607b.V(i11);
            A0(f8Var2, false);
            f8.a(f8Var2, this.Q, this.R);
            f8.b(f8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.f48607b.getAttachedScrapChildCount(); i12++) {
            f8 f8Var3 = (f8) this.f48607b.O(i12);
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
            for (int i10 = 0; i10 < this.f48607b.getChildCount(); i10++) {
                View childAt = this.f48607b.getChildAt(i10);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    int i11 = (f8Var.f47599b * 100) + f8Var.f47600c;
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
        if (this.f48610c0 != null) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        ri.a.e(this.f48607b, i7, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), i11);
        di.d1 d1Var = this.f48610c0;
        if (d1Var != null) {
            d1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (!this.F && !this.U) {
            if (this.f48616g0 != null) {
                z0();
                this.f48616g0.p(100, false);
                this.F = this.f48616g0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().l1(this.f48633y);
            if (this.E != 0 && this.f48633y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().l1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.f48607b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new u7(0, this, calendar));
        }
    }

    public final void y0() {
        this.f48612e.setColor(-1);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f48614f.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.I.a(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
    }

    public final void z0() {
        this.F = this.f48616g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.f48611d0 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < this.f48616g0.f12048i.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f48616g0.f12048i.get(i7);
            this.f48611d0 = Math.min(this.f48611d0, fjVar.f23968k.date);
            calendar.setTimeInMillis(fjVar.f23968k.date * 1000);
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
                g8Var.f47990b = new ArrayList();
            }
            g8Var.f47990b.add(Integer.valueOf(fjVar.e1()));
            g8Var.f47989a = fjVar;
            g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, g8Var);
            int i12 = this.X;
            if (i10 < i12 || i12 == 0) {
                this.X = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.f48611d0; i13 < currentTimeMillis; i13 += 86400) {
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
                g8Var2.f47994g = false;
                g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, g8Var2);
            }
        }
        this.U = this.f48616g0.f12057r;
        if (this.Z) {
            this.G = true;
        }
        this.f48607b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f48611d0) / 2629800)) + 1;
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
