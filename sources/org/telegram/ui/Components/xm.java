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
public final class xm extends qi {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public um J;
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
    public org.telegram.ui.ActionBar.f6 f29079n;
    public bi.y1 f29080r;
    public s4.c0 f29081s;
    public wm v;
    public UndoView f29082w;
    public TextView f29083x;
    public float f29084y;

    @Override
    public final void A(int i10) {
        yi yiVar = this.f26422b;
        if (i10 > 1) {
            yiVar.f29350a1.K(0);
        } else {
            yiVar.f29350a1.r(0);
        }
    }

    @Override
    public final void D(qi qiVar) {
        wm wmVar = this.v;
        this.Q = true;
        if (qiVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) qiVar;
            wmVar.f28793c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            wmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            wmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            wmVar.c();
            wmVar.requestLayout();
            this.f29081s.h1(0, 0);
            this.f29080r.post(new ee(16, this, qiVar));
            postDelayed(new rg(this, 25), 250L);
            wmVar.i(this.P, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f29083x.animate().alpha(1.0f).setDuration(150L).setInterpolator(wr.f28819f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f29080r.x0(0);
    }

    public final void K() {
        ArrayList arrayList = this.v.f28792b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((vm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                um umVar = (um) obj2;
                RectF d = umVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                umVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = umVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    umVar.v.recycle();
                }
                umVar.v = createBitmap;
                umVar.f27715w = 0.0f;
                umVar.O.f28029z.invalidate();
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
        Drawable d;
        int i10;
        org.telegram.ui.bo boVar = this.f26422b.f29401r;
        boolean z10 = false;
        if (boVar != null && (d = boVar.d()) != null) {
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
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i10);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            d.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            d.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        bi.y1 y1Var = this.f29080r;
        if (y1Var.getChildCount() <= 0) {
            y1Var.setTopGlowOffset(y1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        y1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29080r.getPaddingTop();
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
        pm pmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f28792b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            vm vmVar = (vm) arrayList2.get(i11);
            if (vmVar != null && (pmVar = vmVar.f28015k) != null && (arrayList = pmVar.f26212g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        this.f26422b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        wm wmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = wmVar.f28792b.size();
            for (int i14 = 0; i14 < size; i14++) {
                vm vmVar = (vm) wmVar.f28792b.get(i14);
                if (vmVar.f28015k.f26212g.size() == 1) {
                    vm.a(vmVar, vmVar.f28015k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f29082w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f28792b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((vm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                um umVar = (um) obj2;
                if (umVar.e && (photoEntry = umVar.f27698b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        yi yiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f29083x.animate().alpha(0.0f).setDuration(150L).setInterpolator(wr.f28822j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (yiVar = this.f26422b).f29378j0) != null) {
            chatAttachAlertPhotoLayout.f20993c1.setIcon(R.drawable.msg_view_file);
            yiVar.f29378j0.f20993c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            yiVar.f29378j0.f20993c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t(int i10) {
        try {
            this.f26422b.f29378j0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xm.y(int, int):void");
    }
}
