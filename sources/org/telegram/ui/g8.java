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
public final class g8 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean B;
    public boolean C;
    public org.telegram.ui.ActionBar.h2 D;
    public int E;
    public int F;
    public int G;
    public v7 H;
    public m5.c0 I;
    public qn J;
    public org.telegram.ui.Components.s30 K;
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
    public dh.g X;
    public int Y;
    public boolean Z;
    public t7 f38446a;
    public int f38447a0;
    public gh.f1 f38448b;
    public ih.n6 f38449b0;
    public f2.m0 f38450c;
    public g f38451c0;
    public final TextPaint d;
    public int f38452d0;
    public final TextPaint f38453e;
    public b1 f38454e0;
    public final TextPaint f38455f;
    public final Path f38456f0;
    public final dh.l f38457g0;
    public TextView h;
    public int f38458h0;
    public boolean f38459i0;
    public TextView f38460n;
    public final Paint f38461r;
    public final Paint f38462s;
    public fh.l2 v;
    public final Paint f38463w;
    public long f38464x;
    public long f38465y;

    public g8(int i9, int i10, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f38453e = new TextPaint(1);
        this.f38455f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f38461r = paint;
        this.f38462s = new Paint(1);
        this.f38463w = new Paint(1);
        this.O = new SparseArray();
        this.Q = 0;
        this.f38456f0 = new Path();
        this.f38457g0 = new dh.l();
        this.T = i9;
        if (i10 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i10 * 1000);
            this.V = calendar.get(1);
            this.W = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void T(g8 g8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = g8Var.O;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i9 = 0; i9 < tL_messages_searchResultsCalendar.periods.size(); i9++) {
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i9).date * 1000);
                int i10 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i10, sparseArray2);
                }
                e8 e8Var = new e8();
                e8Var.f37839a = new MessageObject(g8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i9), false, false);
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i11 = g8Var.Q + tL_messages_searchResultsCalendar.periods.get(i9).count;
                g8Var.Q = i11;
                e8Var.f37841c = i11;
                int i12 = calendar.get(5) - 1;
                if (sparseArray2.get(i12, null) == null || !((e8) sparseArray2.get(i12, null)).f37844g) {
                    sparseArray2.put(i12, e8Var);
                }
                int i13 = g8Var.S;
                if (i10 < i13 || i13 == 0) {
                    g8Var.S = i10;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i14 = tL_messages_searchResultsCalendar.min_date;
            g8Var.Y = i14;
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
                    e8 e8Var2 = new e8();
                    e8Var2.f37844g = false;
                    e8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i16, e8Var2);
                }
                i14 += 86400;
            }
            g8Var.A = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                g8Var.R = ((TLRPC.Message) j3.r0.j(1, tL_messages_searchResultsCalendar.messages)).f22401id;
                g8Var.P = false;
                g8Var.o0();
            } else {
                g8Var.P = true;
            }
            if (g8Var.U) {
                g8Var.B = true;
            }
            g8Var.f38448b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            g8Var.H.q(0, g8Var.G);
            int i17 = g8Var.G;
            if (timeInMillis > i17) {
                g8Var.H.s(i17 + 1, timeInMillis);
                g8Var.G = timeInMillis;
            }
            if (g8Var.P) {
                g8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.b5 U(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 V(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 W(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Y(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Z(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static void a0(g8 g8Var) {
        if (g8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (g8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (g8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        g8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        g8Var.v.setBackground(new BitmapDrawable(createBitmap));
        g8Var.v.setAlpha(0.0f);
        g8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f38455f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f38453e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f38446a = new t7(this, context);
        createActionBar(context);
        this.f38446a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        gh.f1 f1Var = new gh.f1(this, context, 6);
        this.f38448b = f1Var;
        f2.m0 m0Var = new f2.m0();
        this.f38450c = m0Var;
        f1Var.setLayoutManager(m0Var);
        this.f38450c.k1(true);
        gh.f1 f1Var2 = this.f38448b;
        v7 v7Var = new v7(this, 0);
        this.H = v7Var;
        f1Var2.setAdapter(v7Var);
        this.f38448b.j(new l3(this, 3));
        if (this.f38447a0 == 0 && this.Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7 t7Var = this.f38446a;
        gh.f1 f1Var3 = this.f38448b;
        if (z10) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        t7Var.addView(f1Var3, g7.e6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        this.f38446a.addView(new ih.b3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), g7.e6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 18));
        this.fragmentView = this.f38446a;
        Calendar calendar = Calendar.getInstance();
        this.E = calendar.get(1);
        int i9 = calendar.get(2);
        this.F = i9;
        int i10 = this.V;
        if (i10 != 0) {
            int e10 = e2.c.e(this.E, i10, 12, i9) - this.W;
            this.G = e10 + 1;
            this.f38450c.h1(e10, AndroidUtilities.dp(120.0f));
        }
        if (this.G < 3) {
            this.G = 3;
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.D = h2Var;
        this.actionBar.setBackButtonDrawable(h2Var);
        this.D.c(0.0f, false);
        p0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.f38453e.setColor(-1);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f38455f.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.D.a(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            dh.g gVar = new dh.g(context, 7);
            this.X = gVar;
            gVar.setWillNotDraw(false);
            this.X.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.X.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f42572b;

                {
                    this.f42572b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g8 g8Var = this.f42572b;
                            g8Var.C = true;
                            g8Var.s0();
                            return;
                        default:
                            g8 g8Var2 = this.f42572b;
                            int i12 = g8Var2.f38458h0;
                            if (i12 == 0) {
                                if (g8Var2.K == null) {
                                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(g8Var2.f38446a.getContext(), 8);
                                    g8Var2.K = s30Var;
                                    s30Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    g8Var2.f38446a.addView(g8Var2.K, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    g8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                g8Var2.K.f(g8Var2.X, true);
                                return;
                            }
                            org.telegram.ui.Components.y4.r(g8Var2, i12, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f38464x)), null, false, new u7(g8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.X.addView(this.h, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f38460n = textView2;
            textView2.setGravity(17);
            this.f38460n.setTextSize(1, 15.0f);
            this.f38460n.setTypeface(AndroidUtilities.bold());
            this.f38460n.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f42572b;

                {
                    this.f42572b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g8 g8Var = this.f42572b;
                            g8Var.C = true;
                            g8Var.s0();
                            return;
                        default:
                            g8 g8Var2 = this.f42572b;
                            int i12 = g8Var2.f38458h0;
                            if (i12 == 0) {
                                if (g8Var2.K == null) {
                                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(g8Var2.f38446a.getContext(), 8);
                                    g8Var2.K = s30Var;
                                    s30Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    g8Var2.f38446a.addView(g8Var2.K, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    g8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                g8Var2.K.f(g8Var2.X, true);
                                return;
                            }
                            org.telegram.ui.Components.y4.r(g8Var2, i12, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f38464x)), null, false, new u7(g8Var2), null);
                            return;
                    }
                }
            });
            this.f38460n.setAllCaps(true);
            this.f38460n.setVisibility(8);
            this.X.addView(this.f38460n, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38446a.addView(this.X, g7.e6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i12 = org.telegram.ui.ActionBar.f6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i12, false), 51), 2, -1));
            TextView textView4 = this.f38460n;
            int i13 = org.telegram.ui.ActionBar.f6.f23230q7;
            textView4.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i13, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            this.f38460n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesListUpdated && this.f38449b0 == ((ih.n6) objArr[0])) {
            q0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f22941a;
        int i10 = org.telegram.ui.ActionBar.f6.f22941a;
        int i11 = org.telegram.ui.ActionBar.f6.f22941a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void n0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        duration.addUpdateListener(new f3(this, 3));
        duration.addListener(new mh.x(this, 8));
        duration.start();
        this.N = duration;
        for (int i9 = 0; i9 < this.f38448b.getChildCount(); i9++) {
            r0((d8) this.f38448b.getChildAt(i9), true);
        }
        for (int i10 = 0; i10 < this.f38448b.getCachedChildCount(); i10++) {
            d8 d8Var = (d8) this.f38448b.P(i10);
            r0(d8Var, false);
            d8.a(d8Var, this.L, this.M);
            d8.b(d8Var, 1.0f);
        }
        for (int i11 = 0; i11 < this.f38448b.getHiddenChildCount(); i11++) {
            d8 d8Var2 = (d8) this.f38448b.V(i11);
            r0(d8Var2, false);
            d8.a(d8Var2, this.L, this.M);
            d8.b(d8Var2, 1.0f);
        }
        for (int i12 = 0; i12 < this.f38448b.getAttachedScrapChildCount(); i12++) {
            d8 d8Var3 = (d8) this.f38448b.O(i12);
            r0(d8Var3, false);
            d8.a(d8Var3, this.L, this.M);
            d8.b(d8Var3, 1.0f);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        if (!this.A && !this.P) {
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < this.f38448b.getChildCount(); i10++) {
                View childAt = this.f38448b.getChildAt(i10);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    int i11 = (d8Var.f37434b * 100) + d8Var.f37435c;
                    if (i11 < i9) {
                        i9 = i11;
                    }
                }
            }
            int i12 = this.S;
            if ((i12 % 100) + ((i12 / 100) * 12) + 3 >= (i9 % 100) + ((i9 / 100) * 12)) {
                p0();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.C) {
            if (z10) {
                this.C = false;
                this.M = 0;
                this.L = 0;
                s0();
                n0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38464x = getArguments().getLong("dialog_id");
        this.f38465y = getArguments().getLong("topic_id");
        int i9 = getArguments().getInt("type");
        this.f38447a0 = i9;
        if (i9 == 2) {
            this.f38449b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38464x, 0, -1, true);
        } else if (i9 == 3) {
            this.f38449b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38464x, 1, -1, true);
        }
        ih.n6 n6Var = this.f38449b0;
        if (n6Var != null) {
            this.f38451c0 = new g(this, 8);
        }
        if (this.f38464x >= 0) {
            this.Z = true;
        } else {
            this.Z = false;
        }
        if (n6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38449b0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        fh.l2 l2Var;
        if (z10 && (l2Var = this.v) != null && l2Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        fh.l2 l2Var = this.v;
        if (l2Var != null && l2Var.getVisibility() == 0) {
            if (z10) {
                this.v.setAlpha(1.0f - f10);
            } else {
                this.v.setAlpha(f10);
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
            if (this.f38449b0 != null) {
                q0();
                this.f38449b0.p(100, false);
                this.A = this.f38449b0.k();
                return;
            }
            this.A = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i9 = this.T;
            if (i9 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i9 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f38464x);
            if (this.f38465y != 0 && this.f38464x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f38465y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.R;
            Calendar calendar = Calendar.getInstance();
            this.f38448b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bg.j0(29, this, calendar));
        }
    }

    public final void q0() {
        this.A = this.f38449b0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        this.Y = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < this.f38449b0.f11851i.size(); i9++) {
            MessageObject messageObject = (MessageObject) this.f38449b0.f11851i.get(i9);
            this.Y = Math.min(this.Y, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i10 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i10);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i10, sparseArray2);
            }
            int i11 = calendar.get(5) - 1;
            e8 e8Var = (e8) sparseArray2.get(i11);
            if (e8Var == null) {
                e8Var = new e8();
                e8Var.f37840b = new ArrayList();
            }
            e8Var.f37840b.add(Integer.valueOf(messageObject.getId()));
            e8Var.f37839a = messageObject;
            e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i11, e8Var);
            int i12 = this.S;
            if (i10 < i12 || i12 == 0) {
                this.S = i10;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i13 = this.Y; i13 < currentTimeMillis; i13 += 86400) {
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
                e8 e8Var2 = new e8();
                e8Var2.f37844g = false;
                e8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i15, e8Var2);
            }
        }
        this.P = this.f38449b0.f11860r;
        if (this.U) {
            this.B = true;
        }
        this.f38448b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.Y) / 2629800)) + 1;
        this.H.q(0, this.G);
        int i16 = this.G;
        if (timeInMillis > i16) {
            this.H.s(i16 + 1, timeInMillis);
            this.G = timeInMillis;
        }
        if (this.P) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void r0(d8 d8Var, boolean z10) {
        int i9;
        int i10;
        if (this.L != 0 && this.M != 0) {
            if (d8Var.f37438n != null) {
                boolean z11 = false;
                if (!z10) {
                    SparseArray sparseArray = d8Var.f37441w;
                    int i11 = 0;
                    while (i11 < sparseArray.size()) {
                        d8Var.c(sparseArray.keyAt(i11), 0, 0, false, z11);
                        i11++;
                        z11 = false;
                    }
                }
                int i12 = d8Var.f37436e;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < d8Var.d; i16++) {
                    e8 e8Var = (e8) d8Var.f37438n.get(i16, null);
                    if (e8Var != null && (i10 = e8Var.h) >= this.L && i10 <= this.M) {
                        if (i13 == -1) {
                            i13 = i12;
                        }
                        i14 = i12;
                    }
                    i12++;
                    if (i12 >= 7) {
                        if (i13 != -1 && i14 != -1) {
                            i9 = i15;
                            d8Var.c(i9, i13, i14, true, z10);
                        } else {
                            i9 = i15;
                            d8Var.c(i9, 0, 0, false, z10);
                        }
                        i15 = i9 + 1;
                        i12 = 0;
                        i13 = -1;
                        i14 = -1;
                    }
                }
                int i17 = i15;
                if (i13 != -1 && i14 != -1) {
                    d8Var.c(i17, i13, i14, true, z10);
                    return;
                } else {
                    d8Var.c(i17, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = d8Var.f37441w;
        for (int i18 = 0; i18 < sparseArray2.size(); i18++) {
            d8Var.c(sparseArray2.keyAt(i18), 0, 0, false, z10);
        }
    }

    public final void s0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.s30 s30Var;
        if (!this.Z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.D.c(0.0f, true);
            return;
        }
        int i9 = this.L;
        int i10 = this.M;
        if (i9 == i10 && i9 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i9 - i10) / 86400) + 1;
        }
        boolean z11 = this.f38459i0;
        int i11 = this.f38458h0;
        if (abs == i11 && z11 == this.C) {
            return;
        }
        if (i11 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38458h0 = abs;
        boolean z12 = this.C;
        this.f38459i0 = z12;
        float f10 = 1.0f;
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
            this.f38460n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.C) {
            this.f38460n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z10, 150L, null);
        if ((!this.C || abs > 0) && (s30Var = this.K) != null) {
            s30Var.b(true);
        }
        if (abs <= 0 && !this.C) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f38460n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f38460n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.u9(this.f38460n)).start();
            this.h.setEnabled(true);
            this.f38460n.setEnabled(false);
            return;
        }
        if (this.f38460n.getVisibility() == 8) {
            this.f38460n.setAlpha(0.0f);
            this.f38460n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f38460n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f38460n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.u9(this.h)).start();
        ViewPropertyAnimator animate = this.f38460n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f38460n.setEnabled(true);
    }
}
