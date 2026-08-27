package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class nq0 implements Utilities.Callback {

    public final int f40902a;

    public final PhotoViewer f40903b;

    public nq0(PhotoViewer photoViewer, int i10) {
        this.f40902a = i10;
        this.f40903b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11 = 9;
        int i12 = 8;
        switch (this.f40902a) {
            case 0:
                PhotoViewer photoViewer = this.f40903b;
                zf.k2 k2Var = (zf.k2) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f35608c7.get(photoViewer.L4)).filterPath);
                    zf.n2 n2Var = photoViewer.f35688l5;
                    n2Var.H = true;
                    n2Var.A = k2Var;
                    Bitmap bitmap = photoViewer.f35805y4.getBitmap();
                    photoViewer.f35805y4.getOrientation();
                    zf.k2 k2Var2 = n2Var.A;
                    photoViewer.f35805y4.setImageBitmap(k2Var2 == null ? n2Var.E : (zIsEmpty || bitmap == null) ? k2Var2.b() : n2Var.e(bitmap));
                    photoViewer.f35724p5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f35724p5.post(new hq0(photoViewer, i11));
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                org.telegram.ui.Components.mc.F(this.f40903b.f35583a0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.f40903b;
                photoViewer2.H1.f50511d2 = photoViewer2.G1.c();
                photoViewer2.f35583a0.invalidate();
                int iMax = Math.max(((Integer) obj).intValue(), photoViewer2.H1.f50515f2);
                float fDp = (!(photoViewer2.H1.O0 instanceof zf.v2) || iMax <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - iMax) - AndroidUtilities.dp(80.0f)) - photoViewer2.H1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.f35717o7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f35717o7 = null;
                }
                if (photoViewer2.f35731q4 != 3) {
                    fDp = 0.0f;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(photoViewer2.V5, fDp);
                photoViewer2.f35717o7 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new gq0(photoViewer2, i11));
                photoViewer2.f35717o7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f35717o7;
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                valueAnimator2.setInterpolator(erVar);
                photoViewer2.f35717o7.start();
                AnimatorSet animatorSet = photoViewer2.F1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new gq0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.F1 = animatorSet2;
                zf.w1 w1Var = photoViewer2.H1.f50518h1;
                Property property = View.TRANSLATION_Y;
                int i13 = -iMax;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(w1Var, (Property<zf.w1, Float>) property, i13 / 2.5f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoViewer2.H1.Y0, (Property<zf.j0, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + i13));
                lh.m5 m5Var = photoViewer2.H1.f50506b1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(m5Var, (Property<lh.m5, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.f50535w0, (Property<zf.f1, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.H1.f50537x0, (Property<zf.j1, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), valueAnimatorOfFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(erVar);
                animatorSet2.start();
                ys0 ys0Var = photoViewer2.H1;
                zf.o1 o1Var = ys0Var.f50529q1;
                if (o1Var != null) {
                    if (ys0Var.f50511d2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (ys0Var.f50509c2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(ys0Var.f50533u1, (ys0Var.f50511d2 || ys0Var.f50509c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ys0Var.f50531s1, (ys0Var.f50511d2 || ys0Var.f50509c2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ys0Var.f50536w1, ys0Var.f50511d2 || ys0Var.f50509c2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(ys0Var.f50534v1, ys0Var.f50511d2 || ys0Var.f50509c2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.f40903b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f35696m5.f34167b.J && (i10 = photoViewer3.L4) >= 0 && i10 < photoViewer3.f35608c7.size() && (photoViewer3.f35608c7.get(photoViewer3.L4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.we0 we0Var = photoViewer3.f35696m5;
                    lh.t3 t3Var = we0Var.h;
                    if (t3Var != null) {
                        t3Var.dismiss();
                        we0Var.h = null;
                    }
                    photoViewer3.f35696m5.f34167b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.l11(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f35608c7.get(photoViewer3.L4), PhotoViewer.y1(), 23));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.f40903b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f35608c7.get(photoViewer4.L4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.L4)) {
                    photoViewer4.M2();
                }
                photoViewer4.R1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.f40903b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.M7.setTranslationY(photoViewer5.L0.getTranslationY() - (photoViewer5.Q1.getAlpha() * i0.a.d(46.0f, photoViewer5.Q1.getEditTextHeight(), 0)));
                }
                photoViewer5.f35584a1.setTranslationY(photoViewer5.Q1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f35592b1.setTranslationY(photoViewer5.Q1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f35602c1.setTranslationY(photoViewer5.Q1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                lh.i iVar = photoViewer5.Q1.I;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.f40903b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f35608c7.get(photoViewer6.L4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.L4)) {
                    photoViewer6.M2();
                }
                photoViewer6.Q1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                lh.i iVar2 = this.f40903b.R1.I;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.f40903b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer7.B0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.f40903b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.B0(0, false);
                break;
        }
    }
}
