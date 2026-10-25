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
public final class n8 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.j2 H;
    public int I;
    public int J;
    public int K;
    public c8 L;
    public li.h5 M;
    public un N;
    public org.telegram.ui.Components.t40 O;
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
    public a8 f41774a;
    public final int f41775a0;
    public bi.r1 f41776b;
    public bi.t1 f41777b0;
    public s4.c0 f41778c;
    public int f41779c0;
    public final TextPaint d;
    public boolean f41780d0;
    public final TextPaint e;
    public int f41781e0;
    public final TextPaint f41782f;
    public di.z6 f41783f0;
    public f f41784g0;
    public TextView h;
    public int f41785h0;
    public y0 f41786i0;
    public fi.f6 f41787j0;
    public View f41788k0;
    public final Path f41789l0;
    public final xh.g m0;
    public TextView f41790n;
    public int f41791n0;
    public boolean f41792o0;
    public int f41793p0;
    public int f41794q0;
    public final Paint f41795r;
    public int f41796r0;
    public final Paint f41797s;
    public bi.cc v;
    public final Paint f41798w;
    public long f41799x;
    public long f41800y;

    public n8(int i10, int i11, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f41782f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f41795r = paint;
        this.f41797s = new Paint(1);
        this.f41798w = new Paint(1);
        this.S = new SparseArray();
        this.U = 0;
        this.f41789l0 = new Path();
        this.m0 = new xh.g();
        this.X = i10;
        if (i11 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i11 * 1000);
            this.Z = calendar.get(1);
            this.f41775a0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public static void V(n8 n8Var, TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray = n8Var.S;
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
                l8 l8Var = new l8();
                l8Var.f41162a = new MessageObject(n8Var.currentAccount, tL_messages_searchResultsCalendar.messages.get(i10), false, false);
                l8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i12 = n8Var.U + tL_messages_searchResultsCalendar.periods.get(i10).count;
                n8Var.U = i12;
                l8Var.f41164c = i12;
                int i13 = calendar.get(5) - 1;
                if (sparseArray2.get(i13, null) == null || !((l8) sparseArray2.get(i13, null)).f41166g) {
                    sparseArray2.put(i13, l8Var);
                }
                int i14 = n8Var.W;
                if (i11 < i14 || i14 == 0) {
                    n8Var.W = i11;
                }
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i15 = tL_messages_searchResultsCalendar.min_date;
            n8Var.f41779c0 = i15;
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
                    l8 l8Var2 = new l8();
                    l8Var2.f41166g = false;
                    l8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                    sparseArray3.put(i17, l8Var2);
                }
                i15 += 86400;
            }
            n8Var.E = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                n8Var.V = ((TLRPC.Message) ic.a.g(1, tL_messages_searchResultsCalendar.messages)).f22048id;
                n8Var.T = false;
                n8Var.r0();
            } else {
                n8Var.T = true;
            }
            if (n8Var.Y) {
                n8Var.F = true;
            }
            n8Var.f41776b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            n8Var.L.q(0, n8Var.K);
            int i18 = n8Var.K;
            if (timeInMillis > i18) {
                n8Var.L.s(i18 + 1, timeInMillis);
                n8Var.K = timeInMillis;
            }
            if (n8Var.T) {
                n8Var.resumeDelayedFragmentAnimation();
            }
        }
    }

    public static org.telegram.ui.ActionBar.j5 X(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 Y(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 Z(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 a0(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 b0(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.j5 c0(n8 n8Var) {
        return n8Var.parentLayout;
    }

    public static void d0(n8 n8Var) {
        if (n8Var.v == null) {
            return;
        }
        int measuredWidth = (int) (n8Var.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (n8Var.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        n8Var.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        n8Var.v.setBackground(new BitmapDrawable(createBitmap));
        n8Var.v.setAlpha(0.0f);
        n8Var.v.setVisibility(0);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f41782f;
        textPaint2.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(AndroidUtilities.dp(16.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextAlign(align);
        a8 a8Var = new a8(this, context);
        this.f41774a = a8Var;
        a8Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        this.f41774a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calendar));
        bi.r1 r1Var = new bi.r1(this, context, 7);
        this.f41776b = r1Var;
        s4.c0 c0Var = new s4.c0();
        this.f41778c = c0Var;
        r1Var.setLayoutManager(c0Var);
        this.f41778c.l1(true);
        bi.r1 r1Var2 = this.f41776b;
        c8 c8Var = new c8(this, 0);
        this.L = c8Var;
        r1Var2.setAdapter(c8Var);
        this.f41776b.j(new i3(this, 4));
        if (this.f41781e0 == 0 && this.f41780d0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a8 a8Var2 = this.f41774a;
        bi.r1 r1Var3 = this.f41776b;
        if (z10) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        a8Var2.addView(r1Var3, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f7));
        fi.f6 f6Var = new fi.f6(this, context, new String[]{LocaleController.getString(R.string.CalendarWeekNameShortMonday), LocaleController.getString(R.string.CalendarWeekNameShortTuesday), LocaleController.getString(R.string.CalendarWeekNameShortWednesday), LocaleController.getString(R.string.CalendarWeekNameShortThursday), LocaleController.getString(R.string.CalendarWeekNameShortFriday), LocaleController.getString(R.string.CalendarWeekNameShortSaturday), LocaleController.getString(R.string.CalendarWeekNameShortSunday)}, 2);
        this.f41787j0 = f6Var;
        f6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fi.f6 f6Var2 = this.f41787j0;
        eh.d c10 = getBaseSimpleGlass().f19421c.c(this.f41787j0, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        f6Var2.setBackground(c10);
        this.f41787j0.setTranslationY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(9.0f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 26));
        this.fragmentView = this.f41774a;
        Calendar calendar = Calendar.getInstance();
        this.I = calendar.get(1);
        int i10 = calendar.get(2);
        this.J = i10;
        int i11 = this.Z;
        if (i11 != 0) {
            int w10 = c3.h0.w(this.I, i11, 12, i10) - this.f41775a0;
            this.K = w10 + 1;
            this.f41778c.h1(w10, AndroidUtilities.dp(120.0f));
        }
        if (this.K < 3) {
            this.K = 3;
        }
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.H = j2Var;
        this.simpleActionBar.setBackButtonDrawable(j2Var);
        this.H.c(0.0f, false);
        t0();
        u0();
        textPaint3.setColor(-1);
        if (z10) {
            this.f41777b0 = new bi.t1(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final n8 f45976b;

                {
                    this.f45976b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            n8 n8Var = this.f45976b;
                            n8Var.G = true;
                            n8Var.x0();
                            return;
                        default:
                            n8 n8Var2 = this.f45976b;
                            int i12 = n8Var2.f41791n0;
                            if (i12 == 0) {
                                if (n8Var2.O == null) {
                                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(n8Var2.f41774a.getContext(), 8);
                                    n8Var2.O = t40Var;
                                    t40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    n8Var2.f41774a.addView(n8Var2.O, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    n8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                n8Var2.O.f(n8Var2.f41777b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(n8Var2, i12, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.f41799x)), null, false, new b8(n8Var2), null);
                            return;
                    }
                }
            });
            this.h.setText(LocaleController.getString(R.string.SelectDays));
            this.f41777b0.addView(this.h, org.telegram.ui.Components.gb1.i(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.f41790n = textView2;
            textView2.setGravity(17);
            this.f41790n.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.f41790n.setSingleLine();
            this.f41790n.setTextSize(1, 15.0f);
            this.f41790n.setTypeface(AndroidUtilities.bold());
            this.f41790n.setOnClickListener(new View.OnClickListener(this) {
                public final n8 f45976b;

                {
                    this.f45976b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            n8 n8Var = this.f45976b;
                            n8Var.G = true;
                            n8Var.x0();
                            return;
                        default:
                            n8 n8Var2 = this.f45976b;
                            int i12 = n8Var2.f41791n0;
                            if (i12 == 0) {
                                if (n8Var2.O == null) {
                                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(n8Var2.f41774a.getContext(), 8);
                                    n8Var2.O = t40Var;
                                    t40Var.setExtraTranslationY(AndroidUtilities.dp(24.0f));
                                    n8Var2.f41774a.addView(n8Var2.O, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                                    n8Var2.O.setText(LocaleController.getString(R.string.SelectDaysTooltip));
                                }
                                n8Var2.O.f(n8Var2.f41777b0, true);
                                return;
                            }
                            org.telegram.ui.Components.g5.q(n8Var2, i12, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.f41799x)), null, false, new b8(n8Var2), null);
                            return;
                    }
                }
            });
            this.f41790n.setVisibility(8);
            this.f41777b0.addView(this.f41790n, org.telegram.ui.Components.gb1.i(-2, 38, 17));
            this.f41774a.addView(this.f41777b0, org.telegram.ui.Components.gb1.i(-1, 50, 80));
            this.f41777b0.a(this.h, false);
            int dp = AndroidUtilities.dp(19.0f);
            TextView textView3 = this.h;
            int i12 = org.telegram.ui.ActionBar.y6.Ae;
            org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.Z(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 51), dp, dp), null, org.telegram.ui.ActionBar.f7.h(i12, 51), null);
            TextView textView4 = this.f41790n;
            int i13 = org.telegram.ui.ActionBar.y6.f23596q7;
            org.telegram.ui.ActionBar.f7.R(textView4, org.telegram.ui.ActionBar.y6.Z(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i13, false), 51), dp, dp), null, org.telegram.ui.ActionBar.f7.h(i13, 51), null);
            org.telegram.ui.ActionBar.f7.V(this.h, i12, null);
            org.telegram.ui.ActionBar.f7.V(this.f41790n, i13, null);
        }
        View view = new View(context);
        this.f41788k0 = view;
        this.f41774a.addView(view, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.f41788k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f13451b;
        this.f41774a.addView(this.f41787j0, org.telegram.ui.Components.gb1.h(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && this.f41783f0 == ((di.z6) objArr[0])) {
            v0();
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f41776b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.f23290a;
        int i11 = org.telegram.ui.ActionBar.y6.f23290a;
        int i12 = org.telegram.ui.ActionBar.y6.f23290a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, true)) > 0.699999988079071d) {
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
            if (z10) {
                this.G = false;
                this.Q = 0;
                this.P = 0;
                x0();
                q0();
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41799x = getArguments().getLong("dialog_id");
        this.f41800y = getArguments().getLong("topic_id");
        int i10 = getArguments().getInt("type");
        this.f41781e0 = i10;
        if (i10 == 2) {
            this.f41783f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f41799x, 0, -1, true);
        } else if (i10 == 3) {
            this.f41783f0 = MessagesController.getInstance(this.currentAccount).getStoriesController().A(this.f41799x, 1, -1, true);
        }
        di.z6 z6Var = this.f41783f0;
        if (z6Var != null) {
            this.f41784g0 = new f(this, 7);
        }
        if (this.f41799x >= 0) {
            this.f41780d0 = true;
        } else {
            this.f41780d0 = false;
        }
        if (z6Var != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41783f0 != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41788k0.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        this.f41787j0.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        s0(i11, i13);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.H != null && this.d != null && this.f41782f != null && this.e != null) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false);
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false);
            if (x02 != this.f41793p0 || x03 != this.f41794q0 || x04 != this.f41796r0) {
                this.f41793p0 = x02;
                this.f41794q0 = x03;
                this.f41796r0 = x04;
                u0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.cc ccVar;
        if (z10 && (ccVar = this.v) != null && ccVar.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        bi.cc ccVar = this.v;
        if (ccVar != null && ccVar.getVisibility() == 0) {
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
        this.f41788k0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        i0.b bVar = this.mSystemInsets;
        s0(bVar.f13451b, bVar.d);
    }

    public final void q0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ds.f27584f);
        duration.addUpdateListener(new b3(this, 2));
        duration.addListener(new kg.e(this, 9));
        duration.start();
        this.R = duration;
        for (int i10 = 0; i10 < this.f41776b.getChildCount(); i10++) {
            w0((k8) this.f41776b.getChildAt(i10), true);
        }
        for (int i11 = 0; i11 < this.f41776b.getCachedChildCount(); i11++) {
            k8 k8Var = (k8) this.f41776b.P(i11);
            w0(k8Var, false);
            k8.a(k8Var, this.P, this.Q);
            k8.b(k8Var, 1.0f);
        }
        for (int i12 = 0; i12 < this.f41776b.getHiddenChildCount(); i12++) {
            k8 k8Var2 = (k8) this.f41776b.V(i12);
            w0(k8Var2, false);
            k8.a(k8Var2, this.P, this.Q);
            k8.b(k8Var2, 1.0f);
        }
        for (int i13 = 0; i13 < this.f41776b.getAttachedScrapChildCount(); i13++) {
            k8 k8Var3 = (k8) this.f41776b.O(i13);
            w0(k8Var3, false);
            k8.a(k8Var3, this.P, this.Q);
            k8.b(k8Var3, 1.0f);
        }
    }

    public final void r0() {
        if (!this.E && !this.T) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < this.f41776b.getChildCount(); i11++) {
                View childAt = this.f41776b.getChildAt(i11);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    int i12 = (k8Var.f40815b * 100) + k8Var.f40816c;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
            }
            int i13 = this.W;
            if ((i13 % 100) + ((i13 / 100) * 12) + 3 >= (i10 % 100) + ((i10 / 100) * 12)) {
                t0();
            }
        }
    }

    public final void s0(int i10, int i11) {
        int i12;
        if (this.f41777b0 != null) {
            i12 = AndroidUtilities.dp(50.0f);
        } else {
            i12 = 0;
        }
        oi.a.d(this.f41776b, i10, i11, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), i12);
        bi.t1 t1Var = this.f41777b0;
        if (t1Var != null) {
            t1Var.setTranslationY((-i11) - AndroidUtilities.dp(6.0f));
        }
    }

    public final void t0() {
        if (!this.E && !this.T) {
            if (this.f41783f0 != null) {
                v0();
                this.f41783f0.p(100, false);
                this.E = this.f41783f0.k();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().getInputPeer(this.f41799x);
            if (this.f41800y != 0 && this.f41799x == getUserConfig().getClientUserId()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().getInputPeer(this.f41800y);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.V;
            Calendar calendar = Calendar.getInstance();
            this.f41776b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new z7(0, this, calendar));
        }
    }

    public final void u0() {
        this.e.setColor(-1);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f41782f.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.H.a(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        this.E = this.f41783f0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.S;
        sparseArray.clear();
        this.f41779c0 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < this.f41783f0.f9493i.size(); i10++) {
            MessageObject messageObject = (MessageObject) this.f41783f0.f9493i.get(i10);
            this.f41779c0 = Math.min(this.f41779c0, messageObject.messageOwner.date);
            calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
            int i11 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i11);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i11, sparseArray2);
            }
            int i12 = calendar.get(5) - 1;
            l8 l8Var = (l8) sparseArray2.get(i12);
            if (l8Var == null) {
                l8Var = new l8();
                l8Var.f41163b = new ArrayList();
            }
            l8Var.f41163b.add(Integer.valueOf(messageObject.getId()));
            l8Var.f41162a = messageObject;
            l8Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i12, l8Var);
            int i13 = this.W;
            if (i11 < i13 || i13 == 0) {
                this.W = i11;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i14 = this.f41779c0; i14 < currentTimeMillis; i14 += 86400) {
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
                l8 l8Var2 = new l8();
                l8Var2.f41166g = false;
                l8Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i16, l8Var2);
            }
        }
        this.T = this.f41783f0.f9502r;
        if (this.Y) {
            this.F = true;
        }
        this.f41776b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.f41779c0) / 2629800)) + 1;
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

    public final void w0(k8 k8Var, boolean z10) {
        int i10;
        int i11;
        if (this.P != 0 && this.Q != 0) {
            if (k8Var.f40818n != null) {
                if (!z10) {
                    SparseArray sparseArray = k8Var.f40821w;
                    for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                        k8Var.c(sparseArray.keyAt(i12), 0, 0, false, false);
                    }
                }
                int i13 = k8Var.e;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                for (int i17 = 0; i17 < k8Var.d; i17++) {
                    l8 l8Var = (l8) k8Var.f40818n.get(i17, null);
                    if (l8Var != null && (i11 = l8Var.h) >= this.P && i11 <= this.Q) {
                        if (i14 == -1) {
                            i14 = i13;
                        }
                        i15 = i13;
                    }
                    i13++;
                    if (i13 >= 7) {
                        if (i14 != -1 && i15 != -1) {
                            i10 = i16;
                            k8Var.c(i10, i14, i15, true, z10);
                        } else {
                            i10 = i16;
                            k8Var.c(i10, 0, 0, false, z10);
                        }
                        i16 = i10 + 1;
                        i14 = -1;
                        i15 = -1;
                        i13 = 0;
                    }
                }
                int i18 = i16;
                if (i14 != -1 && i15 != -1) {
                    k8Var.c(i18, i14, i15, true, z10);
                    return;
                } else {
                    k8Var.c(i18, 0, 0, false, z10);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = k8Var.f40821w;
        for (int i19 = 0; i19 < sparseArray2.size(); i19++) {
            k8Var.c(sparseArray2.keyAt(i19), 0, 0, false, z10);
        }
    }

    public final void x0() {
        int abs;
        boolean z10;
        String string;
        TextView textView;
        org.telegram.ui.Components.t40 t40Var;
        if (!this.f41780d0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calendar));
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
        boolean z11 = this.f41792o0;
        int i12 = this.f41791n0;
        if (abs == i12 && z11 == this.G) {
            return;
        }
        if (i12 > abs) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41791n0 = abs;
        boolean z12 = this.G;
        this.f41792o0 = z12;
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
            this.f41790n.setText(LocaleController.formatString("ClearHistoryForTheseDays", R.string.ClearHistoryForTheseDays, new Object[0]));
        } else if (abs > 0 || this.G) {
            this.f41790n.setText(LocaleController.formatString("ClearHistoryForThisDay", R.string.ClearHistoryForThisDay, new Object[0]));
        }
        bi.t1 t1Var = this.f41777b0;
        if (abs <= 0 && !this.G) {
            textView = this.h;
        } else {
            textView = this.f41790n;
        }
        t1Var.a(textView, true);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        r5Var.getClass();
        r5Var.w(str, z10, 150L, org.telegram.ui.Components.ds.h);
        if ((!this.G || abs > 0) && (t40Var = this.O) != null) {
            t40Var.b(true);
        }
        if (abs <= 0 && !this.G) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(AndroidUtilities.dp(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.f41790n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.f41790n.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new jo(this.f41790n)).start();
            this.h.setEnabled(true);
            this.f41790n.setEnabled(false);
            return;
        }
        if (this.f41790n.getVisibility() == 8) {
            this.f41790n.setAlpha(0.0f);
            this.f41790n.setTranslationY(-AndroidUtilities.dp(20.0f));
        }
        this.f41790n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.f41790n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(AndroidUtilities.dp(20.0f)).setDuration(150L).setListener(new jo(this.h)).start();
        ViewPropertyAnimator animate = this.f41790n.animate();
        if (abs == 0) {
            f7 = 0.5f;
        }
        animate.alpha(f7).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.f41790n.setEnabled(true);
    }
}
