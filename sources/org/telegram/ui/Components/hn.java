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
public final class hn extends qi {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public en J;
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
    public org.telegram.ui.ActionBar.d6 f27031n;
    public ai.w0 f27032r;
    public s4.d0 f27033s;
    public gn v;
    public UndoView f27034w;
    public TextView f27035x;
    public float f27036y;

    @Override
    public final void C(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hn.C(int, int):void");
    }

    @Override
    public final void E(int i10) {
        yi yiVar = this.f30161b;
        if (i10 > 1) {
            yiVar.f33209d1.K(0);
        } else {
            yiVar.f33209d1.r(0);
        }
    }

    @Override
    public final void G(qi qiVar) {
        gn gnVar = this.v;
        this.Q = true;
        if (qiVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) qiVar;
            gnVar.f26775c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            gnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            gnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            gnVar.c();
            gnVar.requestLayout();
            this.f27033s.h1(0, 0);
            this.f27032r.post(new wc(23, this, qiVar));
            postDelayed(new rg(this, 25), 250L);
            gnVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27035x.animate().alpha(1.0f).setDuration(150L).setInterpolator(is.f27451f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f27032r.x0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.f26774b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((fn) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                en enVar = (en) obj2;
                RectF d = enVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                enVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = enVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    enVar.v.recycle();
                }
                enVar.v = createBitmap;
                enVar.f26100w = 0.0f;
                enVar.O.f26397z.invalidate();
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
        org.telegram.ui.xn xnVar = this.f30161b.f33251r;
        boolean z10 = false;
        if (xnVar != null && (d = xnVar.d()) != null) {
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
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.f27032r;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        cm0 cm0Var = (cm0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || cm0Var == null || cm0Var.b() != 0) {
            top = dp;
        }
        w0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27032r.getPaddingTop();
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
        an anVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f26774b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            fn fnVar = (fn) arrayList2.get(i11);
            if (fnVar != null && (anVar = fnVar.f26383k) != null && (arrayList = anVar.f24544g) != null) {
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
        this.f30161b.d2(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        gn gnVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = gnVar.f26774b.size();
            for (int i14 = 0; i14 < size; i14++) {
                fn fnVar = (fn) gnVar.f26774b.get(i14);
                if (fnVar.f26383k.f24544g.size() == 1) {
                    fn.a(fnVar, fnVar.f26383k, true);
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
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f27034w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f26774b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((fn) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                en enVar = (en) obj2;
                if (enVar.f26084e && (photoEntry = enVar.f26082b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        yi yiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27035x.animate().alpha(0.0f).setDuration(150L).setInterpolator(is.f27454j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (yiVar = this.f30161b).f33228j0) != null) {
            chatAttachAlertPhotoLayout.f24023c1.setIcon(R.drawable.msg_view_file);
            yiVar.f33228j0.f24023c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            yiVar.f33228j0.f24023c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void w(int i10) {
        try {
            this.f30161b.f33228j0.w(i10);
        } catch (Exception unused) {
        }
    }
}
