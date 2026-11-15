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
public final class im extends ci {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public fm K;
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
    public org.telegram.ui.ActionBar.e6 f35649n;
    public di.c1 f35650r;
    public v4.b0 f35651s;
    public hm f35652w;
    public UndoView f35653x;
    public TextView f35654y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im.B(int, int):void");
    }

    @Override
    public final void D(int i7) {
        ki kiVar = this.f33609b;
        if (i7 > 1) {
            kiVar.Y2.T(0);
        } else {
            kiVar.Y2.u(0);
        }
    }

    @Override
    public final void I(ci ciVar) {
        hm hmVar = this.f35652w;
        this.R = true;
        if (ciVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) ciVar;
            hmVar.f35290c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            hmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            hmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            hmVar.c();
            hmVar.requestLayout();
            this.f35651s.h1(0, 0);
            this.f35650r.post(new od(20, this, ciVar));
            postDelayed(new dg(this, 28), 250L);
            hmVar.i(this.Q, false);
        } else {
            K();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f35654y.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f34419f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override
    public final void K() {
        this.f35650r.y0(0);
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final void P() {
        ArrayList arrayList = this.f35652w.f35289b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((gm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                fm fmVar = (fm) obj2;
                RectF d = fmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                fmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = fmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    fmVar.v.recycle();
                }
                fmVar.v = createBitmap;
                fmVar.f34647w = 0.0f;
                fmVar.O.f35025z.invalidate();
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
        int i7;
        org.telegram.ui.ym ymVar = this.f33609b.f36484t1;
        boolean z10 = false;
        if (ymVar != null && (m10 = ymVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f23611q;
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
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f23611q.y + max);
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
        di.c1 c1Var = this.f35650r;
        if (c1Var.getChildCount() <= 0) {
            c1Var.setTopGlowOffset(c1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        c1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f35650r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        cm cmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f35652w.f35289b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            gm gmVar = (gm) arrayList2.get(i10);
            if (gmVar != null && (cmVar = gmVar.f35011k) != null && (arrayList = (ArrayList) cmVar.f33636f) != null) {
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
        this.f33609b.O1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        hm hmVar = this.f35652w;
        super.onLayout(z10, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.U != z11) {
            this.U = z11;
            int size = hmVar.f35289b.size();
            for (int i13 = 0; i13 < size; i13++) {
                gm gmVar = (gm) hmVar.f35289b.get(i13);
                if (((ArrayList) gmVar.f35011k.f33636f).size() == 1) {
                    gm.a(gmVar, gmVar.f35011k, true);
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
        UndoView undoView = this.f35653x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f35652w.f35289b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((gm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                fm fmVar = (fm) obj2;
                if (fmVar.f34631e && (ffVar = fmVar.f34629b) != null) {
                    ffVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ki kiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f35654y.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.f34422j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (kiVar = this.f33609b).f36435e2) != null) {
            chatAttachAlertPhotoLayout.f32377d1.setIcon(2131232421);
            kiVar.f36435e2.f32377d1.setText(org.telegram.messenger.hd.M0(2131753957, null));
            kiVar.f36435e2.f32377d1.setRightIcon(2131232060);
        }
        this.f35652w.i(this.Q, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f33609b.f36435e2.w(i7);
        } catch (Exception unused) {
        }
    }
}
