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
public abstract class tl0 extends FrameLayout implements org.telegram.messenger.cs {
    public static org.telegram.ui.ActionBar.s1 I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int f38485a;
    public final org.telegram.ui.ActionBar.d2 f38486b;
    public final org.telegram.ui.ActionBar.e6 f38487c;
    public final ci.j1 d;
    public final ci.r4 f38488e;
    public LinearLayout f38489f;
    public long h;
    public final ArrayList f38490n;
    public final ArrayList f38491r;
    public boolean f38492s;
    public eh.c f38493w;
    public hh.e f38494x;
    public final Paint f38495y;

    public tl0(Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38490n = new ArrayList();
        this.f38491r = new ArrayList();
        this.f38495y = new Paint(1);
        this.f38485a = i3;
        this.f38486b = d2Var;
        this.f38487c = e6Var;
        this.E = j10;
        dh.o0.n(e6Var);
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 24);
        this.d = j1Var;
        j1Var.setPadding(org.telegram.messenger.g0.L(5.66f), 0, org.telegram.messenger.g0.L(5.66f), 0);
        j1Var.setClipToPadding(false);
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        j1Var.setLayoutManager(b0Var);
        ci.r4 r4Var = new ci.r4(this, 4);
        this.f38488e = r4Var;
        j1Var.setAdapter(r4Var);
        j1Var.setOverScrollMode(2);
        addView(j1Var, b8.mf.c(-1.0f, -1));
        j1Var.setOnItemClickListener(new ll0(this, i3, d2Var, 0));
        j1Var.setOnItemLongClickListener(new cg.e0(this, i3, d2Var, e6Var, 4));
        u4.k kVar = new u4.k();
        kVar.o(xq.h);
        kVar.n(320L);
        j1Var.setItemAnimator(kVar);
        org.telegram.messenger.li.b0(i3).Z0(false);
        h(false);
    }

    public static void c(Context context, int i3, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e6 e6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String K1 = org.telegram.messenger.hp.s1(i3).K1(reaction);
        dh.n0 d = dh.n0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20));
        if (!TextUtils.isEmpty(d.f9097f)) {
            charSequence = org.telegram.messenger.i6.m(d.f9097f, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new p5(d.f9098g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(K1)) {
            i10 = 2131745891;
        } else {
            i10 = 2131745879;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) org.telegram.messenger.bd.M0(i10, null));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
        s1Var.S = append2;
        final nl0 nl0Var = new nl0(context, e6Var);
        nl0Var.setOnEditorActionListener(new ol0(nl0Var, i3, reaction, s1VarArr, view));
        org.telegram.messenger.li.b0(i3).M(org.telegram.messenger.g0.G0(), true);
        nl0Var.setTextSize(1, 18.0f);
        if (K1 == null) {
            K1 = "";
        }
        nl0Var.setText(K1);
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(nl0Var, i11, e6Var);
        org.telegram.ui.ActionBar.r6.m(nl0Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        nl0Var.setHintText(org.telegram.messenger.bd.M0(2131745892, null));
        nl0Var.setSingleLine(true);
        nl0Var.setFocusable(true);
        nl0Var.setInputType(16384);
        org.telegram.ui.ActionBar.r6.G(nl0Var, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
        nl0Var.setImeOptions(6);
        nl0Var.setBackgroundDrawable(null);
        nl0Var.setPadding(0, 0, org.telegram.messenger.g0.L(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131745890, null));
        f10.addView(textView, b8.mf.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(nl0Var, b8.mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f10);
        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131745956, null), new k2.y(nl0Var, i3, reaction, 9));
        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(1));
        if (z10) {
            I = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new p0(view, 8));
            I.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            nl0 nl0Var2 = nl0Var;
                            nl0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var2);
                            return;
                        default:
                            nl0 nl0Var3 = nl0Var;
                            nl0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var3);
                            return;
                    }
                }
            });
            I.r(250L);
        } else {
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new p0(nl0Var, 9));
            s1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            nl0 nl0Var2 = nl0Var;
                            nl0Var2.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var2);
                            return;
                        default:
                            nl0 nl0Var3 = nl0Var;
                            nl0Var3.requestFocus();
                            org.telegram.messenger.g0.K3(nl0Var3);
                            return;
                    }
                }
            });
            s1VarArr[0].show();
        }
        s1VarArr[0].f28548k0 = false;
        nl0Var.setSelection(nl0Var.getText().length());
    }

    public final boolean a() {
        if (this.f38491r.isEmpty() && !this.f38492s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(eh.c cVar, hh.e eVar) {
        this.f38493w = cVar;
        this.f38494x = eVar;
        float N = org.telegram.messenger.g0.N(1.0f);
        Paint paint = this.f38495y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f38489f;
        if (view != null) {
            gh.g c2 = cVar.c(view, null, false);
            c2.p(b8.cd.p(this.f38487c));
            c2.s(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(9.0f));
            c2.u(org.telegram.messenger.g0.L(5.0f));
            c2.q(org.telegram.messenger.g0.L(4.0f));
            view.setBackground(c2);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23240h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            invalidate();
            org.telegram.messenger.g0.d0(this.d, new ei.e(27));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f38489f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f38489f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(dh.n0 n0Var, boolean z10) {
        ci.r4 r4Var = this.f38488e;
        if (n0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            r4Var.f();
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f38491r;
            if (i3 < arrayList.size()) {
                long j10 = n0Var.h;
                dh.n0 n0Var2 = ((ql0) arrayList.get(i3)).f37490a;
                long j11 = n0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(n0Var2);
                    }
                    r4Var.f();
                    this.d.v0(i3);
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(dh.n0 n0Var);

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
        ofFloat.addUpdateListener(new y50(this, 15));
        this.H.setInterpolator(xq.h);
        this.H.setDuration(320L);
        this.H.addListener(new s9(18, this, z10));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z10) {
        boolean z11;
        int i3;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f38490n;
        arrayList.clear();
        ArrayList arrayList2 = this.f38491r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f38485a;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i11);
        long j10 = this.E;
        TLRPC.TL_messages_savedReactionsTags I1 = s12.I1(j10, false);
        if (I1 != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < I1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = I1.tags.get(i12);
                dh.n0 d = dh.n0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = I1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j10 != 0 && tL_savedReactionTag.count <= 0)) {
                    i3 = i12;
                } else {
                    int i13 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = s12.K1(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f37490a = d;
                    obj.f37491b = i13;
                    obj.f37492c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i3 = i12;
                    if (obj.f37490a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i3 + 1;
                I1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        ci.r4 r4Var = this.f38488e;
        if (z10) {
            u4.o.c(new pl0(this), true).c(r4Var);
        } else {
            r4Var.f();
        }
        boolean q10 = org.telegram.messenger.h10.i(i11).q();
        this.f38492s = !q10;
        if (!q10) {
            if (this.f38489f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f38489f = linearLayout;
                linearLayout.setOnClickListener(new ga0(this, 10));
                this.f38489f.setOrientation(0);
                b8.pf.b(this.f38489f, 0.03f, 1.25f);
                org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
                int i14 = org.telegram.ui.ActionBar.k6.f28081o6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f38487c;
                org.telegram.ui.ActionBar.r6.V(q9Var, i14, e6Var);
                q9Var.setTextSize(1, 12.0f);
                q9Var.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232243).mutate();
                int i15 = org.telegram.ui.ActionBar.k6.Uc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
                wp wpVar = new wp(0, mutate);
                wpVar.f40046s = 0.0f;
                wpVar.f40045r = 0.0f;
                wpVar.I = 0.94f;
                wpVar.J = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(wpVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.bd.M0(2131754381, null));
                q9Var.setText(spannableStringBuilder);
                q9Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.r6.V(textView, i14, e6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131754380, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232059).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
                wp wpVar2 = new wp(0, mutate2);
                wpVar2.I = 0.76f;
                wpVar2.J = 0.76f;
                wpVar2.f40045r = -org.telegram.messenger.g0.L(1.0f);
                wpVar2.f40046s = org.telegram.messenger.g0.L(1.0f);
                spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(org.telegram.messenger.g0.L(5.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f));
                this.f38489f.addView(q9Var, b8.mf.r(-2, -2, 16));
                this.f38489f.addView(textView, b8.mf.r(-2, -2, 16));
                this.f38489f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, 0, 0);
                this.f38489f.setClipToPadding(false);
                addView(this.f38489f, b8.mf.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f38489f.setVisibility(0);
                this.f38489f.setAlpha(0.0f);
                this.f38489f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f38489f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new jb0(this, 20)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f38489f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.f38485a;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23240h3);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.f38485a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23240h3);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23246i4);
    }

    public void setShown(float f10) {
        this.F = f10;
        ci.j1 j1Var = this.d;
        j1Var.setPivotX(j1Var.getWidth() / 2.0f);
        j1Var.setPivotY(0.0f);
        j1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        j1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
