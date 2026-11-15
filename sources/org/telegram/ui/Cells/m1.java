package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
public final class m1 {
    public final boolean f30675a;
    public final ImageReceiver f30676b;
    public final org.telegram.ui.Components.t8 f30677c;
    public final RectF d;
    public final dc f30678e;
    public StaticLayout f30679f;
    public StaticLayout f30680g;
    public StaticLayout h;
    public boolean f30681i;
    public int f30682j;
    public y f30683k;
    public int f30684l;
    public d80 f30685m;
    public boolean f30686n;
    public final float[] f30687o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f30676b = imageReceiver;
        this.f30677c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.d = new RectF();
        this.f30678e = new dc(q1Var);
        this.f30687o = new float[8];
        this.f30675a = z10;
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
        this.f30682j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout V2 = q1.V2(str, q1.f30900xd, L);
        this.f30679f = V2;
        if (V2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.L1(V2);
            L -= L2;
            this.f30682j = org.telegram.messenger.k5.C(6.0f, L2, this.f30682j);
        }
        int i13 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30681i = z10;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f30676b;
        if (z10) {
            org.telegram.ui.Components.t8 t8Var = this.f30677c;
            t8Var.p(tLObject);
            imageReceiver.i0(tLObject, t8Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            int i14 = this.f30682j;
            if (this.f30679f == null) {
                i12 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f30682j = org.telegram.messenger.k5.C(21.0f, i12, i14);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder M3 = q1.M3(charSequence2);
        int i15 = i7 / 2;
        if (M3 == null) {
            min = 0;
        } else {
            min = Math.min(i15, (int) Math.ceil(q1.f30901yd.measureText(M3, 0, M3.length())));
        }
        if (M3 != null) {
            i10 = org.telegram.messenger.g0.L(4.0f) + min;
        } else {
            i10 = 0;
        }
        StaticLayout V22 = q1.V2(charSequence, textPaint, L - i10);
        this.f30680g = V22;
        if (V22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + q1.L1(V22);
            L -= L3;
            int i16 = this.f30682j;
            if (this.f30679f == null && !this.f30681i) {
                i11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i11 = 0;
            }
            this.f30682j = i11 + L3 + i16;
        }
        if (L > org.telegram.messenger.g0.L(24.0f)) {
            staticLayout = q1.V2(M3, q1.f30901yd, Math.min(i15, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i17 = this.f30682j;
            if (this.f30679f == null && !this.f30681i && this.f30680g == null) {
                i13 = org.telegram.messenger.g0.L(6.0f);
            }
            this.f30682j = q1.L1(this.h) + i13 + i17;
        } else if (this.f30680g == null && this.f30679f == null) {
        } else {
            this.f30682j -= org.telegram.messenger.g0.L(4.0f);
        }
    }
}
