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
    public l2.g M;
    public yn N;
    public org.telegram.ui.Components.m40 O;
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
    public x7 f37881a;
    public final int f37882a0;
    public ai.w0 f37883b;
    public ai.w5 f37884b0;
    public s4.c0 f37885c;
    public int f37886c0;
    public final TextPaint d;
    public boolean f37887d0;
    public final TextPaint f37888e;
    public int f37889e0;
    public final TextPaint f37890f;
    public ai.d9 f37891f0;
    public g f37892g0;
    public TextView h;
    public int f37893h0;
    public z0 f37894i0;
    public ci.r6 f37895j0;
    public View f37896k0;
    public final Path f37897l0;
    public final vh.g m0;
    public TextView f37898n;
    public int f37899n0;
    public boolean f37900o0;
    public final Paint f37901r;
    public final Paint f37902s;
    public ci.ab v;
    public final Paint f37903w;
    public long f37904x;
    public long f37905y;

    public k8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f37888e = new TextPaint(1);
        this.f37890f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f37901r = paint;
        this.f37902s = new Paint(1);
        this.f37903w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f37897l0 = new Path();
        this.m0 = new vh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f37882a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void S(k8 k8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
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
                i8Var.f37301a = new MessageObject(k8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = k8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                k8Var.U = i12;
                i8Var.f37303c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((i8) sparseArray2.get(i13, null)).f37306g) {
                    sparseArray2.put(i13, i8Var);
                }
                int i14 = k8Var.W;
                if (i11 < i14 || i14 == 0) {
                    k8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            k8Var.f37886c0 = i15;
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
                    i8Var2.f37306g = false;
                    i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, i8Var2);
                }
                i15 += 86400;
            }
            k8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                k8Var.V = ((TLRPC.Message) hg.c.g(1, tL_messages_searchResultsCalendar.messages)).f20068id;
                k8Var.T = false;
                k8Var.p0();
            } else {
                k8Var.T = true;
            }
            if (k8Var.Y) {
                k8Var.F = true;
            }
            k8Var.f37883b.invalidate();
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

    public static org.telegram.ui.ActionBar.c5 T(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 U(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 W(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 X(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 Y(k8 k8Var) {
        return k8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.c5 Z(k8 k8Var) {
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
        TextPaint textPaint2 = this.f37890f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.f37888e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f37881a = new x7(this, context);
        createActionBar(context);
        this.f37881a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
        this.f37881a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        ai.w0 w0Var = new ai.w0(this, context, 6);
        this.f37883b = w0Var;
        s4.c0 c0Var = new s4.c0();
        this.f37885c = c0Var;
        w0Var.setLayoutManager(c0Var);
        this.f37885c.k1(true);
        ai.w0 w0Var2 = this.f37883b;
        z7 z7Var = new z7(this, 0);
        this.L = z7Var;
        w0Var2.setAdapter(z7Var);
        this.f37883b.j(new i3(this, 4));
        if (this.f37889e0 == 0 && this.f37887d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        x7 x7Var = this.f37881a;
        ai.w0 w0Var3 = this.f37883b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        x7Var.addView(w0Var3, w7.z5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        ci.r6 r6Var = new ci.r6(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, 2);
        this.f37895j0 = r6Var;
        r6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ci.r6 r6Var2 = this.f37895j0;
        ch.d c10 = getBaseSimpleGlass().f15607c.c(this.f37895j0, null, false);
        c10.w(eh.b.m(this.resourceProvider));
        c10.x(AndroidUtilities.dp(9.66f));
        c10.y(AndroidUtilities.dp(18.0f));
        r6Var2.setBackground(c10);
        this.f37895j0.setTranslationY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(9.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 23));
        this.fragmentView = this.f37881a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int f10 = hg.c.f(this.I, i11, 12, i10) - this.f37882a0;
            this.K = f10 + 1;
            this.f37885c.h1(f10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.H = g2Var;
        this.actionBar.setBackButtonDrawable(g2Var);
        this.H.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
        this.f37888e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f37890f.setColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.H.a(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i12, false), false);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20918i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ai.w5 w5Var = new ai.w5(context, 8);
            this.f37884b0 = w5Var;
            w5Var.setWillNotDraw(false);
            this.f37884b0.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.f37884b0.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f41960b;

                {
                    this.f41960b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f41960b;
                            k8Var.G = true;
                            k8Var.t0();
                            return;
                        default:
                            k8 k8Var2 = this.f41960b;
                            int i13 = k8Var2.f37899n0;
                            if (i13 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(k8Var2.f37881a.getContext(), 8);
                                    k8Var2.O = m40Var;
                                    m40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f37881a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f37884b0, true);
                                return;
                            }
                            org.telegram.ui.Components.e5.r(k8Var2, i13, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f37904x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.f37884b0.addView(this.h, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f37898n = textView2;
            textView2.setGravity(17);
            this.f37898n.setTextSize(1, 15.0f);
            this.f37898n.setTypeface(AndroidUtilities.bold());
            this.f37898n.setOnClickListener(new View.OnClickListener(this) {
                public final k8 f41960b;

                {
                    this.f41960b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            k8 k8Var = this.f41960b;
                            k8Var.G = true;
                            k8Var.t0();
                            return;
                        default:
                            k8 k8Var2 = this.f41960b;
                            int i13 = k8Var2.f37899n0;
                            if (i13 == 0) {
                                if (k8Var2.O == null) {
                                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(k8Var2.f37881a.getContext(), 8);
                                    k8Var2.O = m40Var;
                                    m40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    k8Var2.f37881a.addView(k8Var2.O, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    k8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                k8Var2.O.f(k8Var2.f37884b0, true);
                                return;
                            }
                            org.telegram.ui.Components.e5.r(k8Var2, i13, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f37904x)), null, false, new y7(k8Var2), null);
                            return;
                    }
                }
            });
            this.f37898n.setAllCaps(true);
            this.f37898n.setVisibility(8);
            this.f37884b0.addView(this.f37898n, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f37881a.addView(this.f37884b0, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i13 = org.telegram.ui.ActionBar.i6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i13, false), 51), 2, -1));
            TextView textView4 = this.f37898n;
            int i14 = org.telegram.ui.ActionBar.i6.f21068q7;
            textView4.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i14, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
            this.f37898n.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        }
        View view = new View(context);
        this.f37896k0 = view;
        this.f37881a.addView(view, w7.z5.e(-1, 0, 48));
        this.f37896k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f11527b;
        this.f37881a.addView(this.f37895j0, w7.z5.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f37891f0 == ((ai.d9) objArr[0])) {
            r0();
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f37883b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.i6.f20764a;
        int i11 = org.telegram.ui.ActionBar.i6.f20764a;
        int i12 = org.telegram.ui.ActionBar.i6.f20764a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.tr.f31215f);
        duration.addUpdateListener(new c3(this, 2));
        duration.addListener(new u4(this, 2));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f37883b.getChildCount(); i10++) {
            s0((h8) this.f37883b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f37883b.getCachedChildCount(); i11++) {
            h8 h8Var = (h8) this.f37883b.P(i11);
            s0(h8Var, false);
            h8.a(h8Var, this.P, this.Q);
            h8.b(h8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f37883b.getHiddenChildCount(); i12++) {
            h8 h8Var2 = (h8) this.f37883b.V(i12);
            s0(h8Var2, false);
            h8.a(h8Var2, this.P, this.Q);
            h8.b(h8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f37883b.getAttachedScrapChildCount(); i13++) {
            h8 h8Var3 = (h8) this.f37883b.O(i13);
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
        this.f37904x = getArguments().getLong("dialog_id");
        this.f37905y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f37889e0 = i10;
        if (i10 == 2) {
            this.f37891f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37904x, 0, -1, true);
        } else if (i10 == 3) {
            this.f37891f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f37904x, 1, -1, true);
        }
        ai.d9 d9Var = this.f37891f0;
        if (d9Var != null) {
            this.f37892g0 = new g(this, 7);
        }
        if (this.f37904x >= 0) {
            this.f37887d0 = true;
        } else {
            this.f37887d0 = false;
        }
        if (d9Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37891f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37896k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        this.f37895j0.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        li.a.c(this.f37883b, i11, i13, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.ab abVar;
        if (z10 && (abVar = this.v) != null && abVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        ci.ab abVar = this.v;
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

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.f37896k0.setBackground(this.actionBar.getBackground());
        this.actionBar.setBackground(null);
        ai.w0 w0Var = this.f37883b;
        i0.b bVar = this.mSystemInsets;
        li.a.c(w0Var, bVar.f11527b, bVar.d, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final void p0() {
        if (!this.E && !this.T) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f37883b.getChildCount(); i11++) {
                View childAt = this.f37883b.getChildAt(i11);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    int i12 = (h8Var.f37020b * 100) + h8Var.f37021c;
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
            if (this.f37891f0 != null) {
                r0();
                this.f37891f0.p(100, false);
                this.E = this.f37891f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f37904x);
            if (this.f37905y != 0 && this.f37904x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f37905y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f37883b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ai.v1(22, this, calendar));
        }
    }

    public final void r0() {
        this.E = this.f37891f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f37886c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f37891f0.f789i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f37891f0.f789i.get(i10);
            this.f37886c0 = Math.min(this.f37886c0, messageObject.messageOwner.date);
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
                i8Var.f37302b = new ArrayList();
            }
            i8Var.f37302b.add(Integer.valueOf(messageObject.getId()));
            i8Var.f37301a = messageObject;
            i8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, i8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f37886c0; i14 < currentTimeMillis; i14 += 86400) {
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
                i8Var2.f37306g = false;
                i8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, i8Var2);
            }
        }
        this.T = this.f37891f0.f798r;
        if (this.Y) {
            this.F = true;
        }
        this.f37883b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f37886c0) / 2629800)) + 1;
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
            if (h8Var.f37024n != null) {
                boolean z11 = false;
                if (!z10) {
                    SparseArray sparseArray = h8Var.f37027w;
                    int i12 = 0;
                    while (i12 < sparseArray.size()) {
                        h8Var.c(sparseArray.keyAt(i12), 0, 0, false, z11);
                        i12++;
                        z11 = false;
                    }
                }
                int i13 = h8Var.f37022e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < h8Var.d; i17++) {
                    i8 i8Var = (i8) h8Var.f37024n.get(i17, null);
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
                        i13 = 0;
                        i14 = -1;
                        i15 = -1;
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
        SparseArray sparseArray2 = h8Var.f37027w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            h8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void t0() {
        int abs;
        boolean z10;
        String string;
        org.telegram.ui.Components.m40 m40Var;
        if (!this.f37887d0) {
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
        boolean z11 = this.f37900o0;
        int i12 = this.f37899n0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37899n0 = abs;
        boolean z12 = this.G;
        this.f37900o0 = z12;
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
            this.f37898n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f37898n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.G(str, z10, 150L, null);
        if ((!this.G || abs > 0) && (m40Var = this.O) != null) {
            m40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f37898n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f37898n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.da(this.f37898n)).start();
            this.h.setEnabled(true);
            this.f37898n.setEnabled(false);
            return;
        }
        if (this.f37898n.getVisibility() == 8) {
            this.f37898n.setAlpha(0.0f);
            this.f37898n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f37898n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f37898n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new org.telegram.ui.Components.da(this.h)).start();
        ViewPropertyAnimator animate = this.f37898n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f37898n.setEnabled(true);
    }
}
