package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o80;
public final class m1 {
    public final boolean f31043a;
    public final ImageReceiver f31044b;
    public final org.telegram.ui.Components.b9 f31045c;
    public final RectF d;
    public final mc f31046e;
    public StaticLayout f31047f;
    public StaticLayout f31048g;
    public StaticLayout h;
    public boolean f31049i;
    public int f31050j;
    public y f31051k;
    public int f31052l;
    public o80 f31053m;
    public boolean f31054n;
    public final float[] f31055o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f31044b = imageReceiver;
        this.f31045c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.d = new RectF();
        this.f31046e = new mc(q1Var);
        this.f31055o = new float[8];
        this.f31043a = z10;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (q1Var.O0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i7) {
        boolean z10;
        int min;
        int i10;
        int i11;
        int i12;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i7 - org.telegram.messenger.g0.L(22.0f);
        this.f31050j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout X2 = q1.X2(str, q1.f31272xd, L);
        this.f31047f = X2;
        if (X2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.L1(X2);
            L -= L2;
            this.f31050j = org.telegram.messenger.f3.C(6.0f, L2, this.f31050j);
        }
        int i13 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31049i = z10;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f31044b;
        if (z10) {
            org.telegram.ui.Components.b9 b9Var = this.f31045c;
            b9Var.p(tLObject);
            imageReceiver.i0(tLObject, b9Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            int i14 = this.f31050j;
            if (this.f31047f == null) {
                i12 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f31050j = org.telegram.messenger.f3.C(21.0f, i12, i14);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder N3 = q1.N3(charSequence2);
        int i15 = i7 / 2;
        if (N3 == null) {
            min = 0;
        } else {
            min = Math.min(i15, (int) Math.ceil(q1.f31273yd.measureText(N3, 0, N3.length())));
        }
        if (N3 != null) {
            i10 = org.telegram.messenger.g0.L(4.0f) + min;
        } else {
            i10 = 0;
        }
        StaticLayout X22 = q1.X2(charSequence, textPaint, L - i10);
        this.f31048g = X22;
        if (X22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + q1.L1(X22);
            L -= L3;
            int i16 = this.f31050j;
            if (this.f31047f == null && !this.f31049i) {
                i11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i11 = 0;
            }
            this.f31050j = i11 + L3 + i16;
        }
        if (L > org.telegram.messenger.g0.L(24.0f)) {
            staticLayout = q1.X2(N3, q1.f31273yd, Math.min(i15, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i17 = this.f31050j;
            if (this.f31047f == null && !this.f31049i && this.f31048g == null) {
                i13 = org.telegram.messenger.g0.L(6.0f);
            }
            this.f31050j = q1.L1(this.h) + i13 + i17;
        } else if (this.f31048g == null && this.f31047f == null) {
        } else {
            this.f31050j -= org.telegram.messenger.g0.L(4.0f);
        }
    }
}
