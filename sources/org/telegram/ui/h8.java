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

public final class h8 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean B;
    public boolean C;
    public org.telegram.ui.ActionBar.g2 D;
    public int E;
    public int F;
    public int G;
    public w7 H;
    public o0.b I;
    public rn J;
    public org.telegram.ui.Components.x30 K;
    public int L;
    public int M;
    public ValueAnimator N;
    public final SparseArray O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public boolean U;
    public final int V;
    public final int W;
    public ag.d X;
    public int Y;
    public boolean Z;

    public u7 f38698a;

    public int f38699a0;

    public hh.f1 f38700b;

    public jh.j6 f38701b0;

    public f2.k0 f38702c;

    public g f38703c0;
    public final TextPaint d;

    public int f38704d0;

    public final TextPaint f38705e;

    public c1 f38706e0;

    public final TextPaint f38707f;

    public final Path f38708f0;

    public final eh.k f38709g0;
    public TextView h;

    public int f38710h0;

    public boolean f38711i0;

    public TextView f38712n;

    public final Paint f38713r;

    public final Paint f38714s;
    public ag.s0 v;

    public final Paint f38715w;

    public long f38716x;

    public long f38717y;

    public h8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.f38705e = new TextPaint(1);
        this.f38707f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f38713r = paint;
        this.f38714s = new Paint(1);
        this.f38715w = new Paint(1);
        this.O = new SparseArray();
        this.Q = 0;
        this.f38708f0 = new Path();
        this.f38709g0 = new eh.k();
        this.T = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) i11) * 1000);
            this.V = calendar.get(1);
            this.W = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void U(h8 h8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = h8Var.O;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            for (int i10 = 0; i10 < tL_messages_searchResultsCalendar.periods.size(); i10++) {
                calendar.setTimeInMillis(((long) tL_messages_searchResultsCalendar.periods.get(i10).date) * 1000);
                int i11 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i11, sparseArray2);
                }
                f8 f8Var = new f8();
                f8Var.f37958a = new MessageObject(h8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = h8Var.Q + tL_messages_searchResultsCalendar.periods.get(i10).count;
                h8Var.Q = i12;
                f8Var.f37960c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((f8) sparseArray2.get(i13, null)).f37963g) {
                    sparseArray2.put(i13, f8Var);
                }
                int i14 = h8Var.S;
                if (i11 < i14 || i14 == 0) {
                    h8Var.S = i11;
                }
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            h8Var.Y = i15;
            while (true) {
                calendar.setTimeInMillis(((long) i15) * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (calendar.getTimeInMillis() / 1000 > iCurrentTimeMillis) {
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
                    f8Var2.f37963g = false;
                    f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, f8Var2);
                }
                i15 += 86400;
            }
            h8Var.A = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                h8Var.P = true;
            } else {
                h8Var.R = ((TLRPC.Message) i0.a.i(1, tL_messages_searchResultsCalendar.messages)).f22401id;
                h8Var.P = false;
                h8Var.p0();
            }
            if (h8Var.U) {
                h8Var.B = true;
            }
            h8Var.f38700b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - ((long) tL_messages_searchResultsCalendar.min_date)) / 2629800)) + 1;
            h8Var.H.q(0, h8Var.G);
            int i18 = h8Var.G;
            if (timeInMillis > i18) {
                h8Var.H.s(i18 + 1, timeInMillis);
                h8Var.G = timeInMillis;
            }
            if (h8Var.P) {
                h8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static void b0(h8 h8Var) {
        if (h8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (h8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (h8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        h8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        h8Var.v.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        h8Var.v.setAlpha(0.0f);
        h8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        float fDp = AndroidUtilities.dp(16.0f);
        TextPaint textPaint = this.d;
        textPaint.setTextSize(fDp);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        float fDp2 = AndroidUtilities.dp(11.0f);
        TextPaint textPaint2 = this.f38707f;
        textPaint2.setTextSize(fDp2);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        float fDp3 = AndroidUtilities.dp(16.0f);
        TextPaint textPaint3 = this.f38705e;
        textPaint3.setTextSize(fDp3);
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        this.f38698a = new u7(this, context);
        createActionBar(context);
        this.f38698a.addView(this.actionBar);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
        this.actionBar.setCastShadows(false);
        hh.f1 f1Var = new hh.f1(this, context, 6);
        this.f38700b = f1Var;
        f2.k0 k0Var = new f2.k0();
        this.f38702c = k0Var;
        f1Var.setLayoutManager(k0Var);
        this.f38702c.k1(true);
        hh.f1 f1Var2 = this.f38700b;
        w7 w7Var = new w7(this, 0);
        this.H = w7Var;
        f1Var2.setAdapter(w7Var);
        this.f38700b.j(new m3(this, 3));
        boolean z10 = this.f38699a0 == 0 && this.Z;
        this.f38698a.addView(this.f38700b, h7.z5.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z10 ? 48.0f : 0.0f));
        this.f38698a.addView(new jh.a3(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, context.getDrawable(R.drawable.header_shadow).mutate()), h7.z5.d(-1, 38.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 19));
        this.fragmentView = this.f38698a;
        Calendar calendar = Calendar.getInstance();
        this.E = calendar.get(1);
        int i10 = calendar.get(2);
        this.F = i10;
        int i11 = this.V;
        if (i11 != 0) {
            int iE = i0.a.e(this.E, i11, 12, i10) - this.W;
            this.G = iE + 1;
            this.f38702c.h1(iE, AndroidUtilities.dp(120.0f));
        }
        if (this.G < 3) {
            this.G = 3;
        }
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.D = g2Var;
        this.actionBar.setBackButtonDrawable(g2Var);
        this.D.c(0.0f, false);
        q0();
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.f38705e.setColor(-1);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f38707f.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.D.a(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), false);
        textPaint3.setColor(-1);
        if (z10) {
            ag.d dVar = new ag.d(context, 7);
            this.X = dVar;
            dVar.setWillNotDraw(false);
            this.X.setPadding(0, AndroidUtilities.getShadowHeight(), 0, 0);
            this.X.setClipChildren(false);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            final int i13 = 0;
            this.h.setOnClickListener(new View.OnClickListener(this) {

                public final h8 f42793b;

                {
                    this.f42793b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            h8 h8Var = this.f42793b;
                            h8Var.C = true;
                            h8Var.t0();
                            break;
                        default:
                            h8 h8Var2 = this.f42793b;
                            int i14 = h8Var2.f38710h0;
                            if (i14 != 0) {
                                org.telegram.ui.Components.y4.r(h8Var2, i14, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f38716x)), null, false, new v7(h8Var2), null);
                            } else {
                                if (h8Var2.K == null) {
                                    org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(h8Var2.f38698a.getContext(), 8);
                                    h8Var2.K = x30Var;
                                    x30Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.f38698a.addView(h8Var2.K, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.K.f(h8Var2.X, true);
                            }
                            break;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.h.setAllCaps(true);
            this.X.addView(this.h, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.f38712n = textView2;
            textView2.setGravity(17);
            this.f38712n.setTextSize(1, 15.0f);
            this.f38712n.setTypeface(AndroidUtilities.bold());
            final int i14 = 1;
            this.f38712n.setOnClickListener(new View.OnClickListener(this) {

                public final h8 f42793b;

                {
                    this.f42793b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            h8 h8Var = this.f42793b;
                            h8Var.C = true;
                            h8Var.t0();
                            break;
                        default:
                            h8 h8Var2 = this.f42793b;
                            int i15 = h8Var2.f38710h0;
                            if (i15 != 0) {
                                org.telegram.ui.Components.y4.r(h8Var2, i15, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f38716x)), null, false, new v7(h8Var2), null);
                            } else {
                                if (h8Var2.K == null) {
                                    org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(h8Var2.f38698a.getContext(), 8);
                                    h8Var2.K = x30Var;
                                    x30Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    h8Var2.f38698a.addView(h8Var2.K, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    h8Var2.K.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                h8Var2.K.f(h8Var2.X, true);
                            }
                            break;
                    }
                }
            });
            this.f38712n.setAllCaps(true);
            this.f38712n.setVisibility(8);
            this.X.addView(this.f38712n, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38698a.addView(this.X, h7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView3 = this.h;
            int i15 = org.telegram.ui.ActionBar.g6.Ae;
            textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 51), 2, -1));
            TextView textView4 = this.f38712n;
            int i16 = org.telegram.ui.ActionBar.g6.f23284q7;
            textView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i16, false), 51), 2, -1));
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.f38712n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f38701b0 == ((jh.j6) objArr[0])) {
            r0();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f22993a;
        int i11 = org.telegram.ui.ActionBar.g6.f22993a;
        int i12 = org.telegram.ui.ActionBar.g6.f22993a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
        duration.addUpdateListener(new g3(this, 3));
        duration.addListener(new lh.h9(this, 10));
        duration.start();
        this.N = duration;
        for (int i10 = 0; i10 < this.f38700b.getChildCount(); i10++) {
            s0((e8) this.f38700b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f38700b.getCachedChildCount(); i11++) {
            e8 e8Var = (e8) this.f38700b.P(i11);
            s0(e8Var, false);
            e8.a(e8Var, this.L, this.M);
            e8.b(e8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f38700b.getHiddenChildCount(); i12++) {
            e8 e8Var2 = (e8) this.f38700b.V(i12);
            s0(e8Var2, false);
            e8.a(e8Var2, this.L, this.M);
            e8.b(e8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f38700b.getAttachedScrapChildCount(); i13++) {
            e8 e8Var3 = (e8) this.f38700b.O(i13);
            s0(e8Var3, false);
            e8.a(e8Var3, this.L, this.M);
            e8.b(e8Var3, 1.0f);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.C) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.C = false;
            this.M = 0;
            this.L = 0;
            t0();
            o0();
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38716x = getArguments().getLong("dialog_id");
        this.f38717y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f38699a0 = i10;
        if (i10 == 2) {
            this.f38701b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38716x, 0, -1, true);
        } else if (i10 == 3) {
            this.f38701b0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f38716x, 1, -1, true);
        }
        jh.j6 j6Var = this.f38701b0;
        if (j6Var != null) {
            this.f38703c0 = new g(this, 8);
        }
        if (this.f38716x >= 0) {
            this.Z = true;
        } else {
            this.Z = false;
        }
        if (j6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38701b0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ag.s0 s0Var;
        if (z10 && (s0Var = this.v) != null && s0Var.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        ag.s0 s0Var = this.v;
        if (s0Var == null || s0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.v.setAlpha(1.0f - f10);
        } else {
            this.v.setAlpha(f10);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.U = true;
    }

    public final void p0() {
        if (this.A || this.P) {
            return;
        }
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < this.f38700b.getChildCount(); i11++) {
            View childAt = this.f38700b.getChildAt(i11);
            if (childAt instanceof e8) {
                e8 e8Var = (e8) childAt;
                int i12 = (e8Var.f37654b * 100) + e8Var.f37655c;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
        }
        int i13 = this.S;
        if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
            q0();
        }
    }

    public final void q0() {
        if (this.A || this.P) {
            return;
        }
        if (this.f38701b0 != null) {
            r0();
            this.f38701b0.p(100, false);
            this.A = this.f38701b0.k();
            return;
        }
        this.A = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        int i10 = this.T;
        if (i10 == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i10 == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f38716x);
        if (this.f38717y != 0 && this.f38716x == getUserConfig().getClientUserId()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f38717y);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.R;
        Calendar calendar = Calendar.getInstance();
        this.f38700b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new cg.g0(26, this, calendar));
    }

    public final void r0() {
        this.A = this.f38701b0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        this.Y = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f38701b0.f13540i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f38701b0.f13540i.get(i10);
            this.Y = Math.min(this.Y, messageObject.messageOwner.date);
            calendar.setTimeInMillis(((long) messageObject.messageOwner.date) * 1000);
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
                f8Var.f37959b = new ArrayList();
            }
            f8Var.f37959b.add(Integer.valueOf(messageObject.getId()));
            f8Var.f37958a = messageObject;
            f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, f8Var);
            int i13 = this.S;
            if (i11 < i13 || i13 == 0) {
                this.S = i11;
            }
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.Y; i14 < iCurrentTimeMillis; i14 += 86400) {
            calendar.setTimeInMillis(((long) i14) * 1000);
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
                f8Var2.f37963g = false;
                f8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, f8Var2);
            }
        }
        this.P = this.f38701b0.f13549r;
        if (this.U) {
            this.B = true;
        }
        this.f38700b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - ((long) this.Y)) / 2629800)) + 1;
        this.H.q(0, this.G);
        int i17 = this.G;
        if (timeInMillis > i17) {
            this.H.s(i17 + 1, timeInMillis);
            this.G = timeInMillis;
        }
        if (this.P) {
            resumeDelayedFragmentAnimation();
        }
    }

    public final void s0(e8 e8Var, boolean z10) {
        int i10;
        int i11;
        if (this.L == 0 || this.M == 0) {
            SparseArray sparseArray = e8Var.f37661w;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                e8Var.c(sparseArray.keyAt(i12), 0, 0, false, z10);
            }
            return;
        }
        if (e8Var.f37658n == null) {
            return;
        }
        boolean z11 = false;
        if (!z10) {
            SparseArray sparseArray2 = e8Var.f37661w;
            int i13 = 0;
            while (i13 < sparseArray2.size()) {
                e8Var.c(sparseArray2.keyAt(i13), 0, 0, false, z11);
                i13++;
                z11 = false;
            }
        }
        int i14 = e8Var.f37656e;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        for (int i18 = 0; i18 < e8Var.d; i18++) {
            f8 f8Var = (f8) e8Var.f37658n.get(i18, null);
            if (f8Var != null && (i11 = f8Var.h) >= this.L && i11 <= this.M) {
                if (i15 == -1) {
                    i15 = i14;
                }
                i16 = i14;
            }
            i14++;
            if (i14 >= 7) {
                if (i15 == -1 || i16 == -1) {
                    i10 = i17;
                    e8Var.c(i10, 0, 0, false, z10);
                } else {
                    i10 = i17;
                    e8Var.c(i10, i15, i16, true, z10);
                }
                i17 = i10 + 1;
                i14 = 0;
                i15 = -1;
                i16 = -1;
            }
        }
        int i19 = i17;
        if (i15 == -1 || i16 == -1) {
            e8Var.c(i19, 0, 0, false, z10);
        } else {
            e8Var.c(i19, i15, i16, true, z10);
        }
    }

    public final void t0() {
        String string;
        org.telegram.ui.Components.x30 x30Var;
        if (!this.Z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calendar));
            this.D.c(0.0f, true);
            return;
        }
        int i10 = this.L;
        int i11 = this.M;
        int iAbs = (i10 == i11 && i10 == 0) ? 0 : (Math.abs(i10 - i11) / 86400) + 1;
        boolean z10 = this.f38711i0;
        int i12 = this.f38710h0;
        if (iAbs == i12 && z10 == this.C) {
            return;
        }
        boolean z11 = i12 > iAbs;
        this.f38710h0 = iAbs;
        boolean z12 = this.C;
        this.f38711i0 = z12;
        if (iAbs > 0) {
            string = LocaleController.formatPluralString("Days", iAbs, new Object[0]);
            this.D.c(1.0f, true);
        } else if (z12) {
            string = LocaleController.getString(R.string.SelectDays);
            this.D.c(1.0f, true);
        } else {
            string = LocaleController.getString(R.string.Calendar);
            this.D.c(0.0f, true);
        }
        String str = string;
        if (iAbs > 1) {
            this.f38712n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (iAbs > 0 || this.C) {
            this.f38712n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        this.actionBar.J(str, z11, 150L, null);
        if ((!this.C || iAbs > 0) && (x30Var = this.K) != null) {
            x30Var.b(true);
        }
        if (iAbs > 0 || this.C) {
            if (this.f38712n.getVisibility() == 8) {
                this.f38712n.setAlpha(0.0f);
                this.f38712n.setTranslationY(-AndroidUtilities.dp(20.0f));
            }
            this.f38712n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f38712n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new go(this.h)).start();
            this.f38712n.animate().alpha(iAbs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.h.setEnabled(false);
            this.f38712n.setEnabled(true);
            return;
        }
        if (this.h.getVisibility() == 8) {
            this.h.setAlpha(0.0f);
            this.h.setTranslationY(AndroidUtilities.dp(20.0f));
        }
        this.h.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f38712n.animate().setListener(null).cancel();
        this.h.animate().alpha(1.0f).translationY(0.0f).start();
        this.f38712n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new go(this.f38712n)).start();
        this.h.setEnabled(true);
        this.f38712n.setEnabled(false);
    }
}
