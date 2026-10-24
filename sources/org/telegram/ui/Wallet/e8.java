package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fi1;
import org.telegram.ui.go0;
import org.telegram.ui.so0;
import org.telegram.ui.xe1;
import org.telegram.ui.xx;
public final class e8 implements org.telegram.ui.ActionBar.z1, OnSuccessListener, r2.v, t5.b, qa.a, OnFailureListener, s5.e, c3.t, e2.j, go0, xx, androidx.car.app.utils.b, r9.d, ai.n5, Utilities.Callback5, am0, CameraView.CameraViewDelegate {
    public final int f34462a;
    public final Object f34463b;
    public final Object f34464c;

    public e8(int i10, Object obj, Object obj2) {
        this.f34462a = i10;
        this.f34463b = obj;
        this.f34464c = obj2;
    }

    @Override
    public boolean D() {
        switch (this.f34462a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(ey eyVar) {
        switch (this.f34462a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f34462a) {
            case 17:
                ug.t tVar = (ug.t) this.f34463b;
                ug.t tVar2 = (ug.t) this.f34464c;
                if (i10 == 1) {
                    tVar.run(null);
                    return;
                } else if (i10 != 3) {
                    tVar2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f34463b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f34464c;
                if (i10 == 1) {
                    callback.run(null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f34463b;
        ((u2.m0) obj).e(aVar.f281b, (u2.h0) aVar.f282c, (u2.d0) this.f34464c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f34463b;
        l5.i iVar = (l5.i) this.f34464c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f46520b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15985c) {
                int size = aVar.f46520b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f46522a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.f46522a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.l c10 = bVar.f46524c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.f46525a, fVar.f46526b);
                }
                listIterator.set(new s5.b(j11, bVar.f46523b, c10.f()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        yh.l2 l2Var = (yh.l2) this.f34463b;
        ms0 ms0Var = l2Var.f50824a;
        l2Var.e.f2511l.remove((TL_stars.SavedStarGift) this.f34464c);
        l2Var.f(true);
        int i10 = l2Var.f50825b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            vc a02 = vc.a0(ms0Var.f50923a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            oc O = a02.O(document, string, LocaleController.formatString(i11, i2.o1.m(tL_starGiftUnique.num, ',', sb2)));
            O.f29211r = false;
            O.j();
        } else {
            oc O2 = vc.a0(ms0Var.f50923a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f29211r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33503x0.c(true);
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        yh.f4.Q((yh.f4) this.f34463b, (yh.e4) this.f34464c, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f2917a;
        ((IStartCarApp) this.f34463b).startCarApp((Intent) this.f34464c);
    }

    @Override
    public int d(Object obj) {
        Context context = (Context) this.f34463b;
        b2.w wVar = (b2.w) this.f34464c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f45357b;
        if ((!str.equals(wVar.f4135s) && !str.equals(r2.w.c(wVar))) || !oVar.c(context, wVar, false) || !oVar.d(wVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public c3.q[] e(Uri uri, Map map) {
        c3.q aVar;
        u2.r rVar = (u2.r) this.f34463b;
        b2.w wVar = (b2.w) this.f34464c;
        if (rVar.f47873c.a0(wVar)) {
            aVar = new z3.h(rVar.f47873c.y(wVar), null);
        } else {
            aVar = new k3.a(wVar);
        }
        return new c3.q[]{aVar};
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34462a) {
            case 0:
                l0 l0Var = (l0) this.f34464c;
                pf.c h = c2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((i8) this.f34463b, h, 1);
                l0.F("disableBackupWithoutUpdatingPhrase");
                l0Var.j0(new e2.o0((Object) l0Var, (Object) new oy(26, l0Var, d8Var), true, false, 3));
                return;
            case 2:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f34463b, (HashSet) this.f34464c);
                return;
            case 3:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f34463b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.j2(b1Var, (String[]) this.f34464c, c2Var, 20));
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f34463b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f34464c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 11:
                sg.j0.Q((sg.j0) this.f34463b, (ArrayList) this.f34464c);
                return;
            case 15:
                ((AtomicBoolean) this.f34463b).set(true);
                ((ug.r0) this.f34464c).run();
                return;
            case 16:
                ((ug.t) this.f34463b).run((TLRPC.TL_premiumGiftCodeOption) this.f34464c);
                return;
            case 23:
                yh.m mVar = (yh.m) this.f34463b;
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) this.f34464c;
                try {
                    int parseInt = Integer.parseInt(c6Var.getText().toString().trim());
                    mVar.X(parseInt);
                    mVar.f50838c0.setValue(parseInt);
                    c2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(c6Var);
                    FileLog.e(th2);
                    return;
                }
            default:
                yh.x1 x1Var = (yh.x1) this.f34463b;
                Utilities.Callback callback = (Utilities.Callback) this.f34464c;
                String obj = x1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(x1Var);
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        ((qa.a) this.f34463b).h(bVar);
        ((qa.a) this.f34464c).h(bVar);
    }

    @Override
    public Object j() {
        switch (this.f34462a) {
            case 6:
                Iterable iterable = (Iterable) this.f34464c;
                s5.g gVar = (s5.g) ((s5.d) ((ea.b) this.f34463b).f8554c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ea.b bVar = (ea.b) this.f34463b;
                for (Map.Entry entry : ((HashMap) this.f34464c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f8557i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        String valueOf;
        String str = (String) this.f34463b;
        Context context = (Context) z5Var.a(Context.class);
        switch (((k2.f) this.f34464c).f14726a) {
            case 9:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 10:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 11:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    valueOf = "auto";
                    break;
                } else {
                    if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                        valueOf = "embedded";
                        break;
                    }
                    valueOf = "";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new ya.a(str, valueOf);
    }

    @Override
    public void onCameraInit() {
        zh.b0 b0Var = (zh.b0) this.f34463b;
        ((CameraView) this.f34464c).animate().alpha(1.0f).setDuration(180L).start();
        if (!b0Var.V && !b0Var.f52125h0 && !b0Var.f52129l0) {
            b0Var.f52125h0 = true;
            b0Var.f52124g0.postDelayed(b0Var.f52147y0, 150L);
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.z1 z1Var = (rg.z1) this.f34463b;
        Bitmap bitmap = (Bitmap) this.f34464c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(13, z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((com.google.android.gms.internal.cast.z5) this.f34463b).f6892a));
        ((ei.d) this.f34464c).setLoading(false);
        fi1.d = null;
        org.telegram.ui.ActionBar.h3 h3Var = fi1.f37345c;
        if (h3Var != null) {
            h3Var.dismiss();
            fi1.f37345c = null;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        yh.o2 o2Var = (yh.o2) this.f34463b;
        ei.d dVar = (ei.d) this.f34464c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f7 = (Float) obj4;
        Float f10 = (Float) obj5;
        o2Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((l61) obj).G).gift.f20568id;
        if (o2Var.f50912b == j10) {
            o2Var.f50912b = 0L;
        } else {
            o2Var.f50912b = j10;
        }
        if (o2Var.f50912b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof so0) {
                    so0 so0Var = (so0) childAt;
                    if (o2Var.f50912b == so0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    so0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        switch (this.f34462a) {
            case 19:
                ug.e0 e0Var = (ug.e0) this.f34463b;
                String str = (String) this.f34464c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    e0Var.f33212n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                eyVar.finishFragment();
                ug.h.h(j10);
                return true;
            default:
                vg.e eVar = (vg.e) this.f34463b;
                String str2 = (String) this.f34464c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                eyVar.finishFragment();
                ug.h.h(j11);
                return true;
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
