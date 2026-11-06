package org.telegram.ui.ActionBar;

import a8.wa;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import c8.dc;
import com.google.android.gms.tasks.OnSuccessListener;
import di.o7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.cn0;
import org.telegram.ui.tp0;
import org.webrtc.GlGenericDrawer;
public final class m3 implements r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.b1, lc, d5.a, r1, c0.j, p4.c0, p4.a1, h2.j, p4.y0, g9.k, sg.z, te.b, t0.e, sg.l1, OnSuccessListener, w5.b {
    public final int f28300a;
    public final Object f28301b;

    public m3(Object obj, int i7) {
        this.f28300a = i7;
        this.f28301b = obj;
    }

    @Override
    public void F(float f10, int i7) {
        int i10 = this.f28300a;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        int i7 = this.f28300a;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        n3 n3Var = (n3) this.f28301b;
        n3Var.f28318e = k1Var;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
        if (!n3Var.f28319f.equals(I0) || !n3Var.h.equals(I02)) {
            org.telegram.messenger.g0.f22531m = I0.f15118b;
            org.telegram.messenger.g0.f22532n = I0.d;
            n3Var.f28319f = I0;
            n3Var.h = I02;
            n3Var.requestLayout();
        }
        int childCount = n3Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = n3Var.getChildAt(i7);
            if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                r0.i0.b(childAt, k1Var);
            }
        }
        n3Var.invalidate();
        return r0.k1.f54083b;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        switch (this.f28300a) {
            case 17:
                sh.b.a((sh.b) this.f28301b);
                return;
            default:
                ((Switch) this.f28301b).invalidate();
                return;
        }
    }

    @Override
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.f28301b).getFile());
        return createFromFile;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f28300a) {
            case 9:
                ((p4.g1) obj).e((e2.w0) this.f28301b);
                return;
            default:
                ((q2.j) obj).a((qb.a) this.f28301b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f28300a) {
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                l9.a aVar = (l9.a) ((j2.n) this.f28301b).f16454c;
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
                int i7 = ((f5.u) this.f28301b).f11190b;
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
        uVar.e(i7, (e2.y0) this.f28301b);
    }

    @Override
    public void c(p4.g1 g1Var, p4.v vVar) {
        ((h2.j) this.f28301b).accept(g1Var);
    }

    @Override
    public Object d(c0.i iVar) {
        p4.d0 d0Var = (p4.d0) this.f28301b;
        d0Var.f53095o.post(new org.telegram.ui.web.w(15, d0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void f() {
        float f10;
        tp0 tp0Var = (tp0) this.f28301b;
        TextView textView = tp0Var.f55556h1;
        boolean a10 = tp0Var.f55565o0.a();
        ImageView imageView = tp0Var.f55554f1;
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
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        switch (this.f28300a) {
            case 3:
                org.telegram.ui.Components.voip.e1 e1Var = (org.telegram.ui.Components.voip.e1) this.f28301b;
                if (z9 && !z10) {
                    e1Var.a();
                    return;
                }
                return;
            default:
                tg.d2 d2Var = (tg.d2) this.f28301b;
                if (z9 && !z10 && (B = imageReceiver.B()) != null) {
                    d2Var.q(B);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f28300a) {
            case 5:
                ((org.telegram.ui.web.x) this.f28301b).run();
                return;
            case 21:
                ((cn0) this.f28301b).run();
                return;
            default:
                ((tg.a0) this.f28301b).f55438a.O1.r();
                return;
        }
    }

    @Override
    public Object h() {
        SQLiteDatabase a10;
        int i7 = this.f28300a;
        Object obj = this.f28301b;
        switch (i7) {
            case 27:
                v5.g gVar = (v5.g) ((v5.c) obj);
                gVar.getClass();
                int i10 = r5.a.f54285e;
                ab.b0 b0Var = new ab.b0(13, false);
                b0Var.f908c = null;
                b0Var.d = new ArrayList();
                b0Var.f909e = null;
                b0Var.f907b = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    r5.a aVar = (r5.a) v5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new hr(gVar, hashMap, b0Var, 15));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 28:
                v5.g gVar2 = (v5.g) ((v5.d) obj);
                long s5 = gVar2.f57114b.s() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(s5)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i11 = rawQuery.getInt(0);
                        gVar2.e(i11, r5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                v5.g gVar3 = (v5.g) ((v5.c) ((ia.c) obj).f15421i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f57114b.s()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        int i10 = this.f28300a;
        Object obj = this.f28301b;
        switch (i10) {
            case 8:
                return d0Var.l(vVar, (h9.i0) obj);
            default:
                p4.y0 y0Var = (p4.y0) obj;
                m9.w wVar = m9.w.f19996b;
                if (!d0Var.j()) {
                    y0Var.c(d0Var.f53100t, vVar);
                    p4.c1.R0(d0Var, vVar, i7, new p4.m1(0));
                }
                return m9.w.f19996b;
        }
    }

    @Override
    public boolean k(qt qtVar, int i7, Bundle bundle) {
        r0.d dVar;
        m.t tVar = (m.t) this.f28301b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qtVar.f37504b).e();
                Parcelable parcelable = (Parcelable) ((t0.h) qtVar.f37504b).h();
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
        t0.h hVar = (t0.h) qtVar.f37504b;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i10 >= 31) {
            dVar = new m2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f54057b = clipData;
            eVar.f54058c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (r0.i0.h(tVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void l(WebView webView, wa waVar, Uri uri, boolean z9, e5.f fVar) {
        String uri2;
        org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.f28301b;
        org.telegram.ui.web.x0 x0Var = u0Var.Q;
        if (webView == u0Var && x0Var != null) {
            if (webView == x0Var.f51348a && waVar.f700b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = org.telegram.ui.web.x0.k(uri2);
                if (x0Var.f51374t0 && (TextUtils.isEmpty(x0Var.G0) || !TextUtils.equals(x0Var.G0, k10) || !TextUtils.equals(x0Var.G0, x0Var.getOriginHost()))) {
                    x0Var.g("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                o7 f10 = x0Var.f();
                try {
                    waVar.f(0);
                    String str = (String) waVar.f701c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            org.telegram.messenger.g0.h3(new org.telegram.ui.web.x(x0Var, webView, f10, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        x0Var.g("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    x0Var.g("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e10) {
                    a8.g(e10, true);
                    return;
                }
            }
            x0Var.g("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i7 = this.f28300a;
        Object obj2 = this.f28301b;
        switch (i7) {
            case 23:
                tg.n1 n1Var = (tg.n1) obj2;
                zb.b bVar = (zb.b) obj;
                n1Var.C0 = true;
                n1Var.B0 = false;
                return;
            case 24:
                hi.d4 d4Var = (hi.d4) obj2;
                zb.b bVar2 = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f59904a.size(); i10++) {
                    zb.a aVar = (zb.a) bVar2.f59904a.get(i10);
                    ?? obj3 = new Object();
                    obj3.f55463a = aVar.f59900a;
                    obj3.f55464b = aVar.d;
                    obj3.f55465c = aVar.f59903e;
                    obj3.d = aVar.f59901b;
                    obj3.f55466e = aVar.f59902c;
                    arrayList.add(obj3);
                }
                d4Var.a(arrayList);
                return;
            default:
                tg.c2 c2Var = (tg.c2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    return;
                }
                int i11 = ((wb.a) list.get(0)).f57523c;
                String str = null;
                if (dc.f5434a == null) {
                    dc.f5434a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = dc.f5434a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                c2Var.f55477c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((wb.a) list.get(0)).f57523c);
                sb2.append(" ");
                sb2.append(c2Var.f55477c0);
                sb2.append(" ");
                org.telegram.ui.Cells.f1.u(((wb.a) list.get(0)).f57521a, sb2);
                org.telegram.messenger.i6.g(c2Var.f55477c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i7) {
        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f28301b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            org.telegram.messenger.g0.h3(new g51(5, yVar, bitmap));
        }
    }

    @Override
    public void t0(int i7, Drawable drawable) {
        int i10 = this.f28300a;
    }

    public m3(qe.h hVar, s4.r0 r0Var) {
        this.f28300a = 15;
        this.f28301b = hVar;
    }

    private final void m(ImageReceiver imageReceiver) {
    }

    private final void n(ImageReceiver imageReceiver) {
    }

    private final void e(int i7, Drawable drawable) {
    }

    private final void j(int i7, Drawable drawable) {
    }

    private final void o(float f10, int i7) {
    }

    private final void p(float f10, int i7) {
    }
}
