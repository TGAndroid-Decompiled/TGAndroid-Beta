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
public final class hm extends ci {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public em F;
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
    public org.telegram.ui.ActionBar.b6 f29123n;
    public gh.f1 f29124r;
    public f2.m0 f29125s;
    public gm v;
    public UndoView f29126w;
    public TextView f29127x;
    public float f29128y;

    @Override
    public final void A(int i9) {
        ki kiVar = this.f27493b;
        if (i9 > 1) {
            kiVar.W0.K(0);
        } else {
            kiVar.W0.r(0);
        }
    }

    @Override
    public final void D(ci ciVar) {
        gm gmVar = this.v;
        this.M = true;
        if (ciVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) ciVar;
            gmVar.f28799c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            gmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            gmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            gmVar.c();
            gmVar.requestLayout();
            this.f29125s.h1(0, 0);
            this.f29124r.post(new org.telegram.ui.wq(25, this, ciVar));
            postDelayed(new fg(this, 25), 250L);
            gmVar.i(this.L, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f29127x.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f28844f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f29124r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.f28798b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((fm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                em emVar = (em) obj2;
                RectF d = emVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                emVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = emVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    emVar.v.recycle();
                }
                emVar.v = createBitmap;
                emVar.f28081w = 0.0f;
                emVar.O.f28512z.invalidate();
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
        int i9;
        org.telegram.ui.on onVar = this.f27493b.f30149r;
        boolean z10 = false;
        if (onVar != null && (d = onVar.d()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i9 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i9 = 6;
                } else {
                    i9 = 12;
                }
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i9);
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
        gh.f1 f1Var = this.f29124r;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
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
        return this.f29124r.getPaddingTop();
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
        am amVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f28798b;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            fm fmVar = (fm) arrayList2.get(i10);
            if (fmVar != null && (amVar = fmVar.f28498k) != null && (arrayList = amVar.f26867g) != null) {
                i9 = arrayList.size() + i9;
            }
        }
        return i9;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final boolean i() {
        this.f27493b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        gm gmVar = this.v;
        super.onLayout(z10, i9, i10, i11, i12);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.P != z11) {
            this.P = z11;
            int size = gmVar.f28798b.size();
            for (int i13 = 0; i13 < size; i13++) {
                fm fmVar = (fm) gmVar.f28798b.get(i13);
                if (fmVar.f28498k.f26867g.size() == 1) {
                    fm.a(fmVar, fmVar.f28498k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.F = null;
        UndoView undoView = this.f29126w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f28798b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((fm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                em emVar = (em) obj2;
                if (emVar.f28065e && (photoEntry = emVar.f28063b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        ki kiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f29127x.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.f28847j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (kiVar = this.f27493b).f30114f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            kiVar.f30114f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            kiVar.f30114f0.Y0.setRightIcon(R.drawable.msg_arrowright);
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
    public final void t(int i9) {
        try {
            this.f27493b.f30114f0.t(i9);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hm.y(int, int):void");
    }
}
