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
public final class a1 implements org.telegram.ui.Components.fo0, sh.l3, jh1, r0.o, org.telegram.ui.ActionBar.c2, fg.x, org.telegram.ui.Components.wd0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.tv0, oh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.wj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f34975a;
    public final Object f34976b;

    public a1(Object obj, int i10) {
        this.f34975a = i10;
        this.f34976b = obj;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        l0 l0Var;
        cb.m mVar = (cb.m) this.f34976b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        u4 u4Var = (u4) mVar.d;
        if (u4Var == view && (l0Var = u4Var.f36361b) != null) {
            l0Var.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        }
        return r0.m1.f46482b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f34975a) {
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
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(16, (p4) this.f34976b, arrayList), 100L);
    }

    @Override
    public void b(float f10) {
        b1 b1Var = (b1) this.f34976b;
        MessageObject messageObject = b1Var.J;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(b1Var.J, f10);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Components.h51 G;
        Object obj;
        long j10;
        switch (this.f34975a) {
            case 7:
                d6 d6Var = (d6) this.f34976b;
                ArrayList arrayList = d6Var.f35988c;
                if (((c6) arrayList.get(i10)).f2505a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = d6Var.f35989e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    py pyVar = new py(bundle);
                    pyVar.f40278z2 = new ng.w(9, d6Var, pyVar);
                    d6Var.presentFragment(pyVar);
                    return;
                } else if (((c6) arrayList.get(i10)).f2505a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).f35697c;
                    h80 h80Var = new h80(view.getContext(), d6Var);
                    h80Var.g(false);
                    h80Var.setParentWindow(org.telegram.ui.Components.z4.Q(d6Var, h80Var, view, f10, f11));
                    h80Var.setCallback(new a6(d6Var, keepMediaException, 0));
                    return;
                } else if (((c6) arrayList.get(i10)).f2505a == 4) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(d6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new yt0(d6Var, 13), null).f21168a;
                    d2Var.show();
                    d2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                bu buVar = (bu) this.f34976b;
                HashSet hashSet = buVar.Y;
                if (!buVar.Z && (G = buVar.f35598a0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f20992id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f20845id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof lg.n) {
                        ((lg.n) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f34976b, view, i10, f10);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        di diVar = (di) this.f34976b;
        xn xnVar = diVar.f36211p;
        if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
            ci ciVar = new ci(diVar, xnVar, xnVar.getParentActivity(), xnVar.f43114ba, arrayList);
            ciVar.setCalcMandatoryInsets(xnVar.x9());
            ciVar.setDimBehind(false);
            xnVar.A7(false);
            xnVar.showDialog(ciVar);
        }
    }

    @Override
    public void f(Canvas canvas, RectF rectF, float f10) {
        j8 j8Var = (j8) ((h) this.f34976b).f37188b;
        Paint paint = j8Var.f37875w;
        TextPaint textPaint = j8Var.f37864e;
        paint.setAlpha((int) (80.0f * f10));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f10);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(j8Var.f37865e0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void g(boolean z4) {
        p3 p3Var = (p3) this.f34976b;
        y3 y3Var = p3Var.H.H;
        if (y3Var != null) {
            p3Var.h = true;
            y3Var.dismiss(true);
        }
    }

    @Override
    public void h(org.telegram.ui.Components.xd0 xd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f34976b;
        BubbleActivity bubbleActivity2 = BubbleActivity.X;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.R;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.S, bubbleActivity.U, true, bubbleActivity.T);
            bubbleActivity.R = null;
        }
        bubbleActivity.P.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xd0Var);
    }

    @Override
    public void i(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f34976b).get(i10)).intValue()).apply();
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        switch (this.f34975a) {
            case 4:
                j5 j5Var = (j5) this.f34976b;
                j5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    j5Var.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 8:
                s6 s6Var = (s6) this.f34976b;
                ?? h3Var = new org.telegram.ui.ActionBar.h3(s6Var.getContext(), false);
                h3Var.fixNavigationBar();
                h3Var.setCanDismissWithSwipe(false);
                h3Var.setCancelable(false);
                Context context = s6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, k7.c6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
                frameLayout.f41446a = k6Var;
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30169g;
                k6Var.b(0.35f, 120L, prVar);
                k6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.k6.f21768j5;
                k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                k6Var.setTextSize(AndroidUtilities.dp(24.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(k6Var, k7.c6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                dg.r rVar = new dg.r(context);
                Paint paint = new Paint(1);
                rVar.f4645b = paint;
                Paint paint2 = new Paint(1);
                rVar.f4646c = paint2;
                rVar.f4647e = new org.telegram.ui.Components.z5(rVar, 350L, prVar);
                int i13 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.l1(0.2f, org.telegram.ui.ActionBar.k6.w0(null, i13, false)));
                frameLayout.f41447b = rVar;
                frameLayout.addView(rVar, k7.c6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, k7.c6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                h3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(s6Var, frameLayout, fArr, zArr2, 22);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(s6Var, zArr, jArr, h3Var, 23), 150L);
                b7 b7Var = s6Var.d;
                p6 p6Var = new p6(fArr, zArr2, cVar, 0);
                q6 q6Var = new q6(zArr, frameLayout, jArr, h3Var, 0);
                nh.b bVar = b7Var.V;
                if (bVar != null) {
                    bVar.d();
                }
                y6 y6Var = b7Var.K;
                if (y6Var != null) {
                    y6Var.d();
                    b7Var.K.e(false);
                }
                b7Var.getFileLoader().cancelLoadAllFiles();
                b7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(b7Var, p6Var, q6Var, 0));
                b7Var.V = null;
                y6 y6Var2 = b7Var.K;
                if (y6Var2 != null) {
                    y6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                nd.U((nd) this.f34976b, d2Var);
                return;
            case 15:
                ((ng) this.f34976b).run();
                return;
            case 17:
                xn xnVar = ((jj) this.f34976b).f38068b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.M3);
                return;
            case 21:
                xn xnVar2 = ((bm) this.f34976b).f35565a.N;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.Q5, true, true);
                return;
            case 22:
                rp rpVar = (rp) this.f34976b;
                boolean z4 = rpVar.f40900s;
                if (!z4 || rpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(rpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z4) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(rpVar.f40897f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(rpVar.f40897f);
                    }
                    AndroidUtilities.runOnUIThread(new gp(rpVar, d2VarArr, rpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new lo(1, rpVar, d2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((uq) this.f34976b).run(1);
                return;
        }
    }

    public void k(String str) {
        xn xnVar = ((jm) this.f34976b).N;
        if (str.startsWith("@")) {
            xnVar.getMessagesController().openByUserName(str.substring(1), xnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                xnVar.V.a1(null, str, false, false);
                if (xnVar.V.getFieldText() == null) {
                    xnVar.e9(false);
                    return;
                }
                return;
            }
            xnVar.xa(0, str, null, null, false);
        } else {
            py pyVar = new py(null);
            pyVar.f40204k2 = str;
            xnVar.presentFragment(pyVar);
        }
    }

    @Override
    public void onCameraInit() {
        v9 v9Var = (v9) this.f34976b;
        HandlerThread handlerThread = v9Var.d;
        handlerThread.start();
        v9Var.f42060e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(v9Var.Z, 0L);
        if (v9Var.a0()) {
            o1.j jVar = v9Var.f42066x;
            if (jVar != null) {
                jVar.c();
                v9Var.f42066x = null;
            }
            o1.j jVar2 = new o1.j(new kb.a(0.0f));
            v9Var.f42066x = jVar2;
            jVar2.b(new n9(v9Var, 0));
            v9Var.f42066x.a(new o9(v9Var, 0));
            v9Var.f42066x.f16338u = new o1.k(500.0f);
            v9Var.f42066x.f16338u.a(0.8f);
            v9Var.f42066x.f16338u.b(250.0f);
            v9Var.f42066x.f();
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f34975a;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34975a) {
            case 13:
                ee eeVar = (ee) this.f34976b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f36454f;
                Object obj6 = h51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    mh.ja.h1(eeVar.getContext(), true, geVar.d, eeVar.f36452c, (TL_stars.StarsTransaction) h51Var.G, eeVar.f36451b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.h0(eeVar.getContext(), eeVar.f36452c, (TL_stats.BroadcastRevenueTransaction) h51Var.G, geVar.d, eeVar.f36451b);
                    return;
                } else {
                    return;
                }
            default:
                os osVar = (os) this.f34976b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.h51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z4 = !osVar.U;
                        osVar.U = z4;
                        ((org.telegram.ui.Cells.s8) view2).setChecked(z4);
                        return;
                    }
                    return;
                }
                TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
                if (user == null || osVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(osVar.getParentActivity(), 0, osVar.f39796r);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(29, osVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public a1(ij ijVar, boolean z4) {
        this.f34975a = 18;
        this.f34976b = ijVar;
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z4) {
        switch (this.f34975a) {
            case 18:
                xn xnVar = ((ij) this.f34976b).f37717b.f38068b;
                xnVar.qa(xnVar.f43094a4, true);
                return;
            case 19:
                xn xnVar2 = ((ul) this.f34976b).f41869b;
                if (z4) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.f43356v3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                qr qrVar = ((ir) this.f34976b).f37765b;
                if (!z4 || qr.X(qrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) qr.Z(qrVar).getFragmentStack().get(qr.Y(qrVar).getFragmentStack().size() - 2);
                if (p2Var instanceof po) {
                    p2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qrVar.K);
                    po poVar = new po(bundle);
                    poVar.l0(qrVar.f40608s);
                    ((ActionBarLayout) qr.b0(qrVar)).c(qr.a0(qrVar).getFragmentStack().size() - 1, poVar);
                    qrVar.finishFragment();
                    poVar.f40060c.j(76, 0L, null);
                    return;
                }
                qrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f34976b).setClickable(false);
    }

    private final void l(View view, float f10, float f11) {
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
