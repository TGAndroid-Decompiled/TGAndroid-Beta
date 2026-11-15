package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class ul0 extends FrameLayout implements org.telegram.messenger.is {
    public static org.telegram.ui.ActionBar.t1 I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int f40096a;
    public final org.telegram.ui.ActionBar.e2 f40097b;
    public final org.telegram.ui.ActionBar.e6 f40098c;
    public final di.c1 d;
    public final di.i4 f40099e;
    public LinearLayout f40100f;
    public long h;
    public final ArrayList f40101n;
    public final ArrayList f40102r;
    public boolean f40103s;
    public dh.c f40104w;
    public gh.e f40105x;
    public final Paint f40106y;

    public ul0(Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40101n = new ArrayList();
        this.f40102r = new ArrayList();
        this.f40106y = new Paint(1);
        this.f40096a = i7;
        this.f40097b = e2Var;
        this.f40098c = e6Var;
        this.E = j3;
        ch.q0.n(e6Var);
        di.c1 c1Var = new di.c1(this, context, e6Var, 24);
        this.d = c1Var;
        c1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        c1Var.setClipToPadding(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        c1Var.setLayoutManager(b0Var);
        di.i4 i4Var = new di.i4(this, 4);
        this.f40099e = i4Var;
        c1Var.setAdapter(i4Var);
        c1Var.setOverScrollMode(2);
        addView(c1Var, c8.ja.c(-1.0f, -1));
        c1Var.setOnItemClickListener(new ml0(this, i7, e2Var, 0));
        c1Var.setOnItemLongClickListener(new bg.f0(this, i7, e2Var, e6Var, 4));
        v4.k kVar = new v4.k();
        kVar.o(er.h);
        kVar.n(320L);
        c1Var.setItemAnimator(kVar);
        org.telegram.messenger.si.b0(i7).Z0(false);
        h(false);
    }

    public static void c(Context context, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e6 e6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof st0) && ((st0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String K1 = org.telegram.messenger.np.s1(i7).K1(reaction);
        ch.p0 d = ch.p0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (!TextUtils.isEmpty(d.f5188f)) {
            charSequence = org.telegram.messenger.j6.m(d.f5188f, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new p5(d.f5189g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(K1)) {
            i10 = 2131745881;
        } else {
            i10 = 2131745869;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) org.telegram.messenger.hd.M0(i10, null));
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
        t1Var.S = append2;
        final ol0 ol0Var = new ol0(context, e6Var);
        ol0Var.setOnEditorActionListener(new pl0(ol0Var, i7, reaction, t1VarArr, view));
        org.telegram.messenger.si.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        ol0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        ol0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(ol0Var, i11, e6Var);
        org.telegram.ui.ActionBar.q6.l(ol0Var, 34, org.telegram.ui.ActionBar.j6.Oi, e6Var);
        ol0Var.setHintText(org.telegram.messenger.hd.M0(2131745882, null));
        ol0Var.setSingleLine(true);
        ol0Var.setFocusable(true);
        ol0Var.setInputType(16384);
        org.telegram.ui.ActionBar.q6.F(ol0Var, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
        ol0Var.setImeOptions(6);
        ol0Var.setBackgroundDrawable(null);
        ol0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131745880, null));
        f10.addView(textView, c8.ja.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(ol0Var, c8.ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131745946, null), new ai.q1(ol0Var, i7, reaction, 8));
        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(4));
        if (z10) {
            I = t1Var;
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new m0(view, 7));
            I.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ol0 ol0Var2 = ol0Var;
                            ol0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var2);
                            return;
                        default:
                            ol0 ol0Var3 = ol0Var;
                            ol0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var3);
                            return;
                    }
                }
            });
            I.r(250L);
        } else {
            t1VarArr[0] = t1Var;
            t1Var.setOnDismissListener(new m0(ol0Var, 8));
            t1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ol0 ol0Var2 = ol0Var;
                            ol0Var2.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var2);
                            return;
                        default:
                            ol0 ol0Var3 = ol0Var;
                            ol0Var3.requestFocus();
                            org.telegram.messenger.g0.J3(ol0Var3);
                            return;
                    }
                }
            });
            t1VarArr[0].show();
        }
        t1VarArr[0].f29639k0 = false;
        ol0Var.setSelection(ol0Var.getText().length());
    }

    public final boolean a() {
        if (this.f40102r.isEmpty() && !this.f40103s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(dh.c cVar, gh.e eVar) {
        this.f40104w = cVar;
        this.f40105x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.f40106y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f40100f;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.g0.o(this.f40098c));
            c10.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.q(org.telegram.messenger.g0.L(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25507h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
            }
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new pg.c(0));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f40100f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f40100f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ch.p0 p0Var, boolean z10) {
        di.i4 i4Var = this.f40099e;
        if (p0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            i4Var.f();
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f40102r;
            if (i7 < arrayList.size()) {
                long j3 = p0Var.h;
                ch.p0 p0Var2 = ((rl0) arrayList.get(i7)).f38998a;
                long j10 = p0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(p0Var2);
                    }
                    i4Var.f();
                    this.d.v0(i7);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(ch.p0 p0Var);

    public final void g(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            this.H = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f11 = this.G;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new f60(this, 14));
        this.H.setInterpolator(er.h);
        this.H.setDuration(320L);
        this.H.addListener(new org.telegram.ui.nn(19, this, z10));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f40101n;
        arrayList.clear();
        ArrayList arrayList2 = this.f40102r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f40096a;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i11);
        long j3 = this.E;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j3, false);
        if (I1 != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i12);
                ch.p0 d = ch.p0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = I1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j3 != 0 && tL_savedReactionTag.count <= 0)) {
                    i7 = i12;
                } else {
                    int i13 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = s12.K1(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f38998a = d;
                    obj.f38999b = i13;
                    obj.f39000c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i7 = i12;
                    if (obj.f38998a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i7 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        di.i4 i4Var = this.f40099e;
        if (z10) {
            v4.o.c(new ql0(this), true).c(i4Var);
        } else {
            i4Var.f();
        }
        boolean q10 = org.telegram.messenger.m10.i(i11).q();
        this.f40103s = !q10;
        if (!q10) {
            if (this.f40100f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f40100f = linearLayout;
                linearLayout.setOnClickListener(new y60(this, 10));
                this.f40100f.setOrientation(0);
                c8.na.b(this.f40100f, 0.03f, 1.25f);
                org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
                int i14 = org.telegram.ui.ActionBar.j6.f29049o6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f40098c;
                org.telegram.ui.ActionBar.q6.U(r9Var, i14, e6Var);
                r9Var.setTextSize(1, 12.0f);
                r9Var.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232244).mutate();
                int i15 = org.telegram.ui.ActionBar.j6.Xc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
                eq eqVar = new eq(0, mutate);
                eqVar.f34416s = 0.0f;
                eqVar.f34415r = 0.0f;
                eqVar.I = 0.94f;
                eqVar.J = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(eqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.M0(2131754381, null));
                r9Var.setText(spannableStringBuilder);
                r9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.q6.U(textView, i14, e6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131754380, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232060).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
                eq eqVar2 = new eq(0, mutate2);
                eqVar2.I = 0.76f;
                eqVar2.J = 0.76f;
                eqVar2.f34415r = -org.telegram.messenger.g0.L(1.0f);
                eqVar2.f34416s = org.telegram.messenger.g0.L(1.0f);
                spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                this.f40100f.addView(r9Var, c8.ja.r(-2, -2, 16));
                this.f40100f.addView(textView, c8.ja.r(-2, -2, 16));
                this.f40100f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
                this.f40100f.setClipToPadding(false);
                addView(this.f40100f, c8.ja.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f40100f.setVisibility(0);
                this.f40100f.setAlpha(0.0f);
                this.f40100f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f40100f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new wa0(this, 21)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f40100f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f40096a;
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25507h3);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f40096a;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25507h3);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25514i4);
    }

    public void setShown(float f10) {
        this.F = f10;
        di.c1 c1Var = this.d;
        c1Var.setPivotX(c1Var.getWidth() / 2.0f);
        c1Var.setPivotY(0.0f);
        c1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        c1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
