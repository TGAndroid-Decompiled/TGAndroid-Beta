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
public final class j8 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.h2 H;
    public int I;
    public int J;
    public int K;
    public y7 L;
    public k2.c0 M;
    public bo N;
    public org.telegram.ui.Components.i40 O;
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
    public w7 f34796a;
    public final int f34797a0;
    public ai.w0 f34798b;
    public ai.x5 f34799b0;
    public s4.c0 f34800c;
    public int f34801c0;
    public final TextPaint d;
    public boolean f34802d0;
    public final TextPaint e;
    public int f34803e0;
    public final TextPaint f34804f;
    public ai.d9 f34805f0;
    public g f34806g0;
    public TextView h;
    public int f34807h0;
    public y0 f34808i0;
    public final Path f34809j0;
    public final vh.h f34810k0;
    public int f34811l0;
    public boolean m0;
    public TextView f34812n;
    public final Paint f34813r;
    public final Paint f34814s;
    public ci.eb v;
    public final Paint f34815w;
    public long f34816x;
    public long f34817y;

    public j8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f34804f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f34813r = paint;
        this.f34814s = new Paint(1);
        this.f34815w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f34809j0 = new Path();
        this.f34810k0 = new vh.h();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f34797a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(j8 j8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = j8Var.S;
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
                h8 h8Var = new h8();
                h8Var.f34200a = new MessageObject(j8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = j8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                j8Var.U = i12;
                h8Var.f34202c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((h8) sparseArray2.get(i13, null)).f34204g) {
                    sparseArray2.put(i13, h8Var);
                }
                int i14 = j8Var.W;
                if (i11 < i14 || i14 == 0) {
                    j8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            j8Var.f34801c0 = i15;
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
                    h8 h8Var2 = new h8();
                    h8Var2.f34204g = false;
                    h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, h8Var2);
                }
                i15 += 86400;
            }
            j8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                j8Var.V = ((TLRPC.Message) hg.k0.h(1, tL_messages_searchResultsCalendar.messages)).f18142id;
                j8Var.T = false;
                j8Var.p0();
            } else {
                j8Var.T = true;
            }
            if (j8Var.Y) {
                j8Var.F = true;
            }
            j8Var.f34798b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            j8Var.L.q(0, j8Var.K);
            int i18 = j8Var.K;
            if (timeInMillis > i18) {
                j8Var.L.s(i18 + 1, timeInMillis);
                j8Var.K = timeInMillis;
            }
            if (j8Var.T) {
                j8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.e5 V(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 W(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 X(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Y(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Z(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 a0(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static void b0(j8 j8Var) {
        if (j8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (j8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (j8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        j8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        j8Var.v.setBackground(new BitmapDrawable(createBitmap));
        j8Var.v.setAlpha(0.0f);
        j8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f34804f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f34796a = new w7(this, context);
        createActionBar(context);
        this.f34796a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.w0 w0Var = new ai.w0(this, context, 6);
        this.f34798b = w0Var;
        s4.c0 c0Var = new s4.c0();
        this.f34800c = c0Var;
        w0Var.setLayoutManager(c0Var);
        this.f34800c.k1(true);
        ai.w0 w0Var2 = this.f34798b;
        y7 y7Var = new y7(this, 0);
        this.L = y7Var;
        w0Var2.setAdapter(y7Var);
        this.f34798b.j(new h3(this, 3));
        if (this.f34803e0 == 0 && this.f34802d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7 w7Var = this.f34796a;
        ai.w0 w0Var3 = this.f34798b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        w7Var.addView(w0Var3, w7.x5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        this.f34796a.addView(new ai.n4(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.x5.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 23));
        this.fragmentView = this.f34796a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int g10 = hg.k0.g(this.I, i11, 12, i10) - this.f34797a0;
            this.K = g10 + 1;
            this.f34800c.h1(g10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.H = h2Var;
        this.actionBar.setBackButtonDrawable(h2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34804f.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18953i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ai.x5 x5Var = new ai.x5(context, 8);
            this.f34799b0 = x5Var;
            x5Var.setWillNotDraw(false);
            this.f34799b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f34799b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f38314b;

                {
                    this.f38314b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f38314b;
                            j8Var.G = true;
                            j8Var.t0();
                            return;
                        default:
                            j8 j8Var2 = this.f38314b;
                            int i13 = j8Var2.f34811l0;
                            if (i13 == 0) {
                                if (j8Var2.O == null) {
                                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(j8Var2.f34796a.getContext(), 8);
                                    j8Var2.O = i40Var;
                                    i40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.f34796a.addView(j8Var2.O, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.O.f(j8Var2.f34799b0, true);
                                return;
                            }
                            org.telegram.ui.Components.c5.r(j8Var2, i13, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f34816x)), null, false, new x7(j8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f34799b0.addView(this.h, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f34812n = textView2;
            textView2.setGravity(17);
            this.f34812n.setTextSize(1, 15.0f);
            this.f34812n.setTypeface(AndroidUtilities.bold());
            this.f34812n.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f38314b;

                {
                    this.f38314b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f38314b;
                            j8Var.G = true;
                            j8Var.t0();
                            return;
                        default:
                            j8 j8Var2 = this.f38314b;
                            int i13 = j8Var2.f34811l0;
                            if (i13 == 0) {
                                if (j8Var2.O == null) {
                                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(j8Var2.f34796a.getContext(), 8);
                                    j8Var2.O = i40Var;
                                    i40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.f34796a.addView(j8Var2.O, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.O.f(j8Var2.f34799b0, true);
                                return;
                            }
                            org.telegram.ui.Components.c5.r(j8Var2, i13, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f34816x)), null, false, new x7(j8Var2), null);
                            return;
                    }
                }
            });
            this.f34812n.setAllCaps(true);
            this.f34812n.setVisibility(8);
            this.f34799b0.addView(this.f34812n, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f34796a.addView(this.f34799b0, w7.x5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.j6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f34812n;
            int i14 = org.telegram.ui.ActionBar.j6.f19101q7;
            textView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.f34812n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f34805f0 == ((ai.d9) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f18800a;
        int i11 = org.telegram.ui.ActionBar.j6.f18800a;
        int i12 = org.telegram.ui.ActionBar.j6.f18800a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.qr.f27383f);
        duration.addUpdateListener(new b3(this, 2));
        duration.addListener(new t4(this, 2));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f34798b.getChildCount(); i10++) {
            s0((g8) this.f34798b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f34798b.getCachedChildCount(); i11++) {
            g8 g8Var = (g8) this.f34798b.Q(i11);
            s0(g8Var, false);
            g8.a(g8Var, this.P, this.Q);
            g8.b(g8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f34798b.getHiddenChildCount(); i12++) {
            g8 g8Var2 = (g8) this.f34798b.W(i12);
            s0(g8Var2, false);
            g8.a(g8Var2, this.P, this.Q);
            g8.b(g8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f34798b.getAttachedScrapChildCount(); i13++) {
            g8 g8Var3 = (g8) this.f34798b.P(i13);
            s0(g8Var3, false);
            g8.a(g8Var3, this.P, this.Q);
            g8.b(g8Var3, 1.0f);
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
        this.f34816x = getArguments().getLong("dialog_id");
        this.f34817y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f34803e0 = i10;
        if (i10 == 2) {
            this.f34805f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f34816x, 0, -1, true);
        } else if (i10 == 3) {
            this.f34805f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f34816x, 1, -1, true);
        }
        ai.d9 d9Var = this.f34805f0;
        if (d9Var != null) {
            this.f34806g0 = new g(this, 8);
        }
        if (this.f34816x >= 0) {
            this.f34802d0 = true;
        } else {
            this.f34802d0 = false;
        }
        if (d9Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f34805f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.eb ebVar;
        if (z10 && (ebVar = this.v) != null && ebVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        ci.eb ebVar = this.v;
        if (ebVar != null && ebVar.getVisibility() == 0) {
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
            for (int i11 = 0; i11 < this.f34798b.getChildCount(); i11++) {
                View childAt = this.f34798b.getChildAt(i11);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    int i12 = (g8Var.f33902b * 100) + g8Var.f33903c;
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
            if (this.f34805f0 != null) {
                r0();
                this.f34805f0.p(100, false);
                this.E = this.f34805f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f34816x);
            if (this.f34817y != 0 && this.f34816x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f34817y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f34798b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.v1(22, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f34805f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f34801c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f34805f0.f721i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f34805f0.f721i.get(i10);
            this.f34801c0 = Math.min(this.f34801c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            h8 h8Var = (h8) sparseArray2.get(i12);
            if (h8Var == null) {
                h8Var = new h8();
                h8Var.f34201b = new ArrayList();
            }
            h8Var.f34201b.add(Integer.valueOf(messageObject.getId()));
            h8Var.f34200a = messageObject;
            h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, h8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f34801c0; i14 < currentTimeMillis; i14 += 86400) {
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
                h8 h8Var2 = new h8();
                h8Var2.f34204g = false;
                h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, h8Var2);
            }
        }
        this.T = this.f34805f0.f730r;
        if (this.Y) {
            this.F = true;
        }
        this.f34798b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f34801c0) / 2629800)) + 1;
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

    public final void s0(g8 g8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (g8Var.f33905n != null) {
                boolean z11 = false;
                if (!z10) {
                    SparseArray sparseArray = g8Var.f33908w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        g8Var.c(sparseArray.keyAt(i12), 0, 0, false, z11);
                        i12++;
                        z11 = false;
                    }
                }
                int i13 = g8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < g8Var.d; i17++) {
                    h8 h8Var = (h8) g8Var.f33905n.get(i17, null);
                    if (h8Var != null && (i11 = h8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            g8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            g8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    g8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    g8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = g8Var.f33908w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            g8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.i40 i40Var;
        if (!this.f34802d0) {
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
        int i12 = this.f34811l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34811l0 = abs;
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
            this.f34812n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f34812n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (i40Var = this.O) != null) {
            i40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f34812n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f34812n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.aa(this.f34812n)).start();
            this.h.setEnabled(true);
            this.f34812n.setEnabled(false);
            return;
        }
        if (this.f34812n.getVisibility() == 8) {
            this.f34812n.setAlpha(0.0f);
            this.f34812n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f34812n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f34812n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.aa(this.h)).start();
        ViewPropertyAnimator animate = this.f34812n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f34812n.setEnabled(true);
    }
}
