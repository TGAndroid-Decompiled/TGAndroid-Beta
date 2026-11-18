package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
public final class qf {
    public final ChatActivityEnterView f38784a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f38784a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.bj bjVar;
        ChatActivityEnterView chatActivityEnterView = this.f38784a;
        Drawable backgroundImage = chatActivityEnterView.f32542a2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
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
        ChatActivityEnterView chatActivityEnterView = this.f38784a;
        fe feVar = chatActivityEnterView.R0;
        if (feVar != null) {
            feVar.invalidate();
        }
        ai.n0 n0Var = chatActivityEnterView.f32614j1;
        boolean z11 = true;
        if (n0Var != null && n0Var.m()) {
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
        chatActivityEnterView.V1(z11);
        chatActivityEnterView.f32626k6 = z10;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            bnVar.dd();
            yw0 yw0Var = bnVar.f46170s1;
            if (yw0Var != null) {
                yw0Var.e();
            }
        }
    }

    public final void c(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f38784a;
        fe feVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.A1;
        int i10 = org.telegram.ui.ActionBar.n6.Nl;
        int i11 = ChatActivityEnterView.f32538n7;
        int C0 = chatActivityEnterView.C0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.f32729z1 != 0) {
                chatActivityEnterView.f32729z1 = 0;
                feVar.setColorFilter(new PorterDuffColorFilter(C0, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), C0, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.f32729z1) {
            return;
        }
        chatActivityEnterView.f32729z1 = f11;
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
        ChatActivityEnterView chatActivityEnterView = this.f38784a;
        chatActivityEnterView.f32706w1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            if (chatActivityEnterView.F0.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.P1(z10);
        }
        chatActivityEnterView.i2();
        org.telegram.ui.d61 d61Var = chatActivityEnterView.d2;
        if (d61Var != null) {
            d61Var.invalidate();
        }
        ie ieVar = chatActivityEnterView.f32585f2;
        if (ieVar != null) {
            ieVar.invalidate();
        }
        chatActivityEnterView.f32651o2.setAlpha((1.0f - f10) * chatActivityEnterView.f32714x1);
    }
}
