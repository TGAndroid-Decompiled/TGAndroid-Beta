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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
public final class na implements bm0, ag.s, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, aq, Utilities.Callback2Return {
    public final int f24565a;
    public final Object f24566b;

    public na(Object obj, int i10) {
        this.f24565a = i10;
        this.f24566b = obj;
    }

    @Override
    public void a() {
        switch (this.f24565a) {
            case 4:
                r4 r4Var = (r4) this.f24566b;
                float progress = 1.0f - (r4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var = r4Var.f24959a;
                y9Var.setScaleX(progress);
                y9Var.setScaleY(progress);
                r4Var.invalidate();
                return;
            default:
                k7 k7Var = (k7) this.f24566b;
                float progress2 = 1.0f - (k7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var2 = k7Var.f24338a;
                y9Var2.setScaleX(progress2);
                y9Var2.setScaleY(progress2);
                k7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        ra raVar = (ra) this.f24566b;
        raVar.getClass();
        raVar.F1(((ThemesHorizontalListCell$InnerThemeView) view).f23824b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xj0 lottieAnimation;
        s0 s0Var;
        int v;
        MessageObject messageObject;
        switch (this.f24565a) {
            case 2:
                v0 v0Var = (v0) this.f24566b;
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
                                ((LaunchActivity) v0Var.getContext()).f35564x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.I1;
                            if (videoSize != null && (s0Var = v0Var.f25514f1) != null) {
                                s0Var.G(v0Var, v0Var.H1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.f34733a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                w7 w7Var = (w7) this.f24566b;
                ImageReceiver imageReceiver2 = w7Var.d;
                ImageReceiver imageReceiver3 = w7Var.f25636c;
                if (z10 && !z11 && (messageObject = w7Var.f25648n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && w7Var.f25661w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    w7Var.f25632a = dominantColor;
                    CheckBoxBase checkBoxBase = w7Var.P;
                    if (checkBoxBase != null && checkBoxBase.f26093x != (v = org.telegram.ui.ActionBar.y6.v(dominantColor, org.telegram.ui.ActionBar.y6.o1(0.25f, -1)))) {
                        checkBoxBase.f26093x = v;
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
        int i11 = this.f24565a;
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void f(long j10) {
        ((l) this.f24566b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f24565a;
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((ai.d0) this.f24566b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        o4 o4Var;
        s1 s1Var = (s1) this.f24566b;
        MessageObject messageObject = s1Var.f25363y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((o4Var = s1Var.F7) != null && o4Var.f24587i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.f25363y7.isVoiceOnce() || s1Var.f25363y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
