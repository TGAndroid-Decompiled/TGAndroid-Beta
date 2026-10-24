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
public final class zm extends ji {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public wm J;
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
    public org.telegram.ui.ActionBar.g6 f33291n;
    public ai.u1 f33292r;
    public s4.b0 f33293s;
    public ym v;
    public UndoView f33294w;
    public TextView f33295x;
    public float f33296y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm.B(int, int):void");
    }

    @Override
    public final void D(int i10) {
        ri riVar = this.f27704b;
        if (i10 > 1) {
            riVar.f30140d1.K(0);
        } else {
            riVar.f30140d1.r(0);
        }
    }

    @Override
    public final void F(ji jiVar) {
        ym ymVar = this.v;
        this.Q = true;
        if (jiVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) jiVar;
            ymVar.f32980c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            ymVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            ymVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ymVar.c();
            ymVar.requestLayout();
            this.f33293s.h1(0, 0);
            this.f33292r.post(new ce(19, this, jiVar));
            postDelayed(new ng(this, 26), 250L);
            ymVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f33295x.animate().alpha(1.0f).setDuration(150L).setInterpolator(zr.f33337f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f33292r.x0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.f32979b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((xm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                wm wmVar = (wm) obj2;
                RectF d = wmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                wmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = wmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    wmVar.v.recycle();
                }
                wmVar.v = createBitmap;
                wmVar.f32284w = 0.0f;
                wmVar.O.f32658z.invalidate();
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
        org.telegram.ui.qn qnVar = this.f27704b.f30181r;
        boolean z10 = false;
        if (qnVar != null && (l4 = qnVar.l()) != null) {
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
        ai.u1 u1Var = this.f33292r;
        if (u1Var.getChildCount() <= 0) {
            u1Var.setTopGlowOffset(u1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        vl0 vl0Var = (vl0) u1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        u1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f33292r.getPaddingTop();
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
        sm smVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f32979b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            xm xmVar = (xm) arrayList2.get(i11);
            if (xmVar != null && (smVar = xmVar.f32644k) != null && (arrayList = smVar.f30570g) != null) {
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
        this.f27704b.h2(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        ym ymVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = ymVar.f32979b.size();
            for (int i14 = 0; i14 < size; i14++) {
                xm xmVar = (xm) ymVar.f32979b.get(i14);
                if (xmVar.f32644k.f30570g.size() == 1) {
                    xm.a(xmVar, xmVar.f32644k, true);
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
        UndoView undoView = this.f33294w;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.v.f32979b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((xm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                wm wmVar = (wm) obj2;
                if (wmVar.e && (photoEntry = wmVar.f32267b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ri riVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f33295x.animate().alpha(0.0f).setDuration(150L).setInterpolator(zr.f33340j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (riVar = this.f27704b).f30158j0) != null) {
            chatAttachAlertPhotoLayout.f24233c1.setIcon(R.drawable.msg_view_file);
            riVar.f30158j0.f24233c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            riVar.f30158j0.f24233c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void w(int i10) {
        try {
            this.f27704b.f30158j0.w(i10);
        } catch (Exception unused) {
        }
    }
}
