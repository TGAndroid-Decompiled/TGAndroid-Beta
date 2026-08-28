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
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.LaunchActivity;
public final class ia implements ok0, ff.p, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, ep, Utilities.Callback2Return {
    public final int f24527a;
    public final Object f24528b;

    public ia(Object obj, int i9) {
        this.f24527a = i9;
        this.f24528b = obj;
    }

    @Override
    public boolean a(int i9, View view) {
        ma maVar = (ma) this.f24528b;
        maVar.getClass();
        maVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f24029b);
        return true;
    }

    @Override
    public void b() {
        switch (this.f24527a) {
            case 4:
                n4 n4Var = (n4) this.f24528b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.o9 o9Var = n4Var.f24747a;
                o9Var.setScaleX(progress);
                o9Var.setScaleY(progress);
                n4Var.invalidate();
                return;
            default:
                e7 e7Var = (e7) this.f24528b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.o9 o9Var2 = e7Var.f24308a;
                o9Var2.setScaleX(progress2);
                o9Var2.setScaleY(progress2);
                e7Var.invalidate();
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f24527a) {
            case 2:
                w0 w0Var = (w0) this.f24528b;
                if (z10 && (lottieAnimation = w0Var.E.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.D0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.f25885z1) {
                            messageObject2.wasUnread = false;
                            w0Var.f25885z1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).f35532t0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.f25877w1;
                            if (videoSize != null && (t0Var = w0Var.T0) != null) {
                                t0Var.V0(w0Var, w0Var.f25874v1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.X < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.L(lottieAnimation.f30847e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                r7 r7Var = (r7) this.f24528b;
                ImageReceiver imageReceiver2 = r7Var.d;
                ImageReceiver imageReceiver3 = r7Var.f25094c;
                if (z10 && !z11 && (messageObject = r7Var.f25107n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && r7Var.f25115s0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    r7Var.f25090a = dominantColor;
                    CheckBoxBase checkBoxBase = r7Var.L;
                    if (checkBoxBase != null && checkBoxBase.f26319x != (v = org.telegram.ui.ActionBar.f6.v(dominantColor, org.telegram.ui.ActionBar.f6.l1(0.25f, -1)))) {
                        checkBoxBase.f26319x = v;
                        checkBoxBase.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.f24527a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void h(long j10) {
        ((l) this.f24528b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.f24527a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((mh.c) this.f24528b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        t1 t1Var = (t1) this.f24528b;
        MessageObject messageObject = t1Var.f25593u7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = t1Var.B7) != null && k4Var.f24596i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.f25593u7.isVoiceOnce() || t1Var.f25593u7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
