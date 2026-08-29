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
public final class lm extends fi {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public im F;
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
    public org.telegram.ui.ActionBar.c6 f30371n;
    public jh.e1 f30372r;
    public f2.j0 f30373s;
    public km v;
    public UndoView f30374w;
    public TextView f30375x;
    public float f30376y;

    @Override
    public final void B(int i10) {
        ni niVar = this.f28403b;
        if (i10 > 1) {
            niVar.W0.K(0);
        } else {
            niVar.W0.r(0);
        }
    }

    @Override
    public final void D(fi fiVar) {
        km kmVar = this.v;
        this.M = true;
        if (fiVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) fiVar;
            kmVar.f30098c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            kmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            kmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            kmVar.c();
            kmVar.requestLayout();
            this.f30373s.h1(0, 0);
            this.f30372r.post(new z2(22, this, fiVar));
            postDelayed(new ig(this, 25), 250L);
            kmVar.i(this.L, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f30375x.animate().alpha(1.0f).setDuration(150L).setInterpolator(jr.f29800f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f30372r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f30097b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((jm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                im imVar = (im) obj2;
                RectF d = imVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                imVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = imVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    imVar.v.recycle();
                }
                imVar.v = createBitmap;
                imVar.f29427w = 0.0f;
                imVar.O.f29760z.invalidate();
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
        Drawable d;
        int i10;
        org.telegram.ui.rn rnVar = this.f28403b.f31040r;
        boolean z10 = false;
        if (rnVar != null && (d = rnVar.d()) != null) {
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
        jh.e1 e1Var = this.f30372r;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || vk0Var == null || vk0Var.b() != 0) {
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
        return this.f30372r.getPaddingTop();
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
        em emVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f30097b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jm jmVar = (jm) arrayList2.get(i11);
            if (jmVar != null && (emVar = jmVar.f29746k) != null && (arrayList = emVar.f28112g) != null) {
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
        this.f28403b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        km kmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.P != z11) {
            this.P = z11;
            int size = kmVar.f30097b.size();
            for (int i14 = 0; i14 < size; i14++) {
                jm jmVar = (jm) kmVar.f30097b.get(i14);
                if (jmVar.f29746k.f28112g.size() == 1) {
                    jm.a(jmVar, jmVar.f29746k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.F = null;
        UndoView undoView = this.f30374w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f30097b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((jm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                im imVar = (im) obj2;
                if (imVar.f29411e && (photoEntry = imVar.f29409b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        ni niVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f30375x.animate().alpha(0.0f).setDuration(150L).setInterpolator(jr.f29803j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (niVar = this.f28403b).f31005f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            niVar.f31005f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            niVar.f31005f0.Y0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.L, true);
    }

    @Override
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t(int i10) {
        try {
            this.f28403b.f31005f0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lm.y(int, int):void");
    }
}
