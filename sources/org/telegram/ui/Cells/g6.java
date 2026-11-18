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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f30673a;
    public final TextView f30674b;
    public final bq f30675c;
    public final u2 d;
    public boolean f30676e;
    public final org.telegram.ui.Components.c6 f30677f;
    public final o80 h;
    public boolean f30678n;

    public g6(org.telegram.ui.ActionBar.h2 h2Var) {
        super(h2Var.getContext());
        lr lrVar = lr.h;
        this.f30677f = new org.telegram.ui.Components.c6(320L, lrVar);
        this.f30678n = false;
        Context context = h2Var.getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        this.f30673a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f30674b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(gd.M0(2131746490, null));
        g10.addView(textView, c8.ma.r(-2, -2, 51));
        bq bqVar = new bq(context);
        this.f30675c = bqVar;
        bqVar.getDrawable().r(true, true);
        bqVar.b(0.3f, 165L, lrVar);
        bqVar.setTypeface(org.telegram.messenger.g0.o());
        bqVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        bqVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        bqVar.setGravity(3);
        g10.addView(bqVar, c8.ma.t(-1, 17, 51, 4, 1, 4, 0));
        u2 u2Var = new u2(null, context, true, j10.f24770t0, resourceProvider);
        this.d = u2Var;
        u2Var.setBackgroundColor(0);
        u2Var.setDialogCellDelegate(new c6((bw0) this, h2Var, context));
        u2Var.I = 15;
        u2Var.J = 83;
        addView(u2Var, c8.ma.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        o80 o80Var = new o80();
        this.h = o80Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29486i6;
        o80Var.f(org.telegram.ui.ActionBar.n6.r1(1.25f, org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.w0(i7, resourceProvider)));
        o80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f10;
        float f11;
        String S;
        boolean z11;
        float f12;
        boolean z12 = this.f30678n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        bq bqVar = this.f30675c;
        bqVar.a();
        float f13 = 0.0f;
        bqVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = bqVar.animate();
            if (z10) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f13);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (!z10) {
                f14 = 0.8f;
            }
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(lr.h).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            bqVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            bqVar.setScaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            bqVar.setScaleY(f13);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i7 = chat.participants_count;
                iArr[0] = i7;
                S = String.valueOf(i7);
            } else {
                S = gd.S(iArr, chat.participants_count);
            }
            bqVar.c(gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f30676e = z11;
            u2 u2Var = this.d;
            if (z11) {
                u2Var.d0(-chat.f28403id, null, 0, false, z12);
            } else {
                fj fjVar = (fj) i5.c.h(1, arrayList);
                long j3 = -chat.f28403id;
                int i10 = fjVar.f23965k.date;
                if (u2Var.I0 != j3) {
                    u2Var.f32017y4 = -1;
                }
                u2Var.I0 = j3;
                u2Var.C4 = System.currentTimeMillis();
                u2Var.f31923g1 = fjVar;
                u2Var.f31997v2 = false;
                u2Var.O0 = false;
                u2Var.S0 = i10;
                int i11 = fjVar.f23965k.edit_date;
                u2Var.T0 = 0;
                u2Var.U0 = false;
                u2Var.f31950m1 = fjVar.e1();
                u2Var.V0 = 0;
                u2Var.W0 = 0;
                u2Var.X0 = 0;
                u2Var.Y0 = fjVar.F4();
                u2Var.f31928h1 = arrayList;
                fj fjVar2 = u2Var.f31923g1;
                if (fjVar2 != null) {
                    u2Var.Z0 = fjVar2.f23965k.send_state;
                }
                u2Var.i0(0, z12);
            }
        }
        if (!z12) {
            this.f30677f.f(this.f30676e, true);
        }
        invalidate();
        this.f30678n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f30677f.d(this.f30676e);
        if (d > 0.0f) {
            o80 o80Var = this.h;
            o80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            u2 u2Var = this.d;
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            rectF.set(((u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), u2Var.getY() + org.telegram.messenger.g0.L(12.0f), (u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), u2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            o80Var.e(rectF);
            o80Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, this.f30673a);
        RectF rectF = ProfileActivity.Z6;
        bq bqVar = this.f30675c;
        bqVar.setTextColor(w02);
        bqVar.setBackground(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, w02)));
        this.f30674b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
