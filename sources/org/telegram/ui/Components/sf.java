package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
public final class sf {
    public final ChatActivityEnterView f39572a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.f39572a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.bj bjVar;
        ChatActivityEnterView chatActivityEnterView = this.f39572a;
        Drawable backgroundImage = chatActivityEnterView.f32591c2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bjVar = bnVar.A0;
        } else {
            bjVar = null;
        }
        if (bjVar != null && bjVar.getWidth() > 0) {
            canvas.save();
            canvas.translate(bjVar.getX(), bjVar.getY());
            bjVar.draw(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        boolean z10;
        Editable text;
        ChatActivityEnterView chatActivityEnterView = this.f39572a;
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            feVar.invalidate();
        }
        chatActivityEnterView.o2(chatActivityEnterView.M6);
        ai.p0 p0Var = chatActivityEnterView.f32645j1;
        boolean z11 = true;
        if (p0Var != null && p0Var.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar == null) {
            text = null;
        } else {
            text = gfVar.getText();
        }
        gf gfVar2 = chatActivityEnterView.F0;
        if (gfVar2 == null || gfVar2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) {
            z11 = false;
        }
        chatActivityEnterView.Z1(z11);
        chatActivityEnterView.f32671m6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.dd();
            ax0 ax0Var = bnVar.f46188s1;
            if (ax0Var != null) {
                ax0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f39572a;
        fe feVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i10 = org.telegram.ui.ActionBar.m6.Nl;
        int i11 = ChatActivityEnterView.f32569s7;
        int G0 = chatActivityEnterView.G0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.B1 != 0) {
                chatActivityEnterView.B1 = 0;
                feVar.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), G0, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.B1) {
            return;
        }
        chatActivityEnterView.B1 = f11;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f11);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f11, colorFilter);
        }
        feVar.setColorFilter(colorFilter);
    }

    public final void d(float f10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f39572a;
        chatActivityEnterView.f32758y1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            if (chatActivityEnterView.F0.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.T1(z10);
        }
        chatActivityEnterView.m2();
        org.telegram.ui.d61 d61Var = chatActivityEnterView.f32616f2;
        if (d61Var != null) {
            d61Var.invalidate();
        }
        ie ieVar = chatActivityEnterView.f32632h2;
        if (ieVar != null) {
            ieVar.invalidate();
        }
        chatActivityEnterView.f32698q2.setAlpha((1.0f - f10) * chatActivityEnterView.f32765z1);
    }
}
