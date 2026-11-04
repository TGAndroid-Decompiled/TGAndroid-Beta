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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sv0;
public abstract class e6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f29125a;
    public final TextView f29126b;
    public final mp f29127c;
    public final t2 d;
    public boolean f29128e;
    public final org.telegram.ui.Components.u5 f29129f;
    public final w70 h;
    public boolean f29130n;

    public e6(org.telegram.ui.ActionBar.d2 d2Var) {
        super(d2Var.getContext());
        xq xqVar = xq.h;
        this.f29129f = new org.telegram.ui.Components.u5(320L, xqVar);
        this.f29130n = false;
        Context context = d2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        this.f29125a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, mf.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f29126b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(bd.M0(2131746693, null));
        f10.addView(textView, mf.r(-2, -2, 51));
        mp mpVar = new mp(context);
        this.f29127c = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.3f, 165L, xqVar);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        mpVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        mpVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        mpVar.setGravity(3);
        f10.addView(mpVar, mf.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, h10.f22829t0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new a6((sv0) this, d2Var, context));
        t2Var.I = 15;
        t2Var.J = 83;
        addView(t2Var, mf.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        w70 w70Var = new w70();
        this.h = w70Var;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        w70Var.f(org.telegram.ui.ActionBar.k6.r1(1.25f, org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider)), org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.w0(i3, resourceProvider)));
        w70Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f10;
        float f11;
        String S;
        boolean z11;
        float f12;
        boolean z12 = this.f29130n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        mp mpVar = this.f29127c;
        mpVar.a();
        float f13 = 0.0f;
        mpVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = mpVar.animate();
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
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(xq.h).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mpVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            mpVar.setScaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            mpVar.setScaleY(f13);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i3 = chat.participants_count;
                iArr[0] = i3;
                S = String.valueOf(i3);
            } else {
                S = bd.S(iArr, chat.participants_count);
            }
            mpVar.c(bd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f29128e = z11;
            t2 t2Var = this.d;
            if (z11) {
                t2Var.d0(-chat.f27001id, null, 0, false, z12);
            } else {
                zi ziVar = (zi) k2.p1.h(1, arrayList);
                long j10 = -chat.f27001id;
                int i10 = ziVar.f26868k.date;
                if (t2Var.I0 != j10) {
                    t2Var.f30591y4 = -1;
                }
                t2Var.I0 = j10;
                t2Var.C4 = System.currentTimeMillis();
                t2Var.f30497g1 = ziVar;
                t2Var.f30571v2 = false;
                t2Var.O0 = false;
                t2Var.S0 = i10;
                int i11 = ziVar.f26868k.edit_date;
                t2Var.T0 = 0;
                t2Var.U0 = false;
                t2Var.m1 = ziVar.f1();
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = 0;
                t2Var.Y0 = ziVar.G4();
                t2Var.f30502h1 = arrayList;
                zi ziVar2 = t2Var.f30497g1;
                if (ziVar2 != null) {
                    t2Var.Z0 = ziVar2.f26868k.send_state;
                }
                t2Var.i0(0, z12);
            }
        }
        if (!z12) {
            this.f29129f.f(this.f29128e, true);
        }
        invalidate();
        this.f29130n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f29129f.d(this.f29128e);
        if (d > 0.0f) {
            w70 w70Var = this.h;
            w70Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            w70Var.e(rectF);
            w70Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.f29125a);
        RectF rectF = ProfileActivity.T6;
        mp mpVar = this.f29127c;
        mpVar.setTextColor(w02);
        mpVar.setBackground(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, w02)));
        this.f29126b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
