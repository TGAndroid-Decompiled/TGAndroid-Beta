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
public abstract class sm0 extends FrameLayout implements org.telegram.messenger.vs {
    public static org.telegram.ui.ActionBar.x1 H;
    public final long D;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f30335a;
    public final org.telegram.ui.ActionBar.k2 f30336b;
    public final org.telegram.ui.ActionBar.p6 f30337c;
    public final ag.b1 d;
    public final kg.f e;
    public LinearLayout f30338f;
    public long h;
    public final ArrayList f30339n;
    public final ArrayList f30340r;
    public boolean f30341s;
    public tg.b f30342w;
    public wg.d f30343x;
    public final Paint f30344y;

    public sm0(Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f30339n = new ArrayList();
        this.f30340r = new ArrayList();
        this.f30344y = new Paint(1);
        this.f30335a = i10;
        this.f30336b = k2Var;
        this.f30337c = p6Var;
        this.D = j10;
        sg.p0.n(p6Var);
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 19);
        this.d = b1Var;
        b1Var.setPadding(org.telegram.messenger.i0.L(5.66f), 0, org.telegram.messenger.i0.L(5.66f), 0);
        b1Var.setClipToPadding(false);
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(0);
        b1Var.setLayoutManager(a0Var);
        kg.f fVar = new kg.f(this, 4);
        this.e = fVar;
        b1Var.setAdapter(fVar);
        b1Var.setOverScrollMode(2);
        addView(b1Var, w7.b6.c(-1.0f, -1));
        b1Var.setOnItemClickListener(new kg.o1(this, i10, k2Var, 1));
        b1Var.setOnItemLongClickListener(new mg.i0(this, i10, k2Var, p6Var, 4));
        s4.j jVar = new s4.j();
        jVar.o(gr.h);
        jVar.n(320L);
        b1Var.setItemAnimator(jVar);
        org.telegram.messenger.vi.b0(i10).Z0(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.p6 p6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        CharSequence charSequence;
        int i11;
        ?? r10;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = org.telegram.messenger.i0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof vu0) && ((vu0) Q.getFragmentView()).Q() > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String J1 = org.telegram.messenger.wp.r1(i10).J1(reaction);
        sg.o0 d = sg.o0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.i0.L(20));
        if (!TextUtils.isEmpty(d.f48445f)) {
            charSequence = org.telegram.messenger.k6.m(d.f48445f, textPaint.getFontMetricsInt(), false, null, 0);
            z11 = z10;
        } else {
            SpannableString spannableString = new SpannableString("😀");
            z11 = z10;
            spannableString.setSpan(new o5(d.f48446g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(J1)) {
            i11 = 2131745898;
        } else {
            i11 = 2131745886;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) org.telegram.messenger.dd.L0(i11, null));
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20135a;
        x1Var.R = append2;
        final mm0 mm0Var = new mm0(context, p6Var);
        mm0Var.setOnEditorActionListener(new nm0(mm0Var, i10, reaction, x1VarArr, view));
        org.telegram.messenger.vi.b0(i10).M(org.telegram.messenger.i0.G0(), true);
        mm0Var.setTextSize(1, 18.0f);
        if (J1 == null) {
            J1 = "";
        }
        mm0Var.setText(J1);
        int i12 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(mm0Var, i12, p6Var);
        org.telegram.ui.ActionBar.a7.m(mm0Var, 34, org.telegram.ui.ActionBar.t6.Li, p6Var);
        mm0Var.setHintText(org.telegram.messenger.dd.L0(2131745899, null));
        mm0Var.setSingleLine(true);
        mm0Var.setFocusable(true);
        mm0Var.setInputType(16384);
        org.telegram.ui.ActionBar.a7.G(mm0Var, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, p6Var);
        mm0Var.setImeOptions(6);
        mm0Var.setBackgroundDrawable(null);
        mm0Var.setPadding(0, 0, org.telegram.messenger.i0.L(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.dd.L0(2131745897, null));
        f7.addView(textView, w7.b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(mm0Var, w7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f7);
        x1Var.f21469a = org.telegram.messenger.i0.L(292.0f);
        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131745963, null), new ag.b0(mm0Var, i10, reaction, 8));
        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), new au(17));
        if (z11) {
            H = x1Var;
            r10 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new r0(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            org.telegram.messenger.i0.J3(mm0Var2);
                            return;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            org.telegram.messenger.i0.J3(mm0Var3);
                            return;
                    }
                }
            });
            H.r(250L);
        } else {
            r10 = 0;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new r0(mm0Var, 9));
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            org.telegram.messenger.i0.J3(mm0Var2);
                            return;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            org.telegram.messenger.i0.J3(mm0Var3);
                            return;
                    }
                }
            });
            x1VarArr[0].show();
        }
        x1VarArr[r10].f21491j0 = r10;
        mm0Var.setSelection(mm0Var.getText().length());
    }

    public final boolean a() {
        if (this.f30340r.isEmpty() && !this.f30341s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(tg.b bVar, wg.d dVar) {
        this.f30342w = bVar;
        this.f30343x = dVar;
        float N = org.telegram.messenger.i0.N(1.0f);
        Paint paint = this.f30344y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f30338f;
        if (view != null) {
            vg.f c10 = bVar.c(view, null, false);
            c10.o(w7.b9.p(this.f30337c));
            c10.r(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(9.0f));
            c10.t(org.telegram.messenger.i0.L(5.0f));
            c10.p(org.telegram.messenger.i0.L(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14719h3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.D) {
                h(true);
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            invalidate();
            org.telegram.messenger.i0.d0(this.d, new ag.z0(2));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f30338f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f30338f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(sg.o0 o0Var, boolean z10) {
        kg.f fVar = this.e;
        if (o0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            fVar.f();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30340r;
            if (i10 < arrayList.size()) {
                long j10 = o0Var.h;
                sg.o0 o0Var2 = ((pm0) arrayList.get(i10)).f29453a;
                long j11 = o0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(o0Var2);
                    }
                    fVar.f();
                    this.d.v0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(sg.o0 o0Var);

    public final void g(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f10 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 15));
        this.G.setInterpolator(gr.h);
        this.G.setDuration(320L);
        this.G.addListener(new ha0(4, this, z10));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f30339n;
        arrayList.clear();
        ArrayList arrayList2 = this.f30340r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = this.f30335a;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i12);
        long j10 = this.D;
        TLRPC.TL_messages_savedReactionsTags H1 = r12.H1(j10, false);
        if (H1 != null) {
            int i13 = 0;
            z11 = false;
            while (i13 < H1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = H1.tags.get(i13);
                sg.o0 d = sg.o0.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = H1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j10 != 0 && tL_savedReactionTag.count <= 0)) {
                    i10 = i13;
                } else {
                    int i14 = tL_savedReactionTag.count;
                    if (i11 != 0) {
                        str = r12.J1(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f29453a = d;
                    obj.f29454b = i14;
                    obj.f29455c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i10 = i13;
                    if (obj.f29453a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i13 = i10 + 1;
                H1 = tL_messages_savedReactionsTags;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        kg.f fVar = this.e;
        if (z10) {
            s4.n.c(new om0(this), true).c(fVar);
        } else {
            fVar.f();
        }
        boolean q6 = org.telegram.messenger.e20.i(i12).q();
        this.f30341s = !q6;
        if (!q6) {
            if (this.f30338f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f30338f = linearLayout;
                linearLayout.setOnClickListener(new db0(this, 10));
                this.f30338f.setOrientation(0);
                w7.e6.b(this.f30338f, 0.03f, 1.25f);
                org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.t6.f21135o6;
                org.telegram.ui.ActionBar.p6 p6Var = this.f30337c;
                org.telegram.ui.ActionBar.a7.V(r9Var, i15, p6Var);
                r9Var.setTextSize(1, 12.0f);
                r9Var.setTypeface(org.telegram.messenger.i0.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232242).mutate();
                int i16 = org.telegram.ui.ActionBar.t6.Uc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                dq dqVar = new dq(0, mutate);
                dqVar.f25569s = 0.0f;
                dqVar.f25568r = 0.0f;
                dqVar.H = 0.94f;
                dqVar.I = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(dqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.dd.L0(2131754381, null));
                r9Var.setText(spannableStringBuilder);
                r9Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.a7.V(textView, i15, p6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(org.telegram.messenger.i0.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131754380, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232058).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                dq dqVar2 = new dq(0, mutate2);
                dqVar2.H = 0.76f;
                dqVar2.I = 0.76f;
                dqVar2.f25568r = -org.telegram.messenger.i0.L(1.0f);
                dqVar2.f25569s = org.telegram.messenger.i0.L(1.0f);
                spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(org.telegram.messenger.i0.L(5.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f));
                this.f30338f.addView(r9Var, w7.b6.r(-2, -2, 16));
                this.f30338f.addView(textView, w7.b6.r(-2, -2, 16));
                this.f30338f.setPadding(org.telegram.messenger.i0.L(7.0f), 0, 0, 0);
                this.f30338f.setClipToPadding(false);
                addView(this.f30338f, w7.b6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f30338f.setVisibility(0);
                this.f30338f.setAlpha(0.0f);
                this.f30338f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f30338f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new eb0(this, 23)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f30338f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f30335a;
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14719h3);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14726i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f30335a;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14719h3);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14726i4);
    }

    public void setShown(float f7) {
        this.E = f7;
        ag.b1 b1Var = this.d;
        b1Var.setPivotX(b1Var.getWidth() / 2.0f);
        b1Var.setPivotY(0.0f);
        b1Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        b1Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
