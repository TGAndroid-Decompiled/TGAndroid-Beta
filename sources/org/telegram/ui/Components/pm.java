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
public final class pm extends ei {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public mm G;
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
    public org.telegram.ui.ActionBar.g6 f30121n;
    public mh.d1 f30122r;
    public f2.j0 f30123s;
    public om v;
    public UndoView f30124w;
    public TextView f30125x;
    public float f30126y;

    @Override
    public final void B(int i10) {
        mi miVar = this.f26590b;
        if (i10 > 1) {
            miVar.X0.K(0);
        } else {
            miVar.X0.r(0);
        }
    }

    @Override
    public final void D(ei eiVar) {
        om omVar = this.v;
        this.N = true;
        if (eiVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) eiVar;
            omVar.f29812c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            omVar.c();
            omVar.requestLayout();
            this.f30123s.h1(0, 0);
            this.f30122r.post(new org.telegram.ui.mp(29, this, eiVar));
            postDelayed(new fg(this, 25), 250L);
            omVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f30125x.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.f30168f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f30122r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f29811b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
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
                mmVar.f29175w = 0.0f;
                mmVar.O.f29538z.invalidate();
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
        org.telegram.ui.vn vnVar = this.f26590b.f29104r;
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
        mh.d1 d1Var = this.f30122r;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = d1Var.getChildAt(0);
        el0 el0Var = (el0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        d1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30122r.getPaddingTop();
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
        hm hmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f29811b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            nm nmVar = (nm) arrayList2.get(i11);
            if (nmVar != null && (hmVar = nmVar.f29524k) != null && (arrayList = hmVar.f27565g) != null) {
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
        this.f26590b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        om omVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            int size = omVar.f29811b.size();
            for (int i14 = 0; i14 < size; i14++) {
                nm nmVar = (nm) omVar.f29811b.get(i14);
                if (nmVar.f29524k.f27565g.size() == 1) {
                    nm.a(nmVar, nmVar.f29524k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.G = null;
        UndoView undoView = this.f30124w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f29811b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                mm mmVar = (mm) obj2;
                if (mmVar.f29159e && (photoEntry = mmVar.f29157b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        mi miVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.N = false;
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f30125x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.f30171j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (miVar = this.f26590b).f29072g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            miVar.f29072g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            miVar.f29072g0.Z0.setRightIcon(R.drawable.msg_arrowright);
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
            this.f26590b.f29072g0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.y(int, int):void");
    }
}
