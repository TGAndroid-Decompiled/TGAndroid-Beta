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
public final class j8 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.x1 I;
    public int J;
    public int K;
    public int L;
    public z7 M;
    public org.telegram.ui.Components.nd0 N;
    public bn O;
    public hi.u3 P;
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
    public x7 f49013a;
    public final int f49014a0;
    public di.b1 f49015b;
    public final int f49016b0;
    public v4.c0 f49017c;
    public di.d1 f49018c0;
    public final TextPaint d;
    public int f49019d0;
    public final TextPaint f49020e;
    public boolean f49021e0;
    public final TextPaint f49022f;
    public int f49023f0;
    public fi.h6 f49024g0;
    public TextView h;
    public w7 f49025h0;
    public int f49026i0;
    public w0 f49027j0;
    public hi.w5 f49028k0;
    public View f49029l0;
    public final Path m0;
    public TextView f49030n;
    public final xh.f f49031n0;
    public int f49032o0;
    public boolean f49033p0;
    public int f49034q0;
    public final Paint f49035r;
    public int f49036r0;
    public final Paint f49037s;
    public int f49038s0;
    public bi.o3 f49039w;
    public final Paint f49040x;
    public long f49041y;

    public j8(int i7, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f49020e = new TextPaint(1);
        this.f49022f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f49035r = paint;
        this.f49037s = new Paint(1);
        this.f49040x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.f49031n0 = new xh.f();
        this.Y = i7;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.f49014a0 = calendar.get(1);
            this.f49016b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public static void Z(j8 j8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = j8Var.T;
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
                h8 h8Var = new h8();
                h8Var.f48469a = new org.telegram.messenger.fj(j8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i7), false, false);
                h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = j8Var.V + tL_messages_searchResultsCalendar.periods.get(i7).count;
                j8Var.V = i11;
                h8Var.f48471c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((h8) sparseArray2.get(i12, null)).f48474g) {
                    sparseArray2.put(i12, h8Var);
                }
                int i13 = j8Var.X;
                if (i10 < i13 || i13 == 0) {
                    j8Var.X = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            j8Var.f49019d0 = i14;
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
                    h8 h8Var2 = new h8();
                    h8Var2.f48474g = false;
                    h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, h8Var2);
                }
                i14 += 86400;
            }
            j8Var.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                j8Var.W = ((TLRPC.Message) i5.c.h(1, tL_messages_searchResultsCalendar.messages)).f28513id;
                j8Var.U = false;
                j8Var.v0();
            } else {
                j8Var.U = true;
            }
            if (j8Var.Z) {
                j8Var.G = true;
            }
            j8Var.f49015b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            j8Var.M.k(0, j8Var.L);
            int i17 = j8Var.L;
            if (timeInMillis > i17) {
                j8Var.M.o(i17 + 1, timeInMillis);
                j8Var.L = timeInMillis;
            }
            if (j8Var.U) {
                j8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.r4 b0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.r4 c0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.r4 d0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.r4 e0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.r4 f0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.r4 g0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static void h0(j8 j8Var) {
        if (j8Var.f49039w == null) {
            return;
        }
        int measuredWidth = (int) (j8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (j8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        j8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        j8Var.f49039w.setBackground(new BitmapDrawable(createBitmap));
        j8Var.f49039w.setAlpha(0.0f);
        j8Var.f49039w.setVisibility(0);
    }

    public final void A0(g8 g8Var, boolean z10) {
        int i7;
        int i10;
        if (this.Q != 0 && this.R != 0) {
            if (g8Var.f48163n != null) {
                if (!z10) {
                    SparseArray sparseArray = g8Var.f48167x;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        g8Var.c(sparseArray.keyAt(i11), 0, 0, false, false);
                    }
                }
                int i12 = g8Var.f48161e;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < g8Var.d; i16++) {
                    h8 h8Var = (h8) g8Var.f48163n.get(i16, null);
                    if (h8Var != null && (i10 = h8Var.h) >= this.Q && i10 <= this.R) {
                        if (i13 == -1) {
                            i13 = i12;
                        }
                        i14 = i12;
                    }
                    i12++;
                    if (i12 >= 7) {
                        if (i13 != -1 && i14 != -1) {
                            i7 = i15;
                            g8Var.c(i7, i13, i14, true, z10);
                        } else {
                            i7 = i15;
                            g8Var.c(i7, 0, 0, false, z10);
                        }
                        i15 = i7 + 1;
                        i13 = -1;
                        i14 = -1;
                        i12 = 0;
                    }
                }
                int i17 = i15;
                if (i13 != -1 && i14 != -1) {
                    g8Var.c(i17, i13, i14, true, z10);
                    return;
                } else {
                    g8Var.c(i17, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = g8Var.f48167x;
        for (int i18 = 0; i18 < sparseArray2.size(); i18++) {
            g8Var.c(sparseArray2.keyAt(i18), 0, 0, false, z10);
        }
    }

    public final void B0() {
        int abs;
        boolean z10;
        String N0;
        TextView textView;
        hi.u3 u3Var;
        if (!this.f49021e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752630, null));
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
        boolean z11 = this.f49033p0;
        int i11 = this.f49032o0;
        if (abs == i11 && z11 == this.H) {
            return;
        }
        if (i11 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49032o0 = abs;
        boolean z12 = this.H;
        this.f49033p0 = z12;
        float f10 = 1.0f;
        if (abs > 0) {
            N0 = org.telegram.messenger.gd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            N0 = org.telegram.messenger.gd.N0(2131745464, null);
            this.I.c(true, 1.0f);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131752630, null);
            this.I.c(true, 0.0f);
        }
        String str = N0;
        if (abs > 1) {
            this.f49030n.setText(org.telegram.messenger.gd.a0("ClearHistoryForTheseDays", null, 2131752075, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.f49030n.setText(org.telegram.messenger.gd.a0("ClearHistoryForThisDay", null, 2131752074, new Object[0]));
        }
        di.d1 d1Var = this.f49018c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.f49030n;
        }
        d1Var.a(textView, true);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        z4Var.getClass();
        z4Var.H(str, z10, 150L, org.telegram.ui.Components.kr.h);
        if ((!this.H || abs > 0) && (u3Var = this.P) != null) {
            u3Var.f(true);
        }
        if (abs <= 0 && !this.H) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(org.telegram.messenger.g0.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f49030n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f49030n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.f49030n)).start();
            this.h.setEnabled(true);
            this.f49030n.setEnabled(false);
            return;
        }
        if (this.f49030n.getVisibility() == 8) {
            this.f49030n.setAlpha(0.0f);
            this.f49030n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        }
        this.f49030n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f49030n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new on(this.h)).start();
        ViewPropertyAnimator animate = this.f49030n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f49030n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f49022f;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint3 = this.f49020e;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextAlign(align);
        x7 x7Var = new x7(this, context);
        this.f49013a = x7Var;
        x7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
        this.f49013a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752630, null));
        di.b1 b1Var = new di.b1(8, context, this);
        this.f49015b = b1Var;
        v4.c0 c0Var = new v4.c0();
        this.f49017c = c0Var;
        b1Var.setLayoutManager(c0Var);
        this.f49017c.k1(true);
        di.b1 b1Var2 = this.f49015b;
        z7 z7Var = new z7(this, 0);
        this.M = z7Var;
        b1Var2.setAdapter(z7Var);
        this.f49015b.j(new g3(this, 4));
        if (this.f49023f0 == 0 && this.f49021e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var2 = this.f49013a;
        di.b1 b1Var3 = this.f49015b;
        if (z10) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        x7Var2.addView(b1Var3, c8.na.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        hi.w5 w5Var = new hi.w5(this, context, new String[]{org.telegram.messenger.gd.N0(2131752628, null), org.telegram.messenger.gd.N0(2131752624, null), org.telegram.messenger.gd.N0(2131752623, null), org.telegram.messenger.gd.N0(2131752625, null), org.telegram.messenger.gd.N0(2131752629, null), org.telegram.messenger.gd.N0(2131752627, null), org.telegram.messenger.gd.N0(2131752626, null)}, 2);
        this.f49028k0 = w5Var;
        w5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        hi.w5 w5Var2 = this.f49028k0;
        fh.g c10 = getBaseSimpleGlass().f56739c.c(this.f49028k0, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        w5Var2.setBackground(c10);
        this.f49028k0.setTranslationY(ri.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 0));
        this.fragmentView = this.f49013a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i7 = calendar.get(2);
        this.K = i7;
        int i10 = this.f49014a0;
        if (i10 != 0) {
            int v = com.google.android.gms.internal.vision.e2.v(this.J, i10, 12, i7) - this.f49016b0;
            this.L = v + 1;
            this.f49017c.h1(v, org.telegram.messenger.g0.L(120.0f));
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
            this.f49018c0 = new di.d1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f52566b;

                {
                    this.f52566b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f52566b;
                            j8Var.H = true;
                            j8Var.B0();
                            return;
                        default:
                            j8 j8Var2 = this.f52566b;
                            int i11 = j8Var2.f49032o0;
                            if (i11 == 0) {
                                if (j8Var2.P == null) {
                                    hi.u3 u3Var = new hi.u3(j8Var2.f49013a.getContext(), 3);
                                    u3Var.r(true);
                                    u3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    u3Var.d = 2300L;
                                    u3Var.U = true;
                                    u3Var.f15490e = true;
                                    u3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    u3Var.f15511v0 = -org.telegram.messenger.g0.L(10.0f);
                                    j8Var2.P = u3Var;
                                    u3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    j8Var2.P.l(j8Var2.getBaseSimpleGlass().f56739c);
                                    j8Var2.f49013a.addView(j8Var2.P, c8.na.e(-1, 150, 55));
                                    j8Var2.P.v(org.telegram.messenger.gd.N0(2131745463, null));
                                }
                                j8Var2.P.z(j8Var2.f49018c0, true);
                                return;
                            }
                            org.telegram.ui.Components.b5.q(j8Var2, i11, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.f49041y)), null, false, new w7(j8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(org.telegram.messenger.gd.N0(2131745464, null));
            this.f49018c0.addView(this.h, c8.na.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f49030n = textView2;
            textView2.setGravity(17);
            this.f49030n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.f49030n.setSingleLine();
            this.f49030n.setTextSize(1, 15.0f);
            this.f49030n.setTypeface(org.telegram.messenger.g0.o());
            this.f49030n.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f52566b;

                {
                    this.f52566b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f52566b;
                            j8Var.H = true;
                            j8Var.B0();
                            return;
                        default:
                            j8 j8Var2 = this.f52566b;
                            int i11 = j8Var2.f49032o0;
                            if (i11 == 0) {
                                if (j8Var2.P == null) {
                                    hi.u3 u3Var = new hi.u3(j8Var2.f49013a.getContext(), 3);
                                    u3Var.r(true);
                                    u3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    u3Var.d = 2300L;
                                    u3Var.U = true;
                                    u3Var.f15490e = true;
                                    u3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    u3Var.f15511v0 = -org.telegram.messenger.g0.L(10.0f);
                                    j8Var2.P = u3Var;
                                    u3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    j8Var2.P.l(j8Var2.getBaseSimpleGlass().f56739c);
                                    j8Var2.f49013a.addView(j8Var2.P, c8.na.e(-1, 150, 55));
                                    j8Var2.P.v(org.telegram.messenger.gd.N0(2131745463, null));
                                }
                                j8Var2.P.z(j8Var2.f49018c0, true);
                                return;
                            }
                            org.telegram.ui.Components.b5.q(j8Var2, i11, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.f49041y)), null, false, new w7(j8Var2), null);
                            return;
                    }
                }
            });
            this.f49030n.setVisibility(8);
            this.f49018c0.addView(this.f49030n, c8.na.e(-2, 38, 17));
            this.f49013a.addView(this.f49018c0, c8.na.e(-1, 50, 80));
            this.f49018c0.a(this.h, false);
            int L = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i11 = org.telegram.ui.ActionBar.n6.f29737sf;
            org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.a0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 51), L, L), null, org.telegram.ui.ActionBar.u6.g(i11, 51), null);
            TextView textView4 = this.f49030n;
            int i12 = org.telegram.ui.ActionBar.n6.f29692q7;
            org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.n6.a0(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 51), L, L), null, org.telegram.ui.ActionBar.u6.g(i12, 51), null);
            org.telegram.ui.ActionBar.u6.U(this.h, i11, null);
            org.telegram.ui.ActionBar.u6.U(this.f49030n, i12, null);
        }
        View view = new View(context);
        this.f49029l0 = view;
        this.f49013a.addView(view, c8.na.e(-1, 0, 48));
        this.f49029l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15979b;
        this.f49013a.addView(this.f49028k0, c8.na.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.A5 && this.f49024g0 == ((fi.h6) objArr[0])) {
            z0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49015b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i7 = org.telegram.ui.ActionBar.n6.f29386a;
        int i10 = org.telegram.ui.ActionBar.n6.f29386a;
        int i11 = org.telegram.ui.ActionBar.n6.f29386a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, true)) > 0.699999988079071d) {
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
        this.f49041y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i7 = getArguments().getInt("type");
        this.f49023f0 = i7;
        if (i7 == 2) {
            this.f49024g0 = org.telegram.messenger.mp.u1(this.currentAccount).R1().A(0, -1, this.f49041y, true);
        } else if (i7 == 3) {
            this.f49024g0 = org.telegram.messenger.mp.u1(this.currentAccount).R1().A(1, -1, this.f49041y, true);
        }
        fi.h6 h6Var = this.f49024g0;
        if (h6Var != null) {
            this.f49025h0 = new w7(this);
        }
        if (this.f49041y >= 0) {
            this.f49021e0 = true;
        } else {
            this.f49021e0 = false;
        }
        if (h6Var != null) {
            org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.A5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f49024g0 != null) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.A5);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f49029l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.f49028k0.setTranslationY(ri.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f49022f != null && this.f49020e != null) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
            if (x02 != this.f49034q0 || x03 != this.f49036r0 || x04 != this.f49038s0) {
                this.f49034q0 = x02;
                this.f49036r0 = x03;
                this.f49038s0 = x04;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.o3 o3Var;
        if (z10 && (o3Var = this.f49039w) != null && o3Var.getVisibility() == 0) {
            this.f49039w.setVisibility(8);
            this.f49039w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        bi.o3 o3Var = this.f49039w;
        if (o3Var != null && o3Var.getVisibility() == 0) {
            if (z10) {
                this.f49039w.setAlpha(1.0f - f10);
            } else {
                this.f49039w.setAlpha(f10);
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
        this.f49029l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.f15979b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new ki.n3(this, 19));
        duration.start();
        this.S = duration;
        for (int i7 = 0; i7 < this.f49015b.getChildCount(); i7++) {
            A0((g8) this.f49015b.getChildAt(i7), true);
        }
        for (int i10 = 0; i10 < this.f49015b.getCachedChildCount(); i10++) {
            g8 g8Var = (g8) this.f49015b.P(i10);
            A0(g8Var, false);
            g8.a(g8Var, this.Q, this.R);
            g8.b(g8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.f49015b.getHiddenChildCount(); i11++) {
            g8 g8Var2 = (g8) this.f49015b.V(i11);
            A0(g8Var2, false);
            g8.a(g8Var2, this.Q, this.R);
            g8.b(g8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.f49015b.getAttachedScrapChildCount(); i12++) {
            g8 g8Var3 = (g8) this.f49015b.O(i12);
            A0(g8Var3, false);
            g8.a(g8Var3, this.Q, this.R);
            g8.b(g8Var3, 1.0f);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (!this.F && !this.U) {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < this.f49015b.getChildCount(); i10++) {
                View childAt = this.f49015b.getChildAt(i10);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    int i11 = (g8Var.f48159b * 100) + g8Var.f48160c;
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
        if (this.f49018c0 != null) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        ri.a.e(this.f49015b, i7, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), i11);
        di.d1 d1Var = this.f49018c0;
        if (d1Var != null) {
            d1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (!this.F && !this.U) {
            if (this.f49024g0 != null) {
                z0();
                this.f49024g0.p(100, false);
                this.F = this.f49024g0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().l1(this.f49041y);
            if (this.E != 0 && this.f49041y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().l1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.f49015b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new v7(0, this, calendar));
        }
    }

    public final void y0() {
        this.f49020e.setColor(-1);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f49022f.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.I.a(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
    }

    public final void z0() {
        this.F = this.f49024g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.f49019d0 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < this.f49024g0.f12051i.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f49024g0.f12051i.get(i7);
            this.f49019d0 = Math.min(this.f49019d0, fjVar.f24073k.date);
            calendar.setTimeInMillis(fjVar.f24073k.date * 1000);
            int i10 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i10, sparseArray2);
            }
            int i11 = calendar.get(5) - 1;
            h8 h8Var = (h8) sparseArray2.get(i11);
            if (h8Var == null) {
                h8Var = new h8();
                h8Var.f48470b = new ArrayList();
            }
            h8Var.f48470b.add(Integer.valueOf(fjVar.e1()));
            h8Var.f48469a = fjVar;
            h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, h8Var);
            int i12 = this.X;
            if (i10 < i12 || i12 == 0) {
                this.X = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.f49019d0; i13 < currentTimeMillis; i13 += 86400) {
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
                h8 h8Var2 = new h8();
                h8Var2.f48474g = false;
                h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, h8Var2);
            }
        }
        this.U = this.f49024g0.f12060r;
        if (this.Z) {
            this.G = true;
        }
        this.f49015b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f49019d0) / 2629800)) + 1;
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
