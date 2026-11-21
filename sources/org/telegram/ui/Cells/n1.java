package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q80;
public final class n1 {
    public final boolean f31126a;
    public final ImageReceiver f31127b;
    public final org.telegram.ui.Components.b9 f31128c;
    public final RectF d;
    public final mc f31129e;
    public StaticLayout f31130f;
    public StaticLayout f31131g;
    public StaticLayout h;
    public boolean f31132i;
    public int f31133j;
    public y f31134k;
    public int f31135l;
    public q80 f31136m;
    public boolean f31137n;
    public final float[] f31138o;

    public n1(r1 r1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        this.f31127b = imageReceiver;
        this.f31128c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.d = new RectF();
        this.f31129e = new mc(r1Var);
        this.f31138o = new float[8];
        this.f31126a = z10;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (r1Var.O0) {
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
        this.f31133j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout X2 = r1.X2(str, r1.f31350xd, L);
        this.f31130f = X2;
        if (X2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + r1.L1(X2);
            L -= L2;
            this.f31133j = org.telegram.messenger.f3.C(6.0f, L2, this.f31133j);
        }
        int i13 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31132i = z10;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f31127b;
        if (z10) {
            org.telegram.ui.Components.b9 b9Var = this.f31128c;
            b9Var.p(tLObject);
            imageReceiver.i0(tLObject, b9Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            int i14 = this.f31133j;
            if (this.f31130f == null) {
                i12 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f31133j = org.telegram.messenger.f3.C(21.0f, i12, i14);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder N3 = r1.N3(charSequence2);
        int i15 = i7 / 2;
        if (N3 == null) {
            min = 0;
        } else {
            min = Math.min(i15, (int) Math.ceil(r1.f31351yd.measureText(N3, 0, N3.length())));
        }
        if (N3 != null) {
            i10 = org.telegram.messenger.g0.L(4.0f) + min;
        } else {
            i10 = 0;
        }
        StaticLayout X22 = r1.X2(charSequence, textPaint, L - i10);
        this.f31131g = X22;
        if (X22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + r1.L1(X22);
            L -= L3;
            int i16 = this.f31133j;
            if (this.f31130f == null && !this.f31132i) {
                i11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i11 = 0;
            }
            this.f31133j = i11 + L3 + i16;
        }
        if (L > org.telegram.messenger.g0.L(24.0f)) {
            staticLayout = r1.X2(N3, r1.f31351yd, Math.min(i15, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i17 = this.f31133j;
            if (this.f31130f == null && !this.f31132i && this.f31131g == null) {
                i13 = org.telegram.messenger.g0.L(6.0f);
            }
            this.f31133j = r1.L1(this.h) + i13 + i17;
        } else if (this.f31131g == null && this.f31130f == null) {
        } else {
            this.f31133j -= org.telegram.messenger.g0.L(4.0f);
        }
    }
}
