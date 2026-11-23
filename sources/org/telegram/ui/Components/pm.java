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
public final class pm extends li {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public mm K;
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
    public org.telegram.ui.ActionBar.i6 f38509n;
    public di.b1 f38510r;
    public v4.c0 f38511s;
    public om f38512w;
    public UndoView f38513x;
    public TextView f38514y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.B(int, int):void");
    }

    @Override
    public final void D(int i7) {
        ti tiVar = this.f37135b;
        if (i7 > 1) {
            tiVar.Y2.T(0);
        } else {
            tiVar.Y2.u(0);
        }
    }

    @Override
    public final void H(li liVar) {
        om omVar = this.f38512w;
        this.R = true;
        if (liVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) liVar;
            omVar.f38209c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            omVar.c();
            omVar.requestLayout();
            this.f38511s.h1(0, 0);
            this.f38510r.post(new xd(20, this, liVar));
            postDelayed(new ng(this, 28), 250L);
            omVar.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f38514y.animate().alpha(1.0f).setDuration(150L).setInterpolator(kr.f36858f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f38510r.y0(0);
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final void P() {
        ArrayList arrayList = this.f38512w.f38208b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                mm mmVar = (mm) obj2;
                RectF d = mmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                mmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = mmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    mmVar.v.recycle();
                }
                mmVar.v = createBitmap;
                mmVar.f37498w = 0.0f;
                mmVar.O.f37872z.invalidate();
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
        org.telegram.ui.zm zmVar = this.f37135b.f40016t1;
        boolean z10 = false;
        if (zmVar != null && (m10 = zmVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.f24226q;
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
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.f24226q.y + max);
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
        di.b1 b1Var = this.f38510r;
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
        return this.f38510r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        jm jmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f38512w.f38208b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList2.get(i10);
            if (nmVar != null && (jmVar = nmVar.f37858k) != null && (arrayList = (ArrayList) jmVar.f36460f) != null) {
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
        this.f37135b.P1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        om omVar = this.f38512w;
        super.onLayout(z10, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.U != z11) {
            this.U = z11;
            int size = omVar.f38208b.size();
            for (int i13 = 0; i13 < size; i13++) {
                nm nmVar = (nm) omVar.f38208b.get(i13);
                if (((ArrayList) nmVar.f37858k.f36460f).size() == 1) {
                    nm.a(nmVar, nmVar.f37858k, true);
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
        org.telegram.messenger.ef efVar;
        this.K = null;
        UndoView undoView = this.f38513x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f38512w.f38208b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                mm mmVar = (mm) obj2;
                if (mmVar.f37482e && (efVar = mmVar.f37480b) != null) {
                    efVar.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ti tiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f38514y.animate().alpha(0.0f).setDuration(150L).setInterpolator(kr.f36861j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (tiVar = this.f37135b).f39967e2) != null) {
            chatAttachAlertPhotoLayout.f32874d1.setIcon(2131232425);
            tiVar.f39967e2.f32874d1.setText(org.telegram.messenger.gd.N0(2131753954, null));
            tiVar.f39967e2.f32874d1.setRightIcon(2131232064);
        }
        this.f38512w.i(this.Q, true);
    }

    @Override
    public final void w(int i7) {
        try {
            this.f37135b.f39967e2.w(i7);
        } catch (Exception unused) {
        }
    }
}
