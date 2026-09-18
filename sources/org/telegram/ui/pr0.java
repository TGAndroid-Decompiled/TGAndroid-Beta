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
public final class pr0 implements Utilities.Callback {
    public final int f36596a;
    public final PhotoViewer f36597b;

    public pr0(PhotoViewer photoViewer, int i10) {
        this.f36596a = i10;
        this.f36597b = photoViewer;
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
        switch (this.f36596a) {
            case 0:
                PhotoViewer photoViewer = this.f36597b;
                qg.j2 j2Var = (qg.j2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f31205g7.get(photoViewer.P4)).filterPath);
                    qg.m2 m2Var = photoViewer.p5;
                    m2Var.L = true;
                    m2Var.E = j2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    qg.j2 j2Var2 = m2Var.E;
                    if (j2Var2 == null) {
                        b10 = m2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = m2Var.e(bitmap);
                    } else {
                        b10 = j2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f31317t5.setUndoCutState(true);
                    photoViewer.Z2(true, true);
                    photoViewer.f31317t5.post(new jr0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.xc.F(this.f36597b.f31181e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f36597b;
                photoViewer2.L1.f41751h2 = photoViewer2.K1.c();
                photoViewer2.f31181e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f41755j2);
                if ((photoViewer2.L1.S0 instanceof qg.u2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f31310s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f31310s7 = null;
                }
                if (photoViewer2.f31325u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f31310s7 = ofFloat;
                ofFloat.addUpdateListener(new ir0(photoViewer2, 9));
                photoViewer2.f31310s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f31310s7;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                valueAnimator2.setInterpolator(qrVar);
                photoViewer2.f31310s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ir0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                qg.w1 w1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                int i11 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w1Var, property, i11 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f41740c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i11));
                ci.x5 x5Var = photoViewer2.L1.f41746f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x5Var, property2, f10);
                qg.f1 f1Var = photoViewer2.L1.A0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f1Var, property2, f11);
                qg.j1 j1Var = photoViewer2.L1.B0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(j1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(qrVar);
                animatorSet2.start();
                au0 au0Var = photoViewer2.L1;
                qg.o1 o1Var = au0Var.f41769u1;
                if (o1Var != null) {
                    if (au0Var.f41751h2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (au0Var.f41749g2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = au0Var.f41773y1;
                if (!au0Var.f41751h2 && !au0Var.f41749g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = au0Var.f41771w1;
                if (!au0Var.f41751h2 && !au0Var.f41749g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = au0Var.A1;
                if (!au0Var.f41751h2 && !au0Var.f41749g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = au0Var.f41774z1;
                if (!au0Var.f41751h2 && !au0Var.f41749g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f36597b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f31289q5.f28376b.N && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.f31205g7.size() && (photoViewer3.f31205g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.tf0 tf0Var = photoViewer3.f31289q5;
                    ci.b4 b4Var = tf0Var.h;
                    if (b4Var != null) {
                        b4Var.dismiss();
                        tf0Var.h = null;
                    }
                    photoViewer3.f31289q5.f28376b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.wn0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f31205g7.get(photoViewer3.P4), PhotoViewer.y1(), 28));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f36597b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f31205g7.get(photoViewer4.P4);
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
                PhotoViewer photoViewer5 = this.f36597b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.q.c(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f31182e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f31191f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f31199g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.c(46.0f, num2.intValue(), 0)));
                ci.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f36597b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f31205g7.get(photoViewer6.P4);
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
                ci.i iVar2 = this.f36597b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f36597b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f36597b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
