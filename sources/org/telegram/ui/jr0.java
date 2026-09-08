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
public final class jr0 implements View.OnClickListener {
    public final int f37861a;
    public final PhotoViewer f37862b;

    public jr0(PhotoViewer photoViewer, int i10) {
        this.f37861a = i10;
        this.f37862b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.g71 g71Var;
        int i12;
        Bitmap bitmap;
        Bitmap bitmap2;
        mu0 mu0Var;
        bi.t3 t3Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        av0 av0Var;
        float f7 = 1.0f;
        boolean z10 = true;
        switch (this.f37861a) {
            case 0:
                PhotoViewer photoViewer = this.f37862b;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.m0();
                photoViewer.e3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f37862b;
                if (photoViewer2.I1.d()) {
                    Activity activity = photoViewer2.f33754y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f33727v2);
                        alertDialog$Builder.f20225a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f20225a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new qr0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.e3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f37862b;
                photoViewer3.X7 = photoViewer3.Z7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f37862b;
                Object obj = photoViewer4.f33600g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f37862b;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f37862b;
                photoViewer6.f33730v5.m(false, true);
                photoViewer6.f33740w5.m(false, true);
                photoViewer6.e3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f37862b;
                photoViewer7.f33730v5.m(false, true);
                photoViewer7.f33740w5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f37862b;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer8.e3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f37862b;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                photoViewer9.F0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f37862b;
                if (!photoViewer10.f33684q5.f27842b.N && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.f33600g7.size() && (photoViewer10.f33600g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f33600g7.get(photoViewer10.P4);
                    long time = photoViewer10.f33684q5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f33684q5.f27842b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.i21(photoViewer10, y12, photoEntry, time, 5));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f37862b;
                Drawable[] drawableArr5 = PhotoViewer.T8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f33687r = !photoViewer11.f33687r;
                    ArrayList arrayList = photoViewer11.f33603h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((di.f4) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f33687r) {
                        final di.f4 f4Var = new di.f4(photoViewer11.f33754y, 3);
                        f4Var.p(true);
                        f4Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        f4Var.h = di.f4.a(f4Var.getText(), f4Var.getTextPaint());
                        f4Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        f4Var.l(0.0f, 22.0f);
                        f4Var.f7238l0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f33603h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(f4Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f33603h1;
                                        di.f4 f4Var2 = f4Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(f4Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f33612i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(f4Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f33603h1 == null) {
                            photoViewer11.f33603h1 = new ArrayList();
                        }
                        photoViewer11.f33576e0.addView(f4Var, w7.x5.e(-1, 200, 83));
                        photoViewer11.f33603h1.add(f4Var);
                        f4Var.u();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f33687r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f23918x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f33600g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f37862b;
                Drawable[] drawableArr6 = PhotoViewer.T8;
                boolean P1 = photoViewer12.P1();
                boolean z11 = !P1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.f33600g7.size()) {
                    Object obj4 = photoViewer12.f33600g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        av0 av0Var2 = photoViewer12.d;
                        if (av0Var2 != null) {
                            av0Var2.m();
                        }
                    }
                }
                photoViewer12.f33586f1.a(!photoViewer12.P1(), true);
                ViewPropertyAnimator animate = photoViewer12.R7.animate();
                if (photoViewer12.P1()) {
                    f7 = 0.45f;
                }
                animate.alpha(f7).start();
                if (photoViewer12.P1() && (g71Var = photoViewer12.F2) != null) {
                    g71Var.B();
                }
                photoViewer12.f33576e0.invalidate();
                if (photoViewer12.f33603h1 == null) {
                    photoViewer12.f33603h1 = new ArrayList();
                }
                if (photoViewer12.f33612i1 == null) {
                    photoViewer12.f33612i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f33603h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((di.f4) obj5).e(true);
                }
                final di.f4 f4Var2 = new di.f4(photoViewer12.f33754y, 3);
                if (photoViewer12.P1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                f4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                f4Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                f4Var2.l(0.0f, 28.0f);
                f4Var2.f7238l0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f33603h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(f4Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f33603h1;
                                di.f4 f4Var22 = f4Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(f4Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f33612i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(f4Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f33576e0.addView(f4Var2, w7.x5.e(-1, 200, 83));
                photoViewer12.f33603h1.add(f4Var2);
                photoViewer12.f33612i1.add(f4Var2);
                f4Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f37862b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f37862b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f37862b;
                ArrayList arrayList3 = photoViewer15.f33600g7;
                if (!photoViewer15.f33732v7) {
                    mu0 mu0Var2 = photoViewer15.f33712t5;
                    if (!mu0Var2.N && mu0Var2.f45203j0 != 1 && (i12 = photoViewer15.P4) >= 0 && i12 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z12 = !isEmpty;
                        mu0 mu0Var3 = photoViewer15.f33712t5;
                        int i16 = mu0Var3.f45203j0;
                        if (i16 == 0) {
                            mu0Var3.setCancelState(true);
                            rg.o2 o2Var = photoViewer15.p5;
                            di.hd hdVar = new di.hd(photoViewer15, z12, mediaEditState, 3);
                            o2Var.getClass();
                            o2Var.setOnClickListener(new wy0(14, o2Var, hdVar));
                            TextView textView = o2Var.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                            ValueAnimator valueAnimator = o2Var.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            o2Var.Q = o2Var.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            o2Var.N = ofFloat;
                            ofFloat.addUpdateListener(new ki.a(o2Var, 14));
                            o2Var.N.setRepeatCount(-1);
                            o2Var.N.setRepeatMode(1);
                            o2Var.N.setDuration(2400L);
                            o2Var.N.setInterpolator(new LinearInterpolator());
                            o2Var.N.start();
                            photoViewer15.f33576e0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            mu0Var3.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.p5.f();
                            photoViewer15.f33576e0.invalidate();
                            return;
                        } else {
                            photoViewer15.p5.l();
                            photoViewer15.p5.getThanosEffect();
                            rg.o2 o2Var2 = photoViewer15.p5;
                            o2Var2.L = false;
                            o2Var2.E = null;
                            ImageReceiver imageReceiver = photoViewer15.C4;
                            if (isEmpty || (bitmap = o2Var2.K) == null) {
                                bitmap = o2Var2.I;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f33712t5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.m0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f37862b;
                photoViewer16.f33730v5.m(true, true);
                photoViewer16.f33740w5.m(false, true);
                rg.o2 o2Var3 = photoViewer16.p5;
                if (o2Var3 != null) {
                    o2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                yt0 yt0Var = photoViewer16.N1;
                if (yt0Var != null) {
                    yt0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f37862b;
                photoViewer17.f33730v5.m(false, true);
                photoViewer17.f33740w5.m(true, true);
                rg.o2 o2Var4 = photoViewer17.p5;
                if (o2Var4 != null) {
                    o2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                yt0 yt0Var2 = photoViewer17.N1;
                if (yt0Var2 != null) {
                    yt0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f37862b;
                yt0 yt0Var3 = photoViewer18.N1;
                if (yt0Var3 != null) {
                    qg.t1 t1Var = yt0Var3.f45581b;
                    if (t1Var.a()) {
                        t1Var.c();
                        return;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f33600g7.get(photoViewer18.P4)).filterPath);
                rg.o2 o2Var5 = photoViewer18.p5;
                if (o2Var5 != null && !o2Var5.G) {
                    o2Var5.L = false;
                    o2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = o2Var5.K) == null) {
                    bitmap2 = o2Var5.I;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                rg.o2 o2Var6 = photoViewer18.p5;
                if (o2Var6 == null || !o2Var6.G) {
                    photoViewer18.f33712t5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f37862b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.f33759y5.m(!mu0Var.f38790p0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.f33759y5.f38790p0 || photoViewer19.f33730v5.f38790p0 || photoViewer19.f33740w5.f38790p0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f37862b;
                co coVar = photoViewer20.l4;
                if (coVar != null && (messageObject = coVar.p5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.p5.getDialogId())) {
                    if (photoViewer20.f33647m4 == null || (of2 = photoViewer20.l4.f35294g5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.l4.p5.messageOwner.suggested_post);
                    }
                    if (!zh.s5.U(photoViewer20.T, of2.amount)) {
                        co coVar2 = photoViewer20.l4;
                        if (coVar2 != null) {
                            coVar2.Tb(of2);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.U1.o()) {
                    org.telegram.ui.Components.q6 q6Var = photoViewer20.U1.v;
                    float f10 = -photoViewer20.W1;
                    photoViewer20.W1 = f10;
                    AndroidUtilities.shakeViewSpring(q6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.T).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.T).captionLengthLimitPremium > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f33576e0);
                        return;
                    }
                    return;
                }
                co coVar3 = photoViewer20.l4;
                if (coVar3 != null && coVar3.c() && ((t3Var = photoViewer20.l4.J1) == null || t3Var.H1 == null)) {
                    photoViewer20.Z2();
                    return;
                } else {
                    photoViewer20.w2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f37862b.f33537a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f37862b;
                if (photoViewer21.f33754y != null && (av0Var = photoViewer21.d) != null) {
                    av0Var.V();
                    photoViewer21.G0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f37862b;
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f33689r1) {
                        if (photoViewer22.f33627j8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.u61) {
                                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) textureView;
                                if (u61Var.getVideoWidth() <= 0 || u61Var.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer23 = this.f37862b;
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f37862b;
                Drawable[] drawableArr9 = PhotoViewer.T8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f37862b;
                Drawable[] drawableArr10 = PhotoViewer.T8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f33689r1) {
                        if (photoViewer25.f33627j8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.u61) {
                                org.telegram.ui.Components.u61 u61Var2 = (org.telegram.ui.Components.u61) textureView2;
                                if (u61Var2.getVideoWidth() <= 0 || u61Var2.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer26 = this.f37862b;
                Drawable[] drawableArr11 = PhotoViewer.T8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f33689r1) {
                            if (photoViewer26.f33627j8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.u61) {
                                    org.telegram.ui.Components.u61 u61Var3 = (org.telegram.ui.Components.u61) textureView3;
                                    if (u61Var3.getVideoWidth() <= 0 || u61Var3.getVideoHeight() <= 0) {
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
                PhotoViewer photoViewer27 = this.f37862b;
                if (photoViewer27.f33676p6 == null) {
                    ir0 ir0Var = new ir0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.f30896b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.C1.f30896b.getStateMirror(), ir0Var);
                        return;
                    }
                    ir0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f37862b;
                if (photoViewer28.f33720u4 == 1) {
                    mg.q qVar = photoViewer28.C1.f30896b;
                    mg.c cVar = qVar.G;
                    if (cVar.f16263a.isInProgress() || cVar.h || qVar.f16330a.f23976e0) {
                        return;
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f37862b;
                float f11 = -photoViewer29.C1.f30896b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.O0(f11, photoViewer29.C1.f30896b.getStateMirror(), new ir0(photoViewer29, 8));
                return;
        }
    }
}
