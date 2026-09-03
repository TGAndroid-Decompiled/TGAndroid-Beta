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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class ga implements jl0, kf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, lp, Utilities.Callback2Return {
    public final int f21115a;
    public final Object f21116b;

    public ga(Object obj, int i10) {
        this.f21115a = i10;
        this.f21116b = obj;
    }

    @Override
    public void a() {
        switch (this.f21115a) {
            case 4:
                m4 m4Var = (m4) this.f21116b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var = m4Var.f21349a;
                p9Var.setScaleX(progress);
                p9Var.setScaleY(progress);
                m4Var.invalidate();
                return;
            default:
                d7 d7Var = (d7) this.f21116b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var2 = d7Var.f20937a;
                p9Var2.setScaleX(progress2);
                p9Var2.setScaleY(progress2);
                d7Var.invalidate();
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ka kaVar = (ka) this.f21116b;
        kaVar.getClass();
        kaVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).f20775b);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.f21115a) {
            case 2:
                v0 v0Var = (v0) this.f21116b;
                if (z4 && (lottieAnimation = v0Var.F.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.E0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.A1) {
                            messageObject2.wasUnread = false;
                            v0Var.A1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).f31626u0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.f22450x1;
                            if (videoSize != null && (t0Var = v0Var.U0) != null) {
                                t0Var.l1(v0Var, v0Var.f22447w1, videoSize);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lottieAnimation.Y < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.L(lottieAnimation.e[0] - 1, false, false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                q7 q7Var = (q7) this.f21116b;
                ImageReceiver imageReceiver2 = q7Var.d;
                ImageReceiver imageReceiver3 = q7Var.f21702c;
                if (z4 && !z10 && (messageObject = q7Var.f21714n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z4 && !z10 && q7Var.f21723t0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    q7Var.f21698a = dominantColor;
                    CheckBoxBase checkBoxBase = q7Var.M;
                    if (checkBoxBase != null && checkBoxBase.f22944x != (v = org.telegram.ui.ActionBar.j6.v(dominantColor, org.telegram.ui.ActionBar.j6.l1(0.25f, -1)))) {
                        checkBoxBase.f22944x = v;
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
        int i11 = this.f21115a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void e(long j10) {
        ((l) this.f21116b).b(j10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f21115a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return (CharSequence) ((yh) this.f21116b).run((Integer) obj2);
    }

    @Override
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        s1 s1Var = (s1) this.f21116b;
        MessageObject messageObject = s1Var.f22210v7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = s1Var.C7) != null && j4Var.f21216i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.f22210v7.isVoiceOnce() || s1Var.f22210v7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
