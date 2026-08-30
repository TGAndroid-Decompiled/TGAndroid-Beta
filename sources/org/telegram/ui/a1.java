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
public final class a1 implements org.telegram.ui.Components.fo0, rh.m3, bh1, r0.o, org.telegram.ui.ActionBar.c2, eg.x, org.telegram.ui.Components.ud0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.tv0, nh.d9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.vj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f32427a;
    public final Object f32428b;

    public a1(Object obj, int i10) {
        this.f32427a = i10;
        this.f32428b = obj;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        l0 l0Var;
        cb.m mVar = (cb.m) this.f32428b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        u4 u4Var = (u4) mVar.d;
        if (u4Var == view && (l0Var = u4Var.f33889b) != null) {
            l0Var.setPadding(defaultWindowInsets.f7213a, defaultWindowInsets.f7214b, defaultWindowInsets.f7215c, defaultWindowInsets.d);
        }
        return r0.m1.f43129b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(18, (p4) this.f32428b, arrayList), 100L);
    }

    @Override
    public void b(float f10) {
        b1 b1Var = (b1) this.f32428b;
        MessageObject messageObject = b1Var.J;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(b1Var.J, f10);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        org.telegram.ui.Components.i51 G;
        Object obj;
        long j10;
        switch (this.f32427a) {
            case 7:
                d6 d6Var = (d6) this.f32428b;
                ArrayList arrayList = d6Var.f33522c;
                if (((c6) arrayList.get(i10)).f1808a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = d6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    oy oyVar = new oy(bundle);
                    oyVar.f37131z2 = new mg.w(9, d6Var, oyVar);
                    d6Var.presentFragment(oyVar);
                    return;
                } else if (((c6) arrayList.get(i10)).f1808a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).f33097c;
                    g80 g80Var = new g80(view.getContext(), d6Var);
                    g80Var.g(false);
                    g80Var.setParentWindow(org.telegram.ui.Components.z4.Q(d6Var, g80Var, view, f10, f11));
                    g80Var.setCallback(new a6(d6Var, keepMediaException, 0));
                    return;
                } else if (((c6) arrayList.get(i10)).f1808a == 4) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(d6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new rt0(d6Var, 13), null).f19503a;
                    d2Var.show();
                    d2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                au auVar = (au) this.f32428b;
                HashSet hashSet = auVar.Y;
                if (!auVar.Z && (G = auVar.f32701a0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f19331id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f19184id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof kg.n) {
                        ((kg.n) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f32428b, view, i10, f10);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        di diVar = (di) this.f32428b;
        xn xnVar = diVar.f33658p;
        if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
            ci ciVar = new ci(diVar, xnVar, xnVar.getParentActivity(), xnVar.f39968ba, arrayList);
            ciVar.setCalcMandatoryInsets(xnVar.x9());
            ciVar.setDimBehind(false);
            xnVar.A7(false);
            xnVar.showDialog(ciVar);
        }
    }

    @Override
    public boolean e1(View view) {
        switch (this.f32427a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(Canvas canvas, RectF rectF, float f10) {
        j8 j8Var = (j8) ((h) this.f32428b).f34709b;
        Paint paint = j8Var.f35272w;
        TextPaint textPaint = j8Var.e;
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
            canvas.drawText(Integer.toString(j8Var.f35262e0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void g(boolean z4) {
        p3 p3Var = (p3) this.f32428b;
        y3 y3Var = p3Var.H.H;
        if (y3Var != null) {
            p3Var.h = true;
            y3Var.dismiss(true);
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f32428b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        switch (this.f32427a) {
            case 4:
                j5 j5Var = (j5) this.f32428b;
                j5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    j5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                s6 s6Var = (s6) this.f32428b;
                ?? g3Var = new org.telegram.ui.ActionBar.g3(s6Var.getContext(), false);
                g3Var.fixNavigationBar();
                g3Var.setCanDismissWithSwipe(false);
                g3Var.setCancelable(false);
                Context context = s6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, k7.b6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
                frameLayout.f38557a = k6Var;
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27347g;
                k6Var.b(0.35f, 120L, nrVar);
                k6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.j6.f20012j5;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                k6Var.setTextSize(AndroidUtilities.dp(24.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(k6Var, k7.b6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                cg.r rVar = new cg.r(context);
                Paint paint = new Paint(1);
                rVar.f2510b = paint;
                Paint paint2 = new Paint(1);
                rVar.f2511c = paint2;
                rVar.e = new org.telegram.ui.Components.z5(rVar, 350L, nrVar);
                int i13 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
                frameLayout.f38558b = rVar;
                frameLayout.addView(rVar, k7.b6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, k7.b6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                g3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.c cVar = new androidx.car.app.utils.c(s6Var, frameLayout, fArr, zArr2, 22);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(s6Var, zArr, jArr, g3Var, 23), 150L);
                b7 b7Var = s6Var.d;
                p6 p6Var = new p6(fArr, zArr2, cVar, 0);
                q6 q6Var = new q6(zArr, frameLayout, jArr, g3Var, 0);
                mh.b bVar = b7Var.V;
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
                nd.U((nd) this.f32428b, d2Var);
                return;
            case 15:
                ((ng) this.f32428b).run();
                return;
            case 17:
                xn xnVar = ((jj) this.f32428b).f35363b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.M3);
                return;
            case 21:
                xn xnVar2 = ((bm) this.f32428b).f32984a.N;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.Q5, true, true);
                return;
            case 22:
                qp qpVar = (qp) this.f32428b;
                boolean z4 = qpVar.f37809s;
                if (!z4 || qpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(qpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z4) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(qpVar.f37806f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(qpVar.f37806f);
                    }
                    AndroidUtilities.runOnUIThread(new fp(qpVar, d2VarArr, qpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new lo(1, qpVar, d2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((tq) this.f32428b).run(1);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f32428b;
        BubbleActivity bubbleActivity2 = BubbleActivity.X;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.R;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.S, bubbleActivity.U, true, bubbleActivity.T);
            bubbleActivity.R = null;
        }
        bubbleActivity.P.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
    }

    public void k(String str) {
        xn xnVar = ((jm) this.f32428b).N;
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
            oy oyVar = new oy(null);
            oyVar.f37057k2 = str;
            xnVar.presentFragment(oyVar);
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
        int i10 = this.f32427a;
    }

    @Override
    public void onCameraInit() {
        v9 v9Var = (v9) this.f32428b;
        HandlerThread handlerThread = v9Var.d;
        handlerThread.start();
        v9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(v9Var.Z, 0L);
        if (v9Var.a0()) {
            o1.j jVar = v9Var.f39117x;
            if (jVar != null) {
                jVar.c();
                v9Var.f39117x = null;
            }
            o1.j jVar2 = new o1.j(new kb.a(0.0f));
            v9Var.f39117x = jVar2;
            jVar2.b(new n9(v9Var, 0));
            v9Var.f39117x.a(new o9(v9Var, 0));
            v9Var.f39117x.f16198u = new o1.k(500.0f);
            v9Var.f39117x.f16198u.a(0.8f);
            v9Var.f39117x.f16198u.b(250.0f);
            v9Var.f39117x.f();
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f32427a) {
            case 13:
                ee eeVar = (ee) this.f32428b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f34001f;
                Object obj6 = i51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    lh.ja.h1(eeVar.getContext(), true, geVar.d, eeVar.f34000c, (TL_stars.StarsTransaction) i51Var.G, eeVar.f33999b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.h0(eeVar.getContext(), eeVar.f34000c, (TL_stats.BroadcastRevenueTransaction) i51Var.G, geVar.d, eeVar.f33999b);
                    return;
                } else {
                    return;
                }
            default:
                ns nsVar = (ns) this.f32428b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.i51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z4 = !nsVar.U;
                        nsVar.U = z4;
                        ((org.telegram.ui.Cells.s8) view2).setChecked(z4);
                        return;
                    }
                    return;
                }
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.E));
                if (user == null || nsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nsVar.getParentActivity(), 0, nsVar.f36720r);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(29, nsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public a1(ij ijVar, boolean z4) {
        this.f32427a = 18;
        this.f32428b = ijVar;
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z4) {
        switch (this.f32427a) {
            case 18:
                xn xnVar = ((ij) this.f32428b).f35132b.f35363b;
                xnVar.qa(xnVar.f39948a4, true);
                return;
            case 19:
                xn xnVar2 = ((ul) this.f32428b).f38968b;
                if (z4) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.f40209v3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                pr prVar = ((hr) this.f32428b).f34940b;
                if (!z4 || pr.X(prVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) pr.Z(prVar).getFragmentStack().get(pr.Y(prVar).getFragmentStack().size() - 2);
                if (p2Var instanceof po) {
                    p2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", prVar.K);
                    po poVar = new po(bundle);
                    poVar.l0(prVar.f37484s);
                    ((ActionBarLayout) pr.b0(prVar)).c(pr.a0(prVar).getFragmentStack().size() - 1, poVar);
                    prVar.finishFragment();
                    poVar.f37384c.j(76, 0L, null);
                    return;
                }
                prVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f32428b).setClickable(false);
    }

    private final void l(View view, float f10, float f11) {
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
