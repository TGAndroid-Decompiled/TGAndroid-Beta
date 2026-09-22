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
public final class qm extends ni {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public nm J;
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
    public org.telegram.ui.ActionBar.f6 f27603n;
    public ai.w0 f27604r;
    public s4.c0 f27605s;
    public pm v;
    public UndoView f27606w;
    public TextView f27607x;
    public float f27608y;

    @Override
    public final void A(int i10) {
        vi viVar = this.f26786b;
        if (i10 > 1) {
            viVar.f29080a1.K(0);
        } else {
            viVar.f29080a1.r(0);
        }
    }

    @Override
    public final void D(ni niVar) {
        pm pmVar = this.v;
        this.Q = true;
        if (niVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) niVar;
            pmVar.f27371c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            pmVar.c();
            pmVar.requestLayout();
            this.f27605s.h1(0, 0);
            this.f27604r.post(new tc(19, this, niVar));
            postDelayed(new og(this, 25), 250L);
            pmVar.i(this.P, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27607x.animate().alpha(1.0f).setDuration(150L).setInterpolator(qr.f27653f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void F() {
        this.f27604r.y0(0);
    }

    public final void K() {
        ArrayList arrayList = this.v.f27370b;
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
                nmVar.f26823w = 0.0f;
                nmVar.O.f27146z.invalidate();
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
        org.telegram.ui.xn xnVar = this.f26786b.f29131r;
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
        ai.w0 w0Var = this.f27604r;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.H(childAt);
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
        return this.f27604r.getPaddingTop();
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
        jm jmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f27370b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList2.get(i11);
            if (omVar != null && (jmVar = omVar.f27132k) != null && (arrayList = jmVar.f25404g) != null) {
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
        this.f26786b.Z1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        pm pmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = pmVar.f27370b.size();
            for (int i14 = 0; i14 < size; i14++) {
                om omVar = (om) pmVar.f27370b.get(i14);
                if (omVar.f27132k.f25404g.size() == 1) {
                    om.a(omVar, omVar.f27132k, true);
                }
            }
        }
    }

    @Override
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.f27606w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f27370b;
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
                if (nmVar.e && (photoEntry = nmVar.f26806b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void r() {
        vi viVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f27607x.animate().alpha(0.0f).setDuration(150L).setInterpolator(qr.f27656j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (viVar = this.f26786b).f29108j0) != null) {
            chatAttachAlertPhotoLayout.f22145c1.setIcon(R.drawable.msg_view_file);
            viVar.f29108j0.f22145c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            viVar.f29108j0.f22145c1.setRightIcon(R.drawable.msg_arrowright);
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
            this.f26786b.f29108j0.t(i10);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void y(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.y(int, int):void");
    }
}
