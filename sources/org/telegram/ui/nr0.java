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
public final class nr0 implements Utilities.Callback {
    public final int f40349a;
    public final PhotoViewer f40350b;

    public nr0(PhotoViewer photoViewer, int i10) {
        this.f40349a = i10;
        this.f40350b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f7;
        int i10;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        switch (this.f40349a) {
            case 0:
                PhotoViewer photoViewer = this.f40350b;
                qg.k2 k2Var = (qg.k2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f33956g7.get(photoViewer.P4)).filterPath);
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
                    photoViewer.f34068t5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f34068t5.post(new hr0(photoViewer, 9));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.ad.F(this.f40350b.f33932e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f40350b;
                photoViewer2.L1.f46469h2 = photoViewer2.K1.c();
                photoViewer2.f33932e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.f46473j2);
                if ((photoViewer2.L1.S0 instanceof qg.v2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f34061s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f34061s7 = null;
                }
                if (photoViewer2.f34076u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f34061s7 = ofFloat;
                ofFloat.addUpdateListener(new gr0(photoViewer2, 9));
                photoViewer2.f34061s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f34061s7;
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
                valueAnimator2.setInterpolator(isVar);
                photoViewer2.f34061s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new gr0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                qg.w1 w1Var = photoViewer2.L1.l1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.f46458c1, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                ci.w5 w5Var = photoViewer2.L1.f46464f1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w5Var, property2, f10);
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
                animatorSet2.setInterpolator(isVar);
                animatorSet2.start();
                au0 au0Var = photoViewer2.L1;
                qg.o1 o1Var = au0Var.f46487u1;
                if (o1Var != null) {
                    if (au0Var.f46469h2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (au0Var.f46467g2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = au0Var.f46491y1;
                if (!au0Var.f46469h2 && !au0Var.f46467g2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = au0Var.f46489w1;
                if (!au0Var.f46469h2 && !au0Var.f46467g2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = au0Var.A1;
                if (!au0Var.f46469h2 && !au0Var.f46467g2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = au0Var.f46492z1;
                if (!au0Var.f46469h2 && !au0Var.f46467g2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f40350b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f34040q5.f29050b.N && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.f33956g7.size() && (photoViewer3.f33956g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.ng0 ng0Var = photoViewer3.f34040q5;
                    ci.z3 z3Var = ng0Var.h;
                    if (z3Var != null) {
                        z3Var.dismiss();
                        ng0Var.h = null;
                    }
                    photoViewer3.f34040q5.f29050b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.qo0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f33956g7.get(photoViewer3.P4), PhotoViewer.y1(), 28));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f40350b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f33956g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.M2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f40350b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f33933e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f33942f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f33950g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.q.b(46.0f, num2.intValue(), 0)));
                ci.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f40350b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f33956g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.M2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                ci.i iVar2 = this.f40350b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f40350b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f40350b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
