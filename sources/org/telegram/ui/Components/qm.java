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
public final class qm extends ei {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public nm G;
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
    public org.telegram.ui.ActionBar.g6 f30415n;
    public mh.d1 f30416r;
    public f2.j0 f30417s;
    public pm v;
    public UndoView f30418w;
    public TextView f30419x;
    public float f30420y;

    @Override
    public final void B(int i10) {
        mi miVar = this.f26546b;
        if (i10 > 1) {
            miVar.X0.K(0);
        } else {
            miVar.X0.r(0);
        }
    }

    @Override
    public final void D(ei eiVar) {
        pm pmVar = this.v;
        this.N = true;
        if (eiVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) eiVar;
            pmVar.f30116c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            pmVar.c();
            pmVar.requestLayout();
            this.f30417s.h1(0, 0);
            this.f30416r.post(new gm(0, this, eiVar));
            postDelayed(new fg(this, 25), 250L);
            pmVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f30419x.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.f30183f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f30416r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f30115b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((om) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                nm nmVar = (nm) obj2;
                RectF d = nmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                nmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = nmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    nmVar.v.recycle();
                }
                nmVar.v = createBitmap;
                nmVar.f29560w = 0.0f;
                nmVar.O.f29820z.invalidate();
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
        org.telegram.ui.vn vnVar = this.f26546b.f29086r;
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
        mh.d1 d1Var = this.f30416r;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = d1Var.getChildAt(0);
        fl0 fl0Var = (fl0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || fl0Var == null || fl0Var.b() != 0) {
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
        return this.f30416r.getPaddingTop();
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
        im imVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f30115b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList2.get(i11);
            if (omVar != null && (imVar = omVar.f29806k) != null && (arrayList = imVar.f27860g) != null) {
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
        this.f26546b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        pm pmVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q != z10) {
            this.Q = z10;
            int size = pmVar.f30115b.size();
            for (int i14 = 0; i14 < size; i14++) {
                om omVar = (om) pmVar.f30115b.get(i14);
                if (omVar.f29806k.f27860g.size() == 1) {
                    om.a(omVar, omVar.f29806k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.G = null;
        UndoView undoView = this.f30418w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f30115b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((om) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                nm nmVar = (nm) obj2;
                if (nmVar.f29544e && (photoEntry = nmVar.f29542b) != null) {
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
        ViewPropertyAnimator interpolator = this.f30419x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.f30186j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (miVar = this.f26546b).f29054g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            miVar.f29054g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            miVar.f29054g0.Z0.setRightIcon(R.drawable.msg_arrowright);
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
            this.f26546b.f29054g0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.y(int, int):void");
    }
}
