package org.telegram.tgnet;

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
import bg.o0;
import c8.dd;
import e2.w0;
import e2.y0;
import fi.f7;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.hn0;
import org.telegram.ui.vp0;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.x;
import org.webrtc.GlGenericDrawer;
import p4.a1;
import p4.c1;
import p4.d0;
import p4.e0;
import p4.i1;
import p4.o1;
import p4.z;
import r0.i0;
import r0.l1;
import s4.r0;
import sg.j1;
import sg.y;
import tg.b0;
public final class u implements Vector.TLDeserializer, r0.m, e1, q1, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.e1, jc, d5.a, c0.j, d0, c1, h2.j, a1, g9.k, ri.m, y, te.b, t0.e, j1 {
    public final int f28698a;
    public final Object f28699b;

    public u(Object obj, int i7) {
        this.f28698a = i7;
        this.f28699b = obj;
    }

    @Override
    public void D(float f10, int i7) {
        int i10 = this.f28698a;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        switch (this.f28698a) {
            case 24:
                sh.b.a((sh.b) this.f28699b);
                return;
            default:
                ((Switch) this.f28699b).invalidate();
                return;
        }
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        int i7 = this.f28698a;
        int i10 = 0;
        Object obj = this.f28699b;
        switch (i7) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f28704w1;
                i0.b I0 = g0.I0(l1Var, false);
                i0.b I02 = g0.I0(l1Var, true);
                actionBarLayout.f28753u1 = I0;
                actionBarLayout.f28755v1 = I02;
                actionBarLayout.f28751t1 = l1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i10 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i10), l1Var);
                    i10++;
                }
                return l1.f56298b;
            case 5:
                m3 m3Var = (m3) obj;
                m3Var.f29272s = l1Var.f56299a.f(2).d;
                m3Var.invalidate();
                return l1.f56298b;
            default:
                o3 o3Var = (o3) obj;
                o3Var.f29847e = l1Var;
                i0.b I03 = g0.I0(l1Var, false);
                i0.b I04 = g0.I0(l1Var, true);
                if (!o3Var.f29848f.equals(I03) || !o3Var.h.equals(I04)) {
                    g0.f24140m = I03.f15915b;
                    g0.f24141n = I03.d;
                    o3Var.f29848f = I03;
                    o3Var.h = I04;
                    o3Var.requestLayout();
                }
                int childCount2 = o3Var.getChildCount();
                while (i10 < childCount2) {
                    View childAt = o3Var.getChildAt(i10);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        i0.b(childAt, l1Var);
                    }
                    i10++;
                }
                o3Var.invalidate();
                return l1.f56298b;
        }
    }

    @Override
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.f28699b).getFile());
        return createFromFile;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f28698a) {
            case 15:
                ((i1) obj).e((w0) this.f28699b);
                return;
            default:
                ((q2.j) obj).a((nb.a) this.f28699b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f28698a) {
            case 18:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) ((ji.l) this.f28699b).f17977c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return o0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i7 = ((b3.j) this.f28699b).f2914b;
                if (width2 > i7 || bitmap2.getHeight() > i7) {
                    float f10 = i7;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f10 / width3, f10 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return o0.e(bitmap2);
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        uVar.e(i7, (y0) this.f28699b);
    }

    @Override
    public void c(i1 i1Var, p4.v vVar) {
        ((h2.j) this.f28699b).accept(i1Var);
    }

    @Override
    public boolean d(qf qfVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f28699b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qfVar.f38902b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) qfVar.f38902b).g();
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
        t0.h hVar = (t0.h) qfVar.f38902b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.h(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f56270b = clipData;
            eVar.f56271c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (i0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        lambda$readParams$0 = ((TLRPC.TL_stickerSet_layer143) this.f28699b).lambda$readParams$0(inputSerializedData, i7, z10);
        return lambda$readParams$0;
    }

    @Override
    public Object e(c0.i iVar) {
        e0 e0Var = (e0) this.f28699b;
        e0Var.f55240o.post(new z(0, e0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f28698a) {
            case 3:
                t1 t1Var2 = (t1) this.f28699b;
                DialogInterface.OnCancelListener onCancelListener = t1Var2.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(t1Var2);
                }
                t1Var2.dismiss();
                return;
            case 11:
                ((x) this.f28699b).run();
                return;
            case 28:
                ((hn0) this.f28699b).run();
                return;
            default:
                ((b0) this.f28699b).f57779a.P1.r();
                return;
        }
    }

    @Override
    public void i(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        String uri2;
        s0 s0Var = (s0) this.f28699b;
        v0 v0Var = s0Var.R;
        if (webView == s0Var && v0Var != null) {
            if (webView == v0Var.f53337a && xaVar.f713b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = v0.k(uri2);
                if (v0Var.f53364u0 && (TextUtils.isEmpty(v0Var.H0) || !TextUtils.equals(v0Var.H0, k10) || !TextUtils.equals(v0Var.H0, v0Var.getOriginHost()))) {
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
                            g0.g3(new x(v0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
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
        g1 g1Var;
        q0 q0Var = (q0) this.f28699b;
        q0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
            q0Var.d.d(true);
        }
    }

    @Override
    public Object k(e0 e0Var, p4.v vVar, int i7) {
        int i10 = this.f28698a;
        Object obj = this.f28699b;
        switch (i10) {
            case 14:
                return e0Var.l(vVar, (h9.i0) obj);
            default:
                a1 a1Var = (a1) obj;
                m9.w wVar = m9.w.f20985b;
                if (!e0Var.j()) {
                    a1Var.c(e0Var.f55245t, vVar);
                    p4.e1.r1(e0Var, vVar, i7, new o1(0));
                }
                return m9.w.f20985b;
        }
    }

    @Override
    public void l(int i7) {
        boolean z10;
        int i10;
        ri.a aVar = (ri.a) this.f28699b;
        ri.q qVar = aVar.f56655a;
        ri.d dVar = aVar.f56660g;
        if (Build.VERSION.SDK_INT >= 31 && dVar != null) {
            ArrayList arrayList = dVar.f56691a;
            if (aVar.f56664l || ri.q.f().f56758a) {
                if (dd.a(i7, 4) || dd.a(i7, 2)) {
                    ti.a e10 = qVar.e();
                    ViewGroup viewGroup = aVar.f56666n;
                    if (viewGroup != null) {
                        e10.b(viewGroup.getY(), aVar.f56665m.getWidth(), aVar.f56666n.getY() + aVar.f56666n.getHeight());
                    }
                    dVar.f56692b = e10.f58271b;
                    while (dVar.f56692b > arrayList.size()) {
                        arrayList.add(new ri.b(arrayList.size()));
                    }
                    for (int i11 = 0; i11 < dVar.f56692b; i11++) {
                        ri.b bVar = (ri.b) arrayList.get(i11);
                        bVar.f56668a.set(e10.c(i11));
                        bVar.b(dVar.f56701m, dVar.f56702n, dVar.f56703o);
                        bVar.c(dVar.f56699k);
                        int i12 = dVar.f56704p;
                        int i13 = dVar.f56705q;
                        int i14 = dVar.f56706r;
                        int i15 = dVar.f56707s;
                        bVar.f56686u = i12;
                        bVar.v = i13;
                        bVar.f56687w = i14;
                        bVar.f56688x = i15;
                    }
                }
                dVar.f56693c = aVar.f56667o;
                dVar.d = aVar.f56665m;
                int i16 = 1;
                if (qVar.f56742j > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f56700l != z11) {
                    dVar.f56700l = z11;
                    if (!z10) {
                        i10 = 5;
                    } else {
                        i10 = 1;
                    }
                    dVar.f56701m = i10;
                    if (!z10) {
                        i16 = 10;
                    }
                    dVar.f56702n = i16;
                    dVar.f56703o = Math.max(i10, i16);
                    for (int i17 = 0; i17 < dVar.f56692b; i17++) {
                        ((ri.b) arrayList.get(i17)).b(dVar.f56701m, dVar.f56702n, dVar.f56703o);
                    }
                    dVar.f();
                }
                int i18 = qVar.f56743k;
                int i19 = qVar.f56744l;
                dVar.f56708t = i18;
                dVar.f56709u = i19;
                dVar.f();
                dVar.e();
                Runnable runnable = aVar.f56662j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        h1 h1Var = (h1) this.f28699b;
        if (z10 && !z11) {
            h1Var.a();
        }
    }

    @Override
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f28699b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            g0.g3(new fm0(27, yVar, bitmap));
        }
    }

    @Override
    public void u() {
        float f10;
        vp0 vp0Var = (vp0) this.f28699b;
        TextView textView = vp0Var.f57912i1;
        boolean a10 = vp0Var.f57921p0.a();
        ImageView imageView = vp0Var.f57910g1;
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

    public u(qe.h hVar, r0 r0Var) {
        this.f28698a = 22;
        this.f28699b = hVar;
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
