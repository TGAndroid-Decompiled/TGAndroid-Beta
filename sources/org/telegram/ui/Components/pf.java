package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pf {
    public final ChatActivityEnterView f38384a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f38384a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
        while (chatActivityEnterView2 != 0 && chatActivityEnterView2.getParent() != chatActivityEnterView.f32542a2) {
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
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        xi0 xi0Var = chatActivityEnterView.f32607i1;
        boolean z10 = false;
        if (xi0Var != null && chatActivityEnterView.P3 != null && xi0Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.f32607i1.getAudioLeft();
            z10 = true;
            fArr[1] = chatActivityEnterView.f32607i1.getAudioRight();
            if (chatActivityEnterView.f32607i1.f42079p0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[2] = f10;
        }
        return z10;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        if (!chatActivityEnterView.f32687t3 && chatActivityEnterView.P3 == null && !MediaController.B().J()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        if (chatActivityEnterView.f32687t3 && !chatActivityEnterView.M2 && !chatActivityEnterView.X2) {
            if ((!chatActivityEnterView.S2 || !chatActivityEnterView.f32567d1) && chatActivityEnterView.f32728z0 && !chatActivityEnterView.l1 && chatActivityEnterView.D3 != null && chatActivityEnterView.F0 != null && !MediaController.B().K()) {
                ai.n0 n0Var = chatActivityEnterView.f32614j1;
                if ((n0Var == null || !n0Var.m()) && !chatActivityEnterView.S1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        if (chatActivityEnterView.f32687t3 && !MediaController.B().K()) {
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
            if (recordCircle != null && ChatActivityEnterView.this.f32596g5) {
                chatActivityEnterView.f32717x4 = true;
            }
            MediaController.B().D0(chatActivityEnterView.P);
            chatActivityEnterView.N3.a1(0);
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
            if (slideTextView != null) {
                slideTextView.setEnabled(false);
            }
        }
    }

    public final void f(Object obj, String str, org.telegram.messenger.x10 x10Var) {
        if (!(obj instanceof ai.g)) {
            x10Var.a(null);
            return;
        }
        int i7 = ChatActivityEnterView.f32538n7;
        ai.n0 w02 = this.f38384a.w0();
        w02.g();
        long uptimeMillis = SystemClock.uptimeMillis();
        w02.H.a((ai.g) obj, str, new ai.d0(w02, uptimeMillis, x10Var));
    }

    public final void g(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int[] iArr;
        int[] iArr2;
        ChatActivityEnterView chatActivityEnterView = this.f38384a;
        au0 au0Var = chatActivityEnterView.f32542a2;
        RectF rectF = chatActivityEnterView.G4;
        if (chatActivityEnterView.C2 != null) {
            boolean z10 = true;
            if (!Float.isNaN(f10) && !rectF.isEmpty() && au0Var != null) {
                chatActivityEnterView.C2.getLocationInWindow(new int[2]);
                au0Var.getLocationInWindow(new int[2]);
                f12 = Math.min(0.0f, f10 - (rectF.centerY() + (((iArr[1] - iArr2[1]) - chatActivityEnterView.C2.getTranslationY()) + chatActivityEnterView.Q5)));
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
                    float z11 = (org.telegram.ui.Cells.c0.z(f18, f18, f18, 1.0f) * 0.25f) + 0.75f;
                    f14 = Math.min(1.0f, f17 * 1.4f);
                    f13 = z11;
                }
                chatActivityEnterView.C2.setPivotX(rectF.centerX());
                chatActivityEnterView.C2.setPivotY(rectF.centerY());
            } else {
                f12 = 0.0f;
                f13 = 1.0f;
                f14 = 1.0f;
            }
            if (f14 >= 1.0f && (!chatActivityEnterView.U5 || !Float.isNaN(f10))) {
                z10 = false;
            }
            chatActivityEnterView.U5 = z10;
            if (Math.abs(f12 - chatActivityEnterView.R5) >= 0.5f || (f12 == 0.0f && chatActivityEnterView.R5 != 0.0f)) {
                chatActivityEnterView.R5 = f12;
                chatActivityEnterView.C2.setTranslationY(chatActivityEnterView.Q5 + f12);
            }
            if (Math.abs(f13 - chatActivityEnterView.S5) <= 0.001f && Math.abs(f14 - chatActivityEnterView.T5) <= 0.001f) {
                return;
            }
            chatActivityEnterView.S5 = f13;
            chatActivityEnterView.T5 = f14;
            chatActivityEnterView.C2.setScaleX(f13);
            chatActivityEnterView.C2.setScaleY(f13);
            chatActivityEnterView.C2.setAlpha(f14);
        }
    }
}
