package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gf {
    public final ChatActivityEnterView f34928a;

    public gf(ChatActivityEnterView chatActivityEnterView) {
        this.f34928a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
        while (chatActivityEnterView2 != 0 && chatActivityEnterView2.getParent() != chatActivityEnterView.U1) {
            if (chatActivityEnterView2.getParent() instanceof View) {
                chatActivityEnterView2 = (View) chatActivityEnterView2.getParent();
            } else {
                chatActivityEnterView2 = 0;
            }
        }
        return chatActivityEnterView2;
    }

    public final boolean b(float[] fArr) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        oi0 oi0Var = chatActivityEnterView.f32214i1;
        boolean z10 = false;
        if (oi0Var != null && chatActivityEnterView.J3 != null && oi0Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.f32214i1.getAudioLeft();
            z10 = true;
            fArr[1] = chatActivityEnterView.f32214i1.getAudioRight();
            if (chatActivityEnterView.f32214i1.f37987p0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[2] = f10;
        }
        return z10;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        if (!chatActivityEnterView.f32248n3 && chatActivityEnterView.J3 == null && !MediaController.B().J()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        if (chatActivityEnterView.f32248n3 && !chatActivityEnterView.G2 && !chatActivityEnterView.R2) {
            if ((!chatActivityEnterView.M2 || !chatActivityEnterView.f32178d1) && chatActivityEnterView.f32331z0 && chatActivityEnterView.f32319x3 != null && chatActivityEnterView.F0 != null && !MediaController.B().K()) {
                ai.m0 m0Var = chatActivityEnterView.f32221j1;
                if ((m0Var == null || m0Var.f1378r == 0) && !chatActivityEnterView.M1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        if (chatActivityEnterView.f32248n3 && !MediaController.B().K()) {
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.f32302v2;
            if (recordCircle != null && ChatActivityEnterView.this.f32159a5) {
                chatActivityEnterView.f32277r4 = true;
            }
            MediaController.B().D0(chatActivityEnterView.P);
            chatActivityEnterView.H3.a1(0);
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
            if (slideTextView != null) {
                slideTextView.setEnabled(false);
            }
        }
    }

    public final void f(Object obj, String str, org.telegram.messenger.z10 z10Var) {
        if (!(obj instanceof ai.h)) {
            z10Var.a(null);
            return;
        }
        int i7 = ChatActivityEnterView.N6;
        ai.m0 o02 = this.f34928a.o0();
        o02.g();
        long uptimeMillis = SystemClock.uptimeMillis();
        o02.H.a((ai.h) obj, str, new ai.c0(uptimeMillis, z10Var, 0));
    }

    public final void g(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int[] iArr;
        int[] iArr2;
        ChatActivityEnterView chatActivityEnterView = this.f34928a;
        st0 st0Var = chatActivityEnterView.U1;
        RectF rectF = chatActivityEnterView.A4;
        if (chatActivityEnterView.f32310w2 != null) {
            boolean z10 = true;
            if (!Float.isNaN(f10) && !rectF.isEmpty() && st0Var != null) {
                chatActivityEnterView.f32310w2.getLocationInWindow(new int[2]);
                st0Var.getLocationInWindow(new int[2]);
                f12 = Math.min(0.0f, f10 - (rectF.centerY() + (((iArr[1] - iArr2[1]) - chatActivityEnterView.f32310w2.getTranslationY()) + chatActivityEnterView.K5)));
                float i7 = Utilities.i(f11, 1.0f, 0.0f);
                if (f12 > -1.0f) {
                    f12 = 0.0f;
                    f13 = 1.0f;
                    f14 = 1.0f;
                } else if (i7 < 0.42f) {
                    float f15 = i7 / 0.42f;
                    float f16 = 1.0f - f15;
                    f13 = 1.0f - (f15 * 0.25f);
                    f14 = f16;
                    f12 = 0.0f;
                } else {
                    float f17 = (i7 - 0.42f) / 0.58000004f;
                    float f18 = 1.0f - f17;
                    float x10 = (org.telegram.ui.Cells.y0.x(f18, f18, f18, 1.0f) * 0.25f) + 0.75f;
                    f14 = Math.min(1.0f, f17 * 1.4f);
                    f13 = x10;
                }
                chatActivityEnterView.f32310w2.setPivotX(rectF.centerX());
                chatActivityEnterView.f32310w2.setPivotY(rectF.centerY());
            } else {
                f12 = 0.0f;
                f13 = 1.0f;
                f14 = 1.0f;
            }
            if (f14 >= 1.0f && (!chatActivityEnterView.O5 || !Float.isNaN(f10))) {
                z10 = false;
            }
            chatActivityEnterView.O5 = z10;
            if (Math.abs(f12 - chatActivityEnterView.L5) >= 0.5f || (f12 == 0.0f && chatActivityEnterView.L5 != 0.0f)) {
                chatActivityEnterView.L5 = f12;
                chatActivityEnterView.f32310w2.setTranslationY(chatActivityEnterView.K5 + f12);
            }
            if (Math.abs(f13 - chatActivityEnterView.M5) <= 0.001f && Math.abs(f14 - chatActivityEnterView.N5) <= 0.001f) {
                return;
            }
            chatActivityEnterView.M5 = f13;
            chatActivityEnterView.N5 = f14;
            chatActivityEnterView.f32310w2.setScaleX(f13);
            chatActivityEnterView.f32310w2.setScaleY(f13);
            chatActivityEnterView.f32310w2.setAlpha(f14);
        }
    }
}
