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
public abstract class cm0 extends FrameLayout implements org.telegram.messenger.fs {
    public static org.telegram.ui.ActionBar.u1 I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int f34103a;
    public final org.telegram.ui.ActionBar.h2 f34104b;
    public final org.telegram.ui.ActionBar.i6 f34105c;
    public final di.b1 d;
    public final di.l4 f34106e;
    public LinearLayout f34107f;
    public long h;
    public final ArrayList f34108n;
    public final ArrayList f34109r;
    public boolean f34110s;
    public dh.c f34111w;
    public gh.e f34112x;
    public final Paint f34113y;

    public cm0(Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f34108n = new ArrayList();
        this.f34109r = new ArrayList();
        this.f34113y = new Paint(1);
        this.f34103a = i7;
        this.f34104b = h2Var;
        this.f34105c = i6Var;
        this.E = j3;
        ch.q0.n(i6Var);
        di.b1 b1Var = new di.b1(this, context, i6Var, 24);
        this.d = b1Var;
        b1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        b1Var.setClipToPadding(false);
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(0);
        b1Var.setLayoutManager(c0Var);
        di.l4 l4Var = new di.l4(this, 4);
        this.f34106e = l4Var;
        b1Var.setAdapter(l4Var);
        b1Var.setOverScrollMode(2);
        addView(b1Var, c8.ma.c(-1.0f, -1));
        b1Var.setOnItemClickListener(new ul0(this, i7, h2Var, 0));
        b1Var.setOnItemLongClickListener(new bg.g0(this, i7, h2Var, i6Var, 4));
        v4.k kVar = new v4.k();
        kVar.o(lr.h);
        kVar.n(320L);
        b1Var.setItemAnimator(kVar);
        org.telegram.messenger.ri.d0(i7).c1(false);
        h(false);
    }

    public static void c(Context context, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.i6 i6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof au0) && ((au0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String M1 = org.telegram.messenger.mp.u1(i7).M1(reaction);
        ch.p0 d = ch.p0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (!TextUtils.isEmpty(d.f5478f)) {
            charSequence = org.telegram.messenger.j6.m(d.f5478f, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new x5(d.f5479g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(M1)) {
            i10 = 2131745686;
        } else {
            i10 = 2131745674;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) org.telegram.messenger.gd.M0(i10, null));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f28746a;
        u1Var.S = append2;
        final wl0 wl0Var = new wl0(context, i6Var);
        wl0Var.setOnEditorActionListener(new xl0(wl0Var, i7, reaction, u1VarArr, view));
        org.telegram.messenger.ri.d0(i7).O(org.telegram.messenger.g0.G0(), true);
        wl0Var.setTextSize(1, 18.0f);
        if (M1 == null) {
            M1 = "";
        }
        wl0Var.setText(M1);
        int i11 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.u6.U(wl0Var, i11, i6Var);
        org.telegram.ui.ActionBar.u6.l(wl0Var, 34, org.telegram.ui.ActionBar.n6.Oi, i6Var);
        wl0Var.setHintText(org.telegram.messenger.gd.M0(2131745687, null));
        wl0Var.setSingleLine(true);
        wl0Var.setFocusable(true);
        wl0Var.setInputType(16384);
        org.telegram.ui.ActionBar.u6.F(wl0Var, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, i6Var);
        wl0Var.setImeOptions(6);
        wl0Var.setBackgroundDrawable(null);
        wl0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.gd.M0(2131745685, null));
        g10.addView(textView, c8.ma.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        g10.addView(wl0Var, c8.ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(g10);
        u1Var.f30026a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131745751, null), new ai.r1(wl0Var, i7, reaction, 9));
        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(5));
        if (z10) {
            I = u1Var;
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new y0(view, 7));
            I.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            wl0 wl0Var2 = wl0Var;
                            wl0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(wl0Var2);
                            return;
                        default:
                            wl0 wl0Var3 = wl0Var;
                            wl0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(wl0Var3);
                            return;
                    }
                }
            });
            I.r(250L);
        } else {
            u1VarArr[0] = u1Var;
            u1Var.setOnDismissListener(new y0(wl0Var, 8));
            u1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            wl0 wl0Var2 = wl0Var;
                            wl0Var2.requestFocus();
                            org.telegram.messenger.g0.I3(wl0Var2);
                            return;
                        default:
                            wl0 wl0Var3 = wl0Var;
                            wl0Var3.requestFocus();
                            org.telegram.messenger.g0.I3(wl0Var3);
                            return;
                    }
                }
            });
            u1VarArr[0].show();
        }
        u1VarArr[0].f30051k0 = false;
        wl0Var.setSelection(wl0Var.getText().length());
    }

    public final boolean a() {
        if (this.f34109r.isEmpty() && !this.f34110s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(dh.c cVar, gh.e eVar) {
        this.f34111w = cVar;
        this.f34112x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.f34113y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f34107f;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.i0.p(this.f34105c));
            c10.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c10.u(org.telegram.messenger.g0.L(5.0f));
            c10.q(org.telegram.messenger.g0.L(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.j3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25145k4) {
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
        if (view == this.d && (linearLayout = this.f34107f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f34107f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ch.p0 p0Var, boolean z10) {
        di.l4 l4Var = this.f34106e;
        if (p0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            l4Var.f();
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f34109r;
            if (i7 < arrayList.size()) {
                long j3 = p0Var.h;
                ch.p0 p0Var2 = ((zl0) arrayList.get(i7)).f42900a;
                long j10 = p0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(p0Var2);
                    }
                    l4Var.f();
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
        ofFloat.addUpdateListener(new e60(this, 16));
        this.H.setInterpolator(lr.h);
        this.H.setDuration(320L);
        this.H.addListener(new org.telegram.ui.on(19, this, z10));
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
        ArrayList arrayList = this.f34108n;
        arrayList.clear();
        ArrayList arrayList2 = this.f34109r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f34103a;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i11);
        long j3 = this.E;
        TLRPC.TL_messages_savedReactionsTags K1 = u12.K1(j3, false);
        if (K1 != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < K1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = K1.tags.get(i12);
                ch.p0 d = ch.p0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = K1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j3 != 0 && tL_savedReactionTag.count <= 0)) {
                    i7 = i12;
                } else {
                    int i13 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = u12.M1(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f42900a = d;
                    obj.f42901b = i13;
                    obj.f42902c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i7 = i12;
                    if (obj.f42900a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i7 + 1;
                K1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        di.l4 l4Var = this.f34106e;
        if (z10) {
            v4.o.c(new yl0(this), true).c(l4Var);
        } else {
            l4Var.f();
        }
        boolean q10 = org.telegram.messenger.j10.i(i11).q();
        this.f34110s = !q10;
        if (!q10) {
            if (this.f34107f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f34107f = linearLayout;
                linearLayout.setOnClickListener(new h70(this, 11));
                this.f34107f.setOrientation(0);
                c8.ra.b(this.f34107f, 0.03f, 1.25f);
                org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
                int i14 = org.telegram.ui.ActionBar.n6.f29596o6;
                org.telegram.ui.ActionBar.i6 i6Var = this.f34105c;
                org.telegram.ui.ActionBar.u6.U(r9Var, i14, i6Var);
                r9Var.setTextSize(1, 12.0f);
                r9Var.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232245).mutate();
                int i15 = org.telegram.ui.ActionBar.n6.Xc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
                lq lqVar = new lq(0, mutate);
                lqVar.f37199s = 0.0f;
                lqVar.f37198r = 0.0f;
                lqVar.I = 0.94f;
                lqVar.J = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(lqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.gd.M0(2131754379, null));
                r9Var.setText(spannableStringBuilder);
                r9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.u6.U(textView, i14, i6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131754378, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232061).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
                lq lqVar2 = new lq(0, mutate2);
                lqVar2.I = 0.76f;
                lqVar2.J = 0.76f;
                lqVar2.f37198r = -org.telegram.messenger.g0.L(1.0f);
                lqVar2.f37199s = org.telegram.messenger.g0.L(1.0f);
                spannableString2.setSpan(lqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                this.f34107f.addView(r9Var, c8.ma.r(-2, -2, 16));
                this.f34107f.addView(textView, c8.ma.r(-2, -2, 16));
                this.f34107f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
                this.f34107f.setClipToPadding(false);
                addView(this.f34107f, c8.ma.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f34107f.setVisibility(0);
                this.f34107f.setAlpha(0.0f);
                this.f34107f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f34107f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new gb0(this, 21)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f34107f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f34103a;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.j3);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25145k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f34103a;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.j3);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25145k4);
    }

    public void setShown(float f10) {
        this.F = f10;
        di.b1 b1Var = this.d;
        b1Var.setPivotX(b1Var.getWidth() / 2.0f);
        b1Var.setPivotY(0.0f);
        b1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        b1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
