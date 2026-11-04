package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.w70;
public final class m1 {
    public final boolean f29614a;
    public final ImageReceiver f29615b;
    public final org.telegram.ui.Components.u8 f29616c;
    public final RectF d;
    public final gc f29617e;
    public StaticLayout f29618f;
    public StaticLayout f29619g;
    public StaticLayout h;
    public boolean f29620i;
    public int f29621j;
    public y f29622k;
    public int f29623l;
    public w70 f29624m;
    public boolean f29625n;
    public final float[] f29626o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f29615b = imageReceiver;
        this.f29616c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.d = new RectF();
        this.f29617e = new gc(q1Var);
        this.f29626o = new float[8];
        this.f29614a = z10;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (q1Var.O0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i3) {
        boolean z10;
        int min;
        int i10;
        int i11;
        int i12;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i3 - org.telegram.messenger.g0.L(22.0f);
        this.f29621j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout T2 = q1.T2(str, q1.f29839id, L);
        this.f29618f = T2;
        if (T2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.K1(T2);
            L -= L2;
            this.f29621j = org.telegram.messenger.k5.C(6.0f, L2, this.f29621j);
        }
        int i13 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29620i = z10;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f29615b;
        if (z10) {
            org.telegram.ui.Components.u8 u8Var = this.f29616c;
            u8Var.p(tLObject);
            imageReceiver.i0(tLObject, u8Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            int i14 = this.f29621j;
            if (this.f29618f == null) {
                i12 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f29621j = org.telegram.messenger.k5.C(21.0f, i12, i14);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder J3 = q1.J3(charSequence2);
        int i15 = i3 / 2;
        if (J3 == null) {
            min = 0;
        } else {
            min = Math.min(i15, (int) Math.ceil(q1.f29840jd.measureText(J3, 0, J3.length())));
        }
        if (J3 != null) {
            i10 = org.telegram.messenger.g0.L(4.0f) + min;
        } else {
            i10 = 0;
        }
        StaticLayout T22 = q1.T2(charSequence, textPaint, L - i10);
        this.f29619g = T22;
        if (T22 != null) {
            int L3 = org.telegram.messenger.g0.L(4.0f) + q1.K1(T22);
            L -= L3;
            int i16 = this.f29621j;
            if (this.f29618f == null && !this.f29620i) {
                i11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i11 = 0;
            }
            this.f29621j = i11 + L3 + i16;
        }
        if (L > org.telegram.messenger.g0.L(24.0f)) {
            staticLayout = q1.T2(J3, q1.f29840jd, Math.min(i15, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i17 = this.f29621j;
            if (this.f29618f == null && !this.f29620i && this.f29619g == null) {
                i13 = org.telegram.messenger.g0.L(6.0f);
            }
            this.f29621j = q1.K1(this.h) + i13 + i17;
        } else if (this.f29619g == null && this.f29618f == null) {
        } else {
            this.f29621j -= org.telegram.messenger.g0.L(4.0f);
        }
    }
}
