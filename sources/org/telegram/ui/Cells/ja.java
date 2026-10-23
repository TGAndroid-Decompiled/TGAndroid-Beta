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
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.LaunchActivity;
public final class ja implements cm0, zf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, yp, Utilities.Callback2Return {
    public final int f22615a;
    public final Object f22616b;

    public ja(Object obj, int i10) {
        this.f22615a = i10;
        this.f22616b = obj;
    }

    @Override
    public void a() {
        switch (this.f22615a) {
            case 4:
                m4 m4Var = (m4) this.f22616b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var = m4Var.f22718a;
                w9Var.setScaleX(progress);
                w9Var.setScaleY(progress);
                m4Var.invalidate();
                return;
            default:
                g7 g7Var = (g7) this.f22616b;
                float progress2 = 1.0f - (g7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = g7Var.f22415a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                g7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        na naVar = (na) this.f22616b;
        naVar.getClass();
        naVar.F1(((ThemesHorizontalListCell$InnerThemeView) view).f22060b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        s0 s0Var;
        int v;
        MessageObject messageObject;
        switch (this.f22615a) {
            case 2:
                v0 v0Var = (v0) this.f22616b;
                if (z10 && (lottieAnimation = v0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.L1) {
                            messageObject2.wasUnread = false;
                            v0Var.L1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f33501x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.I1;
                            if (videoSize != null && (s0Var = v0Var.f23771f1) != null) {
                                s0Var.c1(v0Var, v0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f32933a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                s7 s7Var = (s7) this.f22616b;
                ImageReceiver imageReceiver2 = s7Var.d;
                ImageReceiver imageReceiver3 = s7Var.f23263c;
                if (z10 && !z11 && (messageObject = s7Var.f23275n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && s7Var.f23288w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    s7Var.f23259a = dominantColor;
                    CheckBoxBase checkBoxBase = s7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f24302x != (v = org.telegram.ui.ActionBar.k6.v(dominantColor, org.telegram.ui.ActionBar.k6.o1(0.25f, -1)))) {
                        checkBoxBase.f24302x = v;
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
        int i11 = this.f22615a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void i(long j10) {
        ((l) this.f22616b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f22615a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((gi.c) this.f22616b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        t1 t1Var = (t1) this.f22616b;
        MessageObject messageObject = t1Var.f23659y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = t1Var.F7) != null && j4Var.f22571i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.f23659y7.isVoiceOnce() || t1Var.f23659y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
