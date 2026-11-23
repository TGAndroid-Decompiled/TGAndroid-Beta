package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
public final class rf {
    public final ChatActivityEnterView f39289a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f39289a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.bj bjVar;
        ChatActivityEnterView chatActivityEnterView = this.f39289a;
        Drawable backgroundImage = chatActivityEnterView.f32655c2.getBackgroundImage();
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
        ChatActivityEnterView chatActivityEnterView = this.f39289a;
        ge geVar = chatActivityEnterView.R0;
        if (geVar != null) {
            geVar.invalidate();
        }
        chatActivityEnterView.q2(chatActivityEnterView.M6);
        ai.l0 l0Var = chatActivityEnterView.f32709j1;
        boolean z11 = true;
        if (l0Var != null && l0Var.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar == null) {
            text = null;
        } else {
            text = hfVar.getText();
        }
        hf hfVar2 = chatActivityEnterView.F0;
        if (hfVar2 == null || hfVar2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) {
            z11 = false;
        }
        chatActivityEnterView.b2(z11);
        chatActivityEnterView.f32735m6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bnVar.dd();
            zw0 zw0Var = bnVar.f46356s1;
            if (zw0Var != null) {
                zw0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f39289a;
        ge geVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i10 = org.telegram.ui.ActionBar.n6.Nl;
        int i11 = ChatActivityEnterView.f32633s7;
        int G0 = chatActivityEnterView.G0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.B1 != 0) {
                chatActivityEnterView.B1 = 0;
                geVar.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
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
        geVar.setColorFilter(colorFilter);
    }

    public final void d(float f10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f39289a;
        chatActivityEnterView.f32822y1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            if (chatActivityEnterView.F0.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.V1(z10);
        }
        chatActivityEnterView.o2();
        org.telegram.ui.b61 b61Var = chatActivityEnterView.f32680f2;
        if (b61Var != null) {
            b61Var.invalidate();
        }
        je jeVar = chatActivityEnterView.f32696h2;
        if (jeVar != null) {
            jeVar.invalidate();
        }
        chatActivityEnterView.f32762q2.setAlpha((1.0f - f10) * chatActivityEnterView.f32829z1);
    }
}
