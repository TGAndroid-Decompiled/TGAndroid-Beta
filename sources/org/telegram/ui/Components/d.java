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
        wq1 wq1Var;
        ChatActivityEnterView chatActivityEnterView = this.a;
        Drawable backgroundImage = chatActivityEnterView.b2.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            wq1Var = zu1Var.A0;
        } else {
            wq1Var = null;
        }
        if (wq1Var != null && wq1Var.getWidth() > 0) {
            canvas.save();
            canvas.translate(wq1Var.getX(), wq1Var.getY());
            wq1Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        boolean z;
        Editable text;
        ChatActivityEnterView chatActivityEnterView = this.a;
        tw1 tw1Var = chatActivityEnterView.R0;
        if (tw1Var != null) {
            tw1Var.invalidate();
        }
        chatActivityEnterView.z2(chatActivityEnterView.l7);
        bn3 bn3Var = chatActivityEnterView.j1;
        boolean z2 = true;
        if (bn3Var != null && bn3Var.q()) {
            z = true;
        } else {
            z = false;
        }
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var == null) {
            text = null;
        } else {
            text = tx1Var.getText();
        }
        tx1 tx1Var2 = chatActivityEnterView.F0;
        if (tx1Var2 == null || tx1Var2.getLineCount() <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) {
            z2 = false;
        }
        chatActivityEnterView.k2(z2);
        chatActivityEnterView.w6 = z;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            zu1Var.dd();
            zeb zebVar = zu1Var.s1;
            if (zebVar != null) {
                zebVar.d();
            }
        }
    }

    public final void c(float f, int i) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        tw1 tw1Var = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.C1;
        int i2 = aob.Nl;
        int i3 = ChatActivityEnterView.X7;
        int J0 = chatActivityEnterView.J0(i2);
        if (f <= 0.004f) {
            if (chatActivityEnterView.B1 != 0) {
                chatActivityEnterView.B1 = 0;
                tw1Var.setColorFilter(new PorterDuffColorFilter(J0, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f2 = vm2.f(Math.min(1.0f, f), J0, i | (-16777216)) & (-117901064);
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
        tw1Var.setColorFilter(colorFilter);
    }

    public final void d(String str) {
        rx rxVar;
        ChatActivityEnterView chatActivityEnterView = this.a;
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var != null && (rxVar = tx1Var.n1) != null) {
            rxVar.i(null, true);
        }
        chatActivityEnterView.W1(str, true);
    }

    public final void e(float f) {
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
            chatActivityEnterView.d2(z);
        }
        chatActivityEnterView.x2();
        oob oobVar = chatActivityEnterView.e2;
        if (oobVar != null) {
            oobVar.invalidate();
        }
        vw1 vw1Var = chatActivityEnterView.g2;
        if (vw1Var != null) {
            vw1Var.invalidate();
        }
        chatActivityEnterView.p2.setAlpha((1.0f - f) * chatActivityEnterView.z1);
    }
}
