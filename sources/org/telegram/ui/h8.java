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
public final class h8 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.i2 H;
    public int I;
    public int J;
    public int K;
    public w7 L;
    public l2.g M;
    public eo N;
    public org.telegram.ui.Components.s40 O;
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
    public t7 f33300a;
    public final int f33301a0;
    public bi.y1 f33302b;
    public bi.l4 f33303b0;
    public s4.c0 f33304c;
    public int f33305c0;
    public final TextPaint d;
    public boolean f33306d0;
    public final TextPaint e;
    public int f33307e0;
    public final TextPaint f33308f;
    public zh.a5 f33309f0;
    public g f33310g0;
    public TextView h;
    public int f33311h0;
    public a1 f33312i0;
    public final Path f33313j0;
    public final uh.h f33314k0;
    public int f33315l0;
    public boolean m0;
    public TextView f33316n;
    public final Paint f33317r;
    public final Paint f33318s;
    public bi.nc v;
    public final Paint f33319w;
    public long f33320x;
    public long f33321y;

    public h8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f33308f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f33317r = paint;
        this.f33318s = new Paint(1);
        this.f33319w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f33313j0 = new Path();
        this.f33314k0 = new uh.h();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f33301a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
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
                f8Var.f32703a = new MessageObject(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = h8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                h8Var.U = i12;
                f8Var.f32705c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((f8) sparseArray2.get(i13, null)).f32707g) {
                    sparseArray2.put(i13, f8Var);
                }
                int i14 = h8Var.W;
                if (i11 < i14 || i14 == 0) {
                    h8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            h8Var.f33305c0 = i15;
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
                    f8Var2.f32707g = false;
                    f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, f8Var2);
                }
                i15 += 86400;
            }
            h8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                h8Var.V = ((TLRPC.Message) hc.b.i(1, tL_messages_searchResultsCalendar.messages)).f17216id;
                h8Var.T = false;
                h8Var.p0();
            } else {
                h8Var.T = true;
            }
            if (h8Var.Y) {
                h8Var.F = true;
            }
            h8Var.f33302b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            h8Var.L.q(0, h8Var.K);
            int i18 = h8Var.K;
            if (timeInMillis > i18) {
                h8Var.L.s(i18 + 1, timeInMillis);
                h8Var.K = timeInMillis;
            }
            if (h8Var.T) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.f5 V(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 W(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 X(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Y(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Z(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 a0(h8 h8Var) {
        return h8Var.parentLayout;
    }

    public static void b0(h8 h8Var) {
        if (h8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        h8Var.v.setBackground(new BitmapDrawable(createBitmap));
        h8Var.v.setAlpha(0.0f);
        h8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f33308f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f33300a = new t7(this, context);
        createActionBar(context);
        this.f33300a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        bi.y1 y1Var = new bi.y1(this, context, 5);
        this.f33302b = y1Var;
        s4.c0 c0Var = new s4.c0();
        this.f33304c = c0Var;
        y1Var.setLayoutManager(c0Var);
        this.f33304c.k1(true);
        bi.y1 y1Var2 = this.f33302b;
        w7 w7Var = new w7(this, 0);
        this.L = w7Var;
        y1Var2.setAdapter(w7Var);
        this.f33302b.j(new j3(this, 3));
        if (this.f33307e0 == 0 && this.f33306d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7 t7Var = this.f33300a;
        bi.y1 y1Var3 = this.f33302b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        t7Var.addView(y1Var3, w7.a6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        this.f33300a.addView(new u7(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), w7.a6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 23));
        this.fragmentView = this.f33300a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int B = hc.b.B(this.I, i11, 12, i10) - this.f33301a0;
            this.K = B + 1;
            this.f33304c.h1(B, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.H = i2Var;
        this.actionBar.setBackButtonDrawable(i2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f33308f.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            bi.l4 l4Var = new bi.l4(context, 7);
            this.f33303b0 = l4Var;
            l4Var.setWillNotDraw(false);
            this.f33303b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f33303b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final h8 f36565b;

                {
                    this.f36565b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h8 h8Var = this.f36565b;
                            h8Var.G = true;
                            h8Var.t0();
                            return;
                        default:
                            h8 h8Var2 = this.f36565b;
                            int i13 = h8Var2.f33315l0;
                            if (i13 == 0) {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(h8Var2.f33300a.getContext(), 8);
                                    h8Var2.O = s40Var;
                                    s40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.f33300a.addView(h8Var2.O, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.O.f(h8Var2.f33303b0, true);
                                return;
                            }
                            org.telegram.ui.Components.d5.r(h8Var2, i13, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f33320x)), null, false, new v7(h8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f33303b0.addView(this.h, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f33316n = textView2;
            textView2.setGravity(17);
            this.f33316n.setTextSize(1, 15.0f);
            this.f33316n.setTypeface(AndroidUtilities.bold());
            this.f33316n.setOnClickListener(new View.OnClickListener(this) {
                public final h8 f36565b;

                {
                    this.f36565b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h8 h8Var = this.f36565b;
                            h8Var.G = true;
                            h8Var.t0();
                            return;
                        default:
                            h8 h8Var2 = this.f36565b;
                            int i13 = h8Var2.f33315l0;
                            if (i13 == 0) {
                                if (h8Var2.O == null) {
                                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(h8Var2.f33300a.getContext(), 8);
                                    h8Var2.O = s40Var;
                                    s40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.f33300a.addView(h8Var2.O, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.O.f(h8Var2.f33303b0, true);
                                return;
                            }
                            org.telegram.ui.Components.d5.r(h8Var2, i13, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f33320x)), null, false, new v7(h8Var2), null);
                            return;
                    }
                }
            });
            this.f33316n.setAllCaps(true);
            this.f33316n.setVisibility(8);
            this.f33303b0.addView(this.f33316n, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f33300a.addView(this.f33303b0, w7.a6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.j6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f33316n;
            int i14 = org.telegram.ui.ActionBar.j6.f18162q7;
            textView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.f33316n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f33309f0 == ((zh.a5) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f17865a;
        int i11 = org.telegram.ui.ActionBar.j6.f17865a;
        int i12 = org.telegram.ui.ActionBar.j6.f17865a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        duration.addUpdateListener(new d3(this, 3));
        duration.addListener(new bi.h(this, 22));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f33302b.getChildCount(); i10++) {
            s0((e8) this.f33302b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f33302b.getCachedChildCount(); i11++) {
            e8 e8Var = (e8) this.f33302b.P(i11);
            s0(e8Var, false);
            e8.a(e8Var, this.P, this.Q);
            e8.b(e8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f33302b.getHiddenChildCount(); i12++) {
            e8 e8Var2 = (e8) this.f33302b.V(i12);
            s0(e8Var2, false);
            e8.a(e8Var2, this.P, this.Q);
            e8.b(e8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f33302b.getAttachedScrapChildCount(); i13++) {
            e8 e8Var3 = (e8) this.f33302b.O(i13);
            s0(e8Var3, false);
            e8.a(e8Var3, this.P, this.Q);
            e8.b(e8Var3, 1.0f);
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
        this.f33320x = getArguments().getLong("dialog_id");
        this.f33321y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f33307e0 = i10;
        if (i10 == 2) {
            this.f33309f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f33320x, 0, -1, true);
        } else if (i10 == 3) {
            this.f33309f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f33320x, 1, -1, true);
        }
        zh.a5 a5Var = this.f33309f0;
        if (a5Var != null) {
            this.f33310g0 = new g(this, 8);
        }
        if (this.f33320x >= 0) {
            this.f33306d0 = true;
        } else {
            this.f33306d0 = false;
        }
        if (a5Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f33309f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.nc ncVar;
        if (z10 && (ncVar = this.v) != null && ncVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bi.nc ncVar = this.v;
        if (ncVar != null && ncVar.getVisibility() == 0) {
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
            for (int i11 = 0; i11 < this.f33302b.getChildCount(); i11++) {
                View childAt = this.f33302b.getChildAt(i11);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    int i12 = (e8Var.f32110b * 100) + e8Var.f32111c;
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
            if (this.f33309f0 != null) {
                r0();
                this.f33309f0.p(100, false);
                this.E = this.f33309f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f33320x);
            if (this.f33321y != 0 && this.f33320x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f33321y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f33302b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new bi.o2(17, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f33309f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f33305c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f33309f0.f48240i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f33309f0.f48240i.get(i10);
            this.f33305c0 = Math.min(this.f33305c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
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
                f8Var.f32704b = new ArrayList();
            }
            f8Var.f32704b.add(Integer.valueOf(messageObject.getId()));
            f8Var.f32703a = messageObject;
            f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, f8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f33305c0; i14 < currentTimeMillis; i14 += 86400) {
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
                f8Var2.f32707g = false;
                f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, f8Var2);
            }
        }
        this.T = this.f33309f0.f48249r;
        if (this.Y) {
            this.F = true;
        }
        this.f33302b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f33305c0) / 2629800)) + 1;
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

    public final void s0(e8 e8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (e8Var.f32113n != null) {
                boolean z11 = false;
                if (!z10) {
                    SparseArray sparseArray = e8Var.f32116w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        e8Var.c(sparseArray.keyAt(i12), 0, 0, false, z11);
                        i12++;
                        z11 = false;
                    }
                }
                int i13 = e8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < e8Var.d; i17++) {
                    f8 f8Var = (f8) e8Var.f32113n.get(i17, null);
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
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
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
        SparseArray sparseArray2 = e8Var.f32116w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            e8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.s40 s40Var;
        if (!this.f33306d0) {
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
        int i12 = this.f33315l0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33315l0 = abs;
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
            this.f33316n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f33316n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (s40Var = this.O) != null) {
            s40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f33316n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f33316n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.yo(this.f33316n)).start();
            this.h.setEnabled(true);
            this.f33316n.setEnabled(false);
            return;
        }
        if (this.f33316n.getVisibility() == 8) {
            this.f33316n.setAlpha(0.0f);
            this.f33316n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f33316n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f33316n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.yo(this.h)).start();
        ViewPropertyAnimator animate = this.f33316n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f33316n.setEnabled(true);
    }
}
