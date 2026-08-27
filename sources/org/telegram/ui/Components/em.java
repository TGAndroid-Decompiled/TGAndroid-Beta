package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

public final class em extends yh {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public bm F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public Drawable J;
    public ViewPropertyAnimator K;
    public ChatAttachAlertPhotoLayout L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;

    public org.telegram.ui.ActionBar.c6 f28086n;

    public hh.f1 f28087r;

    public f2.k0 f28088s;
    public dm v;

    public UndoView f28089w;

    public TextView f28090x;

    public float f28091y;

    @Override
    public final void C(int i10) {
        gi giVar = this.f34900b;
        if (i10 > 1) {
            giVar.W0.K(0);
        } else {
            giVar.W0.r(0);
        }
    }

    @Override
    public final void E(yh yhVar) {
        dm dmVar = this.v;
        this.M = true;
        if (yhVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) yhVar;
            dmVar.f27800c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            dmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            dmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            dmVar.c();
            dmVar.requestLayout();
            this.f28088s.h1(0, 0);
            this.f28087r.post(new org.telegram.ui.yq(25, this, yhVar));
            postDelayed(new bg(this, 25), 250L);
            dmVar.i(this.L, false);
        } else {
            G();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f28090x.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f28122f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override
    public final void G() {
        this.f28087r.x0(0);
    }

    public final void K() {
        ArrayList arrayList = this.v.f27799b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((cm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bm bmVar = (bm) obj2;
                RectF rectFD = bmVar.d();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, Math.round(rectFD.width())), Math.max(1, Math.round(rectFD.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.save();
                canvas.translate(-rectFD.left, -rectFD.top);
                bmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = bmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bmVar.v.recycle();
                }
                bmVar.v = bitmapCreateBitmap;
                bmVar.f27156w = 0.0f;
                bmVar.O.f27505z.invalidate();
            }
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawableD;
        int i10;
        org.telegram.ui.pn pnVar = this.f34900b.f28685r;
        boolean z10 = false;
        if (pnVar != null && (drawableD = pnVar.d()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i10 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                i10 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i10);
            }
            int iMax = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, iMax, getWidth(), getHeight());
            drawableD.setBounds(0, iMax, getWidth(), AndroidUtilities.displaySize.y + iMax);
            drawableD.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.f28087r;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28087r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        wl wlVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f27799b;
        int size = arrayList2.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            cm cmVar = (cm) arrayList2.get(i10);
            if (cmVar != null && (wlVar = cmVar.f27491k) != null && (arrayList = wlVar.f34285g) != null) {
                size2 = arrayList.size() + size2;
            }
        }
        return size2;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        this.f34900b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dm dmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.P != z11) {
            this.P = z11;
            int size = dmVar.f27799b.size();
            for (int i14 = 0; i14 < size; i14++) {
                cm cmVar = (cm) dmVar.f27799b.get(i14);
                if (cmVar.f27491k.f34285g.size() == 1) {
                    cm.a(cmVar, cmVar.f27491k, true);
                }
            }
        }
    }

    @Override
    public final void r() {
        MediaController.PhotoEntry photoEntry;
        this.F = null;
        UndoView undoView = this.f28089w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f27799b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((cm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bm bmVar = (bm) obj2;
                if (bmVar.f27140e && (photoEntry = bmVar.f27138b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        gi giVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f28090x.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.f28125j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (giVar = this.f34900b).f28650f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            giVar.f28650f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            giVar.f28650f0.Y0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.L, true);
    }

    @Override
    public final void u(int i10) {
        try {
            this.f34900b.f28650f0.u(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void z(int i10, int i11) {
        float f10;
        hh.f1 f1Var = this.f28087r;
        this.O = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            this.N = (i11 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.N = (int) (i11 / 3.5f);
            } else {
                this.N = (i11 / 5) * 2;
            }
        }
        int iDp = this.N - AndroidUtilities.dp(52.0f);
        this.N = iDp;
        if (iDp < 0) {
            this.N = 0;
        }
        if (f1Var.getPaddingTop() != this.N || f1Var.getPaddingBottom() != this.f34902e) {
            f1Var.o1(f1Var.getPaddingLeft(), this.N, f1Var.getPaddingRight(), this.f34902e);
            invalidate();
        }
        TextView textView = this.f28090x;
        if (AndroidUtilities.isTablet()) {
            f10 = 20.0f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
        }
        textView.setTextSize(f10);
        this.O = false;
    }
}
