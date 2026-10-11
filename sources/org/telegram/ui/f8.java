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
public final class f8 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.f2 H;
    public int I;
    public int J;
    public int K;
    public u7 L;
    public m.f3 M;
    public zn N;
    public org.telegram.ui.Components.a50 O;
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
    public s7 f37609a;
    public final int f37610a0;
    public ai.w0 f37611b;
    public ai.x5 f37612b0;
    public s4.d0 f37613c;
    public int f37614c0;
    public final TextPaint d;
    public boolean f37615d0;
    public final TextPaint f37616e;
    public int f37617e0;
    public final TextPaint f37618f;
    public ai.e9 f37619f0;
    public g f37620g0;
    public TextView h;
    public int f37621h0;
    public y0 f37622i0;
    public final Path f37623j0;
    public final vh.g f37624k0;
    public int f37625l0;
    public boolean m0;
    public TextView f37626n;
    public final Paint f37627r;
    public final Paint f37628s;
    public ci.bb v;
    public final Paint f37629w;
    public long f37630x;
    public long f37631y;

    public f8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f37616e = new TextPaint(1);
        this.f37618f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37627r = paint;
        this.f37628s = new Paint(1);
        this.f37629w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f37623j0 = new Path();
        this.f37624k0 = new vh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f37610a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(f8 f8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = f8Var.S;
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
                d8Var.f36969a = new MessageObject(f8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = f8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                f8Var.U = i12;
                d8Var.f36971c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((d8) sparseArray2.get(i13, null)).f36974g) {
                    sparseArray2.put(i13, d8Var);
                }
                int i14 = f8Var.W;
                if (i11 < i14 || i14 == 0) {
                    f8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            f8Var.f37614c0 = i15;
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
                    d8Var2.f36974g = false;
                    d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, d8Var2);
                }
                i15 += 86400;
            }
            f8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                f8Var.V = ((TLRPC.Message) hg.c.g(1, tL_messages_searchResultsCalendar.messages)).f20089id;
                f8Var.T = false;
                f8Var.p0();
            } else {
                f8Var.T = true;
            }
            if (f8Var.Y) {
                f8Var.F = true;
            }
            f8Var.f37611b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            f8Var.L.q(0, f8Var.K);
            int i18 = f8Var.K;
            if (timeInMillis > i18) {
                f8Var.L.s(i18 + 1, timeInMillis);
                f8Var.K = timeInMillis;
            }
            if (f8Var.T) {
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
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f37618f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f37616e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f37609a = new s7(this, context);
        createActionBar(context);
        this.f37609a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.w0 w0Var = new ai.w0(this, context, 6);
        this.f37611b = w0Var;
        s4.d0 d0Var = new s4.d0();
        this.f37613c = d0Var;
        w0Var.setLayoutManager(d0Var);
        this.f37613c.k1(true);
        ai.w0 w0Var2 = this.f37611b;
        u7 u7Var = new u7(this, 0);
        this.L = u7Var;
        w0Var2.setAdapter(u7Var);
        this.f37611b.j(new h3(this, 3));
        if (this.f37617e0 == 0 && this.f37615d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7 s7Var = this.f37609a;
        ai.w0 w0Var3 = this.f37611b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        s7Var.addView(w0Var3, w7.x5.a(-1.0f, 0.0f, 36.0f, 0.0f, f7, -1, 0));
        this.f37609a.addView(new ai.o4(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.x5.a(38.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 23));
        this.fragmentView = this.f37609a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int f10 = hg.c.f(this.I, i11, 12, i10) - this.f37610a0;
            this.K = f10 + 1;
            this.f37613c.h1(f10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.H = f2Var;
        this.actionBar.setBackButtonDrawable(f2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
        this.f37616e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f37618f.setColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ai.x5 x5Var = new ai.x5(context, 8);
            this.f37612b0 = x5Var;
            x5Var.setWillNotDraw(false);
            this.f37612b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f37612b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f41375b;

                {
                    this.f41375b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f41375b;
                            f8Var.G = true;
                            f8Var.t0();
                            return;
                        default:
                            f8 f8Var2 = this.f41375b;
                            int i13 = f8Var2.f37625l0;
                            if (i13 == 0) {
                                if (f8Var2.O == null) {
                                    org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(f8Var2.f37609a.getContext(), 8);
                                    f8Var2.O = a50Var;
                                    a50Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.f37609a.addView(f8Var2.O, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    f8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.O.f(f8Var2.f37612b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(f8Var2, i13, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f37630x)), null, false, new t7(f8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f37612b0.addView(this.h, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            this.f37626n = textView2;
            textView2.setGravity(17);
            this.f37626n.setTextSize(1, 15.0f);
            this.f37626n.setTypeface(AndroidUtilities.bold());
            this.f37626n.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f41375b;

                {
                    this.f41375b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f41375b;
                            f8Var.G = true;
                            f8Var.t0();
                            return;
                        default:
                            f8 f8Var2 = this.f41375b;
                            int i13 = f8Var2.f37625l0;
                            if (i13 == 0) {
                                if (f8Var2.O == null) {
                                    org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(f8Var2.f37609a.getContext(), 8);
                                    f8Var2.O = a50Var;
                                    a50Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    f8Var2.f37609a.addView(f8Var2.O, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                                    f8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                f8Var2.O.f(f8Var2.f37612b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(f8Var2, i13, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f37630x)), null, false, new t7(f8Var2), null);
                            return;
                    }
                }
            });
            this.f37626n.setAllCaps(true);
            this.f37626n.setVisibility(8);
            this.f37612b0.addView(this.f37626n, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            this.f37609a.addView(this.f37612b0, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.h6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f37626n;
            int i14 = org.telegram.ui.ActionBar.h6.f21062q7;
            textView4.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            this.f37626n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f37619f0 == ((ai.e9) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.f20759a;
        int i11 = org.telegram.ui.ActionBar.h6.f20759a;
        int i12 = org.telegram.ui.ActionBar.h6.f20759a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.is.f27500f);
        duration.addUpdateListener(new b3(this, 3));
        duration.addListener(new s4(this, 2));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f37611b.getChildCount(); i10++) {
            s0((c8) this.f37611b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37611b.getCachedChildCount(); i11++) {
            c8 c8Var = (c8) this.f37611b.P(i11);
            s0(c8Var, false);
            c8.a(c8Var, this.P, this.Q);
            c8.b(c8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37611b.getHiddenChildCount(); i12++) {
            c8 c8Var2 = (c8) this.f37611b.V(i12);
            s0(c8Var2, false);
            c8.a(c8Var2, this.P, this.Q);
            c8.b(c8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37611b.getAttachedScrapChildCount(); i13++) {
            c8 c8Var3 = (c8) this.f37611b.O(i13);
            s0(c8Var3, false);
            c8.a(c8Var3, this.P, this.Q);
            c8.b(c8Var3, 1.0f);
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
        this.f37630x = getArguments().getLong("dialog_id");
        this.f37631y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37617e0 = i10;
        if (i10 == 2) {
            this.f37619f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37630x, 0, -1, true);
        } else if (i10 == 3) {
            this.f37619f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37630x, 1, -1, true);
        }
        ai.e9 e9Var = this.f37619f0;
        if (e9Var != null) {
            this.f37620g0 = new g(this, 8);
        }
        if (this.f37630x >= 0) {
            this.f37615d0 = true;
        } else {
            this.f37615d0 = false;
        }
        if (e9Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37619f0 != null) {
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
            for (int i11 = 0; i11 < this.f37611b.getChildCount(); i11++) {
                View childAt = this.f37611b.getChildAt(i11);
                if (childAt instanceof c8) {
                    c8 c8Var = (c8) childAt;
                    int i12 = (c8Var.f36652b * 100) + c8Var.f36653c;
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
            if (this.f37619f0 != null) {
                r0();
                this.f37619f0.p(100, false);
                this.E = this.f37619f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f37630x);
            if (this.f37631y != 0 && this.f37630x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f37631y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f37611b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.v1(22, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f37619f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f37614c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37619f0.f899i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f37619f0.f899i.get(i10);
            this.f37614c0 = Math.min(this.f37614c0, messageObject.messageOwner.date);
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
                d8Var.f36970b = new ArrayList();
            }
            d8Var.f36970b.add(Integer.valueOf(messageObject.getId()));
            d8Var.f36969a = messageObject;
            d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, d8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f37614c0; i14 < currentTimeMillis; i14 += 86400) {
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
                d8Var2.f36974g = false;
                d8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, d8Var2);
            }
        }
        this.T = this.f37619f0.f908r;
        if (this.Y) {
            this.F = true;
        }
        this.f37611b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f37614c0) / 2629800)) + 1;
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

    public final void s0(c8 c8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (c8Var.f36656n != null) {
                if (!z10) {
                    SparseArray sparseArray = c8Var.f36659w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        c8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = c8Var.f36654e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < c8Var.d; i17++) {
                    d8 d8Var = (d8) c8Var.f36656n.get(i17, null);
                    if (d8Var != null && (i11 = d8Var.h) >= this.P && i11 <= this.Q) {
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
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
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
        SparseArray sparseArray2 = c8Var.f36659w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            c8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.a50 a50Var;
        if (!this.f37615d0) {
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
        int i12 = this.f37625l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37625l0 = abs;
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
            this.f37626n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f37626n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (a50Var = this.O) != null) {
            a50Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37626n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37626n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.ea(this.f37626n)).start();
            this.h.setEnabled(true);
            this.f37626n.setEnabled(false);
            return;
        }
        if (this.f37626n.getVisibility() == 8) {
            this.f37626n.setAlpha(0.0f);
            this.f37626n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f37626n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37626n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.ea(this.h)).start();
        ViewPropertyAnimator animate = this.f37626n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37626n.setEnabled(true);
    }
}
