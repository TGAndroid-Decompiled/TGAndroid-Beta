package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
public final class ae implements r4, ni0 {
    public final int f32966a;
    public final ChatActivityEnterView f32967b;

    public ae(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f32966a = i7;
        this.f32967b = chatActivityEnterView;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f32966a) {
            case 0:
                this.f32967b.k1(z10, i7, i10, 0L, true);
                return;
            default:
                this.f32967b.k1(z10, i7, 0, 0L, true);
                return;
        }
    }

    public void a(Canvas canvas) {
        org.telegram.ui.aj ajVar;
        ChatActivityEnterView chatActivityEnterView = this.f32967b;
        Drawable backgroundImage = chatActivityEnterView.U1.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.draw(canvas);
        }
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null) {
            ajVar = anVar.A0;
        } else {
            ajVar = null;
        }
        if (ajVar != null && ajVar.getWidth() > 0) {
            canvas.save();
            canvas.translate(ajVar.getX(), ajVar.getY());
            ajVar.draw(canvas);
            canvas.restore();
        }
    }

    public void b() {
        boolean z10;
        Editable text;
        ChatActivityEnterView chatActivityEnterView = this.f32967b;
        ai.m0 m0Var = chatActivityEnterView.f32221j1;
        boolean z11 = false;
        if (m0Var != null && m0Var.f1378r != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xe xeVar = chatActivityEnterView.F0;
        if (xeVar == null) {
            text = null;
        } else {
            text = xeVar.getText();
        }
        xe xeVar2 = chatActivityEnterView.F0;
        if (xeVar2 != null && xeVar2.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z11 = true;
        }
        chatActivityEnterView.N1(z11);
        chatActivityEnterView.f32190e6 = z10;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null) {
            anVar.dd();
            rw0 rw0Var = anVar.f45355s1;
            if (rw0Var != null) {
                rw0Var.e();
            }
        }
    }

    public void c(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f32967b;
        uc ucVar = chatActivityEnterView.P1;
        gg ggVar = chatActivityEnterView.f32310w2;
        if (ggVar != null) {
            ggVar.invalidate();
        }
        if (!z10) {
            yh.a aVar = chatActivityEnterView.L1;
            if (aVar != null) {
                oi0 oi0Var = chatActivityEnterView.f32214i1;
                aVar.c(Math.round(Math.max(1.0f, (oi0Var.f37996w - oi0Var.f37991s) * oi0Var.f37989r)));
            }
            org.telegram.messenger.g0.r(ucVar);
            org.telegram.messenger.g0.i3(ucVar, 300L);
        }
    }

    public void d(float f10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f32967b;
        wd wdVar = chatActivityEnterView.R0;
        SparseArray sparseArray = chatActivityEnterView.f32301v1;
        int i10 = org.telegram.ui.ActionBar.j6.Nl;
        int i11 = ChatActivityEnterView.N6;
        int u02 = chatActivityEnterView.u0(i10);
        if (f10 <= 0.004f) {
            if (chatActivityEnterView.f32294u1 != 0) {
                chatActivityEnterView.f32294u1 = 0;
                wdVar.setColorFilter(new PorterDuffColorFilter(u02, PorterDuff.Mode.SRC_IN));
                return;
            }
            return;
        }
        int f11 = i0.a.f(Math.min(1.0f, f10), u02, i7 | (-16777216)) & (-117901064);
        if (f11 == chatActivityEnterView.f32294u1) {
            return;
        }
        chatActivityEnterView.f32294u1 = f11;
        ColorFilter colorFilter = (ColorFilter) sparseArray.get(f11);
        if (colorFilter == null) {
            colorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
            if (sparseArray.size() > 512) {
                sparseArray.clear();
            }
            sparseArray.put(f11, colorFilter);
        }
        wdVar.setColorFilter(colorFilter);
    }

    public void e(float f10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f32967b;
        chatActivityEnterView.f32274r1 = f10;
        if (f10 >= 1.0f || f10 <= 0.0f) {
            Editable text = chatActivityEnterView.F0.getText();
            if (chatActivityEnterView.F0.getLineCount() > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.H1(z10);
        }
        chatActivityEnterView.Z1();
        org.telegram.ui.z51 z51Var = chatActivityEnterView.X1;
        if (z51Var != null) {
            z51Var.invalidate();
        }
        zd zdVar = chatActivityEnterView.Z1;
        if (zdVar != null) {
            zdVar.invalidate();
        }
        chatActivityEnterView.f32215i2.setAlpha((1.0f - f10) * chatActivityEnterView.f32282s1);
    }
}
