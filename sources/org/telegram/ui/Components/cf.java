package org.telegram.ui.Components;

import android.content.Intent;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
public class cf implements r4, xj0, yy, org.telegram.ui.nm0, org.telegram.messenger.kc, jg.y1, xr0, u61, org.telegram.ui.s9, te.b, tg.c, tg.l1, com.google.android.gms.common.api.internal.q, v4.j1, l51 {
    public final Object f33545a;

    public cf(Object obj) {
        this.f33545a = obj;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
        rf0 rf0Var = ((uf0) this.f33545a).h.H0;
        if (rf0Var != null) {
            rf0Var.d();
        }
    }

    @Override
    public int B() {
        return ((v4.o0) this.f33545a).G();
    }

    @Override
    public void E(float f10, int i7) {
        ((te.h) this.f33545a).f(f10);
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.f33545a).f(f10);
    }

    @Override
    public void H() {
        ((m60) this.f33545a).k();
    }

    @Override
    public org.telegram.ui.ActionBar.z0 J(String str) {
        org.telegram.ui.ActionBar.z0 h = ((m60) this.f33545a).h();
        h.setText(str);
        return h;
    }

    @Override
    public String J0() {
        return ((org.telegram.ui.web.v0) this.f33545a).f52828j0;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        ((yc) this.f33545a).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
    }

    @Override
    public void M(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f33545a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public int S() {
        v4.o0 o0Var = (v4.o0) this.f33545a;
        return o0Var.f58632n - o0Var.C();
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f33545a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u7.y yVar = (u7.y) ((u7.l) obj).n();
        u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
        Parcel p12 = yVar.p1();
        int i7 = u7.d.f57871a;
        p12.writeInt(1);
        ((j8.c) this.f33545a).writeToParcel(p12, 0);
        u7.d.c(p12, fVar);
        p12.writeString(null);
        yVar.t1(p12, 63);
    }

    @Override
    public boolean b(int i7) {
        if (((ChatAttachAlertPhotoLayout) this.f33545a).H.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer c() {
        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) this.f33545a;
        gfVar.f23748p.q();
        return (ByteBuffer) gfVar.f23748p.f13421f;
    }

    @Override
    public void d(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.f33545a).L && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f31292y.d(q5Var);
        }
    }

    @Override
    public boolean d1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override
    public int e(View view) {
        return v4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public boolean e0(int i7) {
        if (i7 == ((mo0) this.f33545a).f37336r) {
            return true;
        }
        return false;
    }

    @Override
    public void f(ArrayList arrayList) {
        m30.a((m30) this.f33545a, false, arrayList);
    }

    @Override
    public boolean g(int i7) {
        org.telegram.messenger.ff M = ((ChatAttachAlertPhotoLayout) this.f33545a).H.M(i7);
        if (M != null && ChatAttachAlertPhotoLayout.f32367t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public View g0(int i7) {
        return ((v4.o0) this.f33545a).q(i7);
    }

    @Override
    public float get() {
        return ((tg.e2) this.f33545a).G;
    }

    @Override
    public float getBlurAngle() {
        return ((org.telegram.messenger.gf) this.f33545a).f23752t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.gf) this.f33545a).f23751s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.gf) this.f33545a).f23750r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.gf) this.f33545a).f23749q;
    }

    @Override
    public int getBlurType() {
        return ((org.telegram.messenger.gf) this.f33545a).f23746n;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((org.telegram.messenger.gf) this.f33545a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23735a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23737c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23740g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((org.telegram.messenger.gf) this.f33545a).f23745m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((org.telegram.messenger.gf) this.f33545a).f23742j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.gf) this.f33545a).f23739f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((org.telegram.messenger.gf) this.f33545a).f23743k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((org.telegram.messenger.gf) this.f33545a).f23747o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23736b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.gf) this.f33545a).f23741i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((org.telegram.messenger.gf) this.f33545a).f23741i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.gf) this.f33545a).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((org.telegram.messenger.gf) this.f33545a).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23744l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((org.telegram.messenger.gf) this.f33545a).f23738e / 100.0f;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void i(int i7) {
        mo0 mo0Var = (mo0) this.f33545a;
        po0 po0Var = mo0Var.L;
        mo0Var.f37337s = i7;
        if (mo0Var.f37338w != i7) {
            mo0Var.d.clear();
        }
        int i10 = mo0Var.K;
        if (mo0Var.b() == 0 && !mo0Var.f37333e.e() && !mo0Var.J) {
            po0Var.M1.e(false, true);
        } else {
            po0Var.f38365t2.b(i10);
        }
        mo0Var.f();
        int i11 = po0.U2;
        po0Var.K0(true);
    }

    @Override
    public int i0(View view) {
        return v4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void invalidate() {
        ((wi.h) this.f33545a).f59391m.invalidate();
    }

    @Override
    public void j() {
        ((org.telegram.ui.tp0) this.f33545a).r0(null, true);
    }

    @Override
    public boolean k() {
        return !((org.telegram.messenger.gf) this.f33545a).f23748p.F();
    }

    public boolean l(int i7) {
        n61 n61Var = ((w61) this.f33545a).M;
        if (n61Var == null) {
            return false;
        }
        return n61Var.c(i7);
    }

    public s0.c m(int i7) {
        return null;
    }

    public android.view.ViewGroup n(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cf.n(android.content.Context, int):android.view.ViewGroup");
    }

    @Override
    public org.telegram.ui.ActionBar.z0 n0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        m60 m60Var = (m60) this.f33545a;
        int x10 = m60Var.x();
        m60Var.c(i7, str, new di.m6(runnable, z11, m60Var, 25), z10);
        View w10 = m60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) w10;
        }
        return null;
    }

    public String o(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.f33545a;
            pa.e eVar = new pa.e(stringWriter, dVar.f54930a, dVar.f54931b, dVar.f54932c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f54934b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f33545a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.f52827i0 = false;
    }

    public s0.c p(int i7) {
        return null;
    }

    public void q(float f10) {
        w61 w61Var = (w61) this.f33545a;
        View[] viewArr = w61Var.f41300e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                w61Var.E();
                w61Var.h.put(w61Var.f41301f[1], viewArr[1]);
                w61Var.removeView(viewArr[1]);
                w61Var.D(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            w61Var.x(w61Var.f41298b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (w61Var.E) {
            w61Var.D(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            w61Var.D(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            w61Var.D(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            w61Var.D(view3, view3.getMeasuredWidth() * f10);
        }
        w61Var.u(false);
    }

    public boolean r(int i7, int i10, Bundle bundle) {
        return false;
    }

    @Override
    public void r0(float f10) {
        ((tg.e2) this.f33545a).setOutlineWidth(f10);
    }

    @Override
    public void s0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((m30) this.f33545a).f37040a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public tg.j z() {
        return ((org.telegram.ui.tp0) this.f33545a).C0;
    }

    public cf(int i7) {
        switch (i7) {
            case 14:
                this.f33545a = new SparseArray();
                return;
            case 15:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f33545a = new df0(this);
                    return;
                } else {
                    this.f33545a = new df0(this);
                    return;
                }
            default:
                this.f33545a = new ConcurrentHashMap(16);
                return;
        }
    }

    public cf(EditText editText) {
        this.f33545a = new ji.j(editText);
    }

    @Override
    public void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override
    public void l0(ArrayList arrayList) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
