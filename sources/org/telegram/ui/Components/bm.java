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
    public org.telegram.ui.ActionBar.f6 f32170n;
    public bi.q1 f32171r;
    public v4.b0 f32172s;
    public am f32173w;
    public UndoView f32174x;
    public TextView f32175y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bm.B(int, int):void");
    }

    @Override
    public final void D(int i7) {
        di diVar = this.f38951b;
        if (i7 > 1) {
            diVar.U2.S(0);
        } else {
            diVar.U2.t(0);
        }
    }

    @Override
    public final void H(vh vhVar) {
        am amVar = this.f32173w;
        this.Q = true;
        if (vhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) vhVar;
            amVar.f31837c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            amVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            amVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            amVar.c();
            amVar.requestLayout();
            this.f32172s.h1(0, 0);
            this.f32171r.post(new f(26, this, vhVar));
            postDelayed(new xf(this, 26), 250L);
            amVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f32175y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f40310f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f32171r.y0(0);
    }

    @Override
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.f32173w.f31836b;
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
                ylVar.f40649w = 0.0f;
                ylVar.O.f41027z.invalidate();
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
        org.telegram.ui.ym ymVar = this.f38951b.f32929p1;
        boolean z9 = false;
        if (ymVar != null && (m10 = ymVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f22537q;
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
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f22537q.y + max);
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
        bi.q1 q1Var = this.f32171r;
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
        return this.f32171r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        vl vlVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f32173w.f31836b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zl zlVar = (zl) arrayList2.get(i10);
            if (zlVar != null && (vlVar = zlVar.f41013k) != null && (arrayList = (ArrayList) vlVar.f38982f) != null) {
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
        this.f38951b.O1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        am amVar = this.f32173w;
        super.onLayout(z9, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T != z10) {
            this.T = z10;
            int size = amVar.f31836b.size();
            for (int i13 = 0; i13 < size; i13++) {
                zl zlVar = (zl) amVar.f31836b.get(i13);
                if (((ArrayList) zlVar.f41013k.f38982f).size() == 1) {
                    zl.a(zlVar, zlVar.f41013k, true);
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
        UndoView undoView = this.f32174x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f32173w.f31836b;
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
                if (ylVar.f40633e && (gfVar = ylVar.f40631b) != null) {
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
        ViewPropertyAnimator interpolator = this.f32175y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.f40313j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (diVar = this.f38951b).f32882a2) != null) {
            chatAttachAlertPhotoLayout.f31193c1.setIcon(2131232420);
            diVar.f32882a2.f31193c1.setText(org.telegram.messenger.hd.M0(2131753957, null));
            diVar.f32882a2.f31193c1.setRightIcon(2131232059);
        }
        this.f32173w.i(this.P, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f38951b.f32882a2.w(i7);
        } catch (Exception unused) {
        }
    }
}
