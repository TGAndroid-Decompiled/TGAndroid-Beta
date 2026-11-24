package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
public final class d {
    public final ChatActivityEnterView a;

    public d(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(Canvas canvas) {
        vr1 vr1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        Drawable backgroundImage = chatActivityEnterView.c2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            vr1Var = yv1Var.A0;
        } else {
            vr1Var = null;
        }
        if (vr1Var != null && vr1Var.getWidth() > 0) {
            canvas.save();
            canvas.translate(vr1Var.getX(), vr1Var.getY());
            vr1Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        boolean z;
        Editable text;
        ChatActivityEnterView chatActivityEnterView = this.a;
        rx1 rx1Var = chatActivityEnterView.R0;
        if (rx1Var != null) {
            rx1Var.invalidate();
        }
        chatActivityEnterView.s2(chatActivityEnterView.T6);
        un3 un3Var = chatActivityEnterView.j1;
        boolean z2 = true;
        if (un3Var != null && un3Var.o()) {
            z = true;
        } else {
            z = false;
        }
        sy1 sy1Var = chatActivityEnterView.F0;
        if (sy1Var == null) {
            text = null;
        } else {
            text = sy1Var.getText();
        }
        sy1 sy1Var2 = chatActivityEnterView.F0;
        if (sy1Var2 == null || sy1Var2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) {
            z2 = false;
        }
        chatActivityEnterView.b2(z2);
        chatActivityEnterView.l6 = z;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (yv1Var != null) {
            yv1Var.dd();
            fdb fdbVar = yv1Var.s1;
            if (fdbVar != null) {
                fdbVar.d();
            }
        }
    }

    public final void c(float f, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        rx1 rx1Var = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i2 = cmb.Ml;
        int i3 = ChatActivityEnterView.z7;
        int F0 = chatActivityEnterView.F0(i2);
        if (f <= 0.004f) {
            if (chatActivityEnterView.B1 != 0) {
                chatActivityEnterView.B1 = 0;
                rx1Var.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f2 = on2.f(Math.min(1.0f, f), F0, i | (-16777216)) & (-117901064);
        if (f2 == chatActivityEnterView.B1) {
            return;
        }
        chatActivityEnterView.B1 = f2;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f2);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f2, colorFilter);
        }
        rx1Var.setColorFilter(colorFilter);
    }

    public final void d(float f) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.y1 = f;
        if (f >= 1.0f || f <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            if (chatActivityEnterView.F0.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.V1(z);
        }
        chatActivityEnterView.q2();
        qmb qmbVar = chatActivityEnterView.f2;
        if (qmbVar != null) {
            qmbVar.invalidate();
        }
        tx1 tx1Var = chatActivityEnterView.h2;
        if (tx1Var != null) {
            tx1Var.invalidate();
        }
        chatActivityEnterView.q2.setAlpha((1.0f - f) * chatActivityEnterView.z1);
    }
}
