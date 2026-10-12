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
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
public final class ja implements cm0, zf.n, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, bq, Utilities.Callback2Return {
    public final int f21420a;
    public final Object f21421b;

    public ja(Object obj, int i10) {
        this.f21420a = i10;
        this.f21421b = obj;
    }

    @Override
    public boolean a(int i10, View view) {
        na naVar = (na) this.f21421b;
        naVar.getClass();
        naVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).f20879b);
        return true;
    }

    @Override
    public void b() {
        switch (this.f21420a) {
            case 4:
                n4 n4Var = (n4) this.f21421b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.z9 z9Var = n4Var.f21554a;
                z9Var.setScaleX(progress);
                z9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                g7 g7Var = (g7) this.f21421b;
                float progress2 = 1.0f - (g7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.z9 z9Var2 = g7Var.f21224a;
                z9Var2.setScaleX(progress2);
                z9Var2.setScaleY(progress2);
                g7Var.invalidate();
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        u0 u0Var;
        int v;
        MessageObject messageObject;
        switch (this.f21420a) {
            case 2:
                x0 x0Var = (x0) this.f21421b;
                if (z10 && (lottieAnimation = x0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = x0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new s0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || x0Var.L1) {
                            messageObject2.wasUnread = false;
                            x0Var.L1 = false;
                            try {
                                x0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (x0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) x0Var.getContext()).f32147x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = x0Var.I1;
                            if (videoSize != null && (u0Var = x0Var.f22675f1) != null) {
                                u0Var.c1(x0Var, x0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f31602a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var = (t7) this.f21421b;
                ImageReceiver imageReceiver2 = t7Var.d;
                ImageReceiver imageReceiver3 = t7Var.f22101c;
                if (z10 && !z11 && (messageObject = t7Var.f22113n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && t7Var.f22126w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    t7Var.f22097a = dominantColor;
                    CheckBoxBase checkBoxBase = t7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f23098x != (v = org.telegram.ui.ActionBar.g6.v(dominantColor, org.telegram.ui.ActionBar.g6.m1(0.25f, -1)))) {
                        checkBoxBase.f23098x = v;
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
        int i11 = this.f21420a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j10) {
        ((l) this.f21421b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f21420a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((fi.c) this.f21421b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        u1 u1Var = (u1) this.f21421b;
        MessageObject messageObject = u1Var.f22488y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = u1Var.F7) != null && k4Var.f21436i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.f22488y7.isVoiceOnce() || u1Var.f22488y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
