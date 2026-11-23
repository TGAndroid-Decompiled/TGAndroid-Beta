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
public final class rm extends mi {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public om K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Drawable O;
    public ViewPropertyAnimator P;
    public ChatAttachAlertPhotoLayout Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public org.telegram.ui.ActionBar.h6 f39234n;
    public di.b1 f39235r;
    public v4.b0 f39236s;
    public qm f39237w;
    public UndoView f39238x;
    public TextView f39239y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.B(int, int):void");
    }

    @Override
    public final void E(int i7) {
        ui uiVar = this.f37477b;
        if (i7 > 1) {
            uiVar.Y2.T(0);
        } else {
            uiVar.Y2.u(0);
        }
    }

    @Override
    public final void I(mi miVar) {
        qm qmVar = this.f39237w;
        this.R = true;
        if (miVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) miVar;
            qmVar.f38898c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            qmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            qmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            qmVar.c();
            qmVar.requestLayout();
            this.f39236s.h1(0, 0);
            this.f39235r.post(new og(16, this, miVar));
            postDelayed(new ng(this, 28), 250L);
            qmVar.i(this.Q, false);
        } else {
            K();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f39239y.animate().alpha(1.0f).setDuration(150L).setInterpolator(nr.f37917f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override
    public final void K() {
        this.f39235r.y0(0);
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final void P() {
        ArrayList arrayList = this.f39237w.f38897b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((pm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                om omVar = (om) obj2;
                RectF d = omVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                omVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = omVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    omVar.v.recycle();
                }
                omVar.v = createBitmap;
                omVar.f38273w = 0.0f;
                omVar.O.f38593z.invalidate();
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable c10;
        int i7;
        org.telegram.ui.zm zmVar = this.f37477b.f40412t1;
        boolean z10 = false;
        if (zmVar != null && (c10 = zmVar.c()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i7 = 6;
                } else {
                    i7 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i7);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            c10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f24010q.y + max);
            c10.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        di.b1 b1Var = this.f39235r;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f39235r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f24010q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        lm lmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f39237w.f38897b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            pm pmVar = (pm) arrayList2.get(i10);
            if (pmVar != null && (lmVar = pmVar.f38579k) != null && (arrayList = (ArrayList) lmVar.f37197f) != null) {
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
        this.f37477b.P1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        qm qmVar = this.f39237w;
        super.onLayout(z10, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f24010q;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.U != z11) {
            this.U = z11;
            int size = qmVar.f38897b.size();
            for (int i13 = 0; i13 < size; i13++) {
                pm pmVar = (pm) qmVar.f38897b.get(i13);
                if (((ArrayList) pmVar.f38579k.f37197f).size() == 1) {
                    pm.a(pmVar, pmVar.f38579k, true);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t() {
        org.telegram.messenger.ff ffVar;
        this.K = null;
        UndoView undoView = this.f39238x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f39237w.f38897b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((pm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                om omVar = (om) obj2;
                if (omVar.f38257e && (ffVar = omVar.f38255b) != null) {
                    ffVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ui uiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f39239y.animate().alpha(0.0f).setDuration(150L).setInterpolator(nr.f37920j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (uiVar = this.f37477b).f40363e2) != null) {
            chatAttachAlertPhotoLayout.f32776d1.setIcon(2131232422);
            uiVar.f40363e2.f32776d1.setText(org.telegram.messenger.hd.N0(2131753954, null));
            uiVar.f40363e2.f32776d1.setRightIcon(2131232061);
        }
        this.f39237w.i(this.Q, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f37477b.f40363e2.w(i7);
        } catch (Exception unused) {
        }
    }
}
