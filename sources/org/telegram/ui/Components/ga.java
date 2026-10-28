package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class ga implements View.OnClickListener {
    public final int f28492a;
    public final Object f28493b;
    public final Object f28494c;

    public ga(int i10, Object obj, Object obj2) {
        this.f28492a = i10;
        this.f28493b = obj;
        this.f28494c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        rs rsVar;
        s4.e1 T;
        long j10;
        int i11 = this.f28492a;
        int i12 = -1;
        s4.e1 e1Var = null;
        int i13 = 0;
        Object obj = this.f28494c;
        Object obj2 = this.f28493b;
        switch (i11) {
            case 0:
                ha haVar = (ha) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        qf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        qf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(haVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = haVar.f28926n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) haVar.getContext(), haVar.f28926n.document)) {
                            FileLoader.getInstance(haVar.f28928s).loadFile(haVar.f28926n.document, "update", 3, 1);
                            haVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        qf.d.r(haVar.getContext(), haVar.f28926n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                jd jdVar = (jd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                l80 l80Var = jdVar.X0;
                if (l80Var != null && l80Var.D()) {
                    jdVar.X0.u();
                    jdVar.X0 = null;
                    return;
                }
                jdVar.f29647d1.e(true);
                l80 F = l80.F(frameLayout, new di.b(), jdVar.V0);
                jdVar.X0 = F;
                F.f30168s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                jdVar.X0.k();
                for (int i14 : jdVar.f29646c1) {
                    if (i14 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i14 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                    }
                    jdVar.X0.c(0, formatPluralString, new h2(jdVar, i14, 3), false);
                    if (jdVar.f29645b1 == i14) {
                        jdVar.X0.L();
                    }
                }
                jdVar.X0.Z();
                return;
            case 2:
                md mdVar = (md) obj2;
                Runnable runnable = (Runnable) obj;
                if (!mdVar.f30506g) {
                    mdVar.h = runnable;
                    mdVar.dismiss();
                    return;
                }
                return;
            case 3:
                sl.V((sl) obj2, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 4:
                pl plVar = (pl) obj2;
                rl rlVar = (rl) obj;
                sl slVar = plVar.f31637b;
                ti tiVar = slVar.f30254b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) tiVar.f32990f0;
                if (wnVar.c()) {
                    parentActivity = slVar.getParentActivity();
                    g5.L(parentActivity, wnVar.a(), new p1(12, plVar, rlVar), slVar.f30253a);
                    return;
                }
                g5.Z(tiVar.M1, tiVar.p1() + 1, tiVar.t1(), new li.s2(28, plVar, rlVar));
                return;
            case 5:
                go goVar = ((eo) obj2).d;
                org.telegram.ui.bb1 bb1Var = goVar.f28696s;
                View F2 = bb1Var.F((co) obj);
                if (F2 != null) {
                    e1Var = bb1Var.T(F2);
                }
                if (e1Var != null && (b10 = e1Var.b() - goVar.f28698t0) >= 0 && b10 < goVar.K.length) {
                    go.R(goVar, b10);
                    return;
                }
                return;
            case 6:
                po poVar = (po) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                org.telegram.ui.wn wnVar2 = poVar.G;
                if (poVar.T) {
                    wnVar2.showDialog(g5.U(poVar.getContext(), wnVar2.h, u6Var).f22369a);
                    return;
                }
                lo loVar = poVar.e;
                if (wnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = wnVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (poVar.f31649a.f19326f && wnVar2.getParentActivity() != null && wnVar2.fragmentView != null && wnVar2.f45245p8 != null) {
                            if (wnVar2.A2 == null) {
                                t40 t40Var = new t40(7, wnVar2.getParentActivity(), wnVar2.f45309ua, true);
                                wnVar2.A2 = t40Var;
                                t40Var.setAlpha(0.0f);
                                wnVar2.A2.setVisibility(4);
                                wnVar2.A2.setShowingDuration(4000L);
                                wnVar2.f45163j1.addView(wnVar2.A2, kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i15 = wnVar2.f45245p8.ttl_period;
                            if (i15 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i15 / 86400, new Object[0]);
                            } else if (i15 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            } else if (i15 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                            }
                            wnVar2.A2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            wnVar2.A2.f(wnVar2.f45198m1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = wnVar2.f45245p8;
                    TLRPC.UserFull userFull = wnVar2.f45255q8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    r8 r8Var = new r8(poVar.getContext(), null, new mo(poVar, r5), true, 0, poVar.f31655d0);
                    r8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r8Var.f32168a;
                    no noVar = new no(poVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.o1[] o1VarArr = {noVar};
                    noVar.e = true;
                    noVar.f22910c = 220;
                    noVar.setOutsideTouchable(true);
                    o1VarArr[0].setClippingEnabled(true);
                    o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    o1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1VarArr[0].setInputMethodMode(2);
                    o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    o1VarArr[0].showAtLocation(loVar, 0, (int) (poVar.getX() + loVar.getX()), (int) loVar.getY());
                    wnVar2.p8(false, true, 0.2f);
                    return;
                }
                return;
            case 7:
                zp.n((zp) obj2, (org.telegram.ui.wn) obj);
                return;
            case 8:
                zr.P((zr) obj2, (TLRPC.Peer) obj);
                return;
            case 9:
                hs hsVar = (hs) obj2;
                String str = (String) obj;
                if (hsVar.f29063b == null && (view2 = hsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        hsVar.f29063b = (EditText) findFocus;
                    }
                }
                if (hsVar.f29063b != null) {
                    try {
                        hsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = hsVar.f29063b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = hsVar.f29063b.getText();
                    if (hsVar.f29063b.getSelectionEnd() == hsVar.f29063b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + hsVar.f29063b.getSelectionStart();
                    }
                    if (hsVar.f29063b.getSelectionStart() != -1 && hsVar.f29063b.getSelectionEnd() != -1) {
                        EditText editText2 = hsVar.f29063b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), hsVar.f29063b.getSelectionEnd(), str));
                        EditText editText3 = hsVar.f29063b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        hsVar.f29063b.setText(str);
                        EditText editText4 = hsVar.f29063b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = hsVar.f29063b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                rs rsVar2 = (rs) obj2;
                qs qsVar = (qs) obj;
                rsVar2.J();
                qsVar.f32013f = !qsVar.f32013f;
                qsVar.f32016j.X.O(true);
                rsVar2.s();
                return;
            case 11:
                ((rs) obj2).B0 = !rsVar.B0;
                ((k71) obj).O(true);
                return;
            case 12:
                ((pt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new org.telegram.ui.c7());
                return;
            case 13:
                aw.o((aw) obj2, (c6) obj);
                return;
            case 14:
                jz jzVar = (jz) obj2;
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) obj;
                sz szVar = jzVar.v;
                zw zwVar = szVar.D0;
                if (zwVar.indexOfChild(s8Var) != -1 && (T = zwVar.T(s8Var)) != null) {
                    if (T.b() == szVar.f32723f1) {
                        if (szVar.f32729h1 != null) {
                            ty tyVar = szVar.f32766t1;
                            if (tyVar != null) {
                                tyVar.y(szVar.J1.f22029id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(szVar.f32713c1).edit();
                        String str2 = "group_hide_stickers_" + szVar.J1.f22029id;
                        TLRPC.StickerSet stickerSet = szVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f22055id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        szVar.Y(false);
                        jz jzVar2 = szVar.f32783y0;
                        if (jzVar2 != null) {
                            jzVar2.l();
                            return;
                        }
                        return;
                    } else if (jzVar.h.get(T.b()) == szVar.f32735j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.f29785c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new tv(jzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        e2Var.show();
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.W0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                int i16 = 0;
                while (true) {
                    if (i16 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i16]) {
                            i12 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                int i17 = i12 + 1;
                if (i17 < 3) {
                    i13 = i17;
                }
                float f7 = fArr[i13];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    u40 u40Var = u40.v;
                    if (u40Var.c()) {
                        u40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            e20 e20Var = new e20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = e20Var;
                            e20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                            fragmentContextView.B0.setText(LocaleController.getString(R.string.SpeedHint));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 16:
                m20 m20Var = (m20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = m20Var.F.indexOf(v0Var.getFilter());
                if (m20Var.I != indexOf) {
                    m20Var.I = indexOf;
                    m20Var.e();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23145a.f19326f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    ig.p0 filter = v0Var.getFilter();
                    m20Var.f(filter);
                    l20 l20Var = m20Var.H;
                    if (l20Var != null) {
                        ((org.telegram.ui.lx) l20Var).f(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 17:
                ((b3) obj).run(Long.valueOf(((r20) obj2).d));
                return;
            case 18:
                ((org.telegram.ui.zp) obj).run();
                ((h40) obj2).dismiss();
                return;
            case 19:
                ((l80) obj2).u();
                ((org.telegram.ui.dc0) obj).run();
                return;
            case 20:
                l80 l80Var2 = (l80) obj2;
                ((org.telegram.ui.iv) obj).run();
                if (l80Var2.J) {
                    l80Var2.u();
                    return;
                }
                return;
            case 21:
                u80.m((u80) obj2, (s80) obj);
                return;
            case 22:
                kf0.m((kf0) obj2, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 23:
                ej0 ej0Var = (ej0) obj2;
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) obj;
                if (ej0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ej0Var.getValue());
                    org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) k1Var.f33990c;
                    TLRPC.User user = (TLRPC.User) k1Var.f33989b;
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                        e2Var2.R = string2;
                        e2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new i2.z(rc0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        rc0Var.showDialog(e2Var2);
                    } else {
                        rc0Var.R.L = true;
                        rc0Var.f42925c.setImageResource(R.drawable.msg_location_alert2);
                        rc0Var.n0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        rc0Var.getLocationController().setProximityLocation(rc0Var.f42928e0, max, true);
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        ej0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                jj0 jj0Var = (jj0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(jj0Var.f29680b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, jj0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 25:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            case 26:
                org.telegram.ui.ht.o().t(((zy0) obj2).f35470r.m0);
                org.telegram.ui.ht.o().w((org.telegram.ui.Cells.i8) obj);
                return;
            case 27:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 28:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                s51 s51Var = (s51) obj2;
                s51Var.f32485k0 = false;
                s51Var.J();
                ((k71) obj).O(true);
                s51Var.s();
                return;
        }
    }
}
