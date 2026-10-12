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
public final class l8 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.f2 H;
    public int I;
    public int J;
    public int K;
    public a8 L;
    public ji.d4 M;
    public fo N;
    public org.telegram.ui.Components.v40 O;
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
    public y7 f37866a;
    public final int f37867a0;
    public bi.o0 f37868b;
    public bi.i5 f37869b0;
    public s4.b0 f37870c;
    public int f37871c0;
    public final TextPaint d;
    public boolean f37872d0;
    public final TextPaint e;
    public int f37873e0;
    public final TextPaint f37874f;
    public bi.o8 f37875f0;
    public g f37876g0;
    public TextView h;
    public int f37877h0;
    public b1 f37878i0;
    public final Path f37879j0;
    public final wh.g f37880k0;
    public int f37881l0;
    public boolean m0;
    public TextView f37882n;
    public final Paint f37883r;
    public final Paint f37884s;
    public di.ab v;
    public final Paint f37885w;
    public long f37886x;
    public long f37887y;

    public l8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f37874f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37883r = paint;
        this.f37884s = new Paint(1);
        this.f37885w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f37879j0 = new Path();
        this.f37880k0 = new wh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f37867a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(l8 l8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = l8Var.S;
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
                j8 j8Var = new j8();
                j8Var.f37302a = new MessageObject(l8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                j8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = l8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                l8Var.U = i12;
                j8Var.f37304c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((j8) sparseArray2.get(i13, null)).f37306g) {
                    sparseArray2.put(i13, j8Var);
                }
                int i14 = l8Var.W;
                if (i11 < i14 || i14 == 0) {
                    l8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            l8Var.f37871c0 = i15;
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
                    j8 j8Var2 = new j8();
                    j8Var2.f37306g = false;
                    j8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, j8Var2);
                }
                i15 += 86400;
            }
            l8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                l8Var.V = ((TLRPC.Message) i2.d.g(1, tL_messages_searchResultsCalendar.messages)).f19237id;
                l8Var.T = false;
                l8Var.p0();
            } else {
                l8Var.T = true;
            }
            if (l8Var.Y) {
                l8Var.F = true;
            }
            l8Var.f37868b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            l8Var.L.q(0, l8Var.K);
            int i18 = l8Var.K;
            if (timeInMillis > i18) {
                l8Var.L.s(i18 + 1, timeInMillis);
                l8Var.K = timeInMillis;
            }
            if (l8Var.T) {
                l8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.b5 V(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 W(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 X(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Y(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Z(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 a0(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static void b0(l8 l8Var) {
        if (l8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (l8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (l8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        l8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        l8Var.v.setBackground(new BitmapDrawable(createBitmap));
        l8Var.v.setAlpha(0.0f);
        l8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f37874f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f37866a = new y7(this, context);
        createActionBar(context);
        this.f37866a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        bi.o0 o0Var = new bi.o0(this, context, 6);
        this.f37868b = o0Var;
        s4.b0 b0Var = new s4.b0();
        this.f37870c = b0Var;
        o0Var.setLayoutManager(b0Var);
        this.f37870c.k1(true);
        bi.o0 o0Var2 = this.f37868b;
        a8 a8Var = new a8(this, 0);
        this.L = a8Var;
        o0Var2.setAdapter(a8Var);
        this.f37868b.j(new k3(this, 3));
        if (this.f37873e0 == 0 && this.f37872d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        y7 y7Var = this.f37866a;
        bi.o0 o0Var3 = this.f37868b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        y7Var.addView(o0Var3, w7.a6.a(-1.0f, 0.0f, 36.0f, 0.0f, f7, -1, 0));
        this.f37866a.addView(new bi.d4(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.a6.a(38.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 25));
        this.fragmentView = this.f37866a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int v = com.google.android.gms.internal.play_billing.k3.v(this.I, i11, 12, i10) - this.f37867a0;
            this.K = v + 1;
            this.f37870c.h1(v, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.H = f2Var;
        this.actionBar.setBackButtonDrawable(f2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f37874f.setColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            bi.i5 i5Var = new bi.i5(context, 8);
            this.f37869b0 = i5Var;
            i5Var.setWillNotDraw(false);
            this.f37869b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f37869b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final l8 f41766b;

                {
                    this.f41766b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l8 l8Var = this.f41766b;
                            l8Var.G = true;
                            l8Var.t0();
                            return;
                        default:
                            l8 l8Var2 = this.f41766b;
                            int i13 = l8Var2.f37881l0;
                            if (i13 == 0) {
                                if (l8Var2.O == null) {
                                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(l8Var2.f37866a.getContext(), 8);
                                    l8Var2.O = v40Var;
                                    v40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    l8Var2.f37866a.addView(l8Var2.O, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    l8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                l8Var2.O.f(l8Var2.f37869b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(l8Var2, i13, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f37886x)), null, false, new z7(l8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f37869b0.addView(this.h, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            this.f37882n = textView2;
            textView2.setGravity(17);
            this.f37882n.setTextSize(1, 15.0f);
            this.f37882n.setTypeface(AndroidUtilities.bold());
            this.f37882n.setOnClickListener(new View.OnClickListener(this) {
                public final l8 f41766b;

                {
                    this.f41766b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l8 l8Var = this.f41766b;
                            l8Var.G = true;
                            l8Var.t0();
                            return;
                        default:
                            l8 l8Var2 = this.f41766b;
                            int i13 = l8Var2.f37881l0;
                            if (i13 == 0) {
                                if (l8Var2.O == null) {
                                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(l8Var2.f37866a.getContext(), 8);
                                    l8Var2.O = v40Var;
                                    v40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    l8Var2.f37866a.addView(l8Var2.O, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    l8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                l8Var2.O.f(l8Var2.f37869b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(l8Var2, i13, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f37886x)), null, false, new z7(l8Var2), null);
                            return;
                    }
                }
            });
            this.f37882n.setAllCaps(true);
            this.f37882n.setVisibility(8);
            this.f37869b0.addView(this.f37882n, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            this.f37866a.addView(this.f37869b0, w7.a6.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.g6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f37882n;
            int i14 = org.telegram.ui.ActionBar.g6.f20139q7;
            textView4.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
            this.f37882n.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f37875f0 == ((bi.o8) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f19836a;
        int i11 = org.telegram.ui.ActionBar.g6.f19836a;
        int i12 = org.telegram.ui.ActionBar.g6.f19836a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
        duration.addUpdateListener(new e3(this, 3));
        duration.addListener(new u0(this, 5));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f37868b.getChildCount(); i10++) {
            s0((i8) this.f37868b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37868b.getCachedChildCount(); i11++) {
            i8 i8Var = (i8) this.f37868b.P(i11);
            s0(i8Var, false);
            i8.a(i8Var, this.P, this.Q);
            i8.b(i8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37868b.getHiddenChildCount(); i12++) {
            i8 i8Var2 = (i8) this.f37868b.V(i12);
            s0(i8Var2, false);
            i8.a(i8Var2, this.P, this.Q);
            i8.b(i8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37868b.getAttachedScrapChildCount(); i13++) {
            i8 i8Var3 = (i8) this.f37868b.O(i13);
            s0(i8Var3, false);
            i8.a(i8Var3, this.P, this.Q);
            i8.b(i8Var3, 1.0f);
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
        this.f37886x = getArguments().getLong("dialog_id");
        this.f37887y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37873e0 = i10;
        if (i10 == 2) {
            this.f37875f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37886x, 0, -1, true);
        } else if (i10 == 3) {
            this.f37875f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37886x, 1, -1, true);
        }
        bi.o8 o8Var = this.f37875f0;
        if (o8Var != null) {
            this.f37876g0 = new g(this, 8);
        }
        if (this.f37886x >= 0) {
            this.f37872d0 = true;
        } else {
            this.f37872d0 = false;
        }
        if (o8Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37875f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        di.ab abVar;
        if (z10 && (abVar = this.v) != null && abVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        di.ab abVar = this.v;
        if (abVar != null && abVar.getVisibility() == 0) {
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
            for (int i11 = 0; i11 < this.f37868b.getChildCount(); i11++) {
                View childAt = this.f37868b.getChildAt(i11);
                if (childAt instanceof i8) {
                    i8 i8Var = (i8) childAt;
                    int i12 = (i8Var.f37057b * 100) + i8Var.f37058c;
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
            if (this.f37875f0 != null) {
                r0();
                this.f37875f0.p(100, false);
                this.E = this.f37875f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f37886x);
            if (this.f37887y != 0 && this.f37886x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f37887y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f37868b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bi.m1(22, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f37875f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f37871c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37875f0.f3429i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f37875f0.f3429i.get(i10);
            this.f37871c0 = Math.min(this.f37871c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            j8 j8Var = (j8) sparseArray2.get(i12);
            if (j8Var == null) {
                j8Var = new j8();
                j8Var.f37303b = new ArrayList();
            }
            j8Var.f37303b.add(Integer.valueOf(messageObject.getId()));
            j8Var.f37302a = messageObject;
            j8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, j8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f37871c0; i14 < currentTimeMillis; i14 += 86400) {
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
                j8 j8Var2 = new j8();
                j8Var2.f37306g = false;
                j8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, j8Var2);
            }
        }
        this.T = this.f37875f0.f3438r;
        if (this.Y) {
            this.F = true;
        }
        this.f37868b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f37871c0) / 2629800)) + 1;
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

    public final void s0(i8 i8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (i8Var.f37060n != null) {
                if (!z10) {
                    SparseArray sparseArray = i8Var.f37063w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        i8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = i8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < i8Var.d; i17++) {
                    j8 j8Var = (j8) i8Var.f37060n.get(i17, null);
                    if (j8Var != null && (i11 = j8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            i8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            i8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    i8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    i8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = i8Var.f37063w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            i8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.v40 v40Var;
        if (!this.f37872d0) {
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
        int i12 = this.f37881l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37881l0 = abs;
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
            this.f37882n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f37882n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (v40Var = this.O) != null) {
            v40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37882n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37882n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new vo(this.f37882n)).start();
            this.h.setEnabled(true);
            this.f37882n.setEnabled(false);
            return;
        }
        if (this.f37882n.getVisibility() == 8) {
            this.f37882n.setAlpha(0.0f);
            this.f37882n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f37882n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37882n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new vo(this.h)).start();
        ViewPropertyAnimator animate = this.f37882n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37882n.setEnabled(true);
    }
}
