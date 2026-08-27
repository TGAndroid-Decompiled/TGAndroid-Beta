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
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;

public final class ea implements rk0, gf.p, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, cp, Utilities.Callback2Return {

    public final int f24322a;

    public final Object f24323b;

    public ea(Object obj, int i10) {
        this.f24322a = i10;
        this.f24323b = obj;
    }

    @Override
    public boolean a(int i10, View view) {
        ia iaVar = (ia) this.f24323b;
        iaVar.getClass();
        iaVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f24036b);
        return true;
    }

    @Override
    public void b() {
        switch (this.f24322a) {
            case 4:
                k4 k4Var = (k4) this.f24323b;
                float progress = 1.0f - (k4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.n9 n9Var = k4Var.f24571a;
                n9Var.setScaleX(progress);
                n9Var.setScaleY(progress);
                k4Var.invalidate();
                break;
            default:
                b7 b7Var = (b7) this.f24323b;
                float progress2 = 1.0f - (b7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.n9 n9Var2 = b7Var.f24115a;
                n9Var2.setScaleX(progress2);
                n9Var2.setScaleY(progress2);
                b7Var.invalidate();
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi0 lottieAnimation;
        t0 t0Var;
        int iV;
        MessageObject messageObject;
        switch (this.f24322a) {
            case 2:
                v0 v0Var = (v0) this.f24323b;
                if (z10 && (lottieAnimation = v0Var.E.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.D0;
                    if (messageObject2 == null || messageObject2.playedGiftAnimation) {
                        if (lottieAnimation.X < 1) {
                            lottieAnimation.stop();
                            lottieAnimation.L(lottieAnimation.f31312e[0] - 1, false, false);
                        }
                        break;
                    } else {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.f25788z1) {
                            messageObject2.wasUnread = false;
                            v0Var.f25788z1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f35535t0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.f25780w1;
                            if (videoSize != null && (t0Var = v0Var.T0) != null) {
                                t0Var.Z0(v0Var, v0Var.f25777v1, videoSize);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                o7 o7Var = (o7) this.f24323b;
                ImageReceiver imageReceiver2 = o7Var.d;
                ImageReceiver imageReceiver3 = o7Var.f24786c;
                if (z10 && !z11 && (messageObject = o7Var.f24799n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && o7Var.f24807s0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    o7Var.f24782a = dominantColor;
                    CheckBoxBase checkBoxBase = o7Var.L;
                    if (checkBoxBase != null && checkBoxBase.f26315x != (iV = org.telegram.ui.ActionBar.g6.v(dominantColor, org.telegram.ui.ActionBar.g6.l1(0.25f, -1)))) {
                        checkBoxBase.f26315x = iV;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f24322a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void g(long j10) {
        ((l) this.f24323b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24322a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((nh.c) this.f24323b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        h4 h4Var;
        s1 s1Var = (s1) this.f24323b;
        MessageObject messageObject = s1Var.f25546u7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((h4Var = s1Var.B7) != null && h4Var.f24432i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.f25546u7.isVoiceOnce() || s1Var.f25546u7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
