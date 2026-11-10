package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
public final class am extends uh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public xl J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public Drawable N;
    public ViewPropertyAnimator O;
    public ChatAttachAlertPhotoLayout P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public org.telegram.ui.ActionBar.h6 f31879n;
    public bi.q1 f31880r;
    public v4.b0 f31881s;
    public zl f31882w;
    public UndoView f31883x;
    public TextView f31884y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am.B(int, int):void");
    }

    @Override
    public final void D(int i7) {
        ci ciVar = this.f38656b;
        if (i7 > 1) {
            ciVar.X2.S(0);
        } else {
            ciVar.X2.t(0);
        }
    }

    @Override
    public final void H(uh uhVar) {
        zl zlVar = this.f31882w;
        this.Q = true;
        if (uhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) uhVar;
            zlVar.f41055c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            zlVar.c();
            zlVar.requestLayout();
            this.f31881s.h1(0, 0);
            this.f31880r.post(new org.telegram.ui.fq(27, this, uhVar));
            postDelayed(new wf(this, 26), 250L);
            zlVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31884y.animate().alpha(1.0f).setDuration(150L).setInterpolator(wq.f40046f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f31880r.y0(0);
    }

    @Override
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.f31882w.f41054b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                RectF d = xlVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                xlVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = xlVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    xlVar.v.recycle();
                }
                xlVar.v = createBitmap;
                xlVar.f40346w = 0.0f;
                xlVar.O.f40617z.invalidate();
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable m10;
        int i7;
        org.telegram.ui.an anVar = this.f38656b.f32647s1;
        boolean z9 = false;
        if (anVar != null && (m10 = anVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i7 = 6;
                } else {
                    i7 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i7);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f22567q.y + max);
            m10.draw(canvas);
            z9 = true;
        }
        super.dispatchDraw(canvas);
        if (z9) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.f31880r;
        if (q1Var.getChildCount() <= 0) {
            q1Var.setTopGlowOffset(q1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        q1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31880r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        ul ulVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f31882w.f41054b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList2.get(i10);
            if (ylVar != null && (ulVar = ylVar.f40603k) != null && (arrayList = (ArrayList) ulVar.f38708f) != null) {
                i7 = arrayList.size() + i7;
            }
        }
        return i7;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        this.f38656b.O1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        zl zlVar = this.f31882w;
        super.onLayout(z9, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T != z10) {
            this.T = z10;
            int size = zlVar.f41054b.size();
            for (int i13 = 0; i13 < size; i13++) {
                yl ylVar = (yl) zlVar.f41054b.get(i13);
                if (((ArrayList) ylVar.f40603k.f38708f).size() == 1) {
                    yl.a(ylVar, ylVar.f40603k, true);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t() {
        org.telegram.messenger.gf gfVar;
        this.J = null;
        UndoView undoView = this.f31883x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f31882w.f41054b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                if (xlVar.f40330e && (gfVar = xlVar.f40328b) != null) {
                    gfVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ci ciVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31884y.animate().alpha(0.0f).setDuration(150L).setInterpolator(wq.f40049j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (ciVar = this.f38656b).d2) != null) {
            chatAttachAlertPhotoLayout.f31214c1.setIcon(2131232420);
            ciVar.d2.f31214c1.setText(org.telegram.messenger.id.M0(2131753957, null));
            ciVar.d2.f31214c1.setRightIcon(2131232059);
        }
        this.f31882w.i(this.P, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f38656b.d2.w(i7);
        } catch (Exception unused) {
        }
    }
}
