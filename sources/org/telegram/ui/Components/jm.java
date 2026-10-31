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
public final class jm extends uh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public gm J;
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
    public org.telegram.ui.ActionBar.p6 f27401n;
    public ag.b1 f27402r;
    public s4.a0 f27403s;
    public im f27404w;
    public UndoView f27405x;
    public TextView f27406y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm.B(int, int):void");
    }

    @Override
    public final void D(int i10) {
        bi biVar = this.f30947b;
        if (i10 > 1) {
            biVar.U2.S(0);
        } else {
            biVar.U2.t(0);
        }
    }

    @Override
    public final void G(uh uhVar) {
        im imVar = this.f27404w;
        this.Q = true;
        if (uhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) uhVar;
            imVar.f27010c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            imVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            imVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            imVar.c();
            imVar.requestLayout();
            this.f27403s.h1(0, 0);
            this.f27402r.post(new cd(20, this, uhVar));
            postDelayed(new tf(this, 27), 250L);
            imVar.i(this.P, false);
        } else {
            I();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27406y.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f26495f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void I() {
        this.f27402r.y0(0);
    }

    public final void N() {
        ArrayList arrayList = this.f27404w.f27009b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((hm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                gm gmVar = (gm) obj2;
                RectF d = gmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                gmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = gmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    gmVar.v.recycle();
                }
                gmVar.v = createBitmap;
                gmVar.f26433w = 0.0f;
                gmVar.O.f26779z.invalidate();
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
        int i10;
        org.telegram.ui.sn snVar = this.f30947b.f24708p1;
        boolean z10 = false;
        if (snVar != null && (m10 = snVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.i0.Q1()) {
                i10 = 16;
            } else {
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i10 = 6;
                } else {
                    i10 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.i0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i10);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.i0.f16026q.y + max);
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
        ag.b1 b1Var = this.f27402r;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(8.0f);
        if (top < org.telegram.messenger.i0.L(8.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27402r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        dm dmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f27404w.f27009b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            hm hmVar = (hm) arrayList2.get(i11);
            if (hmVar != null && (dmVar = hmVar.f26765k) != null && (arrayList = (ArrayList) dmVar.f25466f) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        this.f30947b.N1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        im imVar = this.f27404w;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = imVar.f27009b.size();
            for (int i14 = 0; i14 < size; i14++) {
                hm hmVar = (hm) imVar.f27009b.get(i14);
                if (((ArrayList) hmVar.f26765k.f25466f).size() == 1) {
                    hm.a(hmVar, hmVar.f26765k, true);
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
    public final void s() {
        org.telegram.messenger.ef efVar;
        this.J = null;
        UndoView undoView = this.f27405x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.f27404w.f27009b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((hm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                gm gmVar = (gm) obj2;
                if (gmVar.e && (efVar = gmVar.f26416b) != null) {
                    efVar.R = false;
                }
            }
        }
    }

    @Override
    public final void t() {
        bi biVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27406y.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.f26498j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (biVar = this.f30947b).a2) != null) {
            chatAttachAlertPhotoLayout.f23855c1.setIcon(2131232419);
            biVar.a2.f23855c1.setText(org.telegram.messenger.cd.L0(2131753957, null));
            biVar.a2.f23855c1.setRightIcon(2131232058);
        }
        this.f27404w.i(this.P, true);
    }

    @Override
    public final void w(int i10) {
        try {
            this.f30947b.a2.w(i10);
        } catch (Exception unused) {
        }
    }
}
