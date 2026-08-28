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
public final class b1 implements org.telegram.ui.Components.kn0, mh.e4, ng1, r0.o, org.telegram.ui.ActionBar.b2, zf.t, org.telegram.ui.Components.xc0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.av0, ih.h9, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.bj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f36592a;
    public final Object f36593b;

    public b1(Object obj, int i9) {
        this.f36592a = i9;
        this.f36593b = obj;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        m0 m0Var;
        com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.f36593b;
        lVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        r4 r4Var = (r4) lVar.d;
        if (r4Var == view && (m0Var = r4Var.f36635b) != null) {
            m0Var.setPadding(defaultWindowInsets.f10848a, defaultWindowInsets.f10849b, defaultWindowInsets.f10850c, defaultWindowInsets.d);
        }
        return r0.m1.f46928b;
    }

    @Override
    public void a(int i9, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(12, (m4) this.f36593b, arrayList), 100L);
    }

    @Override
    public void b(float f10) {
        c1 c1Var = (c1) this.f36593b;
        MessageObject messageObject = c1Var.I;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(c1Var.I, f10);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        org.telegram.ui.Components.l41 G;
        Object obj;
        long j10;
        switch (this.f36592a) {
            case 7:
                z5 z5Var = (z5) this.f36593b;
                ArrayList arrayList = z5Var.f45035c;
                if (((y5) arrayList.get(i9)).f48814a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i10 = z5Var.f45036e;
                    if (i10 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i10 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    dy dyVar = new dy(bundle);
                    dyVar.f37752y2 = new ih.v3(10, z5Var, dyVar);
                    z5Var.presentFragment(dyVar);
                    return;
                } else if (((y5) arrayList.get(i9)).f48814a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((y5) arrayList.get(i9)).f44726c;
                    u70 u70Var = new u70(view.getContext(), z5Var);
                    u70Var.g(false);
                    u70Var.setParentWindow(org.telegram.ui.Components.y4.Q(z5Var, u70Var, view, f10, f11));
                    u70Var.setCallback(new w5(z5Var, keepMediaException, 0));
                    return;
                } else if (((y5) arrayList.get(i9)).f48814a == 4) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(z5Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new kt0(z5Var, 13), null).f22702a;
                    c2Var.show();
                    c2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                st stVar = (st) this.f36593b;
                HashSet hashSet = stVar.X;
                if (!stVar.Y && (G = stVar.Z.G(i9 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f22527id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f22380id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof fg.p) {
                        ((fg.p) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.V((DataAutoDownloadActivity) this.f36593b, view, i9, f10);
                return;
        }
    }

    @Override
    public void d(Canvas canvas, RectF rectF, float f10) {
        g8 g8Var = (g8) ((g) this.f36593b).f38388b;
        Paint paint = g8Var.f38463w;
        TextPaint textPaint = g8Var.f38453e;
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
            canvas.drawText(Integer.toString(g8Var.f38452d0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        switch (this.f36592a) {
            case 4:
                g5 g5Var = (g5) this.f36593b;
                g5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 8:
                o6 o6Var = (o6) this.f36593b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(o6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = o6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, g7.e6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                frameLayout.f41693a = j6Var;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28845g;
                j6Var.b(0.35f, 120L, grVar);
                j6Var.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                j6Var.setTextSize(AndroidUtilities.dp(24.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(j6Var, g7.e6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                p6 p6Var = new p6(context);
                Paint paint = new Paint(1);
                p6Var.f41343b = paint;
                Paint paint2 = new Paint(1);
                p6Var.f41344c = paint2;
                p6Var.f41345e = new org.telegram.ui.Components.y5(p6Var, 350L, grVar);
                int i12 = org.telegram.ui.ActionBar.f6.N6;
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.2f, org.telegram.ui.ActionBar.f6.w0(null, i12, false)));
                frameLayout.f41694b = p6Var;
                frameLayout.addView(p6Var, g7.e6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i11, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, g7.e6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                k6 k6Var = new k6(o6Var, (Object) frameLayout, fArr, zArr2, 0);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new k6((Object) o6Var, zArr, (Object) jArr, (Object) f3Var, 1), 150L);
                y6 y6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, k6Var, 0);
                m6 m6Var = new m6(zArr, frameLayout, jArr, f3Var, 0);
                hh.b bVar = y6Var.U;
                if (bVar != null) {
                    bVar.d();
                }
                v6 v6Var = y6Var.J;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.J.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new d6(y6Var, l6Var, m6Var, 0));
                y6Var.U = null;
                v6 v6Var2 = y6Var.J;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                id.T((id) this.f36593b, c2Var);
                return;
            case 15:
                ((jg) this.f36593b).run();
                return;
            case 17:
                qn qnVar = ((bj) this.f36593b).f36877b;
                qnVar.finishFragment();
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, qnVar.L3);
                return;
            case 21:
                qn qnVar2 = ((tl) this.f36593b).f43027a.M;
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar2).currentAccount;
                ChatThemeController.getInstance(i10).clearWallpaper(qnVar2.P5, true, true);
                return;
            case 22:
                hp hpVar = (hp) this.f36593b;
                boolean z10 = hpVar.f38888s;
                if (!z10 || hpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(hpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(hpVar.f38885f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(hpVar.f38885f);
                    }
                    AndroidUtilities.runOnUIThread(new xo(hpVar, c2VarArr, hpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new rc(8, hpVar, c2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((lq) this.f36593b).run(1);
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f36592a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        vh vhVar = (vh) this.f36593b;
        qn qnVar = vhVar.f43493p;
        if (qnVar.getParentActivity() != null && qnVar.getParentActivity() != null) {
            uh uhVar = new uh(vhVar, qnVar, qnVar.getParentActivity(), qnVar.f41848aa, arrayList);
            uhVar.setCalcMandatoryInsets(qnVar.x9());
            uhVar.setDimBehind(false);
            qnVar.A7(false);
            qnVar.showDialog(uhVar);
        }
    }

    @Override
    public void g0(View view, float f10, float f11) {
        int i9 = this.f36592a;
    }

    @Override
    public void h(int i9) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f36593b).get(i9)).intValue()).apply();
    }

    @Override
    public void i(org.telegram.ui.Components.yc0 yc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f36593b;
        BubbleActivity bubbleActivity2 = BubbleActivity.W;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.Q;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.R, bubbleActivity.T, true, bubbleActivity.S);
            bubbleActivity.Q = null;
        }
        bubbleActivity.O.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, yc0Var);
    }

    @Override
    public void j(boolean z10) {
        p3 p3Var = (p3) this.f36593b;
        y3 y3Var = p3Var.G.G;
        if (y3Var != null) {
            p3Var.h = true;
            y3Var.dismiss(true);
        }
    }

    public void k(String str) {
        qn qnVar = ((bm) this.f36593b).M;
        if (str.startsWith("@")) {
            qnVar.getMessagesController().openByUserName(str.substring(1), qnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                qnVar.U.a1(null, str, false, false);
                if (qnVar.U.getFieldText() == null) {
                    qnVar.e9(false);
                    return;
                }
                return;
            }
            qnVar.xa(0, str, null, null, false);
        } else {
            dy dyVar = new dy(null);
            dyVar.f37678j2 = str;
            qnVar.presentFragment(dyVar);
        }
    }

    @Override
    public void onCameraInit() {
        s9 s9Var = (s9) this.f36593b;
        HandlerThread handlerThread = s9Var.d;
        handlerThread.start();
        s9Var.f42597e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(s9Var.Y, 0L);
        if (s9Var.Z()) {
            o1.j jVar = s9Var.f42603x;
            if (jVar != null) {
                jVar.c();
                s9Var.f42603x = null;
            }
            o1.j jVar2 = new o1.j(new gb.a(0.0f));
            s9Var.f42603x = jVar2;
            jVar2.b(new k9(s9Var, 0));
            s9Var.f42603x.a(new l9(s9Var, 0));
            s9Var.f42603x.f18800u = new o1.k(500.0f);
            s9Var.f42603x.f18800u.a(0.8f);
            s9Var.f42603x.f18800u.b(250.0f);
            s9Var.f42603x.f();
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f36592a) {
            case 13:
                zd zdVar = (zd) this.f36593b;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                be beVar = zdVar.f45116f;
                Object obj6 = l41Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    gh.oa.h1(zdVar.getContext(), true, beVar.d, zdVar.f45114c, (TL_stars.StarsTransaction) l41Var.G, zdVar.f45113b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    fe.h0(zdVar.getContext(), zdVar.f45114c, (TL_stats.BroadcastRevenueTransaction) l41Var.G, beVar.d, zdVar.f45113b);
                    return;
                } else {
                    return;
                }
            default:
                is isVar = (is) this.f36593b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i9 = ((org.telegram.ui.Components.l41) obj).d;
                if (i9 != 1) {
                    if (i9 == 2) {
                        boolean z10 = !isVar.T;
                        isVar.T = z10;
                        ((org.telegram.ui.Cells.t8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
                if (user == null || isVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getParentActivity(), 0, isVar.f39275r);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(0, isVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public b1(aj ajVar, boolean z10) {
        this.f36592a = 18;
        this.f36593b = ajVar;
    }

    @Override
    public void e(float f10) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f36592a) {
            case 18:
                qn qnVar = ((aj) this.f36593b).f36509b.f36877b;
                qnVar.qa(qnVar.Z3, true);
                return;
            case 19:
                qn qnVar2 = ((ll) this.f36593b).f40188b;
                if (z10) {
                    qnVar2.Q7();
                    UndoView undoView = qnVar2.f42093u3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                jr jrVar = ((ar) this.f36593b).f36538b;
                if (!z10 || jr.W(jrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) jr.Y(jrVar).getFragmentStack().get(jr.X(jrVar).getFragmentStack().size() - 2);
                if (o2Var instanceof ho) {
                    o2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", jrVar.J);
                    ho hoVar = new ho(bundle);
                    hoVar.k0(jrVar.f39598s);
                    ((ActionBarLayout) jr.a0(jrVar)).c(jr.Z(jrVar).getFragmentStack().size() - 1, hoVar);
                    jrVar.finishFragment();
                    hoVar.f38839c.j(76, 0L, null);
                    return;
                }
                jrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f36593b).setClickable(false);
    }

    private final void l(View view, float f10, float f11) {
    }

    private final void n(View view, float f10, float f11) {
    }

    private final void o(View view, float f10, float f11) {
    }
}
