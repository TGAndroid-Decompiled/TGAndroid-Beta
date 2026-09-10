package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class a1 implements org.telegram.ui.Components.jo0, di.s4, ai1, r0.n, org.telegram.ui.ActionBar.c2, qg.u, org.telegram.ui.Components.ae0, org.telegram.ui.Components.kl0, org.telegram.ui.Components.dw0, zh.p7, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.wj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f30764a;
    public final Object f30765b;

    public a1(Object obj, int i10) {
        this.f30764a = i10;
        this.f30765b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f30765b;
        mVar.getClass();
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (k0Var = s4Var.f31532b) != null) {
            k0Var.setPadding(defaultWindowInsets.f10074a, defaultWindowInsets.f10075b, defaultWindowInsets.f10076c, defaultWindowInsets.d);
        }
        return r0.l1.f41073b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new n(3, (n4) this.f30765b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        b1 b1Var = (b1) this.f30765b;
        MessageObject messageObject = b1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(b1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.v51 G;
        Object obj;
        long j3;
        switch (this.f30764a) {
            case 7:
                b6 b6Var = (b6) this.f30765b;
                ArrayList arrayList = b6Var.f31166c;
                if (((a6) arrayList.get(i10)).f14046a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = b6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    wy wyVar = new wy(bundle);
                    wyVar.C2 = new bi.cb(26, b6Var, wyVar);
                    b6Var.presentFragment(wyVar);
                    return;
                } else if (((a6) arrayList.get(i10)).f14046a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f30807c;
                    p80 p80Var = new p80(view.getContext(), b6Var);
                    p80Var.g(false);
                    p80Var.setParentWindow(org.telegram.ui.Components.d5.Q(b6Var, p80Var, view, f7, f10));
                    p80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                    return;
                } else if (((a6) arrayList.get(i10)).f14046a == 4) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mu0(b6Var, 13), null).f17528a;
                    d2Var.show();
                    d2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                du duVar = (du) this.f30765b;
                HashSet hashSet = duVar.f31974b0;
                if (!duVar.f31975c0 && (G = duVar.f31976d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f17342id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f17195id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof wg.k) {
                        ((wg.k) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f30765b, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f30764a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        ji jiVar = (ji) this.f30765b;
        eo eoVar = jiVar.f34117p;
        if (eoVar.getParentActivity() != null && eoVar.getParentActivity() != null) {
            ii iiVar = new ii(jiVar, eoVar, eoVar.getParentActivity(), eoVar.f32316ea, arrayList);
            iiVar.setCalcMandatoryInsets(eoVar.x9());
            iiVar.setDimBehind(false);
            eoVar.A7(false);
            eoVar.showDialog(iiVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        switch (this.f30764a) {
            case 4:
                h5 h5Var = (h5) this.f30765b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.f30765b;
                ?? h3Var = new org.telegram.ui.ActionBar.h3(p6Var.getContext(), false);
                h3Var.fixNavigationBar();
                h3Var.setCanDismissWithSwipe(false);
                h3Var.setCancelable(false);
                Context context = p6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.a6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
                frameLayout.f35976a = o6Var;
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28820g;
                o6Var.b(0.35f, 120L, wrVar);
                o6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                o6Var.setTextSize(AndroidUtilities.dp(24.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(o6Var, w7.a6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                og.p pVar = new og.p(context);
                Paint paint = new Paint(1);
                pVar.f14444b = paint;
                Paint paint2 = new Paint(1);
                pVar.f14445c = paint2;
                pVar.e = new org.telegram.ui.Components.d6(pVar, 350L, wrVar);
                int i13 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
                frameLayout.f35977b = pVar;
                frameLayout.addView(pVar, w7.a6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.a6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                h3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(p6Var, frameLayout, fArr, zArr2, 27);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(p6Var, zArr, jArr, h3Var, 28), 150L);
                y6 y6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, bVar, 0);
                n6 n6Var = new n6(zArr, frameLayout, jArr, h3Var, 0);
                yh.b bVar2 = y6Var.Y;
                if (bVar2 != null) {
                    bVar2.d();
                }
                v6 v6Var = y6Var.N;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.N.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(y6Var, m6Var, n6Var, 0));
                y6Var.Y = null;
                v6 v6Var2 = y6Var.N;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                nd.U((nd) this.f30765b, d2Var);
                return;
            case 15:
                ((vg) this.f30765b).run();
                return;
            case 17:
                eo eoVar = ((pj) this.f30765b).f35851b;
                eoVar.finishFragment();
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, eoVar.P3);
                return;
            case 21:
                eo eoVar2 = ((gm) this.f30765b).f33136a.Q;
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(eoVar2.T5, true, true);
                return;
            case 22:
                yp ypVar = (yp) this.f30765b;
                boolean z10 = ypVar.f39082s;
                if (!z10 || ypVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(ypVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(ypVar.f39079f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(ypVar.f39079f);
                    }
                    AndroidUtilities.runOnUIThread(new op(ypVar, d2VarArr, ypVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.o2(26, ypVar, d2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((br) this.f30765b).run(1);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.be0 be0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f30765b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f18849a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, be0Var);
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f30765b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.f30765b).f32950b;
        Paint paint = h8Var.f33319w;
        TextPaint textPaint = h8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.f33311h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void j(boolean z10) {
        n3 n3Var = (n3) this.f30765b;
        w3 w3Var = n3Var.K.K;
        if (w3Var != null) {
            n3Var.h = true;
            w3Var.dismiss(true);
        }
    }

    public void k(String str) {
        eo eoVar = ((pm) this.f30765b).Q;
        if (str.startsWith("@")) {
            eoVar.getMessagesController().openByUserName(str.substring(1), eoVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                eoVar.Y.a1(null, str, false, false);
                if (eoVar.Y.getFieldText() == null) {
                    eoVar.e9(false);
                    return;
                }
                return;
            }
            eoVar.xa(0, str, null, null, false);
        } else {
            wy wyVar = new wy(null);
            wyVar.f38476n2 = str;
            eoVar.presentFragment(wyVar);
        }
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f30765b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f37165c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f37173x;
            if (kVar != null) {
                kVar.c();
                u9Var.f37173x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f37173x = kVar2;
            kVar2.b(new m9(u9Var, 0));
            u9Var.f37173x.a(new n9(u9Var, 0));
            u9Var.f37173x.f14134u = new o1.l(500.0f);
            u9Var.f37173x.f14134u.a(0.8f);
            u9Var.f37173x.f14134u.b(250.0f);
            u9Var.f37173x.f();
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f30764a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f30764a) {
            case 13:
                fe feVar = (fe) this.f30765b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                he heVar = feVar.f32791f;
                Object obj6 = v51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    xh.z7.h1(feVar.getContext(), true, heVar.d, feVar.f32790c, (TL_stars.StarsTransaction) v51Var.G, feVar.f32789b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    le.h0(feVar.getContext(), feVar.f32790c, (TL_stats.BroadcastRevenueTransaction) v51Var.G, heVar.d, feVar.f32789b);
                    return;
                } else {
                    return;
                }
            default:
                ts tsVar = (ts) this.f30765b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.v51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !tsVar.X;
                        tsVar.X = z10;
                        ((org.telegram.ui.Cells.x8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                if (user == null || tsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tsVar.getParentActivity(), 0, tsVar.f37005r);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(16, tsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public a1(oj ojVar, boolean z10) {
        this.f30764a = 18;
        this.f30765b = ojVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f30764a) {
            case 18:
                eo eoVar = ((oj) this.f30765b).f35504b.f35851b;
                eoVar.qa(eoVar.f32298d4, true);
                return;
            case 19:
                eo eoVar2 = ((zl) this.f30765b).f39409b;
                if (z10) {
                    eoVar2.Q7();
                    UndoView undoView = eoVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                wr wrVar = ((or) this.f30765b).f35587b;
                if (!z10 || wr.X(wrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) wr.Z(wrVar).getFragmentStack().get(wr.Y(wrVar).getFragmentStack().size() - 2);
                if (p2Var instanceof yo) {
                    p2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", wrVar.N);
                    yo yoVar = new yo(bundle);
                    yoVar.l0(wrVar.f38357s);
                    ((ActionBarLayout) wr.b0(wrVar)).c(wr.a0(wrVar).getFragmentStack().size() - 1, yoVar);
                    wrVar.finishFragment();
                    yoVar.f39043c.j(76, 0L, null);
                    return;
                }
                wrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f30765b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
