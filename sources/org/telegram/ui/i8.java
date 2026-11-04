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
public final class i8 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public org.telegram.ui.ActionBar.w1 I;
    public int J;
    public int K;
    public int L;
    public y7 M;
    public org.telegram.ui.Components.nh N;
    public wm O;
    public gi.l3 P;
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
    public x7 f46163a;
    public final int f46164a0;
    public ci.j1 f46165b;
    public final int f46166b0;
    public u4.b0 f46167c;
    public ci.l1 f46168c0;
    public final TextPaint d;
    public int f46169d0;
    public final TextPaint f46170e;
    public boolean f46171e0;
    public final TextPaint f46172f;
    public int f46173f0;
    public ei.r6 f46174g0;
    public TextView h;
    public w7 f46175h0;
    public int f46176i0;
    public x0 f46177j0;
    public gi.n5 f46178k0;
    public View f46179l0;
    public final Path m0;
    public TextView f46180n;
    public final yh.f f46181n0;
    public int f46182o0;
    public boolean f46183p0;
    public int f46184q0;
    public final Paint f46185r;
    public int f46186r0;
    public final Paint f46187s;
    public int f46188s0;
    public ai.x2 f46189w;
    public final Paint f46190x;
    public long f46191y;

    public i8(int i3, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f46170e = new TextPaint(1);
        this.f46172f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f46185r = paint;
        this.f46187s = new Paint(1);
        this.f46190x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.f46181n0 = new yh.f();
        this.Y = i3;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.f46164a0 = calendar.get(1);
            this.f46166b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public static void Z(i8 i8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = i8Var.T;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i3 = 0; i3 < tL_messages_searchResultsCalendar.periods.size(); i3++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i3).date * 1000);
                int i10 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i10, sparseArray2);
                }
                g8 g8Var = new g8();
                g8Var.f45588a = new org.telegram.messenger.zi(i8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i3), false, false);
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = i8Var.V + tL_messages_searchResultsCalendar.periods.get(i3).count;
                i8Var.V = i11;
                g8Var.f45590c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((g8) sparseArray2.get(i12, null)).f45593g) {
                    sparseArray2.put(i12, g8Var);
                }
                int i13 = i8Var.X;
                if (i10 < i13 || i13 == 0) {
                    i8Var.X = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            i8Var.f46169d0 = i14;
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
                    g8Var2.f45593g = false;
                    g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, g8Var2);
                }
                i14 += 86400;
            }
            i8Var.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                i8Var.W = ((TLRPC.Message) k2.p1.h(1, tL_messages_searchResultsCalendar.messages)).f27022id;
                i8Var.U = false;
                i8Var.v0();
            } else {
                i8Var.U = true;
            }
            if (i8Var.Z) {
                i8Var.G = true;
            }
            i8Var.f46165b.invalidate();
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

    public static org.telegram.ui.ActionBar.q4 b0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.q4 c0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.q4 d0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.q4 e0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.q4 f0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.q4 g0(i8 i8Var) {
        return i8Var.parentLayout;
    }

    public static void h0(i8 i8Var) {
        if (i8Var.f46189w == null) {
            return;
        }
        int measuredWidth = (int) (i8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (i8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        i8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        i8Var.f46189w.setBackground(new BitmapDrawable(createBitmap));
        i8Var.f46189w.setAlpha(0.0f);
        i8Var.f46189w.setVisibility(0);
    }

    public final void A0(f8 f8Var, boolean z10) {
        int i3;
        int i10;
        if (this.Q != 0 && this.R != 0) {
            if (f8Var.f45180n != null) {
                if (!z10) {
                    SparseArray sparseArray = f8Var.f45184x;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        f8Var.c(sparseArray.keyAt(i11), 0, 0, false, false);
                    }
                }
                int i12 = f8Var.f45178e;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < f8Var.d; i16++) {
                    g8 g8Var = (g8) f8Var.f45180n.get(i16, null);
                    if (g8Var != null && (i10 = g8Var.h) >= this.Q && i10 <= this.R) {
                        if (i13 == -1) {
                            i13 = i12;
                        }
                        i14 = i12;
                    }
                    i12++;
                    if (i12 >= 7) {
                        if (i13 != -1 && i14 != -1) {
                            i3 = i15;
                            f8Var.c(i3, i13, i14, true, z10);
                        } else {
                            i3 = i15;
                            f8Var.c(i3, 0, 0, false, z10);
                        }
                        i15 = i3 + 1;
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
        SparseArray sparseArray2 = f8Var.f45184x;
        for (int i18 = 0; i18 < sparseArray2.size(); i18++) {
            f8Var.c(sparseArray2.keyAt(i18), 0, 0, false, z10);
        }
    }

    public final void B0() {
        int abs;
        boolean z10;
        String M0;
        TextView textView;
        gi.l3 l3Var;
        if (!this.f46171e0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752642, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i3 = this.Q;
        int i10 = this.R;
        if (i3 == i10 && i3 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i3 - i10) / 86400) + 1;
        }
        boolean z11 = this.f46183p0;
        int i11 = this.f46182o0;
        if (abs == i11 && z11 == this.H) {
            return;
        }
        if (i11 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46182o0 = abs;
        boolean z12 = this.H;
        this.f46183p0 = z12;
        float f10 = 1.0f;
        if (abs > 0) {
            M0 = org.telegram.messenger.bd.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z12) {
            M0 = org.telegram.messenger.bd.M0(2131745670, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131752642, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.f46180n.setText(org.telegram.messenger.bd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.f46180n.setText(org.telegram.messenger.bd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        ci.l1 l1Var = this.f46168c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.f46180n;
        }
        l1Var.a(textView, true);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(str, z10, 150L, org.telegram.ui.Components.xq.h);
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
            this.f46180n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f46180n.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.s9(this.f46180n)).start();
            this.h.setEnabled(true);
            this.f46180n.setEnabled(false);
            return;
        }
        if (this.f46180n.getVisibility() == 8) {
            this.f46180n.setAlpha(0.0f);
            this.f46180n.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        }
        this.f46180n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f46180n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.s9(this.h)).start();
        ViewPropertyAnimator animate = this.f46180n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f46180n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f46172f;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint3 = this.f46170e;
        textPaint3.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextAlign(align);
        x7 x7Var = new x7(this, context);
        this.f46163a = x7Var;
        x7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        this.f46163a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752642, null));
        ci.j1 j1Var = new ci.j1(8, context, this);
        this.f46165b = j1Var;
        u4.b0 b0Var = new u4.b0();
        this.f46167c = b0Var;
        j1Var.setLayoutManager(b0Var);
        this.f46167c.k1(true);
        ci.j1 j1Var2 = this.f46165b;
        y7 y7Var = new y7(this, 0);
        this.M = y7Var;
        j1Var2.setAdapter(y7Var);
        this.f46165b.j(new h3(this, 4));
        if (this.f46173f0 == 0 && this.f46171e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var2 = this.f46163a;
        ci.j1 j1Var3 = this.f46165b;
        if (z10) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        x7Var2.addView(j1Var3, b8.mf.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        gi.n5 n5Var = new gi.n5(this, context, new String[]{org.telegram.messenger.bd.M0(2131752640, null), org.telegram.messenger.bd.M0(2131752636, null), org.telegram.messenger.bd.M0(2131752635, null), org.telegram.messenger.bd.M0(2131752637, null), org.telegram.messenger.bd.M0(2131752641, null), org.telegram.messenger.bd.M0(2131752639, null), org.telegram.messenger.bd.M0(2131752638, null)}, 2);
        this.f46178k0 = n5Var;
        n5Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        gi.n5 n5Var2 = this.f46178k0;
        gh.g c2 = getBaseSimpleGlass().f53525c.c(this.f46178k0, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        n5Var2.setBackground(c2);
        this.f46178k0.setTranslationY(pi.a.d(0) - org.telegram.messenger.g0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 28));
        this.fragmentView = this.f46163a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i3 = calendar.get(2);
        this.K = i3;
        int i10 = this.f46164a0;
        if (i10 != 0) {
            int e10 = com.google.android.recaptcha.internal.a.e(this.J, i10, 12, i3) - this.f46166b0;
            this.L = e10 + 1;
            this.f46167c.h1(e10, org.telegram.messenger.g0.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        this.I = w1Var;
        this.simpleActionBar.setBackButtonDrawable(w1Var);
        this.I.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.f46168c0 = new ci.l1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f50417b;

                {
                    this.f50417b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f50417b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f50417b;
                            int i11 = i8Var2.f46182o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    gi.l3 l3Var = new gi.l3(i8Var2.f46163a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.f13084e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.f13105v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f53525c);
                                    i8Var2.f46163a.addView(i8Var2.P, b8.mf.e(-1, 150, 55));
                                    i8Var2.P.u(org.telegram.messenger.bd.M0(2131745669, null));
                                }
                                i8Var2.P.y(i8Var2.f46168c0, true);
                                return;
                            }
                            org.telegram.ui.Components.t4.q(i8Var2, i11, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f46191y)), null, false, new w7(i8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(org.telegram.messenger.bd.M0(2131745670, null));
            this.f46168c0.addView(this.h, b8.mf.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f46180n = textView2;
            textView2.setGravity(17);
            this.f46180n.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.f46180n.setSingleLine();
            this.f46180n.setTextSize(1, 15.0f);
            this.f46180n.setTypeface(org.telegram.messenger.g0.o());
            this.f46180n.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f50417b;

                {
                    this.f50417b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f50417b;
                            i8Var.H = true;
                            i8Var.B0();
                            return;
                        default:
                            i8 i8Var2 = this.f50417b;
                            int i11 = i8Var2.f46182o0;
                            if (i11 == 0) {
                                if (i8Var2.P == null) {
                                    gi.l3 l3Var = new gi.l3(i8Var2.f46163a.getContext(), 3);
                                    l3Var.r(true);
                                    l3Var.h = org.telegram.messenger.g0.L(310.0f);
                                    l3Var.d = 2300L;
                                    l3Var.U = true;
                                    l3Var.f13084e = true;
                                    l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var.f13105v0 = -org.telegram.messenger.g0.L(10.0f);
                                    i8Var2.P = l3Var;
                                    l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    i8Var2.P.l(i8Var2.getBaseSimpleGlass().f53525c);
                                    i8Var2.f46163a.addView(i8Var2.P, b8.mf.e(-1, 150, 55));
                                    i8Var2.P.u(org.telegram.messenger.bd.M0(2131745669, null));
                                }
                                i8Var2.P.y(i8Var2.f46168c0, true);
                                return;
                            }
                            org.telegram.ui.Components.t4.q(i8Var2, i11, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f46191y)), null, false, new w7(i8Var2), null);
                            return;
                    }
                }
            });
            this.f46180n.setVisibility(8);
            this.f46168c0.addView(this.f46180n, b8.mf.e(-2, 38, 17));
            this.f46163a.addView(this.f46168c0, b8.mf.e(-1, 50, 80));
            this.f46168c0.a(this.h, false);
            int L = org.telegram.messenger.g0.L(19.0f);
            TextView textView3 = this.h;
            int i11 = org.telegram.ui.ActionBar.k6.f28110pf;
            org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.a0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 51), L, L), null, org.telegram.ui.ActionBar.r6.h(i11, 51), null);
            TextView textView4 = this.f46180n;
            int i12 = org.telegram.ui.ActionBar.k6.f28122q7;
            org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.k6.a0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 51), L, L), null, org.telegram.ui.ActionBar.r6.h(i12, 51), null);
            org.telegram.ui.ActionBar.r6.V(this.h, i11, null);
            org.telegram.ui.ActionBar.r6.V(this.f46180n, i12, null);
        }
        View view = new View(context);
        this.f46179l0 = view;
        this.f46163a.addView(view, b8.mf.e(-1, 0, 48));
        this.f46179l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f14496b;
        this.f46163a.addView(this.f46178k0, b8.mf.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23338x5 && this.f46174g0 == ((ei.r6) objArr[0])) {
            z0();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f46165b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.f27816a;
        int i10 = org.telegram.ui.ActionBar.k6.f27816a;
        int i11 = org.telegram.ui.ActionBar.k6.f27816a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, true)) > 0.699999988079071d) {
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
        this.f46191y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i3 = getArguments().getInt("type");
        this.f46173f0 = i3;
        if (i3 == 2) {
            this.f46174g0 = org.telegram.messenger.hp.s1(this.currentAccount).P1().A(0, -1, this.f46191y, true);
        } else if (i3 == 3) {
            this.f46174g0 = org.telegram.messenger.hp.s1(this.currentAccount).P1().A(1, -1, this.f46191y, true);
        }
        ei.r6 r6Var = this.f46174g0;
        if (r6Var != null) {
            this.f46175h0 = new w7(this);
        }
        if (this.f46191y >= 0) {
            this.f46171e0 = true;
        } else {
            this.f46171e0 = false;
        }
        if (r6Var != null) {
            org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23338x5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f46174g0 != null) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23338x5);
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f46179l0.getLayoutParams().height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
        this.f46178k0.setTranslationY(pi.a.d(i10) - org.telegram.messenger.g0.L(9.66f));
        w0(i10, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f46172f != null && this.f46170e != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
            if (x02 != this.f46184q0 || x03 != this.f46186r0 || x04 != this.f46188s0) {
                this.f46184q0 = x02;
                this.f46186r0 = x03;
                this.f46188s0 = x04;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.x2 x2Var;
        if (z10 && (x2Var = this.f46189w) != null && x2Var.getVisibility() == 0) {
            this.f46189w.setVisibility(8);
            this.f46189w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        ai.x2 x2Var = this.f46189w;
        if (x2Var != null && x2Var.getVisibility() == 0) {
            if (z10) {
                this.f46189w.setAlpha(1.0f - f10);
            } else {
                this.f46189w.setAlpha(f10);
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
        this.f46179l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        w0(bVar.f14496b, bVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        duration.addUpdateListener(new b3(this, 2));
        duration.addListener(new ii.v3(this, 19));
        duration.start();
        this.S = duration;
        for (int i3 = 0; i3 < this.f46165b.getChildCount(); i3++) {
            A0((f8) this.f46165b.getChildAt(i3), true);
        }
        for (int i10 = 0; i10 < this.f46165b.getCachedChildCount(); i10++) {
            f8 f8Var = (f8) this.f46165b.P(i10);
            A0(f8Var, false);
            f8.a(f8Var, this.Q, this.R);
            f8.b(f8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.f46165b.getHiddenChildCount(); i11++) {
            f8 f8Var2 = (f8) this.f46165b.V(i11);
            A0(f8Var2, false);
            f8.a(f8Var2, this.Q, this.R);
            f8.b(f8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.f46165b.getAttachedScrapChildCount(); i12++) {
            f8 f8Var3 = (f8) this.f46165b.O(i12);
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
            int i3 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < this.f46165b.getChildCount(); i10++) {
                View childAt = this.f46165b.getChildAt(i10);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    int i11 = (f8Var.f45176b * 100) + f8Var.f45177c;
                    if (i11 < i3) {
                        i3 = i11;
                    }
                }
            }
            int i12 = this.X;
            if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i3 % 100) + ((i3 / 100) * 12)) {
                x0();
            }
        }
    }

    public final void w0(int i3, int i10) {
        int i11;
        if (this.f46168c0 != null) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        pi.a.e(this.f46165b, i3, i10, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), i11);
        ci.l1 l1Var = this.f46168c0;
        if (l1Var != null) {
            l1Var.setTranslationY((-i10) - org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void x0() {
        if (!this.F && !this.U) {
            if (this.f46174g0 != null) {
                z0();
                this.f46174g0.p(100, false);
                this.F = this.f46174g0.k();
                return;
            }
            this.F = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i3 = this.Y;
            if (i3 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i3 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().j1(this.f46191y);
            if (this.E != 0 && this.f46191y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().j1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.f46165b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new org.telegram.ui.ActionBar.h6(1, this, calendar));
        }
    }

    public final void y0() {
        this.f46170e.setColor(-1);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f46172f.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.I.a(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
    }

    public final void z0() {
        this.F = this.f46174g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.f46169d0 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < this.f46174g0.f10876i.size(); i3++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f46174g0.f10876i.get(i3);
            this.f46169d0 = Math.min(this.f46169d0, ziVar.f26868k.date);
            calendar.setTimeInMillis(ziVar.f26868k.date * 1000);
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
                g8Var.f45589b = new ArrayList();
            }
            g8Var.f45589b.add(Integer.valueOf(ziVar.f1()));
            g8Var.f45588a = ziVar;
            g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, g8Var);
            int i12 = this.X;
            if (i10 < i12 || i12 == 0) {
                this.X = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.f46169d0; i13 < currentTimeMillis; i13 += 86400) {
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
                g8Var2.f45593g = false;
                g8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, g8Var2);
            }
        }
        this.U = this.f46174g0.f10885r;
        if (this.Z) {
            this.G = true;
        }
        this.f46165b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f46169d0) / 2629800)) + 1;
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
