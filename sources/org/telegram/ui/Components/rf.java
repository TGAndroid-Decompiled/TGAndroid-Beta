package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf {
    public final ChatActivityEnterView f39178a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f39178a = chatActivityEnterView;
    }

    public final View a() {
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
        while (chatActivityEnterView2 != 0 && chatActivityEnterView2.getParent() != chatActivityEnterView.f32591c2) {
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
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        zi0 zi0Var = chatActivityEnterView.f32638i1;
        boolean z10 = false;
        if (zi0Var != null && chatActivityEnterView.R3 != null && zi0Var.getVisibility() == 0) {
            fArr[0] = chatActivityEnterView.f32638i1.getAudioLeft();
            z10 = true;
            fArr[1] = chatActivityEnterView.f32638i1.getAudioRight();
            if (chatActivityEnterView.f32638i1.f42876p0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[2] = f10;
        }
        return z10;
    }

    public final boolean c() {
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        if (!chatActivityEnterView.f32736v3 && chatActivityEnterView.R3 == null && !MediaController.B().J()) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        if (chatActivityEnterView.f32736v3 && !chatActivityEnterView.O2 && !chatActivityEnterView.Z2) {
            if ((!chatActivityEnterView.U2 || !chatActivityEnterView.f32598d1) && chatActivityEnterView.f32764z0 && !chatActivityEnterView.l1 && chatActivityEnterView.F3 != null && chatActivityEnterView.F0 != null && !MediaController.B().K()) {
                ai.p0 p0Var = chatActivityEnterView.f32645j1;
                if ((p0Var == null || !p0Var.n()) && !chatActivityEnterView.U1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        if (chatActivityEnterView.f32736v3 && !MediaController.B().K()) {
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
            if (recordCircle != null && ChatActivityEnterView.this.f32642i5) {
                chatActivityEnterView.f32768z4 = true;
            }
            MediaController.B().D0(chatActivityEnterView.P);
            chatActivityEnterView.P3.a1(0);
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32573a2;
            if (slideTextView != null) {
                slideTextView.setEnabled(false);
            }
        }
    }

    public final void f(Object obj, String str, org.telegram.messenger.y10 y10Var) {
        if (!(obj instanceof ai.g)) {
            y10Var.a(null);
            return;
        }
        int i7 = ChatActivityEnterView.f32569s7;
        ai.p0 A0 = this.f39178a.A0();
        A0.j();
        long uptimeMillis = SystemClock.uptimeMillis();
        A0.H.a((ai.g) obj, str, new ai.d0(A0, uptimeMillis, y10Var));
    }

    public final void g(float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int[] iArr;
        int[] iArr2;
        ChatActivityEnterView chatActivityEnterView = this.f39178a;
        du0 du0Var = chatActivityEnterView.f32591c2;
        RectF rectF = chatActivityEnterView.I4;
        if (chatActivityEnterView.E2 != null) {
            boolean z10 = true;
            if (!Float.isNaN(f10) && !rectF.isEmpty() && du0Var != null) {
                chatActivityEnterView.E2.getLocationInWindow(new int[2]);
                du0Var.getLocationInWindow(new int[2]);
                f12 = Math.min(0.0f, f10 - (rectF.centerY() + (((iArr[1] - iArr2[1]) - chatActivityEnterView.E2.getTranslationY()) + chatActivityEnterView.S5)));
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
                chatActivityEnterView.E2.setPivotX(rectF.centerX());
                chatActivityEnterView.E2.setPivotY(rectF.centerY());
            } else {
                f12 = 0.0f;
                f13 = 1.0f;
                f14 = 1.0f;
            }
            if (f14 >= 1.0f && (!chatActivityEnterView.W5 || !Float.isNaN(f10))) {
                z10 = false;
            }
            chatActivityEnterView.W5 = z10;
            if (Math.abs(f12 - chatActivityEnterView.T5) >= 0.5f || (f12 == 0.0f && chatActivityEnterView.T5 != 0.0f)) {
                chatActivityEnterView.T5 = f12;
                chatActivityEnterView.E2.setTranslationY(chatActivityEnterView.S5 + f12 + chatActivityEnterView.f32672m7);
            }
            if (Math.abs(f13 - chatActivityEnterView.U5) <= 0.001f && Math.abs(f14 - chatActivityEnterView.V5) <= 0.001f) {
                return;
            }
            chatActivityEnterView.U5 = f13;
            chatActivityEnterView.V5 = f14;
            chatActivityEnterView.E2.setScaleX(f13);
            chatActivityEnterView.E2.setScaleY(f13);
            chatActivityEnterView.E2.setAlpha(f14);
        }
    }
}
