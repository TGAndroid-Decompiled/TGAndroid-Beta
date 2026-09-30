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
    public org.telegram.ui.ActionBar.d6 f28601n;
    public ai.w0 f28602r;
    public s4.c0 f28603s;
    public sm v;
    public UndoView f28604w;
    public TextView f28605x;
    public float f28606y;

    @Override
    public final void A(int i10) {
        xi xiVar = this.f27362b;
        if (i10 > 1) {
            xiVar.f30254a1.K(0);
        } else {
            xiVar.f30254a1.r(0);
        }
    }

    @Override
    public final void E(pi piVar) {
        sm smVar = this.v;
        this.Q = true;
        if (piVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) piVar;
            smVar.f28289c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            smVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            smVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            smVar.c();
            smVar.requestLayout();
            this.f28603s.h1(0, 0);
            this.f28602r.post(new ld(18, this, piVar));
            postDelayed(new qg(this, 25), 250L);
            smVar.i(this.P, false);
        } else {
            G();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f28605x.animate().alpha(1.0f).setDuration(150L).setInterpolator(tr.f28636f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void G() {
        this.f28602r.y0(0);
    }

    public final void K() {
        ArrayList arrayList = this.v.f28288b;
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
                qmVar.f27691w = 0.0f;
                qmVar.O.f28086z.invalidate();
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
        org.telegram.ui.un unVar = this.f27362b.f30305r;
        boolean z10 = false;
        if (unVar != null && (d = unVar.d()) != null) {
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
        ai.w0 w0Var = this.f28602r;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        jl0 jl0Var = (jl0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || jl0Var == null || jl0Var.b() != 0) {
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
        return this.f28602r.getPaddingTop();
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
        ArrayList arrayList2 = this.v.f28288b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            rm rmVar = (rm) arrayList2.get(i11);
            if (rmVar != null && (mmVar = rmVar.f28072k) != null && (arrayList = mmVar.f26324g) != null) {
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
        this.f27362b.Z1(false);
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
            int size = smVar.f28288b.size();
            for (int i14 = 0; i14 < size; i14++) {
                rm rmVar = (rm) smVar.f28288b.get(i14);
                if (rmVar.f28072k.f26324g.size() == 1) {
                    rm.a(rmVar, rmVar.f28072k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f28604w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f28288b;
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
                if (qmVar.e && (photoEntry = qmVar.f27674b) != null) {
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
        ViewPropertyAnimator interpolator = this.f28605x.animate().alpha(0.0f).setDuration(150L).setInterpolator(tr.f28639j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (xiVar = this.f27362b).f30282j0) != null) {
            chatAttachAlertPhotoLayout.f22152c1.setIcon(R.drawable.msg_view_file);
            xiVar.f30282j0.f22152c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            xiVar.f30282j0.f22152c1.setRightIcon(R.drawable.msg_arrowright);
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
            this.f27362b.f30282j0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tm.y(int, int):void");
    }
}
