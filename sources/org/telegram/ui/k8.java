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
public final class k8 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.g2 H;
    public int I;
    public int J;
    public int K;
    public z7 L;
    public le.b M;
    public qn N;
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
    public x7 f38433a;
    public final int f38434a0;
    public ai.u1 f38435b;
    public ci.i4 f38436b0;
    public s4.b0 f38437c;
    public int f38438c0;
    public final TextPaint d;
    public boolean f38439d0;
    public final TextPaint e;
    public int f38440e0;
    public final TextPaint f38441f;
    public ci.a7 f38442f0;
    public g f38443g0;
    public TextView h;
    public int f38444h0;
    public b1 f38445i0;
    public final Path f38446j0;
    public final wh.g f38447k0;
    public int f38448l0;
    public boolean m0;
    public TextView f38449n;
    public final Paint f38450r;
    public final Paint f38451s;
    public ai.ic v;
    public final Paint f38452w;
    public long f38453x;
    public long f38454y;

    public k8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f38441f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f38450r = paint;
        this.f38451s = new Paint(1);
        this.f38452w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f38446j0 = new Path();
        this.f38447k0 = new wh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f38434a0 = calendar.get(2);
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
                i8Var.f37867a = new MessageObject(k8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = k8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                k8Var.U = i12;
                i8Var.f37869c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((i8) sparseArray2.get(i13, null)).f37871g) {
                    sparseArray2.put(i13, i8Var);
                }
                int i14 = k8Var.W;
                if (i11 < i14 || i14 == 0) {
                    k8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            k8Var.f38438c0 = i15;
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
                    i8Var2.f37871g = false;
                    i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, i8Var2);
                }
                i15 += 86400;
            }
            k8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                k8Var.V = ((TLRPC.Message) i2.e.h(1, tL_messages_searchResultsCalendar.messages)).f20294id;
                k8Var.T = false;
                k8Var.p0();
            } else {
                k8Var.T = true;
            }
            if (k8Var.Y) {
                k8Var.F = true;
            }
            k8Var.f38435b.invalidate();
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

    public static org.telegram.ui.ActionBar.d5 V(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 W(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 X(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Y(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Z(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 a0(k8 k8Var) {
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
        TextPaint textPaint2 = this.f38441f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f38433a = new x7(this, context);
        createActionBar(context);
        this.f38433a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.u1 u1Var = new ai.u1(this, context, 7);
        this.f38435b = u1Var;
        s4.b0 b0Var = new s4.b0();
        this.f38437c = b0Var;
        u1Var.setLayoutManager(b0Var);
        this.f38437c.k1(true);
        ai.u1 u1Var2 = this.f38435b;
        z7 z7Var = new z7(this, 0);
        this.L = z7Var;
        u1Var2.setAdapter(z7Var);
        this.f38435b.j(new k3(this, 3));
        if (this.f38440e0 == 0 && this.f38439d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var = this.f38433a;
        ai.u1 u1Var3 = this.f38435b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        x7Var.addView(u1Var3, w7.z5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        this.f38433a.addView(new ci.i3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.z5.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 26));
        this.fragmentView = this.f38433a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int v = com.google.android.gms.internal.play_billing.k3.v(this.I, i11, 12, i10) - this.f38434a0;
            this.K = v + 1;
            this.f38437c.h1(v, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.H = g2Var;
        this.actionBar.setBackButtonDrawable(g2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f38441f.setColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21076i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ci.i4 i4Var = new ci.i4(context, 8);
            this.f38436b0 = i4Var;
            i4Var.setWillNotDraw(false);
            this.f38436b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f38436b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f42478b;

                {
                    this.f42478b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f42478b;
                            k8Var.G = true;
                            k8Var.t0();
                            return;
                        default:
                            k8 k8Var2 = this.f42478b;
                            int i13 = k8Var2.f38448l0;
                            if (i13 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(k8Var2.f38433a.getContext(), 8);
                                    k8Var2.O = r40Var;
                                    r40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f38433a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f38436b0, true);
                                return;
                            }
                            org.telegram.ui.Components.f5.q(k8Var2, i13, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38453x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f38436b0.addView(this.h, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f38449n = textView2;
            textView2.setGravity(17);
            this.f38449n.setTextSize(1, 15.0f);
            this.f38449n.setTypeface(AndroidUtilities.bold());
            this.f38449n.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f42478b;

                {
                    this.f42478b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f42478b;
                            k8Var.G = true;
                            k8Var.t0();
                            return;
                        default:
                            k8 k8Var2 = this.f42478b;
                            int i13 = k8Var2.f38448l0;
                            if (i13 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(k8Var2.f38433a.getContext(), 8);
                                    k8Var2.O = r40Var;
                                    r40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f38433a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f38436b0, true);
                                return;
                            }
                            org.telegram.ui.Components.f5.q(k8Var2, i13, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38453x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.f38449n.setAllCaps(true);
            this.f38449n.setVisibility(8);
            this.f38436b0.addView(this.f38449n, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38433a.addView(this.f38436b0, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.h6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f38449n;
            int i14 = org.telegram.ui.ActionBar.h6.f21225q7;
            textView4.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            this.f38449n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f38442f0 == ((ci.a7) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.f20922a;
        int i11 = org.telegram.ui.ActionBar.h6.f20922a;
        int i12 = org.telegram.ui.ActionBar.h6.f20922a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.bs.f25012f);
        duration.addUpdateListener(new e3(this, 3));
        duration.addListener(new m.a(this, 7));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f38435b.getChildCount(); i10++) {
            s0((h8) this.f38435b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f38435b.getCachedChildCount(); i11++) {
            h8 h8Var = (h8) this.f38435b.P(i11);
            s0(h8Var, false);
            h8.a(h8Var, this.P, this.Q);
            h8.b(h8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f38435b.getHiddenChildCount(); i12++) {
            h8 h8Var2 = (h8) this.f38435b.V(i12);
            s0(h8Var2, false);
            h8.a(h8Var2, this.P, this.Q);
            h8.b(h8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f38435b.getAttachedScrapChildCount(); i13++) {
            h8 h8Var3 = (h8) this.f38435b.O(i13);
            s0(h8Var3, false);
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
                t0();
                o0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38453x = getArguments().getLong("dialog_id");
        this.f38454y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f38440e0 = i10;
        if (i10 == 2) {
            this.f38442f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38453x, 0, -1, true);
        } else if (i10 == 3) {
            this.f38442f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38453x, 1, -1, true);
        }
        ci.a7 a7Var = this.f38442f0;
        if (a7Var != null) {
            this.f38443g0 = new g(this, 8);
        }
        if (this.f38453x >= 0) {
            this.f38439d0 = true;
        } else {
            this.f38439d0 = false;
        }
        if (a7Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38442f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.ic icVar;
        if (z10 && (icVar = this.v) != null && icVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        ai.ic icVar = this.v;
        if (icVar != null && icVar.getVisibility() == 0) {
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
            for (int i11 = 0; i11 < this.f38435b.getChildCount(); i11++) {
                View childAt = this.f38435b.getChildAt(i11);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    int i12 = (h8Var.f37524b * 100) + h8Var.f37525c;
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
            if (this.f38442f0 != null) {
                r0();
                this.f38442f0.p(100, false);
                this.E = this.f38442f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f38453x);
            if (this.f38454y != 0 && this.f38453x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f38454y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f38435b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.g(29, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f38442f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f38438c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f38442f0.f5149i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f38442f0.f5149i.get(i10);
            this.f38438c0 = Math.min(this.f38438c0, messageObject.messageOwner.date);
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
                i8Var.f37868b = new ArrayList();
            }
            i8Var.f37868b.add(Integer.valueOf(messageObject.getId()));
            i8Var.f37867a = messageObject;
            i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, i8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f38438c0; i14 < currentTimeMillis; i14 += 86400) {
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
                i8Var2.f37871g = false;
                i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, i8Var2);
            }
        }
        this.T = this.f38442f0.f5158r;
        if (this.Y) {
            this.F = true;
        }
        this.f38435b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f38438c0) / 2629800)) + 1;
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

    public final void s0(h8 h8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (h8Var.f37527n != null) {
                if (!z10) {
                    SparseArray sparseArray = h8Var.f37530w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        h8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = h8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < h8Var.d; i17++) {
                    i8 i8Var = (i8) h8Var.f37527n.get(i17, null);
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
        SparseArray sparseArray2 = h8Var.f37530w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            h8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.r40 r40Var;
        if (!this.f38439d0) {
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
        int i12 = this.f38448l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38448l0 = abs;
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
            this.f38449n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f38449n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
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
            this.f38449n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f38449n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new fo(this.f38449n)).start();
            this.h.setEnabled(true);
            this.f38449n.setEnabled(false);
            return;
        }
        if (this.f38449n.getVisibility() == 8) {
            this.f38449n.setAlpha(0.0f);
            this.f38449n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f38449n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f38449n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new fo(this.h)).start();
        ViewPropertyAnimator animate = this.f38449n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f38449n.setEnabled(true);
    }
}
