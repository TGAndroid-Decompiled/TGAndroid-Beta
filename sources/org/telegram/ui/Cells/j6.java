package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mx0;
public abstract class j6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f22090a;
    public final TextView f22091b;
    public final tp f22092c;
    public final v2 d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f22093f;
    public final t80 h;
    public boolean f22094n;

    public j6(org.telegram.ui.ActionBar.k2 k2Var) {
        super(k2Var.getContext());
        gr grVar = gr.h;
        this.f22093f = new org.telegram.ui.Components.t5(320L, grVar);
        this.f22094n = false;
        Context context = k2Var.getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        this.f22090a = resourceProvider;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        addView(f7, w7.b6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f22091b = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(dd.L0(2131746700, null));
        f7.addView(textView, w7.b6.r(-2, -2, 51));
        tp tpVar = new tp(context);
        this.f22092c = tpVar;
        tpVar.getDrawable().r(true, true);
        tpVar.b(0.3f, 165L, grVar);
        tpVar.setTypeface(org.telegram.messenger.i0.o());
        tpVar.setTextSize(org.telegram.messenger.i0.L(11.0f));
        tpVar.setPadding(org.telegram.messenger.i0.L(4.33f), 0, org.telegram.messenger.i0.L(4.33f), 0);
        tpVar.setGravity(3);
        f7.addView(tpVar, w7.b6.t(-1, 17, 51, 4, 1, 4, 0));
        v2 v2Var = new v2(null, context, true, e20.f15506s0, resourceProvider);
        this.d = v2Var;
        v2Var.setBackgroundColor(0);
        v2Var.setDialogCellDelegate(new f6((mx0) this, k2Var, context));
        v2Var.H = 15;
        v2Var.I = 83;
        addView(v2Var, w7.b6.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        t80 t80Var = new t80();
        this.h = t80Var;
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        t80Var.f(org.telegram.ui.ActionBar.t6.r1(1.25f, org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.w0(i10, resourceProvider)));
        t80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f7;
        float f10;
        String S;
        boolean z11;
        float f11;
        boolean z12 = this.f22094n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        tp tpVar = this.f22092c;
        tpVar.a();
        float f12 = 0.0f;
        tpVar.setPivotX(0.0f);
        float f13 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = tpVar.animate();
            if (z10) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f13 = 0.8f;
            }
            scaleX.scaleY(f13).setDuration(420L).setInterpolator(gr.h).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            tpVar.setAlpha(f7);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            tpVar.setScaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            tpVar.setScaleY(f12);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.i0.C1()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                S = String.valueOf(i10);
            } else {
                S = dd.S(iArr, chat.participants_count);
            }
            tpVar.c(dd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.e = z11;
            v2 v2Var = this.d;
            if (z11) {
                v2Var.d0(-chat.f19794id, null, 0, false, z12);
            } else {
                kj kjVar = (kj) i0.a.g(1, arrayList);
                long j10 = -chat.f19794id;
                int i11 = kjVar.f16690k.date;
                if (v2Var.H0 != j10) {
                    v2Var.f23295x4 = -1;
                }
                v2Var.H0 = j10;
                v2Var.B4 = System.currentTimeMillis();
                v2Var.f23200f1 = kjVar;
                v2Var.f23276u2 = false;
                v2Var.N0 = false;
                v2Var.R0 = i11;
                int i12 = kjVar.f16690k.edit_date;
                v2Var.S0 = 0;
                v2Var.T0 = false;
                v2Var.l1 = kjVar.f1();
                v2Var.U0 = 0;
                v2Var.V0 = 0;
                v2Var.W0 = 0;
                v2Var.X0 = kjVar.F4();
                v2Var.f23205g1 = arrayList;
                kj kjVar2 = v2Var.f23200f1;
                if (kjVar2 != null) {
                    v2Var.Y0 = kjVar2.f16690k.send_state;
                }
                v2Var.i0(0, z12);
            }
        }
        if (!z12) {
            this.f22093f.f(this.e, true);
        }
        invalidate();
        this.f22094n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f22093f.d(this.e);
        if (d > 0.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            v2 v2Var = this.d;
            rectF.set(v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(38.0f), (getWidth() * 0.5f) + v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(46.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            rectF.set(v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(56.0f), (getWidth() * 0.36f) + v2Var.getX() + org.telegram.messenger.i0.L(v2Var.I + 6), v2Var.getY() + org.telegram.messenger.i0.L(64.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            rectF.set(((v2Var.getX() + v2Var.getWidth()) - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(43.0f), v2Var.getY() + org.telegram.messenger.i0.L(12.0f), (v2Var.getX() + v2Var.getWidth()) - org.telegram.messenger.i0.L(16.0f), v2Var.getY() + org.telegram.messenger.i0.L(20.33f));
            t80Var.e(rectF);
            t80Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.f22090a);
        RectF rectF = ProfileActivity.S6;
        tp tpVar = this.f22092c;
        tpVar.setTextColor(w02);
        tpVar.setBackground(org.telegram.ui.ActionBar.t6.e0(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, w02)));
        this.f22091b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
