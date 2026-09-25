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
    public final int f32470a;
    public final PhotoViewer f32471b;

    public br0(PhotoViewer photoViewer, int i10) {
        this.f32470a = i10;
        this.f32471b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        org.telegram.ui.Components.s71 s71Var;
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
        switch (this.f32470a) {
            case 0:
                PhotoViewer photoViewer = this.f32471b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.m0();
                photoViewer.d3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f32471b;
                if (photoViewer2.I1.d()) {
                    Activity activity = photoViewer2.f31402y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f31375v2);
                        alertDialog$Builder.f18662a.T = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f18662a.R = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ir0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.R2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.d3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f32471b;
                photoViewer3.Y7 = photoViewer3.f31194a8;
                photoViewer3.R0();
                photoViewer3.X2(false);
                photoViewer3.o2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f32471b;
                Object obj = photoViewer4.f31248g7.get(photoViewer4.P4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.X2(false);
                photoViewer4.o2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f32471b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.v2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f32471b;
                photoViewer6.f31378v5.m(false, true);
                photoViewer6.f31388w5.m(false, true);
                photoViewer6.d3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f32471b;
                photoViewer7.f31378v5.m(false, true);
                photoViewer7.f31388w5.m(false, true);
                photoViewer7.m0();
                photoViewer7.d3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f32471b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.d3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f32471b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.F0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f32471b;
                if (!photoViewer10.f31332q5.f28779b.N && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.f31248g7.size() && (photoViewer10.f31248g7.get(photoViewer10.P4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f31248g7.get(photoViewer10.P4);
                    long time = photoViewer10.f31332q5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.f31332q5.f28779b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.w21(photoViewer10, y12, photoEntry, time, 5));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f32471b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f31335r = !photoViewer11.f31335r;
                    ArrayList arrayList = photoViewer11.f31251h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            ((ci.e4) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f31335r) {
                        final ci.e4 e4Var = new ci.e4(photoViewer11.f31402y, 3);
                        e4Var.p(true);
                        e4Var.s(LocaleController.getString(R.string.EditorMuteHint));
                        e4Var.h = ci.e4.a(e4Var.getText(), e4Var.getTextPaint());
                        e4Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        e4Var.l(0.0f, 22.0f);
                        e4Var.f4615l0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f31251h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(e4Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f31251h1;
                                        ci.e4 e4Var2 = e4Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(e4Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f31260i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(e4Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f31251h1 == null) {
                            photoViewer11.f31251h1 = new ArrayList();
                        }
                        photoViewer11.f31224e0.addView(e4Var, w7.y5.e(-1, 200, 83));
                        photoViewer11.f31251h1.add(e4Var);
                        e4Var.u();
                    }
                    photoViewer11.w3();
                    photoViewer11.A3();
                    if (photoViewer11.f31335r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f22180x) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f31248g7.get(photoViewer11.P4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f32471b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean P1 = photoViewer12.P1();
                boolean z11 = !P1;
                int i14 = photoViewer12.P4;
                if (i14 >= 0 && i14 < photoViewer12.f31248g7.size()) {
                    Object obj4 = photoViewer12.f31248g7.get(photoViewer12.P4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z11);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        tu0 tu0Var2 = photoViewer12.d;
                        if (tu0Var2 != null) {
                            tu0Var2.m();
                        }
                    }
                }
                photoViewer12.f31234f1.a(!photoViewer12.P1(), true);
                ViewPropertyAnimator animate = photoViewer12.S7.animate();
                if (photoViewer12.P1()) {
                    f7 = 0.45f;
                }
                animate.alpha(f7).start();
                if (photoViewer12.P1() && (s71Var = photoViewer12.F2) != null) {
                    s71Var.B();
                }
                photoViewer12.f31224e0.invalidate();
                if (photoViewer12.f31251h1 == null) {
                    photoViewer12.f31251h1 = new ArrayList();
                }
                if (photoViewer12.f31260i1 == null) {
                    photoViewer12.f31260i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f31251h1;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj5 = arrayList2.get(i15);
                    i15++;
                    ((ci.e4) obj5).e(true);
                }
                final ci.e4 e4Var2 = new ci.e4(photoViewer12.f31402y, 3);
                if (photoViewer12.P1()) {
                    i11 = R.string.LivePhotoOff;
                } else {
                    i11 = R.string.LivePhotoOn;
                }
                e4Var2.s(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                e4Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                e4Var2.l(0.0f, 28.0f);
                e4Var2.f4615l0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f31251h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(e4Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f31251h1;
                                ci.e4 e4Var22 = e4Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(e4Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f31260i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(e4Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f31224e0.addView(e4Var2, w7.y5.e(-1, 200, 83));
                photoViewer12.f31251h1.add(e4Var2);
                photoViewer12.f31260i1.add(e4Var2);
                e4Var2.u();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f32471b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f32471b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f32471b;
                ArrayList arrayList3 = photoViewer15.f31248g7;
                if (!photoViewer15.f31380v7) {
                    fu0 fu0Var2 = photoViewer15.f31360t5;
                    if (!fu0Var2.N && fu0Var2.f41617j0 != 1 && (i12 = photoViewer15.P4) >= 0 && i12 < arrayList3.size() && !photoViewer15.p5.V) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z12 = !isEmpty;
                        fu0 fu0Var3 = photoViewer15.f31360t5;
                        int i16 = fu0Var3.f41617j0;
                        if (i16 == 0) {
                            fu0Var3.setCancelState(true);
                            qg.n2 n2Var = photoViewer15.p5;
                            ci.ed edVar = new ci.ed(photoViewer15, z12, mediaEditState, 3);
                            n2Var.getClass();
                            n2Var.setOnClickListener(new ny0(14, n2Var, edVar));
                            TextView textView = n2Var.M;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.rr.h).start();
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
                            photoViewer15.f31224e0.invalidate();
                            return;
                        } else if (i16 == 2) {
                            fu0Var3.setCutOutState(true);
                            photoViewer15.W2(false, true);
                            photoViewer15.p5.f();
                            photoViewer15.f31224e0.invalidate();
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
                            photoViewer15.f31360t5.setCutOutState(true);
                            photoViewer15.W2(false, true);
                            photoViewer15.m0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f32471b;
                photoViewer16.f31378v5.m(true, true);
                photoViewer16.f31388w5.m(false, true);
                qg.n2 n2Var3 = photoViewer16.p5;
                if (n2Var3 != null) {
                    n2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                rt0 rt0Var = photoViewer16.N1;
                if (rt0Var != null) {
                    rt0Var.setEraser(true);
                }
                photoViewer16.d3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f32471b;
                photoViewer17.f31378v5.m(false, true);
                photoViewer17.f31388w5.m(true, true);
                qg.n2 n2Var4 = photoViewer17.p5;
                if (n2Var4 != null) {
                    n2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                rt0 rt0Var2 = photoViewer17.N1;
                if (rt0Var2 != null) {
                    rt0Var2.setEraser(false);
                }
                photoViewer17.d3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f32471b;
                rt0 rt0Var3 = photoViewer18.N1;
                if (rt0Var3 != null) {
                    pg.w1 w1Var = rt0Var3.f41984b;
                    if (w1Var.a()) {
                        w1Var.c();
                        return;
                    }
                }
                photoViewer18.d3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f31248g7.get(photoViewer18.P4)).filterPath);
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
                    photoViewer18.f31360t5.setCutOutState(true);
                }
                photoViewer18.Z2(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f32471b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.f31407y5.m(!fu0Var.f33762p0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.f31407y5.f33762p0 || photoViewer19.f31378v5.f33762p0 || photoViewer19.f31388w5.f33762p0) ? false : false);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f32471b;
                wn wnVar = photoViewer20.l4;
                if (wnVar != null && (messageObject = wnVar.p5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.T, photoViewer20.l4.p5.getDialogId())) {
                    if (photoViewer20.f31295m4 == null || (of2 = photoViewer20.l4.f39490g5) == null) {
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
                        photoViewer20.S2(photoViewer20.f31224e0);
                        return;
                    }
                    return;
                }
                wn wnVar3 = photoViewer20.l4;
                if (wnVar3 != null && wnVar3.c() && ((g4Var = photoViewer20.l4.J1) == null || g4Var.H1 == null)) {
                    photoViewer20.Y2();
                    return;
                } else {
                    photoViewer20.v2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f32471b.f31186a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f32471b;
                if (photoViewer21.f31402y != null && (tu0Var = photoViewer21.d) != null) {
                    tu0Var.V();
                    photoViewer21.G0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f32471b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f31337r1) {
                        if (photoViewer22.f31284k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.i71) {
                                org.telegram.ui.Components.i71 i71Var = (org.telegram.ui.Components.i71) textureView;
                                if (i71Var.getVideoWidth() <= 0 || i71Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.d3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f32471b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.O0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f32471b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.N0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f32471b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f31337r1) {
                        if (photoViewer25.f31284k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.i71) {
                                org.telegram.ui.Components.i71 i71Var2 = (org.telegram.ui.Components.i71) textureView2;
                                if (i71Var2.getVideoWidth() <= 0 || i71Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.d3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f32471b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f31337r1) {
                            if (photoViewer26.f31284k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.i71) {
                                    org.telegram.ui.Components.i71 i71Var3 = (org.telegram.ui.Components.i71) textureView3;
                                    if (i71Var3.getVideoWidth() <= 0 || i71Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.d3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f32471b;
                if (photoViewer27.f31324p6 == null) {
                    ar0 ar0Var = new ar0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.f23948b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.C1.f23948b.getStateMirror(), ar0Var);
                        return;
                    }
                    ar0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f32471b;
                if (photoViewer28.f31368u4 == 1) {
                    lg.p pVar = photoViewer28.C1.f23948b;
                    lg.c cVar = pVar.G;
                    if (cVar.f14265a.isInProgress() || cVar.h || pVar.f14323a.f22233e0) {
                        return;
                    }
                }
                photoViewer28.m0();
                photoViewer28.d3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f32471b;
                float f11 = -photoViewer29.C1.f23948b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    if (f11 < 0.0f) {
                        f11 += 360.0f;
                    } else {
                        f11 = -(360.0f - f11);
                    }
                }
                photoViewer29.O0(f11, photoViewer29.C1.f23948b.getStateMirror(), new ar0(photoViewer29, 8));
                return;
        }
    }
}
