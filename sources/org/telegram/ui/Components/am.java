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
public final class am extends th {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public xl K;
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
    public org.telegram.ui.ActionBar.e6 f31895n;
    public ci.j1 f31896r;
    public u4.b0 f31897s;
    public zl f31898w;
    public UndoView f31899x;
    public TextView f31900y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am.B(int, int):void");
    }

    @Override
    public final void D(int i3) {
        bi biVar = this.f38416b;
        if (i3 > 1) {
            biVar.V2.S(0);
        } else {
            biVar.V2.t(0);
        }
    }

    @Override
    public final void H(th thVar) {
        zl zlVar = this.f31898w;
        this.R = true;
        if (thVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) thVar;
            zlVar.f41064c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            zlVar.c();
            zlVar.requestLayout();
            this.f31897s.h1(0, 0);
            this.f31896r.post(new cl(1, this, thVar));
            postDelayed(new vf(this, 26), 250L);
            zlVar.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31900y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f40452f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f31896r.y0(0);
    }

    @Override
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.f31898w.f41063b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
                xlVar.f40408w = 0.0f;
                xlVar.O.f40783z.invalidate();
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
        Drawable m10;
        int i3;
        org.telegram.ui.um umVar = this.f38416b.f32262q1;
        boolean z10 = false;
        if (umVar != null && (m10 = umVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i3 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i3 = 6;
                } else {
                    i3 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i3);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f22608q.y + max);
            m10.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.f31896r;
        if (j1Var.getChildCount() <= 0) {
            j1Var.setTopGlowOffset(j1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        j1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31896r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        ul ulVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f31898w.f41063b;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList2.get(i10);
            if (ylVar != null && (ulVar = ylVar.f40769k) != null && (arrayList = (ArrayList) ulVar.f38818f) != null) {
                i3 = arrayList.size() + i3;
            }
        }
        return i3;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        this.f38416b.O1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        zl zlVar = this.f31898w;
        super.onLayout(z10, i3, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.U != z11) {
            this.U = z11;
            int size = zlVar.f41063b.size();
            for (int i13 = 0; i13 < size; i13++) {
                yl ylVar = (yl) zlVar.f41063b.get(i13);
                if (((ArrayList) ylVar.f40769k.f38818f).size() == 1) {
                    yl.a(ylVar, ylVar.f40769k, true);
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
        org.telegram.messenger.ye yeVar;
        this.K = null;
        UndoView undoView = this.f31899x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f31898w.f41063b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                if (xlVar.f40392e && (yeVar = xlVar.f40390b) != null) {
                    yeVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        bi biVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31900y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.f40455j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (biVar = this.f38416b).f32215b2) != null) {
            chatAttachAlertPhotoLayout.f31270d1.setIcon(2131232420);
            biVar.f32215b2.f31270d1.setText(org.telegram.messenger.bd.M0(2131753957, null));
            biVar.f32215b2.f31270d1.setRightIcon(2131232059);
        }
        this.f31898w.i(this.Q, true);
    }

    @Override
    public final void w(int i3) {
        try {
            this.f38416b.f32215b2.w(i3);
        } catch (Exception unused) {
        }
    }
}
