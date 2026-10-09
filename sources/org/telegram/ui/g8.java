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
public final class g8 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.g2 H;
    public int I;
    public int J;
    public int K;
    public v7 L;
    public m.f3 M;
    public zn N;
    public org.telegram.ui.Components.z40 O;
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
    public t7 f37913a;
    public final int f37914a0;
    public ai.w0 f37915b;
    public ai.x5 f37916b0;
    public s4.d0 f37917c;
    public int f37918c0;
    public final TextPaint d;
    public boolean f37919d0;
    public final TextPaint f37920e;
    public int f37921e0;
    public final TextPaint f37922f;
    public ai.e9 f37923f0;
    public g f37924g0;
    public TextView h;
    public int f37925h0;
    public z0 f37926i0;
    public final Path f37927j0;
    public final vh.g f37928k0;
    public int f37929l0;
    public boolean m0;
    public TextView f37930n;
    public final Paint f37931r;
    public final Paint f37932s;
    public ci.bb v;
    public final Paint f37933w;
    public long f37934x;
    public long f37935y;

    public g8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f37920e = new TextPaint(1);
        this.f37922f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37931r = paint;
        this.f37932s = new Paint(1);
        this.f37933w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f37927j0 = new Path();
        this.f37928k0 = new vh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f37914a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(g8 g8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = g8Var.S;
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
                e8 e8Var = new e8();
                e8Var.f37181a = new MessageObject(g8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = g8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                g8Var.U = i12;
                e8Var.f37183c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((e8) sparseArray2.get(i13, null)).f37186g) {
                    sparseArray2.put(i13, e8Var);
                }
                int i14 = g8Var.W;
                if (i11 < i14 || i14 == 0) {
                    g8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            g8Var.f37918c0 = i15;
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
                    e8 e8Var2 = new e8();
                    e8Var2.f37186g = false;
                    e8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, e8Var2);
                }
                i15 += 86400;
            }
            g8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                g8Var.V = ((TLRPC.Message) hg.c.g(1, tL_messages_searchResultsCalendar.messages)).f20059id;
                g8Var.T = false;
                g8Var.p0();
            } else {
                g8Var.T = true;
            }
            if (g8Var.Y) {
                g8Var.F = true;
            }
            g8Var.f37915b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            g8Var.L.q(0, g8Var.K);
            int i18 = g8Var.K;
            if (timeInMillis > i18) {
                g8Var.L.s(i18 + 1, timeInMillis);
                g8Var.K = timeInMillis;
            }
            if (g8Var.T) {
                g8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.d5 V(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 W(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 X(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Y(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Z(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 a0(g8 g8Var) {
        return g8Var.parentLayout;
    }

    public static void b0(g8 g8Var) {
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
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f37922f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f37920e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f37913a = new t7(this, context);
        createActionBar(context);
        this.f37913a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.w0 w0Var = new ai.w0(this, context, 6);
        this.f37915b = w0Var;
        s4.d0 d0Var = new s4.d0();
        this.f37917c = d0Var;
        w0Var.setLayoutManager(d0Var);
        this.f37917c.k1(true);
        ai.w0 w0Var2 = this.f37915b;
        v7 v7Var = new v7(this, 0);
        this.L = v7Var;
        w0Var2.setAdapter(v7Var);
        this.f37915b.j(new i3(this, 3));
        if (this.f37921e0 == 0 && this.f37919d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7 t7Var = this.f37913a;
        ai.w0 w0Var3 = this.f37915b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        t7Var.addView(w0Var3, w7.x5.a(-1.0f, 0.0f, 36.0f, 0.0f, f7, -1, 0));
        this.f37913a.addView(new ai.o4(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.x5.a(38.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 23));
        this.fragmentView = this.f37913a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int f10 = hg.c.f(this.I, i11, 12, i10) - this.f37914a0;
            this.K = f10 + 1;
            this.f37917c.h1(f10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.H = g2Var;
        this.actionBar.setBackButtonDrawable(g2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        this.f37920e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f37922f.setColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ai.x5 x5Var = new ai.x5(context, 8);
            this.f37916b0 = x5Var;
            x5Var.setWillNotDraw(false);
            this.f37916b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f37916b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f41592b;

                {
                    this.f41592b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g8 g8Var = this.f41592b;
                            g8Var.G = true;
                            g8Var.t0();
                            return;
                        default:
                            g8 g8Var2 = this.f41592b;
                            int i13 = g8Var2.f37929l0;
                            if (i13 == 0) {
                                if (g8Var2.O == null) {
                                    org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(g8Var2.f37913a.getContext(), 8);
                                    g8Var2.O = z40Var;
                                    z40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    g8Var2.f37913a.addView(g8Var2.O, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    g8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                g8Var2.O.f(g8Var2.f37916b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(g8Var2, i13, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f37934x)), null, false, new u7(g8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f37916b0.addView(this.h, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            this.f37930n = textView2;
            textView2.setGravity(17);
            this.f37930n.setTextSize(1, 15.0f);
            this.f37930n.setTypeface(AndroidUtilities.bold());
            this.f37930n.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f41592b;

                {
                    this.f41592b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g8 g8Var = this.f41592b;
                            g8Var.G = true;
                            g8Var.t0();
                            return;
                        default:
                            g8 g8Var2 = this.f41592b;
                            int i13 = g8Var2.f37929l0;
                            if (i13 == 0) {
                                if (g8Var2.O == null) {
                                    org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(g8Var2.f37913a.getContext(), 8);
                                    g8Var2.O = z40Var;
                                    z40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    g8Var2.f37913a.addView(g8Var2.O, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    g8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                g8Var2.O.f(g8Var2.f37916b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(g8Var2, i13, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f37934x)), null, false, new u7(g8Var2), null);
                            return;
                    }
                }
            });
            this.f37930n.setAllCaps(true);
            this.f37930n.setVisibility(8);
            this.f37916b0.addView(this.f37930n, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            this.f37913a.addView(this.f37916b0, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.i6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f37930n;
            int i14 = org.telegram.ui.ActionBar.i6.f21037q7;
            textView4.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
            this.f37930n.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f37923f0 == ((ai.e9) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.i6.f20734a;
        int i11 = org.telegram.ui.ActionBar.i6.f20734a;
        int i12 = org.telegram.ui.ActionBar.i6.f20734a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.hs.f27118f);
        duration.addUpdateListener(new c3(this, 3));
        duration.addListener(new t4(this, 2));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f37915b.getChildCount(); i10++) {
            s0((d8) this.f37915b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37915b.getCachedChildCount(); i11++) {
            d8 d8Var = (d8) this.f37915b.P(i11);
            s0(d8Var, false);
            d8.a(d8Var, this.P, this.Q);
            d8.b(d8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37915b.getHiddenChildCount(); i12++) {
            d8 d8Var2 = (d8) this.f37915b.V(i12);
            s0(d8Var2, false);
            d8.a(d8Var2, this.P, this.Q);
            d8.b(d8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37915b.getAttachedScrapChildCount(); i13++) {
            d8 d8Var3 = (d8) this.f37915b.O(i13);
            s0(d8Var3, false);
            d8.a(d8Var3, this.P, this.Q);
            d8.b(d8Var3, 1.0f);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
            if (z10) {
                this.G = false;
                this.Q = 0;
                this.P = 0;
                t0();
                o0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37934x = getArguments().getLong("dialog_id");
        this.f37935y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37921e0 = i10;
        if (i10 == 2) {
            this.f37923f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37934x, 0, -1, true);
        } else if (i10 == 3) {
            this.f37923f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37934x, 1, -1, true);
        }
        ai.e9 e9Var = this.f37923f0;
        if (e9Var != null) {
            this.f37924g0 = new g(this, 8);
        }
        if (this.f37934x >= 0) {
            this.f37919d0 = true;
        } else {
            this.f37919d0 = false;
        }
        if (e9Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37923f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.bb bbVar;
        if (z10 && (bbVar = this.v) != null && bbVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        ci.bb bbVar = this.v;
        if (bbVar != null && bbVar.getVisibility() == 0) {
            if (z10) {
                this.v.setAlpha(1.0f - f7);
            } else {
                this.v.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.Y = true;
    }

    public final void p0() {
        if (!this.E && !this.T) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f37915b.getChildCount(); i11++) {
                View childAt = this.f37915b.getChildAt(i11);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    int i12 = (d8Var.f36882b * 100) + d8Var.f36883c;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
            }
            int i13 = this.W;
            if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
                q0();
            }
        }
    }

    public final void q0() {
        if (!this.E && !this.T) {
            if (this.f37923f0 != null) {
                r0();
                this.f37923f0.p(100, false);
                this.E = this.f37923f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f37934x);
            if (this.f37935y != 0 && this.f37934x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f37935y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f37915b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.v1(22, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f37923f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f37918c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37923f0.f899i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f37923f0.f899i.get(i10);
            this.f37918c0 = Math.min(this.f37918c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            e8 e8Var = (e8) sparseArray2.get(i12);
            if (e8Var == null) {
                e8Var = new e8();
                e8Var.f37182b = new ArrayList();
            }
            e8Var.f37182b.add(Integer.valueOf(messageObject.getId()));
            e8Var.f37181a = messageObject;
            e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, e8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f37918c0; i14 < currentTimeMillis; i14 += 86400) {
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
                e8 e8Var2 = new e8();
                e8Var2.f37186g = false;
                e8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, e8Var2);
            }
        }
        this.T = this.f37923f0.f908r;
        if (this.Y) {
            this.F = true;
        }
        this.f37915b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f37918c0) / 2629800)) + 1;
        this.L.q(0, this.K);
        int i17 = this.K;
        if (timeInMillis > i17) {
            this.L.s(i17 + 1, timeInMillis);
            this.K = timeInMillis;
        }
        if (this.T) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(d8 d8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (d8Var.f36886n != null) {
                if (!z10) {
                    SparseArray sparseArray = d8Var.f36889w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        d8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = d8Var.f36884e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < d8Var.d; i17++) {
                    e8 e8Var = (e8) d8Var.f36886n.get(i17, null);
                    if (e8Var != null && (i11 = e8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            d8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            d8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    d8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    d8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = d8Var.f36889w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            d8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.z40 z40Var;
        if (!this.f37919d0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.H.c(0.0f, true);
            return;
        }
        int i10 = this.P;
        int i11 = this.Q;
        if (i10 == i11 && i10 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i10 - i11) / 86400) + 1;
        }
        boolean z11 = this.m0;
        int i12 = this.f37929l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37929l0 = abs;
        boolean z12 = this.G;
        this.m0 = z12;
        float f7 = 1.0f;
        if (abs > 0) {
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.H.c(1.0f, true);
        } else if (z12) {
            string = LocaleController.getString(R.string.SelectDays);
            this.H.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.H.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.f37930n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f37930n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (z40Var = this.O) != null) {
            z40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37930n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37930n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.fa(this.f37930n)).start();
            this.h.setEnabled(true);
            this.f37930n.setEnabled(false);
            return;
        }
        if (this.f37930n.getVisibility() == 8) {
            this.f37930n.setAlpha(0.0f);
            this.f37930n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f37930n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37930n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.fa(this.h)).start();
        ViewPropertyAnimator animate = this.f37930n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37930n.setEnabled(true);
    }
}
