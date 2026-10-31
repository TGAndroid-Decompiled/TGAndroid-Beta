package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.t80;
public final class m1 {
    public final boolean f22278a;
    public final ImageReceiver f22279b;
    public final org.telegram.ui.Components.r8 f22280c;
    public final RectF d;
    public final dc e;
    public StaticLayout f22281f;
    public StaticLayout f22282g;
    public StaticLayout h;
    public boolean f22283i;
    public int f22284j;
    public y f22285k;
    public int f22286l;
    public t80 f22287m;
    public boolean f22288n;
    public final float[] f22289o;

    public m1(q1 q1Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f22279b = imageReceiver;
        this.f22280c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.d = new RectF();
        this.e = new dc(q1Var);
        this.f22289o = new float[8];
        this.f22278a = z10;
        imageReceiver.J0(org.telegram.messenger.i0.L(16.0f) / 2);
        if (q1Var.N0) {
            imageReceiver.P();
        }
    }

    public final void a(String str, TLObject tLObject, CharSequence charSequence, TextPaint textPaint, CharSequence charSequence2, int i10) {
        boolean z10;
        int min;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int L = i10 - org.telegram.messenger.i0.L(22.0f);
        this.f22284j = org.telegram.messenger.i0.L(16.0f);
        StaticLayout R2 = q1.R2(str, q1.f22483fd, L);
        this.f22281f = R2;
        if (R2 != null) {
            int L2 = org.telegram.messenger.i0.L(4.0f) + q1.I1(R2);
            L -= L2;
            this.f22284j = org.telegram.messenger.m5.C(6.0f, L2, this.f22284j);
        }
        int i14 = 0;
        if (tLObject != null && (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null || chatPhoto.photo_small == null) : !((userProfilePhoto = ((TLRPC.User) tLObject).photo) == null || userProfilePhoto.photo_small == null))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22283i = z10;
        StaticLayout staticLayout = null;
        ImageReceiver imageReceiver = this.f22279b;
        if (z10) {
            org.telegram.ui.Components.r8 r8Var = this.f22280c;
            r8Var.p(tLObject);
            imageReceiver.i0(tLObject, r8Var, null);
            L -= org.telegram.messenger.i0.L(21.0f);
            int i15 = this.f22284j;
            if (this.f22281f == null) {
                i13 = org.telegram.messenger.i0.L(6.0f);
            } else {
                i13 = 0;
            }
            this.f22284j = org.telegram.messenger.m5.C(21.0f, i13, i15);
        } else {
            imageReceiver.f();
        }
        SpannableStringBuilder H3 = q1.H3(charSequence2);
        int i16 = i10 / 2;
        if (H3 == null) {
            min = 0;
        } else {
            min = Math.min(i16, (int) Math.ceil(q1.f22484gd.measureText(H3, 0, H3.length())));
        }
        if (H3 != null) {
            i11 = org.telegram.messenger.i0.L(4.0f) + min;
        } else {
            i11 = 0;
        }
        StaticLayout R22 = q1.R2(charSequence, textPaint, L - i11);
        this.f22282g = R22;
        if (R22 != null) {
            int L3 = org.telegram.messenger.i0.L(4.0f) + q1.I1(R22);
            L -= L3;
            int i17 = this.f22284j;
            if (this.f22281f == null && !this.f22283i) {
                i12 = org.telegram.messenger.i0.L(6.0f);
            } else {
                i12 = 0;
            }
            this.f22284j = i12 + L3 + i17;
        }
        if (L > org.telegram.messenger.i0.L(24.0f)) {
            staticLayout = q1.R2(H3, q1.f22484gd, Math.min(i16, L));
        }
        this.h = staticLayout;
        if (staticLayout != null) {
            int i18 = this.f22284j;
            if (this.f22281f == null && !this.f22283i && this.f22282g == null) {
                i14 = org.telegram.messenger.i0.L(6.0f);
            }
            this.f22284j = q1.I1(this.h) + i14 + i18;
        } else if (this.f22282g == null && this.f22281f == null) {
        } else {
            this.f22284j -= org.telegram.messenger.i0.L(4.0f);
        }
    }
}
