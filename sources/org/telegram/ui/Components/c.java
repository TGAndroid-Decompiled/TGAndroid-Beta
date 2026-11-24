package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class c {
    public final ChatActivityEnterView a;

    public c(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
        while (chatActivityEnterView2 != 0 && chatActivityEnterView2.getParent() != chatActivityEnterView.c2) {
            if (chatActivityEnterView2.getParent() instanceof View) {
                chatActivityEnterView2 = (View) chatActivityEnterView2.getParent();
            } else {
                chatActivityEnterView2 = 0;
            }
        }
        return chatActivityEnterView2;
    }

    public final boolean b(float[] fArr) {
        float f;
        ChatActivityEnterView chatActivityEnterView = this.a;
        i29 i29Var = chatActivityEnterView.i1;
        boolean z = false;
        if (i29Var != null && chatActivityEnterView.R3 != null && i29Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.i1.getAudioLeft();
            z = true;
            fArr[1] = chatActivityEnterView.i1.getAudioRight();
            if (chatActivityEnterView.i1.p0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[2] = f;
        }
        return z;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.v3 && chatActivityEnterView.R3 == null && !MediaController.w().E()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.v3 && !chatActivityEnterView.O2 && !chatActivityEnterView.Z2) {
            if ((!chatActivityEnterView.U2 || !chatActivityEnterView.d1) && chatActivityEnterView.z0 && !chatActivityEnterView.l1 && chatActivityEnterView.F3 != null && chatActivityEnterView.F0 != null && !MediaController.w().F()) {
                jm3 jm3Var = chatActivityEnterView.j1;
                if ((jm3Var == null || !jm3Var.o()) && !chatActivityEnterView.U1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (chatActivityEnterView.v3 && !MediaController.w().F()) {
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
            if (recordCircle != null && ChatActivityEnterView.this.h5) {
                chatActivityEnterView.y4 = true;
            }
            MediaController.w().C0(chatActivityEnterView.P);
            chatActivityEnterView.P3.n0(0);
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
            if (slideTextView != null) {
                slideTextView.setEnabled(false);
            }
        }
    }

    public final void f(Object obj, String str, p8c p8cVar) {
        if (!(obj instanceof kl3)) {
            p8cVar.a(null);
            return;
        }
        int i = ChatActivityEnterView.r7;
        jm3 z0 = this.a.z0();
        z0.l();
        long uptimeMillis = SystemClock.uptimeMillis();
        z0.H.a((kl3) obj, str, new rz1(z0, uptimeMillis, p8cVar));
    }

    public final void g(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int[] iArr;
        int[] iArr2;
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        cja cjaVar = chatActivityEnterView.c2;
        RectF rectF = chatActivityEnterView.H4;
        if (chatActivityEnterView.E2 != null) {
            boolean z = true;
            if (!Float.isNaN(f) && !rectF.isEmpty() && cjaVar != null) {
                chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                cjaVar.getLocationInWindow(new int[2]);
                f3 = Math.min(0.0f, f - (rectF.centerY() + (((iArr[1] - iArr2[1]) - chatActivityEnterView.E2.getTranslationY()) + chatActivityEnterView.R5)));
                float i2 = Utilities.i(f2, 1.0f, 0.0f);
                if (f3 > -1.0f) {
                    f3 = 0.0f;
                    f4 = 1.0f;
                    f5 = 1.0f;
                } else if (i2 < 0.42f) {
                    float f6 = i2 / 0.42f;
                    float f7 = 1.0f - f6;
                    f4 = 1.0f - (f6 * 0.25f);
                    f5 = f7;
                    f3 = 0.0f;
                } else {
                    float f8 = (i2 - 0.42f) / 0.58000004f;
                    float f9 = 1.0f - f8;
                    float v = (oo1.v(f9, f9, f9, 1.0f) * 0.25f) + 0.75f;
                    f5 = Math.min(1.0f, f8 * 1.4f);
                    f4 = v;
                }
                chatActivityEnterView.E2.setPivotX(rectF.centerX());
                chatActivityEnterView.E2.setPivotY(rectF.centerY());
            } else {
                f3 = 0.0f;
                f4 = 1.0f;
                f5 = 1.0f;
            }
            if (f5 >= 1.0f && (!chatActivityEnterView.V5 || !Float.isNaN(f))) {
                z = false;
            }
            chatActivityEnterView.V5 = z;
            if (Math.abs(f3 - chatActivityEnterView.S5) >= 0.5f || (f3 == 0.0f && chatActivityEnterView.S5 != 0.0f)) {
                chatActivityEnterView.S5 = f3;
                chatActivityEnterView.E2.setTranslationY(chatActivityEnterView.R5 + f3 + chatActivityEnterView.l7);
            }
            if (Math.abs(f4 - chatActivityEnterView.T5) <= 0.001f && Math.abs(f5 - chatActivityEnterView.U5) <= 0.001f) {
                return;
            }
            chatActivityEnterView.T5 = f4;
            chatActivityEnterView.U5 = f5;
            chatActivityEnterView.E2.setScaleX(f4);
            chatActivityEnterView.E2.setScaleY(f4);
            chatActivityEnterView.E2.setAlpha(f5);
        }
    }
}
