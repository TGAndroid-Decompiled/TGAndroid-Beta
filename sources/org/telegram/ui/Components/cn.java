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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class cn extends li {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public zm J;
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
    public org.telegram.ui.ActionBar.u6 f27198n;
    public bi.r1 f27199r;
    public s4.c0 f27200s;
    public bn v;
    public UndoView f27201w;
    public TextView f27202x;
    public float f27203y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn.B(int, int):void");
    }

    @Override
    public final void D(int i10) {
        ti tiVar = this.f30213b;
        if (i10 > 1) {
            tiVar.f33012d1.S(0);
        } else {
            tiVar.f33012d1.t(0);
        }
    }

    @Override
    public final void G(li liVar) {
        bn bnVar = this.v;
        this.Q = true;
        if (liVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) liVar;
            bnVar.f26906c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            bnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            bnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            bnVar.c();
            bnVar.requestLayout();
            this.f27200s.h1(0, 0);
            this.f27199r.post(new org.telegram.ui.ip(29, this, liVar));
            postDelayed(new pg(this, 26), 250L);
            bnVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27202x.animate().alpha(1.0f).setDuration(150L).setInterpolator(ds.f27584f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f27199r.y0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.f26905b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((an) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                zm zmVar = (zm) obj2;
                RectF d = zmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                zmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = zmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    zmVar.v.recycle();
                }
                zmVar.v = createBitmap;
                zmVar.f35372w = 0.0f;
                zmVar.O.f26575z.invalidate();
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
        Drawable l4;
        int i10;
        org.telegram.ui.sn snVar = this.f30213b.f33053r;
        boolean z10 = false;
        if (snVar != null && (l4 = snVar.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i10 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 6;
                } else {
                    i10 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i10);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l4.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            l4.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.f27199r;
        if (r1Var.getChildCount() <= 0) {
            r1Var.setTopGlowOffset(r1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        r1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27199r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        vm vmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f26905b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            an anVar = (an) arrayList2.get(i11);
            if (anVar != null && (vmVar = anVar.f26561k) != null && (arrayList = vmVar.f33685g) != null) {
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
        this.f30213b.g2(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        bn bnVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = bnVar.f26905b.size();
            for (int i14 = 0; i14 < size; i14++) {
                an anVar = (an) bnVar.f26905b.get(i14);
                if (anVar.f26561k.f33685g.size() == 1) {
                    an.a(anVar, anVar.f26561k, true);
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
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f27201w;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.v.f26905b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((an) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                zm zmVar = (zm) obj2;
                if (zmVar.e && (photoEntry = zmVar.f35355b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void t() {
        ti tiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27202x.animate().alpha(0.0f).setDuration(150L).setInterpolator(ds.f27587j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (tiVar = this.f30213b).f33030j0) != null) {
            chatAttachAlertPhotoLayout.f26023c1.setIcon(R.drawable.msg_view_file);
            tiVar.f33030j0.f26023c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            tiVar.f33030j0.f26023c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void v(int i10) {
        try {
            this.f30213b.f33030j0.v(i10);
        } catch (Exception unused) {
        }
    }
}
