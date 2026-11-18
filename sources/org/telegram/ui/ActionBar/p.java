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
import c8.dd;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.f7;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.jc;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.of;
import org.telegram.ui.hn0;
import org.telegram.ui.vp0;
import org.webrtc.GlGenericDrawer;
public final class p implements r0.m, f1, r1, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.e1, jc, d5.a, c0.j, p4.c0, p4.c1, h2.j, p4.a1, g9.k, ri.m, sg.y, te.b, t0.e, sg.j1, OnSuccessListener {
    public final int f29843a;
    public final Object f29844b;

    public p(Object obj, int i7) {
        this.f29843a = i7;
        this.f29844b = obj;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f29843a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f29843a) {
            case 23:
                sh.c.a((sh.c) this.f29844b);
                return;
            default:
                ((Switch) this.f29844b).invalidate();
                return;
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        int i7 = this.f29843a;
        int i10 = 0;
        Object obj = this.f29844b;
        switch (i7) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f28674w1;
                i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(l1Var, true);
                actionBarLayout.f28723u1 = I0;
                actionBarLayout.f28725v1 = I02;
                actionBarLayout.f28721t1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i10 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), l1Var);
                    i10++;
                }
                return r0.l1.f56257b;
            case 4:
                n3 n3Var = (n3) obj;
                n3Var.f29288s = l1Var.f56258a.f(2).d;
                n3Var.invalidate();
                return r0.l1.f56257b;
            default:
                p3 p3Var = (p3) obj;
                p3Var.f29864e = l1Var;
                i0.b I03 = org.telegram.messenger.g0.I0(l1Var, false);
                i0.b I04 = org.telegram.messenger.g0.I0(l1Var, true);
                if (!p3Var.f29865f.equals(I03) || !p3Var.h.equals(I04)) {
                    org.telegram.messenger.g0.f24112m = I03.f15890b;
                    org.telegram.messenger.g0.f24113n = I03.d;
                    p3Var.f29865f = I03;
                    p3Var.h = I04;
                    p3Var.requestLayout();
                }
                int childCount2 = p3Var.getChildCount();
                while (i10 < childCount2) {
                    View childAt = p3Var.getChildAt(i10);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, l1Var);
                    }
                    i10++;
                }
                p3Var.invalidate();
                return r0.l1.f56257b;
        }
    }

    @Override
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.f29844b).getFile());
        return createFromFile;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f29843a) {
            case 14:
                ((p4.i1) obj).e((e2.w0) this.f29844b);
                return;
            default:
                ((q2.j) obj).a((nb.a) this.f29844b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f29843a) {
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) ((ji.j) this.f29844b).f17946c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return bg.o0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = ((b3.j) this.f29844b).f2902b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return bg.o0.e(bitmap2);
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (e2.y0) this.f29844b);
    }

    @Override
    public void c(p4.i1 i1Var, p4.v vVar) {
        ((h2.j) this.f29844b).accept(i1Var);
    }

    @Override
    public boolean d(of ofVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f29844b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ofVar.f38076b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) ofVar.f38076b).g();
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
        t0.h hVar = (t0.h) ofVar.f38076b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.h(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f56229b = clipData;
            eVar.f56230c = 2;
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
    public Object e(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.f29844b;
        d0Var.f55190o.post(new org.telegram.ui.Wallet.c5(28, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void h(u1 u1Var, int i7) {
        switch (this.f29843a) {
            case 2:
                u1 u1Var2 = (u1) this.f29844b;
                DialogInterface.OnCancelListener onCancelListener = u1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(u1Var2);
                }
                u1Var2.dismiss();
                return;
            case 10:
                ((org.telegram.ui.web.x) this.f29844b).run();
                return;
            case 27:
                ((hn0) this.f29844b).run();
                return;
            default:
                ((tg.a0) this.f29844b).f57725a.P1.r();
                return;
        }
    }

    @Override
    public void i(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        String uri2;
        org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.f29844b;
        org.telegram.ui.web.v0 v0Var = s0Var.R;
        if (webView == s0Var && v0Var != null) {
            if (webView == v0Var.f53294a && xaVar.f713b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = org.telegram.ui.web.v0.k(uri2);
                if (v0Var.f53321u0 && (TextUtils.isEmpty(v0Var.H0) || !TextUtils.equals(v0Var.H0, k10) || !TextUtils.equals(v0Var.H0, v0Var.getOriginHost()))) {
                    v0Var.g("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                f7 f10 = v0Var.f();
                try {
                    xaVar.f(0);
                    String str = (String) xaVar.f714c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.x(v0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
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
    public void j(KeyEvent keyEvent) {
        h1 h1Var;
        r0 r0Var = (r0) this.f29844b;
        r0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = r0Var.d) != null && h1Var.isShowing()) {
            r0Var.d.d(true);
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.f29843a;
        Object obj = this.f29844b;
        switch (i10) {
            case 13:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.a1 a1Var = (p4.a1) obj;
                m9.w wVar = m9.w.f20957b;
                if (!d0Var.j()) {
                    a1Var.c(d0Var.f55195t, vVar);
                    p4.e1.r1(d0Var, vVar, i7, new p4.o1(0));
                }
                return m9.w.f20957b;
        }
    }

    @Override
    public void l(int i7) {
        boolean z10;
        int i10;
        ri.a aVar = (ri.a) this.f29844b;
        ri.q qVar = aVar.f56614a;
        ri.d dVar = aVar.f56619g;
        if (Build.VERSION.SDK_INT >= 31 && dVar != null) {
            ArrayList arrayList = dVar.f56650a;
            if (aVar.f56623l || ri.q.f().f56717a) {
                if (dd.a(i7, 4) || dd.a(i7, 2)) {
                    ti.a e10 = qVar.e();
                    ViewGroup viewGroup = aVar.f56625n;
                    if (viewGroup != null) {
                        e10.b(viewGroup.getY(), aVar.f56624m.getWidth(), aVar.f56625n.getY() + aVar.f56625n.getHeight());
                    }
                    dVar.f56651b = e10.f58230b;
                    while (dVar.f56651b > arrayList.size()) {
                        arrayList.add(new ri.b(arrayList.size()));
                    }
                    for (int i11 = 0; i11 < dVar.f56651b; i11++) {
                        ri.b bVar = (ri.b) arrayList.get(i11);
                        bVar.f56627a.set(e10.c(i11));
                        bVar.b(dVar.f56660m, dVar.f56661n, dVar.f56662o);
                        bVar.c(dVar.f56658k);
                        int i12 = dVar.f56663p;
                        int i13 = dVar.f56664q;
                        int i14 = dVar.f56665r;
                        int i15 = dVar.f56666s;
                        bVar.f56645u = i12;
                        bVar.v = i13;
                        bVar.f56646w = i14;
                        bVar.f56647x = i15;
                    }
                }
                dVar.f56652c = aVar.f56626o;
                dVar.d = aVar.f56624m;
                int i16 = 1;
                if (qVar.f56701j > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f56659l != z11) {
                    dVar.f56659l = z11;
                    if (!z10) {
                        i10 = 5;
                    } else {
                        i10 = 1;
                    }
                    dVar.f56660m = i10;
                    if (!z10) {
                        i16 = 10;
                    }
                    dVar.f56661n = i16;
                    dVar.f56662o = Math.max(i10, i16);
                    for (int i17 = 0; i17 < dVar.f56651b; i17++) {
                        ((ri.b) arrayList.get(i17)).b(dVar.f56660m, dVar.f56661n, dVar.f56662o);
                    }
                    dVar.f();
                }
                int i18 = qVar.f56702k;
                int i19 = qVar.f56703l;
                dVar.f56667t = i18;
                dVar.f56668u = i19;
                dVar.f();
                dVar.e();
                Runnable runnable = aVar.f56621j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f29844b;
        if (z10 && !z11) {
            h1Var.a();
        }
    }

    @Override
    public void onSuccess(Object obj) {
        tg.n1 n1Var = (tg.n1) this.f29844b;
        zb.b bVar = (zb.b) obj;
        n1Var.D0 = true;
        n1Var.C0 = false;
    }

    @Override
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f29844b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.hn0(25, yVar, bitmap));
        }
    }

    @Override
    public void u() {
        float f10;
        vp0 vp0Var = (vp0) this.f29844b;
        TextView textView = vp0Var.f57858i1;
        boolean a10 = vp0Var.f57867p0.a();
        ImageView imageView = vp0Var.f57856g1;
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

    public p(qe.h hVar, s4.r0 r0Var) {
        this.f29843a = 21;
        this.f29844b = hVar;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    private final void f(float f10, int i7) {
    }

    private final void g(float f10, int i7) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
