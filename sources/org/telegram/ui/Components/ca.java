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
import android.widget.ImageView;
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
import org.telegram.ui.ua1;
public final class ca implements View.OnClickListener {
    public final int f25176a;
    public final Object f25177b;
    public final Object f25178c;

    public ca(int i10, Object obj, Object obj2) {
        this.f25176a = i10;
        this.f25177b = obj;
        this.f25178c = obj2;
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
        ps psVar;
        s4.b1 T;
        long j10;
        int i11 = this.f25176a;
        int i12 = -1;
        s4.b1 b1Var = null;
        int i13 = 0;
        Object obj = this.f25178c;
        Object obj2 = this.f25177b;
        switch (i11) {
            case 0:
                da daVar = (da) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        pf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f25541n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f25541n.document)) {
                            FileLoader.getInstance(daVar.f25543s).loadFile(daVar.f25541n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.r(daVar.getContext(), daVar.f25541n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                kd kdVar = (kd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                i80 i80Var = kdVar.X0;
                if (i80Var != null && i80Var.D()) {
                    kdVar.X0.u();
                    kdVar.X0 = null;
                    return;
                }
                kdVar.f27839d1.e(true);
                i80 F = i80.F(frameLayout, new ci.b(), kdVar.V0);
                kdVar.X0 = F;
                F.f27134s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                kdVar.X0.k();
                for (int i14 : kdVar.f27838c1) {
                    if (i14 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i14 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                    }
                    kdVar.X0.c(0, formatPluralString, new e2(kdVar, i14, 3), false);
                    if (kdVar.f27837b1 == i14) {
                        kdVar.X0.L();
                    }
                }
                kdVar.X0.Z();
                return;
            case 2:
                ol olVar = (ol) obj2;
                ql qlVar = (ql) obj;
                rl rlVar = olVar.f28992b;
                ti tiVar = rlVar.f28238b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) tiVar.f30574f0;
                if (snVar.c()) {
                    parentActivity = rlVar.getParentActivity();
                    f5.L(parentActivity, snVar.a(), new q2(8, olVar, qlVar), rlVar.f28237a);
                    return;
                }
                f5.Z(tiVar.M1, tiVar.l1() + 1, tiVar.p1(), new org.telegram.ui.ActionBar.j3(26, olVar, qlVar));
                return;
            case 3:
                fo foVar = ((co) obj2).d;
                ua1 ua1Var = foVar.f26308s;
                View F2 = ua1Var.F((bo) obj);
                if (F2 != null) {
                    b1Var = ua1Var.T(F2);
                }
                if (b1Var != null && (b10 = b1Var.b() - foVar.f26310t0) >= 0 && b10 < foVar.K.length) {
                    fo.R(foVar, b10);
                    return;
                }
                return;
            case 4:
                oo ooVar = (oo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                org.telegram.ui.sn snVar2 = ooVar.G;
                if (ooVar.T) {
                    snVar2.showDialog(f5.U(ooVar.getContext(), snVar2.h, d6Var).f20601a);
                    return;
                }
                ko koVar = ooVar.e;
                if (snVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = snVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (ooVar.f29012a.f17383f && snVar2.getParentActivity() != null && snVar2.fragmentView != null && snVar2.Z7 != null) {
                            if (snVar2.f41307o2 == null) {
                                r40 r40Var = new r40(7, snVar2.getParentActivity(), snVar2.f41191ea, true);
                                snVar2.f41307o2 = r40Var;
                                r40Var.setAlpha(0.0f);
                                snVar2.f41307o2.setVisibility(4);
                                snVar2.f41307o2.setShowingDuration(4000L);
                                snVar2.X0.addView(snVar2.f41307o2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i15 = snVar2.Z7.ttl_period;
                            if (i15 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i15 / 86400, new Object[0]);
                            } else if (i15 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            } else if (i15 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                            }
                            snVar2.f41307o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            snVar2.f41307o2.f(snVar2.f41131a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = snVar2.Z7;
                    TLRPC.UserFull userFull = snVar2.f41137a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    p8 p8Var = new p8(ooVar.getContext(), null, new lo(ooVar, r5), true, 0, ooVar.f29018d0);
                    p8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p8Var.f29226a;
                    mo moVar = new mo(ooVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {moVar};
                    moVar.e = true;
                    moVar.f21573c = 220;
                    moVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(koVar, 0, (int) (ooVar.getX() + koVar.getX()), (int) koVar.getY());
                    snVar2.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 5:
                wp.o((wp) obj2, (org.telegram.ui.sn) obj);
                return;
            case 6:
                xr.Q((xr) obj2, (TLRPC.Peer) obj);
                return;
            case 7:
                fs fsVar = (fs) obj2;
                String str = (String) obj;
                if (fsVar.f26380b == null && (view2 = fsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26380b = (EditText) findFocus;
                    }
                }
                if (fsVar.f26380b != null) {
                    try {
                        fsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = fsVar.f26380b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = fsVar.f26380b.getText();
                    if (fsVar.f26380b.getSelectionEnd() == fsVar.f26380b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + fsVar.f26380b.getSelectionStart();
                    }
                    if (fsVar.f26380b.getSelectionStart() != -1 && fsVar.f26380b.getSelectionEnd() != -1) {
                        EditText editText2 = fsVar.f26380b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), fsVar.f26380b.getSelectionEnd(), str));
                        EditText editText3 = fsVar.f26380b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        fsVar.f26380b.setText(str);
                        EditText editText4 = fsVar.f26380b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = fsVar.f26380b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ps psVar2 = (ps) obj2;
                os osVar = (os) obj;
                psVar2.K();
                osVar.f29059f = !osVar.f29059f;
                osVar.f29062j.X.N(true);
                psVar2.t();
                return;
            case 9:
                ((ps) obj2).B0 = !psVar.B0;
                ((s61) obj).N(true);
                return;
            case 10:
                ((nt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new org.telegram.ui.c7());
                return;
            case 11:
                aw.p((aw) obj2, (a6) obj);
                return;
            case 12:
                kz kzVar = (kz) obj2;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) obj;
                tz tzVar = kzVar.v;
                ax axVar = tzVar.D0;
                if (axVar.indexOfChild(n8Var) != -1 && (T = axVar.T(n8Var)) != null) {
                    if (T.b() == tzVar.f30757f1) {
                        if (tzVar.f30763h1 != null) {
                            uy uyVar = tzVar.f30800t1;
                            if (uyVar != null) {
                                uyVar.y(tzVar.J1.f20273id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(tzVar.f30747c1).edit();
                        String str2 = "group_hide_stickers_" + tzVar.J1.f20273id;
                        TLRPC.StickerSet stickerSet = tzVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f20299id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        tzVar.X(false);
                        kz kzVar2 = tzVar.f30817y0;
                        if (kzVar2 != null) {
                            kzVar2.l();
                            return;
                        }
                        return;
                    } else if (kzVar.h.get(T.b()) == tzVar.f30769j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.f28028c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new tv(kzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.Q0;
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
                    s40 s40Var = s40.v;
                    if (s40Var.c()) {
                        s40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            c20 c20Var = new c20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = c20Var;
                            c20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
            case 14:
                k20 k20Var = (k20) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = k20Var.F.indexOf(t0Var.getFilter());
                if (k20Var.I != indexOf) {
                    k20Var.I = indexOf;
                    k20Var.f();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21711a.f17383f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.o0 filter = t0Var.getFilter();
                    k20Var.g(filter);
                    j20 j20Var = k20Var.H;
                    if (j20Var != null) {
                        ((org.telegram.ui.jx) j20Var).c(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 15:
                ((z2) obj).run(Long.valueOf(((p20) obj2).d));
                return;
            case 16:
                ((org.telegram.ui.tp) obj).run();
                ((f40) obj2).dismiss();
                return;
            case 17:
                ((i80) obj2).u();
                ((org.telegram.ui.ac0) obj).run();
                return;
            case 18:
                i80 i80Var2 = (i80) obj2;
                ((org.telegram.ui.hv) obj).run();
                if (i80Var2.J) {
                    i80Var2.u();
                    return;
                }
                return;
            case 19:
                r80.n((r80) obj2, (p80) obj);
                return;
            case 20:
                if0.n((if0) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 21:
                aj0 aj0Var = (aj0) obj2;
                org.telegram.ui.zu zuVar = (org.telegram.ui.zu) obj;
                if (aj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, aj0Var.getValue());
                    org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) zuVar.f43789c;
                    TLRPC.User user = (TLRPC.User) zuVar.f43788b;
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f40024e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                        b2Var2.R = string2;
                        b2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.b2(pc0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        pc0Var.showDialog(b2Var2);
                    } else {
                        pc0Var.R.L = true;
                        pc0Var.f40021c.setImageResource(R.drawable.msg_location_alert2);
                        pc0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pc0Var.getLocationController().setProximityLocation(pc0Var.f40024e0, max, true);
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        aj0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                fj0 fj0Var = (fj0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(fj0Var.f26259b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, fj0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 23:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            case 24:
                ai.y9 y9Var = (ai.y9) obj2;
                y9Var.e = !y9Var.e;
                ((org.telegram.messenger.vj) obj).run();
                y9Var.j(true);
                return;
            case 25:
                org.telegram.ui.gt.q().v(((ky0) obj2).f28027r.m0);
                org.telegram.ui.gt.q().y((org.telegram.ui.Cells.e8) obj);
                return;
            case 26:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 28:
                c51 c51Var = (c51) obj2;
                c51Var.f25098k0 = false;
                c51Var.K();
                ((s61) obj).N(true);
                c51Var.t();
                return;
            default:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((x41) obj2).f32314s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(bs.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
