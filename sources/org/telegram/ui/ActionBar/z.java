package org.telegram.ui.ActionBar;

import a8.xa;
import android.content.ClipData;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import c8.zc;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.i7;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.kc;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ff;
import org.telegram.ui.en0;
import org.telegram.ui.tp0;
import org.webrtc.GlGenericDrawer;
public final class z implements e1, q1, r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.f1, kc, d5.a, c0.j, p4.c0, p4.a1, h2.j, p4.y0, g9.k, ri.m, sg.y, te.b, t0.e, sg.j1, OnSuccessListener {
    public final int f29897a;
    public final Object f29898b;

    public z(Object obj, int i7) {
        this.f29897a = i7;
        this.f29898b = obj;
    }

    @Override
    public void C() {
        float f10;
        tp0 tp0Var = (tp0) this.f29898b;
        TextView textView = tp0Var.f57286i1;
        boolean a10 = tp0Var.f57295p0.a();
        ImageView imageView = tp0Var.f57284g1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override
    public void E(float f10, int i7) {
        int i10 = this.f29897a;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        switch (this.f29897a) {
            case 22:
                sh.b.a((sh.b) this.f29898b);
                return;
            default:
                ((Switch) this.f29898b).invalidate();
                return;
        }
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f29898b;
        if (z10 && !z11) {
            i1Var.a();
        }
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.f29897a) {
            case 3:
                j3 j3Var = (j3) this.f29898b;
                j3Var.f28743s = k1Var.f55682a.f(2).d;
                j3Var.invalidate();
                return r0.k1.f55681b;
            default:
                l3 l3Var = (l3) this.f29898b;
                l3Var.f29364e = k1Var;
                i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.c I02 = org.telegram.messenger.g0.I0(k1Var, true);
                if (!l3Var.f29365f.equals(I0) || !l3Var.h.equals(I02)) {
                    org.telegram.messenger.g0.f23605m = I0.f15575b;
                    org.telegram.messenger.g0.f23606n = I0.d;
                    l3Var.f29365f = I0;
                    l3Var.h = I02;
                    l3Var.requestLayout();
                }
                int childCount = l3Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = l3Var.getChildAt(i7);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                }
                l3Var.invalidate();
                return r0.k1.f55681b;
        }
    }

    @Override
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.f29898b).getFile());
        return createFromFile;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f29897a) {
            case 13:
                ((p4.g1) obj).e((e2.w0) this.f29898b);
                return;
            default:
                ((q2.k) obj).a((nb.a) this.f29898b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f29897a) {
            case 16:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) ((ji.j) this.f29898b).f17556c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return bg.n0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = ((f5.v) this.f29898b).f11018b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return bg.n0.e(bitmap2);
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (e2.y0) this.f29898b);
    }

    @Override
    public void c(p4.g1 g1Var, p4.v vVar) {
        ((h2.j) this.f29898b).accept(g1Var);
    }

    @Override
    public Object d(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.f29898b;
        d0Var.f54630o.post(new org.telegram.ui.web.e1(6, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void e(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        String uri2;
        org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.f29898b;
        org.telegram.ui.web.v0 v0Var = s0Var.R;
        if (webView == s0Var && v0Var != null) {
            if (webView == v0Var.f52814a && xaVar.f713b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = org.telegram.ui.web.v0.k(uri2);
                if (v0Var.f52841u0 && (TextUtils.isEmpty(v0Var.H0) || !TextUtils.equals(v0Var.H0, k10) || !TextUtils.equals(v0Var.H0, v0Var.getOriginHost()))) {
                    v0Var.g("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                i7 f10 = v0Var.f();
                try {
                    xaVar.e(0);
                    String str = (String) xaVar.f714c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            org.telegram.messenger.g0.h3(new org.telegram.ui.web.x(v0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        v0Var.g("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    v0Var.g("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e10) {
                    a8.g(e10, true);
                    return;
                }
            }
            v0Var.g("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f29897a) {
            case 1:
                t1 t1Var2 = (t1) this.f29898b;
                DialogInterface.OnCancelListener onCancelListener = t1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(t1Var2);
                }
                t1Var2.dismiss();
                return;
            case 9:
                ((org.telegram.ui.web.x) this.f29898b).run();
                return;
            case 26:
                ((en0) this.f29898b).run();
                return;
            default:
                ((tg.a0) this.f29898b).f57153a.P1.r();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        g1 g1Var;
        q0 q0Var = (q0) this.f29898b;
        q0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
            q0Var.d.d(true);
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.f29897a;
        Object obj = this.f29898b;
        switch (i10) {
            case 12:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.y0 y0Var = (p4.y0) obj;
                m9.w wVar = m9.w.f20596b;
                if (!d0Var.j()) {
                    y0Var.c(d0Var.f54635t, vVar);
                    p4.c1.r1(d0Var, vVar, i7, new p4.m1(0));
                }
                return m9.w.f20596b;
        }
    }

    @Override
    public void l(int i7) {
        boolean z10;
        int i10;
        ri.a aVar = (ri.a) this.f29898b;
        ri.q qVar = aVar.f56040a;
        ri.d dVar = aVar.f56045g;
        if (Build.VERSION.SDK_INT >= 31 && dVar != null) {
            ArrayList arrayList = dVar.f56076a;
            if (aVar.f56049l || ri.q.f().f56143a) {
                if (zc.a(i7, 4) || zc.a(i7, 2)) {
                    ti.a e10 = qVar.e();
                    ViewGroup viewGroup = aVar.f56051n;
                    if (viewGroup != null) {
                        e10.b(viewGroup.getY(), aVar.f56050m.getWidth(), aVar.f56051n.getY() + aVar.f56051n.getHeight());
                    }
                    dVar.f56077b = e10.f57662b;
                    while (dVar.f56077b > arrayList.size()) {
                        arrayList.add(new ri.b(arrayList.size()));
                    }
                    for (int i11 = 0; i11 < dVar.f56077b; i11++) {
                        ri.b bVar = (ri.b) arrayList.get(i11);
                        bVar.f56053a.set(e10.c(i11));
                        bVar.b(dVar.f56086m, dVar.f56087n, dVar.f56088o);
                        bVar.c(dVar.f56084k);
                        int i12 = dVar.f56089p;
                        int i13 = dVar.f56090q;
                        int i14 = dVar.f56091r;
                        int i15 = dVar.f56092s;
                        bVar.f56071u = i12;
                        bVar.v = i13;
                        bVar.f56072w = i14;
                        bVar.f56073x = i15;
                    }
                }
                dVar.f56078c = aVar.f56052o;
                dVar.d = aVar.f56050m;
                int i16 = 1;
                if (qVar.f56127j > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f56085l != z11) {
                    dVar.f56085l = z11;
                    if (!z10) {
                        i10 = 5;
                    } else {
                        i10 = 1;
                    }
                    dVar.f56086m = i10;
                    if (!z10) {
                        i16 = 10;
                    }
                    dVar.f56087n = i16;
                    dVar.f56088o = Math.max(i10, i16);
                    for (int i17 = 0; i17 < dVar.f56077b; i17++) {
                        ((ri.b) arrayList.get(i17)).b(dVar.f56086m, dVar.f56087n, dVar.f56088o);
                    }
                    dVar.f();
                }
                int i18 = qVar.f56128k;
                int i19 = qVar.f56129l;
                dVar.f56093t = i18;
                dVar.f56094u = i19;
                dVar.f();
                dVar.e();
                Runnable runnable = aVar.f56047j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public boolean o(ff ffVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f29898b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ffVar.f34590b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) ffVar.f34590b).h();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) ffVar.f34590b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f55655b = clipData;
            eVar.f55656c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f29897a) {
            case 28:
                tg.n1 n1Var = (tg.n1) this.f29898b;
                zb.b bVar = (zb.b) obj;
                n1Var.D0 = true;
                n1Var.C0 = false;
                return;
            default:
                bi.w2 w2Var = (bi.w2) this.f29898b;
                zb.b bVar2 = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < bVar2.f61236a.size(); i7++) {
                    zb.a aVar = (zb.a) bVar2.f61236a.get(i7);
                    ?? obj2 = new Object();
                    obj2.f57209a = aVar.f61232a;
                    obj2.f57210b = aVar.d;
                    obj2.f57211c = aVar.f61235e;
                    obj2.d = aVar.f61233b;
                    obj2.f57212e = aVar.f61234c;
                    arrayList.add(obj2);
                }
                w2Var.a(arrayList);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.f29898b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(0, zVar, bitmap));
        }
    }

    public z(qe.h hVar, s4.r0 r0Var) {
        this.f29897a = 20;
        this.f29898b = hVar;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    private final void f(float f10, int i7) {
    }

    private final void g(float f10, int i7) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
