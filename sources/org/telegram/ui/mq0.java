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
public final class mq0 implements Utilities.Callback {
    public final int f40625a;
    public final PhotoViewer f40626b;

    public mq0(PhotoViewer photoViewer, int i10) {
        this.f40625a = i10;
        this.f40626b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f9;
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        switch (this.f40625a) {
            case 0:
                PhotoViewer photoViewer = this.f40626b;
                bg.r3 r3Var = (bg.r3) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f35671c7.get(photoViewer.L4)).filterPath);
                    bg.u3 u3Var = photoViewer.f35751l5;
                    u3Var.H = true;
                    u3Var.A = r3Var;
                    Bitmap bitmap = photoViewer.f35869y4.getBitmap();
                    photoViewer.f35869y4.getOrientation();
                    bg.r3 r3Var2 = u3Var.A;
                    if (r3Var2 == null) {
                        b10 = u3Var.E;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = u3Var.e(bitmap);
                    } else {
                        b10 = r3Var2.b();
                    }
                    photoViewer.f35869y4.setImageBitmap(b10);
                    photoViewer.f35787p5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f35787p5.post(new gq0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.tc.F(this.f40626b.f35647a0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f40626b;
                photoViewer2.H1.f2230d2 = photoViewer2.G1.c();
                photoViewer2.f35647a0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.H1.f2234f2);
                if ((photoViewer2.H1.O0 instanceof bg.f4) && max > 0) {
                    f9 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.H1.getSelectedEntityBottom();
                } else {
                    f9 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f35780o7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f35780o7 = null;
                }
                if (photoViewer2.f35795q4 != 3) {
                    f9 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.V5, f9);
                photoViewer2.f35780o7 = ofFloat;
                ofFloat.addUpdateListener(new fq0(photoViewer2, 9));
                photoViewer2.f35780o7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f35780o7;
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
                valueAnimator2.setInterpolator(jrVar);
                photoViewer2.f35780o7.start();
                AnimatorSet animatorSet = photoViewer2.F1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.F1 = animatorSet2;
                bg.w2 w2Var = photoViewer2.H1.f2237h1;
                Property property = View.TRANSLATION_Y;
                int i11 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w2Var, property, i11 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.H1.Y0, property, Math.min(0, AndroidUtilities.dp(40.0f) + i11));
                bg.l0 l0Var = photoViewer2.H1.f2225b1;
                Property property2 = View.ALPHA;
                float f12 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l0Var, property2, f10);
                bg.e2 e2Var = photoViewer2.H1.f2254w0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(e2Var, property2, f11);
                bg.i2 i2Var = photoViewer2.H1.f2256x0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(i2Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(jrVar);
                animatorSet2.start();
                ws0 ws0Var = photoViewer2.H1;
                bg.n2 n2Var = ws0Var.f2248q1;
                if (n2Var != null) {
                    if (ws0Var.f2230d2) {
                        n2Var.a(R.drawable.input_smile);
                    } else if (ws0Var.f2228c2) {
                        n2Var.a(R.drawable.input_keyboard);
                    } else {
                        n2Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = ws0Var.f2252u1;
                if (!ws0Var.f2230d2 && !ws0Var.f2228c2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = ws0Var.f2250s1;
                if (!ws0Var.f2230d2 && !ws0Var.f2228c2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = ws0Var.f2255w1;
                if (!ws0Var.f2230d2 && !ws0Var.f2228c2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = ws0Var.f2253v1;
                if (!ws0Var.f2230d2 && !ws0Var.f2228c2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f40626b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f35759m5.f28391b.J && (i10 = photoViewer3.L4) >= 0 && i10 < photoViewer3.f35671c7.size() && (photoViewer3.f35671c7.get(photoViewer3.L4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.ff0 ff0Var = photoViewer3.f35759m5;
                    nh.r3 r3Var3 = ff0Var.h;
                    if (r3Var3 != null) {
                        r3Var3.dismiss();
                        ff0Var.h = null;
                    }
                    photoViewer3.f35759m5.f28391b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new n20(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f35671c7.get(photoViewer3.L4), PhotoViewer.y1(), 21));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f40626b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f35671c7.get(photoViewer4.L4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.L4)) {
                    photoViewer4.M2();
                }
                photoViewer4.R1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f40626b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.M7.setTranslationY(photoViewer5.L0.getTranslationY() - (photoViewer5.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer5.Q1.getEditTextHeight(), 0)));
                }
                photoViewer5.f35648a1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f35657b1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f35667c1.setTranslationY(photoViewer5.Q1.getAlpha() * (-j7.l1.d(46.0f, num2.intValue(), 0)));
                nh.i iVar = photoViewer5.Q1.I;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f40626b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f35671c7.get(photoViewer6.L4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.L4)) {
                    photoViewer6.M2();
                }
                photoViewer6.Q1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                nh.i iVar2 = this.f40626b.R1.I;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f40626b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer7.B0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f40626b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.B0(0, false);
                return;
        }
    }
}
