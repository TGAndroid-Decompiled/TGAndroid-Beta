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
    public final int f38897a;
    public final PhotoViewer f38898b;

    public hq0(PhotoViewer photoViewer, int i9) {
        this.f38897a = i9;
        this.f38898b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        org.telegram.ui.Components.k61 k61Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        lt0 lt0Var;
        ih.u2 u2Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        zt0 zt0Var;
        float f10 = 1.0f;
        boolean z10 = true;
        switch (this.f38897a) {
            case 0:
                PhotoViewer photoViewer = this.f38898b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.l0();
                photoViewer.e3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f38898b;
                if (photoViewer2.E1.d()) {
                    Activity activity = photoViewer2.f35797y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f35735r2);
                        alertDialog$Builder.f22702a.P = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f22702a.N = LocaleController.getString("AppName", R.string.AppName);
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
                PhotoViewer photoViewer3 = this.f38898b;
                photoViewer3.T7 = photoViewer3.V7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f38898b;
                Object obj = photoViewer4.f35605c7.get(photoViewer4.L4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f38898b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f38898b;
                photoViewer6.f35738r5.m(false, true);
                photoViewer6.f35748s5.m(false, true);
                photoViewer6.e3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f38898b;
                photoViewer7.f35738r5.m(false, true);
                photoViewer7.f35748s5.m(false, true);
                photoViewer7.l0();
                photoViewer7.e3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f38898b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.e3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f38898b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer9.E0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f38898b;
                if (!photoViewer10.f35693m5.f32147b.J && (i9 = photoViewer10.L4) >= 0 && i9 < photoViewer10.f35605c7.size() && (photoViewer10.f35605c7.get(photoViewer10.L4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f35605c7.get(photoViewer10.L4);
                    long time = photoViewer10.f35693m5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f35693m5.f32147b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.lg(photoViewer10, y12, photoEntry, time, 11));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f38898b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f35732r = !photoViewer11.f35732r;
                    ArrayList arrayList = photoViewer11.f35608d1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            ((kh.x3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f35732r) {
                        final kh.x3 x3Var = new kh.x3(photoViewer11.f35797y, 3);
                        x3Var.q(true);
                        x3Var.t(LocaleController.getString(R.string.EditorMuteHint));
                        x3Var.h = kh.x3.a(x3Var.getText(), x3Var.getTextPaint());
                        x3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        x3Var.m(0.0f, 22.0f);
                        x3Var.f16352h0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f35608d1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(x3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f35608d1;
                                        kh.x3 x3Var2 = x3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(x3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f35618e1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(x3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f35608d1 == null) {
                            photoViewer11.f35608d1 = new ArrayList();
                        }
                        photoViewer11.f35580a0.addView(x3Var, g7.e6.e(-1, 200, 83));
                        photoViewer11.f35608d1.add(x3Var);
                        x3Var.v();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f35732r) {
                        CheckBox checkBox = photoViewer11.J0;
                        if (!checkBox.f26297x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f35605c7.get(photoViewer11.L4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f38898b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                boolean P1 = photoViewer12.P1();
                boolean z11 = !P1;
                int i13 = photoViewer12.L4;
                if (i13 >= 0 && i13 < photoViewer12.f35605c7.size()) {
                    Object obj4 = photoViewer12.f35605c7.get(photoViewer12.L4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        zt0 zt0Var2 = photoViewer12.d;
                        if (zt0Var2 != null) {
                            zt0Var2.m();
                        }
                    }
                }
                photoViewer12.f35589b1.a(!photoViewer12.P1(), true);
                ViewPropertyAnimator animate = photoViewer12.N7.animate();
                if (photoViewer12.P1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer12.P1() && (k61Var = photoViewer12.B2) != null) {
                    k61Var.C();
                }
                photoViewer12.f35580a0.invalidate();
                if (photoViewer12.f35608d1 == null) {
                    photoViewer12.f35608d1 = new ArrayList();
                }
                if (photoViewer12.f35618e1 == null) {
                    photoViewer12.f35618e1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f35608d1;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    ((kh.x3) obj5).e(true);
                }
                final kh.x3 x3Var2 = new kh.x3(photoViewer12.f35797y, 3);
                if (photoViewer12.P1()) {
                    i10 = R.string.LivePhotoOff;
                } else {
                    i10 = R.string.LivePhotoOn;
                }
                x3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
                x3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                x3Var2.m(0.0f, 28.0f);
                x3Var2.f16352h0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f35608d1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(x3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f35608d1;
                                kh.x3 x3Var22 = x3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(x3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f35618e1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(x3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f35580a0.addView(x3Var2, g7.e6.e(-1, 200, 83));
                photoViewer12.f35608d1.add(x3Var2);
                photoViewer12.f35618e1.add(x3Var2);
                x3Var2.v();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f38898b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.F0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f38898b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.F0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f38898b;
                ArrayList arrayList3 = photoViewer15.f35605c7;
                if (!photoViewer15.f35740r7) {
                    lt0 lt0Var2 = photoViewer15.f35720p5;
                    if (!lt0Var2.J && lt0Var2.f49777f0 != 1 && (i11 = photoViewer15.L4) >= 0 && i11 < arrayList3.size() && !photoViewer15.f35685l5.R) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.L4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z12 = !isEmpty;
                        lt0 lt0Var3 = photoViewer15.f35720p5;
                        int i15 = lt0Var3.f49777f0;
                        if (i15 == 0) {
                            lt0Var3.setCancelState(true);
                            yf.m2 m2Var = photoViewer15.f35685l5;
                            kh.oc ocVar = new kh.oc(photoViewer15, z12, mediaEditState, 3);
                            m2Var.getClass();
                            m2Var.setOnClickListener(new pf.v(5, m2Var, ocVar));
                            TextView textView = m2Var.I;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            ValueAnimator valueAnimator = m2Var.J;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            m2Var.M = m2Var.N;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            m2Var.J = ofFloat;
                            ofFloat.addUpdateListener(new kh.g4(m2Var, 23));
                            m2Var.J.setRepeatCount(-1);
                            m2Var.J.setRepeatMode(1);
                            m2Var.J.setDuration(2400L);
                            m2Var.J.setInterpolator(new LinearInterpolator());
                            m2Var.J.start();
                            photoViewer15.f35580a0.invalidate();
                            return;
                        } else if (i15 == 2) {
                            lt0Var3.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.f35685l5.f();
                            photoViewer15.f35580a0.invalidate();
                            return;
                        } else {
                            photoViewer15.f35685l5.l();
                            photoViewer15.f35685l5.getThanosEffect();
                            yf.m2 m2Var2 = photoViewer15.f35685l5;
                            m2Var2.H = false;
                            m2Var2.A = null;
                            ImageReceiver imageReceiver = photoViewer15.f35802y4;
                            if (isEmpty || (bitmap = m2Var2.G) == null) {
                                bitmap = m2Var2.E;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f35720p5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.l0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f38898b;
                photoViewer16.f35738r5.m(true, true);
                photoViewer16.f35748s5.m(false, true);
                yf.m2 m2Var3 = photoViewer16.f35685l5;
                if (m2Var3 != null) {
                    m2Var3.setOutlineVisible(false);
                }
                photoViewer16.I1 = true;
                ws0 ws0Var = photoViewer16.J1;
                if (ws0Var != null) {
                    ws0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f38898b;
                photoViewer17.f35738r5.m(false, true);
                photoViewer17.f35748s5.m(true, true);
                yf.m2 m2Var4 = photoViewer17.f35685l5;
                if (m2Var4 != null) {
                    m2Var4.setOutlineVisible(false);
                }
                photoViewer17.I1 = false;
                ws0 ws0Var2 = photoViewer17.J1;
                if (ws0Var2 != null) {
                    ws0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f38898b;
                ws0 ws0Var3 = photoViewer18.J1;
                if (ws0Var3 != null) {
                    xf.t1 t1Var = ws0Var3.f50129b;
                    if (t1Var.a()) {
                        t1Var.c();
                        return;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.f35685l5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f35605c7.get(photoViewer18.L4)).filterPath);
                yf.m2 m2Var5 = photoViewer18.f35685l5;
                if (m2Var5 != null && !m2Var5.C) {
                    m2Var5.H = false;
                    m2Var5.A = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.f35802y4;
                if (isEmpty2 || (bitmap2 = m2Var5.G) == null) {
                    bitmap2 = m2Var5.E;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                yf.m2 m2Var6 = photoViewer18.f35685l5;
                if (m2Var6 == null || !m2Var6.C) {
                    photoViewer18.f35720p5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f38898b;
                if (photoViewer19.f35685l5 != null) {
                    photoViewer19.f35766u5.m(!lt0Var.f40229l0, true);
                    photoViewer19.f35685l5.setOutlineVisible((!photoViewer19.f35766u5.f40229l0 || photoViewer19.f35738r5.f40229l0 || photoViewer19.f35748s5.f40229l0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f38898b;
                qn qnVar = photoViewer20.f35649h4;
                if (qnVar != null && (messageObject = qnVar.f41982l5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.P, photoViewer20.f35649h4.f41982l5.getDialogId())) {
                    if (photoViewer20.f35658i4 == null || (of2 = photoViewer20.f35649h4.f41870c5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.f35649h4.f41982l5.messageOwner.suggested_post);
                    }
                    if (!gh.v7.U(photoViewer20.P, of2.amount)) {
                        qn qnVar2 = photoViewer20.f35649h4;
                        if (qnVar2 != null) {
                            qnVar2.Tb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.Q1.o()) {
                    org.telegram.ui.Components.j6 j6Var = photoViewer20.Q1.v;
                    float f11 = -photoViewer20.S1;
                    photoViewer20.S1 = f11;
                    AndroidUtilities.shakeViewSpring(j6Var, f11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.P).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.P).captionLengthLimitPremium > photoViewer20.Q1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f35580a0);
                        return;
                    }
                    return;
                }
                qn qnVar3 = photoViewer20.f35649h4;
                if (qnVar3 != null && qnVar3.c() && ((u2Var = photoViewer20.f35649h4.F1) == null || u2Var.D1 == null)) {
                    photoViewer20.Z2();
                    return;
                } else {
                    photoViewer20.w2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f38898b.f35579a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f38898b;
                if (photoViewer21.f35797y != null && (zt0Var = photoViewer21.d) != null) {
                    zt0Var.V();
                    photoViewer21.F0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f38898b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer22.s0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f35699n1) {
                        if (photoViewer22.f35635f8) {
                            TextureView textureView = photoViewer22.f35790x2;
                            if (textureView instanceof org.telegram.ui.Components.y51) {
                                org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) textureView;
                                if (y51Var.getVideoWidth() <= 0 || y51Var.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer23 = this.f38898b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f38898b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f38898b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer25.s0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f35699n1) {
                        if (photoViewer25.f35635f8) {
                            TextureView textureView2 = photoViewer25.f35790x2;
                            if (textureView2 instanceof org.telegram.ui.Components.y51) {
                                org.telegram.ui.Components.y51 y51Var2 = (org.telegram.ui.Components.y51) textureView2;
                                if (y51Var2.getVideoWidth() <= 0 || y51Var2.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer26 = this.f38898b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.s0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f35699n1) {
                            if (photoViewer26.f35635f8) {
                                TextureView textureView3 = photoViewer26.f35790x2;
                                if (textureView3 instanceof org.telegram.ui.Components.y51) {
                                    org.telegram.ui.Components.y51 y51Var3 = (org.telegram.ui.Components.y51) textureView3;
                                    if (y51Var3.getVideoWidth() <= 0 || y51Var3.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer27 = this.f38898b;
                if (photoViewer27.f35686l6 == null) {
                    gq0 gq0Var = new gq0(photoViewer27, 29);
                    if (!photoViewer27.F2) {
                        float stateOrientation = photoViewer27.N2 - photoViewer27.f35799y1.f27183b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.f35799y1.f27183b.getStateMirror(), gq0Var);
                        return;
                    }
                    gq0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f38898b;
                if (photoViewer28.f35727q4 == 1) {
                    tf.n nVar = photoViewer28.f35799y1.f27183b;
                    tf.b bVar = nVar.C;
                    if (bVar.f47842a.isInProgress() || bVar.h || nVar.f47904a.f26348a0) {
                        return;
                    }
                }
                photoViewer28.l0();
                photoViewer28.e3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f38898b;
                float f12 = -photoViewer29.f35799y1.f27183b.getStateOrientation();
                if (Math.abs(f12) > 180.0f) {
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    } else {
                        f12 = -(360.0f - f12);
                    }
                }
                photoViewer29.O0(f12, photoViewer29.f35799y1.f27183b.getStateMirror(), new gq0(photoViewer29, 8));
                return;
        }
    }
}
