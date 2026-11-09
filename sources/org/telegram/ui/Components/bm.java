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
public final class bm extends vh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public yl J;
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
    public org.telegram.ui.ActionBar.g6 f32276n;
    public bi.q1 f32277r;
    public v4.b0 f32278s;
    public am f32279w;
    public UndoView f32280x;
    public TextView f32281y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bm.B(int, int):void");
    }

    @Override
    public final void D(int i7) {
        di diVar = this.f39071b;
        if (i7 > 1) {
            diVar.U2.S(0);
        } else {
            diVar.U2.t(0);
        }
    }

    @Override
    public final void H(vh vhVar) {
        am amVar = this.f32279w;
        this.Q = true;
        if (vhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) vhVar;
            amVar.f31913c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            amVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            amVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            amVar.c();
            amVar.requestLayout();
            this.f32278s.h1(0, 0);
            this.f32277r.post(new f(26, this, vhVar));
            postDelayed(new xf(this, 26), 250L);
            amVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f32281y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f40458f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f32277r.y0(0);
    }

    @Override
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.f32279w.f31912b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((zl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                yl ylVar = (yl) obj2;
                RectF d = ylVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                ylVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = ylVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ylVar.v.recycle();
                }
                ylVar.v = createBitmap;
                ylVar.f40759w = 0.0f;
                ylVar.O.f41021z.invalidate();
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
        org.telegram.ui.an anVar = this.f39071b.f33034p1;
        boolean z9 = false;
        if (anVar != null && (m10 = anVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f22563q;
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
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f22563q.y + max);
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
        bi.q1 q1Var = this.f32277r;
        if (q1Var.getChildCount() <= 0) {
            q1Var.setTopGlowOffset(q1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = q1Var.getChildAt(0);
        yi0 yi0Var = (yi0) q1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || yi0Var == null || yi0Var.b() != 0) {
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
        return this.f32277r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        vl vlVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f32279w.f31912b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zl zlVar = (zl) arrayList2.get(i10);
            if (zlVar != null && (vlVar = zlVar.f41007k) != null && (arrayList = (ArrayList) vlVar.f39123f) != null) {
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
        this.f39071b.O1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        am amVar = this.f32279w;
        super.onLayout(z9, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T != z10) {
            this.T = z10;
            int size = amVar.f31912b.size();
            for (int i13 = 0; i13 < size; i13++) {
                zl zlVar = (zl) amVar.f31912b.get(i13);
                if (((ArrayList) zlVar.f41007k.f39123f).size() == 1) {
                    zl.a(zlVar, zlVar.f41007k, true);
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
        UndoView undoView = this.f32280x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f32279w.f31912b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((zl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                yl ylVar = (yl) obj2;
                if (ylVar.f40743e && (gfVar = ylVar.f40741b) != null) {
                    gfVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        di diVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f32281y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.f40461j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (diVar = this.f39071b).f32987a2) != null) {
            chatAttachAlertPhotoLayout.f31203c1.setIcon(2131232420);
            diVar.f32987a2.f31203c1.setText(org.telegram.messenger.id.M0(2131753957, null));
            diVar.f32987a2.f31203c1.setRightIcon(2131232059);
        }
        this.f32279w.i(this.P, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f39071b.f32987a2.w(i7);
        } catch (Exception unused) {
        }
    }
}
