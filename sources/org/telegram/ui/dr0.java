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
public final class dr0 implements Utilities.Callback {
    public final int f38922a;
    public final PhotoViewer f38923b;

    public dr0(PhotoViewer photoViewer, int i10) {
        this.f38922a = i10;
        this.f38923b = photoViewer;
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
        switch (this.f38922a) {
            case 0:
                PhotoViewer photoViewer = this.f38923b;
                sg.m2 m2Var = (sg.m2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.g7.get(photoViewer.P4)).filterPath);
                    sg.p2 p2Var = photoViewer.f35744p5;
                    p2Var.L = true;
                    p2Var.E = m2Var;
                    Bitmap bitmap = photoViewer.C4.getBitmap();
                    photoViewer.C4.getOrientation();
                    sg.m2 m2Var2 = p2Var.E;
                    if (m2Var2 == null) {
                        b10 = p2Var.I;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = p2Var.e(bitmap);
                    } else {
                        b10 = m2Var2.b();
                    }
                    photoViewer.C4.setImageBitmap(b10);
                    photoViewer.f35780t5.setUndoCutState(true);
                    photoViewer.c3(true, true);
                    photoViewer.f35780t5.post(new xq0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.wc.F(this.f38923b.f35643e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f38923b;
                photoViewer2.L1.W1 = photoViewer2.K1.c();
                photoViewer2.f35643e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.Y1);
                if ((photoViewer2.L1.H0 instanceof sg.x2) && max > 0) {
                    f7 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f35773s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f35773s7 = null;
                }
                if (photoViewer2.f35788u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f35773s7 = ofFloat;
                ofFloat.addUpdateListener(new wq0(photoViewer2, 9));
                photoViewer2.f35773s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f35773s7;
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
                valueAnimator2.setInterpolator(dsVar);
                photoViewer2.f35773s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new wq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                sg.y1 y1Var = photoViewer2.L1.f48329a1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y1Var, property, (-max) / 2.5f);
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
                sg.h1 h1Var = photoViewer2.L1.f48345p0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h1Var, property2, f11);
                sg.l1 l1Var = photoViewer2.L1.f48347q0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(l1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(dsVar);
                animatorSet2.start();
                nt0 nt0Var = photoViewer2.L1;
                sg.q1 q1Var = nt0Var.f48340j1;
                if (q1Var != null) {
                    if (nt0Var.W1) {
                        q1Var.a(R.drawable.input_smile);
                    } else if (nt0Var.V1) {
                        q1Var.a(R.drawable.input_keyboard);
                    } else {
                        q1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = nt0Var.f48343n1;
                if (!nt0Var.W1 && !nt0Var.V1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = nt0Var.l1;
                if (!nt0Var.W1 && !nt0Var.V1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = nt0Var.f48346p1;
                if (!nt0Var.W1 && !nt0Var.V1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = nt0Var.f48344o1;
                if (!nt0Var.W1 && !nt0Var.V1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f38923b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.q5.f28182b.Q && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.g7.size() && (photoViewer3.g7.get(photoViewer3.P4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.fg0 fg0Var = photoViewer3.q5;
                    fi.s3 s3Var = fg0Var.h;
                    if (s3Var != null) {
                        s3Var.dismiss();
                        fg0Var.h = null;
                    }
                    photoViewer3.q5.f28182b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new ag0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.g7.get(photoViewer3.P4), PhotoViewer.z1(), 5));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f38923b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.g7.get(photoViewer4.P4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.O2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f38923b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f35644e1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f35654f1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                photoViewer5.f35662g1.setTranslationY(photoViewer5.U1.getAlpha() * (-org.telegram.messenger.t.c(46.0f, num2.intValue(), 0)));
                fi.i iVar = photoViewer5.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f38923b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.O2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                fi.i iVar2 = this.f38923b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f38923b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f38923b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
