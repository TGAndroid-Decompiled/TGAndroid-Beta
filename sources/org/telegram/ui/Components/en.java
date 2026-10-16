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
public final class en extends ni {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public bn J;
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
    public org.telegram.ui.ActionBar.c6 f24432n;
    public bi.o0 f24433r;
    public s4.b0 f24434s;
    public dn v;
    public UndoView f24435w;
    public TextView f24436x;
    public float f24437y;

    @Override
    public final void C(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.en.C(int, int):void");
    }

    @Override
    public final void E(int i10) {
        vi viVar = this.f27360b;
        if (i10 > 1) {
            viVar.f29666d1.K(0);
        } else {
            viVar.f29666d1.r(0);
        }
    }

    @Override
    public final void G(ni niVar) {
        dn dnVar = this.v;
        this.Q = true;
        if (niVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) niVar;
            dnVar.f24144c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            dnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            dnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            dnVar.c();
            dnVar.requestLayout();
            this.f24434s.h1(0, 0);
            this.f24433r.post(new vm(0, this, niVar));
            postDelayed(new qg(this, 25), 250L);
            dnVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f24436x.animate().alpha(1.0f).setDuration(150L).setInterpolator(es.f24465f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.f24433r.x0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.f24143b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((cn) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bn bnVar = (bn) obj2;
                RectF d = bnVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                bnVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = bnVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bnVar.v.recycle();
                }
                bnVar.v = createBitmap;
                bnVar.f23514w = 0.0f;
                bnVar.O.f23826z.invalidate();
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
        org.telegram.ui.co coVar = this.f27360b.f29707r;
        boolean z10 = false;
        if (coVar != null && (d = coVar.d()) != null) {
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
        bi.o0 o0Var = this.f24433r;
        if (o0Var.getChildCount() <= 0) {
            o0Var.setTopGlowOffset(o0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        o0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f24433r.getPaddingTop();
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
        xm xmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.f24143b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            cn cnVar = (cn) arrayList2.get(i11);
            if (cnVar != null && (xmVar = cnVar.f23812k) != null && (arrayList = xmVar.f30952g) != null) {
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
        this.f27360b.d2(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        dn dnVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.T != z11) {
            this.T = z11;
            int size = dnVar.f24143b.size();
            for (int i14 = 0; i14 < size; i14++) {
                cn cnVar = (cn) dnVar.f24143b.get(i14);
                if (cnVar.f23812k.f30952g.size() == 1) {
                    cn.a(cnVar, cnVar.f23812k, true);
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
        UndoView undoView = this.f24435w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.f24143b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((cn) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bn bnVar = (bn) obj2;
                if (bnVar.e && (photoEntry = bnVar.f23497b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        vi viVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.f24436x.animate().alpha(0.0f).setDuration(150L).setInterpolator(es.f24468j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (viVar = this.f27360b).f29684j0) != null) {
            chatAttachAlertPhotoLayout.f22728c1.setIcon(R.drawable.msg_view_file);
            viVar.f29684j0.f22728c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            viVar.f29684j0.f22728c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override
    public final void w(int i10) {
        try {
            this.f27360b.f29684j0.w(i10);
        } catch (Exception unused) {
        }
    }
}
