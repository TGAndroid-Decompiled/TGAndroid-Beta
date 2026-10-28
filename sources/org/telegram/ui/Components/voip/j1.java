package org.telegram.ui.Components.voip;

import a8.me;
import a8.xf;
import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.u7;
import hi.p4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.p5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pt0;
import org.telegram.ui.zq0;
public final class j1 implements n1, org.telegram.ui.ActionBar.b2, s9.d, rg.h0, u5.b, rg.s1, u7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, oe.d, t0.e, ra.a, bm0, wh.a {
    public final int f33979a;
    public final Object f33980b;

    public j1(Object obj, int i10) {
        this.f33979a = i10;
        this.f33980b = obj;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        sh.c.a((sh.c) this.f33980b);
    }

    @Override
    public void a() {
        float f7;
        pt0 pt0Var = (pt0) this.f33980b;
        TextView textView = pt0Var.f48372n1;
        boolean a2 = pt0Var.f48384u0.a();
        ImageView imageView = pt0Var.l1;
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
    public Typeface b() {
        return rg.j0.a((Font) this.f33980b);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f33980b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48724a.b();
                Parcelable parcelable = (Parcelable) iVar.f48724a.e();
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
        t0.h hVar = iVar.f48724a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i11 >= 31) {
            dVar = new j2.i(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f47123b = clipData;
            eVar.f47124c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.c());
        dVar.setExtras(bundle);
        if (r0.i0.i(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public Object d1(me meVar) {
        switch (this.f33979a) {
            case 4:
                return new pa.c((Context) meVar.a(Context.class), ((m9.h) meVar.a(m9.h.class)).d(), meVar.x(pa.d.class), meVar.d(za.b.class), (Executor) meVar.n((s9.s) this.f33980b));
            default:
                return this.f33980b;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        sg.p2 p2Var = (sg.p2) this.f33980b;
        if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            p2Var.q(lottieAnimation);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        p5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        vg.z0.Q((vg.z0) this.f33980b, view);
    }

    @Override
    public Object f() {
        SQLiteDatabase a2;
        int i10 = this.f33979a;
        Object obj = this.f33980b;
        switch (i10) {
            case 6:
                t5.g gVar = (t5.g) ((t5.c) obj);
                gVar.getClass();
                int i11 = p5.a.e;
                ti.e eVar = new ti.e(10, false);
                eVar.f49219b = null;
                eVar.f49220c = new ArrayList();
                eVar.d = null;
                eVar.e = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    p5.a aVar = (p5.a) t5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new qy(gVar, hashMap, eVar, 10));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 7:
                t5.g gVar2 = (t5.g) ((t5.d) obj);
                long o10 = gVar2.f48743b.o() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(o10)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, p5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 8:
                t5.g gVar3 = (t5.g) ((t5.c) ((aa.b0) obj).f1036i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f48743b.o()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) obj;
                for (m5.i iVar : (Iterable) ((t5.g) ((t5.d) qVar.f7758b)).c(new s0.b(10))) {
                    ((s4.d) qVar.f7759c).t(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f33980b, options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33979a) {
            case 2:
                ((org.telegram.ui.web.b0) this.f33980b).run();
                return;
            case 12:
                ((zq0) this.f33980b).run();
                return;
            case 13:
                ((sg.b0) this.f33980b).f48192a.U1.r();
                return;
            case 24:
                ((vg.t0) this.f33980b).run();
                return;
            case 25:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f33980b;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    vg.c0.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 26:
                ((org.telegram.messenger.y2) this.f33980b).run();
                return;
            default:
                ((vg.t0) this.f33980b).run();
                return;
        }
    }

    @Override
    public void i(ra.b bVar) {
        v9.a aVar = (v9.a) this.f33980b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f50134b.set((v9.a) bVar.get());
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        p5.b(this, imageReceiver);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f33979a;
        Object obj2 = this.f33980b;
        switch (i10) {
            case 15:
                sg.y1 y1Var = (sg.y1) obj2;
                cc.b bVar = (cc.b) obj;
                y1Var.C0 = true;
                y1Var.B0 = false;
                return;
            case 16:
                p4 p4Var = (p4) obj2;
                cc.b bVar2 = (cc.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f6188a.size(); i11++) {
                    cc.a aVar = (cc.a) bVar2.f6188a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f48425a = aVar.f6185a;
                    obj3.f48426b = aVar.d;
                    obj3.f48427c = aVar.e;
                    obj3.d = aVar.f6186b;
                    obj3.e = aVar.f6187c;
                    arrayList.add(obj3);
                }
                p4Var.run(arrayList);
                return;
            default:
                sg.o2 o2Var = (sg.o2) obj2;
                List list = (List) obj;
                o2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    return;
                }
                int i12 = ((zb.a) list.get(0)).f52905c;
                String str = null;
                if (xf.f987a == null) {
                    xf.f987a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = xf.f987a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                o2Var.f48466c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((zb.a) list.get(0)).f52905c);
                sb2.append(" ");
                sb2.append(o2Var.f48466c0);
                sb2.append(" ");
                ic.a.w(((zb.a) list.get(0)).f52903a, sb2);
                Emoji.getEmojiDrawable(o2Var.f48466c0);
                return;
        }
    }

    @Override
    public void p(Canvas canvas, int i10) {
        wh.h hVar = (wh.h) this.f33980b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f51317r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        hVar.e(canvas, true, i10);
        canvas.restore();
    }

    public j1(p4.s0 s0Var, p4.r0 r0Var) {
        this.f33979a = 3;
        this.f33980b = s0Var;
    }

    @Override
    public void z(float f7, int i10) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
