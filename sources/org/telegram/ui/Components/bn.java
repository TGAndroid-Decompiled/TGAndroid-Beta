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
public final class bn extends li {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ym J;
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
    public org.telegram.ui.ActionBar.d6 f24990n;
    public ai.u1 f24991r;
    public s4.b0 f24992s;
    public an v;
    public UndoView f24993w;
    public TextView f24994x;
    public float f24995y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.B(int, int):void");
    }

    @Override
    public final void D(int i10) {
        ti tiVar = this.f28173b;
        if (i10 > 1) {
            tiVar.f30540d1.K(0);
        } else {
            tiVar.f30540d1.r(0);
        }
    }

    @Override
    public final void F(li liVar) {
        an anVar = this.v;
        this.Q = true;
        if (liVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) liVar;
            anVar.f24672c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            anVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            anVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            anVar.c();
            anVar.requestLayout();
            this.f24992s.h1(0, 0);
            this.f24991r.post(new ee(19, this, liVar));
            postDelayed(new pg(this, 25), 250L);
            anVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f24994x.animate().alpha(1.0f).setDuration(150L).setInterpolator(bs.f25021f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f24991r.x0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.f24671b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((zm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ym ymVar = (ym) obj2;
                RectF d = ymVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                ymVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = ymVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ymVar.v.recycle();
                }
                ymVar.v = createBitmap;
                ymVar.f32693w = 0.0f;
                ymVar.O.f32968z.invalidate();
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
        Drawable e;
        int i10;
        org.telegram.ui.on onVar = this.f28173b.f30581r;
        boolean z10 = false;
        if (onVar != null && (e = onVar.e()) != null) {
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
            e.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            e.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.f24991r;
        if (u1Var.getChildCount() <= 0) {
            u1Var.setTopGlowOffset(u1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        tl0 tl0Var = (tl0) u1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || tl0Var == null || tl0Var.b() != 0) {
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
        return this.f24991r.getPaddingTop();
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
        um umVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f24671b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            zm zmVar = (zm) arrayList2.get(i11);
            if (zmVar != null && (umVar = zmVar.f32954k) != null && (arrayList = umVar.f30963g) != null) {
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
        this.f28173b.d2(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        an anVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = anVar.f24671b.size();
            for (int i14 = 0; i14 < size; i14++) {
                zm zmVar = (zm) anVar.f24671b.get(i14);
                if (zmVar.f32954k.f30963g.size() == 1) {
                    zm.a(zmVar, zmVar.f32954k, true);
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
        UndoView undoView = this.f24993w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f24671b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((zm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ym ymVar = (ym) obj2;
                if (ymVar.e && (photoEntry = ymVar.f32676b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        ti tiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f24994x.animate().alpha(0.0f).setDuration(150L).setInterpolator(bs.f25024j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (tiVar = this.f28173b).f30558j0) != null) {
            chatAttachAlertPhotoLayout.f24087c1.setIcon(R.drawable.msg_view_file);
            tiVar.f30558j0.f24087c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            tiVar.f30558j0.f24087c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void w(int i10) {
        try {
            this.f28173b.f30558j0.w(i10);
        } catch (Exception unused) {
        }
    }
}
