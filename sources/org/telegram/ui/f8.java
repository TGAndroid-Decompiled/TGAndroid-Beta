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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean B;
    public boolean C;
    public org.telegram.ui.ActionBar.h2 D;
    public int E;
    public int F;
    public int G;
    public u7 H;
    public o1.a I;
    public tn J;
    public org.telegram.ui.Components.g40 K;
    public int L;
    public int M;
    public ValueAnimator N;
    public final SparseArray O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public boolean U;
    public final int V;
    public final int W;
    public bh.d X;
    public int Y;
    public boolean Z;
    public s7 f38019a;
    public int f38020a0;
    public jh.e1 f38021b;
    public lh.k6 f38022b0;
    public f2.j0 f38023c;
    public h f38024c0;
    public final TextPaint d;
    public int f38025d0;
    public final TextPaint f38026e;
    public c1 f38027e0;
    public final TextPaint f38028f;
    public final Path f38029f0;
    public final gh.k f38030g0;
    public TextView h;
    public int f38031h0;
    public boolean f38032i0;
    public TextView f38033n;
    public final Paint f38034r;
    public final Paint f38035s;
    public cg.h0 v;
    public final Paint f38036w;
    public long f38037x;
    public long f38038y;

    public f8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f38026e = new TextPaint(1);
        this.f38028f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f38034r = paint;
        this.f38035s = new Paint(1);
        this.f38036w = new Paint(1);
        this.O = new SparseArray();
        this.Q = 0;
        this.f38029f0 = new Path();
        this.f38030g0 = new gh.k();
        this.T = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.V = calendar.get(1);
            this.W = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(f8 f8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = f8Var.O;
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
                d8 d8Var = new d8();
                d8Var.f37392a = new MessageObject(f8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = f8Var.Q + tL_messages_searchResultsCalendar.periods.get(i10).count;
                f8Var.Q = i12;
                d8Var.f37394c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((d8) sparseArray2.get(i13, null)).f37397g) {
                    sparseArray2.put(i13, d8Var);
                }
                int i14 = f8Var.S;
                if (i11 < i14 || i14 == 0) {
                    f8Var.S = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            f8Var.Y = i15;
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
                    d8 d8Var2 = new d8();
                    d8Var2.f37397g = false;
                    d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, d8Var2);
                }
                i15 += 86400;
            }
            f8Var.A = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                f8Var.R = ((TLRPC.Message) j7.l1.i(1, tL_messages_searchResultsCalendar.messages)).f22413id;
                f8Var.P = false;
                f8Var.p0();
            } else {
                f8Var.P = true;
            }
            if (f8Var.U) {
                f8Var.B = true;
            }
            f8Var.f38021b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            f8Var.H.q(0, f8Var.G);
            int i18 = f8Var.G;
            if (timeInMillis > i18) {
                f8Var.H.s(i18 + 1, timeInMillis);
                f8Var.G = timeInMillis;
            }
            if (f8Var.P) {
                f8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.b5 V(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 W(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Y(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Z(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 a0(f8 f8Var) {
        return f8Var.parentLayout;
    }

    public static void b0(f8 f8Var) {
        if (f8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (f8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (f8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        f8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        f8Var.v.setBackground(new BitmapDrawable(createBitmap));
        f8Var.v.setAlpha(0.0f);
        f8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f9;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f38028f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f38026e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f38019a = new s7(this, context);
        createActionBar(context);
        this.f38019a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        jh.e1 e1Var = new jh.e1(this, context, 5);
        this.f38021b = e1Var;
        f2.j0 j0Var = new f2.j0();
        this.f38023c = j0Var;
        e1Var.setLayoutManager(j0Var);
        this.f38023c.k1(true);
        jh.e1 e1Var2 = this.f38021b;
        u7 u7Var = new u7(this, 0);
        this.H = u7Var;
        e1Var2.setAdapter(u7Var);
        this.f38021b.j(new m3(this, 3));
        if (this.f38020a0 == 0 && this.Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7 s7Var = this.f38019a;
        jh.e1 e1Var3 = this.f38021b;
        if (z10) {
            f9 = 48.0f;
        } else {
            f9 = 0.0f;
        }
        s7Var.addView(e1Var3, i7.f6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f9));
        this.f38019a.addView(new lh.z2(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), i7.f6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 10));
        this.fragmentView = this.f38019a;
        Calendar calendar = Calendar.getInstance();
        this.E = calendar.get(1);
        int i10 = calendar.get(2);
        this.F = i10;
        int i11 = this.V;
        if (i11 != 0) {
            int f10 = com.google.android.recaptcha.internal.a.f(this.E, i11, 12, i10) - this.W;
            this.G = f10 + 1;
            this.f38023c.h1(f10, AndroidUtilities.dp(120.0f));
        }
        if (this.G < 3) {
            this.G = 3;
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.D = h2Var;
        this.actionBar.setBackButtonDrawable(h2Var);
        this.D.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.f38026e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f38028f.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.D.a(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            bh.d dVar = new bh.d(context, 9);
            this.X = dVar;
            dVar.setWillNotDraw(false);
            this.X.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.X.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f41985b;

                {
                    this.f41985b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f41985b;
                            f8Var.C = true;
                            f8Var.t0();
                            return;
                        default:
                            f8 f8Var2 = this.f41985b;
                            int i13 = f8Var2.f38031h0;
                            if (i13 == 0) {
                                if (f8Var2.K == null) {
                                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(f8Var2.f38019a.getContext(), 8);
                                    f8Var2.K = g40Var;
                                    g40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.f38019a.addView(f8Var2.K, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    f8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.K.f(f8Var2.X, true);
                                return;
                            }
                            org.telegram.ui.Components.c5.r(f8Var2, i13, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f38037x)), null, false, new t7(f8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.X.addView(this.h, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f38033n = textView2;
            textView2.setGravity(17);
            this.f38033n.setTextSize(1, 15.0f);
            this.f38033n.setTypeface(AndroidUtilities.bold());
            this.f38033n.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f41985b;

                {
                    this.f41985b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f41985b;
                            f8Var.C = true;
                            f8Var.t0();
                            return;
                        default:
                            f8 f8Var2 = this.f41985b;
                            int i13 = f8Var2.f38031h0;
                            if (i13 == 0) {
                                if (f8Var2.K == null) {
                                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(f8Var2.f38019a.getContext(), 8);
                                    f8Var2.K = g40Var;
                                    g40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.f38019a.addView(f8Var2.K, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    f8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.K.f(f8Var2.X, true);
                                return;
                            }
                            org.telegram.ui.Components.c5.r(f8Var2, i13, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f38037x)), null, false, new t7(f8Var2), null);
                            return;
                    }
                }
            });
            this.f38033n.setAllCaps(true);
            this.f38033n.setVisibility(8);
            this.X.addView(this.f38033n, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38019a.addView(this.X, i7.f6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.g6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f38033n;
            int i14 = org.telegram.ui.ActionBar.g6.f23295q7;
            textView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            this.f38033n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f38022b0 == ((lh.k6) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23002a;
        int i11 = org.telegram.ui.ActionBar.g6.f23002a;
        int i12 = org.telegram.ui.ActionBar.g6.f23002a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        duration.addUpdateListener(new g3(this, 3));
        duration.addListener(new nh.q5(this, 10));
        duration.start();
        this.N = duration;
        for (int i10 = 0; i10 < this.f38021b.getChildCount(); i10++) {
            s0((c8) this.f38021b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f38021b.getCachedChildCount(); i11++) {
            c8 c8Var = (c8) this.f38021b.P(i11);
            s0(c8Var, false);
            c8.a(c8Var, this.L, this.M);
            c8.b(c8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f38021b.getHiddenChildCount(); i12++) {
            c8 c8Var2 = (c8) this.f38021b.V(i12);
            s0(c8Var2, false);
            c8.a(c8Var2, this.L, this.M);
            c8.b(c8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f38021b.getAttachedScrapChildCount(); i13++) {
            c8 c8Var3 = (c8) this.f38021b.O(i13);
            s0(c8Var3, false);
            c8.a(c8Var3, this.L, this.M);
            c8.b(c8Var3, 1.0f);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.C) {
            if (z10) {
                this.C = false;
                this.M = 0;
                this.L = 0;
                t0();
                o0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38037x = getArguments().getLong("dialog_id");
        this.f38038y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f38020a0 = i10;
        if (i10 == 2) {
            this.f38022b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38037x, 0, -1, true);
        } else if (i10 == 3) {
            this.f38022b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38037x, 1, -1, true);
        }
        lh.k6 k6Var = this.f38022b0;
        if (k6Var != null) {
            this.f38024c0 = new h(this, 8);
        }
        if (this.f38037x >= 0) {
            this.Z = true;
        } else {
            this.Z = false;
        }
        if (k6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38022b0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        cg.h0 h0Var;
        if (z10 && (h0Var = this.v) != null && h0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        cg.h0 h0Var = this.v;
        if (h0Var != null && h0Var.getVisibility() == 0) {
            if (z10) {
                this.v.setAlpha(1.0f - f9);
            } else {
                this.v.setAlpha(f9);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.U = true;
    }

    public final void p0() {
        if (!this.A && !this.P) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f38021b.getChildCount(); i11++) {
                View childAt = this.f38021b.getChildAt(i11);
                if (childAt instanceof c8) {
                    c8 c8Var = (c8) childAt;
                    int i12 = (c8Var.f37028b * 100) + c8Var.f37029c;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
            }
            int i13 = this.S;
            if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
                q0();
            }
        }
    }

    public final void q0() {
        if (!this.A && !this.P) {
            if (this.f38022b0 != null) {
                r0();
                this.f38022b0.p(100, false);
                this.A = this.f38022b0.k();
                return;
            }
            this.A = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i10 = this.T;
            if (i10 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i10 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f38037x);
            if (this.f38038y != 0 && this.f38037x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f38038y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.R;
            Calendar calendar = Calendar.getInstance();
            this.f38021b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bg.h3(25, this, calendar));
        }
    }

    public final void r0() {
        this.A = this.f38022b0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        this.Y = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f38022b0.f15838i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f38022b0.f15838i.get(i10);
            this.Y = Math.min(this.Y, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            d8 d8Var = (d8) sparseArray2.get(i12);
            if (d8Var == null) {
                d8Var = new d8();
                d8Var.f37393b = new ArrayList();
            }
            d8Var.f37393b.add(Integer.valueOf(messageObject.getId()));
            d8Var.f37392a = messageObject;
            d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, d8Var);
            int i13 = this.S;
            if (i11 < i13 || i13 == 0) {
                this.S = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.Y; i14 < currentTimeMillis; i14 += 86400) {
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
                d8 d8Var2 = new d8();
                d8Var2.f37397g = false;
                d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, d8Var2);
            }
        }
        this.P = this.f38022b0.f15847r;
        if (this.U) {
            this.B = true;
        }
        this.f38021b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.Y) / 2629800)) + 1;
        this.H.q(0, this.G);
        int i17 = this.G;
        if (timeInMillis > i17) {
            this.H.s(i17 + 1, timeInMillis);
            this.G = timeInMillis;
        }
        if (this.P) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(c8 c8Var, boolean z10) {
        int i10;
        int i11;
        if (this.L != 0 && this.M != 0) {
            if (c8Var.f37032n != null) {
                boolean z11 = false;
                if (!z10) {
                    SparseArray sparseArray = c8Var.f37035w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        c8Var.c(sparseArray.keyAt(i12), 0, 0, false, z11);
                        i12++;
                        z11 = false;
                    }
                }
                int i13 = c8Var.f37030e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < c8Var.d; i17++) {
                    d8 d8Var = (d8) c8Var.f37032n.get(i17, null);
                    if (d8Var != null && (i11 = d8Var.h) >= this.L && i11 <= this.M) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            c8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            c8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    c8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    c8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = c8Var.f37035w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            c8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.g40 g40Var;
        if (!this.Z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.D.c(0.0f, true);
            return;
        }
        int i10 = this.L;
        int i11 = this.M;
        if (i10 == i11 && i10 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i10 - i11) / 86400) + 1;
        }
        boolean z11 = this.f38032i0;
        int i12 = this.f38031h0;
        if (abs == i12 && z11 == this.C) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38031h0 = abs;
        boolean z12 = this.C;
        this.f38032i0 = z12;
        float f9 = 1.0f;
        if (abs > 0) {
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.D.c(1.0f, true);
        } else if (z12) {
            string = LocaleController.getString(R.string.SelectDays);
            this.D.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.D.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.f38033n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.C) {
            this.f38033n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z10, 150L, null);
        if ((!this.C || abs > 0) && (g40Var = this.K) != null) {
            g40Var.b(true);
        }
        if (abs <= 0 && !this.C) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f38033n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f38033n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.z9(this.f38033n)).start();
            this.h.setEnabled(true);
            this.f38033n.setEnabled(false);
            return;
        }
        if (this.f38033n.getVisibility() == 8) {
            this.f38033n.setAlpha(0.0f);
            this.f38033n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f38033n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f38033n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.z9(this.h)).start();
        ViewPropertyAnimator animate = this.f38033n.animate();
        if (abs == 0) {
            f9 = 0.5f;
        }
        animate.alpha(f9).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f38033n.setEnabled(true);
    }
}
