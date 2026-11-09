package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ic;
public final class m1 {
    public final boolean f29538a;
    public final ImageReceiver f29539b;
    public final org.telegram.ui.Components.w8 f29540c;
    public final RectF d;
    public final ic f29541e;
    public StaticLayout f29542f;
    public StaticLayout f29543g;
    public StaticLayout h;
    public boolean f29544i;
    public int f29545j;
    public y f29546k;
    public int f29547l;
    public b80 f29548m;
    public boolean f29549n;
    public final float[] f29550o;

    public m1(q1 q1Var, boolean z9) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f29539b = imageReceiver;
        this.f29540c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.d = new RectF();
        this.f29541e = new ic(q1Var);
        this.f29550o = new float[8];
        this.f29538a = z9;
        imageReceiver.J0(org.telegram.messenger.g0.L(16.0f) / 2);
        if (q1Var.N0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i7) {
        boolean z9;
        int min;
        int i10;
        int i11;
        int i12;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i7 - org.telegram.messenger.g0.L(22.0f);
        this.f29545j = org.telegram.messenger.g0.L(16.0f);
        StaticLayout U2 = q1.U2(str, q1.f29771jd, L);
        this.f29542f = U2;
        if (U2 != null) {
            int L2 = org.telegram.messenger.g0.L(4.0f) + q1.K1(U2);
            L -= L2;
            this.f29545j = org.telegram.messenger.k5.C(6.0f, L2, this.f29545j);
        }
        int i13 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f29544i = z9;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f29539b;
        if (z9) {
            org.telegram.ui.Components.w8 w8Var = this.f29540c;
            w8Var.p(tLObject);
            imageReceiver.i0(tLObject, w8Var, null);
            L -= org.telegram.messenger.g0.L(21.0f);
            int i14 = this.f29545j;
            if (this.f29542f == null) {
                i12 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f29545j = org.telegram.messenger.k5.C(21.0f, i12, i14);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder L3 = q1.L3(charSequence2);
        int i15 = i7 / 2;
        if (L3 == null) {
            min = 0;
        } else {
            min = Math.min(i15, (int) Math.ceil(q1.f29772kd.measureText(L3, 0, L3.length())));
        }
        if (L3 != null) {
            i10 = org.telegram.messenger.g0.L(4.0f) + min;
        } else {
            i10 = 0;
        }
        StaticLayout U22 = q1.U2(charSequence, textPaint, L - i10);
        this.f29543g = U22;
        if (U22 != null) {
            int L4 = org.telegram.messenger.g0.L(4.0f) + q1.K1(U22);
            L -= L4;
            int i16 = this.f29545j;
            if (this.f29542f == null && !this.f29544i) {
                i11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i11 = 0;
            }
            this.f29545j = i11 + L4 + i16;
        }
        if (L > org.telegram.messenger.g0.L(24.0f)) {
            staticLayout = q1.U2(L3, q1.f29772kd, Math.min(i15, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i17 = this.f29545j;
            if (this.f29542f == null && !this.f29544i && this.f29543g == null) {
                i13 = org.telegram.messenger.g0.L(6.0f);
            }
            this.f29545j = q1.K1(this.h) + i13 + i17;
        } else if (this.f29543g == null && this.f29542f == null) {
        } else {
            this.f29545j -= org.telegram.messenger.g0.L(4.0f);
        }
    }
}
