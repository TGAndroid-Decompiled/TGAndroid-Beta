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
public final class j8 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public boolean C;
    public boolean D;
    public org.telegram.ui.ActionBar.i2 E;
    public int F;
    public int G;
    public int H;
    public y7 I;
    public org.telegram.ui.Cells.f1 J;
    public xn K;
    public org.telegram.ui.Components.m40 L;
    public int M;
    public int N;
    public ValueAnimator O;
    public final SparseArray P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public boolean V;
    public final int W;
    public final int X;
    public eh.d Y;
    public int Z;
    public w7 f37857a;
    public boolean f37858a0;
    public mh.d1 f37859b;
    public int f37860b0;
    public f2.j0 f37861c;
    public oh.l6 f37862c0;
    public final TextPaint d;
    public h f37863d0;
    public final TextPaint f37864e;
    public int f37865e0;
    public final TextPaint f37866f;
    public a1 f37867f0;
    public final Path f37868g0;
    public TextView h;
    public final jh.k f37869h0;
    public int f37870i0;
    public boolean f37871j0;
    public TextView f37872n;
    public final Paint f37873r;
    public final Paint f37874s;
    public fg.h0 v;
    public final Paint f37875w;
    public long f37876x;
    public long f37877y;

    public j8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f37864e = new TextPaint(1);
        this.f37866f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37873r = paint;
        this.f37874s = new Paint(1);
        this.f37875w = new Paint(1);
        this.P = new SparseArray();
        this.R = 0;
        this.f37868g0 = new Path();
        this.f37869h0 = new jh.k();
        this.U = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.W = calendar.get(1);
            this.X = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(j8 j8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = j8Var.P;
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
                h8Var.f37249a = new MessageObject(j8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = j8Var.R + tL_messages_searchResultsCalendar.periods.get(i10).count;
                j8Var.R = i12;
                h8Var.f37251c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((h8) sparseArray2.get(i13, null)).f37254g) {
                    sparseArray2.put(i13, h8Var);
                }
                int i14 = j8Var.T;
                if (i11 < i14 || i14 == 0) {
                    j8Var.T = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            j8Var.Z = i15;
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
                    h8Var2.f37254g = false;
                    h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, h8Var2);
                }
                i15 += 86400;
            }
            j8Var.B = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                j8Var.S = ((TLRPC.Message) l.d.i(1, tL_messages_searchResultsCalendar.messages)).f20866id;
                j8Var.Q = false;
                j8Var.p0();
            } else {
                j8Var.Q = true;
            }
            if (j8Var.V) {
                j8Var.C = true;
            }
            j8Var.f37859b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            j8Var.I.q(0, j8Var.H);
            int i18 = j8Var.H;
            if (timeInMillis > i18) {
                j8Var.I.s(i18 + 1, timeInMillis);
                j8Var.H = timeInMillis;
            }
            if (j8Var.Q) {
                j8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.f5 V(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 W(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 X(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Y(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Z(j8 j8Var) {
        return j8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 a0(j8 j8Var) {
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
        boolean z4;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f37866f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f37864e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f37857a = new w7(this, context);
        createActionBar(context);
        this.f37857a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        mh.d1 d1Var = new mh.d1(this, context, 4);
        this.f37859b = d1Var;
        f2.j0 j0Var = new f2.j0();
        this.f37861c = j0Var;
        d1Var.setLayoutManager(j0Var);
        this.f37861c.k1(true);
        mh.d1 d1Var2 = this.f37859b;
        y7 y7Var = new y7(this, 0);
        this.I = y7Var;
        d1Var2.setAdapter(y7Var);
        this.f37859b.j(new l3(this, 3));
        if (this.f37860b0 == 0 && this.f37858a0) {
            z4 = true;
        } else {
            z4 = false;
        }
        w7 w7Var = this.f37857a;
        mh.d1 d1Var3 = this.f37859b;
        if (z4) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        w7Var.addView(d1Var3, k7.c6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        this.f37857a.addView(new oh.b3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), k7.c6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 10));
        this.fragmentView = this.f37857a;
        Calendar calendar = Calendar.getInstance();
        this.F = calendar.get(1);
        int i10 = calendar.get(2);
        this.G = i10;
        int i11 = this.W;
        if (i11 != 0) {
            int e6 = e2.c.e(this.F, i11, 12, i10) - this.X;
            this.H = e6 + 1;
            this.f37861c.h1(e6, AndroidUtilities.dp(120.0f));
        }
        if (this.H < 3) {
            this.H = 3;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.E = i2Var;
        this.actionBar.setBackButtonDrawable(i2Var);
        this.E.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        this.f37864e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f37866f.setColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.E.a(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), false);
        textPaint3.setColor(-1);
        if (z4) {
            eh.d dVar = new eh.d(context, 8);
            this.Y = dVar;
            dVar.setWillNotDraw(false);
            this.Y.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.Y.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f42017b;

                {
                    this.f42017b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f42017b;
                            j8Var.D = true;
                            j8Var.t0();
                            return;
                        default:
                            j8 j8Var2 = this.f42017b;
                            int i13 = j8Var2.f37870i0;
                            if (i13 == 0) {
                                if (j8Var2.L == null) {
                                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(j8Var2.f37857a.getContext(), 8);
                                    j8Var2.L = m40Var;
                                    m40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.f37857a.addView(j8Var2.L, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.L.f(j8Var2.Y, true);
                                return;
                            }
                            org.telegram.ui.Components.z4.r(j8Var2, i13, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f37876x)), null, false, new x7(j8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.Y.addView(this.h, k7.c6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f37872n = textView2;
            textView2.setGravity(17);
            this.f37872n.setTextSize(1, 15.0f);
            this.f37872n.setTypeface(AndroidUtilities.bold());
            this.f37872n.setOnClickListener(new View.OnClickListener(this) {
                public final j8 f42017b;

                {
                    this.f42017b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j8 j8Var = this.f42017b;
                            j8Var.D = true;
                            j8Var.t0();
                            return;
                        default:
                            j8 j8Var2 = this.f42017b;
                            int i13 = j8Var2.f37870i0;
                            if (i13 == 0) {
                                if (j8Var2.L == null) {
                                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(j8Var2.f37857a.getContext(), 8);
                                    j8Var2.L = m40Var;
                                    m40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    j8Var2.f37857a.addView(j8Var2.L, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    j8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                j8Var2.L.f(j8Var2.Y, true);
                                return;
                            }
                            org.telegram.ui.Components.z4.r(j8Var2, i13, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f37876x)), null, false, new x7(j8Var2), null);
                            return;
                    }
                }
            });
            this.f37872n.setAllCaps(true);
            this.f37872n.setVisibility(8);
            this.Y.addView(this.f37872n, k7.c6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37857a.addView(this.Y, k7.c6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.k6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f37872n;
            int i14 = org.telegram.ui.ActionBar.k6.f21897q7;
            textView4.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            this.f37872n.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f37862c0 == ((oh.l6) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21600a;
        int i11 = org.telegram.ui.ActionBar.k6.f21600a;
        int i12 = org.telegram.ui.ActionBar.k6.f21600a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.pr.f30168f);
        duration.addUpdateListener(new e3(this, 3));
        duration.addListener(new s5(this, 1));
        duration.start();
        this.O = duration;
        for (int i10 = 0; i10 < this.f37859b.getChildCount(); i10++) {
            s0((g8) this.f37859b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37859b.getCachedChildCount(); i11++) {
            g8 g8Var = (g8) this.f37859b.P(i11);
            s0(g8Var, false);
            g8.a(g8Var, this.M, this.N);
            g8.b(g8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37859b.getHiddenChildCount(); i12++) {
            g8 g8Var2 = (g8) this.f37859b.V(i12);
            s0(g8Var2, false);
            g8.a(g8Var2, this.M, this.N);
            g8.b(g8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37859b.getAttachedScrapChildCount(); i13++) {
            g8 g8Var3 = (g8) this.f37859b.O(i13);
            s0(g8Var3, false);
            g8.a(g8Var3, this.M, this.N);
            g8.b(g8Var3, 1.0f);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.D) {
            if (z4) {
                this.D = false;
                this.N = 0;
                this.M = 0;
                t0();
                o0();
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37876x = getArguments().getLong("dialog_id");
        this.f37877y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37860b0 = i10;
        if (i10 == 2) {
            this.f37862c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37876x, 0, -1, true);
        } else if (i10 == 3) {
            this.f37862c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37876x, 1, -1, true);
        }
        oh.l6 l6Var = this.f37862c0;
        if (l6Var != null) {
            this.f37863d0 = new h(this, 8);
        }
        if (this.f37876x >= 0) {
            this.f37858a0 = true;
        } else {
            this.f37858a0 = false;
        }
        if (l6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37862c0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        fg.h0 h0Var;
        if (z4 && (h0Var = this.v) != null && h0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        fg.h0 h0Var = this.v;
        if (h0Var != null && h0Var.getVisibility() == 0) {
            if (z4) {
                this.v.setAlpha(1.0f - f10);
            } else {
                this.v.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.V = true;
    }

    public final void p0() {
        if (!this.B && !this.Q) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f37859b.getChildCount(); i11++) {
                View childAt = this.f37859b.getChildAt(i11);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    int i12 = (g8Var.f37013b * 100) + g8Var.f37014c;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
            }
            int i13 = this.T;
            if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
                q0();
            }
        }
    }

    public final void q0() {
        if (!this.B && !this.Q) {
            if (this.f37862c0 != null) {
                r0();
                this.f37862c0.p(100, false);
                this.B = this.f37862c0.k();
                return;
            }
            this.B = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            int i10 = this.U;
            if (i10 == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i10 == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f37876x);
            if (this.f37877y != 0 && this.f37876x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f37877y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.S;
            Calendar calendar = Calendar.getInstance();
            this.f37859b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new eg.b3(22, this, calendar));
        }
    }

    public final void r0() {
        this.B = this.f37862c0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.P;
        sparseArray.clear();
        this.Z = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37862c0.f17404i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f37862c0.f17404i.get(i10);
            this.Z = Math.min(this.Z, messageObject.messageOwner.date);
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
                h8Var.f37250b = new ArrayList();
            }
            h8Var.f37250b.add(Integer.valueOf(messageObject.getId()));
            h8Var.f37249a = messageObject;
            h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, h8Var);
            int i13 = this.T;
            if (i11 < i13 || i13 == 0) {
                this.T = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.Z; i14 < currentTimeMillis; i14 += 86400) {
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
                h8Var2.f37254g = false;
                h8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, h8Var2);
            }
        }
        this.Q = this.f37862c0.f17413r;
        if (this.V) {
            this.C = true;
        }
        this.f37859b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.Z) / 2629800)) + 1;
        this.I.q(0, this.H);
        int i17 = this.H;
        if (timeInMillis > i17) {
            this.I.s(i17 + 1, timeInMillis);
            this.H = timeInMillis;
        }
        if (this.Q) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(g8 g8Var, boolean z4) {
        int i10;
        int i11;
        if (this.M != 0 && this.N != 0) {
            if (g8Var.f37017n != null) {
                boolean z10 = false;
                if (!z4) {
                    SparseArray sparseArray = g8Var.f37020w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        g8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
                        i12++;
                        z10 = false;
                    }
                }
                int i13 = g8Var.f37015e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < g8Var.d; i17++) {
                    h8 h8Var = (h8) g8Var.f37017n.get(i17, null);
                    if (h8Var != null && (i11 = h8Var.h) >= this.M && i11 <= this.N) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            g8Var.c(i10, i14, i15, true, z4);
                        } else {
                            i10 = i16;
                            g8Var.c(i10, 0, 0, false, z4);
                        }
                        i16 = i10 + 1;
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    g8Var.c(i18, i14, i15, true, z4);
                    return;
                } else {
                    g8Var.c(i18, 0, 0, false, z4);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = g8Var.f37020w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            g8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z4);
        }
    }

    public final void t0() {
        int abs;
        boolean z4;
        String string;
        org.telegram.ui.Components.m40 m40Var;
        if (!this.f37858a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.E.c(0.0f, true);
            return;
        }
        int i10 = this.M;
        int i11 = this.N;
        if (i10 == i11 && i10 == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i10 - i11) / 86400) + 1;
        }
        boolean z10 = this.f37871j0;
        int i12 = this.f37870i0;
        if (abs == i12 && z10 == this.D) {
            return;
        }
        if (i12 > abs) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f37870i0 = abs;
        boolean z11 = this.D;
        this.f37871j0 = z11;
        float f10 = 1.0f;
        if (abs > 0) {
            string = LocaleController.formatPluralString("Days", abs, new Object[0]);
            this.E.c(1.0f, true);
        } else if (z11) {
            string = LocaleController.getString(R.string.SelectDays);
            this.E.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.E.c(0.0f, true);
        }
        String str = string;
        if (abs > 1) {
            this.f37872n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.D) {
            this.f37872n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z4, 150L, null);
        if ((!this.D || abs > 0) && (m40Var = this.L) != null) {
            m40Var.b(true);
        }
        if (abs <= 0 && !this.D) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37872n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37872n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.x20(this.f37872n)).start();
            this.h.setEnabled(true);
            this.f37872n.setEnabled(false);
            return;
        }
        if (this.f37872n.getVisibility() == 8) {
            this.f37872n.setAlpha(0.0f);
            this.f37872n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f37872n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37872n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.x20(this.h)).start();
        ViewPropertyAnimator animate = this.f37872n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37872n.setEnabled(true);
    }
}
