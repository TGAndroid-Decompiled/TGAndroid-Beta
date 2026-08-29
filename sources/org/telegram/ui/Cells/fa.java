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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rh;
public final class fa implements bl0, jf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, ip, Utilities.Callback2Return {
    public final int f24373a;
    public final Object f24374b;

    public fa(Object obj, int i10) {
        this.f24373a = i10;
        this.f24374b = obj;
    }

    @Override
    public void a() {
        switch (this.f24373a) {
            case 4:
                l4 l4Var = (l4) this.f24374b;
                float progress = 1.0f - (l4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.t9 t9Var = l4Var.f24624a;
                t9Var.setScaleX(progress);
                t9Var.setScaleY(progress);
                l4Var.invalidate();
                return;
            default:
                c7 c7Var = (c7) this.f24374b;
                float progress2 = 1.0f - (c7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.t9 t9Var2 = c7Var.f24172a;
                t9Var2.setScaleX(progress2);
                t9Var2.setScaleY(progress2);
                c7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        ja jaVar = (ja) this.f24374b;
        jaVar.getClass();
        jaVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f24049b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f24373a) {
            case 2:
                v0 v0Var = (v0) this.f24374b;
                if (z10 && (lottieAnimation = v0Var.E.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.D0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.f25818z1) {
                            messageObject2.wasUnread = false;
                            v0Var.f25818z1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f35599t0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.f25810w1;
                            if (videoSize != null && (t0Var = v0Var.T0) != null) {
                                t0Var.g1(v0Var, v0Var.f25807v1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.X < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.L(lottieAnimation.f34737e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                p7 p7Var = (p7) this.f24374b;
                ImageReceiver imageReceiver2 = p7Var.d;
                ImageReceiver imageReceiver3 = p7Var.f24978c;
                if (z10 && !z11 && (messageObject = p7Var.f24991n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && p7Var.f24999s0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    p7Var.f24974a = dominantColor;
                    CheckBoxBase checkBoxBase = p7Var.L;
                    if (checkBoxBase != null && checkBoxBase.f26330x != (v = org.telegram.ui.ActionBar.g6.v(dominantColor, org.telegram.ui.ActionBar.g6.l1(0.25f, -1)))) {
                        checkBoxBase.f26330x = v;
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
        int i11 = this.f24373a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j10) {
        ((l) this.f24374b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24373a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((rh) this.f24374b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        i4 i4Var;
        s1 s1Var = (s1) this.f24374b;
        MessageObject messageObject = s1Var.f25556u7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((i4Var = s1Var.B7) != null && i4Var.f24482i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.f25556u7.isVoiceOnce() || s1Var.f25556u7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
