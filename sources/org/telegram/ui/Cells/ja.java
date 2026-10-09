package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.LaunchActivity;
public final class ja implements gm0, yf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, eq, Utilities.Callback2Return {
    public final int f22353a;
    public final Object f22354b;

    public ja(Object obj, int i10) {
        this.f22353a = i10;
        this.f22354b = obj;
    }

    @Override
    public void a() {
        switch (this.f22353a) {
            case 4:
                n4 n4Var = (n4) this.f22354b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var = n4Var.f22510a;
                y9Var.setScaleX(progress);
                y9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                g7 g7Var = (g7) this.f22354b;
                float progress2 = 1.0f - (g7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var2 = g7Var.f22144a;
                y9Var2.setScaleX(progress2);
                y9Var2.setScaleY(progress2);
                g7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        na naVar = (na) this.f22354b;
        naVar.getClass();
        naVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f21763b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ck0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f22353a) {
            case 2:
                w0 w0Var = (w0) this.f22354b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new r0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.L1) {
                            messageObject2.wasUnread = false;
                            w0Var.L1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).f33821x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.I1;
                            if (videoSize != null && (t0Var = w0Var.f23596f1) != null) {
                                t0Var.m1(w0Var, w0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f25395a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.f25401e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var = (t7) this.f22354b;
                ImageReceiver imageReceiver2 = t7Var.d;
                ImageReceiver imageReceiver3 = t7Var.f23065c;
                if (z10 && !z11 && (messageObject = t7Var.f23078n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && t7Var.f23091w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    t7Var.f23061a = dominantColor;
                    CheckBoxBase checkBoxBase = t7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f24103x != (v = org.telegram.ui.ActionBar.i6.v(dominantColor, org.telegram.ui.ActionBar.i6.m1(0.25f, -1)))) {
                        checkBoxBase.f24103x = v;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f22353a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j3) {
        ((l) this.f22354b).b(j3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f22353a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((ei.c) this.f22354b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        u1 u1Var = (u1) this.f22354b;
        MessageObject messageObject = u1Var.f23458y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = u1Var.F7) != null && k4Var.f22373i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.f23458y7.isVoiceOnce() || u1Var.f23458y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
