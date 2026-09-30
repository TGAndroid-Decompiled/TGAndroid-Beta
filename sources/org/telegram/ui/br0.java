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
public final class br0 implements View.OnClickListener {
    public final int f32552a;
    public final PhotoViewer f32553b;

    public br0(PhotoViewer photoViewer, int i10) {
        this.f32552a = i10;
        this.f32553b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.v71 v71Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        fu0 fu0Var;
        ai.g4 g4Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        tu0 tu0Var;
        float f7 = 1.0f;
        boolean z10 = true;
        switch (this.f32552a) {
            case 0:
                PhotoViewer photoViewer = this.f32553b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.m0();
                photoViewer.e3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f32553b;
                if (photoViewer2.I1.d()) {
                    Activity activity = photoViewer2.f31475y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f31448v2);
                        alertDialog$Builder.f18678a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f18678a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ir0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f32553b;
                photoViewer3.Y7 = photoViewer3.f31267a8;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f32553b;
                Object obj = photoViewer4.f31321g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f32553b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f32553b;
                photoViewer6.f31451v5.m(false, true);
                photoViewer6.f31461w5.m(false, true);
                photoViewer6.e3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f32553b;
                photoViewer7.f31451v5.m(false, true);
                photoViewer7.f31461w5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f32553b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.e3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f32553b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.F0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f32553b;
                if (!photoViewer10.f31405q5.f30240b.N && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.f31321g7.size() && (photoViewer10.f31321g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f31321g7.get(photoViewer10.P4);
                    long time = photoViewer10.f31405q5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f31405q5.f30240b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.z21(photoViewer10, y12, photoEntry, time, 5));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f32553b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.I1()) {
                    photoViewer11.f31408r = !photoViewer11.f31408r;
                    ArrayList arrayList = photoViewer11.f31324h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((ci.e4) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f31408r) {
                        final ci.e4 e4Var = new ci.e4(photoViewer11.f31475y, 3);
                        e4Var.p(true);
                        e4Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        e4Var.h = ci.e4.a(e4Var.getText(), e4Var.getTextPaint());
                        e4Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        e4Var.l(0.0f, 22.0f);
                        e4Var.f4623l0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f31324h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(e4Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f31324h1;
                                        ci.e4 e4Var2 = e4Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(e4Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f31333i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(e4Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f31324h1 == null) {
                            photoViewer11.f31324h1 = new ArrayList();
                        }
                        photoViewer11.f31297e0.addView(e4Var, w7.y5.e(-1, 200, 83));
                        photoViewer11.f31324h1.add(e4Var);
                        e4Var.u();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f31408r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f22201x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f31321g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f32553b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean Q1 = photoViewer12.Q1();
                boolean z11 = !Q1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.f31321g7.size()) {
                    Object obj4 = photoViewer12.f31321g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = Q1;
                        edit.putBoolean("photoLiveDefault", Q1).apply();
                        tu0 tu0Var2 = photoViewer12.d;
                        if (tu0Var2 != null) {
                            tu0Var2.m();
                        }
                    }
                }
                photoViewer12.f31307f1.a(!photoViewer12.Q1(), true);
                ViewPropertyAnimator animate = photoViewer12.S7.animate();
                if (photoViewer12.Q1()) {
                    f7 = 0.45f;
                }
                animate.alpha(f7).start();
                if (photoViewer12.Q1() && (v71Var = photoViewer12.F2) != null) {
                    v71Var.B();
                }
                photoViewer12.f31297e0.invalidate();
                if (photoViewer12.f31324h1 == null) {
                    photoViewer12.f31324h1 = new ArrayList();
                }
                if (photoViewer12.f31333i1 == null) {
                    photoViewer12.f31333i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f31324h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((ci.e4) obj5).e(true);
                }
                final ci.e4 e4Var2 = new ci.e4(photoViewer12.f31475y, 3);
                if (photoViewer12.Q1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                e4Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                e4Var2.l(0.0f, 28.0f);
                e4Var2.f4623l0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f31324h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(e4Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f31324h1;
                                ci.e4 e4Var22 = e4Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(e4Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f31333i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(e4Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f31297e0.addView(e4Var2, w7.y5.e(-1, 200, 83));
                photoViewer12.f31324h1.add(e4Var2);
                photoViewer12.f31333i1.add(e4Var2);
                e4Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f32553b;
                if (photoViewer13.d != null && !photoViewer13.I1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f32553b;
                if (photoViewer14.d != null && !photoViewer14.I1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f32553b;
                ArrayList arrayList3 = photoViewer15.f31321g7;
                if (!photoViewer15.f31453v7) {
                    fu0 fu0Var2 = photoViewer15.f31433t5;
                    if (!fu0Var2.N && fu0Var2.f41715j0 != 1 && (i12 = photoViewer15.P4) >= 0 && i12 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z12 = !isEmpty;
                        fu0 fu0Var3 = photoViewer15.f31433t5;
                        int i16 = fu0Var3.f41715j0;
                        if (i16 == 0) {
                            fu0Var3.setCancelState(true);
                            qg.n2 n2Var = photoViewer15.p5;
                            ci.ed edVar = new ci.ed(photoViewer15, z12, mediaEditState, 3);
                            n2Var.getClass();
                            n2Var.setOnClickListener(new ny0(14, n2Var, edVar));
                            TextView textView = n2Var.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                            ValueAnimator valueAnimator = n2Var.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            n2Var.Q = n2Var.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            n2Var.N = ofFloat;
                            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(n2Var, 12));
                            n2Var.N.setRepeatCount(-1);
                            n2Var.N.setRepeatMode(1);
                            n2Var.N.setDuration(2400L);
                            n2Var.N.setInterpolator(new LinearInterpolator());
                            n2Var.N.start();
                            photoViewer15.f31297e0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            fu0Var3.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.p5.f();
                            photoViewer15.f31297e0.invalidate();
                            return;
                        } else {
                            photoViewer15.p5.l();
                            photoViewer15.p5.getThanosEffect();
                            qg.n2 n2Var2 = photoViewer15.p5;
                            n2Var2.L = false;
                            n2Var2.E = null;
                            ImageReceiver imageReceiver = photoViewer15.C4;
                            if (isEmpty || (bitmap = n2Var2.K) == null) {
                                bitmap = n2Var2.I;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f31433t5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.m0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f32553b;
                photoViewer16.f31451v5.m(true, true);
                photoViewer16.f31461w5.m(false, true);
                qg.n2 n2Var3 = photoViewer16.p5;
                if (n2Var3 != null) {
                    n2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                rt0 rt0Var = photoViewer16.N1;
                if (rt0Var != null) {
                    rt0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f32553b;
                photoViewer17.f31451v5.m(false, true);
                photoViewer17.f31461w5.m(true, true);
                qg.n2 n2Var4 = photoViewer17.p5;
                if (n2Var4 != null) {
                    n2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                rt0 rt0Var2 = photoViewer17.N1;
                if (rt0Var2 != null) {
                    rt0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f32553b;
                rt0 rt0Var3 = photoViewer18.N1;
                if (rt0Var3 != null) {
                    pg.w1 w1Var = rt0Var3.f42086b;
                    if (w1Var.a()) {
                        w1Var.c();
                        return;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f31321g7.get(photoViewer18.P4)).filterPath);
                qg.n2 n2Var5 = photoViewer18.p5;
                if (n2Var5 != null && !n2Var5.G) {
                    n2Var5.L = false;
                    n2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = n2Var5.K) == null) {
                    bitmap2 = n2Var5.I;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                qg.n2 n2Var6 = photoViewer18.p5;
                if (n2Var6 == null || !n2Var6.G) {
                    photoViewer18.f31433t5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f32553b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.f31480y5.m(!fu0Var.f33902p0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.f31480y5.f33902p0 || photoViewer19.f31451v5.f33902p0 || photoViewer19.f31461w5.f33902p0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f32553b;
                wn wnVar = photoViewer20.l4;
                if (wnVar != null && (messageObject = wnVar.p5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.p5.getDialogId())) {
                    if (photoViewer20.f31368m4 == null || (of2 = photoViewer20.l4.f39582g5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.l4.p5.messageOwner.suggested_post);
                    }
                    if (!yh.s5.U(photoViewer20.T, of2.amount)) {
                        wn wnVar2 = photoViewer20.l4;
                        if (wnVar2 != null) {
                            wnVar2.Tb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.U1.o()) {
                    org.telegram.ui.Components.p6 p6Var = photoViewer20.U1.v;
                    float f10 = -photoViewer20.W1;
                    photoViewer20.W1 = f10;
                    AndroidUtilities.shakeViewSpring(p6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.T).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.T).captionLengthLimitPremium > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f31297e0);
                        return;
                    }
                    return;
                }
                wn wnVar3 = photoViewer20.l4;
                if (wnVar3 != null && wnVar3.c() && ((g4Var = photoViewer20.l4.J1) == null || g4Var.H1 == null)) {
                    photoViewer20.Z2();
                    return;
                } else {
                    photoViewer20.w2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f32553b.f31259a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f32553b;
                if (photoViewer21.f31475y != null && (tu0Var = photoViewer21.d) != null) {
                    tu0Var.V();
                    photoViewer21.G0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f32553b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.t0();
                if (!photoViewer22.I1()) {
                    if (photoViewer22.f31410r1) {
                        if (photoViewer22.f31357k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.l71) {
                                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) textureView;
                                if (l71Var.getVideoWidth() <= 0 || l71Var.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer23 = this.f32553b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f32553b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f32553b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.t0();
                if (!photoViewer25.I1()) {
                    if (photoViewer25.f31410r1) {
                        if (photoViewer25.f31357k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.l71) {
                                org.telegram.ui.Components.l71 l71Var2 = (org.telegram.ui.Components.l71) textureView2;
                                if (l71Var2.getVideoWidth() <= 0 || l71Var2.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer26 = this.f32553b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.I1()) {
                        if (photoViewer26.f31410r1) {
                            if (photoViewer26.f31357k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.l71) {
                                    org.telegram.ui.Components.l71 l71Var3 = (org.telegram.ui.Components.l71) textureView3;
                                    if (l71Var3.getVideoWidth() <= 0 || l71Var3.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer27 = this.f32553b;
                if (photoViewer27.f31397p6 == null) {
                    ar0 ar0Var = new ar0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.f24856b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.C1.f24856b.getStateMirror(), ar0Var);
                        return;
                    }
                    ar0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f32553b;
                if (photoViewer28.f31441u4 == 1) {
                    lg.p pVar = photoViewer28.C1.f24856b;
                    lg.c cVar = pVar.G;
                    if (cVar.f14281a.isInProgress() || cVar.h || pVar.f14339a.f22254e0) {
                        return;
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f32553b;
                float f11 = -photoViewer29.C1.f24856b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.O0(f11, photoViewer29.C1.f24856b.getStateMirror(), new ar0(photoViewer29, 8));
                return;
        }
    }
}
