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
public final class om extends di {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public lm G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public Drawable K;
    public ViewPropertyAnimator L;
    public ChatAttachAlertPhotoLayout M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public org.telegram.ui.ActionBar.f6 f27590n;
    public lh.e1 f27591r;
    public f2.i0 f27592s;
    public nm v;
    public UndoView f27593w;
    public TextView f27594x;
    public float f27595y;

    @Override
    public final void B(int i10) {
        li liVar = this.f24278b;
        if (i10 > 1) {
            liVar.X0.K(0);
        } else {
            liVar.X0.r(0);
        }
    }

    @Override
    public final void D(di diVar) {
        nm nmVar = this.v;
        this.N = true;
        if (diVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) diVar;
            nmVar.f27316c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            nmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            nmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            nmVar.c();
            nmVar.requestLayout();
            this.f27592s.h1(0, 0);
            this.f27591r.post(new il(1, this, diVar));
            postDelayed(new fg(this, 25), 250L);
            nmVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27594x.animate().alpha(1.0f).setDuration(150L).setInterpolator(nr.f27346f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f27591r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f27315b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((mm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                lm lmVar = (lm) obj2;
                RectF d = lmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                lmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = lmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    lmVar.v.recycle();
                }
                lmVar.v = createBitmap;
                lmVar.f26808w = 0.0f;
                lmVar.O.f27074z.invalidate();
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable d;
        int i10;
        org.telegram.ui.vn vnVar = this.f24278b.f26734r;
        boolean z4 = false;
        if (vnVar != null && (d = vnVar.d()) != null) {
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
            d.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            d.draw(canvas);
            z4 = true;
        }
        super.dispatchDraw(canvas);
        if (z4) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        lh.e1 e1Var = this.f27591r;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        e1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27591r.getPaddingTop();
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
        gm gmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f27315b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            mm mmVar = (mm) arrayList2.get(i11);
            if (mmVar != null && (gmVar = mmVar.f27060k) != null && (arrayList = gmVar.f25197g) != null) {
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
        this.f24278b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        nm nmVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            int size = nmVar.f27315b.size();
            for (int i14 = 0; i14 < size; i14++) {
                mm mmVar = (mm) nmVar.f27315b.get(i14);
                if (mmVar.f27060k.f25197g.size() == 1) {
                    mm.a(mmVar, mmVar.f27060k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.G = null;
        UndoView undoView = this.f27593w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f27315b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((mm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                lm lmVar = (lm) obj2;
                if (lmVar.e && (photoEntry = lmVar.f26791b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        li liVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.N = false;
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27594x.animate().alpha(0.0f).setDuration(150L).setInterpolator(nr.f27349j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (liVar = this.f24278b).f26702g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            liVar.f26702g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            liVar.f26702g0.Z0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.M, true);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t(int i10) {
        try {
            this.f24278b.f26702g0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.y(int, int):void");
    }
}
