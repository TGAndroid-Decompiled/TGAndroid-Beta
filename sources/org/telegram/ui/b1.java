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
public final class b1 implements org.telegram.ui.Components.bp0, fi.o4, ci1, r0.n, org.telegram.ui.ActionBar.z1, sg.t, org.telegram.ui.Components.qe0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.rw0, bi.nb, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f34138a;
    public final Object f34139b;

    public b1(Object obj, int i10) {
        this.f34138a = i10;
        this.f34139b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        l0 l0Var;
        c2.b bVar = (c2.b) this.f34139b;
        bVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        w4 w4Var = (w4) bVar.d;
        if (w4Var == view && (l0Var = w4Var.f36062b) != null) {
            l0Var.setPadding(defaultWindowInsets.f10892a, defaultWindowInsets.f10893b, defaultWindowInsets.f10894c, defaultWindowInsets.d);
        }
        return r0.l1.f43496b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(13, (r4) this.f34139b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        c1 c1Var = (c1) this.f34139b;
        MessageObject messageObject = c1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(c1Var.M, f7);
    }

    @Override
    public boolean c1(View view) {
        switch (this.f34138a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.m61 G;
        Object obj;
        long j10;
        switch (this.f34138a) {
            case 7:
                e6 e6Var = (e6) this.f34139b;
                ArrayList arrayList = e6Var.f35208c;
                if (((d6) arrayList.get(i10)).f42904a == 1) {
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
                    yy yyVar = new yy(bundle);
                    yyVar.C2 = new m4.y0(5, e6Var, yyVar);
                    e6Var.presentFragment(yyVar);
                    return;
                } else if (((d6) arrayList.get(i10)).f42904a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((d6) arrayList.get(i10)).f34884c;
                    t80 t80Var = new t80(view.getContext(), e6Var);
                    t80Var.g(false);
                    t80Var.setParentWindow(org.telegram.ui.Components.g5.P(e6Var, t80Var, view, f7, f10));
                    t80Var.setCallback(new b6(e6Var, keepMediaException, 0));
                    return;
                } else if (((d6) arrayList.get(i10)).f42904a == 4) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(e6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new su0(e6Var, 13), null).f19248a;
                    a2Var.show();
                    a2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                hu huVar = (hu) this.f34139b;
                HashSet hashSet = huVar.f36651b0;
                if (!huVar.f36652c0 && (G = huVar.f36653d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f19063id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f18916id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof yg.l) {
                        ((yg.l) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f34139b, view, i10, f7);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        li liVar = (li) this.f34139b;
        fo foVar = liVar.f37765p;
        if (foVar.getParentActivity() != null && foVar.getParentActivity() != null) {
            ki kiVar = new ki(liVar, foVar, foVar.getParentActivity(), foVar.f35633ea, arrayList);
            kiVar.setCalcMandatoryInsets(foVar.C9());
            kiVar.setDimBehind(false);
            foVar.D7(false);
            foVar.showDialog(kiVar);
        }
    }

    @Override
    public void f(Canvas canvas, RectF rectF, float f7) {
        l8 l8Var = (l8) ((g) this.f34139b).f36029b;
        Paint paint = l8Var.f37651w;
        TextPaint textPaint = l8Var.e;
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
            canvas.drawText(Integer.toString(l8Var.f37643h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f34138a) {
            case 4:
                l5 l5Var = (l5) this.f34139b;
                l5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    l5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                t6 t6Var = (t6) this.f34139b;
                ?? e3Var = new org.telegram.ui.ActionBar.e3(t6Var.getContext(), false);
                e3Var.fixNavigationBar();
                e3Var.setCanDismissWithSwipe(false);
                e3Var.setCancelable(false);
                Context context = t6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.z5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, 150, 49));
                imageView.d();
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
                frameLayout.f40594a = s6Var;
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24466g;
                s6Var.b(0.35f, 120L, esVar);
                s6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.g6.f19707j5;
                s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                s6Var.setTextSize(AndroidUtilities.dp(24.0f));
                s6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(s6Var, w7.z5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                u6 u6Var = new u6(context);
                Paint paint = new Paint(1);
                u6Var.f40272b = paint;
                Paint paint2 = new Paint(1);
                u6Var.f40273c = paint2;
                u6Var.e = new org.telegram.ui.Components.g6(u6Var, 350L, esVar);
                int i13 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.g6.m1(0.2f, org.telegram.ui.ActionBar.g6.x0(null, i13, false)));
                frameLayout.f40595b = u6Var;
                frameLayout.addView(u6Var, w7.z5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.g0.m(16.0f, org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.z5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                frameLayout.a(0.0f);
                e3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(t6Var, frameLayout, fArr, zArr2, 29);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new p6(t6Var, zArr, jArr, e3Var, 0), 150L);
                d7 d7Var = t6Var.d;
                q6 q6Var = new q6(fArr, zArr2, bVar, 0);
                r6 r6Var = new r6(zArr, frameLayout, jArr, e3Var, 0);
                ai.c cVar = d7Var.Y;
                if (cVar != null) {
                    cVar.d();
                }
                a7 a7Var = d7Var.N;
                if (a7Var != null) {
                    a7Var.d();
                    d7Var.N.e(false);
                }
                d7Var.getFileLoader().cancelLoadAllFiles();
                d7Var.getFileLoader().getFileLoaderQueue().postRunnable(new i6(d7Var, q6Var, r6Var, 0));
                d7Var.Y = null;
                a7 a7Var2 = d7Var.N;
                if (a7Var2 != null) {
                    a7Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                sd.U((sd) this.f34139b, a2Var);
                return;
            case 15:
                ((xg) this.f34139b).run();
                return;
            case 17:
                fo foVar = ((sj) this.f34139b).f39833b;
                foVar.finishFragment();
                foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, foVar.P3);
                return;
            case 21:
                fo foVar2 = ((im) this.f34139b).f36836a.Q;
                i11 = ((org.telegram.ui.ActionBar.m2) foVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(foVar2.T5, true, true);
                return;
            case 22:
                aq aqVar = (aq) this.f34139b;
                boolean z10 = aqVar.f34054s;
                if (!z10 || aqVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(aqVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(aqVar.f34051f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(aqVar.f34051f);
                    }
                    AndroidUtilities.runOnUIThread(new pp(aqVar, a2VarArr, aqVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new to(1, aqVar, a2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((dr) this.f34139b).run(1);
                return;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f34139b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(org.telegram.ui.Components.re0 re0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f34139b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f20575a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, re0Var);
    }

    @Override
    public void j(boolean z10) {
        o3 o3Var = (o3) this.f34139b;
        x3 x3Var = o3Var.K.K;
        if (x3Var != null) {
            o3Var.h = true;
            x3Var.dismiss(true);
        }
    }

    public void k(String str) {
        fo foVar = ((rm) this.f34139b).Q;
        if (str.startsWith("@")) {
            foVar.getMessagesController().openByUserName(str.substring(1), foVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                foVar.Y.X0(null, str, false, false);
                if (foVar.Y.getFieldText() == null) {
                    foVar.j9(false);
                    return;
                }
                return;
            }
            foVar.Ba(0, str, null, null, false);
        } else {
            yy yyVar = new yy(null);
            yyVar.f42050n2 = str;
            foVar.presentFragment(yyVar);
        }
    }

    @Override
    public void onCameraInit() {
        z9 z9Var = (z9) this.f34139b;
        HandlerThread handlerThread = z9Var.d;
        handlerThread.start();
        z9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(z9Var.f42228e0, 0L);
        if (z9Var.a0()) {
            o1.k kVar = z9Var.f42237y;
            if (kVar != null) {
                kVar.c();
                z9Var.f42237y = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            z9Var.f42237y = kVar2;
            kVar2.b(new p9(z9Var, 0));
            z9Var.f42237y.a(new q9(z9Var, 0));
            z9Var.f42237y.f16161u = new o1.l(500.0f);
            z9Var.f42237y.f16161u.a(0.8f);
            z9Var.f42237y.f16161u.b(250.0f);
            z9Var.f42237y.h();
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f34138a;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f34138a) {
            case 13:
                ke keVar = (ke) this.f34139b;
                org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                me meVar = keVar.f37358f;
                Object obj6 = m61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    zh.p7.i1(keVar.getContext(), true, meVar.d, keVar.f37357c, (TL_stars.StarsTransaction) m61Var.G, keVar.f37356b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    qe.h0(keVar.getContext(), keVar.f37357c, (TL_stats.BroadcastRevenueTransaction) m61Var.G, meVar.d, keVar.f37356b);
                    return;
                } else {
                    return;
                }
            default:
                ws wsVar = (ws) this.f34139b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.m61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !wsVar.X;
                        wsVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = wsVar.getMessagesController().getUser(Long.valueOf(wsVar.H));
                if (user == null || wsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wsVar.getParentActivity(), 0, wsVar.f41351r);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.u2(24, wsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public b1(rj rjVar, boolean z10) {
        this.f34138a = 18;
        this.f34139b = rjVar;
    }

    @Override
    public void c(float f7) {
    }

    @Override
    public void m() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f34138a) {
            case 18:
                fo foVar = ((rj) this.f34139b).f39531b.f39833b;
                foVar.va(foVar.f35616d4, true);
                return;
            case 19:
                fo foVar2 = ((bm) this.f34139b).f34349b;
                if (z10) {
                    foVar2.T7();
                    UndoView undoView = foVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                yr yrVar = ((qr) this.f34139b).f39205b;
                if (!z10 || yr.X(yrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) yr.Z(yrVar).getFragmentStack().get(yr.Y(yrVar).getFragmentStack().size() - 2);
                if (m2Var instanceof zo) {
                    m2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", yrVar.N);
                    zo zoVar = new zo(bundle);
                    zoVar.l0(yrVar.f41929s);
                    ((ActionBarLayout) yr.b0(yrVar)).c(yr.a0(yrVar).getFragmentStack().size() - 1, zoVar);
                    yrVar.finishFragment();
                    zoVar.f42367c.j(76, 0L, null);
                    return;
                }
                yrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f34139b).setClickable(false);
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
