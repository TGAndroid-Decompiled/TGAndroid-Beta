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
public final class b1 implements org.telegram.ui.Components.xo0, gi.d4, kg1, r0.n, org.telegram.ui.ActionBar.a2, sg.t, org.telegram.ui.Components.ke0, org.telegram.ui.Components.xl0, org.telegram.ui.Components.mw0, ci.v9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.jk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f35526a;
    public final Object f35527b;

    public b1(Object obj, int i10) {
        this.f35526a = i10;
        this.f35527b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        m0 m0Var;
        c2.b bVar = (c2.b) this.f35527b;
        bVar.getClass();
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        x4 x4Var = (x4) bVar.d;
        if (x4Var == view && (m0Var = x4Var.f37424b) != null) {
            m0Var.setPadding(defaultWindowInsets.f12284a, defaultWindowInsets.f12285b, defaultWindowInsets.f12286c, defaultWindowInsets.d);
        }
        return r0.k1.f44852b;
    }

    @Override
    public boolean P0(View view) {
        switch (this.f35526a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new i0(2, (s4) this.f35527b, arrayList), 100L);
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f35526a;
    }

    @Override
    public void b(float f7) {
        c1 c1Var = (c1) this.f35527b;
        MessageObject messageObject = c1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(c1Var.M, f7);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.f61 G;
        Object obj;
        long j10;
        switch (this.f35526a) {
            case 7:
                e6 e6Var = (e6) this.f35527b;
                ArrayList arrayList = e6Var.f36406c;
                if (((d6) arrayList.get(i10)).f44314a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = e6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ey eyVar = new ey(bundle);
                    eyVar.C2 = new m4.y0(6, e6Var, eyVar);
                    e6Var.presentFragment(eyVar);
                    return;
                } else if (((d6) arrayList.get(i10)).f44314a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((d6) arrayList.get(i10)).f36079c;
                    x70 x70Var = new x70(view.getContext(), e6Var);
                    x70Var.g(false);
                    x70Var.setParentWindow(org.telegram.ui.Components.f5.P(e6Var, x70Var, view, f7, f10));
                    x70Var.setCallback(new b6(e6Var, keepMediaException, 0));
                    return;
                } else if (((d6) arrayList.get(i10)).f44314a == 4) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(e6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ut0(e6Var, 13), null).f20601a;
                    b2Var.show();
                    b2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                st stVar = (st) this.f35527b;
                HashSet hashSet = stVar.f41491b0;
                if (!stVar.f41492c0 && (G = stVar.f41493d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f20419id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f20272id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof yg.k) {
                        ((yg.k) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f35527b, view, i10, f7);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        ai aiVar = (ai) this.f35527b;
        sn snVar = aiVar.f35448p;
        if (snVar.getParentActivity() != null && snVar.getParentActivity() != null) {
            zh zhVar = new zh(aiVar, snVar, snVar.getParentActivity(), snVar.f41205ea, arrayList);
            zhVar.setCalcMandatoryInsets(snVar.C9());
            zhVar.setDimBehind(false);
            snVar.D7(false);
            snVar.showDialog(zhVar);
        }
    }

    @Override
    public void f(boolean z10) {
        o3 o3Var = (o3) this.f35527b;
        x3 x3Var = o3Var.K.K;
        if (x3Var != null) {
            o3Var.h = true;
            x3Var.dismiss(true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f35526a) {
            case 4:
                m5 m5Var = (m5) this.f35527b;
                m5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    m5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                s6 s6Var = (s6) this.f35527b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(s6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = s6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.z5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, 150, 49));
                imageView.d();
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
                frameLayout.f41888a = q6Var;
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25031g;
                q6Var.b(0.35f, 120L, bsVar);
                q6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.h6.f21092j5;
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                q6Var.setTextSize(AndroidUtilities.dp(24.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(q6Var, w7.z5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                t6 t6Var = new t6(context);
                Paint paint = new Paint(1);
                t6Var.f41596b = paint;
                Paint paint2 = new Paint(1);
                t6Var.f41597c = paint2;
                t6Var.e = new org.telegram.ui.Components.f6(t6Var, 350L, bsVar);
                int i13 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
                frameLayout.f41889b = t6Var;
                frameLayout.addView(t6Var, w7.z5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.z5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(s6Var, frameLayout, fArr, zArr2, 5);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(s6Var, zArr, jArr, f3Var, 6), 150L);
                c7 c7Var = s6Var.d;
                p6 p6Var = new p6(fArr, zArr2, iVar, 0);
                q6 q6Var2 = new q6(zArr, frameLayout, jArr, f3Var, 0);
                bi.c cVar = c7Var.Y;
                if (cVar != null) {
                    cVar.d();
                }
                z6 z6Var = c7Var.N;
                if (z6Var != null) {
                    z6Var.d();
                    c7Var.N.e(false);
                }
                c7Var.getFileLoader().cancelLoadAllFiles();
                c7Var.getFileLoader().getFileLoaderQueue().postRunnable(new i6(c7Var, p6Var, q6Var2, 0));
                c7Var.Y = null;
                z6 z6Var2 = c7Var.N;
                if (z6Var2 != null) {
                    z6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                od.U((od) this.f35527b, b2Var);
                return;
            case 15:
                ((mg) this.f35527b).run();
                return;
            case 17:
                sn snVar = ((hj) this.f35527b).f37566b;
                snVar.finishFragment();
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, snVar.P3);
                return;
            case 21:
                sn snVar2 = ((wl) this.f35527b).f42889a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) snVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(snVar2.T5, true, true);
                return;
            case 22:
                kp kpVar = (kp) this.f35527b;
                boolean z10 = kpVar.f38628s;
                if (!z10 || kpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(kpVar.f38625f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(kpVar.f38625f);
                    }
                    AndroidUtilities.runOnUIThread(new ap(kpVar, b2VarArr, kpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new xc(8, kpVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((nq) this.f35527b).run(1);
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f35527b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        k8 k8Var = (k8) ((g) this.f35527b).f37062b;
        Paint paint = k8Var.f38432w;
        TextPaint textPaint = k8Var.e;
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
            canvas.drawText(Integer.toString(k8Var.f38424h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void j(org.telegram.ui.Components.le0 le0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f35527b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21934a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    public void k(String str) {
        sn snVar = ((fm) this.f35527b).Q;
        if (str.startsWith("@")) {
            snVar.getMessagesController().openByUserName(str.substring(1), snVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                snVar.Y.X0(null, str, false, false);
                if (snVar.Y.getFieldText() == null) {
                    snVar.j9(false);
                    return;
                }
                return;
            }
            snVar.Ba(0, str, null, null, false);
        } else {
            ey eyVar = new ey(null);
            eyVar.f36676n2 = str;
            snVar.presentFragment(eyVar);
        }
    }

    @Override
    public void onCameraInit() {
        y9 y9Var = (y9) this.f35527b;
        HandlerThread handlerThread = y9Var.e;
        handlerThread.start();
        y9Var.f43357f = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(y9Var.f43358f0, 0L);
        if (y9Var.a0()) {
            o1.k kVar = y9Var.E;
            if (kVar != null) {
                kVar.c();
                y9Var.E = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            y9Var.E = kVar2;
            kVar2.b(new o9(y9Var, 0));
            y9Var.E.a(new p9(y9Var, 0));
            y9Var.E.f17555u = new o1.l(500.0f);
            y9Var.E.f17555u.a(0.8f);
            y9Var.E.f17555u.b(250.0f);
            y9Var.E.h();
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f35526a) {
            case 13:
                ee eeVar = (ee) this.f35527b;
                org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f36507f;
                Object obj6 = f61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    ai.ld.i1(eeVar.getContext(), true, geVar.d, eeVar.f36506c, (TL_stars.StarsTransaction) f61Var.G, eeVar.f36505b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.h0(eeVar.getContext(), eeVar.f36506c, (TL_stats.BroadcastRevenueTransaction) f61Var.G, geVar.d, eeVar.f36505b);
                    return;
                } else {
                    return;
                }
            default:
                hs hsVar = (hs) this.f35527b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.f61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !hsVar.X;
                        hsVar.X = z10;
                        ((org.telegram.ui.Cells.v8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                if (user == null || hsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getParentActivity(), 0, hsVar.f37623r);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s2(25, hsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public b1(gj gjVar, boolean z10) {
        this.f35526a = 18;
        this.f35527b = gjVar;
    }

    @Override
    public void c(float f7) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f35526a) {
            case 18:
                sn snVar = ((gj) this.f35527b).f37253b.f37566b;
                snVar.va(snVar.f41188d4, true);
                return;
            case 19:
                sn snVar2 = ((ql) this.f35527b).f40459b;
                if (z10) {
                    snVar2.T7();
                    UndoView undoView = snVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                jr jrVar = ((br) this.f35527b).f35730b;
                if (!z10 || jr.X(jrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) jr.Z(jrVar).getFragmentStack().get(jr.Y(jrVar).getFragmentStack().size() - 2);
                if (n2Var instanceof ko) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", jrVar.N);
                    ko koVar = new ko(bundle);
                    koVar.l0(jrVar.f38304s);
                    ((ActionBarLayout) jr.b0(jrVar)).c(jr.a0(jrVar).getFragmentStack().size() - 1, koVar);
                    jrVar.finishFragment();
                    koVar.f38587c.j(76, 0L, null);
                    return;
                }
                jrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f35527b).setClickable(false);
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
