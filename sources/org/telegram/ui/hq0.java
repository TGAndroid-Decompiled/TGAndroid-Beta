package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
public final class hq0 implements View.OnClickListener {
    public final int f38998a;
    public final PhotoViewer f38999b;

    public hq0(PhotoViewer photoViewer, int i10) {
        this.f38998a = i10;
        this.f38999b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.x61 x61Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        jt0 jt0Var;
        lh.s2 s2Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        xt0 xt0Var;
        float f9 = 1.0f;
        boolean z10 = true;
        switch (this.f38998a) {
            case 0:
                PhotoViewer photoViewer = this.f38999b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.m0();
                photoViewer.e3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38999b;
                if (photoViewer2.E1.d()) {
                    Activity activity = photoViewer2.f35864y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f35802r2);
                        alertDialog$Builder.f22714a.P = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f22714a.N = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new oq0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f38999b;
                photoViewer3.T7 = photoViewer3.V7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38999b;
                Object obj = photoViewer4.f35671c7.get(photoViewer4.L4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38999b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38999b;
                photoViewer6.f35805r5.m(false, true);
                photoViewer6.f35814s5.m(false, true);
                photoViewer6.e3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38999b;
                photoViewer7.f35805r5.m(false, true);
                photoViewer7.f35814s5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38999b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.e3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f38999b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer9.F0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f38999b;
                if (!photoViewer10.f35759m5.f28391b.J && (i10 = photoViewer10.L4) >= 0 && i10 < photoViewer10.f35671c7.size() && (photoViewer10.f35671c7.get(photoViewer10.L4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f35671c7.get(photoViewer10.L4);
                    long time = photoViewer10.f35759m5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f35759m5.f28391b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.sg(photoViewer10, y12, photoEntry, time, 11));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f38999b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f35799r = !photoViewer11.f35799r;
                    ArrayList arrayList = photoViewer11.f35674d1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((nh.t3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f35799r) {
                        final nh.t3 t3Var = new nh.t3(photoViewer11.f35864y, 3);
                        t3Var.q(true);
                        t3Var.t(LocaleController.getString(R.string.EditorMuteHint));
                        t3Var.h = nh.t3.a(t3Var.getText(), t3Var.getTextPaint());
                        t3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        t3Var.m(0.0f, 22.0f);
                        t3Var.f18597h0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f35674d1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(t3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f35674d1;
                                        nh.t3 t3Var2 = t3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(t3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f35684e1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(t3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f35674d1 == null) {
                            photoViewer11.f35674d1 = new ArrayList();
                        }
                        photoViewer11.f35647a0.addView(t3Var, i7.f6.e(-1, 200, 83));
                        photoViewer11.f35674d1.add(t3Var);
                        t3Var.v();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f35799r) {
                        CheckBox checkBox = photoViewer11.J0;
                        if (!checkBox.f26308x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f35671c7.get(photoViewer11.L4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f38999b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                boolean P1 = photoViewer12.P1();
                boolean z11 = !P1;
                int i14 = photoViewer12.L4;
                if (i14 >= 0 && i14 < photoViewer12.f35671c7.size()) {
                    Object obj4 = photoViewer12.f35671c7.get(photoViewer12.L4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        xt0 xt0Var2 = photoViewer12.d;
                        if (xt0Var2 != null) {
                            xt0Var2.m();
                        }
                    }
                }
                photoViewer12.f35657b1.a(!photoViewer12.P1(), true);
                ViewPropertyAnimator animate = photoViewer12.N7.animate();
                if (photoViewer12.P1()) {
                    f9 = 0.45f;
                }
                animate.alpha(f9).start();
                if (photoViewer12.P1() && (x61Var = photoViewer12.B2) != null) {
                    x61Var.C();
                }
                photoViewer12.f35647a0.invalidate();
                if (photoViewer12.f35674d1 == null) {
                    photoViewer12.f35674d1 = new ArrayList();
                }
                if (photoViewer12.f35684e1 == null) {
                    photoViewer12.f35684e1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f35674d1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((nh.t3) obj5).e(true);
                }
                final nh.t3 t3Var2 = new nh.t3(photoViewer12.f35864y, 3);
                if (photoViewer12.P1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                t3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                t3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                t3Var2.m(0.0f, 28.0f);
                t3Var2.f18597h0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f35674d1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(t3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f35674d1;
                                nh.t3 t3Var22 = t3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(t3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f35684e1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(t3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f35647a0.addView(t3Var2, i7.f6.e(-1, 200, 83));
                photoViewer12.f35674d1.add(t3Var2);
                photoViewer12.f35684e1.add(t3Var2);
                t3Var2.v();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f38999b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f38999b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f38999b;
                ArrayList arrayList3 = photoViewer15.f35671c7;
                if (!photoViewer15.f35806r7) {
                    jt0 jt0Var2 = photoViewer15.f35787p5;
                    if (!jt0Var2.J && jt0Var2.f2267f0 != 1 && (i12 = photoViewer15.L4) >= 0 && i12 < arrayList3.size() && !photoViewer15.f35751l5.R) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.L4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z12 = !isEmpty;
                        jt0 jt0Var3 = photoViewer15.f35787p5;
                        int i16 = jt0Var3.f2267f0;
                        if (i16 == 0) {
                            jt0Var3.setCancelState(true);
                            bg.u3 u3Var = photoViewer15.f35751l5;
                            nh.yb ybVar = new nh.yb(photoViewer15, z12, mediaEditState, 3);
                            u3Var.getClass();
                            u3Var.setOnClickListener(new ag.n(1, u3Var, ybVar));
                            TextView textView = u3Var.I;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                            ValueAnimator valueAnimator = u3Var.J;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            u3Var.M = u3Var.N;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            u3Var.J = ofFloat;
                            ofFloat.addUpdateListener(new bg.q1(u3Var, 4));
                            u3Var.J.setRepeatCount(-1);
                            u3Var.J.setRepeatMode(1);
                            u3Var.J.setDuration(2400L);
                            u3Var.J.setInterpolator(new LinearInterpolator());
                            u3Var.J.start();
                            photoViewer15.f35647a0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            jt0Var3.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.f35751l5.f();
                            photoViewer15.f35647a0.invalidate();
                            return;
                        } else {
                            photoViewer15.f35751l5.l();
                            photoViewer15.f35751l5.getThanosEffect();
                            bg.u3 u3Var2 = photoViewer15.f35751l5;
                            u3Var2.H = false;
                            u3Var2.A = null;
                            ImageReceiver imageReceiver = photoViewer15.f35869y4;
                            if (isEmpty || (bitmap = u3Var2.G) == null) {
                                bitmap = u3Var2.E;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f35787p5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.m0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f38999b;
                photoViewer16.f35805r5.m(true, true);
                photoViewer16.f35814s5.m(false, true);
                bg.u3 u3Var3 = photoViewer16.f35751l5;
                if (u3Var3 != null) {
                    u3Var3.setOutlineVisible(false);
                }
                photoViewer16.I1 = true;
                vs0 vs0Var = photoViewer16.J1;
                if (vs0Var != null) {
                    vs0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f38999b;
                photoViewer17.f35805r5.m(false, true);
                photoViewer17.f35814s5.m(true, true);
                bg.u3 u3Var4 = photoViewer17.f35751l5;
                if (u3Var4 != null) {
                    u3Var4.setOutlineVisible(false);
                }
                photoViewer17.I1 = false;
                vs0 vs0Var2 = photoViewer17.J1;
                if (vs0Var2 != null) {
                    vs0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f38999b;
                vs0 vs0Var3 = photoViewer18.J1;
                if (vs0Var3 != null) {
                    ag.n2 n2Var = vs0Var3.f2500b;
                    if (n2Var.a()) {
                        n2Var.c();
                        return;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.f35751l5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f35671c7.get(photoViewer18.L4)).filterPath);
                bg.u3 u3Var5 = photoViewer18.f35751l5;
                if (u3Var5 != null && !u3Var5.C) {
                    u3Var5.H = false;
                    u3Var5.A = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.f35869y4;
                if (isEmpty2 || (bitmap2 = u3Var5.G) == null) {
                    bitmap2 = u3Var5.E;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                bg.u3 u3Var6 = photoViewer18.f35751l5;
                if (u3Var6 == null || !u3Var6.C) {
                    photoViewer18.f35787p5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f38999b;
                if (photoViewer19.f35751l5 != null) {
                    photoViewer19.f35832u5.m(!jt0Var.f39688l0, true);
                    photoViewer19.f35751l5.setOutlineVisible((!photoViewer19.f35832u5.f39688l0 || photoViewer19.f35805r5.f39688l0 || photoViewer19.f35814s5.f39688l0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f38999b;
                tn tnVar = photoViewer20.f35715h4;
                if (tnVar != null && (messageObject = tnVar.f42880l5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.P, photoViewer20.f35715h4.f42880l5.getDialogId())) {
                    if (photoViewer20.f35724i4 == null || (of2 = photoViewer20.f35715h4.f42768c5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.f35715h4.f42880l5.messageOwner.suggested_post);
                    }
                    if (!jh.s7.U(photoViewer20.P, of2.amount)) {
                        tn tnVar2 = photoViewer20.f35715h4;
                        if (tnVar2 != null) {
                            tnVar2.Tb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.Q1.o()) {
                    org.telegram.ui.Components.o6 o6Var = photoViewer20.Q1.v;
                    float f10 = -photoViewer20.S1;
                    photoViewer20.S1 = f10;
                    AndroidUtilities.shakeViewSpring(o6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.P).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.P).captionLengthLimitPremium > photoViewer20.Q1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f35647a0);
                        return;
                    }
                    return;
                }
                tn tnVar3 = photoViewer20.f35715h4;
                if (tnVar3 != null && tnVar3.c() && ((s2Var = photoViewer20.f35715h4.F1) == null || s2Var.D1 == null)) {
                    photoViewer20.Z2();
                    return;
                } else {
                    photoViewer20.w2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f38999b.f35646a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f38999b;
                if (photoViewer21.f35864y != null && (xt0Var = photoViewer21.d) != null) {
                    xt0Var.V();
                    photoViewer21.G0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f38999b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f35765n1) {
                        if (photoViewer22.f35701f8) {
                            TextureView textureView = photoViewer22.f35858x2;
                            if (textureView instanceof org.telegram.ui.Components.l61) {
                                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) textureView;
                                if (l61Var.getVideoWidth() <= 0 || l61Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.e3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f38999b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f38999b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f38999b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f35765n1) {
                        if (photoViewer25.f35701f8) {
                            TextureView textureView2 = photoViewer25.f35858x2;
                            if (textureView2 instanceof org.telegram.ui.Components.l61) {
                                org.telegram.ui.Components.l61 l61Var2 = (org.telegram.ui.Components.l61) textureView2;
                                if (l61Var2.getVideoWidth() <= 0 || l61Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.e3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f38999b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f35765n1) {
                            if (photoViewer26.f35701f8) {
                                TextureView textureView3 = photoViewer26.f35858x2;
                                if (textureView3 instanceof org.telegram.ui.Components.l61) {
                                    org.telegram.ui.Components.l61 l61Var3 = (org.telegram.ui.Components.l61) textureView3;
                                    if (l61Var3.getVideoWidth() <= 0 || l61Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.e3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f38999b;
                if (photoViewer27.f35752l6 == null) {
                    gq0 gq0Var = new gq0(photoViewer27, 29);
                    if (!photoViewer27.F2) {
                        float stateOrientation = photoViewer27.N2 - photoViewer27.f35866y1.f31657b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.f35866y1.f31657b.getStateMirror(), gq0Var);
                        return;
                    }
                    gq0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f38999b;
                if (photoViewer28.f35795q4 == 1) {
                    wf.n nVar = photoViewer28.f35866y1.f31657b;
                    wf.b bVar = nVar.C;
                    if (bVar.f49891a.isInProgress() || bVar.h || nVar.f49953a.f26359a0) {
                        return;
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f38999b;
                float f11 = -photoViewer29.f35866y1.f31657b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.O0(f11, photoViewer29.f35866y1.f31657b.getStateMirror(), new gq0(photoViewer29, 8));
                return;
        }
    }
}
