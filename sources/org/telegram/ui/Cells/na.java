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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.up;
import org.telegram.ui.LaunchActivity;
public final class na implements ll0, xf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, up, Utilities.Callback2Return {
    public final int f19583a;
    public final Object f19584b;

    public na(Object obj, int i10) {
        this.f19583a = i10;
        this.f19584b = obj;
    }

    @Override
    public void a() {
        switch (this.f19583a) {
            case 4:
                n4 n4Var = (n4) this.f19584b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var = n4Var.f19559a;
                w9Var.setScaleX(progress);
                w9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                h7 h7Var = (h7) this.f19584b;
                float progress2 = 1.0f - (h7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = h7Var.f19266a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                h7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ra raVar = (ra) this.f19584b;
        raVar.getClass();
        raVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).f18853b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f19583a) {
            case 2:
                w0 w0Var = (w0) this.f19584b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.H0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.D1) {
                            messageObject2.wasUnread = false;
                            w0Var.D1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).f29971x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.A1;
                            if (videoSize != null && (t0Var = w0Var.X0) != null) {
                                t0Var.f1(w0Var, w0Var.f20648z1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f23648b0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                u7 u7Var = (u7) this.f19584b;
                ImageReceiver imageReceiver2 = u7Var.d;
                ImageReceiver imageReceiver3 = u7Var.f20497c;
                if (z10 && !z11 && (messageObject = u7Var.f20509n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && u7Var.f20522w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    u7Var.f20493a = dominantColor;
                    CheckBoxBase checkBoxBase = u7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f21063x != (v = org.telegram.ui.ActionBar.j6.v(dominantColor, org.telegram.ui.ActionBar.j6.l1(0.25f, -1)))) {
                        checkBoxBase.f21063x = v;
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
        int i11 = this.f19583a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void h(long j3) {
        ((l) this.f19584b).b(j3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f19583a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((di.c) this.f19584b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        t1 t1Var = (t1) this.f19584b;
        MessageObject messageObject = t1Var.f20403y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = t1Var.F7) != null && k4Var.f19407i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.f20403y7.isVoiceOnce() || t1Var.f20403y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
