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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw0;
public abstract class f6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f29120a;
    public final TextView f29121b;
    public final mp f29122c;
    public final t2 d;
    public boolean f29123e;
    public final org.telegram.ui.Components.w5 f29124f;
    public final a80 h;
    public boolean f29125n;

    public f6(org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getContext());
        xq xqVar = xq.h;
        this.f29124f = new org.telegram.ui.Components.w5(320L, xqVar);
        this.f29125n = false;
        Context context = f2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        this.f29120a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.f29121b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(hd.M0(2131746684, null));
        f10.addView(textView, c8.ha.r(-2, -2, 51));
        mp mpVar = new mp(context);
        this.f29122c = mpVar;
        mpVar.getDrawable().r(true, true);
        mpVar.b(0.3f, 165L, xqVar);
        mpVar.setTypeface(org.telegram.messenger.g0.o());
        mpVar.setTextSize(org.telegram.messenger.g0.L(11.0f));
        mpVar.setPadding(org.telegram.messenger.g0.L(4.33f), 0, org.telegram.messenger.g0.L(4.33f), 0);
        mpVar.setGravity(3);
        f10.addView(mpVar, c8.ha.t(-1, 17, 51, 4, 1, 4, 0));
        t2 t2Var = new t2(null, context, true, p10.f24459s0, resourceProvider);
        this.d = t2Var;
        t2Var.setBackgroundColor(0);
        t2Var.setDialogCellDelegate(new b6((aw0) this, f2Var, context));
        t2Var.H = 15;
        t2Var.I = 83;
        addView(t2Var, c8.ha.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        a80 a80Var = new a80();
        this.h = a80Var;
        int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
        a80Var.f(org.telegram.ui.ActionBar.k6.r1(1.25f, org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider)), org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.w0(i7, resourceProvider)));
        a80Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z9;
        float f10;
        float f11;
        String S;
        boolean z10;
        float f12;
        boolean z11 = this.f29125n;
        if (chat != null && chat.participants_count <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        mp mpVar = this.f29122c;
        mpVar.a();
        float f13 = 0.0f;
        mpVar.setPivotX(0.0f);
        float f14 = 1.0f;
        if (z11) {
            ViewPropertyAnimator animate = mpVar.animate();
            if (z9) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f13);
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (!z9) {
                f14 = 0.8f;
            }
            scaleX.scaleY(f14).setDuration(420L).setInterpolator(xq.h).start();
        } else {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mpVar.setAlpha(f10);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            mpVar.setScaleX(f11);
            if (z9) {
                f13 = 1.0f;
            }
            mpVar.setScaleY(f13);
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
            mpVar.c(hd.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f29123e = z10;
            t2 t2Var = this.d;
            if (z10) {
                t2Var.d0(-chat.f26952id, null, 0, false, z11);
            } else {
                ij ijVar = (ij) jg.g.i(1, arrayList);
                long j3 = -chat.f26952id;
                int i10 = ijVar.f23237k.date;
                if (t2Var.H0 != j3) {
                    t2Var.f30504x4 = -1;
                }
                t2Var.H0 = j3;
                t2Var.B4 = System.currentTimeMillis();
                t2Var.f30411f1 = ijVar;
                t2Var.f30485u2 = false;
                t2Var.N0 = false;
                t2Var.R0 = i10;
                int i11 = ijVar.f23237k.edit_date;
                t2Var.S0 = 0;
                t2Var.T0 = false;
                t2Var.l1 = ijVar.f1();
                t2Var.U0 = 0;
                t2Var.V0 = 0;
                t2Var.W0 = 0;
                t2Var.X0 = ijVar.G4();
                t2Var.f30416g1 = arrayList;
                ij ijVar2 = t2Var.f30411f1;
                if (ijVar2 != null) {
                    t2Var.Y0 = ijVar2.f23237k.send_state;
                }
                t2Var.j0(0, z11);
            }
        }
        if (!z11) {
            this.f29124f.f(this.f29123e, true);
        }
        invalidate();
        this.f29125n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f29124f.d(this.f29123e);
        if (d > 0.0f) {
            a80 a80Var = this.h;
            a80Var.setAlpha((int) (d * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.d;
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(38.0f), (getWidth() * 0.5f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(46.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            rectF.set(t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(56.0f), (getWidth() * 0.36f) + t2Var.getX() + org.telegram.messenger.g0.L(t2Var.I + 6), t2Var.getY() + org.telegram.messenger.g0.L(64.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            rectF.set(((t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(43.0f), t2Var.getY() + org.telegram.messenger.g0.L(12.0f), (t2Var.getX() + t2Var.getWidth()) - org.telegram.messenger.g0.L(16.0f), t2Var.getY() + org.telegram.messenger.g0.L(20.33f));
            a80Var.e(rectF);
            a80Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.f29120a);
        RectF rectF = ProfileActivity.S6;
        mp mpVar = this.f29122c;
        mpVar.setTextColor(w02);
        mpVar.setBackground(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, w02)));
        this.f29121b.setTextColor(w02);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
