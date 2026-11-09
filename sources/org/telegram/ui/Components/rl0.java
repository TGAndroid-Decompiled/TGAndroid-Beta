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
public abstract class rl0 extends FrameLayout implements org.telegram.messenger.ls {
    public static org.telegram.ui.ActionBar.u1 H;
    public final long D;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f37733a;
    public final org.telegram.ui.ActionBar.f2 f37734b;
    public final org.telegram.ui.ActionBar.g6 f37735c;
    public final bi.q1 d;
    public final bi.k5 f37736e;
    public LinearLayout f37737f;
    public long h;
    public final ArrayList f37738n;
    public final ArrayList f37739r;
    public boolean f37740s;
    public dh.c f37741w;
    public gh.e f37742x;
    public final Paint f37743y;

    public rl0(Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37738n = new ArrayList();
        this.f37739r = new ArrayList();
        this.f37743y = new Paint(1);
        this.f37733a = i7;
        this.f37734b = f2Var;
        this.f37735c = g6Var;
        this.D = j3;
        ch.p0.n(g6Var);
        bi.q1 q1Var = new bi.q1(this, context, g6Var, 24);
        this.d = q1Var;
        q1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        q1Var.setClipToPadding(false);
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(0);
        q1Var.setLayoutManager(b0Var);
        bi.k5 k5Var = new bi.k5(this, 4);
        this.f37736e = k5Var;
        q1Var.setAdapter(k5Var);
        q1Var.setOverScrollMode(2);
        addView(q1Var, c8.ha.c(-1.0f, -1));
        q1Var.setOnItemClickListener(new il0(this, i7, f2Var, 0));
        q1Var.setOnItemLongClickListener(new bg.f0(this, i7, f2Var, g6Var, 4));
        v4.k kVar = new v4.k();
        kVar.o(xq.h);
        kVar.n(320L);
        q1Var.setItemAnimator(kVar);
        org.telegram.messenger.ui.b0(i7).Z0(false);
        h(false);
    }

    public static void c(Context context, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.g6 g6Var) {
        View view;
        boolean z9;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof tt0) && ((tt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z9) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String K1 = org.telegram.messenger.qp.s1(i7).K1(reaction);
        ch.o0 d = ch.o0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (!TextUtils.isEmpty(d.f6354f)) {
            charSequence = org.telegram.messenger.i6.m(d.f6354f, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new r5(d.f6355g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(K1)) {
            i10 = 2131745881;
        } else {
            i10 = 2131745869;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) org.telegram.messenger.id.M0(i10, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27296a;
        u1Var.R = append2;
        final ll0 ll0Var = new ll0(context, g6Var);
        ll0Var.setOnEditorActionListener(new ml0(ll0Var, i7, reaction, u1VarArr, view));
        org.telegram.messenger.ui.b0(i7).M(org.telegram.messenger.g0.G0(), true);
        ll0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        ll0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.U(ll0Var, i11, g6Var);
        org.telegram.ui.ActionBar.s6.l(ll0Var, 34, org.telegram.ui.ActionBar.l6.Li, g6Var);
        ll0Var.setHintText(org.telegram.messenger.id.M0(2131745882, null));
        ll0Var.setSingleLine(true);
        ll0Var.setFocusable(true);
        ll0Var.setInputType(16384);
        org.telegram.ui.ActionBar.s6.F(ll0Var, org.telegram.ui.ActionBar.l6.f27994k6, org.telegram.ui.ActionBar.l6.f28012l6, org.telegram.ui.ActionBar.l6.f28086p7, g6Var);
        ll0Var.setImeOptions(6);
        ll0Var.setBackgroundDrawable(null);
        ll0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.s6.U(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.id.M0(2131745880, null));
        f10.addView(textView, c8.ha.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(ll0Var, c8.ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        u1Var.f28542a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131745946, null), new jg.a2(ll0Var, i7, reaction, 7));
        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new jl0(0));
        if (z9) {
            H = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new p0(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ll0 ll0Var2 = ll0Var;
                            ll0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var2);
                            return;
                        default:
                            ll0 ll0Var3 = ll0Var;
                            ll0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var3);
                            return;
                    }
                }
            });
            H.r(250L);
        } else {
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new p0(ll0Var, 9));
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ll0 ll0Var2 = ll0Var;
                            ll0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var2);
                            return;
                        default:
                            ll0 ll0Var3 = ll0Var;
                            ll0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(ll0Var3);
                            return;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[0].f28565j0 = false;
        ll0Var.setSelection(ll0Var.getText().length());
    }

    public final boolean a() {
        if (this.f37739r.isEmpty() && !this.f37740s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z9);

    public final void d(dh.c cVar, gh.e eVar) {
        this.f37741w = cVar;
        this.f37742x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.f37743y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f37737f;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.g0.o(this.f37735c));
            c10.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.q(org.telegram.messenger.g0.L(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25011h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.D) {
                h(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new pg.c(0));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f37737f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f37737f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ch.o0 o0Var, boolean z9) {
        bi.k5 k5Var = this.f37736e;
        if (o0Var == null) {
            this.h = 0L;
            if (z9) {
                f(null);
            }
            k5Var.f();
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f37739r;
            if (i7 < arrayList.size()) {
                long j3 = o0Var.h;
                ch.o0 o0Var2 = ((ol0) arrayList.get(i7)).f36742a;
                long j10 = o0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z9) {
                        f(o0Var2);
                    }
                    k5Var.f();
                    this.d.v0(i7);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(ch.o0 o0Var);

    public final void g(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z9) {
            setVisibility(0);
        }
        float f11 = this.F;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new d60(this, 14));
        this.G.setInterpolator(xq.h);
        this.G.setDuration(320L);
        this.G.addListener(new t9(18, this, z9));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f37738n;
        arrayList.clear();
        ArrayList arrayList2 = this.f37739r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f37733a;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i11);
        long j3 = this.D;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j3, false);
        if (I1 != null) {
            int i12 = 0;
            z10 = false;
            while (i12 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i12);
                ch.o0 d = ch.o0.d(tL_savedReactionTag.reaction);
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
                    obj.f36742a = d;
                    obj.f36743b = i13;
                    obj.f36744c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i7 = i12;
                    if (obj.f36742a.h == this.h) {
                        z10 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i7 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z10 = false;
        }
        if (!z10 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        bi.k5 k5Var = this.f37736e;
        if (z9) {
            v4.o.c(new nl0(this), true).c(k5Var);
        } else {
            k5Var.f();
        }
        boolean q10 = org.telegram.messenger.p10.i(i11).q();
        this.f37740s = !q10;
        if (!q10) {
            if (this.f37737f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f37737f = linearLayout;
                linearLayout.setOnClickListener(new ma0(this, 9));
                this.f37737f.setOrientation(0);
                c8.ka.b(this.f37737f, 0.03f, 1.25f);
                org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
                int i14 = org.telegram.ui.ActionBar.l6.f28065o6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f37735c;
                org.telegram.ui.ActionBar.s6.U(q9Var, i14, g6Var);
                q9Var.setTextSize(1, 12.0f);
                q9Var.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232243).mutate();
                int i15 = org.telegram.ui.ActionBar.l6.Uc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
                wp wpVar = new wp(0, mutate);
                wpVar.f40121s = 0.0f;
                wpVar.f40120r = 0.0f;
                wpVar.H = 0.94f;
                wpVar.I = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(wpVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.id.M0(2131754381, null));
                q9Var.setText(spannableStringBuilder);
                q9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.s6.U(textView, i14, g6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131754380, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232059).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
                wp wpVar2 = new wp(0, mutate2);
                wpVar2.H = 0.76f;
                wpVar2.I = 0.76f;
                wpVar2.f40120r = -org.telegram.messenger.g0.L(1.0f);
                wpVar2.f40121s = org.telegram.messenger.g0.L(1.0f);
                spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                this.f37737f.addView(q9Var, c8.ha.r(-2, -2, 16));
                this.f37737f.addView(textView, c8.ha.r(-2, -2, 16));
                this.f37737f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
                this.f37737f.setClipToPadding(false);
                addView(this.f37737f, c8.ha.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z9) {
                this.f37737f.setVisibility(0);
                this.f37737f.setAlpha(0.0f);
                this.f37737f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f37737f;
        if (linearLayout2 != null) {
            if (z9) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new pb0(this, 18)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f37737f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f37733a;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25011h3);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f37733a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25011h3);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25018i4);
    }

    public void setShown(float f10) {
        this.E = f10;
        bi.q1 q1Var = this.d;
        q1Var.setPivotX(q1Var.getWidth() / 2.0f);
        q1Var.setPivotY(0.0f);
        q1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        q1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
