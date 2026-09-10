package org.telegram.tgnet;

import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
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
import bi.p9;
import bi.u6;
import com.google.android.gms.tasks.OnSuccessListener;
import di.v4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m.e3;
import og.x1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.m5;
import org.telegram.messenger.x2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ir0;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.b0;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.y0;
import org.telegram.ui.zt0;
import org.webrtc.GlGenericDrawer;
import p4.r0;
import p4.s0;
import pg.n2;
import pg.o2;
import r0.i0;
import sg.c0;
import sg.v0;
public final class j implements Vector.TLDeserializer, GlGenericDrawer.TextureCallback, l1, a5.b, c2, x1, p9, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, le.d, q9.d, r2.v, t5.b, kl0, t0.e, pa.a {
    public final int f17385a;
    public final Object f17386b;

    public j(Object obj, int i10) {
        this.f17385a = i10;
        this.f17386b = obj;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        ph.c.a((ph.c) this.f17386b);
    }

    @Override
    public Object P1(u6 u6Var) {
        return this.f17386b;
    }

    @Override
    public int a(Object obj) {
        b2.s sVar = (b2.s) this.f17386b;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f41183b;
        if ((!str.equals(sVar.f2002r) && !str.equals(r2.w.b(sVar))) || !oVar.c(sVar, false) || !oVar.d(sVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void b(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        String uri2;
        y0 y0Var = (y0) this.f17386b;
        c1 c1Var = y0Var.Q;
        if (webView == y0Var && c1Var != null) {
            if (webView == c1Var.f37876a && aVar.f275b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String l4 = c1.l(uri2);
                if (c1Var.f37901t0 && (TextUtils.isEmpty(c1Var.F0) || !TextUtils.equals(c1Var.F0, l4) || !TextUtils.equals(c1Var.F0, c1Var.getOriginHost()))) {
                    c1Var.h("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                a1 g10 = c1Var.g();
                try {
                    aVar.d(0);
                    String str = (String) aVar.f276c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            AndroidUtilities.runOnUIThread(new b0(c1Var, webView, g10, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        c1Var.h("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    c1Var.h("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            }
            c1Var.h("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        sg.c1.Q((sg.c1) this.f17386b, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f17385a) {
            case 1:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f17386b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f17386b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hj0 lottieAnimation;
        o2 o2Var = (o2) this.f17386b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            o2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        m5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        float f7;
        zt0 zt0Var = (zt0) this.f17386b;
        TextView textView = zt0Var.f40159y1;
        boolean a2 = zt0Var.F0.a();
        ImageView imageView = zt0Var.f40157w1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f17385a) {
            case 6:
                ((b0) this.f17386b).run();
                return;
            case 9:
                ((ir0) this.f17386b).run();
                return;
            case 10:
                ((pg.b0) this.f17386b).f39953a.f40133f2.r();
                return;
            case 23:
                ((v0) this.f17386b).run();
                return;
            case 24:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f17386b;
                p2 R = LaunchActivity.R();
                if (R != null) {
                    c0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 25:
                ((x2) this.f17386b).run();
                return;
            default:
                ((v0) this.f17386b).run();
                return;
        }
    }

    @Override
    public Object g() {
        SQLiteDatabase a2;
        int i10 = this.f17385a;
        Object obj = this.f17386b;
        switch (i10) {
            case 19:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
                sVar.f6119c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.f6118b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new f21(gVar, hashMap, sVar, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 20:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long u10 = gVar2.f41790b.u() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(u10)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 21:
                s5.g gVar3 = (s5.g) ((s5.c) ((da.b) obj).f6357i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f41790b.u()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar2.f6119c)).c(new s0.b(19))) {
                    ((e3) sVar2.d).U(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f17386b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f42070a.d();
                Parcelable parcelable = (Parcelable) iVar.f42070a.i();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        t0.h hVar = iVar.f42070a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.c()));
        if (i11 >= 31) {
            dVar = new j2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f41044b = clipData;
            eVar.f41045c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.f());
        dVar.setExtras(bundle);
        if (i0.i(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f17386b, options);
    }

    @Override
    public void j(pa.b bVar) {
        t9.a aVar = (t9.a) this.f17386b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f42119b.set((t9.a) bVar.get());
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        m5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f17385a;
        Object obj2 = this.f17386b;
        switch (i10) {
            case 12:
                pg.x1 x1Var = (pg.x1) obj2;
                ac.b bVar = (ac.b) obj;
                x1Var.C0 = true;
                x1Var.B0 = false;
                return;
            case 13:
                v4 v4Var = (v4) obj2;
                ac.b bVar2 = (ac.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f377a.size(); i11++) {
                    ac.a aVar = (ac.a) bVar2.f377a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f40161a = aVar.f374a;
                    obj3.f40162b = aVar.d;
                    obj3.f40163c = aVar.e;
                    obj3.d = aVar.f375b;
                    obj3.e = aVar.f376c;
                    arrayList.add(obj3);
                }
                v4Var.run(arrayList);
                return;
            default:
                n2 n2Var = (n2) obj2;
                List list = (List) obj;
                n2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((xb.a) list.get(0)).f45080c;
                String str = null;
                if (w7.i0.f43674a == null) {
                    w7.i0.f43674a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = w7.i0.f43674a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                n2Var.f40180c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((xb.a) list.get(0)).f45080c);
                sb2.append(" ");
                sb2.append(n2Var.f40180c0);
                sb2.append(" ");
                hc.b.v(((xb.a) list.get(0)).f45078a, sb2);
                Emoji.getEmojiDrawable(n2Var.f40180c0);
                return;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f17386b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new yo0(24, tVar, bitmap));
        }
    }

    public j(s0 s0Var, r0 r0Var) {
        this.f17385a = 7;
        this.f17386b = s0Var;
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
