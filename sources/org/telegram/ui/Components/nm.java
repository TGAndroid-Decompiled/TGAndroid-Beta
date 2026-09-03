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
public final class nm extends di {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public km G;
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
    public org.telegram.ui.ActionBar.f6 f27298n;
    public lh.e1 f27299r;
    public f2.i0 f27300s;
    public mm v;
    public UndoView f27301w;
    public TextView f27302x;
    public float f27303y;

    @Override
    public final void B(int i10) {
        li liVar = this.f24282b;
        if (i10 > 1) {
            liVar.X0.K(0);
        } else {
            liVar.X0.r(0);
        }
    }

    @Override
    public final void D(di diVar) {
        mm mmVar = this.v;
        this.N = true;
        if (diVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) diVar;
            mmVar.f27090c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            mmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            mmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            mmVar.c();
            mmVar.requestLayout();
            this.f27300s.h1(0, 0);
            this.f27299r.post(new em(0, this, diVar));
            postDelayed(new fg(this, 25), 250L);
            mmVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27302x.animate().alpha(1.0f).setDuration(150L).setInterpolator(mr.f27122f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f27299r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f27089b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((lm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                km kmVar = (km) obj2;
                RectF d = kmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                kmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = kmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    kmVar.v.recycle();
                }
                kmVar.v = createBitmap;
                kmVar.f26348w = 0.0f;
                kmVar.O.f26801z.invalidate();
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
        org.telegram.ui.xn xnVar = this.f24282b.f26730r;
        boolean z4 = false;
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
            z4 = true;
        }
        super.dispatchDraw(canvas);
        if (z4) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        lh.e1 e1Var = this.f27299r;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        dl0 dl0Var = (dl0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || dl0Var == null || dl0Var.b() != 0) {
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
        return this.f27299r.getPaddingTop();
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
        ArrayList arrayList2 = this.v.f27089b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lm lmVar = (lm) arrayList2.get(i11);
            if (lmVar != null && (gmVar = lmVar.f26787k) != null && (arrayList = gmVar.f25200g) != null) {
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
        this.f24282b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        mm mmVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            int size = mmVar.f27089b.size();
            for (int i14 = 0; i14 < size; i14++) {
                lm lmVar = (lm) mmVar.f27089b.get(i14);
                if (lmVar.f26787k.f25200g.size() == 1) {
                    lm.a(lmVar, lmVar.f26787k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.G = null;
        UndoView undoView = this.f27301w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f27089b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((lm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                km kmVar = (km) obj2;
                if (kmVar.e && (photoEntry = kmVar.f26331b) != null) {
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
        ViewPropertyAnimator interpolator = this.f27302x.animate().alpha(0.0f).setDuration(150L).setInterpolator(mr.f27125j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (liVar = this.f24282b).f26698g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            liVar.f26698g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            liVar.f26698g0.Z0.setRightIcon(R.drawable.msg_arrowright);
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
            this.f24282b.f26698g0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.y(int, int):void");
    }
}
