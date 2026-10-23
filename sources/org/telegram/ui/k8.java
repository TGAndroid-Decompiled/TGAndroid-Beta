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
public final class k8 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.h2 H;
    public int I;
    public int J;
    public int K;
    public z7 L;
    public le.b M;
    public sn N;
    public org.telegram.ui.Components.r40 O;
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
    public x7 f38846a;
    public final int f38847a0;
    public ai.u1 f38848b;
    public ci.h4 f38849b0;
    public s4.b0 f38850c;
    public int f38851c0;
    public final TextPaint d;
    public boolean f38852d0;
    public final TextPaint e;
    public int f38853e0;
    public final TextPaint f38854f;
    public ci.z6 f38855f0;
    public f f38856g0;
    public TextView h;
    public int f38857h0;
    public a1 f38858i0;
    public final Path f38859j0;
    public final wh.g f38860k0;
    public int f38861l0;
    public boolean m0;
    public TextView f38862n;
    public int f38863n0;
    public int f38864o0;
    public int f38865p0;
    public final Paint f38866r;
    public final Paint f38867s;
    public ai.jc v;
    public final Paint f38868w;
    public long f38869x;
    public long f38870y;

    public k8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f38854f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f38866r = paint;
        this.f38867s = new Paint(1);
        this.f38868w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f38859j0 = new Path();
        this.f38860k0 = new wh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f38847a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(k8 k8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = k8Var.S;
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
                i8 i8Var = new i8();
                i8Var.f38085a = new MessageObject(k8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = k8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                k8Var.U = i12;
                i8Var.f38087c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((i8) sparseArray2.get(i13, null)).f38089g) {
                    sparseArray2.put(i13, i8Var);
                }
                int i14 = k8Var.W;
                if (i11 < i14 || i14 == 0) {
                    k8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            k8Var.f38851c0 = i15;
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
                    i8 i8Var2 = new i8();
                    i8Var2.f38089g = false;
                    i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, i8Var2);
                }
                i15 += 86400;
            }
            k8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                k8Var.V = ((TLRPC.Message) i2.o1.i(1, tL_messages_searchResultsCalendar.messages)).f20364id;
                k8Var.T = false;
                k8Var.p0();
            } else {
                k8Var.T = true;
            }
            if (k8Var.Y) {
                k8Var.F = true;
            }
            k8Var.f38848b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            k8Var.L.q(0, k8Var.K);
            int i18 = k8Var.K;
            if (timeInMillis > i18) {
                k8Var.L.s(i18 + 1, timeInMillis);
                k8Var.K = timeInMillis;
            }
            if (k8Var.T) {
                k8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.h5 V(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.h5 W(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.h5 X(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.h5 Y(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.h5 Z(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.h5 a0(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static void b0(k8 k8Var) {
        if (k8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (k8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (k8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        k8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        k8Var.v.setBackground(new BitmapDrawable(createBitmap));
        k8Var.v.setAlpha(0.0f);
        k8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f38854f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f38846a = new x7(this, context);
        createActionBar(context);
        this.f38846a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.u1 u1Var = new ai.u1(this, context, 7);
        this.f38848b = u1Var;
        s4.b0 b0Var = new s4.b0();
        this.f38850c = b0Var;
        u1Var.setLayoutManager(b0Var);
        this.f38850c.k1(true);
        ai.u1 u1Var2 = this.f38848b;
        z7 z7Var = new z7(this, 0);
        this.L = z7Var;
        u1Var2.setAdapter(z7Var);
        this.f38848b.j(new j3(this, 3));
        if (this.f38853e0 == 0 && this.f38852d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var = this.f38846a;
        ai.u1 u1Var3 = this.f38848b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        x7Var.addView(u1Var3, w7.z5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        this.f38846a.addView(new ci.h3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.z5.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 26));
        this.fragmentView = this.f38846a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int v = com.google.android.gms.internal.play_billing.k3.v(this.I, i11, 12, i10) - this.f38847a0;
            this.K = v + 1;
            this.f38850c.h1(v, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.H = h2Var;
        this.actionBar.setBackButtonDrawable(h2Var);
        this.H.c(0.0f, false);
        q0();
        r0();
        textPaint3.setColor(-1);
        if (z10) {
            ci.h4 h4Var = new ci.h4(context, 8);
            this.f38849b0 = h4Var;
            h4Var.setWillNotDraw(false);
            this.f38849b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f38849b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f42949b;

                {
                    this.f42949b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f42949b;
                            k8Var.G = true;
                            k8Var.u0();
                            return;
                        default:
                            k8 k8Var2 = this.f42949b;
                            int i12 = k8Var2.f38861l0;
                            if (i12 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(k8Var2.f38846a.getContext(), 8);
                                    k8Var2.O = r40Var;
                                    r40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f38846a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f38849b0, true);
                                return;
                            }
                            org.telegram.ui.Components.f5.r(k8Var2, i12, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38869x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f38849b0.addView(this.h, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f38862n = textView2;
            textView2.setGravity(17);
            this.f38862n.setTextSize(1, 15.0f);
            this.f38862n.setTypeface(AndroidUtilities.bold());
            this.f38862n.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f42949b;

                {
                    this.f42949b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f42949b;
                            k8Var.G = true;
                            k8Var.u0();
                            return;
                        default:
                            k8 k8Var2 = this.f42949b;
                            int i12 = k8Var2.f38861l0;
                            if (i12 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(k8Var2.f38846a.getContext(), 8);
                                    k8Var2.O = r40Var;
                                    r40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f38846a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f38849b0, true);
                                return;
                            }
                            org.telegram.ui.Components.f5.r(k8Var2, i12, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38869x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.f38862n.setAllCaps(true);
            this.f38862n.setVisibility(8);
            this.f38849b0.addView(this.f38862n, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38846a.addView(this.f38849b0, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i12 = org.telegram.ui.ActionBar.k6.Ae;
            org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.g0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 51), 2, -1), null, org.telegram.ui.ActionBar.r6.h(i12, 51), null);
            TextView textView4 = this.f38862n;
            int i13 = org.telegram.ui.ActionBar.k6.f21421q7;
            org.telegram.ui.ActionBar.r6.S(textView4, org.telegram.ui.ActionBar.k6.g0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 51), 2, -1), null, org.telegram.ui.ActionBar.r6.h(i13, 51), null);
            org.telegram.ui.ActionBar.r6.W(this.h, i12, null);
            org.telegram.ui.ActionBar.r6.W(this.f38862n, i13, null);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f38855f0 == ((ci.z6) objArr[0])) {
            s0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21118a;
        int i11 = org.telegram.ui.ActionBar.k6.f21118a;
        int i12 = org.telegram.ui.ActionBar.k6.f21118a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.bs.f25133f);
        duration.addUpdateListener(new d3(this, 3));
        duration.addListener(new m.a(this, 7));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f38848b.getChildCount(); i10++) {
            t0((h8) this.f38848b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f38848b.getCachedChildCount(); i11++) {
            h8 h8Var = (h8) this.f38848b.P(i11);
            t0(h8Var, false);
            h8.a(h8Var, this.P, this.Q);
            h8.b(h8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f38848b.getHiddenChildCount(); i12++) {
            h8 h8Var2 = (h8) this.f38848b.V(i12);
            t0(h8Var2, false);
            h8.a(h8Var2, this.P, this.Q);
            h8.b(h8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f38848b.getAttachedScrapChildCount(); i13++) {
            h8 h8Var3 = (h8) this.f38848b.O(i13);
            t0(h8Var3, false);
            h8.a(h8Var3, this.P, this.Q);
            h8.b(h8Var3, 1.0f);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
            if (z10) {
                this.G = false;
                this.Q = 0;
                this.P = 0;
                u0();
                o0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38869x = getArguments().getLong("dialog_id");
        this.f38870y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f38853e0 = i10;
        if (i10 == 2) {
            this.f38855f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38869x, 0, -1, true);
        } else if (i10 == 3) {
            this.f38855f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38869x, 1, -1, true);
        }
        ci.z6 z6Var = this.f38855f0;
        if (z6Var != null) {
            this.f38856g0 = new f(this, 8);
        }
        if (this.f38869x >= 0) {
            this.f38852d0 = true;
        } else {
            this.f38852d0 = false;
        }
        if (z6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38855f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.H != null && this.d != null && this.f38854f != null && this.e != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false);
            if (x02 != this.f38863n0 || x03 != this.f38864o0 || x04 != this.f38865p0) {
                this.f38863n0 = x02;
                this.f38864o0 = x03;
                this.f38865p0 = x04;
                r0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.jc jcVar;
        if (z10 && (jcVar = this.v) != null && jcVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        ai.jc jcVar = this.v;
        if (jcVar != null && jcVar.getVisibility() == 0) {
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
            for (int i11 = 0; i11 < this.f38848b.getChildCount(); i11++) {
                View childAt = this.f38848b.getChildAt(i11);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    int i12 = (h8Var.f37773b * 100) + h8Var.f37774c;
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
            if (this.f38855f0 != null) {
                s0();
                this.f38855f0.p(100, false);
                this.E = this.f38855f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f38869x);
            if (this.f38870y != 0 && this.f38869x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f38870y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f38848b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.g(29, this, calendar));
        }
    }

    public final void r0() {
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        this.e.setColor(-1);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f38854f.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.H.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false), false);
    }

    public final void s0() {
        this.E = this.f38855f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f38851c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f38855f0.f6193i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f38855f0.f6193i.get(i10);
            this.f38851c0 = Math.min(this.f38851c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            i8 i8Var = (i8) sparseArray2.get(i12);
            if (i8Var == null) {
                i8Var = new i8();
                i8Var.f38086b = new ArrayList();
            }
            i8Var.f38086b.add(Integer.valueOf(messageObject.getId()));
            i8Var.f38085a = messageObject;
            i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, i8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f38851c0; i14 < currentTimeMillis; i14 += 86400) {
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
                i8 i8Var2 = new i8();
                i8Var2.f38089g = false;
                i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, i8Var2);
            }
        }
        this.T = this.f38855f0.f6202r;
        if (this.Y) {
            this.F = true;
        }
        this.f38848b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f38851c0) / 2629800)) + 1;
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

    public final void t0(h8 h8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (h8Var.f37776n != null) {
                if (!z10) {
                    SparseArray sparseArray = h8Var.f37779w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        h8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = h8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < h8Var.d; i17++) {
                    i8 i8Var = (i8) h8Var.f37776n.get(i17, null);
                    if (i8Var != null && (i11 = i8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            h8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            h8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    h8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    h8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = h8Var.f37779w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            h8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void u0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.r40 r40Var;
        if (!this.f38852d0) {
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
        int i12 = this.f38861l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38861l0 = abs;
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
            this.f38862n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f38862n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (r40Var = this.O) != null) {
            r40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f38862n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f38862n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new ho(this.f38862n)).start();
            this.h.setEnabled(true);
            this.f38862n.setEnabled(false);
            return;
        }
        if (this.f38862n.getVisibility() == 8) {
            this.f38862n.setAlpha(0.0f);
            this.f38862n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f38862n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f38862n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new ho(this.h)).start();
        ViewPropertyAnimator animate = this.f38862n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f38862n.setEnabled(true);
    }
}
