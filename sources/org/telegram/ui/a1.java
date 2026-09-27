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
public final class a1 implements org.telegram.ui.Components.oo0, ei.o4, lh1, r0.n, org.telegram.ui.ActionBar.b2, rg.t, org.telegram.ui.Components.be0, org.telegram.ui.Components.nl0, org.telegram.ui.Components.fw0, ai.ec, org.telegram.ui.Components.al0, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f31936a;
    public final Object f31937b;

    public a1(Object obj, int i10) {
        this.f31936a = i10;
        this.f31937b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        l0 l0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f31937b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        t4 t4Var = (t4) mVar.d;
        if (t4Var == view && (l0Var = t4Var.f33124b) != null) {
            l0Var.setPadding(defaultWindowInsets.f10579a, defaultWindowInsets.f10580b, defaultWindowInsets.f10581c, defaultWindowInsets.d);
        }
        return r0.l1.f42184b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new n(3, (o4) this.f31937b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        b1 b1Var = (b1) this.f31937b;
        MessageObject messageObject = b1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(b1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        c6 c6Var = (c6) this.f31937b;
        ArrayList arrayList = c6Var.f32529c;
        if (((b6) arrayList.get(i10)).f15754a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = c6Var.e;
            if (i11 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ty tyVar = new ty(bundle);
            tyVar.C2 = new p(3, c6Var, tyVar);
            c6Var.presentFragment(tyVar);
        } else if (((b6) arrayList.get(i10)).f15754a == 2) {
            CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).f32244c;
            n80 n80Var = new n80(view.getContext(), c6Var);
            n80Var.g(false);
            n80Var.setParentWindow(org.telegram.ui.Components.e5.Q(c6Var, n80Var, view, f7, f10));
            n80Var.setCallback(new z5(c6Var, keepMediaException, 0));
        } else if (((b6) arrayList.get(i10)).f15754a == 4) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.e5.O(c6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new hu0(c6Var, 13), null).f18655a;
            c2Var.show();
            c2Var.h();
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e() {
        ((li.l) this.f31937b).f();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        switch (this.f31936a) {
            case 4:
                j5 j5Var = (j5) this.f31937b;
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
                r6 r6Var = (r6) this.f31937b;
                ?? g3Var = new org.telegram.ui.ActionBar.g3(r6Var.getContext(), false);
                g3Var.fixNavigationBar();
                g3Var.setCanDismissWithSwipe(false);
                g3Var.setCancelable(false);
                Context context = r6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.y5.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
                frameLayout.f37660a = p6Var;
                org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28360g;
                p6Var.b(0.35f, 120L, srVar);
                p6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.i6.f19164j5;
                p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                p6Var.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(p6Var, w7.y5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                s6 s6Var = new s6(context);
                Paint paint = new Paint(1);
                s6Var.f37312b = paint;
                Paint paint2 = new Paint(1);
                s6Var.f37313c = paint2;
                s6Var.e = new org.telegram.ui.Components.e6(s6Var, 350L, srVar);
                int i13 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(0.2f, org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
                frameLayout.f37661b = s6Var;
                frameLayout.addView(s6Var, w7.y5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.l0.p(textView, org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.y5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                g3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(r6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(r6Var, zArr, jArr, (Object) g3Var, 2), 150L);
                b7 b7Var = r6Var.d;
                o6 o6Var = new o6(fArr, zArr2, n5Var, 0);
                p6 p6Var2 = new p6(zArr, frameLayout, jArr, g3Var, 0);
                zh.b bVar = b7Var.f32260c0;
                if (bVar != null) {
                    bVar.d();
                }
                y6 y6Var = b7Var.M;
                if (y6Var != null) {
                    y6Var.e();
                    b7Var.M.f(false);
                }
                b7Var.getFileLoader().cancelLoadAllFiles();
                b7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(b7Var, o6Var, p6Var2, 0));
                b7Var.f32260c0 = null;
                y6 y6Var2 = b7Var.M;
                if (y6Var2 != null) {
                    y6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                nd.U((nd) this.f31937b, c2Var);
                return;
            case 17:
                ((ug) this.f31937b).run();
                return;
            case 19:
                xn xnVar = ((mj) this.f31937b).f35714b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.P3);
                return;
            case 23:
                xn xnVar2 = ((bm) this.f31937b).f32390a.Q;
                i11 = ((org.telegram.ui.ActionBar.o2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.T5, true, true);
                return;
            case 24:
                sp spVar = (sp) this.f31937b;
                boolean z10 = spVar.f37546s;
                if (!z10 || spVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(spVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(spVar.f37543f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(spVar.f37543f);
                    }
                    AndroidUtilities.runOnUIThread(new ip(spVar, c2VarArr, spVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new mo(1, spVar, c2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((vq) this.f31937b).run(1);
                return;
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        gi giVar = (gi) this.f31937b;
        xn xnVar = giVar.f33949p;
        if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
            fi fiVar = new fi(giVar, xnVar, xnVar.getParentActivity(), xnVar.f39750ea, arrayList);
            fiVar.setCalcMandatoryInsets(xnVar.x9());
            fiVar.setDimBehind(false);
            xnVar.A7(false);
            xnVar.showDialog(fiVar);
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f31937b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        k8 k8Var = (k8) ((g) this.f31937b).f33670b;
        Paint paint = k8Var.f34944w;
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
            canvas.drawText(Integer.toString(k8Var.f34934h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void j(org.telegram.ui.Components.ce0 ce0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f31937b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f19988a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ce0Var);
    }

    @Override
    public void k(boolean z10) {
        n3 n3Var = (n3) this.f31937b;
        w3 w3Var = n3Var.K.K;
        if (w3Var != null) {
            n3Var.h = true;
            w3Var.dismiss(true);
        }
    }

    public void l(String str) {
        xn xnVar = ((km) this.f31937b).Q;
        if (str.startsWith("@")) {
            xnVar.getMessagesController().openByUserName(str.substring(1), xnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                xnVar.Y.Z0(null, str, false, false);
                if (xnVar.Y.getFieldText() == null) {
                    xnVar.e9(false);
                    return;
                }
                return;
            }
            xnVar.xa(0, str, null, null, false);
        } else {
            ty tyVar = new ty(null);
            tyVar.f38021n2 = str;
            xnVar.presentFragment(tyVar);
        }
    }

    @Override
    public void onCameraInit() {
        x9 x9Var = (x9) this.f31937b;
        HandlerThread handlerThread = x9Var.d;
        handlerThread.start();
        x9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(x9Var.f39573c0, 0L);
        if (x9Var.a0()) {
            o1.k kVar = x9Var.f39581x;
            if (kVar != null) {
                kVar.c();
                x9Var.f39581x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            x9Var.f39581x = kVar2;
            kVar2.b(new p9(x9Var, 0));
            x9Var.f39581x.a(new q9(x9Var, 0));
            x9Var.f39581x.f15572u = new o1.l(500.0f);
            x9Var.f39581x.f15572u.a(0.8f);
            x9Var.f39581x.f15572u.b(250.0f);
            x9Var.f39581x.f();
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f31936a) {
            case 15:
                ge geVar = (ge) this.f31937b;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ie ieVar = geVar.f33911f;
                Object obj6 = x51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.v7.h1(geVar.getContext(), true, ieVar.d, geVar.f33910c, (TL_stars.StarsTransaction) x51Var.G, geVar.f33909b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    me.h0(geVar.getContext(), geVar.f33910c, (TL_stats.BroadcastRevenueTransaction) x51Var.G, ieVar.d, geVar.f33909b);
                    return;
                } else {
                    return;
                }
            default:
                ps psVar = (ps) this.f31937b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.x51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !psVar.X;
                        psVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.H));
                if (user == null || psVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getParentActivity(), 0, psVar.f36535r);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(22, psVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public a1(lj ljVar, boolean z10) {
        this.f31936a = 20;
        this.f31937b = ljVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void n() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f31936a) {
            case 20:
                xn xnVar = ((lj) this.f31937b).f35363b.f35714b;
                xnVar.qa(xnVar.f39732d4, true);
                return;
            case 21:
                xn xnVar2 = ((ul) this.f31937b).f38275b;
                if (z10) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                qr qrVar = ((ir) this.f31937b).f34521b;
                if (!z10 || qr.X(qrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) qr.Z(qrVar).getFragmentStack().get(qr.Y(qrVar).getFragmentStack().size() - 2);
                if (o2Var instanceof so) {
                    o2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qrVar.N);
                    so soVar = new so(bundle);
                    soVar.l0(qrVar.f36857s);
                    ((ActionBarLayout) qr.b0(qrVar)).c(qr.a0(qrVar).getFragmentStack().size() - 1, soVar);
                    qrVar.finishFragment();
                    soVar.f37507c.j(76, 0L, null);
                    return;
                }
                qrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f31937b).setClickable(false);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
