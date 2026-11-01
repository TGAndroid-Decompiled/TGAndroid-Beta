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
public final class h8 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.c2 H;
    public int I;
    public int J;
    public int K;
    public x7 L;
    public l2.f M;
    public un N;
    public org.telegram.ui.Components.q30 O;
    public int P;
    public int Q;
    public ValueAnimator R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public final int X;
    public boolean Y;
    public final int Z;
    public w7 f37723a;
    public final int f37724a0;
    public ag.b1 f37725b;
    public jg.a3 f37726b0;
    public s4.a0 f37727c;
    public int f37728c0;
    public final TextPaint d;
    public boolean f37729d0;
    public final TextPaint e;
    public int f37730e0;
    public final TextPaint f37731f;
    public th.x4 f37732f0;
    public v7 f37733g0;
    public TextView h;
    public int f37734h0;
    public y0 f37735i0;
    public kg.f0 f37736j0;
    public View f37737k0;
    public final Path f37738l0;
    public final nh.i m0;
    public TextView f37739n;
    public int f37740n0;
    public boolean f37741o0;
    public int f37742p0;
    public int f37743q0;
    public final Paint f37744r;
    public int f37745r0;
    public final Paint f37746s;
    public bi.t0 f37747w;
    public final Paint f37748x;
    public long f37749y;

    public h8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f37731f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37744r = paint;
        this.f37746s = new Paint(1);
        this.f37748x = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f37738l0 = new Path();
        this.m0 = new nh.i();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f37724a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public static void Z(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = h8Var.S;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i10 = 0; i10 < tL_messages_searchResultsCalendar.periods.size(); i10++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i10).date * 1000);
                int i11 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i11, sparseArray2);
                }
                f8 f8Var = new f8();
                f8Var.f37035a = new org.telegram.messenger.kj(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = h8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                h8Var.U = i12;
                f8Var.f37037c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((f8) sparseArray2.get(i13, null)).f37039g) {
                    sparseArray2.put(i13, f8Var);
                }
                int i14 = h8Var.W;
                if (i11 < i14 || i14 == 0) {
                    h8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            h8Var.f37728c0 = i15;
            while (true) {
                calendar.setTimeInMillis(i15 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() / 1000 > currentTimeMillis) {
                    break;
                }
                int i16 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i16);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i16, sparseArray3);
                }
                int i17 = calendar.get(5) - 1;
                if (sparseArray3.get(i17, null) == null) {
                    f8 f8Var2 = new f8();
                    f8Var2.f37039g = false;
                    f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, f8Var2);
                }
                i15 += 86400;
            }
            h8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                h8Var.V = ((TLRPC.Message) i0.a.g(1, tL_messages_searchResultsCalendar.messages)).f19815id;
                h8Var.T = false;
                h8Var.v0();
            } else {
                h8Var.T = true;
            }
            if (h8Var.Y) {
                h8Var.F = true;
            }
            h8Var.f37725b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            h8Var.L.k(0, h8Var.K);
            int i18 = h8Var.K;
            if (timeInMillis > i18) {
                h8Var.L.o(i18 + 1, timeInMillis);
                h8Var.K = timeInMillis;
            }
            if (h8Var.T) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.z4 b0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 c0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 d0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 e0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 f0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.z4 g0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static void h0(h8 h8Var) {
        if (h8Var.f37747w == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        h8Var.f37747w.setBackground(new BitmapDrawable(createBitmap));
        h8Var.f37747w.setAlpha(0.0f);
        h8Var.f37747w.setVisibility(0);
    }

    public final void A0(e8 e8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (e8Var.f36770n != null) {
                if (!z10) {
                    SparseArray sparseArray = e8Var.f36774x;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        e8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = e8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < e8Var.d; i17++) {
                    f8 f8Var = (f8) e8Var.f36770n.get(i17, null);
                    if (f8Var != null && (i11 = f8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            e8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            e8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    e8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    e8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = e8Var.f36774x;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            e8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void B0() {
        int abs;
        boolean z10;
        String L0;
        TextView textView;
        org.telegram.ui.Components.q30 q30Var;
        if (!this.f37729d0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752642, null));
            this.H.c(true, 0.0f);
            return;
        }
        int i10 = this.P;
        int i11 = this.Q;
        if (i10 == i11 && i10 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i10 - i11) / 86400) + 1;
        }
        boolean z11 = this.f37741o0;
        int i12 = this.f37740n0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37740n0 = abs;
        boolean z12 = this.G;
        this.f37741o0 = z12;
        float f7 = 1.0f;
        if (abs > 0) {
            L0 = org.telegram.messenger.dd.G(abs, "Days", new Object[0]);
            this.H.c(true, 1.0f);
        } else if (z12) {
            L0 = org.telegram.messenger.dd.L0(2131745677, null);
            this.H.c(true, 1.0f);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131752642, null);
            this.H.c(true, 0.0f);
        }
        String str = L0;
        if (abs > 1) {
            this.f37739n.setText(org.telegram.messenger.dd.a0("ClearHistoryForTheseDays", null, 2131752087, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f37739n.setText(org.telegram.messenger.dd.a0("ClearHistoryForThisDay", null, 2131752086, new Object[0]));
        }
        jg.a3 a3Var = this.f37726b0;
        if (abs <= 0 && !this.G) {
            textView = this.h;
        } else {
            textView = this.f37739n;
        }
        a3Var.a(textView, true);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        i5Var.getClass();
        i5Var.B(str, z10, 150L, org.telegram.ui.Components.gr.h);
        if ((!this.G || abs > 0) && (q30Var = this.O) != null) {
            q30Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(org.telegram.messenger.i0.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37739n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37739n.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setDuration(150L).setListener(new eg.m(this.f37739n)).start();
            this.h.setEnabled(true);
            this.f37739n.setEnabled(false);
            return;
        }
        if (this.f37739n.getVisibility() == 8) {
            this.f37739n.setAlpha(0.0f);
            this.f37739n.setTranslationY(-org.telegram.messenger.i0.L(20.0f));
        }
        this.f37739n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37739n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(20.0f)).setDuration(150L).setListener(new eg.m(this.h)).start();
        ViewPropertyAnimator animate = this.f37739n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37739n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f37731f;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(org.telegram.messenger.i0.L(16.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setTextAlign(align);
        w7 w7Var = new w7(this, context);
        this.f37723a = w7Var;
        w7Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        this.f37723a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752642, null));
        ag.b1 b1Var = new ag.b1(this, context, 3);
        this.f37725b = b1Var;
        s4.a0 a0Var = new s4.a0();
        this.f37727c = a0Var;
        b1Var.setLayoutManager(a0Var);
        this.f37727c.k1(true);
        ag.b1 b1Var2 = this.f37725b;
        x7 x7Var = new x7(this, 0);
        this.L = x7Var;
        b1Var2.setAdapter(x7Var);
        this.f37725b.j(new h3(this, 4));
        if (this.f37730e0 == 0 && this.f37729d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7 w7Var2 = this.f37723a;
        ag.b1 b1Var3 = this.f37725b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        w7Var2.addView(b1Var3, w7.b6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        kg.f0 f0Var = new kg.f0(this, context, new String[]{org.telegram.messenger.dd.L0(2131752640, null), org.telegram.messenger.dd.L0(2131752636, null), org.telegram.messenger.dd.L0(2131752635, null), org.telegram.messenger.dd.L0(2131752637, null), org.telegram.messenger.dd.L0(2131752641, null), org.telegram.messenger.dd.L0(2131752639, null), org.telegram.messenger.dd.L0(2131752638, null)}, 1);
        this.f37736j0 = f0Var;
        f0Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        kg.f0 f0Var2 = this.f37736j0;
        vg.f c10 = getBaseSimpleGlass().f6599c.c(this.f37736j0, null, false);
        c10.o(w7.b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        f0Var2.setBackground(c10);
        this.f37736j0.setTranslationY(ei.b.d(0) - org.telegram.messenger.i0.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 17));
        this.fragmentView = this.f37723a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int e = i0.a.e(this.I, i11, 12, i10) - this.f37724a0;
            this.K = e + 1;
            this.f37727c.h1(e, org.telegram.messenger.i0.L(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.H = c2Var;
        this.simpleActionBar.setBackButtonDrawable(c2Var);
        this.H.c(false, 0.0f);
        x0();
        y0();
        textPaint3.setColor(-1);
        if (z10) {
            this.f37726b0 = new jg.a3(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(org.telegram.messenger.i0.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final h8 f41841b;

                {
                    this.f41841b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h8 h8Var = this.f41841b;
                            h8Var.G = true;
                            h8Var.B0();
                            return;
                        default:
                            h8 h8Var2 = this.f41841b;
                            int i12 = h8Var2.f37740n0;
                            if (i12 == 0) {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(h8Var2.f37723a.getContext(), 8);
                                    h8Var2.O = q30Var;
                                    q30Var.setExtraTranslationY(org.telegram.messenger.i0.L(24.0f));
                                    h8Var2.f37723a.addView(h8Var2.O, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(org.telegram.messenger.dd.L0(2131745676, null));
                                }
                                h8Var2.O.f(h8Var2.f37726b0, true);
                                return;
                            }
                            org.telegram.ui.Components.s4.q(h8Var2, i12, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.f37749y)), null, false, new v7(h8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(org.telegram.messenger.dd.L0(2131745677, null));
            this.f37726b0.addView(this.h, w7.b6.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f37739n = textView2;
            textView2.setGravity(17);
            this.f37739n.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            this.f37739n.setSingleLine();
            this.f37739n.setTextSize(1, 15.0f);
            this.f37739n.setTypeface(org.telegram.messenger.i0.o());
            this.f37739n.setOnClickListener(new View.OnClickListener(this) {
                public final h8 f41841b;

                {
                    this.f41841b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h8 h8Var = this.f41841b;
                            h8Var.G = true;
                            h8Var.B0();
                            return;
                        default:
                            h8 h8Var2 = this.f41841b;
                            int i12 = h8Var2.f37740n0;
                            if (i12 == 0) {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(h8Var2.f37723a.getContext(), 8);
                                    h8Var2.O = q30Var;
                                    q30Var.setExtraTranslationY(org.telegram.messenger.i0.L(24.0f));
                                    h8Var2.f37723a.addView(h8Var2.O, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(org.telegram.messenger.dd.L0(2131745676, null));
                                }
                                h8Var2.O.f(h8Var2.f37726b0, true);
                                return;
                            }
                            org.telegram.ui.Components.s4.q(h8Var2, i12, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.f37749y)), null, false, new v7(h8Var2), null);
                            return;
                    }
                }
            });
            this.f37739n.setVisibility(8);
            this.f37726b0.addView(this.f37739n, w7.b6.e(-2, 38, 17));
            this.f37723a.addView(this.f37726b0, w7.b6.e(-1, 50, 80));
            this.f37726b0.a(this.h, false);
            int L = org.telegram.messenger.i0.L(19.0f);
            TextView textView3 = this.h;
            int i12 = org.telegram.ui.ActionBar.t6.f21161pf;
            org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.a0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 51), L, L), null, org.telegram.ui.ActionBar.a7.h(i12, 51), null);
            TextView textView4 = this.f37739n;
            int i13 = org.telegram.ui.ActionBar.t6.f21171q7;
            org.telegram.ui.ActionBar.a7.R(textView4, org.telegram.ui.ActionBar.t6.a0(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 51), L, L), null, org.telegram.ui.ActionBar.a7.h(i13, 51), null);
            org.telegram.ui.ActionBar.a7.V(this.h, i12, null);
            org.telegram.ui.ActionBar.a7.V(this.f37739n, i13, null);
        }
        View view = new View(context);
        this.f37737k0 = view;
        this.f37723a.addView(view, w7.b6.e(-1, 0, 48));
        this.f37737k0.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7767b;
        this.f37723a.addView(this.f37736j0, w7.b6.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14819x5 && this.f37732f0 == ((th.x4) objArr[0])) {
            z0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f37725b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.f20866a;
        int i11 = org.telegram.ui.ActionBar.t6.f20866a;
        int i12 = org.telegram.ui.ActionBar.t6.f20866a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
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
        if (this.G) {
            if (z10) {
                this.G = false;
                this.Q = 0;
                this.P = 0;
                B0();
                u0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37749y = getArguments().getLong("dialog_id");
        this.D = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37730e0 = i10;
        if (i10 == 2) {
            this.f37732f0 = org.telegram.messenger.wp.r1(this.currentAccount).O1().A(0, -1, this.f37749y, true);
        } else if (i10 == 3) {
            this.f37732f0 = org.telegram.messenger.wp.r1(this.currentAccount).O1().A(1, -1, this.f37749y, true);
        }
        th.x4 x4Var = this.f37732f0;
        if (x4Var != null) {
            this.f37733g0 = new v7(this);
        }
        if (this.f37749y >= 0) {
            this.f37729d0 = true;
        } else {
            this.f37729d0 = false;
        }
        if (x4Var != null) {
            org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14819x5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37732f0 != null) {
            org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14819x5);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37737k0.getLayoutParams().height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
        this.f37736j0.setTranslationY(ei.b.d(i11) - org.telegram.messenger.i0.L(9.66f));
        w0(i11, i13);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.H != null && this.d != null && this.f37731f != null && this.e != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false);
            if (x02 != this.f37742p0 || x03 != this.f37743q0 || x04 != this.f37745r0) {
                this.f37742p0 = x02;
                this.f37743q0 = x03;
                this.f37745r0 = x04;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        if (z10 && (t0Var = this.f37747w) != null && t0Var.getVisibility() == 0) {
            this.f37747w.setVisibility(8);
            this.f37747w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bi.t0 t0Var = this.f37747w;
        if (t0Var != null && t0Var.getVisibility() == 0) {
            if (z10) {
                this.f37747w.setAlpha(1.0f - f7);
            } else {
                this.f37747w.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Y = true;
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.f37737k0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.c cVar = this.mSystemInsets;
        w0(cVar.f7767b, cVar.d);
    }

    public final void u0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        duration.addUpdateListener(new a3(this, 2));
        duration.addListener(new bg.e(this, 29));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f37725b.getChildCount(); i10++) {
            A0((e8) this.f37725b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37725b.getCachedChildCount(); i11++) {
            e8 e8Var = (e8) this.f37725b.P(i11);
            A0(e8Var, false);
            e8.a(e8Var, this.P, this.Q);
            e8.b(e8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37725b.getHiddenChildCount(); i12++) {
            e8 e8Var2 = (e8) this.f37725b.V(i12);
            A0(e8Var2, false);
            e8.a(e8Var2, this.P, this.Q);
            e8.b(e8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37725b.getAttachedScrapChildCount(); i13++) {
            e8 e8Var3 = (e8) this.f37725b.O(i13);
            A0(e8Var3, false);
            e8.a(e8Var3, this.P, this.Q);
            e8.b(e8Var3, 1.0f);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (!this.E && !this.T) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f37725b.getChildCount(); i11++) {
                View childAt = this.f37725b.getChildAt(i11);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    int i12 = (e8Var.f36767b * 100) + e8Var.f36768c;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
            }
            int i13 = this.W;
            if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
                x0();
            }
        }
    }

    public final void w0(int i10, int i11) {
        int i12;
        if (this.f37726b0 != null) {
            i12 = org.telegram.messenger.i0.L(50.0f);
        } else {
            i12 = 0;
        }
        ei.b.e(this.f37725b, i10, i11, org.telegram.messenger.i0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), i12);
        jg.a3 a3Var = this.f37726b0;
        if (a3Var != null) {
            a3Var.setTranslationY((-i11) - org.telegram.messenger.i0.L(6.0f));
        }
    }

    public final void x0() {
        if (!this.E && !this.T) {
            if (this.f37732f0 != null) {
                z0();
                this.f37732f0.p(100, false);
                this.E = this.f37732f0.k();
                return;
            }
            this.E = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i10 = this.X;
            if (i10 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i10 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().i1(this.f37749y);
            if (this.D != 0 && this.f37749y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().i1(this.D);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f37725b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ag.k0(12, this, calendar));
        }
    }

    public final void y0() {
        this.e.setColor(-1);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f37731f.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.H.a(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
    }

    public final void z0() {
        this.E = this.f37732f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f37728c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37732f0.f49650i.size(); i10++) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.f37732f0.f49650i.get(i10);
            this.f37728c0 = Math.min(this.f37728c0, kjVar.f16690k.date);
            calendar.setTimeInMillis(kjVar.f16690k.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            f8 f8Var = (f8) sparseArray2.get(i12);
            if (f8Var == null) {
                f8Var = new f8();
                f8Var.f37036b = new ArrayList();
            }
            f8Var.f37036b.add(Integer.valueOf(kjVar.f1()));
            f8Var.f37035a = kjVar;
            f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, f8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f37728c0; i14 < currentTimeMillis; i14 += 86400) {
            calendar.setTimeInMillis(i14 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i15 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i15);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i15, sparseArray3);
            }
            int i16 = calendar.get(5) - 1;
            if (sparseArray3.get(i16, null) == null) {
                f8 f8Var2 = new f8();
                f8Var2.f37039g = false;
                f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, f8Var2);
            }
        }
        this.T = this.f37732f0.f49659r;
        if (this.Y) {
            this.F = true;
        }
        this.f37725b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f37728c0) / 2629800)) + 1;
        this.L.k(0, this.K);
        int i17 = this.K;
        if (timeInMillis > i17) {
            this.L.o(i17 + 1, timeInMillis);
            this.K = timeInMillis;
        }
        if (this.T) {
            resumeDelayedFragmentAnimation();
        }
    }
}
