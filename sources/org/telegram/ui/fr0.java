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
public final class fr0 implements Utilities.Callback {
    public final int f39418a;
    public final PhotoViewer f39419b;

    public fr0(PhotoViewer photoViewer, int i10) {
        this.f39418a = i10;
        this.f39419b = photoViewer;
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
        switch (this.f39418a) {
            case 0:
                PhotoViewer photoViewer = this.f39419b;
                sg.l2 l2Var = (sg.l2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.g7.get(photoViewer.P4)).filterPath);
                    sg.o2 o2Var = photoViewer.f35771p5;
                    o2Var.L = true;
                    o2Var.E = l2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    sg.l2 l2Var2 = o2Var.E;
                    if (l2Var2 == null) {
                        b10 = o2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = o2Var.e(bitmap);
                    } else {
                        b10 = l2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f35807t5.setUndoCutState(true);
                    photoViewer.d3(true, true);
                    photoViewer.f35807t5.post(new zq0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.wc.F(this.f39419b.f35670e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f39419b;
                photoViewer2.L1.W1 = photoViewer2.K1.c();
                photoViewer2.f35670e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.Y1);
                if ((photoViewer2.L1.H0 instanceof sg.w2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f35800s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f35800s7 = null;
                }
                if (photoViewer2.f35815u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f35800s7 = ofFloat;
                ofFloat.addUpdateListener(new yq0(photoViewer2, 9));
                photoViewer2.f35800s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f35800s7;
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                valueAnimator2.setInterpolator(dsVar);
                photoViewer2.f35800s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new yq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                sg.x1 x1Var = photoViewer2.L1.f48358a1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.R0, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                fi.l5 l5Var = photoViewer2.L1.U0;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l5Var, property2, f10);
                sg.g1 g1Var = photoViewer2.L1.f48374p0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g1Var, property2, f11);
                sg.k1 k1Var = photoViewer2.L1.f48376q0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(k1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(dsVar);
                animatorSet2.start();
                pt0 pt0Var = photoViewer2.L1;
                sg.p1 p1Var = pt0Var.f48369j1;
                if (p1Var != null) {
                    if (pt0Var.W1) {
                        p1Var.a(R.drawable.input_smile);
                    } else if (pt0Var.V1) {
                        p1Var.a(R.drawable.input_keyboard);
                    } else {
                        p1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = pt0Var.f48372n1;
                if (!pt0Var.W1 && !pt0Var.V1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = pt0Var.l1;
                if (!pt0Var.W1 && !pt0Var.V1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = pt0Var.f48375p1;
                if (!pt0Var.W1 && !pt0Var.V1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = pt0Var.f48373o1;
                if (!pt0Var.W1 && !pt0Var.V1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f39419b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.q5.f28578b.Q && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.g7.size() && (photoViewer3.g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.gg0 gg0Var = photoViewer3.q5;
                    fi.s3 s3Var = gg0Var.h;
                    if (s3Var != null) {
                        s3Var.dismiss();
                        gg0Var.h = null;
                    }
                    photoViewer3.q5.f28578b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new cg0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.g7.get(photoViewer3.P4), PhotoViewer.A1(), 5));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f39419b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.P2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f39419b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f35671e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f35681f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f35689g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                fi.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f39419b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.P2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                fi.i iVar2 = this.f39419b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f39419b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f39419b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
