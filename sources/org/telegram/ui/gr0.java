package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class gr0 implements Utilities.Callback {
    public final int f34042a;
    public final PhotoViewer f34043b;

    public gr0(PhotoViewer photoViewer, int i10) {
        this.f34042a = i10;
        this.f34043b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f7;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        switch (this.f34042a) {
            case 0:
                PhotoViewer photoViewer = this.f34043b;
                qg.k2 k2Var = (qg.k2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f31248g7.get(photoViewer.P4)).filterPath);
                    qg.n2 n2Var = photoViewer.p5;
                    n2Var.L = true;
                    n2Var.E = k2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    qg.k2 k2Var2 = n2Var.E;
                    if (k2Var2 == null) {
                        b10 = n2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = n2Var.e(bitmap);
                    } else {
                        b10 = k2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f31360t5.setUndoCutState(true);
                    photoViewer.Z2(true, true);
                    photoViewer.f31360t5.post(new ar0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.xc.F(this.f34043b.f31224e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f34043b;
                photoViewer2.L1.f41785h2 = photoViewer2.K1.c();
                photoViewer2.f31224e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f41789j2);
                if ((photoViewer2.L1.S0 instanceof qg.v2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f31353s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f31353s7 = null;
                }
                if (photoViewer2.f31368u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f31353s7 = ofFloat;
                ofFloat.addUpdateListener(new zq0(photoViewer2, 9));
                photoViewer2.f31353s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f31353s7;
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                valueAnimator2.setInterpolator(rrVar);
                photoViewer2.f31353s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new zq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                qg.x1 x1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                int i11 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x1Var, property, i11 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f41774c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i11));
                ci.w5 w5Var = photoViewer2.L1.f41780f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w5Var, property2, f10);
                qg.g1 g1Var = photoViewer2.L1.A0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g1Var, property2, f11);
                qg.k1 k1Var = photoViewer2.L1.B0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(k1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(rrVar);
                animatorSet2.start();
                st0 st0Var = photoViewer2.L1;
                qg.p1 p1Var = st0Var.f41803u1;
                if (p1Var != null) {
                    if (st0Var.f41785h2) {
                        p1Var.a(R.drawable.input_smile);
                    } else if (st0Var.f41783g2) {
                        p1Var.a(R.drawable.input_keyboard);
                    } else {
                        p1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = st0Var.f41807y1;
                if (!st0Var.f41785h2 && !st0Var.f41783g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = st0Var.f41805w1;
                if (!st0Var.f41785h2 && !st0Var.f41783g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = st0Var.A1;
                if (!st0Var.f41785h2 && !st0Var.f41783g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = st0Var.f41808z1;
                if (!st0Var.f41785h2 && !st0Var.f41783g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f34043b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f31332q5.f28779b.N && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.f31248g7.size() && (photoViewer3.f31248g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.uf0 uf0Var = photoViewer3.f31332q5;
                    ci.a4 a4Var = uf0Var.h;
                    if (a4Var != null) {
                        a4Var.dismiss();
                        uf0Var.h = null;
                    }
                    photoViewer3.f31332q5.f28779b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.vn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f31248g7.get(photoViewer3.P4), PhotoViewer.y1(), 29));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f34043b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f31248g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.L2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f34043b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.f0.b(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f31225e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.f0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f31234f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.f0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f31242g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.f0.b(46.0f, num2.intValue(), 0)));
                ci.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f34043b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f31248g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.L2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                ci.i iVar2 = this.f34043b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f34043b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f34043b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
