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
public final class c1 implements org.telegram.ui.Components.vn0, ph.l3, pg1, r0.o, org.telegram.ui.ActionBar.b2, cg.x, org.telegram.ui.Components.md0, org.telegram.ui.Components.al0, org.telegram.ui.Components.kv0, lh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f36954a;
    public final Object f36955b;

    public c1(Object obj, int i10) {
        this.f36954a = i10;
        this.f36955b = obj;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        n0 n0Var;
        ab.m mVar = (ab.m) this.f36955b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (n0Var = s4Var.f36992b) != null) {
            n0Var.setPadding(defaultWindowInsets.f8186a, defaultWindowInsets.f8187b, defaultWindowInsets.f8188c, defaultWindowInsets.d);
        }
        return r0.m1.f46842b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(9, (n4) this.f36955b, arrayList), 100L);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        org.telegram.ui.Components.w41 G;
        Object obj;
        long j10;
        switch (this.f36954a) {
            case 7:
                a6 a6Var = (a6) this.f36955b;
                ArrayList arrayList = a6Var.f36438c;
                if (((z5) arrayList.get(i10)).f50845a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.f36439e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    fy fyVar = new fy(bundle);
                    fyVar.f38379y2 = new kg.w(10, a6Var, fyVar);
                    a6Var.presentFragment(fyVar);
                    return;
                } else if (((z5) arrayList.get(i10)).f50845a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f45073c;
                    x70 x70Var = new x70(view.getContext(), a6Var);
                    x70Var.g(false);
                    x70Var.setParentWindow(org.telegram.ui.Components.c5.Q(a6Var, x70Var, view, f9, f10));
                    x70Var.setCallback(new x5(a6Var, keepMediaException, 0));
                    return;
                } else if (((z5) arrayList.get(i10)).f50845a == 4) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new it0(a6Var, 13), null).f22714a;
                    c2Var.show();
                    c2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                tt ttVar = (tt) this.f36955b;
                HashSet hashSet = ttVar.X;
                if (!ttVar.Y && (G = ttVar.Z.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f22539id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f22392id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof ig.n) {
                        ((ig.n) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f36955b, view, i10, f9);
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f36954a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(float f9) {
        d1 d1Var = (d1) this.f36955b;
        MessageObject messageObject = d1Var.I;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(d1Var.I, f9);
    }

    @Override
    public void e(ArrayList arrayList) {
        yh yhVar = (yh) this.f36955b;
        tn tnVar = yhVar.f44892p;
        if (tnVar.getParentActivity() != null && tnVar.getParentActivity() != null) {
            xh xhVar = new xh(yhVar, tnVar, tnVar.getParentActivity(), tnVar.f42746aa, arrayList);
            xhVar.setCalcMandatoryInsets(tnVar.x9());
            xhVar.setDimBehind(false);
            tnVar.A7(false);
            tnVar.showDialog(xhVar);
        }
    }

    @Override
    public void f(boolean z10) {
        q3 q3Var = (q3) this.f36955b;
        z3 z3Var = q3Var.G.G;
        if (z3Var != null) {
            q3Var.h = true;
            z3Var.dismiss(true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        switch (this.f36954a) {
            case 4:
                h5 h5Var = (h5) this.f36955b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 8:
                o6 o6Var = (o6) this.f36955b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(o6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = o6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, i7.f6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
                frameLayout.f41301a = o6Var2;
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29801g;
                o6Var2.b(0.35f, 120L, jrVar);
                o6Var2.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
                o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                o6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                o6Var2.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(o6Var2, i7.f6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ag.s sVar = new ag.s(context);
                Paint paint = new Paint(1);
                sVar.f652b = paint;
                Paint paint2 = new Paint(1);
                sVar.f653c = paint2;
                sVar.f654e = new org.telegram.ui.Components.d6(sVar, 350L, jrVar);
                int i13 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
                frameLayout.f41302b = sVar;
                frameLayout.addView(sVar, i7.f6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, i7.f6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(o6Var, frameLayout, fArr, zArr2, 24);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o6Var, zArr, jArr, f3Var, 25), 150L);
                x6 x6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, cVar, 0);
                m6 m6Var = new m6(zArr, frameLayout, jArr, f3Var, 0);
                kh.b bVar = x6Var.U;
                if (bVar != null) {
                    bVar.d();
                }
                u6 u6Var = x6Var.J;
                if (u6Var != null) {
                    u6Var.d();
                    x6Var.J.e(false);
                }
                x6Var.getFileLoader().cancelLoadAllFiles();
                x6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(x6Var, l6Var, m6Var, 0));
                x6Var.U = null;
                u6 u6Var2 = x6Var.J;
                if (u6Var2 != null) {
                    u6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                hd.U((hd) this.f36955b, c2Var);
                return;
            case 15:
                ((ig) this.f36955b).run();
                return;
            case 17:
                tn tnVar = ((ej) this.f36955b).f37848b;
                tnVar.finishFragment();
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, tnVar.L3);
                return;
            case 21:
                tn tnVar2 = ((vl) this.f36955b).f43618a.M;
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(tnVar2.P5, true, true);
                return;
            case 22:
                kp kpVar = (kp) this.f36955b;
                boolean z10 = kpVar.f39984s;
                if (!z10 || kpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(kpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(kpVar.f39981f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(kpVar.f39981f);
                    }
                    AndroidUtilities.runOnUIThread(new ap(kpVar, c2VarArr, kpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new zg(4, kpVar, c2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((nq) this.f36955b).run(1);
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f36955b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f36955b;
        BubbleActivity bubbleActivity2 = BubbleActivity.W;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.Q;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.R, bubbleActivity.T, true, bubbleActivity.S);
            bubbleActivity.Q = null;
        }
        bubbleActivity.O.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
    }

    @Override
    public void j(Canvas canvas, RectF rectF, float f9) {
        f8 f8Var = (f8) ((h) this.f36955b).f38706b;
        Paint paint = f8Var.f38036w;
        TextPaint textPaint = f8Var.f38026e;
        paint.setAlpha((int) (80.0f * f9));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f9);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f9 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(f8Var.f38025d0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    public void k(String str) {
        tn tnVar = ((em) this.f36955b).M;
        if (str.startsWith("@")) {
            tnVar.getMessagesController().openByUserName(str.substring(1), tnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                tnVar.U.a1(null, str, false, false);
                if (tnVar.U.getFieldText() == null) {
                    tnVar.e9(false);
                    return;
                }
                return;
            }
            tnVar.xa(0, str, null, null, false);
        } else {
            fy fyVar = new fy(null);
            fyVar.f38305j2 = str;
            tnVar.presentFragment(fyVar);
        }
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f36954a;
    }

    @Override
    public void onCameraInit() {
        r9 r9Var = (r9) this.f36955b;
        HandlerThread handlerThread = r9Var.d;
        handlerThread.start();
        r9Var.f42004e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(r9Var.Y, 0L);
        if (r9Var.a0()) {
            o1.k kVar = r9Var.f42010x;
            if (kVar != null) {
                kVar.c();
                r9Var.f42010x = null;
            }
            o1.k kVar2 = new o1.k(new ib.a(0.0f));
            r9Var.f42010x = kVar2;
            kVar2.b(new j9(r9Var, 0));
            r9Var.f42010x.a(new k9(r9Var, 0));
            r9Var.f42010x.f19045u = new o1.l(500.0f);
            r9Var.f42010x.f19045u.a(0.8f);
            r9Var.f42010x.f19045u.b(250.0f);
            r9Var.f42010x.f();
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f36954a) {
            case 13:
                xd xdVar = (xd) this.f36955b;
                org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                zd zdVar = xdVar.f44557f;
                Object obj6 = w41Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    jh.ia.h1(xdVar.getContext(), true, zdVar.d, xdVar.f44555c, (TL_stars.StarsTransaction) w41Var.G, xdVar.f44554b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    de.h0(xdVar.getContext(), xdVar.f44555c, (TL_stats.BroadcastRevenueTransaction) w41Var.G, zdVar.d, xdVar.f44554b);
                    return;
                } else {
                    return;
                }
            default:
                hs hsVar = (hs) this.f36955b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.w41) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !hsVar.T;
                        hsVar.T = z10;
                        ((org.telegram.ui.Cells.q8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
                if (user == null || hsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getParentActivity(), 0, hsVar.f39009r);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr(0, hsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public c1(dj djVar, boolean z10) {
        this.f36954a = 18;
        this.f36955b = djVar;
    }

    @Override
    public void d(float f9) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f36954a) {
            case 18:
                tn tnVar = ((dj) this.f36955b).f37549b.f37848b;
                tnVar.qa(tnVar.Z3, true);
                return;
            case 19:
                tn tnVar2 = ((ol) this.f36955b).f41189b;
                if (z10) {
                    tnVar2.Q7();
                    UndoView undoView = tnVar2.f42989u3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                jr jrVar = ((br) this.f36955b).f36891b;
                if (!z10 || jr.X(jrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) jr.Z(jrVar).getFragmentStack().get(jr.Y(jrVar).getFragmentStack().size() - 2);
                if (o2Var instanceof ko) {
                    o2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", jrVar.J);
                    ko koVar = new ko(bundle);
                    koVar.l0(jrVar.f39659s);
                    ((ActionBarLayout) jr.b0(jrVar)).c(jr.a0(jrVar).getFragmentStack().size() - 1, koVar);
                    jrVar.finishFragment();
                    koVar.f39942c.j(76, 0L, null);
                    return;
                }
                jrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f36955b).setClickable(false);
    }

    private final void l(View view, float f9, float f10) {
    }

    private final void n(View view, float f9, float f10) {
    }

    private final void o(View view, float f9, float f10) {
    }
}
