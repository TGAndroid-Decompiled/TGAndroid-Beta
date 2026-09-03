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
public final class l8 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public boolean C;
    public boolean D;
    public org.telegram.ui.ActionBar.i2 E;
    public int F;
    public int G;
    public int H;
    public a8 I;
    public org.telegram.ui.Components.zz J;
    public zn K;
    public org.telegram.ui.Components.l40 L;
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
    public dh.d Y;
    public int Z;
    public y7 f35672a;
    public boolean f35673a0;
    public lh.e1 f35674b;
    public int f35675b0;
    public f2.i0 f35676c;
    public nh.l6 f35677c0;
    public final TextPaint d;
    public h f35678d0;
    public final TextPaint e;
    public int f35679e0;
    public final TextPaint f35680f;
    public c1 f35681f0;
    public final Path f35682g0;
    public TextView h;
    public final ih.k f35683h0;
    public int f35684i0;
    public boolean f35685j0;
    public TextView f35686n;
    public final Paint f35687r;
    public final Paint f35688s;
    public eg.h0 v;
    public final Paint f35689w;
    public long f35690x;
    public long f35691y;

    public l8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f35680f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f35687r = paint;
        this.f35688s = new Paint(1);
        this.f35689w = new Paint(1);
        this.P = new SparseArray();
        this.R = 0;
        this.f35682g0 = new Path();
        this.f35683h0 = new ih.k();
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

    public static void U(l8 l8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = l8Var.P;
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
                j8Var.f35105a = new MessageObject(l8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                j8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = l8Var.R + tL_messages_searchResultsCalendar.periods.get(i10).count;
                l8Var.R = i12;
                j8Var.f35107c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((j8) sparseArray2.get(i13, null)).f35109g) {
                    sparseArray2.put(i13, j8Var);
                }
                int i14 = l8Var.T;
                if (i11 < i14 || i14 == 0) {
                    l8Var.T = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            l8Var.Z = i15;
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
                    j8Var2.f35109g = false;
                    j8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, j8Var2);
                }
                i15 += 86400;
            }
            l8Var.B = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                l8Var.S = ((TLRPC.Message) kf.k0.i(1, tL_messages_searchResultsCalendar.messages)).f19180id;
                l8Var.Q = false;
                l8Var.p0();
            } else {
                l8Var.Q = true;
            }
            if (l8Var.V) {
                l8Var.C = true;
            }
            l8Var.f35674b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            l8Var.I.q(0, l8Var.H);
            int i18 = l8Var.H;
            if (timeInMillis > i18) {
                l8Var.I.s(i18 + 1, timeInMillis);
                l8Var.H = timeInMillis;
            }
            if (l8Var.Q) {
                l8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.e5 V(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 W(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 X(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Y(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Z(l8 l8Var) {
        return l8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 a0(l8 l8Var) {
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
        boolean z4;
        float f10;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f35680f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f35672a = new y7(this, context);
        createActionBar(context);
        this.f35672a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        lh.e1 e1Var = new lh.e1(this, context, 4);
        this.f35674b = e1Var;
        f2.i0 i0Var = new f2.i0();
        this.f35676c = i0Var;
        e1Var.setLayoutManager(i0Var);
        this.f35676c.k1(true);
        lh.e1 e1Var2 = this.f35674b;
        a8 a8Var = new a8(this, 0);
        this.I = a8Var;
        e1Var2.setAdapter(a8Var);
        this.f35674b.j(new n3(this, 3));
        if (this.f35675b0 == 0 && this.f35673a0) {
            z4 = true;
        } else {
            z4 = false;
        }
        y7 y7Var = this.f35672a;
        lh.e1 e1Var3 = this.f35674b;
        if (z4) {
            f10 = 48.0f;
        } else {
            f10 = 0.0f;
        }
        y7Var.addView(e1Var3, k7.b6.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f10));
        this.f35672a.addView(new nh.a3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), k7.b6.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 10));
        this.fragmentView = this.f35672a;
        Calendar calendar = Calendar.getInstance();
        this.F = calendar.get(1);
        int i10 = calendar.get(2);
        this.G = i10;
        int i11 = this.W;
        if (i11 != 0) {
            int e = e2.c.e(this.F, i11, 12, i10) - this.X;
            this.H = e + 1;
            this.f35676c.h1(e, AndroidUtilities.dp(120.0f));
        }
        if (this.H < 3) {
            this.H = 3;
        }
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.E = i2Var;
        this.actionBar.setBackButtonDrawable(i2Var);
        this.E.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        this.e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f35680f.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.E.a(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), false);
        textPaint3.setColor(-1);
        if (z4) {
            dh.d dVar = new dh.d(context, 8);
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
                public final l8 f39912b;

                {
                    this.f39912b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l8 l8Var = this.f39912b;
                            l8Var.D = true;
                            l8Var.t0();
                            return;
                        default:
                            l8 l8Var2 = this.f39912b;
                            int i13 = l8Var2.f35684i0;
                            if (i13 == 0) {
                                if (l8Var2.L == null) {
                                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(l8Var2.f35672a.getContext(), 8);
                                    l8Var2.L = l40Var;
                                    l40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    l8Var2.f35672a.addView(l8Var2.L, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    l8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                l8Var2.L.f(l8Var2.Y, true);
                                return;
                            }
                            org.telegram.ui.Components.z4.r(l8Var2, i13, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f35690x)), null, false, new z7(l8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.Y.addView(this.h, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f35686n = textView2;
            textView2.setGravity(17);
            this.f35686n.setTextSize(1, 15.0f);
            this.f35686n.setTypeface(AndroidUtilities.bold());
            this.f35686n.setOnClickListener(new View.OnClickListener(this) {
                public final l8 f39912b;

                {
                    this.f39912b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l8 l8Var = this.f39912b;
                            l8Var.D = true;
                            l8Var.t0();
                            return;
                        default:
                            l8 l8Var2 = this.f39912b;
                            int i13 = l8Var2.f35684i0;
                            if (i13 == 0) {
                                if (l8Var2.L == null) {
                                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(l8Var2.f35672a.getContext(), 8);
                                    l8Var2.L = l40Var;
                                    l40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    l8Var2.f35672a.addView(l8Var2.L, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    l8Var2.L.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                l8Var2.L.f(l8Var2.Y, true);
                                return;
                            }
                            org.telegram.ui.Components.z4.r(l8Var2, i13, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f35690x)), null, false, new z7(l8Var2), null);
                            return;
                    }
                }
            });
            this.f35686n.setAllCaps(true);
            this.f35686n.setVisibility(8);
            this.Y.addView(this.f35686n, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f35672a.addView(this.Y, k7.b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.j6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f35686n;
            int i14 = org.telegram.ui.ActionBar.j6.f20116q7;
            textView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            this.f35686n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f35677c0 == ((nh.l6) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f19820a;
        int i11 = org.telegram.ui.ActionBar.j6.f19820a;
        int i12 = org.telegram.ui.ActionBar.j6.f19820a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, true)) > 0.699999988079071d) {
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
        duration.setInterpolator(org.telegram.ui.Components.mr.f27122f);
        duration.addUpdateListener(new g3(this, 3));
        duration.addListener(new u5(this, 1));
        duration.start();
        this.O = duration;
        for (int i10 = 0; i10 < this.f35674b.getChildCount(); i10++) {
            s0((i8) this.f35674b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f35674b.getCachedChildCount(); i11++) {
            i8 i8Var = (i8) this.f35674b.P(i11);
            s0(i8Var, false);
            i8.a(i8Var, this.M, this.N);
            i8.b(i8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f35674b.getHiddenChildCount(); i12++) {
            i8 i8Var2 = (i8) this.f35674b.V(i12);
            s0(i8Var2, false);
            i8.a(i8Var2, this.M, this.N);
            i8.b(i8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f35674b.getAttachedScrapChildCount(); i13++) {
            i8 i8Var3 = (i8) this.f35674b.O(i13);
            s0(i8Var3, false);
            i8.a(i8Var3, this.M, this.N);
            i8.b(i8Var3, 1.0f);
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
        this.f35690x = getArguments().getLong("dialog_id");
        this.f35691y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f35675b0 = i10;
        if (i10 == 2) {
            this.f35677c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f35690x, 0, -1, true);
        } else if (i10 == 3) {
            this.f35677c0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f35690x, 1, -1, true);
        }
        nh.l6 l6Var = this.f35677c0;
        if (l6Var != null) {
            this.f35678d0 = new h(this, 8);
        }
        if (this.f35690x >= 0) {
            this.f35673a0 = true;
        } else {
            this.f35673a0 = false;
        }
        if (l6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35677c0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        eg.h0 h0Var;
        if (z4 && (h0Var = this.v) != null && h0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        eg.h0 h0Var = this.v;
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
            for (int i11 = 0; i11 < this.f35674b.getChildCount(); i11++) {
                View childAt = this.f35674b.getChildAt(i11);
                if (childAt instanceof i8) {
                    i8 i8Var = (i8) childAt;
                    int i12 = (i8Var.f34829b * 100) + i8Var.f34830c;
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
            if (this.f35677c0 != null) {
                r0();
                this.f35677c0.p(100, false);
                this.B = this.f35677c0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f35690x);
            if (this.f35691y != 0 && this.f35690x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f35691y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.S;
            Calendar calendar = Calendar.getInstance();
            this.f35674b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new dg.d3(22, this, calendar));
        }
    }

    public final void r0() {
        this.B = this.f35677c0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.P;
        sparseArray.clear();
        this.Z = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f35677c0.f15560i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f35677c0.f15560i.get(i10);
            this.Z = Math.min(this.Z, messageObject.messageOwner.date);
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
                j8Var.f35106b = new ArrayList();
            }
            j8Var.f35106b.add(Integer.valueOf(messageObject.getId()));
            j8Var.f35105a = messageObject;
            j8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, j8Var);
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
                j8 j8Var2 = new j8();
                j8Var2.f35109g = false;
                j8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, j8Var2);
            }
        }
        this.Q = this.f35677c0.f15569r;
        if (this.V) {
            this.C = true;
        }
        this.f35674b.invalidate();
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

    public final void s0(i8 i8Var, boolean z4) {
        int i10;
        int i11;
        if (this.M != 0 && this.N != 0) {
            if (i8Var.f34832n != null) {
                boolean z10 = false;
                if (!z4) {
                    SparseArray sparseArray = i8Var.f34835w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        i8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
                        i12++;
                        z10 = false;
                    }
                }
                int i13 = i8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < i8Var.d; i17++) {
                    j8 j8Var = (j8) i8Var.f34832n.get(i17, null);
                    if (j8Var != null && (i11 = j8Var.h) >= this.M && i11 <= this.N) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            i8Var.c(i10, i14, i15, true, z4);
                        } else {
                            i10 = i16;
                            i8Var.c(i10, 0, 0, false, z4);
                        }
                        i16 = i10 + 1;
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    i8Var.c(i18, i14, i15, true, z4);
                    return;
                } else {
                    i8Var.c(i18, 0, 0, false, z4);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = i8Var.f34835w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            i8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z4);
        }
    }

    public final void t0() {
        int abs;
        boolean z4;
        String string;
        org.telegram.ui.Components.l40 l40Var;
        if (!this.f35673a0) {
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
        boolean z10 = this.f35685j0;
        int i12 = this.f35684i0;
        if (abs == i12 && z10 == this.D) {
            return;
        }
        if (i12 > abs) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f35684i0 = abs;
        boolean z11 = this.D;
        this.f35685j0 = z11;
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
            this.f35686n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.D) {
            this.f35686n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.I(str, z4, 150L, null);
        if ((!this.D || abs > 0) && (l40Var = this.L) != null) {
            l40Var.b(true);
        }
        if (abs <= 0 && !this.D) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f35686n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f35686n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.m00(this.f35686n)).start();
            this.h.setEnabled(true);
            this.f35686n.setEnabled(false);
            return;
        }
        if (this.f35686n.getVisibility() == 8) {
            this.f35686n.setAlpha(0.0f);
            this.f35686n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f35686n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f35686n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.m00(this.h)).start();
        ViewPropertyAnimator animate = this.f35686n.animate();
        if (abs == 0) {
            f10 = 0.5f;
        }
        animate.alpha(f10).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f35686n.setEnabled(true);
    }
}
