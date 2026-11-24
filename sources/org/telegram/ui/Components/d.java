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
        jq1 jq1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        Drawable backgroundImage = chatActivityEnterView.c2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            jq1Var = mu1Var.A0;
        } else {
            jq1Var = null;
        }
        if (jq1Var != null && jq1Var.getWidth() > 0) {
            canvas.save();
            canvas.translate(jq1Var.getX(), jq1Var.getY());
            jq1Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        boolean z;
        Editable text;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ew1 ew1Var = chatActivityEnterView.R0;
        if (ew1Var != null) {
            ew1Var.invalidate();
        }
        chatActivityEnterView.n2(chatActivityEnterView.L6);
        jm3 jm3Var = chatActivityEnterView.j1;
        boolean z2 = true;
        if (jm3Var != null && jm3Var.o()) {
            z = true;
        } else {
            z = false;
        }
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var == null) {
            text = null;
        } else {
            text = ex1Var.getText();
        }
        ex1 ex1Var2 = chatActivityEnterView.F0;
        if (ex1Var2 == null || ex1Var2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) {
            z2 = false;
        }
        chatActivityEnterView.Y1(z2);
        chatActivityEnterView.l6 = z;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (mu1Var != null) {
            mu1Var.Rc();
            dbb dbbVar = mu1Var.s1;
            if (dbbVar != null) {
                dbbVar.d();
            }
        }
    }

    public final void c(float f, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ew1 ew1Var = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i2 = bkb.Ml;
        int i3 = ChatActivityEnterView.r7;
        int F0 = chatActivityEnterView.F0(i2);
        if (f <= 0.004f) {
            if (chatActivityEnterView.B1 != 0) {
                chatActivityEnterView.B1 = 0;
                ew1Var.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f2 = bm2.f(Math.min(1.0f, f), F0, i | (-16777216)) & (-117901064);
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
        ew1Var.setColorFilter(colorFilter);
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
            chatActivityEnterView.S1(z);
        }
        chatActivityEnterView.l2();
        pkb pkbVar = chatActivityEnterView.f2;
        if (pkbVar != null) {
            pkbVar.invalidate();
        }
        gw1 gw1Var = chatActivityEnterView.h2;
        if (gw1Var != null) {
            gw1Var.invalidate();
        }
        chatActivityEnterView.q2.setAlpha((1.0f - f) * chatActivityEnterView.z1);
    }
}
