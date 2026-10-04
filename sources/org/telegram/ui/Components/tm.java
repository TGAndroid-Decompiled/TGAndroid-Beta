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
public final class tm extends pi {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public qm J;
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
    public org.telegram.ui.ActionBar.d6 f31090n;
    public ai.w0 f31091r;
    public s4.c0 f31092s;
    public sm v;
    public UndoView f31093w;
    public TextView f31094x;
    public float f31095y;

    @Override
    public final void A(int i10) {
        xi xiVar = this.f29642b;
        if (i10 > 1) {
            xiVar.f32795a1.K(0);
        } else {
            xiVar.f32795a1.r(0);
        }
    }

    @Override
    public final void C(pi piVar) {
        sm smVar = this.v;
        this.Q = true;
        if (piVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) piVar;
            smVar.f30807c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            smVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            smVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            smVar.c();
            smVar.requestLayout();
            this.f31092s.h1(0, 0);
            this.f31091r.post(new be(16, this, piVar));
            postDelayed(new qg(this, 25), 250L);
            smVar.i(this.P, false);
        } else {
            E();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31094x.animate().alpha(1.0f).setDuration(150L).setInterpolator(tr.f31140f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void E() {
        this.f31091r.y0(0);
    }

    public final void I() {
        ArrayList arrayList = this.v.f30806b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((rm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                qm qmVar = (qm) obj2;
                RectF d = qmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                qmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = qmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    qmVar.v.recycle();
                }
                qmVar.v = createBitmap;
                qmVar.f30093w = 0.0f;
                qmVar.O.f30465z.invalidate();
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
        org.telegram.ui.wn wnVar = this.f29642b.f32847r;
        boolean z10 = false;
        if (wnVar != null && (d = wnVar.d()) != null) {
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
        ai.w0 w0Var = this.f31091r;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || il0Var == null || il0Var.b() != 0) {
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
        return this.f31091r.getPaddingTop();
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
        mm mmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f30806b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            rm rmVar = (rm) arrayList2.get(i11);
            if (rmVar != null && (mmVar = rmVar.f30451k) != null && (arrayList = mmVar.f28654g) != null) {
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
        this.f29642b.W1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        sm smVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = smVar.f30806b.size();
            for (int i14 = 0; i14 < size; i14++) {
                rm rmVar = (rm) smVar.f30806b.get(i14);
                if (rmVar.f30451k.f28654g.size() == 1) {
                    rm.a(rmVar, rmVar.f30451k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f31093w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f30806b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((rm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                qm qmVar = (qm) obj2;
                if (qmVar.f30077e && (photoEntry = qmVar.f30075b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        xi xiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f31094x.animate().alpha(0.0f).setDuration(150L).setInterpolator(tr.f31143j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (xiVar = this.f29642b).f32824j0) != null) {
            chatAttachAlertPhotoLayout.f24027c1.setIcon(R.drawable.msg_view_file);
            xiVar.f32824j0.f24027c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            xiVar.f32824j0.f24027c1.setRightIcon(R.drawable.msg_arrowright);
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
            this.f29642b.f32824j0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tm.y(int, int):void");
    }
}
