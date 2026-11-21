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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bw0;
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f30701a;
    public final TextView f30702b;
    public final dq f30703c;
    public final u2 d;
    public boolean f30704e;
    public final org.telegram.ui.Components.d6 f30705f;
    public final q80 h;
    public boolean f30706n;

    public g6(org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getContext());
        nr nrVar = nr.h;
        this.f30705f = new org.telegram.ui.Components.d6(320L, nrVar);
        this.f30706n = false;
        Context context = g2Var.getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        this.f30701a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f30702b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(gd.N0(2131746489, null));
        g10.addView(textView, c8.ma.r(-2, -2, 51));
        dq dqVar = new dq(context);
        this.f30703c = dqVar;
        dqVar.getDrawable().r(true, true);
        dqVar.b(0.3f, 165L, nrVar);
        dqVar.setTypeface(org.telegram.messenger.g0.o());
        dqVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        dqVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        dqVar.setGravity(3);
        g10.addView(dqVar, c8.ma.t(-1, 17, 51, 4, 1, 4, 0));
        u2 u2Var = new u2(null, context, true, j10.f24798t0, resourceProvider);
        this.d = u2Var;
        u2Var.setBackgroundColor(0);
        u2Var.setDialogCellDelegate(new c6((bw0) this, g2Var, context));
        u2Var.I = 15;
        u2Var.J = 83;
        addView(u2Var, c8.ma.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        q80 q80Var = new q80();
        this.h = q80Var;
        int i7 = org.telegram.ui.ActionBar.m6.f29470i6;
        q80Var.f(org.telegram.ui.ActionBar.m6.r1(1.25f, org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.w0(i7, resourceProvider)));
        q80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f10;
        float f11;
        String S;
        boolean z11;
        float f12;
        boolean z12 = this.f30706n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        dq dqVar = this.f30703c;
        dqVar.a();
        float f13 = 0.0f;
        dqVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = dqVar.animate();
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
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(nr.h).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            dqVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            dqVar.setScaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            dqVar.setScaleY(f13);
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
            dqVar.c(gd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f30704e = z11;
            u2 u2Var = this.d;
            if (z11) {
                u2Var.d0(-chat.f28431id, null, 0, false, z12);
            } else {
                fj fjVar = (fj) i5.c.h(1, arrayList);
                long j3 = -chat.f28431id;
                int i10 = fjVar.f23993k.date;
                if (u2Var.I0 != j3) {
                    u2Var.f32045y4 = -1;
                }
                u2Var.I0 = j3;
                u2Var.C4 = System.currentTimeMillis();
                u2Var.f31951g1 = fjVar;
                u2Var.f32025v2 = false;
                u2Var.O0 = false;
                u2Var.S0 = i10;
                int i11 = fjVar.f23993k.edit_date;
                u2Var.T0 = 0;
                u2Var.U0 = false;
                u2Var.f31978m1 = fjVar.e1();
                u2Var.V0 = 0;
                u2Var.W0 = 0;
                u2Var.X0 = 0;
                u2Var.Y0 = fjVar.F4();
                u2Var.f31956h1 = arrayList;
                fj fjVar2 = u2Var.f31951g1;
                if (fjVar2 != null) {
                    u2Var.Z0 = fjVar2.f23993k.send_state;
                }
                u2Var.i0(0, z12);
            }
        }
        if (!z12) {
            this.f30705f.f(this.f30704e, true);
        }
        invalidate();
        this.f30706n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f30705f.d(this.f30704e);
        if (d > 0.0f) {
            q80 q80Var = this.h;
            q80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            u2 u2Var = this.d;
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            rectF.set(u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + u2Var.getX() + org.telegram.messenger.g0.L(u2Var.J + 6), u2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            rectF.set(((u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), u2Var.getY() + org.telegram.messenger.g0.L(12.0f), (u2Var.getX() + u2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), u2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            q80Var.e(rectF);
            q80Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.f30701a);
        RectF rectF = ProfileActivity.Z6;
        dq dqVar = this.f30703c;
        dqVar.setTextColor(w02);
        dqVar.setBackground(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, w02)));
        this.f30702b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
