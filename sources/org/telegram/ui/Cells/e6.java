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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.up;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zv0;
public abstract class e6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f30181a;
    public final TextView f30182b;
    public final up f30183c;
    public final t2 d;
    public boolean f30184e;
    public final org.telegram.ui.Components.u5 f30185f;
    public final d80 h;
    public boolean f30186n;

    public e6(org.telegram.ui.ActionBar.e2 e2Var) {
        super(e2Var.getContext());
        er erVar = er.h;
        this.f30185f = new org.telegram.ui.Components.u5(320L, erVar);
        this.f30186n = false;
        Context context = e2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        this.f30181a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ja.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f30182b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(hd.M0(2131746685, null));
        f10.addView(textView, c8.ja.r(-2, -2, 51));
        up upVar = new up(context);
        this.f30183c = upVar;
        upVar.getDrawable().r(true, true);
        upVar.b(0.3f, 165L, erVar);
        upVar.setTypeface(org.telegram.messenger.g0.o());
        upVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        upVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        upVar.setGravity(3);
        f10.addView(upVar, c8.ja.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, m10.f24940t0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new a6((zv0) this, e2Var, context));
        t2Var.I = 15;
        t2Var.J = 83;
        addView(t2Var, c8.ja.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        d80 d80Var = new d80();
        this.h = d80Var;
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        d80Var.f(org.telegram.ui.ActionBar.j6.r1(1.25f, org.telegram.ui.ActionBar.j6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.w0(i7, resourceProvider)));
        d80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z10;
        float f10;
        float f11;
        String S;
        boolean z11;
        float f12;
        boolean z12 = this.f30186n;
        if (chat != null && chat.participants_count <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        up upVar = this.f30183c;
        upVar.a();
        float f13 = 0.0f;
        upVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z12) {
            ViewPropertyAnimator animate = upVar.animate();
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
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(er.h).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            upVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            upVar.setScaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            upVar.setScaleY(f13);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (org.telegram.messenger.g0.C1()) {
                int i7 = chat.participants_count;
                iArr[0] = i7;
                S = String.valueOf(i7);
            } else {
                S = hd.S(iArr, chat.participants_count);
            }
            upVar.c(hd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f30184e = z11;
            t2 t2Var = this.d;
            if (z11) {
                t2Var.f0(-chat.f28051id, null, 0, false, z12);
            } else {
                gj gjVar = (gj) i5.c.h(1, arrayList);
                long j3 = -chat.f28051id;
                int i10 = gjVar.f23819k.date;
                if (t2Var.I0 != j3) {
                    t2Var.f31667y4 = -1;
                }
                t2Var.I0 = j3;
                t2Var.C4 = System.currentTimeMillis();
                t2Var.f31573g1 = gjVar;
                t2Var.f31647v2 = false;
                t2Var.O0 = false;
                t2Var.S0 = i10;
                int i11 = gjVar.f23819k.edit_date;
                t2Var.T0 = 0;
                t2Var.U0 = false;
                t2Var.f31600m1 = gjVar.e1();
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = 0;
                t2Var.Y0 = gjVar.F4();
                t2Var.f31578h1 = arrayList;
                gj gjVar2 = t2Var.f31573g1;
                if (gjVar2 != null) {
                    t2Var.Z0 = gjVar2.f23819k.send_state;
                }
                t2Var.k0(0, z12);
            }
        }
        if (!z12) {
            this.f30185f.f(this.f30184e, true);
        }
        invalidate();
        this.f30186n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f30185f.d(this.f30184e);
        if (d > 0.0f) {
            d80 d80Var = this.h;
            d80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            d80Var.e(rectF);
            d80Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.J + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            d80Var.e(rectF);
            d80Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            d80Var.e(rectF);
            d80Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, this.f30181a);
        RectF rectF = ProfileActivity.X6;
        up upVar = this.f30183c;
        upVar.setTextColor(w02);
        upVar.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.j6.r1(0.1f, w02)));
        this.f30182b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
