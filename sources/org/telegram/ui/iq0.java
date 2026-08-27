package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.io.FileNotFoundException;
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

public final class iq0 implements View.OnClickListener {

    public final int f39151a;

    public final PhotoViewer f39152b;

    public iq0(PhotoViewer photoViewer, int i10) {
        this.f39151a = i10;
        this.f39152b = photoViewer;
    }

    @Override
    public final void onClick(View view) throws FileNotFoundException {
        int i10;
        org.telegram.ui.Components.m61 m61Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        jh.t2 t2Var;
        MessageObject messageObject;
        MessageSuggestionParams messageSuggestionParamsOf;
        au0 au0Var;
        int i12 = 3;
        char c10 = 1;
        final int i13 = 0;
        switch (this.f39151a) {
            case 0:
                PhotoViewer photoViewer = this.f39152b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.m0();
                photoViewer.e3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f39152b;
                if (!photoViewer2.E1.d()) {
                    photoViewer2.e3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.f35800y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.f35738r2);
                        alertDialog$Builder.f22702a.P = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.f22702a.N = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new pq0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.f39152b;
                photoViewer3.T7 = photoViewer3.V7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.f39152b;
                Object obj = photoViewer4.f35608c7.get(photoViewer4.L4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.f39152b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.f39152b;
                photoViewer6.f35741r5.m(false, true);
                photoViewer6.f35751s5.m(false, true);
                photoViewer6.e3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.f39152b;
                photoViewer7.f35741r5.m(false, true);
                photoViewer7.f35751s5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.f39152b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.e3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.f39152b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer9.F0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.f39152b;
                if (!photoViewer10.f35696m5.f34167b.J && (i10 = photoViewer10.L4) >= 0 && i10 < photoViewer10.f35608c7.size() && (photoViewer10.f35608c7.get(photoViewer10.L4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.f35608c7.get(photoViewer10.L4);
                    long time = photoViewer10.f35696m5.getTime();
                    String strY1 = PhotoViewer.y1();
                    photoViewer10.f35696m5.f34167b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.pg(photoViewer10, strY1, photoEntry, time, 11));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.f39152b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                if (!photoViewer11.H1()) {
                    photoViewer11.f35735r = !photoViewer11.f35735r;
                    ArrayList arrayList = photoViewer11.f35611d1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((lh.w3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.f35735r) {
                        final lh.w3 w3Var = new lh.w3(photoViewer11.f35800y, 3);
                        w3Var.q(true);
                        w3Var.t(LocaleController.getString(R.string.EditorMuteHint));
                        w3Var.h = lh.w3.a(w3Var.getText(), w3Var.getTextPaint());
                        w3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        w3Var.m(0.0f, 22.0f);
                        w3Var.f16984h0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f35611d1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(w3Var);
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f35611d1;
                                        lh.w3 w3Var2 = w3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(w3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f35621e1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(w3Var2);
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.f35611d1 == null) {
                            photoViewer11.f35611d1 = new ArrayList();
                        }
                        photoViewer11.f35583a0.addView(w3Var, h7.z5.e(-1, 200, 83));
                        photoViewer11.f35611d1.add(w3Var);
                        w3Var.v();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.f35735r) {
                        CheckBox checkBox = photoViewer11.J0;
                        if (!checkBox.f26293x) {
                            checkBox.callOnClick();
                        }
                    }
                    Object obj3 = photoViewer11.f35608c7.get(photoViewer11.L4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                    }
                    break;
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.f39152b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                boolean zP1 = photoViewer12.P1();
                boolean z10 = !zP1;
                int i15 = photoViewer12.L4;
                if (i15 >= 0 && i15 < photoViewer12.f35608c7.size()) {
                    Object obj4 = photoViewer12.f35608c7.get(photoViewer12.L4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z10);
                        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = zP1;
                        editorEdit.putBoolean("photoLiveDefault", zP1).apply();
                        au0 au0Var2 = photoViewer12.d;
                        if (au0Var2 != null) {
                            au0Var2.m();
                        }
                    }
                }
                photoViewer12.f35592b1.a(!photoViewer12.P1(), true);
                photoViewer12.N7.animate().alpha(photoViewer12.P1() ? 0.45f : 1.0f).start();
                if (photoViewer12.P1() && (m61Var = photoViewer12.B2) != null) {
                    m61Var.C();
                }
                photoViewer12.f35583a0.invalidate();
                if (photoViewer12.f35611d1 == null) {
                    photoViewer12.f35611d1 = new ArrayList();
                }
                if (photoViewer12.f35621e1 == null) {
                    photoViewer12.f35621e1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f35611d1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((lh.w3) obj5).e(true);
                }
                final lh.w3 w3Var2 = new lh.w3(photoViewer12.f35800y, 3);
                w3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(photoViewer12.P1() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
                w3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                w3Var2.m(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                w3Var2.f16984h0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList3 = photoViewer12.f35611d1;
                                if (arrayList3 != null) {
                                    arrayList3.remove(w3Var2);
                                }
                                break;
                            default:
                                PhotoViewer photoViewer13 = photoViewer12;
                                ArrayList arrayList4 = photoViewer13.f35611d1;
                                lh.w3 w3Var3 = w3Var2;
                                if (arrayList4 != null) {
                                    arrayList4.remove(w3Var3);
                                }
                                ArrayList arrayList5 = photoViewer13.f35621e1;
                                if (arrayList5 != null) {
                                    arrayList5.remove(w3Var3);
                                }
                                break;
                        }
                    }
                };
                photoViewer12.f35583a0.addView(w3Var2, h7.z5.e(-1, 200, 83));
                photoViewer12.f35611d1.add(w3Var2);
                photoViewer12.f35621e1.add(w3Var2);
                w3Var2.v();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.f39152b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.f39152b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.f39152b;
                ArrayList arrayList3 = photoViewer15.f35608c7;
                if (!photoViewer15.f35743r7) {
                    mt0 mt0Var = photoViewer15.f35724p5;
                    if (!mt0Var.J && mt0Var.f50380f0 != 1 && (i11 = photoViewer15.L4) >= 0 && i11 < arrayList3.size() && !photoViewer15.f35688l5.R) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.L4);
                        boolean zIsEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z11 = !zIsEmpty;
                        mt0 mt0Var2 = photoViewer15.f35724p5;
                        int i17 = mt0Var2.f50380f0;
                        if (i17 == 0) {
                            mt0Var2.setCancelState(true);
                            zf.n2 n2Var = photoViewer15.f35688l5;
                            lh.kc kcVar = new lh.kc(photoViewer15, z11, mediaEditState, i12);
                            n2Var.getClass();
                            n2Var.setOnClickListener(new org.telegram.ui.web.c(6, n2Var, kcVar));
                            TextView textView = n2Var.I;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.er.h).start();
                            ValueAnimator valueAnimator = n2Var.J;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            n2Var.M = n2Var.N;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            n2Var.J = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new lh.m2(n2Var, 26));
                            n2Var.J.setRepeatCount(-1);
                            n2Var.J.setRepeatMode(1);
                            n2Var.J.setDuration(2400L);
                            n2Var.J.setInterpolator(new LinearInterpolator());
                            n2Var.J.start();
                            photoViewer15.f35583a0.invalidate();
                        } else if (i17 != 2) {
                            photoViewer15.f35688l5.l();
                            photoViewer15.f35688l5.getThanosEffect();
                            zf.n2 n2Var2 = photoViewer15.f35688l5;
                            n2Var2.H = false;
                            n2Var2.A = null;
                            ImageReceiver imageReceiver = photoViewer15.f35805y4;
                            if (zIsEmpty || (bitmap = n2Var2.G) == null) {
                                bitmap = n2Var2.E;
                            }
                            imageReceiver.setImageBitmap(bitmap);
                            photoViewer15.f35724p5.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.m0();
                        } else {
                            mt0Var2.setCutOutState(true);
                            photoViewer15.X2(false, true);
                            photoViewer15.f35688l5.f();
                            photoViewer15.f35583a0.invalidate();
                        }
                        break;
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.f39152b;
                photoViewer16.f35741r5.m(true, true);
                photoViewer16.f35751s5.m(false, true);
                zf.n2 n2Var3 = photoViewer16.f35688l5;
                if (n2Var3 != null) {
                    n2Var3.setOutlineVisible(false);
                }
                photoViewer16.I1 = true;
                xs0 xs0Var = photoViewer16.J1;
                if (xs0Var != null) {
                    xs0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.f39152b;
                photoViewer17.f35741r5.m(false, true);
                photoViewer17.f35751s5.m(true, true);
                zf.n2 n2Var4 = photoViewer17.f35688l5;
                if (n2Var4 != null) {
                    n2Var4.setOutlineVisible(false);
                }
                photoViewer17.I1 = false;
                xs0 xs0Var2 = photoViewer17.J1;
                if (xs0Var2 != null) {
                    xs0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.f39152b;
                xs0 xs0Var3 = photoViewer18.J1;
                if (xs0Var3 != null) {
                    yf.s1 s1Var = xs0Var3.f50724b;
                    if (s1Var.a()) {
                        s1Var.c();
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.f35688l5.l();
                boolean zIsEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.f35608c7.get(photoViewer18.L4)).filterPath);
                zf.n2 n2Var5 = photoViewer18.f35688l5;
                if (n2Var5 != null && !n2Var5.C) {
                    n2Var5.H = false;
                    n2Var5.A = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.f35805y4;
                if (zIsEmpty2 || (bitmap2 = n2Var5.G) == null) {
                    bitmap2 = n2Var5.E;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                zf.n2 n2Var6 = photoViewer18.f35688l5;
                if (n2Var6 == null || !n2Var6.C) {
                    photoViewer18.f35724p5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.f39152b;
                if (photoViewer19.f35688l5 != null) {
                    mt0 mt0Var3 = photoViewer19.f35769u5;
                    mt0Var3.m(!mt0Var3.f40594l0, true);
                    photoViewer19.f35688l5.setOutlineVisible((!photoViewer19.f35769u5.f40594l0 || photoViewer19.f35741r5.f40594l0 || photoViewer19.f35751s5.f40594l0) ? false : true);
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.f39152b;
                rn rnVar = photoViewer20.f35652h4;
                if (rnVar != null && (messageObject = rnVar.f42119l5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.P, photoViewer20.f35652h4.f42119l5.getDialogId())) {
                    if (photoViewer20.f35661i4 == null || (messageSuggestionParamsOf = photoViewer20.f35652h4.f42006c5) == null) {
                        messageSuggestionParamsOf = MessageSuggestionParams.of(photoViewer20.f35652h4.f42119l5.messageOwner.suggested_post);
                    }
                    if (!hh.u7.U(photoViewer20.P, messageSuggestionParamsOf.amount)) {
                        rn rnVar2 = photoViewer20.f35652h4;
                        if (rnVar2 != null) {
                            rnVar2.Tb(messageSuggestionParamsOf);
                        }
                    }
                }
                if (!photoViewer20.Q1.o()) {
                    rn rnVar3 = photoViewer20.f35652h4;
                    if (rnVar3 != null && rnVar3.c() && ((t2Var = photoViewer20.f35652h4.F1) == null || t2Var.D1 == null)) {
                        photoViewer20.Z2();
                    } else {
                        photoViewer20.w2(true, 0, 0, false, false, false);
                    }
                    break;
                } else {
                    org.telegram.ui.Components.j6 j6Var = photoViewer20.Q1.v;
                    float f10 = -photoViewer20.S1;
                    photoViewer20.S1 = f10;
                    AndroidUtilities.shakeViewSpring(j6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.P).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.P).captionLengthLimitPremium > photoViewer20.Q1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.f35583a0);
                        break;
                    }
                }
                break;
            case 20:
                this.f39152b.f35582a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.f39152b;
                if (photoViewer21.f35800y != null && (au0Var = photoViewer21.d) != null) {
                    au0Var.V();
                    photoViewer21.G0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.f39152b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.f35702n1) {
                        if (photoViewer22.f35638f8) {
                            TextureView textureView = photoViewer22.f35794x2;
                            if (textureView instanceof org.telegram.ui.Components.a61) {
                                org.telegram.ui.Components.a61 a61Var = (org.telegram.ui.Components.a61) textureView;
                                if (a61Var.getVideoWidth() <= 0 || a61Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.e3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.f39152b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer23.O0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.f39152b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer24.N0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.f39152b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.f35702n1) {
                        if (photoViewer25.f35638f8) {
                            TextureView textureView2 = photoViewer25.f35794x2;
                            if (textureView2 instanceof org.telegram.ui.Components.a61) {
                                org.telegram.ui.Components.a61 a61Var2 = (org.telegram.ui.Components.a61) textureView2;
                                if (a61Var2.getVideoWidth() <= 0 || a61Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.e3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.f39152b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.f35702n1) {
                            if (photoViewer26.f35638f8) {
                                TextureView textureView3 = photoViewer26.f35794x2;
                                if (textureView3 instanceof org.telegram.ui.Components.a61) {
                                    org.telegram.ui.Components.a61 a61Var3 = (org.telegram.ui.Components.a61) textureView3;
                                    if (a61Var3.getVideoWidth() <= 0 || a61Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.e3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.f39152b;
                if (photoViewer27.f35689l6 == null) {
                    hq0 hq0Var = new hq0(photoViewer27, 29);
                    if (!photoViewer27.F2) {
                        float stateOrientation = photoViewer27.N2 - photoViewer27.f35802y1.f28602b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.f35802y1.f28602b.getStateMirror(), hq0Var);
                    } else {
                        hq0Var.run();
                    }
                    break;
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.f39152b;
                if (photoViewer28.f35731q4 == 1) {
                    uf.n nVar = photoViewer28.f35802y1.f28602b;
                    uf.b bVar = nVar.C;
                    if (bVar.f48564a.isInProgress() || bVar.h || nVar.f48626a.f26344a0) {
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.f39152b;
                float f11 = -photoViewer29.f35802y1.f28602b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    f11 = f11 < 0.0f ? f11 + 360.0f : -(360.0f - f11);
                }
                photoViewer29.O0(f11, photoViewer29.f35802y1.f28602b.getStateMirror(), new hq0(photoViewer29, 8));
                break;
        }
    }
}
